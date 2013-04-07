1.Einf�hrung und Ziele

Im Folgendem wird das Softwaresystem "RunningEasy" als das "System" bezeichnet.

1.1 Aufgabenstellung
Zur Verwaltung von Laufveranstaltung soll ein neues Softwaresystem � RunningEasy � erstellt werden. 
Es soll Veranstaltungen samt ihren Teilnehmern und Ergebnissen erfassen und auswerten. 
Der L�ufer kann sich ohne gro�en Aufwand an Veranstaltungen anmelden und Ergebnisse anschauen.
Auch kann der L�ufer per SMS oder Email benachrichtigt werden, sollte die Startgeb�hr noch nicht �berwiesen worden sein. 
Zudem sollen Schnittstellen zu externen Systemen wie Bankanwendugen, SMS/Email-Service und Datenimportierung vorhanden sein.

1.2 Architekturziele
Anhand des Lastenhefts (Blatt 1 SWA-Praktikum) sind folgende funktionale und nicht funktionale Anforderungen gegeben:
Funktionale Anforderungen:
- Anlegen von Laufveranstlatungen
- Anmelden eine L�ufers zu iner Veranstaltung
- �berweisen der Startgeb�hr
- Anmeldung bei einer Veranstaltung zur�ckziehen
- Liste der gemeldeten L�ufer, die die Startgeb�hr (noch) nicht �berwiesen haben
- Erinnerung per E-Mail oder SMS zur Geb�hrbezahlung
- Vereinszugeh�rigkeit eines L�ufers �ndern
- Erstellen von Startlisten
- Anzahl von Meldungen zu einem bestimmten Tag vor Anmeldeschluss anfordern
- Zuweisen von Startnummern zu den gemeldeten Teilnehmern
- Importieren der Laufzeiten einer Veranstaltung, die von einem externen Zeitmessystem erfasst werden
- Erstellen von Ergebnislisten
- Liste der Starter, die aufgegeben haben und nicht im Ziel angekommen sind
- Disqualifikation eines L�ufers
- Zeitkorrektur: eine erfasste Laufzeit manuell korrigieren k�nnen
- Versand der pers�nlichen Laufzeit und Platzierung per SMS
- Liste aller Ergebnisse f�r einen bei mehreren Veranstaltungen gestartetetn L�ufer
- Zahlungeing�nge von einer Bankanwendung f�r ein Konto anfordern
- Zwischenzeiten aus einem externen Laufzeitsystem anfordern
- Datenimport von Vorg�ngersystemen

Nicht funktionale Anforderungen:
- Erinnerung per E-Mail oder SMS zur Geb�hrbezahlung nach 5 Tagen
- Datenimport von Vorg�ngersystemen in serialisierter Form

1.3 Stakeholder
-L�ufer/Teilnehmer: 
	- fordern unkomplizierte Anmeldungen an Veranstaltungen und eine �bersichtlihce Statistik der Veranstaltungen und L�ufer bzw. Teilnehmer.
- Administrator: 
	- Einfache Bedienung zur �nderung/Verwaltung von Informationen zu L�eufer, Laufzeiten, Vereinen, Teilnahen und Ergebnissen.
	- Schnittstellen zu externen System leicht wartbar und erweiterbar
- Veranstalter: 
	- fordern Erstellung und Konfigurierung von Veranstatlungen, und Zahlungskontrolle der Teilnehmer.