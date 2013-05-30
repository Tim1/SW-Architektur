package swa.runningeasy.dtos;

/**
 * @author Bernhard Hollunder
 * 
 * Represents an entry in a starter and result list.
 * 
 */


import java.util.Date;

import org.apache.log4j.Logger;

import swa.runningeasy.db.ObjectWriter;

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
		logger.debug("call LaufzeitDTO()-method");
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
		logger.debug("call getName()-method");
		return name;
	}

	public void setName(final String name) {
		logger.debug("call setName()-method");
		this.name = name;
	}

	public String getVorname() {
		logger.debug("call getVorname()-method");
		return vorname;
	}

	public void setVorname(final String vorname) {
		logger.debug("call setVorname()-method");
		this.vorname = vorname;
	}

	public int getGeburtsjahr() {
		logger.debug("call getGeburtsjahr()-method");
		return geburtsjahr;
	}

	public void setGeburtsjahr(final int geburtsjahr) {
		logger.debug("call setGeburtsjahr()-method");
		this.geburtsjahr = geburtsjahr;
	}

	public char getGeschlecht() {
		logger.debug("call getGeschlecht()-method");
		return geschlecht;
	}

	public void setGeschlecht(final char geschlecht) {
		logger.debug("call setGeschlecht()-method");
		this.geschlecht = geschlecht;
	}

	public String getVerein() {
		logger.debug("call getVerein()-method");
		return verein;
	}

	public void setVerein(final String verein) {
		logger.debug("call setVerein()-method");
		this.verein = verein;
	}

	public int getStartnummer() {
		logger.debug("call getStartnummer()-method");
		return startnummer;
	}

	public void setStartnummer(final int startnummer) {
		logger.debug("call setStartnummer()-method");
		this.startnummer = startnummer;
	}

	public int getPlatzierung() {
		logger.debug("call getPlatzierung()-method");
		return platzierung;
	}

	public void setPlatzierung(final int platzierung) {
		logger.debug("call setPlatzierung()-method");
		this.platzierung = platzierung;
	}

	public Date getLaufzeit() {
		logger.debug("call getLaufzeit()-method");
		return laufzeit;
	}

	public void setLaufzeit(final Date laufzeit) {
		logger.debug("call setLaufzeit()-method");
		this.laufzeit = laufzeit;
	}

	@Override
	public String toString() {
		logger.debug("call toString()-method");
		return "Listeneintrag [name=" + name + ", vorname=" + vorname + ", geburtsjahr=" + geburtsjahr
				+ ", geschlecht=" + geschlecht + ", verein=" + verein + ", startnummer=" + startnummer
				+ ", platzierung=" + platzierung + ", laufzeit=" + laufzeit + "]";
	}


}
