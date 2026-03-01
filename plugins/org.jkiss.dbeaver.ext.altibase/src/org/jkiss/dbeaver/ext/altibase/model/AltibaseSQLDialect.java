        "ADD_MONTHS", "DATEADD", "DATEDIFF", "DATENAME", "EXTRACT", 
    
    @Override
        "USER_LOCK_REQUEST",       "USER_NAME",                 //170
        addDataTypes(Stream.of(AltibaseDataTypeDomain.values())
    }
        "DISJOIN",            "DUMP_CALLSTACKS",    // 30

                        tt.sequence(
        "RANDOM_STRING",           "RANK",                      //108
    }
                 * 
                        tt.sequence(";")
        );
 * Copyright (C) 2010-2026 DBeaver Corp and others
        "TDESENCRYPT",             "TO_BIN",                    //150
        "ASCIISTR", "BIN_TO_NUM", "CONVERT", "DATE_TO_UNIX", "HEX_ENCODE", 
        return false;
        "CHECKPOINT",         "COMMENT",            // 14

        "UNIX_TIMESTAMP",          "UNIX_TO_DATE",              //166

        "TRANSLATE", "TRIM", "UPPER", 
                new TokenPredicatesCondition(
        "COALESCE",           "COLUMN",             "COMMENT",            "COMMIT",             "COMPILE",              //35
    }
    }

    
        "LINKER",             "LOB",                "LOCAL",              "LOCALUNIQUE",        "LOCK",                 //130

        // Find DB only words

        "NULLIF",                  "NUMAND",                    // 94
        "COVAR_POP",               "COVAR_SAMP",                // 32
                ),
        "STUFF",                   "SUBRAW",                    //140
     * for ALTIBASE_ONLY_KEYWORDS and ALTIBASE_ONLY_FUNCTIONS.
        return "";
        "SESSION_ID",              "SESSION_TIMEZONE",          //130

    }
    }
    @Override
    }
        "NTH_VALUE_IGNORE_NULLS",  "NTILE",                     // 92
    public boolean supportsTableDropCascade() {
        "ENABLE",             "ENQUEUE",            // 34
    
        syntaxManager.init(this, dataSource.getContainer().getPreferenceStore());
    
        filter(ALTIBASE_KEYWORDS, SQLConstants.SQL2003_RESERVED_KEYWORDS);
    public String getUuidDataType() {
 * Unless required by applicable law or agreed to in writing, software
        "COMPRESSED",         "CONJOIN",            // 18
    public boolean isDisableScriptEscapeProcessing() {

     * Extracting and Formatting Altibase only keywords and functions 
        "RAW_TO_VARCHAR",          "REGEXP_COUNT",              //116
    

        return AltibaseDataTypeDomain.DATE.getTypeName();
        dbDistinctNames = Arrays.stream(dbProvideNames).distinct().toArray(String[]::new);
    }
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;

                                "TYPESET"

        "PKCS7UNPAD16", "RANDOM_STRING", "REGEXP_COUNT", "REGEXP_REPLACE", "REPLICATE", 
        "ARCHIVELOG",         "AS",                 "ASC",                "AT",                 "AUDIT",                //15
        "UNCOMPRESSED",       "UNLOCK",             //114
        "REPLICATE",               "REVERSE_STR",               //122
    private SQLTokenPredicateSet makeDialectSkipTokenPredicates(JDBCDataSource dataSource) {

 * you may not use this file except in compliance with the License.
    }
        return new String[]{";", "/"};
        super.initDriverSettings(session, dataSource, metaData);
                        ),
    
        "EXTENTSIZE",         "FIFO",               // 38
    @Override
    private static void filter(String[] dbProvideNames, String[] sqlProvidedNames) {
import org.jkiss.dbeaver.model.sql.SQLDialectDDLExtension;
        }
        
        "LAST_DAY", "MONTHS_BETWEEN", "NEXT_DAY", "SESSION_TIMEZONE", "SYSTIMESTAMP", 
                 * Grammar conflict between PSM and Typeset
    @Override
        "CHR", "CHOSUNG", "CONCAT", "DIGITS", "INITCAP", 
        return ALTIBASE_BLOCK_HEADERS;
                /* Oracle grammar */
        "BIN_TO_NUM",              "BITAND",                    // 16
        "TO_CHAR",                 "TO_DATE",                   //152
        "MODIFY",             "MOVE",               // 64
    }
    @Override
    @Override

    @Override
        return cachedDialectSkipTokenPredicates == null ? super.getSkipTokenPredicates() : cachedDialectSkipTokenPredicates;
                        SQLParserActionKind.BEGIN_BLOCK,
public class AltibaseSQLDialect extends JDBCSQLDialect 
        "ASCII",                   "ASCIISTR",                  //  6

        "DESDECRYPT",              "DESENCRYPT",                // 44
    /**
        Set<String> defaultWordList = Set.of(sqlDistinctNames);
        "DUMP", "EMPTY_BLOB", "EMPTY_CLOB", "GREATEST", "GROUPING", 
    @Override
        "SUBSTRB",                 "SYSTIMESTAMP",              //142

        "ARCHIVELOG",         "AUDIT",              //  6
                ),
        "GROUPING_ID",             "GROUP_CONCAT",              // 58
    
        "PARALLEL",           "PARAMETERS",         // 78
                        tt.sequence(
        "NUMOR",                   "NUMSHIFT",                  // 96
        // Convert number
        String[] sqlDistinctNames = null;
        "LEAD_IGNORE_NULLS",       "LEAST",                     // 74
        // Not supported data type
        "LIBRARY",            "LIFO",               "LIKE",               "LIMIT",              "LINK",                 //125
        "REMOTE_TABLE_STORE", "REMOVE",             // 88
        sqlDistinctNames = Arrays.stream(sqlProvidedNames).distinct().toArray(String[]::new);
        "TRANSLATE",               "TRIPLE_DESDECRYPT",         //160
    public String[] getInnerBlockPrefixes() {
                new TokenPredicatesCondition(
    @NotNull
        "CONV_TIMEZONE",           "CORR",                      // 28
        "MAXROWS",            "MAXTRANS",           // 60
        "SHARD",              "SHRINK_MEMPOOL",     // 98

import org.jkiss.dbeaver.model.sql.parser.tokens.predicates.TokenPredicatesCondition;
        "UNPIVOT",            "UNTIL",              //116

        "STDDEV_POP",              "STDDEV_SAMP",               //138
        "STATS_ONE_WAY_ANOVA",     "STDDEV",                    //136
    @Nullable
    @NotNull
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCSQLDialect;
        TokenPredicateSet conditions = TokenPredicateSet.of(
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;
        // Number

                .filter(e -> !defaultWordList.contains(e))
        "CUME_DIST", "FIRST", "GROUP_CONCAT", "LAST", "LISTAGG", 
import org.jkiss.code.NotNull;
        "INSTEAD",            "KEEP",               // 46
import java.util.stream.Stream;
        "RECOVER",            "REMOTE_TABLE",       // 86
        "FLUSH",              "FLUSHER",            // 42
        return "CREATE USER \"" + schemaName + "\" IDENTIFIED BY \"" + schemaName + "\"";
    public String[] getBlockHeaderStrings() {
        addKeywords(Arrays.asList(OTHER_TYPES_FUNCTIONS), DBPKeywordType.OTHER);
        "STEP",               "STORAGE",            //104
        "TRIPLE_DESENCRYPT",       "TRUNC",                     //162
    @Override
    public String[] getNonTransactionKeywords() {
import org.jkiss.dbeaver.model.sql.SQLDialectSchemaController;
                                tt.optional("OR", "REPLACE"),
    }
        "FIXED",              "FLASHBACK",          // 40
        "USING",              "VALUES",             "VARIABLE",           "VARIABLE_LARGE",     "VC2COLL",              //245
        "CEIL", "COS", "COSH", "EXP", "FLOOR", 
     * Base data to generate Altibase only keyword and function list
    }
        "MAX", "MIN", "PERCENTILE_CONT", "PERCENTILE_DISC", "PERCENT_RANK", 
                                "CREATE",
        TokenPredicateFactory tt = TokenPredicateFactory.makeDialectSpecificFactory(ruleManager);
    public String getClobDataType() {
        "CURRENT_USER",       "DATABASE",           // 22
    }
                                        ), ";")
        "DUMP",                    "EMPTY_BLOB",                // 48
    };
                .max().orElse(8);
        return super.getDDLKeywords();
        "FIRST_VALUE", "FIRST_VALUE_IGNORE_NULLS", "LAST_VALUE", "LAST_VALUE_IGNORE_NULLS", "NTH_VALUE",
    }
        "RANDOM", "ROUND", "SIGN", "SIN", "SINH", 

        "ROLLBACK",           "ROLLUP",             "ROW",                "ROWCOUNT",           "ROWNUM",               //200
        "DISABLE",            "DISASTER",           // 28
        "NOCOPY",             "NOCYCLE",            // 70
    private SQLTokenPredicateSet cachedDialectSkipTokenPredicates = null;
        // Etc.
    public boolean supportsAlterHasColumn() {
        "STORE",              "SUPPLEMENTAL",       //106
        "VC2COLL",            "VOLATILE",           //120
        "LEAD", "LEAD_IGNORE_NULLS", "NTILE", "FIRST", "LAST",
        "ATAN2",                   "BASE64_DECODE",             // 10
    public String getAutoIncrementKeyword() {
    }
        turnFunctionIntoKeyword("TRUNCATE");
        "ACCESS",             "ADD",                "AFTER",              "AGER",               "ALL",                  //5
        "SYS_CONTEXT"
                System.out.println(String.format(numFormat, i));
    }
    };
        "CEIL",                    "CHOSUNG",                   // 22
        return "";
        "LIFO",               "LINK",               // 50
        {SQLConstants.BLOCK_BEGIN, SQLConstants.BLOCK_END},
        "ONLINE",             "PACKAGE",            // 76
        "AS", "IS"
        "RAW_SIZEOF",              "RAW_TO_FLOAT",              //112
    @Override

        "DECODE",                  "DENSE_RANK",                // 42
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        "USER_ID",                 "USER_LOCK_RELEASE",         //168
    protected void loadDataTypesFromDatabase(JDBCDataSource dataSource) {
        "CASE2", "COALESCE", "DECODE", "DIGEST", 
        "SPECIFICATION",      "SPLIT",              //100
    private static final String[] ALTIBASE_BLOCK_HEADERS = new String[] {
     * Implements SQLDialectDDLExtension
        "LNNVL",                   "LOG",                       // 78
        "REGEXP_INSTR",            "REGEXP_REPLACE",            //118
        "CROSS",              "CUBE",               "CURRENT_USER",       "CURSOR",             "CYCLE",                //50
        "OFF",                "OFFLINE",            // 74
                        ),
        "APPLY",              "ARCHIVE",            //  4
        "INITCAP",                 "INSTR",                     // 64
        final List<String> dbOnlyWordList = List.of(dbDistinctNames).stream()
        // Aggregation functions
        "VAR_SAMP",                
        "ASIN",                    "ATAN",                      //  8
    public static final String[] OTHER_TYPES_FUNCTIONS = {

        "REPLICATION",        "RETURN",             "RETURNING",          "REVOKE",             "RIGHT",                //195
        // Not supported data type
 */
    @Override
        "BASE64_DECODE_STR",       "BASE64_ENCODE",             // 12
    public static final String[] ALTIBASE_ONLY_FUNCTIONS = new String[] {
    private static final String[][] ALTIBASE_BEGIN_END_BLOCK = new String[][]{
        return null;
    @Override
        addFunctions(Arrays.asList(ALTIBASE_ONLY_FUNCTIONS));
    }
        "ISNUMERIC",               "LAG",                       // 66
        // Encryption

        "HEX_DECODE", "HEX_TO_NUM", "OCT_TO_NUM", "RAW_TO_FLOAT", "RAW_TO_INTEGER", 
        "HEX_DECODE",              "HEX_ENCODE",                // 60
        return false;
    
     */
        maxLen++;
        "SUM", "VARIANCE", "VAR_POP", "VAR_SAMP", "MEDIAN",
                                tt.optional("OR", "REPLACE"),
    public boolean supportsInsertAllDefaultValuesStatement() {
    
        "REGEXP_INSTR", "REGEXP_SUBSTR", "SIZEOF",
        "MAXTRANS",           "MERGE",              "MINUS",              "MODE",               "MODIFY",               //140
        String[] dbDistinctNames = null;
        "RTRIM",                   "SENDMSG",                   //128
        "LAST_DAY",                "LAST_VALUE",                // 70
                .mapToInt(String::length)
import org.jkiss.dbeaver.model.sql.parser.tokens.predicates.TokenPredicateSet;
        "SIGN",                    "SIN",                       //132
        return conditions;
        "CONSTANT",           "CONSTRAINT",         "CONSTRAINTS",        "CONTINUE",           "CREATE",               //45
        "INNER",              "INSERT",             "INSTEAD",            "INTERSECT",          "INTO",                 //110
        "TRUNCATE",           "TYPESET",            //112
    @Override
        "COMPILE",            "COMPRESS",           // 16
        "BASE64_ENCODE_STR",       "BINARY_LENGTH",             // 14
        "IDENTIFIED",         "INITRANS",           // 44
    }
        "OLD",                "ON",                 "ONLINE",             "OPEN",               "OR",                   //160

                        tt.token("END"),
        "ASCII", "CHAR_LENGTH", "DIGEST", "INSTR", "OCTET_LENGTH", 
        "NUMXOR",                  "NVL",                       // 98

                .collect(Collectors.toList()));

import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
        "SPECIFICATION",      "SPLIT",              "SQLCODE",            "SQLERRM",            "START",                //215
            BasicSQLDialect.NON_TRANSACTIONAL_KEYWORDS,
 *
    private static final String[] ALTIBASE_NON_TRANSACTIONAL_KEYWORDS = ArrayUtils.concatArrays(
        "TRUNCATE",           "TYPE",               "TYPESET",            "UNCOMPRESSED",       "UNION",                //235
import org.jkiss.dbeaver.model.DBPIdentifierCase;
        "TO_HEX", "TO_INTERVAL", "TO_NCHAR", "TO_NUMBER", "TO_OCT", 
        
                                "CREATE",
/*
        "ROWCOUNT",           "ROWNUM",             // 94
                        tt.sequence(

        

        return AltibaseDataTypeDomain.BIGINT.getTypeName();
    }
                 * TYPESET: CREATE...[AS|IS] ... END
import org.jkiss.dbeaver.model.sql.parser.SQLParserActionKind;

        return true;
        return true;
        "DIGEST",                  "DIGITS",                    // 46
        "CONCAT",                  "CONVERT",                   // 26
    public boolean supportsAliasInSelect() {
 *
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
 * See the License for the specific language governing permissions and
    }
        "AUTHID",             "AUTOEXTEND",         "BACKUP",             "BEFORE",             "BEGIN",                //20
        "DISTINCT",           "DROP",               "DUMP_CALLSTACKS",    "EACH",               "ELSE",                 //70
        // Convert string
        "REMOTE_TABLE_STORE", "REMOVE",             "RENAME",             "REORGANIZE",         "REPLACE",              //190
    }
        "MONTHS_BETWEEN",          "MSG_CREATE_QUEUE",          // 84
        "RAISE",              "REBUILD",            // 84
import org.jkiss.dbeaver.model.sql.parser.SQLTokenPredicateSet;
        "REPLICATION",        "RETURNING",          // 92
    
        "DELAUDIT",           "DELETE",             "DEQUEUE",            "DESC",               "DETERMINISTIC",        //60
        "COS",                     "COSH",                      // 30
        "LOWER", "LPAD", "LTRIM", "NCHR", "PKCS7PAD16", 
        "PROCEDURE",          "PURGE",              "QUEUE",              "RAISE",              "READ",                 //180
    public String getClobComparingPart(@NotNull String columnName) {
        return false;
    }
    }
        return false;
        "RATIO_TO_REPORT",         "RAW_CONCAT",                //110
        "WHERE",              "WHILE",              "WITH",               "WITHIN",             "WORK",                 //255
    @NotNull
    private static final String[] ALTIBASE_FUNCTIONS = new String[] {
    @Override
import java.util.stream.Collectors;
        if (!AltibaseConstants.DEBUG) {
        "FIFO",               "FIXED",              "FLASHBACK",          "FLUSH",              "FLUSHER",              //90
    public String getBooleanDataType() {
    public String[] getDDLKeywords() {
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean supportsAliasInConditions() {
        "BACKUP",             "BODY",               // 10
        "TO_HEX",                  "TO_INTERVAL",               //154
        {"LOOP", SQLConstants.BLOCK_END + " LOOP"},
                    tt.sequence(),
        "REBUILD",            "RECOVER",            "REFERENCES",         "REFERENCING",        "REMOTE_TABLE",         //185
    public String[] getScriptDelimiters() {
    }
        "MOVEMENT",           "NOARCHIVELOG",       // 66
    };
    @Nullable
                new TokenPredicatesCondition(
        "SYNONYM",            "TABLESPACE",         //108
        "BASE64_DECODE", "BASE64_DECODE_STR", "BASE64_ENCODE", "BASE64_ENCODE_STR", "BINARY_LENGTH", 
        "LOCALUNIQUE",        "LOCK",               // 54
    @NotNull
        "AESDECRYPT", "AESENCRYPT", "DESENCRYPT", "DESDECRYPT", "TDESDECRYPT", "TRIPLE_DESDECRYPT", 
        "SINH",                    "SIZEOF",                    //134
                    tt.sequence(tt.not("END"), "IF", tt.not("EXISTS"))
        "TDESENCRYPT", "TRIPLE_DESENCRYPT",
            }
    }
        "NULL",               "NULLS",              "OF",                 "OFF",                "OFFLINE",              //155
                /*
        "DATABASE",           "DECLARE",            "DECRYPT",            "DEFAULT",            "DEFINER",              //55
        "SUBRAW", "SYS_CONNECT_BY_PATH", "SYS_GUID_STR", "USER_LOCK_REQUEST", "USER_LOCK_RELEASE", 
                        tt.sequence()
        "AUTHID",             "AUTOEXTEND",         //  8
    @Override
    public String getBlobDataType() {
 *     http://www.apache.org/licenses/LICENSE-2.0
        
    }
                        SQLParserActionKind.SKIP_SUFFIX_TERM,
    public String getDualTableName() {
    private static final String[] ALTIBASE_KEYWORDS = {
        "SYS_CONNECT_BY_PATH",     "SYS_CONTEXT",               //144
        "TO_RAW", "UNISTR", "UNIX_TO_DATE",
        "STATEMENT",          "STEP",               "STORAGE",            "STORE",              "SUPPLEMENTAL",         //220
                        SQLParserActionKind.BEGIN_BLOCK,
    };
        "CHR",                     "COALESCE",                  // 24
        "MEDIAN",                  "MOD",                       // 82
            new String[]{
        "MSG_DROP_QUEUE",          "MSG_RCV_QUEUE",             // 86
import java.util.Arrays;
        "EXIT",               "EXTENT",             "EXTENTSIZE",         "FALSE",              "FETCH",                //85
        "ROUND",                   "ROWNUM",                    //124
        "ROWNUM", "SENDMSG", "USER_ID", "USER_NAME", "SESSION_ID", 
        "LANGUAGE",           "LATERAL",            "LEFT",               "LESS",               "LEVEL",                //120
    
    
                                tt.alternative("FUNCTION", "PROCEDURE")
        "EMPTY_CLOB",              "EXP",                       // 50
                                        tt.sequence(SQLTokenType.T_OTHER, SQLTokenType.T_TYPE)
    public static final String[] ALTIBASE_ONLY_KEYWORDS = new String[] {
                                tt.optional("OR", "REPLACE"),
    }
        cachedDialectSkipTokenPredicates = makeDialectSkipTokenPredicates(dataSource);
        // Window functions
import org.jkiss.code.Nullable;
    public String getBigIntegerType() {
        "BITNOT",                  "BITOR",                     // 18
    public SQLTokenPredicateSet getSkipTokenPredicates() {
        String numFormat = "\t//%3d";
    
                 * PSM: CREATE...[AS|IS] ... BEGIN ... END
        "CASE",               "CAST",               "CHECK",              "CHECKPOINT",         "CLOSE",                //30
        "SQRT", "TAN", "TANH", "TRUNC", "BITAND", 
    @Override
        return AltibaseConstants.OPERATION_MODIFY;
        "BETWEEN",            "BODY",               "BULK",               "BY",                 "CASCADE",              //25
    @NotNull
import org.jkiss.dbeaver.model.DBPKeywordType;
        "ROW_NUMBER",              "RPAD",                      //126
        "CURRENT_TIMESTAMP",       "DATEADD",                   // 36
        "DATE_TO_UNIX",            "DB_TIMEZONE",               // 40
        "MINUS",              "MODE",               // 62
                )

    };
        
        "VARIABLE",           "VARIABLE_LARGE",     //118
        
        return "SELECT 1 FROM SYSTEM_.SYS_USERS_ WHERE USER_NAME='" + schemaName + "'";
        "WRAPPED",            "_PROWID",            //124
        "NVL2",                    "OCT_TO_NUM",                //100
    @NotNull
                new TokenPredicatesCondition(
        "ROWTYPE",            "SAVEPOINT",          "SEGMENT",            "SELECT",             "SEQUENCE",             //205
                        tt.sequence(
        "TANH",                    "TDESDECRYPT",               //148
        "FOLLOWING",          "FOR",                "FOREIGN",            "FROM",               "FULL",                 //95
import java.util.List;
        "ROWTYPE",            "SEGMENT",            // 96
                    SQLParserActionKind.BEGIN_BLOCK,
    @NotNull
    @Override
        
import org.jkiss.dbeaver.model.sql.SQLConstants;
 * You may obtain a copy of the License at
        "COMPRESS",           "COMPRESSED",         "CONJOIN",            "CONNECT",            "CONNECT_BY_ROOT",      //40
    public String getSchemaExistQuery(@NotNull String schemaName) {
            implements SQLDialectDDLExtension, SQLDialectSchemaController {
        return "DBMS_LOB.COMPARE(%s,?) = 0".formatted(columnName);
        "SESSION",            "SET",                "SHARD",              "SHRINK_MEMPOOL",     "SOME",                 //210
        "PARTITIONS",         "PIVOT",              // 80
    public String getCreateSchemaQuery(@NotNull String schemaName) {
    
        "QUOTE_PRINTABLE_DECODE",  "QUOTE_PRINTABLE_ENCODE",    //104
                        tt.sequence()
        //functions without parentheses
                .sorted()
    @Override
        "RANK", "DENSE_RANK", "ROW_NUMBER", "LAG", "LAG_IGNORE_NULLS", 
        setUnquotedIdentCase(DBPIdentifierCase.UPPER);
        "DIRECTORY",          "DISABLE",            "DISASTER",           "DISCONNECT",         "DISJOIN",              //65
    @Override
        "IS",                 "ISOLATION",          "JOIN",               "KEEP",               "KEY",                  //115
        "IDENTIFIED",         "IF",                 "IN",                 "INDEX",              "INITRANS",             //105
        "RAW_TO_NUMERIC", "RAW_TO_VARCHAR", "TO_BIN", "TO_CHAR", "TO_DATE", 
        "DEQUEUE",            "DIRECTORY",          // 26
        "PIVOT",              "PRECEDING",          "PRIMARY",            "PRIOR",              "PRIVILEGES",           //175
        return false;
        "MSG_DROP_QUEUE", "MSG_SND_QUEUE", "MSG_RCV_QUEUE", "NULLIF", "NVL", 
            return;
        "DECLARE", "PACKAGE"
                        SQLParserActionKind.SKIP_SUFFIX_TERM,

        "NVL2", "QUOTE_PRINTABLE_DECODE", "QUOTE_PRINTABLE_ENCODE", "RAW_CONCAT", "RAW_SIZEOF", 
        return "DUAL";
        
     */
        "NEXT_DAY",                "NTH_VALUE",                 // 90
                        ),
                                "PACKAGE", "BODY"
        "SYS_GUID_STR",            "TAN",                       //146
                                        "deterministor", "pipelined", "parallel_enable", "result_cache",
        "LESS",               "LIBRARY",            // 48
                                        ")",
        filter(ALTIBASE_FUNCTIONS, SQLConstants.SQL2003_FUNCTIONS);
        "NOAUDIT",            "NOCACHE",            // 68
}
    /******************************************************************************
 *
    };
                ),
        
    @Override
                "CREATE", "ALTER", "DROP", "ANALYZE", "VALIDATE",
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
import java.util.Set;
 * DBeaver - Universal Database Manager

        "VARIANCE",                "VAR_POP",                   //172
     */
        "REORGANIZE",         "REPLACE",            // 90
                .collect(Collectors.toList());
        // Convert
        ruleManager.loadRules(dataSource, false);
        "LPAD",                    "LTRIM",                     // 80
        super("Altibase", "altibase");
        // Remove duplicates if any
    private static final String[] ALTIBASE_INNER_BLOCK_PREFIXES = new String[]{
                new TokenPredicatesCondition(
                 */
        "AVG", "CORR", "COUNT", "COVAR_POP", "COVAR_SAMP", 
        SQLRuleManager ruleManager = new SQLRuleManager(syntaxManager);
        "LOGANCHOR",          "LOGGING",            // 56
    @Override
        return AltibaseDataTypeDomain.BLOB.getTypeName();

                                        tt.sequence("procedure", SQLTokenType.T_OTHER),
    @Override
    }
        "RAW_TO_INTEGER",          "RAW_TO_NUMERIC",            //114
        "SYSDATE"
    public AltibaseSQLDialect() {
        int numOfWordsLine = 2;
        "UNIQUE",             "UNLOCK",             "UNPIVOT",            "UNTIL",              "UPDATE",               //240
        "REPLACE2", "REVERSE_STR", "RPAD", "RTRIM", "STUFF", "SUBSTRB", 
        "WAIT",               "WHILE",              //122

    }
        "EXTRACT",                 "FIRST",                     // 52
        return ALTIBASE_BEGIN_END_BLOCK;
                .map(AltibaseDataTypeDomain::name)
        "CONV_TIMEZONE", "ROUND", "TRUNC",
        
    
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
        "LOGANCHOR",          "LOGGING",            "LOOP",               "MATERIALIZED",       "MAXROWS",              //135
        "UNIX_DATE", "UNIX_TIMESTAMP", "CURRENT_DATE", "CURRENT_TIMESTAMP", "DB_TIMEZONE", 
package org.jkiss.dbeaver.ext.altibase.model;
        return ALTIBASE_NON_TRANSACTIONAL_KEYWORDS;
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
        "ALTER",              "AND",                "ANY",                "APPLY",              "ARCHIVE",              //10

    };
import org.jkiss.dbeaver.model.sql.parser.tokens.predicates.TokenPredicateFactory;
        String wordFormat = "%-" + (maxLen + 2) + "s";

            if (++i % numOfWordsLine == 0) {
        "ABS", "ACOS", "ASIN", "ATAN", "ATAN2", 
        SQLSyntaxManager syntaxManager = new SQLSyntaxManager();
import org.jkiss.utils.ArrayUtils;
        "HEX_TO_NUM",              "HOST_NAME",                 // 62
                                        tt.sequence("RETURN", SQLTokenType.T_TYPE),
        "GREATEST",                "GROUPING",                  // 56
        "LISTAGG",                 "LN",                        // 76
        "EXIT",               "EXTENT",             // 36
        "NTH_VALUE_IGNORE_NULLS",
        "LINKER",             "LOB",                // 52
        "ELSEIF",             "ELSIF",              // 32
        "GROUPING_ID", "HOST_NAME", "LEAST", "LNNVL", "MSG_CREATE_QUEUE", 
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        "LAST_VALUE_IGNORE_NULLS", "LEAD",                      // 72
    public String getAlterColumnOperation() {
        "NUMOR", "NUMSHIFT", "NUMXOR", "POWER", "RAND", 
        addSQLKeywords(Arrays.asList(ALTIBASE_ONLY_KEYWORDS));
     * Register Altibase functions, SQL keywords, and so on.
        "TO_OCT",                  "TO_RAW",                    //158
        "UNISTR",                  "UNIX_DATE",                 //164
        super.loadDataTypesFromDatabase(dataSource);
        "CONNECT_BY_ROOT",    "CONSTANT",           // 20

        "RANK", "STATS_ONE_WAY_ANOVA", "STDDEV", "STDDEV_POP", "STDDEV_SAMP", 
        "NOCOPY",             "NOCYCLE",            "NOLOGGING",          "NOPARALLEL",         "NOT",                  //150
    /**
        "LOOP",               "MATERIALIZED",       // 58
                                tt.alternative(
    public boolean supportsNoActionIndex() {
        return false;
    @Override
        System.out.println();
        "THEN",               "TO",                 "TOP",                "TRIGGER",            "TRUE",                 //230
        "LAG_IGNORE_NULLS",        "LAST",                      // 68
    }
    
        "FIRST_VALUE",             "FIRST_VALUE_IGNORE_NULLS",  // 54
            System.out.print(String.format(wordFormat, "\"" + dbOnlyWord + "\","));
    }
    }
    
     ******************************************************************************/
    @Override
        "NOLOGGING",          "NOPARALLEL",         // 72
        "ELSEIF",             "ELSIF",              "ENABLE",             "END",                "ENQUEUE",              //75
    
        "SYNONYM",            "TABLE",              "TABLESPACE",         "TEMPORARY",          "THAN",                 //225
        "ORDER",              "OTHERS",             "OUT",                "OUTER",              "OVER",                 //165
    public boolean supportsCreateIfExists() {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
        "FUNCTION",           "GOTO",               "GRANT",              "GROUP",              "HAVING",               //100
    public boolean supportsAlterColumnSet() {
    @Override
        "LISTAGG", "RATIO_TO_REPORT", "GROUP_CONCAT", 
        "TO_NCHAR",                "TO_NUMBER",                 //156
                 * Altibase only grammar
                 * https://github.com/ALTIBASE/Documents/blob/master/Manuals/Altibase_7.3/eng/Stored%20Procedures%20Manual.md#create-typeset
    /*
        "BITXOR",                  "CASE2",                     // 20
    public String[][] getBlockBoundStrings() {
    public static void main(String[] args) {
        "SQLCODE",            "SQLERRM",            //102
    }
        "ISNUMERIC", "LN", "LOG", "MOD", "NUMAND", 
        "CUME_DIST",               "CURRENT_DATE",              // 34
    
        "DATEDIFF",                "DATENAME",                  // 38
                ),
        "PURGE",              "QUEUE",              // 82
                                "CREATE",
 * limitations under the License.
        return AltibaseDataTypeDomain.CLOB.getTypeName();
        "ACCESS",             "AGER",               //  2
        "PACKAGE",            "PARALLEL",           "PARAMETERS",         "PARTITION",          "PARTITIONS",           //170
        int maxLen = dbOnlyWordList.stream()
        "BITOR", "BITXOR", "BITNOT",
    @NotNull

    @Override
        "RAND",                    "RANDOM",                    //106
    @Override
        "PKCS7PAD16",              "PKCS7UNPAD16",              //102
        for (String dbOnlyWord : dbOnlyWordList) {
        // Date
        // Print out the result
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
            }
        int i = 0;
        "WRAPPED",            "WRITE",              "_PROWID",            "CACHE",              "NOCACHE"
        "THAN",               "TOP",                //110
    
    };
        {SQLConstants.KEYWORD_CASE, SQLConstants.BLOCK_END + " " + SQLConstants.KEYWORD_CASE},
        return ALTIBASE_INNER_BLOCK_PREFIXES;
        "MSG_SND_QUEUE",           "NCHR",                      // 88
        "MOVE",               "MOVEMENT",           "NEW",                "NOARCHIVELOG",       "NOAUDIT",              //145
    public String getTimestampDataType() {
        "VIEW",               "VOLATILE",           "WAIT",               "WHEN",               "WHENEVER",             //250
        "DECRYPT",            "DELAUDIT",           // 24
        "ACOS",                    "ADD_MONTHS",                //  2
        "BULK",               "CACHE",              // 12
        "ESCAPE",             "EXCEPTION",          "EXEC",               "EXECUTE",            "EXISTS",               //80
        );
        return false;
        "AESDECRYPT",              "AESENCRYPT",                //  4
        "REGEXP_SUBSTR",           "REPLACE2",                  //120
