package com.company.jdbc;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

public class ResultSetSpy implements ResultSet {

	private ResultSet realResultSet;

	public ResultSetSpy(final ResultSet realResultSet) {
		super();
		this.realResultSet = realResultSet;
	}

	@Override
	public boolean absolute(final int row) throws SQLException {
		return realResultSet.absolute(row);
	}

	@Override
	public void afterLast() throws SQLException {
		realResultSet.afterLast();
	}

	@Override
	public void beforeFirst() throws SQLException {
		realResultSet.beforeFirst();
	}

	@Override
	public void cancelRowUpdates() throws SQLException {
		realResultSet.cancelRowUpdates();
	}

	@Override
	public void clearWarnings() throws SQLException {
		realResultSet.clearWarnings();
	}

	@Override
	public void close() throws SQLException {
		realResultSet.close();
	}

	@Override
	public void deleteRow() throws SQLException {
		realResultSet.deleteRow();
	}

	@Override
	public int findColumn(final String columnLabel) throws SQLException {
		return realResultSet.findColumn(columnLabel);
	}

	@Override
	public boolean first() throws SQLException {
		return realResultSet.first();
	}

	@Override
	public Array getArray(final int columnIndex) throws SQLException {
		return realResultSet.getArray(columnIndex);
	}

	@Override
	public Array getArray(final String columnLabel) throws SQLException {
		return realResultSet.getArray(columnLabel);
	}

	@Override
	public InputStream getAsciiStream(final int columnIndex) throws SQLException {
		return realResultSet.getAsciiStream(columnIndex);
	}

	@Override
	public InputStream getAsciiStream(final String columnLabel) throws SQLException {
		return realResultSet.getAsciiStream(columnLabel);
	}

	@Override
	public BigDecimal getBigDecimal(final int columnIndex) throws SQLException {
		return realResultSet.getBigDecimal(columnIndex);
	}

	@Override
	public BigDecimal getBigDecimal(final int columnIndex, final int scale) throws SQLException {
		return realResultSet.getBigDecimal(columnIndex, scale);
	}

	@Override
	public BigDecimal getBigDecimal(final String columnLabel) throws SQLException {
		return realResultSet.getBigDecimal(columnLabel);
	}

	@Override
	public BigDecimal getBigDecimal(final String columnLabel, final int scale) throws SQLException {
		return realResultSet.getBigDecimal(columnLabel, scale);
	}

	@Override
	public InputStream getBinaryStream(final int columnIndex) throws SQLException {
		return realResultSet.getBinaryStream(columnIndex);
	}

	@Override
	public InputStream getBinaryStream(final String columnLabel) throws SQLException {
		return realResultSet.getBinaryStream(columnLabel);
	}

	@Override
	public Blob getBlob(final int columnIndex) throws SQLException {
		return realResultSet.getBlob(columnIndex);
	}

	@Override
	public Blob getBlob(final String columnLabel) throws SQLException {
		return realResultSet.getBlob(columnLabel);
	}

	@Override
	public boolean getBoolean(final int columnIndex) throws SQLException {
		return realResultSet.getBoolean(columnIndex);
	}

	@Override
	public boolean getBoolean(final String columnLabel) throws SQLException {
		return realResultSet.getBoolean(columnLabel);
	}

	@Override
	public byte getByte(final int columnIndex) throws SQLException {
		return realResultSet.getByte(columnIndex);
	}

	@Override
	public byte getByte(final String columnLabel) throws SQLException {
		return realResultSet.getByte(columnLabel);
	}

	@Override
	public byte[] getBytes(final int columnIndex) throws SQLException {
		return realResultSet.getBytes(columnIndex);
	}

	@Override
	public byte[] getBytes(final String columnLabel) throws SQLException {
		return realResultSet.getBytes(columnLabel);
	}

	@Override
	public Reader getCharacterStream(final int columnIndex) throws SQLException {
		return realResultSet.getCharacterStream(columnIndex);
	}

	@Override
	public Reader getCharacterStream(final String columnLabel) throws SQLException {
		return realResultSet.getCharacterStream(columnLabel);
	}

	@Override
	public Clob getClob(final int columnIndex) throws SQLException {
		return realResultSet.getClob(columnIndex);
	}

	@Override
	public Clob getClob(final String columnLabel) throws SQLException {
		return realResultSet.getClob(columnLabel);
	}

	@Override
	public int getConcurrency() throws SQLException {
		return realResultSet.getConcurrency();
	}

	@Override
	public String getCursorName() throws SQLException {
		return realResultSet.getCursorName();
	}

	@Override
	public Date getDate(final int columnIndex) throws SQLException {
		return realResultSet.getDate(columnIndex);
	}

	@Override
	public Date getDate(final int columnIndex, final Calendar cal) throws SQLException {
		return realResultSet.getDate(columnIndex, cal);
	}

	@Override
	public Date getDate(final String columnLabel) throws SQLException {
		return realResultSet.getDate(columnLabel);
	}

	@Override
	public Date getDate(final String columnLabel, final Calendar cal) throws SQLException {
		return realResultSet.getDate(columnLabel, cal);
	}

	@Override
	public double getDouble(final int columnIndex) throws SQLException {
		return realResultSet.getDouble(columnIndex);
	}

	@Override
	public double getDouble(final String columnLabel) throws SQLException {
		return realResultSet.getDouble(columnLabel);
	}

	@Override
	public int getFetchDirection() throws SQLException {
		return realResultSet.getFetchDirection();
	}

	@Override
	public int getFetchSize() throws SQLException {
		return realResultSet.getFetchSize();
	}

	@Override
	public float getFloat(final int columnIndex) throws SQLException {
		return realResultSet.getFloat(columnIndex);
	}

	@Override
	public float getFloat(final String columnLabel) throws SQLException {
		return realResultSet.getFloat(columnLabel);
	}

	@Override
	public int getHoldability() throws SQLException {
		return realResultSet.getHoldability();
	}

	@Override
	public int getInt(final int columnIndex) throws SQLException {
		return realResultSet.getInt(columnIndex);
	}

	@Override
	public int getInt(final String columnLabel) throws SQLException {
		return realResultSet.getInt(columnLabel);
	}

	@Override
	public long getLong(final int columnIndex) throws SQLException {
		return realResultSet.getLong(columnIndex);
	}

	@Override
	public long getLong(final String columnLabel) throws SQLException {
		return realResultSet.getLong(columnLabel);
	}

	@Override
	public ResultSetMetaData getMetaData() throws SQLException {
		return realResultSet.getMetaData();
	}

	@Override
	public Reader getNCharacterStream(final int columnIndex) throws SQLException {
		return realResultSet.getNCharacterStream(columnIndex);
	}

	@Override
	public Reader getNCharacterStream(final String columnLabel) throws SQLException {
		return realResultSet.getNCharacterStream(columnLabel);
	}

	@Override
	public NClob getNClob(final int columnIndex) throws SQLException {
		return realResultSet.getNClob(columnIndex);
	}

	@Override
	public NClob getNClob(final String columnLabel) throws SQLException {
		return realResultSet.getNClob(columnLabel);
	}

	@Override
	public String getNString(final int columnIndex) throws SQLException {
		return realResultSet.getNString(columnIndex);
	}

	@Override
	public String getNString(final String columnLabel) throws SQLException {
		return realResultSet.getNString(columnLabel);
	}

	@Override
	public Object getObject(final int columnIndex) throws SQLException {
		return realResultSet.getObject(columnIndex);
	}

	@Override
	public Object getObject(final int columnIndex, final Map<String, Class<?>> map) throws SQLException {
		return realResultSet.getObject(columnIndex, map);
	}

	@Override
	public Object getObject(final String columnLabel) throws SQLException {
		return realResultSet.getObject(columnLabel);
	}

	@Override
	public Object getObject(final String columnLabel, final Map<String, Class<?>> map) throws SQLException {
		return realResultSet.getObject(columnLabel, map);
	}

	@Override
	public Ref getRef(final int columnIndex) throws SQLException {
		return realResultSet.getRef(columnIndex);
	}

	@Override
	public Ref getRef(final String columnLabel) throws SQLException {
		return realResultSet.getRef(columnLabel);
	}

	@Override
	public int getRow() throws SQLException {
		return realResultSet.getRow();
	}

	@Override
	public RowId getRowId(final int columnIndex) throws SQLException {
		return realResultSet.getRowId(columnIndex);
	}

	@Override
	public RowId getRowId(final String columnLabel) throws SQLException {
		return realResultSet.getRowId(columnLabel);
	}

	@Override
	public short getShort(final int columnIndex) throws SQLException {
		return realResultSet.getShort(columnIndex);
	}

	@Override
	public short getShort(final String columnLabel) throws SQLException {
		return realResultSet.getShort(columnLabel);
	}

	@Override
	public SQLXML getSQLXML(final int columnIndex) throws SQLException {
		return realResultSet.getSQLXML(columnIndex);
	}

	@Override
	public SQLXML getSQLXML(final String columnLabel) throws SQLException {
		return realResultSet.getSQLXML(columnLabel);
	}

	@Override
	public Statement getStatement() throws SQLException {
		return realResultSet.getStatement();
	}

	@Override
	public String getString(final int columnIndex) throws SQLException {
		return realResultSet.getString(columnIndex);
	}

	@Override
	public String getString(final String columnLabel) throws SQLException {
		return realResultSet.getString(columnLabel);
	}

	@Override
	public Time getTime(final int columnIndex) throws SQLException {
		return realResultSet.getTime(columnIndex);
	}

	@Override
	public Time getTime(final int columnIndex, final Calendar cal) throws SQLException {
		return realResultSet.getTime(columnIndex, cal);
	}

	@Override
	public Time getTime(final String columnLabel) throws SQLException {
		return realResultSet.getTime(columnLabel);
	}

	@Override
	public Time getTime(final String columnLabel, final Calendar cal) throws SQLException {
		return realResultSet.getTime(columnLabel, cal);
	}

	@Override
	public Timestamp getTimestamp(final int columnIndex) throws SQLException {
		return realResultSet.getTimestamp(columnIndex);
	}

	@Override
	public Timestamp getTimestamp(final int columnIndex, final Calendar cal) throws SQLException {
		return realResultSet.getTimestamp(columnIndex, cal);
	}

	@Override
	public Timestamp getTimestamp(final String columnLabel) throws SQLException {
		return realResultSet.getTimestamp(columnLabel);
	}

	@Override
	public Timestamp getTimestamp(final String columnLabel, final Calendar cal) throws SQLException {
		return realResultSet.getTimestamp(columnLabel, cal);
	}

	@Override
	public int getType() throws SQLException {
		return realResultSet.getType();
	}

	@Override
	public InputStream getUnicodeStream(final int columnIndex) throws SQLException {
		return realResultSet.getUnicodeStream(columnIndex);
	}

	@Override
	public InputStream getUnicodeStream(final String columnLabel) throws SQLException {
		return realResultSet.getUnicodeStream(columnLabel);
	}

	@Override
	public URL getURL(final int columnIndex) throws SQLException {
		return realResultSet.getURL(columnIndex);
	}

	@Override
	public URL getURL(final String columnLabel) throws SQLException {
		return realResultSet.getURL(columnLabel);
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		return realResultSet.getWarnings();
	}

	@Override
	public void insertRow() throws SQLException {
		realResultSet.insertRow();
	}

	@Override
	public boolean isAfterLast() throws SQLException {
		return realResultSet.isAfterLast();
	}

	@Override
	public boolean isBeforeFirst() throws SQLException {
		return realResultSet.isBeforeFirst();
	}

	@Override
	public boolean isClosed() throws SQLException {
		return realResultSet.isClosed();
	}

	@Override
	public boolean isFirst() throws SQLException {
		return realResultSet.isFirst();
	}

	@Override
	public boolean isLast() throws SQLException {
		return realResultSet.isLast();
	}

	@Override
	public boolean isWrapperFor(final Class<?> iface) throws SQLException {
		return realResultSet.isWrapperFor(iface);
	}

	@Override
	public boolean last() throws SQLException {
		return realResultSet.last();
	}

	@Override
	public void moveToCurrentRow() throws SQLException {
		realResultSet.moveToCurrentRow();
	}

	@Override
	public void moveToInsertRow() throws SQLException {
		realResultSet.moveToInsertRow();
	}

	@Override
	public boolean next() throws SQLException {
		return realResultSet.next();
	}

	@Override
	public boolean previous() throws SQLException {
		return realResultSet.previous();
	}

	@Override
	public void refreshRow() throws SQLException {
		realResultSet.refreshRow();
	}

	@Override
	public boolean relative(final int rows) throws SQLException {
		return realResultSet.relative(rows);
	}

	@Override
	public boolean rowDeleted() throws SQLException {
		return realResultSet.rowDeleted();
	}

	@Override
	public boolean rowInserted() throws SQLException {
		return realResultSet.rowInserted();
	}

	@Override
	public boolean rowUpdated() throws SQLException {
		return realResultSet.rowUpdated();
	}

	@Override
	public void setFetchDirection(final int direction) throws SQLException {
		realResultSet.setFetchDirection(direction);
	}

	@Override
	public void setFetchSize(final int rows) throws SQLException {
		realResultSet.setFetchSize(rows);
	}

	@Override
	public <T> T unwrap(final Class<T> iface) throws SQLException {
		return realResultSet.unwrap(iface);
	}

	@Override
	public void updateArray(final int columnIndex, final Array x) throws SQLException {
		realResultSet.updateArray(columnIndex, x);
	}

	@Override
	public void updateArray(final String columnLabel, final Array x) throws SQLException {
		realResultSet.updateArray(columnLabel, x);
	}

	@Override
	public void updateAsciiStream(final int columnIndex, final InputStream x) throws SQLException {
		realResultSet.updateAsciiStream(columnIndex, x);
	}

	@Override
	public void updateAsciiStream(final int columnIndex, final InputStream x, final int length) throws SQLException {
		realResultSet.updateAsciiStream(columnIndex, x, length);
	}

	@Override
	public void updateAsciiStream(final int columnIndex, final InputStream x, final long length) throws SQLException {
		realResultSet.updateAsciiStream(columnIndex, x, length);
	}

	@Override
	public void updateAsciiStream(final String columnLabel, final InputStream x) throws SQLException {
		realResultSet.updateAsciiStream(columnLabel, x);
	}

	@Override
	public void updateAsciiStream(final String columnLabel, final InputStream x, final int length) throws SQLException {
		realResultSet.updateAsciiStream(columnLabel, x, length);
	}

	@Override
	public void updateAsciiStream(final String columnLabel, final InputStream x, final long length) throws SQLException {
		realResultSet.updateAsciiStream(columnLabel, x, length);
	}

	@Override
	public void updateBigDecimal(final int columnIndex, final BigDecimal x) throws SQLException {
		realResultSet.updateBigDecimal(columnIndex, x);
	}

	@Override
	public void updateBigDecimal(final String columnLabel, final BigDecimal x) throws SQLException {
		realResultSet.updateBigDecimal(columnLabel, x);
	}

	@Override
	public void updateBinaryStream(final int columnIndex, final InputStream x) throws SQLException {
		realResultSet.updateBinaryStream(columnIndex, x);
	}

	@Override
	public void updateBinaryStream(final int columnIndex, final InputStream x, final int length) throws SQLException {
		realResultSet.updateBinaryStream(columnIndex, x, length);
	}

	@Override
	public void updateBinaryStream(final int columnIndex, final InputStream x, final long length) throws SQLException {
		realResultSet.updateBinaryStream(columnIndex, x, length);
	}

	@Override
	public void updateBinaryStream(final String columnLabel, final InputStream x) throws SQLException {
		realResultSet.updateBinaryStream(columnLabel, x);
	}

	@Override
	public void updateBinaryStream(final String columnLabel, final InputStream x, final int length) throws SQLException {
		realResultSet.updateBinaryStream(columnLabel, x, length);
	}

	@Override
	public void updateBinaryStream(final String columnLabel, final InputStream x, final long length) throws SQLException {
		realResultSet.updateBinaryStream(columnLabel, x, length);
	}

	@Override
	public void updateBlob(final int columnIndex, final Blob x) throws SQLException {
		realResultSet.updateBlob(columnIndex, x);
	}

	@Override
	public void updateBlob(final int columnIndex, final InputStream inputStream) throws SQLException {
		realResultSet.updateBlob(columnIndex, inputStream);
	}

	@Override
	public void updateBlob(final int columnIndex, final InputStream inputStream, final long length) throws SQLException {
		realResultSet.updateBlob(columnIndex, inputStream, length);
	}

	@Override
	public void updateBlob(final String columnLabel, final Blob x) throws SQLException {
		realResultSet.updateBlob(columnLabel, x);
	}

	@Override
	public void updateBlob(final String columnLabel, final InputStream inputStream) throws SQLException {
		realResultSet.updateBlob(columnLabel, inputStream);
	}

	@Override
	public void updateBlob(final String columnLabel, final InputStream inputStream, final long length) throws SQLException {
		realResultSet.updateBlob(columnLabel, inputStream, length);
	}

	@Override
	public void updateBoolean(final int columnIndex, final boolean x) throws SQLException {
		realResultSet.updateBoolean(columnIndex, x);
	}

	@Override
	public void updateBoolean(final String columnLabel, final boolean x) throws SQLException {
		realResultSet.updateBoolean(columnLabel, x);
	}

	@Override
	public void updateByte(final int columnIndex, final byte x) throws SQLException {
		realResultSet.updateByte(columnIndex, x);
	}

	@Override
	public void updateByte(final String columnLabel, final byte x) throws SQLException {
		realResultSet.updateByte(columnLabel, x);
	}

	@Override
	public void updateBytes(final int columnIndex, final byte[] x) throws SQLException {
		realResultSet.updateBytes(columnIndex, x);
	}

	@Override
	public void updateBytes(final String columnLabel, final byte[] x) throws SQLException {
		realResultSet.updateBytes(columnLabel, x);
	}

	@Override
	public void updateCharacterStream(final int columnIndex, final Reader x) throws SQLException {
		realResultSet.updateCharacterStream(columnIndex, x);
	}

	@Override
	public void updateCharacterStream(final int columnIndex, final Reader x, final int length) throws SQLException {
		realResultSet.updateCharacterStream(columnIndex, x, length);
	}

	@Override
	public void updateCharacterStream(final int columnIndex, final Reader x, final long length) throws SQLException {
		realResultSet.updateCharacterStream(columnIndex, x, length);
	}

	@Override
	public void updateCharacterStream(final String columnLabel, final Reader reader) throws SQLException {
		realResultSet.updateCharacterStream(columnLabel, reader);
	}

	@Override
	public void updateCharacterStream(final String columnLabel, final Reader reader, final int length) throws SQLException {
		realResultSet.updateCharacterStream(columnLabel, reader, length);
	}

	@Override
	public void updateCharacterStream(final String columnLabel, final Reader reader, final long length) throws SQLException {
		realResultSet.updateCharacterStream(columnLabel, reader, length);
	}

	@Override
	public void updateClob(final int columnIndex, final Clob x) throws SQLException {
		realResultSet.updateClob(columnIndex, x);
	}

	@Override
	public void updateClob(final int columnIndex, final Reader reader) throws SQLException {
		realResultSet.updateClob(columnIndex, reader);
	}

	@Override
	public void updateClob(final int columnIndex, final Reader reader, final long length) throws SQLException {
		realResultSet.updateClob(columnIndex, reader, length);
	}

	@Override
	public void updateClob(final String columnLabel, final Clob x) throws SQLException {
		realResultSet.updateClob(columnLabel, x);
	}

	@Override
	public void updateClob(final String columnLabel, final Reader reader) throws SQLException {
		realResultSet.updateClob(columnLabel, reader);
	}

	@Override
	public void updateClob(final String columnLabel, final Reader reader, final long length) throws SQLException {
		realResultSet.updateClob(columnLabel, reader, length);
	}

	@Override
	public void updateDate(final int columnIndex, final Date x) throws SQLException {
		realResultSet.updateDate(columnIndex, x);
	}

	@Override
	public void updateDate(final String columnLabel, final Date x) throws SQLException {
		realResultSet.updateDate(columnLabel, x);
	}

	@Override
	public void updateDouble(final int columnIndex, final double x) throws SQLException {
		realResultSet.updateDouble(columnIndex, x);
	}

	@Override
	public void updateDouble(final String columnLabel, final double x) throws SQLException {
		realResultSet.updateDouble(columnLabel, x);
	}

	@Override
	public void updateFloat(final int columnIndex, final float x) throws SQLException {
		realResultSet.updateFloat(columnIndex, x);
	}

	@Override
	public void updateFloat(final String columnLabel, final float x) throws SQLException {
		realResultSet.updateFloat(columnLabel, x);
	}

	@Override
	public void updateInt(final int columnIndex, final int x) throws SQLException {
		realResultSet.updateInt(columnIndex, x);
	}

	@Override
	public void updateInt(final String columnLabel, final int x) throws SQLException {
		realResultSet.updateInt(columnLabel, x);
	}

	@Override
	public void updateLong(final int columnIndex, final long x) throws SQLException {
		realResultSet.updateLong(columnIndex, x);
	}

	@Override
	public void updateLong(final String columnLabel, final long x) throws SQLException {
		realResultSet.updateLong(columnLabel, x);
	}

	@Override
	public void updateNCharacterStream(final int columnIndex, final Reader x) throws SQLException {
		realResultSet.updateNCharacterStream(columnIndex, x);
	}

	@Override
	public void updateNCharacterStream(final int columnIndex, final Reader x, final long length) throws SQLException {
		realResultSet.updateNCharacterStream(columnIndex, x, length);
	}

	@Override
	public void updateNCharacterStream(final String columnLabel, final Reader reader) throws SQLException {
		realResultSet.updateNCharacterStream(columnLabel, reader);
	}

	@Override
	public void updateNCharacterStream(final String columnLabel, final Reader reader, final long length) throws SQLException {
		realResultSet.updateNCharacterStream(columnLabel, reader, length);
	}

	@Override
	public void updateNClob(final int columnIndex, final NClob nClob) throws SQLException {
		realResultSet.updateNClob(columnIndex, nClob);
	}

	@Override
	public void updateNClob(final int columnIndex, final Reader reader) throws SQLException {
		realResultSet.updateNClob(columnIndex, reader);
	}

	@Override
	public void updateNClob(final int columnIndex, final Reader reader, final long length) throws SQLException {
		realResultSet.updateNClob(columnIndex, reader, length);
	}

	@Override
	public void updateNClob(final String columnLabel, final NClob nClob) throws SQLException {
		realResultSet.updateNClob(columnLabel, nClob);
	}

	@Override
	public void updateNClob(final String columnLabel, final Reader reader) throws SQLException {
		realResultSet.updateNClob(columnLabel, reader);
	}

	@Override
	public void updateNClob(final String columnLabel, final Reader reader, final long length) throws SQLException {
		realResultSet.updateNClob(columnLabel, reader, length);
	}

	@Override
	public void updateNString(final int columnIndex, final String nString) throws SQLException {
		realResultSet.updateNString(columnIndex, nString);
	}

	@Override
	public void updateNString(final String columnLabel, final String nString) throws SQLException {
		realResultSet.updateNString(columnLabel, nString);
	}

	@Override
	public void updateNull(final int columnIndex) throws SQLException {
		realResultSet.updateNull(columnIndex);
	}

	@Override
	public void updateNull(final String columnLabel) throws SQLException {
		realResultSet.updateNull(columnLabel);
	}

	@Override
	public void updateObject(final int columnIndex, final Object x) throws SQLException {
		realResultSet.updateObject(columnIndex, x);
	}

	@Override
	public void updateObject(final int columnIndex, final Object x, final int scaleOrLength) throws SQLException {
		realResultSet.updateObject(columnIndex, x, scaleOrLength);
	}

	@Override
	public void updateObject(final String columnLabel, final Object x) throws SQLException {
		realResultSet.updateObject(columnLabel, x);
	}

	@Override
	public void updateObject(final String columnLabel, final Object x, final int scaleOrLength) throws SQLException {
		realResultSet.updateObject(columnLabel, x, scaleOrLength);
	}

	@Override
	public void updateRef(final int columnIndex, final Ref x) throws SQLException {
		realResultSet.updateRef(columnIndex, x);
	}

	@Override
	public void updateRef(final String columnLabel, final Ref x) throws SQLException {
		realResultSet.updateRef(columnLabel, x);
	}

	@Override
	public void updateRow() throws SQLException {
		realResultSet.updateRow();
	}

	@Override
	public void updateRowId(final int columnIndex, final RowId x) throws SQLException {
		realResultSet.updateRowId(columnIndex, x);
	}

	@Override
	public void updateRowId(final String columnLabel, final RowId x) throws SQLException {
		realResultSet.updateRowId(columnLabel, x);
	}

	@Override
	public void updateShort(final int columnIndex, final short x) throws SQLException {
		realResultSet.updateShort(columnIndex, x);
	}

	@Override
	public void updateShort(final String columnLabel, final short x) throws SQLException {
		realResultSet.updateShort(columnLabel, x);
	}

	@Override
	public void updateSQLXML(final int columnIndex, final SQLXML xmlObject) throws SQLException {
		realResultSet.updateSQLXML(columnIndex, xmlObject);
	}

	@Override
	public void updateSQLXML(final String columnLabel, final SQLXML xmlObject) throws SQLException {
		realResultSet.updateSQLXML(columnLabel, xmlObject);
	}

	@Override
	public void updateString(final int columnIndex, final String x) throws SQLException {
		realResultSet.updateString(columnIndex, x);
	}

	@Override
	public void updateString(final String columnLabel, final String x) throws SQLException {
		realResultSet.updateString(columnLabel, x);
	}

	@Override
	public void updateTime(final int columnIndex, final Time x) throws SQLException {
		realResultSet.updateTime(columnIndex, x);
	}

	@Override
	public void updateTime(final String columnLabel, final Time x) throws SQLException {
		realResultSet.updateTime(columnLabel, x);
	}

	@Override
	public void updateTimestamp(final int columnIndex, final Timestamp x) throws SQLException {
		realResultSet.updateTimestamp(columnIndex, x);
	}

	@Override
	public void updateTimestamp(final String columnLabel, final Timestamp x) throws SQLException {
		realResultSet.updateTimestamp(columnLabel, x);
	}

	@Override
	public boolean wasNull() throws SQLException {
		return realResultSet.wasNull();
	}

}
