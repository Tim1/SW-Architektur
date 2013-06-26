/**
 * 
 */
package swa.runningeasy.client.controller;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class KeyController implements KeyListener, KeyEventDispatcher {
	private static KeyController	instance	= new KeyController();

	@Override
	public void keyPressed(final KeyEvent ke) {
	}

	@Override
	public void keyReleased(final KeyEvent ke) {
		switch (ke.getKeyCode()) {
		case KeyEvent.VK_F5:
			System.out.println("F5");
			break;

		default:
			break;
		}
	}

	@Override
	public void keyTyped(final KeyEvent ke) {
	}


	public static KeyController getInstance() {
		return instance;
	}

	@Override
	public boolean dispatchKeyEvent(final KeyEvent ke) {
		if (ke.getID() == KeyEvent.KEY_RELEASED)
			keyReleased(ke);

		return false;
	}
}
