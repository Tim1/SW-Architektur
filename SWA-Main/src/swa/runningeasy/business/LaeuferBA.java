package swa.runningeasy.business;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import swa.runningeasy.bes.LaeuferBE;
import swa.runningeasy.dtos.LaeuferDTO;
import swa.runningeasy.init.TransformerFactory;

public class LaeuferBA extends AbstractBA {
	private static Logger	logger	= Logger.getLogger(LaeuferBA.class);


	/**
	 * Creates a new Laeufer and saves
	 * 
	 * @param laeufer
	 *            to create
	 * @throws IllegalArgumentException
	 *             if laeufer is null or has illegal arguments
	 */
	public void createLaeufer(final LaeuferDTO laeufer) throws IllegalArgumentException {
		logger.trace("call createLaeufer()-method");
		if (laeufer == null)
			throw new IllegalArgumentException("Argument must not be NULL");


		// check if laeufer ist already in db
		LaeuferBE laeuferBE = getLaeufer(laeufer);

		if (laeuferBE == null) {
			logger.debug("creating: " + laeufer);
			objectWriter.begin();
			laeuferBE = new LaeuferBE(laeufer);
			objectWriter.save(LaeuferBE.class, laeuferBE);
			objectWriter.commit();
		}
	}

	public LaeuferBE getLaeufer(final LaeuferDTO laeufer) {
		logger.trace("call getLaeufer-method");
		if (laeufer == null)
			throw new IllegalArgumentException("Argument must not be NULL");


		Map<String, String> parameters = new LinkedHashMap<String, String>();
		parameters.put("x.vorname", "" + laeufer.getVorname());
		parameters.put("x.name", "" + laeufer.getName());

		LaeuferBE laeuferBE = objectReader.getObjectByQuery(LaeuferBE.class, parameters);
		return laeuferBE;
	}

	/**
	 * Saves the updated laeufer to the database
	 * 
	 * @param laeufer
	 *            to update
	 */
	public void updateLaeufer(final LaeuferDTO laeufer) {
		logger.trace("call updateLaeufer()-method");
	}

	/**
	 * Generates the GesamtStatistik for the given Laeufer
	 * 
	 * @param laeufer
	 */
	public void generateGesamtStatistik(final LaeuferDTO laeufer) {
		logger.trace("call generateGesamtStatistik()-method");

	}

	public List<LaeuferDTO> getAllLauefer() {
		logger.trace("call getAllLauefer()-method");
		return TransformerFactory.toDTOList(LaeuferDTO.class, objectReader.getAllObjects(LaeuferBE.class));
	}

}
