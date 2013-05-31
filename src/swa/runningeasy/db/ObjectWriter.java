/**
 * 
 */
package swa.runningeasy.db;

import org.apache.log4j.Logger;

import swa.runningeasy.business.extern.MessageServiceBA;


/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class ObjectWriter implements IObjectWriter {
	private static Logger	logger	= Logger.getLogger(ObjectWriter.class);

	@Override
	public <C> void save(final Class<C> clazz, final C objectToSave) {
		logger.trace("call save()-method");

	}

	@Override
	public <C> void delete(final Class<C> clazz, final C objectToDelete) {
		logger.trace("call delete()-method");

	}

}
