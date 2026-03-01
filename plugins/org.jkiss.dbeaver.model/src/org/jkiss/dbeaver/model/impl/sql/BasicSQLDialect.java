        return string.replace("'", "''");

    @NotNull
    @Nullable

    }
    @Override
        }
    }
    }
        }
    private static final String[] COMMIT_KEYWORDS = { SQLConstants.KEYWORD_COMMIT };
    @NotNull
    @Override
        SQLConstants.KEYWORD_MERGE,
        return false;
    }
    public String[] getDMLKeywords() {
        }
        for (String ddlKeyword : ArrayUtils.safeArray(getDDLKeywords())) {
    public DBPIdentifierCase storesUnquotedCase() {
        return "";
        return true;
import org.jkiss.code.NotNull;
    private static final String[] DDL_KEYWORDS = new String[]{
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
    }

    @Override
        return true;


        loadStandardKeywords();
}


        return null;
    }
        for (String kw : getColumnQueryWords()) {
            // Add default types
    public boolean isDelimiterAfterQuery() {
        "USE",
    private static final String[] DEFAULT_LINE_COMMENTS = {SQLConstants.SL_COMMENT};
    public String[] getExecuteKeywords() {
    public boolean supportsQuotedMixedCase() {
    @Override

    @NotNull
    public String[] getTransactionCommitKeywords() {

            setKeywordIndent(beKeywords[0], 1);
    public String[] getSingleLineComments() {
    @Override
    private static final String[][] DEFAULT_BEGIN_END_BLOCK = new String[][]{
    @Override

        return false;
    }
    }
    @Override
            }
    @Override
    public SQLStateType getSQLStateType() {
    @Override
    @Override
    @Nullable
    @Override
    protected static final String[] NON_TRANSACTIONAL_KEYWORDS = {
    @Override

 */
import org.jkiss.utils.CommonUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");

    };
package org.jkiss.dbeaver.model.impl.sql;
    }
 *
        return DDL_KEYWORDS;
    }
            return '\'' + escapeString(strValue) + '\'';
        }
        return SQLConstants.STRUCT_SEPARATOR;

    public GlobalVariableInfo[] getGlobalVariables() {
    @Override

    public String getScriptDelimiterRedefiner() {
    }
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return "DO".equals(firstKeyword) || super.isTransactionModifyingKeyword(firstKeyword);
    @Nullable
    public boolean supportsOrderBy() {
        return null;
    }
    private void loadStandardKeywords() {
        }
    public boolean needsDefaultDataTypes() {

        return true;
    public boolean supportsNullability() {
            Collections.addAll(all, SQLConstants.SQL_EX_KEYWORDS);

        SQLConstants.KEYWORD_EXPLAIN,
    public boolean isCatalogAtStart() {
    @NotNull
        if (isEscapeBackslash()) {
        return DEFAULT_STRING_QUOTES;
            if (needsDefaultDataTypes()) {
    @Override
    @NotNull
        "DESC",

    public DBPIdentifierCase storesQuotedCase() {
        return true;
        return "SQL";

    public boolean supportsAliasInSelect() {
    public int getCatalogUsage() {

    public String[][] getBlockBoundStrings() {
    @NotNull
    }
    public static final String ID = "basic";
import org.jkiss.dbeaver.model.DBPKeywordType;
    @NotNull
    }
        if (isStandardSQL()) {
    public String[] getDDLKeywords() {
        return true;
        }

        return strValue;

        SQLConstants.KEYWORD_TRUNCATE
        return isStandardSQL() ? NON_TRANSACTIONAL_KEYWORDS : CORE_NON_TRANSACTIONAL_KEYWORDS;
    @NotNull
    }
    @Override
    @Override

            Collections.addAll(all, SQLConstants.SQL2003_RESERVED_KEYWORDS);
    public String[] getNonTransactionKeywords() {

        }
    }
    public String[][] getStringQuoteStrings() {
    }
    public boolean supportsOrderByIndex() {
        return GlobalVariableInfo.EMPTY_ARRAY;
    @Override

    public boolean supportsCommentQuery() {
    protected static final String[] DML_KEYWORDS = new String[]{
    }
    }

    public String getSearchStringEscape() {
    public String getDialectName() {
        "SET",
    public String[][] getIdentifierQuoteStrings() {

 */
    @NotNull
        }
    private static final String[] EXEC_KEYWORDS = new String[0];
    @Override
    @Override
    @Override
            setKeywordIndent(kw, 1);
    @NotNull
    @Override

    @Override
    public boolean supportsUnquotedMixedCase() {
    public String escapeString(String string) {
    public String getCatalogSeparator() {
        return DBPIdentifierCase.MIXED;

            setKeywordIndent(kw, 1);
 *
 * limitations under the License.
    }
    public String[] getTransactionRollbackKeywords() {
        // Add default set of keywords
import org.jkiss.dbeaver.model.sql.SQLStateType;
        SQLConstants.KEYWORD_ROLLBACK
 * you may not use this file except in compliance with the License.
 * Basic SQL Dialect
import org.jkiss.dbeaver.model.sql.SQLDialectRelational;
            addKeywords(all, DBPKeywordType.KEYWORD);
        return COMMIT_KEYWORDS;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    }
    }
        // Handle "DO" separately
            addColumnQueryKeywords(SQLConstants.COLUMN_KEYWORDS);
        return false;
        return USAGE_NONE;
 *     http://www.apache.org/licenses/LICENSE-2.0

        return true;


            addTableQueryKeywords(SQLConstants.TABLE_KEYWORDS);
    }
    public boolean isDelimiterAfterBlock() {
        return true;
    @NotNull
        return false;
        Set<String> all = new HashSet<>();
    }
    @Override
        return USAGE_NONE;
    };
    };
    @Override
    }
/*
        "DESCRIBE",
                addDataTypes(List.of(SQLConstants.DEFAULT_TYPES));
    public static final BasicSQLDialect INSTANCE = new BasicSQLDialect();
    @NotNull
    private static final String[] CORE_NON_TRANSACTIONAL_KEYWORDS = new String[]{

    public boolean isStandardSQL() {

    @Nullable
        return true;
    @Override
    }

        SQLConstants.KEYWORD_SELECT,
import org.jkiss.code.Nullable;
        return DBPIdentifierCase.UPPER;
import org.jkiss.dbeaver.model.DBPIdentifierCase;
    }

    @Override
        return DEFAULT_LINE_COMMENTS;
/**
        return String.valueOf(SQLConstants.STRUCT_SEPARATOR);
    public boolean supportsAliasInUpdate() {
import org.jkiss.utils.ArrayUtils;
    public boolean isAmbiguousCountBroken() {



 * DBeaver - Universal Database Manager
    protected boolean isTransactionModifyingKeyword(String firstKeyword) {
    @Nullable
    @Override
        SQLConstants.KEYWORD_UPSERT,
    public String[] getBlockHeaderStrings() {

    };

        SQLConstants.KEYWORD_INSERT,
        return DEFAULT_BEGIN_END_BLOCK;

    }
    @NotNull
        return false;
 * Unless required by applicable law or agreed to in writing, software
    }
        return DEFAULT_IDENTIFIER_QUOTES;
    @Override
public class BasicSQLDialect extends AbstractSQLDialect implements SQLDialectRelational {
    protected BasicSQLDialect() {
    @Override
            //Collections.addAll(reservedWords, SQLConstants.SQL2003_NON_RESERVED_KEYWORDS);
    }

    public boolean isQuoteReservedWords() {
    public boolean supportsSubqueries() {


        }
        return EXEC_KEYWORDS;
    }
    }


 * See the License for the specific language governing permissions and

    public boolean supportsGroupBy() {
        return SQLStateType.SQL99;
    @Override
    public char getStructSeparator() {
    }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        "CREATE", "ALTER", "DROP"
        return 0;

    public String escapeScriptValue(DBSTypedObject attribute, @NotNull Object value, @NotNull String strValue) {
        SQLConstants.KEYWORD_UPDATE,

    @Override

    }
        return false;
    }
    public static final String[][] DEFAULT_STRING_QUOTES = {{"'", "'"}};
        if (isStandardSQL()) {
        return Character.isLetter(c);
        return true;
        for (String kw : getTableQueryWords()) {

    @Override
            SQLConstants.BLOCK_BEGIN,
    }

    @Override
        return false;
    public String getDialectId() {
        return ID;
        SQLConstants.KEYWORD_SELECT
            string = string.replace("\\", "\\\\");
    }
            SQLConstants.BLOCK_END
import org.jkiss.dbeaver.model.sql.SQLConstants;
        SQLConstants.KEYWORD_DELETE,
    }
    public boolean supportsTableDropCascade() {
    public static final String[][] DEFAULT_IDENTIFIER_QUOTES = {{"\"", "\""}};
        for (String[] beKeywords : ArrayUtils.safeArray(getBlockBoundStrings())) {
    @Override
    @NotNull
 *
        return ROLLBACK_KEYWORDS;
        return isStandardSQL() ? DML_KEYWORDS : new String[0];


    private static final String[] ROLLBACK_KEYWORDS = { SQLConstants.KEYWORD_ROLLBACK };
 * You may obtain a copy of the License at
    }

    }
        return true;
            addFunctions(List.of(SQLConstants.SQL2003_FUNCTIONS));
        if (value instanceof UUID) {
    }
    public int getSchemaUsage() {
    public char getStringEscapeCharacter() {
    @Override


        SQLConstants.KEYWORD_COMMIT,

            setKeywordIndent(ddlKeyword, 1);
    }
    @Override

        }
            addSQLKeyword(executeKeyword);
        return true;
    @Override
            setKeywordIndent(beKeywords[1], -1);
    @Override
    @Override

    public String unEscapeString(String string) {
    }
    };
    }
import java.util.*;
        {
            addSQLKeyword(ddlKeyword);
    @NotNull
    @Override
        return false;

    }
    @Override
    @Override
            setKeywordIndent(executeKeyword, 1);
    public boolean validIdentifierStart(char c) {
    @Override
    @Override
        for (String executeKeyword : ArrayUtils.safeArray(getExecuteKeywords())) {
        return CommonUtils.notEmpty(string).replace("''", "'");
    public boolean isCRLFBroken() {


