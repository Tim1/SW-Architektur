/**
 * 
 */
package runningeasy.bom.entities;

import swa.runningeasy.business.services.RunningServiceBA;
import swa.runningeasy.services.RunningServices;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class RunningServicesFactory {
	private static RunningServices	instance;

	public static RunningServices getInstance() {
		if (instance == null) {
			instance = new RunningServiceBA();
			instance.init();
		}

		return instance;
	}
}
