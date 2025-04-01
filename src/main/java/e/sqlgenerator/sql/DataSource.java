package e.sqlgenerator.sql;

import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;

public class DataSource implements javax.sql.DataSource {
    private static final List<String> statements = new ArrayList<>();
    private int loginTimeout;
    private PrintWriter logWriter;
    private Connection connection = new Connection(statements);

    public static List<String> getStatements() {
        return statements;
    }

    @Override
    public int getLoginTimeout() {
        return loginTimeout;
    }

    @Override
    public void setLoginTimeout(int loginTimeout) {
        this.loginTimeout = loginTimeout;
    }

    @Override
    public PrintWriter getLogWriter() {
        return logWriter;
    }

    @Override
    public void setLogWriter(PrintWriter logWriter) {
        this.logWriter = logWriter;
    }

    @Override
    public Logger getParentLogger() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.Connection getConnection() {
        return connection;
    }

    @Override
    public java.sql.Connection getConnection(
                                       String username, String password) {
        return connection;
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
