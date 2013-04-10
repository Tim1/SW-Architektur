/**
 * 
 */
package swa.runningeasy.data.npe;

import java.util.ArrayList;

import swa.runningeasy.data.be.LaeuferBE;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public abstract class ErgebnislisteNPE extends AbstractNPE {

	private ArrayList<LaeuferBE>	lauefer	= null;

	/**
	 * @return the lauefer
	 */
	public synchronized ArrayList<LaeuferBE> getLauefer() {
		return lauefer;
	}

	/**
	 * @param lauefer
	 *            the lauefer to set
	 */
	public synchronized void setLauefer(final ArrayList<LaeuferBE> lauefer) {
		this.lauefer = lauefer;
	}
}
