/**
 * 
 */
package swa.runningeasy.db;

import swa.runningeasy.data.be.AbstractBE;


/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public interface IObjectWriter {
	public <C extends AbstractBE> void save(Class<C> clazz, C objectToSave);

	public <C extends AbstractBE> void delete(Class<C> clazz, C objectToDelete);
}
