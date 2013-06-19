/**
 * 
 */
package swa.runningeasy.db;

import java.util.List;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public interface IObjectReader {
	public static final String	CLAUSE_ALL	= "1 = 1";

	public <C> C getObjectById(final Class<C> clazz, final Long id);

	public <C> List<C> getObjectByValues(final Class<C> clazz, final Object dto);

	public <C> List<C> getAllObjects(Class<C> clazz);

	public <C> C getObjectByQuery(Class<C> clazz, String StrQuery);

}
