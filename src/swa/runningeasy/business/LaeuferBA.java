package swa.runningeasy.business;

import java.util.List;

import swa.runningeasy.bes.LaeuferBE;
import swa.runningeasy.util.ObjectManager;

public class LaeuferBA {
	private ObjectManager	om	= new ObjectManager();

	public List<LaeuferBE> getAllLauefer() {
		return om.getObjectByWhereClause(LaeuferBE.class, ObjectManager.CLAUSE_ALL);
	}
}
