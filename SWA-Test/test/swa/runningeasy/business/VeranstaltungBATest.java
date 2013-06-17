/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import swa.runningeasy.TestData;
import swa.runningeasy.dtos.VeranstaltungDTO;
import swa.runningeasy.init.BAFactory;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class VeranstaltungBATest extends AbstractBATest {
	private VeranstaltungBA	veranstaltungBA;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		veranstaltungBA = BAFactory.getVeranstaltungBA();
	}

	@Test
	public void testcreateVeranstaltung() {
		int countBefore = veranstaltungBA.getAllVeranstaltungen().size();

		veranstaltungBA.createVeranstaltung(TestData.getVeranstaltungDTO());

		List<VeranstaltungDTO> result = veranstaltungBA.getAllVeranstaltungen();
		Assert.assertEquals(countBefore + 1, result.size());
	}
}
