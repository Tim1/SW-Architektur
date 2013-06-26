/**
 * 
 */
package swa.runningeasy.client.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import swa.runningeasy.client.connector.RunningServicesFactoryForClient;
import swa.runningeasy.services.RunningServicesExtended;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class Tab1Controller implements ActionListener {
	private static final Logger				logger	= Logger.getLogger(Tab1Controller.class);

	private final JButton					connectButton;
	private final JButton					deleteDataButton;
	private final JButton					fillDataButton;
	private final RunningServicesExtended	runningServices;
	private final JEditorPane				paneDBStatus;

	public Tab1Controller(final JButton connectButton, final JButton deleteDataButton, final JButton fillDataButton,
			final JEditorPane paneDBStatus) {
		this.connectButton = connectButton;
		this.deleteDataButton = deleteDataButton;
		this.fillDataButton = fillDataButton;
		this.paneDBStatus = paneDBStatus;

		deleteDataButton.setEnabled(false);
		fillDataButton.setEnabled(false);
		runningServices = RunningServicesFactoryForClient.getInstance();
	}

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
		int result = JOptionPane.showConfirmDialog(null, "Wollen Sie die Datenbank mit Testdaten füllen?",
				"Testdaten füllen", JOptionPane.CANCEL_OPTION);

		if (result == JOptionPane.OK_OPTION) {
			logger.info("filling Testdata");
			runningServices.fillTestData();
		}
	}

	private void deleteData() {
		int result = JOptionPane.showConfirmDialog(null,
				"Achtung Sie sind im Begriff alle vorhanden Daten zu löschen.\n" + "Fortfahren?", "Alle Daten löschen",
				JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

		if (result == JOptionPane.OK_OPTION) {
			logger.info("Deleting all data");
			runningServices.deleteAllData();
		}
	}

	private void connect() {
		runningServices.init();

		paneDBStatus.setBackground(Color.green);
		paneDBStatus.setText("<center><b>verbunden</b><center>");
		connectButton.setEnabled(false);
		deleteDataButton.setEnabled(true);
		fillDataButton.setEnabled(true);
	}

}
