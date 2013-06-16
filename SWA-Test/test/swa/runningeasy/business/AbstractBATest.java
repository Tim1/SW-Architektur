/**
 * 
 */
package swa.runningeasy.business;

import org.junit.Before;

import swa.runningeasy.init.BAFactory;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class AbstractBATest {

	@Before
	public void setUp() {
		BAFactory.init();
	}
}
