/**
 * 
 */
package swa.runningeasy.db;

import org.junit.Before;
import org.junit.Test;

import swa.runningeasy.business.AbstractBATest;
import swa.runningeasy.data.be.LaeuferBE;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class ObjectWriterTest extends AbstractBATest {
	private IObjectWriter	objectWriter;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		objectWriter = new ObjectWriter();
	}

	@Test
	public void testsave() {
		objectWriter.save(LaeuferBE.class, new LaeuferBE());
	}

}
