/**
 * 
 */
package swa.runningeasy.business;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import swa.runningeasy.TestData;
import swa.runningeasy.dtos.LaeuferDTO;
import swa.runningeasy.init.BAFactory;


/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class LaeuferBATest extends AbstractBATest {
	private LaeuferBA	laeuferBA;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		laeuferBA = BAFactory.getLaeuferBA();
	}

	@Test
	public void testgenerateGesamtStatistik() {
		laeuferBA.generateGesamtStatistik(TestData.getLaeuferDTO());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testcreateLaeufer() {
		int countBefore = laeuferBA.getAllLauefer().size();

		try {
			laeuferBA.createLaeufer(TestData.getLaeuferDTO());
		} catch (Throwable t) {
			fail(t.toString());
		}

		List<LaeuferDTO> result = laeuferBA.getAllLauefer();
		Assert.assertEquals(countBefore + 1, result.size());

		// should fail with IllegalArgumentException
		laeuferBA.createLaeufer(null);
	}

}
