4. Bausteinsicht

[[[Komponentendiagramm]]]

Im obigen Diagramm sind die wichtigsten Komponenten mitsamt ihren Schnittstellen  und Verbindungen angezeigt.

Besondere Erkl�rung bedarf die Komponente �Regelm��ige Tasks�, welche hier als abstrakte �Oberkomponente� von �MessageServices� und ��berweisung� dargestellt ist. Nach unserem L�sungsansatz war dies notwendig, da diese Teile der Anwendung nicht direkt durch Benutzereingabe sondern in irgendeiner Form zeitgesteuert getriggert werden m�ssen.
Beispielsweise muss die Komponente MessageService automatisch nach Ablauf bestimmter Zeiten Mitteilungen an au�enstehende Systeme verschicken, ohne dass es einen Input eines menschlichen Akteurs bedarf. 
Dies unterscheidet diese Teile der Anwendung vom Restsystem und ist wie dargestellt modelliert.

Die Stammdatenverwaltung k�mmert sich um jegliche �nderung des Datenbestandes welche durch Eingaben im Client durchgef�hrt werden.

Die Datenimport Komponente liest die Altdaten ein und legt �ber eine Schnittstelle mit der Stammdatenverwaltung diese importierten Daten auch im aktuellen System wieder an.

Alle Komponenten mit schreibenden oder lesenden Zugriff auch persistente Daten kommunizieren �ber vorgegebene Schnittstellen mit einer Persistenzverwaltungs-Komponente welche die Implementierung der Persistenzschicht kapselt.