/**
 * 
 */
package swa.runningeasy.business.services;

import java.util.List;

import swa.runningeasy.business.BAFactory;
import swa.runningeasy.business.ErgebnisBA;
import swa.runningeasy.business.LaeuferBA;
import swa.runningeasy.business.StatistikBA;
import swa.runningeasy.business.TeilnahmeBA;
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

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class RunningServiceBA implements RunningServices {
	private VeranstaltungBA	veranstaltungBA;
	private VereinBA		vereinBA;
	private TeilnahmeBA		teilnahmeBA;
	private LaeuferBA		laeuferBA;
	private ErgebnisBA		ergebnisBA;
	private StatistikBA		statistikBA;

	@Override
	public void erzeugeVeranstaltung(final VeranstaltungDTO v) {
		veranstaltungBA.createVeranstaltung(v);
	}

	@Override
	public void erzeugeVerein(final VereinDTO v) {
		vereinBA.createVerein(v);
	}

	@Override
	public void erzeugeAnmeldung(final AnmeldungDTO a) {
		teilnahmeBA.createTeilnahme(a);
	}

	@Override
	public void erzeugeLaeufer(final LaeuferDTO a) {
		laeuferBA.createLaeufer(a);
	}

	@Override
	public void erzeugeLaufzeit(final LaufzeitDTO l) {

	}

	@Override
	public List<VeranstaltungDTO> getVeranstaltungen() {
		return veranstaltungBA.getAllVeranstaltungen();
	}

	@Override
	public List<VereinDTO> getVereine() {
		return vereinBA.getAllVereine();
	}

	@Override
	public List<LaeuferDTO> getLaeufer() {
		return laeuferBA.getAllLauefer();
	}

	@Override
	public List<AnmeldungDTO> getAnmeldungen(final String Veranstaltung) {
		return teilnahmeBA.getAllTeilnahmen();
	}

	@Override
	public List<LaufzeitDTO> getLaufzeiten(final String Veranstaltung) {
		return ergebnisBA.getAllErgebnisse();
	}

	@Override
	public List<ListeneintragDTO> getAuswertung(final Auswertung a, final String Veranstaltung) {
		return statistikBA.generateErgebnisliste(a, Veranstaltung);
	}

	@Override
	public void init() {
		BAFactory.init();

		veranstaltungBA = BAFactory.getVeranstaltungBA();
		vereinBA = BAFactory.getVereinBA();
		teilnahmeBA = BAFactory.getTeilnahmeBA();
		laeuferBA = BAFactory.getLaeuferBA();
		ergebnisBA = BAFactory.getErgebnisBA();
		statistikBA = BAFactory.getStatistikBA();
	}

}
