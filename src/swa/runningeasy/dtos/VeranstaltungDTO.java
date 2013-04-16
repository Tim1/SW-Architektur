package swa.runningeasy.dtos;

/**
 * @author Bernhard Hollunder
 * 
 * Represents a running event.
 * 
 */

import java.util.Date;

public class VeranstaltungDTO {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Date getAnmeldeschluss() {
		return anmeldeschluss;
	}

	public void setAnmeldeschluss(Date anmeldeschluss) {
		this.anmeldeschluss = anmeldeschluss;
	}

	public int getStartgebuehr() {
		return startgebuehr;
	}

	public void setStartgebuehr(int startgebuehr) {
		this.startgebuehr = startgebuehr;
	}

	private String	name;
	private Date	datum;
	private Date	anmeldeschluss;
	private int		startgebuehr;


	public VeranstaltungDTO(String name, Date datum, Date anmeldeschluss, int startgebuehr) {
		super();
		this.name = name;
		this.datum = datum;
		this.anmeldeschluss = anmeldeschluss;
		this.startgebuehr = startgebuehr;
	}

	@Override
	public String toString() {
		return "VeranstaltungDTO [name=" + name + ", datum=" + datum + ", anmeldeschluss=" + anmeldeschluss
				+ ", startgebuehr=" + startgebuehr + "]";
	}

}
