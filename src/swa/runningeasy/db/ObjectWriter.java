/**
 * 
 */
package swa.runningeasy.db;

import swa.runningeasy.data.be.AbstractBE;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class ObjectWriter implements IObjectWriter {

	@Override
	public <C extends AbstractBE> void save(final Class<C> clazz, final C objectToSave) {

	}

}
