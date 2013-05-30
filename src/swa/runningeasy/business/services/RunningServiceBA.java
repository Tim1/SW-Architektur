/**
 * 
 */
package swa.runningeasy.business.services;

import java.util.List;

import org.apache.log4j.Logger;

import swa.runningeasy.business.AnmeldungBA;
import swa.runningeasy.business.BAFactory;
import swa.runningeasy.business.LaeuferBA;
import swa.runningeasy.business.LaufzeitBA;
import swa.runningeasy.business.ListeneintragBA;
import swa.runningeasy.business.VeranstaltungBA;
import swa.runningeasy.business.VereinBA;
import swa.runningeasy.dtos.AnmeldungDTO;
import swa.runningeasy.dtos.LaeuferDTO;
import swa.runningeasy.dtos.LaufzeitDTO;
import swa.runningeasy.dtos.ListeneintragDTO;
import swa.runningeasy.dtos.VeranstaltungDTO;
import swa.runningeasy.dtos.VereinDTO;
import swa.runningeasy.services.Auswertung;
import swa.runningeasy.services.RunningServices;
import swa.runningeasy.util.DummyUtils;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class RunningServiceBA implements RunningServices {
	private VeranstaltungBA	veranstaltungBA;
	private VereinBA		vereinBA;
	private AnmeldungBA		anmeldungBA;
	private LaeuferBA		laeuferBA;
	private LaufzeitBA		ergebnisBA;
	private ListeneintragBA	listeneintragBA;

	private static Logger	logger	= Logger.getLogger(RunningServiceBA.class);


	@Override
	public void erzeugeVeranstaltung(final VeranstaltungDTO v) {
		logger.debug("call erzeugeVeranstaltung()-method");
		veranstaltungBA.createVeranstaltung(v);
	}

	@Override
	public void erzeugeVerein(final VereinDTO v) {
		logger.debug("call erzeugeVerein()-method");
		vereinBA.createVerein(v);
	}

	@Override
	public void erzeugeAnmeldung(final AnmeldungDTO a) {
		logger.debug("call erzeugeAnmeldung()-method");
		anmeldungBA.createAnmeldung(a);
	}

	@Override
	public void erzeugeLaeufer(final LaeuferDTO a) {
		logger.debug("call erzeugeLaeufer()-method");
		laeuferBA.createLaeufer(a);
	}

	@Override
	public void erzeugeLaufzeit(final LaufzeitDTO l) {
		logger.debug("call erzeugeLaufzeit()-method");
		ergebnisBA.createLaufzeit(l);
	}

	@Override
	public List<VeranstaltungDTO> getVeranstaltungen() {
		logger.debug("call getVeranstaltungen()-method");
		return veranstaltungBA.getAllVeranstaltungen();
	}

	@Override
	public List<VereinDTO> getVereine() {
		logger.debug("call getVereine()-method");
		return vereinBA.getAllVereine();
	}

	@Override
	public List<LaeuferDTO> getLaeufer() {
		logger.debug("call getLaeufer()-method");
		return laeuferBA.getAllLauefer();
	}

	@Override
	public List<AnmeldungDTO> getAnmeldungen(final String Veranstaltung) {
		logger.debug("call getAnmeldungen()-method");
		return anmeldungBA.getAllAnmeldungen();
	}

	@Override
	public List<LaufzeitDTO> getLaufzeiten(final String Veranstaltung) {
		logger.debug("call getLaufzeiten()-method");
		return ergebnisBA.getAllLaufzeiten();
	}

	@Override
	public List<ListeneintragDTO> getAuswertung(final Auswertung a, final String Veranstaltung) {
		logger.debug("call getAuswertung()-method");
		return listeneintragBA.generateListeneintrag(a, Veranstaltung);
	}

	@Override
	public void init() {
		logger.debug("call init()-method");
		BAFactory.init();

		veranstaltungBA = BAFactory.getVeranstaltungBA();
		vereinBA = BAFactory.getVereinBA();
		anmeldungBA = BAFactory.getTeilnahmeBA();
		laeuferBA = BAFactory.getLaeuferBA();
		ergebnisBA = BAFactory.getErgebnisBA();
		listeneintragBA = BAFactory.getStatistikBA();
	}

}
