package swa.runningeasy.dtos;

/**
 * @author Bernhard Hollunder
 * 
 * Represents the finishing time for a given runner at a particular running event.
 * 
 */

import java.util.Date;

public class LaufzeitDTO {
	private int		Startnummer;
	private Date	laufzeit;
	private String	veranstaltung;

	public LaufzeitDTO(final int startnummer, final Date laufzeit, final String veranstaltung) {
		super();
		Startnummer = startnummer;
		this.laufzeit = laufzeit;
		this.veranstaltung = veranstaltung;
	}

	public int getStartnummer() {
		return Startnummer;
	}

	public void setStartnummer(final int startnummer) {
		Startnummer = startnummer;
	}

	public Date getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(final Date laufzeit) {
		this.laufzeit = laufzeit;
	}

	public String getVeranstaltung() {
		return veranstaltung;
	}

	public void setVeranstaltung(final String veranstaltung) {
		this.veranstaltung = veranstaltung;
	}


	@Override
	public String toString() {
		return "LaufzeitDTO [Startnummer=" + Startnummer + ", laufzeit=" + laufzeit + ", veranstaltung="
				+ veranstaltung + "]";
	}


}
