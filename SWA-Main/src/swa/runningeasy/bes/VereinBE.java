/**
 * 
 */
package swa.runningeasy.bes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import swa.runningeasy.dtos.VereinDTO;

/**
 * @author Whopper
 * 
 */
@Entity
public class VereinBE implements ConvertibleToDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long	id;

	private String	name;
	private String	strasse;
	private String	plz;
	private String	ort;
	private String	land;

	public VereinBE() {

	}

	public VereinBE(final VereinDTO vereinDTO) {
		name = vereinDTO.getName();
		strasse = vereinDTO.getStrasse();
		plz = vereinDTO.getPlz();
		ort = vereinDTO.getOrt();
		land = vereinDTO.getLand();
	}

	public final String getName() {
		return name;
	}

	public final void setName(final String name) {
		this.name = name;
	}

	public final String getStrasse() {
		return strasse;
	}

	public final void setStrasse(final String strasse) {
		this.strasse = strasse;
	}

	public final String getPlz() {
		return plz;
	}

	public final void setPlz(final String plz) {
		this.plz = plz;
	}

	public final String getOrt() {
		return ort;
	}

	public final void setOrt(final String ort) {
		this.ort = ort;
	}

	public final String getLand() {
		return land;
	}

	public final void setLand(final String land) {
		this.land = land;
	}

	public VereinDTO asDTO() {
		VereinDTO vereinDTO = new VereinDTO(name);
		vereinDTO.setLand(land);
		vereinDTO.setOrt(ort);
		vereinDTO.setPlz(plz);
		vereinDTO.setStrasse(strasse);

		return vereinDTO;
	}

	@Override
	public String toString() {
		return "VereinBE [id=" + id + ", name=" + name + ", strasse=" + strasse + ", plz=" + plz + ", ort=" + ort
				+ ", land=" + land + "]";
	}

}
