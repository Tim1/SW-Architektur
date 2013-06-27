/**
 * 
 */
package swa.runningeasy.client;

import swa.runningeasy.client.view.MainFrame;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class Main {
	public static void main(final String[] args) {
		MainFrame mainFrame = MainFrame.getInstance();
		mainFrame.initUI();
	}
}
