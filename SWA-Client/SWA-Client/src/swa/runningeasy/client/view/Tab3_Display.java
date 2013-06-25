/**
 * 
 */
package swa.runningeasy.client.view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class Tab3_Display extends JPanel {
	private static final long	serialVersionUID	= 1L;
	private Button				buttonLoad;
	private JTextField			txtFieldDTO;
	private JList				listDTOs;


	public Tab3_Display() {
		initJPanel();
	}

	private void initJPanel() {
		// initialize leafs
		buttonLoad = new Button("Laden");
		txtFieldDTO = new JTextField();
		txtFieldDTO.setPreferredSize(new Dimension(15, 40));
		listDTOs = (new JList<>(new String[] { "Veranstaltung", "Verein", "Anmeldung", "Läufer", "Laufzeit" }));
		listDTOs.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(final ListSelectionEvent arg0) {
				if (!arg0.getValueIsAdjusting()) {

					switch (listDTOs.getSelectedValue().toString()) {
					case "Läufer":
					case "Verein":
						txtFieldDTO.setVisible(false);
						break;
					case "Veranstaltung":
					case "Anmeldung":
					case "Laufzeit":
						txtFieldDTO.setVisible(true);
						txtFieldDTO.setText("Pls entry " + listDTOs.getSelectedValue().toString());
					default:
						break;
					}

				}
			}
		});

		// setlayout of Tab3_Display JPanel
		this.setLayout(new BorderLayout(5, 5));


		// create selection JPanel
		JPanel panelSelection = new JPanel();
		panelSelection.setLayout(new BoxLayout(panelSelection, BoxLayout.Y_AXIS));
		panelSelection.add(listDTOs);
		panelSelection.add(txtFieldDTO);
		panelSelection.add(buttonLoad);

		this.add(panelSelection, BorderLayout.WEST);


		// create table jscrollpane
		String[] columnNames = { "First Name", "Last Name", "Sport", "# of Years", "Vegetarian" };
		Object[][] data = { { "Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false) },
				{ "John", "Doe", "Rowing", new Integer(3), new Boolean(true) },
				{ "Sue", "Black", "Knitting", new Integer(2), new Boolean(false) },
				{ "Jane", "White", "Speed reading", new Integer(20), new Boolean(true) },
				{ "Joe", "Brown", "Pool", new Integer(10), new Boolean(false) },
				{ "Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false) },
				{ "John", "Doe", "Rowing", new Integer(3), new Boolean(true) },
				{ "Sue", "Black", "Knitting", new Integer(2), new Boolean(false) },
				{ "Jane", "White", "Speed reading", new Integer(20), new Boolean(true) },
				{ "Joe", "Brown", "Pool", new Integer(10), new Boolean(false) } };

		JTable tableEntries = new JTable(data, columnNames);
		JScrollPane scrollPaneTable = new JScrollPane(tableEntries);
		tableEntries.setFillsViewportHeight(true);
		scrollPaneTable.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneTable.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		this.add(scrollPaneTable, BorderLayout.CENTER);


		this.setVisible(true);
	}


}
