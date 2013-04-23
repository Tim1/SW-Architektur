4. Bausteinsicht

[[[Komponentendiagramm]]]

Im obigen Diagramm sind die wichtigsten Komponenten mitsamt ihren Schnittstellen  und Verbindungen angezeigt.

Besondere Erklärung bedarf die Komponente „Regelmäßige Tasks“, welche hier als abstrakte „Oberkomponente“ von „MessageServices“ und „Überweisung“ dargestellt ist. Nach unserem Lösungsansatz war dies notwendig, da diese Teile der Anwendung nicht direkt durch Benutzereingabe sondern in irgendeiner Form zeitgesteuert getriggert werden müssen.
Beispielsweise muss die Komponente MessageService automatisch nach Ablauf bestimmter Zeiten Mitteilungen an außenstehende Systeme verschicken, ohne dass es einen Input eines menschlichen Akteurs bedarf. 
Dies unterscheidet diese Teile der Anwendung vom Restsystem und ist wie dargestellt modelliert.

Die Stammdatenverwaltung kümmert sich um jegliche Änderung des Datenbestandes welche durch Eingaben im Client durchgeführt werden.

Die Datenimport Komponente liest die Altdaten ein und legt über eine Schnittstelle mit der Stammdatenverwaltung diese importierten Daten auch im aktuellen System wieder an.

Alle Komponenten mit schreibenden oder lesenden Zugriff auch persistente Daten kommunizieren über vorgegebene Schnittstellen mit einer Persistenzverwaltungs-Komponente welche die Implementierung der Persistenzschicht kapselt.