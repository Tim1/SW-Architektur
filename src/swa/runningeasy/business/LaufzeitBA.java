/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import swa.runningeasy.dtos.LaufzeitDTO;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class LaufzeitBA extends AbstractBA {

	/**
	 * Creates a new Laufzeit and saves
	 * 
	 * @param Laufzeit
	 *            to create
	 * @throws IllegalArgumentException
	 *             if Laufzeit is null or has illegal arguments
	 */
	public void createLaufzeit(final LaufzeitDTO Laufzeit) throws IllegalArgumentException {
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

	}


	/**
	 * TODO: to implement (editTime)
	 */
	public void editTime() {

	}

	/**
	 * 
	 * @return List of all Laufzeitse
	 */
	public List<LaufzeitDTO> getAllLaufzeiten() {
		return objectReader.getAllObjects(LaufzeitDTO.class);
	}
}
