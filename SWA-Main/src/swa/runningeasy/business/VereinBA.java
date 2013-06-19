/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import org.apache.log4j.Logger;

import swa.runningeasy.bes.VereinBE;
import swa.runningeasy.dtos.VereinDTO;
import swa.runningeasy.init.TransformerFactory;

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
	public VereinBE createVerein(final VereinDTO verein) throws IllegalArgumentException {
		logger.trace("call createVerein()-method");
		if (verein == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		logger.debug("creating: " + verein);
		objectWriter.begin();

		// check if verein ist already in db
		// @formatter:off
		VereinBE vereinBE = objectReader.getObjectByQuery(VereinBE.class, 
				"WHERE " 
						 + "(name = " + verein.getName()	+ ")" 
//						 + "AND " 
//						 + "(land is = " + verein.getLand() + ")" + "AND " 
//						 + "(ort is = " + verein.getOrt() + ")" + "AND " 
//						 + "(strasse is = " + verein.getStrasse() + ")" + "AND " 
//						 + "(plz is = " + verein.getPlz() + ")"
				);
		// @formatter:on
		if (vereinBE == null) {
			vereinBE = new VereinBE(verein);
			objectWriter.save(VereinBE.class, vereinBE);
		}
		objectWriter.commit();
		return vereinBE;
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
		return TransformerFactory.toDTOList(VereinDTO.class, objectReader.getAllObjects(VereinBE.class));
	}

}
