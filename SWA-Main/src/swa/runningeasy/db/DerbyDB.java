/**
 * 
 */
package swa.runningeasy.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.log4j.Logger;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class DerbyDB implements IObjectReader, IObjectWriter {
	private static Logger		logger	= Logger.getLogger(DerbyDB.class);
	private static DerbyDB		instance;

	private final EntityManager	em;

	private DerbyDB(final EntityManager em) {
		this.em = em;
	}

	public static void init(final EntityManager em) {
		instance = new DerbyDB(em);
	}

	@Override
	public <C> C getObjectById(final Class<C> clazz, final Long id) {
		logger.trace("call getObjectById()-method");
		return null;
	}

	@Override
	public <C> List<C> getObjectByValues(final Class<C> clazz, final Object dto) {
		logger.trace("call getObjectByValues()-method");
		return null;
	}

	@Override
	public <C> List<C> getAllObjects(final Class<C> clazz) {
		logger.trace("call getAllObjects()-method");
		Query query = em.createQuery("select x from " + clazz.getSimpleName() + " x");

		@SuppressWarnings("unchecked")
		List<C> resultList = query.getResultList();
		return resultList;
	}

	@Override
	public <C> void save(final Class<C> clazz, final C objectToSave) {
		logger.trace("call save()-method");
		em.persist(objectToSave);
	}

	@Override
	public <C> void delete(final Class<C> clazz, final C objectToDelete) {
		logger.trace("call delete()-method");
		em.remove(objectToDelete);
	}

	@Override
	public void commit() {
		logger.debug("commiting DB-Transaction");
		em.getTransaction().commit();
	}

	@Override
	public void begin() {
		logger.debug("beginning DB-Transaction");
		em.getTransaction().begin();
	}

	public static void close() {
		instance.em.close();
	}

	public static DerbyDB getInstance() {
		return instance;
	}
}
