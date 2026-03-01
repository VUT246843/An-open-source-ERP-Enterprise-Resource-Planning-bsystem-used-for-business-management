        //"NFKC",
    @Override
    }
        "array_to_json",
        "every",

//            "CHARACTER_SET_CATALOG",
import java.util.Collection;
    public boolean validIdentifierStart(char c) {
        "array_to_string",
            "FOREACH",
        "BIT_LENGTH",
    };
        new GlobalVariableInfo("system_user", PostgreSQLMessages.global_variable_system_user_description, DBPDataKind.STRING),
            "ELSEIF",
        "cos",
            //"PUBLIC",
        //"SUBSTRING_REGEX",
        //"SPECIFIC_NAME",
        return "SELECT 1 FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = " + getQuotedString(schemaName);
    }

        "PROCEDURES",
    @Override

    @Nullable
        "cosh",
        "abbrev",
        "to_regtype",
        "xmltable",
            || PostgreConstants.TYPE_INTERVAL.equals(attribute.getTypeName())
import java.sql.Types;
        "XMLQUERY",
        "pg_ls_tmpdir",
        "power",
        "database_to_xml",
    }
    @Override
        "array_fill",

            case "xml":
        super.addSQLKeywords(Arrays.asList(keywords));
    private static final String[][] PG_STRING_QUOTES = {
        "websearch_to_tsquery",
        "bool_or",
        return AUTO_INCREMENT_KEYWORD;

            case "number":
        "IGNORE",
        "isempty",
        "CONTROL",
        "pg_size_pretty",
        "bit_count",
    }
        return true;

    public static String[] POSTGRE_ONE_CHAR_KEYWORDS = new String[]{
        "floor",

    @Override

        "DLVALUE",
        //"NFD",
        "SQLERRM",
        "to_jsonb",
        "regexp_like",
        "date_part",
                    if (sourceTypedObject.getScale() != null) {
        "left",
        "xmlroot",
        "array_upper",
        "rank",
    }
        "pg_replication_origin_advance",
        removeSQLKeyword("JSON");
        "pg_terminate_backend",
        super.addFunctions(Arrays.asList(functions));
            return null;

            "CONCURRENTLY",
    @NotNull
        "round",
        "abs",
            DBSDataType dataType = targetTypeProvider.getLocalDataType(localDataType);
        return getCastedString(attribute, expression, isInCondition, false);
        "json_build_array",
//            "CHARACTER_SET_NAME",
        "quote_ident",
        addExtraFunctions(POSTGRE_FUNCTIONS_SRF);
        removeSQLKeyword("TEXT");
        "gcd",
        "pg_replication_origin_session_setup",
            ProjectionAliasVisibilityScope.GROUP_BY,
        return SQLDialect.USAGE_ALL;
        "num_nonnulls",
        "clock_timestamp",
        //"NFKD",
import org.jkiss.dbeaver.model.sql.*;
//        {"LOOP", "END LOOP"}
                localDataType = "varchar";
                break;
        "decode",

            "ELSIF",
        "radius",
        "height",
        "suppress_redundant_updates_trigger",
    }
            "REFRESH"
        "ceiling",
        "unnest"
    @Override
        "pg_switch_wal",
        //"PLI",
        }
        "pg_wal_replay_resume",
        "PRECEDES",
        "masklen",
package org.jkiss.dbeaver.ext.postgresql.model;
        "translate",
    public char getStringEscapeCharacter() {
        "current_schemas",
        "circle",
        addExtraFunctions(POSTGRE_FUNCTIONS_LO);
        "jsonb_populate_record",
    public static String[] POSTGRE_FUNCTIONS_AGGREGATE = new String[]{
        "cosd",

        "concat_ws",

import java.util.EnumSet;
    public static String[] POSTGRE_FUNCTIONS_GEOMETRY = new String[]{
        "statement_timestamp",

    public boolean supportsCreateIfExists() {

        return EXEC_KEYWORDS;
        "get_byte",
        "jsonb_object_keys",
    @Override
        "ABSENT",
            // "MESSAGE", "DETAIL", "HINT", "ERRCODE", //options
    };
        return true;
    };
        "numnode",
        //"USER_DEFINED_TYPE_NAME",
        //"TRIGGER_NAME",
        //"NAMES",
        }
        "ENFORCED",
        "pg_last_wal_receive_lsn",
            String targetTypeName = DBUtils.getObjectFullName(dataType, DBPEvaluationContext.DDL);
        "pg_log_backend_memory_contexts",
    public boolean supportsAlterHasColumn() {
        "pg_logical_slot_peek_changes",
        "stddev_samp",
//            "CURRENT_ROW",

                ? ddTagDefault
        return true;
    @Override
        "unaccent"
    public boolean supportsNestedComments() {
        "jsonb_to_recordset",
        "pclose",
        "UNTYPED",
            return '\'' + escapeString(strValue) + '\'';
        "pg_replication_origin_xact_reset",
        "RESPECT",
        if (isPgObject
    @Override
    @Override
                }
    };
    @Override
        "inet_client_port",
        "width",
        "make_time",
    @NotNull

        "inet_server_port",
        "pg_advisory_xact_lock_shared",
        "covar_pop",

        "upper_inf",
        "jsonb_extract_path",
        "make_timestamp",
    }
        addExtraKeywords(
        "UUID",
        addExtraFunctions(POSTGRE_FUNCTIONS_BINARY_STRING);
    };
        addExtraFunctions(POSTGRE_FUNCTIONS_STRING);
    }
        "pg_read_binary_file",
        "pg_rotate_logfile",
        //"USER_DEFINED_TYPE_SCHEMA",        
    @NotNull
        "SQLERROR",
    //region KeyWords
            "ILIKE",
        "table_to_xml_and_xmlschema",
        //"PORTION",
        "REQUIRING",
        // This method actually works for special data types like JSON and XML.
        "json_populate_record",
        "jsonb_pretty"
        "reverse",

        "localtime",
        }
        "txid_current",
        "host",
        "schema_to_xml_and_xmlschema",

        "length",
//            "DATETIME_INTERVAL_CODE",
        "strip",

//            "ARRAY_AGG",
    
    public String[] getParametersPrefixes() {
    public String getCreateSchemaQuery(@NotNull String schemaName) {
    public static final String[] POSTGRE_NON_TRANSACTIONAL_KEYWORDS = ArrayUtils.concatArrays(
    @NotNull
        "corr",
        "parse_ident",
    @Override
            "LOOP",
        "pg_advisory_xact_lock",
        "pg_advisory_unlock_all",
    }
        "PASSTHROUGH",
    };
        "count"
        "pg_advisory_lock_shared",
            "CONFLICT",
        "lo_import",
    public static String[] POSTGRE_FUNCTIONS_XML = new String[]{
        "age",
        "PERCENT",
        "convert",
        return "CREATE SCHEMA " + schemaName;
        //"PASCAL",
        "pg_replication_origin_session_progress",
        "family",
        "jsonb_array_length",
        "query_to_xml",
        new String[]{
        "pg_logical_slot_get_binary_changes",
        return false;
    public static String[] POSTGRE_FUNCTIONS_FORMATTING = new String[]{


        }
    @Override
        "isfinite",
    };
        //"MODULE",
        "least"
    private PostgreServerExtension serverExtension;
//            "PARAMETER_NAME",
        "pg_last_wal_replay_lsn",
        "phraseto_tsquery",
                }
        "lower_inc",
        "pg_ls_logicalmapdir",
        "nullif",
        "LAG",
//            "ROUTINE_SCHEMA",

    public boolean supportsAliasInSelect() {
        "XMLCOMMENT",
        "XMLBINARY",
        //"URI",
        "random",

        "LAST_VALUE",
        "xmlcomment",
        "GROUPS",

        "acos",
    };
        //"ROW_COUNT",
        "to_regoperator",
    @Override
        new GlobalVariableInfo("current_catalog ", PostgreSQLMessages.global_variable_current_catalog_description, DBPDataKind.STRING),
        "first_value",
            boolean ddTagIsString = dataSource == null
                localDataType = "geometry";
                        dataTypeModifies += "," + sourceTypedObject.getScale();
        "mode",
        "querytree",

    @Override
            // These special values should be quoted
        addDataTypes(PostgreConstants.DATA_TYPE_ALIASES.keySet());
        "pg_client_encoding",
//            "RETURNED_LENGTH",
    }
        "tan",
        "xpath",
            serverExtension.configureDialect(this);
        "XMLITERATE",
    }
        "lo_from_bytea",
    };
    public static String[] POSTGRE_FUNCTIONS_COMPRASION = new String[]{
        "brin_summarize_new_values",

            };
 */
        "to_json",
        }
//            "MESSAGE_TEXT",
        "npoints",
        "table_to_xmlschema",
        "pg_current_wal_lsn",
        addExtraFunctions(POSTGRE_FUNCTIONS_XML);
        }

        //"SUBCLASS_ORIGIN",
        "BLOCKED",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        "acosd",
        "json_array_elements",
        "pg_current_wal_flush_lsn",
    }
        "pg_copy_logical_replication_slot",
 */
    @Override
        "atan2",
        "pg_promote",
    public String getUuidDataType() {
        "txid_current_if_assigned",
    @NotNull
    public String escapeScriptValue(DBSTypedObject attribute, @NotNull Object value, @NotNull String strValue) {
                String typeCasting = pdt.getConditionTypeCasting(isInCondition, castColumnName);

    };
        "DYNAMIC_FUNCTION_CODE",
        if (CommonUtils.isNaN(value) || CommonUtils.isInfinite(value)) {
        "P"
        "current_database",
        "set_config",
    public EnumSet<ProjectionAliasVisibilityScope> getProjectionAliasVisibilityScope() {
        "quote_nullable",
        "pg_try_advisory_lock_shared",
        "inet_same_family",
        "stddev_pop",
        return true;
import java.util.Locale;
        "bit_and",
        "BEGIN_PARTITION",

        "pg_advisory_unlock",
        return new TPRule[0];

    //endregion
            "VARIADIC",
        return true;
    @NotNull
        return false;

            "EXTENSION",
        String typeName = sourceTypedObject.getTypeName();
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        //"SCOPE_NAME",
        "xml_is_well_formed",
        "row_security_active",
        "pg_wal_replay_pause",
        "NULLABLE",
                    sourceTypedObject.getMaxLength() != Integer.MAX_VALUE &&

        return GLOBAL_VARIABLES;
        addExtraFunctions(POSTGRE_FUNCTIONS_ADMIN);
        if (position == RulePosition.INITIAL || position == RulePosition.PARTITION) {
        "current_query",
        "jsonb_each_text",
    }
            "FREEZE",
//            "PARAMETER_ORDINAL_POSITION",
        return string;
//            "PARAMETER_SPECIFIC_SCHEMA",
    }
        "row_number",
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {

        "setseed",

    public void addExtraFunctions(String... functions) {
        "lower_inf",
    @Override
        "json_array_length",
        "make_timestamptz",
        "bit_length",

        new GlobalVariableInfo("current_time", PostgreSQLMessages.global_variable_current_time_description, DBPDataKind.DATETIME),
        "jsonb_strip_nulls",
    }
        //"TRANSACTIONS_COMMITTED",
        "to_regnamespace",
        "exp",
            if (!CommonUtils.equalObjects(attributeName, attribute.getName())) {
        "pg_column_compression",
/*
    public static String[] POSTGRE_FUNCTIONS_STRING = new String[]{
    public static String[] POSTGRE_FUNCTIONS_WINDOW = new String[]{
        "get_bit",
        return SQLDialect.USAGE_DML;
        "array_replace",
        return super.validIdentifierStart(c) || c == '_';
        "database_to_xmlschema",
/**
        "SUCCEEDS",
        if (dataSource instanceof PostgreDataSource) {
            boolean ddPlainIsString = dataSource == null
    public static String[] POSTGRE_FUNCTIONS_NETWROK = new String[]{
        "lo_create",
        "array_prepend",
            if (dataType == null) {
        "popen",
    }
    public String getTypeCastClause(@NotNull DBSTypedObject attribute, String expression, boolean isInCondition) {
        "bit_or",
        "covar_samp",

    };
        "current_setting",
        "lag",
        "enum_range"
    }
        "FRAME_ROW",
                localDataType = "jsonb";
                    return string + typeCasting;

        //"TRIGGER_CATALOG",
    @Override
        "json_object_agg",
    };
        "cotd",
        "LEAD",

        //"BREADTH",
    };
        return super.getStringEscapeCharacter();
        "slope",
        "chr",
        "pg_replication_origin_xact_setup",
            "SHOW", "SET"
        "strpos",

        addExtraFunctions(POSTGRE_FUNCTIONS_INFO);
        "DYNAMIC_FUNCTION",
        "SQLCODE",
        "ADA",

        "pg_import_system_collations",
            serverExtension = ((PostgreDataSource) dataSource).getServerType();
    }
        "pg_logical_slot_peek_binary_changes",
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCSQLDialect;
        "XMLDOCUMENT",
        "FS",

        "string_to_array",
    @NotNull
    @Override
        "to_char",
    }

        "split_part",
        "pg_replication_origin_session_reset",
        "set_bit",
        //"NAME",
        "sinh",
        "current_schema",
        "XMLSCHEMA",
            "SHOW",
        "xmlforest",
        "path",
        "pg_cancel_backend",
    };
        String externalTypeName = typeName.toLowerCase(Locale.ENGLISH);
        "DLURLSERVER",
        "json_array_elements_text",
        }
        addExtraFunctions(POSTGRE_FUNCTIONS_DATETIME);

        "END_PARTITION",
        "array_dims",
            // For now we use workaround: represent objects as strings
        // Or very special clauses with JSON and XML columns, when we have to cast both column data and column name to text.
        "broadcast",
    @Override
        return true;

        "pg_replication_origin_create",
        "lowrite",
        switch (externalTypeName) {
        "OCCURRENCES_REGEX",
    public String[] getNonTransactionKeywords() {
        "atand",
        "rpad",
    };
    }
        "box",
        "cume_dist",
        "txid_snapshot_xmin",
        "jsonb_array_elements",
        "lo_unlink",
        "PERMISSION",
    private static final GlobalVariableInfo[] GLOBAL_VARIABLES = {
        "text",
        "btrim",
    public static String[] POSTGRE_FUNCTIONS_JSON = new String[]{
        "txid_snapshot_xip",
//            "COLUMN_NAME",
//            "MAX_CARDINALITY",
                return null;
            "LANGUAGE",
        //"DB",
        "M",
        "to_regrole",
                : CommonUtils.getBoolean(dataSource.getActualConnectionConfiguration().getProviderProperty(PostgreConstants.PROP_DD_PLAIN_STRING), ddPlainDefault);
        "pg_sleep",
        return EnumSet.of(
            case "sdo_geometry":
    protected void loadDataTypesFromDatabase(JDBCDataSource dataSource) {
    @Override
    @Override
        "pg_stat_file",
        "currval",
        "substring",

import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
            DBSDataType dataType = toEx.getDataType();
            return '\'' + String.valueOf(value) + '\'';
        "cursor_to_xmlschema",
        "G",
//        {SQLConstants.BLOCK_BEGIN, SQLConstants.BLOCK_END},
        "isopen",
    public boolean supportsInsertAllDefaultValuesStatement() {
    );
    @NotNull
        );

    //region FUNCTIONS KW
        "DLNEWCOPY",
        "END_FRAME",
        "string_agg",
        //"PUBLIC",
            || PostgreConstants.TYPE_BIT.equals(attribute.getTypeName())
    }
        "pg_partition_tree",
        "json_extract_path",
        new GlobalVariableInfo("session_user", PostgreSQLMessages.global_variable_session_user_description, DBPDataKind.STRING),
        "inet_server_addr",
        "pg_split_walfile_name",
    @Override
    public SQLExpressionFormatter getCaseInsensitiveExpressionFormatter(@NotNull DBCLogicalOperator operator) {

import org.jkiss.code.NotNull;
        "POSITION_REGEX",

    @Override
        "convert_to",
    public boolean supportsNoActionIndex() {
    public String getTimestampDataType() {
        "right",
 * DBeaver - Universal Database Manager
        "NTH_VALUE",
        "upper_inc",
        "BOM",
        "KEY_MEMBER",
        //"LINK",
 * limitations under the License.
        return PostgreConstants.TYPE_TEXT;
        super.initDriverSettings(session, dataSource, metaData);
        "to_number",
    @Override

    @Override
        "tand",
        "xmlconcat",
//            "PARAMETER_SPECIFIC_CATALOG",
                break;
        "EXIT",
//            "RETURNED_CARDINALITY",
        "pg_get_wal_replay_pause_state",
        "json_object_keys",
        return true;
        "coalesce",
    public static String[] POSTGRE_FUNCTIONS_CONDITIONAL = new String[]{
        "tsvector_to_array",
        removeSQLKeyword("WORK");
    }
                // Must use explicit attribute name
    @Override
        "sin",
//            "CONSTRAINT_CATALOG",
        "DLPREVIOUSCOPY",
            || attribute.getTypeID() == Types.ARRAY

            if (dataType instanceof PostgreDataType pdt) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
    @NotNull
        "isclosed",
        "DLURLPATH",
        "json_agg",
        "num_nulls"
            "ANALYZE",
    };

        BasicSQLDialect.NON_TRANSACTIONAL_KEYWORDS,
        if (targetTypeProvider == null) {
import org.jkiss.dbeaver.ext.postgresql.internal.PostgreSQLMessages;
        return super.getCaseInsensitiveExpressionFormatter(operator);
        //"TRIM_ARRAY",
    public int getCatalogUsage() {
                break;
        "ts_rewrite",
    public static String[] POSTGRE_FUNCTIONS_TRIGGER = new String[]{
        "setval"
                ? ddPlainDefault
 *
//            "ROUTINE_CATALOG",
        }
        "set_masklen",
        "jsonb_populate_recordset",
        "pg_table_size",
            }
        "pg_try_advisory_xact_lock_shared"
        "ln",
        "to_timestamp"
        "generate_subscripts"
        "json_populate_recordset",
        "jsonb_to_tsvector",
        "log",
        "to_timestamp",
//            "COMMAND_FUNCTION_CODE",
        "lead",
        "TOKEN",
        "txid_visible_in_snapshot",
//            "ARRAY_MAX_CARDINALITY",
        //"NFC",
        "XMLVALIDATE",
    //Function without arguments/parameters #8710
    @NotNull
        "array_position",
        "lseg",
    @NotNull
        "div",
        "XMLAGG",
    };
        addExtraFunctions(POSTGRE_FUNCTIONS_SEQUENCE);
        "pg_size_bytes",

            "OFFSET",
    public boolean isEscapeBackslash() {
import org.jkiss.dbeaver.model.sql.parser.rules.SQLDollarQuoteRule;
        //"TRANSACTIONS_ROLLED_BACK",
        "ADMIN",
    @Override
    @Nullable
    public String getAutoIncrementKeyword() {
        "justify_interval",
        //"HEX",
        }
        return PostgreConstants.TYPE_UUID;


            "ANALYSE",
        "pg_drop_replication_slot",
        "pi",
        "pg_total_relation_size",
        return super.escapeScriptValue(attribute, value, strValue);
            return (left, right) -> left + " ILIKE " + right;

        new GlobalVariableInfo("current_date", PostgreSQLMessages.global_variable_current_date_description, DBPDataKind.DATETIME),
    public String[][] getBlockBoundStrings() {
//            "COMMAND_FUNCTION",
    };
    @NotNull

        "pg_walfile_name",
        "pg_collation_actual_version",
        "pg_create_logical_replication_slot",
        "pg_ls_dir",
            case "json":
        "convert_from",
    @Override
    public void addKeywords(Collection<String> set, DBPKeywordType type) {
        "EMPTY",
//            "PARAMETER_MODE",

        //"USER_DEFINED_TYPE_CATALOG",
    public boolean supportsColumnAutoIncrement() {
        "xmlattributes"
        "regexp_matches",
        "transaction_timestamp"
        "array_cat",
        "schema_to_xmlschema",
        return POSTGRE_NON_TRANSACTIONAL_KEYWORDS;
        "jsonb_each",
            case "varchar2":
        addExtraFunctions(POSTGRE_FUNCTIONS_BUILTIN);
            "COMMENT",
    public static final String[][] BLOCK_BOUND_KEYWORDS = {
        "tsvector_update_trigger_column"
    public static String[] POSTGRE_FUNCTIONS_ADMIN = new String[]{
        //"FLAG",

    }
        "netmask",
        if (typeName == null) {
//            "RETURNED_SQLSTATE",
    };


        "treat",
        //"SYSTEM_TIME",
    @Override
//            "DATALINK",
        addExtraFunctions(POSTGRE_FUNCTIONS_JSON);
    public boolean supportsAlterColumnSet() {
        "json_to_record",
    //endregion
            "MATERIALIZED",
        "jsonb_array_elements_text",
        removeSQLKeyword("LENGTH");
        "XMLDECLARATION",
import org.jkiss.dbeaver.ext.postgresql.sql.PostgreEscapeStringRule;
        "setweight",
import org.jkiss.dbeaver.model.struct.*;
        "json_typeof",
    }
        "array_ndims",
    @NotNull
            // "DEBUG", "INFO", "NOTICE", "WARNING", // levels
        "get_current_ts_config",
        "log10",

    @Override


    };
        "pg_database_size",
 * See the License for the specific language governing permissions and
        "ts_filter",
        "justify_days",
    }
 *
        "to_regclass",
        "pg_partition_root",
        "pg_is_wal_replay_paused",
        //"TOP_LEVEL_COUNT",
        "network",
//            "CLASS_ORIGIN",
        "pg_get_wal_resource_managers",
        addExtraFunctions(POSTGRE_FUNCTIONS_FORMATTING);
    }
    @NotNull
        "justify_hours",
        "ACCORDING",
        addExtraFunctions(POSTGRE_FUNCTIONS_GEOMETRY);
        new GlobalVariableInfo("current_timestamp", PostgreSQLMessages.global_variable_current_timestamp_description, DBPDataKind.DATETIME),
        addExtraKeywords(POSTGRE_EXTRA_KEYWORDS);
    public static String[] POSTGRE_FUNCTIONS_SEQUENCE = new String[]{
        //"TRIGGER_SCHEMA",

        new GlobalVariableInfo("current_user", PostgreSQLMessages.global_variable_user_description, DBPDataKind.STRING),
 * you may not use this file except in compliance with the License.
        addExtraFunctions(POSTGRE_FUNCTIONS_CONDITIONAL);



 *     http://www.apache.org/licenses/LICENSE-2.0
            if (dataTypeModifies != null) {
    }
    @NotNull
    public TPRule[] extendRules(@Nullable DBPDataSourceContainer dataSource, @NotNull RulePosition position) {
    }
//            "CONNECTION_NAME",
            // https://www.postgresql.org/docs/current/datatype-numeric.html#DATATYPE-NUMERIC-DECIMAL
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
                break;
        "nextval",
    // In PgSQL there are no blocks. DO $$ ... $$ queries are processed as strings
        "point",
        "pg_read_file",
        "row_to_json",
    public MultiValueInsertMode getDefaultMultiValueInsertMode() {
        "pg_ls_waldir",
        "DLURLSCHEME",
//            "CONDITION_NUMBER",
        "RULE",
        boolean isPgObject = serverExtension != null && serverExtension.isPGObject(value);
        "timeofday",
//            "DATETIME_INTERVAL_PRECISION",
import org.jkiss.dbeaver.model.*;
    };
        "obj_description",
    }
        "nth_value"
    private String getCastedString(@NotNull DBSTypedObject attribute, String string, boolean isInCondition, boolean castColumnName) {
    public String getSchemaExistQuery(@NotNull String schemaName) {
                localDataType = "numeric";
        "array_agg",
        "pg_replication_origin_progress",
        "to_date",
    }

    public static String[] POSTGRE_FUNCTIONS_BUILTIN = new String[] {
        return PostgreConstants.TYPE_TIMESTAMP;
        "pg_wal_lsn_diff",
    @NotNull
    }
    @Override
//            "MESSAGE_LENGTH",
                attributeName = DBUtils.getObjectFullName(sAttr.getDataSource(), attribute, DBPEvaluationContext.DML);
        "IMMEDIATELY",
        "ceil",
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        addExtraFunctions(POSTGRE_FUNCTIONS_ENUM);
        "lo_creat",
        "to_ascii",
    @Override
        "bool_and",
        "gin_clean_pending_list",
//            "CHARACTER_SET_SCHEMA",
//            "ROUTINE_NAME",
    public static String[] POSTGRE_FUNCTIONS_RANGE = new String[]{
    }
            }
        "FIRST_VALUE",
    @Override
    public static String[] POSTGRE_FUNCTIONS_SRF = new String[]{
        "lo_export",
        new GlobalVariableInfo("localtimestamp", PostgreSQLMessages.global_variable_localtimestamp_description, DBPDataKind.DATETIME),
        "to_tsquery",
    }
        if (localDataType == null) {
            return localDataType;
        "lastval",
        "schema_to_xml",
                    dataTypeModifies = String.valueOf(sourceTypedObject.getMaxLength());
    public boolean supportsAliasInConditions() {
        "xml_is_well_formed_content",
        "cursor_to_xml",
        //"ID",
            boolean ddPlainDefault = DBWorkbench.getPlatform().getPreferenceStore().getBoolean(PostgreConstants.PROP_DD_PLAIN_STRING);
        "DLURLCOMPLETEWRITE",
            "RAISE",
        //"SCOPE_SCHEMA",
    public static String[] POSTGRE_FUNCTIONS_MATH = new String[]{
    public String getBooleanDataType() {
    }
    };
    }
        "tsquery_phrase",
        addExtraFunctions(POSTGRE_FUNCTIONS_ARRAY);
        return PostgreConstants.TYPE_BIGINT;
    @Override
        setUnquotedIdentCase(DBPIdentifierCase.LOWER);
        "initcap",
                new SQLDollarQuoteRule(position == RulePosition.PARTITION, true, ddTagIsString, ddPlainIsString),
//            "CONSTRAINT_SCHEMA",
        return PostgreConstants.TYPE_BOOLEAN;
        return PG_STRING_QUOTES;
        "pg_export_snapshot",
        //"FILE",
        "mod",

        "pg_current_wal_insert_lsn",
        "ts_rank_cd",
        } else {
    }
    public static String[] POSTGRE_FUNCTIONS_LO = new String[]{
        return PostgreConstants.OPERATION_ALTER;
    };
    private static final String[] EXEC_KEYWORDS = {
        "format",
        super("PostgreSQL", "postgresql");
        String localDataType = null, dataTypeModifies = null;
    public static String[] POSTGRE_FUNCTIONS_ENUM = new String[]{
            return targetTypeName;
        new GlobalVariableInfo("current_schema", PostgreSQLMessages.global_variable_current_schema_description, DBPDataKind.STRING),
        "C",
    }
    public String getCastedAttributeName(@NotNull DBSAttributeBase attribute, String attributeName) {
        "md5",
    SQLDialectDDLExtension, SQLDialectSchemaController {
//            "COLLATION_NAME",
        "LIBRARY",
    @NotNull
        return serverExtension != null && serverExtension.supportsBackslashStringEscape();

        "json_each_text",
    public boolean supportsTableDropCascade() {
                    dataTypeModifies = sourceTypedObject.getPrecision().toString();
        return false;
            || attribute.getTypeID() == Types.OTHER
        "regexp_split_to_table",
        "pg_copy_physical_replication_slot",
    @Override
                : CommonUtils.getBoolean(dataSource.getActualConnectionConfiguration().getProviderProperty(PostgreConstants.PROP_DD_TAG_STRING), ddTagDefault);
//            "ROUTINES",
        }
        "jsonb_build_object",
        //"USER_DEFINED_TYPE_CODE",

        "DLURLCOMPLETE",
//            "CATALOG_NAME",
    };
    public PostgreDialect() {
        "diagonal",
        "width_bucket"
            "PERFORM",
        "array_to_tsvector",
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
                }
        //"VALUE_OF",
        "xmlexists",
        "jsonb_build_array",
    public String[] getExecuteKeywords() {
                if (sourceTypedObject.getPrecision() != null) {
        "jsonb_typeof",
        "to_regprocedure",
        "to_hex",
    }
            return null;
    };
        "area",
        "regexp_instr",
        "replace",
    @Override
        "shobj_description",
        "date_trunc",
        return PostgreConstants.TYPE_BYTEA;
            case "xmltype":

                localDataType = "xml";
        "variance",

        "INDENT",
            "USER",

        new GlobalVariableInfo("localtime", PostgreSQLMessages.global_variable_localtime_description, DBPDataKind.DATETIME),
        "asind",

        {"'", "'"}
        "BERNOULLI",
        "pg_reload_conf",

            case "sys.xmltype":
        addExtraFunctions(POSTGRE_FUNCTIONS_WINDOW);
        "pg_backup_stop",
            "NOTICE",
        "pg_tablespace_size",
        "generate_series",
        addExtraFunctions(POSTGRE_FUNCTIONS_RANGE);
        addExtraFunctions(POSTGRE_FUNCTIONS_MATH);
        "to_tsvector",
        "array_remove",
        "pg_indexes_size",
    @Override
import org.jkiss.utils.ArrayUtils;
        if (operator == DBCLogicalOperator.LIKE) {
                if (CommonUtils.isNotEmpty(typeCasting)) {
        "regexp_count",
        addExtraFunctions(PostgreConstants.POSTGIS_FUNCTIONS);
}
        "range_merge"
        );
            "DATATYPE",
        return DBPIdentifierCase.LOWER;
        "pg_ls_archive_statusdir",
    @NotNull
        "array_append",
        "pg_walfile_name_offset",
        "WHILE"
        "lpad",
public class PostgreDialect extends JDBCSQLDialect implements TPRuleProvider, SQLDataTypeConverter,
        "query_to_xml_and_xmlschema",
//            "MESSAGE_OCTET_LENGTH",
import org.jkiss.dbeaver.ext.postgresql.model.data.PostgreBinaryFormatter;
        "dense_rank",
        "xmlpi",
        "NAMESPACE",
        "json_to_recordset",
    public String getAlterColumnOperation() {
    public static String[] POSTGRE_EXTRA_KEYWORDS = new String[]{
        "regexp_match",
            // TODO: we need to add value handlers for all PG data types.
    }
    public static final String AUTO_INCREMENT_KEYWORD = "AUTO_INCREMENT";

        "array_length",
            case "mdsys.sdo_geometry":
        "pg_column_size",
    };
    @NotNull
            case "geometry":
        "XMLCAST",
        "json_each",
        "jsonb_object_agg",
        removeSQLKeyword("FORMAT");
        "DLURLCOMPLETEONLY",
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.text.parser.TPRule;
        "xmlnamespaces",
                if (sourceTypedObject.getMaxLength() > 0 &&
        return PostgreBinaryFormatter.INSTANCE;
        "pg_is_in_recovery",
    protected DBPIdentifierCase getDefaultIdentifiersCase() {
        //"FORTRAN",
        // Some data for some types of columns data types must be cast. It can be simple casting only with data type name like "::pg_class" or casting with fully qualified names for user defined types like "::schemaName.testType".
            "RETURNING",
    }
    @Override
import java.util.Arrays;
 * PostgreSQL dialect
        "loread",
    }
        "plainto_tsquery",
        "RESTORE",
                targetTypeName += "(" + dataTypeModifies + ")";
        "sqrt",

        "sind",
    }
        //"SCHEMA_NAME",
        "atan2d",
        "pg_replication_origin_session_is_setup",
    public static String[] POSTGRE_FUNCTIONS_ARRAY = new String[]{
        return BLOCK_BOUND_KEYWORDS;
            "PERFORM",
        "DLURLPATHWRITE",
        "cot",
        "pg_try_advisory_xact_lock",
        "pg_logical_emit_message",
        "jsonb_agg",
    }
        "xmlagg",
        }
        "grouping",
                    }
        "BEGIN_FRAME",
        "txid_status"
        "pg_log_standby_snapshot",
            "TYPE",
    public String getBigIntegerType() {
        super.loadDataTypesFromDatabase(dataSource);
    public static String[] POSTGRE_FUNCTIONS_INFO = new String[]{
    public String getClobDataType() {

import org.jkiss.dbeaver.model.data.DBDBinaryFormatter;
        "table_to_xml",
    public GlobalVariableInfo[] getGlobalVariables() {

    public static String[] POSTGRE_FUNCTIONS_BINARY_STRING = new String[]{
        "set_byte",
        "col_description",
            || attribute.getTypeID() == Types.STRUCT) {
        //"TRANSACTION_ACTIVE",
        "lo_put",
        "cardinality",
        // Not sure about one char keywords. May confuse users
    @NotNull
        if (serverExtension != null && serverExtension.supportsBackslashStringEscape()) {
        "quote_literal",
import org.jkiss.dbeaver.model.text.parser.TPRuleProvider;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        }
 * You may obtain a copy of the License at

        "center",

        "K",

        "pg_try_advisory_lock",
        "INTEGRITY",
        "EXPRESSION",
    public String[][] getStringQuoteStrings() {
//            "PARAMETER_SPECIFIC_NAME",


        "hostmask",
    };
        "pg_replication_origin_drop",
 *
        "array_positions",
        "pg_database_collation_actual_version",
        "ts_delete",
        "format_type",
        "json_strip_nulls",
        new GlobalVariableInfo("user", PostgreSQLMessages.global_variable_user_description, DBPDataKind.STRING)
        return new String[]{"$"};
            return new TPRule[] {
    public int getSchemaUsage() {
        "T",
        "pg_relation_size",
        addExtraFunctions(POSTGRE_FUNCTIONS_AGGREGATE);
        "NIL",
        "pg_backend_pid",
        "to_regoper",
        "query_to_xmlschema",
        "make_date",
    };
//            "COLLATION_CATALOG",


        "regexp_replace",
                new PostgreEscapeStringRule()
        "pg_relation_filepath",
            }
        "line",
        "pg_ls_logdir",
            "MODULE",
            ProjectionAliasVisibilityScope.ORDER_BY
        "pg_replication_origin_oid",
        "ntile",
        //"TABLE_NAME",
        "position",
        "stddev",
        "tsvector_update_trigger_column"
            case "nchar":
//            "CONSTRAINT_NAME",
        "pg_advisory_unlock_shared",
    };
                attributeName = DBUtils.getQuotedIdentifier(sAttr.getDataSource(), attributeName);
            return '\\';
        "substr"
        "lcm",
        "make_interval",
        "txid_snapshot_xmax",
        "LIKE_REGEX",
    
        "greatest",


    }
//            "COLLATION_SCHEMA",

        "var_samp"
            "LATERAL",
        "json_to_tsvector",
        "RECOVERY",
        new GlobalVariableInfo("current_role", PostgreSQLMessages.global_variable_user_description, DBPDataKind.STRING),
        "macaddr8_set7bit"
        "atan",
        //"SELECTIVE",
        "jsonb_set",
        "database_to_xml_and_xmlschema",
    }

    }
        "INCLUDE",
        "enum_last",
        "jsonb_to_record",
        }
            "TABLESPACE",
        "pg_ls_replslotdir",
    public boolean supportsCommentQuery() {

        //"COBOL",
        "brin_desummarize_range",
        "xml_is_well_formed_document",
        addExtraFunctions(POSTGRE_FUNCTIONS_TEXT_SEARCH);
    public String convertExternalDataType(@NotNull SQLDialect sourceDialect, @NotNull DBSTypedObject sourceTypedObject, @Nullable DBPDataTypeProvider targetTypeProvider) {
        "inet_merge",
        "json_object",
        return getCastedString(attribute, attributeName, true, true);
        "last_value",
    public static String[] POSTGRE_EXTRA_TYPES = new String[]{
        "jsonb_object",
        "SIMPLE",
        "json_build_object",
        if (attribute instanceof DBSTypedObjectEx toEx) {
    };
        "txid_current_snapshot",
    public static String[] POSTGRE_FUNCTIONS_DATETIME = new String[]{
    public void addExtraKeywords(String... keywords) {
        "jsonb_insert",
        super.addKeywords(set, type);
                break;
            boolean ddTagDefault = DBWorkbench.getPlatform().getPreferenceStore().getBoolean(PostgreConstants.PROP_DD_TAG_STRING);
        "ts_rank",
    }
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;

        "polygon"
                    sourceTypedObject.getMaxLength() != Long.MAX_VALUE)
        "tsvector_update_trigger",
    public DBDBinaryFormatter getNativeBinaryFormatter() {
    };
        addExtraFunctions(POSTGRE_FUNCTIONS_TRIGGER);
            case "nvarchar":
        "inet_client_addr",
        "pg_relation_filenode",

        "pg_advisory_lock",
        "xpath_exists",
        //"SERVER_NAME",
        //"TRANSLATE_REGEX",
        // Because column names in the condition in a table without key must be also cast, as data in getTypeCast method.
        "tsvector_update_trigger",
        "brin_summarize_range",
            }

        "to_regproc",
        "PERIOD",
        // #12723 Redshift driver returns wrong infor about unquoted case
        "localtimestamp",
    @Override
        //"SCOPE_CATALOG",
        "asin",
        "trunc",
        "pg_ls_logicalsnapdir",
            case "jsonb":
    }
        "CALL"
        "pg_filenode_relation",
        "DLURLPATHONLY",
    }
        addExtraFunctions(POSTGRE_FUNCTIONS_COMPRASION);
        addDataTypes(Arrays.asList(POSTGRE_EXTRA_TYPES));
        "lo_get",
        "xmlelement",
    @Override
import org.jkiss.utils.CommonUtils;
        "XMLTEXT",
        "var_pop",
        "VERSIONING",
        "pg_create_restore_point",
    public static String[] POSTGRE_FUNCTIONS_TEXT_SEARCH = new String[]{
        "percent_rank",
        "overlay",
    @Override
        return true;
        "regexp_substr",
        return true;
    protected boolean isStoredProcedureCallIncludesOutParameters() {
        "pg_backup_start",
        //"STATE",
        "ts_headline",
            } else {
        "cbrt",
        "bound_box",
        "scale",
        "encode",
                {

        "BASE64",
        "cast"
        "pg_create_physical_replication_slot",
        "UNLINK",
        "pg_last_xact_replay_timestamp",
        "pg_replication_slot_advance",
        //"VALUE",
        "pg_partition_ancestors",
        "NTILE",
        "array_lower",
        "diameter",
        addExtraFunctions(POSTGRE_FUNCTIONS_NETWROK);
    @Override
        "regexp_split_to_array",
        "enum_first",
//            "RETURNED_OCTET_LENGTH",
    public String getBlobDataType() {

 * Unless required by applicable law or agreed to in writing, software

        //addExtraKeywords(POSTGRE_ONE_CHAR_KEYWORDS);
        return MultiValueInsertMode.GROUP_ROWS;
    @Override
    @Override
        "pg_logical_slot_get_changes",
        if (attribute instanceof DBSObject sAttr && !DBUtils.isPseudoAttribute(attribute)) {

