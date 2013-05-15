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
public class AnmeldungBA extends AbstractBA {


	/**
	 * Creates a new Anmeldung and saves
	 * 
	 * @param Anmeldung
	 *            to create
	 * @throws IllegalArgumentException
	 *             if Anmeldung is null or has illegal arguments
	 */
	public void createAnmeldung(final AnmeldungDTO Anmeldung) throws IllegalArgumentException {
		if (Anmeldung == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		objectWriter.save(AnmeldungDTO.class, Anmeldung);
	}

	/**
	 * Saves the updated Anmeldung to the database
	 * 
	 * @param Anmeldung
	 *            to update
	 */
	public void updateAnmeldung(final AnmeldungDTO Anmeldung) {

	}


	/**
	 * Delete the Anmeldung from the database
	 * 
	 * @param Anmeldung
	 *            to delete
	 */
	public void deleteAnmeldung(final AnmeldungDTO Anmeldung) {

	}

	/**
	 * Generate the StartListe from the database
	 * 
	 * @param Anmeldung
	 *            to generate from database
	 */
	public void generateStartListe(final AnmeldungDTO Anmeldung) {

	}


	/**
	 * Generate the UnpayedLaueferListe from the database
	 * 
	 * @param Anmeldung
	 *            to generate from database
	 */
	public void generateUnpayedLaueferListe(final AnmeldungDTO Anmeldung) {

	}


	/**
	 * Gets the actual Anzahl Teilnehmer from the database
	 * 
	 * @param Anmeldung
	 *            from which you want to get the actual anzahl Teilnehmer
	 */
	public void getActualAnzahlTeilnehmer(final AnmeldungDTO Anmeldung) {

	}

	/**
	 * diqualificates the Lauefer from the Anmeldung from the database
	 * 
	 * @param Anmeldung
	 */
	public void disqualifiquateLauefer(final AnmeldungDTO Anmeldung) {

	}

	/**
	 * 
	 * @return List of all Anmeldungn
	 */
	public List<AnmeldungDTO> getAllAnmeldungen() {
		return objectReader.getAllObjects(AnmeldungDTO.class);
	}

}
