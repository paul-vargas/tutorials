package com.company.jdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class DataSourceSpy implements DataSource {

	private DataSource realDataSource;

	@Override
	public Connection getConnection() throws SQLException {
		final Connection realConnection = realDataSource.getConnection();
		return new ConnectionSpy(realConnection);
	}

	@Override
	public Connection getConnection(final String username, final String password) throws SQLException {
		final Connection realConnection = realDataSource.getConnection(username, password);
		return new ConnectionSpy(realConnection);
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		return realDataSource.getLoginTimeout();
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		return realDataSource.getLogWriter();
	}

	@Override
	public boolean isWrapperFor(final Class<?> iface) throws SQLException {
		return realDataSource.isWrapperFor(iface);
	}

	@Override
	public void setLoginTimeout(final int seconds) throws SQLException {
		realDataSource.setLoginTimeout(seconds);
	}

	@Override
	public void setLogWriter(final PrintWriter out) throws SQLException {
		realDataSource.setLogWriter(out);
	}

	@Override
	public <T> T unwrap(final Class<T> iface) throws SQLException {
		return realDataSource.unwrap(iface);
	}

}
