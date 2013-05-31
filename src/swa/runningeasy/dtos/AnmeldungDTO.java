package swa.runningeasy.dtos;

import org.apache.log4j.Logger;

import swa.runningeasy.db.ObjectWriter;

/**
 * @author Bernhard Hollunder
 * 
 *         Represents a registration for a running event.
 */


public class AnmeldungDTO {
	private LaeuferDTO		laeufer;
	private boolean			bezahlt;
	private String			veranstaltung;
	private String			verein;
	private int				startnummer;
	private static Logger	logger	= Logger.getLogger(ObjectWriter.class);

	public AnmeldungDTO(final LaeuferDTO laeufer, final boolean bezahlt, final String veranstaltung,
			final String verein, final int startnummer) {
		super();
		logger.trace("call getObjectById()-method");
		this.laeufer = laeufer;
		this.bezahlt = bezahlt;
		this.veranstaltung = veranstaltung;
		this.verein = verein;
		this.startnummer = startnummer;
	}

	public LaeuferDTO getLaeufer() {
		logger.trace("call getLaeufer()-method");
		return laeufer;
	}

	public void setLaeufer(final LaeuferDTO laeufer) {
		logger.trace("call setLaeufer()-method");
		this.laeufer = laeufer;
	}

	public boolean isBezahlt() {
		logger.trace("call isBezahlt()-method");
		return bezahlt;
	}

	public void setBezahlt(final boolean bezahlt) {
		logger.trace("call setBezahlt()-method");
		this.bezahlt = bezahlt;
	}

	public String getVeranstaltung() {
		logger.trace("call getVeranstaltung()-method");
		return veranstaltung;
	}

	public void setVeranstaltung(final String veranstaltung) {
		logger.trace("call setVeranstaltung()-method");
		this.veranstaltung = veranstaltung;
	}

	public String getVerein() {
		logger.trace("call getVerein()-method");
		return verein;
	}

	public void setVerein(final String verein) {
		logger.trace("call setVerein()-method");
		this.verein = verein;
	}

	public int getStartnummer() {
		logger.trace("call getStartnummer()-method");
		return startnummer;
	}

	public void setStartnummer(final int startnummer) {
		logger.trace("call setStartnummer()-method");
		this.startnummer = startnummer;
	}

	@Override
	public String toString() {
		logger.trace("call toString()-method");
		return "AnmeldungDTO [laeufer=" + laeufer + ", bezahlt=" + bezahlt + ", veranstaltung=" + veranstaltung
				+ ", verein=" + verein + ", startnummer=" + startnummer + "]";
	}


}
