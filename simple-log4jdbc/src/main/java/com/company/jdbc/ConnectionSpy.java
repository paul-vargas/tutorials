package com.company.jdbc;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;

public class ConnectionSpy implements Connection {

	private Connection realConnection;

	public ConnectionSpy(final Connection realConnection) {
		super();
		this.realConnection = realConnection;
	}

	@Override
	public void clearWarnings() throws SQLException {
		realConnection.clearWarnings();
	}

	@Override
	public void close() throws SQLException {
		realConnection.close();
	}

	@Override
	public void commit() throws SQLException {
		realConnection.commit();
	}

	@Override
	public Array createArrayOf(final String typeName, final Object[] elements) throws SQLException {
		return realConnection.createArrayOf(typeName, elements);
	}

	@Override
	public Blob createBlob() throws SQLException {
		return realConnection.createBlob();
	}

	@Override
	public Clob createClob() throws SQLException {
		return realConnection.createClob();
	}

	@Override
	public NClob createNClob() throws SQLException {
		return realConnection.createNClob();
	}

	@Override
	public SQLXML createSQLXML() throws SQLException {
		return realConnection.createSQLXML();
	}

	@Override
	public Statement createStatement() throws SQLException {
		final Statement realStatement = realConnection.createStatement();
		return new StatementSpy(realStatement);
	}

	@Override
	public Statement createStatement(final int resultSetType, final int resultSetConcurrency) throws SQLException {
		final Statement realStatement = realConnection.createStatement(resultSetType, resultSetConcurrency);
		return new StatementSpy(realStatement);
	}

	@Override
	public Statement createStatement(final int resultSetType, final int resultSetConcurrency,
			final int resultSetHoldability) throws SQLException {
		final Statement realStatement = realConnection.createStatement(resultSetType, resultSetConcurrency,
				resultSetHoldability);
		return new StatementSpy(realStatement);
	}

	@Override
	public Struct createStruct(final String typeName, final Object[] attributes) throws SQLException {
		return realConnection.createStruct(typeName, attributes);
	}

	@Override
	public boolean getAutoCommit() throws SQLException {
		return realConnection.getAutoCommit();
	}

	@Override
	public String getCatalog() throws SQLException {
		return realConnection.getCatalog();
	}

	@Override
	public Properties getClientInfo() throws SQLException {
		return realConnection.getClientInfo();
	}

	@Override
	public String getClientInfo(final String name) throws SQLException {
		return realConnection.getClientInfo(name);
	}

	@Override
	public int getHoldability() throws SQLException {
		return realConnection.getHoldability();
	}

	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		return realConnection.getMetaData();
	}

	@Override
	public int getTransactionIsolation() throws SQLException {
		return realConnection.getTransactionIsolation();
	}

	@Override
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		return realConnection.getTypeMap();
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		return realConnection.getWarnings();
	}

	@Override
	public boolean isClosed() throws SQLException {
		return realConnection.isClosed();
	}

	@Override
	public boolean isReadOnly() throws SQLException {
		return realConnection.isReadOnly();
	}

	@Override
	public boolean isValid(final int timeout) throws SQLException {
		return realConnection.isValid(timeout);
	}

	@Override
	public boolean isWrapperFor(final Class<?> iface) throws SQLException {
		return realConnection.isWrapperFor(iface);
	}

	@Override
	public String nativeSQL(final String sql) throws SQLException {
		return realConnection.nativeSQL(sql);
	}

	@Override
	public CallableStatement prepareCall(final String sql) throws SQLException {
		final CallableStatement realCallableStatement = realConnection.prepareCall(sql);
		return new CallableStatementSpy(realCallableStatement, sql);
	}

	@Override
	public CallableStatement prepareCall(final String sql, final int resultSetType, final int resultSetConcurrency)
			throws SQLException {
		final CallableStatement realCallableStatement = realConnection.prepareCall(sql, resultSetType,
				resultSetConcurrency);
		return new CallableStatementSpy(realCallableStatement, sql);
	}

	@Override
	public CallableStatement prepareCall(final String sql, final int resultSetType, final int resultSetConcurrency,
			final int resultSetHoldability) throws SQLException {
		final CallableStatement realCallableStatement = realConnection.prepareCall(sql, resultSetType,
				resultSetConcurrency, resultSetHoldability);
		return new CallableStatementSpy(realCallableStatement, sql);
	}

	@Override
	public PreparedStatement prepareStatement(final String sql) throws SQLException {
		final PreparedStatement realPreparedStatement = realConnection.prepareStatement(sql);
		return new PreparedStatementSpy(realPreparedStatement, sql);
	}

	@Override
	public PreparedStatement prepareStatement(final String sql, final int autoGeneratedKeys) throws SQLException {
		final PreparedStatement realPreparedStatement = realConnection.prepareStatement(sql, autoGeneratedKeys);
		return new PreparedStatementSpy(realPreparedStatement, sql);
	}

	@Override
	public PreparedStatement prepareStatement(final String sql, final int resultSetType, final int resultSetConcurrency)
			throws SQLException {
		final PreparedStatement realPreparedStatement = realConnection.prepareStatement(sql, resultSetType,
				resultSetConcurrency);
		return new PreparedStatementSpy(realPreparedStatement, sql);
	}

	@Override
	public PreparedStatement prepareStatement(final String sql, final int resultSetType, final int resultSetConcurrency,
			final int resultSetHoldability) throws SQLException {
		final PreparedStatement realPreparedStatement = realConnection.prepareStatement(sql, resultSetType,
				resultSetConcurrency, resultSetHoldability);
		return new PreparedStatementSpy(realPreparedStatement, sql);
	}

	@Override
	public PreparedStatement prepareStatement(final String sql, final int[] columnIndexes) throws SQLException {
		final PreparedStatement realPreparedStatement = realConnection.prepareStatement(sql, columnIndexes);
		return new PreparedStatementSpy(realPreparedStatement, sql);
	}

	@Override
	public PreparedStatement prepareStatement(final String sql, final String[] columnNames) throws SQLException {
		final PreparedStatement realPreparedStatement = realConnection.prepareStatement(sql, columnNames);
		return new PreparedStatementSpy(realPreparedStatement, sql);
	}

	@Override
	public void releaseSavepoint(final Savepoint savepoint) throws SQLException {
		realConnection.releaseSavepoint(savepoint);
	}

	@Override
	public void rollback() throws SQLException {
		realConnection.rollback();
	}

	@Override
	public void rollback(final Savepoint savepoint) throws SQLException {
		realConnection.rollback(savepoint);
	}

	@Override
	public void setAutoCommit(final boolean autoCommit) throws SQLException {
		realConnection.setAutoCommit(autoCommit);
	}

	@Override
	public void setCatalog(final String catalog) throws SQLException {
		realConnection.setCatalog(catalog);
	}

	@Override
	public void setClientInfo(final Properties properties) throws SQLClientInfoException {
		realConnection.setClientInfo(properties);
	}

	@Override
	public void setClientInfo(final String name, final String value) throws SQLClientInfoException {
		realConnection.setClientInfo(name, value);
	}

	@Override
	public void setHoldability(final int holdability) throws SQLException {
		realConnection.setHoldability(holdability);
	}

	@Override
	public void setReadOnly(final boolean readOnly) throws SQLException {
		realConnection.setReadOnly(readOnly);
	}

	@Override
	public Savepoint setSavepoint() throws SQLException {
		return realConnection.setSavepoint();
	}

	@Override
	public Savepoint setSavepoint(final String name) throws SQLException {
		return realConnection.setSavepoint(name);
	}

	@Override
	public void setTransactionIsolation(final int level) throws SQLException {
		realConnection.setTransactionIsolation(level);
	}

	@Override
	public void setTypeMap(final Map<String, Class<?>> map) throws SQLException {
		realConnection.setTypeMap(map);
	}

	@Override
	public <T> T unwrap(final Class<T> iface) throws SQLException {
		return realConnection.unwrap(iface);
	}

}
