/**
 * 
 */
package swa.runningeasy.business;

import swa.runningeasy.db.IObjectReader;
import swa.runningeasy.db.IObjectWriter;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public abstract class AbstractBA {
	// are initialized by DBInit class
	protected static IObjectReader	objectReader;
	protected static IObjectWriter	objectWriter;

	/**
	 * Private Construktor
	 */
	protected AbstractBA() {

	}


	/**
	 * initialize the BA, can be overriden in each BA to initialize things
	 */
	public void init() {
	}
}
