<!--
Dear developer!     

When you create your very valuable documentation, please be aware that this Readme.md is not only published on github. This documentation is also processed automatically and published on our website. For this to work, the two headings "Demo" and "Setup" must not be changed. Do also not change the order of the headings. Feel free to add sub-sections wherever you want.
-->

# IBM DB2 LUW Connector

Provides the IMB Db2 LUW (Linux, Unix and Windows) JDBC Driver

<!--
The explanations under "MY-RRODUCT-NAME" are displayed  e.g. for the Connector A-Trust here: https://market.axonivy.com/a-trust#tab-description   
-->

## Demo

The demo has three small processes. The first creates a table in the Db2 database. 
The second writes some data into the table and the third reads the data from the table.

<!--
We use all entries under the heading "Demo" for the demo-Tab on our Website, e.g. for the Connector A-Trust here: https://market.axonivy.com/a-trust#tab-demo  
-->

## Setup

On a command line `cd ibm-db2-luw-connector-demo` and execute `docker compose up`. 
This will start a IBM Db2 LUW database in a docker container. 
It takes a few minutes before the database is ready.
