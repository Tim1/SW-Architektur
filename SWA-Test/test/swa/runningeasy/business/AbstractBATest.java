/**
 * 
 */
package swa.runningeasy.business;

import org.junit.Before;

import swa.runningeasy.init.BAFactory;
import swa.runningeasy.init.DBInit;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class AbstractBATest {

	@Before
	public void setUp() {
		BAFactory.init();
		DBInit.setRealDB(true);
		DBInit.init();
	}
}
