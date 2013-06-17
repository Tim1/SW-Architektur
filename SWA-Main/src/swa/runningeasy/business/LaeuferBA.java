package swa.runningeasy.business;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import swa.runningeasy.bes.LaeuferBE;
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
		logger.trace("call createLaeufer()-method");
		if (laeufer == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		logger.debug("creating: " + laeufer);
		LaeuferBE be = new LaeuferBE(laeufer);

		objectWriter.begin();
		objectWriter.save(LaeuferBE.class, be);
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
		List<LaeuferBE> objects = objectReader.getAllObjects(LaeuferBE.class);
		List<LaeuferDTO> result = new ArrayList<>(objects.size());

		for (LaeuferBE be : objects)
			result.add(be.asDTO());

		return result;
	}

}
