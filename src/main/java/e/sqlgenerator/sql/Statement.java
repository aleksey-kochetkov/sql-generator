package e.sqlgenerator.sql;

import java.util.List;
import java.sql.SQLWarning;

public class Statement implements java.sql.Statement {
    List<String> statements;

    public Statement(List<String> statements) {
        this.statements = statements;
    }

    @Override
    public ResultSet executeQuery(String sql) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int executeUpdate(String sql) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxFieldSize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setMaxFieldSize(int max) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxRows() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setMaxRows(int max) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setEscapeProcessing(boolean enable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getQueryTimeout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setQueryTimeout(int seconds) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void cancel() {
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

    @Override
    public void setCursorName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean execute(String sql) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ResultSet getResultSet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getUpdateCount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean getMoreResults() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFetchDirection(int direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getFetchDirection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFetchSize(int rows) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getFetchSize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getResultSetConcurrency() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getResultSetType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addBatch(String sql) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clearBatch() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int[] executeBatch() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean getMoreResults(int current) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ResultSet getGeneratedKeys() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int executeUpdate(String sql, int autoGeneratedKeys) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int executeUpdate(String sql, int[] columnIndexes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int executeUpdate(String sql, String[] columnNames) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean execute(String sql, int autoGeneratedKeys) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean execute(String sql, int[] columnIndexes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean execute(String sql, String[] columnNames) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getResultSetHoldability() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isClosed() {
        return true;
    }

    @Override
    public void setPoolable(boolean poolable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isPoolable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void closeOnCompletion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isCloseOnCompletion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> T unwrap(Class<T> iface) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
