package com.axonivy.jdbc.db2.luw;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.ibm.db2.jcc.DB2Driver;

import ch.ivyteam.ivy.db.jdbc.spi.DriverInfo;
import ch.ivyteam.ivy.db.jdbc.spi.JdbcConnector;

public class IbmDb2LuwJdbcConnector implements JdbcConnector {

  private static final DriverInfo INFO = DriverInfo
      .build(DB2Driver.class.getName(), "db2")
      .name("DB2")
      .database("DB2", "DB2")
      .configurator().server(50000)
      .toDriverInfo();

  @Override
  public DriverInfo info() {
    return INFO;
  }

  @Override
  public Driver register() {
    DB2Driver.getMyClassLoader(); // ensure driver is loaded and registered
    return DriverManager
        .drivers()
        .filter(driver -> driver.getClass().equals(DB2Driver.class))
        .findAny()
        .orElse(null);
  }

  @Override
  public void deregister(Driver driver) throws SQLException {
    DriverManager.deregisterDriver(driver);
  }

  @Override
  public Connection open(String connectionUrl, Properties properties) throws SQLException {
    return DriverManager.getConnection(connectionUrl, properties);
  }
}
