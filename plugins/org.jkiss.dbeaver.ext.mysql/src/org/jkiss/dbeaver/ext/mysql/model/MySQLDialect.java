public class MySQLDialect extends JDBCSQLDialect implements SQLDialectSchemaController, SQLDialectDDLExtension {

        this.lowerCaseTableNames = ((MySQLDataSource) dataSource).getLowerCaseTableNames();
    public String unEscapeString(String string) {
import org.jkiss.dbeaver.model.sql.*;
    }
        "SUBSTR",
        "SPACE",
        "STRAIGHT_JOIN"
        // No anonymous blocks in MySQL
        return "DELIMITER";
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
        "UUID_TO_BIN",

    }
        if (matcher.lookingAt()) { // we should quote numeric names and names starts with number
        return string.replace("''", "'").replace("``", "`").replace("\\\\", "\\");
        "ISNULL",
        }
        "FROM_BASE64",
    }
        // Escape with first (default) quote string

        return "TINYINT(1)";
    @NotNull
        return string.replaceAll("\\\\(?![_%?])", "\\\\\\\\");
    @Nullable
    public void afterDataSourceInitialization(@NotNull DBPDataSource dataSource) {


        "DATE_SUB",
    }
    }
        "JSON_INSERT",
        "REPAIR",
    }
    }
        "ST_GEOMFROMTEXT",
        return escapeString(string, null);
    }
        "NULLIF",
    @Override
    }
    }
        addTableQueryKeywords(SQLConstants.KEYWORD_EXPLAIN, "DESCRIBE", "DESC");
import org.jkiss.utils.ArrayUtils;

    private static final String[] MYSQL_GEOMETRY_FUNCTIONS = {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        "JSON_ARRAY_APPEND",

        );
        "JSON_MERGE_PRESERVE",
import org.jkiss.code.Nullable;
    }
        "HOUR",
        addFunctions(List.of("SLEEP"));

        "ST_POINTFROMTEXT",
        "ADDDATE",
    @NotNull
        return null;

            ProjectionAliasVisibilityScope.GROUP_BY,

        return true;

import java.util.List;
        addFunctions(Arrays.asList(JSON_FUNCTIONS));
    public MySQLDialect(String name, String id) {
 * you may not use this file except in compliance with the License.
        "JSON_QUOTE",
        "ST_POLYFROMTEXT"
    @Override

        "JSON_CONTAINS_PATH",
            return '\'' + escapeString(strValue) + '\'';
        "ALGORITHM",
    @NotNull
        addDataTypes(List.of("CHAR"));
        BasicSQLDialect.NON_TRANSACTIONAL_KEYWORDS,


        "TO_SECONDS",
            SQLConstants.KEYWORD_EXPLAIN, "DESCRIBE", "DESC"}

        "MAKEDATE",
        "GROUP_CONCAT",
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
        "REGEXP_LIKE",
    @NotNull
    public String escapeString(String string) {

    );
    @NotNull

    public String getCreateSchemaQuery(@NotNull String schemaName) {

        "JSON_OBJECT",

 * Licensed under the Apache License, Version 2.0 (the "License");
        return EnumSet.of(

            ProjectionAliasVisibilityScope.ORDER_BY
        "FIRST_VALUE",

    public boolean supportsNoActionIndex() {
    };
import org.jkiss.code.NotNull;
        } else {
    public boolean supportsUuid() {
        "JSON_VALID",
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0


    public int getSchemaUsage() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
        }
        "ST_ASWKT",

    @Override


        "JSON_LENGTH",

    @Override
    }
        "LENGTH",
    public String[][] getBlockBoundStrings() {

    @Override
        "FORMAT",
        super("MySQL", "mysql");
        "ST_GEOMCOLLFROMTEXT",
            return "CAST(" + expression + " AS JSON)";
    @Override
    protected String escapeString(@NotNull String string, @Nullable String[] quotes) {
    }
}

    @NotNull
        "LAG",
    }
    @Override


    @NotNull
        "REGEXP_INSTR",
import java.util.EnumSet;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
        super.initDriverSettings(session, dataSource, metaData);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCSQLDialect;
    }

        return MYSQL_QUOTE_STRINGS;
    public String getBlobDataType() {
    public String getAlterColumnOperation() {
    }
    }
        return true;
    @Override
        addSQLKeywords(Arrays.asList(ADVANCED_KEYWORDS));
        return MYSQL_NON_TRANSACTIONAL_KEYWORDS;
    public boolean validIdentifierStart(char c) {
    private static final String[] ADVANCED_KEYWORDS = {
import java.util.regex.Pattern;
    public MultiValueInsertMode getDefaultMultiValueInsertMode() {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
    public boolean supportsAlterColumnSet() {
        "SESSION_USER",
    public boolean supportsTableDropCascade() {
        return lowerCaseTableNames != 0;
        return false;
        "ST_GEOMETRYCOLLECTIONFROMTEXT",
    @NotNull

        "JSON_CONTAINS",
        return true;
        "ST_LINEFROMTEXT",

    @Override
    public boolean supportsCommentQuery() {
        "COMPRESS",
    public String getTestSQL() {
    }
        "EXTRACT",
    public DBPIdentifierCase storesQuotedCase() {
 */
    @Override
        return super.mustBeQuoted(str, forceCaseSensitive);
    }
    @Override
        return true;
    @NotNull

    @Override
        "REPLACE",
        "TO_BASE64",

            ProjectionAliasVisibilityScope.HAVING,
    }
            "CREATE", "ALTER", "DROP",

    public String[] getExecuteKeywords() {
        "RANDOM_BYTES",
    @Override
        "JSON_KEYS",
 *
        "JSON_SET",
            return super.getTypeCastClause(attribute, expression, isInCondition);
            "USE", "SHOW",
        return new String[] { "-- ", "--\t", "#" };
    }
    public String getBigIntegerType() {
        addFunctions(Arrays.asList(MYSQL_EXTRA_FUNCTIONS));
    @Override
    @Override
        "DATEDIFF",
        return "SHOW DATABASES LIKE " + getQuotedString(schemaName);
        return SQLDialect.USAGE_ALL;
        return "BLOB";
        "AUTO_INCREMENT",
    public boolean useCaseInsensitiveNameLookup() {
    public boolean mustBeQuoted(@NotNull String str, boolean forceCaseSensitive) {
    @Override
        Matcher matcher = ONE_OR_MORE_DIGITS_PATTERN.matcher(str);
package org.jkiss.dbeaver.ext.mysql.model;
import java.util.regex.Matcher;
    @NotNull
            return true;
        return true;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    @Override
        "JSON_MERGE",
        "JSON_REPLACE",
        "JSON_ARRAY",
    public String getUuidDataType() {
    }
    }
    public String[] getSingleLineComments() {
        "JSON_MERGE_PATCH",

 */
        {"`", "`"},

        "ST_MPOINTFROMTEXT",
        "TIMEDIFF",
 * DBeaver - Universal Database Manager
    }
    private int lowerCaseTableNames;
    }
        "LAST_VALUE",
        return quoteStrings[0][0] + escapeString(str, quoteStrings[0]) + quoteStrings[0][1];

/**

    private static final Pattern ONE_OR_MORE_DIGITS_PATTERN = Pattern.compile("[0-9]+");
        "YEAR"
        "UUID",
    public String escapeScriptValue(DBSTypedObject attribute, @NotNull Object value, @NotNull String strValue) {
    public boolean supportsAliasInSelect() {
 * See the License for the specific language governing permissions and
        "ANY_VALUE",
import org.jkiss.dbeaver.model.DBPDataSource;
        "JSON_OBJECTAGG",

        return c == '_' || SQLUtils.isLatinLetter(c);
    }
    protected String quoteIdentifier(@NotNull String str, @NotNull String[][] quoteStrings) {
    public EnumSet<ProjectionAliasVisibilityScope> getProjectionAliasVisibilityScope() {
        "IFNULL",
 * Copyright (C) 2010-2026 DBeaver Corp and others
        "JSON_UNQUOTE",

        return "MODIFY";
        "ST_MPOLYFROMTEXT",

        "LEAD",
        }
    }
    public String getScriptDelimiterRedefiner() {
        return '\\';
    @Override
    @NotNull

    public boolean isAmbiguousCountBroken() {
        new String[]{
        "COALESCE",
        "ENGINE",
import java.util.Arrays;
    }

    public char getStringEscapeCharacter() {
        } else {
    };
        if (isInCondition && attribute.getTypeName().equalsIgnoreCase(MySQLConstants.TYPE_JSON)) {
    @Override
    @Override
    };

        {"\"", "\""},
    @Override
    @Override
    public String getTypeCastClause(@NotNull DBSTypedObject attribute, @NotNull String expression, boolean isInCondition) {
    @Override
        "DATE_ADD",
        "REGEXP_REPLACE",
    @Override
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        return "BIGINT";
 * Unless required by applicable law or agreed to in writing, software
    public static final String[][] MYSQL_QUOTE_STRINGS = {
        "ST_MLINEFROMTEXT",

        "SUBTIME",


        "JSON_TABLE",
        this.setSupportsUnquotedMixedCase(lowerCaseTableNames != 2);
        "JSON_ARRAY_INSERT",
    private static final String[] JSON_FUNCTIONS = {
        }
        "CAST",
            string = super.escapeString(string);
        if (attribute.getTypeName().equalsIgnoreCase(MySQLConstants.TYPE_JSON)) {
    @Override
    }

    private static final String[] MYSQL_EXTRA_FUNCTIONS = {
        return "TIMESTAMP";
    @Override
        removeSQLKeyword("SOURCE");

    protected boolean useBracketsForExec(DBSProcedure procedure) {

    }
        "JSON_TYPE",
            string = string.replace(quotes[0], quotes[0] + quotes[0]);
    @NotNull
    }
        "WEEKOFYEAR",
        "DAY",
    private static final String[] EXEC_KEYWORDS =  { "CALL" };
        "MONTH",
    public MySQLDialect() {
    @Override
    @NotNull
    @Override
    public String getTimestampDataType() {

    public boolean supportsCreateIfExists() {
    }
    @Nullable
    public boolean supportsAlterHasColumn() {
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
        "JSON_SEARCH",

        return EXEC_KEYWORDS;
        "MAKETIME",
    @NotNull
    public String getAutoIncrementKeyword() {
        return true;
    @Override

        "JSON_DEPTH",
        "JSON_EXTRACT",
        if (quotes != null) {
    public String getSchemaExistQuery(@NotNull String schemaName) {
    }
 * limitations under the License.
    @Override
    @NotNull
    @Override
        return "AUTO_INCREMENT";
    @NotNull

    };
        addFunctions(Arrays.asList(MYSQL_GEOMETRY_FUNCTIONS));

    public static final String[] MYSQL_NON_TRANSACTIONAL_KEYWORDS = ArrayUtils.concatArrays(
        "DATABASES",
        "JSON_VALUE"
    }
    }
 *
        "COLUMNS",

    @Override
        "LEAST",
    }
    }
    @Override
    @Override
        "JSON_REMOVE",
        initBaseDriverSettings(session, dataSource, metaData);
    @Override
    public void initBaseDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
        "FOUND_ROWS",
        super(name, id);
        "COLLATION",

    public String getBooleanDataType() {
    }
    };
    }
    public String getClobDataType() {
    @Override
        // CHAR is data type, not function
        removeSQLKeyword("CHAR");
        "JSON_ARRAYAGG",
        return MultiValueInsertMode.GROUP_ROWS;
        return super.escapeScriptValue(attribute, value, strValue);
        return true;
        // Use brackets for CallableStatement. Support for procedures only
 * MySQL dialect
        "REGEXP_SUBSTR",
    @Override
        return "SELECT 1";

        "GET_FORMAT",
    @NotNull
        return "TEXT";
        addDataTypes(Arrays.asList("GEOMETRY", "POINT"));
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;

    }
    public String[][] getIdentifierQuoteStrings() {
    }
 *
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
    }
        return true;
import org.jkiss.dbeaver.model.DBPIdentifierCase;
        "MINUTE",

    }
    }
    @Override
    @Nullable
        return "CHAR(36)";
        return "CREATE DATABASE " + schemaName;
        "ADDTIME",
    public String[] getNonTransactionKeywords() {
        return procedure.getProcedureType() == DBSProcedureType.PROCEDURE;
/*
    @Override
    @NotNull
    }
        return DBPIdentifierCase.MIXED;
    @Override
