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

	@Override
	public void getKontoData() {

	}

	public static void init() {
		instance = new BankBA();
	}

}
