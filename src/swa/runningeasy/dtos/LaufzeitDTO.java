package swa.runningeasy.dtos;

/**
 * @author Bernhard Hollunder
 * 
 * Represents the finishing time for a given runner at a particular running event.
 * 
 */

import java.util.Date;

import org.apache.log4j.Logger;

import swa.runningeasy.db.ObjectWriter;

public class LaufzeitDTO {
	private int				Startnummer;
	private Date			laufzeit;
	private String			veranstaltung;
	private static Logger	logger	= Logger.getLogger(LaufzeitDTO.class);

	public LaufzeitDTO(final int startnummer, final Date laufzeit, final String veranstaltung) {
		super();
		logger.debug("call LaufzeitDTO()-method");
		Startnummer = startnummer;
		this.laufzeit = laufzeit;
		this.veranstaltung = veranstaltung;
	}

	public int getStartnummer() {
		logger.debug("call getStartnummer()-method");
		return Startnummer;
	}

	public void setStartnummer(final int startnummer) {
		logger.debug("call setStartnummer()-method");
		Startnummer = startnummer;
	}

	public Date getLaufzeit() {
		logger.debug("call getLaufzeit()-method");
		return laufzeit;
	}

	public void setLaufzeit(final Date laufzeit) {
		logger.debug("call setLaufzeit()-method");
		this.laufzeit = laufzeit;
	}

	public String getVeranstaltung() {
		logger.debug("call getVeranstaltung()-method");
		return veranstaltung;
	}

	public void setVeranstaltung(final String veranstaltung) {
		logger.debug("call setVeranstaltung()-method");
		this.veranstaltung = veranstaltung;
	}


	@Override
	public String toString() {
		logger.debug("call toString()-method");
		return "LaufzeitDTO [Startnummer=" + Startnummer + ", laufzeit=" + laufzeit + ", veranstaltung="
				+ veranstaltung + "]";
	}
}
