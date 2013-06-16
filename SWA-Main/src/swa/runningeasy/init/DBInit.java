/**
 * 
 */
package swa.runningeasy.init;

import java.lang.reflect.Field;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import swa.runningeasy.business.AbstractBA;
import swa.runningeasy.db.DerbyDB;
import swa.runningeasy.db.EmulatedDB;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class DBInit {
	private static final String	PERSISTENCE_UNIT_NAME	= "runningeasy";
	private static final Logger	logger					= Logger.getLogger(DBInit.class);

	public static void init() {
		if (!isRealDB()) {
			logger.info("You are on an emulated Database!");
			return;
		}

		logger.info("Initializing Derby DB...");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		DerbyDB.init(factory.createEntityManager());
		logger.info("Done initializing Derby DB.");
	}

	protected static boolean isRealDB() {
		BAFactory.init();
		AbstractBA abstractBA = BAFactory.getLaeuferBA();

		try {
			Field field = AbstractBA.class.getDeclaredField("objectReader");
			field.setAccessible(true);

			Object object = field.get(abstractBA);
			field.setAccessible(false);

			if (object instanceof EmulatedDB)
				return false;
			else
				return true;

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			logger.warn(e);
			logger.warn("Cannot check if on real Database. Continue anyway...");
			return true;
		}

	}
}
