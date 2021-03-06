/**
 * 
 */
package swa.runningeasy.business.extern;

import java.io.File;

import org.apache.log4j.Logger;

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
	private static Logger	logger	= Logger.getLogger(DataimportBA.class);

	@Override
	public void readImportFile(final File file) {
		logger.trace("call readImportFile()-method");
	}

	/**
	 * imports lauefer in the data base
	 * 
	 * @param lauefer
	 */
	public void importLauefer(final LaeuferDTO lauefer) {
		logger.trace("call importLauefer()-method");
	}

	/**
	 * imports verein in the data base
	 * 
	 * @param verein
	 */
	public void importVerein(final VereinDTO verein) {
		logger.trace("call importVerein()-method");
	}

	/**
	 * imports veranstaltung in the data base
	 * 
	 * @param veranstaltung
	 */
	public void importVeranstaltung(final VeranstaltungDTO veranstaltung) {
		logger.trace("call importVeranstaltung()-method");
	}

}
