    public boolean isWarehouse() {


        if (ptSchemaname == null) {
import org.jkiss.dbeaver.model.struct.DBSStructureAssistant;
    public boolean isAtLeastV10_5()
        } catch (SQLException e) {
    }
    }
    public Object getDataSourceFeature(String featureId) {
        if (ok) {
    protected boolean isConnectionReadOnlyBroken()
    @Association
    protected void initializeContextState(@NotNull DBRProgressMonitor monitor, @NotNull JDBCExecutionContext context,
            );

    // Connection related Info
                return 32764;

        super.initialize(monitor);
    @Override
    }
        this.userMappingCache.clearCache();
        return new DB2ExecutionContext(instance, type);
            log.warn("Error reading active schema", e);

        }

            throw new DBException("Cannot find DB2Driver", e);
        }
        return DB2Schema.class;
    @Override
    public DBSObjectCache<DB2DataSource, DB2Tablespace> getTablespaceCache()

        this.wrapperCache.clearCache();
    }
        return info;
    private final DBSObjectCache<DB2DataSource, DB2Tablespace> tablespaceCache = new JDBCObjectSimpleCache<>(DB2Tablespace.class, C_TS);
    public Collection<DB2StorageGroup> getStorageGroups(DBRProgressMonitor monitor) throws DBException
            return getDataTypes(new VoidProgressMonitor());
        String sessionUserSchema;
        // - LONG VARGRAPHIC
        return plan;
        @NotNull DBRProgressMonitor monitor,
    {
                .getDriverInstance(monitor);
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

    private static final String C_SCHEMA = "SELECT * FROM SYSCAT.SCHEMATA ORDER BY SCHEMANAME WITH UR";
    private final DBSObjectCache<DB2DataSource, DB2RemoteServer> remoteServerCache

    {
    @Association
    }
    }
        

    {

    @Association
    @Override
/**
    public boolean isAtLeastV9_7()
    public boolean isAuthorisedForApplications()

    public DBSObjectCache<DB2DataSource, DB2Bufferpool> getBufferpoolCache()
        if (!(cause instanceof SQLException sqlEx)) {
    public Collection<DB2RemoteServer> getRemoteServers(DBRProgressMonitor monitor) throws DBException
        } catch (SQLException e) {
    @Override
    {
package org.jkiss.dbeaver.ext.db2.model;

    // Those are dependent of DB2 version
        this.remoteServerCache.clearCache();
                BeanUtils.invokeStaticMethod(
            } catch (SQLException e) {
                    "GROUP BY TABSCHEMA")) {
            log.warn("SQLException when reading database version. Set it to lowest supported version : " + DB2Constants.DB2v9_1
        return remoteServerCache;


            ((DB2ExecutionContext)context).setCurrentSchema(monitor, ((DB2ExecutionContext)initFrom).getDefaultSchema());
                listDBMParameters = DB2Utils.readDBMCfg(monitor, session);
            schemaForExplainTables = DB2Constants.EXPLAIN_SCHEMA_NAME_DEFAULT;
    @Association
                new Object[0]
    private DB2CurrentUserPrivileges db2CurrentUserPrivileges;
    @Override

            try {
        return variableCache.getObject(monitor, this, name);
    {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectSimpleCache;
            log.error("DBException occurred when reading system dataTypes: ", e);
        this.userCache.clearCache();
    }
        if (hasStatistics && !forceRefresh) {
        }
    @Override
        return true;
    {
        @NotNull DBPConnectionConfiguration connectionInfo
        // Restriction: If the ResultSet is scrollable, and the ResultSet is used to select columns from a table on a DB2 for
    {
    }
}
                            schema.setSchemaTotalSize(bytes);
    public DB2Schema getSchema(DBRProgressMonitor monitor, String name) throws DBException
        return getSchemas(monitor);
    {
            return;
    public DB2Tablespace getTablespace(DBRProgressMonitor monitor, String name) throws DBException

        Boolean ok = DB2Utils.checkExplainTables(monitor, this, sessionUserSchema);
    public DBCPlanStyle getPlanStyle() {
import org.jkiss.utils.BeanUtils;
    {
                    throw new DBDatabaseException("Error while changing password DB2", sqlEx);


    }
            return adapter.cast(new DB2StructureAssistant(this));
        return roleCache.getObject(monitor, this, name);
        return userCache.getAllObjects(monitor, this);
                .getDefaultDriverLoader()
    // -------------------------


    }
        } catch (DBException e) {

    private List<DB2Parameter> listDBParameters;
                log.warn(e);
    {
        return userMappingCache.getAllObjects(monitor, this);
        return roleCache.getAllObjects(monitor, this);


        }
    }
    }
    }
        @NotNull DBRProgressMonitor monitor,
    private static final String C_DT = "SELECT * FROM SYSCAT.DATATYPES WHERE METATYPE = 'S' ORDER BY TYPESCHEMA,TYPENAME WITH UR";
    // Variant Testing
import org.jkiss.dbeaver.ext.db2.info.DB2XMLString;
    }
                .getDriver()
    }
    {
    public Collection<DB2DataType> getLocalDataTypes()
            return false;
    {
        } catch (SQLException e) {
 * @author Denis Forveille
    @NotNull
    // Version
        @NotNull String userName,
        return monitor == null ? dataTypeCache.getCachedObjects() : dataTypeCache.getAllObjects(monitor, this);
 * 
import org.jkiss.dbeaver.ext.db2.model.app.DB2ServerApplicationManager;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
    // -------------------------
        // Linux, UNIX, and Windows server,
    public Collection<DB2Role> getRoles(DBRProgressMonitor monitor) throws DBException
    private static final String C_SV = "SELECT * FROM SYSCAT.SERVERS ORDER BY SERVERNAME WITH UR";
        // TODO DF: No idea what to do with this method, what it is used for...
    private static final String C_SG = "SELECT * FROM SYSCAT.STOGROUPS ORDER BY SGNAME WITH UR";
    {


    {

    public DB2Wrapper getWrapper(DBRProgressMonitor monitor, String name) throws DBException
                );

    {
        @Nullable JDBCExecutionContext context,
            throw e;

            log.debug("Valid explain tables found in " + sessionUserSchema);


        return (DB2Schema) DBUtils.getDefaultContext(this, true).getContextDefaults().getDefaultSchema();
    @Override
    }
        return variableCache.getAllObjects(monitor, this);

        schemaForExplainTables = sessionUserSchema;


        }
    // --------------
            }
        }

            Object errorSrc = BeanUtils.invokeObjectDeclaredMethod(
        return monitor == null ? wrapperCache.getCachedObjects() : wrapperCache.getAllObjects(monitor, this);

    // Constructors
    {



            sessionUserSchema = CommonUtils.trim(JDBCUtils.queryString((JDBCSession) session, GET_SESSION_USER));
        }
        }
import org.jkiss.dbeaver.ModelPreferences;
        this.hasStatistics = false;
    {
            }
    // -------------------------
                        long bytes = dbResult.getLong(2) * 1024;
import org.jkiss.code.Nullable;


import org.jkiss.code.NotNull;
    }

        this.storagegroupCache.clearCache();
            }
import org.jkiss.dbeaver.ext.db2.model.security.DB2Role;
    }
                    while (dbResult.next()) {
    @NotNull

    public DB2Variable getVariable(DBRProgressMonitor monitor, String name) throws DBException
    // -------------
            return null;
 *
    public Collection<DB2UserMapping> getUserMappings(DBRProgressMonitor monitor) throws DBException
            ((DB2ExecutionContext)context).refreshDefaults(monitor, true);

        try {
    public DB2DataType getDataType(DBRProgressMonitor monitor, String name) throws DBException
    }
        return roleCache;
    }
    public boolean isAtLeastV9_5()
    public DB2Schema getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException
    public boolean isAuthorisedForContainers()
    // -------------
    {
            if ((!isBigSQL() && !isWarehouse()) && isPasswordExpired(e)
    public DB2DataType getLocalDataType(String typeName)
    {
            throw new DBCException(DB2Messages.dialog_explain_no_tables_found_ex);
    private static final String C_WR = "SELECT * FROM SYSCAT.WRAPPERS ORDER BY WRAPNAME WITH UR";
import java.sql.Connection;
    // Stats
        // Try to create explain tables within current authorizartionID in given tablespace
            Driver jdbcDriver = container
        } catch (DBCException e) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                    for (DB2Schema schema : getSchemas(monitor)) {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
                "getErrorSrc",
    public DB2Bufferpool getBufferpool(DBRProgressMonitor monitor, String name) throws DBException
            } catch (Throwable e) {


import java.sql.SQLException;
    @Override
    // -----------------------
    }
    public Collection<DB2Schema> getSchemas(@NotNull DBRProgressMonitor monitor) throws DBException

    @Association
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load Global XMLStrings")) {
    // This is ok as they will never been called as the folder/menu is hidden in plugin.xml
            version += Integer.valueOf(metaData.getDatabaseMinorVersion()).doubleValue() / 10;
    private static final String C_UM = "SELECT * FROM SYSCAT.USEROPTIONS WHERE OPTION = 'REMOTE_AUTHID' ORDER BY SERVERNAME,AUTHID WITH UR";

                    "    TABSCHEMA,\n" +
    // Initialisation/Structure
import org.jkiss.dbeaver.model.connection.DBPDriver;
        ok = DB2Utils.checkExplainTables(monitor, this, DB2Constants.EXPLAIN_SCHEMA_NAME_DEFAULT);
        } catch (SQLException e) {


    public DBCPlan planQueryExecution(@NotNull DBCSession session, @NotNull String query, @NotNull DBCQueryPlannerConfiguration configuration) throws DBCException
        return monitor == null ? storagegroupCache.getCachedObjects() : storagegroupCache.getAllObjects(monitor, this);
import org.jkiss.dbeaver.ext.db2.model.security.DB2GranteeCache;
    // --------------------------
    public DB2Grantee getGroup(DBRProgressMonitor monitor, String name) throws DBException
        try {
        // - LONG VARCHAR
            return false;
        @NotNull String purpose,
    {
            return DB2Constants.ER_PASSWORD_EXPIRED.equals(errorSrc);

                    new Object[] {url, userName, oldPassword, newPassword}
        }
    @Override
                db2Connection.setClientInfo(
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
 */
        }
    public Collection<DB2DataType> getDataTypes(DBRProgressMonitor monitor) throws DBException
    }

 * Copyright (C) 2010-2025 DBeaver Corp and others
                        String schemaName = JDBCUtils.safeGetStringTrimmed(dbResult, 1);
 */
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    }
                        255));
    protected JDBCExecutionContext createExecutionContext(JDBCRemoteInstance instance, String type) throws DBCException {

                                          JDBCExecutionContext initFrom) throws DBException
        DB2PlanConfig cfg = new DB2PlanConfig();
        return storagegroupCache;
        }
    {
            log.warn("Unable to determine server variant", e);
    {
        DB2PlanAnalyser plan = new DB2PlanAnalyser(query, ptSchemaname);

        }
        if (sqlEx.getErrorCode() != DB2Constants.ER_MUST_CHANGE_PASSWORD_LOGIN ||


    }
    }

        return 'B' == serverVariant;
        } catch (ClassNotFoundException e) {
        }
            if (defaultSchema != null) {
                listXMLStrings = DB2Utils.readXMLStrings(monitor, session);

    private static final String C_BP = "SELECT * FROM SYSCAT.BUFFERPOOLS ORDER BY BPNAME WITH UR";
            }
                try (JDBCResultSet dbResult = dbStat.executeQuery("SELECT\n" +
    @Override
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException
    // -------------------------
                log.warn(e);
    // -----------------------
    }
    }
import org.jkiss.dbeaver.ext.db2.model.security.DB2Grantee;
    @NotNull

    {
    @Override

        = new JDBCObjectSimpleCache<>(DB2RemoteServer.class, C_SV);

    {
import org.jkiss.dbeaver.model.struct.DBSObject;
        // DF: DB2 v10 supports "Scrollable Resultsets" with the following restrictions (from the DB2 v10.5 infocenter)
            // First try to get active schema from special register 'CURRENT SCHEMA'
        // Verify explain table from SYSTOOLS
    // -----------------------
import org.jkiss.dbeaver.ext.db2.model.fed.DB2RemoteServer;
        } else if (adapter == DBAServerSessionManager.class) {
    }
        return remoteServerCache.getAllObjects(monitor, this);
    {
    // --------------------------
        return groupCache.getObject(monitor, this, name);
    }
            throw new DBCException("Error reading table statistics", e);
                && DBAuthUtils.promptAndChangePasswordForCurrentUser(
    public DBSObjectCache<DB2DataSource, DB2DataType> getDataTypeCache()
    @Nullable
    public DBSObjectCache<DB2DataSource, DB2StorageGroup> getStorageGroupCache()
    @Association
import org.jkiss.dbeaver.ext.db2.editors.DB2StructureAssistant;
        // Hourra!
        return props;

    }

    private boolean isPasswordExpired(@NotNull DBCException e) {
        version = DB2Constants.DB2v9_1; // Be defensive, assume lowest possible version
            log.warn("Error reading types info", e);
    public boolean isAuthorisedForDBCFG()
        @NotNull String newPassword,
        if (initFrom != null) {
    {
        return userCache.getObject(monitor, this, name);
    @NotNull
        } catch (SQLException e) {
    // --------------

    private final DB2GranteeCache groupCache = new DB2GranteeCache(DB2AuthIDType.G);
    }
    public Collection<DB2Grantee> getGroups(DBRProgressMonitor monitor) throws DBException
 * You may obtain a copy of the License at
    {
    public DB2RemoteServer getRemoteServer(DBRProgressMonitor monitor, String name) throws DBException
       String tablespaceName = cfg.getTablespace();
            throw new DBCException(e, session.getExecutionContext());

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
            hasStatistics = true;
        return version >= DB2Constants.DB2v9_7;

    public List<DB2Parameter> getDbParameters(DBRProgressMonitor monitor) throws DBException
    // --------------------------

    }

            ClassLoader loader = jdbcDriver.getClass().getClassLoader();
        return monitor == null ? tablespaceCache.getCachedObjects() : tablespaceCache.getAllObjects(monitor, this);
import org.jkiss.dbeaver.model.meta.Association;
    }
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlannerConfiguration;
    // -----------------------
    }
    // --------------
        this.tablespaceCache.clearCache();
        }
import org.jkiss.dbeaver.model.exec.DBCException;
 *
import org.jkiss.dbeaver.model.impl.jdbc.*;
    }
    {
        this.initialize(monitor);
            }

    {
    {
    ) throws DBCException {
    public DBSObjectCache<DB2DataSource, DB2Role> getRoleCache()
        }
                cfg.setUserPassword(newPassword);
    private static final Log log = Log.getLog(DB2DataSource.class);
                cause,
    public DB2DataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container) throws DBException

    @Override

    {

        this.bufferpoolCache.clearCache();

            try (JDBCStatement dbStat = session.createStatement()) {
        }
    public <T> T getAdapter(@NotNull Class<T> adapter)
        return listDBMParameters;
        Throwable cause = e.getCause();
        // - XML

            }
    {
        return tablespaceCache.getObject(monitor, this, name);
        return db2CurrentUserPrivileges != null && db2CurrentUserPrivileges.userIsAuthorisedForAdminister();
            !DB2Constants.ER_STATE_MUST_CHANGE_PASSWORD_LOGIN.equals(sqlEx.getSQLState())) {
import org.jkiss.dbeaver.ext.db2.info.DB2Parameter;


            this.serverVariant = DB2Utils.getServerVariant(monitor, session);
        return db2CurrentUserPrivileges != null && db2CurrentUserPrivileges.userIsAuthorisedForApplications();
        final DB2DataSourceInfo info = new DB2DataSourceInfo(metaData);
    }
import org.jkiss.dbeaver.ext.db2.model.plan.DB2PlanAnalyser;

 * limitations under the License.
        this.hasStatistics = !container.getPreferenceStore().getBoolean(ModelPreferences.READ_EXPENSIVE_STATISTICS);
    // --------------
    }
    @Association

    // Manage Children: DB2Schema
    @Override
        if (adapter == DBSStructureAssistant.class) {


    }
            return null;
        return dataTypeCache;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
        return super.getAdapter(adapter);
import org.jkiss.dbeaver.DBDatabaseException;
            props.put(APPLICATION_NAME_PROP, GeneralUtils.getProductName());
    public boolean isAtLeastV11_1()
    {
    }
 * DB2 DataSource
        if (listXMLStrings == null) {

    }
    private final DB2GranteeCache userCache = new DB2GranteeCache(DB2AuthIDType.U);
    }

    }
        if (listDBMParameters == null) {
    {
/*
        return dataTypeCache.getObject(monitor, this, name);
    }
import org.jkiss.dbeaver.model.*;
    {
    {
    }
            version = Integer.valueOf(metaData.getDatabaseMajorVersion()).doubleValue();

                    new Class<?>[] {String.class, String.class, String.class, String.class},
        } finally {

    // Version Testing
        @NotNull DBPDriver driver,
            log.error("DBException occurred when reading system dataTYpe : " + typeName, e);
 * you may not use this file except in compliance with the License.
            return null;

            return false;
    @Association
 * DBeaver - Universal Database Manager
            this.dataTypeCache.setCache(Collections.<DB2DataType> emptyList());

    // -------------------------
import org.jkiss.utils.CommonUtils;
            Class<?> db2DriverClass = loader.loadClass("com.ibm.db2.jcc.DB2Driver");
    @Override
                        }
            } catch (SQLException e) {
    {
    public Collection<DB2Grantee> getUsers(DBRProgressMonitor monitor) throws DBException
            db2Connection = super.openConnection(monitor, context, purpose);
        if (!getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_CLIENT_NAME_DISABLE)) {
    public boolean isBigSQL() {
    public DBSObjectCache<DB2DataSource, DB2Wrapper> getWrapperCache()

        }


                    }
                    "FROM TABLE(ADMIN_GET_TAB_INFO('',''))\n" +
    {
        // queries run from the SQL editor)
        this.listDBMParameters = null;


    {
        }
        return listDBParameters;

         }
    // -------------------------
                log.debug(e);
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;
    }
                            schema.setSchemaTotalSize(0);

        // - BLOB
            return getDataType(new VoidProgressMonitor(), typeName);

    // -----------------------

    }

import org.jkiss.dbeaver.model.exec.DBCSession;
        try {
        return variableCache;
        if (ok) {
                    }
        // the SELECT list of the SELECT statement that defines the ResultSet cannot include columns with the following data types:
    public Collection<DB2Wrapper> getWrappers(DBRProgressMonitor monitor) throws DBException
        return remoteServerCache.getObject(monitor, this, name);
        log.debug(getName() + " is version v" + version);
    public DBSObjectCache<DB2DataSource, DB2RemoteServer> getRemoteServerCache()
        return getSchema(monitor, childName);
    {
import org.jkiss.dbeaver.ext.db2.*;
        } catch (Throwable ex) {
        @NotNull String oldPassword
        info.setSupportsResultSetScroll(false);
    }
            schemaForExplainTables = sessionUserSchema;
        try {
    private volatile transient boolean hasStatistics;
    private static final String C_TS = "SELECT * FROM SYSCAT.TABLESPACES ORDER BY TBSPACE WITH UR";
        return schemaCache;
        if (tablespaceName == null) {
                        if (!schema.hasStatistics()) {
    {
    public DB2Schema getDefaultSchema()
    {
    {
        return version >= DB2Constants.DB2v10_1;
        return listXMLStrings;

 * See the License for the specific language governing permissions and

                }
    protected DBPDataSourceInfo createDataSourceInfo(DBRProgressMonitor monitor, @NotNull JDBCDatabaseMetaData metaData)
import org.jkiss.dbeaver.model.access.DBAuthUtils;
    // Plan Tables
        return DBCPlanStyle.PLAN;
    public Double getVersion()
        Map<String, String> props = new LinkedHashMap<>(
    @Association
        if (listDBParameters == null) {
        this.dataTypeCache.clearCache();
    // -------------------------
    private String schemaForExplainTables;

    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException
        return wrapperCache.getObject(monitor, this, name);
                    JDBCConstants.APPLICATION_NAME_CLIENT_PROPERTY,
    private final DBSObjectCache<DB2DataSource, DB2UserMapping> userMappingCache = new JDBCObjectSimpleCache<>(DB2UserMapping.class, C_UM);
        return tablespaceCache;
        // (it doesn't work for some queries and some column types so I have to disable it for ALL queries).

            case DBPDataSource.FEATURE_MAX_STRING_LENGTH:
        this.variableCache.clearCache();
    // --------------------------
    {
        // - A structured type
    private final DBSObjectCache<DB2DataSource, DB2Wrapper> wrapperCache = new JDBCObjectSimpleCache<>(DB2Wrapper.class, C_WR);
    public Collection<DB2Tablespace> getTablespaces(DBRProgressMonitor monitor) throws DBException
            return schemaForExplainTables;
                + " : " + e.getMessage());

        }
    public Collection<DB2Bufferpool> getBufferpools(DBRProgressMonitor monitor) throws DBException
                }
    {
                    "    SUM(DATA_OBJECT_P_SIZE + INDEX_OBJECT_P_SIZE + LONG_OBJECT_P_SIZE + LOB_OBJECT_P_SIZE + XML_OBJECT_P_SIZE) AS TOTAL_SIZE_IN_KB\n" +
import org.jkiss.dbeaver.utils.GeneralUtils;
        // return schemaForExplainTables;


        this.roleCache.clearCache();
                if (e instanceof SQLException sqlEx) {
            DB2DataSourceProvider.getConnectionsProps());
    public DB2Role getRole(DBRProgressMonitor monitor, String name) throws DBException
        @NotNull DBRProgressMonitor monitor,
    }
                        }
            log.error("Failed to retrieve DB2 error source from SQLException", ex);
    {
    public List<DB2XMLString> getXmlStrings(DBRProgressMonitor monitor) throws DBException
        return bufferpoolCache;
        // // Schema for explain tables has already been verified. Use it as-is
import org.jkiss.dbeaver.ext.db2.model.fed.DB2Wrapper;
    public Collection<DB2Schema> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load schema statistics")) {
    }
        return groupCache.getAllObjects(monitor, this);
    // Associations

    public Class<? extends DB2Schema> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException
import org.jkiss.dbeaver.ext.db2.model.fed.DB2UserMapping;
    }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load data source meta info")) {
        String url = cfg.getUrl();
        return db2CurrentUserPrivileges != null && db2CurrentUserPrivileges.userIsAuthorisedForDBCFG();
        DBRProgressMonitor monitor = session.getProgressMonitor();
            } catch (Throwable e) {
import java.sql.Driver;
    public DBSObjectCache<DB2DataSource, DB2Variable> getVariableCache()
        return monitor == null ? bufferpoolCache.getCachedObjects() : bufferpoolCache.getAllObjects(monitor, this);
    {
    @Override

    }

        plan.explain((JDBCSession) session);
    }
        }
                this.db2CurrentUserPrivileges = new DB2CurrentUserPrivileges(monitor, session, defaultSchema.getName(), this);
    }
import org.jkiss.dbeaver.ext.db2.model.security.DB2AuthIDType;
    private final DBSObjectCache<DB2DataSource, DB2Variable> variableCache = new JDBCObjectSimpleCache<>(DB2Variable.class, C_VR);
    }
        return version >= DB2Constants.DB2v11_1;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return version;
    private final DBSObjectCache<DB2DataSource, DB2DataType> dataTypeCache = new JDBCObjectSimpleCache<>(DB2DataType.class, C_DT);
    {
        DBEObjectConfigurator configurator = GeneralUtils.adapt(cfg, DBEObjectConfigurator.class);
    // Standards Getters

        }

    {
    // -----------------------
    public Collection<DB2Variable> getVariables(DBRProgressMonitor monitor) throws DBException
        return wrapperCache;
    }
                throw new DBException("Cannot invoke method", e);
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.model.exec.plan.DBCPlan;
        }
    {
                        DB2Schema schema = getSchema(monitor, schemaName);
    private final DBSObjectCache<DB2DataSource, DB2StorageGroup> storagegroupCache
    {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load server variant")) {


    {
        return db2Connection;
    public DB2UserMapping getUserMapping(DBRProgressMonitor monitor, String name) throws DBException

        return version >= DB2Constants.DB2v9_5;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            log.debug("Valid explain tables found in " + DB2Constants.EXPLAIN_SCHEMA_NAME_DEFAULT);
        // So it is not usable for "generic" select statements that may include such columns (ge the "data" tab on tabl view or
 *     http://www.apache.org/licenses/LICENSE-2.0
                        if (schema != null) {
        Connection db2Connection;
        @NotNull String purpose
        return schemaCache.getObject(monitor, this, name);
    private static final String C_VR = "SELECT * FROM SYSCAT.VARIABLES WHERE VARMODULENAME IS NULL ORDER BY VARNAME WITH UR";
            } catch (SQLException e) {
    // -------------------------

        // - CLOB
                return null;
    }



    }
    {
 *
        } catch (DBException e) {
        return bufferpoolCache.getObject(monitor, this, name);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        try {

    @Association
    {

import org.jkiss.dbeaver.Log;

        return storagegroupCache.getObject(monitor, this, name);
        // if (CommonUtils.isNotEmpty(schemaForExplainTables)) {
    {
    }
        // disable result set scroll

        super(monitor, container, new DB2SQLDialect());
        @NotNull JDBCExecutionContext context,
        if (getContainer().isConnectionReadOnly()) {

public class DB2DataSource extends JDBCDataSource implements DBCQueryPlanner, DBPAdaptable, DBPObjectStatisticsCollector {
                        DBUtils.getClientApplicationName(getContainer(), context, purpose),
    {
        return sessionUserSchema;
    private void changeUserPassword(

        }
        // Compute Database version
        return 'D' == serverVariant;
    ) throws DBException {
    {
                listDBParameters = DB2Utils.readDBCfg(monitor, session);
    public List<DB2Parameter> getDbmParameters(DBRProgressMonitor monitor) throws DBException
    {
            try {
    @Override
    private static final String APPLICATION_NAME_PROP = "clientProgramName";
        try {

    }
                    "changeDB2Password",

        }

        try {
    public boolean isStatisticsCollected() {
    }
    // Authorities


        super.refreshObject(monitor);
            return schemaForExplainTables;
        } catch (DBException e) {
        }
                monitor, container, this::changeUserPassword)) {
        this.groupCache.clearCache();
    public DB2Grantee getUser(DBRProgressMonitor monitor, String name) throws DBException
    @Override
                    CommonUtils.truncateString(
        // - A distinct type that is based on any of the previous data types in this list

    }
        return schemaCache.getAllObjects(monitor, this);
    public boolean isAuthorisedForAdminister()
    private final DBSObjectCache<DB2DataSource, DB2Schema> schemaCache = new JDBCObjectSimpleCache<>(DB2Schema.class, C_SCHEMA);

        this.schemaCache.clearCache();
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {

        return version >= DB2Constants.DB2v10_5;
    }
        return hasStatistics;
    {
        DB2Utils.createExplainTables(session.getProgressMonitor(), this, sessionUserSchema, tablespaceName);
                new Class<?>[0],
        // Verify explain table from current authorization id

            DB2Schema defaultSchema = getDefaultSchema();
    private final DBSObjectCache<DB2DataSource, DB2Bufferpool> bufferpoolCache = new JDBCObjectSimpleCache<>(DB2Bufferpool.class, C_BP);
        ((JDBCObjectSimpleCache) dataTypeCache).setCaseSensitive(false);
        this.listDBParameters = null;
        } else {
    }
            }
                    db2DriverClass,
    {
            = new JDBCObjectSimpleCache<>(DB2StorageGroup.class, C_SG);
    private Double version;
            this.dataTypeCache.getAllObjects(monitor, this);
        return super.getDataSourceFeature(featureId);
            return adapter.cast(new DB2ServerApplicationManager(this));
    private List<DB2XMLString> listXMLStrings;
    {
        return this;
    protected Map<String, String> getInternalConnectionProperties(

import java.util.*;
                log.warn(e);
    {
        try {
        // }

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    private char serverVariant;
    public boolean isAtLeastV10_1()

    @Override
    }
    }
    }
    }
import org.jkiss.dbeaver.DBException;
        DBPConnectionConfiguration cfg = container.getActualConnectionConfiguration();
import org.jkiss.dbeaver.model.exec.plan.DBCPlanStyle;
    private List<DB2Parameter> listDBMParameters;
            props.put(DB2Constants.PROP_READ_ONLY, "true");
        if (configurator == null || configurator.configureObject(monitor, null, this, cfg, Collections.emptyMap()) == null) {
    @Override
    public DB2StorageGroup getStorageGroup(DBRProgressMonitor monitor, String name) throws DBException

        String ptSchemaname = getExplainTablesSchemaName(session);
    }
    ) throws DBCException {
            }
        return db2CurrentUserPrivileges != null && db2CurrentUserPrivileges.userIsAuthorisedForContainers();

    private static final String C_RL = "SELECT * FROM SYSCAT.ROLES ORDER BY ROLENAME WITH UR";

            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load Instance Parameters")) {

                return openConnection(monitor, context, purpose);
    }
    @Association
    private final DBSObjectCache<DB2DataSource, DB2Role> roleCache = new JDBCObjectSimpleCache<>(DB2Role.class, C_RL);
    }

            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load Database Parameters")) {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Association
    // Dynamic Data
    private String getExplainTablesSchemaName(DBCSession session) throws DBCException
    public DBSObjectCache<DB2DataSource, DB2Schema> getSchemaCache()
    private static final String GET_SESSION_USER = "VALUES(SESSION_USER)";
        }
        if (!getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_CLIENT_NAME_DISABLE)) {
        return userMappingCache.getObject(monitor, this, name);
        }
        switch (featureId) {
    protected Connection openConnection(
