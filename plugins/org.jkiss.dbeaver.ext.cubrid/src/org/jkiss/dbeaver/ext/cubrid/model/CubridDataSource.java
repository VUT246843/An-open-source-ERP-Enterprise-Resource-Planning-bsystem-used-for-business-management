            DBWorkbench.getPlatformUI().showMessageBox(
    }
            String sql = wrapShardQuery("select * from db_user");

        @Nullable

            return false;
        }

                "The connected CUBRID is an EOL version. Limited features are available.",
        public boolean isAsyncOutputReadSupported() {
        }
    protected void initializeContextState(DBRProgressMonitor monitor,
            loadCollations(monitor);
            return new CubridPrivilage(container, name, dbResult);
                        session.getOriginal().prepareCall("CALL dbms_output.get_line(?,?)")) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                throws SQLException, DBException {
        }
    }
    @NotNull
        }
            String query = wrapShardQuery("select db_user.name, user_group.name from db_user, table(groups) as groups_tb(user_group) where db_user.name = ?");
        return serverCache.getObject(monitor, this, name);
    public CubridServer getCubridServer(@NotNull DBRProgressMonitor monitor, @Nullable String name) throws DBException {
    public void setSupportMultiSchema(@NotNull boolean supportMultiSchema) {
    private void setTracking(@NotNull DBRProgressMonitor monitor) throws DBException {
        } catch (SQLException e) {
                @NotNull CubridDataSource container,
                        return table;
    @Override
        @Override
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
    }
        if (!isShard || hasShardHint(sql.toString())) {
    @NotNull
        return this;
    private Map<String, CubridCollation> collations;
    public boolean splitProceduresAndFunctions() {
                throws DBCException {
    }
        if (adapter == DBSStructureAssistant.class) {

    public CubridCollation getCollation(String name) {
        }

            JDBCExecutionContext initFrom)
                (JDBCSession)
        return idPattern.matcher(sql).find() || valPattern.matcher(sql).find();
    public boolean isSupportDbmsOutputPlCsql() {
    }
            @Nullable String catalogName,
                throws SQLException {
    }
        Pattern valPattern = Pattern.compile(CubridConstants.REGEX_PATTERN_SHARD_VAL, Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);

    @Nullable
    public CubridServerCache getServerCache() {
                    while (dbResult.next()) {

        return metaModel;
                throws SQLException {
            throw new DBException("Check Support DBMSOutput failed", e);
                    String line;

                    st.execute(wrapShardQuery("set @collect_exec_stats = 1"));
                for (GenericSchema schema : this.getCubridUsers(monitor)) {
                return;
        }
        return supportDbmsOutputPlCsql;
    @NotNull
import org.jkiss.utils.CommonUtils;
            @NotNull DBCExecutionContext context)
                throws SQLException, DBException {
    public CubridDataSource getDataSource() {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;


            return sql;
    }
                if (store.getBoolean(CubridConstants.STATISTIC_TRACE))
    }
    }
                }

            return adapter.cast(new CubridStructureAssistant(this));
            } catch (SQLException e) {



        } catch (SQLException e) {
import org.jkiss.dbeaver.model.exec.output.DBCServerOutputReader;
    }
    private final CubridMetaModel metaModel;
        if (schemaName != null) {
    public boolean hasShardHint(String sql) {
                    }
        this.metaModel = new CubridMetaModel();
 * Copyright (C) 2010-2025 DBeaver Corp and others
                @Nullable DBCExecutionResult executionResult,
            JDBCExecutionContext context,
                    st.execute(wrapShardQuery("SET TRACE ON"));
    private CubridOutputReader outputReader = null;
                        CubridCollation collation = new CubridCollation(charset, dbResult);
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                }
    }
    @Nullable
                        collations.put(collation.getName(), collation);
            @NotNull DBRProgressMonitor monitor,
 * Unless required by applicable law or agreed to in writing, software
        return serverCache;
        }
        }

        public boolean isServerOutputEnabled() {

                }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "Load charsets")) {
    public class CubridServerCache extends JDBCObjectCache<CubridDataSource, CubridServer> {



            try (JDBCSession session =
    private List<String> privilegeGroups;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "Load privilege Group")) {
            @NotNull DBRProgressMonitor monitor,
    public List<CubridPrivilage> getCubridPrivilages(@NotNull DBRProgressMonitor monitor) throws DBException {
                        privilegeGroups.add(groups);
            final JDBCPreparedStatement dbStat = session.prepareStatement(sql);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        super.refreshObject(monitor);
            throw new DBException("Load collations failed", e);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            .getInt(CubridConstants.PREF_DBMS_OUTPUT_BUFFER_SIZE);
    }
    public List<CubridServer> getCubridServers(@NotNull DBRProgressMonitor monitor) throws DBException {
        super(monitor, container, metaModel, new CubridSQLDialect());
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                    while (status == 0) {

                return charset;
                @Nullable DBCStatement statement,
        super.initialize(monitor);
        charsets = new ArrayList<>();

    @NotNull
    }
        }
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
            return dbStat;
        for (CubridCharset charset : charsets) {
        protected JDBCStatement prepareObjectsStatement(


    public boolean getSupportMultiSchema() {

            throws DBException {
            if (!isServerOutputEnabled()) {
    }
    public boolean isDBAGroup() {

                            output.println(null, line);
    public <T> T getAdapter(@NotNull Class<T> adapter) {
    }
    public StringBuilder wrapShardQuery(StringBuilder sql) {

                    (JDBCSession)
        }

            }
                @NotNull JDBCSession session,
    private String shardType = "SHARD ID";

                            context.openSession(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        this.privilageCache = new CubridPrivilageCache();
    public ArrayList<String> getCollations() {
        }

    private boolean supportDbmsOutputPlCsql = false;
                        if (status == 0) {
                throws DBCException {

        } catch (SQLException e) {
                        CubridCharset charset = getCharset(charsetName);
    public CubridCharset getCharset(@NotNull String name) {
            final JDBCPreparedStatement dbStat = session.prepareStatement(sql);
            try (JDBCStatement st = session.createStatement()) {
 * You may obtain a copy of the License at
    @NotNull
    @Override
                @NotNull JDBCSession session,
        return privilageCache.getAllObjects(monitor, this);
import org.jkiss.dbeaver.model.exec.output.DBCOutputWriter;
                    throw new DBCException(e, context);
                    if (table != null) {
    }
                @NotNull JDBCResultSet dbResult)
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @NotNull

        return getContainer().getConnectionConfiguration().getUserName().toUpperCase();
import org.jkiss.dbeaver.DBException;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "Load collations")) {
        return privilageCache;
                    }
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                @NotNull CubridDataSource container)
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
        setTracking(monitor);
        return this.supportMultiSchema;

            outputReader.enableDbmsOutput(monitor, context);
    @Override
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        charsets.sort(DBUtils.<CubridCharset>nameComparator());
    public void setShardType(String shardType) {
                        charset.addCollation(collation);



                            line = cstmt.getString(1);
                    int status = 0;
    public void setShard(boolean isShard) {
    private class CubridOutputReader implements DBCServerOutputReader {
    public String getCurrentUser() {
 */
        ArrayList<String> collationList = new ArrayList<String>(collations.keySet());
        return super.getAdapter(adapter);

    private ArrayList<CubridCharset> charsets;
    public CubridPrivilageCache getCubridPrivilageCache() {
                    getContainer()
    public void setShardVal(String shardVal) {
    }
                @NotNull DBCOutputWriter output)
    public Collection<CubridCharset> getCharsets() {
                || privilegeGroups.contains(CubridConstants.DBA);
        }
        }
        return types.values();
    @NotNull
        if (outputReader == null && checkSupportDbmsOutput(monitor, context)) {
    private final CubridServerCache serverCache;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(query)) {

    @Override
        }
        return isEOLVersion;
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
                                    monitor, DBCExecutionPurpose.UTIL, "Read DBMS output")) {
import org.jkiss.dbeaver.model.struct.DBSStructureAssistant;
                    (JDBCSession)
        protected CubridPrivilage fetchObject(
                } catch (SQLException e) {
    public List<GenericSchema> getCubridUsers(@NotNull DBRProgressMonitor monitor) throws DBException {
                    cstmt.registerOutParameter(1, java.sql.Types.VARCHAR);
                                    monitor, DBCExecutionPurpose.UTIL, "Enable DBMS output")) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                                monitor, DBCExecutionPurpose.UTIL, "Read Database Version")) {

 *
import org.jkiss.dbeaver.model.DBUtils;
                        CubridCharset charset = new CubridCharset(this, dbResult);
import java.util.regex.Pattern;

    public void loadPrivilege(DBRProgressMonitor monitor) throws DBException {
                @NotNull CubridDataSource container)
        @NotNull
                        context.openSession(
        return this.getSchemas();
            types.put(dataType.getName(), dataType);
        if (!isEOLVersion()) {
                @NotNull JDBCResultSet dbResult)
    }
                }
import java.sql.SQLException;
    public class CubridPrivilageCache extends JDBCObjectCache<CubridDataSource, CubridPrivilage> {
        try (JDBCSession session =
    }
    @NotNull
        @Override
            throws DBException {
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
        privilageCache.clearCache();
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        return isShard;
        }
            @NotNull String tableName)
    @NotNull
    @NotNull
        return CubridConstants.DBA.equalsIgnoreCase(getCurrentUser())
            return getContainer().getPreferenceStore().getBoolean(CubridConstants.PREF_DBMS_OUTPUT);
            return this.getSchema(schemaName).getTable(monitor, tableName);
        return String.format("/*+ %s(%s) */ ", hintKey, shardVal);
        this.shardVal = shardVal;
    }
    public boolean isShard() {
                return this.getSchema(schemas[0].toUpperCase()).getTable(monitor, schemas[1]);
        public void readServerOutput(

        public void enableDbmsOutput(DBRProgressMonitor monitor, DBCExecutionContext context)
    private String getShardHint() {
        } else {
    }
                }
                    }
        return charsets;
        return null;
 *

        this.isEOLVersion = isEOLVersion;
    }
                if (!CommonUtils.isEmpty(store.getString(CubridConstants.STATISTIC)))
        return new CubridShard(this, shardType, shardVal);
            try (JDBCPreparedStatement dbStat = session.prepareStatement(wrapShardQuery("show collation"))) {
    @NotNull
                "Connected CUBRID Info",
    public void setEOLVersion(@NotNull boolean isEOLVersion) {
/*
            loadPrivilege(monitor);

                        charsets.add(charset);
                dbStat.setString(1, currentUser);
import org.jkiss.dbeaver.model.struct.DBSDataType;
                    GenericTableBase table = schema.getTable(monitor, tableName);
        return null;
    public boolean supportsServer() {
                false);
        }
        collations = new LinkedHashMap<>();
        this.isShard = isShard;
        return serverCache.getAllObjects(monitor, this);
            String[] schemas = tableName.split("\\.");
        } catch (SQLException e) {
        this.serverCache = new CubridServerCache();
        @Nullable
        return getShardHint() + sql;
    public CubridMetaModel getMetaModel() {
    @Override

    @NotNull
import org.jkiss.code.NotNull;
                    while (dbResult.next()) {
    public List<CubridShard> getCubridShards() {

                            context.openSession(
                @NotNull DBRProgressMonitor monitor,
            loadCharsets(monitor);
            int bufferSize =
    private boolean supportMultiSchema;
                    }
        @Override
        }
 * See the License for the specific language governing permissions and

 * limitations under the License.
        } else if (adapter == DBCServerOutputReader.class) {
    private boolean isEOLVersion;
            throw new DBException("Load privilege failed", e);

    }
            @Nullable String schemaName,
    public GenericSchema getSchema(String name) {
        return collationList;
    public void loadCollations(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override
    }
        return supportDbmsOutputPlCsql;

    }
        if (outputReader != null) {

                    }
    }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
                String currentUser = getContainer().getConnectionConfiguration().getUserName().toUpperCase();
                        cstmt.execute();

                        status = cstmt.getInt(2);
    }
    @Override
            }
            try (JDBCPreparedStatement dbStat = session.prepareStatement(wrapShardQuery("select * from db_charset"))) {
    }
        }
                cstmt.execute();
                    cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
    public boolean isSupportEnableDbms() {
                @NotNull JDBCSession session,

    public void loadCharsets(@NotNull DBRProgressMonitor monitor) throws DBException {
        } catch (SQLException e) {
            throws DBException {
            return sql;

        supportDbmsOutputPlCsql = isServerVersionAtLeast(11, 4);
        Pattern idPattern = Pattern.compile(CubridConstants.REGEX_PATTERN_SHARD_ID, Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
    }
    }
                throw new DBCException(e, context);
            }
    public Collection<? extends DBSDataType> getDataTypes(@NotNull DBRProgressMonitor monitor) throws DBException {

    public String wrapShardQuery(String sql) {
        return Collections.singletonList(new CubridShard(this, shardType, shardVal));
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
        return getSupportMultiSchema();
        @NotNull
}
        }
            @NotNull DBRProgressMonitor monitor,
        return true;
    }
            if (charset.getName().equals(name)) {
    }
            throw new DBException("Load charsets failed", e);
                        String charsetName = JDBCUtils.safeGetString(dbResult, "charset");
            @NotNull CubridMetaModel metaModel)
    private boolean isShard = false;
        if (!isShard || hasShardHint(sql)) {
        for (DBSDataType dataType : super.getDataTypes(monitor)) {
public class CubridDataSource extends GenericDataSource
    }
    private final CubridPrivilageCache privilageCache;
            throws DBException {
    public CubridShard getCubridShard() {
            return new CubridServer(container, dbResult);
                            .getPreferenceStore()
import java.util.*;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                @NotNull CubridDataSource container,
    private boolean checkSupportDbmsOutput(
            @NotNull DBPDataSourceContainer container,

                try (CallableStatement cstmt =
    @Nullable

        return super.getSchema(name == null ? null : name.toUpperCase(Locale.ENGLISH));
        return collations.get(name);
            try (JDBCSession session =
                        }
    }
package org.jkiss.dbeaver.ext.cubrid.model;
    @Override
        return sql.insert(0, getShardHint());
        @Override
            }
                    while (dbResult.next()) {
    private String shardVal = "0";
    }
import org.jkiss.code.Nullable;
    }
    public CubridDataSource(
        } else {

    }
            }
            return dbStat;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.ext.cubrid.model.meta.CubridMetaModel;
            readDatabaseServerVersion(session, session.getMetaData());

                CallableStatement cstmt = session.getOriginal().prepareCall("CALL dbms_output.enable(?)");
            }
    }
            if (schemas.length > 1) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
            String name = JDBCUtils.safeGetString(dbResult, "name");
        }
        @Override
    }
 * DBeaver - Universal Database Manager
                        String groups = JDBCUtils.safeGetString(dbResult, "user_group.name");
        @Override
        return this;

        }
        serverCache.clearCache();

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
            outputReader = new CubridOutputReader();
    public boolean isEOLVersion() {
    @Override
    @NotNull
import java.sql.CallableStatement;
    }
            String sql = wrapShardQuery("select * from db_server");
        protected CubridServer fetchObject(
    @NotNull
                @NotNull JDBCSession session,
        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "set trace")) {
        super.initializeContextState(monitor, context, initFrom);
    }
                @NotNull DBCExecutionContext context,
    @Nullable
        Map<String, DBSDataType> types = new HashMap<>();
        return getContainer().getPreferenceStore().getBoolean(CubridConstants.PREF_DBMS_OUTPUT);
        String hintKey = "SHARD ID".equalsIgnoreCase(shardType) ? "SHARD_ID" : "SHARD_VAL";
        @Override

            }

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;

        protected JDBCStatement prepareObjectsStatement(
            }
            return adapter.cast(outputReader);
                cstmt.setInt(1, bufferSize);
    public GenericTableBase findTable(
    }
            }
    }
    }


import org.jkiss.dbeaver.model.exec.*;
 * you may not use this file except in compliance with the License.
            throw new DBException("Can't set trace", e);
        this.supportMultiSchema = supportMultiSchema;
 *
{
            } else {

        this.shardType = shardType;
        privilegeGroups = new ArrayList<>();
