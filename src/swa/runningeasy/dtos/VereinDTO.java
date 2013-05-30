package swa.runningeasy.dtos;

import org.apache.log4j.Logger;

import swa.runningeasy.db.ObjectWriter;

/**
 * @author Bernhard Hollunder
 * 
 *         Represents a club a participant is starting for.
 * 
 */

public class VereinDTO {
	private String			name;
	private String			strasse;
	private String			plz;
	private String			ort;
	private String			land;
	private static Logger	logger	= Logger.getLogger(VereinDTO.class);

	public VereinDTO(final String name) {
		logger.debug("call VereinDTO()-method");
		this.name = name;
	}

	public String getName() {
		logger.debug("call getName()-method");
		return name;
	}

	public void setName(final String name) {
		logger.debug("call setName()-method");
		this.name = name;
	}

	public String getStrasse() {
		logger.debug("call getStrasse()-method");
		return strasse;
	}

	public void setStrasse(final String strasse) {
		logger.debug("call setStrasse()-method");
		this.strasse = strasse;
	}

	public String getPlz() {
		logger.debug("call getPlz()-method");
		return plz;
	}

	public void setPlz(final String plz) {
		logger.debug("call setPlz()-method");
		this.plz = plz;
	}

	public String getOrt() {
		logger.debug("call getOrt()-method");
		return ort;
	}

	public void setOrt(final String ort) {
		logger.debug("call setOrt()-method");
		this.ort = ort;
	}

	public String getLand() {
		logger.debug("call getLand()-method");
		return land;
	}

	public void setLand(final String land) {
		logger.debug("call setLand()-method");
		this.land = land;
	}

	@Override
	public String toString() {
		logger.debug("call toString()-method");
		return name;
	}
}
