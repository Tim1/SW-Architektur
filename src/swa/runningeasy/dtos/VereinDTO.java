package swa.runningeasy.dtos;

/**
 * @author Bernhard Hollunder
 * 
 * Represents a club a participant is starting for.
 * 
 */

public class VereinDTO {
	
	public VereinDTO(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	
	public String toString(){
		return name;
	}
	
	private String name;
	private String strasse;
	private String plz;
	private String ort;
	private String land;


}
