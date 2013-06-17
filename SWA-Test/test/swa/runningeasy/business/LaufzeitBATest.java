/**
 * 
 */
package swa.runningeasy.business;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import swa.runningeasy.TestData;
import swa.runningeasy.dtos.LaufzeitDTO;
import swa.runningeasy.init.BAFactory;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class LaufzeitBATest extends AbstractBATest {
	LaufzeitBA	laufzeitBA;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		laufzeitBA = BAFactory.getLaufzeitBA();
	}

	@Test
	public void testcreateLaufzeit() {
		int countBefore = laufzeitBA.getAllLaufzeiten().size();

		laufzeitBA.createLaufzeit(TestData.getLaufzeitDTO());

		List<LaufzeitDTO> result = laufzeitBA.getAllLaufzeiten();
		Assert.assertEquals(countBefore + 1, result.size());
	}
}
