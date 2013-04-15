package swa.runningeasy.services;

/**
 * @author Bernhard Hollunder
 * 
 * Defines the coarse-grained interface to the running system to be implemented
 * in the exercises to "Software Architektur" held in AIB 6.
 * 
 * This interface will be realized individually by the students based on the
 * implemented object model.
 *
 */

import swa.runningeasy.dtos.AnmeldungDTO;
import swa.runningeasy.dtos.LaufzeitDTO;
import swa.runningeasy.dtos.VeranstaltungDTO;
import swa.runningeasy.dtos.VereinDTO;
import swa.runningeasy.dtos.LaeuferDTO;
import swa.runningeasy.dtos.ListeneintragDTO;

import java.util.List;


public interface RunningServices {
	
	void erzeugeVeranstaltung(VeranstaltungDTO v);
	void erzeugeVerein(VereinDTO v);
	void erzeugeAnmeldung(AnmeldungDTO a);
	void erzeugeLaeufer(LaeuferDTO a);
	void erzeugeLaufzeit(LaufzeitDTO l);

	List<VeranstaltungDTO> getVeranstaltungen();
	List<VereinDTO> getVereine();
	List<LaeuferDTO> getLaeufer();
	List<AnmeldungDTO> getAnmeldungen(String Veranstaltung);
	List<LaufzeitDTO> getLaufzeiten(String Veranstaltung);
	List<ListeneintragDTO> getAuswertung(Auswertung a, String Veranstaltung);

	void init();
}
