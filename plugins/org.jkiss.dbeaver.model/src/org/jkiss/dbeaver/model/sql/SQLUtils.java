        final Matcher matcher = PATTERN_OUT_PARAM.matcher(query);
     * Determines if a unicode code point represents a letter from LATIN-1.

        if (ArrayUtils.isEmpty(quoteStrings)) {

    public static String generateCommentLine(@Nullable DBPDataSource dataSource, @NotNull String comment) {
                break;
    @NotNull
    /**
            return new String[0];
        }
                } else {
            trailing = query.substring(endPos + 1);
    }
            DBPDataSource dataSource = ((DBSObject)object).getDataSource();
            boolean isBlockQuery = false;
            strValue = convertStreamToSQL(attribute, (DBDContent) value, valueHandler, dataSource);
            char c = name.charAt(i);
                sql.append(((SQLDialectRelational) dialect).getLikeEscapeClause(SQLConstants.DEFAULT_LIKE_ESCAPE));
    public static void appendQueryConditions(
        Matcher matcher = CREATE_PREFIX_PATTERN.matcher(sql);
        @NotNull DBPDataSource dataSource,
    }
    @NotNull
                    }

        return result.toString();
        }
            strValue = convertValueToSQL(dataSource, constraint.getAttribute(), value);
        @Nullable DBDDataFilter dataFilter
                trailingSpaces = sql.substring(sql.length() - trailingSpacesCount);
                    // \r\n
                }
    public static String stripTransformations(String query)
        boolean subQuery
                if (i == initial.length - 1 || initial[i + 1] == '\n') {
                    }
        return string;
    }
        }
        List<String> parts = new ArrayList<>();
        return type;
            }
    }
    }
                }
    }
                if (fk instanceof DBSTableForeignKey && fk.getAssociatedEntity() == rightTable) {
    ) throws DBException {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKeyColumn;

                String[][] blockBoundStrings = syntaxManager.getDialect().getBlockBoundStrings();
        final SQLDialect sqlDialect = SQLUtils.getDialectFromDataSource(dataSource);
            if (!delimiter.isEmpty() && query.contains(delimiter)) {
            }
     */
            if (c == '(') {
                boolean needsSpace = i > 0 && Character.isLetterOrDigit(str.charAt(i - 1));
                if (action.isComplex() && redefiner != null && !redefiner.equals(delimiter)) {
                        continue;
        @NotNull DBDValueHandler valueHandler,
                if (blockBoundStrings != null) {
    public static String getTableAlias(DBSEntity table) {
    }
        }
                if (value instanceof DBDContent contentValue) {
            return matcher.group(1);
    {
        return convertValueToSQL(dataSource, attribute, valueHandler, value, DBDDisplayFormat.NATIVE, false);
                                }
        }
            }
                        continue;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return Character.isLetter(codePoint) && Character.UnicodeBlock.of(codePoint) == Character.UnicodeBlock.BASIC_LATIN;
                break;
            return Collections.emptyList();
        }
                for (i = i + 1; i < length; i++) {

                            // This is a block query if it ends with 'END' or with 'END id'
        return like.indexOf('%') != -1 || like.indexOf('*') != -1 || like.indexOf('_') != -1 || like.indexOf('?') != -1;// || like.indexOf('_') != -1;
    ) throws DBException {
            }
            sql.append(" LIKE ?");
        for (String line : comment.split("\n|\r|\r\n")) {
     */
        // So we check whether this query is a block query (by checking for all SQL dialect block delimiters)

            }

        }
        }
            filter,
        @Nullable String mlCommentEnd,
        }
            }
            int trailingSpacesCount = 0;
                        result.append(' ');
                case '%' -> result.append('*');
        }
 * DBeaver - Universal Database Manager
        );
    }
            if (!delimiter.isEmpty()) {
        }
        return dataSource.getSQLDialect().escapeString(string);

                if (index > 0 && index < length - 1) {
    }
        for (String line : lines) {

                        script.append(delimiter);
     * Removes both multi-line and single-line comments from an SQL query
    }

    {
            }

     * Returns identifier in canonical form depends on dialect parameters. It's useful when we need to compare two identifiers.
import org.jkiss.dbeaver.utils.ContentUtils;
                if (action.getType() != DBEPersistAction.ActionType.COMMENT) {
     */
                ((SQLDialectRelational) dialect).getLikeEscapeClause(SQLConstants.DEFAULT_LIKE_ESCAPE) != null)

    }
            dataSource,
        String alias = "t";
    }
                            if (test.endsWith(blocks[1])) {
import org.eclipse.core.runtime.Platform;
        catch (Throwable e) {
     */
            }
            if (value instanceof CharSequence) {
    private static final Pattern CREATE_PREFIX_PATTERN = Pattern.compile("(CREATE (:OR REPLACE)?).+", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
            sql.append(not ? "<>?" : "=?");
            if (paramValue == null || paramValue.isEmpty()) {
        try {
    }
        String sql = generateTableJoinByAssociation(monitor, leftTable, leftAlias, rightTable, rightAlias);
            return sql;
            if (Character.isWhitespace(c)) {
        return null;
            } else {

                }

        return dataSource.getSQLDialect().getQuotedString(string);
    public static String stripComments(
     */
            String[] slComments = dataSource.getSQLDialect().getSingleLineComments();
        boolean inlineCriteria,
        for (int i = 0; i < sqlLikePattern.length(); i++) {
    }
        }

                        }
                slComment = slComments[0];
                            return queryWithoutDelimiter;
    private static String removeMlComments(
        for (int i = 0; i < initial.length; i++) {
            }
        boolean hasStatements = false;
            } else if (c == '+' || c == '^' || c == '$' || c == '.' || c == '|' || c == '{' || c == '}') {
            script.append(DBEAVER_DDL_COMMENT).append(Platform.getProduct().getName()).append(lineSeparator)
                }
    /**
    }
        @NotNull StringBuilder query,

public final class SQLUtils {
            SQLQueryParameter parameter = parameters.get(i - 1);
            }
                    sb.append('^');
                    continue;
    private static final String DBEAVER_DDL_WARNING = "-- WARNING: It may differ from actual native database DDL";
                    for (String[] blocks : blockBoundStrings) {
                }
        }

    {
    }

        }
            return true;
    public static boolean matchesAnyLike(String string, Collection<String> likes)
                result.append('\\').append(c);
    }
                    sb.append(".*");

     * <pre>{@code

            String slComment;
    }
        @NotNull DBPDataSource dataSource,
    public static boolean isExecQuery(@NotNull SQLDialect dialect, String query) {
        // Check for EXEC query

        if (startPos != -1) {
            inlineCriteria,

        for (DBSEntityAttributeRef ar : fk.getAttributeReferences(monitor)) {
        if (!ArrayUtils.isEmpty(scriptDelimiters)) {
            }
    }
                prevNonLetter = false;
        return ArrayUtils.containsIgnoreCase(dialect.getExecuteKeywords(), word);
    public static void addMultiStatementDDL(
        String delimiter = SQLUtils.getDefaultScriptDelimiter(sqlDialect);
        if (executeKeywords != null && executeKeywords.length > 0) {
                if (!sqlDialect.isQuotedString(strValue)) {
                return strValue;
                prevNonLetter = true;
            inlineCriteria);
            }
    public static String removeExtraSpaces(@NotNull String str) {
    /**
        return joinSQL.toString();

            }
        }
        return dataSource.getSQLDialect().getTypeCastClause(
                if (i < like.length() - 1) {

            String paramValue = parameter.getValue();
                        }
        @NotNull DBPDataSource dataSource,
    public static String getColumnTypeModifiers(@Nullable DBPDataSource dataSource, DBSTypedObject column, @NotNull String typeName, @NotNull DBPDataKind dataKind) {
        if (s.startsWith("(") && s.endsWith(")")) {
        return sql.toString();
                    .append(leftAlias).append(".").append(DBUtils.getQuotedIdentifier(leftIdentifier.get(i))).append(" = ")
            }
    @NotNull
    }
            }
        boolean inlineCriteria
    }
        // Try to find FK in left table referencing to right table
                } else {
                        return strValue;
                }
        if (sql.length() > MAX_SQL_DESCRIPTION_LENGTH) {
        if (DBUtils.isNullValue(value)) {
        return sql + trailingSpaces;


        }
            char c = query.charAt(i);
        if (s.isEmpty()) {
    }
                String test = trimmed.toUpperCase().trim();
        final SQLDialect sqlDialect = SQLUtils.getDialectFromDataSource(dataSource);
                }
        @NotNull DBSTypedObject attribute,
        while (!name.isEmpty()) {
        @NotNull DBPDataSource dataSource,
            }
                            partName = partName.substring(0, partName.length() - 1);
    public static void appendOrderString(
            int spaceIndex = p.lastIndexOf(' ');

                        for (int i = script.length() - 1; i >= 0; i--) {
        if (sql.isEmpty() || !trimDelimiter) {
            return dataSource.getSQLDialect().unEscapeString(string.substring(1, string.length() - 1));
                            name.substring(startQuote.length(), endPos);
        }
            default:
 * See the License for the specific language governing permissions and
                        // Quoted part
            String trimmed = sql.substring(0, sql.length() - statementDelimiter.length());
        // Replace parameter tokens with parameter values
        dataSource.getSQLDialect()
                    if (CommonUtils.isEmpty(scriptLine)) {
                    } else {
        boolean inlineCriteria,
    }

//            return PATTERN_XFORM.matcher(query).replaceAll("");
            multiLineComments == null ? null : multiLineComments.getFirst(),

     *
 * Unless required by applicable law or agreed to in writing, software
            }
    }

        int endPos;
            }
            dataSource,
                continue;
                }
                }
            strValue = valueHandler.getValueDisplayString(attribute, value, displayFormat);
                // Single \r - add \n after it to get \r\n sequence
import org.jkiss.dbeaver.model.data.*;

            if (leftIdentifier.size() != rightAttributes.size()) {
                        break;
                //fixme currently we allow users to use "*" in a wildcards.
                rightAttributes.add(rightAttr);
                        hadQuotedPart = true;
        String trailing = "";
                        }
                joinSQL
import org.jkiss.dbeaver.model.struct.*;
        }
            }
                        String partName = keepQuotes ?
        String trailingSpaces = "";
    public static String identifierToCanonicalForm(
        }
                    }
        return sql;
    }
    public static String getScriptDescription(@NotNull String sql) {
            return "";
//        } else {
        int index = dataFilter.getConstraints().indexOf(constraint);
            } else {
                result.append(".");
        DBPDataKind dataKind = attribute.getDataKind();
        if (addComments) {
        for (String like : likes) {
    public static void appendConditionString(
            subQuery
    }
            return scriptDelimiters[0];
                }
        }
    private static String generateTableJoinByColumns(DBRProgressMonitor monitor, DBSEntity leftTable, String leftAlias, DBSEntity rightTable, String rightAlias) throws DBException {
            dialect.getMultiLineComments(),
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            StringBuilder joinSQL = new StringBuilder();
    }
        if (endPos < query.length() - 1) {
        @NotNull StringBuilder query,
                } else if (action.getType() == DBEPersistAction.ActionType.COMMENT) {

import org.jkiss.dbeaver.model.exec.DBCSession;

                    continue;

    public static String unQuoteString(DBPDataSource dataSource, String string)
        return query;
            }
            delimiter = ' ' + delimiter;
        for (int i = 0; i < query.length(); i++) {
            convertValueToSQLFormat(dataSource, attribute, valueHandler, value, displayFormat), isInCondition);
            sb.append(slComment).append(" ").append(line).append(separator);
            }
    {
        }
        @Nullable String tableAlias,
        }
    /**
            }
        dataSource.getSQLDialect().getQueryGenerator().appendConditionString(

        }
            conditionTable,
     * <p>Removes parameter names and preserves type details and nesting.</p>
    public static String generateComments(DBPDataSource dataSource, DBEPersistAction[] persistActions, boolean addComments)
            sql.append(",?");
        StringBuilder joinSQL = new StringBuilder();
        @NotNull String query,
            for (String scriptDelimiter : sqlDialect.getScriptDelimiters()) {
            return SQLConstants.NULL_VALUE;
        }
    public static String quoteString(DBSObject object, String string)
    public static String getScriptLineDelimiter(SQLDialect sqlDialect) {
        @NotNull DBDDataFilter filter,
        @NotNull DBPDataSource dataSource,
        if (sql != null) return sql;
        String[][] blockBoundStrings = dialect.getBlockBoundStrings();

        List<String> comments = new ArrayList<>();
import org.jkiss.utils.ArrayUtils;

import org.jkiss.utils.CommonUtils;
            switch (charAtI) {
            constraints,
    public static boolean needQueryDelimiter(SQLDialect sqlDialect, String query) {


                        }

                    script.append(slComment).append(" ").append(scriptLine);
        if (str1 == null || str2 == null) {
            if (!sql.endsWith(statementDelimiter) && sql.length() > statementDelimiter.length()) {
                    return sqlDialect.escapeScriptValue(attribute, value, strValue);
            unquottedIdentifier = identifierCase.transform(dialect.getUnquotedIdentifier(rawIdentifierString, true));
    private static String convertValueToSQLFormat(@NotNull DBPDataSource dataSource, @NotNull DBSTypedObject attribute, @NotNull DBDValueHandler valueHandler, @Nullable Object value, DBDDisplayFormat displayFormat) {
        // In reverse order
        if (sql != null) return sql;
                if (action.getType() != DBEPersistAction.ActionType.COMMENT) {
        return false;

    public static boolean isLatinLetter(int codePoint) {
        dataSource.getSQLDialect().getQueryGenerator().appendQueryOrder(dataSource, query, tableAlias, dataFilter);
        // However Oracle REQUIRES that block queries (e.g. DDL like CREATE PROCEDURE) must have trailing delimiter

        StringBuilder result = new StringBuilder(str.length());
        for (int i = parameters.size(); i > 0; i--) {
    public static void appendValue(StringBuilder buffer, DBSTypedObject type, Object value)

        if (addComments) {
        if (!cur.isEmpty()) {

                        while (partName.endsWith(nameSeparator)) {
        boolean subQuery,
        SQLDialect sqlDialect = dataSource.getSQLDialect();
                result.append('\\').append(c);
        int depth = 0;

            buffer.append(value);

        List<String> parts = extractParts(s);
        @NotNull StringBuilder query,
            if (c == ')') {
                    }
                    } else {
    public static void appendConditionString(
        StringBuilder result = new StringBuilder(query.length());
        }
                startPos = i;

                    break;
            for (String[] quotePair : quoteStrings) {
        if (sql != null) return sql;
     * Removes \\r characters from query.

     * @return {@code true} if the code point represents a letter from LATIN-1
    {
    }
    ) {
    public static boolean isBlockStartKeyword(SQLDialect dialect, String keyword) {
            conditionTable,
        } else {
     * Compares two string ignoring extra whitespaces.
        if (CommonUtils.isEmpty(ddl)) {
        }
    public static String makeGlobFromSqlLikePattern(@NotNull String sqlLikePattern) {
import org.jkiss.code.NotNull;
        for (startPos = 0; startPos < query.length(); startPos++) {
            for (DBSEntityAssociation fk : associations) {
            case BOOLEAN:
        );
            return query;
            if (CommonUtils.isEmpty(trimmed)) {
        @Nullable String conditionTable,
            types.add(type.toUpperCase());
            if (c == '\r') {
        @NotNull DBPDataSource dataSource,
    public static String extractProcedureParameterTypes(@Nullable String sig) {
        return script.toString();
        @NotNull StringBuilder query,
        } else {
    {
                        name = name.substring(endPos + endQuote.length()).trim();
                            nameList.add(partName);
            if (endPos != -1) {

        }
                }
        final String lineSeparator = GeneralUtils.getDefaultLineSeparator();

        }
                return null;
        return comments.toArray(new String[0]);
        @Nullable Object value,
        return alias;
                    }
        final String lineSeparator = GeneralUtils.getDefaultLineSeparator();
    public static int getConstraintOrderIndex(@NotNull DBDDataFilter dataFilter, @NotNull DBDAttributeConstraint constraint) {
        return pattern.matcher(string).matches();
                        // We don't need spaces before control symbols
        return parts;
            sql.append("\n");
        if (DBUtils.isNullValue(value)) {
                            } else {
    private static final String DBEAVER_SCRIPT_DELIMITER = "$$";
                .append(DBEAVER_DDL_WARNING).append(lineSeparator);
                DBSEntityAttribute rightAttr = rightTable.getAttribute(monitor, attr.getName());
     * @param query query
            }
    {
    public static boolean isCommentLine(SQLDialect dialect, String line) {
            String type = spaceIndex >= 0 ? p.substring(spaceIndex + 1) : p;
     */
                }
        @Nullable String ddl
    public static boolean compareAliases(String str1, String str2) {
        String[] slComments
            }

            String[] slComments = sqlDialect.getSingleLineComments();
        final String[] executeKeywords = dialect.getExecuteKeywords();
        return stripComments(

                endPos = i;
            } else if (c == '\\') {
                name = name.substring(nameSeparator.length()).trim();
    }
        if (CommonUtils.isEmpty(sig)) {
    public static String[] splitFullIdentifier(final String fullName, char nameSeparator, String[][] quoteStrings) {
    }
            }
            } else {
                if (sqlDialect != null) {
                }
        }
    public static void appendConditionString(
        if ((mlCommentStart != null && query.startsWith(mlCommentStart))) { //for remove if there's comments after comments
                }
    private static final int MAX_SQL_DESCRIPTION_LENGTH = 500;
        // Here we cur trailing query delimiter. most of DBs don't expect it in the end of query

            sql.append(" AND ");
    }
 *
            sql = sql.substring(matcher.end(1));
            }
                String endQuote = quotePair[1];
        return like.replace("*", "%").replace("?", "_");
            }
                result = alias + i;
    public static String fixLineFeeds(String sql) {
            } else if (c == '?' || c == '_') {
    }
            query
                        }
        if (str1 == null && str2 == null) {
            if (dialect.getReservedWords().stream().noneMatch(kw -> kw.equalsIgnoreCase(generatedAlias))) {
        int startPos = 0, endPos = -1;
    public static String stripComments(@NotNull SQLDialect dialect, @NotNull String query)
            return name;
            int startPos = query.indexOf(mlCommentStart);
        if (matcher.find() && matcher.start(0) == 0) {
    }
     * Output: "(ARRAY, OBJECT)"
            String generatedAlias = buf.toString();
                startPos = query.indexOf(mlCommentStart);
                }
                                break;
            unquottedIdentifier = rawIdentifierString;
        SQLDialect dialect = SQLUtils.getDialectFromDataSource(dataSource);
            } else {
    }
    /**
        if (str.indexOf(' ') == -1) {
     * We can remove double whitespaces and any whitespaces between special chars (*-+,: etc).
                    String scriptLine = action.getTitle();
 */
        }
        boolean prepared
            .appendOrderString(filter, dataSource, conditionTable, subQuery, query);
    @NotNull
    {
        @NotNull DBDDataFilter filter,

                return dataSource.getSQLDialect().getNativeBinaryFormatter().toString(binValue, 0, binValue.length);
        }
                        if (endIndex > 0) {
        String actualIdentifierString;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public static void fillQueryParameters(SQLQuery sqlStatement, List<SQLQueryParameter> parameters) {

        }
        DBPDataSource dataSource,
                    break;
    {
                result.append(c);
    }
                    if (script.length() > 2) {
        for (int i = 0; i < paramCount - 1; i++) {
    private static String getStringValue(@NotNull DBPDataSource dataSource, @NotNull DBDAttributeConstraint constraint, boolean inlineCriteria, Object value) {

    public static String makeSQLLike(String like)
    }

                script.append(lineSeparator);
    }
            filter,
            if (!Character.isWhitespace(query.charAt(startPos))) {
                parts.add(cur.toString().trim());
import org.jkiss.dbeaver.utils.GeneralUtils;
                    break;
    public static String convertStreamToSQL(DBSTypedObject attribute, DBDContent content, DBDValueHandler valueHandler, DBPDataSource dataSource) {
        }
                default -> result.append(charAtI);
        }
        }
        return SQLConstants.DEFAULT_STATEMENT_DELIMITER;
            prevChar = c;
                        if (lfCount < 2) {
        return delimiter;



        }
    public static List<String> splitFilter(String filter)

                    script.append(lineSeparator).append(redefiner).append(" ").append(DBEAVER_SCRIPT_DELIMITER).append(lineSeparator);
        String query = sqlStatement.getText();
    }
                }
        query = removeMlComments(query, mlCommentStart, mlCommentEnd);
        }

        dataSource.getSQLDialect().getQueryGenerator().appendQueryConditions(dataSource, query, tableAlias, dataFilter);
                    if (Character.isWhitespace(c)) {
            }
import org.jkiss.dbeaver.DBException;

            return str;
        }
        if (startPos > 0) {

package org.jkiss.dbeaver.model.sql;
            } else if (Character.isLetterOrDigit(c)) {
        @Nullable String conditionTable,
    public static String makeLikePattern(@NotNull String like) {
            sql.append(" WHERE ");
            if (initial[i] == '\r') {
        @Nullable String conditionTable,

                }
    }
            final String queryStart = getFirstKeyword(dialect, query);
        for (int i = 0; i < length; i++) {
                    if (query.toUpperCase().endsWith(delimiter.toUpperCase())) {
            }
        for (int i = 2; i < 500; i++) {
            comments.add(scanner.next());
                paramValue = SQLConstants.NULL_VALUE;
    public static boolean isStringQuoted(DBSObject object, String string) {
        if (CommonUtils.isEmpty(filter)) {
        if (firstClause) {
                    query = "";
    {

        boolean prevNonLetter = true;
import org.jkiss.code.Nullable;
    private static String removeSlComments(@NotNull String query, String[] slComments) {
        StringBuilder result = new StringBuilder();
        sql = generateTableJoinByColumns(monitor, rightTable, rightAlias, leftTable, leftAlias);
            }
            if (!ArrayUtils.isEmpty(slComments)) {
    public static boolean isExecKeyword(SQLDialect dialect, String word) {
        }
    /**
                break;
        }
    {
     * @return normalized query
                    hasDelimiter = true;
        String[] scriptDelimiters = sqlDialect.getScriptDelimiters();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
import java.util.regex.Pattern;
    @Nullable
                            return true;
            case ROWID:
        String[] lines = ddl.trim().split("\\r?\\n");
                if (isValidChar && (prevNonLetter || (prevChar != 0 && Character.isLowerCase(prevChar) && Character.isUpperCase(c)))) {
    private static List<String> extractParts(String s) {
    }
    public static String convertValueToSQL(@NotNull DBPDataSource dataSource, @NotNull DBSTypedObject attribute, @Nullable Object value) {
            boolean isValidChar = (buf.isEmpty() && dialect.validIdentifierStart(c)) || (!buf.isEmpty() && dialect.validIdentifierPart(c, false));
            DBRProgressMonitor monitor = new VoidProgressMonitor();
        @NotNull DBDDataFilter filter,
    public static boolean isLikePattern(String like)
        return sql;
    {
            if (trailingSpacesCount > 0) {
    {
        dataSource.getSQLDialect().getQueryGenerator().appendConditionString(
            parts.add(cur.toString().trim());
        }
        @NotNull StringBuilder query,
    ) throws DBException {
                if (index == 0) {
        }

    {
        }
    public static final Pattern PATTERN_OUT_PARAM = Pattern.compile("((\\?)|(:[a-z0-9]+))\\s*:=");
        for (int i = 0; i < like.length(); i++) {
        }
        return null;
        StringBuilder script = new StringBuilder(64);
                    return true;
                    result.append(c);
            case NUMERIC:
        @Nullable String mlCommentStart,
            return getDialectFromDataSource(dataSource);
        StringBuilder sql = new StringBuilder("?");
        return CommonUtils.splitString(filter, ',');
            char charAtI = sqlLikePattern.charAt(i);
            }
            if (line.startsWith(slc)) {
        StringBuilder script = new StringBuilder(64);
        return query.substring(startPos, endPos);
     * Input : "(x ARRAY, y OBJECT)"
    public static String escapeString(DBPDataSource dataSource, String string)
                    String contentType = contentValue.getContentType();
                        if (!partName.isEmpty()) {
            int endPos = type.lastIndexOf(")");
                cur.setLength(0);
                if (Character.isUnicodeIdentifierPart(lastChar)) {
        String[] scriptDelimiters = sqlDialect.getScriptDelimiters();
    public static void appendQueryOrder(
        return result.toString();
    public static String generateEntityAlias(DBSEntity entity, DBRFinder<Boolean, String> aliasFinder) {
            List<DBSEntityAttribute> rightAttributes = new ArrayList<>();
                        if (!Character.isLetterOrDigit(query.charAt(query.length() - delimiter.length() - 1))) {
                    }
                    delimiter = DBEAVER_SCRIPT_DELIMITER;
        } else if (inlineCriteria) {
            return "()";
        sql = generateTableJoinByColumns(monitor, leftTable, leftAlias, rightTable, rightAlias);
            return "?";
            DBPIdentifierCase identifierCase = isQuoted ? dialect.storesQuotedCase() : dialect.storesUnquotedCase();
            for (String[] block : blockBoundStrings) {
        List<String> types = new ArrayList<>(parts.size());
                // Delimiter is alphabetic (e.g. "GO") so it must be prefixed with whitespace
            for (int i = sql.length() - 1; i >= 0; i--) {
        }
                    char nc = like.charAt(i + 1);
        }
                }
            for (String[] block : blockBoundStrings) {

        // Try to find columns in left table which match unique key in right table
        @Nullable String mlCommentEnd
        }
        char[] initial = sql.toCharArray();
    }
            }
                if (rightAttr == null) {
            }
        final StringBuilder sb = new StringBuilder();
            }
        return "(" + String.join(", ", types) + ")";
            } else {
    }
            if (aliasFinder.findObject(result)) {
        }
                if (CommonUtils.isEmpty(scriptLine)) {
        }
                    return !query.endsWith(delimiter);
                return strValue;
                if (block.length > 1 && keyword.equalsIgnoreCase(block[1])) {
                String delimiter = getScriptLineDelimiter(sqlDialect);
                        continue;
        } else {
        }
    private static String generateTableJoinByAssociation(DBRProgressMonitor monitor, DBSEntity leftTable, String leftAlias, DBSEntity rightTable, String rightAlias) throws DBException {
    public static String generateTableJoin(DBRProgressMonitor monitor, DBSEntity leftTable, String leftAlias, DBSEntity rightTable, String rightAlias) throws DBException {
                    }
        return null;
            while (query.startsWith(slComment)) {
                            script.append(lineSeparator);
            case CONTENT:
        return dataSource.getSQLDialect().getColumnTypeModifiers(dataSource, column, typeName, dataKind);
                break;
        }
        } else {
    public static boolean appendFirstClause(StringBuilder sql, boolean firstClause)
//            return query;
            if (Character.isAlphabetic(statementDelimiter.charAt(0))) {
    {
        return index == -1 ? index : index + 1;
            return SQLConstants.NULL_VALUE;
        {
 * You may obtain a copy of the License at
                fixed.append('\n');
        actualIdentifierString = forceUnquotted ? unquottedIdentifier : dialect.getQuotedIdentifier(unquottedIdentifier, true, false);
                    if (contentType != null && !contentType.startsWith("text")) {
                script.append(scriptLine);
        return false;
                            }
            if (matchesLike(string, like)) {
 * you may not use this file except in compliance with the License.
                    script.append(delimiter).append(lineSeparator);
     * }</pre>
                            }
        if (paramCount == 0) {

            String trimmed = line.trim();
        } else {
        if (blockBoundStrings != null) {
        if (value.contains("%") || value.contains("_")) {
                if (Character.isLetterOrDigit(delimiter.charAt(0))) {
    public static final Pattern PATTERN_SIMPLE_NAME = Pattern.compile("[a-z][a-z0-9_]*", Pattern.CASE_INSENSITIVE);
                    if (endPos != -1) {

    }

        @NotNull DBDDataFilter filter,

        // This is called only when use selects query (i.e. no automatic query detection)
    @Nullable
                }
                    return true;
                                break;
            } else {
                } else { //non closed comment
        }
                }
    public static String makeUnifiedLineFeeds(DBPDataSource dataSource, String query)
    {
                } else {
        String name = entity.getName();
        if (prepared) {
                return true;
        return query;
    }
        for (String slc : dialect.getSingleLineComments()) {
    }
            fixed.append(initial[i]);
                String queryWithoutDelimiter = query.substring(0, query.lastIndexOf(delimiter));
                if (trimmed.endsWith(scriptDelimiter)) {
                    break;
                    break;
                int endPos = query.indexOf(mlCommentEnd, startPos + mlCommentStart.length());


        for (String delimiter : scriptDelimiters) {
            }
            if (!content.isNull() && ContentUtils.isTextContent(content)) {

                int endPos = name.indexOf(nameSeparator);
        if (CommonUtils.isEmpty(name)) {
    public static String convertValueToSQL(
                    c = str.charAt(i);
    public static String getQueryOutputParameter(DBCSession session, String query)
            query = stripComments(query, mlCommentStart, mlCommentEnd, slComments);
        int startPos = type.indexOf("(");
        return query;
                sql = trimmed;
     */
            if (!name.isEmpty() && name.startsWith(nameSeparator)) {
            dialect.getSingleLineComments(),
            }
                    return generateTablesJoin(monitor, (DBSTableForeignKey)fk, leftAlias, rightAlias);
        return hasFixes ? fixed.toString() : sql;
            if (Character.isWhitespace(query.charAt(i))) {
            if (ch == '%') {
        String result = alias;
        String[] scriptDelimiters = sqlDialect.getScriptDelimiters();
        return false;
/*
            boolean hasDelimiter = false;
                                    break;
        if (blockBoundStrings != null) {
            }
            } else {
        if (!CommonUtils.isEmpty(associations)) {
        final StringBuilder sb = new StringBuilder();
        @NotNull StringBuilder sql,
        return leading + query + trailing;
    public static boolean matchesLike(String string, String like)
        if (matcher.find()) {
        for (int index = 0, length = clause.length(); index < length; index++) {
                sql.append(getDefaultScriptDelimiter(sqlDialect));
        return dataSource == null ? BasicSQLDialect.INSTANCE : dataSource.getSQLDialect();
 * distributed under the License is distributed on an "AS IS" BASIS,
        StringBuilder result = new StringBuilder();
                result.append(".*");
        for (String delimiter : scriptDelimiters) {
            if (not) sql.append(" NOT");
            if (!Character.isWhitespace(query.charAt(endPos))) {
            case STRING:
        appendConditionString(filter, dataSource, conditionTable, query, inlineCriteria, false);
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKey;
                        }
        return false;
        }
        return result.toString();
                    }
        }
    /**
        DBDValueHandler valueHandler = DBUtils.findValueHandler(dataSource, attribute);
                return type.substring(0, startPos);
            if (!Character.isLetter(c)) {
                sql = sql.substring(0, sql.length() - trailingSpacesCount);
    }
            log.warn(e);
        }
                        result.append("\\").append(nc);
                result.append(c);
        StringBuilder cur = new StringBuilder();
        char prevChar = 0;
            dialect.getSingleLineComments());

        sqlStatement.setText(query);
        }
            if (ar instanceof DBSTableForeignKeyColumn fkc) {
        }
        String slComment = SQLConstants.SL_COMMENT;
        while (scanner.hasNext()) {
        }

        if (string.length() > 1 && string.charAt(0) == '\'' && string.charAt(string.length() - 1) == '\'') {
    public static String getDefaultScriptDelimiter(SQLDialect sqlDialect) {
                }
        } else if (paramCount == 1) {
                trailingSpacesCount++;
    public static String getConstraintCondition(@NotNull DBPDataSource dataSource, @NotNull DBDAttributeConstraint constraint, @Nullable String conditionTable, boolean inlineCriteria) {
        return object.getDataSource().getSQLDialect().isQuotedString(string);
        return strValue;
                }
        if (persistActions != null) {
            return "()";
        if (value instanceof DBDContent) {
        for (int i = 0; i < query.length(); i++) {
            // Remove trailing delimiter only if it is not block end
                byte[] binValue = ContentUtils.getContentBinaryValue(monitor, content);
                    if (needsSpace && Character.isLetterOrDigit(c)) {
                if (crPos == -1) {
                continue;
    public static String[] extractComments(@NotNull SQLDialect dialect, @NotNull String query) {
                }
    }
    private static final Log log = Log.getLog(SQLUtils.class);

        for (int i = 0; i < name.length(); i++) {
    }
            return null;
        @Nullable DBDDataFilter dataFilter
    {
     * @param dataSource
        StringBuilder buf = new StringBuilder();
            if (ArrayUtils.isEmpty(slComments)) {
 *
            char c = like.charAt(i);
            inlineCriteria,
                }

                    break;
                slComment = slComments[0];
        }
    {
                }
            }
        sql = sql.replaceAll(" +", " ");
        String leading = "";
            leading = query.substring(0, startPos);
                result.append(c);
        Collection<? extends DBSEntityAssociation> associations = leftTable.getAssociations(monitor);
                        i++;
            attribute,
        for (String slComment : slComments) {
        if (column == null) {


    }
                    sb.append('$');
                    if (query.toUpperCase().endsWith(delimiter.toUpperCase())) {
            script.append(DBEAVER_DDL_COMMENT).append(Platform.getProduct().getName()).append(lineSeparator)

        return dataSource.getSQLDialect().getQueryGenerator().getConstraintCondition(dataSource, constraint,
                }
            }
            return null;
        }
    }
        for (int i = 0; i < s.length(); i++) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                depth = Math.max(0, depth - 1);
import java.util.*;
            buffer.append('\'').append(value).append('\'');
    }
    @NotNull
     *

    }
                    String testLine = scriptLine.trim();
    }
        @NotNull List<DBDAttributeConstraint> constraints,
                    continue;
                    break;
        String s = sig.trim();
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
        if (mlCommentStart != null && mlCommentEnd != null) {
                String redefiner = sqlDialect.getScriptDelimiterRedefiner();
                cur.append(c);
                            // Add line feed if we do not have empty line before
                } else {
                sb.append(ch == '_' ? '.' : ch);
        SQLDialect dialect = entity.getParentObject().getDataSource().getSQLDialect();
                    .append(rightAlias).append(".").append(DBUtils.getQuotedIdentifier(rightAttributes.get(i)));
        return removeExtraSpaces(str1).equals(removeExtraSpaces(str2));
import org.jkiss.dbeaver.model.*;
        Pair<String, String> multiLineComments = dialect.getMultiLineComments();

                    return queryWithoutDelimiter;
            }
        }
                case '_' -> result.append('?');
    }
    public static String stripColumnTypeModifiers(String type) {
            if (Character.isLetterOrDigit(query.charAt(i))) {
    public static String getFirstKeyword(SQLDialect dialect, String query)
                if (endPos != -1) {
        return query;

    }
        String strValue;
                    String scriptLine = action.getScript();
            if (c == '*') {
        List<String> nameList = new ArrayList<>();
                    // Query is comment line - return empty
                if (Character.isLetterOrDigit(delimiter.charAt(0))) {
            }
        StringBuilder fixed = new StringBuilder(initial.length);
    }
            query,
                    if (nc == '_' || nc == '*' || nc == '?' || nc == '.' || nc == '%') {
        );
import org.jkiss.utils.Pair;
        if (type.getDataKind() == DBPDataKind.NUMERIC || type.getDataKind() == DBPDataKind.BOOLEAN) {
    ) {

        DBDDisplayFormat displayFormat,
     * Replaces single \r linefeeds with space (some databases don't like them)
                if (!CommonUtils.isEmpty(startQuote) && !CommonUtils.isEmpty(endQuote) && name.startsWith(startQuote)) {
        return false;
    @NotNull

            if (dialect instanceof SQLDialectRelational &&
    }
}
        @NotNull StringBuilder query) {
                    return sqlDialect.getQuotedString(strValue);
                        result.append("\\");
        boolean hasFixes = false;
            for (int i = 0; i < leftIdentifier.size(); i++) {
                    .append(leftAlias).append(".").append(DBUtils.getQuotedIdentifier(fkc)).append(" = ")
            query = query.substring(0, parameter.getTokenOffset()) + paramValue + query.substring(parameter.getTokenOffset() + parameter.getTokenLength());
        if (hasStatements) {
    @NotNull
/**
                // Text content. Fall down
        String unquottedIdentifier;
    ) {
            return;
        boolean subQuery
            sql.append("\n");
        Pattern pattern = Pattern.compile(makeLikePattern(like), Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
    }
        }
                }
        if (dataSource == null) {
                alias = generatedAlias.toLowerCase(Locale.ENGLISH);
        @Nullable String conditionTable,
                String startQuote = quotePair[0];
            }
        return BasicSQLDialect.INSTANCE;
        if (query.isEmpty()) {
        if (!CommonUtils.isEmpty(buf)) {
                    }
            s = s.substring(1, s.length() - 1).trim();
        @Nullable String mlCommentStart,
        return false;
        }
                strValue = dataSource.getSQLDialect().getQuotedString(value.toString());

        for (int i = startPos; i < query.length(); i++) {
    }
        if (!dialect.isCRLFBroken()) {
    @NotNull
        String[][] blockBoundStrings = dialect.getBlockBoundStrings();
        }
            .getQueryGenerator()
                    query = query.substring(0, startPos) + query.substring(endPos + mlCommentEnd.length());
                    // \n\r
    public static String generateScript(DBPDataSource dataSource, DBEPersistAction[] persistActions, boolean addComments)
        for (endPos = query.length() - 1; endPos > startPos; endPos--) {
        if (query.indexOf('\r') == -1) {
    }
     * Actually this is done specially for Oracle due to some bug in it's driver
                strValue = CommonUtils.toString(value);
        }
    }
        }
                return ContentUtils.getContentStringValue(monitor, content);
    }

        if (endPos == -1) {
            final char ch = clause.charAt(index);
            hasStatements = true;
    public static String quoteString(DBPDataSource dataSource, String string)

            for (DBEPersistAction action : persistActions) {
                    .append(rightAlias).append(".").append(DBUtils.getQuotedIdentifier(fkc.getReferencedColumn()));
            }
                if (block.length > 0 && keyword.equalsIgnoreCase(block[0])) {
            {
        if (persistActions != null) {
    }
            return isExecKeyword(dialect, queryStart);
            }
        }
        query = removeSlComments(query, slComments);
            break;
        sql = generateTableJoinByAssociation(monitor, rightTable, rightAlias, leftTable, leftAlias);
                    int endPos = name.indexOf(endQuote, startQuote.length());

            for (DBSEntityAttribute attr : leftIdentifier) {
                } else {
                continue;
        int length = str.length();

                .append(DBEAVER_DDL_WARNING).append(lineSeparator);
            while (startPos != -1) {
                    script.append(lineSeparator);
                            if (!Character.isWhitespace(script.charAt(i))) {
        } else {
        @NotNull String query,
    private static String generateTablesJoin(DBRProgressMonitor monitor, DBSTableForeignKey fk, String leftAlias, String rightAlias) throws DBException {

    @NotNull
    }
            return joinSQL.toString();

        SQLCommentScanner scanner = new SQLCommentScanner(
            subQuery


        }
                char lastChar = sql.charAt(sql.length() - statementDelimiter.length() - 1);
            strValue = dataSource.getSQLDialect().getTypeCastClause(constraint.getAttribute(), "?", true);
        }
                    }
            }
    }
                    script.append(scriptLine);
                        int lfCount = 0;
            for (DBEPersistAction action : persistActions) {
        return result.toString();
            } else if (c == '%') {
        boolean isInCondition
                joinSQL

        return sb.toString();
            boolean hadQuotedPart = false;
            boolean isQuoted = dialect.isQuotedIdentifier(rawIdentifierString);
        final String separator = GeneralUtils.getDefaultLineSeparator();
                    if (CommonUtils.isEmpty(scriptLine)) {
        if (sql.indexOf('\r') == -1) {
                            name.substring(0, endPos + endQuote.length()) :
        switch (dataKind) {
            }
                                isBlockQuery = true;
                    buf.append(c);
            } else {
        if (dataSource != null) {
        boolean forceUnquotted,
            }
            }
import org.jkiss.dbeaver.Log;
        }
                }
        return splitFullIdentifier(fullName, String.valueOf(nameSeparator), quoteStrings, false);
    ) {
                    nameList.add(name.substring(0, endPos));
            conditionTable,

        if (constraint.getAttribute() == null) {
                        // We need exactly one space before letter/digit
        String strValue;
        if (!delimiter.isEmpty() && Character.isLetterOrDigit(delimiter.charAt(0))) {
            sql.append(trimmed);
                                    isBlockQuery = true;
                } else if (query.endsWith(delimiter)) {
    ) {
        if (object instanceof DBSObject) {
//        }
            return sql;

        return quoteString(object.getDataSource(), string);
                }
    ) {
    {
            }
            return name.split(Pattern.quote(nameSeparator));
     * @param codePoint unicode code point
    public static String trimQueryStatement(SQLSyntaxManager syntaxManager, String sql, boolean trimDelimiter)
                if (i > 0 && initial[i - 1] == '\n') {
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        @NotNull SQLDialect dialect,
 * SQL Utils
        }

    public static void appendLikeCondition(@NotNull StringBuilder sql,@NotNull String value, boolean not,@Nullable SQLDialect dialect) {
                    joinSQL.append(" AND ");
    public static String makeRegexFromLike(@NotNull String clause) {
                }
        }
        int startPos;
        return script.toString();
                hasFixes = true;
        if (!name.contains(nameSeparator)) {
        return false;
            if (!hadQuotedPart) {
            sql = sql.substring(0, MAX_SQL_DESCRIPTION_LENGTH) + " ...";
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
                depth++;
    public static String removeQueryDelimiter(SQLDialect sqlDialect, String query) {
        if (!leftIdentifier.isEmpty()) {
            if (!hasDelimiter) {
        sql = stripComments(BasicSQLDialect.INSTANCE, sql);

            if (c == ',' && depth == 0) {
    public static SQLDialect getDialectFromObject(DBPObject object)
                    name = name.substring(endPos);
        }
            multiLineComments == null ? null : multiLineComments.getSecond(),
                int crPos = query.indexOf('\n');
                    break;
                if (hasCriteria) {
        }
 *
    }
    }
        List<DBSEntityAttribute> leftIdentifier = new ArrayList<>(DBUtils.getBestTableIdentifier(monitor, leftTable));
                        if (!Character.isLetterOrDigit(query.charAt(query.length() - delimiter.length() - 1))) {
            {
        return CommonUtils.escapeIdentifier(table.getName());

        // Now try right to left
        boolean hasCriteria = false;

        // Set values for all parameters
                return true;
    }
        }
//        if (!query.contains(TOKEN_TRANSFORM_START)) {
                            if (script.charAt(i) == '\n') lfCount++;
                return result;
            } else {
                if (!Character.isWhitespace(sql.charAt(i))) {
                if (binValue == null) {
        query = stripComments(dialect, query);
            return query;
        }
    private static final String DBEAVER_DDL_COMMENT = "-- DDL generated by ";
                    query = query.substring(crPos).trim();
            return SQLConstants.NULL_VALUE;
        }

                if (endPos != -1) { //remove multiline comment
                String scriptLine = action.getScript();
    {
                result.append(".*");
        value = makeSQLLike(value);
            } else if (c == '(' || c == ')' || c == '[' || c == ']') {
                if (index == length - 1) {
        @Nullable String tableAlias,
        return nameList.toArray(new String[0]);
                                if (afterEnd.chars().noneMatch(Character::isWhitespace)) {
    public static String generateParamList(int paramCount) {
            }
                        }
            query,
                hasCriteria = true;
        for (String p : parts) {
 * limitations under the License.
            query,

                if (action.isComplex() && redefiner != null && !redefiner.equals(delimiter)) {
                    nameList.add(name);
                script.append(lineSeparator);
    public static SQLDialect getDialectFromDataSource(@Nullable DBPDataSource dataSource) {
        String name = fullName.trim();
    }
        }
            // We have only attribute name
            char c = str.charAt(i);
        }
            return new String[]{name};
    }

            // Do not trim delimiter
        //sqlStatement.setOriginalText(query);
 */

     *
    public static boolean isBlockEndKeyword(SQLDialect dialect, String keyword) {
                case '?' -> result.append("\\?");
            return query;
                    script.append(redefiner).append(" ").append(getScriptLineDelimiter(sqlDialect)).append(lineSeparator);
        @NotNull String rawIdentifierString,
            result.append(c);
                }
    }
    public static String[] splitFullIdentifier(final String fullName, String nameSeparator, String[][] quoteStrings, boolean keepQuotes) {
                                String afterEnd = test.substring(endIndex + blocks[1].length()).trim();
    }
    ) throws DBException {
        for (String statementDelimiter : syntaxManager.getStatementDelimiters()) {
        }
        return actualIdentifierString;
                }
    }
                    }
                    if (testLine.lastIndexOf(delimiter) != (testLine.length() - delimiter.length())) {
        return sb.toString();
            char c = s.charAt(i);
            name = keepQuotes ? name : DBUtils.getUnQuotedIdentifier(name, quoteStrings);
import org.jkiss.dbeaver.model.runtime.DBRFinder;

        }
        query = query.trim();
                        int endIndex = test.lastIndexOf(blocks[1]);
                    return SQLConstants.NULL_VALUE;
        @NotNull SQLDialect sqlDialect,
            if (!isBlockQuery) {

                slComment = "--";
            return false;
    }
        }
import java.util.regex.Matcher;
                    query = query.substring(0, startPos); // to prevent infinity recursion
