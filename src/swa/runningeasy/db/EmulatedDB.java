package swa.runningeasy.db;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class EmulatedDB implements IObjectReader, IObjectWriter {
	private static EmulatedDB	instance	= new EmulatedDB();

	private final List<Object>	values		= new ArrayList<>();
	private static Logger		logger		= Logger.getLogger(EmulatedDB.class);

	@Override
	public <C> void save(final Class<C> clazz, final C objectToSave) {
		logger.trace("call save()-method");
		values.add(objectToSave);
	}

	@Override
	public <C> void delete(final Class<C> clazz, final C objectToDelete) {
		logger.trace("call delete()-method");
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

	public static EmulatedDB getInstance() {
		return instance;
	}

}
