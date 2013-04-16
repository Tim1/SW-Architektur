package swa.runningeasy.data.be;

/**
 * 
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class LaeuferBE extends AbstractBE {

	private int			jahrgang;
	private String		telefonNummer;
	private String		name		= null;
	private String		adresse		= null;
	private String		geschlecht	= null;
	private String		email		= null;
	private VereinBE	verein		= null;


	/**
	 * @return the jahrgang
	 */
	public int getJahrgang() {
		return jahrgang;
	}


	/**
	 * @param jahrgang
	 *            the jahrgang to set
	 */
	public void setJahrgang(final int jahrgang) {
		this.jahrgang = jahrgang;
	}


	/**
	 * @return the telefonNummer
	 */
	public String getTelefonNummer() {
		return telefonNummer;
	}


	/**
	 * @param telefonNummer
	 *            the telefonNummer to set
	 */
	public void setTelefonNummer(final String telefonNummer) {
		this.telefonNummer = telefonNummer;
	}


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
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}


	/**
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(final String adresse) {
		this.adresse = adresse;
	}


	/**
	 * @return the geschlecht
	 */
	public String getGeschlecht() {
		return geschlecht;
	}


	/**
	 * @param geschlecht
	 *            the geschlecht to set
	 */
	public void setGeschlecht(final String geschlecht) {
		this.geschlecht = geschlecht;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(final String email) {
		this.email = email;
	}


	/**
	 * @return the verein
	 */
	public VereinBE getVerein() {
		return verein;
	}


	/**
	 * @param verein
	 *            the verein to set
	 */
	public void setVerein(final VereinBE verein) {
		this.verein = verein;
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
