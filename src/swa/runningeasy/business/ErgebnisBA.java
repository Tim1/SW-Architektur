/**
 * 
 */
package swa.runningeasy.business;

import swa.runningeasy.data.be.ErgebnisBE;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class ErgebnisBA extends AbstractBA {

	public static void init() {
		instance = new ErgebnisBA();
	}

	/**
	 * Creates a new Ergebnis and saves
	 * 
	 * @param ergebnis
	 *            to create
	 * @throws IllegalArgumentException
	 *             if ergebnis is null or has illegal arguments
	 */
	public void createErgebnis(final ErgebnisBE ergebnis) throws IllegalArgumentException {
		if (ergebnis == null)
			throw new IllegalArgumentException("Argument must not be NULL");

	}

	/**
	 * Saves the updated ergebnis to the database
	 * 
	 * @param ergebnis
	 *            to update
	 */
	public void updateErgebnis(final ErgebnisBE ergebnis) {

	}


	/**
	 * TODO: man kann viele zeiten ändern, evtl muss das nohc mal ganz verändert
	 * werden(parameter, in mehrere methoden splitten etc) edit manually the
	 * time
	 */
	public void editTime() {

	}
}
