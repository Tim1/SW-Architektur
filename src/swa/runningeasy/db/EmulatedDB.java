package swa.runningeasy.db;

import java.util.ArrayList;
import java.util.List;

import swa.runningeasy.data.be.AbstractBE;

public class EmulatedDB implements IObjectReader, IObjectWriter {
	private static EmulatedDB		instance	= new EmulatedDB();

	private final List<AbstractBE>	values		= new ArrayList<>();


	@Override
	public <C extends AbstractBE> void save(final Class<C> clazz, final C objectToSave) {
		values.add(objectToSave);
	}

	@Override
	public <C extends AbstractBE> void delete(final Class<C> clazz, final C objectToDelete) {
		values.remove(objectToDelete);
	}

	@Override
	public <C extends AbstractBE> C getObjectById(final Class<C> clazz, final Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <C extends AbstractBE> List<C> getObjectByWhereClause(final Class<C> clazz, final String clause) {
		// TODO Auto-generated method stub
		return null;
	}


	public static EmulatedDB getInstance() {
		return instance;
	}
}
