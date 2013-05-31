/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import org.apache.log4j.Logger;

import swa.runningeasy.dtos.VeranstaltungDTO;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class VeranstaltungBA extends AbstractBA {
	private static Logger	logger	= Logger.getLogger(VeranstaltungBA.class);

	/**
	 * Creates a new Veranstaltung and saves
	 * 
	 * @param veranstaltung
	 *            to create
	 * @throws IllegalArgumentException
	 *             if veranstaltung is null or has illegal arguments
	 */
	public void createVeranstaltung(final VeranstaltungDTO veranstaltung) throws IllegalArgumentException {
		logger.trace("call createVeranstaltung()-method");
		if (veranstaltung == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		objectWriter.save(VeranstaltungDTO.class, veranstaltung);
	}

	/**
	 * Saves the updated veranstaltung to the database
	 * 
	 * @param veranstaltung
	 *            to update
	 */
	public void updateVeranstaltung(final VeranstaltungDTO veranstaltung) {
		logger.trace("call updateVeranstaltung()-method");
	}


	/**
	 * @return List of all Veranstaltungen
	 */
	public List<VeranstaltungDTO> getAllVeranstaltungen() {
		logger.trace("call getAllVeranstaltungen()-method");
		return objectReader.getAllObjects(VeranstaltungDTO.class);
	}
}
