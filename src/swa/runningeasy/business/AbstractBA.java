/**
 * 
 */
package swa.runningeasy.business;

import swa.runningeasy.db.ObjectManager;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public abstract class AbstractBA {
	protected final static ObjectManager	om	= new ObjectManager();
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

	public abstract void init();
}
