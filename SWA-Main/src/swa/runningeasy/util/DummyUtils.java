package swa.runningeasy.util;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import runningeasy.bom.entities.RunningServicesFactory;
import swa.runningeasy.init.BAFactory;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class DummyUtils {
	private static Logger	logger	= Logger.getLogger(DummyUtils.class);

	DummyUtils() {
		BAFactory.init();
		logger.info("Meine Info-Meldung aus DummyUtils.");
		logger.error("Meine Error-Meldung aus DummyUtils.");
	}

	public static void main(final String[] args) {
		PropertyConfigurator.configureAndWatch("log4j.properties", 10 * 1000);
		new DummyUtils();
		RunningServicesFactory.getInstance();
	}
}
