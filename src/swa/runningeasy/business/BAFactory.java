/**
 * 
 */
package swa.runningeasy.business;

import org.apache.log4j.Logger;

import runningeasy.bom.entities.RunningServicesFactory;
import swa.runningeasy.business.extern.BankBA;
import swa.runningeasy.business.extern.DataimportBA;
import swa.runningeasy.business.extern.LaufzeitsystemBA;
import swa.runningeasy.business.extern.MessageServiceBA;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class BAFactory {

	private static LaufzeitBA		ergebnisBA;
	private static LaeuferBA		laeuferBA;
	private static ListeneintragBA	statistikBA;
	private static AnmeldungBA		teilnahmeBA;
	private static VeranstaltungBA	veranstaltungBA;
	private static VereinBA			vereinBA;
	private static BankBA			bankBA;
	private static DataimportBA		datenimportBA;
	private static LaufzeitsystemBA	laufzeitsystemBA;
	private static MessageServiceBA	messageServiceBA;

	private static Logger			logger	= Logger.getLogger(BAFactory.class);

	public static void init() {
		logger.debug("call init()-Method");
		ergebnisBA = new LaufzeitBA();
		laeuferBA = new LaeuferBA();
		statistikBA = new ListeneintragBA();
		teilnahmeBA = new AnmeldungBA();
		veranstaltungBA = new VeranstaltungBA();
		vereinBA = new VereinBA();
		bankBA = new BankBA();
		datenimportBA = new DataimportBA();
		laufzeitsystemBA = new LaufzeitsystemBA();
		messageServiceBA = new MessageServiceBA();

		ergebnisBA.init();
		laeuferBA.init();
		statistikBA.init();
		teilnahmeBA.init();
		veranstaltungBA.init();
		vereinBA.init();
		bankBA.init();
		datenimportBA.init();
		laufzeitsystemBA.init();
		messageServiceBA.init();
	}

	public static LaufzeitBA getErgebnisBA() {
		logger.debug("call getErgebnisBA()-Method");
		return ergebnisBA;
	}

	public static LaeuferBA getLaeuferBA() {
		logger.debug("call getLaeuferBA()-Method");
		return laeuferBA;
	}

	public static ListeneintragBA getStatistikBA() {
		logger.debug("call getStatistikBA()-Method");
		return statistikBA;
	}

	public static AnmeldungBA getTeilnahmeBA() {
		logger.debug("call getTeilnahmeBA()-Method");
		return teilnahmeBA;
	}

	public static VeranstaltungBA getVeranstaltungBA() {
		logger.debug("call getVeranstaltungBA()-Method");
		return veranstaltungBA;
	}

	public static VereinBA getVereinBA() {
		logger.debug("call getVereinBA()-Method");
		return vereinBA;
	}

	public static BankBA getBankBA() {
		logger.debug("call getBankBA()-Method");
		return bankBA;
	}

	public static DataimportBA getDatenimportBA() {
		logger.debug("call getDatenimportBA()-Method");
		return datenimportBA;
	}

	public static LaufzeitsystemBA getLaufzeitsystemBA() {
		logger.debug("call getLaufzeitsystemBA()-Method");
		return laufzeitsystemBA;
	}

	public static MessageServiceBA getMessageServiceBA() {
		logger.debug("call getMessageServiceBA()-Method");
		return messageServiceBA;
	}
}
