# IBM DB2 LUW Connector

Provides easy integration of IBM Db2 LUW databases into Axon Ivy. This project packages the Db2 JDBC driver and exposes a connector so Ivy processes can open connections to Db2 for read and write operations.

Key features

- Easy integration of IBM Db2 LUW databases into Axon Ivy applications.
- Implements the JdbcConnector SPI so the Db2 driver becomes available to the platform.
- Automatic registration and lifecycle management of the Db2 JDBC driver.
- Opens JDBC connections using standard Db2 connection URLs for reliable read/write operations.
- Provides DriverInfo metadata to simplify connector configuration in the platform.

## Demo

The demo contains three user-facing processes and a callable subprocess:

1. Start the demo Db2 database:
   - cd ibm-db2-luw-connector-demo/docker
   - docker compose up
   (A local Db2 instance will start on port 50000; this compose file is intended for demo purposes only.)

2. Import and run the demo processes (ibm-db2-luw-connector-demo):
   - createTable — creates the demo table (invokes ensureTableExists).
   - write — inserts a sample row into table Db2Test (NAME = "Hello").
   - read — queries table Db2Test and returns the inserted rows.

3. Callable subprocess (demo only):
   - ensureTableExists.call() — creates table Db2Test with column Name VARCHAR(250).

## Setup

Minimal setup steps:

- Database: Create a database resource named "DB2" in your Axon Ivy environment (or adjust the demo to use your resource name). The demo uses DB2 on port 50000 and DB name "testdb".
- Roles/Users: No special roles required (roles.xml contains the default "Everybody" role).
- Variables: No mandatory variables are required.
- Installation: Deploy the connector IAR to your Axon Ivy server or add the Maven dependency as shown in product.json installers.

Notes

- The demo provides a Docker Compose file (ibm-db2-luw-connector-demo/docker/compose.yaml) for local testing. It includes example credentials for demonstration only — do not use these credentials in production.
- This README focuses on the product module features; demo-only assets and workflows are described in the Demo section.
