# wps-java-foundations

Dieses Projekt ist als Einstiegsvorbereitung für eine Junior-Java-Position bei WPS gedacht.

Der Fokus liegt auf sauberen Java-Grundlagen, klarer Struktur und nachvollziehbaren Tests.
Es geht bewusst nicht um Frameworks oder komplexe Architektur, sondern um verständliche
Lösungen und saubere Entscheidungen.

## Ziel des Projekts

Ziel dieses Projekts ist es, typische Einstiegsaufgaben umzusetzen und dabei zu zeigen:

- solides Verständnis von Java-Grundlagen
- strukturierter, gut lesbarer Code
- bewusster Umgang mit Datenstrukturen
- sinnvolles und konsistentes Testen mit JUnit

Das Projekt ist bewusst überschaubar gehalten, um Qualität vor Umfang zu stellen.

## Inhalte

Aktuell sind folgende Themen umgesetzt:

- Textverarbeitung
  - Bereinigung von Texten
  - Zählen unterschiedlicher Wörter
- Arbeiten mit Listen
  - Umkehren von Listen ohne Seiteneffekte
- Einfaches Domänenmodell
  - Person mit Validierung
  - Sortierung nach Geburtsjahr und Name

Alle Funktionen sind durch automatisierte Tests abgesichert.

## Technischer Stack

- Java 17
- Maven
- JUnit 5
- Git / GitHub

Es werden keine zusätzlichen Frameworks verwendet.

## Tests ausführen

Die Tests können im Projektverzeichnis mit folgendem Befehl ausgeführt werden:

```bash
mvn clean test
