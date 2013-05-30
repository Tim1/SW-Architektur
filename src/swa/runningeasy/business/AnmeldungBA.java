/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import org.apache.log4j.Logger;

import runningeasy.bom.entities.RunningServicesFactory;
import swa.runningeasy.dtos.AnmeldungDTO;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class AnmeldungBA extends AbstractBA {

	private static Logger	logger	= Logger.getLogger(AnmeldungBA.class);

	/**
	 * Creates a new Anmeldung and saves
	 * 
	 * @param Anmeldung
	 *            to create
	 * @throws IllegalArgumentException
	 *             if Anmeldung is null or has illegal arguments
	 */
	public void createAnmeldung(final AnmeldungDTO Anmeldung) throws IllegalArgumentException {
		logger.debug("call createAnmeldung-method");
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
		logger.debug("call updateAnmeldung()-method");

	}


	/**
	 * Delete the Anmeldung from the database
	 * 
	 * @param Anmeldung
	 *            to delete
	 */
	public void deleteAnmeldung(final AnmeldungDTO Anmeldung) {
		logger.debug("call deleteAnmeldung()-method");

	}

	/**
	 * Generate the StartListe from the database
	 * 
	 * @param Anmeldung
	 *            to generate from database
	 */
	public void generateStartListe(final AnmeldungDTO Anmeldung) {
		logger.debug("call generateStartListe()-method");

	}


	/**
	 * Generate the UnpayedLaueferListe from the database
	 * 
	 * @param Anmeldung
	 *            to generate from database
	 */
	public void generateUnpayedLaueferListe(final AnmeldungDTO Anmeldung) {
		logger.debug("call generateUnpayedLaueferListe()-method");

	}


	/**
	 * Gets the actual Anzahl Teilnehmer from the database
	 * 
	 * @param Anmeldung
	 *            from which you want to get the actual anzahl Teilnehmer
	 */
	public void getActualAnzahlTeilnehmer(final AnmeldungDTO Anmeldung) {
		logger.debug("call getActualAnzahlTeilnehmer()-method");

	}

	/**
	 * diqualificates the Lauefer from the Anmeldung from the database
	 * 
	 * @param Anmeldung
	 */
	public void disqualifiquateLauefer(final AnmeldungDTO Anmeldung) {
		logger.debug("call disqualifiquateLauefer()-method");

	}

	/**
	 * 
	 * @return List of all Anmeldungn
	 */
	public List<AnmeldungDTO> getAllAnmeldungen() {
		logger.debug("call getAllAnmeldungen()-method");
		return objectReader.getAllObjects(AnmeldungDTO.class);
	}

}
