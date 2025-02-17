package e.sqlgenerator.sql;

import java.util.Properties;
import java.util.concurrent.Executor;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.NClob;
import java.sql.Array;
import java.sql.Struct;
import java.sql.SQLXML;

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
}
