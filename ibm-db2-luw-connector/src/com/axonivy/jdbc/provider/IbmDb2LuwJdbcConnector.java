package com.axonivy.jdbc.provider;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.ibm.db2.jcc.DB2Driver;

import ch.ivyteam.db.jdbc.JdbcDriver;
import ch.ivyteam.ivy.db.jdbc.provider.JdbcConnector;

public class IbmDb2LuwJdbcConnector implements JdbcConnector {

  @Override
  public JdbcDriver driver() {
    return JdbcDriver.DB2;
  }

  @Override
  public Driver registerDriver() {
    DB2Driver.getMyClassLoader(); // ensure driver is loaded and registered
    return DriverManager
        .drivers()
        .filter(driver -> driver.getClass().equals(DB2Driver.class))
        .findAny()
        .orElse(null);
  }

  @Override
  public void deregisterDriver(Driver driver) throws SQLException {
    DriverManager.deregisterDriver(driver);
  }

  @Override
  public Connection openConnection(String connectionUrl, Properties properties) throws SQLException {
    return DriverManager.getConnection(connectionUrl, properties);
  }
}
