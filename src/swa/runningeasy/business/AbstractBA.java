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
	protected static AbstractBA				instance;

	/**
	 * Private Construktor
	 */
	protected AbstractBA() {

	}

	/**
	 * @return the instance
	 */
	public static AbstractBA getInstance() {
		return instance;
	}

	public static void init() {

	}
}
