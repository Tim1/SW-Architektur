package swa.runningeasy.db;

import java.util.List;

import javax.persistence.EntityManager;

import swa.runningeasy.data.be.AbstractBE;

/**
 * 
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class ObjectReader implements IObjectReader {
	@SuppressWarnings("unused")
	private EntityManager	em;

	@Override
	public <C extends AbstractBE> C getObjectById(final Class<C> clazz, final Long id) {
		return null;
	}

	@Override
	public <C extends AbstractBE> List<C> getObjectByWhereClause(final Class<C> clazz, final String clause) {
		return null;
	}
}
