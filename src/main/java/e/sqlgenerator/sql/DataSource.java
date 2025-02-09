package e.sqlgenerator.sql;

import java.io.PrintWriter;

public class DataSource implements javax.sql.DataSource {
    private int loginTimeout;
    private PrintWriter logWriter;

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
}
