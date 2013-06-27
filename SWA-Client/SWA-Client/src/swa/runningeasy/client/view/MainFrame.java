/**
 * 
 */
package swa.runningeasy.client.view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class MainFrame extends JFrame {
	private static final long		serialVersionUID	= 1L;
	private static final MainFrame	instance			= new MainFrame();
	private JTabbedPane				jtabbedPane;

	private MainFrame() {
		super("RunningEasy");
	}

	public void initUI() {
		// setResizable(false);

		jtabbedPane = new JTabbedPane();
		getContentPane().add(jtabbedPane);

		// adds Tabs
		jtabbedPane.addTab("RunningEasy", new Tab1_RunningEasy());
		jtabbedPane.addTab("Erstellen", new Tab2_Create());
		jtabbedPane.addTab("Anzeigen", new Tab3_Display());


		// display the Frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	public static MainFrame getInstance() {
		return instance;
	}
}
