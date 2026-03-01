                // External schema
        "EMPTYASNULL",
    @Override
        @Override

 * distributed under the License is distributed on an "AS IS" BASIS,

    public static final int RS_ERROR_CODE_NOT_CONNECTED = 500150;

    public boolean supportsExternalTypes() {
    @Override
        "TEMP",
        "AES256",
            }
        dialect.addExtraFunctions(REDSHIFT_FUNCTIONS_CONDITIONAL);
    }
    }
        "OWNER",
                }
        "BLANKSASNULL",
                }
    @Override
            if (redshiftVersion.getMajor() > major) {
        return dataSource.getClass() != PostgreDataSource.class;
import org.jkiss.dbeaver.ext.postgresql.model.*;
                if (CommonUtils.isEmpty(name) ||
        return false;
        "NULLAS",
        "IGNOREBLANKLINES",

        }
 * you may not use this file except in compliance with the License.

    
    public int getParameterBindType(DBSTypedObject type, Object value) {

import org.jkiss.dbeaver.model.DBPErrorAssistant;
            if (!CommonUtils.isEmpty(serverVersion)) {
        "DISTKEY",
        return false;
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase database, @Nullable PostgreSchema object, @Nullable String objectName) throws SQLException {
 */

    public boolean supportsCommentsOnRole() {
    }
    }
        "LZOP",
        String className = object.getClass().getName();
        "EMPTYASNULL",

        @Override
    @Override

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        "NOLOAD",
        // That's a silly workaround (see #11912, #12691)

            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    }
        "SORTKEY",
        "FILLRECORD",

    
        "CASE_SENSITIVE",

        "ACCEPTANYDATE",
                        }
                    }
import org.jkiss.dbeaver.DBException;
        } else if (kind == PostgreClass.RelKind.v) {

 */
    public PostgreTableBase createNewRelation(DBRProgressMonitor monitor, PostgreSchema schema, PostgreClass.RelKind kind, Object copyFrom) throws DBException {
    public static String[] REDSHIFT_EXTRA_KEYWORDS = new String[]{
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        if (redshiftVersion == null) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        "ENCRYPTION",
                            redshiftVersion = new Version(versionStr);
        }
    }
    }

import java.util.Map;
import org.jkiss.dbeaver.model.DBUtils;
    public boolean supportsDatabaseSize() {
        "PERMISSIONS",
    @Override
            return ErrorType.CONNECTION_LOST;
    }
        // Do not populate default PG properties like "ssl"
        "BZIP2",
    @Override

import java.util.Arrays;
        "TEXT32K",
            String esOptions = esSchemaMap.get(name);
        "DEFLATE",
import java.sql.Types;
        return false;
        dialect.addExtraKeywords(REDSHIFT_EXTRA_KEYWORDS);
                        esSchemaMap.put(esSchemaName, esSchemaOptions);
        if (value instanceof String) {
        "GLOBALDICT256",

                return true;
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
    @Override
            return super.prepareLookupStatement(session, database, object, objectName);
                        String versionStr = matcher.group(1);
    @Override
        }
            } catch (Throwable e) {
    public String readTableDDL(DBRProgressMonitor monitor, PostgreTableBase table) throws DBException {

    }
        return true;
            }
                }
package org.jkiss.dbeaver.ext.postgresql.model.impls.redshift;
    public String getProceduresSystemTable() {
            }

        if (kind == PostgreClass.RelKind.r) {
            return new RedshiftTable(schema, dbResult);
 *
                    (PostgreSchema.isUtilitySchema(name) && !owner.getDataSource().getContainer().getNavigatorSettings().isShowUtilityObjects())) {
        "LUN",
        "GZIP",
                }
        return false;
                }
    public void configureDialect(PostgreDialect dialect) {
        int errorCode = SQLState.getCodeFromException(error);
    public boolean supportsAcl() {

        return false;
        private final Map<String, String> esSchemaMap = new HashMap<>();
    public void initDefaultSSLConfig(DBPConnectionConfiguration connectionInfo, Map<String, String> props) {
   
            String serverVersion = dataSource.getServerVersion();
    }
    public boolean supportsCustomDataTypes() {
        }


        return false;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        "MOSTLY32",
 *
    @Override
        "READRATIO",
import org.osgi.framework.Version;
        return false;
            return Types.VARCHAR;
    @Override
    @Override
    @Override
        "TAG",

        "REJECTLOG",
    public boolean supportsMaterializedViews() {
            if (esOptions != null) {
    @Override

        "DELTA32K",
    public PostgreTableBase createRelationOfClass(PostgreSchema schema, PostgreClass.RelKind kind, JDBCResultSet dbResult) {
        return isRedshiftVersionAtLeast(1, 0, 6118);
        @NotNull
        "AES128",
    @Override

    public String getProceduresOidColumn() {
    @Override
                    }
    };
        super(dataSource);

            throw new DBDatabaseException(e, table.getDataSource());

    }
        return false;
    @Override

        }
    public int getTruncateToolModes() {
        return false;
    @Override
    }

        } else if (kind == PostgreClass.RelKind.v) {
        "MODEL",
    @Override
        "ENCRYPT",
        return 0;
                    if (matcher.find()) {
    public boolean supportSerialTypes() {
        if (kind == PostgreClass.RelKind.r) {
 * Licensed under the Apache License, Version 2.0 (the "License");

    public boolean supportsFunctionDefRead() {
        "COMPOUND",
                        if (!CommonUtils.isEmpty(versionStr)) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    String ddl = sql.toString().trim();
    public boolean supportsStoredProcedures() {
    }
        return false;
                } catch (Exception e) {
    private boolean isRedshiftVersionAtLeast(int major, int minor, int micro) {
    @Override
    public boolean supportsClientInfo() {
    }
        return false;

        "DISTSTYLE",
            } else {
        @Override
        "MOSTLY8",
    @NotNull
        "TRUNCATECOLUMNS",
import org.jkiss.dbeaver.model.DBPKeywordType;
            }

            super.clearCache();
        if (redshiftVersion != null) {
                dbStat.setString(1, table.getSchema().getName());
        "COPY",

                        if (line == null) {

        "CREDENTIALS",
                    log.debug("Error getting Redshift version", e);

            esSchemaMap.clear();
    public boolean supportsAlterTableColumnWithUSING() {

    @Override
    @Override
    }
        }
        "BYTEDICT",
                try {
    public boolean supportsRules() {
 * See the License for the specific language governing permissions and
 * PostgreServerRedshift
        try (JDBCSession session = DBUtils.openMetaSession(monitor, table, "Load Redshift table DDL")) {
            return new RedshiftView(schema, dbResult);

    @Override
    public boolean supportsBackslashStringEscape() {
                    Matcher matcher = Pattern.compile("Redshift ([0-9\\.]+)").matcher(serverVersion);
        "BACKUP",
    }
    }
        "MAXERROR",
    @Override
    private static final String[] REDSHIFT_OTHER_TYPES_FUNCTION = {

        "EXPLICIT",
    }
        "UNLOAD",
    }
        "STATUPDATE"        
                log.debug("Error reading Redshift external schemas", e);
        return false;
                } else if (redshiftVersion.getMinor() == minor) {
                    while (resultSet.next()) {
        "WALLET",
        return false;
        "IGNOREALLERRORS",
        "NVL",
    
    @Override
            }
    @Override
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

    private static final Log log = Log.getLog(PostgreServerRedshift.class);
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerExtensionBase;
        return super.createRelationOfClass(schema, kind, dbResult);
                    }

        // Redshift has support for roles only as a part of the EE extension.
    @Override
    public boolean supportsLocks() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        "LZO",
    public ErrorType discoverErrorType(@NotNull Throwable error) {

    }
            esSchemaMap.clear();

public class PostgreServerRedshift extends PostgreServerExtensionBase implements DBPErrorAssistant {

        return false;
        "REMOVEQUOTES",
 * Unless required by applicable law or agreed to in writing, software
    public String getServerTypeName() {
    @Override

                        sql.append(line).append("\n");
        }
                    return ddl;
    @Override
    public PostgreDatabase.SchemaCache createSchemaCache(PostgreDatabase database) {
    public PostgreServerRedshift(PostgreDataSource dataSource) {
    }
                    }
    }
    };
 * You may obtain a copy of the License at
        return null;

                        String esSchemaName = dbResult.getString("schemaname");
        }
            return new RedshiftTable(schema);

        return true;
        "YES",
    @Override
        "DATASHARE",
        "MOSTLY16",
        return false;
                    StringBuilder sql = new StringBuilder();
        "RECOVER",
    };
    }
        }
    @Override
    public ErrorPosition[] getErrorPosition(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext context, @NotNull String query, @NotNull Throwable error) {
        "OID",
        "PIVOT",
    }

        }
        "COMPUPDATE",

/**
        return supportsStoredProcedures() ? "prooid" : super.getProceduresOidColumn();
        return supportsStoredProcedures() ? "pg_proc_info" : super.getProceduresSystemTable();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        return false;
    }
    public boolean supportsSequences() {
        "RESORT",
    @Override
        "TRUNCATECOLUMNS",
    }
    private Version redshiftVersion;
    @Override
        "NVL2"
    }
    }
        return true;
    private class RedshiftSchemaCache extends PostgreDatabase.SchemaCache {
        return false;
        "TEXT255",
    @Override
        return false;
            } else if (redshiftVersion.getMajor() == major) {
                    return true;
        "GLOBALDICT64K",
        "AZ64",
    public boolean supportsAlterTableForViewRename() {
 *
    }
        "OFFLINE",
                    "WHERE schemaname=? AND tablename=?")) {
                "SELECT * FROM " + DBUtils.getQuotedIdentifier(database) + ".pg_catalog.svv_external_schemas")) {
        return false;
                    return null;
        protected PostgreSchema fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
            return new RedshiftView(schema);
    }
    public boolean isAlterTableAtomic() {
        "UNPIVOT",
        } catch (Exception e) {
        "EXPLICIT_IDS",
    public boolean supportsIndexes() {
    @Override
        "TOP",
    public boolean supportsNativeClient() {
}    @Override
        "CASE_INSENSITIVE",

                return new RedshiftExternalSchema(owner, name, esOptions, resultSet);
import org.jkiss.dbeaver.Log;
    @Override
    public boolean supportsForeignServers() {
                    redshiftVersion = new Version(1, 0,0);
        return true;
    public boolean supportsEntityMetadataInResults() {
                        String line = resultSet.getString("ddl");
        "DEFRAG",
    public boolean supportsTriggers() {
                        }
    }
                    if (ddl.endsWith(";")) {
    }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        "ROUNDEC",
    }
                if (redshiftVersion.getMinor() > minor) {
import org.jkiss.utils.CommonUtils;

    }
    }
    }
                    while (dbResult.next()) {

import org.jkiss.code.Nullable;
        "ACCEPTINVCHARS",
    public static String[] REDSHIFT_FUNCTIONS_CONDITIONAL = new String[]{

    public boolean supportsPartitions() {
    }
        return false;
                    return redshiftVersion.getMicro() >= micro;
                        String esSchemaOptions = dbResult.getString("esoptions");

        return null;
        public void clearCache() {
        if (errorCode == RS_ERROR_CODE_CHANNEL_CLOSE || errorCode == RS_ERROR_CODE_NOT_CONNECTED) {
    @Override
            String name = JDBCUtils.safeGetString(resultSet, "nspname");
        dialect.addKeywords(Arrays.asList(REDSHIFT_OTHER_TYPES_FUNCTION), DBPKeywordType.OTHER);
 * DBeaver - Universal Database Manager
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    @Override
        "DELTA",
import org.jkiss.dbeaver.model.sql.SQLState;
        return new RedshiftSchemaCache();
        "SNAPSHOT",
                        ddl = ddl.substring(0, ddl.length() - 1).trim();
import java.util.HashMap;
    }

/*
    @Override
        return false;
        return true;
        return false;
        "BLANKSASNULL",
        "TRIMBLANKS",
import java.util.regex.Matcher;
        return true;
    @Nullable
    }
        return false;
    public boolean supportsRelationSizeCalc() {
    @Override
    public boolean supportsEncodings() {

    }
        "IGNOREHEADER",
        "TIMEFORMAT",

    @Override
    public boolean supportsOids() {

        return super.getParameterBindType(type, value);
        "ALLOWOVERWRITE",
        "RAW",
import org.jkiss.dbeaver.DBDatabaseException;
            // 1. Read all external schemas info
    public boolean supportsInheritance() {
        return super.createNewRelation(monitor, schema, kind, copyFrom);
    public boolean supportsRoles() {
        return "Redshift";
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
import java.sql.SQLException;
    @Override
        "INTERLEAVED",
    public boolean supportsExtensions() {
        "COMPROWS",
        "DATEFORMAT",
        "MINUS",
                return new RedshiftSchema(owner, name, resultSet);
    }
        "VACUUM",
 * limitations under the License.
        return className.equals(RS_OBJECT_CLASS);
    public static final String RS_OBJECT_CLASS = "com.amazon.redshift.util.RedshiftObject";
    public boolean isPGObject(@NotNull Object object) {
    }
        "AUTO",
        "TDES",
                try (JDBCResultSet resultSet = dbStat.executeQuery()) {
    public static final int RS_ERROR_CODE_CHANNEL_CLOSE = 500366;
    @Override
        "LUNS",
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        "SYSDATE"
                dbStat.setString(2, table.getName());
    }
                RedshiftQueries.DDL_EXTRACT_VIEW + "\n" +
import java.util.regex.Pattern;
    public boolean supportsTablespaces() {
        "EVEN",
            // 2. Rad standard schemas
                            continue;
