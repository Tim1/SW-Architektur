/**
 * 
 */
package swa.runningeasy.business.services;

import java.util.ArrayList;
import java.util.List;

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
	private final TransformerFactory	transformerFactory	= TransformerFactory.getInstance();
	private final VeranstaltungBA		veranstaltungBA		= (VeranstaltungBA) VeranstaltungBA.getInstance();
	private final VereinBA				vereinBA			= (VereinBA) VeranstaltungBA.getInstance();
	private final TeilnahmeBA			teilnahmeBA			= (TeilnahmeBA) TeilnahmeBA.getInstance();
	private final LaeuferBA				laeuferBA			= (LaeuferBA) LaeuferBA.getInstance();
	private final ErgebnisBA			ergebnisBA			= (ErgebnisBA) ErgebnisBA.getInstance();

	@Override
	public void erzeugeVeranstaltung(final VeranstaltungDTO v) {
		veranstaltungBA.createVeranstaltung((VeranstaltungBE) transformerFactory.transformToBE(v));
	}

	@Override
	public void erzeugeVerein(final VereinDTO v) {
		vereinBA.createVerein((VereinBE) transformerFactory.transformToBE(v));
	}

	@Override
	public void erzeugeAnmeldung(final AnmeldungDTO a) {
		teilnahmeBA.createTeilnahme((TeilnahmeBE) transformerFactory.transformToBE(a));
	}

	@Override
	public void erzeugeLaeufer(final LaeuferDTO a) {
		laeuferBA.createLaeufer(null);
	}

	@Override
	public void erzeugeLaufzeit(final LaufzeitDTO l) {

	}

	@Override
	public List<VeranstaltungDTO> getVeranstaltungen() {
		List<VeranstaltungBE> listBEs = veranstaltungBA.getAllVeranstaltungen();
		List<VeranstaltungDTO> listDTOs = new ArrayList<>(listBEs.size());

		for (VeranstaltungBE be : listBEs) {
			listDTOs.add((VeranstaltungDTO) transformerFactory.transformToDTO(be));
		}

		return listDTOs;
	}

	@Override
	public List<VereinDTO> getVereine() {
		List<VereinBE> listBEs = vereinBA.getAllVereine();
		List<VereinDTO> listDTOs = new ArrayList<>(listBEs.size());

		for (VereinBE be : listBEs) {
			listDTOs.add((VereinDTO) transformerFactory.transformToDTO(be));
		}

		return listDTOs;
	}

	@Override
	public List<LaeuferDTO> getLaeufer() {
		List<LaeuferBE> listBEs = laeuferBA.getAllLauefer();
		List<LaeuferDTO> listDTOs = new ArrayList<>(listBEs.size());

		for (LaeuferBE be : listBEs) {
			listDTOs.add((LaeuferDTO) transformerFactory.transformToDTO(be));
		}

		return listDTOs;
	}

	@Override
	public List<AnmeldungDTO> getAnmeldungen(final String Veranstaltung) {
		List<TeilnahmeBE> listBEs = teilnahmeBA.getAllTeilnahmen();
		List<AnmeldungDTO> listDTOs = new ArrayList<>(listBEs.size());

		for (TeilnahmeBE be : listBEs) {
			listDTOs.add((AnmeldungDTO) transformerFactory.transformToDTO(be));
		}

		return listDTOs;
	}

	@Override
	public List<LaufzeitDTO> getLaufzeiten(final String Veranstaltung) {
		List<ErgebnisBE> listBEs = ergebnisBA.getAllErgebnisse();
		List<LaufzeitDTO> listDTOs = new ArrayList<>(listBEs.size());

		for (ErgebnisBE be : listBEs) {
			listDTOs.add((LaufzeitDTO) transformerFactory.transformToDTO(be));
		}

		return listDTOs;
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
		// TODO Auto-generated method stub
	}

}
