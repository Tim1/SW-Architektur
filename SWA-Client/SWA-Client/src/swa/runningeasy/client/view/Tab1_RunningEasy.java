/**
 * 
 */
package swa.runningeasy.client.view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class Tab1_RunningEasy extends JPanel {
	private static final long	serialVersionUID	= 1L;

	public Tab1_RunningEasy() {
		initJPanel();
	}

	private void initJPanel() {
		// layougt of Tab1_RunningEasy JPanel
		// this.setLayout(new GridLayout(0, 2, 5, 10));
		this.setLayout(new BorderLayout(10, 10));

		// create Property panel
		JPanel panelProperties = new JPanel(new GridLayout(0, 1));
		Button buttonConnectDB = new Button("Verbinde mit DB");
		Button buttonClearDB = new Button("Alle Daten Löschen");
		panelProperties.add(buttonConnectDB);
		panelProperties.add(buttonClearDB);
		this.add(panelProperties, BorderLayout.WEST);

		// create picture label
		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("img\\bg.png"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			this.add(picLabel, BorderLayout.EAST);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// create Descritpino-JPanel
		JPanel panelInfo = new JPanel((new GridLayout(0, 1)));
		panelInfo.add(new Label("App-Info"));
		panelInfo.add(new JTextArea("Lorem ipsum dolor sit amet...."));
		this.add(panelInfo, BorderLayout.SOUTH);

		this.setVisible(true);
	}


}
