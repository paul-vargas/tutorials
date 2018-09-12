package com.company.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Properties;

public class DriverSpy implements Driver {

	private static final String LOG4JDBC = "log4jdbc:";

	static {
		try {
			final String driverClass = System.getProperty("log4jdbc.driver");
			final Object instance = Class.forName(driverClass).newInstance();
			DriverManager.registerDriver((Driver) instance);
			DriverManager.registerDriver(new DriverSpy());
		} catch (final Throwable t) {
			throw new ExceptionInInitializerError(t);
		}
	}

	private Driver delegate;

	@Override
	public boolean acceptsURL(final String url) throws SQLException {
		return url != null && url.contains(LOG4JDBC);
	}

	@Override
	public Connection connect(final String url, final Properties info) throws SQLException {
		final String str = url.replace(LOG4JDBC, "");
		try {
			Connection conn = null;
			for (final Driver driver : Collections.list(DriverManager.getDrivers())) {
				if (driver.acceptsURL(str)) {
					conn = driver.connect(str, info);
					delegate = driver;
					break;
				}
			}
			if (conn == null) {
				throw new SQLException("invalid or unknown driver url: " + str);
			}
			return new ConnectionSpy(conn);
		} catch (final Throwable t) {
			throw new SQLException(t);
		}
	}

	@Override
	public int getMajorVersion() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int getMinorVersion() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(final String url, final Properties info) throws SQLException {
		throw new UnsupportedOperationException("Not supported yet.");

	}

	@Override
	public boolean jdbcCompliant() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
