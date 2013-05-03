package swa.runningeasy.db;

import java.util.List;

import javax.persistence.EntityManager;

/**
 * 
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class ObjectReader implements IObjectReader {
	@SuppressWarnings("unused")
	private EntityManager	em;

	@Override
	public <C> C getObjectById(final Class<C> clazz, final Long id) {
		return null;
	}

	@Override
	public <C> List<C> getObjectByValues(final Class<C> clazz, final Object dto) {
		return null;
	}

	@Override
	public <C> List<C> getAllObjects(final Class<C> clazz) {
		return null;
	}
}
