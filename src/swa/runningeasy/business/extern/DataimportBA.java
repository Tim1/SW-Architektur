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

	/**
	 * imports lauefer in the data base
	 * 
	 * @param lauefer
	 */
	public void importLauefer(final LaeuferBE lauefer) {

	}

	/**
	 * imports verein in the data base
	 * 
	 * @param verein
	 */
	public void importVerein(final VereinBE verein) {

	}

	/**
	 * imports veranstaltung in the data base
	 * 
	 * @param veranstaltung
	 */
	public void importVeranstaltung(final VeranstaltungBE veranstaltung) {

	}

}
