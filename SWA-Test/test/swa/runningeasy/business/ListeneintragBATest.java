/**
 * 
 */
package swa.runningeasy.business;

import org.junit.Before;
import org.junit.Test;

import swa.runningeasy.init.BAFactory;

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
		// TODO: implement Test for ListeneintragBA
	}
}
