package swa.runningeasy.data.be;

/**
 * 
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class VeranstaltungBE extends AbstractBE {

	private String	name			= null;
	private int		distanz			= 0;
	private float	startgebuehr	= 0;
	private String	termin			= null;
	private String	anmeldeschluss	= null;


	/**
	 * @return the name
	 */
	public synchronized String getName() {
		return name;
	}


	/**
	 * @param name
	 *            the name to set
	 */
	public synchronized void setName(final String name) {
		this.name = name;
	}


	/**
	 * @return the distanz
	 */
	public synchronized int getDistanz() {
		return distanz;
	}


	/**
	 * @param distanz
	 *            the distanz to set
	 */
	public synchronized void setDistanz(final int distanz) {
		this.distanz = distanz;
	}


	/**
	 * @return the startgebuehr
	 */
	public synchronized float getStartgebuehr() {
		return startgebuehr;
	}


	/**
	 * @param startgebuehr
	 *            the startgebuehr to set
	 */
	public synchronized void setStartgebuehr(final float startgebuehr) {
		this.startgebuehr = startgebuehr;
	}


	/**
	 * @return the termin
	 */
	public synchronized String getTermin() {
		return termin;
	}


	/**
	 * @param termin
	 *            the termin to set
	 */
	public synchronized void setTermin(final String termin) {
		this.termin = termin;
	}


	/**
	 * @return the anmeldeschluss
	 */
	public synchronized String getAnmeldeschluss() {
		return anmeldeschluss;
	}


	/**
	 * @param anmeldeschluss
	 *            the anmeldeschluss to set
	 */
	public synchronized void setAnmeldeschluss(final String anmeldeschluss) {
		this.anmeldeschluss = anmeldeschluss;
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
