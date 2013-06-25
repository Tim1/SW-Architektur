/**
 * 
 */
package swa.runningeasy.client;

import swa.runningeasy.client.connector.RunningServicesFactory;
import swa.runningeasy.client.view.MainFrame;
import swa.runningeasy.services.RunningServices;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class Main {
	public static void main(final String[] args) {
		MainFrame mainFrame = new MainFrame();
		mainFrame.initUI();

		// Just checking if it works (it does!)
		RunningServices runningServices = RunningServicesFactory.getInstance();
		runningServices.init();
	}
}
