/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import org.apache.log4j.Logger;

import swa.runningeasy.bes.LaufzeitBE;
import swa.runningeasy.dtos.LaufzeitDTO;
import swa.runningeasy.init.TransformerFactory;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class LaufzeitBA extends AbstractBA {
	private static Logger	logger	= Logger.getLogger(LaufzeitBA.class);

	/**
	 * Creates a new Laufzeit and saves
	 * 
	 * @param laufzeit
	 *            to create
	 * @throws IllegalArgumentException
	 *             if Laufzeit is null or has illegal arguments
	 */
	public void createLaufzeit(final LaufzeitDTO laufzeit) throws IllegalArgumentException {
		logger.trace("call createLaufzeit()-Method");
		if (laufzeit == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		logger.debug("creating: " + laufzeit);
		objectWriter.begin();
		objectWriter.save(LaufzeitBE.class, new LaufzeitBE(laufzeit));
		objectWriter.commit();
	}

	/**
	 * Saves the updated Laufzeit to the database
	 * 
	 * @param Laufzeit
	 *            to update
	 */
	public void updateLaufzeit(final LaufzeitDTO Laufzeit) {
		logger.trace("call updateLaufzeit()-Method");
	}


	/**
	 * TODO: to implement (editTime)
	 */
	public void editTime() {
		logger.trace("call editTime()-Method");

	}

	/**
	 * 
	 * @return List of all Laufzeitse
	 */
	public List<LaufzeitDTO> getAllLaufzeiten() {
		logger.trace("call getAllLaufzeiten()-Method");
		return TransformerFactory.toDTOList(LaufzeitDTO.class, objectReader.getAllObjects(LaufzeitBE.class));
	}
}
