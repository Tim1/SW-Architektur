/**
 * The class RunningServicesFactory 
 */
package runningeasy.bom.entities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import swa.runningeasy.business.services.RunningServiceBA;
import swa.runningeasy.init.DBInit;
import swa.runningeasy.services.RunningServices;
import swa.runningeasy.services.RunningServicesExtended;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class RunningServicesFactory {
	private static Logger					logger					= Logger.getLogger(RunningServicesFactory.class);

	private static RunningServicesExtended	instance;

	// Default: Delete all data on startup
	private static boolean					truncateTablesOnStart	= true;

	public static void truncateTablesOnStart(final boolean truncateTablesOnStart) {
		RunningServicesFactory.truncateTablesOnStart = truncateTablesOnStart;
	}


	public static synchronized RunningServices getInstance() {
		// Don't initialize multiple times
		if (instance != null)
			return instance;

		PropertyConfigurator.configureAndWatch("log4j.properties", 10 * 1000);
		instance = new RunningServiceBA();

		DBInit.truncateTablesOnStart(truncateTablesOnStart);

		return instance;
	}
}
