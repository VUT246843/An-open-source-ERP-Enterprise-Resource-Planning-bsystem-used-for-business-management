
        addKeywords(Arrays.asList(SNOWFLAKE_KEYWORDS), DBPKeywordType.KEYWORD);
        "ZEROIFNULL"
            case SnowflakeConstants.TYPE_NUMBER:
 * Licensed under the Apache License, Version 2.0 (the "License");
        "SIGN",
        "SYSDATE"
        "SINH",
        "VAR_SAMP",
                if (precision == 0 && dataType != null && scale != null && scale == dataType.getMinScale()) {
    }
        // * Contain only letters, underscores, decimal digits (0-9), and dollar signs (“$”).
        "COVAR_POP",
    };
                    dataSource.getPreferenceStore().getBoolean(SnowflakeConstants.PROP_DD_STRING) // backward compatibility
        "ABS",
        "LEAST",
        "ENDSWITH",
        "CUME_DIST",
        "PERCENTILE_DISC",
        "REGR_SYY",
                "LATERAL"
        "KURTOSIS",
        "STDDEV_SAMP",
                new SQLMultiWordRule(new String[]{"IF", "NOT", "EXISTS"}, keywordToken)
        }
        "ACOS",
    @Override
        "CURRENT_VERSION",
        @NotNull DBPDataSource dataSource,
                    false,
        "ST_DIMENSION",
        "TRANSLATE",
        "APPROX_COUNT_DISTINCT",
        "MEDIAN",
                break;
                    false,
        "ARRAY_POSITION",
    };
                "PACKAGE",
import org.jkiss.dbeaver.model.sql.SQLConstants;

            return new TPRule[]{

        "COT",
        "TANH",
        return true;
                "TAG",
        "RANDOM",

    }
        "NTILE",
        "CURRENT_DATE",
        "REGR_SLOPE",
    }
        "FLOOR",
        "TIMEDIFF",
        "ATAN2",
    };
    public String getColumnTypeModifiers(
        return super.mustBeQuoted(str, forceCaseSensitive);
    };
                "ILIKE",
            ));
    };
            case SnowflakeConstants.TYPE_DOUBLE_PRECISION:

 * you may not use this file except in compliance with the License.
            case SQLConstants.DATA_TYPE_BIGINT:
        "ARRAY_MIN",
        {"IF", SQLConstants.BLOCK_END}
}
    private static final String[] SNOWFLAKE_BITWISE_FUNCTIONS = new String[] {
            return true;
        "INITCAP",
    
        "DENSE_RANK",
        "TO_JSON"
    private static final String[] SNOWFLAKE_DATE_AND_TIME_FUNCTIONS = new String[] {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
import java.util.Arrays;
        "REGEXP_REPLACE",
    @Override
                }
 * limitations under the License.
    public MultiValueInsertMode getDefaultMultiValueInsertMode() {
        "TYPEOF"
        "REGR_R2",
        "ASCII",
    @Override
        "ST_DISTANCE",
        "NULLIF",
    private static final String[] SNOWFLAKE_CONDITIONAL_FUNCTIONS = new String[] {
        super("Snowflake", "snowflake");
        "DATEDIFF",
        "AVG",
        "BIT_LENGTH",
/*
import org.jkiss.dbeaver.ext.snowflake.SnowflakeConstants;
        "COS",
        "RATIO_TO_REPORT",
        "CONCAT_WS",
        "WIDTH_BUCKET"
                "PIPE",
        "FIRST_VALUE",
        }
        "BITAND",
    
        "ADD_MONTHS",
    };
    private static final String[] SNOWFLAKE_NUMERIC_FUNCTIONS = new String[] {
        // * Are stored and resolved as uppercase characters (e.g. id is stored and resolved as ID).
        "ATAN",
        addFunctions(Arrays.asList(SNOWFLAKE_BITWISE_FUNCTIONS));
                    return "";
        }
    
        "PERCENT_RANK",
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
        "FLATTEN",
 *
        "MIN",
package org.jkiss.dbeaver.ext.snowflake.model;
        "LEFT",
        "NTH_VALUE",
import org.jkiss.utils.CommonUtils;
    }
                )
        "ARRAY_MAX",
        "COSH",
        "COUNT",
    };
        addSQLKeywords(
        "ST_SYMDIFFERENCE",
    ) {
        "COALESCE",
        "CURRENT_TIME",
        "TIMESTAMPADD",

        "IFF",
        addFunctions(Arrays.asList(SNOWFLAKE_STRING_AND_BINARY_FUNCTIONS));
            case SnowflakeConstants.TYPE_NUMERIC:
        "RPAD",
    public boolean mustBeQuoted(@NotNull String str, boolean forceCaseSensitive) {
                }
        return super.getColumnTypeModifiers(dataSource, column, typeName, dataKind);
    private static final String[] SNOWFLAKE_AGGREGATE_AND_WINDOW_FUNCTIONS = new String[] {

 * Copyright (C) 2010-2025 DBeaver Corp and others
        "ST_X",
                );
        "TO_BOOLEAN",
                scale = column.getScale();
    public String getSearchStringEscape() {
        "CURRENT_DATABASE",
import org.jkiss.dbeaver.model.text.parser.TPRuleProvider;
        "VAR_POP",
        "TAN",
        "BITOR",
    }
        "ASINH",
    // Referenced & Categorized from https://docs.snowflake.com/en/sql-reference/functions-all 
        "MOD",
        addFunctions(Arrays.asList(SNOWFLAKE_OTHER_FUNCTIONS));
    };
        // Without escaping of wildcards Snowflake reads all metadata directly from database and ignores specified objects names
            };
        "REGR_AVGY",
        return SNOWFLAKE_BEGIN_END_BLOCK;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            final TPTokenDefault keywordToken = new TPTokenDefault(SQLTokenType.T_KEYWORD);
    private static final String[] SNOWFLAKE_STRUCTURED_DATA_FUNCTIONS = new String[] {
    private static final String[] SNOWFLAKE_GEOSPATIAL_FUNCTIONS = new String[] {


                new SQLDollarQuoteRule(
    @NotNull
        "RANK",
import org.jkiss.dbeaver.model.*;

        "EQUAL_NULL",
 * See the License for the specific language governing permissions and
        "BITNOT",
        "RIGHT",
        "ST_BUFFER",
        "DATEADD",
        "RTRIM",
        "UNICODE",
        "DAYNAME",

        "GROUPING_ID",
        "TRUNC"

        addFunctions(Arrays.asList(SNOWFLAKE_DATE_AND_TIME_FUNCTIONS));
        "MAX_BY",
        "RLIKE"
                if (scale != null || precision > 0) {
        "ST_STARTPOINT",
        "ST_DISJOINT",

        "ARRAY_SIZE",
    }

    @Override
                DBSDataType dataType = DBUtils.getDataType(column);
        "ST_CENTROID",
    @Override
        "LN",
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
        // https://docs.snowflake.com/en/sql-reference/identifiers-syntax
        return new TPRule[0];
        if (str.isBlank()) {
        "ROW_NUMBER"
        "ST_DIFFERENCE",
            case SnowflakeConstants.TYPE_REAL:
        "ASIN",
        addFunctions(Arrays.asList(SNOWFLAKE_CONTEXT_FUNCTIONS));
import org.jkiss.dbeaver.model.sql.SQLUtils;
        "COMPRESS",
        "DATE_TRUNC",
        "REVERSE",
                CommonUtils.getBoolean(

        
    };
                new SQLMultiWordRule(new String[]{"BEGIN", "TRANSACTION"}, keywordToken),
        addFunctions(Arrays.asList(SNOWFLAKE_AGGREGATE_AND_WINDOW_FUNCTIONS));
        "MODE",
        "ARRAY_EXCEPT",
    
    public boolean validIdentifierStart(char c) {
    @NotNull
        "REGEXP_SUBSTR",
        "BASE64_ENCODE",
        "ST_SETSRID",
        addFunctions(Arrays.asList(SNOWFLAKE_GEOSPATIAL_FUNCTIONS));
        "MAX",
        // * Start with a letter (A-Z, a-z) or an underscore (“_”).
    @Override
        "SPACE",
        "CONTAINS",

                // These types do not have parameters
 * DBeaver - Universal Database Manager
public class SnowflakeSQLDialect extends GenericSQLDialect implements TPRuleProvider {
        return "\\";
    @NotNull
        "MONTHS_BETWEEN",
    private static final String[] SNOWFLAKE_STRING_AND_BINARY_FUNCTIONS = new String[] {
        "HASH",
                return null;
        return SQLUtils.isLatinLetter(c) || c == '_';
        "EXP",
 *
        removeSQLKeyword("VIEWS");
        "SPLIT",
        if (position == RulePosition.KEYWORDS) {

        super.initDriverSettings(session, dataSource, metaData);
        "SOUNDEX",
    }
    public SnowflakeSQLDialect() {
        return MultiValueInsertMode.GROUP_ROWS;
        "ATANH",
    }
        addFunctions(Arrays.asList(SNOWFLAKE_CONVERSION_FUNCTIONS));
    };
                "TASK",
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
        {SQLConstants.BLOCK_BEGIN, SQLConstants.BLOCK_END},
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
        "ACOSH",
        "GREATEST",
        "TRY_TO_BINARY"
        "CEIL",
    private static final String[][] SNOWFLAKE_BEGIN_END_BLOCK = new String[][]{
            Arrays.asList(
        "LPAD",
            boolean useDollarQuoteRule = dataSource == null ||
import org.jkiss.code.Nullable;
        "ENCRYPT",
    public TPRule[] extendRules(@Nullable DBPDataSourceContainer dataSource, @NotNull RulePosition position) {
        "STDDEV_POP",
                if (precision == 0 || precision > SnowflakeConstants.NUMERIC_MAX_PRECISION) {
        "REGR_SXY",
    public boolean supportsAliasInSelect() {
        "ST_Y"
                }
                int precision = CommonUtils.toInt(column.getPrecision());
        "DEGREES",
        addFunctions(Arrays.asList(SNOWFLAKE_STRUCTURED_DATA_FUNCTIONS));
        "NVL2",
        "SHOW",
        @NotNull String typeName,
        "ARRAYS_OVERLAP",
            case SnowflakeConstants.TYPE_DECIMAL:
        "SUM",
        "ST_TRANSFORM",
        "LAST_DAY",
        "ST_ENVELOPE",
        "REGEXP_INSTR",
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        "ARRAY_SORT",
        "TRUNCATE"
    };
        return SQLUtils.isLatinLetter(c) || Character.isDigit(c) || c == '_' || (quoted && validCharacters.indexOf(c) != -1) || c == '$';
                    // 38 - is default precision value. And we can not add scale here.
        "LEAD",
    @Override
        addFunctions(Arrays.asList(SNOWFLAKE_CONDITIONAL_FUNCTIONS));
            case SQLConstants.DATA_TYPE_DOUBLE:
        "BITXOR",
        "SPLIT_PART",
 * Unless required by applicable law or agreed to in writing, software
        "ARRAY_DISTINCT",
        "CURRENT_SCHEMA",
                "STAGE",
        "CORR",
import org.jkiss.dbeaver.model.sql.parser.rules.SQLMultiWordRule;

        "TO_BINARY",
import org.jkiss.dbeaver.model.struct.DBSDataType;
        "ST_UNION",

            case SQLConstants.DATA_TYPE_INT:
import org.jkiss.dbeaver.model.sql.parser.rules.SQLDollarQuoteRule;
    };
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        "ARRAY_CONTAINS",
        "MONTHNAME",

            return new TPRule[] {
        "CURRENT_USER",
    private static final String[] SNOWFLAKE_KEYWORDS = new String[] {
        if (position == RulePosition.INITIAL || position == RulePosition.PARTITION) {

import org.jkiss.dbeaver.model.text.parser.TPRule;
        @NotNull DBPDataKind dataKind
        "UPPER",
 */
        "MAP_CONTAINS_KEY",
 * You may obtain a copy of the License at
        "ANY_VALUE",
    public String[][] getBlockBoundStrings() {
    };
        "ST_CONTAINS",
        "LOG",
                new SQLMultiWordRule(new String[]{"IF", "EXISTS"}, keywordToken),
            case SnowflakeConstants.TYPE_INTEGER:
        "CURRENT_TIMESTAMP",
        "GROUPING",
        "CHARINDEX",
        "ST_ENDPOINT",
        "COVAR_SAMP",
    private static final String[] SNOWFLAKE_OTHER_FUNCTIONS = new String[] {
        "INSERT",
        "TRY_CAST",
    @Override
    }
        "MAP_KEYS",
        "SIN",
                    dataSource.getConnectionConfiguration().getProviderProperty(SnowflakeConstants.PROP_DD_STRING),
        "ARRAY_REMOVE",
        "ST_POINTN",
        "EXTRACT",
        "NVL",
        "STARTSWITH",
        "IFNULL",
 *

    public String[] getSingleLineComments() {
        "ST_LENGTH",
        // #9875
        "DECODE",
import org.jkiss.dbeaver.model.text.parser.TPTokenDefault;
        "APPROX_PERCENTILE",
    }
        "REGR_AVGX",
                "QUALIFY",
                    // It will be changed to 0 automatically after table creation from the database side.

        "REGR_COUNT",
        "CBRT",
        "REGR_INTERCEPT",
        "PERCENTILE_CONT",
        @NotNull DBSTypedObject column,
        "PI",
    @Override
        "STDDEV",
        switch (typeName) {
        "LAST_VALUE",
    }
        return true;
                        (scale != null && scale > 0 ? "," + scale : "") +  ")";
        "DATE_PART",
        "REPLACE",
        "REGEXP",
        "MIN_BY",
        "NEXT_DAY",
    public boolean validIdentifierPart(char c, boolean quoted) {
        // Unquoted object identifiers:
        "ROUND",
        "TIMESTAMPDIFF",
        "LAG",
        "ARRAY_AGG",
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        "LOWER",
            };
        "COUNT_IF",
                "STREAM",
        "GETBIT"
   
        addFunctions(Arrays.asList(SNOWFLAKE_NUMERIC_FUNCTIONS));
        "REGEXP_LIKE",
        }
        "OCTET_LENGTH",
    @Override
        "TRIM",
        "GET",
    @Override
                    useDollarQuoteRule
        "TO_DOUBLE",
        "HEX_ENCODE",
    
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isEscapeBackslash() {
    private static final String[] SNOWFLAKE_CONVERSION_FUNCTIONS = new String[] {
        "REGR_SXX",
        "SQRT",
        "GRANTS",
    
        "POSITION",
        "COLLATION",
        "LTRIM",
                    return "(" + (precision > 0 ? precision : SnowflakeConstants.NUMERIC_MAX_PRECISION) +
        "FACTORIAL",
        "REPEAT",
        "NULLIFZERO",
        "APPROX_TOP_K",
        "IS_BOOLEAN",
    private static final String[] SNOWFLAKE_CONTEXT_FUNCTIONS = new String[] {
        "REGEXP_COUNT",
        return new String[]{SQLConstants.SL_COMMENT, "//"};
        "ST_WITHIN",
                    position == RulePosition.PARTITION,

        Integer scale;
        "LISTAGG",
                    precision = SnowflakeConstants.NUMERIC_MAX_PRECISION;
        "RADIANS",

            case SQLConstants.DATA_TYPE_FLOAT:
import org.jkiss.code.NotNull;
        "PARSE_URL",
