package swa.runningeasy.util;

import java.util.List;

import javax.persistence.EntityManager;

import org.mockito.Mockito;

public class ObjectManager {
	public static final String	CLAUSE_ALL	= "1 = 1";

	private EntityManager		em;

	public <C> C getObjectById(final Class<C> clazz, final Long id) {
		return Mockito.mock(clazz);
	}

	public <C> List<C> getObjectByWhereClause(final Class<C> clazz, final String clause) {
		return Mockito.mock(List.class);
	}
}
