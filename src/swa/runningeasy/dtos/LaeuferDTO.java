package swa.runningeasy.dtos;

/**
 * @author Bernhard Hollunder
 * 
 *         Represents a human being participating at a running event.
 */


public class LaeuferDTO {
	private String	name;
	private String	vorname;
	private int		geburtsjahr;
	private char	geschlecht;
	private String	email;
	private String	sms;
	private String	strasse;
	private String	plz;
	private String	ort;
	private String	land;

	public LaeuferDTO(final String name, final String vorname, final int geburtsjahr, final char geschlecht,
			final String email, final String sms, final String strasse, final String plz, final String ort,
			final String land) {
		super();
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
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(final String vorname) {
		this.vorname = vorname;
	}

	public int getGeburtsjahr() {
		return geburtsjahr;
	}

	public void setGeburtsjahr(final int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}

	public char getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(final char geschlecht) {
		this.geschlecht = geschlecht;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getSms() {
		return sms;
	}

	public void setSms(final String sms) {
		this.sms = sms;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(final String strasse) {
		this.strasse = strasse;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(final String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(final String ort) {
		this.ort = ort;
	}

	public String getLand() {
		return land;
	}

	public void setLand(final String land) {
		this.land = land;
	}
}
