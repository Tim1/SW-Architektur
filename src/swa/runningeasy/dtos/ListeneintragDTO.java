package swa.runningeasy.dtos;

/**
 * @author Bernhard Hollunder
 * 
 * Represents an entry in a starter and result list.
 * 
 */


import java.util.Date;

public class ListeneintragDTO {

	public ListeneintragDTO(String name, String vorname, int geburtsjahr,
			char geschlecht, String verein, int startnummer, int platzierung,
			Date laufzeit) {
		super();
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
	public String getVerein() {
		return verein;
	}
	public void setVerein(String verein) {
		this.verein = verein;
	}
	public int getStartnummer() {
		return startnummer;
	}
	public void setStartnummer(int startnummer) {
		this.startnummer = startnummer;
	}
	public int getPlatzierung() {
		return platzierung;
	}
	public void setPlatzierung(int platzierung) {
		this.platzierung = platzierung;
	}
	public Date getLaufzeit() {
		return laufzeit;
	}
	public void setLaufzeit(Date laufzeit) {
		this.laufzeit = laufzeit;
	}
	
	@Override
	public String toString() {
		return "Listeneintrag [name=" + name + ", vorname=" + vorname
				+ ", geburtsjahr=" + geburtsjahr + ", geschlecht=" + geschlecht
				+ ", verein=" + verein + ", startnummer=" + startnummer
				+ ", platzierung=" + platzierung + ", laufzeit=" + laufzeit
				+ "]";
	}


	private String name;
	private String vorname;
	private int geburtsjahr;
	private char geschlecht;
	private String verein;
	private int startnummer;
	private int platzierung;
	private Date laufzeit;
	
	
}
