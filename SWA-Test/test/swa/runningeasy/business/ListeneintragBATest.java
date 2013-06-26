/**
 * 
 */
package swa.runningeasy.business;

import org.junit.Before;
import org.junit.Test;

import swa.runningeasy.init.BAFactory;
import swa.runningeasy.services.Auswertung;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class ListeneintragBATest extends AbstractBATest {
	private ListeneintragBA	listeneintragBA;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		listeneintragBA = BAFactory.getListeneintragBA();
	}

	@Test
	public void testgenerateListeneintrag() {
		listeneintragBA.generateListeneintrag(Auswertung.STARTLISTE, "");
	}
}
