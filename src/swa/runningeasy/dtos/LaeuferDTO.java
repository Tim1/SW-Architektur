package swa.runningeasy.dtos;

import org.apache.log4j.Logger;

import swa.runningeasy.db.ObjectWriter;

/**
 * @author Bernhard Hollunder
 * 
 *         Represents a human being participating at a running event.
 */


public class LaeuferDTO {
	private String			name;
	private String			vorname;
	private int				geburtsjahr;
	private char			geschlecht;
	private String			email;
	private String			sms;
	private String			strasse;
	private String			plz;
	private String			ort;
	private String			land;
	private static Logger	logger	= Logger.getLogger(LaeuferDTO.class);

	public LaeuferDTO(final String name, final String vorname, final int geburtsjahr, final char geschlecht,
			final String email, final String sms, final String strasse, final String plz, final String ort,
			final String land) {
		super();
		logger.debug("call getObjectById()-method");
		this.name = name;
		this.vorname = vorname;
		this.geburtsjahr = geburtsjahr;
		this.geschlecht = geschlecht;
		this.email = email;
		this.sms = sms;
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
		this.land = land;
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
		logger.debug("call getObjectById()-method");
		this.geschlecht = geschlecht;
	}

	public String getEmail() {
		logger.debug("call getEmail()-method");
		return email;
	}

	public void setEmail(final String email) {
		logger.debug("call setEmail()-method");
		this.email = email;
	}

	public String getSms() {
		logger.debug("call getSms()-method");
		return sms;
	}

	public void setSms(final String sms) {
		logger.debug("call setSms()-method");
		this.sms = sms;
	}

	public String getStrasse() {
		logger.debug("call getStrasse()-method");
		return strasse;
	}

	public void setStrasse(final String strasse) {
		logger.debug("call setStrasse()-method");
		this.strasse = strasse;
	}

	public String getPlz() {
		logger.debug("call getPlz()-method");
		return plz;
	}

	public void setPlz(final String plz) {
		logger.debug("call setPlz()-method");
		this.plz = plz;
	}

	public String getOrt() {
		logger.debug("call getOrt()-method");
		return ort;
	}

	public void setOrt(final String ort) {
		logger.debug("call setOrt()-method");
		this.ort = ort;
	}

	public String getLand() {
		logger.debug("call getLand()-method");
		return land;
	}

	public void setLand(final String land) {
		logger.debug("call setLand()-method");
		this.land = land;
	}
}
