    boolean supportsAsKeywordBeforeAliasInFromClause();
    /**
     */


    String unEscapeString(String string);
    int USAGE_DDL = 2;
     * separator between a structured objects (e.g. schema and table).
        Collection<? extends DBSProcedureParameter> parameters,
     * Retrieves the <code>String</code> that this database uses as the
    @NotNull
    String[] getTransactionRollbackKeywords();
        @NotNull DBPDataSource dataSource,

    /**
        boolean castParams
     * Encode value to string format (to use it in scripts, e.g. in INSERT/UPDATE statements)
 * DBeaver - Universal Database Manager
    @Nullable
     */
     *
package org.jkiss.dbeaver.model.sql;
    String getTypeCastClause(@NotNull DBSTypedObject attribute, String expression, boolean isInCondition);
    String getSearchStringEscape();
    );
    @NotNull
     */



import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
    @NotNull
     * Check whether dialect support plain comment queries (queries which contains only comments)


     * Used e.g. to SQL export
    SQLStateType getSQLStateType();
     *         SQL92 keywords




     * @return sql state type
     * @return the array of string pairs
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
    }

     */

     *

    @NotNull

    String[] getExecuteKeywords();


    @Nullable
    Pair<String, String> getMultiLineComments();
    @Nullable
     */
     * @return true if incoming string must be quoted
     * Returns true if need to escape backslash character
     * @return the separator string

    /**

    boolean isAttributeQueryWord(@NotNull String word);
    boolean supportsAliasInUpdate();
    @Nullable
     * Retrieves a list of execute keywords. If database doesn't support implicit execute returns empty list or null.
     *
     * @param attribute   attribute data to help decide whether cast and how to cast
     */
    @Nullable



     * True if dialect requires delimiter for a query which starts with @firstKeyword and ends with @lastKeyword
     * Column name to list all table columns. Usually asterisk (*).
    /**

import java.util.EnumSet;

     * @return fully qualified table name or null if table name is not needed.
    boolean supportsNullability();
    boolean supportsTableDropCascade();
     * @return schema usage

    @NotNull
     * Returns true if query is definitely transactional. Otherwise returns false, however it still may be transactional.
    ) throws DBException;
     * @param strValue    string representation (default result)
     * Retrieves the string that can be used to escape wildcard characters.
     */
    /**
     * Escapes string to make usable inside of SQL queries.
import java.util.Collection;
     * @return inner block prefixes or null (if not supported)
     * Data query keywords. By default it is SELECT

 *     http://www.apache.org/licenses/LICENSE-2.0

     * Returns clob comparing part for where clause.
            ProjectionAliasVisibilityScope.HAVING,

     * Script delimiter characters

        @NotNull DBDDataFilter filter
     */
import org.jkiss.code.NotNull;

     * @return            casted attribute name

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    boolean supportsQuotedMixedCase();
     * Determines if the block is a child of the header block.

     * True if anonymous SQL blocks must be finished with delimiter
    /**
     * that are NOT also SQL92 keywords.
        PLAIN,
     * Enables to call particular cast operator or function for special data types.
    String getDefaultGroupAttribute();
    /**
    record GlobalVariableInfo(String name, String description, DBPDataKind type) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull
    boolean isQuotedIdentifier(String identifier);
    /**
 * you may not use this file except in compliance with the License.
     * @param c character
     * <P>The '_' character represents any single character;
import org.jkiss.dbeaver.model.DBPIdentifierCase;
     * Used to evaluate expressions, call procedures, etc.

    }
     * Retrieves the <code>String</code> that this database uses as the
    boolean supportsOrderByIndex();
     * Retrieves a list of all of this database's SQL keywords
    Pair<String, String> getInClauseParentheses();
    String getUnquotedString(String string);
    /**
     */
     * Dual table name.

     * True if anonymous SQL blocks must be finished with delimiter
     * @return the string used to escape wildcard characters
    boolean supportsUnquotedMixedCase();
     * @param forceCaseSensitive the level of case sensitivity
    boolean isCatalogAtStart();

     * @return string array or null if multi-line comments are not supported
    enum MultiValueInsertMode {
     *
     */
        DBSProcedure proc, 
    @NotNull
    String escapeScriptValue(DBSTypedObject attribute, @NotNull Object value, @NotNull String strValue);
    String getQuotedIdentifier(String identifier, boolean forceCaseSensitive, boolean forceQuotes);
    @Nullable
public interface SQLDialect {
    DBDBinaryFormatter getNativeBinaryFormatter();
     * Generates a set of connection-specific dialect features which require special handling during SQL parsing
    String[][] getStringQuoteStrings();
    String getQuotedString(String string);
    @NotNull
     */
     */
 *
     * @return escaped string

    @NotNull
    /**
    /**

        );
    Collection<String> getReservedWords();
    int USAGE_INDEX = 8;
     * Retrieves strings used to quote SQL identifiers.
    @NotNull
     * Schema name usage in queries
    /**

        return false;

/**
    /**
     * @return true or false

import org.jkiss.dbeaver.model.data.DBDDataFilter;
    String[] getDMLKeywords();

    char getStringEscapeCharacter();
     * @param isInCondition helps to understand the application place of the method

    /**
    boolean supportsCommentQuery();


     */
        @Nullable DBRProgressMonitor monitor,

    String getColumnTypeModifiers(DBPDataSource dataSource, @NotNull DBSTypedObject column, @NotNull String typeName, @NotNull DBPDataKind dataKind);
    boolean supportsAliasInSelect();
    String[] getScriptDelimiters();
    boolean mustBeQuoted(@NotNull String str, boolean forceCaseSensitive);
    String escapeString(String string);
    String getOffsetLimitQueryPart(int offset, int limit);



    String[] getQueryKeywords();
     * Returns true when database dialect allows <b>table</b> alias in FROM clause
     * This actually seems to be Oracle 9 and earlier JDBC driver issue.
     * Retrieves whether a catalog appears at the start of a fully qualified

import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
    String[] getTransactionCommitKeywords();
    int USAGE_ALL = Integer.MAX_VALUE;
     */
     */
     * @return catalog usage
        return true;
    /**
     * @param attribute   value attribute to help decide whether cast and how to cast

 * See the License for the specific language governing permissions and

 */
     */
    @NotNull
    /**
     */
     */
     * @return comment prefixes or null if single line comments are nto supported
     * Retrieves a list of execute keywords. If database doesn't support implicit execute returns empty list or null.
    char getStructSeparator();
    @NotNull

    SQLTokenPredicateSet getSkipTokenPredicates();

     */
     */

    /**
import org.jkiss.code.Nullable;
    /**
     */
     */
     * Formats stored procedure call. By default returns @sqlText.
    /**
    boolean supportsIndexCreateAndDrop();
    /**
     * @return block header string or null (not supported)
     */
     * Checks that specified character is a valid identifier part. Non-valid characters should be quoted in queries.
     * Inner block prefixes strings.
    /**
    @Nullable
    @Nullable
     * @return MultiValueInsertMode enum value
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * Copyright (C) 2010-2024 DBeaver Corp and others

     * Quoting functions

     * Enables to call particular cast operator or function for special attribute name.
     * Returns offset and limit query parts. Limit syntax is different for databases.
     *
    boolean isStripCommentsBeforeBlocks();
     */
     * @param str - string that must be unquoted for this check - otherwise method will return true
    }
    }
     */
    /**



    DBPIdentifierCase storesUnquotedCase();
     */
    @NotNull

    @NotNull
    String[] getBlockHeaderStrings();
    boolean isCRLFBroken();
    /**
     */
    @NotNull
    String[] getDDLKeywords();
    @NotNull
     * @return <code>true</code> if the catalog name appears at the beginning
    boolean isTransactionModifyingQuery(String queryString);
    /**
    String getDialectId();
    @NotNull
    @NotNull
import org.jkiss.dbeaver.model.DBPKeywordType;
    String addFiltersToQuery(
    /**
    /**
     * Catalog name usage in queries
    boolean isQuotedString(String string);
        WHERE,
     * Dialect name
    @NotNull
            ProjectionAliasVisibilityScope.GROUP_BY,
    @Nullable

    @Nullable

    /**
     */
    @NotNull
    boolean supportsNestedComments();
     */
    default boolean supportsQualifiedColumnNames() {

     *
     */
    enum ProjectionAliasVisibilityScope {
    /**
     * @return the list of this database's keywords that are not also
import org.jkiss.dbeaver.model.DBPDataKind;
    boolean isEscapeBackslash();
     */
    /**
     */
     * (empty by default)
     *         of a fully qualified table name; <code>false</code> otherwise
     */
    /**
}
    @Nullable
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        NOT_SUPPORTED,
    String[] getSingleLineComments();

    @Nullable
    boolean supportsUuid();

    void generateStoredProcedureCall(
        GROUP_BY,

        @NotNull String query,

    boolean useCaseInsensitiveNameLookup();


     */
     * Returns true if the comments need to be removed from the statement if
    boolean supportsAliasInHaving();
    String[][] getBlockBoundStrings();
        return EnumSet.of(
    int USAGE_NONE = 0;
     * @param string string to escape
            ProjectionAliasVisibilityScope.WHERE,
    String getScriptDelimiterRedefiner();
import java.util.List;
     * @param quoted is identifier quoted

     * @return array of possible script delimiters with first element as default delimiter
        public static GlobalVariableInfo[] EMPTY_ARRAY = new GlobalVariableInfo[0];
    /**

    String getUnquotedIdentifier(String identifier, boolean unescapeQuotesInsideIdentifier);
            ProjectionAliasVisibilityScope.ORDER_BY

     */
    String getDualTableName();
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
    /**

     * the '%' character represents any sequence of zero or
     */
    boolean supportsInsertAllDefaultValuesStatement();
 */
     * Checks whether dialect supports alias for queries with HAVING syntax.

    }
    /**
    boolean isDisableScriptEscapeProcessing();
    String getCastedAttributeName(@NotNull DBSAttributeBase attribute, String attributeName);
     * they are right before the block declaration
    boolean validIdentifierStart(char c);
     * Reports about broken CRLF. Queries mustn't contain CRLF line feeds, only LF.
    boolean supportsSubqueries();
    SQLQueryGenerator getQueryGenerator();
     * @param expression      string representation for cast
     * Basically it has to escape only ' character which delimits strings.
    @NotNull
    boolean isKeywordStart(@NotNull String word);
 *
     * @return            casted string
    boolean supportsAliasInConditions();


     * of the wildcard characters).
    List<String> getMatchedKeywords(@NotNull String word);
     * Null if not supported
    @Nullable
    String[] getInnerBlockPrefixes();
     * Generates stored procedure call. Parameters (optionally) can be surrounded by cast(:param as paramType).
    /**
    String[][] getIdentifierQuoteStrings();
    boolean hasCaseSensitiveFiltration();

    /**
        GROUP_ROWS,
    /**
     * Begins SQL block header (most typical: DECLARE).

    String getCatalogSeparator();
    MultiValueInsertMode getDefaultMultiValueInsertMode();
     */
/*

     * SQL state type
     * @return a set of token predicates
    String getDialectName();
    @NotNull
    boolean supportsAlterTableStatement();
    String getAllAttributesAlias();
     * Generates full type name for drivers which don't implement {@link DBSTypedObject#getFullTypeName()}
    /**
        StringBuilder sql, 
    @NotNull

     */

     * @param value       original value
     *
    String[] getParametersPrefixes();
    @Nullable
        ORDER_BY
    String getTestSQL();
    String getClobComparingPart(@NotNull String columnName);

     */

     * more characters.
    /**
    /**
     * separator between a catalog and table name.
    int USAGE_PROC = 4;
    /**
     */
    /**


import org.jkiss.dbeaver.DBException;
    @NotNull
     * <p/>
     * Two-item array containing begin and end of multi-line comments.
    boolean validIdentifierPart(char c, boolean quoted);
    String formatStoredProcedureCall(DBPDataSource dataSource, String sqlText);




     */
     * @return SQL dialect name
    boolean isWordPart(int ch);
 * SQL dialect
    boolean supportsColumnAutoIncrement();

     * SQL block statements (BEGIN/END).
     */
    /**
    DBPKeywordType getKeywordType(@NotNull String word);
 * You may obtain a copy of the License at
     */
    /**

     * table name.  If not, the catalog appears at the end.
     * Strings (in single or double quotes) escape character. Zero (i.e. no scape character) by default.
    boolean needsDelimiterFor(String firstKeyword, String lastKeyword);
    int getKeywordNextLineIndent(@NotNull String word);
        INSERT_ALL
import org.jkiss.dbeaver.model.data.DBDBinaryFormatter;
     * Column name to use in grouping queries like COUNT. Usually asterisk (*).
    int USAGE_DML = 1;
    default void afterDataSourceInitialization(@NotNull DBPDataSource dataSource) {
     * This is the string that can be used to escape '_' or '%' in
     * Back slash in many dialects
     * Script block header string.

    /**
     * @return the array of string pairs

    Collection<String> getFunctions();
    default boolean useEmptyStringForNulls() {
        HAVING,
     * You need to check query results to ensure that it is not transactional.
     */

import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
     * This method returns null or empty array if identifier quoting is not supported.

    String getUnquotedIdentifier(String identifier);
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
     * List of possible single-line comment prefixes
     */
 * limitations under the License.
     * Default multi-value insertion mode
 *

import org.jkiss.utils.Pair;
    @NotNull
    int getSchemaUsage();
    int USAGE_PRIV = 8;
     * @param attribute   value attribute to help decide whether value should be escaped or not
    /**
     * @return the separator string
    @NotNull
    int getCatalogUsage();

    default EnumSet<ProjectionAliasVisibilityScope> getProjectionAliasVisibilityScope() {
     */

     */

     * the catalog search parameters that are a pattern (and therefore use one
    DBPIdentifierCase storesQuotedCase();
    /**
    /**

    boolean isWordStart(int ch);
     */
    @Nullable
    /**

    Collection<String> getDataTypes(@Nullable DBPDataSource dataSource);
    boolean isDelimiterAfterBlock();

     * Retrieves strings used to quote SQL strings.
    boolean isEntityQueryWord(@NotNull String word);
import org.jkiss.dbeaver.model.DBPDataSource;
    SQLExpressionFormatter getCaseInsensitiveExpressionFormatter(@NotNull DBCLogicalOperator operator);

    boolean isDelimiterAfterQuery();
import org.jkiss.dbeaver.model.sql.parser.SQLTokenPredicateSet;
    @NotNull
