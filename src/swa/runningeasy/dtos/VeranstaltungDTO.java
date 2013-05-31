package swa.runningeasy.dtos;

/**
 * @author Bernhard Hollunder
 * 
 * Represents a running event.
 * 
 */

import java.util.Date;

import org.apache.log4j.Logger;

import swa.runningeasy.db.ObjectWriter;

public class VeranstaltungDTO {
	private String			name;
	private Date			datum;
	private Date			anmeldeschluss;
	private int				startgebuehr;
	private static Logger	logger	= Logger.getLogger(VeranstaltungDTO.class);

	public String getName() {
		logger.trace("call getName()-method");
		return name;
	}

	public void setName(final String name) {
		logger.trace("call setName()-method");
		this.name = name;
	}

	public Date getDatum() {
		logger.trace("call getDatum()-method");
		return datum;
	}

	public void setDatum(final Date datum) {
		logger.trace("call setDatum()-method");
		this.datum = datum;
	}

	public Date getAnmeldeschluss() {
		logger.trace("call getAnmeldeschluss()-method");
		return anmeldeschluss;
	}

	public void setAnmeldeschluss(final Date anmeldeschluss) {
		logger.trace("call setAnmeldeschluss()-method");
		this.anmeldeschluss = anmeldeschluss;
	}

	public int getStartgebuehr() {
		logger.trace("call getStartgebuehr()-method");
		return startgebuehr;
	}

	public void setStartgebuehr(final int startgebuehr) {
		logger.trace("call setStartgebuehr()-method");
		this.startgebuehr = startgebuehr;
	}


	public VeranstaltungDTO(final String name, final Date datum, final Date anmeldeschluss, final int startgebuehr) {
		super();
		logger.trace("call VeranstaltungDTO()-method");
		this.name = name;
		this.datum = datum;
		this.anmeldeschluss = anmeldeschluss;
		this.startgebuehr = startgebuehr;
	}

	@Override
	public String toString() {
		logger.trace("call toString()-method");
		return "VeranstaltungDTO [name=" + name + ", datum=" + datum + ", anmeldeschluss=" + anmeldeschluss
				+ ", startgebuehr=" + startgebuehr + "]";
	}

}
