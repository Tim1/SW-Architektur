/**
 * 
 */
package swa.runningeasy.init;

import org.apache.log4j.Logger;

import swa.runningeasy.business.AnmeldungBA;
import swa.runningeasy.business.LaeuferBA;
import swa.runningeasy.business.LaufzeitBA;
import swa.runningeasy.business.ListeneintragBA;
import swa.runningeasy.business.VeranstaltungBA;
import swa.runningeasy.business.VereinBA;
import swa.runningeasy.business.extern.BankBA;
import swa.runningeasy.business.extern.DataimportBA;
import swa.runningeasy.business.extern.LaufzeitsystemBA;
import swa.runningeasy.business.extern.MessageServiceBA;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class BAFactory {
	private static Logger			logger	= Logger.getLogger(BAFactory.class);
	private static LaufzeitBA		laufzeitBA;
	private static LaeuferBA		laeuferBA;
	private static ListeneintragBA	listeneintragBA;
	private static AnmeldungBA		anmeldungBA;
	private static VeranstaltungBA	veranstaltungBA;
	private static VereinBA			vereinBA;
	private static BankBA			bankBA;
	private static DataimportBA		datenimportBA;
	private static LaufzeitsystemBA	laufzeitsystemBA;
	private static MessageServiceBA	messageServiceBA;

	public static void init() {
		// only initialize one time!
		if (laeuferBA != null)
			return;

		logger.info("Initializing BAs...");
		laufzeitBA = new LaufzeitBA();
		laeuferBA = new LaeuferBA();
		listeneintragBA = new ListeneintragBA();
		anmeldungBA = new AnmeldungBA();
		veranstaltungBA = new VeranstaltungBA();
		vereinBA = new VereinBA();
		bankBA = new BankBA();
		datenimportBA = new DataimportBA();
		laufzeitsystemBA = new LaufzeitsystemBA();
		messageServiceBA = new MessageServiceBA();

		laufzeitBA.init();
		laeuferBA.init();
		listeneintragBA.init();
		anmeldungBA.init();
		veranstaltungBA.init();
		vereinBA.init();
		bankBA.init();
		datenimportBA.init();
		laufzeitsystemBA.init();
		messageServiceBA.init();
		logger.info("Done initializing BAs.");
	}

	public static LaufzeitBA getLaufzeitBA() {
		logger.trace("call getErgebnisBA()-Method");
		return laufzeitBA;
	}

	public static LaeuferBA getLaeuferBA() {
		logger.trace("call getLaeuferBA()-Method");
		return laeuferBA;
	}

	public static ListeneintragBA getListeneintragBA() {
		logger.trace("call getStatistikBA()-Method");
		return listeneintragBA;
	}

	public static AnmeldungBA getAnmeldungBA() {
		logger.trace("call getTeilnahmeBA()-Method");
		return anmeldungBA;
	}

	public static VeranstaltungBA getVeranstaltungBA() {
		logger.trace("call getVeranstaltungBA()-Method");
		return veranstaltungBA;
	}

	public static VereinBA getVereinBA() {
		logger.trace("call getVereinBA()-Method");
		return vereinBA;
	}

	public static BankBA getBankBA() {
		logger.trace("call getBankBA()-Method");
		return bankBA;
	}

	public static DataimportBA getDatenimportBA() {
		logger.trace("call getDatenimportBA()-Method");
		return datenimportBA;
	}

	public static LaufzeitsystemBA getLaufzeitsystemBA() {
		logger.trace("call getLaufzeitsystemBA()-Method");
		return laufzeitsystemBA;
	}

	public static MessageServiceBA getMessageServiceBA() {
		logger.trace("call getMessageServiceBA()-Method");
		return messageServiceBA;
	}
}
