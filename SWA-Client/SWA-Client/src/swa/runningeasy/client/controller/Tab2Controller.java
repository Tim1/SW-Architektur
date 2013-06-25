/**
 * 
 */
package swa.runningeasy.client.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.apache.log4j.Logger;

import swa.runningeasy.client.connector.RunningServicesFactory;
import swa.runningeasy.client.util.DTOAttributes;
import swa.runningeasy.dtos.AnmeldungDTO;
import swa.runningeasy.dtos.LaeuferDTO;
import swa.runningeasy.dtos.LaufzeitDTO;
import swa.runningeasy.dtos.VeranstaltungDTO;
import swa.runningeasy.dtos.VereinDTO;
import swa.runningeasy.services.RunningServices;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class Tab2Controller implements ActionListener, ListSelectionListener {
	private static final Logger		logger	= Logger.getLogger(Tab2Controller.class);

	private final List<JLabel>		labelList;
	private final List<JTextField>	textfieldList;
	private final JList<String>		list;
	private final JButton			sendButton;
	private final JButton			cancelButton;
	private final RunningServices	runningService;

	public Tab2Controller(final List<JLabel> labelList, final List<JTextField> textfieldList, final JList<String> list,
			final JButton sendButton, final JButton cancelButton) {
		super();
		this.labelList = labelList;
		this.textfieldList = textfieldList;
		this.list = list;
		this.sendButton = sendButton;
		this.cancelButton = cancelButton;
		this.runningService = RunningServicesFactory.getInstance();
	}


	/**
	 * Updates the Form for the selected Item.<br>
	 * shows/hides textfield and labels to fit to the selected DTO-Type
	 * 
	 */
	private void updateForm() {
		String selected = list.getSelectedValue();
		logger.debug("updating the Form for value: " + selected);

		Vector<String> attributes = null;
		switch (selected) {
		case "Veranstaltung":
			attributes = DTOAttributes.veranstaltung;
			break;
		case "Verein":
			attributes = DTOAttributes.verein;
			break;
		case "Anmeldung":
			attributes = DTOAttributes.anmeldung;
			break;
		case "Läufer":
			attributes = DTOAttributes.laeufer;
			break;
		case "Laufzeit":
			attributes = DTOAttributes.laufzeit;
			break;
		}

		// Display the right text for label an disable not necessary elements
		int textfieldCount = attributes.size();
		for (int i = 0; i < textfieldList.size(); i++) {
			textfieldList.get(i).setText("");// clear the old text

			if (i < textfieldCount) {
				textfieldList.get(i).setVisible(true);
				labelList.get(i).setVisible(true);
				labelList.get(i).setText(attributes.get(i));// set the Label
															// text
			} else {
				textfieldList.get(i).setVisible(false);
				labelList.get(i).setVisible(false);
			}
		}
	}

	/**
	 * Sends the form with the listed values
	 */
	private void sendForm() {
		String selected = list.getSelectedValue();
		logger.debug("parsing values to submit form for value: " + selected);

		List<String> textValues = new ArrayList<>();
		for (JTextField field : textfieldList) {
			textValues.add(field.getText());
		}

		// Try parsing the values and creating the corresponding DTOs
		try {
			DateFormat df = DateFormat.getInstance();
			Object dto = null;
			switch (selected) {
			case "Veranstaltung":
				VeranstaltungDTO veranstaltungDTO = new VeranstaltungDTO(textValues.get(0),
						df.parse(textValues.get(1)), df.parse(textValues.get(2)), Integer.parseInt(textValues.get(3)));
				runningService.erzeugeVeranstaltung(veranstaltungDTO);
				dto = veranstaltungDTO;
				break;
			case "Verein":
				VereinDTO vereinDTO = new VereinDTO(textValues.get(0));
				vereinDTO.setStrasse(textValues.get(1));
				vereinDTO.setPlz(textValues.get(2));
				vereinDTO.setOrt(textValues.get(3));
				vereinDTO.setLand(textValues.get(4));
				runningService.erzeugeVerein(vereinDTO);
				dto = vereinDTO;
				break;
			case "Anmeldung":
				AnmeldungDTO anmeldungDTO = new AnmeldungDTO(null, Boolean.parseBoolean(textValues.get(1)),
						textValues.get(2), textValues.get(3), Integer.parseInt(textValues.get(4)));
				runningService.erzeugeAnmeldung(anmeldungDTO);
				dto = anmeldungDTO;
				break;
			case "Läufer":
				LaeuferDTO laeuferDTO = new LaeuferDTO(textValues.get(0), textValues.get(1),
						Integer.parseInt(textValues.get(2)), textValues.get(3).charAt(0), textValues.get(4),
						textValues.get(5), textValues.get(6), textValues.get(7), textValues.get(8), textValues.get(9));
				runningService.erzeugeLaeufer(laeuferDTO);
				dto = laeuferDTO;
				break;
			case "Laufzeit":
				LaufzeitDTO laufzeitDTO = new LaufzeitDTO(Integer.parseInt(textValues.get(0)), df.parse(textValues
						.get(1)), textValues.get(2));
				runningService.erzeugeLaufzeit(laufzeitDTO);
				dto = laufzeitDTO;
				break;
			}
			logger.info("Succesfully created Object in DB: " + dto);
			// TODO: alert Window for User (succes)

			// clears the Form
			updateForm();
		} catch (NumberFormatException | ParseException e) {
			// TODO: alert Window for User (warning wrong values)
			logger.info("Exception parsing Values: " + e);
		}
	}

	@Override
	public void valueChanged(final ListSelectionEvent e) {
		logger.debug("List item changed");
		updateForm();
	}


	@Override
	public void actionPerformed(final ActionEvent e) {
		// TODO: maybe an alert Window for the user
		if (e.getSource() == sendButton)
			sendForm();
		else if (e.getSource() == cancelButton)
			updateForm();


	}
}
