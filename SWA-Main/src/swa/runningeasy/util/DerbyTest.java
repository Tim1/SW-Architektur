/**
 * 
 */
package swa.runningeasy.util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import swa.runningeasy.bes.TestBE;

/**
 * The class is located in the Main-project (and not in Test) because it only
 * tests the configuration of the Derby database and not any of our own code
 * 
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class DerbyTest {
	private static final String			PERSISTENCE_UNIT_NAME	= "runningeasy";
	private static EntityManagerFactory	factory;

	@SuppressWarnings("unchecked")
	public static void main(final String[] args) {
		System.setProperty("derby.system.home", "db");

		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		// Create new Verein
		TestBE test = new TestBE();
		test.setDescription("desc");
		test.setSummary("summary");

		em.getTransaction().begin();
		em.persist(test);
		em.getTransaction().commit();

		// Read the existing entries and write to console
		Query q = em.createQuery("select t from TestBE t");
		List<TestBE> list = q.getResultList();
		for (TestBE todo : list) {
			System.out.println(todo);
		}
		System.out.println("Size: " + list.size());

		em.close();
	}
}
