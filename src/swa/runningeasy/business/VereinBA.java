/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import swa.runningeasy.dtos.VereinDTO;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class VereinBA extends AbstractBA {


	/**
	 * Creates a new Verein and saves
	 * 
	 * @param verein
	 *            to create
	 * @throws IllegalArgumentException
	 *             if verein is null or has illegal arguments
	 */
	public void createVerein(final VereinDTO verein) throws IllegalArgumentException {
		if (verein == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		objectWriter.save(VereinDTO.class, verein);

	}

	/**
	 * Saves the updated verein to the database
	 * 
	 * @param verein
	 *            to update
	 */
	public void updateVerein(final VereinDTO verein) {

	}

	/**
	 * 
	 * @return List of all Vereine
	 */
	public List<VereinDTO> getAllVereine() {
		return objectReader.getAllObjects(VereinDTO.class);
	}

}
