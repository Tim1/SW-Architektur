/**
 * 
 */
package swa.runningeasy.business.extern;

import org.apache.log4j.Logger;

import swa.runningeasy.business.AbstractBA;
import swa.runningeasy.business.VereinBA;
import swa.runningeasy.extern.IBank;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class BankBA extends AbstractBA implements IBank {

	private static Logger	logger	= Logger.getLogger(BankBA.class);

	// TODO: what return value?
	/**
	 * Should only be called intern.<br/>
	 * Gets the Information about the Konto as it was the last time <i>
	 * liefereZalungseingaenge()</i> was called from the Bankanwendung
	 */
	public void getKontoData() {
		logger.debug("call getKontoData()-method");
	}


	@Override
	public void liefereZalungseingaenge() {
		logger.debug("call liefereZalungseingaenge()-method");
	}

}
