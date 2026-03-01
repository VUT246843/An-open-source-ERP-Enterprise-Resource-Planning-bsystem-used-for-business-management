        for (SQLServerSchema schema : getSchemas(monitor)) {

    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        this.dataSource = dataSource;
                dbStat.setString(1, object != null ? object.getName() : objectName);
        }


                .append(SQLServerUtils.getSystemTableName(database, "triggers")).append(" t");
        }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
    }
    public Collection<SQLServerDataType> getDataTypes(DBRProgressMonitor monitor) throws DBException {
        return databaseTotalSize != null;
    private SchemaCache schemaCache = new SchemaCache();
            if (!showAllSchemas) {
        @Override
import org.jkiss.dbeaver.model.*;

    }
        return databaseId;
        return dataSource;
    }
    }

    }
                statement = "SELECT * FROM " + SQLServerUtils.getSystemTableName(database, "types") + " WHERE is_user_defined = 1";
                sql.append(sysSchema).append(".schemas s");
            }
            log.error("Error reading database data types", e);
                // sys.table_types is supported only for SQL Server and Azure SQL Database, not for Azure Synapse.
    @Override
            StringBuilder sql = new StringBuilder(500);
        log.debug("Data type '" + typeID + "' not found in database " + getName());
    }

    public SQLServerDataSource getDataSource() {
    void refreshDataTypes() {
    private String description;
            }


        return isTempDatabase;
            if (dataType != null) {

 * Copyright (C) 2010-2026 DBeaver Corp and others

        return schemaCache.getObject(monitor, this, name);
    public Collection<SQLServerSchema> getSchemas(DBRProgressMonitor monitor) throws DBException {
    public DBSObject getParentObject() {

        public void removeObject(@NotNull SQLServerDataType object, boolean resetFullCache) {


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public void setName(@NotNull String newName) {
            }
     */
    }
    implements
        @Override
                JDBCUtils.appendFilterClause(sql, schemaFilters, "s.name", true, owner.getDataSource());

    }
    }
            }
        }
    @Override
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
        if (!monitor.isCanceled()) {
                JDBCUtils.setFilterParameters(dbStat, 1, schemaFilters);
    }
        this.isTempDatabase = name.equalsIgnoreCase(SQLServerConstants.TEMPDB_DATABASE);

 */
    static class SchemaCache extends JDBCObjectCache<SQLServerDatabase, SQLServerSchema> {
        @NotNull
    }
            setListOrderComparator(DBUtils.nameComparatorIgnoreCase());
    }
        DBPSystemObject,
                        "tto.object_id = tt.type_table_object_id\n" +

    private boolean persisted;
            } catch (DBException e) {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.meta.Association;
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)

    }
    private class DataTypeCache extends JDBCObjectCache<SQLServerDatabase, SQLServerDataType> {
        return null;
        //this.description = JDBCUtils.safeGetString(resultSet, "description");
        @Override
        typesCache.clearCache();


            super.removeObject(object, resetFullCache);
            }
            if (database.getDataSource().isSynapseDatabase()) {
            String sysSchema = SQLServerUtils.getSystemSchemaFQN(dataSource, owner.getName(), SQLServerConstants.SQL_SERVER_SYSTEM_SCHEMA);
    private final long databaseId;
        @Override
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
 * You may obtain a copy of the License at
 *

                log.debug("Error reading default database schemas", e);
                }

    }
        return triggerCache;
        }
        @NotNull String name
        @Override
    }




        protected SQLServerSchema fetchObject(@NotNull JDBCSession session, @NotNull SQLServerDatabase owner, @NotNull JDBCResultSet resultSet) {

        return getName();
    SQLServerDataType getDataTypeByUserTypeId(DBRProgressMonitor monitor, int typeID) throws DBException {
        return typesCache;
        return getChildren(monitor);
                sql.append(" AND t.name=?");
    //////////////////////////////////////////////////
    }
            throw SQLServerUtils.mapException(exception);
    private final SQLServerDataSource dataSource;
        }
    }
            sql.append("s.*,ep.value as description FROM ");
        protected SQLServerDatabaseTrigger fetchObject(@NotNull JDBCSession session, @NotNull SQLServerDatabase database, @NotNull JDBCResultSet resultSet) {
    }
                sql.append("\n");

import org.jkiss.dbeaver.Log;
            dataTypeMap.remove(object.getObjectId());
    @Override
            }
    }

    SQLServerDatabase(
            if (schemaFilters != null && schemaFilters.isEnabled()) {
 * DBeaver - Universal Database Manager

    @Override

        DBPSaveableObject,
                "SELECT t.* FROM \n")
            }
            if (schema.getObjectId() == schemaId) {
    private Long databaseTotalSize;
                sql.append("DISTINCT ");
        this.persisted = false;
            if (object != null || objectName != null) {
                sql.append("(SELECT CAST(ext.orig_name AS sysname) AS name, base.oid AS schema_id, base.nspowner AS principal_id FROM pg_namespace base JOIN babelfish_namespace_ext ext ON base.nspname = ext.nspname JOIN babelfish_sysdatabases dbs ON dbs.dbid = ext.dbid WHERE dbs.name = '" + DBUtils.getQuotedIdentifier(dataSource, owner.getName()) + "') AS s");
 *
                    "LEFT OUTER JOIN " + SQLServerUtils.getSystemTableName(database, "objects") + " tto ON " +
            sql.append("SELECT ");
    @Override
        }
        }
        try {
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException {
            } else {
        return this.persisted;
        name = newName;
            sql.append("\nWHERE t.parent_id=0");
        public void cacheObject(@NotNull SQLServerDataType object) {
 * See the License for the specific language governing permissions and
        @Override
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
    @Association
        for (SQLServerSchema schema : getSchemas(monitor)) {
                    "WHERE ss.is_user_defined = 1";
        return schemaCache.getCachedObject(name);
                    sql.append("sysobjects o ").append("ON s.schema_id=o.uid");

        @Override

        @NotNull
        this.name = name;

        return dataSource;
* SQL Server database
    public SQLServerSchema getSchema(DBRProgressMonitor monitor, long schemaId) throws DBException {
    public SQLServerDatabase(SQLServerDataSource dataSource) {
        private final LongKeyMap<SQLServerDataType> dataTypeMap = new LongKeyMap<>();


    @Override
        }
    }
                    sql.append("all_objects o ").append("ON s.schema_id=o.schema_id");
import org.jkiss.code.Nullable;
        @NotNull JDBCResultSet resultSet,
        SQLServerDatabase defaultDatabase = dataSource.getDefaultDatabase(new VoidProgressMonitor());
        return databaseTotalSize == null ? 0 : databaseTotalSize;
    }
    @NotNull
    @Association
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull SQLServerDatabase database) throws SQLException {
    private String name;
    public Collection<SQLServerSchema> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
        if (dataType != null) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        return null;
    }
    public boolean isTempDatabase() {
        @NotNull JDBCSession session,
    }
            return dbStat;
            sql.append(

    private static final Log log = Log.getLog(SQLServerDatabase.class);
        this.persisted = true;
import org.jkiss.code.NotNull;
        }
        return SQLServerSchema.class;
            dataTypeMap.clear();
        
    }

        return null;
            StringBuilder sql = new StringBuilder();
        @Override
    }
    // Schemas
import org.jkiss.dbeaver.model.sql.DBSQLException;
    @Override
    @Override
        @Override
            if (schemaFilters != null) {

    @Override

    class TriggerCache extends JDBCObjectLookupCache<SQLServerDatabase, SQLServerDatabaseTrigger> {

    public String toString() {
        DBPRefreshableObject,
    }
    }
    public long getStatObjectSize() {
    }
            this.name))
            return new SQLServerSchema(owner, resultSet);
        this.databaseTotalSize = databaseTotalSize;
            return new SQLServerDatabaseTrigger(database, resultSet);
            String statement;
        DBPObjectStatistics {
            if (SQLServerUtils.isDriverBabelfish(dataSource.getContainer().getDriver())) {
*/
/*
        }
import org.jkiss.utils.ArrayUtils;
                statement = "SELECT ss.*, tt.type_table_object_id,tto.schema_id as type_table_schema_id\n" +


        try {

        return typesCache.getObject(monitor, this, typeName);
        this.databaseId = JDBCUtils.safeGetLong(resultSet, "database_id");
    public SQLServerSchema getSchema(String name) {
    /**
    public Collection<SQLServerDatabaseTrigger> getTriggers(DBRProgressMonitor monitor) throws DBException {
            for (SQLServerDataType dt : cache) {
import java.sql.SQLException;
            if (!showAllSchemas) {
    public void setPersisted(boolean persisted) {
    }
            }
    }

        }
    public SQLServerSchema getSchema(DBRProgressMonitor monitor, String name) throws DBException {
    @Association
    @Property(viewable = true, editable = true, order = 1)
            super.setCache(cache);

    private DataTypeCache typesCache = new DataTypeCache();
        SQLServerDataType dataType = dataSource.getSystemDataType(typeID);

        return name;

    TriggerCache getTriggerCache() {
            boolean showAllSchemas = SQLServerUtils.isShowAllSchemas(dataSource);

        if (CommonUtils.equalObjects(
    public SQLServerDataType getDataType(DBRProgressMonitor monitor, String typeName) throws DBException {
    // Triggers
    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) {
 * Unless required by applicable law or agreed to in writing, software
            ((SQLServerExecutionContext) session.getExecutionContext()).getActiveDatabaseName(),
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.mssql.model;

 * limitations under the License.

        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        return ArrayUtils.contains(SQLServerConstants.SYSTEM_DATABASES, name)
    ) {
    }
import java.util.List;


        typesCache.clearCache();
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull SQLServerDatabase owner) throws SQLException {
            return schemaCache.getAllObjects(monitor, this);
    public boolean hasStatistics() {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) {
        this.databaseId = 0;

        @NotNull
            else {
/**
            SQLServerDataSource dataSource = owner.getDataSource();
        databaseTotalSize = null;
                return schema;

 * distributed under the License is distributed on an "AS IS" BASIS,
            super.clearCache();
        return this;
    @NotNull
        {
    public String getDescription() {
    @NotNull
            super.cacheObject(object);
    void setDatabaseTotalSize(long databaseTotalSize) {


    @Override
            return dataTypeMap.get(typeID);
            SQLServerDataType dataType = typesCache.getDataType(typeID);
            return new SQLServerDataType(database, resultSet);
            if (object != null || objectName != null) {
                return schema;
        public void clearCache() {
    // Data types
        } catch (DBSQLException exception) {
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull SQLServerDatabase database, @Nullable SQLServerDatabaseTrigger object, @Nullable String objectName) throws SQLException {

    public DataTypeCache getDataTypesCache() {
        }

            }
    //////////////////////////////////////////////////
                .append(" AND ep.major_id=s.schema_id AND ep.minor_id=0 AND ep.name='").append(SQLServerConstants.PROP_MS_DESCRIPTION).append("'");
        }
    public boolean isPersisted() {
            JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
                    "LEFT JOIN " + SQLServerUtils.getSystemTableName(database, "table_types") + " tt ON " +
        schemaCache.clearCache();
    }

                if (dataSource.isServerVersionAtLeast(SQLServerConstants.SQL_SERVER_2008_VERSION_MAJOR, 0)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        } catch (DBSQLException exception) {
        @NotNull SQLServerDataSource dataSource,
    ///////////////////////////////////////////////////////
        this.isTempDatabase = false;
import java.util.Collection;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
            return dbStat;

        this.persisted = persisted;
        }
            log.debug("System schema not found");
        }
 * you may not use this file except in compliance with the License.

     * Whether this database represents the {@code tempdb} database.
                sql.append("\nINNER JOIN ").append(sysSchema).append(".");
            }
            throw SQLServerUtils.mapException(exception);
import org.jkiss.dbeaver.model.meta.PropertyLength;
    @Override
        DBSCatalog,
import org.jkiss.dbeaver.DBException;
    public SQLServerSchema getSysSchema(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.meta.Property;
            typesCache.getAllObjects(monitor, this);
import org.jkiss.utils.LongKeyMap;
        return typesCache.getAllObjects(monitor, this);
    public long getDatabaseId() {
    }
    }
            try {
    }

    public String getName() {
            }
        return schemaCache.getObject(monitor, this, childName);
import org.jkiss.utils.CommonUtils;


import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        try {
    @Override

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            return triggerCache.getAllObjects(monitor, this);

}
            return session.prepareStatement(statement);
        this.dataSource = dataSource;

    @Nullable
            log.debug("Schema '" + schemaId + "' not found");
            dataTypeMap.put(object.getObjectId(), object);
 *
    @Override
                        "ss.name = tt.name AND ss.user_type_id = tt.user_type_id\n" +
        triggerCache.clearCache();
            }
        if (!monitor.isCanceled()) {
    //////////////////////////////////////////////////
    }
        }
    public boolean isSystem() {
            sql.append("\nORDER BY t.name");
        } catch (DBException e) {
        public void setCache(@NotNull List<SQLServerDataType> cache) {
        schemaCache.getAllObjects(monitor, this);
            return dataType;
                    "FROM " + SQLServerUtils.getSystemTableName(database, "types") + " ss\n" +
    private final boolean isTempDatabase;
        return description;
            final DBSObjectFilter schemaFilters = dataSource.getContainer().getObjectFilter(SQLServerSchema.class, owner, false);
            && !CommonUtils.equalObjects(this, defaultDatabase);
                } else {
                dataTypeMap.put(dt.getObjectId(), dt);
    // Caches
        SQLServerDataType getDataType(long typeID) {
    @Override
        }
public class SQLServerDatabase
        }
        @Override
                getSchemas(session.getProgressMonitor());

        DBPNamedObject2,
import org.jkiss.dbeaver.model.struct.DBSObject;
        this.description = description;
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {
        protected SQLServerDataType fetchObject(@NotNull JDBCSession session, @NotNull SQLServerDatabase database, @NotNull JDBCResultSet resultSet) {
            sql.append("\nLEFT OUTER JOIN ").append(SQLServerUtils.getExtendedPropsTableName(owner)).append(" ep ON ep.class=").append(SQLServerObjectClass.SCHEMA.getClassId())
        }
    }
        }
        SchemaCache() {
                return dataType;
            }

    private TriggerCache triggerCache = new TriggerCache();
    public void setDescription(String description) {
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
            if (schema.getName().equalsIgnoreCase("sys")) {
