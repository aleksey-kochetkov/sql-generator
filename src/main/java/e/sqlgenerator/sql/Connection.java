package e.sqlgenerator.sql;

import java.util.Properties;
import java.util.Map;
import java.util.concurrent.Executor;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.NClob;
import java.sql.Array;
import java.sql.Struct;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.SQLWarning;

public class Connection implements java.sql.Connection {
    private int networkTimeout;

    @Override
    public Properties getClientInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getClientInfo(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setClientInfo(Properties properties) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setClientInfo(String name, String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getNetworkTimeout() {
        return networkTimeout;
    }

    @Override
    public void setNetworkTimeout(Executor executor, int networkTimeout) {
        this.networkTimeout = networkTimeout;
    }

    @Override
    public boolean isValid(int timeout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void abort(Executor executor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getSchema() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setSchema(String schema) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Blob createBlob() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Clob createClob() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NClob createNClob() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Array createArrayOf(String typeName, Object[] elements) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Struct createStruct(String typeName, Object[] attributes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SQLXML createSQLXML() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.DatabaseMetaData getMetaData() {
        return databaseMetaData;
    }

    @Override
    public Map<String, Class<?>> getTypeMap() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setTypeMap(Map<String, Class<?>> map) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isReadOnly() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setReadOnly(boolean readOnly) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getCatalog() {
        return null;
    }

    @Override
    public void setCatalog(String catalog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getTransactionIsolation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setTransactionIsolation(int level) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getHoldability() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setHoldability(int holdability) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Savepoint setSavepoint() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Savepoint setSavepoint(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void releaseSavepoint(Savepoint savepoint) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rollback(Savepoint savepoint) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.Statement createStatement(int resultSetType,
                    int resultSetConcurrency, int resultSetHoldability) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.Statement createStatement(
                           int resultSetType, int resultSetConcurrency) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.PreparedStatement prepareStatement(String sql, String[] columnNames) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.PreparedStatement prepareStatement(String sql, int[] columnIndexes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.PreparedStatement prepareStatement(
               String sql, int resultSetType, int resultSetConcurrency,
                                              int resultSetHoldability) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.PreparedStatement prepareStatement(
               String sql, int resultSetType, int resultSetConcurrency) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.CallableStatement prepareCall(
               String sql, int resultSetType, int resultSetConcurrency,
                                              int resultSetHoldability) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.CallableStatement prepareCall(
               String sql, int resultSetType, int resultSetConcurrency) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SQLWarning getWarnings() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clearWarnings() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
