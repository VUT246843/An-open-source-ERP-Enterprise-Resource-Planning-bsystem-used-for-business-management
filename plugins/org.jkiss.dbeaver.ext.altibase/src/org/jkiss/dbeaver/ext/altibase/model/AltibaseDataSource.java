     * Get database name.
    public boolean isOmitCatalog() {
    
                refObj = refSchema.getSequence(monitor, refObjName);
            Connection connection = super.openConnection(monitor, context, purpose);
            return;
     */
        }
        return roleCache.getAllObjects(monitor, this);
    /**
            throws DBException {

import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
            if (refObj == null) {
    /**

    /**
                dbStat.setString(1, object != null ? object.getName() : objectName);

                method2RegisterCallback.invoke(conn, instance4Callback);
            return new AltibaseRole(owner, resultSet);

            @Nullable JDBCExecutionContext context, 
        return AltibaseSchema.class;
            @NotNull String purpose) throws DBCException {
                            + " r.options,"
    private boolean checkForPasswordWillExpireWarning(@NotNull SQLWarning warning) {
            }
    }
    public boolean splitProceduresAndFunctions() {
    // Tablespace
            

    public DbLinkCache getDbLinkCache() {
    public AltibaseRole getRole(DBRProgressMonitor monitor, String name) throws DBException {
        }
            if (!isNullObject) {
                }

    ///////////////////////////////////////////////
    }
                            + " rh.host_ip || ':' || rh.port_no AS remote_addr,"
                            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    // Public DB Links
                // To support Altibasex_x.jar driver
                AltibaseDbLink object, String objectName) throws SQLException {
            return new AltibaseMemoryModule(owner, dbResult);
            try (JDBCPreparedStatement dbStat = session.prepareStatement(queryGetActiveDB)) {
            return session.prepareStatement(
            return dbStat;

                    warning.getMessage() + 
                    );

                if (refObj != null) {
                AltibaseJob object, String objectName) throws SQLException {
                ) {
        this.userCache.clearCache();
        } catch (SQLException ex) {
        } catch (DBException e) {
import java.sql.SQLException;
    public TablespaceCache getTablespaceCache() {
        return replCache;


                DBRProgressMonitor monitor, 

                                    callBackMsg.append((String) args[0]);
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, 
    }
        @Override
        @NotNull
    // Statistics
    // Altibase Properties
        // PublicSchema is for global objects such as public synonym.
        AltibaseSchema refSchema = (AltibaseSchema) this.getSchema(refSchemaName);
        return this;
                dbStat.setString(1, replName);
            
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
            String className4Connection = "N/A";
    private AltibaseOutputReader outputReader;
public class AltibaseDataSource extends GenericDataSource implements DBPObjectStatisticsCollector {
        }
                                + " 2, 'Propagable Logging',"
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;


                    AltibaseConstants.SQL_WARNING_TITILE,

    }
    ///////////////////////////////////////////////
                        .getMethod(AltibaseConstants.METHOD_NAME_4_REGISTER_MESSAGE_CALLBACK, class4MsgCallback);
    private boolean hasStatistics;
                log.debug("Can't get connection warnings", e);
    @NotNull
        }
        }
        return dbLinkCache;
        return roleCache.getObject(monitor, this, name);
        }
                DBCExecutionContext context, 
                    return propertyList;
    private static final Log log = Log.getLog(AltibaseDataSource.class);
    public Collection<? extends GenericSynonym> getPublicSynonyms(DBRProgressMonitor monitor) throws DBException {
                    throw new InstantiationException("Failed to instantiate class: " + className4MessageCallback);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
                        + " WHERE"

            return connection;

                @NotNull JDBCSession session, 
                @Nullable AltibaseReplication object, @Nullable String objectName) throws SQLException {
                            + " r.replication_name,"
    /**
            }
    static class TablespaceCache extends JDBCObjectCache<AltibaseDataSource, AltibaseTablespace> {
    /**
    }
                @NotNull JDBCSession session, @NotNull AltibaseDataSource owner) throws SQLException {
import org.jkiss.dbeaver.DBException;
    }
    }
                "SELECT u.*, tbs1.name AS default_tbs_name, tbs2.name AS temp_tbs_name "


    }
    
                        new InvocationHandler() {
            ClassLoader classLoader = null;

        @Override
    }
            outputReader = new AltibaseOutputReader();
 * See the License for the specific language governing permissions and

                        new Class[] { class4MsgCallback }, 
    @Override
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;

        } finally {
                                + " 1, 'Master', "
                            className4MessageCallback));
                                if ("print".equals(method.getName())) {
        public boolean isAsyncOutputReadSupported() {
import org.jkiss.dbeaver.model.exec.output.DBCOutputWriter;
    public AltibaseDataSource getDataSource() {
    }
        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
                            + " r.replication_name = rh.replication_name"
    }
             *  Though Public synonym does not have its own schema, but SYSTEM_.SYS_SYONYMS_.OBJECT_OWNER_NAME returns 
 *     http://www.apache.org/licenses/LICENSE-2.0
        protected AltibaseReplication fetchObject(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, 
                refObj = refSchema.getTableTrigger(monitor, refObjName);
    public AltibaseUser getUser(DBRProgressMonitor monitor, String name) throws DBException {
    @Override
            monitor,
                @NotNull AltibaseReplication forTable) throws SQLException {
                    tablespace.loadSizes(monitor);
    }
            if (!isNullObject) {
        return refObj;
    }
                conn = session.getOriginal();

        return memoryModuleCache;
import java.lang.reflect.Proxy;
        // If it's unable to find the target object in schema, then need to find it from non-schema objects
 * You may obtain a copy of the License at
            return session.prepareStatement(

    public Collection<AltibaseRole> getRoles(DBRProgressMonitor monitor) throws DBException {

     */
            throw new DBException("Failed to load database properties", ex);

            Connection conn = null;
                AltibaseTablespace tablespace = tablespaceCache.getObject(monitor, AltibaseDataSource.this, tbs.getName());

        memoryModuleCache = new MemoryModuleCache();
            return false;
            

        }
            return dataSource;
        @NotNull
import org.jkiss.code.Nullable;
        return hasStatistics;
            if (refObj == null) {

 * you may not use this file except in compliance with the License.
            String replName = (object != null) ? object.getName() : objectName;
                        propertyList.add(parameter);
    final DbLinkCache dbLinkCache;
        outputReader.enableServerOutput(

            }
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
            Object instance4Callback = null;
    String queryGetActiveDB;


        protected JDBCStatement prepareChildrenStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, 
    }

            boolean isNullObject = object == null && objectName == null;
        hasStatistics = false;
    ///////////////////////////////////////////////
                    if (checkForPasswordWillExpireWarning(warninig)) {
        @Override
                @NotNull JDBCResultSet dbResult) throws SQLException, DBException {
import org.jkiss.dbeaver.model.exec.output.DBCServerOutputReader;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {

        if (refSchema != null) {
     * Altibase Roles
        return jobCache.getAllObjects(monitor, this);

    private List<AltibaseProperty> loadPropertyList(@NotNull DBRProgressMonitor monitor) throws DBException {


            String className4MessageCallback = "N/A";
    @NotNull
                for (SQLWarning warninig = connection.getWarnings();

package org.jkiss.dbeaver.ext.altibase.model;
            }
    @Association
             *  the object creator as owner like Oracle.
        return userCache.getObject(monitor, this, name);
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
            }
            return session.prepareStatement("SELECT * FROM V$TABLESPACES ORDER BY NAME ASC");
                        .loadClass(className4Connection)
import org.jkiss.dbeaver.ext.generic.GenericConstants;
    /*
                                + " 'Unknown') AS repl_mode, "
    @Override
                        + " ORDER BY r.replication_name"

            }
                    + " remote_user_name, remote_table_name, remote_partition_name");
        }
    }
    }
            return session.prepareStatement("SELECT * FROM v$memstat ORDER BY max_total_size DESC");
            return true;
import org.jkiss.dbeaver.DBDatabaseException;
    }
                if (instance4Callback == null) {
        hasStatistics = false;
            throw e;
            if (refObj == null) {
    
        DBSObject refObj = null;
        public boolean isServerOutputEnabled() {
                    + " WHERE replication_name = ?"
            try (JDBCSession session = (JDBCSession) context.openSession(monitor, 
                            + " DECODE( r.role,"
    }
            } catch (SQLException e) {
                            + " r.remote_last_ddl_xsn,"
            final JDBCPreparedStatement dbStat = session.prepareStatement(
        }
import org.jkiss.dbeaver.model.struct.DBSObject;

    public Collection<AltibaseMemoryModule> getMemoryModules(DBRProgressMonitor monitor) throws DBException {
                callBackMsg.delete(0, callBackMsg.length());
    @Override
                    }
     * Returns public synonym as a collection.
    }
                refObj = refSchema.getIndex(monitor, refObjName);
                try (JDBCResultSet resultSet = dbStat.executeQuery()) {
import java.sql.SQLWarning;
                refObj = refSchema.getPackage(monitor, refObjName);
        super(monitor, container, metaModel, new AltibaseSQLDialect());
                            + " r.applier_init_buffer_size,"
 *
        protected AltibaseJob fetchObject(@NotNull JDBCSession session, @NotNull GenericStructContainer owner,
                if (classLoader == null) {

        return loadPropertyList(monitor);
            final JDBCPreparedStatement dbStat = session.prepareStatement(

            outputReader.isServerOutputEnabled());

                className4Connection = connClassNamePrefix + AltibaseConstants.CLASS_NAME_4_CONNECTION_POSTFIX;
            final JDBCPreparedStatement dbStat = session.prepareStatement(
            DBWorkbench.getPlatformUI().showWarningMessageBox(
                                + " 3, 'Propagation',"

            if (callBackMsg != null) {
                }
            throw new DBDatabaseException("Can't read tablespace statistics", e, getDataSource());

            
import java.util.ArrayList;
        return super.getAdapter(adapter);
        public AltibaseDataSource getDataSource() {
     */
        }
                }

                connClassNamePrefix = conn.getClass().getName().split("\\.")[0];
            if (refObj == null) {

            return new AltibaseTablespace(owner, resultSet);
    static class MemoryModuleCache extends JDBCObjectCache<GenericStructContainer, AltibaseMemoryModule> {
        
            boolean isNullObject = object == null && objectName == null;
            this.dataSource = dataSource;
                                + " 0, 'General',"
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {

        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, 
    @Association
        return (AltibaseMetaModel) super.getMetaModel();
            return new AltibaseReplicationItem(replication, dbResult);
                        + " FROM system_.sys_replications_ r, system_.sys_repl_hosts_ rh"
        @Override
             */
                            + " r.remote_fault_detect_time,"

        protected AltibaseMemoryModule fetchObject(@NotNull JDBCSession session, 
    public Collection<AltibaseReplication> getReplications(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
            @SuppressWarnings("rawtypes")
    private GenericSchema publicSchema;

        public JDBCStatement prepareLookupStatement(JDBCSession session, GenericStructContainer owner,

    /**
        return false;
                    while (dbResult.next()) {
        return true;
    public Collection<AltibaseTablespace> getTablespaces(DBRProgressMonitor monitor) throws DBException {


                dbStat.setString(1, object != null ? object.getName() : objectName);
import org.jkiss.dbeaver.model.DBUtils;
                refObj = refSchema.getSynonym(monitor, refObjName);
                        return null;
        protected AltibaseUser fetchObject(@NotNull JDBCSession session, @NotNull AltibaseDataSource owner, 
    }
                            "Failed to get method: %s of class %s ", 
        }
    @Association
        protected AltibaseTablespace fetchObject(
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT * FROM V$PROPERTY ORDER BY NAME ASC")) {
    // DBMS Procedure Output
    ///////////////////////////////////////////////
                    + " ORDER BY local_user_name, local_table_name, local_partition_name, "
            @NotNull JDBCExecutionContext context, 
                    }
        @NotNull
                @NotNull DBCOutputWriter output) throws DBCException {

        AltibaseUser user = userCache.getObject(monitor, this, name);
                + "ORDER BY user_name");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
     * Get User cache
    public Collection<AltibaseUser> getUsers(DBRProgressMonitor monitor) throws DBException {
    final ReplicationCache replCache;
        return replCache.getAllObjects(monitor, this);
                    + " ORDER BY job_name ASC");
            if (refObj == null) {

    

    /**
 * Unless required by applicable law or agreed to in writing, software
    private String dbName;
                }
            @NotNull DBRProgressMonitor monitor, 
                    warninig = warninig.getNextWarning()
            }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
            return new AltibaseJob(owner, dbResult);
        if (adapter == DBCServerOutputReader.class) {
                @Nullable DBCExecutionResult executionResult,
     */

        }
            } catch (SQLException e) {
            return adapter.cast(outputReader);

    ///////////////////////////////////////////////
            if (refObj == null) {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, 
        }
     * Returns Altibase roles 

             *  If found, judge it as a public schema.
     * Returns a specific Altibase role.
     * Return a specific cached replication.
    @Override
    
            return adapter.cast(new AltibaseQueryPlanner(this));
                    warninig != null && !isPasswordExpireWarningShown;
    @Nullable
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
    protected Connection openConnection(
        return this;
    }

import org.jkiss.code.NotNull;
        @Override
                + "FROM SYSTEM_.SYS_USERS_ u, V$TABLESPACES tbs1, V$TABLESPACES tbs2 "
                    List<AltibaseProperty> propertyList = new ArrayList<>();
     */
 * DBeaver - Universal Database Manager

        if (hasStatistics && !forceRefresh) {
    public AltibaseGrantee getGrantee(DBRProgressMonitor monitor, String name) throws DBException {
            return adapter.cast(new AltibaseServerSessionManager(this));
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
    static class ReplicationCache extends JDBCStructLookupCache<GenericStructContainer, AltibaseReplication, AltibaseReplicationItem> {
    @Override
        }
        protected AltibaseRole fetchObject(@NotNull JDBCSession session, @NotNull AltibaseDataSource owner, 
                @Nullable DBCStatement statement,
        @Override
     * Returns Altibase users. 
    final TablespaceCache tablespaceCache = new TablespaceCache();

                    + (isNullObject ? "" : "  WHERE s.job_name = ?")
                @NotNull DBRProgressMonitor monitor,
     */
        } catch (DBCException e) {
        return true;
     * Returns a specific Altibase user. 
            String connClassNamePrefix = "Altibase";
    @Association
                    + " ORDER BY link_name ASC");

        return dbLinkCache.getAllObjects(monitor, this);
    }
            super("Replication");
                            + " r.is_started,"
    public AltibaseDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, AltibaseMetaModel metaModel)
    }
                @NotNull AltibaseDataSource owner, 
        @Override

     * Get tablespace cache
     */
import java.sql.Connection;
        }
            throws DBException {
        super.refreshObject(monitor);
            if (CommonUtils.isNotEmpty(replName)) {

     * Return all cached replications.
            return dbStat;
    public DBSObject findSynonymTargetObject(DBRProgressMonitor monitor, @Nullable String refSchemaName, @NotNull String refObjName)
    }
                refObj = refSchema.getTable(monitor, refObjName);
     */
    public <T> T getAdapter(@NotNull Class<T> adapter) {
    static class DbLinkCache extends JDBCObjectLookupCache<GenericStructContainer, AltibaseDbLink> {
                    }
     */
        @Override
    @Association
    }


            }

                @NotNull DBCExecutionContext context,
                }
        }
        }
        }
                method2RegisterCallback = classLoader
        if (child == null) {
                    "SELECT * FROM system_.sys_jobs_ s "
 * distributed under the License is distributed on an "AS IS" BASIS,
        @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    @Association

                if (tablespace != null) {
    @Association
                                          @NotNull JDBCResultSet dbResult) throws SQLException, DBException {
        }
        return publicSchema.getSynonyms(monitor);
        }
import org.jkiss.dbeaver.model.exec.*;
    @Association
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                            + " rh.conn_type AS remote_conn_type,"
            return new AltibaseUser(owner, resultSet);
                    AltibaseConstants.PASSWORD_WILL_EXPIRE_WARN_DESCRIPTION);
        @Override
        queryGetActiveDB = CommonUtils.toString(container.getDriver().getDriverParameter(GenericConstants.PARAM_QUERY_GET_ACTIVE_DB));

        this.initialize(monitor);
                if (method2RegisterCallback == null) {
    public List<AltibaseProperty> getProperties(DBRProgressMonitor monitor)
     * Get Replication Cache
}
                refObj = refSchema.getProcedureByName(monitor, refObjName);
    @Association

            if (refObj == null) {


    }
            if (refObj == null) {
                                             @NotNull JDBCResultSet dbResult) throws SQLException, DBException {
    }
        @Nullable
    }
        protected AltibaseDbLink fetchObject(@NotNull JDBCSession session, @NotNull GenericStructContainer owner,
                                + " 'Unknown') AS conflict_resolution,"
 *

        return replCache.getObject(monitor, this, name);
        }
        @Override
    private class AltibaseOutputReader implements DBCServerOutputReader {
        dbLinkCache = new DbLinkCache();
                @NotNull AltibaseReplication replication, @NotNull JDBCResultSet dbResult) throws SQLException, DBException {

    private boolean isPasswordExpireWarningShown;
     */
import org.jkiss.dbeaver.runtime.DBWorkbench;

    }
                    ((AltibaseSynonym) refObj).setPublicSynonym();
    }
    }
                            + " r.remote_xsn,"
    }
                });
    public Collection<AltibaseDbLink> getPublicDbLinks(@NotNull DBRProgressMonitor monitor) throws DBException {
                        isPasswordExpireWarningShown = true;
        return tablespaceCache.getAllObjects(monitor, this);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

                                + " 2, 'Slave', "
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
                }
                    throw new NoSuchMethodException(String.format(
    static class JobCache extends JDBCObjectLookupCache<GenericStructContainer, AltibaseJob> {
            Class class4MsgCallback = null;
     */
            setListOrderComparator(DBUtils.<AltibaseReplication>nameComparatorIgnoreCase());
 */
                                + " 2,'Eager', "
                            + " DECODE( r.invalid_recovery,"
        public JDBCStatement prepareLookupStatement(JDBCSession session, GenericStructContainer owner,
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load properties")) {
                className4MessageCallback = connClassNamePrefix + AltibaseConstants.CLASS_NAME_4_MESSAGE_CALLBACK_POSTFIX;
        jobCache = new JobCache();

                            AltibaseConstants.METHOD_NAME_4_REGISTER_MESSAGE_CALLBACK,
    public ReplicationCache getReplicationCache() {
                    "SELECT * FROM system_.sys_repl_items_"
    final UserCache userCache = new UserCache();
        }
import java.util.List;
            /*

    @Association
        try {
                output.println(null, callBackMsg.toString());
    @NotNull
    public boolean isStatisticsCollected() {
    public AltibaseReplication getReplication(DBRProgressMonitor monitor, String name) throws DBException {
                if (class4MsgCallback == null) {
    ///////////////////////////////////////////////

            }
        protected AltibaseReplicationItem fetchChild(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, 
                            + " r.give_up_time,"
                @NotNull GenericStructContainer owner, @NotNull JDBCResultSet dbResult) throws SQLException, DBException {


                    + " WHERE user_mode = 0"
        }
import org.jkiss.dbeaver.ext.altibase.model.plan.AltibaseQueryPlanner;
                }
    @Override
                                + " 'Unknown') AS role,"

            return dbStat;
        @NotNull
    @Override
        this.roleCache.clearCache();
            }
                    throw new ClassNotFoundException("Failed to load class: " + className4MessageCallback);
    ///////////////////////////////////////////////
        protected JDBCStatement prepareObjectsStatement(

                                + " 1, 'Log Analyzer',"


        publicSchema.setVirtual(true);
import java.lang.reflect.Method;

        private StringBuilder callBackMsg = new StringBuilder();
            return user;
                + " FROM SYSTEM_.SYS_USERS_ u "
     */
        if (outputReader == null) {
    }
    @Override
                @NotNull AltibaseDataSource owner) throws SQLException {
        } else if (adapter == DBCQueryPlanner.class) {
        this.jobCache.clearCache();
            return dbStat;
    }
        return tablespaceCache;

        @NotNull
             *  So, first look for it in the owner's private schema, and if it is not found, then try to find it at public schema.
    // Replications
        }
    @NotNull
import java.lang.reflect.InvocationHandler;
        if (user != null) {
    }
                class4MsgCallback = classLoader.loadClass(className4MessageCallback);
            return new AltibaseDbLink(owner, dbResult);
        this.tablespaceCache.clearCache();
                            + " DECODE( r.repl_mode, "
    /**
        }
        // Enable DBMS output
                                + " 0, 'Valid',"
import org.jkiss.dbeaver.ext.altibase.model.session.AltibaseServerSessionManager;
    static class RoleCache extends JDBCObjectCache<AltibaseDataSource, AltibaseRole> {
    @Association
                                + " 0, 'Default', "
            return new AltibaseReplication(owner, dbResult);
                    DBCExecutionPurpose.UTIL, (enable ? "Enable" : "Disable") + " DBMS output")) {


    final MemoryModuleCache memoryModuleCache;
        this.dbLinkCache.clearCache();
    }
                            + (CommonUtils.isEmpty(replName) ? "" : " AND r.replication_name = ?")
        return jobCache;
        return roleCache.getObject(monitor, this, name);


import org.jkiss.dbeaver.ext.generic.model.GenericSynonym;


            hasStatistics = true;
    }
    }
                + "WHERE u.user_type = 'U' AND u.DEFAULT_TBS_ID = tbs1.id AND u.TEMP_TBS_ID = tbs2.id "
    final RoleCache roleCache = new RoleCache();
        @Override
    ///////////////////////////////////////////////
     */
        final AltibaseDataSource dataSource;
    @Nullable
        publicSchema = new GenericSchema(this, null, AltibaseConstants.USER_PUBLIC);
                + " ORDER BY user_name");
        } else {
                    dbName = JDBCUtils.safeGetStringTrimmed(resultSet, 1);
    /**
        @Override
            } 
            return getContainer().getPreferenceStore().getBoolean(AltibaseConstants.PREF_DBMS_OUTPUT);
    // Jobs
    public MemoryModuleCache getModuleCache() {

    }
                            + " r.peer_replication_name"
            child = this.getReplication(monitor, childName);
    }
        }
        }
    final JobCache jobCache;
        if (dbName == null) {
            Method method2RegisterCallback = null;
            context,

        public void readServerOutput(
                    "SELECT null as USER_NAME, l.* FROM system_.sys_database_links_ l"
    }
            }
                }
    public AltibaseMetaModel getMetaModel() {
     */
        protected ReplicationCache(AltibaseDataSource dataSource) {
     * Altibase metadata does not provide information about the target synonym's original object type.
                boolean enable) throws DBCException {
    public Collection<AltibaseMemoryModule> getModules(@NotNull DBRProgressMonitor monitor) throws DBException {
                        AltibaseProperty parameter = new AltibaseProperty(this, dbResult);
                }
                @NotNull AltibaseDataSource owner) throws SQLException {
                                + " 4, 'Propagation for Log Analyzer ',"
import org.jkiss.dbeaver.model.meta.Association;
            @NotNull DBRProgressMonitor monitor, 
    @Override
                refObj = publicSchema.getSynonym(monitor, refObjName);

                                + " 1, 'Invalid',"

    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
                            + " r.give_up_xsn,"
        return child;
            final JDBCPreparedStatement dbStat = session.prepareStatement(
        DBSObject child = super.getChild(monitor, childName);
     * Returns Altibase grantee. 
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
     * Get tablespace colection
        }
                    "SELECT"
        return dbName;

                throw new DBDatabaseException(e, this);
    @NotNull
    
                @NotNull GenericStructContainer owner) throws SQLException {
        }
        try {
            }
import org.jkiss.utils.CommonUtils;
                                + " 0, 'Lazy', "
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, 
        }
        super.initialize(monitor);
        return userCache.getAllObjects(monitor, this);
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {

            }
    /**
                instance4Callback = Proxy.newProxyInstance(classLoader, 
        return memoryModuleCache.getAllObjects(monitor, this);
    // Modules

            } catch (Exception e) {
                    resultSet.next();

                                + " 'Unknown') AS recoverable,"
                + " WHERE u.user_type = 'R' AND u.user_name <> 'PUBLIC'"
                throw new DBCException(e, context);
                "SELECT * "
                    AltibaseConstants.NEW_LINE + 
    }
                    + (isNullObject ? "" : " AND l.link_name = ?")
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
                classLoader = conn.getClass().getClassLoader();
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.replCache.clearCache();
            JDBCExecutionContext initFrom) throws DBException {
    protected void initializeContextState(

    static class UserCache extends JDBCObjectCache<AltibaseDataSource, AltibaseUser> {
     */

    public String getDbName(JDBCSession session) throws DBException {
    void resetStatistics() {
        @Override
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructLookupCache;
        public void enableServerOutput(

import java.util.Collection;
            dbStat.setString(1, forTable.getName());
    public Collection<AltibaseJob> getJobs(@NotNull DBRProgressMonitor monitor) throws DBException {
        if ((warning != null) && (warning.getErrorCode() == AltibaseConstants.EC_PASSWORD_WILL_EXPIRE)) {
            // No object type from database metadata, so need to find it one by one.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 *
        @Override
                            + " DECODE( r.conflict_resolution,"
                            + " r.xsn,"
                log.error("Failed to register DBMS output message callback method: " + e.getMessage());
                    throw new SecurityException("Failed to load ClassLoader");
    public JobCache getJobCache() {
                        }
        super.initializeContextState(monitor, context, initFrom);
/*
        @Override
        return memoryModuleCache.getAllObjects(monitor, this);
    @Override
    /**
    }
    }
        }
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.DBPObjectStatisticsCollector;

            throws DBException {
 * limitations under the License.
    /**
                            + " parallel_applier_count,"
    /**
        @Override
        @Override
            }
    @Override

    /**

        @Override
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
        replCache = new ReplicationCache(this);
        } else if (adapter == DBAServerSessionManager.class) {
            for (AltibaseTablespace tbs : tablespaceCache.getAllObjects(monitor, AltibaseDataSource.this)) {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            try {
