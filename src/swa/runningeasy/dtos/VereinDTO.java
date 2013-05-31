package swa.runningeasy.dtos;

import org.apache.log4j.Logger;

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
		logger.trace("call VereinDTO()-method");
		this.name = name;
	}

	public String getName() {
		logger.trace("call getName()-method");
		return name;
	}

	public void setName(final String name) {
		logger.trace("call setName()-method");
		this.name = name;
	}

	public String getStrasse() {
		logger.trace("call getStrasse()-method");
		return strasse;
	}

	public void setStrasse(final String strasse) {
		logger.trace("call setStrasse()-method");
		this.strasse = strasse;
	}

	public String getPlz() {
		logger.trace("call getPlz()-method");
		return plz;
	}

	public void setPlz(final String plz) {
		logger.trace("call setPlz()-method");
		this.plz = plz;
	}

	public String getOrt() {
		logger.trace("call getOrt()-method");
		return ort;
	}

	public void setOrt(final String ort) {
		logger.trace("call setOrt()-method");
		this.ort = ort;
	}

	public String getLand() {
		logger.trace("call getLand()-method");
		return land;
	}

	public void setLand(final String land) {
		logger.trace("call setLand()-method");
		this.land = land;
	}

	@Override
	public String toString() {
		logger.trace("call toString()-method");
		return name;
	}
}
