/**
 * 
 */
package swa.runningeasy.db;


/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public interface IObjectWriter {
	public <C> void save(Class<C> clazz, C objectToSave);

	public <C> void delete(Class<C> clazz, C objectToDelete);
}
