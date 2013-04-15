/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import swa.runningeasy.data.be.VereinBE;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class VereinBA extends AbstractBA {

	public static void init() {
		instance = new VereinBA();
	}


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
		return null;
	}

}
