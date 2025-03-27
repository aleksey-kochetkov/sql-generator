package e.sqlgenerator.sql;

import java.sql.Connection;
import java.sql.RowIdLifetime;

public class DatabaseMetaData implements java.sql.DatabaseMetaData {
    private final Connection connection;

    public DatabaseMetaData(Connection connection) {
        this.connection = connection;
    }

    @Override
    public java.sql.ResultSet getClientInfoProperties() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Connection getConnection() {
        return connection;
    }

    @Override
    public boolean generatedKeyAlwaysReturned() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public RowIdLifetime getRowIdLifetime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean autoCommitFailureClosesAllResultSets() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsStoredFunctionsUsingCallSyntax() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsStatementPooling() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsSavepoints() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsNamedParameters() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsMultipleOpenResults() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsGetGeneratedKeys() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsResultSetHoldability(int holdability) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getResultSetHoldability() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsResultSetConcurrency(int type, int concurrency) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsResultSetType(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsBatchUpdates() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean insertsAreDetected(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean updatesAreDetected(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deletesAreDetected(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean ownInsertsAreVisible(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean ownUpdatesAreVisible(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean ownDeletesAreVisible(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean othersInsertsAreVisible(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean othersUpdatesAreVisible(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean othersDeletesAreVisible(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getDatabaseMajorVersion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getDatabaseMinorVersion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getJDBCMajorVersion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getJDBCMinorVersion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getSQLStateType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean locatorsUpdateCopy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getSchemas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getSchemas(String catalog, String schemaPattern) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getCatalogs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getUDTs(String catalog, String schemaPattern, String typeNamePattern, int[] types) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getSuperTypes(String catalog, String schemaPattern, String typeNamePattern) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getTableTypes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getSuperTables(String catalog, String schemaPattern, String tableNamePattern) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getTables(String catalog, String schemaPattern, String tableNamePattern, String[] types) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getFunctions(String catalog, String schemaPattern, String functionNamePattern) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getPseudoColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getFunctionColumns(String catalog, String schemaPattern, String functionNamePattern, String columnNamePattern) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getProcedureColumns(String catalog, String schemaPattern, String procedureNamePattern, String columnNamePattern) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getVersionColumns(String catalog, String schema, String table) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getBestRowIdentifier(String catalog, String schema, String table, int scope, boolean nullable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getIndexInfo(String catalog, String schema, String table, boolean unique, boolean approximate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getCrossReference(String parentCatalog, String parentSchema, String parentTable, String foreignCatalog, String foreignSchema, String foreignTable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getPrimaryKeys(String catalog, String schema, String table) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getExportedKeys(String catalog, String schema, String table) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getImportedKeys(String catalog, String schema, String table) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getTablePrivileges(String catalog, String schemaPattern, String tableNamePattern) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getColumnPrivileges(String catalog, String schema, String table, String columnNamePattern) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getTypeInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getAttributes(String catalog, String schemaPattern, String typeNamePattern, String attributeNamePattern) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean allProceduresAreCallable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean allTablesAreSelectable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getURL() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getUserName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isReadOnly() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean nullsAreSortedHigh() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean nullsAreSortedLow() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean nullsAreSortedAtStart() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean nullsAreSortedAtEnd() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getDatabaseProductName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getDatabaseProductVersion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getDriverName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getDriverVersion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getDriverMajorVersion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getDriverMinorVersion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean usesLocalFiles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean usesLocalFilePerTable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsMixedCaseIdentifiers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean storesUpperCaseIdentifiers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean storesLowerCaseIdentifiers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean storesMixedCaseIdentifiers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsMixedCaseQuotedIdentifiers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean storesUpperCaseQuotedIdentifiers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean storesLowerCaseQuotedIdentifiers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean storesMixedCaseQuotedIdentifiers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getIdentifierQuoteString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getSQLKeywords() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getNumericFunctions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getStringFunctions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getSystemFunctions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getTimeDateFunctions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getSearchStringEscape() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getExtraNameCharacters() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsAlterTableWithAddColumn() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsAlterTableWithDropColumn() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsColumnAliasing() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean nullPlusNonNullIsNull() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsConvert() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsConvert(int fromType, int toType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsTableCorrelationNames() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsDifferentTableCorrelationNames() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsExpressionsInOrderBy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsOrderByUnrelated() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsGroupBy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsGroupByUnrelated() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsGroupByBeyondSelect() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsLikeEscapeClause() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsMultipleResultSets() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsMultipleTransactions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsNonNullableColumns() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsMinimumSQLGrammar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsCoreSQLGrammar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsExtendedSQLGrammar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsANSI92EntryLevelSQL() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsANSI92IntermediateSQL() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsANSI92FullSQL() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsIntegrityEnhancementFacility() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsOuterJoins() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsFullOuterJoins() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsLimitedOuterJoins() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getSchemaTerm() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getProcedureTerm() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getCatalogTerm() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isCatalogAtStart() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getCatalogSeparator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsSchemasInDataManipulation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsSchemasInProcedureCalls() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsSchemasInTableDefinitions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsSchemasInIndexDefinitions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsSchemasInPrivilegeDefinitions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsCatalogsInDataManipulation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsCatalogsInProcedureCalls() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsCatalogsInTableDefinitions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsCatalogsInIndexDefinitions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsCatalogsInPrivilegeDefinitions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsPositionedDelete() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsPositionedUpdate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsSelectForUpdate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsStoredProcedures() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsSubqueriesInComparisons() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsSubqueriesInExists() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsSubqueriesInIns() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsSubqueriesInQuantifieds() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsCorrelatedSubqueries() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsUnion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsUnionAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsOpenCursorsAcrossCommit() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsOpenCursorsAcrossRollback() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsOpenStatementsAcrossCommit() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsOpenStatementsAcrossRollback() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxBinaryLiteralLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxCharLiteralLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxColumnNameLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxColumnsInGroupBy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxColumnsInIndex() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxColumnsInOrderBy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxColumnsInSelect() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxColumnsInTable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxConnections() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxCursorNameLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxIndexLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxSchemaNameLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxProcedureNameLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxCatalogNameLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxRowSize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean doesMaxRowSizeIncludeBlobs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxStatementLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxStatements() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxTableNameLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxTablesInSelect() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxUserNameLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getDefaultTransactionIsolation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsTransactions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsTransactionIsolationLevel(int level) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsDataDefinitionAndDataManipulationTransactions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supportsDataManipulationTransactionsOnly() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean dataDefinitionCausesTransactionCommit() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean dataDefinitionIgnoredInTransactions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.sql.ResultSet getProcedures(String catalog, String schemaPattern, String procedureNamePattern) {
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
