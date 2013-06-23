/**
 * 
 */
package swa.runningeasy.client.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class MainFrame extends JFrame {
	private static final long	serialVersionUID	= 1L;
	private JTabbedPane			jtabbedPane;

	public MainFrame() {
		super("RunningEasy");
	}

	public void initUI() {
		jtabbedPane = new JTabbedPane();
		getContentPane().add(jtabbedPane);

		// adds Tabs
		jtabbedPane.addTab("RunningEasy", new Tab1_RunningEasy());
		jtabbedPane.addTab("Erstellen", new Tab2_Create());
		jtabbedPane.addTab("Anzeigen", new Tab3_Display());


		// display the Frame
		this.setPreferredSize(new Dimension(800, 600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
}
