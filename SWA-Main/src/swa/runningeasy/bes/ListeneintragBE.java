/**
 * 
 */
package swa.runningeasy.bes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import swa.runningeasy.dtos.ListeneintragDTO;

/**
 * @author Whopper
 * 
 */
@Entity
public class ListeneintragBE implements ConvertibleToDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long		id;
	@OneToOne
	private LaeuferBE	laeufer;
	@OneToOne
	private LaufzeitBE	laufzeit;
	@OneToOne
	private VereinBE	verein;

	private int			platzierung;


	public ListeneintragBE() {

	}

	public ListeneintragBE(final ListeneintragDTO listeneintragDTO) {
		laeufer = new LaeuferBE();
		laeufer.setName(listeneintragDTO.getName());
		laeufer.setVorname(listeneintragDTO.getVorname());
		laeufer.setGeburtsjahr(listeneintragDTO.getGeburtsjahr());
		laeufer.setGeschlecht(listeneintragDTO.getGeschlecht());

		laufzeit = new LaufzeitBE();
		laufzeit.setLaufzeit(listeneintragDTO.getLaufzeit());

		verein = new VereinBE();
		verein.setName(listeneintragDTO.getVerein());
	}


	public int getPlatzierung() {
		return platzierung;
	}

	public void setPlatzierung(final int platzierung) {
		this.platzierung = platzierung;
	}

	public LaufzeitBE getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(final LaufzeitBE laufzeit) {
		this.laufzeit = laufzeit;
	}

	public final LaeuferBE getLaeufer() {
		return laeufer;
	}


	public final void setLaeufer(final LaeuferBE laeufer) {
		this.laeufer = laeufer;
	}

	@Override
	public ListeneintragDTO asDTO() {
		ListeneintragDTO listeneintragDTO = new ListeneintragDTO(laeufer.getName(), laeufer.getVorname(),
				laeufer.getGeburtsjahr(), laeufer.getGeschlecht(), verein.getName(), laufzeit.getStartnummer(),
				platzierung, laufzeit.getLaufzeit());
		return listeneintragDTO;
	}

	@Override
	public String toString() {
		return "ListeneintragBE [id=" + id + ", laeufer=" + laeufer + ", platzierung=" + platzierung + ", laufzeit="
				+ laufzeit + "]";
	}

	public final Long getId() {
		return id;
	}
}
