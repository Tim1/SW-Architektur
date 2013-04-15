package swa.runningeasy.dtos;

/**
 * @author Bernhard Hollunder
 * 
 * Represents a human being participating at a running event.
 */


public class LaeuferDTO {
		
	public LaeuferDTO(String name, String vorname, int geburtsjahr,
			char geschlecht, String email, String sms, String strasse,
			String plz, String ort, String land) {
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
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public int getGeburtsjahr() {
		return geburtsjahr;
	}
	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}
	public char getGeschlecht() {
		return geschlecht;
	}
	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSms() {
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}

	private String name;
	private String vorname;
	private int geburtsjahr;
	private char geschlecht;
	private String email;
	private String sms;
	private String strasse;
	private String plz;
	private String ort;
	private String land;
	
}
