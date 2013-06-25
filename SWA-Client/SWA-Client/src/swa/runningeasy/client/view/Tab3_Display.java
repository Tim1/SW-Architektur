/**
 * 
 */
package swa.runningeasy.client.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import swa.runningeasy.client.controller.Tab3Controller;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class Tab3_Display extends JPanel {
	private static final long	serialVersionUID	= 1L;
	private JButton				buttonLoad;
	private JTextField			txtFieldDTO;
	private JList<String>		listDTOs;


	public Tab3_Display() {
		initJPanel();
	}

	private void initJPanel() {
		// initialize leafs
		buttonLoad = new JButton("Laden");
		txtFieldDTO = new JTextField();
		txtFieldDTO.setPreferredSize(new Dimension(15, 40));
		listDTOs = (new JList<>(new String[] { "Veranstaltung", "Verein", "Anmeldung", "Läufer", "Laufzeit",
				"Auswertung" }));
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


		JTable tableEntries = new JTable();
		JScrollPane scrollPaneTable = new JScrollPane(tableEntries);
		tableEntries.setFillsViewportHeight(true);
		scrollPaneTable.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneTable.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		this.add(scrollPaneTable, BorderLayout.CENTER);

		buttonLoad.addActionListener(new Tab3Controller(listDTOs, txtFieldDTO, buttonLoad, tableEntries));
		this.setVisible(true);
	}


}
