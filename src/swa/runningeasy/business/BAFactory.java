/**
 * 
 */
package swa.runningeasy.business;

import swa.runningeasy.business.extern.BankBA;
import swa.runningeasy.business.extern.DataimportBA;
import swa.runningeasy.business.extern.LaufzeitsystemBA;
import swa.runningeasy.business.extern.MessageServiceBA;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class BAFactory {
	public static boolean			asdf	= false;

	private static ErgebnisBA		ergebnisBA;
	private static LaeuferBA		laeuferBA;
	private static StatistikBA		statistikBA;
	private static TeilnahmeBA		teilnahmeBA;
	private static VeranstaltungBA	veranstaltungBA;
	private static VereinBA			vereinBA;
	private static BankBA			bankBA;
	private static DataimportBA		datenimportBA;
	private static LaufzeitsystemBA	laufzeitsystemBA;
	private static MessageServiceBA	messageServiceBA;

	public static void init() {
		asdf = true;

		ergebnisBA = new ErgebnisBA();
		laeuferBA = new LaeuferBA();
		statistikBA = new StatistikBA();
		teilnahmeBA = new TeilnahmeBA();
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

	public static ErgebnisBA getErgebnisBA() {
		return ergebnisBA;
	}

	public static LaeuferBA getLaeuferBA() {
		return laeuferBA;
	}

	public static StatistikBA getStatistikBA() {
		return statistikBA;
	}

	public static TeilnahmeBA getTeilnahmeBA() {
		return teilnahmeBA;
	}

	public static VeranstaltungBA getVeranstaltungBA() {
		return veranstaltungBA;
	}

	public static VereinBA getVereinBA() {
		return vereinBA;
	}

	public static BankBA getBankBA() {
		return bankBA;
	}

	public static DataimportBA getDatenimportBA() {
		return datenimportBA;
	}

	public static LaufzeitsystemBA getLaufzeitsystemBA() {
		return laufzeitsystemBA;
	}

	public static MessageServiceBA getMessageServiceBA() {
		return messageServiceBA;
	}
}
