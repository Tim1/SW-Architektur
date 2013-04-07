1.Einführung und Ziele

Im Folgendem wird das Softwaresystem "RunningEasy" als das "System" bezeichnet.

1.1 Aufgabenstellung
Zur Verwaltung von Laufveranstaltung soll ein neues Softwaresystem – RunningEasy – erstellt werden. 
Es soll Veranstaltungen samt ihren Teilnehmern und Ergebnissen erfassen und auswerten. 
Der Läufer kann sich ohne großen Aufwand an Veranstaltungen anmelden und Ergebnisse anschauen.
Auch kann der Läufer per SMS oder Email benachrichtigt werden, sollte die Startgebühr noch nicht überwiesen worden sein. 
Zudem sollen Schnittstellen zu externen Systemen wie Bankanwendugen, SMS/Email-Service und Datenimportierung vorhanden sein.

1.2 Architekturziele
Anhand des Lastenhefts (Blatt 1 SWA-Praktikum) sind folgende funktionale und nicht funktionale Anforderungen gegeben:
Funktionale Anforderungen:
- Anlegen von Laufveranstlatungen
- Anmelden eine Läufers zu iner Veranstaltung
- Überweisen der Startgebühr
- Anmeldung bei einer Veranstaltung zurückziehen
- Liste der gemeldeten Läufer, die die Startgebühr (noch) nicht überwiesen haben
- Erinnerung per E-Mail oder SMS zur Gebührbezahlung
- Vereinszugehörigkeit eines Läufers ändern
- Erstellen von Startlisten
- Anzahl von Meldungen zu einem bestimmten Tag vor Anmeldeschluss anfordern
- Zuweisen von Startnummern zu den gemeldeten Teilnehmern
- Importieren der Laufzeiten einer Veranstaltung, die von einem externen Zeitmessystem erfasst werden
- Erstellen von Ergebnislisten
- Liste der Starter, die aufgegeben haben und nicht im Ziel angekommen sind
- Disqualifikation eines Läufers
- Zeitkorrektur: eine erfasste Laufzeit manuell korrigieren können
- Versand der persönlichen Laufzeit und Platzierung per SMS
- Liste aller Ergebnisse für einen bei mehreren Veranstaltungen gestartetetn Läufer
- Zahlungeingänge von einer Bankanwendung für ein Konto anfordern
- Zwischenzeiten aus einem externen Laufzeitsystem anfordern
- Datenimport von Vorgängersystemen

Nicht funktionale Anforderungen:
- Erinnerung per E-Mail oder SMS zur Gebührbezahlung nach 5 Tagen
- Datenimport von Vorgängersystemen in serialisierter Form

1.3 Stakeholder
-Läufer/Teilnehmer: 
	- fordern unkomplizierte Anmeldungen an Veranstaltungen und eine übersichtlihce Statistik der Veranstaltungen und Läufer bzw. Teilnehmer.
- Administrator: 
	- Einfache Bedienung zur Änderung/Verwaltung von Informationen zu Läeufer, Laufzeiten, Vereinen, Teilnahen und Ergebnissen.
	- Schnittstellen zu externen System leicht wartbar und erweiterbar
- Veranstalter: 
	- fordern Erstellung und Konfigurierung von Veranstatlungen, und Zahlungskontrolle der Teilnehmer.