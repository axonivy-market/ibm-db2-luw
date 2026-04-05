# IBM Db2 LUW Connector for Axon Ivy

[![CI Build](https://github.com/axonivy-market/ibm-db2-luw/actions/workflows/ci.yml/badge.svg)](https://github.com/axonivy-market/ibm-db2-luw/actions/workflows/ci.yml)

A connector product providing the IBM Db2 LUW (Linux, Unix and Windows) JDBC driver and integration helpers for Axon Ivy projects. Use this product to connect Axon Ivy processes to Db2 databases with supported configuration and samples.

## Table of Contents

- [Compatibility](#compatibility)
- [Requirements](#requirements)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [Building & Testing](#building--testing)
- [Contributing](#contributing)
- [License](#license)
- [Documentation](#documentation)

## Compatibility

This product is intended for Axon Ivy Designer/Engine 8.x and 9.x (verify with your environment). Tested with Db2 LUW 11.x and 12.x.

## Requirements

- Axon Ivy Designer / Engine
- Java 11+ (match your Axon Ivy runtime)
- IBM Db2 LUW JDBC driver (JCC) — included in this product or referenced in documentation

## Installation

1. Import the product into Axon Ivy Designer (Help → Install → Add Product Archive) or install via the product repository.
2. For runtime, place the connector JARs in the Axon Ivy engine's lib folder (<AXONIVY_HOME>/server/lib) and restart the engine.
3. Ensure database host, port, credentials and JDBC driver are available to the engine.

## Configuration

Example JDBC URL:

```
jdbc:db2://<DB_HOST>:<PORT>/<DB_NAME>
```

Driver class:

```
com.ibm.db2.jcc.DB2Driver
```

Provide datasource configuration in the Axon Ivy engine or your application server. See the documentation for example datasource and connection pool settings.

## Usage

- Use the connector from scripts, Java actions, or service calls inside your Ivy processes.
- Example: create a datasource in the engine and reference it from database activities or custom code.

## Building & Testing

Build with Maven:

```
mvn clean package
```

Run tests:

```
mvn test
```

Artifacts are produced under target/ and the product archive in target/ will contain the files needed for installation.

## Contributing

Contributions are welcome. Please open issues and PRs against this repository. Follow standard GitHub contribution workflow.

## License

See the LICENSE file in this repository for license details.

## Documentation

For detailed usage, configuration examples and changelogs, see the in-repo documentation:

- ibm-db2-luw-connector-product/README.md
