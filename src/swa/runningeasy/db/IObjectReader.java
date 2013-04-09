/**
 * 
 */
package swa.runningeasy.db;

import java.util.List;

import swa.runningeasy.data.be.AbstractBE;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public interface IObjectReader {
	public static final String	CLAUSE_ALL	= "1 = 1";

	public <C extends AbstractBE> C getObjectById(final Class<C> clazz, final Long id);

	public <C extends AbstractBE> List<C> getObjectByWhereClause(final Class<C> clazz, final String clause);

}
