package swa.runningeasy.business;

import java.util.List;

import swa.runningeasy.data.be.LaeuferBE;
import swa.runningeasy.db.ObjectManager;

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

	private List<LaeuferBE> getAllLauefer() {
		return om.getObjectByWhereClause(LaeuferBE.class, ObjectManager.CLAUSE_ALL);
	}

	@Override
	public void init() {
		instance = new LaeuferBA();
	}
}
