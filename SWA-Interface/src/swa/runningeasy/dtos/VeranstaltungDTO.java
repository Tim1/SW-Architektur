package swa.runningeasy.dtos;

import java.util.Date;

/**
 * @author Bernhard Hollunder
 * 
 *         Represents a running event.
 * 
 */
public class VeranstaltungDTO {
	private String	name;
	private Date	datum;
	private Date	anmeldeschluss;
	private int		startgebuehr;

	public VeranstaltungDTO(final String name, final Date datum, final Date anmeldeschluss, final int startgebuehr) {
		super();
		this.name = name;
		this.datum = datum;
		this.anmeldeschluss = anmeldeschluss;
		this.startgebuehr = startgebuehr;
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

	@Override
	public String toString() {
		return "VeranstaltungDTO [name=" + name + ", datum=" + datum + ", anmeldeschluss=" + anmeldeschluss
				+ ", startgebuehr=" + startgebuehr + "]";
	}
}
