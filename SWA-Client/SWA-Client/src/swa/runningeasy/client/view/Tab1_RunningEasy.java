/**
 * 
 */
package swa.runningeasy.client.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class Tab1_RunningEasy extends JPanel {
	private static final long	serialVersionUID	= 1L;
	private JButton				butConnect;
	private JButton				butDeleteDB;
	private JLabel				picLabel;
	private JTextArea			txtArea;

	public Tab1_RunningEasy() {
		initJPanel();
	}

	private void initJPanel() {

		// initialize components
		butConnect = new JButton("Mit DB verbinden");
		butConnect.setAlignmentX(CENTER_ALIGNMENT);
		butConnect.setMaximumSize(new Dimension(300, 25));
		butDeleteDB = new JButton("Alle Daten löschen");
		butDeleteDB.setAlignmentX(CENTER_ALIGNMENT);
		butDeleteDB.setMaximumSize(new Dimension(300, 25));
		txtArea = new JTextArea("RunningeEasy\nSoftware-Architektur\nVersion 1.0\nTim Schmiedl, Milos Babic");

		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("img\\bg.png"));
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
		c.gridwidth = 2;
		c.gridy = 1;
		this.add(txtArea, c);


		this.setVisible(true);
	}
}
