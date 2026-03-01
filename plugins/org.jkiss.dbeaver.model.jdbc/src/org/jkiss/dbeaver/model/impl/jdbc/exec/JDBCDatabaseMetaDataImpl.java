    @Override
        return getOriginal().supportsFullOuterJoins();
        return getOriginal().supportsNonNullableColumns();
    @Override
    @Override
        );

    @Override
    @Override
        return getOriginal().supportsDataDefinitionAndDataManipulationTransactions();

        return getOriginal().nullsAreSortedAtEnd();
    @Override
    @Override
            () -> getOriginal().getProcedures(catalog, schemaPattern, procedureNamePattern),
    }
    public boolean supportsMultipleOpenResults() throws SQLException {
    public int getMaxRowSize() throws SQLException {
        return getOriginal().supportsCoreSQLGrammar();
        return getOriginal().supportsUnion();
    @Override
    @Override

        return makeResultSet(

        return makeResultSet(
    }
        return getOriginal().supportsANSI92EntryLevelSQL();
    }


        @NotNull JDBCObjectSupplier<ResultSet> resultSet,
    }
        );
    @Override
    public String getNumericFunctions() throws SQLException {
    public boolean supportsConvert(int fromType, int toType) throws SQLException {
        return getOriginal().supportsSchemasInTableDefinitions();

        return makeResultSet(
    }

        );
 * Unless required by applicable law or agreed to in writing, software
        return getOriginal().supportsCatalogsInProcedureCalls();
            "Load schemas", catalog, schemaPattern
    }
        if (original == null) {
    public boolean supportsPositionedDelete() throws SQLException {
    public boolean storesLowerCaseIdentifiers() throws SQLException {



    public boolean supportsStatementPooling() throws SQLException {

    public int getMaxUserNameLength() throws SQLException {
    public boolean storesUpperCaseIdentifiers() throws SQLException {
        return getOriginal().supportsOrderByUnrelated();

    ) throws SQLException {
        return getOriginal().supportsANSI92FullSQL();

    }
    }

        return getOriginal().supportsResultSetType(type);
        return original == null ? 0 : original.getDriverMinorVersion();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
    }
        return getOriginal().supportsSubqueriesInExists();
            () -> getOriginal().getSchemas(catalog, schemaPattern),
    public boolean othersDeletesAreVisible(int type) throws SQLException {
    }
    }
            "Load UDT attributes", catalog, schemaPattern, typeNamePattern, attributeNamePattern
        return getOriginal().dataDefinitionCausesTransactionCommit();
    }
    @Override
    @Override
    public JDBCDatabaseMetaDataImpl(JDBCSession connection, DatabaseMetaData original) {

    }
    @Override
            "Load super tables", catalog, schemaPattern, tableNamePattern
    }
        return makeResultSet(

    }
    }
            "Load imported keys", catalog, schema, table
        return getOriginal().usesLocalFiles();
        String foreignCatalog, String foreignSchema, String foreignTable
    }
    }
        return getOriginal().usesLocalFilePerTable();
    @Override



    public boolean supportsANSI92FullSQL() throws SQLException {
            "Load indexes", catalog, schema, table
        );

    @Override
    @Override
    public boolean supportsSchemasInProcedureCalls() throws SQLException {
    public JDBCResultSet getUDTs(String catalog, String schemaPattern, String typeNamePattern, int[] types) throws SQLException {
    @Override
    @Override
        return getOriginal().getDriverVersion();
    public boolean supportsMixedCaseIdentifiers() throws SQLException {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public JDBCResultSet getTableTypes() throws SQLException {



    }
    }
        return getOriginal().getMaxStatements();
        return getOriginal().supportsNamedParameters();
        return makeResultSet(
        } catch (SQLException e) {
    @Override
    public String getUserName() throws SQLException {

            "Load client info"
        return getOriginal().getNumericFunctions();

    public JDBCDataSource getDataSource() {

    public JDBCResultSet getFunctions(String catalog, String schemaPattern, String functionNamePattern) throws SQLException {
    @Override


    }

    }
        return getOriginal().getCatalogSeparator();
        return getOriginal().supportsColumnAliasing();
import org.jkiss.code.NotNull;
    public boolean isReadOnly() throws SQLException {
    @Override
    }

    }

    @Override
    }
        return original == null ? 0 : original.getDriverMajorVersion();
    @Override
        );
    public JDBCResultSet getCatalogs() throws SQLException {

    }
    @Override
    @Override
        );
    @Override

    public boolean othersUpdatesAreVisible(int type) throws SQLException {
    @Override
    }
        return getOriginal().locatorsUpdateCopy();
    @Override

    public boolean supportsANSI92EntryLevelSQL() throws SQLException {
    public boolean supportsCorrelatedSubqueries() throws SQLException {
    }


    public boolean deletesAreDetected(int type) throws SQLException {

    public String getDatabaseProductName() throws SQLException {
    }

    public boolean supportsMinimumSQLGrammar() throws SQLException {
    public int getMaxCursorNameLength() throws SQLException {
            () -> getOriginal().getPrimaryKeys(catalog, schema, table),
            "Load UDTs", catalog, schemaPattern, typeNamePattern
    public String getDatabaseProductVersion() throws SQLException {
    public String getSQLKeywords() throws SQLException {


import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
        return getOriginal().supportsResultSetHoldability(holdability);
    @Override
    public boolean supportsAlterTableWithDropColumn() throws SQLException {
    public boolean insertsAreDetected(int type) throws SQLException {
        return getOriginal().supportsANSI92IntermediateSQL();
    }
    }
    public boolean othersInsertsAreVisible(int type) throws SQLException {
        return getOriginal().getExtraNameCharacters();
    }
    }
        );
    @Override
    @Override
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
            false);

    }

    }
        return getOriginal().supportsPositionedDelete();
    public boolean supportsANSI92IntermediateSQL() throws SQLException {

    }
    }
    @Override
    }
    @Override
    public JDBCResultSet getBestRowIdentifier(String catalog, String schema, String table, int scope, boolean nullable) throws SQLException {
    }
        return getOriginal().getDefaultTransactionIsolation();
    public int getMaxIndexLength() throws SQLException {
    }
    }
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
    public int getMaxStatementLength() throws SQLException {
    public int getMaxCatalogNameLength() throws SQLException {
    }
        return makeResultSet(

    @Override
    }

    public boolean supportsCatalogsInPrivilegeDefinitions() throws SQLException {


        );
    }
 *
    @Override
    @Override
        return getOriginal().isReadOnly();
    }
        return getOriginal().getMaxCatalogNameLength();
    }
    @Override
        return getOriginal().supportsLikeEscapeClause();
    }
    @Override
        this.original = original;
        return getOriginal().allProceduresAreCallable();
        return makeResultSet(
    public boolean supportsUnionAll() throws SQLException {
        return getOriginal().supportsUnionAll();

    }
    }
        return getOriginal().supportsCorrelatedSubqueries();
    }

    }

    @Override
    @Override
        return getOriginal().supportsDifferentTableCorrelationNames();
    public boolean updatesAreDetected(int type) throws SQLException {
        return getOriginal().supportsResultSetConcurrency(type, concurrency);
    public boolean doesMaxRowSizeIncludeBlobs() throws SQLException {
    public boolean supportsTableCorrelationNames() throws SQLException {
            "Load function columns", catalog, schemaPattern, functionNamePattern, columnNamePattern
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        );
    @Override
    }

    }
    }

            () -> getOriginal().getClientInfoProperties(),
    }
        );
    @Override
    public int getMaxTablesInSelect() throws SQLException {
        return getOriginal().supportsCatalogsInIndexDefinitions();
            "Load super types", catalog, schemaPattern, typeNamePattern

    public ResultSet getPseudoColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) throws SQLException {
        return getOriginal().isWrapperFor(iface);
    public boolean supportsResultSetType(int type) throws SQLException {
            "Load table types"
        return getOriginal().supportsAlterTableWithAddColumn();
            () -> getOriginal().getSuperTypes(catalog, schemaPattern, typeNamePattern),
    public boolean ownUpdatesAreVisible(int type) throws SQLException {
/*
    }
    @Override
        @NotNull String functionName,
    @Override
        ResultSet originalRS = null;
    }
    }


            () -> getOriginal().getVersionColumns(catalog, schema, table),
    }
            "Load catalogs"
    }
    public String getSchemaTerm() throws SQLException {

    @Override
    @Override
    @Override
            () -> getOriginal().getPseudoColumns(catalog, schemaPattern, tableNamePattern, columnNamePattern),

    }
    public int getMaxBinaryLiteralLength() throws SQLException {
    }
            () -> getOriginal().getCatalogs(),


    public int getResultSetHoldability() throws SQLException {
    @Override
    public int getMaxColumnsInGroupBy() throws SQLException {
    ) throws SQLException {
        );
    @Override

            () -> getOriginal().getSuperTables(catalog, schemaPattern, tableNamePattern),
    @Override
    }
    }
            "Load column privileges", catalog, schema, table, columnNamePattern
        return getOriginal().supportsTransactionIsolationLevel(level);


    }
    public int getSQLStateType() throws SQLException {
    public boolean supportsExtendedSQLGrammar() throws SQLException {
        return getOriginal().nullsAreSortedLow();
        return makeResultSet(

    }
        return getOriginal().nullsAreSortedHigh();
            () -> getOriginal().getIndexInfo(catalog, schema, table, unique, approximate),
    @Override

    @Override
        if (args.length > 0) {


    public boolean supportsPositionedUpdate() throws SQLException {
    public boolean locatorsUpdateCopy() throws SQLException {
    @Override
        return getOriginal().getMaxConnections();
    @Override

    }
    @Override
    public int getDefaultTransactionIsolation() throws SQLException {

    @Override
        return getOriginal().getJDBCMajorVersion();
        return makeResultSet(
    public int getDriverMinorVersion() {

            "Find version columns", catalog, schema, table
    @Override

        return getOriginal().supportsDataManipulationTransactionsOnly();

    @Override
            "Load type info"
        return getOriginal().supportsOuterJoins();
        return getOriginal().supportsGetGeneratedKeys();
    @Override
        return getOriginal().supportsBatchUpdates();
        return getOriginal().getMaxColumnNameLength();

    }
package org.jkiss.dbeaver.model.impl.jdbc.exec;
        return getOriginal().getMaxColumnsInIndex();
    }
        return getOriginal().supportsTableCorrelationNames();
    public int getMaxCharLiteralLength() throws SQLException {
    public boolean supportsGroupByUnrelated() throws SQLException {
        return getOriginal().supportsMixedCaseIdentifiers();

    }
    }

        return makeResultSet(
    public boolean supportsStoredFunctionsUsingCallSyntax() throws SQLException {
    @Override
        String columnNamePattern

    public int getMaxTableNameLength() throws SQLException {

    }
    @Override
    @Override
    }
    public JDBCResultSet getClientInfoProperties() throws SQLException {
    }
    @Override
    public JDBCResultSet getCrossReference(
        return getOriginal().ownDeletesAreVisible(type);
        return getOriginal().supportsCatalogsInDataManipulation();
    public String getSystemFunctions() throws SQLException {
        return getOriginal().othersUpdatesAreVisible(type);
    public boolean supportsLimitedOuterJoins() throws SQLException {
    @Override
        return getOriginal().getURL();
        return getOriginal().insertsAreDetected(type);
    @Override

        return getOriginal().nullsAreSortedAtStart();
    @Override
import java.sql.RowIdLifetime;


    @Override
    }
    public boolean supportsCatalogsInProcedureCalls() throws SQLException {
    public boolean supportsSchemasInDataManipulation() throws SQLException {
        return getOriginal().getSystemFunctions();
    }
    }
        String catalog, String schemaPattern, String procedureNamePattern,
            "Load table privileges", catalog, schemaPattern, tableNamePattern
    private JDBCResultSet makeResultSet(
    @Override
    public int getMaxColumnsInSelect() throws SQLException {
    public boolean supportsFullOuterJoins() throws SQLException {


    }
    @Override
    }

    public int getMaxColumnNameLength() throws SQLException {

    @Override

    public boolean supportsSchemasInIndexDefinitions() throws SQLException {
    @Override
        return getOriginal().getMaxUserNameLength();
    @Override
        return getOriginal().supportsConvert();
        return getOriginal().supportsMinimumSQLGrammar();
    public JDBCResultSet getPrimaryKeys(String catalog, String schema, String table) throws SQLException {
            "Load pseudo columns", catalog, schemaPattern, tableNamePattern, columnNamePattern

        return makeResultSet(
    public String getStringFunctions() throws SQLException {

    @Override
        return getOriginal().ownUpdatesAreVisible(type);
    public int getMaxStatements() throws SQLException {
    public JDBCResultSet getSchemas() throws SQLException {


    @Override
        return getOriginal().supportsSchemasInDataManipulation();
    }
    }
    }
    public boolean supportsGetGeneratedKeys() throws SQLException {

    @Override
    @Override
    @Override


            "-- " + description, // Set description as commented SQL
    public boolean supportsMultipleResultSets() throws SQLException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @Override
    }
    private final DatabaseMetaData original;
 * You may obtain a copy of the License at
    public boolean supportsSubqueriesInExists() throws SQLException {
            connection,
    }
    }
    }
    public boolean supportsNamedParameters() throws SQLException {
    }
        );

        }
    public int getJDBCMinorVersion() throws SQLException {
    }
    @Override
        );
        return getOriginal().getSchemaTerm();
    @Override

    @Override
    @Override
    }
    public boolean supportsOpenCursorsAcrossRollback() throws SQLException {
    public boolean supportsSchemasInTableDefinitions() throws SQLException {

    }
        return getOriginal().updatesAreDetected(type);
    @Override
    private final JDBCSession connection;
    @Override
    }
    }
    }
    @Override
        return getOriginal().othersInsertsAreVisible(type);
        return getOriginal().supportsMultipleTransactions();
    @Override

    }
    public boolean supportsUnion() throws SQLException {
    public String getDriverVersion() throws SQLException {
 * you may not use this file except in compliance with the License.
        return makeResultSet(
    @Override
    @Override
    public boolean supportsSavepoints() throws SQLException {
        return makeResultSet(
    public JDBCResultSet getTables(String catalog, String schemaPattern, String tableNamePattern, String[] types) throws SQLException {
    @Override
        return getOriginal().supportsMixedCaseQuotedIdentifiers();
    }

    }
    }
    @Override
    public boolean supportsSubqueriesInQuantifieds() throws SQLException {

    }
    }
    }
        return getOriginal().storesUpperCaseIdentifiers();
    @Override
    public boolean supportsSubqueriesInComparisons() throws SQLException {
    @Override
        );
        return getOriginal().getMaxColumnsInGroupBy();
    @Override
        );
    @Override
        return getOriginal().supportsSubqueriesInIns();
            () -> getOriginal().getTables(catalog, schemaPattern, tableNamePattern, types),
    }
    @Override
        return getOriginal().supportsOpenCursorsAcrossCommit();
    }
        String parentCatalog, String parentSchema, String parentTable,
            "Load exported keys", catalog, schema, table
 *
        return getOriginal().supportsTransactions();
    }

        );
    @Override
            fakeStatement.close();

            () -> getOriginal().getCrossReference(parentCatalog, parentSchema, parentTable, foreignCatalog, foreignSchema, foreignTable),
    public boolean supportsAlterTableWithAddColumn() throws SQLException {
        return makeResultSet(
            () -> getOriginal().getAttributes(catalog, schemaPattern, typeNamePattern, attributeNamePattern),
        return getOriginal().supportsGroupByUnrelated();

    }
    }
        return getOriginal().supportsPositionedUpdate();
    public boolean supportsCoreSQLGrammar() throws SQLException {
    }
    }
            () -> getOriginal().getTypeInfo(),

    }
    }
        return getOriginal().allTablesAreSelectable();
    @Override
            () -> getOriginal().getTableTypes(),
    public boolean supportsTransactions() throws SQLException {
    public boolean usesLocalFilePerTable() throws SQLException {



    @Override
            originalRS = resultSet.get();
    @Override
    public boolean nullsAreSortedAtEnd() throws SQLException {
    public JDBCResultSet getVersionColumns(String catalog, String schema, String table) throws SQLException {


    @Override
    }
        return makeResultSet(
        fakeStatement.afterExecute();
import java.sql.ResultSet;

    public JDBCResultSet getTablePrivileges(String catalog, String schemaPattern, String tableNamePattern) throws SQLException {
    }
    public boolean ownInsertsAreVisible(int type) throws SQLException {
    public String getExtraNameCharacters() throws SQLException {
            "Load procedures", catalog, schemaPattern, procedureNamePattern
    public boolean supportsBatchUpdates() throws SQLException {

    @Override
        return getOriginal().storesLowerCaseQuotedIdentifiers();
    @Override
        return getOriginal().supportsStatementPooling();
        return getOriginal().unwrap(iface);
    }
        return makeResultSet(
            () -> getOriginal().getSchemas(),
    public boolean nullsAreSortedAtStart() throws SQLException {
    }
    public boolean supportsSubqueriesInIns() throws SQLException {
    }
    @Override
        return getOriginal().supportsStoredProcedures();
    @Override
    public boolean storesLowerCaseQuotedIdentifiers() throws SQLException {
        return getOriginal().storesMixedCaseQuotedIdentifiers();
        return getOriginal().storesLowerCaseIdentifiers();
        return connection.getDataSource();
    }

    public boolean storesUpperCaseQuotedIdentifiers() throws SQLException {
    @NotNull
    @Override
        return getOriginal().supportsMultipleOpenResults();
    @Override

    public boolean isCatalogAtStart() throws SQLException {
    public boolean allProceduresAreCallable() throws SQLException {
    @Override
        return getOriginal().getJDBCMinorVersion();
        return getOriginal().supportsCatalogsInPrivilegeDefinitions();

    @Override
        return makeResultSet(
    public int getDatabaseMinorVersion() throws SQLException {
    public String getSearchStringEscape() throws SQLException {
        String description = functionName;

    public boolean supportsSelectForUpdate() throws SQLException {
        return getOriginal().deletesAreDetected(type);
    public boolean generatedKeyAlwaysReturned() throws SQLException {
        this.connection = connection;

        return getOriginal().nullPlusNonNullIsNull();

        return getOriginal().getMaxRowSize();
    }
    public String getCatalogTerm() throws SQLException {
        return getOriginal().getMaxTablesInSelect();
    @Override
    public boolean supportsResultSetHoldability(int holdability) throws SQLException {
        return makeResultSet(
            () -> getOriginal().getProcedureColumns(catalog, schemaPattern, procedureNamePattern, columnNamePattern),
    }
    }
    }
            "Load schemas"
            "Load tables", catalog, schemaPattern, tableNamePattern, types
    @Override
        return getOriginal().supportsIntegrityEnhancementFacility();
        return makeResultSet(
    @Override
    @Override
    }
    }

            () -> getOriginal().getUDTs(catalog, schemaPattern, typeNamePattern, types),
    public DatabaseMetaData getOriginal() throws SQLException {
        return getOriginal().doesMaxRowSizeIncludeBlobs();
    @Override
        return getOriginal().storesMixedCaseIdentifiers();
    }
    }
    }

        fakeStatement.beforeExecute();
    }

    }
    @Override
    @Override
    @Override
        return getOriginal().getResultSetHoldability();
            () -> getOriginal().getBestRowIdentifier(catalog, schema, table, scope, nullable),

        return getOriginal().getStringFunctions();
    public boolean supportsGroupBy() throws SQLException {
    @Override
    public JDBCResultSet getProcedureColumns(
        return getOriginal().autoCommitFailureClosesAllResultSets();
 *
    public boolean supportsCatalogsInTableDefinitions() throws SQLException {
        return getOriginal().supportsSubqueriesInQuantifieds();
    @Override
    @Override

    public JDBCResultSet getSuperTables(String catalog, String schemaPattern, String tableNamePattern) throws SQLException {
        return getOriginal().supportsSavepoints();
    }
    }
        return getOriginal().getProcedureTerm();
    @Override
    public boolean supportsOrderByUnrelated() throws SQLException {
    }
    }
    public JDBCResultSet getExportedKeys(String catalog, String schema, String table) throws SQLException {

        return makeResultSet(
    }
            throw new SQLException("Database metadata not supported by driver");
    public boolean nullsAreSortedHigh() throws SQLException {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    @Override
    public int getMaxConnections() throws SQLException {

    public JDBCResultSet getAttributes(String catalog, String schemaPattern, String typeNamePattern, String attributeNamePattern) throws SQLException {
    }
    @Override
        return original;
    }
    public boolean nullsAreSortedLow() throws SQLException {

    public boolean storesMixedCaseQuotedIdentifiers() throws SQLException {
        return getOriginal().supportsConvert(fromType, toType);

    }
    @Override
    @Override


 * See the License for the specific language governing permissions and
    @Override
    public boolean supportsTransactionIsolationLevel(int level) throws SQLException {
        return getOriginal().supportsSchemasInIndexDefinitions();
        return getOriginal().supportsStoredFunctionsUsingCallSyntax();

    public String getProcedureTerm() throws SQLException {

    }
        return getOriginal().getSQLKeywords();
            () -> getOriginal().getTablePrivileges(catalog, schemaPattern, tableNamePattern),
        return JDBCResultSetImpl.makeResultSet(connection, fakeStatement, originalRS, false);


 * limitations under the License.


        return makeResultSet(


    public boolean dataDefinitionIgnoredInTransactions() throws SQLException {
import java.sql.DatabaseMetaData;
    @Override

    @Override
    }
        return getOriginal().supportsSchemasInPrivilegeDefinitions();
    public boolean autoCommitFailureClosesAllResultSets() throws SQLException {
        );
    public boolean usesLocalFiles() throws SQLException {
    @Override
    public boolean supportsSchemasInPrivilegeDefinitions() throws SQLException {
        return getOriginal().getRowIdLifetime();
    @Override
    public int getMaxColumnsInTable() throws SQLException {
        return getOriginal().getMaxColumnsInSelect();

        return getOriginal().getDriverName();

        return makeResultSet(
        Object... args
        return connection;

    }
    @Override
    }
    public boolean supportsExpressionsInOrderBy() throws SQLException {
    @Override
    public boolean supportsOpenCursorsAcrossCommit() throws SQLException {
 */

        return getOriginal().supportsOpenCursorsAcrossRollback();
        return getOriginal().getUserName();
        );

    @Override
        return getOriginal().supportsOpenStatementsAcrossRollback();
 * JDBC database metadata manageable



    @Override
    }
    @Override
        return getOriginal().getDatabaseProductName();
        return getOriginal().getMaxSchemaNameLength();


    }

    @Override
        return getOriginal().getSearchStringEscape();
        return getOriginal().getMaxColumnsInTable();

    @Override
        return getOriginal().othersDeletesAreVisible(type);
            () -> getOriginal().getColumnPrivileges(catalog, schema, table, columnNamePattern),
        );

    }
    }
    public boolean supportsDataManipulationTransactionsOnly() throws SQLException {
        return getOriginal().supportsGroupBy();
    public int getMaxProcedureNameLength() throws SQLException {
        return makeResultSet(
    public boolean nullPlusNonNullIsNull() throws SQLException {
    @Override

    public String getURL() throws SQLException {
            () -> getOriginal().getFunctions(catalog, schemaPattern, functionNamePattern),
import org.jkiss.dbeaver.model.exec.jdbc.JDBCObjectSupplier;
        );
    @Override
        }


        // Make fake statement

        return getOriginal().getDatabaseMajorVersion();
        return makeResultSet(
    }

    public boolean supportsDataDefinitionAndDataManipulationTransactions() throws SQLException {
        return getOriginal().supportsSelectForUpdate();
        return getOriginal().getMaxIndexLength();
    public int getJDBCMajorVersion() throws SQLException {
        return getOriginal().storesUpperCaseQuotedIdentifiers();
            () -> getOriginal().getFunctionColumns(catalog, schemaPattern, functionNamePattern, columnNamePattern),
            "Find best row identifier", catalog, schema, table
}
    }
    @Override
    public boolean supportsGroupByBeyondSelect() throws SQLException {
    @Override
        return getOriginal().ownInsertsAreVisible(type);
    @Override
        return getOriginal().supportsSchemasInProcedureCalls();
        );
    public boolean supportsColumnAliasing() throws SQLException {
    }
import java.util.Arrays;
        return getOriginal().supportsExpressionsInOrderBy();
    public String getIdentifierQuoteString() throws SQLException {
    @Override
    public boolean supportsStoredProcedures() throws SQLException {
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    public JDBCResultSet getImportedKeys(String catalog, String schema, String table) throws SQLException {
        return getOriginal().getMaxCursorNameLength();
    public JDBCResultSet getProcedures(String catalog, String schemaPattern, String procedureNamePattern) throws SQLException {
    @Override
    @Override
    @Override
    public int getMaxColumnsInIndex() throws SQLException {
    }
    }
    }
        return getOriginal().supportsMultipleResultSets();
    @Override
    public boolean supportsLikeEscapeClause() throws SQLException {
            "Load procedure columns", catalog, schemaPattern, procedureNamePattern, columnNamePattern
    public int getDatabaseMajorVersion() throws SQLException {

    }
    @Override
        return getOriginal().supportsGroupByBeyondSelect();



    @Override
    public int getDriverMajorVersion() {
    @Override




            "Load cross reference", parentCatalog, parentSchema, parentTable, foreignCatalog, foreignSchema, foreignTable
    @Override
    }
    public String getDriverName() throws SQLException {
    @Override
    public boolean supportsOuterJoins() throws SQLException {
    public JDBCResultSet getFunctionColumns(String catalog, String schemaPattern, String functionNamePattern, String columnNamePattern) throws SQLException {
        return getOriginal().getDatabaseProductVersion();
        return getOriginal().supportsAlterTableWithDropColumn();

    public boolean supportsNonNullableColumns() throws SQLException {
    @Override
    public boolean supportsCatalogsInIndexDefinitions() throws SQLException {

        return getOriginal().getDatabaseMinorVersion();
    public boolean supportsConvert() throws SQLException {
    public boolean supportsMultipleTransactions() throws SQLException {
        return getOriginal().supportsSubqueriesInComparisons();
        }
    }

    @Override
    public boolean supportsCatalogsInDataManipulation() throws SQLException {
    @Override

        );
    public boolean supportsIntegrityEnhancementFacility() throws SQLException {
    }
    public JDBCResultSet getColumnPrivileges(String catalog, String schema, String table, String columnNamePattern) throws SQLException {



    }
    }
            throw e;
    public JDBCResultSet getIndexInfo(String catalog, String schema, String table, boolean unique, boolean approximate) throws SQLException {
    @Override
    @Override
import java.sql.SQLException;



    public boolean allTablesAreSelectable() throws SQLException {
    @Override
        return getOriginal().getMaxStatementLength();
        return getOriginal().supportsOpenStatementsAcrossCommit();
        return getOriginal().getMaxTableNameLength();
    public boolean dataDefinitionCausesTransactionCommit() throws SQLException {
    }
    @Override
        return getOriginal().getMaxColumnsInOrderBy();
    public boolean supportsResultSetConcurrency(int type, int concurrency) throws SQLException {
    }
    @Override
        return makeResultSet(
        return makeResultSet(
    }
    ) throws SQLException {
    @Override
    public boolean supportsOpenStatementsAcrossRollback() throws SQLException {
    }
    }

            "Load primary keys", catalog, schema, table

        return getOriginal().getCatalogTerm();
    }
            "Load functions", catalog, schemaPattern, functionNamePattern
    public boolean ownDeletesAreVisible(int type) throws SQLException {
    }
            description += " " + Arrays.toString(args);
    public boolean supportsDifferentTableCorrelationNames() throws SQLException {



    }
    public RowIdLifetime getRowIdLifetime() throws SQLException {
        JDBCFakeStatementImpl fakeStatement = new JDBCFakeStatementImpl(
        return getOriginal().generatedKeyAlwaysReturned();
    }
    @Override
    }
            "Load columns", catalog, schemaPattern, tableNamePattern, columnNamePattern

        );

    }
    }
    @Override

    public JDBCResultSet getColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) throws SQLException {
/**
        return getOriginal().getSQLStateType();

    public boolean supportsOpenStatementsAcrossCommit() throws SQLException {
    public int getMaxColumnsInOrderBy() throws SQLException {
    public boolean supportsMixedCaseQuotedIdentifiers() throws SQLException {
        return getOriginal().getTimeDateFunctions();
    @Override
        return getOriginal().supportsLimitedOuterJoins();
    public JDBCResultSet getSchemas(String catalog, String schemaPattern) throws SQLException {
    }
        // We need to create a fake statement for such a result sets
    @Override
    @Override

            () -> getOriginal().getColumns(catalog, schemaPattern, tableNamePattern, columnNamePattern),
    public String getTimeDateFunctions() throws SQLException {
    }
    }
            () -> getOriginal().getExportedKeys(catalog, schema, table),
    }
    public JDBCResultSet getSuperTypes(String catalog, String schemaPattern, String typeNamePattern) throws SQLException {
        );
    }
        return getOriginal().getMaxCharLiteralLength();
    }
        );
        return getOriginal().supportsExtendedSQLGrammar();
    @Override

 */
        return getOriginal().isCatalogAtStart();
    @Override
    public String getCatalogSeparator() throws SQLException {
public class JDBCDatabaseMetaDataImpl implements JDBCDatabaseMetaData {
    @Override
        return getOriginal().getMaxBinaryLiteralLength();
    @Override
        return getOriginal().getIdentifierQuoteString();
    @NotNull


    }
    }
    }
    }
    public <T> T unwrap(Class<T> iface) throws SQLException {
            () -> getOriginal().getImportedKeys(catalog, schema, table),
        );
    public int getMaxSchemaNameLength() throws SQLException {
    @Override
 * DBeaver - Universal Database Manager
        try {
    @Override


    }
    @Override
    public boolean storesMixedCaseIdentifiers() throws SQLException {
    public JDBCResultSet getTypeInfo() throws SQLException {
        return getOriginal().supportsCatalogsInTableDefinitions();
        return getOriginal().dataDefinitionIgnoredInTransactions();
    @NotNull
    @Override

        return getOriginal().getMaxProcedureNameLength();
    public JDBCSession getConnection() {
    @Override
