package swa.runningeasy.db;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class EmulatedDB implements IDatabase {
	private static EmulatedDB	instance	= new EmulatedDB();

	private final List<Object>	values		= new ArrayList<>();
	private static Logger		logger		= Logger.getLogger(EmulatedDB.class);

	// private Constructor
	private EmulatedDB() {
	}

	@Override
	public <C> void save(final Class<C> clazz, final C objectToSave) {
		logger.trace("saving: " + objectToSave);
		values.add(objectToSave);
	}

	@Override
	public <C> void delete(final Class<C> clazz, final C objectToDelete) {
		logger.trace("deleting: " + objectToDelete);
		values.remove(objectToDelete);
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

	@SuppressWarnings("unchecked")
	@Override
	public <C> List<C> getAllObjects(final Class<C> clazz) {
		logger.trace("call getAllObjects()-method");
		List<C> result = new ArrayList<>();

		for (Object o : values) {
			if (o.getClass().equals(clazz)) {
				result.add((C) o);
			}
		}

		return result;
	}

	@Override
	public <C> C getObjectByQuery(final Class<C> clazz, final String StrQuery) {
		// TODO Auto-generated method stub
		return null;
	}

	public static EmulatedDB getInstance() {
		return instance;
	}

	@Override
	public void begin() {
	}

	@Override
	public void commit() {
	}

}
