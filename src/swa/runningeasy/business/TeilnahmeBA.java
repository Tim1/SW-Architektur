/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import swa.runningeasy.dtos.AnmeldungDTO;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
// FIXME: rename to AnmeldungBA as it works with AnmeldungDTO now
public class TeilnahmeBA extends AbstractBA {


	/**
	 * Creates a new Teilnahme and saves
	 * 
	 * @param teilnahme
	 *            to create
	 * @throws IllegalArgumentException
	 *             if teilnahme is null or has illegal arguments
	 */
	public void createTeilnahme(final AnmeldungDTO teilnahme) throws IllegalArgumentException {
		if (teilnahme == null)
			throw new IllegalArgumentException("Argument must not be NULL");

	}

	/**
	 * Saves the updated teilnahme to the database
	 * 
	 * @param teilnahme
	 *            to update
	 */
	public void updateTeilnahme(final AnmeldungDTO teilnahme) {

	}


	/**
	 * Delete the teilnahme from the database
	 * 
	 * @param teilnahme
	 *            to delete
	 */
	public void deleteTeilnahme(final AnmeldungDTO teilnahme) {

	}

	/**
	 * Generate the StartListe from the database
	 * 
	 * @param teilnahme
	 *            to generate from database
	 */
	public void generateStartListe(final AnmeldungDTO teilnahme) {

	}


	/**
	 * Generate the UnpayedLaueferListe from the database
	 * 
	 * @param teilnahme
	 *            to generate from database
	 */
	public void generateUnpayedLaueferListe(final AnmeldungDTO teilnahme) {

	}


	/**
	 * Gets the actual Anzahl Teilnehmer from the database
	 * 
	 * @param teilnahme
	 *            from which you want to get the actual anzahl Teilnehmer
	 */
	public void getActualAnzahlTeilnehmer(final AnmeldungDTO teilnahme) {

	}

	/**
	 * diqualificates the Lauefer from the teilnahme from the database
	 * 
	 * @param teilnahme
	 */
	public void disqualifiquateLauefer(final AnmeldungDTO teilnahme) {

	}

	/**
	 * 
	 * @return List of all Teilnahmen
	 */
	public List<AnmeldungDTO> getAllTeilnahmen() {
		return null;
	}

}
