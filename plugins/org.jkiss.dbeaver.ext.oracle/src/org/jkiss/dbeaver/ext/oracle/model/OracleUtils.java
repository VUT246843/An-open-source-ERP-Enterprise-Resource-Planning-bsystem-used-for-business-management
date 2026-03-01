    ) throws SQLException {
                }
            dbStat.setString(2, grantee.getName());
        StringBuilder ddlBuilder = new StringBuilder(ddl);
        }
		while (st.hasMoreTokens()) {
        if (useSysView) {
        throws DBException
        OracleTableBase object,
            }
 * Unless required by applicable law or agreed to in writing, software
        boolean useSysView = CommonUtils.toBoolean(dataSource.getContainer().getConnectionConfiguration().getProviderProperty(OracleConstants.PROP_METADATA_USE_SYS_SCHEMA));

            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
            if (!CommonUtils.isEmpty(attributes)) {
            String dbaView = "DBA_" + viewName;
import java.util.ArrayList;
                    DBUtils.getQuotedIdentifier(object.getSchema()) + "." + matcher.group(2) +
                    } else {
        } else {
                "SELECT STATUS FROM " + OracleUtils.getAdminAllViewPrefix(monitor, object.getDataSource(), "OBJECTS") + " WHERE OBJECT_TYPE=? AND OWNER=? AND OBJECT_NAME=?")) {

    }

            if (!CommonUtils.isEmpty(object.getTriggers(monitor))) {
     * @param sql the StringBuilder to append the DDL to
            session,
        Map<String, Object> options) throws DBException
                throw new DBDatabaseException(e, dataSource);
            if (dataSource.isViewAvailable(monitor, OracleConstants.SCHEMA_SYS, dbaView)) {
import java.util.regex.Matcher;

                    monitor,
        boolean useDBAView = CommonUtils.toBoolean(dataSource.getContainer().getConnectionConfiguration().getProviderProperty(OracleConstants.PROP_ALWAYS_USE_DBA_VIEWS));
        INDEX,

        }
            if (object != null) {
    }
    /**
            String schemaName = schema == null ? null : schema.getName();
                } else {
    public enum DBMSMetaGrantedObjectType {
            return reference;
            if (monitor.isCanceled()) {
            if (!ddl.endsWith(";")) {
    public static boolean getObjectStatus(
        try (JDBCPreparedStatement dbStat = session.prepareStatement(
        return ddl;
        TABLESPACE_QUOTA
     *     <li><b>ROLE_GRANT</b> - Roles granted to a user or another role.</li>
     */
        String sysViewName = OracleConstants.VIEW_DBA_SOURCE;
            dbStat.setString(1, objectType);
    {
        PARENT parent,
                } else {
        Matcher matcher = srcPattern.matcher(source);
        }
            }
                }
    }
                if (CommonUtils.isEmpty(objectComment)) {
    {
            if (!CommonUtils.isEmpty(object.getConstraints(monitor)) &&
                        ddl = CommonUtils.toString(ddlValue);
        return fetchDDL(session, objectType, objectName, null);
     * @param ddl the DDL string to append; if null or empty, nothing is added
            if (ddl == null) return "-- EMPTY DDL";
            }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        SYSTEM_GRANT,
                    String columnComment = column.getComment(monitor);
    @Nullable

                        } catch (IOException e) {
            if (ddlFormat == OracleDDLFormat.FULL) {
import org.jkiss.code.Nullable;
    public static void addDDLLine(@NotNull StringBuilder sql, @Nullable String ddl) {
                        }
                // Add grants info to main DDL

            } catch (SQLException e) {
        REF_CONSTRAINT,
        return source;
        String sourceType = object.getSourceType().name();
        if (schema != defaultSchema && defaultSchema != null) {
                String objectName = matcher.group(2);
            log.warn("Can't read source for custom source objects");
            // No dependent index DDL or something went wrong
    public static String getSysSchemaPrefix(OracleDataSource dataSource) {

    public static String formatWord(String word)

        OracleSchema schema = object.getContainer();
                    return invokeDBMSMetadataGetDependentDDL(session, schema, object, DBMSMetaDependentObjectType.REF_CONSTRAINT);
            return ddl;
            }
            }
        DBRProgressMonitor monitor,
    public static String insertCreateReplace(OracleSourceObject object, boolean body, String source) {
            }
import java.util.regex.Pattern;
                        }
                    parent,

        return OracleUtils.getSysSchemaPrefix(dataSource) + "ALL_" + viewName;
 * You may obtain a copy of the License at
                "ALTER SESSION SET CURRENT_SCHEMA=" + defaultSchema.getName(),
		}
        }
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
                }
                if (dbResult.next()) {
import org.jkiss.dbeaver.model.struct.DBStructUtils;
    }
    }
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
		}
        } catch (SQLException e) {
        OracleDDLFormat ddlFormat,
        String ddl = "";
            if (schema != null) {
                object.getObjectDefinitionText(monitor, DBPScriptObject.EMPTY_OPTIONS);
            "SELECT SYS_CONTEXT( 'USERENV', 'CURRENT_SCHEMA' ) FROM DUAL");

            List<OracleTableColumn> attributes = object.getAttributes(monitor);
            }
                    }
        if (reference instanceof String) {
            log.debug("Error reading object columns", e);

                }
            dbStat.setString(2, object.getName());
                    ddl = dbResult.getString(1).trim();
                dbStat.setString(1, body ? sourceType + " BODY" : sourceType);
        }
            }
		if (word == null) {
                try {
            "Set target schema",
        try (final JDBCSession session = DBUtils.openMetaSession(monitor, object, "Load source code for " + objectType + " '" + objectFullName + "'")) {
            final Matcher matcher = pattern.matcher(source);
			String word = st.nextToken();
        Pattern srcPattern = Pattern.compile("^(" + sourceType + ")\\s+(\"?\\w+\"?)(?:\\.(\"?\\w+\"?))?", Pattern.CASE_INSENSITIVE);
            if (dataSource.isAtLeastV9()) {
        } catch (DBException e) {
        if (sourceObject.getSourceType().isCustom()) {
                }
                    while (dbResult.next()) {
     *
        final OracleSchema sourceOwner = sourceObject.getSchema();
                        }
                DBEPersistAction.ActionType.FINALIZER));
			return "";
    }
                    ddlBuilder.append("\n");
            }
            } catch (SQLException e) {
            return source.trim();

        try (JDBCPreparedStatement dbStat = session.prepareStatement(query)) {
        String ddl = "";

                    }
        DBSObjectLazy<?> referrer,
                                "DBMS_METADATA.SET_TRANSFORM_PARAM(DBMS_METADATA.SESSION_TRANSFORM,'EMIT_SCHEMA'," + CommonUtils.getOption(options, DBPScriptObject.OPTION_FULLY_QUALIFIED_NAMES, true) + ");\n" +
		sb.append(Character.toUpperCase(word.charAt(0)));
                        ddl = buf.toString();
                        object.getDataSource().getContainer().fireEvent(new DBPEvent(DBPEvent.Action.OBJECT_UPDATE, object));
    }
            if (monitor.isCanceled()) return ddl;
        } catch (DBException e) {
     * @param session              the active JDBC session connected to the Oracle database
     *
        }
                        object.setName(DBObjectNameCaseTransformer.transformObjectName(object, objectName));
    }
        try (JDBCPreparedStatement dbStat = session.prepareStatement(
        ddl = ddl.trim();
                ddl += invokeDBMSMetadataGetDependentDDL(session, schema, object, DBMSMetaDependentObjectType.REF_CONSTRAINT);
        @NotNull JDBCSession session,
import org.jkiss.dbeaver.model.*;
            DBEPersistAction.ActionType.INITIALIZER));
                dbStat.setString(3, schema.getName());
                }
    {
            }
            return OracleUtils.getSysSchemaPrefix(dataSource) + "USER_" + viewName;
    private enum DBMSMetaDependentObjectType {
                "SELECT TEXT FROM " + getSysSchemaPrefix(sourceObject.getDataSource()) + sysViewName + " " +
import org.jkiss.dbeaver.model.struct.DBSObjectLazy;
            ddlBuilder.append("\n\n").append("COMMENT ON ").append(objectTypeName).append(" ").append(objectFullName).append(" IS ").
        }
                if (!CommonUtils.isEmpty(actions)) {
            dbStat.setString(2, objectName);
                }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
public class OracleUtils {
            if (monitor != null) {
import java.sql.SQLException;
                                "DBMS_METADATA.SET_TRANSFORM_PARAM(DBMS_METADATA.SESSION_TRANSFORM,'SQLTERMINATOR',true);\n" +
import org.jkiss.dbeaver.ext.oracle.model.source.OracleStatefulObject;
                    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                return DBStructUtils.generateTableDDL(monitor, object, options, true);
            if (ddlFormat != OracleDDLFormat.COMPACT) {
                        }
    public static String getSysUserViewName(DBRProgressMonitor monitor, OracleDataSource dataSource, String viewName)
				result.append(formatWord(word));
                    }
            }
            return "";
                        return null;
                if (sourceObject instanceof OracleJavaClass) {
            }
import org.jkiss.utils.IOUtils;
import org.jkiss.dbeaver.model.sql.SQLConstants;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        if (CommonUtils.isNotEmpty(ddl)) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
import org.jkiss.dbeaver.ext.oracle.edit.OracleTableColumnManager;
        OBJECT_GRANT,

            java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(
        DBRProgressMonitor monitor,
        if (!sourceObject.getDataSource().isViewAvailable(monitor, OracleConstants.SCHEMA_SYS, sysViewName)) {
    /**
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    public static String getSysCatalogHint(OracleDataSource dataSource)

            WHERE i.table_owner = NVL(?, SYS_CONTEXT('USERENV','CURRENT_SCHEMA'))
			}
        return ddl;
     * using Oracle's DBMS_METADATA.GET_GRANTED_DDL function.
     * </ul>
            FROM ALL_INDEXES i
     *     <li><b>OBJECT_GRANT</b> - Object-level privileges (e.g., SELECT, INSERT on specific tables or views).</li>
        if (monitor.isCanceled()) {
     *     <li><b>SYSTEM_GRANT</b> - System-level privileges granted to a user or role (e.g., CREATE SESSION).</li>
            log.debug("Error reading dependent DDL '" + dependentObjectType +
        ROLE_GRANT,
        }
    {
                if (dbResult.next()) {
                            source = new StringBuilder(200);
                StringBuilder ddlBuilder = new StringBuilder();
        if (matcher.find()) {

                log.warn("Object '" + reference + "' not found");
     * Enumeration of granted object types supported by Oracle's DBMS_METADATA.GET_GRANTED_DDL function.
                log.error("Error generating Oracle DDL. Generate default.", e);
                dbStat.setString(3, DBObjectNameCaseTransformer.transformObjectName(object, object.getName()));
                    AND c.constraint_type IN ('P', 'U')
        final String query = """
            dbStat.setString(1, object.getName());
        }
                ((DBPScriptObjectExt)object).getExtendedDefinitionText(monitor) :
            String source = body ?
                    }
            "ALTER SESSION SET CURRENT_SCHEMA=" + schema.getName(),
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
            }

/*
                dbStat.setString(2, sourceOwner.getName());
            log.debug("Error reading dependent DDL '" + dependentObjectType +
    }
        final String sourceType = sourceObject.getSourceType().name().replace("_", " ");
                    source.substring(matcher.end());
                    log.error("Can't apply DDL transform parameters", e);
     * @return the DDL string representing the granted privileges, or an empty string if none found or an error occurs
    ) {
    }
                        if (monitor.isCanceled()) {

            "SELECT DBMS_METADATA.GET_GRANTED_DDL(?,?) TXT FROM DUAL")) {
        monitor.beginTask("Load sources for '" + sourceObject.getName() + "'...", 1);
            } else {
                        if (sourceObject instanceof OracleJavaClass && !line.endsWith("\n")) {
            } else {
                return "CREATE OR REPLACE " + source;
    public static String getCurrentSchema(JDBCSession session) throws SQLException {
                !CommonUtils.getOption(options, DBPScriptObject.OPTION_DDL_SKIP_FOREIGN_KEYS) &&

        } catch (Exception e) {
                return object;
     * @param grantee              the grantee (user or role) whose granted privileges are to be fetched
              AND i.table_name = ?
            sysViewName = OracleConstants.VIEW_ALL_SOURCE;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    return "";
                }
			char c = word.charAt(i);
    public static String invokeDBMSMetadataGetGrantedDDL(
                    }
                ddl = ddlBuilder.toString();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                    } else {
            }
        @NotNull DBMSMetaGrantedObjectType dependentObjectType
                    }
    }
                "' for '" + grantee.getName() + "': " + e.getMessage());
                            log.warn("Can't write ddl query response to string", e);
        // Read main object DDL
            } else {
            log.debug("Error reading dependent DDL 'INDEX' for '"
     * Appends the provided DDL statement to the given SQL buffer with proper formatting.
            if (!CommonUtils.isEmpty(object.getIndexes(monitor))) {
                    if (source == null) {

            }
        }
        String objectName,
    public static String formatSentence(String sent)
        String objectFullName = DBUtils.getObjectFullName(object, DBPEvaluationContext.DDL);
            if (schema != null) {
                    JDBCUtils.executeProcedure(
        } catch (Exception e) {
        JDBCSession session,
        monitor.subTask("Load sources for " + objectType + " '" + objectFullName + "'...");
                                "DBMS_METADATA.SET_TRANSFORM_PARAM(DBMS_METADATA.SESSION_TRANSFORM,'REF_CONSTRAINTS'," + !CommonUtils.getOption(options, DBPScriptObject.OPTION_DDL_SEPARATE_FOREIGN_KEYS_STATEMENTS, true) + ");\n" +
                throw new DBCException(e, session.getExecutionContext());
 * you may not use this file except in compliance with the License.
    public static void setCurrentSchema(JDBCSession session, String schema) throws SQLException {
                // Add object and objects columns info to main DDL
            if (monitor.isCanceled()) return ddl;
                }
	{
                        "begin\n" +
 */
        OracleObjectType objectType)

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                    ddl = "\n\n" + dbResult.getString(1).trim();
			} else {
                sql.append(";");

        if (useDBAView) {
        throws DBCException
            monitor.done();

            if (monitor.isCanceled()) return ddl;
    }
    }
            return OracleConstants.SCHEMA_SYS + ".";
import java.util.List;
                        ddlBuilder.append("\n\n").append(indexDDL.trim());
                  SELECT c.index_name

            }
        JDBCSession session,
                                "DBMS_METADATA.SET_TRANSFORM_PARAM(DBMS_METADATA.SESSION_TRANSFORM,'SEGMENT_ATTRIBUTES'," + ddlFormat.isShowSegments() + ");\n" +
                    append(SQLUtils.quoteString(object.getDataSource(), objectComment)).append(SQLConstants.DEFAULT_STATEMENT_DELIMITER);
                        }
            actions.add(new SQLDatabasePersistAction(
    public static String normalizeSourceName(@NotNull DBRProgressMonitor monitor, @NotNull OracleSourceObject object, boolean body) {
            if (object instanceof OracleMaterializedView) {
                ddl += invokeDBMSMetadataGetDependentDDL(session, schema, object, DBMSMetaDependentObjectType.OBJECT_GRANT);
                            source.append("\n");
		StringTokenizer st = new StringTokenizer(sent, " \t\n\r-,.\\/", true);
                object = cache.getObject(
                List<DBEPersistAction> actions = new ArrayList<>();
            }
                            IOUtils.copyText(clobReader, buf);
        String objectType,
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
	}
import java.io.Reader;
        }
                dbStat.setString(2, object.getSchema().getName());
        OracleStatefulObject object,
                if (dbResult.next()) {
                        if (line == null) {

            }

        String ddl;
		}
            sql.append("\n").append(ddl);
              AND i.generated = 'N'
        OracleSchema schema = object.getSchema();
    {
        } finally {
                // Add index info to main DDL. For some reasons, GET_DDL returns columns, constraints, but not indexes
     * @param dependentObjectType  the type of granted object (e.g., SYSTEM_GRANT, ROLE_GRANT, OBJECT_GRANT)
                    return source;//.substring(0, matcher.start(1)) + object.getSchema().getName() + "." + objectName + source.substring(matcher.end(2));
     * Adds a semicolon at the end if it's not already present.
                        try (Reader clobReader = ((Clob) ddlValue).getCharacterStream()) {
                }
                        OracleTableColumnManager.addColumnCommentAction(actions, column, column.getTable());
                "' for '" + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + "': " + e.getMessage());
 * limitations under the License.

        } else {

                try (JDBCResultSet dbResult = dbStat.executeQuery()) {

    static <PARENT extends DBSObject> Object resolveLazyReference(
                    if (insertCreateReplace) {
import org.jkiss.dbeaver.model.exec.DBCException;
        } else {
			if (word.length() > 0) {
              AND i.index_name NOT IN (
                            "end;");
		return sb.toString();
 *
                    AND c.index_name IS NOT NULL
        }
		if (sent == null) {
                                "DBMS_METADATA.SET_TRANSFORM_PARAM(DBMS_METADATA.SESSION_TRANSFORM,'TABLESPACE'," + ddlFormat.isShowTablespace() + ");\n" +
        JDBCUtils.executeSQL(session,
        final OracleDataSource dataSource = object.getDataSource();
                    if (dbResult.next()) {
    public static void addSchemaChangeActions(DBCExecutionContext executionContext, List<DBEPersistAction> actions, OracleSourceObject object)
		return result.toString();
            return;
                }
        OBJECT_GRANT
        Object propertyId)
            """;
                }

                dbStat.setString(3, sourceName);
        final Object reference = referrer.getLazyReference(propertyId);
            // No dependent index DDL or something went wrong
                    StringBuilder source = null;
            return null;
                    } else {
        String objectName
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            if (object instanceof OracleTablePhysical) {
            }
     * These represent different categories of privileges that can be extracted as DDL statements.
    public static String fetchDDL(
		StringBuilder sb = new StringBuilder(word.length());
        return ddl;

     */
        }
            }
        String ddl = "";
            "ALTER SESSION SET CURRENT_SCHEMA=" + DBUtils.getQuotedIdentifier(session.getDataSource(), schema));
}
 *
        DBRProgressMonitor monitor,
        }
                        String line = dbResult.getString(1);
import java.io.IOException;
        DBSObjectCache<PARENT,?> cache,
                String sourceName;

        if (sourceOwner == null) {

    public static String getAdminAllViewPrefix(DBRProgressMonitor monitor, OracleDataSource dataSource, String viewName)
                    AND c.table_name = ?
package org.jkiss.dbeaver.ext.oracle.model;
     */
    }

                        return false;

                    "WHERE TYPE=? AND OWNER=? AND NAME=? " +
        if (dataSource.isViewAvailable(monitor, OracleConstants.SCHEMA_SYS, dbaView)) {
            sql.append("\n");
	{
        if (!CommonUtils.isEmpty(objectComment)) {
                } catch (SQLException e) {
                    int lineCount = 0;
                    // Do not add semicolon in the end
              )
import org.jkiss.code.NotNull;
    @NotNull
                "\\s(\\s*)([\\w$\\.\\\"]+)[\\s\\(]+", java.util.regex.Pattern.CASE_INSENSITIVE);
        }
     * Retrieves the granted DDL for a specific grantee and object type
    public static String getSource(DBRProgressMonitor monitor, OracleSourceObject sourceObject, boolean body, boolean insertCreateReplace) throws DBCException
                CommonUtils.getOption(options, DBPScriptObject.OPTION_DDL_SEPARATE_FOREIGN_KEYS_STATEMENTS)) {
    {
			return "";
                if (!CommonUtils.isEmpty(object.getConstraints(monitor))) {
                        log.warn(objectType.getTypeName() + " '" + object.getName() + "' not found in system dictionary");
				sb.append('I');
 * See the License for the specific language governing permissions and

                        source.append(line);
    private static String invokeDBMSMetadataGetDependentDDL(JDBCSession session, OracleSchema schema, OracleTableBase object, DBMSMetaDependentObjectType dependentObjectType) {

        String dbaView = "DBA_" + viewName;
 * DBeaver - Universal Database Manager
            sourceType += " BODY";
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {

        }
                "Set current schema",
        if (schema == null) {
                    return null;
                    sourceName = ((OracleJavaClass) sourceObject).getSourceName();
    }
		for (int i = 1; i < word.length(); i++) {
        return ddl;
                        lineCount++;
            String objectTypeName = "TABLE";

            }
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        String objectType,
import org.jkiss.utils.CommonUtils;
		StringBuilder result = new StringBuilder();
                        ddlBuilder.append("\n").append(action.getScript()).append(SQLConstants.DEFAULT_STATEMENT_DELIMITER);
                    if (indexDDL != null) {
                    (String) reference);
            Object object;
                                "DBMS_METADATA.SET_TRANSFORM_PARAM(DBMS_METADATA.SESSION_TRANSFORM,'CONSTRAINTS',true);\n" +
            return "-- ???? CUSTOM SOURCE";
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    private static String invokeDBMSMetadataGetDependentIndexDDL(JDBCSession session, OracleSchema schema, OracleTableBase object) {
                if (objectName.indexOf('.') == -1) {
            dbStat.setString(3, schemaName);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.DBDatabaseException;
    @Nullable
        }
    }
                                "DBMS_METADATA.SET_TRANSFORM_PARAM(DBMS_METADATA.SESSION_TRANSFORM,'STORAGE'," + ddlFormat.isShowStorage() + ");\n" +

            if (source == null) {

        }
                dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
                        if (source == null) {
        if (body) {
                object = cache.getCachedObject((String) reference);
import java.sql.Clob;
    }
            if (matcher.find()) {
                ddl = addCommentsToDDL(monitor, object, ddl);
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
import org.jkiss.dbeaver.Log;
    public static String fetchDDL(
        return ddlBuilder.toString();
            return null;
                    }
                        return OracleConstants.RESULT_STATUS_VALID.equals(dbResult.getString(OracleConstants.COLUMN_STATUS));
    /**
                            break;
                        monitor.subTask("Line " + lineCount);
                    Object ddlValue = dbResult.getObject(1);
            }
    private static final Log log = Log.getLog(OracleUtils.class);
    public static String getDDL(
                        StringWriter buf = new StringWriter();
            if (monitor.isCanceled()) return ddl;
    }
                            // Java source
     * <ul>
                return "CREATE OR REPLACE " + matcher.group(1) + " " +
                        return insertCreateReplace(sourceObject, body, source.toString());
        CONSTRAINT,
            } else {
                  FROM ALL_CONSTRAINTS c
                        return source.toString();
            }
        return JDBCUtils.queryString(
	}
            SELECT DBMS_METADATA.GET_DDL('INDEX', i.index_name, i.owner) AS ddl
                return OracleUtils.getSysSchemaPrefix(dataSource) + dbaView;
        OracleSchema defaultSchema = ((OracleExecutionContext)executionContext).getDefaultSchema();
                    if (!objectName.equalsIgnoreCase(object.getName())) {
			if ((c == 'i' || c == 'I') && sb.charAt(i - 1) == 'I') {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, object, "Refresh state of " + objectType.getTypeName() + " '" + object.getName() + "'")) {

        String objectFullName = object.getFullyQualifiedName(DBPEvaluationContext.DDL);
    private static String addCommentsToDDL(DBRProgressMonitor monitor, OracleTableBase object, String ddl) {
 * Oracle utils
                    log.warn("No DDL for " + objectType + " '" + objectName + "'");
                for (OracleTableColumn column : CommonUtils.safeCollection(attributes)) {
import org.jkiss.dbeaver.DBException;

import java.io.StringWriter;
import java.util.Map;
                  WHERE c.owner = NVL(?, SYS_CONTEXT('USERENV','CURRENT_SCHEMA'))
                    "ORDER BY LINE")) {
                    String indexDDL = dbResult.getString(1);
            try (JDBCPreparedStatement dbStat = session.prepareStatement(

				sb.append(Character.toLowerCase(c));
     *
            log.error(e);
    {
			}
        return dataSource.isUseRuleHint() ? "/*+RULE*/" : "";
            log.warn("No source owner for object '" + sourceObject.getName() + "'");
            }
                    }
                } else {
            if (CommonUtils.getOption(options, DBPScriptObject.OPTION_DDL_ONLY_FOREIGN_KEYS)) {
                ddl += invokeDBMSMetadataGetDependentDDL(session, schema, object, DBMSMetaDependentObjectType.TRIGGER);
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
                "\\b" + object.getSourceType() + "\\b"+ (body ? "\\s+BODY" : "") +
                "SELECT DBMS_METADATA.GET_DEPENDENT_DDL('" + dependentObjectType.name() + "',?" + (schema == null ? "" : ",?") + ") TXT FROM DUAL")) {
                throw new DBCException(e, session.getExecutionContext());
        try (final JDBCSession session = DBUtils.openMetaSession(monitor, sourceOwner, "Load source code for " + sourceType + " '" + sourceObject.getName() + "'")) {

/**
    {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull OracleGrantee grantee,
                            line = "";
        } catch (Exception e) {
                    if (!CommonUtils.isEmpty(columnComment)) {
    }
            if (matcher.group(3) == null) {
            "SELECT DBMS_METADATA.GET_DDL(?,?" + (schema == null ? "" : ",?") + ") TXT FROM DUAL")) {
        }
            
                return null;
            String ddl = fetchDDL(session, objectType, object.getName(), schema);

            }
                objectTypeName = "MATERIALIZED VIEW";
        try {
                + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + "': " + e.getMessage());
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        session,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            dbStat.setString(4, object.getName());
        try {
        actions.add(0, new SQLDatabasePersistAction(
        }
     *     <li><b>TABLESPACE_QUOTA</b> - Tablespace quotas granted to a user or role (e.g., QUOTA 100M / UNLIMITED ON a tablespace).</li>
 */
                    sourceName = sourceObject.getName();
            dbStat.setString(1, dependentObjectType.name());
            return OracleUtils.getSysSchemaPrefix(dataSource) + dbaView;
                    if (ddlValue instanceof Clob) {
            if (monitor.isCanceled()) return ddl;

                return reference;
 *
                while (dbResult.next()) {
        try (JDBCPreparedStatement dbStat = session.prepareStatement(
                ddl += invokeDBMSMetadataGetDependentIndexDDL(session, schema, object);
		}
    ) throws SQLException {
        @Nullable OracleSchema schema
                dbStat.setString(2, schema.getName());
import java.util.StringTokenizer;
                    for (DBEPersistAction action : actions) {
        String objectComment = object.getComment(monitor);
        TRIGGER,
                }
                return "";
    }
        String objectType,
            return "";
        }

                dbStat.setString(1, objectType.getTypeName());
            dbStat.setString(1, schemaName);
