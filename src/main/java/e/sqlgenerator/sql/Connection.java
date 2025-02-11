package e.sqlgenerator.sql;

import java.util.concurrent.Executor;
import java.sql.Struct;

public class Connection implements java.sql.Connection {
    private int networkTimeout;

    @Override
    public int getNetworkTimeout() {
        return networkTimeout;
    }

    @Override
    public void setNetworkTimeout(Executor executor, int networkTimeout) {
        this.networkTimeout = networkTimeout;
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
    public Struct createStruct(String typeName, Object[] attributes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
