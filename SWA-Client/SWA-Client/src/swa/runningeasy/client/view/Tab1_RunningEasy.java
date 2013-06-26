/**
 * 
 */
package swa.runningeasy.client.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.apache.log4j.chainsaw.Main;

import swa.runningeasy.client.controller.Tab1Controller;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class Tab1_RunningEasy extends JPanel {
	private static final long	serialVersionUID	= 1L;
	private JButton				butConnect;
	private JButton				butDeleteDB;
	private JButton				butfillDataDB;
	private JLabel				picLabel;
	private JEditorPane			txtArea;
	private JEditorPane			paneDBStatus;

	public Tab1_RunningEasy() {
		initJPanel();
	}

	private void initJPanel() {

		// initialize components
		butConnect = new JButton("Mit DB verbinden");
		// butConnect.setAlignmentX(CENTER_ALIGNMENT);
		butConnect.setMaximumSize(new Dimension(300, 25));
		butDeleteDB = new JButton("Alle Daten löschen");
		// butDeleteDB.setAlignmentX(CENTER_ALIGNMENT);
		butDeleteDB.setMaximumSize(new Dimension(300, 25));
		butfillDataDB = new JButton("mit Testdaten befüllen");
		// butfillDataDB.setAlignmentX(CENTER_ALIGNMENT);
		butfillDataDB.setMaximumSize(new Dimension(300, 25));
		txtArea = new JEditorPane("text/html", "<b>RunningEasy</b> v1.0<br>" + "Software-Architektur<br><br>"
				+ "Tim Schmiedl, Milos Babic");
		txtArea.setBorder(BorderFactory.createLineBorder(Color.gray));

		paneDBStatus = new JEditorPane("text/html", "<center><b>nicht verbunden</b></center>");
		paneDBStatus.setBackground(Color.red);
		paneDBStatus.setFocusable(false);
		paneDBStatus.setEditable(false);
		paneDBStatus.setMaximumSize(new Dimension(300, 25));


		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(Main.class.getResource("/bg.png"));
			picLabel = new JLabel(new ImageIcon(myPicture));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// create panel for buttons
		JPanel buttonPanel = new JPanel();
		BoxLayout boxLayoutbuttonPanel = new BoxLayout(buttonPanel, BoxLayout.Y_AXIS);
		buttonPanel.setLayout(boxLayoutbuttonPanel);
		buttonPanel.add(Box.createVerticalGlue());
		buttonPanel.add(Box.createVerticalGlue());
		buttonPanel.add(butConnect);
		buttonPanel.add(butfillDataDB);
		buttonPanel.add(butDeleteDB);

		// set layout for Tab1
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		// add components
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		this.add(buttonPanel, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		this.add(picLabel, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridwidth = 1;
		c.gridy = 1;
		this.add(paneDBStatus, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridwidth = 2;
		c.gridy = 2;
		this.add(txtArea, c);


		Tab1Controller controller = new Tab1Controller(butConnect, butDeleteDB, butfillDataDB, paneDBStatus);
		butConnect.addActionListener(controller);
		butfillDataDB.addActionListener(controller);
		butDeleteDB.addActionListener(controller);

		this.setVisible(true);
	}
}
