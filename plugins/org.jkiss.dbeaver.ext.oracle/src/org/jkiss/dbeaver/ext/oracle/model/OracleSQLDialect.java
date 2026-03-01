                "EXTRACT",
                return null;
                    && sourceTypedObject.getMaxLength() != Integer.MAX_VALUE
        return cachedDialectSkipTokenPredicates == null ? super.getSkipTokenPredicates() : cachedDialectSkipTokenPredicates;
    @Nullable
                "NLS_CHARSET_DECL_LEN",
        "AFTER",
    }
        "LOOP",
        return false;
import org.jkiss.dbeaver.model.*;

        {SQLConstants.BLOCK_BEGIN, SQLConstants.BLOCK_END},
        return EnumSet.of(
                "LISTAGG",
                "TO_SINGLE_BYTE",
 * distributed under the License is distributed on an "AS IS" BASIS,
        return ORACLE_NON_TRANSACTIONAL_KEYWORDS;
                "XMLAGG",
                "REMAINDER",
    public boolean supportsAliasInUpdate() {
        return OracleConstants.OPERATION_MODIFY;
    }
                SQLParserActionKind.BLOCK_HEADER,
                }
                return "(" + scale + ")";
                "NUMTODSINTERVAL",
        if (dataSource.isServerVersionAtLeast(12, 1)) {
                "LAST_DAY",
}
                "ADD_MONTHS",
    public String getCreateSchemaQuery(@NotNull String schemaName) {
        }
        return false;

                "FIRST_VALUE",
                tt.sequence("END", ";")
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        return true;

                "NLS_UPPER",
 * Oracle SQL dialect
                "TANH",
                //Object Reference Functions:
    public String getTextDataType() {

    public boolean isCRLFBroken() {
        setUnquotedIdentCase(DBPIdentifierCase.UPPER);
    }
                //General Comparison Functions:
                    return "";
                "COMPOSE",
    private static final String[] ORACLE_NON_TRANSACTIONAL_KEYWORDS = ArrayUtils.concatArrays(


            case "VARCHAR":
    @NotNull
                "TO_BINARY_FLOAT",
    }
    @Override
    }
    @Override
        String localDataType = null, dataTypeModifies = null;
                //Collection Functions:
            return (left, right) -> "UPPER(" + left + ") LIKE UPPER(" + right + ")";
                if (sourceTypedObject.getMaxLength() > 0

        "STRUCTURE",
import java.util.EnumSet;
                "XMLCOMMENT",
                "TO_NUMBER",
import org.jkiss.dbeaver.model.sql.parser.SQLTokenPredicateSet;
    public String escapeScriptValue(DBSTypedObject attribute, @NotNull Object value, @NotNull String strValue) {
    }
    }
                "LAST_VALUE",
        "EACH",
        "DATABASE",

                    tt.sequence(SQLTokenType.T_OTHER, SQLTokenType.T_TYPE)
import org.jkiss.dbeaver.model.struct.DBSDataType;
        "REPLACE",
        super.loadDataTypesFromDatabase(dataSource);
            case OracleConstants.TYPE_LONG_RAW:

            // not fully described, only some cases partially discovered

        new GlobalVariableInfo("UID", OracleMessages.global_variable_uid, DBPDataKind.NUMERIC),
                "LAST",
        TokenPredicateFactory tt = TokenPredicateFactory.makeDialectSpecificFactory(ruleManager);
    }
    }
        new GlobalVariableInfo("CURRENT_DATE", OracleMessages.global_variable_current_date, DBPDataKind.DATETIME),
    }
        // Oracle SQL references could be found from https://docs.oracle.com/en/database/oracle/oracle-database/
    private static final String[] ORACLE_INNER_BLOCK_PREFIXES = new String[]{
                "DECODE",
    public String[] getBlockHeaderStrings() {
            new TokenPredicatesCondition(
        new GlobalVariableInfo("SYSDATE", OracleMessages.global_variable_sysdate, DBPDataKind.DATETIME),
                "RAWTOHEX",
                "PREDICTION",

                scale = column.getScale();
        );
        return EXEC_KEYWORDS;
    }
    private boolean crlfBroken;
                    tt.sequence("RETURN", SQLTokenType.T_TYPE),

                tt.sequence(tt.not("END"), "IF", tt.not("EXISTS"))
                SQLParserActionKind.SKIP_SUFFIX_TERM,
                "NVL",
import java.util.Arrays;
    @Override
    public MultiValueInsertMode getDefaultMultiValueInsertMode() {
            return SQLConstants.KEYWORD_SELECT + " " + proc.getFullyQualifiedName(DBPEvaluationContext.DML);
                "XMLSERIALIZE",
                break;
    public boolean supportsAlterColumnSet() {
    };
    @NotNull
    @Override
        }
                SQLParserActionKind.BEGIN_BLOCK,
    }
                "RANK"

 *

                "SYS_TYPEID",
        super.initDriverSettings(session, dataSource, metaData);
        return false;
                "PREVIOUS",
                // Additions from #323
import java.util.Locale;
            ),
        "COMPUTE",
                        tt.optional(tt.alternative("EDITIONABLE", "NONEDITIONABLE")),
    };
                "SYS_GUID",
                "TO_LOB",
        new GlobalVariableInfo("ORA_INVOKING_USERID", OracleMessages.global_variable_ora_invoking_userid, DBPDataKind.NUMERIC),
                return targetTypeName;
            )
                "XMLTRANSFORM",
                "TO_MULTI_BYTE",
        "STATISTICS",
                SQLParserActionKind.BEGIN_BLOCK,
import org.jkiss.dbeaver.ext.oracle.data.OracleBinaryFormatter;
    }
    @Override

            return '\'' + String.valueOf(value) + '\'';

    private static final String[] EXEC_KEYWORDS = new String[]{"call"};
        "EXIT",
                "XMLCDATA",
                //Aggregate Functions:
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    public boolean needsDefaultDataTypes() {
                "SYS_EXTRACT_UTC",
            Arrays.asList(

    }
            }
    }
        if (localDataType == null) {
                    && sourceTypedObject.getMaxLength() != Long.MAX_VALUE) {
        return OracleConstants.TYPE_CLOB;
 * you may not use this file except in compliance with the License.
                "XMLCONCAT",
        return false;
        crlfBroken = !dataSource.isServerVersionAtLeast(11, 0);
                "STATS_ONE_WAY_ANOVA",
                "DUMP",

    }
        "TRIGGER",
    }
    @NotNull
import org.jkiss.dbeaver.model.sql.*;
    private static final Log log = Log.getLog(OracleSQLDialect.class);
    private SQLTokenPredicateSet cachedDialectSkipTokenPredicates = null;
                DBSDataType dataType = targetTypeProvider.resolveDataType(new VoidProgressMonitor(), localDataType);
                if (precision == 0 && dataType != null && scale != null && scale == dataType.getMinScale()) {
                "STATS_T_TEST_ONE",
    @Override
                SQLParserActionKind.SKIP_SUFFIX_TERM,
    @Override
        addDataTypes(OracleDataType.PREDEFINED_TYPES.keySet());
                "PATH",
                localDataType = OracleConstants.TYPE_NAME_VARCHAR2;
                if (dataType == null) {
                "CORR_S",
                    scale = OracleConstants.INTERVAL_DEFAULT_SECONDS_PRECISION;
    public SQLTokenPredicateSet getSkipTokenPredicates() {
        "LATERAL"
                    targetTypeName += "(" + dataTypeModifies + ")";
    public boolean supportsAliasInSelect() {
                "FEATURE_ID",
                "STATS_F_TEST",
                "SUBSTR", "APPROX_COUNT_DISTINCT",
        return " ESCAPE " + getQuotedString(escapeChar);
    public boolean isDelimiterAfterBlock() {
                    "PACKAGE", "BODY"
    public String getNClobDataType() {
                        tt.optional("OR", "REPLACE"),
        }
                    if (sourceTypedObject.getScale() != null) {
    }
    }
            case "XML":
        return preferenceStore == null || preferenceStore.getBoolean(OracleConstants.PREF_DISABLE_SCRIPT_ESCAPE_PROCESSING);
        if (targetTypeProvider != null) {
                }
                String targetTypeName = DBUtils.getObjectFullName(dataType, DBPEvaluationContext.DDL);
                    }
    protected void loadDataTypesFromDatabase(JDBCDataSource dataSource) {
        }
            // https://docs.oracle.com/cd/B19306_01/server.102/b14200/functions090.htm
            new TokenPredicatesCondition(
                "TO_TIMESTAMP",
    public String getLikeEscapeClause(@NotNull String escapeChar) {
        syntaxManager.init(this, dataSource.getContainer().getPreferenceStore());
import org.jkiss.code.NotNull;
        return false;
        TokenPredicateSet conditions = TokenPredicateSet.of(
                tt.sequence(
    @NotNull
    }
                    tt.optional(tt.alternative("EDITIONABLE", "NONEDITIONABLE")),
    }
    public SQLExpressionFormatter getCaseInsensitiveExpressionFormatter(@NotNull DBCLogicalOperator operator) {
    private static final String[] ORACLE_BLOCK_HEADERS = new String[]{
                "TO_DSINTERVAL",
        new GlobalVariableInfo("CURRENT_TIMESTAMP", OracleMessages.global_variable_current_timestamp, DBPDataKind.DATETIME),
                "STATS_T_TEST_INDEP",
    @Override
    public String getOffsetLimitQueryPart(int offset, int limit) {
        "RETURN",
        return false;
                "CLUSTER_ID",
            try {
    protected TokenPredicateSet makeDialectSkipTokenPredicatesImpl(JDBCDataSource dataSource, TokenPredicateFactory tt) {
            return null;
                "XMLPARSE",
                "INSTR",


    public GlobalVariableInfo[] getGlobalVariables() {
                "TO_YMINTERVAL",
    public String getTimestampDataType() {
        return ORACLE_BLOCK_HEADERS;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        "VALIDATE",
            new TokenPredicatesCondition(
    @Override
    private static final String[][] ORACLE_BEGIN_END_BLOCK = new String[][]{
            conditions.add(new TokenPredicatesCondition(
    @Override
    @Override
 *
            addSQLKeyword(kw);
import org.jkiss.dbeaver.model.data.DBDBinaryFormatter;
                "STDDEV",
    public String[] getScriptDelimiters() {
        String externalTypeName = sourceTypedObject.getTypeName().toUpperCase(Locale.ENGLISH);
    @Override
                "TIMESTAMP_TO_SCN",


    public boolean supportsAliasInConditions() {
    @Override
                "LNNVL",
    @Override

import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
        return this.makeDialectSkipTokenPredicatesImpl(dataSource, tt);
    public String[] getInnerBlockPrefixes() {
            "ANALYZE", "VALIDATE",
                //NULL-Related Functions:
                // This interval type has fractional seconds precision. In bounds from 0 to 9. We can show this parameter.
                "INSTRC",
    @Override
            case "XMLTYPE":
    protected String getStoredProcedureCallInitialClause(DBSProcedure proc) {

import org.jkiss.dbeaver.model.sql.parser.tokens.predicates.TokenPredicatesCondition;

    }

 *
    }

                }

    @Override
                "REVERSE",


                if (precision == 0 || precision > OracleConstants.NUMERIC_MAX_PRECISION) {
    }
                "CHARTOROWID",
    private static final GlobalVariableInfo[] GLOBAL_VARIABLES = {
                tt.sequence(
        }
                    tt.sequence("procedure", SQLTokenType.T_OTHER),
        return true;
                //XML Functions:

            new TokenPredicatesCondition(

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getColumnTypeModifiers(@NotNull DBPDataSource dataSource, @NotNull DBSTypedObject column, @NotNull String typeName, @NotNull DBPDataKind dataKind) {

        "PACKAGE"
                localDataType = "JSON";
                    tt.optional("OR", "REPLACE"),
                break;
                "NUMTODSINTERVAL",
        return String.format("OFFSET %d ROWS FETCH NEXT %d ROWS ONLY", offset, limit);
                }
                "RATIO_TO_REPORT",
        return ORACLE_INNER_BLOCK_PREFIXES;
                "STATS_T_TEST_INDEPU",
    @Override
                "MAKE_REF",
                    dataTypeModifies = String.valueOf(sourceTypedObject.getMaxLength());
                "SUBSTRB",
    };
                "RPAD",
                "EMPTY_CLOB",
        }
                "SINH",
    }
            "CREATE", "ALTER", "DROP",
 * limitations under the License.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCSQLDialect;
        }
                "INSERTCHILDXML",
                "NEW_TIME",
            return "FROM DUAL";

                    "deterministor", "pipelined", "parallel_enable", "result_cache",
    public boolean supportsCreateIfExists() {
                "NLSSORT",
                "XMLPI",
                ), ";")
                "XMLROOT",
        "TABLESPACE",
                break;
                log.debug("Error resolving local data type", e);
                if (scale != null || precision > 0) {
                if (scale == null) {
import org.jkiss.dbeaver.DBException;
                //Analytic Functions:
                "EXTRACTVALUE",
                // Other #4134
    @NotNull
    }
                "TO_CLOB",

    @NotNull
                "NUMTOYMINTERVAL",
    @Override
                // Don't add modifiers to these types

    @Override
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
                "STATS_BINOMIAL_TEST",
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;
            case OracleConstants.TYPE_NAME_BFILE:
                "INSTR4",
                "USERENV",
        new GlobalVariableInfo("ORA_INVOKING_USER", OracleMessages.global_variable_ora_invoking_user, DBPDataKind.STRING),
                    "CREATE",
        return localDataType;
                //Character Functions Returning Number VALUES:
                "STATS_T_TEST_PAIRED",
 * DBeaver - Universal Database Manager
        }
            // but missing in https://docs.oracle.com/cd/E11882_01/server.112/e41084/statements_10002.htm
                localDataType = OracleConstants.TYPE_FQ_GEOMETRY;
                scale = column.getScale();
    @Override
                }
        return OracleConstants.TYPE_NAME_TIMESTAMP;
        "ANALYZE",
                        dataTypeModifies += "," + sourceTypedObject.getScale();
                if (scale < 0 || scale > 9) {
                //Character Functions Returning Character Values:
    }
        {"LOOP", SQLConstants.BLOCK_END + " LOOP"},
                    // 38 - is default precision value. And we can not add scale here.

        if (CommonUtils.isNaN(value) || CommonUtils.isInfinite(value)) {
        return "CREATE USER " + schemaName + " IDENTIFIED BY \"" + SecurityUtils.generatePassword(10) + "\"";

    }

 * Unless required by applicable law or agreed to in writing, software

        }
                break;
                "UID",

    @Override
                "PREDICTION_COST",
                //Large Object Functions:
                //Conversion Functions:
    @NotNull
    @Override
        switch (externalTypeName) {
                "PREDICTION_SET",
                "XMLTABLE",
                "NANVL",
                "STATS_MODE",
                "SYS_XMLAGG",
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
    }
                tt.sequence(tt.alternative(
        new GlobalVariableInfo("USER", OracleMessages.global_variable_user, DBPDataKind.STRING),
                "EMPTY_BLOB",
    @Override
                "UPDATEXML",
                //Model Functions:
                return "";
                "TO_YMINTERVAL",
                "LAG",

 */
                    tt.alternative("FUNCTION", "PROCEDURE")
            case OracleConstants.TYPE_LONG:
                "STATS_MW_TEST",
    @NotNull
                "TO_CHAR",
    public String getSchemaExistQuery(@NotNull String schemaName) {

 *     http://www.apache.org/licenses/LICENSE-2.0

                "OVER",
package org.jkiss.dbeaver.ext.oracle.model;
            case "GEOMETRY":

                "SYS_DBURIGEN",
        removeSQLKeyword("SYSTEM");
        return OracleBinaryFormatter.INSTANCE;
    }
    public String getAlterColumnOperation() {
    @NotNull
        "BULK",
    public boolean supportsTableDropCascade() {
        return "DUAL";
                "EXISTSNODE",
                }
                "BITAND",
                //Data Mining Functions:
        return OracleConstants.TYPE_UUID;

    implements SQLDataTypeConverter, SQLDialectDDLExtension, SQLDialectSchemaController {
                ),
                //Hierarchical FUNCTION:
                    tt.optional(tt.alternative("EDITIONABLE", "NONEDITIONABLE")),
            case OracleConstants.TYPE_INTERVAL_YEAR_MONTH:

                //Environment and Identifier Functions:
    }
                "TZ_OFFSET",
    }
                // FIXME: This type has day precision inside type name. Like INTERVAL DAY(2) TO SECOND(6). So far we can't show it (But we do it in Column Manager)
                "NLS_LOWER",
                    return "";
                "NEXT_DAY",
            case OracleConstants.TYPE_NUMBER:
    public DBDBinaryFormatter getNativeBinaryFormatter() {

                "PREDICTION_DETAILS",
 * You may obtain a copy of the License at
    }
    }
import org.jkiss.dbeaver.model.sql.parser.tokens.predicates.TokenPredicateSet;
            ),
    @NotNull
            ));


                "PREDICTION_PROBABILITY",
                "FROM_TZ",
                "SYS_CONNECT_BY_PATH",
 * Copyright (C) 2010-2026 DBeaver Corp and others
                "SYS_CONTEXT",
                "FEATURE_VALUE",
                "INSTR2",
    };
                int precision = CommonUtils.toInt(column.getPrecision());
                "NLS_CHARSET_NAME",
        return false;
        );
    @NotNull

    @Override
    public String getClobDataType() {
                "FIRST",
                "DECOMPOSE",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                //We don't want to use a VARCHAR it's not recommended
                "TO_DSINTERVAL",
                tt.sequence(),
                        "CREATE",

                "INITCAP",

    @Override
                "STATS_KS_TEST",

                "POWERMULTISET_BY_CARDINALITY",

                //Encoding and Decoding Functions:

    public String[] getExecuteKeywords() {
                    "CREATE",
        return OracleConstants.TYPE_BOOLEAN;
            // https://docs.oracle.com/en/database/oracle/oracle-database/12.2/lnpls/CREATE-PACKAGE-BODY-statement.html#GUID-68526FF2-96A1-4F14-A10B-4DD3E1CD80BE
            case OracleConstants.TYPE_NAME_CFILE:
                "CLUSTER_SET",
        return true;
    }
                "BIN_TO_NUM",
    @Override
                "TO_DATE",
            case OracleConstants.TYPE_DECIMAL:
public class OracleSQLDialect extends JDBCSQLDialect
        switch (typeName) {
        preferenceStore = dataSource.getContainer().getPreferenceStore();
        "FUNCTION",
                "STDDEV",
                    precision = OracleConstants.NUMERIC_MAX_PRECISION;
import org.jkiss.utils.SecurityUtils;
            case "JSON":

import org.jkiss.dbeaver.Log;
                "HEXTORAW",
                "RAWTONHEX",
                "UNISTR",
            case OracleConstants.TYPE_CONTENT_POINTER:
        return crlfBroken;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    public boolean isDisableScriptEscapeProcessing() {
                "NLS_INITCAP",
        "ELSIF",
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;

    }
                "INSTRB",
                ),
    @Override
                }
 * See the License for the specific language governing permissions and
                //Number Functions:

                "TO_TIMESTAMP_TZ",


            // notation presented in https://docs.oracle.com/en/database/oracle/oracle-database/18/sqlrf/SELECT.html
                "LEAD",
/**
                "TO_TIMESTAMP_TZ",
                "TO_DSINTERVAL",
        return ORACLE_BEGIN_END_BLOCK;
            case OracleConstants.TYPE_INTERVAL_DAY_SECOND:

        return true;
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
    }
                "SCN_TO_TIMESTAMP",
                "MONTHS_BETWEEN",


            // for WITH procedures and functions prepending select clause introduced in 12.1
            // https://docs.oracle.com/en/database/oracle/oracle-database/21/sqlrf/CREATE-PROCEDURE.html#GUID-771879D8-BBFD-4D87-8A6C-290102142DA3
    public boolean hasCaseSensitiveFiltration() {
            return type;
                break;
    @Nullable
                "CORR_K",
            case "SDO_GEOMETRY":

                "XMLCOLATTVAL",
                "REGEXP_SUBSTR", "REGEXP_INSTR", "REGEXP_REPLACE", "REGEXP_LIKE", "REGEXP_COUNT",

                tt.sequence()
        "BODY",
        cachedDialectSkipTokenPredicates = this.makeDialectSkipTokenPredicates(dataSource);

                "NLS_CHARSET_ID",
    public String getDualTableName() {
    }
        "TEMPFILE",
                "SUBSTRC",
        new GlobalVariableInfo("SESSIONTIMEZONE", OracleMessages.global_variable_sessiontimezone, DBPDataKind.DATETIME),
        return false;
                "SUBSTR2",
            } catch (DBException e) {
    @Override
        if (type != null) {
    private static final String AUTO_INCREMENT_KEYWORD = "GENERATED ALWAYS AS IDENTITY";
    @Override
        return getClobDataType();
    @NotNull
        String type = super.convertExternalDataType(sourceDialect, sourceTypedObject, targetTypeProvider);


    @Override
        "PACKAGE",
    @Nullable
 */
                DBSDataType dataType = DBUtils.getDataType(column);
        return OracleConstants.TYPE_NAME_BLOB;

                "CHR",
    @Override
                "TO_BINARY_DOUBLE",
                "TRUNC",
import org.jkiss.utils.ArrayUtils;
    );
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
        return super.getProcedureCallEndClause(procedure);
        return super.escapeScriptValue(attribute, value, strValue);
                "FEATURE_SET",
                "TO_NCLOB",
    public EnumSet<ProjectionAliasVisibilityScope> getProjectionAliasVisibilityScope() {
                "ROWIDTOCHAR",
        return OracleConstants.TYPE_NCLOB;
                "REFTOHEX",
        new String[]{

    @Override
                "GROUP_ID",
    @NotNull

    @Override
    }
    }
                    // It will be changed to 0 automatically after table creation from the Oracle side.
        "RECORD",

    @Override

    }
    }
        "IS",
                localDataType = OracleConstants.TYPE_FQ_XML;
        new GlobalVariableInfo("SYSTIMESTAMP", OracleMessages.global_variable_systimestamp, DBPDataKind.DATETIME),
import org.jkiss.utils.CommonUtils;
                "NUMTOYMINTERVAL",
    private static final String[] ADVANCED_KEYWORDS = {
    @NotNull
        // by following through Get Started links till the SQL Language Reference link presented
    }

    public String getUuidDataType() {
    @Override
                "VARIANCE",
                if (sourceTypedObject.getPrecision() != null) {
    private DBPPreferenceStore preferenceStore;
        return super.getScriptDelimiters();
    @NotNull
    @Override
        return "DBMS_LOB.COMPARE(%s,?) = 0".formatted(columnName);
                "VARIANCE",
    @Override
        return "SELECT 1 FROM all_users WHERE USERNAME='" + schemaName + "'";
    }
                "TO_YMINTERVAL",
                "COSH",
    public boolean supportsAlterHasColumn() {
        "TYPE",
            case OracleConstants.TYPE_OCTET:
    @Override

        return AUTO_INCREMENT_KEYWORD;
        Integer scale;
                //See https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/Data-Types.html#GUID-DF7E10FC-A461-4325-A295-3FD4D150809E
    }

import org.jkiss.dbeaver.model.sql.parser.tokens.predicates.TokenPredicateFactory;
    protected String getProcedureCallEndClause(DBSProcedure procedure) {
    public String getAutoIncrementKeyword() {

                "DEPTH",
    @NotNull
    @Override
                if (dataTypeModifies != null) {
                "LENGTH",
            case "GEOGRAPHY":
        if (procedure.getProcedureType() == DBSProcedureType.FUNCTION) {

import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
                "DELETEXML",
    public boolean supportsUuid() {
                    return "(" + (precision > 0 ? precision : "38") + (scale != null ? "," + scale : "") +  ")";
                "LENGTHB",
                "NTILE",

        return super.getColumnTypeModifiers(dataSource, column, typeName, dataKind);
        addKeywords(Arrays.stream(GLOBAL_VARIABLES).map(GlobalVariableInfo::name).toList(), DBPKeywordType.OTHER);
                "TO_CHAR",
    @Override
                    ")",
import org.jkiss.code.Nullable;
                "PRESENTV",
                "ASCIISTR",
    }
                    dataTypeModifies = sourceTypedObject.getPrecision().toString();
    public String[] getNonTransactionKeywords() {
    @Override
                "NVL2",
        } else {
                }
    @Override
                "MEDIAN",
                localDataType = OracleConstants.TYPE_NUMBER;
    @Override
        SQLSyntaxManager syntaxManager = new SQLSyntaxManager();
                "LEAST",
    public boolean supportsAsKeywordBeforeAliasInFromClause() {
    }
                "PRESENTNNV",
                "INSERTXMLBEFORE",
                "STATS_WSR_TEST",
        return true;
    @Nullable
                "SUBSTR4",


    @NotNull

        addFunctions(
                "FIRST",
                "CLUSTER_PROBABILITY",

        "AS",
                "TO_NCHAR",
        "BEFORE",
        return super.getCaseInsensitiveExpressionFormatter(operator);
            ),

import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
                "BFILENAME",
    @Override
        new GlobalVariableInfo("DBTIMEZONE", OracleMessages.global_variable_dbtimezone, DBPDataKind.DATETIME),

        if (proc.getProcedureType() == DBSProcedureType.FUNCTION) {
        super("Oracle", "oracle");
                ),
        }
                tt.alternative("AS", "IS")
            // These special values should be quoted, as shown in the example below
        "DATAFILE",
    public String getClobComparingPart(@NotNull String columnName) {
        "WHILE",
                "ITERATION_NUMBER",
    @NotNull
        if (operator == DBCLogicalOperator.LIKE) {
import org.jkiss.dbeaver.ext.oracle.internal.OracleMessages;
        for (String kw : ADVANCED_KEYWORDS) {

        BasicSQLDialect.NON_TRANSACTIONAL_KEYWORDS,
                    tt.optional("OR", "REPLACE"),
    public String getBigIntegerType() {
                "POWERMULTISET",
    public String getBlobDataType() {
                "GROUPING_ID",

    public String convertExternalDataType(@NotNull SQLDialect sourceDialect, @NotNull DBSTypedObject sourceTypedObject, @Nullable DBPDataTypeProvider targetTypeProvider) {
                "APPENDCHILDXML",
/*
        return conditions;
    @Override

    @NotNull
            // https://docs.oracle.com/en/database/oracle/oracle-database/21/sqlrf/CREATE-FUNCTION.html#GUID-156AEDAC-ADD0-4E46-AA56-6D1F7CA63306

                "XMLFOREST",
    @Override
        "WRAPPED",

                        tt.alternative("FUNCTION", "PROCEDURE")
            return "CALL " + proc.getFullyQualifiedName(DBPEvaluationContext.DML);
    };
        "DECLARE",
                "VSIZE",
    public OracleSQLDialect() {
                tt.sequence(
    @Override
        ruleManager.loadRules(dataSource, false);
                }
                tt.token("WITH"),
        "SUBPARTITION",

    @Override
                // NLS Character Functions:
            case "JSONB":
                    return null;
                break;
        SQLRuleManager ruleManager = new SQLRuleManager(syntaxManager);
    protected TokenPredicateSet makeDialectSkipTokenPredicates(JDBCDataSource dataSource) {
                "GREATEST",
                "CV",
    public String getBooleanDataType() {

import org.jkiss.dbeaver.model.sql.parser.SQLParserActionKind;
                "ROWIDTONCHAR",
                //Datetime Functions:
    }

                "LPAD",

    }
        "MATERIALIZED",
            //     https://oracle-base.com/articles/12c/with-clause-enhancements-12cr1
            ));
                "XMLSEQUENCE",
        }
            // also presented in the earliest found reference on 7.3, so considered as always supported https://docs.oracle.com/pdf/A32538_1.pdf
    }
            case "NUMERIC":
    public boolean supportsNoActionIndex() {
    }
        return OracleConstants.TYPE_NUMBER;
                "COALESCE",
                "TO_TIMESTAMP",
        return MultiValueInsertMode.INSERT_ALL;
    @Override
                "XMLQUERY",
                "SYS_XMLGEN",

                "STATS_CROSSTAB",
        turnFunctionIntoKeyword("TRUNCATE");
        return GLOBAL_VARIABLES;
                "ORA_HASH",
                "LAST",
        {SQLConstants.KEYWORD_CASE, SQLConstants.BLOCK_END + " " + SQLConstants.KEYWORD_CASE},
    public String[][] getBlockBoundStrings() {
        }
                "TRUNC",
        "IF",
            ProjectionAliasVisibilityScope.ORDER_BY

