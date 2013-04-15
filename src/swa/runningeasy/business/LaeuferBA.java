package swa.runningeasy.business;

import java.util.List;

import swa.runningeasy.data.be.LaeuferBE;
import swa.runningeasy.db.IObjectReader;

public class LaeuferBA extends AbstractBA {

	/**
	 * Creates a new Laeufer and saves
	 * 
	 * @param laeufer
	 *            to create
	 * @throws IllegalArgumentException
	 *             if laeufer is null or has illegal arguments
	 */
	public void createLaeufer(final LaeuferBE laeufer) throws IllegalArgumentException {
		if (laeufer == null)
			throw new IllegalArgumentException("Argument must not be NULL");

	}

	/**
	 * Saves the updated laeufer to the database
	 * 
	 * @param laeufer
	 *            to update
	 */
	public void updateLaeufer(final LaeuferBE laeufer) {

	}

	/**
	 * Generates the GesamtStatistik for the given Laeufer
	 * 
	 * @param laeufer
	 */
	public void generateGesamtStatistik(final LaeuferBE laeufer) {

	}

	public List<LaeuferBE> getAllLauefer() {
		return objectReader.getObjectByWhereClause(LaeuferBE.class, IObjectReader.CLAUSE_ALL);
	}

	public static void init() {
		instance = new LaeuferBA();
	}
}
