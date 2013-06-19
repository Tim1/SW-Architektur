/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import org.apache.log4j.Logger;

import swa.runningeasy.bes.VeranstaltungBE;
import swa.runningeasy.dtos.VeranstaltungDTO;
import swa.runningeasy.init.TransformerFactory;

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

		logger.debug("creating: " + veranstaltung);
		objectWriter.begin();
		// @formatter:off
		// check if veranstaltung ist already in db
		VeranstaltungBE veranstaltungBE =  objectReader.getObjectByQuery(VeranstaltungBE.class, 
				"WHERE " + "(anmeldeschluss is = " + veranstaltung.getName()	+ ")" + "AND " 
						//TODO: date format?
						 + "(datum is = " + veranstaltung.getDatum() + ")" + "AND " 
						 + "(name is = " + veranstaltung.getName() + ")" + "AND " 
						 + "(startgebuehr is = " + veranstaltung.getStartgebuehr() + ")"
				);
		// @formatter:on
		if (veranstaltungBE == null)
			veranstaltungBE = new VeranstaltungBE(veranstaltung);

		objectWriter.save(VeranstaltungBE.class, veranstaltungBE);
		objectWriter.commit();
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
		return TransformerFactory.toDTOList(VeranstaltungDTO.class, objectReader.getAllObjects(VeranstaltungBE.class));
	}
}
