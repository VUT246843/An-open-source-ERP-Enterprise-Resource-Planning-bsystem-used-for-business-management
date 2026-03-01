    @Override
        return '[' + str.replace("]", "]]") + ']';
    }
        "ISDATE",
        return "CREATE SCHEMA " + schemaName;
    @Override
        return "SELECT 1 FROM sys.schemas WHERE name = " + getQuotedString(schemaName);
            switch (lowerTypeName) {
    }
        "LOGIN",
/*
                            return "(MAX)";
            String name = inParameters.get(i).getName();
 * Copyright (C) 2010-2026 DBeaver Corp and others
        return SQLServerConstants.TYPE_NVARCHAR;
    };
        return false;
        return false;
        );

    public String getNVarCharDataType() {
        return SQLServerConstants.OPERATION_ALTER;
    public boolean isWordStart(int ch) {
    @Override
    @Override
        "SYSDATETIMEOFFSET",
            // The datetimeoffset is the DATE type with the String data kind. Uses scale for the length property as other DATE types.
                        if (dataSource instanceof SQLServerDataSource) {
            int width = maxParamLength + 70 - name.length() / 2;
        return false;
        // allow wider syntax by default
    @NotNull
    }

        "GETUTCDATE",
        "DATEDIFF",
    public String getTextDataType() {
        return SQLServerConstants.TYPE_BIGINT;
                case SQLServerConstants.TYPE_NVARCHAR:
    }
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
        super.initDriverSettings(session, dataSource, metaData);
 * you may not use this file except in compliance with the License.
    public String getOffsetLimitQueryPart(int offset, int limit) {
        } else {
import java.util.*;
    public String getAutoIncrementKeyword() {
        return super.getColumnTypeModifiers(dataSource, column, typeName, dataKind);
        if (dataSource != null && !isSqlServer && !dataSource.isServerVersionAtLeast(12, 6)) {
    }
    }
            return SYBASE_LEGACY_QUOTE_STRINGS;
import org.jkiss.dbeaver.model.text.parser.TPRule;
    @Override
            return super.getSingleLineComments();
                scale = precision;
            return new TPRule[]{

                    return null;
    @Override
        }
    public String getNClobDataType() {
 * DBeaver - Universal Database Manager
    }

            }
        "EOMONTH",
        if (position == RulePosition.KEYWORDS) {
                            return "(" + maxStringLength + ")";
    @NotNull
 * You may obtain a copy of the License at
    public String getColumnTypeModifiers(
        int maxParamLength = getMaxParameterLength(parameters, inParameters);
    }
    public boolean needsDefaultDataTypes() {
        @NotNull DBPDataSource dataSource,

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        sql.append("DECLARE @return_value int\n\n");
            if (i < (inParameters.size() - 1)) {
            if (dataSource.isServerVersionAtLeast(SQLServerConstants.SQL_SERVER_2008_VERSION_MAJOR, 0)) {
        }
 * Unless required by applicable law or agreed to in writing, software
        return getClobDataType();
        sql.append("EXEC\t@return_value = [").append(proc.getContainer().getName()).append("].[").append(proc.getName()).append("]\n");
    @Override

    @NotNull
        sql.append("\nSELECT\t'Return Value' = @return_value\n\n");
            return super.isQuotedString(string.substring(1));
        {SQLConstants.BLOCK_BEGIN, SQLConstants.BLOCK_END}
            };
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
    }
        // version is at least 2005
                case SQLServerConstants.TYPE_DATETIMEOFFSET: {
 * limitations under the License.

        @NotNull DBPDataKind dataKind
    @Override
                case SQLServerConstants.TYPE_BINARY:
    public boolean supportsSubqueries() {

    ) {
        "DATEADD",
                new SQLMultiWordRule(new String[]{"BEGIN", "TRANSACTION"}, keywordToken),
        SQLServerConstants.TYPE_TIMESTAMP,
    @Override
            return "(" + precision + "," + scale + ")";
import org.jkiss.dbeaver.model.sql.parser.rules.SQLMultiWordRule;
    @Override
        "CURRENT_TIMEZONE",
        "SYNONYM",
        DBSProcedure proc, 
    private static final String[][] SQLSERVER_QUOTE_STRINGS = {

import org.jkiss.code.Nullable;
    public EnumSet<ProjectionAliasVisibilityScope> getProjectionAliasVisibilityScope() {
import org.jkiss.dbeaver.model.sql.SQLConstants;

    }
    public String getCreateSchemaQuery(@NotNull String schemaName) {
        SQLServerConstants.TYPE_IMAGE,
                scale = 0; // Standard scale value for numeric/decimal types
    @Override
    }
    };
            return super.getDefaultMultiValueInsertMode();
            }
        return String.format("OFFSET %d ROWS FETCH NEXT %d ROWS ONLY", offset, limit);
    @Override

    private boolean isSqlServer;
            // Old Sybase doesn't support square brackets - #7755
                    long maxLength = column.getMaxLength();
    public boolean supportsAliasInConditions() {

    @Override
            return new String[]{SQLConstants.SL_COMMENT, "//"};
    public boolean supportsAliasInSelect() {

            return super.getDefaultMultiValueInsertMode();
        return super.isWordPart(ch) || ch == '#';
    public String getUnquotedString(String string) {
    }

    private static final String[][] SYBASE_LEGACY_QUOTE_STRINGS = {
    }
    }
    public String getTimestampDataType() {
    @Override
        "TODATETIMEOFFSET"
        return super.isQuotedString(string);
    }
        // Do not use @ as prefix - it can be used as a regular SQL construct (#5674)
                return MultiValueInsertMode.GROUP_ROWS;
        this.dataSource = dataSource;
import org.jkiss.utils.ArrayUtils;
    ) {
        return new String[]{";", "GO"};
        super(name, id);

    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    protected String quoteIdentifier(@NotNull String str, @NotNull String[][] quoteStrings) {
    public String getAlterColumnOperation() {
        addFunctions(Arrays.asList(SQLSERVER_FUNCTIONS_DATETIME));
                case SQLServerConstants.TYPE_TIME:
            // https://docs.microsoft.com/en-us/sql/t-sql/language-elements/transactions-transact-sql
    @Override
            if (scale == null) {
    }
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
        } else if (dataKind == DBPDataKind.STRING || dataKind == DBPDataKind.BINARY) {
    @Override

                        }
                case SQLServerConstants.TYPE_VARCHAR:
    }
        } else if (ArrayUtils.contains(PLAIN_TYPE_NAMES, typeName)) {
    public String[] getSingleLineComments() {
        Collection<? extends DBSProcedureParameter> parameters,

            String typeName = inParameters.get(i).getParameterType().getFullTypeName();
            }

        }
        "GETDATE",
import org.jkiss.dbeaver.model.sql.SQLDialectSchemaController;
        return isSqlServer;
import org.jkiss.dbeaver.model.text.parser.TPRuleProvider;
    @NotNull
    public String[] getExecuteKeywords() {
    }

    @Override
            // numeric and decimal - are synonyms in sql server
    public boolean needsDelimiterFor(String firstKeyword, String lastKeyword) {
        return super.getParametersPrefixes();
        super.addSQLKeywords(Arrays.asList(SQLSERVER_EXTRA_KEYWORDS));
        return 'N' + super.getQuotedString(string);
    }
        } else {
package org.jkiss.dbeaver.ext.mssql.model;
            return null;
    @NotNull

        return true;

            // Sybase supports double dash and double slash as single line comment indicators (and "%" - but not recommend to use it in documentation)
        if (string.length() >= 3 && string.charAt(0) == 'N') {
    };
        return true;
                new SQLMultiWordRule(new String[]{"BEGIN", "TRAN"}, keywordToken)

                case SQLServerConstants.TYPE_SQL_VARIANT:
                sql.append(" ");
            if (precision < 1 || precision > SQLServerConstants.MAX_NUMERIC_PRECISION) {
    }
        }
            (SQLServerConstants.TYPE_NUMERIC.equals(lowerTypeName) || SQLServerConstants.TYPE_DECIMAL.equals(lowerTypeName))) {
    @Override
    }
                    // text and ntext don't have max length
        return EXEC_KEYWORDS;
        "PERSISTED",
import org.jkiss.dbeaver.model.text.parser.TPTokenDefault;
    @Override
    }
    public String getBlobDataType() {
    }
        "DATEFROMPARTS",
 *
            }
    }
        if (!isSqlServer) {
                    }
        }
    }
        "DATETIMEFROMPARTS",
    @NotNull
                    } else if (maxLength == -1 || maxLength >= maxStringLength) {
                default:
    public String getClobDataType() {
        @NotNull DBSTypedObject column,
        // SQL Server: All extra characters can be used in unquoted form
                    if (scale != null && scale >= 0 && scale < 7) {

    @NotNull
                    int maxStringLength = CommonUtils.toInt(dataSource.getDataSourceFeature(DBPDataSource.FEATURE_MAX_STRING_LENGTH));

    }
        }
    }
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    @NotNull

 *
                        return null;
        return super.getUnquotedString(string);
        return true;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        return false;
    @Override
    };

    public String getSchemaExistQuery(@NotNull String schemaName) {
    private static final String[] PLAIN_TYPE_NAMES = {
import org.jkiss.dbeaver.model.sql.SQLDialectDDLExtension;
    public String getBooleanDataType() {
    public boolean isQuotedString(String string) {
    @NotNull
    }
            // https://docs.microsoft.com/en-us/sql/t-sql/data-types/nchar-and-nvarchar-transact-sql
        return SQLSERVER_QUOTE_STRINGS;
    public void generateStoredProcedureCall(
                new SQLMultiWordRule(new String[]{"BEGIN", "DISTRIBUTED", "TRAN"}, keywordToken),
    public String getQuotedString(String string) {
        StringBuilder sql, 
                }
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
        return true;
        "SYSUTCDATETIME",
    }
    @Override

    @Override
        return TSQL_BEGIN_END_BLOCK;
    @Override
                        return "(" + scale + ')';
        List<DBSProcedureParameter> inParameters = new ArrayList<>();
    @NotNull
                    }

public abstract class SQLServerDialectBase extends JDBCSQLDialect implements TPRuleProvider, SQLDialectDDLExtension, SQLDialectSchemaController {
        @NotNull String typeName,
        return SQLServerConstants.TYPE_IMAGE;

 *     http://www.apache.org/licenses/LICENSE-2.0
            }
        {"\"", "\""},
        "DATENAME",
    };
            sql.append(CommonUtils.fixedLengthString("-- put the " + name + " parameter value instead of '?' (" + typeName + ")\n", width));
    @Override
                    } else {
    @Override
        String schemaName = proc.getContainer().getParentObject().getName();
        if (string.length() >= 3 && string.charAt(0) == 'N') {
import org.jkiss.dbeaver.model.sql.parser.rules.SQLVariableRule;
        return SQLServerConstants.TYPE_UNIQUEIDENTIFIER;
        return SQLServerConstants.TYPE_VARCHAR + "(max)";
    @Override
    }

    public boolean validIdentifierPart(char c, boolean quoted) {
        return EnumSet.of(

        //sql.append("GO\n\n");


    public String getUnquotedIdentifier(String identifier) {

    public MultiValueInsertMode getDefaultMultiValueInsertMode() {
        SQLServerConstants.TYPE_GEOGRAPHY,
    };
import org.jkiss.dbeaver.model.impl.jdbc.JDBCSQLDialect;
            if (precision == null) {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;

    @NotNull
    }
                case SQLServerConstants.TYPE_NCHAR:
    public boolean supportsAlterColumnSet() {
            // The numeric precision has a range from 1 to 38. The default precision is 38.

                case SQLServerConstants.TYPE_VARBINARY: {
 *
        return SQLServerConstants.TYPE_NVARCHAR + "(max)";
import org.jkiss.code.NotNull;
            switch (lowerTypeName) {
    public boolean supportsNoActionIndex() {

    @Override
    public String[][] getBlockBoundStrings() {

                case SQLServerConstants.TYPE_TEXT:
        "DATEDIFF_BIG",
            return new TPRule[] { new SQLVariableRule(this) };
    @Override
            }


import org.jkiss.dbeaver.model.DBPDataKind;
            // The scale has a range from 0 to p (precision). The scale can be specified only if the precision is specified. By default, the scale is zero
    private JDBCDataSource dataSource;
        "TOP",
                case SQLServerConstants.TYPE_DATETIME2:
    public boolean supportsInsertAllDefaultValuesStatement() {
        sql.append("USE [").append(schemaName).append("]\n");
    }

    @Override
                        } else {
        return isSqlServer; // Sybase throws a syntax error on "DEFAULT" keyword
    }
        for (int i = 0; i < inParameters.size(); i++) {
    public TPRule[] extendRules(@Nullable DBPDataSourceContainer dataSource, @NotNull RulePosition position) {
            }
    @NotNull
    @Override
    }
        {"\"", "\""},
    @Override
    }
            final TPTokenDefault keywordToken = new TPTokenDefault(SQLTokenType.T_KEYWORD);
        return super.getUnquotedIdentifier(identifier).replace("]]", "]");

    @Override
    public String[] getParametersPrefixes() {


        if (position == RulePosition.FINAL) {
import org.jkiss.dbeaver.model.DBPDataSource;
        "SMALLDATETIMEFROMPARTS",

    @Override
        return new TPRule[0];
    }
            }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
                sql.append(", ");
    @NotNull
    private static final String[] SQLSERVER_FUNCTIONS_DATETIME = new String[]{
                }
    public boolean isWordPart(int ch) {
    public boolean supportsAlterHasColumn() {
    public boolean isDelimiterAfterQuery() {
        }
    }
                    Integer scale = column.getScale();
    @NotNull
                    if (maxLength == 0) {

    public String[][] getIdentifierQuoteStrings() {
        return Character.isLetter(c) || Character.isDigit(c) || c == '_' || validCharacters.indexOf(c) != -1;
    public boolean supportsNestedComments() {
    @Override
    }
        "NOLOCK"
    }

    public static final String AUTO_INCREMENT_KEYWORD = "IDENTITY";
                        return "(" + maxLength + ")";

        String lowerTypeName = typeName.toLowerCase(Locale.ENGLISH); // Workaround for generic data types
        if (isSqlServer) {
                new SQLMultiWordRule(new String[]{"BEGIN", "DISTRIBUTED", "TRANSACTION"}, keywordToken),
    private static final String[][] TSQL_BEGIN_END_BLOCK = new String[][]{

    @Override
        }
    @Override
        } else if (dataKind == DBPDataKind.NUMERIC &&
    @Override


            ProjectionAliasVisibilityScope.ORDER_BY
        //sql.append("GO\n\n");
        if (dataKind == DBPDataKind.DATETIME || lowerTypeName.equals(SQLServerConstants.TYPE_DATETIMEOFFSET)) {
                case SQLServerConstants.TYPE_CHAR:
    @Nullable
import org.jkiss.utils.CommonUtils;

    private static final String[] SQLSERVER_EXTRA_KEYWORDS = new String[]{

        return SQLConstants.KEYWORD_MERGE.equalsIgnoreCase(firstKeyword) && lastKeyword != null;
    @NotNull
    @Override
    @Override
    public String getUuidDataType() {
    public String getBigIntegerType() {
    protected SQLServerDialectBase(String name, String id) {
    @Override
        "DATEPART",
    public boolean supportsCreateIfExists() {

}

        addFunctions(Collections.singleton("SQL_VARIANT"));
    }
                precision = 18; // Standard precision value for numeric/decimal types
            Integer scale = column.getScale();
            } else {
        SQLServerConstants.TYPE_GEOMETRY,
    @Override
                case SQLServerConstants.TYPE_NTEXT:
    }
        this.isSqlServer = SQLServerUtils.isDriverSqlServer(dataSource.getContainer().getDriver());
        }
 */
            if (scale > precision) {
        return super.isWordStart(ch) || ch == '#';

    }
            // https://docs.microsoft.com/en-us/sql/t-sql/data-types/nchar-and-nvarchar-transact-sql
        boolean castParams
        return SQLServerConstants.TYPE_BIT;
        "TIMEFROMPARTS",
        return true;
    }
            Integer precision = column.getPrecision();
        {"[", "]"},
                precision = SQLServerConstants.MAX_NUMERIC_PRECISION;

 * See the License for the specific language governing permissions and
            sql.append("\t\t").append(name).append(" = :").append(CommonUtils.escapeIdentifier(name));
    @Override
    }
        return SQLServerConstants.TYPE_DATETIME;
        return AUTO_INCREMENT_KEYWORD;
    public String[] getScriptDelimiters() {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    private static final String[] EXEC_KEYWORDS = {"CALL", "EXEC", "EXECUTE"};

    }
        "SWITCHOFFSET",
        //return new String[] { "@" };
            return super.getUnquotedString(string.substring(1));


    }
