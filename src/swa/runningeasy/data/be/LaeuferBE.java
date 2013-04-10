package swa.runningeasy.data.be;

/**
 * 
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class LaeuferBE extends AbstractBE {

	private int			jahrgang;
	private int			telefonNummer;
	private String		name		= null;
	private String		adresse		= null;
	private String		geschlecht	= null;
	private String		email		= null;
	private VereinBE	verein		= null;


	/**
	 * @return the jahrgang
	 */
	public synchronized int getJahrgang() {
		return jahrgang;
	}


	/**
	 * @param jahrgang
	 *            the jahrgang to set
	 */
	public synchronized void setJahrgang(final int jahrgang) {
		this.jahrgang = jahrgang;
	}


	/**
	 * @return the telefonNummer
	 */
	public synchronized int getTelefonNummer() {
		return telefonNummer;
	}


	/**
	 * @param telefonNummer
	 *            the telefonNummer to set
	 */
	public synchronized void setTelefonNummer(final int telefonNummer) {
		this.telefonNummer = telefonNummer;
	}


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
	 * @return the adresse
	 */
	public synchronized String getAdresse() {
		return adresse;
	}


	/**
	 * @param adresse
	 *            the adresse to set
	 */
	public synchronized void setAdresse(final String adresse) {
		this.adresse = adresse;
	}


	/**
	 * @return the geschlecht
	 */
	public synchronized String getGeschlecht() {
		return geschlecht;
	}


	/**
	 * @param geschlecht
	 *            the geschlecht to set
	 */
	public synchronized void setGeschlecht(final String geschlecht) {
		this.geschlecht = geschlecht;
	}


	/**
	 * @return the email
	 */
	public synchronized String getEmail() {
		return email;
	}


	/**
	 * @param email
	 *            the email to set
	 */
	public synchronized void setEmail(final String email) {
		this.email = email;
	}


	/**
	 * @return the verein
	 */
	public synchronized VereinBE getVerein() {
		return verein;
	}


	/**
	 * @param verein
	 *            the verein to set
	 */
	public synchronized void setVerein(final VereinBE verein) {
		this.verein = verein;
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
