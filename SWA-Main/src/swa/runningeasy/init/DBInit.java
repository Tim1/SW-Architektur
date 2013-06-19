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
import swa.runningeasy.db.IDatabase;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class DBInit {
	private static final String	PERSISTENCE_UNIT_NAME	= "runningeasy";
	private static final Logger	logger					= Logger.getLogger(DBInit.class);

	private static boolean		realDB					= false;

	/**
	 * Forces that the real DB is used. Can be useful for JUnit-Test where real
	 * DB is necessary
	 * 
	 * @param forceRealDB
	 */
	public static void setRealDB(final boolean realDBUsed) {
		DBInit.realDB = realDBUsed;
	}

	public static void init() {
		IDatabase db;
		if (realDB) {
			logger.info("Initializing Derby DB...");
			EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			DerbyDB.init(factory.createEntityManager());
			logger.info("Done initializing Derby DB.");

			db = DerbyDB.getInstance();
		} else {
			logger.info("You are on an emulated Database!");
			db = EmulatedDB.getInstance();
		}

		try {
			BAFactory.init();
			AbstractBA abstractBA = BAFactory.getListeneintragBA();

			Field field = AbstractBA.class.getDeclaredField("objectReader");
			Field field2 = AbstractBA.class.getDeclaredField("objectWriter");

			field.setAccessible(true);
			field2.setAccessible(true);
			field.set(abstractBA, db);
			field2.set(abstractBA, db);
			field.setAccessible(false);
			field2.setAccessible(false);

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
		}
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
