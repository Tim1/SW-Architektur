/**
 * 
 */
package swa.runningeasy.data.be;

import java.util.ArrayList;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class ErgebnisBE extends AbstractBE {

	private int					endzeit			= 0;
	private String				status			= null;
	private ArrayList<String>	zwischenzeiten	= null;
	private ArrayList<String>	bruttoZeiten	= null;
	private ArrayList<String>	nettoZeiten		= null;


	/**
	 * @return the endzeit
	 */
	public synchronized int getEndzeit() {
		return endzeit;
	}

	/**
	 * @param endzeit
	 *            the endzeit to set
	 */
	public synchronized void setEndzeit(final int endzeit) {
		this.endzeit = endzeit;
	}

	/**
	 * @return the status
	 */
	public synchronized String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public synchronized void setStatus(final String status) {
		this.status = status;
	}

	/**
	 * @return the zwischenzeiten
	 */
	public synchronized ArrayList<String> getZwischenzeiten() {
		return zwischenzeiten;
	}

	/**
	 * @param zwischenzeiten
	 *            the zwischenzeiten to set
	 */
	public synchronized void setZwischenzeiten(final ArrayList<String> zwischenzeiten) {
		this.zwischenzeiten = zwischenzeiten;
	}

	/**
	 * @param zwischenzeit
	 *            the zwischenzeit to add
	 */
	public synchronized void addZwischenzeit(final String zwischenzeit) {
		zwischenzeiten.add(zwischenzeit);
	}

	/**
	 * @return the bruttoZeiten
	 */
	public synchronized ArrayList<String> getBruttoZeiten() {
		return bruttoZeiten;
	}

	/**
	 * @param bruttoZeiten
	 *            the bruttoZeiten to set
	 */
	public synchronized void setBruttoZeiten(final ArrayList<String> bruttoZeiten) {
		this.bruttoZeiten = bruttoZeiten;
	}

	/**
	 * @param bruttoZeit
	 *            the bruttoZeit to add
	 */
	public synchronized void addBruttoZeiten(final String bruttoZeit) {
		bruttoZeiten.add(bruttoZeit);
	}

	/**
	 * @return the nettoZeiten
	 */
	public synchronized ArrayList<String> getNettoZeiten() {
		return nettoZeiten;
	}

	/**
	 * @param nettoZeiten
	 *            the nettoZeiten to set
	 */
	public synchronized void setNettoZeiten(final ArrayList<String> nettoZeiten) {
		this.nettoZeiten = nettoZeiten;
	}

	/**
	 * @param nettoZeit
	 *            the nettoZeit to add
	 */
	public synchronized void addNettoZeiten(final String nettoZeit) {
		nettoZeiten.add(nettoZeit);
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see swa.runningeasy.data.be.ISerializable#toSerializable()
	 */
	@Override
	public synchronized byte[] toSerializable() {
		// TODO Auto-generated method stub
		return null;
	}
}
