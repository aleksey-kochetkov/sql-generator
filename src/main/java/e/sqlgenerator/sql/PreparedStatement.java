package e.sqlgenerator.sql;

import java.math.BigDecimal;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;
import java.util.Calendar;
import java.net.URL;
import java.sql.Timestamp;
import java.sql.Date;
import java.sql.Time;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.NClob;
import java.sql.SQLXML;
import java.sql.Ref;
import java.sql.ParameterMetaData;
import java.sql.ResultSetMetaData;
import java.sql.RowId;

public class PreparedStatement extends Statement implements java.sql.PreparedStatement {
    private String sql;

    public PreparedStatement(List<String> statements, String sql) {
        super(statements);
        this.sql = sql;
    }

    @Override
    public java.sql.ResultSet executeQuery() {
        statements.add(sql);
        return new ResultSet();
    }

    @Override
    public int executeUpdate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNull(int parameterIndex, int sqlType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setBoolean(int parameterIndex, boolean x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setByte(int parameterIndex, byte x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setShort(int parameterIndex, short x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setInt(int parameterIndex, int x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setLong(int parameterIndex, long x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFloat(int parameterIndex, float x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setDouble(int parameterIndex, double x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setBigDecimal(int parameterIndex, BigDecimal x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setString(int parameterIndex, String x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setBytes(int parameterIndex, byte[] x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setDate(int parameterIndex, Date x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setTime(int parameterIndex, Time x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, int length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setUnicodeStream(int parameterIndex, InputStream x, int length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x, int length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clearParameters() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setObject(int parameterIndex, Object x, int targetSqlType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setObject(int parameterIndex, Object x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean execute() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addBatch() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader, int length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setRef(int parameterIndex, Ref x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setBlob(int parameterIndex, Blob x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setClob(int parameterIndex, Clob x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setArray(int parameterIndex, Array x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ResultSetMetaData getMetaData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setDate(int parameterIndex, Date x, Calendar cal) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setTime(int parameterIndex, Time x, Calendar cal) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNull(int parameterIndex, int sqlType, String typeName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setURL(int parameterIndex, URL x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ParameterMetaData getParameterMetaData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setRowId(int parameterIndex, RowId x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNString(int parameterIndex, String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNCharacterStream(int parameterIndex, Reader value, long length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNClob(int parameterIndex, NClob value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setClob(int parameterIndex, Reader reader, long length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setBlob(int parameterIndex, InputStream inputStream, long length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNClob(int parameterIndex, Reader reader, long length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setSQLXML(int parameterIndex, SQLXML xmlObject) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, long length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x, long length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader, long length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNCharacterStream(int parameterIndex, Reader value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setClob(int parameterIndex, Reader reader) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setBlob(int parameterIndex, InputStream inputStream) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNClob(int parameterIndex, Reader reader) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
