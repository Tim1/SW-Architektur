/**
 * 
 */
package swa.runningeasy.init;

import org.junit.Test;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class DBInitTest {

	@Test
	public void testinit() {
		DBInit.init();
	}

	@Test
	public void testisRealDB() {
		DBInit.isRealDB();
	}
}
