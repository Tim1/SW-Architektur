/**
 * 
 */
package swa.runningeasy.db;

import org.junit.Before;
import org.junit.Test;

import swa.runningeasy.TestData;
import swa.runningeasy.business.AbstractBATest;
import swa.runningeasy.dtos.LaeuferDTO;

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
		objectWriter.save(LaeuferDTO.class, TestData.getLaeuferDTO());
	}

}
