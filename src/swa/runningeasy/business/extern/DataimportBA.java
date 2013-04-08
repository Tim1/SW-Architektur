/**
 * 
 */
package swa.runningeasy.business.extern;

import java.io.File;

import swa.runningeasy.business.AbstractBA;
import swa.runningeasy.extern.IDataimport;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class DataimportBA extends AbstractBA implements IDataimport {

	@Override
	public void readImportFile(final File file) {

	}

	@Override
	public void init() {
		instance = new DataimportBA();
	}

}
