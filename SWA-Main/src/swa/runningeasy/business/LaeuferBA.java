package swa.runningeasy.business;

import java.util.List;

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

		logger.debug("creating: " + laeufer);
		objectWriter.begin();

		LaeuferBE laeuferBE = new LaeuferBE(laeufer);
		// geht nicht, da man den verin in der dto schon nicht setzen kann...
		// VereinBE vereinBE = objectReader.getObjectByQuery(VereinBE.class,
		// "WHERE name = " + laeufer.getVerein());
		// laeuferBE.setVerein(vereinBE);

		objectWriter.save(LaeuferBE.class, laeuferBE);
		objectWriter.commit();
	}

	/**
	 * Saves the updated laeufer to the database
	 * 
	 * @param laeufer
	 *            to update
	 */
	public void updateLaeufer(final LaeuferDTO laeufer) {
		logger.trace("call updateLaeufer()-method");

		// merge, interface erweitern.
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
