        this.outputReader = new OracleOutputReader();
        @NotNull DBPConnectionConfiguration connectionInfo
                Map<String, String> paramsMap = new LinkedHashMap<>();
            );
            if (passwordInfo.getNewPassword() == null) {
            case DBPDataSource.FEATURE_MAX_STRING_LENGTH:
                    "PLAN_TABLE not found in current user's session. " +
                    OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner, "TYPES") + " WHERE OWNER IS NULL ORDER BY TYPE_NAME");


package org.jkiss.dbeaver.ext.oracle.model;

    }
        }
        protected void invalidateObjects(DBRProgressMonitor monitor, OracleDataSource owner, Iterator<OracleSchema> objectIter) {
    }
                JDBCUtils.setFilterParameters(dbStat, 1, schemaFilters);
    }
                // Check DBA role
                    }
            if (positions.isEmpty()) {
    @Nullable
    // Constructor for tests
    @Override

            JDBCUtils.executeSQL(session, OracleConstants.PLAN_TABLE_DEFINITION.replace("${TABLE_NAME}", tableName));
        }
    }
            return DBPDataKind.CONTENT;
                }
                    if (CommonUtils.getBoolean(
        dataTypeCache.setCaseSensitive(false);
import org.jkiss.dbeaver.model.sql.SQLState;
    }
        }
                ) {
 * You may obtain a copy of the License at
        return new OracleExecutionContext(instance, type);
            Connection connection = super.openConnection(monitor, context, purpose);
        synchronized (availableViews) {
    public boolean isViewAvailable(@NotNull DBRProgressMonitor monitor, @Nullable String schemaName, @NotNull String viewName) {
            Driver driverInstance = getDriverInstance(monitor);
                }
            }
}
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBPConnectionConfiguration connectionInfo = getContainer().getActualConnectionConfiguration();
                throw new DBCException(e, context);
            outputReader = new OracleOutputReader();
            String[] candidateNames;
            }
    @Override
    @Nullable
        }
            }
                        "    end; \n" +
            if (planTableName == null) {
        schemaCache.setCache(Collections.singletonList(defSchema));
    @NotNull

//                }
            }
                    "\tF.TABLESPACE_NAME(+) = TS.TABLESPACE_NAME AND S.TABLESPACE_NAME(+) = TS.TABLESPACE_NAME")) {
            while (matcher.find()) {
    public TablespaceCache getTablespaceCache() {
        return super.getDataSourceFeature(featureId);
            return session.prepareStatement(
            return adapter.cast(new OracleQueryPlanner(this));
    };
public class OracleDataSource extends JDBCDataSource implements DBPObjectStatisticsCollector, DBPAdaptable, DBDPseudoAttributeContainer {
                        paramsMap.put("\"_optimizer_cost_based_transformation\"", "'OFF'");
    @NotNull
                System.setProperty(OracleConstants.VAR_ORACLE_NET_TNS_ADMIN, new File(clientHome.getPath(), OCIUtils.TNSNAMES_FILE_PATH).getAbsolutePath());
                    JDBCUtils.queryString(
        }
        if (!CommonUtils.isEmpty(message)) {
    ) throws DBCException {
    }
                schemasQuery.append("U.USERNAME IN (SELECT DISTINCT OWNER FROM ").append(OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner, "OBJECTS")).append(")");
import org.jkiss.dbeaver.model.connection.DBPDriver;

 *
            }
            DBDPseudoAttributeType.ROWID,
        }
            throw e;
                            optimizerVersion = OracleConstants.OPTIMIZER_VERSION_DEFAULT;
            schemasQuery.append(
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleDataSource owner) throws SQLException {
        return false;
    public boolean isAdminVisible() {
            return getContainer().getPreferenceStore().getBoolean(OracleConstants.PREF_DBMS_OUTPUT);
        }
                try (CallableStatement getLineProc = session.getOriginal().prepareCall("{CALL DBMS_OUTPUT.GET_LINE(?, ?)}")) {
        }
        }
                    getLineProc.registerOutParameter(2, java.sql.Types.INTEGER);
                    String showAdmin = connectionInfo.getProviderProperty(OracleConstants.PROP_ALWAYS_SHOW_DBA);
            DBDPseudoAttribute.PropagationPolicy.ROWSET_LOCAL
        return schemaCache == null ? null : schemaCache.getObject(monitor, this, name);
        }
import org.eclipse.osgi.util.NLS;
        if (divPos == -1) {
            return dataKind;
        @Override

        this.userCache.clearCache();

            List<OracleDataType> dtList = new ArrayList<>();
            return schema.getDataType(monitor, typeName);

            final JDBCPreparedStatement dbStat = session.prepareStatement(

                    DBPErrorAssistant.ErrorPosition pos = new DBPErrorAssistant.ErrorPosition();
                // Nope, its not it
        @NotNull
    @Association
                }
        new DBDPseudoAttribute(
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
                // Set session settings

import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
                    positions.add(pos);
            } catch (Exception e) {
            // Oracle server doesn't support single query cancel?
            }
    public Collection<OracleTablespace> getTablespaces(DBRProgressMonitor monitor) throws DBException {
        public boolean isAsyncOutputReadSupported() {

    }
            } catch (Throwable e) {
    @Nullable

    static class DataTypeCache extends JDBCObjectCache<OracleDataSource, OracleDataType> {
        }
        return (OracleSchema) DBUtils.getDefaultContext(this, true).getContextDefaults().getDefaultSchema();
        @Override
    public String getPlanTableName(JDBCSession session)
    @Override
    public boolean isAtLeastV10() {
            List<ErrorPosition> positions = new ArrayList<>();
 * limitations under the License.
    @Association
                throw new DBException("You can't set empty password");
                }
    final DataTypeCache dataTypeCache = new DataTypeCache();

        )

                            " WHERE 1<>1"))

                if (sessionLanguage != null) {
        protected OracleUser fetchObject(@NotNull JDBCSession session, @NotNull OracleDataSource owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
        return false;
                }
    }

        return this;
    private boolean isAdminVisible;
        String tnsPathProp = CommonUtils.toString(connectionInfo.getProviderProperty(OracleConstants.PROP_TNS_PATH));
    final ProfileCache profileCache = new ProfileCache();
        return dataTypeCache;
    }
            //}
            String schemaName = typeFullName.substring(0, divPos);
                available = false;
        switch (featureId) {
    static class ProfileCache extends JDBCStructCache<OracleDataSource, OracleUserProfile, OracleUserProfile.ProfileResource> {
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.code.NotNull;
            true,
        if (!CommonUtils.isEmpty(tnsPathProp)) {
        this.init();
                        dbStat.setFetchSize(1);

            //if (!CommonUtils.isEmpty(owner.activeSchemaName)) {
    @Override
    public Collection<OracleRecycledObject> getUserRecycledObjects(DBRProgressMonitor monitor) throws DBException {
    protected void initializeContextState(@NotNull DBRProgressMonitor monitor, @NotNull JDBCExecutionContext context, JDBCExecutionContext initFrom) throws DBException {
        @Override

                }
    }
    static class UserCache extends JDBCObjectCache<OracleDataSource, OracleUser> {
        super(monitor, container, new OracleSQLDialect());
                    pos.position = Integer.parseInt(matcher.group(1)) - 1;
                if (!CommonUtils.isEmpty(userName)) {
        }
                pos.position = Integer.parseInt(matcher.group(2)) - 1;
        @Override
            // Maybe OracleDatabaseException
                        "  dbms_sql.parse(  l_cursor, ?, dbms_sql.native ); \n" +

        int divPos = typeFullName.indexOf(SQLConstants.STRUCT_SEPARATOR);

                // Plan table not found - try to create new one
    @Override
    }

        SchemaCache() {
                try (CallableStatement stat = session.prepareCall(
            outputReader.isServerOutputEnabled());
        if (user != null) {
    public void cancelStatementExecute(DBRProgressMonitor monitor, JDBCStatement statement) throws DBException {
    @Override
        DBPConnectionConfiguration connectionInfo = getContainer().getActualConnectionConfiguration();

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return new OracleUser(owner, resultSet);
    /**
    @Override
                setNLSParameter(paramsMap, connectionInfo, "NLS_LENGTH_SEMANTICS", OracleConstants.PROP_SESSION_NLS_LENGTH_FORMAT);
        }
        String message = error.getMessage();
 */
        @NotNull
            } else {
                    pos.info = matcher.group(1);
            @NotNull DBRProgressMonitor monitor,
    }
            // PROP_CHECK_SCHEMA_CONTENT set to true when option "Hide empty schemas" is set
            String appName = DBUtils.getClientApplicationName(getContainer(), context, purpose);
    private String createPlanTable(JDBCSession session, String tableName) throws DBException {
import org.jkiss.utils.StandardConstants;
import org.jkiss.dbeaver.model.struct.DBSDataType;

    public void initialize(@NotNull DBRProgressMonitor monitor)
            OracleMessages.pseudo_column_rowid_description,
            throw new DBDatabaseException("Can't cancel session queries", e, this);
                        "    dbms_sql.close_cursor( l_cursor );\n" +
            }
                    getContainer().getPreferenceStore().getString(ModelPreferences.META_SEPARATE_CONNECTION)
        try {
    {
            }

        return schemaCache.getAllObjects(monitor, this);
        return isAdmin;
                    log.debug("Can't extract parse error info: " + e.getMessage());
            } catch (SQLException e) {
                );

            JDBCPreparedStatement dbStat = session.prepareStatement(schemasQuery.toString());
        @Override
 *     http://www.apache.org/licenses/LICENSE-2.0


        return super.createQueryTransformer(type);
                    : JDBCExecutionContext.TYPE_MAIN.equals(context.getContextName());
    @NotNull
 * DBeaver - Universal Database Manager
    private boolean hasStatistics;
    @Nullable
import java.util.*;
            return false;
            getContainer().persistConfiguration();
                "SELECT * FROM DBA_ROLES ORDER BY ROLE");
                SeparateConnectionBehavior behavior = SeparateConnectionBehavior.parse(
            return true;
            schemasQuery.append("SELECT U.* FROM ").append(OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner, "USERS")).append(" U\n");
    }

            monitor,
                    return null;
            }
                        "begin \n" +
     * OracleSchema or its children classes can be created by this method.
    }
            DBSObjectFilter schemaFilters = owner.getContainer().getObjectFilter(OracleSchema.class, null, false);
            connectProps.setProperty("oracle.jdbc.newPassword", passwordInfo.getNewPassword());
            boolean showAllSchemas = !showOnlyOneSchema && !CommonUtils.toBoolean(configuration.getProviderProperty(OracleConstants.PROP_CHECK_SCHEMA_CONTENT));
    }
import org.jkiss.dbeaver.model.exec.*;
    /**

        throws DBException {
        }
        if ((typeName.equals(OracleConstants.TYPE_NAME_GEOMETRY) || typeName.equals(OracleConstants.TYPE_FQ_GEOMETRY))) {
                String sessionLanguage = connectionInfo.getProviderProperty(OracleConstants.PROP_SESSION_LANGUAGE);
                final String newPlanTableName = candidateNames[0];


    @ForTest
 * GenericDataSource
    public Collection<OracleSchema> getSchemas(@NotNull DBRProgressMonitor monitor) throws DBException {
            ((OracleExecutionContext)context).refreshDefaults(monitor, true);
                JDBCUtils.executeSQL((JDBCSession) session, sql);
        }
    public DBDPseudoAttribute[] getPseudoAttributes() throws DBException {
        }
            DBPConnectionConfiguration configuration = owner.getContainer().getConnectionConfiguration();
            if (positions.isEmpty()) {
                    int errorPos = stat.getInt(2);
                    pos.info = matcher.group(1);
                    throw new DBCException("Null connection returned");
import org.jkiss.dbeaver.ext.oracle.model.plan.OracleQueryPlanner;
            // Program name
                        String tsName = dbResult.getString(1);
                    "SELECT\n" +
    protected Connection openConnection(@NotNull DBRProgressMonitor monitor, @Nullable JDBCExecutionContext context, @NotNull String purpose) throws DBCException {
    public Object getDataSourceFeature(String featureId) {
            return false;
        @Override
        }
        }
            appName = appName.replaceAll("[^ a-zA-Z0-9]", "?"); // Replace any special characters - Oracle don't like them
        public void enableServerOutput(DBRProgressMonitor monitor, DBCExecutionContext context, boolean enable) throws DBCException {
            return;
                };
        }
            connectProps.setProperty(DBConstants.PROP_USER, passwordInfo.getUserName());

                        isPasswordExpireWarningShown = true;
    public DataTypeCache getDataTypeCache() {

            // But we could try to cancel all
                DBPErrorAssistant.ErrorPosition pos = new DBPErrorAssistant.ErrorPosition();
            }
        // Obtain connection
    }
    }
        throws DBException {
        // Schema cache may be null during DataSource initialization
    }
import java.sql.*;
    @Nullable
    }
        }
            @Nullable DBCExecutionResult executionResult,

            return new OracleUserProfile.ProfileResource(parent, dbResult);
            try (JDBCSession session = (JDBCSession) context.openSession(monitor, DBCExecutionPurpose.UTIL, "Extract last error position")) {
            case NUMERIC: return OracleConstants.TYPE_NAME_NUMERIC;
            return false;
            case CONTENT:
    }
        return super.discoverErrorType(error);
        return CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter("supports-partitions-creation"), false);
        throws DBException {
                        dbStat.execute();

            available = availableViews.get(viewName);
                    stat.registerOutParameter(2, Types.INTEGER);
        return getSchemas(monitor);
    private void setNLSParameter(Map<String, String> paramsMap, DBPConnectionConfiguration connectionInfo, String oraNlsName, String paramName) {
                        "end;")) {
        }
        return userCache.getAllObjects(monitor, this);
        } else {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            try (Connection connection = driverInstance.connect(url, connectProps)) {


     * Returns true if partitions creation is supported.
    @Nullable
            System.setProperty(OracleConstants.VAR_ORACLE_NET_TNS_ADMIN, tnsPathProp);
        @Override
        @NotNull DBPDataSourceContainer container,
    }
            try (JDBCStatement dbStat = session.createStatement()) {
        throws DBException {
    void resetStatistics() {
        if (outputReader == null) {
    }
    }
 *
        }
        }
                        status = getLineProc.getInt(2);
                    try {
                if (!DBWorkbench.getPlatformUI().confirmAction(
    }
    @Override
    private OracleSchema publicSchema;
                        available = true;
import org.jkiss.dbeaver.model.sql.SQLConstants;
        return DBDPseudoAttribute.EMPTY_ARRAY;
                    // Something went wrong
            BeanUtils.invokeObjectMethod(connection, "cancel");
    }
                        // See #5633
            if (forObject != null) {
            if (clientHome != null) {
    }
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {
//                        "WHERE (U.USER_ID IN (SELECT DISTINCT OWNER# FROM SYS.OBJ$) ");

        // Set tns admin directory
        while (error instanceof DBException) {
                    pos.position = errorPos;
    }
            }
            // Simple type name
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;

                String sessionTerritory = connectionInfo.getProviderProperty(OracleConstants.PROP_SESSION_TERRITORY);


            } catch (SQLException e) {

    @Override
import org.jkiss.dbeaver.model.meta.ForTest;
                    }
                }
                    "ORDER BY RESOURCE_NAME");
                    for (Map.Entry<String, String> pe : paramsMap.entrySet()) {
            case DATETIME: return OracleConstants.TYPE_NAME_TIMESTAMP;
    public OracleSchema getDefaultSchema() {
        if (planTableName == null) {
        }
    @Association
        return isAdmin || isAdminVisible;
                while (matcher.find()) {
            paramsMap.put(oraNlsName, "'" + paramValue + "'");
                    "WHERE\n" +
     */
                    dbStat.setString(1, DBUtils.getUnQuotedIdentifier(owner, userName.toUpperCase(Locale.ENGLISH))); // Unquoted + upper = all this things only for lower-named users
        DBPDataKind dataKind = OracleDataType.getDataKind(typeName);
                }
                        }
    }
        }
        return super.resolveDataKind(typeName, valueType);
        return OracleSchema.class;
        return this.publicSchema;
            ((OracleExecutionContext)context).setCurrentSchema(monitor, ((OracleExecutionContext)initFrom).getDefaultSchema());

            DBPNativeClientLocation clientHome = getContainer().getNativeClientHome();

import org.jkiss.utils.BeanUtils;
    public static final DBDPseudoAttribute[] KNOWN_GLOBAL_PSEUDO_ATTRS = new DBDPseudoAttribute[] {
        super.refreshObject(monitor);
            default: return OracleConstants.TYPE_NAME_VARCHAR2;

import org.jkiss.dbeaver.ext.oracle.model.session.OracleServerSessionManager;
                        "SELECT 'YES' FROM USER_ROLE_PRIVS WHERE GRANTED_ROLE='DBA'"));
    public boolean isAdmin() {
    public ErrorPosition[] getErrorPosition(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext context, @NotNull String query, @NotNull Throwable error) {
        return getInfo().getDatabaseVersion().getMajor() >= 12;
                    "declare\n" +
                "BEGIN DBMS_OUTPUT.DISABLE; END;";
            throw new DBDatabaseException("Error creating PLAN table", e, this);
            if (schema == null) {
 *

                }
            boolean showOnlyOneSchema = CommonUtils.toBoolean(configuration.getProviderProperty(OracleConstants.PROP_SHOW_ONLY_ONE_SCHEMA));
        return getInfo().getDatabaseVersion().getMajor() >= 9;
                        }
                    (forObject == null ? "" : "WHERE PROFILE=? ") +
        if (hasStatistics && !forceRefresh) {
        @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        OracleUser user = userCache.getObject(monitor, this, name);
        return userCache.getObject(monitor, this, name);
                    DBPErrorAssistant.ErrorPosition pos = new DBPErrorAssistant.ErrorPosition();
        @Override
    }
        return true;
        }
        // Cache data types

        if (dataKind != null) {
        @NotNull
    public UserCache getUserCache() {
            return user;
    }
        try (final JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load tablespace '" + getName() + "' statistics")) {

    }
import java.util.regex.Pattern;
                    String viewNameQuoted = DBUtils.getQuotedIdentifier(this, viewName);
        if ((typeName.equals(OracleConstants.TYPE_NAME_XML) || typeName.equals(OracleConstants.TYPE_FQ_XML))) {
        @NotNull DBPDriver driver,

    @Override
    public boolean cancelCurrentExecution(@NotNull Connection connection, @Nullable Thread connectionThread) throws DBException {

            return getLocalDataType(typeFullName);
                setNLSParameter(paramsMap, connectionInfo, "NLS_CURRENCY", OracleConstants.PROP_SESSION_NLS_CURRENCY_FORMAT);
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleDataSource owner) throws SQLException {
        }

        return hasStatistics;
                this.isAdmin = "YES".equals(
            return adapter.cast(new OracleServerSessionManager(this));
            case BINARY:
        {
                    }

        Throwable rootCause = CommonUtils.getRootCause(error);
import org.jkiss.dbeaver.model.access.DBAPasswordChangeInfo;

    }
    public OracleUser getUser(DBRProgressMonitor monitor, String name) throws DBException {
    }
            return publicSchema;
                        }
            synchronized (availableViews) {
            return session.prepareStatement(
                    userName = JDBCUtils.queryString(session, "SELECT SYS_CONTEXT('USERENV', 'SESSION_USER') FROM DUAL");
                setNLSParameter(paramsMap, connectionInfo, "NLS_DATE_FORMAT", OracleConstants.PROP_SESSION_NLS_DATE_FORMAT);
                Object errorPosition = BeanUtils.readObjectProperty(error.getCause(), "errorPosition");
            return adapter.cast(outputReader);
                String userName = configuration.getUserName();
    @Override
    }
                    DBPErrorAssistant.ErrorPosition pos = new DBPErrorAssistant.ErrorPosition();
    }

/*

            null,
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleDataSource owner) throws SQLException {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructCache;
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleDataSource owner) throws SQLException {
    final public SchemaCache schemaCache = new SchemaCache();
                return null;
                        isAdminVisible = CommonUtils.getBoolean(showAdmin, false);
    public boolean supportsPartitionsCreation() {
/*
        }
            return session.prepareStatement(
            super.cancelStatementExecute(monitor, statement);

    @Association
            //schemasQuery.append("\nUNION ALL SELECT '").append(owner.activeSchemaName).append("' AS USERNAME FROM DUAL");
            }

    public boolean supportsSchedulerJobEdit() {
        Map<String, String> connectionsProps = new HashMap<>();

                }
        return super.getAdapter(adapter);
                }

                    return openConnection(monitor, context, purpose);
 * you may not use this file except in compliance with the License.
            //schemasQuery.append("\nORDER BY USERNAME");
                            output.println(null, getLineProc.getString(1));
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

        protected OracleUserProfile.ProfileResource fetchChild(@NotNull JDBCSession session, @NotNull OracleDataSource dataSource, @NotNull OracleUserProfile parent, @NotNull JDBCResultSet dbResult) throws SQLException, DBException {
            }
            throw new DBDatabaseException("Can't read tablespace statistics", e, getDataSource());
        }
            }
    }
        }
            resolveGeometryAsStruct = configurator.resolveGeometryAsStruct();
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
            return session.prepareStatement(
    }
    private OracleOutputReader outputReader;
                JDBCUtils.appendFilterClause(schemasQuery, schemaFilters, "U.USERNAME", false, owner);
        return planTableName;
            if (!showOnlyOneSchema && schemaFilters != null) {
            return connection;
    @NotNull
            @NotNull DBCExecutionContext context,
                    return new ErrorPosition[]{pos};
                // Here we could try to ask for expired password change
    private boolean driverSupportsQueryCancel() {
        } else if (adapter == DBAServerSessionManager.class) {
                    return ErrorType.FEATURE_UNSUPPORTED;
    }
        return new OracleDataSourceInfo(metaData);
        this.schemaCache.clearCache();
    }
import org.jkiss.dbeaver.model.access.DBAUserPasswordManager;

    @Association
        @Override
        @NotNull DBRProgressMonitor monitor,
                //throw new DBException(e);

            return adapter.cast(new OracleChangeUserPasswordManager(this));
        // Ref: https://stackoverflow.com/questions/21733300/oracle-password-expiry-and-grace-period-handling-using-java-oracle-jdbc
    @Override
                    dtList.add(dataType);
    private String planTableName;
                // This is supported  for thin driver since Oracle 12.2
        } else {
    }
    private final static Pattern ERROR_POSITION_PATTERN = Pattern.compile(".+\\s+line ([0-9]+), column ([0-9]+)");
                } catch (SQLException e) {
            return adapter.cast(new OracleStructureAssistant(this));
import org.jkiss.dbeaver.runtime.DBWorkbench;
        } else if (adapter == DBDAttributeContentTypeProvider.class) {
    }
        catch (Exception e) {
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
            for (Map.Entry<String, OracleDataType.TypeDesc> predefinedType : OracleDataType.PREDEFINED_TYPES.entrySet()) {
                if (errorPosition instanceof Number) {

        }
            case ROWID: return OracleConstants.TYPE_NAME_ROWID;
                    pos.line = Integer.parseInt(matcher.group(1)) - 1;
                try {

    final RoleCache roleCache = new RoleCache();
                break;
                } catch (SQLException e) {
        OracleSchema defSchema = new OracleSchema(this, -1, "TEST_SCHEMA");

import org.jkiss.dbeaver.Log;
        hasStatistics = false;
    protected JDBCExecutionContext createExecutionContext(JDBCRemoteInstance instance, String type) {
        super(container, new OracleSQLDialect());

                boolean isMetadataContext = isMetaConnectionSeparate
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
        }
        }
        if (passwordInfo == null) {

                useRuleHint = CommonUtils.getBoolean(useRuleHintProp, false);

            connectionsProps.put("v$session.program", CommonUtils.truncateString(appName, 48));
        } else {
                            (schemaName == null ? viewNameQuoted : DBUtils.getQuotedIdentifier(this, schemaName) + "." + viewNameQuoted) +
                planTableName = createPlanTable(session, newPlanTableName);
                this.isAdminVisible = isAdmin;
                        "      when others then ? := dbms_sql.last_error_position; \n" +
        if (available == null) {
                    stat.setString(1, query);
    @Association
            }
    }
                        "  begin \n" +
            String sql = enable ?
        }
            return new OracleTablespace(owner, resultSet);
            }
        public void readServerOutput(
            StringBuilder schemasQuery = new StringBuilder();

                    JDBCUtils.executeSQL(session, "SELECT 1 FROM " + candidate);
    public Collection<OracleUserProfile> getProfiles(DBRProgressMonitor monitor) throws DBException {
                        JDBCUtils.executeQuery(session, query.toString());
    }
        } else if (adapter == DBCQueryPlanner.class) {
    public boolean isAtLeastV11() {
        hasStatistics = false;
    public boolean isUseRuleHint() {
                    warninig = warninig.getNextWarning()
    @Override
    public boolean isAtLeastV12() {
    }
        protected JDBCStatement prepareChildrenStatement(@NotNull JDBCSession session, @NotNull OracleDataSource dataSource, @Nullable OracleUserProfile forObject) throws SQLException {
                if (isMetadataContext) {
                    "\tSYS.DBA_TABLESPACES TS,\n" +
        ) throws DBCException {
                    "Oracle PLAN_TABLE missing",

            DBWorkbench.getPlatformUI().showError("Error changing password", "Error changing expired password", e);
        @Override
            return owner.createSchemaImpl(owner, resultSet);

import org.jkiss.dbeaver.DBDatabaseException;
                    try (final JDBCPreparedStatement dbStat = session.prepareStatement(
    }
    }
    public OracleGrantee getGrantee(DBRProgressMonitor monitor, String name) throws DBException {
                candidateNames = new String[]{tableName};
            } catch (SQLException e) {
                schemasQuery.append("U.USERNAME IS NOT NULL");
                try (JDBCResultSet dbResult = dbStat.executeQuery(

                BeanUtils.invokeObjectMethod(connection, "cancel");
                "SELECT DISTINCT PROFILE FROM DBA_PROFILES ORDER BY PROFILE");
                }
        @NotNull
        if (driverSupportsQueryCancel()) {

        }
import org.jkiss.dbeaver.model.data.DBDPseudoAttribute;

            String tableName = getContainer().getPreferenceStore().getString(OracleConstants.PREF_EXPLAIN_TABLE_NAME);
        }
            "rownum",
        } else if (adapter == DBCServerOutputReader.class) {
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
        } catch (Throwable e) {
    }
                    return ErrorType.RESULT_SET_MISSING;

            try (JDBCSession session = context.openSession(monitor, DBCExecutionPurpose.META, "Set connection parameters")) {
            return resolveGeometryAsStruct ? DBPDataKind.STRUCT : DBPDataKind.OBJECT;

    @Override
        return roleCache.getObject(monitor, this, name);
import org.jkiss.dbeaver.model.exec.output.DBCOutputWriter;

        DBAPasswordChangeInfo passwordInfo = DBWorkbench.getPlatformUI().promptUserPasswordChange("Password has expired. Set new password.", connectionInfo.getUserName(), connectionInfo.getUserPassword(), true, true);
            }
                OracleMessages.oracle_password_will_expire_warn_name,
    }
            DBWorkbench.getPlatformUI().showWarningMessageBox(
                    "\t(SELECT TABLESPACE_NAME, SUM(BYTES) AVAILABLE_SPACE FROM DBA_DATA_FILES GROUP BY TABLESPACE_NAME) F,\n" +
    @Override
                NLS.bind(OracleMessages.oracle_password_will_expire_warn_description, warning.getMessage())
    @Override
        public boolean isServerOutputEnabled() {
                    return new ErrorPosition[]{pos};
                }

                    // Retry
                setNLSParameter(paramsMap, connectionInfo, "NLS_TIMESTAMP_FORMAT", OracleConstants.PROP_SESSION_NLS_TIMESTAMP_FORMAT);
                log.debug("Can't get connection warnings", e);
    public Collection<OracleUser> getUsers(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.ext.oracle.internal.OracleMessages;
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleDataSource owner) throws SQLException {
    // Statistics
                }
        }
    private final static Pattern ERROR_POSITION_PATTERN_2 = Pattern.compile(".+\\s+at line ([0-9]+)");
        return tableName;
        @NotNull DBRProgressMonitor monitor,
    public boolean supportsUserEdit() {

        return roleCache.getAllObjects(monitor, this);
        this.tablespaceCache.clearCache();
            final String url = getConnectionURL(connectionInfo);
    }
    ) throws DBException {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor)
                if (sessionTerritory != null) {
    @Override
                        getContainer().getPreferenceStore().getBoolean(OracleConstants.PROP_USE_META_OPTIMIZER))) {
        viewName = viewName.toUpperCase();
        @Override
        // Enable DBMS output
        if (adapter == DBSStructureAssistant.class) {
        }
        return tablespaceCache.getAllObjects(monitor, this);
            case BOOLEAN: return SQLConstants.DATA_TYPE_BOOLEAN;
            try {
            } else {
        return dataTypeCache.getCachedObject(typeName);
        try {
                if (!paramsMap.isEmpty()) {
                }

                if (this.isServerVersionAtLeast(typeDesc.serverAtLeastMajor, typeDesc.serverAtLeastMinor)) {
                case OracleConstants.EC_NO_RESULTSET_AVAILABLE:
    }
        @NotNull String purpose,
    @Nullable
    @Override
        String paramValue = connectionInfo.getProviderProperty(paramName);
                if (connection == null) {
        }

    @Override
        return useRuleHint;
        return available;
            }
    }
                dbStat.setString(1, forObject.getName());
        }
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
    public OracleSchema getSchema(DBRProgressMonitor monitor, String name) throws DBException {
                matcher = ERROR_POSITION_PATTERN_2.matcher(message);

import org.jkiss.dbeaver.model.struct.DBSStructureAssistant;
                        session,
            String typeName = typeFullName.substring(divPos + 1);
//                } else {
        //this.dataTypeCache.clearCache();
    final UserCache userCache = new UserCache();
        @Override
        return null;
                    case NEVER -> false;
        }
            }
                throw new DBDatabaseException("Can't cancel session queries", e, this);
    static class TablespaceCache extends JDBCObjectCache<OracleDataSource, OracleTablespace> {
            connectionInfo.setUserPassword(passwordInfo.getNewPassword());
                }
            return dbStat;


        if (error instanceof SQLException && SQLState.SQL_42000.getCode().equals(((SQLException) error).getSQLState())) {
                "SELECT * FROM " + OracleUtils.getSysUserViewName(session.getProgressMonitor(), owner, "TABLESPACES") + " ORDER BY TABLESPACE_NAME");
import org.jkiss.dbeaver.ModelPreferences.SeparateConnectionBehavior;
                        getLineProc.execute();
            DBPConnectionConfiguration connectionInfo = getContainer().getConnectionConfiguration();
 */
                    default -> !container.isForceUseSingleConnection();
        }
                        if (status == 0) {
                        log.error("Error settings Oracle session parameters", e);
                    }

            }
        @NotNull OracleSQLDialect dialect
                    // No such table
                    positions.add(pos);
        } catch (SQLException e) {
    static class SchemaCache extends JDBCObjectCache<OracleDataSource, OracleSchema> {

                        return null;
        if (rootCause instanceof SQLException sqlException) {
            switch (sqlException.getErrorCode()) {
        protected ProfileCache() {
                } catch (SQLException e) {
            if (!positions.isEmpty()) {
            try {
        @Override
        this.profileCache.clearCache();

            this.dataTypeCache.setCache(dtList);
                    OracleDataType dataType = new OracleDataType(this, predefinedType.getKey(), true);
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;
                        "    exception \n" +
    }
import org.jkiss.dbeaver.model.*;
                break;
            OracleSchema schema = getSchema(monitor, schemaName);
        OracleConfigurator configurator = GeneralUtils.adapt(this, OracleConfigurator.class);
                        "  l_cursor integer default dbms_sql.open_cursor; \n" +
    public DBPDataKind resolveDataKind(@NotNull String typeName, int valueType) {

        }
    }
                    while (status == 0) {
            for (String candidate : candidateNames) {
                        }
        {
            }
    }
                    stat.execute();
        protected OracleTablespace fetchObject(@NotNull JDBCSession session, @NotNull OracleDataSource owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
        } else if(adapter == DBAUserPasswordManager.class) {
        }
                return positions.toArray(new ErrorPosition[positions.size()]);

        Boolean available;
        return false;

        {
                "SELECT " + OracleUtils.getSysCatalogHint(owner) + " * FROM " +
    }
        DBPConnectionConfiguration connectionInfo = getContainer().getConnectionConfiguration();
                try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Check view existence")) {
                matcher = ERROR_POSITION_PATTERN_3.matcher(message);
                boolean isMetaConnectionSeparate = switch (behavior) {

            // Tablespace stats
            return adapter.cast(OracleAttributeContentTypeProvider.INSTANCE);
        throws DBException {
        return connectionsProps;
                }
                        if (!CommonUtils.isEmpty(optimizerVersion)) {
    private boolean useRuleHint;
    }
    private class OracleOutputReader implements DBCServerOutputReader {
                    log.debug("Error reading metadata", e);
    @Override
                            tablespace.fetchSizes(dbResult);
     */
            try (JDBCSession session = (JDBCSession) context.openSession(monitor, DBCExecutionPurpose.UTIL, "Read DBMS output")) {
                }


        this.roleCache.clearCache();

        }
            null,

                if (!isAdminVisible) {
        switch (dataKind) {
            monitor.subTask("Connecting for expired password change");
            return true;
            return new OracleRole(owner, resultSet);
        if (publicSchema != null && publicSchema.getName().equals(name)) {
    }
        }
                    while (dbResult.next()) {
import org.jkiss.dbeaver.DBException;
                        if (CommonUtils.isEmpty(optimizerVersion) && isServerVersionAtLeast(10, 2)) {
                    DBPErrorAssistant.ErrorPosition pos = new DBPErrorAssistant.ErrorPosition();
 * distributed under the License is distributed on an "AS IS" BASIS,
                candidateNames = new String[]{"PLAN_TABLE", "TOAD_PLAN_TABLE"};
            }
            return dbStat;
            } else if (showAllSchemas) {
            setListOrderComparator(DBUtils.<OracleSchema>nameComparator());
                    StringBuilder query = new StringBuilder("ALTER SESSION SET ");
    @Override
            }
            }
        this.initialize(monitor);
                    ? JDBCExecutionContext.TYPE_METADATA.equals(context.getContextName())
            Matcher matcher = ERROR_POSITION_PATTERN.matcher(message);
                        String optimizerVersion = connectionInfo.getProviderProperty(OracleConstants.PROP_USE_META_OPTIMIZER_VERSION);
/**
    public OracleDataSource(
            try {
    public DBDPseudoAttribute[] getAllPseudoAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
    public <T> T getAdapter(@NotNull Class<T> adapter) {
    public boolean isAtLeastV9() {
        if (CommonUtils.toBoolean(connectionInfo.getProviderProperty(OracleConstants.OS_AUTH_PROP))) {

    }
            context,
        @Override


            }
    public OracleDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
        protected OracleDataType fetchObject(@NotNull JDBCSession session, @NotNull OracleDataSource owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
import org.jkiss.dbeaver.model.exec.jdbc.*;
                        query.append(" ").append(pe.getKey()).append("=").append(pe.getValue());
        return KNOWN_GLOBAL_PSEUDO_ATTRS;
            connectionsProps.put(OracleConstants.CONN_PROP_SESSION_OS_USER, System.getProperty(StandardConstants.ENV_USER_NAME));
                availableViews.put(viewName, available);

            }
        this.init();
                "BEGIN DBMS_OUTPUT.ENABLE(" + OracleConstants.MAXIMUM_DBMS_OUTPUT_SIZE + "); END;" :
    private boolean isPasswordExpireWarningShown;


    public ErrorType discoverErrorType(@NotNull Throwable error) {
    private static final Log log = Log.getLog(OracleDataSource.class);
        @Override
    }
            try {
    @Override
    private final static Pattern ERROR_POSITION_PATTERN_3 = Pattern.compile(".+\\s+at position\\: ([0-9]+)");

                    getLineProc.registerOutParameter(1, java.sql.Types.VARCHAR);
        }

    @Override
        throws DBException {
                        paramsMap.put("\"_optimizer_squ_bottomup\"", "FALSE");
 * See the License for the specific language governing permissions and
        @NotNull
                    }
    public OracleSchema createSchemaImpl(@NotNull OracleDataSource owner, @NotNull JDBCResultSet resultSet) {

        try {
import org.jkiss.dbeaver.ModelPreferences;

    OracleSchema getPublicSchema() {
    final TablespaceCache tablespaceCache = new TablespaceCache();
            try (DBCSession session = context.openSession(monitor, DBCExecutionPurpose.UTIL, (enable ? "Enable" : "Disable ") + "DBMS output")) {
                    case ALWAYS -> true;
    }
        } finally {
    public Class<? extends OracleSchema> getPrimaryChildType(@Nullable DBRProgressMonitor monitor)
            return true;
        } catch (DBCException e) {
    public Collection<OracleSynonym> getPublicSynonyms(DBRProgressMonitor monitor) throws DBException {
                    continue;
                if (changeExpiredPassword(monitor, context, purpose)) {
//                if (owner.isAdmin() && false) {
                        if (tablespace != null) {
    @NotNull
                    paramsMap.put("NLS_LANGUAGE", "'" + sessionLanguage + "'");
    public OracleDataType resolveDataType(@NotNull DBRProgressMonitor monitor, @NotNull String typeFullName) throws DBException {
                pos.info = matcher.group(1);
                    }
    @NotNull

                }
import org.jkiss.dbeaver.model.data.DBDAttributeContentTypeProvider;
            error = error.getCause();
                    return ErrorType.AUTHENTICATION_FAILED;
                        connectionInfo.getProviderProperty(OracleConstants.PROP_USE_META_OPTIMIZER),
        @Override
    }

        return new OracleSchema(owner, resultSet);
    }
        super(monitor, container, dialect);
                    if (checkForPasswordWillExpireWarning(warninig)) {
                    {
                    }
            if (useRuleHintProp != null) {
                return 4000;
        }
            }
                    "\t(SELECT TABLESPACE_NAME, SUM(BYTES) USED_SPACE FROM DBA_SEGMENTS GROUP BY TABLESPACE_NAME) S\n" +
    public OracleDataType getLocalDataType(String typeName) {
                        "SELECT 1 FROM " +
    private boolean isAdmin;
            hasStatistics = true;
import org.jkiss.dbeaver.model.exec.output.DBCServerOutputReader;
            if (error.getCause() == null) {
            }
    }

        @Override
        }
        return getSchema(monitor, childName);
    }
                    if (errorPos <= 0) {
    }
        this.publicSchema = new OracleSchema(this, 1, OracleConstants.USER_PUBLIC);

    public Collection<OracleRole> getRoles(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.utils.CommonUtils;
        return publicSchema.getRecycledObjects(monitor);
        return this.userCache;
    }
    @Override
        }
        if (!CommonUtils.isEmpty(paramValue)) {
            schemasQuery.append(")");
                positions.add(pos);
        try {

import org.jkiss.code.Nullable;
            } else if (schemaFilters != null) {
                            paramsMap.put("OPTIMIZER_FEATURES_ENABLE", "'" + optimizerVersion + "'");
                } catch (SQLException e) {
            return session.prepareStatement(

        @NotNull
                    warninig != null && !isPasswordExpireWarningShown;
            @NotNull DBCOutputWriter output
            if (SQLState.getCodeFromException(e) == OracleConstants.EC_PASSWORD_EXPIRED) {
    protected DBPDataSourceInfo createDataSourceInfo(DBRProgressMonitor monitor, @NotNull JDBCDatabaseMetaData metaData) {
                case OracleConstants.EC_FEATURE_NOT_SUPPORTED:
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;


        }
            return new OracleDataType(owner, resultSet);
    protected Map<String, String> getInternalConnectionProperties(
        return profileCache.getAllObjects(monitor, this);
                while (matcher.find()) {
    @Override
    @Association
    private boolean changeExpiredPassword(DBRProgressMonitor monitor, JDBCExecutionContext context, String purpose) {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleDataSource owner) throws SQLException {
                schemasQuery.append("(U.USERNAME) = ?");

                    } catch (SQLException e) {
        throws DBException
            connectProps.setProperty(DBConstants.PROP_PASSWORD, passwordInfo.getOldPassword());
                    pos.position = ((Number) errorPosition).intValue();
            super("PROFILE");
            if (showOnlyOneSchema) {
            }
                log.warn(e);
            @Nullable DBCStatement statement,
                    if (showAdmin != null) {
            setListOrderComparator(DBUtils.<OracleSchema>nameComparator());
                    readDatabaseServerVersion(session, session.getMetaData());
                return OracleConstants.TYPE_NAME_BLOB;
                    "FROM\n" +
        if (!getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_CLIENT_NAME_DISABLE)) {
    }
                    }
    }
            }
        return getInfo().getDatabaseVersion().getMajor() >= 11;
                for (SQLWarning warninig = connection.getWarnings();
import java.util.regex.Matcher;
                    paramsMap.put("NLS_TERRITORY", "'" + sessionTerritory + "'");
        }

            } catch (Exception e) {
                    int status = 0;

                        "Do you want DBeaver to create new PLAN_TABLE (" + newPlanTableName + ")?")) {
                planTableName = candidate;
    static class RoleCache extends JDBCObjectCache<OracleDataSource, OracleRole> {
                        paramsMap.put("\"_optimizer_push_pred_cost_based\"", "FALSE");
        // FIXME: left for backward compatibility. Replaced by auth model. Remove in future.
    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope)

        protected OracleUserProfile fetchObject(@NotNull JDBCSession session, @NotNull OracleDataSource owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
        }
        if (error.getCause() != null) {
//                    schemasQuery.append(
    private final Map<String, Boolean> availableViews = new HashMap<>();

            getContainer().getConnectionConfiguration().setUserPassword(passwordInfo.getNewPassword());
        }

            }
            Properties connectProps = getAllConnectionProperties(monitor, context, purpose, connectionInfo);
                    }
        if (initFrom != null) {
    public OracleDataSource(@NotNull DBPDataSourceContainer container) {

*/

    }
        if (warning != null && warning.getErrorCode() == OracleConstants.EC_PASSWORD_WILL_EXPIRE) {
    public boolean isStatisticsCollected() {
                }
        }
        } catch (SQLException e) {
            if (showOnlyOneSchema) {
        if (configurator != null) {
    @NotNull

                pos.line = Integer.parseInt(matcher.group(1)) - 1;
            return new OracleUserProfile(owner, resultSet);
                try {
 * Unless required by applicable law or agreed to in writing, software
        return tablespaceCache;
    public Collection<? extends DBSDataType> getLocalDataTypes() {
    private void init() {
                if (CommonUtils.isEmpty(userName)) {
            //return new QueryTransformerRowNum();
        this.init();
    public Collection<OracleSchema> getChildren(@NotNull DBRProgressMonitor monitor)
        } else {
    @Override
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load data source meta info")) {
import org.jkiss.dbeaver.model.data.DBDPseudoAttributeContainer;

        super.initialize(monitor);
        protected OracleSchema fetchObject(@NotNull JDBCSession session, @NotNull OracleDataSource owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
            if (!CommonUtils.isEmpty(tableName)) {

        }
import org.jkiss.dbeaver.model.data.DBDPseudoAttributeType;
                "SELECT * FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), owner, "USERS") + " ORDER BY USERNAME");
                OracleDataType.TypeDesc typeDesc = predefinedType.getValue();
    @Association
    }
                }
        this.hasStatistics = false;

    public Collection<OracleDBLink> getPublicDatabaseLinks(DBRProgressMonitor monitor) throws DBException {
    @Association
    }
    private boolean checkForPasswordWillExpireWarning(@NotNull SQLWarning warning) {
                        OracleTablespace tablespace = tablespaceCache.getObject(monitor, OracleDataSource.this, tsName);
        return getInfo().getDatabaseVersion().getMajor() >= 10;
        return publicSchema.getDatabaseLinks(monitor);
                case OracleConstants.EC_INVALID_USERNAME_PASSWORD:
        }
    ///////////////////////////////////////////////
                    "\tTS.TABLESPACE_NAME, F.AVAILABLE_SPACE, S.USED_SPACE\n" +
import org.jkiss.dbeaver.model.meta.Association;

        }
        {
    protected String getStandardSQLDataTypeName(@NotNull DBPDataKind dataKind) {
    private boolean resolveGeometryAsStruct = true;
        @NotNull JDBCExecutionContext context,
            String useRuleHintProp = connectionInfo.getProviderProperty(OracleConstants.PROP_USE_RULE_HINT);
        return publicSchema.getSynonyms(monitor);
    public OracleSchema getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName)
                "WHERE (");
                "SELECT RESOURCE_NAME,RESOURCE_TYPE,LIMIT FROM DBA_PROFILES " +
        }
        }
        return dataTypeCache.getCachedObjects();
                    throw new DBCException(e, context);
        outputReader.enableServerOutput(
                Connection connection = statement.getConnection().getOriginal();
        protected OracleRole fetchObject(@NotNull JDBCSession session, @NotNull OracleDataSource owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
