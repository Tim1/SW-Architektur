package swa.runningeasy.business;

import java.util.List;

import org.apache.log4j.Logger;

import swa.runningeasy.dtos.LaeuferDTO;

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
		logger.debug("call createLaeufer()-method");
		if (laeufer == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		objectWriter.save(LaeuferDTO.class, laeufer);
	}

	/**
	 * Saves the updated laeufer to the database
	 * 
	 * @param laeufer
	 *            to update
	 */
	public void updateLaeufer(final LaeuferDTO laeufer) {
		logger.debug("call updateLaeufer()-method");

	}

	/**
	 * Generates the GesamtStatistik for the given Laeufer
	 * 
	 * @param laeufer
	 */
	public void generateGesamtStatistik(final LaeuferDTO laeufer) {
		logger.debug("call generateGesamtStatistik()-method");

	}

	public List<LaeuferDTO> getAllLauefer() {
		logger.debug("call getAllLauefer()-method");
		return objectReader.getAllObjects(LaeuferDTO.class);
	}

}
