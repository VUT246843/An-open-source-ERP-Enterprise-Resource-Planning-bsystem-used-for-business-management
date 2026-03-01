                "INNER JOIN " + SQLServerUtils.getSystemTableFQN(dataSource, catalog, "indexes", true) + " i ON t.OBJECT_ID = i.object_id\n" +

     * @return changed SQL or original SQL if the "create and replace" already exists
        }
            case 3: return DBSForeignKeyModifyRule.SET_DEFAULT;
        SQLServerDataSource dataSource = object.getDataSource();
import org.jkiss.dbeaver.ext.mssql.model.*;
     * @param object to get definition

                return doRequestObjectDefinition(session, sqlQuery);
            Matcher croosDatabaseMatcher = CROSS_DATABASE_QUERY_ERROR_PATTERN.matcher(dbsqlException.getMessage());
    public static String changeCreateToCreateOrReplace(@Nullable String sql) {
                }

    }
            SQLServerDatabase database = dataSource.getDatabase(catalogName);
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        // See https://stackoverflow.com/questions/4101863/sql-server-current-user-name
                    // not expected to be necessary, usage should be disabled
        }
 *
import org.jkiss.dbeaver.DBDatabaseException;

            try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Read source code fallback to default function")) {
        if (e instanceof DBSQLException dbsqlException) {
            catalogName = singleSource.getCatalogName();
    }
    }
    public static boolean isTableType(SQLServerTableBase table) {
/*
        Optional<SQLServerDatabase> database = Optional.ofNullable(object.getDatabase());
        } catch (Throwable e) {
}
        @NotNull SQLServerObject object,
                schemaName = original.getSchema();
import java.util.regex.Matcher;
        return "";

            return ddl.replaceFirst(firstKeyword, replacement);
        return driver.getId().contains("azure");
                    return schema.getTable(session.getProgressMonitor(), singleSource.getEntityName());
     * User-created temp tables have names padded to 128 characters with underscores, with a
        if (isSqlServer && !dataSource.isServerVersionAtLeast(SQLServerConstants.SQL_SERVER_2005_VERSION_MAJOR,0)) {

        }
     * If the data source indicates that it is running on SQL Server 2016 SP1 or later (i.e. version 16 or above),
                systemSchema;
        SQLServerAuthentication auth = isWindowsAuth(connectionInfo) ? SQLServerAuthentication.WINDOWS_INTEGRATED :
        switch (actionNum) {
 *
        var pattern = Pattern.compile("(CREATE\\s+OR\\s+ALTER|\\w+)");
     */
                DBUtils.getQuotedIdentifier(dataSource, catalog) + "." + systemSchema :
    }
                }
            if (isSQLServer) {

        return driver.getId().contains("generic");
    public static boolean isDriverJtds(DBPDriver driver) {

            session,
                    auth = SQLServerAuthentication.valueOf(authProp);
        }
        var strippedQuery = SQLUtils.stripComments(sqlDialect, ddl);
                case "all_parameters":
                case "partitions":
        }
    }
    }
                while (dbResult.nextRow()) {
            return false;
    public static boolean isCommentSet(DBRProgressMonitor monitor, SQLServerDatabase database, SQLServerObjectClass objectClass, long majorId, long minorId) {
    public static DBException mapException(@NotNull DBException e) {
                    return false;
    }
        Pattern.compile("Reference to database and/or server name in '([^']+)' is not supported in this version of SQL Server\\.");
                SQLServerTable sqlServerTable = (SQLServerTable) table;
        if (catalogName == null && original != null) {
                    return "(SELECT TOP 0 *, CAST(0 AS sys.SQL_VARIANT) AS start_value, CAST(1 AS sys.SQL_VARIANT) AS increment, CAST(0 AS sys.SQL_VARIANT) AS minimum_value, CAST(1 AS sys.SQL_VARIANT) AS maximum_value, CAST(0 AS sys.bit) AS is_cycling, CAST(0 AS sys.bit) AS is_cached, CAST(NULL AS INT) AS cache_size, CAST(to_regtype('int') AS sys.int) AS system_type_id, CAST(to_regtype('int') AS sys.int) AS user_type_id, CAST(1 AS sys.tinyint) AS precision, CAST(0 AS sys.tinyint) AS scale, CAST(0 AS sys.SQL_VARIANT) AS current_value, CAST(0 AS sys.bit) AS is_exhausted, CAST(NULL AS sys.SQL_VARIANT) AS last_used_value FROM sys.objects WHERE type = 'SO') AS";
        }
        Matcher matcher = TEMPDB_TABLE_NAME_PATTERN.matcher(name);
                dbStat.setLong(2, sqlServerTable.getObjectId());
        } else {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }
        } catch (SQLException e) {
                String sqlQuery = selectObjectDefinitionDescriptionSQL(monitor, object, true);
        return null;

            return doRequestObjectDefinition(session, sqlQuery);
                "ORDER BY 'name'";

            "use " + DBUtils.getQuotedIdentifier(session.getDataSource(), schema));
import org.jkiss.dbeaver.model.connection.DBPDriver;

        return catalog != null && supportsCrossDatabaseQueries(dataSource) ?
        return driver.getSampleURL().contains(":sqlserver");
        JDBCPreparedStatement dbStat = session.prepareStatement(query);
                "AND o.uid = ?\n" +
                return sql.toString();
                return new DBException(
        return !useDefaultFunction
                        return true;
                case "master_files":
    }
    }
        // Now we use only PROP_AUTHENTICATION but here we support all legacy SQL Server configs
        /* dead code! */
                case "synonyms":
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCConnectionImpl;
                    break;
            session,
 */
            return matcher.group(1).toUpperCase();
    public static SQLServerAuthentication detectAuthSchema(DBPConnectionConfiguration connectionInfo) {
 *
            String authProp = connectionInfo.getProviderProperty(SQLServerConstants.PROP_AUTHENTICATION);
            return false;
                case "computed_columns":
    private static final Pattern TEMPDB_TABLE_NAME_PATTERN =
                    + "' database.");
    ) {
                    sql.append(dbResult.getString(1));
     *     #name__ <122 more underscores> __000000000018
        String query;
        boolean isSqlServer = isDriverSqlServer(driver);
        }

    /**

            }

    public static boolean isActiveDirectoryAuth(DBPConnectionConfiguration connectionInfo) {
    }
    }
                case "table_types":
     * After call to DB might return NULL on error or if a caller does not have permission to view the object definition.
    private static String doRequestObjectDefinition(@NotNull JDBCSession session, @NotNull String sqlQuery)
    private static String getFullDeclarationFirstKeyWord(@NotNull String ddl) {
        @NotNull SQLServerObject object
                throw new DBDatabaseException(secondException, dataSource);
     * @return select function with single string column containing object definition
     */
                    "Cross-database queries are not supported in this version of SQL Server. Create a new connection to the '"
    }
        return getSystemTableName(database, SQLServerConstants.SYS_TABLE_EXTENDED_PROPERTIES);
        return CommonUtils.toBoolean(container.getConnectionConfiguration().getProviderProperty(SQLServerConstants.PROP_SHOW_ALL_SCHEMAS));
     * which uses a byte-pair for representing a code point of the text.
            }
        }

        var firstKeyword = SQLUtils.getFirstKeyword(sqlDialect, ddl);
    public static String getExtendedPropsTableName(SQLServerDatabase database) {
    @Nullable
    private static final Log log = Log.getLog(SQLServerUtils.class);

                    return "(SELECT CAST(1 AS SMALLINT) AS class, CAST('OBJECT_OR_COLUMN' AS VARCHAR(60)) AS class_desc, d.objoid AS major_id, d.objsubid AS minor_id, CAST('MS_Description' AS VARCHAR(128)) AS name, d.description AS value FROM pg_description d) AS";
                    return "(SELECT t.name, t.object_id, t.principal_id, t.schema_id, t.parent_object_id, CAST('U' AS text) AS type, CAST('USER_TABLE' AS text) AS type_desc, t.create_date, t.modify_date, t.is_ms_shipped, t.is_published, t.is_schema_published FROM sys.tables t WHERE has_schema_privilege(t.schema_id, 'USAGE') = TRUE UNION ALL SELECT v.name, v.object_id, v.principal_id, v.schema_id, v.parent_object_id, CAST('V' AS text) AS type, CAST('VIEW' AS text) AS type_desc, v.create_date, v.modify_date, v.is_ms_shipped, v.is_published, v.is_schema_published FROM sys.all_views v WHERE has_schema_privilege(v.schema_id, 'USAGE') = TRUE UNION ALL SELECT f.name, f.object_id, f.principal_id, f.schema_id, f.parent_object_id, CAST('F' AS text) AS type, CAST('FOREIGN_KEY_CONSTRAINT' AS text) AS type_desc, f.create_date, f.modify_date, f.is_ms_shipped, f.is_published, f.is_schema_published FROM sys.foreign_keys f WHERE has_schema_privilege(f.schema_id, 'USAGE') = TRUE UNION ALL SELECT p.name, p.object_id, p.principal_id, p.schema_id, p.parent_object_id, CAST('PK' AS text) AS type, CAST('PRIMARY_KEY_CONSTRAINT' AS text) AS type_desc, p.create_date, p.modify_date, p.is_ms_shipped, p.is_published, p.is_schema_published FROM sys.key_constraints p WHERE has_schema_privilege(p.schema_id, 'USAGE') = TRUE UNION ALL SELECT pr.name, pr.object_id, pr.principal_id, pr.schema_id, pr.parent_object_id, pr.type, pr.type_desc, pr.create_date, pr.modify_date, pr.is_ms_shipped, pr.is_published, pr.is_schema_published FROM sys.procedures pr WHERE has_schema_privilege(pr.schema_id, 'USAGE') = TRUE UNION ALL SELECT p.relname AS name, p.oid AS object_id, CAST(NULL AS integer) AS principal_id, s.oid AS schema_id, 0 AS parent_object_id, CAST('SO' AS VARCHAR(2)) AS type, CAST('SEQUENCE_OBJECT' AS VARCHAR(60)) AS type_desc, CAST(NULL AS sys.datetime) AS create_date, CAST(NULL AS sys.datetime) AS modify_date, 0 AS is_ms_shipped, 0 AS is_published, 0 AS is_schema_published FROM pg_class p JOIN pg_namespace s ON s.oid = p.relnamespace WHERE s.nspname <> 'information_schema' AND s.nspname <> 'pg_catalog' AND p.relkind = 'S' AND has_schema_privilege(s.oid, 'USAGE') = TRUE) AS";
                    log.debug("Babelfish doesn't currently provide filesystem information for " + tableName + "!");
        return JDBCUtils.queryString(
            if (singleSource != null) {
    @NotNull
                "WHERE type = 'U'\n" +
        @NotNull String ddl
import org.jkiss.dbeaver.model.sql.SQLUtils;
            + "." + tableName;

        try (JDBCSession session = DBUtils.openMetaSession(monitor, database, "Check extended property")) {
     * To change original database sql with the "create" word to the "create and replace" for altering
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            query = "SELECT t.name, p.rows, SUM(a.total_pages) * 8 AS totalSize, SUM(a.used_pages) * 8 AS usedSize\n" +
                    if (dbResult.next()) {
            if (authProp != null) {
        if (singleSource != null) {
        /* dead code! */
    }
     * Some databases return size of a given column in bytes, and in such case
    }
        boolean useDefaultFunction


                dbStat.setLong(2, majorId);
        var sqlDialect = dataSource.getSQLDialect();

 * Copyright (C) 2010-2026 DBeaver Corp and others
                    return "(SELECT CAST(CONCAT('DF_',  o.relname, '_', d.oid) AS VARCHAR(20)) AS name, d.oid AS object_id, CAST(NULL AS INT) AS principal_id, o.relnamespace AS schema_id, d.adrelid AS parent_object_id, CAST('D' AS CHAR(2)) AS type, CAST('DEFAULT_CONSTRAINT' AS VARCHAR(60)) AS type_desc, CAST(NULL AS sys.datetime) AS create_date, CAST(NULL AS sys.datetime) AS modified_date, CAST(0 AS sys.bit) AS is_ms_shipped, CAST(0 AS sys.bit) AS is_published, d.adnum AS parent_column_id, pg_get_expr( d.adbin, d.adrelid ) AS definition, d.adbin, CAST(1 AS sys.bit) AS is_system_named FROM pg_catalog.pg_attrdef AS d INNER JOIN pg_catalog.pg_class AS o ON d.adrelid = o.oid) AS";
        {
            ? "SELECT OBJECT_DEFINITION(%d)".formatted(objectId)
            }
        SQLServerDataSource dataSource = database.map(SQLServerDatabase::getDataSource).orElseGet(object::getDataSource);
    /**
                "data_pages(db_id(), o.id, 0) * (@@maxpagesize) AS 'totalSize'\n" +
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        var fullDeclarationFirstKeyWord = getFullDeclarationFirstKeyWord(strippedQuery);
    ) {
    public static String getSystemTableFQN(@NotNull JDBCDataSource dataSource, @NotNull DBSCatalog database, @NotNull String tableName, boolean isSQLServer) {
        if (isDriverBabelfish(container.getDriver()))
    public static boolean isWindowsAuth(DBPConnectionConfiguration connectionInfo) {
        return ddl;


                if (schema != null && singleSource != null) {
            }
            }
    }
            query = "SELECT convert(varchar(100),o.name) AS 'name',\n" +

            SQLServerConstants.SQL_SERVER_SYSTEM_SCHEMA
    public static String getCurrentUser(JDBCSession session) throws SQLException {
                case "check_constraints":

    }
        // Detect auth schema
    }
                    return "(SELECT i.indrelid AS object_id, c.relname AS name, CASE i.indisclustered WHEN TRUE THEN 1 ELSE 2 END AS type, CAST(CASE i.indisclustered WHEN TRUE THEN 'CLUSTERED' ELSE 'NONCLUSTERED' END AS VARCHAR(60)) AS type_desc, CASE i.indisunique WHEN TRUE THEN 1 ELSE 0 END AS is_unique, c.reltablespace AS data_space_id, 0 AS ignore_dup_key, CASE i.indisprimary WHEN TRUE THEN 1 ELSE 0 END AS is_primary_key, 1 AS is_unique_constraint, 0 AS fill_factor, 0 AS is_padded, CASE i.indisready WHEN TRUE THEN 0 ELSE 1 END AS is_disabled, 0 AS is_hypothetical, 1 AS allow_row_locks, 1 AS allow_page_locks, 0 AS has_filter, CAST(NULL AS TEXT) AS filter_definition, 0 AS auto_created, c.oid AS index_id FROM pg_class c JOIN pg_namespace s ON s.oid = c.relnamespace JOIN pg_index i ON i.indexrelid = c.oid LEFT JOIN pg_constraint constr ON constr.conindid = c.oid WHERE c.relkind = 'i' AND i.indislive = TRUE AND s.nspname <> 'information_schema' AND s.nspname <> 'pg_catalog') AS";

package org.jkiss.dbeaver.ext.mssql;
            catalogName = original.getCatalog();
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
     * <p>
    /**

     * it must be divided by {@code 2} to compensate the encoding.
import java.util.regex.Pattern;
                "SELECT 1 FROM "+ SQLServerUtils.getExtendedPropsTableName(database) +
     */
    public static String changeCreateToAlterDDL(
        return CommonUtils.toBoolean(connectionInfo.getProviderProperty(SQLServerConstants.PROP_CONNECTION_WINDOWS_AUTH)) ||
                    " with default_schema = " + DBUtils.getQuotedIdentifier(session.getDataSource(), schema));
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    @NotNull
                try {
            if (database != null && schemaName != null) {
        @Nullable String catalog,
        if (matcher.find()) {

     * @param useDefaultFunction if true will always fall back to default function
    public static boolean isDriverGeneric(DBPDriver driver) {
            return matcher.group(1);
                }
        if (CommonUtils.isNotEmpty(sql) && sql.contains("create") && !sql.contains("create or replace")) {
                "FROM " + SQLServerUtils.getSystemTableFQN(dataSource, catalog, "tables", true) + " t\n" +

    }
        }
import java.util.Optional;
import java.sql.Connection;
                "alter user " + DBUtils.getQuotedIdentifier(session.getDataSource(), currentUser) +
                StringBuilder sql = new StringBuilder();
            }
        return null;
     * }</pre>
    }
     * Attempts to extract the name part from a user-created {@code tempdb} table's name.
            }
        final SQLServerDataSource dataSource = database.getDataSource();
    public static SQLServerTableBase getTableFromQuery(DBCSession session, SQLQuery sqlQuery, SQLServerDataSource dataSource) throws DBException, SQLException {
     * This function will strip underscores and the tail number and return just {@code #name}.
        if (table != null) {
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
 * DBeaver - Universal Database Manager
            return false;
        return table instanceof SQLServerTableType;
            dataSource,
    }
                SQLServerSchema schema = database.getSchema(schemaName);
 */
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
    public static String extractSource(
            } else {
                    }
import java.sql.SQLException;
        if ("CREATE".equalsIgnoreCase(firstKeyword) && !"CREATE OR ALTER".equalsIgnoreCase(fullDeclarationFirstKeyWord)) {
                    return "(SELECT c.oid AS object_id, a.attname AS name, a.attnum AS column_id, t.oid AS system_type_id, t.oid AS user_type_id, a.attlen AS max_length, CAST(NULL AS INTEGER) AS precision, CAST(NULL AS INTEGER) AS scale, coll.collname AS collation_name, (CASE a.attnotnull WHEN TRUE THEN 0 ELSE 1 END) AS is_nullable, 0 AS is_ansi_padded, 0 AS is_rowguidcol, 0 AS is_identity, 0 AS is_computed, 0 AS is_filestream, 0 AS is_replicated, 0 AS is_non_sql_subscribed, 0 AS is_merge_published, 0 AS is_dts_replicated, 0 AS is_xml_document, 0 AS xml_collection_id, COALESCE(d.oid, CAST(0 AS oid)) AS default_object_id, COALESCE((SELECT TOP(1) pg_constraint.oid FROM pg_constraint WHERE pg_constraint.conrelid = t.oid AND pg_constraint.contype = 'c' AND array_position(pg_constraint.conkey, a.attnum) IS NOT NULL), CAST(0 AS oid)) AS rule_object_id, 0 AS is_sparse, 0 AS is_column_set, 0 AS generated_always_type, CAST('NOT_APPLICABLE' AS VARCHAR(60)) AS generated_always_type_desc, CAST(NULL AS integer) AS encryption_type, CAST(NULL AS VARCHAR(64)) AS encryption_type_desc, CAST(NULL AS TEXT) AS encryption_algorithm_name, CAST(NULL AS INTEGER) AS column_encryption_key_id, CAST(NULL AS TEXT) AS column_encryption_key_database_name, 0 AS is_hidden, 0 AS is_masked FROM pg_attribute a JOIN pg_class c ON c.oid = a.attrelid JOIN pg_type t ON t.oid = a.atttypid JOIN pg_namespace s ON s.oid = c.relnamespace LEFT JOIN pg_attrdef d ON c.oid = d.adrelid AND a.attnum = d.adnum LEFT JOIN pg_collation coll ON coll.oid = t.typcollation WHERE a.attnum > 0 AND a.attisdropped = FALSE AND (c.relkind = 'r' OR c.relkind = 'v' OR c.relkind = 'm' OR c.relkind = 'f' OR c.relkind = 'p') AND has_column_privilege(CONCAT(quote_ident(s.nspname), '.', quote_ident(c.relname)), a.attname, 'SELECT,INSERT,UPDATE,REFERENCES') = TRUE AND has_schema_privilege(s.oid, 'USAGE') = TRUE) AS";
            sql = sql.replaceFirst("create", "create or replace");
/**
    }
                    return "(SELECT CAST(c.conname AS sys.sysname) AS name, CAST(oid AS INTEGER) AS object_id, CAST(c.connamespace AS INTEGER) AS principal_id, CAST(c.connamespace AS INTEGER) AS schema_id, CAST(conrelid AS INTEGER) AS parent_object_id, CAST('C' AS CHAR(2)) AS type, CAST('CHECK_CONSTRAINT' AS VARCHAR(60)) AS type_desc, CAST(NULL AS sys.datetime) AS create_date, CAST(NULL AS sys.datetime) AS modify_date, CAST(0 AS sys.bit) AS is_ms_shipped, CAST(0 AS sys.bit) AS is_published, CAST(0 AS sys.bit) AS is_schema_published, CAST(0 AS sys.bit) AS is_disabled, CAST(0 AS sys.bit) AS is_not_for_replication, CAST(0 AS sys.bit) AS is_not_trusted, (SELECT TOP(1) CAST(parent_column_id AS INTEGER) FROM unnest(c.conkey) parent_column_id), CAST(pg_get_constraintdef(c.oid) AS text) AS definition, CAST(1 AS sys.bit) AS uses_database_collation, CAST(0 AS sys.bit) AS is_system_named FROM pg_catalog.pg_constraint AS c WHERE c.contype = 'c' AND c.conrelid <> 0) AS";
            case 1: return DBSForeignKeyModifyRule.CASCADE;
            return true;
        var matcher = pattern.matcher(ddl);
     * the "CREATE" keyword is replaced with "CREATE OR ALTER". Otherwise, it is replaced with "ALTER".
    public static boolean isDriverBabelfish(DBPDriver driver) {
        }
        var replacement = dataSource.isAtLeastV16() ? "CREATE OR ALTER" : "ALTER";
     * Checks whether the {@code nchar} and {@code nvarchar} are stored in the UCS-2 encoding
    public static boolean isUnicodeCharStoredAsBytePairs(@NotNull DBPDataSource dataSource) {
        JDBCUtils.executeSQL(session,
        if (isDriverBabelfish(driver)) {
        }
            case 2: return DBSForeignKeyModifyRule.SET_NULL;
            isSQLServer? SQLServerConstants.SQL_SERVER_SYSTEM_SCHEMA : SQLServerConstants.SYBASE_SYSTEM_SCHEMA)
        @NotNull DBRProgressMonitor monitor,
            }
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.exec.DBCException;

            if (croosDatabaseMatcher.find()) {
                dbStat.setInt(1, objectClass.getClassId());
        return !isDriverAzure(dataSource.getContainer().getDriver());
    public static String selectObjectDefinitionDescriptionSQL(
        return e;
        DBCEntityMetaData singleSource = sqlQuery.getEntityMetadata(false);
import org.jkiss.dbeaver.model.DBPDataSource;
    public static String stripTempdbTableName(@NotNull String name) {
            log.debug("Error checking extended property in dictionary", e);
                    return "(SELECT parameters.object_id, parameters.name, parameters.parameter_id, parameters.system_type_id, parameters.user_type_id, CAST(CASE WHEN t.typlen < 0 THEN -1 ELSE t.typlen END AS smallint) AS max_length, CAST(0 AS sys.tinyint) AS precision, CAST(0 AS sys.tinyint) AS scale, CAST(CASE WHEN parameters.mode = 'o' OR parameters.mode = 'b' THEN 1 ELSE 0 END AS sys.bit) AS is_output, CAST(0 AS sys.bit) AS is_cursor_ref, CAST(0 AS sys.bit) AS has_default_value, CAST(0 AS sys.bit) AS is_xml_document, NULL AS default_value, CAST(0 AS sys.int) AS xml_collection_id, CAST(CASE WHEN parameters.mode <> 'o' AND parameters.mode <> 'b' THEN 1 ELSE 0 END AS sys.bit) AS is_readonly, CAST(1 AS sys.bit) AS is_nullable, CAST(1 AS sys.int) AS encryption_type, CAST(NULL AS sys.nvarchar(64)) AS encryption_type_desc, CAST(NULL AS sys.sysname) AS encryption_algorithm_name, CAST(NULL AS sys.int) AS column_encryption_key_id, CAST(NULL AS sys.sysname) AS column_encryption_key_database_name FROM (SELECT p.oid AS object_id, unnest(p.proargnames) AS name, generate_subscripts(p.proallargtypes, 1) AS parameter_id, unnest(p.proallargtypes) AS system_type_id, unnest(p.proallargtypes) AS user_type_id, unnest(p.proargmodes) AS mode FROM pg_catalog.pg_proc p UNION ALL SELECT p.oid AS object_id, '' AS name, 0 AS parameter_id, p.prorettype AS system_type_id, p.prorettype AS user_type_id, 'o' AS mode FROM pg_catalog.pg_proc p) AS parameters INNER JOIN pg_type t ON t.oid = parameters.user_type_id) AS";
    @NotNull
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            database.getName(),
    public static String getSystemSchemaFQN(


                case "allocation_units":
            return false;
            "select schema_name()");
                "row_count(db_id(), o.id) AS 'rows',\n" +
                "INNER JOIN " + SQLServerUtils.getSystemTableFQN(dataSource, catalog, "allocation_units", true) + " a ON p.partition_id = a.container_id\n" +
     *
    public static boolean isDriverAzure(DBPDriver driver) {
            "select original_login()");
                dbStat.setString(2, table.getName());
    private static final Pattern CROSS_DATABASE_QUERY_ERROR_PATTERN =
import org.jkiss.dbeaver.model.sql.DBSQLException;
                "WHERE t.schema_id = ?\n" + (table != null ? "AND t.object_id=?\n" : "") +
    }
import org.jkiss.dbeaver.DBException;
        return dbStat;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
import org.jkiss.dbeaver.model.exec.DBCEntityMetaData;
            : "SELECT definition FROM " + systemSchema + ".sql_modules WHERE object_id = %d".formatted(objectId);
    public static String getCurrentDatabase(JDBCSession session) throws SQLException {

    @NotNull
    }
                    + croosDatabaseMatcher.group(1).split("\\.")[0]
                return DBSForeignKeyModifyRule.NO_ACTION;
    @NotNull
        Connection original = null;
public class SQLServerUtils {
                }
        boolean isDriverAzure = isSqlServer && isDriverAzure(driver);
                "GROUP BY t.name, p.rows";
                (table != null ? " AND 'name'=?\n" : "") +
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return JDBCUtils.queryString(
    public static boolean isShowAllSchemas(DBPDataSource dataSource) {
        return JDBCUtils.queryString(

        }

            original = ((JDBCConnectionImpl) session).getOriginal();
import org.jkiss.code.NotNull;
        @NotNull DBRProgressMonitor monitor,
            database.map(SQLServerDatabase::getName).orElse(null),
        String systemSchema = getSystemSchemaFQN(
            case 0: return DBSForeignKeyModifyRule.NO_ACTION;
                case "sequences":
        if (matcher.matches()) {
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
 * Unless required by applicable law or agreed to in writing, software
        if (session instanceof JDBCConnectionImpl) {
                "FROM " + SQLServerUtils.getSystemTableFQN(dataSource, catalog, "sysobjects", false) +  " o\n" +
        }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

        return driver.getSampleURL().startsWith("jdbc:jtds");
                "data_pages(db_id(), o.id, 0) AS 'pages',\n" +
        }
                    break;
                default:
                    log.warn("Bad auth schema: " + authProp);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            "select db_name()");
        @NotNull SQLServerDataSource dataSource,
                } catch (IllegalArgumentException e) {
    public static DBSForeignKeyModifyRule getForeignKeyModifyRule(int actionNum) {
    }
    }
        return SQLServerUtils.getSystemSchemaFQN(
                dbStat.setLong(3, minorId);

                case "indexes":
    public static String getSystemTableName(SQLServerDatabase database, String tableName) {
import org.jkiss.dbeaver.Log;
    }
import org.jkiss.utils.CommonUtils;
        if (isDriverAzure && !dataSource.isServerVersionAtLeast(SQLServerConstants.SQL_SERVER_2012_VERSION_MAJOR, 0)) {
        if (catalogName != null) {
                    return "(SELECT TOP 0 *, CAST('' AS sys.nvarchar(1035)) AS base_object_name FROM sys.objects WHERE type = 'SN') AS";
        if (isDriverBabelfish(dataSource.getContainer().getDriver())) {
        final DBPDataSourceContainer container = dataSource.getContainer();
        return true;
    ) {
            dataSource,
                schemaName = singleSource.getSchemaName();

 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull JDBCDataSource dataSource,
            connectionInfo.getProperty(SQLServerConstants.PROP_CONNECTION_AUTHENTICATION));
     * @return a tripped table name, or {@code null} if the supplied name
     *
        }
                case "index_columns":
            (isActiveDirectoryAuth(connectionInfo) ? SQLServerAuthentication.AD_PASSWORD : SQLServerAuthentication.SQL_SERVER_PASSWORD);

        }
     * @param sql string query (can be nullable, will be checked)
     * @param name name of a table in {@code tempdb} database
                case "all_objects":
            String schemaName = null;
    }
        @NotNull String systemSchema
                case "extended_properties":
                case "triggers":
            JDBCUtils.executeSQL(session,

                    return "(SELECT i.indrelid AS object_id , i.indexrelid AS index_id , a.attrelid AS index_column_id , a.attnum AS column_id , a.attnum AS key_ordinal , CAST(0 AS SMALLINT) AS partition_ordinal , CAST(0 AS SMALLINT) AS is_descending_key , CAST(1 AS SMALLINT) AS is_included_column FROM pg_index AS i INNER JOIN pg_catalog.pg_attribute a ON i.indexrelid = a.attrelid) AS";
    @NotNull
        if (isSQLServer) {
                    return "(SELECT format_type(t.oid, NULL) AS name, t.oid AS system_type_id, t.oid AS user_type_id, s.oid AS schema_id, CAST(NULL AS INTEGER) AS principal_id, t.typlen AS max_length, 0 AS precision, 0 AS scale, c.collname AS collation_name, CASE t.typnotnull WHEN TRUE THEN 0 ELSE 1 END AS is_nullable, CASE t.typcategory WHEN CAST('U' AS CHAR) THEN 1 ELSE 0 END AS is_user_defined, 0 AS is_assembly_type, 0 AS default_object_id, 0 AS rule_object_id, 0 AS is_table_type, t.oid AS type_table_object_id, 0 AS is_memory_optimized FROM pg_type t JOIN pg_namespace s ON s.oid = t.typnamespace LEFT JOIN pg_collation c ON c.oid = t.typcollation) AS";
        return auth;
     * <p>
            session,
        }
    public static JDBCPreparedStatement prepareTableStatisticLoadStatement(@NotNull JDBCSession session, @NotNull JDBCDataSource dataSource, @NotNull DBSCatalog catalog, long schemaId, @Nullable DBSTable table, boolean isSQLServer) throws SQLException {
        }
     * Generates SQL for selecting the Transact-SQL source text of the definition of a specified object.
        if (!CommonUtils.isEmpty(currentUser)) {
                "LEFT OUTER JOIN " + SQLServerUtils.getSystemTableFQN(dataSource, catalog, "schemas", true) + " s ON t.schema_id = s.schema_id\n" +
    ) throws DBException {

        try (JDBCPreparedStatement dbStat = session.prepareStatement(sqlQuery)) {
            switch (tableName) {
        return SQLServerConstants.AUTH_ACTIVE_DIRECTORY_PASSWORD.equals(
 * See the License for the specific language governing permissions and
            } catch (SQLException secondException) {
 * limitations under the License.
    public static String getCurrentSchema(JDBCSession session) throws SQLException {
import org.jkiss.dbeaver.model.exec.DBCSession;
     * <p>
    /**
                CommonUtils.toBoolean(connectionInfo.getProperties().get(SQLServerConstants.PROP_CONNECTION_INTEGRATED_SECURITY));
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        String catalogName = null;
    throws DBCException, SQLException {
        }
            if (schemaName == null && original != null) {

     * doesn't resemble a {@code tempdb}'s table name.
        );
    }
    public static void setCurrentSchema(JDBCSession session, String currentUser, String schema) throws SQLException {
     * <pre>{@code
     * unique 6-byte hexadecimal number at the end:
    public static boolean isDriverSqlServer(DBPDriver driver) {
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.code.Nullable;
     */

        dbStat.setLong(1, schemaId);

    }
            default:
import org.jkiss.dbeaver.model.sql.SQLQuery;
        }
    public static void setCurrentDatabase(JDBCSession session, String schema) throws SQLException {
            }
                "INNER JOIN " + SQLServerUtils.getSystemTableFQN(dataSource, catalog, "partitions", true) + " p ON i.object_id = p.OBJECT_ID AND i.index_id = p.index_id\n" +
        return driver.getId().contains("babelfish");
                case "all_columns":
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
    public static boolean supportsCrossDatabaseQueries(JDBCDataSource dataSource) {
        final DBPDriver driver = dataSource.getContainer().getDriver();
        Pattern.compile("^(#.*?)_*[0-9A-Z]{12}$");
            && (dataSource.isDataWarehouseServer(monitor) || isDriverAzure(dataSource.getContainer().getDriver()))
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;

    }
            }
        return SQLServerUtils.getSystemSchemaFQN(dataSource, database.getName(), SQLServerConstants.SQL_SERVER_SYSTEM_SCHEMA) + "." + tableName;
    /**
        }
                    return "(SELECT d.adrelid AS object_id, a.attname AS name, a.attnum AS column_id, a.atttypid AS system_type_id, a.atttypid AS user_type_id, CAST(0 AS SMALLINT) AS is_persisted, CAST(1 AS SMALLINT) AS is_computed, CAST(1 AS SMALLINT) AS uses_database_collation, pg_get_expr(d.adbin, d.adrelid) AS definition FROM pg_attrdef d JOIN pg_attribute a ON d.adrelid = a.attrelid AND d.adnum = a.attnum WHERE a.attgenerated = 's') AS";
                " WHERE [class] = ? AND [major_id] = ? AND [minor_id] = ? AND [name] = N'MS_Description'")) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Read source code")) {
 * SQLServerUtils
     *
        long objectId = object.getObjectId();
     *
                case "default_constraints":
        return sql;
            String sqlQuery = selectObjectDefinitionDescriptionSQL(monitor, object, false);
                    return "(SELECT name, object_id, CAST(1 AS sys.bit) AS parent_class, CAST('OBJECT_OR_COLUMN' AS sys.nvarchar(60)) AS parent_class_desc, parent_object_id AS parent_id, type, type_desc, create_date, modify_date, is_ms_shipped, CAST(0 AS sys.bit) AS is_disabled, CAST(1 AS sys.bit) AS is_not_for_replication, CAST(0 AS sys.bit) AS is_instead_of_trigger FROM sys.objects WHERE type = 'TR' OR type = 'TA') AS";
        /* dead code! */
