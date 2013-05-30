package swa.runningeasy.util;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import runningeasy.bom.entities.RunningServicesFactory;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class DummyUtils {
	private static Logger	logger	= Logger.getLogger(DummyUtils.class);

	DummyUtils() {
		logger.info("Meine Info-Meldung aus DummyUtils.");
		logger.error("Meine Error-Meldung aus DummyUtils.");
	}

	public static void main(String[] args) {
		PropertyConfigurator.configureAndWatch("log4j.properties", 10 * 1000);
		RunningServicesFactory.getInstance();
	}
}
