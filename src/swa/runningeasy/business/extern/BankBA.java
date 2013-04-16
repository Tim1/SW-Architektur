/**
 * 
 */
package swa.runningeasy.business.extern;

import swa.runningeasy.business.AbstractBA;
import swa.runningeasy.extern.IBank;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class BankBA extends AbstractBA implements IBank {


	// TODO: what return value?
	/**
	 * Should only be called intern.<br/>
	 * Gets the Information about the Konto as it was the last time <i>
	 * liefereZalungseingaenge()</i> was called from the Bankanwendung
	 */
	public void getKontoData() {

	}


	@Override
	public void liefereZalungseingaenge() {

	}

}
