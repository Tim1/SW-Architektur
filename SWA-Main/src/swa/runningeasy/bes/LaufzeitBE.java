/**
 * 
 */
package swa.runningeasy.bes;

import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import swa.runningeasy.dtos.LaufzeitDTO;

/**
 * @author Whopper
 * 
 */
public class LaufzeitBE {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long			id;

	@Temporal(TemporalType.DATE)
	private Date			laufzeit;

	@OneToOne(fetch = FetchType.LAZY)
	private VeranstaltungBE	veranstaltung;

	private int				startnummer;

	public int getStartnummer() {
		return startnummer;
	}

	public void setStartnummer(final int startnummer) {
		this.startnummer = startnummer;
	}

	public LaufzeitBE() {

	}

	public LaufzeitBE(final LaufzeitDTO laufzeitDTO) {
		laufzeit = laufzeitDTO.getLaufzeit();
		veranstaltung = new VeranstaltungBE();
		veranstaltung.setName(laufzeitDTO.getVeranstaltung());
		startnummer = laufzeitDTO.getStartnummer();
	}

	public Date getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(final Date laufzeit) {
		this.laufzeit = laufzeit;
	}

	public VeranstaltungBE getVeranstaltung() {
		return veranstaltung;
	}

	public void setVeranstaltung(final VeranstaltungBE veranstaltung) {
		this.veranstaltung = veranstaltung;
	}

	public LaufzeitDTO asDTO() {
		LaufzeitDTO laufzeitDTO = new LaufzeitDTO(startnummer, laufzeit, veranstaltung.getName());
		return laufzeitDTO;
	}

	@Override
	public String toString() {
		return "LaufzeitBE [id=" + id + ", laufzeit=" + laufzeit + ", veranstaltung=" + veranstaltung + "]";
	}

}
