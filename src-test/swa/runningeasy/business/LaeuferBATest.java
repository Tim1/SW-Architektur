/**
 * 
 */
package swa.runningeasy.business;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import swa.runningeasy.TestData;


/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class LaeuferBATest extends AbstractBATest {
	private LaeuferBA	laeufer;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		laeufer = BAFactory.getLaeuferBA();
	}

	@Test
	public void testgenerateGesamtStatistik() {
		laeufer.generateGesamtStatistik(TestData.getLaeuferDTO());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testupdateLaeufer() {
		try {
			laeufer.createLaeufer(TestData.getLaeuferDTO());
		} catch (Throwable t) {
			fail();
		}

		// should fail with IllegalArgumentException
		laeufer.createLaeufer(null);
	}

}
