 */
    @NotNull
        //getMaxParameterLength(parameters, inParameters);
        // Escape with first (default) quote string
            return str;
    public DBDBinaryFormatter getNativeBinaryFormatter() {
    @Override
    @Nullable

        } else {
        if (ArrayUtils.isEmpty(quoteStrings)) {
    @Override
    public boolean supportsUuid() {
    @Override


    }
    public boolean supportsAliasInUpdate() {
                str = str.replace(q1, q1 + q1);
                String ciKeyword = keyword.toUpperCase(DEF_LOCALE);
        return Character.isLetter(c) || Character.isDigit(c) || c == '_';
    }
                    // We can't mark keywords as functions or types because keywords are reserved and
            return false;
    @Nullable
    }
        }
    public boolean isCatalogAtStart() {
    // avoiding ConcurrentModificationException (CB-5521)
            return SQLConstants.KEYWORD_SELECT + " " + proc.getFullyQualifiedName(DBPEvaluationContext.DML);


    @Override
    @Override
        return DBPIdentifierCase.UPPER;

            }
        String upperCaseWord = word.toUpperCase(DEF_LOCALE);
        // Check for bad characters
    public boolean supportsNestedComments() {
 * Unless required by applicable law or agreed to in writing, software
            types.put(type.toUpperCase(DEF_LOCALE), type);


    public String getCatalogSeparator() {
                    if (precision > 0) {
        }
    }
    @Override
        if (mustBeQuoted(str, forceCaseSensitive) || forceQuotes) {
    public boolean supportsOrderByIndex() {
    }
        }
 *
            identifier = DBUtils.getUnQuotedIdentifier(identifier, quoteStrings[i][0], quoteStrings[i][1]);
    @Override

        return true;
    @NotNull
    public static final String[][] DEFAULT_STRING_QUOTES = {{"'", "'"}};
 * DBeaver - Universal Database Manager
    protected boolean useBracketsForExec(DBSProcedure procedure) {
                        continue;
    }
    protected void addColumnQueryKeywords(String ... keywords) {
            return str;

    public String getUnquotedString(String string) {
                    /*if (scale == 0) {
        } else {
    @Override
    public boolean isEscapeBackslash() {
            if (param.getParameterKind() == DBSProcedureParameterKind.IN) {
}
    protected void addSQLKeywords(Collection<String> allKeywords) {
    private static boolean containsKeyword(String[] keywords, String keyword) {
    @Override
                            return null;
    }
        if (queryString.isEmpty()) {
        addKeywords(allTypes, DBPKeywordType.TYPE);
    @NotNull
    @Override
        return QUERY_KEYWORDS;

                }
            }
        return DEFAULT_LINE_COMMENTS;
    protected AbstractSQLDialect() {
     * @attributeName is preformatted name of attribute
    @Override

                            }
    public boolean isCRLFBroken() {
    private final Pair<String, String> multiLineComments = new Pair<>(SQLConstants.ML_COMMENT_START, SQLConstants.ML_COMMENT_END);
    @Override
import org.jkiss.utils.CommonUtils;
                if (scale != null && scale >= 0 && precision >= 0 && !(scale == 0 && precision == 0)) {
        for (String keyword : keywords) {
    private final ConcurrentNavigableMap<String, String> reservedWords = new ConcurrentSkipListMap<>();
        if (attribute instanceof DBSObject && !DBUtils.isPseudoAttribute(attribute)) {


        } else {
    @Override
    public boolean supportsTableDropCascade() {

    }
    }

    }

        return DDL_KEYWORDS;
    public String getColumnTypeModifiers(@NotNull DBPDataSource dataSource, @NotNull DBSTypedObject column, @NotNull String typeName, @NotNull DBPDataKind dataKind) {
        return false;
        return false;
    }
    @Override
        return IN_CLAUSE_PARENTHESES;
                        if (lengthLimit < 0) {
    public String getAllAttributesAlias() {
        if (!hasBadChars && !str.isEmpty()) {
        return columnQueryWords.values();
import org.jkiss.dbeaver.model.data.DBDDataFilter;
            return false;
                // Bit string?
    @Override
            this.original = original;
        return null;
    protected void addSQLKeyword(String keyword) {
    }
    }
    }

        StringBuilder sql, 
        return multiLineComments;
    @Override
    ) throws DBException {

        String ciWord = keyword.toUpperCase(DEF_LOCALE);

    public String getUnquotedIdentifier(String identifier, boolean unescapeQuotesInsideIdentifier) {
            columnQueryWords.put(keyword.toUpperCase(DEF_LOCALE), keyword);

    }
                dataType = DBUtils.getLocalDataType(((DBSObject) column).getDataSource(), column.getTypeName());

                // See how unquoted identifiers are stored

                        // FIXME: On Oracle it returns bigger values than maximum (#1767)
                }
                    case RETURN:
            }
            sql.append(";");
                    break;
    @Override
        return false;
                break;
        boolean castParams


                            sql.append("cast(").append(namedParameterPrefix).append(CommonUtils.escapeIdentifier(parameter.getName()))
            final DBSDataType dataType;
        return SQLStateType.SQL99;
    }

    }
                            sql.append(namedParameterPrefix).append(CommonUtils.escapeIdentifier(parameter.getName()));

    @NotNull
    public boolean supportsCommentQuery() {
    @NotNull
                }
    }
    private static final Collection<String> TRANSACTION_NON_MODIFYING_KEYWORDS =
     *

    @NotNull
        }
    protected void addFunctions(Collection<String> allFunctions) {
        }
    }
    @Override
    @Override
                identifier = identifier.replace(quoteStrings[i][0] + quoteStrings[i][0], quoteStrings[i][0]);
    }
                        break;
        return true;
    @NotNull
    
        return String.valueOf(SQLConstants.STRUCT_SEPARATOR);

        return Character.isUnicodeIdentifierPart(ch);
        for (String function : allFunctions) {
                                .append(" as ").append(typeName).append(")");
    @Override
                        }
    }
    public String getTypeCastClause(@NotNull DBSTypedObject attribute, String expression, boolean isInCondition) {
    public static final String ID = "basic";
    }
    }
import org.jkiss.utils.ArrayUtils;
            for (DBSProcedureParameter parameter : inParameters) {
import org.jkiss.dbeaver.model.sql.parser.EmptyTokenPredicateSet;
        return USAGE_NONE;
            return executeKeywords[0] + " " + proc.getFullyQualifiedName(DBPEvaluationContext.DML);
    public String getCastedAttributeName(@NotNull DBSAttributeBase attribute, String attributeName) {
    @Override
            return false;
            }
        return getQueryGenerator().getQueryWithAppliedFilters(monitor, dataSource, query, filter);

     */
    @NotNull
        reservedWords.put(ciWord, keyword);
    @Override
    @NotNull
    }
    @Override
                    if (maxStringLength instanceof Number) {
                    return "(" + precision + ')';
    public String addFiltersToQuery(
            if (!this.useCaseInsensitiveNameLookup()) {
    }
                    maxParamLength = param.getName().length();
    @Override
                        }
    }
    @Override
                dataType = ((DBSTypedObjectEx) column).getDataType();
                    default -> hasBadChars;
            functions.put(function.toUpperCase(DEF_LOCALE), function);

    public String[] getTransactionRollbackKeywords() {
            this.type = type;

import org.jkiss.dbeaver.model.impl.data.formatters.BinaryFormatterHexNative;
    public String getDualTableName() {
     * Add keywords.
        List<DBSProcedureParameter> inParameters = new ArrayList<>();
    @Override
    protected int getMaxParameterLength(Collection<? extends DBSProcedureParameter> parameters, List<DBSProcedureParameter> inParameters) {

        return sqlText;
 * Licensed under the Apache License, Version 2.0 (the "License");
                        } else if (lengthLimit < maxLength) {
    protected String quoteIdentifier(@NotNull String str, @NotNull String[][] quoteStrings) {
            }
    }
    }
    @Override
    }
            prefStore = dataSource.getContainer().getPreferenceStore();
    @Override
        Collection<? extends DBSProcedureParameter> parameters, 
    }
        if (value instanceof UUID) {
        if (proc.getProcedureType() == DBSProcedureType.FUNCTION || ArrayUtils.isEmpty(executeKeywords)) {
    @Override
    public boolean supportsQuotedMixedCase() {
        }
        if (isQuotedIdentifier(str)) {
    }
    @Override
        if (!hasBadChars && forceCaseSensitive) {

    }
    @Override
    @NotNull
        for (String kw : allKeywords) {


import org.jkiss.dbeaver.model.struct.*;
    @Override
        return false;
    }
        boolean hasBadChars = (keywordType == DBPKeywordType.KEYWORD || keywordType == DBPKeywordType.TYPE || keywordType == DBPKeywordType.OTHER) &&
                    boolean badValue = maxLength == Integer.MAX_VALUE || maxLength == Long.MAX_VALUE;
        return types.values();
    public static final String[][] DEFAULT_IDENTIFIER_QUOTES = {{"\"", "\""}};
    @Override
    @Override
            sql.append(" }");
    protected void removeSQLKeyword(String keyword) {



        queryString = SQLUtils.stripComments(this, queryString);
    @NotNull
    ) {
     * @param set  keywords. Must be in upper case.
    @Override
            } else {
    /**
        return supportsAlterTableStatement();
    }
        if (getKeywordType(firstKeyword) != DBPKeywordType.KEYWORD) {
    protected Collection<String> getTableQueryWords() {
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;

    @Override
            if (typeName.indexOf('(') == -1) {
    public boolean isQuotedIdentifier(String identifier) {
    @Override
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
        return null;
        sql.append("\n\n");
    @NotNull
                    Object maxStringLength = dataSource.getDataSourceFeature(DBPDataSource.FEATURE_MAX_STRING_LENGTH);
    public boolean isTransactionModifyingQuery(String queryString) {
    }
                        int lengthLimit = ((Number) maxStringLength).intValue();

        return quoteStrings[0][0] + str + quoteStrings[0][1];
import java.util.*;
    }
                        //precision--; // One character for sign?

    @NotNull

    }

    @Nullable
    @Override

import org.jkiss.dbeaver.model.sql.*;
        return null;

            inParameters.addAll(parameters);
            final String[][] quoteStrings = this.getIdentifierQuoteStrings();
        return !map.isEmpty() && map.firstKey().startsWith(upperCaseWord);
        allKeywords.remove(ciWord);
     * Appends cast clause to attribute name.
    }

        }
                }
    public String getSearchStringEscape() {
    }
                String typeName = parameter.getParameterType().getFullTypeName();

                    case UPPER -> !str.equals(str.toUpperCase());
    @NotNull
                reservedWords.put(ciKeyword, keyword);
    }
            } else {
        }
    public String getUnquotedIdentifier(String identifier) {



    public boolean needsDelimiterFor(String firstKeyword, String lastKeyword) {
    public boolean mustBeQuoted(@NotNull String str, boolean forceCaseSensitive) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.sql.parser.SQLTokenPredicateSet;
    @Override
                // If passed identifier case differs from unquoted then we need to escape it
    public static final Locale DEF_LOCALE = Locale.ENGLISH;

        return '\'' + escapeString(string) + '\'';
    }
    private final Map<String, Integer> keywordsIndent = new HashMap<>();
        if (firstKeyword.isEmpty()) {
        String[][] quoteStrings = this.getIdentifierQuoteStrings();

 * you may not use this file except in compliance with the License.
        }
        return null;
            // anyhow it shouldn't be transactional
        }
    @Override
    public boolean supportsColumnAutoIncrement() {
    public String[] getExecuteKeywords() {
    @NotNull
    public String[] getBlockHeaderStrings() {
    }
            }
        DBSProcedure proc, 
    @Override
                this.isQuoteReservedWords();
    }
    @Override
    }
        return false;
    public SQLExpressionFormatter getCaseInsensitiveExpressionFormatter(@NotNull DBCLogicalOperator operator) {
    }
    }

                attributeName = DBUtils.getObjectFullName(((DBSObject) attribute).getDataSource(), attribute, DBPEvaluationContext.DML);
    public DBPIdentifierCase storesUnquotedCase() {
                    allKeywords.put(ciKeyword, new KeywordHolder(type, keyword));
            } else {
    @Override
    // first line of the call stored procedure SQL (to be overridden)

    }
    public String[][] getIdentifierQuoteStrings() {
                    case IN:
    @NotNull
    }
    public String getScriptDelimiterRedefiner() {
        typeName = CommonUtils.notEmpty(typeName).toUpperCase(DEF_LOCALE);
        @Nullable DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
                            } else {
        return DEFAULT_STRING_QUOTES;
        } else if ((dataKind == DBPDataKind.CONTENT || dataKind == DBPDataKind.BINARY) && !typeName.contains("LOB")) {
        return false;

        return SQLConstants.DEFAULT_SCRIPT_DELIMITER; //$NON-NLS-1$
    }
        addKeywords(allFunctions, DBPKeywordType.FUNCTION);

                    // if some identifier conflicts with keyword it must be quoted.
//                sql.append("\t-- put the ").append(parameter.getName())
    @NotNull
    public SQLStateType getSQLStateType() {
    public String unEscapeString(String string) {
    public boolean supportsSubqueries() {
    @Override
    }
import org.jkiss.code.Nullable;
        return SQLConstants.COLUMN_ASTERISK;
        return keywordHolder == null ? null : keywordHolder.type;
    @Override
        return columnQueryWords.containsKey(word.toUpperCase(DEF_LOCALE));
 *
        return null;
    }
    }
    // Comments
        return isQuotedString(string) ? unEscapeString(string.substring(1, string.length() - 1)) : string;
    protected String getStoredProcedureCallInitialClause(DBSProcedure proc) {
    }
import org.jkiss.code.NotNull;
    private static final String[] QUERY_KEYWORDS = new String[] { SQLConstants.KEYWORD_SELECT };
        return EXEC_KEYWORDS;
        if (set != null) {
        String callEndClause = getProcedureCallEndClause(proc);
            }
    private static final String[][] DEFAULT_BEGIN_END_BLOCK = new String[0][];
        return false;
            final long maxLength = column.getMaxLength();

    public String[] getDDLKeywords() {
    @Override
    }
        // Check for keyword conflict

            if (q1.equals(q2) && (q1.equals("\"") || q1.equals("'")) && str.contains(q1)) {
    @Override

    @Override

import org.jkiss.dbeaver.DBException;
                            }
        if (ArrayUtils.isEmpty(quoteStrings)) {
    public boolean supportsInsertAllDefaultValuesStatement() {
                    case LOWER -> !str.equals(str.toLowerCase());
    @Override
    public boolean isDelimiterAfterQuery() {
        return DBPIdentifierCase.MIXED;

        return false;
 * You may obtain a copy of the License at
        }

 */
        }
    @Override

        if (!hasBadChars && !str.isEmpty()) {
    public int getSchemaUsage() {
    }
    @Override
        Integer indent = keywordsIndent.get(word.toUpperCase(DEF_LOCALE));
    public static final Pair<String, String> IN_CLAUSE_PARENTHESES = new Pair<>("(", ")");
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private final TreeMap<String, KeywordHolder> allKeywords = new TreeMap<>();
    public String formatStoredProcedureCall(DBPDataSource dataSource, String sqlText) {
        return "";
import java.util.concurrent.ConcurrentNavigableMap;
        Set.of(SQLConstants.KEYWORD_SELECT, "SHOW", "USE", "SET", SQLConstants.KEYWORD_EXPLAIN);
    @Override
    public Collection<String> getReservedWords() {
    }
    /**
    }
    @Override
        }
            prefStore = DBWorkbench.getPlatform().getPreferenceStore();

    protected void clearDataTypes() {
    @Override
        }
    public String[] getQueryKeywords() {
        String[] executeKeywords = getExecuteKeywords();
    private final ConcurrentNavigableMap<String, String> functions = new ConcurrentSkipListMap<>();
    }
                if (precision > 1) {
    }
                        return null;


        addKeywords(Collections.singletonList(function), DBPKeywordType.KEYWORD);
            return str;

    public boolean supportsAliasInSelect() {
    @Override
        return false;
        if (dataKind == DBPDataKind.STRING) {
        String original;
    }
        for (int i = 0; i < quoteStrings.length; i++) {
    @Nullable
    public boolean isEntityQueryWord(@NotNull String word) {
                KeywordHolder oldType = allKeywords.get(ciKeyword);
        sql.append(")");
import org.jkiss.dbeaver.model.data.DBDBinaryFormatter;
    @Override
        return Character.isUnicodeIdentifierStart(ch) || ch == '_';
        }
    }

    @NotNull


        sql.append(getStoredProcedureCallInitialClause(proc)).append("(");
                                sql.append("cast(?")
                long maxLength = column.getMaxLength();
                    return "(" + maxLength + ")";
        }
        functions.remove(function);
        for (String[] pair : quoteStrings) {

                    }
/*

    public Collection<String> getColumnQueryWords() {
    @NotNull
        }
                Integer scale = column.getScale();
    public SQLTokenPredicateSet getSkipTokenPredicates() {
    /**
    public DBPIdentifierCase storesQuotedCase() {

                        if (castParams) {
    }
        final DBPKeywordType keywordType = this.getKeywordType(str);

                if (precision == 0) {
    }
    public String escapeString(String string) {

        return false;
    @Override
    }
                        return "(" + precision + ')';

                if (identifier.startsWith(quoteString[0]) && identifier.endsWith(quoteString[1])) {
    }
    @Override
            final String q2 = pair[1];
        return true;
        }
    }
    public boolean validIdentifierPart(char c, boolean quoted) {
            return '\'' + escapeString(strValue) + '\'';
    }
    private final ConcurrentNavigableMap<String, String> tableQueryWords = new ConcurrentSkipListMap<>();

    @Override

        return SQLConstants.STRUCT_SEPARATOR;
        }
        return null;
        return CommonUtils.notEmpty(string).replace("''", "'");
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        }
        return getUnquotedIdentifier(identifier, false);
    }
    public boolean supportsNullability() {
    public boolean supportsAsKeywordBeforeAliasInFromClause() {
    }
        return attributeName;
            if (maxLength > 0 && maxLength < Integer.MAX_VALUE) {
    }
        for (int i = 0; i < keywords.length; i++) {

            }
        if (!inParameters.isEmpty()) {
                        } else {
    @Override
    }
                    (dataType.getMaxLength() > 0 && dataType.getMaxLength() == column.getMaxLength()))) {
                        return "(" + precision + ',' + scale + ')';

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    @Override
    public String escapeScriptValue(DBSTypedObject attribute, @NotNull Object value, @NotNull String strValue) {

        return true;
    protected boolean isStoredProcedureCallIncludesOutParameters() {
        if (parameters != null) {
    }
    }
                }
    }
        word = word.toUpperCase(DEF_LOCALE);
    }
    @Override

        allKeywords.put(ciWord, new KeywordHolder(DBPKeywordType.KEYWORD, keyword));

        boolean useBrackets = useBracketsForExec(proc);


        return strValue;
            boolean first = true;
    @Override

    @Override
    }
                    return true;

                if (maxLength > 0) {
    }
                        // FIXME: in other DBs it equals to precision in most cases
        return getAllAttributesAlias();
    public String getOffsetLimitQueryPart(int offset, int limit) {
                    }
    }
            if (ArrayUtils.isEmpty(quoteStrings)) {
            }
            }
    }
    }
    public boolean validIdentifierStart(char c) {
    @Override
        for (DBSProcedureParameter param : parameters) {
    private static final String[] CORE_NON_TRANSACTIONAL_KEYWORDS = new String[0];
        return DML_KEYWORDS;
            // unless database use case-insensitive search always (e.g. MySQL with lower_case_table_names <> 0)
    public char getStringEscapeCharacter() {
    public String getQuotedIdentifier(String str, boolean forceCaseSensitive, boolean forceQuotes) {
                first = false;
                                sql.append("?");

                        }
     * @param type keyword type
    @Override
import java.util.concurrent.ConcurrentSkipListMap;
        return "%s=?".formatted(columnName);
    public String getQuotedString(String string) {
    }
    @Override
import org.jkiss.dbeaver.ModelPreferences;

        return functions.values();

    @NotNull
    }

    }
        KeywordHolder keywordHolder = allKeywords.get(word.toUpperCase(DEF_LOCALE));
    @NotNull
    public String[] getTransactionCommitKeywords() {

 * distributed under the License is distributed on an "AS IS" BASIS,
                ((CommonUtils.toInt(dataType.getPrecision()) > 0 && CommonUtils.equalObjects(dataType.getPrecision(), column.getPrecision())) ||
            if (typeName.equals("DECIMAL") || typeName.equals("NUMERIC") || typeName.equals("NUMBER")) {
    public boolean supportsAliasInHaving() {
        reservedWords.remove(ciWord);

    @Override
    public boolean isWordPart(int ch) {
            addSQLKeyword(kw);
    }
    protected void addKeywords(Collection<String> set, DBPKeywordType type) {
    public List<String> getMatchedKeywords(@NotNull String word) {
    @Override
        for (String keyword : keywords) {
    public boolean hasCaseSensitiveFiltration() {
 *

/**

            for (int i = 0; i < str.length(); i++) {
        return "";
    public boolean supportsAlterTableStatement() {
    public Collection<String> getDataTypes(@Nullable DBPDataSource dataSource) {
        }

    @NotNull
        return true;
            if (keyword.equals(keywords[i])) return true;
    protected void addDataTypes(Collection<String> allTypes) {
        }
            }
                attributeName = DBUtils.getQuotedIdentifier(((DBSObject) attribute).getDataSource(), attributeName);
                        if (!first) {
                    hasBadChars = true;
    public Pair<String, String> getInClauseParentheses() {
        return false;
    public DBPKeywordType getKeywordType(@NotNull String word) {
            final String q1 = pair[0];
    @Nullable
        @NotNull DBPDataSource dataSource,
    @Override
        return tableQueryWords.containsKey(word.toUpperCase(DEF_LOCALE));
        return null;
                        }
            } else if (typeName.equals("BIT")) {
        return false;
                            if (castParams) {
    public boolean isKeywordStart(@NotNull String word) {
    @Override

 * See the License for the specific language governing permissions and
    @NotNull
    public boolean useCaseInsensitiveNameLookup() {

        return true;
        return DEFAULT_IDENTIFIER_QUOTES;
    public boolean isDisableScriptEscapeProcessing() {
    public boolean supportsAliasInConditions() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        return true;
        return false;


        }

    }
    public SQLQueryGenerator getQueryGenerator() {
        return false;
    }
                            maxLength = lengthLimit;
    }

            // then do not use explicit precision in column definition
    }
        if (!CommonUtils.isEmpty(callEndClause)) {
        return hasBadChars;
    }
        return false;
    protected boolean isTransactionModifyingKeyword(String firstKeyword) {
                return null;

        return null;
    }
    @Override
                        // FIXME: max length is actually length in character.

                }
        if (column instanceof DBSObject) {
    @Override
            if (column instanceof DBSTypedObjectEx) {
    private static final String[] EXEC_KEYWORDS = new String[0];
            if (!CommonUtils.equalObjects(attributeName, attribute.getName())) {

        DBPKeywordType type;
    public boolean isStripCommentsBeforeBlocks() {
        }

    public char getStructSeparator() {
        return 0;
    public boolean isDelimiterAfterBlock() {

     */

        }
        for (String type : allTypes) {

    @Override
    @Override
                }
    }
    @Override
    }
    public String getDefaultGroupAttribute() {
    private final ConcurrentNavigableMap<String, String> types = new ConcurrentSkipListMap<>();
    @NotNull
package org.jkiss.dbeaver.model.impl.sql;
                if (oldType == null || oldType.type != DBPKeywordType.KEYWORD) {
public abstract class AbstractSQLDialect implements SQLDialect {
        return new String[0];//{String.valueOf(SQLConstants.DEFAULT_PARAMETER_PREFIX)};
    public String[] getNonTransactionKeywords() {
                return "(" + maxLength + ')';
        String ciWord = keyword.toUpperCase(DEF_LOCALE);
    }
    }
    public String[] getInnerBlockPrefixes() {
                // Must use explicit attribute name
            if (dataType != null && CommonUtils.equalObjects(dataType.getScale(), column.getScale()) &&
    }

        return CORE_NON_TRANSACTIONAL_KEYWORDS;
            }
        DBPDataSource dataSource = proc.getDataSource();
                    } else */{
    public int getKeywordNextLineIndent(@NotNull String word) {
        } else {
    private static class KeywordHolder {
        DBPPreferenceStore prefStore;
    }
        public KeywordHolder(DBPKeywordType type, String original) {


        keywordsIndent.put(ketyword, indent);
        return maxParamLength;
     */
        return string.length() >= 2 && string.charAt(0) == '\'' && string.charAt(string.length() - 1) == '\'';
                int precision = CommonUtils.toInt(column.getPrecision());
            if (unescapeQuotesInsideIdentifier) {
    public String[] getParametersPrefixes() {
        }

    @Override
    }
    private static final String[] DDL_KEYWORDS = new String[0];
                            if (!first) {
        @NotNull DBDDataFilter filter
    }
        return DEFAULT_BEGIN_END_BLOCK;
    public String[] getScriptDelimiters() {
            }

            sql.append(" ").append(callEndClause);
                if (param.getName().length() > maxParamLength) {
    @Override
    protected String getProcedureCallEndClause(DBSProcedure procedure) {
                            sql.append(", ");
    }

    @Override
    @Override
            }
    protected void addTableQueryKeywords(String ... keywords) {
        return MultiValueInsertMode.NOT_SUPPORTED;
        return true;

    }
    }
        if (dataSource != null) {
//                    .append(" parameter value instead of '").append(parameter.getName()).append("' (").append(typeName).append(")");
    @NotNull
    @Override
    public boolean supportsIndexCreateAndDrop() {
        return BinaryFormatterHexNative.INSTANCE;
    public boolean supportsUnquotedMixedCase() {
    }

                    } else if (badValue) {
    }
    @Nullable

    @Override
import org.jkiss.dbeaver.runtime.DBWorkbench;
    @NotNull

        }
    // Keywords

    @Override
            return quoteIdentifier(str, quoteStrings);
    @Override
        return expression;
            for (String keyword : set) {
    @Override
    }
    public MultiValueInsertMode getDefaultMultiValueInsertMode() {
                inParameters.add(param);
            // If type is UDT (i.e. we can find it in type list) and type precision == column precision
    private final ConcurrentNavigableMap<String, String> columnQueryWords = new ConcurrentSkipListMap<>();
    }
                hasBadChars = switch (this.storesUnquotedCase()) {
        return string.replace("'", "''");
        String firstKeyword = SQLUtils.getFirstKeyword(this, queryString);
    }
    }
        types.clear();

        return null;

                                sql.append(", ");
                if (!this.validIdentifierPart(str.charAt(i), false)) {
    @Nullable
    public String[][] getStringQuoteStrings() {

    public void generateStoredProcedureCall(
        return result;
        return false;
        return indent == null ? 0 : indent;
    @Override
            quoteStrings = BasicSQLDialect.DEFAULT_IDENTIFIER_QUOTES;
        return USAGE_NONE;
    }
    }
    }
            if (keyword.getKey().startsWith(word)) {
                    precision = (int) column.getMaxLength();
import org.jkiss.dbeaver.model.*;
    public boolean isQuoteReservedWords() {
    }
        return Character.isLetter(c);
    public String[][] getBlockBoundStrings() {
        return String.format("LIMIT %d OFFSET %d", limit, offset);
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
                        if (isStoredProcedureCallIncludesOutParameters()) {
        SortedMap<String, KeywordHolder> map = allKeywords.tailMap(upperCaseWord);
        return reservedWords.values();
                };
     * @param inParameters empty list to collect IN parameters
    }
        return false;


        String namedParameterPrefix = prefStore.getString(ModelPreferences.SQL_NAMED_PARAMETERS_PREFIX);        
        return true;
                        break;
        {
        }
                return false;
        return false;
            // Disable supportsQuotedMixedCase checking. Let's quote identifiers always if storage case doesn't match actual case
 * Abstract SQL Dialect
        return false;
    public String[] getSingleLineComments() {
        if (keywords == null) {
    public boolean isAttributeQueryWord(@NotNull String word) {
    private static final String[] DEFAULT_LINE_COMMENTS = { "//"};
                }                
                int precision = CommonUtils.toInt(column.getPrecision());
        }
    public static final String[] DML_KEYWORDS = new String[0];

            return false;
    @NotNull
        return identifier;
    public int getCatalogUsage() {
    protected void turnFunctionIntoKeyword(String function) {
    }
                    }
        if (!useBrackets) {
            // Check for case of quoted indents. Do not check for unquoted case - we don't need to quote em anyway
    @Override
            tableQueryWords.put(keyword.toUpperCase(DEF_LOCALE), keyword);
    public boolean isQuotedString(String string) {
            }
        return true;
import org.jkiss.utils.Pair;
    }
    @Override
        int maxParamLength = 0;
    }
    public Pair<String, String> getMultiLineComments() {
    }
        // Escape quote chars
    @Nullable
    @Override
        return tableQueryWords.values();
    protected void setKeywordIndent(String ketyword, int indent) {
    @NotNull
    @NotNull
            hasBadChars = !this.validIdentifierStart(str.charAt(0));


        return true;
                switch (parameter.getParameterKind()) {
    @Override
        return true;
        @NotNull String query,
    @Override
                                    .append(" as ").append(typeName).append(")");
    public String[] getDMLKeywords() {
            // Already quoted
                    default:
        } else if (dataKind == DBPDataKind.NUMERIC) {
    @Nullable
        if (useBrackets) sql.append("{ ");
                }
    @Override

    }
        return !TRANSACTION_NON_MODIFYING_KEYWORDS.contains(firstKeyword);
        }
    public Collection<String> getFunctions() {

    public boolean isWordStart(int ch) {
    public String getTestSQL() {

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, KeywordHolder> keyword : allKeywords.tailMap(word).entrySet()) {

    }

            }
        }
    }
        return StandardSQLDialectQueryGenerator.INSTANCE;
        return true;
    @Override
        }
        }
    public String getClobComparingPart(@NotNull String columnName) {
            for (String[] quoteString : quoteStrings) {
    }
    @Nullable

                result.add(keyword.getValue().original);
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
            // Empty query - must be some metadata reading or something
        }
        firstKeyword = firstKeyword.toUpperCase(DEF_LOCALE);
        String[][] quoteStrings = this.getIdentifierQuoteStrings();


        return isTransactionModifyingKeyword(firstKeyword);
 * limitations under the License.
        return EmptyTokenPredicateSet.INSTANCE;
