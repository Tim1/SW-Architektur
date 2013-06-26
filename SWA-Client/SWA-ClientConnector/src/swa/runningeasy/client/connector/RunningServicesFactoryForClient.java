/**
 * 
 */
package swa.runningeasy.client.connector;

import runningeasy.bom.entities.RunningServicesFactory;
import swa.runningeasy.services.RunningServicesExtended;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class RunningServicesFactoryForClient {

	public static RunningServicesExtended getInstance() {
		RunningServicesFactory.truncateTablesOnStart(false); // don't delte data
																// for client

		// must be casted this way because the return type of the Method cannot
		// be changed because auf binary dependency
		return (RunningServicesExtended) RunningServicesFactory.getInstance();
	}
}
