package swa.runningeasy.dtos;


/**
 * @author Bernhard Hollunder
 * 
 *         Represents a club a participant is starting for.
 * 
 */

public class VereinDTO {
	private String	name;
	private String	strasse;
	private String	plz;
	private String	ort;
	private String	land;

	public VereinDTO(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(final String strasse) {
		this.strasse = strasse;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(final String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(final String ort) {
		this.ort = ort;
	}

	public String getLand() {
		return land;
	}

	public void setLand(final String land) {
		this.land = land;
	}

	@Override
	public String toString() {
		return "VereinDTO [name=" + name + ", strasse=" + strasse + ", plz=" + plz + ", ort=" + ort + ", land=" + land
				+ "]";
	}
}
