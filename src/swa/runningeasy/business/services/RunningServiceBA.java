/**
 * 
 */
package swa.runningeasy.business.services;

import java.util.ArrayList;
import java.util.List;

import swa.runningeasy.business.BAFactory;
import swa.runningeasy.business.ErgebnisBA;
import swa.runningeasy.business.LaeuferBA;
import swa.runningeasy.business.TeilnahmeBA;
import swa.runningeasy.business.VeranstaltungBA;
import swa.runningeasy.business.VereinBA;
import swa.runningeasy.data.be.ErgebnisBE;
import swa.runningeasy.data.be.LaeuferBE;
import swa.runningeasy.data.be.TeilnahmeBE;
import swa.runningeasy.data.be.VeranstaltungBE;
import swa.runningeasy.data.be.VereinBE;
import swa.runningeasy.dtos.AnmeldungDTO;
import swa.runningeasy.dtos.LaeuferDTO;
import swa.runningeasy.dtos.LaufzeitDTO;
import swa.runningeasy.dtos.ListeneintragDTO;
import swa.runningeasy.dtos.VeranstaltungDTO;
import swa.runningeasy.dtos.VereinDTO;
import swa.runningeasy.services.Auswertung;
import swa.runningeasy.services.RunningServices;
import swa.runningeasy.util.TransformerFactory;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class RunningServiceBA implements RunningServices {
	private TransformerFactory	transformerFactory;
	private VeranstaltungBA		veranstaltungBA;
	private VereinBA			vereinBA;
	private TeilnahmeBA			teilnahmeBA;
	private LaeuferBA			laeuferBA;
	private ErgebnisBA			ergebnisBA;

	@Override
	public void erzeugeVeranstaltung(final VeranstaltungDTO v) {
		veranstaltungBA.createVeranstaltung(transformerFactory.transformToBE(v, VeranstaltungBE.class));
	}

	@Override
	public void erzeugeVerein(final VereinDTO v) {
		vereinBA.createVerein(transformerFactory.transformToBE(v, VereinBE.class));
	}

	@Override
	public void erzeugeAnmeldung(final AnmeldungDTO a) {
		teilnahmeBA.createTeilnahme(transformerFactory.transformToBE(a, TeilnahmeBE.class));
	}

	@Override
	public void erzeugeLaeufer(final LaeuferDTO a) {
		laeuferBA.createLaeufer(transformerFactory.transformToBE(a, LaeuferBE.class));
	}

	@Override
	public void erzeugeLaufzeit(final LaufzeitDTO l) {

	}

	@Override
	public List<VeranstaltungDTO> getVeranstaltungen() {
		List<VeranstaltungBE> listBEs = veranstaltungBA.getAllVeranstaltungen();

		return transformerFactory.transformToDTOList(listBEs, VeranstaltungDTO.class);
	}

	@Override
	public List<VereinDTO> getVereine() {
		List<VereinBE> listBEs = vereinBA.getAllVereine();

		return transformerFactory.transformToDTOList(listBEs, VereinDTO.class);
	}

	@Override
	public List<LaeuferDTO> getLaeufer() {
		List<LaeuferBE> listBEs = laeuferBA.getAllLauefer();

		return transformerFactory.transformToDTOList(listBEs, LaeuferDTO.class);
	}

	@Override
	public List<AnmeldungDTO> getAnmeldungen(final String Veranstaltung) {
		List<TeilnahmeBE> listBEs = teilnahmeBA.getAllTeilnahmen();

		return transformerFactory.transformToDTOList(listBEs, AnmeldungDTO.class);
	}

	@Override
	public List<LaufzeitDTO> getLaufzeiten(final String Veranstaltung) {
		List<ErgebnisBE> listBEs = ergebnisBA.getAllErgebnisse();

		return transformerFactory.transformToDTOList(listBEs, LaufzeitDTO.class);
	}

	@Override
	public List<ListeneintragDTO> getAuswertung(final Auswertung a, final String Veranstaltung) {
		ArrayList<ListeneintragDTO> arrayList = new ArrayList<>();

		switch (a) {
		case ABBRECHER:
			break;
		case GESAMTERGEBNISLISTE:
			break;
		case NICHTSTARTER:
			break;
		case STARTLISTE:
			break;
		}

		return arrayList;
	}

	@Override
	public void init() {
		BAFactory.init();

		veranstaltungBA = BAFactory.getVeranstaltungBA();
		vereinBA = BAFactory.getVereinBA();
		teilnahmeBA = BAFactory.getTeilnahmeBA();
		laeuferBA = BAFactory.getLaeuferBA();
		ergebnisBA = BAFactory.getErgebnisBA();

		transformerFactory = TransformerFactory.getInstance();
	}

}
