package e.sqlgenerator.sql;

public class DatabaseMetaData implements java.sql.DatabaseMetaData {

    @Override
    public boolean generatedKeyAlwaysReturned() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ResultSet getPseudoColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getFunctionColumns(String catalog, String schemaPattern, String functionNamePattern, String columnNamePattern) {
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
