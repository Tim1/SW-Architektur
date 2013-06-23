/**
 * 
 */
package swa.runningeasy.business;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
	 * @return
	 * @throws IllegalArgumentException
	 *             if veranstaltung is null or has illegal arguments
	 */
	public void createVeranstaltung(final VeranstaltungDTO veranstaltung) throws IllegalArgumentException {
		logger.trace("call createVeranstaltung()-method");
		if (veranstaltung == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		// check if veranstaltung ist already in db
		VeranstaltungBE veranstaltungBE = getVeranstaltung(veranstaltung);

		if (veranstaltungBE == null) {
			logger.debug("creating: " + veranstaltung);
			objectWriter.begin();
			veranstaltungBE = new VeranstaltungBE(veranstaltung);
			objectWriter.save(VeranstaltungBE.class, veranstaltungBE);
			objectWriter.commit();
		}
	}


	public VeranstaltungBE getVeranstaltung(final VeranstaltungDTO veranstaltung) {
		logger.trace("call createVeranstaltung()-method");
		if (veranstaltung == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		Map<String, String> parameters = new LinkedHashMap<String, String>();
		parameters.put("x.name", "" + veranstaltung.getName());
		VeranstaltungBE veranstaltungBE = objectReader.getObjectByQuery(VeranstaltungBE.class, parameters);
		return veranstaltungBE;
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
