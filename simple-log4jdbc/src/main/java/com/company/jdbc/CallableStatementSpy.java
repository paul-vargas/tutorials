package com.company.jdbc;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CallableStatementSpy extends PreparedStatementSpy implements CallableStatement {

	protected Map<Integer, String> map;
	private CallableStatement realCallableStatement;
	protected String sql;

	public CallableStatementSpy(final CallableStatement realCallableStatement, final String sql) {
		super(realCallableStatement, sql);
		this.realCallableStatement = realCallableStatement;
		this.sql = sql;
		map = Collections.synchronizedMap(new HashMap<Integer, String>());
	}

	@Override
	public void addBatch() throws SQLException {
		realCallableStatement.addBatch();
	}

	@Override
	public void addBatch(final String sql) throws SQLException {
		realCallableStatement.addBatch(sql);
	}

	@Override
	public void cancel() throws SQLException {
		realCallableStatement.cancel();
	}

	@Override
	public void clearBatch() throws SQLException {
		realCallableStatement.clearBatch();
	}

	@Override
	public void clearParameters() throws SQLException {
		realCallableStatement.clearParameters();
	}

	@Override
	public void clearWarnings() throws SQLException {
		realCallableStatement.clearWarnings();
	}

	@Override
	public void close() throws SQLException {
		realCallableStatement.close();
	}

	@Override
	public boolean execute() throws SQLException {
		return realCallableStatement.execute();
	}

	@Override
	public boolean execute(final String sql) throws SQLException {
		return realCallableStatement.execute(sql);
	}

	@Override
	public boolean execute(final String sql, final int autoGeneratedKeys) throws SQLException {
		return realCallableStatement.execute(sql, autoGeneratedKeys);
	}

	@Override
	public boolean execute(final String sql, final int[] columnIndexes) throws SQLException {
		return realCallableStatement.execute(sql, columnIndexes);
	}

	@Override
	public boolean execute(final String sql, final String[] columnNames) throws SQLException {
		return realCallableStatement.execute(sql, columnNames);
	}

	@Override
	public int[] executeBatch() throws SQLException {
		return realCallableStatement.executeBatch();
	}

	@Override
	public ResultSet executeQuery() throws SQLException {
		return realCallableStatement.executeQuery();
	}

	@Override
	public ResultSet executeQuery(final String sql) throws SQLException {
		return realCallableStatement.executeQuery(sql);
	}

	@Override
	public int executeUpdate() throws SQLException {
		return realCallableStatement.executeUpdate();
	}

	@Override
	public int executeUpdate(final String sql) throws SQLException {
		return realCallableStatement.executeUpdate(sql);
	}

	@Override
	public int executeUpdate(final String sql, final int autoGeneratedKeys) throws SQLException {
		return realCallableStatement.executeUpdate(sql, autoGeneratedKeys);
	}

	@Override
	public int executeUpdate(final String sql, final int[] columnIndexes) throws SQLException {
		return realCallableStatement.executeUpdate(sql, columnIndexes);
	}

	@Override
	public int executeUpdate(final String sql, final String[] columnNames) throws SQLException {
		return realCallableStatement.executeUpdate(sql, columnNames);
	}

	@Override
	public Array getArray(final int parameterIndex) throws SQLException {
		return realCallableStatement.getArray(parameterIndex);
	}

	@Override
	public Array getArray(final String parameterName) throws SQLException {
		return realCallableStatement.getArray(parameterName);
	}

	@Override
	public BigDecimal getBigDecimal(final int parameterIndex) throws SQLException {
		return realCallableStatement.getBigDecimal(parameterIndex);
	}

	@Override
	public BigDecimal getBigDecimal(final int parameterIndex, final int scale) throws SQLException {
		return realCallableStatement.getBigDecimal(parameterIndex, scale);
	}

	@Override
	public BigDecimal getBigDecimal(final String parameterName) throws SQLException {
		return realCallableStatement.getBigDecimal(parameterName);
	}

	@Override
	public Blob getBlob(final int parameterIndex) throws SQLException {
		return realCallableStatement.getBlob(parameterIndex);
	}

	@Override
	public Blob getBlob(final String parameterName) throws SQLException {
		return realCallableStatement.getBlob(parameterName);
	}

	@Override
	public boolean getBoolean(final int parameterIndex) throws SQLException {
		return realCallableStatement.getBoolean(parameterIndex);
	}

	@Override
	public boolean getBoolean(final String parameterName) throws SQLException {
		return realCallableStatement.getBoolean(parameterName);
	}

	@Override
	public byte getByte(final int parameterIndex) throws SQLException {
		return realCallableStatement.getByte(parameterIndex);
	}

	@Override
	public byte getByte(final String parameterName) throws SQLException {
		return realCallableStatement.getByte(parameterName);
	}

	@Override
	public byte[] getBytes(final int parameterIndex) throws SQLException {
		return realCallableStatement.getBytes(parameterIndex);
	}

	@Override
	public byte[] getBytes(final String parameterName) throws SQLException {
		return realCallableStatement.getBytes(parameterName);
	}

	@Override
	public Reader getCharacterStream(final int parameterIndex) throws SQLException {
		return realCallableStatement.getCharacterStream(parameterIndex);
	}

	@Override
	public Reader getCharacterStream(final String parameterName) throws SQLException {
		return realCallableStatement.getCharacterStream(parameterName);
	}

	@Override
	public Clob getClob(final int parameterIndex) throws SQLException {
		return realCallableStatement.getClob(parameterIndex);
	}

	@Override
	public Clob getClob(final String parameterName) throws SQLException {
		return realCallableStatement.getClob(parameterName);
	}

	@Override
	public Connection getConnection() throws SQLException {
		return realCallableStatement.getConnection();
	}

	@Override
	public Date getDate(final int parameterIndex) throws SQLException {
		return realCallableStatement.getDate(parameterIndex);
	}

	@Override
	public Date getDate(final int parameterIndex, final Calendar cal) throws SQLException {
		return realCallableStatement.getDate(parameterIndex, cal);
	}

	@Override
	public Date getDate(final String parameterName) throws SQLException {
		return realCallableStatement.getDate(parameterName);
	}

	@Override
	public Date getDate(final String parameterName, final Calendar cal) throws SQLException {
		return realCallableStatement.getDate(parameterName, cal);
	}

	@Override
	public double getDouble(final int parameterIndex) throws SQLException {
		return realCallableStatement.getDouble(parameterIndex);
	}

	@Override
	public double getDouble(final String parameterName) throws SQLException {
		return realCallableStatement.getDouble(parameterName);
	}

	@Override
	public int getFetchDirection() throws SQLException {
		return realCallableStatement.getFetchDirection();
	}

	@Override
	public int getFetchSize() throws SQLException {
		return realCallableStatement.getFetchSize();
	}

	@Override
	public float getFloat(final int parameterIndex) throws SQLException {
		return realCallableStatement.getFloat(parameterIndex);
	}

	@Override
	public float getFloat(final String parameterName) throws SQLException {
		return realCallableStatement.getFloat(parameterName);
	}

	@Override
	public ResultSet getGeneratedKeys() throws SQLException {
		return realCallableStatement.getGeneratedKeys();
	}

	@Override
	public int getInt(final int parameterIndex) throws SQLException {
		return realCallableStatement.getInt(parameterIndex);
	}

	@Override
	public int getInt(final String parameterName) throws SQLException {
		return realCallableStatement.getInt(parameterName);
	}

	@Override
	public long getLong(final int parameterIndex) throws SQLException {
		return realCallableStatement.getLong(parameterIndex);
	}

	@Override
	public long getLong(final String parameterName) throws SQLException {
		return realCallableStatement.getLong(parameterName);
	}

	@Override
	public int getMaxFieldSize() throws SQLException {
		return realCallableStatement.getMaxFieldSize();
	}

	@Override
	public int getMaxRows() throws SQLException {
		return realCallableStatement.getMaxRows();
	}

	@Override
	public ResultSetMetaData getMetaData() throws SQLException {
		return realCallableStatement.getMetaData();
	}

	@Override
	public boolean getMoreResults() throws SQLException {
		return realCallableStatement.getMoreResults();
	}

	@Override
	public boolean getMoreResults(final int current) throws SQLException {
		return realCallableStatement.getMoreResults(current);
	}

	@Override
	public Reader getNCharacterStream(final int parameterIndex) throws SQLException {
		return realCallableStatement.getNCharacterStream(parameterIndex);
	}

	@Override
	public Reader getNCharacterStream(final String parameterName) throws SQLException {
		return realCallableStatement.getNCharacterStream(parameterName);
	}

	@Override
	public NClob getNClob(final int parameterIndex) throws SQLException {
		return realCallableStatement.getNClob(parameterIndex);
	}

	@Override
	public NClob getNClob(final String parameterName) throws SQLException {
		return realCallableStatement.getNClob(parameterName);
	}

	@Override
	public String getNString(final int parameterIndex) throws SQLException {
		return realCallableStatement.getNString(parameterIndex);
	}

	@Override
	public String getNString(final String parameterName) throws SQLException {
		return realCallableStatement.getNString(parameterName);
	}

	@Override
	public Object getObject(final int parameterIndex) throws SQLException {
		return realCallableStatement.getObject(parameterIndex);
	}

	@Override
	public Object getObject(final int parameterIndex, final Map<String, Class<?>> map) throws SQLException {
		return realCallableStatement.getObject(parameterIndex, map);
	}

	@Override
	public Object getObject(final String parameterName) throws SQLException {
		return realCallableStatement.getObject(parameterName);
	}

	@Override
	public Object getObject(final String parameterName, final Map<String, Class<?>> map) throws SQLException {
		return realCallableStatement.getObject(parameterName, map);
	}

	@Override
	public ParameterMetaData getParameterMetaData() throws SQLException {
		return realCallableStatement.getParameterMetaData();
	}

	@Override
	public int getQueryTimeout() throws SQLException {
		return realCallableStatement.getQueryTimeout();
	}

	@Override
	public Ref getRef(final int parameterIndex) throws SQLException {
		return realCallableStatement.getRef(parameterIndex);
	}

	@Override
	public Ref getRef(final String parameterName) throws SQLException {
		return realCallableStatement.getRef(parameterName);
	}

	@Override
	public ResultSet getResultSet() throws SQLException {
		return realCallableStatement.getResultSet();
	}

	@Override
	public int getResultSetConcurrency() throws SQLException {
		return realCallableStatement.getResultSetConcurrency();
	}

	@Override
	public int getResultSetHoldability() throws SQLException {
		return realCallableStatement.getResultSetHoldability();
	}

	@Override
	public int getResultSetType() throws SQLException {
		return realCallableStatement.getResultSetType();
	}

	@Override
	public RowId getRowId(final int parameterIndex) throws SQLException {
		return realCallableStatement.getRowId(parameterIndex);
	}

	@Override
	public RowId getRowId(final String parameterName) throws SQLException {
		return realCallableStatement.getRowId(parameterName);
	}

	@Override
	public short getShort(final int parameterIndex) throws SQLException {
		return realCallableStatement.getShort(parameterIndex);
	}

	@Override
	public short getShort(final String parameterName) throws SQLException {
		return realCallableStatement.getShort(parameterName);
	}

	@Override
	public SQLXML getSQLXML(final int parameterIndex) throws SQLException {
		return realCallableStatement.getSQLXML(parameterIndex);
	}

	@Override
	public SQLXML getSQLXML(final String parameterName) throws SQLException {
		return realCallableStatement.getSQLXML(parameterName);
	}

	@Override
	public String getString(final int parameterIndex) throws SQLException {
		return realCallableStatement.getString(parameterIndex);
	}

	@Override
	public String getString(final String parameterName) throws SQLException {
		return realCallableStatement.getString(parameterName);
	}

	@Override
	public Time getTime(final int parameterIndex) throws SQLException {
		return realCallableStatement.getTime(parameterIndex);
	}

	@Override
	public Time getTime(final int parameterIndex, final Calendar cal) throws SQLException {
		return realCallableStatement.getTime(parameterIndex, cal);
	}

	@Override
	public Time getTime(final String parameterName) throws SQLException {
		return realCallableStatement.getTime(parameterName);
	}

	@Override
	public Time getTime(final String parameterName, final Calendar cal) throws SQLException {
		return realCallableStatement.getTime(parameterName, cal);
	}

	@Override
	public Timestamp getTimestamp(final int parameterIndex) throws SQLException {
		return realCallableStatement.getTimestamp(parameterIndex);
	}

	@Override
	public Timestamp getTimestamp(final int parameterIndex, final Calendar cal) throws SQLException {
		return realCallableStatement.getTimestamp(parameterIndex, cal);
	}

	@Override
	public Timestamp getTimestamp(final String parameterName) throws SQLException {
		return realCallableStatement.getTimestamp(parameterName);
	}

	@Override
	public Timestamp getTimestamp(final String parameterName, final Calendar cal) throws SQLException {
		return realCallableStatement.getTimestamp(parameterName, cal);
	}

	@Override
	public int getUpdateCount() throws SQLException {
		return realCallableStatement.getUpdateCount();
	}

	@Override
	public URL getURL(final int parameterIndex) throws SQLException {
		return realCallableStatement.getURL(parameterIndex);
	}

	@Override
	public URL getURL(final String parameterName) throws SQLException {
		return realCallableStatement.getURL(parameterName);
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		return realCallableStatement.getWarnings();
	}

	@Override
	public boolean isClosed() throws SQLException {
		return realCallableStatement.isClosed();
	}

	@Override
	public boolean isPoolable() throws SQLException {
		return realCallableStatement.isPoolable();
	}

	@Override
	public boolean isWrapperFor(final Class<?> iface) throws SQLException {
		return realCallableStatement.isWrapperFor(iface);
	}

	@Override
	public void registerOutParameter(final int parameterIndex, final int sqlType) throws SQLException {
		argTraceSet(parameterIndex, null, "<OUT>");
		realCallableStatement.registerOutParameter(parameterIndex, sqlType);
	}

	@Override
	public void registerOutParameter(final int parameterIndex, final int sqlType, final int scale) throws SQLException {
		argTraceSet(parameterIndex, null, "<OUT>");
		realCallableStatement.registerOutParameter(parameterIndex, sqlType, scale);
	}

	@Override
	public void registerOutParameter(final int parameterIndex, final int sqlType, final String typeName)
			throws SQLException {
		argTraceSet(parameterIndex, null, "<OUT>");
		realCallableStatement.registerOutParameter(parameterIndex, sqlType, typeName);
	}

	@Override
	public void registerOutParameter(final String parameterName, final int sqlType) throws SQLException {
		realCallableStatement.registerOutParameter(parameterName, sqlType);
	}

	@Override
	public void registerOutParameter(final String parameterName, final int sqlType, final int scale)
			throws SQLException {
		realCallableStatement.registerOutParameter(parameterName, sqlType, scale);
	}

	@Override
	public void registerOutParameter(final String parameterName, final int sqlType, final String typeName)
			throws SQLException {
		realCallableStatement.registerOutParameter(parameterName, sqlType, typeName);
	}

	@Override
	public void setArray(final int parameterIndex, final Array x) throws SQLException {
		realCallableStatement.setArray(parameterIndex, x);
	}

	@Override
	public void setAsciiStream(final int parameterIndex, final InputStream x) throws SQLException {
		realCallableStatement.setAsciiStream(parameterIndex, x);
	}

	@Override
	public void setAsciiStream(final int parameterIndex, final InputStream x, final int length) throws SQLException {
		realCallableStatement.setAsciiStream(parameterIndex, x, length);
	}

	@Override
	public void setAsciiStream(final int parameterIndex, final InputStream x, final long length) throws SQLException {
		realCallableStatement.setAsciiStream(parameterIndex, x, length);
	}

	@Override
	public void setAsciiStream(final String parameterName, final InputStream x) throws SQLException {
		realCallableStatement.setAsciiStream(parameterName, x);
	}

	@Override
	public void setAsciiStream(final String parameterName, final InputStream x, final int length) throws SQLException {
		realCallableStatement.setAsciiStream(parameterName, x, length);
	}

	@Override
	public void setAsciiStream(final String parameterName, final InputStream x, final long length) throws SQLException {
		realCallableStatement.setAsciiStream(parameterName, x, length);
	}

	@Override
	public void setBigDecimal(final int parameterIndex, final BigDecimal x) throws SQLException {
		realCallableStatement.setBigDecimal(parameterIndex, x);
	}

	@Override
	public void setBigDecimal(final String parameterName, final BigDecimal x) throws SQLException {
		realCallableStatement.setBigDecimal(parameterName, x);
	}

	@Override
	public void setBinaryStream(final int parameterIndex, final InputStream x) throws SQLException {
		realCallableStatement.setBinaryStream(parameterIndex, x);
	}

	@Override
	public void setBinaryStream(final int parameterIndex, final InputStream x, final int length) throws SQLException {
		realCallableStatement.setBinaryStream(parameterIndex, x, length);
	}

	@Override
	public void setBinaryStream(final int parameterIndex, final InputStream x, final long length) throws SQLException {
		realCallableStatement.setBinaryStream(parameterIndex, x, length);
	}

	@Override
	public void setBinaryStream(final String parameterName, final InputStream x) throws SQLException {
		realCallableStatement.setBinaryStream(parameterName, x);
	}

	@Override
	public void setBinaryStream(final String parameterName, final InputStream x, final int length) throws SQLException {
		realCallableStatement.setBinaryStream(parameterName, x, length);
	}

	@Override
	public void setBinaryStream(final String parameterName, final InputStream x, final long length)
			throws SQLException {
		realCallableStatement.setBinaryStream(parameterName, x, length);
	}

	@Override
	public void setBlob(final int parameterIndex, final Blob x) throws SQLException {
		realCallableStatement.setBlob(parameterIndex, x);
	}

	@Override
	public void setBlob(final int parameterIndex, final InputStream inputStream) throws SQLException {
		realCallableStatement.setBlob(parameterIndex, inputStream);
	}

	@Override
	public void setBlob(final int parameterIndex, final InputStream inputStream, final long length)
			throws SQLException {
		realCallableStatement.setBlob(parameterIndex, inputStream, length);
	}

	@Override
	public void setBlob(final String parameterName, final Blob x) throws SQLException {
		realCallableStatement.setBlob(parameterName, x);
	}

	@Override
	public void setBlob(final String parameterName, final InputStream inputStream) throws SQLException {
		realCallableStatement.setBlob(parameterName, inputStream);
	}

	@Override
	public void setBlob(final String parameterName, final InputStream inputStream, final long length)
			throws SQLException {
		realCallableStatement.setBlob(parameterName, inputStream, length);
	}

	@Override
	public void setBoolean(final int parameterIndex, final boolean x) throws SQLException {
		realCallableStatement.setBoolean(parameterIndex, x);
	}

	@Override
	public void setBoolean(final String parameterName, final boolean x) throws SQLException {
		realCallableStatement.setBoolean(parameterName, x);
	}

	@Override
	public void setByte(final int parameterIndex, final byte x) throws SQLException {
		realCallableStatement.setByte(parameterIndex, x);
	}

	@Override
	public void setByte(final String parameterName, final byte x) throws SQLException {
		realCallableStatement.setByte(parameterName, x);
	}

	@Override
	public void setBytes(final int parameterIndex, final byte[] x) throws SQLException {
		realCallableStatement.setBytes(parameterIndex, x);
	}

	@Override
	public void setBytes(final String parameterName, final byte[] x) throws SQLException {
		realCallableStatement.setBytes(parameterName, x);
	}

	@Override
	public void setCharacterStream(final int parameterIndex, final Reader reader) throws SQLException {
		realCallableStatement.setCharacterStream(parameterIndex, reader);
	}

	@Override
	public void setCharacterStream(final int parameterIndex, final Reader reader, final int length)
			throws SQLException {
		realCallableStatement.setCharacterStream(parameterIndex, reader, length);
	}

	@Override
	public void setCharacterStream(final int parameterIndex, final Reader reader, final long length)
			throws SQLException {
		realCallableStatement.setCharacterStream(parameterIndex, reader, length);
	}

	@Override
	public void setCharacterStream(final String parameterName, final Reader reader) throws SQLException {
		realCallableStatement.setCharacterStream(parameterName, reader);
	}

	@Override
	public void setCharacterStream(final String parameterName, final Reader reader, final int length)
			throws SQLException {
		realCallableStatement.setCharacterStream(parameterName, reader, length);
	}

	@Override
	public void setCharacterStream(final String parameterName, final Reader reader, final long length)
			throws SQLException {
		realCallableStatement.setCharacterStream(parameterName, reader, length);
	}

	@Override
	public void setClob(final int parameterIndex, final Clob x) throws SQLException {
		realCallableStatement.setClob(parameterIndex, x);
	}

	@Override
	public void setClob(final int parameterIndex, final Reader reader) throws SQLException {
		realCallableStatement.setClob(parameterIndex, reader);
	}

	@Override
	public void setClob(final int parameterIndex, final Reader reader, final long length) throws SQLException {
		realCallableStatement.setClob(parameterIndex, reader, length);
	}

	@Override
	public void setClob(final String parameterName, final Clob x) throws SQLException {
		realCallableStatement.setClob(parameterName, x);
	}

	@Override
	public void setClob(final String parameterName, final Reader reader) throws SQLException {
		realCallableStatement.setClob(parameterName, reader);
	}

	@Override
	public void setClob(final String parameterName, final Reader reader, final long length) throws SQLException {
		realCallableStatement.setClob(parameterName, reader, length);
	}

	@Override
	public void setCursorName(final String name) throws SQLException {
		realCallableStatement.setCursorName(name);
	}

	@Override
	public void setDate(final int parameterIndex, final Date x) throws SQLException {
		realCallableStatement.setDate(parameterIndex, x);
	}

	@Override
	public void setDate(final int parameterIndex, final Date x, final Calendar cal) throws SQLException {
		realCallableStatement.setDate(parameterIndex, x, cal);
	}

	@Override
	public void setDate(final String parameterName, final Date x) throws SQLException {
		realCallableStatement.setDate(parameterName, x);
	}

	@Override
	public void setDate(final String parameterName, final Date x, final Calendar cal) throws SQLException {
		realCallableStatement.setDate(parameterName, x, cal);
	}

	@Override
	public void setDouble(final int parameterIndex, final double x) throws SQLException {
		realCallableStatement.setDouble(parameterIndex, x);
	}

	@Override
	public void setDouble(final String parameterName, final double x) throws SQLException {
		realCallableStatement.setDouble(parameterName, x);
	}

	@Override
	public void setEscapeProcessing(final boolean enable) throws SQLException {
		realCallableStatement.setEscapeProcessing(enable);
	}

	@Override
	public void setFetchDirection(final int direction) throws SQLException {
		realCallableStatement.setFetchDirection(direction);
	}

	@Override
	public void setFetchSize(final int rows) throws SQLException {
		realCallableStatement.setFetchSize(rows);
	}

	@Override
	public void setFloat(final int parameterIndex, final float x) throws SQLException {
		realCallableStatement.setFloat(parameterIndex, x);
	}

	@Override
	public void setFloat(final String parameterName, final float x) throws SQLException {
		realCallableStatement.setFloat(parameterName, x);
	}

	@Override
	public void setInt(final int parameterIndex, final int x) throws SQLException {
		realCallableStatement.setInt(parameterIndex, x);
	}

	@Override
	public void setInt(final String parameterName, final int x) throws SQLException {
		realCallableStatement.setInt(parameterName, x);
	}

	@Override
	public void setLong(final int parameterIndex, final long x) throws SQLException {
		realCallableStatement.setLong(parameterIndex, x);
	}

	@Override
	public void setLong(final String parameterName, final long x) throws SQLException {
		realCallableStatement.setLong(parameterName, x);
	}

	@Override
	public void setMaxFieldSize(final int max) throws SQLException {
		realCallableStatement.setMaxFieldSize(max);
	}

	@Override
	public void setMaxRows(final int max) throws SQLException {
		realCallableStatement.setMaxRows(max);
	}

	@Override
	public void setNCharacterStream(final int parameterIndex, final Reader value) throws SQLException {
		realCallableStatement.setNCharacterStream(parameterIndex, value);
	}

	@Override
	public void setNCharacterStream(final int parameterIndex, final Reader value, final long length)
			throws SQLException {
		realCallableStatement.setNCharacterStream(parameterIndex, value, length);
	}

	@Override
	public void setNCharacterStream(final String parameterName, final Reader value) throws SQLException {
		realCallableStatement.setNCharacterStream(parameterName, value);
	}

	@Override
	public void setNCharacterStream(final String parameterName, final Reader value, final long length)
			throws SQLException {
		realCallableStatement.setNCharacterStream(parameterName, value, length);
	}

	@Override
	public void setNClob(final int parameterIndex, final NClob value) throws SQLException {
		realCallableStatement.setNClob(parameterIndex, value);
	}

	@Override
	public void setNClob(final int parameterIndex, final Reader reader) throws SQLException {
		realCallableStatement.setNClob(parameterIndex, reader);
	}

	@Override
	public void setNClob(final int parameterIndex, final Reader reader, final long length) throws SQLException {
		realCallableStatement.setNClob(parameterIndex, reader, length);
	}

	@Override
	public void setNClob(final String parameterName, final NClob value) throws SQLException {
		realCallableStatement.setNClob(parameterName, value);
	}

	@Override
	public void setNClob(final String parameterName, final Reader reader) throws SQLException {
		realCallableStatement.setNClob(parameterName, reader);
	}

	@Override
	public void setNClob(final String parameterName, final Reader reader, final long length) throws SQLException {
		realCallableStatement.setNClob(parameterName, reader, length);
	}

	@Override
	public void setNString(final int parameterIndex, final String value) throws SQLException {
		realCallableStatement.setNString(parameterIndex, value);
	}

	@Override
	public void setNString(final String parameterName, final String value) throws SQLException {
		realCallableStatement.setNString(parameterName, value);
	}

	@Override
	public void setNull(final int parameterIndex, final int sqlType) throws SQLException {
		realCallableStatement.setNull(parameterIndex, sqlType);
	}

	@Override
	public void setNull(final int parameterIndex, final int sqlType, final String typeName) throws SQLException {
		realCallableStatement.setNull(parameterIndex, sqlType, typeName);
	}

	@Override
	public void setNull(final String parameterName, final int sqlType) throws SQLException {
		realCallableStatement.setNull(parameterName, sqlType);
	}

	@Override
	public void setNull(final String parameterName, final int sqlType, final String typeName) throws SQLException {
		realCallableStatement.setNull(parameterName, sqlType, typeName);
	}

	@Override
	public void setObject(final int parameterIndex, final Object x) throws SQLException {
		realCallableStatement.setObject(parameterIndex, x);
	}

	@Override
	public void setObject(final int parameterIndex, final Object x, final int targetSqlType) throws SQLException {
		realCallableStatement.setObject(parameterIndex, x, targetSqlType);
	}

	@Override
	public void setObject(final int parameterIndex, final Object x, final int targetSqlType, final int scaleOrLength)
			throws SQLException {
		realCallableStatement.setObject(parameterIndex, x, targetSqlType, scaleOrLength);
	}

	@Override
	public void setObject(final String parameterName, final Object x) throws SQLException {
		realCallableStatement.setObject(parameterName, x);
	}

	@Override
	public void setObject(final String parameterName, final Object x, final int targetSqlType) throws SQLException {
		realCallableStatement.setObject(parameterName, x, targetSqlType);
	}

	@Override
	public void setObject(final String parameterName, final Object x, final int targetSqlType, final int scale)
			throws SQLException {
		realCallableStatement.setObject(parameterName, x, targetSqlType, scale);
	}

	@Override
	public void setPoolable(final boolean poolable) throws SQLException {
		realCallableStatement.setPoolable(poolable);
	}

	@Override
	public void setQueryTimeout(final int seconds) throws SQLException {
		realCallableStatement.setQueryTimeout(seconds);
	}

	@Override
	public void setRef(final int parameterIndex, final Ref x) throws SQLException {
		realCallableStatement.setRef(parameterIndex, x);
	}

	@Override
	public void setRowId(final int parameterIndex, final RowId x) throws SQLException {
		realCallableStatement.setRowId(parameterIndex, x);
	}

	@Override
	public void setRowId(final String parameterName, final RowId x) throws SQLException {
		realCallableStatement.setRowId(parameterName, x);
	}

	@Override
	public void setShort(final int parameterIndex, final short x) throws SQLException {
		realCallableStatement.setShort(parameterIndex, x);
	}

	@Override
	public void setShort(final String parameterName, final short x) throws SQLException {
		realCallableStatement.setShort(parameterName, x);
	}

	@Override
	public void setSQLXML(final int parameterIndex, final SQLXML xmlObject) throws SQLException {
		realCallableStatement.setSQLXML(parameterIndex, xmlObject);
	}

	@Override
	public void setSQLXML(final String parameterName, final SQLXML xmlObject) throws SQLException {
		realCallableStatement.setSQLXML(parameterName, xmlObject);
	}

	@Override
	public void setString(final int parameterIndex, final String x) throws SQLException {
		realCallableStatement.setString(parameterIndex, x);
	}

	@Override
	public void setString(final String parameterName, final String x) throws SQLException {
		realCallableStatement.setString(parameterName, x);
	}

	@Override
	public void setTime(final int parameterIndex, final Time x) throws SQLException {
		realCallableStatement.setTime(parameterIndex, x);
	}

	@Override
	public void setTime(final int parameterIndex, final Time x, final Calendar cal) throws SQLException {
		realCallableStatement.setTime(parameterIndex, x, cal);
	}

	@Override
	public void setTime(final String parameterName, final Time x) throws SQLException {
		realCallableStatement.setTime(parameterName, x);
	}

	@Override
	public void setTime(final String parameterName, final Time x, final Calendar cal) throws SQLException {
		realCallableStatement.setTime(parameterName, x, cal);
	}

	@Override
	public void setTimestamp(final int parameterIndex, final Timestamp x) throws SQLException {
		realCallableStatement.setTimestamp(parameterIndex, x);
	}

	@Override
	public void setTimestamp(final int parameterIndex, final Timestamp x, final Calendar cal) throws SQLException {
		realCallableStatement.setTimestamp(parameterIndex, x, cal);
	}

	@Override
	public void setTimestamp(final String parameterName, final Timestamp x) throws SQLException {
		realCallableStatement.setTimestamp(parameterName, x);
	}

	@Override
	public void setTimestamp(final String parameterName, final Timestamp x, final Calendar cal) throws SQLException {
		realCallableStatement.setTimestamp(parameterName, x, cal);
	}

	@Override
	public void setUnicodeStream(final int parameterIndex, final InputStream x, final int length) throws SQLException {
		realCallableStatement.setUnicodeStream(parameterIndex, x, length);
	}

	@Override
	public void setURL(final int parameterIndex, final URL x) throws SQLException {
		realCallableStatement.setURL(parameterIndex, x);
	}

	@Override
	public void setURL(final String parameterName, final URL val) throws SQLException {
		realCallableStatement.setURL(parameterName, val);
	}

	@Override
	public <T> T unwrap(final Class<T> iface) throws SQLException {
		return realCallableStatement.unwrap(iface);
	}

	@Override
	public boolean wasNull() throws SQLException {
		return realCallableStatement.wasNull();
	}

}
