/**
 * 
 */
package swa.runningeasy.business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import swa.runningeasy.dtos.AnmeldungDTO;
import swa.runningeasy.dtos.LaeuferDTO;
import swa.runningeasy.dtos.LaufzeitDTO;
import swa.runningeasy.dtos.ListeneintragDTO;
import swa.runningeasy.services.Auswertung;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class ListeneintragBA extends AbstractBA {
	private static Logger	logger	= Logger.getLogger(ListeneintragBA.class);

	public List<ListeneintragDTO> generateListeneintrag(final Auswertung auswertung, final String veranstaltung) {
		logger.debug("call generateListeneintrag()-method");
		// TODO: whats about auswertung? It seems to be unused

		List<AnmeldungDTO> anmeldungen = getAllAnmeldungen(veranstaltung);

		List<ListeneintragDTO> result = new ArrayList<>();

		// TODO: whats the Platzierung? is not checked
		for (AnmeldungDTO anmeldung : anmeldungen) {
			LaeuferDTO laeufer = anmeldung.getLaeufer();
			LaufzeitDTO zeit = getLaufzeit(anmeldung.getStartnummer(), veranstaltung);

			result.add(new ListeneintragDTO(laeufer.getName(), laeufer.getVorname(), laeufer.getGeburtsjahr(), laeufer
					.getGeschlecht(), anmeldung.getVerein(), anmeldung.getStartnummer(), 0, zeit.getLaufzeit()));
		}


		return result;
	}

	/**
	 * @param startnummer
	 * @param veranstaltung
	 * @return
	 */
	private LaufzeitDTO getLaufzeit(final int startnummer, final String veranstaltung) {
		logger.debug("call getLaufzeit()-method");
		List<LaufzeitDTO> list = objectReader.getAllObjects(LaufzeitDTO.class);

		for (LaufzeitDTO l : list) {
			if (l.getStartnummer() == startnummer && l.getVeranstaltung().equals(veranstaltung))
				return l;
		}

		return null;
	}

	private List<AnmeldungDTO> getAllAnmeldungen(final String veranstaltung) {
		logger.debug("call getAllAnmeldungen()-method");
		List<AnmeldungDTO> result = objectReader.getAllObjects(AnmeldungDTO.class);

		Iterator<AnmeldungDTO> it = result.iterator();
		for (AnmeldungDTO dto = it.next(); it.hasNext(); dto = it.next()) {
			if (!dto.getVeranstaltung().equals(veranstaltung))
				it.remove();
		}

		return result;
	}


}
