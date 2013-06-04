/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import org.apache.log4j.Logger;

import swa.runningeasy.dtos.VereinDTO;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class VereinBA extends AbstractBA {
	private static Logger	logger	= Logger.getLogger(VereinBA.class);

	/**
	 * Creates a new Verein and saves
	 * 
	 * @param verein
	 *            to create
	 * @throws IllegalArgumentException
	 *             if verein is null or has illegal arguments
	 */
	public void createVerein(final VereinDTO verein) throws IllegalArgumentException {
		logger.trace("call createVerein()-method");
		if (verein == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		logger.debug("creating: " + verein);
		objectWriter.save(VereinDTO.class, verein);

	}

	/**
	 * Saves the updated verein to the database
	 * 
	 * @param verein
	 *            to update
	 */
	public void updateVerein(final VereinDTO verein) {
		logger.trace("call updateVerein()-method");

	}

	/**
	 * 
	 * @return List of all Vereine
	 */
	public List<VereinDTO> getAllVereine() {
		logger.trace("call getAllVereine()-method");
		return objectReader.getAllObjects(VereinDTO.class);
	}

}
