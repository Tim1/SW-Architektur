package swa.runningeasy.db;

import java.util.ArrayList;
import java.util.List;

public class EmulatedDB implements IObjectReader, IObjectWriter {
	private static EmulatedDB	instance	= new EmulatedDB();

	private final List<Object>	values		= new ArrayList<>();


	@Override
	public <C> void save(final Class<C> clazz, final C objectToSave) {
		values.add(objectToSave);
	}

	@Override
	public <C> void delete(final Class<C> clazz, final C objectToDelete) {
		values.remove(objectToDelete);
	}

	@Override
	public <C> C getObjectById(final Class<C> clazz, final Long id) {
		return null;
	}

	@Override
	public <C> List<C> getObjectByValues(final Class<C> clazz, final Object dto) {
		return null;
	}

	@Override
	public <C> List<C> getAllObjects(final Class<C> clazz) {
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
