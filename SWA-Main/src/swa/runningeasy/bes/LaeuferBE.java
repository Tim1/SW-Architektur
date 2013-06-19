/**
 * 
 */
package swa.runningeasy.bes;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import swa.runningeasy.dtos.LaeuferDTO;

/**
 * @author Whopper
 * 
 */
@Entity
public class LaeuferBE implements ConvertibleToDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long		id;
	@ManyToOne(cascade = CascadeType.ALL)
	private VereinBE	verein;

	private String		name;
	private String		vorname;
	private int			geburtsjahr;
	private char		geschlecht;
	private String		email;
	private String		sms;
	private String		strasse;
	private String		plz;
	private String		ort;
	private String		land;


	public LaeuferBE() {

	}

	public LaeuferBE(final LaeuferDTO laeuferDTO) {
		name = laeuferDTO.getName();
		vorname = laeuferDTO.getVorname();
		geburtsjahr = laeuferDTO.getGeburtsjahr();
		geschlecht = laeuferDTO.getGeschlecht();
		email = laeuferDTO.getEmail();
		sms = laeuferDTO.getSms();
		strasse = laeuferDTO.getStrasse();
		plz = laeuferDTO.getPlz();
		ort = laeuferDTO.getOrt();
		land = laeuferDTO.getLand();

		// TODO: check where to find the right verein
		verein = new VereinBE();
	}

	public VereinBE getVerein() {
		return verein;
	}

	public void setVerein(final VereinBE verein) {
		this.verein = verein;
		if (!verein.getLaeuferList().contains(this))
			verein.getLaeuferList().add(this);
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(final String vorname) {
		this.vorname = vorname;
	}

	public int getGeburtsjahr() {
		return geburtsjahr;
	}

	public void setGeburtsjahr(final int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}

	public char getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(final char geschlecht) {
		this.geschlecht = geschlecht;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getSms() {
		return sms;
	}

	public void setSms(final String sms) {
		this.sms = sms;
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
	public LaeuferDTO asDTO() {
		LaeuferDTO laeuferDTO = new LaeuferDTO(name, vorname, geburtsjahr, geschlecht, email, sms, strasse, plz, ort,
				land);
		return laeuferDTO;
	}

	@Override
	public String toString() {
		return "LaeuferBE [id=" + id + ", name=" + name + ", vorname=" + vorname + ", geburtsjahr=" + geburtsjahr
				+ ", geschlecht=" + geschlecht + ", email=" + email + ", sms=" + sms + ", strasse=" + strasse
				+ ", plz=" + plz + ", ort=" + ort + ", land=" + land + "]";
	}


}
