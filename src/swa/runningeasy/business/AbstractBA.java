/**
 * 
 */
package swa.runningeasy.business;

import swa.runningeasy.db.IObjectReader;
import swa.runningeasy.db.IObjectWriter;
import swa.runningeasy.db.ObjectReader;
import swa.runningeasy.db.ObjectWriter;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public abstract class AbstractBA {
	protected final static IObjectReader	objectReader	= new ObjectReader();
	protected final static IObjectWriter	objectWriter	= new ObjectWriter();

	/**
	 * Private Construktor
	 */
	protected AbstractBA() {

	}


	/**
	 * initialize the BA, should be overriden for each BA
	 */
	public void init() {
	}
}
