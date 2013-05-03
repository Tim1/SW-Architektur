/**
 * 
 */
package swa.runningeasy.business;

import java.util.ArrayList;
import java.util.List;

import swa.runningeasy.data.be.VereinBE;

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
	public void createVerein(final VereinBE verein) throws IllegalArgumentException {
		if (verein == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		objectWriter.save(VereinBE.class, verein);

	}

	/**
	 * Saves the updated verein to the database
	 * 
	 * @param verein
	 *            to update
	 */
	public void updateVerein(final VereinBE verein) {

	}

	/**
	 * 
	 * @return List of all Vereine
	 */
	public List<VereinBE> getAllVereine() {
		return new ArrayList<>();
	}

}
