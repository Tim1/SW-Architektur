package swa.runningeasy.db;

import java.util.List;

import javax.persistence.EntityManager;

/**
 * 
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class ObjectManager {
	public static final String	CLAUSE_ALL	= "1 = 1";

	@SuppressWarnings("unused")
	private EntityManager		em;

	public <C> C getObjectById(final Class<C> clazz, final Long id) {
		return null;
	}

	public <C> List<C> getObjectByWhereClause(final Class<C> clazz, final String clause) {
		return null;
	}
}
