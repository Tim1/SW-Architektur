/**
 * 
 */
package swa.runningeasy.business;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
	public void createVerein(final VereinDTO verein) throws IllegalArgumentException {
		logger.trace("call createVerein()-method");
		if (verein == null)
			throw new IllegalArgumentException("Argument must not be NULL");


		// check if verein ist already in db
		VereinBE vereinBE = getVerein(verein);

		if (vereinBE == null) {
			logger.debug("creating: " + verein);
			objectWriter.begin();
			vereinBE = new VereinBE(verein);
			objectWriter.save(VereinBE.class, vereinBE);
			objectWriter.commit();
		}
	}


	public VereinBE getVerein(final VereinDTO verein) throws IllegalArgumentException {
		logger.trace("call getVerein()-method");
		if (verein == null)
			throw new IllegalArgumentException("Argument must not be NULL");


		Map<String, String> parameters = new LinkedHashMap<String, String>();
		parameters.put("x.name", "" + verein.getName());

		VereinBE vereinBE = objectReader.getObjectByQuery(VereinBE.class, parameters);

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
