/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import org.apache.log4j.Logger;

import swa.runningeasy.bes.AnmeldungBE;
import swa.runningeasy.dtos.AnmeldungDTO;
import swa.runningeasy.init.TransformerFactory;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class AnmeldungBA extends AbstractBA {

	private static Logger	logger	= Logger.getLogger(AnmeldungBA.class);

	/**
	 * Creates a new Anmeldung and saves
	 * 
	 * @param anmeldung
	 *            to create
	 * @throws IllegalArgumentException
	 *             if Anmeldung is null or has illegal arguments
	 */
	public void createAnmeldung(final AnmeldungDTO anmeldung) throws IllegalArgumentException {
		logger.trace("call createAnmeldung-method");
		if (anmeldung == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		logger.debug("creating: " + anmeldung);
		objectWriter.begin();
		objectWriter.save(AnmeldungBE.class, new AnmeldungBE(anmeldung));
		objectWriter.commit();
	}

	/**
	 * Saves the updated Anmeldung to the database
	 * 
	 * @param Anmeldung
	 *            to update
	 */
	public void updateAnmeldung(final AnmeldungDTO anmeldung) {
		logger.trace("call updateAnmeldung()-method");

	}


	/**
	 * Delete the Anmeldung from the database
	 * 
	 * @param Anmeldung
	 *            to delete
	 */
	public void deleteAnmeldung(final AnmeldungDTO anmeldung) {
		logger.trace("call deleteAnmeldung()-method");

	}

	/**
	 * Generate the StartListe from the database
	 * 
	 * @param Anmeldung
	 *            to generate from database
	 */
	public void generateStartListe(final AnmeldungDTO anmeldung) {
		logger.trace("call generateStartListe()-method");

	}


	/**
	 * Generate the UnpayedLaueferListe from the database
	 * 
	 * @param Anmeldung
	 *            to generate from database
	 */
	public void generateUnpayedLaueferListe(final AnmeldungDTO anmeldung) {
		logger.trace("call generateUnpayedLaueferListe()-method");

	}


	/**
	 * Gets the actual Anzahl Teilnehmer from the database
	 * 
	 * @param Anmeldung
	 *            from which you want to get the actual anzahl Teilnehmer
	 */
	public void getActualAnzahlTeilnehmer(final AnmeldungDTO anmeldung) {
		logger.trace("call getActualAnzahlTeilnehmer()-method");

	}

	/**
	 * diqualificates the Lauefer from the Anmeldung from the database
	 * 
	 * @param Anmeldung
	 */
	public void disqualifiquateLauefer(final AnmeldungDTO anmeldung) {
		logger.trace("call disqualifiquateLauefer()-method");

	}

	/**
	 * 
	 * @return List of all Anmeldungn
	 */
	public List<AnmeldungDTO> getAllAnmeldungen() {
		logger.trace("call getAllAnmeldungen()-method");
		return TransformerFactory.toDTOList(AnmeldungDTO.class, objectReader.getAllObjects(AnmeldungBE.class));
	}
}
