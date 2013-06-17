/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import swa.runningeasy.TestData;
import swa.runningeasy.dtos.VereinDTO;
import swa.runningeasy.init.BAFactory;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class VereinBATest extends AbstractBATest {
	private VereinBA	vereinBA;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		vereinBA = BAFactory.getVereinBA();
	}

	@Test
	public void testcreateVerein() {
		int countBefore = vereinBA.getAllVereine().size();

		vereinBA.createVerein(TestData.getVereinDTO());

		List<VereinDTO> result = vereinBA.getAllVereine();
		Assert.assertEquals(countBefore + 1, result.size());
	}
}
