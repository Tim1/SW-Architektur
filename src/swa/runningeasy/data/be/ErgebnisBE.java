/**
 * 
 */
package swa.runningeasy.data.be;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class ErgebnisBE extends AbstractBE {

	private String			endzeit			= null;
	private String			status			= null;
	private List<String>	zwischenzeiten	= null;
	private List<String>	bruttoZeiten	= null;
	private List<String>	nettoZeiten		= null;


	/**
	 * @return the endzeit
	 */
	public String getEndzeit() {
		return endzeit;
	}

	/**
	 * @param endzeit
	 *            the endzeit to set
	 */
	public void setEndzeit(final String endzeit) {
		this.endzeit = endzeit;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(final String status) {
		this.status = status;
	}

	/**
	 * @return the zwischenzeiten
	 */
	public List<String> getZwischenzeiten() {
		return zwischenzeiten;
	}

	/**
	 * @param zwischenzeiten
	 *            the zwischenzeiten to set
	 */
	public void setZwischenzeiten(final ArrayList<String> zwischenzeiten) {
		this.zwischenzeiten = zwischenzeiten;
	}

	/**
	 * @param zwischenzeit
	 *            the zwischenzeit to add
	 */
	public void addZwischenzeit(final String zwischenzeit) {
		zwischenzeiten.add(zwischenzeit);
	}

	/**
	 * @return the bruttoZeiten
	 */
	public List<String> getBruttoZeiten() {
		return bruttoZeiten;
	}

	/**
	 * @param bruttoZeiten
	 *            the bruttoZeiten to set
	 */
	public void setBruttoZeiten(final ArrayList<String> bruttoZeiten) {
		this.bruttoZeiten = bruttoZeiten;
	}

	/**
	 * @param bruttoZeit
	 *            the bruttoZeit to add
	 */
	public void addBruttoZeiten(final String bruttoZeit) {
		bruttoZeiten.add(bruttoZeit);
	}

	/**
	 * @return the nettoZeiten
	 */
	public List<String> getNettoZeiten() {
		return nettoZeiten;
	}

	/**
	 * @param nettoZeiten
	 *            the nettoZeiten to set
	 */
	public void setNettoZeiten(final ArrayList<String> nettoZeiten) {
		this.nettoZeiten = nettoZeiten;
	}

	/**
	 * @param nettoZeit
	 *            the nettoZeit to add
	 */
	public void addNettoZeiten(final String nettoZeit) {
		nettoZeiten.add(nettoZeit);
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see swa.runningeasy.data.be.ISerializable#toSerializable()
	 */
	@Override
	public byte[] toSerializable() {
		// TODO Auto-generated method stub
		return null;
	}
}
