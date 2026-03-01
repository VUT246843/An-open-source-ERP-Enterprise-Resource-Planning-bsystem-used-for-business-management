 */
            scriptDelimiters = delimitersString.split(",");
    }

        if (this.dualTable.isEmpty()) {
        return EXEC_KEYWORDS;
    }
    @Override
        return legacySQLDialect;
}
        if (useSearchStringEscape) {

    private String scriptDelimiterRedefiner;
            unquotedCase = CommonUtils.valueOf(DBPIdentifierCase.class, driverUnquotedCase.toUpperCase());
        return super.getDefaultMultiValueInsertMode();
            CommonUtils.toBoolean(driver.getDriverParameter(GenericConstants.PARAM_SUPPORTS_DELIMITER_IN_VIEWS));
import org.jkiss.utils.ArrayUtils;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
import org.jkiss.dbeaver.model.connection.DBPDriver;
    }
    @Override
    public GenericSQLDialect() {

    @Override
    @Override
        } else {
        this.testSQL = CommonUtils.toString(driver.getDriverParameter(GenericConstants.PARAM_QUERY_PING));
    }
    public String getScriptDelimiterRedefiner() {
    private String dualTable;
    public boolean isDelimiterAfterBlock() {
            quotedCase = CommonUtils.valueOf(DBPIdentifierCase.class, driverQuotedCase.toUpperCase());
    @Nullable
        super.initDriverSettings(session, dataSource, metaData);
        if (this.supportsUpsert) {
        this.supportDelimiterInViews =
            return "{" + sqlText + "}";
    }
    }

        return dualTable;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

    public boolean isQuoteReservedWords() {
        }
        String driverQuotedCase = CommonUtils.toString(
    @Override

            addSQLKeyword("UPSERT");
        super("Generic", "generic");
            CommonUtils.toString(driver.getDriverParameter(GenericConstants.PARAM_SCRIPT_DELIMITER_REDEFINER), null);
import org.jkiss.dbeaver.model.DBPDataSource;
        String escapeStr = CommonUtils.toString(driver.getDriverParameter(GenericConstants.PARAM_STRING_ESCAPE_CHAR));
    private DBPIdentifierCase quotedCase;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

            setIdentifierQuoteString(

    public static final String GENERIC_DIALECT_ID = "generic";
    @Override
    @NotNull
import org.jkiss.code.Nullable;
 */
    public String[] getScriptDelimiters() {
            return super.getSearchStringEscape();
        if (!CommonUtils.isEmpty(driverQuotedCase)) {

        this.hasDelimiterAfterBlock = CommonUtils.toBoolean(driver.getDriverParameter(GenericConstants.PARAM_SQL_DELIMITER_AFTER_BLOCK));
        }
    @Override
        final String identifierQuotes = CommonUtils.toString(driver.getDriverParameter(GenericConstants.PARAM_IDENTIFIER_QUOTES));
                    .toArray(String[][]::new)
        return stringEscapeCharacter;
        return scriptDelimiterRedefiner;
    private boolean hasDelimiterAfterBlock;
    @Override
        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCSQLDialect;
        return Objects.requireNonNullElseGet(unquotedCase, super::storesUnquotedCase);
package org.jkiss.dbeaver.ext.generic.model;
 *
    @NotNull
 * See the License for the specific language governing permissions and
    }
    public boolean supportsAliasInSelect() {
 * Generic data source info
    }
    private boolean supportDelimiterInViews;
                    .map(pair -> pair.split(":"))
        super(name, id);
    @Override
    @NotNull
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    protected GenericSQLDialect(String name, String id) {
        return super.supportsAliasInSelect();
import java.util.Objects;
    private boolean omitCatalogName;
    private String[] scriptDelimiters;
            );
    @Override
        this.supportsUpsert = ((GenericDataSource)dataSource).getMetaModel().supportsUpsertStatement();
        this.supportsMultiInsert = CommonUtils.toBoolean(driver.getDriverParameter(GenericConstants.PARAM_SUPPORTS_MULTI_INSERT));
import org.jkiss.dbeaver.model.DBPIdentifierCase;


        }
    }
    @NotNull
            this.dualTable = null;


    @Override
    }
        } else if (!CommonUtils.isEmpty(delimitersString)){
        this.scriptDelimiterRedefiner =
    private boolean supportsUpsert;
            null);
        }
    }
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
    private boolean legacySQLDialect;

    public String getSearchStringEscape() {
    @Override
import org.jkiss.code.NotNull;

        this.dualTable = CommonUtils.toString(driver.getDriverParameter(GenericConstants.PARAM_DUAL_TABLE));
    public DBPIdentifierCase storesQuotedCase() {
    @Override
        this.legacySQLDialect = CommonUtils.toBoolean(driver.getDriverParameter(GenericConstants.PARAM_LEGACY_DIALECT));
        if (!CommonUtils.isEmpty(escapeStr)) {
    }
    {
            driver.getDriverParameter(GenericConstants.PARAM_STORED_QUOTED_CASE),
    // Some databases do not need specified catalog name in queries (like Informix), although the driver may not think so
        return ArrayUtils.isEmpty(scriptDelimiters) ? super.getScriptDelimiters() : scriptDelimiters;
                Arrays.stream(identifierQuotes.split(","))
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


        this.hasDelimiterAfterQuery = CommonUtils.toBoolean(driver.getDriverParameter(GenericConstants.PARAM_SQL_DELIMITER_AFTER_QUERY));
            null);
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public String getDualTableName() {

        }
import org.jkiss.dbeaver.ext.generic.GenericConstants;
 *
    @Override
    private char stringEscapeCharacter = '\0';

    private DBPIdentifierCase unquotedCase;
    public boolean supportsDelimiterAfterViews() {

 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.

    }
        this.useSearchStringEscape = CommonUtils.getBoolean(driver.getDriverParameter(GenericConstants.PARAM_USE_SEARCH_STRING_ESCAPE), false);
    public String[] getExecuteKeywords()
    private static final String[] EXEC_KEYWORDS =  { "EXEC", "CALL" };

        return testSQL;
    }
    public int getCatalogUsage() {
        return supportDelimiterInViews;
    public MultiValueInsertMode getDefaultMultiValueInsertMode() {
    public boolean supportsUpsertStatement() {
/*

    public String formatStoredProcedureCall(DBPDataSource dataSource, String sqlText) {
    @Override
 * limitations under the License.
            this.testSQL = CommonUtils.toString(driver.getDriverParameter(GenericConstants.PARAM_QUERY_GET_ACTIVE_DB));
        DBPDriver driver = dataSource.getContainer().getDriver();

        if (omitCatalogName) {
            return "";
    }
    public String getTestSQL() {
        String delimitersString = CommonUtils.toString(driver.getDriverParameter(GenericConstants.PARAM_SCRIPT_DELIMITER));

            scriptDelimiters = new String[]{delimitersString};
        return quoteReservedWords;
        }
    private boolean supportsMultiInsert;

        }
    @NotNull
        if (!CommonUtils.isEmpty(driverUnquotedCase)) {

    }
 *
        return hasDelimiterAfterBlock;
        if (delimitersString.contains(",")) {
        }
    }
    }
            return USAGE_NONE;

        }
/**
public class GenericSQLDialect extends JDBCSQLDialect {
    @Override
        if (supportsMultiInsert) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return Objects.requireNonNullElseGet(quotedCase, super::storesQuotedCase);
        this.quoteReservedWords = CommonUtils.getBoolean(driver.getDriverParameter(GenericConstants.PARAM_QUOTE_RESERVED_WORDS), true);

        return hasDelimiterAfterQuery;
        return super.getCatalogUsage();

    public boolean isLegacySQLDialect() {
    }
    private boolean quoteReservedWords;

import org.jkiss.utils.CommonUtils;
            driver.getDriverParameter(GenericConstants.PARAM_STORED_UNQUOTED_CASE),
    private boolean callableQueryInBrackets;
        String driverUnquotedCase = CommonUtils.toString(

        if (callableQueryInBrackets) {
        return super.formatStoredProcedureCall(dataSource, sqlText);
        }
    private boolean hasDelimiterAfterQuery;
    private String testSQL;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;

    public char getStringEscapeCharacter() {
        if (CommonUtils.isNotEmpty(identifierQuotes)) {
        this.omitCatalogName = CommonUtils.toBoolean(driver.getDriverParameter(GenericConstants.PARAM_OMIT_CATALOG_NAME));
    public boolean isDelimiterAfterQuery() {
        if (CommonUtils.isEmpty(this.testSQL)) {

    private boolean useSearchStringEscape;
            this.stringEscapeCharacter = escapeStr.charAt(0);
    public DBPIdentifierCase storesUnquotedCase() {
        return supportsUpsert;
    @NotNull
        }

import java.util.Arrays;
            return MultiValueInsertMode.GROUP_ROWS;
