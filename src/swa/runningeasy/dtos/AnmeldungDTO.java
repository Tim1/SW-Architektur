package swa.runningeasy.dtos;

/**
 * @author Bernhard Hollunder
 * 
 *         Represents a registration for a running event.
 */


public class AnmeldungDTO {

	public AnmeldungDTO(LaeuferDTO laeufer, boolean bezahlt, String veranstaltung, String verein, int startnummer) {
		super();
		this.laeufer = laeufer;
		this.bezahlt = bezahlt;
		this.veranstaltung = veranstaltung;
		this.verein = verein;
		this.startnummer = startnummer;
	}

	public LaeuferDTO getLaeufer() {
		return laeufer;
	}

	public void setLaeufer(LaeuferDTO laeufer) {
		this.laeufer = laeufer;
	}

	public boolean isBezahlt() {
		return bezahlt;
	}

	public void setBezahlt(boolean bezahlt) {
		this.bezahlt = bezahlt;
	}

	public String getVeranstaltung() {
		return veranstaltung;
	}

	public void setVeranstaltung(String veranstaltung) {
		this.veranstaltung = veranstaltung;
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

	@Override
	public String toString() {
		return "AnmeldungDTO [laeufer=" + laeufer + ", bezahlt=" + bezahlt + ", veranstaltung=" + veranstaltung
				+ ", verein=" + verein + ", startnummer=" + startnummer + "]";
	}

	private LaeuferDTO	laeufer;
	private boolean		bezahlt;
	private String		veranstaltung;
	private String		verein;
	private int			startnummer;

}
