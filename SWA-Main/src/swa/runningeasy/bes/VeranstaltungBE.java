/**
 * 
 */
package swa.runningeasy.bes;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import swa.runningeasy.dtos.VeranstaltungDTO;

/**
 * @author Whopper
 * 
 */
@Entity
public class VeranstaltungBE implements ConvertibleToDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long	id;
	@Temporal(TemporalType.DATE)
	private Date	datum;
	@Temporal(TemporalType.DATE)
	private Date	anmeldeschluss;

	private String	name;
	private int		startgebuehr;


	public VeranstaltungBE() {

	}

	public VeranstaltungBE(final VeranstaltungDTO veranstaltungDTO) {
		name = veranstaltungDTO.getName();
		datum = veranstaltungDTO.getDatum();
		anmeldeschluss = veranstaltungDTO.getAnmeldeschluss();
		startgebuehr = veranstaltungDTO.getStartgebuehr();
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(final Date datum) {
		this.datum = datum;
	}

	public Date getAnmeldeschluss() {
		return anmeldeschluss;
	}

	public void setAnmeldeschluss(final Date anmeldeschluss) {
		this.anmeldeschluss = anmeldeschluss;
	}

	public int getStartgebuehr() {
		return startgebuehr;
	}

	public void setStartgebuehr(final int startgebuehr) {
		this.startgebuehr = startgebuehr;
	}

	public VeranstaltungDTO asDTO() {
		VeranstaltungDTO veranstaltungDTO = new VeranstaltungDTO(name, datum, anmeldeschluss, startgebuehr);
		return veranstaltungDTO;
	}

	@Override
	public String toString() {
		return "VeranstaltungBE [id=" + id + ", name=" + name + ", datum=" + datum + ", anmeldeschluss="
				+ anmeldeschluss + ", startgebuehr=" + startgebuehr + "]";
	}


}
