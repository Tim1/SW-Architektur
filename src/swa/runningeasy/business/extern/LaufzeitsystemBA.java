/**
 * 
 */
package swa.runningeasy.business.extern;

import org.apache.log4j.Logger;

import swa.runningeasy.business.AbstractBA;
import swa.runningeasy.business.VereinBA;
import swa.runningeasy.extern.ILaufzeitsystem;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class LaufzeitsystemBA extends AbstractBA implements ILaufzeitsystem {
	private static Logger	logger	= Logger.getLogger(LaufzeitsystemBA.class);

	@Override
	public void pushZwischenzeitForLaeufer() {
		logger.debug("call pushZwischenzeitForLaeufer()-method");

	}

	@Override
	public void pushEndzeitForLaeufer() {
		logger.debug("call pushEndzeitForLaeufer()-method");

	}

}
