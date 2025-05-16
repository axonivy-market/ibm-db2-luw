# IBM DB2 LUW Connector

Stellt den IBM Db2 LUW (Linux, Unix und Windows) JDBC Treiber zur Verfügung.

## Demo

Das Demo besteht aus drei kleinen Prozessen. Der erste Prozess erstellt eine Tabelle in der Db2 Datenbank.
Der zweite Prozess schreibt in die neue Tabelle und der dritte Prozess liest dies Daten von der Tabelle zurück.

## Setup

Auf der Kommandozeile tippen Sie `cd ibm-db2-luw-connector-demo` und führen dann `docker compose up` aus.
Nun wir eine IBM Db2 LUW Datenbank in einem Docker Kontainer gestartet.
Es dauert einige Minuten bis die Datenbank bereit ist.
