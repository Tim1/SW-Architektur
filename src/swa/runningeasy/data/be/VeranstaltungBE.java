package swa.runningeasy.data.be;

import java.math.BigDecimal;

/**
 * 
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class VeranstaltungBE extends AbstractBE {

	private String		name			= null;
	private float		distanz			= 0;
	private BigDecimal	startgebuehr	= null;
	private String		termin			= null;
	private String		anmeldeschluss	= null;


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}


	/**
	 * @return the distanz
	 */
	public float getDistanz() {
		return distanz;
	}


	/**
	 * @param distanz
	 *            the distanz to set
	 */
	public void setDistanz(final float distanz) {
		this.distanz = distanz;
	}


	/**
	 * @return the startgebuehr
	 */
	public BigDecimal getStartgebuehr() {
		return startgebuehr;
	}


	/**
	 * @param startgebuehr
	 *            the startgebuehr to set
	 */
	public void setStartgebuehr(final BigDecimal startgebuehr) {
		this.startgebuehr = startgebuehr;
	}


	/**
	 * @return the termin
	 */
	public String getTermin() {
		return termin;
	}


	/**
	 * @param termin
	 *            the termin to set
	 */
	public void setTermin(final String termin) {
		this.termin = termin;
	}


	/**
	 * @return the anmeldeschluss
	 */
	public String getAnmeldeschluss() {
		return anmeldeschluss;
	}


	/**
	 * @param anmeldeschluss
	 *            the anmeldeschluss to set
	 */
	public void setAnmeldeschluss(final String anmeldeschluss) {
		this.anmeldeschluss = anmeldeschluss;
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
