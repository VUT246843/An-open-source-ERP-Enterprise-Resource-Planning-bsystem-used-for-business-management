        return '\\';
    }
    @Override

    }
                // These are data types without parameters

    public DatabricksSQLDialect() {
            case SQLConstants.DATA_TYPE_BOOLEAN:
    private static final String[][] DEFAULT_QUOTE_STRINGS = {{"`", "`"}};
            "APPROX_COUNT_DISTINCT", "APPROX_PERCENTILE", "APPROX_TOP_K", "ARRAY", "ARRAY_AGG", "ARRAY_CONTAINS", "ARRAY_DISTINCT",
    }
            "H3_TRY_POLYFILLASH3STRING", "H3_TRY_VALIDATE", "H3_UNCOMPACT", "H3_VALIDATE", "HASH", "HEX", "HOUR", "HYPOT", "IF", "IFF",
    @Override
            "MAKE_DT_INTERVAL", "MAKE_INTERVAL", "MAKE_TIMESTAMP", "MAKE_YM_INTERVAL", "MAP", "MAP_CONCAT", "MAP_CONTAINS_KEY",
        return DEFAULT_QUOTE_STRINGS;
 *
    }
public class DatabricksSQLDialect extends GenericSQLDialect {
    /**
            "NAMED_STRUCT", "NANVL", "NEGATIVE", "NEXT_DAY", "NOW", "NTH_VALUE", "NTILE", "NULLIF", "NVL", "NVL2", "OCTET_LENGTH",
            "MD5", "MEAN", "MEDIAN", "MIN", "MIN_BY", "MINUTE", "MOD", "MODE", "MONOTONICALLY_INCREASING_ID", "MONTH", "MONTHS_BETWEEN",
 * Unless required by applicable law or agreed to in writing, software

 * You may obtain a copy of the License at
    public boolean supportsAlterTableStatement() {

            "CEILING", "CHAR", "CHAR_LENGTH", "CHARACTER_LENGTH", "CHARINDEX", "CHR", "CLOUD_FILES_STATE", "COALESCE", "COLLECT_LIST",
            case SQLConstants.DATA_TYPE_SMALLINT:
        {"ABS", "ACOS", "ACOSH", "ADD_MONTHS", "AES_DECRYPT", "AES_ENCRYPT", "AGGREGATE", "AND", "ANY", "ANY_VALUE",
        @NotNull DBSTypedObject column,

            case SQLConstants.DATA_TYPE_BIGINT:
 * you may not use this file except in compliance with the License.
            "STARTSWITH", "STD", "STDDEV", "STDDEV_POP", "STDDEV_SAMP", "STR_TO_MAP", "STRING", "STRUCT", "SUBSTR", "SUBSTRING",
    }
    }
    public boolean validIdentifierPart(char c, boolean quoted) {
            "ARRAY_EXCEPT", "ARRAY_INTERSECT", "ARRAY_JOIN", "ARRAY_MAX", "ARRAY_MIN", "ARRAY_POSITION", "ARRAY_REMOVE", "ARRAY_REPEAT",
            case SQLConstants.DATA_TYPE_DOUBLE:
            "BIT_OR", "BIT_REVERSE", "BIT_XOR", "BOOL_AND", "BOOL_OR", "BOOLEAN", "BROUND", "BTRIM", "CARDINALITY", "CAST", "CBRT", "CEIL",

 * See the License for the specific language governing permissions and
            "XPATH_DOUBLE", "XPATH_FLOAT", "XPATH_INT", "XPATH_LONG", "XPATH_NUMBER", "XPATH_SHORT", "XPATH_STRING", "XXHASH64", "YEAR",
        switch (typeName) {
            "COLLECT_SET", "CONCAT", "CONCAT_WS", "CONTAINS", "CONV", "CORR", "COS", "COSH", "COT", "COUNT", "COUNT_IF", "COUNT_MIN_SKETCH",
import org.jkiss.dbeaver.model.sql.SQLUtils;
            case SQLConstants.DATA_TYPE_BINARY:
        addSQLKeywords(Arrays.asList(SPARK_EXTRA_KEYWORDS));
            "DATEADD", "DATEDIFF", "DATEDIFF", "DAY", "DAYOFMONTH", "DAYOFWEEK", "DAYOFYEAR", "DECIMAL", "DECODE", "DECODE", "DEGREES",
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            case SQLConstants.DATA_TYPE_TINYINT:
            "VAR_SAMP", "VARIANCE", "VERSION", "WEEKDAY", "WEEKOFYEAR", "WIDTH_BUCKET", "WINDOW_TIME", "XPATH", "XPATH_BOOLEAN",
            "H3_POLYFILLASH3STRING", "H3_RESOLUTION", "H3_STRINGTOH3", "H3_TOCHILDREN", "H3_TOPARENT", "H3_TRY_POLYFILLASH3",
            "CURRENT_DATE", "CURRENT_METASTORE", "CURRENT_SCHEMA", "CURRENT_TIMESTAMP", "CURRENT_TIMEZONE", "CURRENT_USER",
            "FORALL", "FORMAT_NUMBER", "FORMAT_STRING", "FROM_CSV", "FROM_JSON", "FROM_UNIXTIME", "FROM_UTC_TIMESTAMP", "GET",
 * Licensed under the Apache License, Version 2.0 (the "License");
            case SQLConstants.DATA_TYPE_INT:
 * DBeaver - Universal Database Manager
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
                return null;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    private static final String[] SPARK_FUNCTIONS =
            "IFNULL", "IN", "INITCAP", "INLINE", "INLINE_OUTER", "INPUT_FILE_BLOCK_LENGTH", "INPUT_FILE_BLOCK_START", "INPUT_FILE_NAME",
            "H3_BOUNDARYASWKT", "H3_CENTERASGEOJSON", "H3_CENTERASWKB", "H3_CENTERASWKT", "H3_COMPACT", "H3_DISTANCE", "H3_H3TOSTRING",
        addFunctions(Arrays.asList(SPARK_FUNCTIONS));
 * distributed under the License is distributed on an "AS IS" BASIS,
        super.initDriverSettings(session, dataSource, metaData);
            "TIMESTAMP_SECONDS", "TIMESTAMPADD", "TIMESTAMPDIFF", "TINYINT", "TO_BINARY", "TO_CHAR", "TO_CSV", "TO_DATE", "TO_JSON",
package org.jkiss.dbeaver.ext.databricks;
 * limitations under the License.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;

 *
        @NotNull DBPDataKind dataKind
            "GET_JSON_OBJECT", "GETBIT", "GREATEST", "GROUPING", "GROUPING_ID", "H3_BOUNDARYASGEOJSON", "H3_BOUNDARYASWKB",
            "EXPLODE_OUTER", "EXPM1", "EXTRACT", "FACTORIAL", "FILTER", "FIND_IN_SET", "FIRST", "FIRST_VALUE", "FLATTEN", "FLOAT", "FLOOR",
            "RPAD", "RTRIM", "SCHEMA_OF_CSV", "SCHEMA_OF_JSON", "SEC", "SECOND", "SECRET", "SENTENCES", "SEQUENCE", "SHA", "SHA1", "SHA2",

    public char getStringEscapeCharacter() {
            "RANDN", "RANDOM", "RANGE", "RANK", "REDUCE", "REFLECT", "REGEXP_COUNT", "REGEXP_EXTRACT", "REGEXP_EXTRACT_ALL", "REGEXP_INSTR",
            "LEVENSHTEIN", "LIST_SECRETS", "LN", "LOCATE", "LOG", "LOG10", "LOG1P", "LOG2", "LOWER", "LPAD", "LTRIM", "MAKE_DATE",
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
            "REGR_SLOPE", "REGR_SXX", "REGR_SXY", "REGR_SYY", "REPEAT", "REPLACE", "REVERSE", "RIGHT", "RINT", "ROUND", "ROW_NUMBER",

            "H3_HEXRING", "H3_ISCHILDOF", "H3_ISPENTAGON", "H3_ISVALID", "H3_KRING", "H3_KRINGDISTANCES", "H3_LONGLATASH3",
            "INSTR", "INT", "IS_MEMBER", "ISNAN", "ISNOTNULL", "ISNULL", "JAVA_METHOD", "JSON_ARRAY_LENGTH", "JSON_OBJECT_KEYS",
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
        super("SparkSQL", "spark");
    public boolean supportsAliasInSelect() {
    ) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
            "JSON_TUPLE", "KURTOSIS", "LAG", "LAST", "LAST_DAY", "LAST_VALUE", "LCASE", "LEAD", "LEAST", "LEFT", "LEN", "LENGTH",
            "CURRENT_VERSION", "DATE", "DATE_ADD", "DATE_FORMAT", "DATE_FROM_UNIX_DATE", "DATE_PART", "DATE_SUB", "DATE_TRUNC", "DATEADD",
import java.util.Arrays;

            "TRANSLATE", "TRIM", "TRUNC", "TRY_ADD", "TRY_AVG", "TRY_CAST", "TRY_DIVIDE", "TRY_ELEMENT_AT", "TRY_MULTIPLY", "TRY_SUBTRACT",

    @Override
 *
    }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
            "H3_LONGLATASH3STRING", "H3_MAXCHILD", "H3_MINCHILD", "H3_POINTASH3", "H3_POINTASH3STRING", "H3_POLYFILLASH3",
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;

            "TRY_SUM", "TRY_TO_BINARY", "TRY_TO_NUMBER", "TRY_TO_TIMESTAMP", "TYPEOF", "UCASE", "UNBASE64", "UNHEX", "UNIX_DATE",
            "UNIX_MICROS", "UNIX_MILLIS", "UNIX_SECONDS", "UNIX_TIMESTAMP", "UPPER", "URL_DECODE", "URL_ENCODE", "UUID", "VAR_POP",
        @NotNull DBPDataSource dataSource,
            "SHIFTLEFT", "SHIFTRIGHT", "SHIFTRIGHTUNSIGNED", "SHUFFLE", "SIGN", "SIGNUM", "SIN", "SINH", "SIZE", "SKEWNESS", "SLICE",
}
        return SQLUtils.isLatinLetter(c) || c == '_';
            case SQLConstants.DATA_TYPE_STRING:
            "REGEXP_LIKE", "REGEXP_REPLACE", "REGEXP_SUBSTR", "REGR_AVGX", "REGR_AVGY", "REGR_COUNT", "REGR_INTERCEPT", "REGR_R2",
            "ZIP_WITH"};
    @Override

    public String getColumnTypeModifiers(
    private static final String[] SPARK_EXTRA_KEYWORDS = {"SHOW"};
import org.jkiss.dbeaver.model.sql.SQLConstants;

    public boolean validIdentifierStart(char c) {
    }
            "COVAR_POP", "COVAR_SAMP", "CRC32", "CSC", "CUBE", "CUME_DIST", "CURDATE", "CURRENT_CATALOG", "CURRENT_DATABASE",
import org.jkiss.dbeaver.model.DBPDataKind;
import org.jkiss.code.NotNull;
/*
            case SQLConstants.DATA_TYPE_FLOAT:
        return false;
     * Initialize driver settings properly
            "MAP_ENTRIES", "MAP_FILTER", "MAP_FROM_ARRAYS", "MAP_FROM_ENTRIES", "MAP_KEYS", "MAP_VALUES", "MAP_ZIP_WITH", "MAX", "MAX_BY",
    @Override
            "SMALLINT", "SOME", "SORT_ARRAY", "SOUNDEX", "SPACE", "SPARK_PARTITION_ID", "SPLIT", "SPLIT_PART", "SQRT", "STACK",
        return super.getColumnTypeModifiers(dataSource, column, typeName, dataKind);
            "ARRAY_SIZE", "ARRAY_SORT", "ARRAY_UNION", "ARRAYS_OVERLAP", "ARRAYS_ZIP", "ASCII", "ASIN", "ASINH", "ASSERT_TRUE", "ATAN",
            "TO_NUMBER", "TO_TIMESTAMP", "TO_UNIX_TIMESTAMP", "TO_UTC_TIMESTAMP", "TRANSFORM", "TRANSFORM_KEYS", "TRANSFORM_VALUES",
            "DENSE_RANK", "DOUBLE", "E", "ELEMENT_AT", "ELT", "ENCODE", "ENDSWITH", "EQUAL_NULL", "EVERY", "EXISTS", "EXP", "EXPLODE",
        return SQLUtils.isLatinLetter(c) || Character.isDigit(c) || c == '_' || (quoted && validCharacters.indexOf(c) != -1);
        @NotNull String typeName,
        return true;
            "POSEXPLODE", "POSEXPLODE_OUTER", "POSITION", "POSITIVE", "POW", "POWER", "PRINTF", "QUARTER", "RADIANS", "RAISE_ERROR", "RAND",

            "SUBSTRING_INDEX", "SUM", "TABLE_CHANGES", "TAN", "TANH", "TIMESTAMP", "TIMESTAMP_MICROS", "TIMESTAMP_MILLIS",
    public String[][] getIdentifierQuoteStrings() {
     */
            "OVERLAY", "PARSE_URL", "PERCENT_RANK", "PERCENTILE", "PERCENTILE_APPROX", "PERCENTILE_CONT", "PERCENTILE_DISC", "PI", "PMOD",
 */

            "ATAN2", "ATANH", "AVG", "BASE64", "BETWEEN", "BIGINT", "BIN", "BINARY", "BIT_AND", "BIT_COUNT", "BIT_GET", "BIT_LENGTH",
    //see https://docs.databricks.com/sql/language-manual/sql-ref-functions-builtin-alpha.html
