/**
 * 
 */
package swa.runningeasy.bes;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import swa.runningeasy.dtos.AnmeldungDTO;

/**
 * @author Whopper
 * 
 */
@Entity
public class AnmeldungBE implements ConvertibleToDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long			id;
	@ManyToOne(cascade = CascadeType.ALL)
	private LaeuferBE		laeufer;
	@ManyToOne(cascade = CascadeType.ALL)
	private VeranstaltungBE	veranstaltung;
	@ManyToOne(cascade = CascadeType.ALL)
	private VereinBE		verein;

	private int				startnummer;
	private boolean			bezahlt;

	public AnmeldungBE() {
	}


	public AnmeldungBE(final AnmeldungDTO anmeldungDTO) {

		bezahlt = anmeldungDTO.isBezahlt();
		startnummer = anmeldungDTO.getStartnummer();
		laeufer = new LaeuferBE(anmeldungDTO.getLaeufer());
		veranstaltung = new VeranstaltungBE();
		veranstaltung.setName(anmeldungDTO.getVeranstaltung());
		verein = new VereinBE();
		verein.setName(anmeldungDTO.getVerein());
		// TODO: there must be a better solution, or?
		// laeufer.getVerein().setName(anmeldungDTO.getVerein());
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

	public int getStartnummer() {
		return startnummer;
	}

	public void setStartnummer(final int startnummer) {
		this.startnummer = startnummer;
	}

	@Override
	public AnmeldungDTO asDTO() {

		AnmeldungDTO anmeldungDTO = new AnmeldungDTO(laeufer.asDTO(), bezahlt, veranstaltung.getName(),
				verein.getName(), startnummer);
		return anmeldungDTO;
	}

	@Override
	public String toString() {
		return "AnmeldungBE [id=" + id + ", laeufer=" + laeufer + ", veranstaltung=" + veranstaltung + ", startnummer="
				+ startnummer + ", bezahlt=" + bezahlt + "]";
	}

	public final Long getId() {
		return id;
	}


	public final VereinBE getVerein() {
		return verein;
	}


	public final void setVerein(final VereinBE verein) {
		this.verein = verein;
	}
}
