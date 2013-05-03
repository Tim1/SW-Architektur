package swa.runningeasy.business;

import java.util.List;

import swa.runningeasy.dtos.LaeuferDTO;

public class LaeuferBA extends AbstractBA {

	/**
	 * Creates a new Laeufer and saves
	 * 
	 * @param laeufer
	 *            to create
	 * @throws IllegalArgumentException
	 *             if laeufer is null or has illegal arguments
	 */
	public void createLaeufer(final LaeuferDTO laeufer) throws IllegalArgumentException {
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

	}

	/**
	 * Generates the GesamtStatistik for the given Laeufer
	 * 
	 * @param laeufer
	 */
	public void generateGesamtStatistik(final LaeuferDTO laeufer) {

	}

	public List<LaeuferDTO> getAllLauefer() {
		return objectReader.getAllObjects(LaeuferDTO.class);
	}

}
