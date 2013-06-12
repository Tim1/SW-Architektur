/**
 * 
 */
package swa.runningeasy.bes;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import swa.runningeasy.dtos.AnmeldungDTO;

/**
 * @author Whopper
 * 
 */
@Entity
public class AnmeldungBE {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long			id;
	@OneToOne(fetch = FetchType.LAZY)
	private LaeuferBE		laeufer;

	@OneToOne(fetch = FetchType.LAZY)
	private VeranstaltungBE	veranstaltung;

	@OneToOne(fetch = FetchType.LAZY)
	private VereinBE		verein;

	private int				startnummer;
	private boolean			bezahlt;

	public AnmeldungBE() {
	}


	public AnmeldungBE(final AnmeldungDTO anmeldungDTO) {

		bezahlt = anmeldungDTO.isBezahlt();
		startnummer = anmeldungDTO.getStartnummer();
		laeufer = new LaeuferBE(anmeldungDTO.getLaeufer());
		verein = new VereinBE();
		verein.setName(anmeldungDTO.getVerein());
		veranstaltung = new VeranstaltungBE();
		veranstaltung.setName(anmeldungDTO.getVeranstaltung());
	}

	public LaeuferBE getLaeufer() {
		return laeufer;
	}

	public void setLaeufer(final LaeuferBE laeufer) {
		this.laeufer = laeufer;
	}

	public boolean isBezahlt() {
		return bezahlt;
	}

	public void setBezahlt(final boolean bezahlt) {
		this.bezahlt = bezahlt;
	}

	public VeranstaltungBE getVeranstaltung() {
		return veranstaltung;
	}

	public void setVeranstaltung(final VeranstaltungBE veranstaltung) {
		this.veranstaltung = veranstaltung;
	}

	public VereinBE getVerein() {
		return verein;
	}

	public void setVerein(final VereinBE verein) {
		this.verein = verein;
	}

	public int getStartnummer() {
		return startnummer;
	}

	public void setStartnummer(final int startnummer) {
		this.startnummer = startnummer;
	}

	public AnmeldungDTO asDTO() {

		AnmeldungDTO anmeldungDTO = new AnmeldungDTO(laeufer.asDTO(), bezahlt, veranstaltung.getName(),
				verein.getName(), startnummer);
		return anmeldungDTO;
	}

	@Override
	public String toString() {
		return "AnmeldungBE [id=" + id + ", laeufer=" + laeufer + ", veranstaltung=" + veranstaltung + ", verein="
				+ verein + ", startnummer=" + startnummer + ", bezahlt=" + bezahlt + "]";
	}

}
