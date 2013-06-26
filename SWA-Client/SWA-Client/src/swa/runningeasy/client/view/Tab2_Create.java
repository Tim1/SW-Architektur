/**
 * 
 */
package swa.runningeasy.client.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import swa.runningeasy.client.controller.Tab2Controller;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class Tab2_Create extends JPanel {
	private static final long	serialVersionUID	= 1L;

	private JList<String>		list;
	private List<JLabel>		labelList;
	private List<JTextField>	txtFieldList;
	private JButton				butCancel;
	private JButton				butCreate;

	public Tab2_Create() {
		initJPanel();
	}

	private void initJPanel() {

		// initialize components
		list = new JList<>(new String[] { "Veranstaltung", "Verein", "Anmeldung", "Läufer", "Laufzeit" });

		labelList = new ArrayList<JLabel>(10);
		for (int i = 1; i <= 10; i++) {
			JLabel label = new JLabel("Attribut " + i);
			labelList.add(label);
		}
		txtFieldList = new ArrayList<>(10);
		for (int i = 1; i <= 10; i++) {
			JTextField txtField = new JTextField("");
			txtFieldList.add(txtField);
		}
		butCancel = new JButton("Cancel");
		butCancel.setAlignmentX(CENTER_ALIGNMENT);
		butCancel.setMaximumSize(new Dimension(100, 25));
		butCreate = new JButton("Absenden");
		butCreate.setAlignmentX(CENTER_ALIGNMENT);
		butCreate.setMaximumSize(new Dimension(100, 25));

		// create option panel
		JPanel panelOption = new JPanel();
		BorderLayout borderLayoutpanelOption = new BorderLayout();
		panelOption.setLayout(borderLayoutpanelOption);
		panelOption.add(list, BorderLayout.NORTH);
		panelOption.add(butCreate, BorderLayout.CENTER);
		panelOption.add(butCancel, BorderLayout.SOUTH);


		// create panel for label
		JPanel panelAttributes = new JPanel();
		panelAttributes.setLayout(new GridLayout(10, 2));
		for (int i = 0; i < 10; i++) {
			panelAttributes.add(labelList.get(i));
			panelAttributes.add(txtFieldList.get(i));
		}

		// set layout for Tab1
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		// add components
		c.fill = GridBagConstraints.FIRST_LINE_START;
		c.gridx = 0;
		c.gridy = 0;
		this.add(panelOption, c);

		c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 1;
		c.gridy = 0;
		JSeparator seperator = new JSeparator(SwingConstants.VERTICAL);
		this.add(seperator, c);


		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = java.awt.GridBagConstraints.RELATIVE;
		c.gridheight = java.awt.GridBagConstraints.RELATIVE;
		c.gridx = 2;
		c.gridy = 0;
		c.weightx = 1.0;
		c.weighty = 1.0;

		this.add(panelAttributes, c);


		Tab2Controller controller = new Tab2Controller(labelList, txtFieldList, list, butCreate, butCancel);
		list.addListSelectionListener(controller);
		butCancel.addActionListener(controller);
		butCreate.addActionListener(controller);

		this.setVisible(true);
	}
}
