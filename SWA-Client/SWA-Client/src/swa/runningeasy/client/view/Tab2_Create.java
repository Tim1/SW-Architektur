/**
 * 
 */
package swa.runningeasy.client.view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class Tab2_Create extends JPanel {
	private static final long	serialVersionUID	= 1L;

	private JList<String>		list;
	private List<JLabel>		labelList;
	private List<JTextField>	txtFieldList;
	private Button				buttonCancel;
	private Button				buttonCreate;

	public Tab2_Create() {
		initJPanel();
	}

	private void initJPanel() {
		list = new JList<>(new String[] { "Veranstaltung", "Verein", "Anmeldung", "Läufer", "Laufzeit" });

		labelList = new ArrayList<JLabel>(10);
		for (int i = 1; i <= 10; i++) {
			JLabel label = new JLabel("Attribut " + i);
			labelList.add(label);
		}
		txtFieldList = new ArrayList<>(10);
		for (int i = 1; i <= 10; i++) {
			JTextField txtField = new JTextField("entry attribute value");
			txtFieldList.add(txtField);
		}
		buttonCancel = new Button("Cancel");
		buttonCreate = new Button("Absenden");

		// setLayout of Tab2
		this.setLayout(new BorderLayout());


		// create JList-Panel
		JPanel panelJList = new JPanel();
		panelJList.add(list);

		this.add(panelJList, BorderLayout.WEST);


		// create Attribute-Panel
		JPanel panelAttributes = new JPanel();
		panelAttributes.setLayout(new GridLayout(10, 2));
		for (int i = 0; i < 10; i++) {
			panelAttributes.add(labelList.get(i));
			panelAttributes.add(txtFieldList.get(i));
		}


		this.add(panelAttributes, BorderLayout.CENTER);


		// create JPanel for Bottom
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(buttonCancel);
		buttonPanel.add(buttonCreate);
		this.add(buttonPanel, BorderLayout.SOUTH);

		this.setVisible(true);

	}

}
