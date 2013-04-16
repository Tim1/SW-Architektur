/**
 * 
 */
package swa.runningeasy.data.be;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class TeilnahmeBE extends AbstractBE {

	private String		anmeldestatus	= null;
	private String		startnummer		= null;
	private LaeuferBE	lauefer			= null;
	private VereinBE	veranstaltung	= null;
	private ErgebnisBE	ergebnis		= null;


	/**
	 * @return the anmeldestatus
	 */
	public String getAnmeldestatus() {
		return anmeldestatus;
	}


	/**
	 * @param anmeldestatus
	 *            the anmeldestatus to set
	 */
	public void setAnmeldestatus(final String anmeldestatus) {
		this.anmeldestatus = anmeldestatus;
	}


	/**
	 * @return the startnummer
	 */
	public String getStartnummer() {
		return startnummer;
	}


	/**
	 * @param startnummer
	 *            the startnummer to set
	 */
	public void setStartnummer(final String startnummer) {
		this.startnummer = startnummer;
	}


	/**
	 * @return the lauefer
	 */
	public LaeuferBE getLauefer() {
		return lauefer;
	}


	/**
	 * @param lauefer
	 *            the lauefer to set
	 */
	public void setLauefer(final LaeuferBE lauefer) {
		this.lauefer = lauefer;
	}


	/**
	 * @return the veranstaltung
	 */
	public VereinBE getVeranstaltung() {
		return veranstaltung;
	}


	/**
	 * @param veranstaltung
	 *            the veranstaltung to set
	 */
	public void setVeranstaltung(final VereinBE veranstaltung) {
		this.veranstaltung = veranstaltung;
	}


	/**
	 * @return the ergebnis
	 */
	public ErgebnisBE getErgebnis() {
		return ergebnis;
	}


	/**
	 * @param ergebnis
	 *            the ergebnis to set
	 */
	public void setErgebnis(final ErgebnisBE ergebnis) {
		this.ergebnis = ergebnis;
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
