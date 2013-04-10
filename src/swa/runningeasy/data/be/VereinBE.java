package swa.runningeasy.data.be;

/**
 * 
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class VereinBE extends AbstractBE {

	private String	name	= null;
	private String	ort		= null;
	private String	website	= null;

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
	 * @return the ort
	 */
	public synchronized String getOrt() {
		return ort;
	}


	/**
	 * @param ort
	 *            the ort to set
	 */
	public synchronized void setOrt(final String ort) {
		this.ort = ort;
	}


	/**
	 * @return the website
	 */
	public synchronized String getWebsite() {
		return website;
	}


	/**
	 * @param website
	 *            the website to set
	 */
	public synchronized void setWebsite(final String website) {
		this.website = website;
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
