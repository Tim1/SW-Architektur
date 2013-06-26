/**
 * 
 */
package swa.runningeasy.client.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class Tab1Controller implements ActionListener {
	private JButton	connectButton;
	private JButton	deleteDataButton;
	private JButton	fillDataButton;

	@Override
	public void actionPerformed(final ActionEvent ae) {
		if (ae.getSource() == connectButton)
			connect();
		else if (ae.getSource() == deleteDataButton)
			deleteData();
		else if (ae.getSource() == fillDataButton)
			fillData();
	}

	private void fillData() {
		// TODO Auto-generated method stub

	}

	private void deleteData() {
		// TODO Auto-generated method stub

	}

	private void connect() {
		// TODO Auto-generated method stub

	}

}
