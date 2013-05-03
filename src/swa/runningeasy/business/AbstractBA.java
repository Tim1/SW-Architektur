/**
 * 
 */
package swa.runningeasy.business;

import swa.runningeasy.db.EmulatedDB;
import swa.runningeasy.db.IObjectReader;
import swa.runningeasy.db.IObjectWriter;
import swa.runningeasy.util.TransformerFactory;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public abstract class AbstractBA {
	// TODO: Emulated DB for Testing
	protected final static IObjectReader		objectReader	= EmulatedDB.getInstance();
	protected final static IObjectWriter		objectWriter	= EmulatedDB.getInstance();
	protected final static TransformerFactory	tmFactory		= TransformerFactory.getInstance();

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
