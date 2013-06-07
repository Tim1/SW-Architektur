/**
 * 
 */
package swa.runningeasy.business.services;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import swa.runningeasy.business.AbstractBATest;
import swa.runningeasy.dtos.VeranstaltungDTO;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class RunningServiceBATest extends AbstractBATest {
	private RunningServiceBA	runningServiceBA;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		runningServiceBA = new RunningServiceBA();
		runningServiceBA.init();
	}

	@Test
	public void erzeugeVeranstaltung() {
		VeranstaltungDTO dto = new VeranstaltungDTO("", new Date(), new Date(), 10);

		runningServiceBA.erzeugeVeranstaltung(dto);
	}

	@Test
	public void testgetVeranstaltungen() {
		List<VeranstaltungDTO> list = runningServiceBA.getVeranstaltungen();

		assertNotNull(list);
	}
}
