/**
 * The class RunningServicesFactory 
 */
package runningeasy.bom.entities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import swa.runningeasy.business.services.RunningServiceBA;
import swa.runningeasy.services.RunningServices;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class RunningServicesFactory {
	private static RunningServices	instance;

	private static Logger			logger	= Logger.getLogger(RunningServicesFactory.class);

	public static synchronized RunningServices getInstance() {
		logger.trace("call getInstance()-method");
		if (instance == null) {
			PropertyConfigurator.configureAndWatch("log4j.properties", 10 * 1000);
			instance = new RunningServiceBA();
		}

		return instance;
	}
}
