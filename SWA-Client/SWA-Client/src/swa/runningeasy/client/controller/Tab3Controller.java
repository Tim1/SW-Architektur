/**
 * 
 */
package swa.runningeasy.client.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.apache.log4j.Logger;

import swa.runningeasy.client.connector.RunningServicesFactory;
import swa.runningeasy.dtos.AnmeldungDTO;
import swa.runningeasy.dtos.LaeuferDTO;
import swa.runningeasy.dtos.LaufzeitDTO;
import swa.runningeasy.dtos.ListeneintragDTO;
import swa.runningeasy.dtos.VeranstaltungDTO;
import swa.runningeasy.dtos.VereinDTO;
import swa.runningeasy.services.Auswertung;
import swa.runningeasy.services.RunningServices;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class Tab3Controller implements ActionListener {
	private static final Logger		logger	= Logger.getLogger(Tab3Controller.class);
	private final JList<String>		list;
	private final JButton			button;
	private final JTable			table;
	private final RunningServices	runningServices;
	private final JTextField		textfield;

	private Vector<String>			columnAnmeldung;
	private Vector<String>			columnLaeufer;
	private Vector<String>			columnLaufzeit;
	private Vector<String>			columnAuswertung;
	private Vector<String>			columnVeranstaltung;
	private Vector<String>			columnVerein;

	public Tab3Controller(final JList<String> list, final JTextField textfield, final JButton button, final JTable table) {
		this.list = list;
		this.textfield = textfield;
		this.button = button;
		this.table = table;

		runningServices = RunningServicesFactory.getInstance();
		initColumnNames();
	}

	private void initColumnNames() {
		columnAnmeldung = new Vector<>();
		columnAnmeldung.add("Läufer");
		columnAnmeldung.add("bezahlt");
		columnAnmeldung.add("Veranstaltung");
		columnAnmeldung.add("Verein");
		columnAnmeldung.add("Startnummer");

		columnLaeufer = new Vector<>();
		columnLaeufer.add("Name");
		columnLaeufer.add("Vorname");
		columnLaeufer.add("Geburtsjahr");
		columnLaeufer.add("Geschlecht");
		columnLaeufer.add("eMail");
		columnLaeufer.add("SMS");
		columnLaeufer.add("Straße");
		columnLaeufer.add("PLZ");
		columnLaeufer.add("Ort");
		columnLaeufer.add("Land");

		columnLaufzeit = new Vector<>();
		columnLaufzeit.add("Startnummer");
		columnLaufzeit.add("Laufzeit");
		columnLaufzeit.add("Veranstaltung");

		columnAuswertung = new Vector<>();
		columnAuswertung.add("Name");
		columnAuswertung.add("Vorname");
		columnAuswertung.add("Geburtsjahr");
		columnAuswertung.add("Geschlecht");
		columnAuswertung.add("Verein");
		columnAuswertung.add("Laufzeit");
		columnAuswertung.add("Startnummer");
		columnAuswertung.add("Platzierung");

		columnVeranstaltung = new Vector<>();
		columnVeranstaltung.add("Name");
		columnVeranstaltung.add("Datum");
		columnVeranstaltung.add("Anmeldeschluss");
		columnVeranstaltung.add("Startgebühr");

		columnVerein = new Vector<>();
		columnVerein.add("Name");
		columnVerein.add("Straße");
		columnVerein.add("PLZ");
		columnVerein.add("Ort");
		columnVerein.add("Land");
	}

	@Override
	@SuppressWarnings("rawtypes")
	public void actionPerformed(final ActionEvent ae) {
		logger.trace("Button pressed, loading Data for Table");
		button.setEnabled(false);

		// needed for the additional Argument in AnmeldungDTO and LaufzeitDTO
		String selectedValue = list.getSelectedValue();

		// Reads the DTOs from Database
		// TODO check for asynchron implementation
		List dtos = null;
		Vector<String> column = null;
		switch (selectedValue) {
		case "Veranstaltung":
			dtos = runningServices.getVeranstaltungen();
			column = columnVeranstaltung;
			break;
		case "Verein":
			dtos = runningServices.getVereine();
			column = columnVerein;
			break;
		case "Anmeldung":
			dtos = runningServices.getAnmeldungen(textfield.getText());
			column = columnAnmeldung;
			break;
		case "Läufer":
			dtos = runningServices.getLaeufer();
			column = columnLaeufer;
			break;
		case "Laufzeit":
			dtos = runningServices.getLaufzeiten(textfield.getText());
			column = columnLaufzeit;
			break;
		case "Auswertung":
			dtos = runningServices.getAuswertung(Auswertung.STARTLISTE, textfield.getText());
			column = columnAuswertung;
			break;
		}

		logger.debug("filling Table with Data (" + selectedValue + ")");
		table.setModel(getTableModell(dtos, column));
		button.setEnabled(true);
	}


	/**
	 * generates the content for the table
	 * 
	 * @param dtoList
	 *            - List of DTOs
	 * @param column
	 * @return a Tablelist for the table to set
	 */
	@SuppressWarnings("rawtypes")
	private TableModel getTableModell(final List dtoList, final Vector<String> column) {

		// data of the table
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		for (Object dto : dtoList) {
			Vector<Object> row = new Vector<Object>();

			if (dto instanceof VeranstaltungDTO)
				addVeranstalungRow(row, (VeranstaltungDTO) dto);
			if (dto instanceof VereinDTO)
				addVereinRow(row, (VereinDTO) dto);
			if (dto instanceof AnmeldungDTO)
				addAnmeldungRow(row, (AnmeldungDTO) dto);
			if (dto instanceof LaeuferDTO)
				addLaeuferRow(row, (LaeuferDTO) dto);
			if (dto instanceof LaufzeitDTO)
				addLaufzeitRow(row, (LaufzeitDTO) dto);
			if (dto instanceof ListeneintragDTO)
				addListeneintragRow(row, (ListeneintragDTO) dto);


			data.add(row);
		}

		return new DefaultTableModel(data, column);
	}

	private void addListeneintragRow(final Vector<Object> row, final ListeneintragDTO dto) {
		row.add(dto.getName());
		row.add(dto.getVorname());
		row.add(dto.getGeburtsjahr());
		row.add(dto.getGeschlecht());
		row.add(dto.getVerein());
		row.add(dto.getLaufzeit());
		row.add(dto.getStartnummer());
		row.add(dto.getPlatzierung());
	}

	private void addLaufzeitRow(final Vector<Object> row, final LaufzeitDTO dto) {
		row.add(dto.getStartnummer());
		row.add(dto.getLaufzeit());
		row.add(dto.getVeranstaltung());
	}

	private void addLaeuferRow(final Vector<Object> row, final LaeuferDTO dto) {
		row.add(dto.getName());
		row.add(dto.getVorname());
		row.add(dto.getGeburtsjahr());
		row.add(dto.getGeschlecht());
		row.add(dto.getEmail());
		row.add(dto.getSms());
		row.add(dto.getStrasse());
		row.add(dto.getPlz());
		row.add(dto.getOrt());
		row.add(dto.getLand());
	}

	private void addAnmeldungRow(final Vector<Object> row, final AnmeldungDTO dto) {
		LaeuferDTO l = dto.getLaeufer();
		String laeuferStr = l.getVorname() + " " + l.getName() + " (" + l.getGeburtsjahr() + ")";

		row.add(laeuferStr);
		row.add(dto.isBezahlt());
		row.add(dto.getVeranstaltung());
		row.add(dto.getVerein());
		row.add(dto.getStartnummer());
	}

	private void addVereinRow(final Vector<Object> row, final VereinDTO dto) {
		row.add(dto.getName());
		row.add(dto.getStrasse());
		row.add(dto.getPlz());
		row.add(dto.getOrt());
		row.add(dto.getLand());
	}

	private void addVeranstalungRow(final Vector<Object> row, final VeranstaltungDTO dto) {
		row.add(dto.getName());
		row.add(dto.getStartgebuehr());
		row.add(dto.getDatum());
		row.add(dto.getAnmeldeschluss());
	}
}
