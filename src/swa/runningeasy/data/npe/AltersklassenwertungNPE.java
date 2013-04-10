/**
 * 
 */
package swa.runningeasy.data.npe;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class AltersklassenwertungNPE extends ErgebnislisteNPE {

	private String	alter	= null;

	/**
	 * @return the alter
	 */
	public synchronized String getAlter() {
		return alter;
	}

	/**
	 * @param alter
	 *            the alter to set
	 */
	public synchronized void setAlter(final String alter) {
		this.alter = alter;
	}

}
