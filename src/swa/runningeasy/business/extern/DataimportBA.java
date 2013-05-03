/**
 * 
 */
package swa.runningeasy.business.extern;

import java.io.File;

import swa.runningeasy.business.AbstractBA;
import swa.runningeasy.dtos.LaeuferDTO;
import swa.runningeasy.dtos.VeranstaltungDTO;
import swa.runningeasy.dtos.VereinDTO;
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
	public void importLauefer(final LaeuferDTO lauefer) {

	}

	/**
	 * imports verein in the data base
	 * 
	 * @param verein
	 */
	public void importVerein(final VereinDTO verein) {

	}

	/**
	 * imports veranstaltung in the data base
	 * 
	 * @param veranstaltung
	 */
	public void importVeranstaltung(final VeranstaltungDTO veranstaltung) {

	}

}
