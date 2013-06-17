/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import swa.runningeasy.TestData;
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
}
