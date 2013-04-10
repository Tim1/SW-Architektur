/**
 * 
 */
package swa.runningeasy.business.extern;

import java.io.File;

import swa.runningeasy.business.AbstractBA;
import swa.runningeasy.data.be.LaeuferBE;
import swa.runningeasy.data.be.VeranstaltungBE;
import swa.runningeasy.data.be.VereinBE;
import swa.runningeasy.extern.IDataimport;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class DataimportBA extends AbstractBA implements IDataimport {

	@Override
	public void readImportFile(final File file) {

	}

	public static void init() {
		instance = new DataimportBA();
	}

	/**
	 * imports lauefer in the data base
	 * 
	 * @param lauefer
	 */
	public synchronized void importLauefer(LaeuferBE lauefer) {

	}

	/**
	 * imports verein in the data base
	 * 
	 * @param verein
	 */
	public synchronized void importVerein(VereinBE verein) {

	}

	/**
	 * imports veranstaltung in the data base
	 * 
	 * @param veranstaltung
	 */
	public synchronized void importVeranstaltung(VeranstaltungBE veranstaltung) {

	}

}
