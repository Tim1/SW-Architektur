package swa.runningeasy.db;

import java.util.List;

import javax.persistence.EntityManager;

import org.apache.log4j.Logger;

import swa.runningeasy.business.extern.MessageServiceBA;

/**
 * 
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class ObjectReader implements IObjectReader {
	private static Logger	logger	= Logger.getLogger(ObjectReader.class);
	@SuppressWarnings("unused")
	private EntityManager	em;

	@Override
	public <C> C getObjectById(final Class<C> clazz, final Long id) {
		logger.debug("call getObjectById()-method");
		return null;
	}

	@Override
	public <C> List<C> getObjectByValues(final Class<C> clazz, final Object dto) {
		logger.debug("call getObjectByValues()-method");
		return null;
	}

	@Override
	public <C> List<C> getAllObjects(final Class<C> clazz) {
		logger.debug("call getAllObjects()-method");
		return null;
	}
}
