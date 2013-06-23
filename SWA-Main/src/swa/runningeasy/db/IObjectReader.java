/**
 * 
 */
package swa.runningeasy.db;

import java.util.List;
import java.util.Map;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public interface IObjectReader {
	public static final String	CLAUSE_ALL	= "1 = 1";

	public <C> C getObjectById(final Class<C> clazz, final Long id);

	public <C> List<C> getAllObjects(Class<C> clazz);

	/**
	 * Returns one Object by a Query-WHERE clause, with given parameters
	 * 
	 * <pre>
	 * Map&lt;String, String&gt; param;
	 * parameters.put(&quot;x.bezahlt&quot;, &quot;true&quot;);
	 * parameters.put(&quot;x.startnummer&quot;, &quot;123&quot;);
	 * 
	 * objectReader.getObjectByQuery(SomethingBE.class, param);
	 * </pre>
	 * 
	 * @param clazz
	 * @param parameters
	 *            - key: "attribute" value: "123"
	 * @return
	 */
	public <C> C getObjectByQuery(Class<C> clazz, Map<String, String> parameters);

	/**
	 * Returns one Object by a Query-WHERE clause, with given parameters
	 * 
	 * <pre>
	 * Map&lt;String, String&gt; param;
	 * parameters.put(&quot;x.bezahlt&quot;, &quot;true&quot;);
	 * parameters.put(&quot;x.startnummer&quot;, &quot;123&quot;);
	 * 
	 * objectReader.getObjectByQuery(SomethingBE.class, param);
	 * </pre>
	 * 
	 * @param clazz
	 * @param parameters
	 *            - key: "attribute" value: "123"
	 * @return
	 */
	public <C> List<C> getObjectByQueryList(Class<C> clazz, Map<String, String> parameters);

}
