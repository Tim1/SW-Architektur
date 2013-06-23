/**
 * 
 */
package swa.runningeasy.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.log4j.Logger;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class DerbyDB implements IDatabase {
	private static Logger		logger	= Logger.getLogger(DerbyDB.class);
	private static DerbyDB		instance;

	private final EntityManager	em;

	private DerbyDB(final EntityManager em) {
		this.em = em;
	}

	public static void init(final EntityManager em) {
		instance = new DerbyDB(em);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <C> C getObjectById(final Class<C> clazz, final Long id) {
		logger.trace("call getObjectById()-method");

		Query query = em.createQuery("select y from " + clazz.getSimpleName() + " y " + "WHERE y.id = " + id);
		return (C) query.getSingleResult();
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
	public <C> C getObjectByQuery(final Class<C> clazz, final Map<String, String> parameters) {
		List<C> list = getObjectByQueryList(clazz, parameters);

		if (list.size() > 0)
			return list.get(0);
		else
			return null;
	}

	@Override
	public <C> List<C> getObjectByQueryList(Class<C> clazz, Map<String, String> parameters) {
		logger.trace("call getObjectByQuery()-method");

		StringBuilder strQuery = new StringBuilder("select x from " + clazz.getSimpleName() + " x WHERE");
		for (String key : parameters.keySet()) {
			strQuery.append(" ").append(key).append(" = \"").append(parameters.get(key)).append("\" AND");
		}
		strQuery.delete(strQuery.lastIndexOf(" AND"), strQuery.length());
		Query query = em.createQuery(strQuery.toString());

		@SuppressWarnings("unchecked")
		List<C> resultList = query.getResultList();
		if (resultList.isEmpty())
			return new ArrayList<>();
		else
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
