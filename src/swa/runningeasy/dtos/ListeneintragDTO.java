package swa.runningeasy.dtos;

/**
 * @author Bernhard Hollunder
 * 
 * Represents an entry in a starter and result list.
 * 
 */


import java.util.Date;

public class ListeneintragDTO {
	private String	name;
	private String	vorname;
	private int		geburtsjahr;
	private char	geschlecht;
	private String	verein;
	private int		startnummer;
	private int		platzierung;
	private Date	laufzeit;

	public ListeneintragDTO(final String name, final String vorname, final int geburtsjahr, final char geschlecht,
			final String verein, final int startnummer, final int platzierung, final Date laufzeit) {
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

	public String getVerein() {
		return verein;
	}

	public void setVerein(final String verein) {
		this.verein = verein;
	}

	public int getStartnummer() {
		return startnummer;
	}

	public void setStartnummer(final int startnummer) {
		this.startnummer = startnummer;
	}

	public int getPlatzierung() {
		return platzierung;
	}

	public void setPlatzierung(final int platzierung) {
		this.platzierung = platzierung;
	}

	public Date getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(final Date laufzeit) {
		this.laufzeit = laufzeit;
	}

	@Override
	public String toString() {
		return "Listeneintrag [name=" + name + ", vorname=" + vorname + ", geburtsjahr=" + geburtsjahr
				+ ", geschlecht=" + geschlecht + ", verein=" + verein + ", startnummer=" + startnummer
				+ ", platzierung=" + platzierung + ", laufzeit=" + laufzeit + "]";
	}


}
