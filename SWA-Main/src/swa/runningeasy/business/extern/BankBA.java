/**
 * 
 */
package swa.runningeasy.business.extern;

import org.apache.log4j.Logger;

import swa.runningeasy.business.AbstractBA;
import swa.runningeasy.extern.IBank;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class BankBA extends AbstractBA implements IBank {

	private static Logger	logger	= Logger.getLogger(BankBA.class);

	/**
	 * Should only be called intern.<br/>
	 * Gets the Information about the Konto as it was the last time <i>
	 * liefereZalungseingaenge()</i> was called from the Bankanwendung
	 */
	public void getKontoData() {
		logger.trace("call getKontoData()-method");
	}


	@Override
	public void liefereZalungseingaenge() {
		logger.trace("call liefereZalungseingaenge()-method");
	}

}
