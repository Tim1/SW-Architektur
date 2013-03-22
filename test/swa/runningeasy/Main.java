package swa.runningeasy;

import java.util.List;

import swa.runningeasy.bes.LaeuferBE;
import swa.runningeasy.business.LaeuferBA;

public class Main {
	
	public static void main(String[] args) {
		LaeuferBA ba = new LaeuferBA();
		
		List<LaeuferBE> list = ba.getAllLauefer();
		System.out.println(list);
	}
	
}
