/**
 * 
 */
package swa.runningeasy.client.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
	private JButton				butLoad;
	private JTextField			txtFieldDTO;
	private JList<String>		listDTOs;


	public Tab3_Display() {
		initJPanel();
	}

	private void initJPanel() {
		// initialize leafs
		butLoad = new JButton("Laden");
		butLoad.setAlignmentX(CENTER_ALIGNMENT);
		butLoad.setMaximumSize(new Dimension(100, 25));
		txtFieldDTO = new JTextField();
		txtFieldDTO.setPreferredSize(new Dimension(100, 25));
		listDTOs = (new JList<>(new String[] { "Veranstaltung", "Verein", "Anmeldung", "Läufer", "Laufzeit",
				"Auswertung" }));
		listDTOs.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(final ListSelectionEvent arg0) {
				if (!arg0.getValueIsAdjusting()) {

					switch (listDTOs.getSelectedValue().toString()) {
					case "Läufer":
					case "Verein":
						txtFieldDTO.setEditable(false);
						break;
					case "Veranstaltung":
					case "Anmeldung":
					case "Laufzeit":
						txtFieldDTO.setEditable(true);
					default:
						break;
					}

				}
			}
		});


		// create selection JPanel
		JPanel panelSelection = new JPanel();
		panelSelection.setLayout(new BoxLayout(panelSelection, BoxLayout.Y_AXIS));
		panelSelection.add(listDTOs);
		panelSelection.add(txtFieldDTO);
		panelSelection.add(butLoad);


		JTable tableEntries = new JTable();
		JScrollPane scrollPaneTable = new JScrollPane(tableEntries);
		tableEntries.setFillsViewportHeight(true);
		scrollPaneTable.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneTable.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		// setlayout of Tab3_Display JPanel
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		// add components
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		this.add(panelSelection, c);

		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = java.awt.GridBagConstraints.RELATIVE;
		c.gridheight = java.awt.GridBagConstraints.RELATIVE;
		c.gridx = 1;
		c.gridy = 0;
		c.weightx = 1.0;
		c.weighty = 1.0;
		this.add(scrollPaneTable, c);

		butLoad.addActionListener(new Tab3Controller(listDTOs, txtFieldDTO, butLoad, tableEntries));
		this.setVisible(true);
	}

}
