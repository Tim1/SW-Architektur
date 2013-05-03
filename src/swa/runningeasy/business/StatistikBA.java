/**
 * 
 */
package swa.runningeasy.business;

import java.util.ArrayList;
import java.util.List;

import swa.runningeasy.dtos.ListeneintragDTO;
import swa.runningeasy.services.Auswertung;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
// FIXME: rename to ListeneintragBA as it works with ListeneintragDTO now
public class StatistikBA extends AbstractBA {

	public List<ListeneintragDTO> generateErgebnisliste(final Auswertung auswertung, final String veranstaltung) {
		return new ArrayList<>();
	}

}
