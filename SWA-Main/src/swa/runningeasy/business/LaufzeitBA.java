/**
 * 
 */
package swa.runningeasy.business;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import swa.runningeasy.bes.LaufzeitBE;
import swa.runningeasy.bes.VeranstaltungBE;
import swa.runningeasy.dtos.LaufzeitDTO;
import swa.runningeasy.dtos.VeranstaltungDTO;
import swa.runningeasy.init.BAFactory;
import swa.runningeasy.init.TransformerFactory;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class LaufzeitBA extends AbstractBA {
	private static Logger	logger	= Logger.getLogger(LaufzeitBA.class);

	/**
	 * Creates a new Laufzeit and saves
	 * 
	 * @param laufzeit
	 *            to create
	 * @throws IllegalArgumentException
	 *             if Laufzeit is null or has illegal arguments
	 */
	public void createLaufzeit(final LaufzeitDTO laufzeit) throws IllegalArgumentException {
		logger.trace("call createLaufzeit()-Method");
		if (laufzeit == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		VeranstaltungBE veranstaltungBE = BAFactory.getVeranstaltungBA().createVeranstaltung(
				new VeranstaltungDTO(laufzeit.getVeranstaltung(), new Date(), new Date(), 0));


		logger.debug("creating: " + laufzeit);
		// check if laufzeit ist already in db
		objectWriter.begin();
		// @formatter:off
		LaufzeitBE laufzeitBE = objectReader.getObjectByQuery(LaufzeitBE.class, 
				"WHERE " 
//						 + "(x.laufzeit = " + laufzeit.getLaufzeit().	+ ")" + "AND " 
//						 + "(VERANSTALTUNG_ID is = " + veranstaltungBE.getId()	+ ")" + "AND " 
						 + "(x.startnummer = " + laufzeit.getStartnummer() + ")"
				);
		// @formatter:on
		if (laufzeitBE == null) {
			laufzeitBE = new LaufzeitBE(laufzeit);
			laufzeitBE.setVeranstaltung(veranstaltungBE);
			objectWriter.save(LaufzeitBE.class, laufzeitBE);
		}
		objectWriter.commit();
	}

	/**
	 * Saves the updated Laufzeit to the database
	 * 
	 * @param Laufzeit
	 *            to update
	 */
	public void updateLaufzeit(final LaufzeitDTO Laufzeit) {
		logger.trace("call updateLaufzeit()-Method");
	}


	/**
	 * TODO: to implement (editTime)
	 */
	public void editTime() {
		logger.trace("call editTime()-Method");

	}

	/**
	 * 
	 * @return List of all Laufzeitse
	 */
	public List<LaufzeitDTO> getAllLaufzeiten() {
		logger.trace("call getAllLaufzeiten()-Method");
		return TransformerFactory.toDTOList(LaufzeitDTO.class, objectReader.getAllObjects(LaufzeitBE.class));
	}
}
