/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import swa.runningeasy.data.be.TeilnahmeBE;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
// TODO: Methods from "stammdatenverwaltung.umldi"
public class TeilnahmeBA extends AbstractBA {

	public static void init() {
		instance = new TeilnahmeBA();
	}


	/**
	 * Creates a new Teilnahme and saves
	 * 
	 * @param teilnahme
	 *            to create
	 * @throws IllegalArgumentException
	 *             if teilnahme is null or has illegal arguments
	 */
	public void createTeilnahme(final TeilnahmeBE teilnahme) throws IllegalArgumentException {
		if (teilnahme == null)
			throw new IllegalArgumentException("Argument must not be NULL");

	}

	/**
	 * Saves the updated teilnahme to the database
	 * 
	 * @param teilnahme
	 *            to update
	 */
	public void updateTeilnahme(final TeilnahmeBE teilnahme) {

	}


	/**
	 * Delete the teilnahme from the database
	 * 
	 * @param teilnahme
	 *            to delete
	 */
	public void deleteTeilnahme(final TeilnahmeBE teilnahme) {

	}

	/**
	 * Generate the StartListe from the database
	 * 
	 * @param teilnahme
	 *            to generate from database
	 */
	public void generateStartListe(final TeilnahmeBE teilnahme) {

	}


	/**
	 * Generate the UnpayedLaueferListe from the database
	 * 
	 * @param teilnahme
	 *            to generate from database
	 */
	public void generateUnpayedLaueferListe(final TeilnahmeBE teilnahme) {

	}


	/**
	 * Gets the actual Anzahl Teilnehmer from the database
	 * 
	 * @param teilnahme
	 *            from which you want to get the actual anzahl Teilnehmer
	 */
	public void getActualAnzahlTeilnehmer(final TeilnahmeBE teilnahme) {

	}

	/**
	 * diqualificates the Lauefer from the teilnahme from the database
	 * 
	 * @param teilnahme
	 */
	public void disqualifiquateLauefer(final TeilnahmeBE teilnahme) {

	}

	/**
	 * 
	 * @return List of all Teilnahmen
	 */
	public List<TeilnahmeBE> getAllTeilnahmen() {
		return null;
	}

}
