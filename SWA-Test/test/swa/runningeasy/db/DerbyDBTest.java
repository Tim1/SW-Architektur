/**
 * 
 */
package swa.runningeasy.db;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import swa.runningeasy.bes.TestBE;
import swa.runningeasy.business.AbstractBATest;
import swa.runningeasy.init.DBInit;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class DerbyDBTest extends AbstractBATest {
	private DerbyDB			derbyDB;

	private final TestBE	testBE	= new TestBE();

	@Override
	@Before
	public void setUp() {
		super.setUp();
		DBInit.forceRealDB(true);
		DBInit.init();
		derbyDB = DerbyDB.getInstance();
	}

	@Test
	public void testsave() {
		derbyDB.begin();
		derbyDB.save(TestBE.class, testBE);
		derbyDB.commit();

		List<TestBE> allObjects = derbyDB.getAllObjects(TestBE.class);
		assertEquals(1, allObjects.size());
	}

	@Test
	public void testdelete() {
		// create one Object
		derbyDB.begin();
		derbyDB.save(TestBE.class, testBE);
		derbyDB.commit();

		List<TestBE> allObjects = derbyDB.getAllObjects(TestBE.class);
		assertEquals(1, allObjects.size());


		// Deltes the saved object
		derbyDB.begin();
		derbyDB.delete(TestBE.class, testBE);
		derbyDB.commit();

		allObjects = derbyDB.getAllObjects(TestBE.class);
		assertEquals(0, allObjects.size());
	}

	@After
	public void tearDown() {
		DerbyDB.close();
	}
}
