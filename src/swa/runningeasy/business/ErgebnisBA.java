/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import swa.runningeasy.dtos.LaufzeitDTO;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
// FIXME: rename to LaufzeitBA as it works with LaufzeitDTO now
public class ErgebnisBA extends AbstractBA {

	/**
	 * Creates a new Ergebnis and saves
	 * 
	 * @param ergebnis
	 *            to create
	 * @throws IllegalArgumentException
	 *             if ergebnis is null or has illegal arguments
	 */
	public void createErgebnis(final LaufzeitDTO ergebnis) throws IllegalArgumentException {
		if (ergebnis == null)
			throw new IllegalArgumentException("Argument must not be NULL");

	}

	/**
	 * Saves the updated ergebnis to the database
	 * 
	 * @param ergebnis
	 *            to update
	 */
	public void updateErgebnis(final LaufzeitDTO ergebnis) {

	}


	/**
	 * TODO: man kann viele zeiten ändern, evtl muss das noch mal ganz verändert
	 * werden(parameter, in mehrere methoden splitten etc) edit manually the
	 * time
	 */
	public void editTime() {

	}

	/**
	 * 
	 * @return List of all Ergebnisse
	 */
	public List<LaufzeitDTO> getAllErgebnisse() {
		return null;
	}
}
