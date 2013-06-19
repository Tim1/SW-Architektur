/**
 * 
 */
package swa.runningeasy.bes;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import swa.runningeasy.dtos.LaufzeitDTO;

/**
 * @author Whopper
 * 
 */
@Entity
public class LaufzeitBE implements ConvertibleToDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long			id;
	@ManyToOne(cascade = CascadeType.ALL)
	private VeranstaltungBE	veranstaltung;

	@Temporal(TemporalType.DATE)
	private Date			laufzeit;
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

	@Override
	public LaufzeitDTO asDTO() {
		LaufzeitDTO laufzeitDTO = new LaufzeitDTO(startnummer, laufzeit, veranstaltung.getName());
		return laufzeitDTO;
	}

	@Override
	public String toString() {
		return "LaufzeitBE [id=" + id + ", laufzeit=" + laufzeit + ", veranstaltung=" + veranstaltung + "]";
	}

	public final Long getId() {
		return id;
	}
}
