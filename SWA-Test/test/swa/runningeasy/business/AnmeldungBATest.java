/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import swa.runningeasy.TestData;
import swa.runningeasy.bes.AnmeldungBE;
import swa.runningeasy.dtos.AnmeldungDTO;
import swa.runningeasy.init.BAFactory;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class AnmeldungBATest extends AbstractBATest {
	private AnmeldungBA	anmeldungBA;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		anmeldungBA = BAFactory.getAnmeldungBA();
	}

	@Test
	public void testcreateAnmeldung() {
		int countBefore = anmeldungBA.getAllAnmeldungen().size();

		anmeldungBA.createAnmeldung(TestData.getAnmeldungDTO());

		List<AnmeldungDTO> result = anmeldungBA.getAllAnmeldungen();
		Assert.assertEquals(countBefore + 1, result.size());
	}

	@Test
	public void testgetAnmeldung() {
		AnmeldungDTO anmeldungDTO = TestData.getAnmeldungDTO();

		anmeldungBA.createAnmeldung(anmeldungDTO);

		AnmeldungBE anmeldungBE = anmeldungBA.getAnmeldung(anmeldungDTO);

		Assert.assertEquals(anmeldungDTO.getLaeufer().toString(), anmeldungBE.getLaeufer().asDTO().toString());
		Assert.assertEquals(anmeldungDTO.getVeranstaltung(), anmeldungBE.getVeranstaltung().getName());
		Assert.assertEquals(anmeldungDTO.getVerein(), anmeldungBE.getVerein().getName());
		Assert.assertEquals(anmeldungDTO.getStartnummer(), anmeldungBE.getStartnummer());
	}

}
