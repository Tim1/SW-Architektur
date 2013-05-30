/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import org.apache.log4j.Logger;

import swa.runningeasy.dtos.LaufzeitDTO;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class LaufzeitBA extends AbstractBA {
	private static Logger	logger	= Logger.getLogger(LaufzeitBA.class);

	/**
	 * Creates a new Laufzeit and saves
	 * 
	 * @param Laufzeit
	 *            to create
	 * @throws IllegalArgumentException
	 *             if Laufzeit is null or has illegal arguments
	 */
	public void createLaufzeit(final LaufzeitDTO Laufzeit) throws IllegalArgumentException {
		logger.debug("call createLaufzeit()-Method");
		if (Laufzeit == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		objectWriter.save(LaufzeitDTO.class, Laufzeit);
	}

	/**
	 * Saves the updated Laufzeit to the database
	 * 
	 * @param Laufzeit
	 *            to update
	 */
	public void updateLaufzeit(final LaufzeitDTO Laufzeit) {
		logger.debug("call updateLaufzeit()-Method");
	}


	/**
	 * TODO: to implement (editTime)
	 */
	public void editTime() {
		logger.debug("call editTime()-Method");

	}

	/**
	 * 
	 * @return List of all Laufzeitse
	 */
	public List<LaufzeitDTO> getAllLaufzeiten() {
		logger.debug("call getAllLaufzeiten()-Method");
		return objectReader.getAllObjects(LaufzeitDTO.class);
	}
}
