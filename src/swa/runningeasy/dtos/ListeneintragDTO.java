package swa.runningeasy.dtos;

/**
 * @author Bernhard Hollunder
 * 
 * Represents an entry in a starter and result list.
 * 
 */


import java.util.Date;

import org.apache.log4j.Logger;

public class ListeneintragDTO {
	private String			name;
	private String			vorname;
	private int				geburtsjahr;
	private char			geschlecht;
	private String			verein;
	private int				startnummer;
	private int				platzierung;
	private Date			laufzeit;
	private static Logger	logger	= Logger.getLogger(ListeneintragDTO.class);

	public ListeneintragDTO(final String name, final String vorname, final int geburtsjahr, final char geschlecht,
			final String verein, final int startnummer, final int platzierung, final Date laufzeit) {
		super();
		logger.trace("call LaufzeitDTO()-method");
		this.name = name;
		this.vorname = vorname;
		this.geburtsjahr = geburtsjahr;
		this.geschlecht = geschlecht;
		this.verein = verein;
		this.startnummer = startnummer;
		this.platzierung = platzierung;
		this.laufzeit = laufzeit;
	}

	public String getName() {
		logger.trace("call getName()-method");
		return name;
	}

	public void setName(final String name) {
		logger.trace("call setName()-method");
		this.name = name;
	}

	public String getVorname() {
		logger.trace("call getVorname()-method");
		return vorname;
	}

	public void setVorname(final String vorname) {
		logger.trace("call setVorname()-method");
		this.vorname = vorname;
	}

	public int getGeburtsjahr() {
		logger.trace("call getGeburtsjahr()-method");
		return geburtsjahr;
	}

	public void setGeburtsjahr(final int geburtsjahr) {
		logger.trace("call setGeburtsjahr()-method");
		this.geburtsjahr = geburtsjahr;
	}

	public char getGeschlecht() {
		logger.trace("call getGeschlecht()-method");
		return geschlecht;
	}

	public void setGeschlecht(final char geschlecht) {
		logger.trace("call setGeschlecht()-method");
		this.geschlecht = geschlecht;
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

	public int getPlatzierung() {
		logger.trace("call getPlatzierung()-method");
		return platzierung;
	}

	public void setPlatzierung(final int platzierung) {
		logger.trace("call setPlatzierung()-method");
		this.platzierung = platzierung;
	}

	public Date getLaufzeit() {
		logger.trace("call getLaufzeit()-method");
		return laufzeit;
	}

	public void setLaufzeit(final Date laufzeit) {
		logger.trace("call setLaufzeit()-method");
		this.laufzeit = laufzeit;
	}

	@Override
	public String toString() {
		logger.trace("call toString()-method");
		return "Listeneintrag [name=" + name + ", vorname=" + vorname + ", geburtsjahr=" + geburtsjahr
				+ ", geschlecht=" + geschlecht + ", verein=" + verein + ", startnummer=" + startnummer
				+ ", platzierung=" + platzierung + ", laufzeit=" + laufzeit + "]";
	}


}
