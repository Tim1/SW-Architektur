/**
 * 
 */
package swa.runningeasy.business;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
	private static Logger			logger	= Logger.getLogger(LaufzeitBA.class);

	private static VeranstaltungBA	veranstaltungBA;

	@Override
	public void init() {
		super.init();
		veranstaltungBA = BAFactory.getVeranstaltungBA();
	}


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

		// check if laufzeit ist already in db
		LaufzeitBE laufzeitBE = getLaufzeit(laufzeit);


		if (laufzeitBE == null) {
			logger.debug("creating: " + laufzeit);

			VeranstaltungDTO veranstaltung = new VeranstaltungDTO(laufzeit.getVeranstaltung(), new Date(), new Date(),
					0);
			veranstaltungBA.createVeranstaltung(veranstaltung);
			VeranstaltungBE veranstaltungBE = veranstaltungBA.getVeranstaltung(veranstaltung);

			objectWriter.begin();
			laufzeitBE = new LaufzeitBE(laufzeit);
			laufzeitBE.setVeranstaltung(veranstaltungBE);
			objectWriter.save(LaufzeitBE.class, laufzeitBE);
			objectWriter.commit();
		}
	}

	public LaufzeitBE getLaufzeit(final LaufzeitDTO laufzeit) {
		logger.trace("call createLaufzeit()-Method");
		if (laufzeit == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		VeranstaltungDTO veranstaltung = new VeranstaltungDTO(laufzeit.getVeranstaltung(), new Date(), new Date(), 0);
		VeranstaltungBE veranstaltungBE = veranstaltungBA.getVeranstaltung(veranstaltung);
		if (veranstaltungBE == null) {
			return null;
		}

		Map<String, String> parameters = new LinkedHashMap<String, String>();
		parameters.put("x.veranstaltung.id", "" + veranstaltungBE.getId());
		parameters.put("x.startnummer", "" + laufzeit.getStartnummer());

		LaufzeitBE laufzeitBE = objectReader.getObjectByQuery(LaufzeitBE.class, parameters);

		return laufzeitBE;

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
	 * 
	 * @return List of all Laufzeitse
	 */
	public List<LaufzeitDTO> getAllLaufzeiten() {
		logger.trace("call getAllLaufzeiten()-Method");
		return TransformerFactory.toDTOList(LaufzeitDTO.class, objectReader.getAllObjects(LaufzeitBE.class));
	}
}
