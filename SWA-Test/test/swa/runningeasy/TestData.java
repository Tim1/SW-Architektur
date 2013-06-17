/**
 * 
 */
package swa.runningeasy;

import java.util.Date;

import swa.runningeasy.dtos.AnmeldungDTO;
import swa.runningeasy.dtos.LaeuferDTO;
import swa.runningeasy.dtos.LaufzeitDTO;
import swa.runningeasy.dtos.ListeneintragDTO;
import swa.runningeasy.dtos.VeranstaltungDTO;
import swa.runningeasy.dtos.VereinDTO;

/**
 * @author Tim Schmiedl (Cyboot)
 */
public class TestData {
	private static final LaeuferDTO			laeuferDTO			= new LaeuferDTO("Müller", "Peter", 1900, 'm',
																		"email@provider.com", "sms", "Hauptstraße",
																		"78050", "Villingen", "Deutschland");
	private static final AnmeldungDTO		anmeldungDTO		= new AnmeldungDTO(laeuferDTO, true, "Lauf-1",
																		"Verein-1", 123);
	private static final VereinDTO			vereinDTO			= new VereinDTO("Verein-1");
	private static final LaufzeitDTO		laufzeitDTO			= new LaufzeitDTO(123, new Date(0), "Lauf-1");
	private static final ListeneintragDTO	listeneintragDTO	= new ListeneintragDTO("Müller", "Peter", 1900, 'm',
																		"Verein-1", 123, 123, new Date(0));
	private static final VeranstaltungDTO	veranstaltungDTO	= new VeranstaltungDTO("Lauf-1", new Date(0), new Date(
																		0), 10);

	public static final LaeuferDTO getLaeuferDTO() {
		return laeuferDTO;
	}

	public static final AnmeldungDTO getAnmeldungDTO() {
		return anmeldungDTO;
	}

	public static final VereinDTO getVereinDTO() {
		return vereinDTO;
	}

	public static final LaufzeitDTO getLaufzeitDTO() {
		return laufzeitDTO;
	}

	public static final ListeneintragDTO getListeneintragDTO() {
		return listeneintragDTO;
	}

	public static final VeranstaltungDTO getVeranstaltungDTO() {
		return veranstaltungDTO;
	}

}
