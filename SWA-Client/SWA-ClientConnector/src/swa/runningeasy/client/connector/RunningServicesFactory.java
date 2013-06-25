/**
 * 
 */
package swa.runningeasy.client.connector;

import swa.runningeasy.services.RunningServices;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class RunningServicesFactory {

	public static RunningServices getInstance() {
		return runningeasy.bom.entities.RunningServicesFactory.getInstance();
	}
}
