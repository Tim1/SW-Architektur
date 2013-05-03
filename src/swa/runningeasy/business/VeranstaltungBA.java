/**
 * 
 */
package swa.runningeasy.business;

import java.util.ArrayList;
import java.util.List;

import swa.runningeasy.dtos.VeranstaltungDTO;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class VeranstaltungBA extends AbstractBA {


	/**
	 * Creates a new Veranstaltung and saves
	 * 
	 * @param veranstaltung
	 *            to create
	 * @throws IllegalArgumentException
	 *             if veranstaltung is null or has illegal arguments
	 */
	public void createVeranstaltung(final VeranstaltungDTO veranstaltung) throws IllegalArgumentException {
		if (veranstaltung == null)
			throw new IllegalArgumentException("Argument must not be NULL");

	}

	/**
	 * Saves the updated veranstaltung to the database
	 * 
	 * @param veranstaltung
	 *            to update
	 */
	public void updateVeranstaltung(final VeranstaltungDTO veranstaltung) {

	}


	/**
	 * @return List of all Veranstaltungen
	 */
	public List<VeranstaltungDTO> getAllVeranstaltungen() {
		return new ArrayList<>();
	}
}
