package swa.runningeasy.dtos;

import org.apache.log4j.Logger;

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
		logger.trace("call getObjectById()-method");
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
		logger.trace("call getObjectById()-method");
		this.geschlecht = geschlecht;
	}

	public String getEmail() {
		logger.trace("call getEmail()-method");
		return email;
	}

	public void setEmail(final String email) {
		logger.trace("call setEmail()-method");
		this.email = email;
	}

	public String getSms() {
		logger.trace("call getSms()-method");
		return sms;
	}

	public void setSms(final String sms) {
		logger.trace("call setSms()-method");
		this.sms = sms;
	}

	public String getStrasse() {
		logger.trace("call getStrasse()-method");
		return strasse;
	}

	public void setStrasse(final String strasse) {
		logger.trace("call setStrasse()-method");
		this.strasse = strasse;
	}

	public String getPlz() {
		logger.trace("call getPlz()-method");
		return plz;
	}

	public void setPlz(final String plz) {
		logger.trace("call setPlz()-method");
		this.plz = plz;
	}

	public String getOrt() {
		logger.trace("call getOrt()-method");
		return ort;
	}

	public void setOrt(final String ort) {
		logger.trace("call setOrt()-method");
		this.ort = ort;
	}

	public String getLand() {
		logger.trace("call getLand()-method");
		return land;
	}

	public void setLand(final String land) {
		logger.trace("call setLand()-method");
		this.land = land;
	}
}
