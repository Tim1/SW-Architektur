/**
 * 
 */
package swa.runningeasy.client.util;

import java.util.Vector;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class DTOAttributes {
	public static Vector<String>	anmeldung;
	public static Vector<String>	laeufer;
	public static Vector<String>	laufzeit;
	public static Vector<String>	auswertung;
	public static Vector<String>	veranstaltung;
	public static Vector<String>	verein;

	static {
		anmeldung = new Vector<>();
		anmeldung.add("Läufer");
		anmeldung.add("bezahlt");
		anmeldung.add("Veranstaltung");
		anmeldung.add("Verein");
		anmeldung.add("Startnummer");

		laeufer = new Vector<>();
		laeufer.add("Name");
		laeufer.add("Vorname");
		laeufer.add("Geburtsjahr");
		laeufer.add("Geschlecht");
		laeufer.add("eMail");
		laeufer.add("SMS");
		laeufer.add("Straße");
		laeufer.add("PLZ");
		laeufer.add("Ort");
		laeufer.add("Land");

		laufzeit = new Vector<>();
		laufzeit.add("Startnummer");
		laufzeit.add("Laufzeit");
		laufzeit.add("Veranstaltung");

		auswertung = new Vector<>();
		auswertung.add("Name");
		auswertung.add("Vorname");
		auswertung.add("Geburtsjahr");
		auswertung.add("Geschlecht");
		auswertung.add("Verein");
		auswertung.add("Laufzeit");
		auswertung.add("Startnummer");
		auswertung.add("Platzierung");

		veranstaltung = new Vector<>();
		veranstaltung.add("Name");
		veranstaltung.add("Datum");
		veranstaltung.add("Anmeldeschluss");
		veranstaltung.add("Startgebühr");

		verein = new Vector<>();
		verein.add("Name");
		verein.add("Straße");
		verein.add("PLZ");
		verein.add("Ort");
		verein.add("Land");
	}
}
