    public DBSObjectCache<DB2Schema, DB2XMLSchema> getXmlSchemaCache()
    }

    {


    }

        "SYSIBMINTERNAL",
    public String getOwner()
import org.jkiss.dbeaver.model.meta.Association;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    {
    public DB2TableCheckConstraintCache getCheckCache()
    {

    }
    }
    public DB2Routine getProcedure(DBRProgressMonitor monitor, String name) throws DBException

    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Property(viewable = true, editable = false, category = DB2Constants.CAT_DATETIME)

        return SYSTEM_SCHEMA.contains(name);

        allChildren.addAll(mqtCache.getAllObjects(monitor, this));

    private final DBSObjectCache<DB2Schema, DB2Package> packageCache;
    public String getName()
    }
    }
    @Association
 * Unless required by applicable law or agreed to in writing, software

    public DB2XMLSchema getXMLSchema(DBRProgressMonitor monitor, String name) throws DBException
    }
    @Association
    @Property(viewable = false, editable = false, order = 7, category = DB2Constants.CAT_AUDIT)
    private final DB2ViewCache viewCache = new DB2ViewCache();
        }
import org.jkiss.code.Nullable;
    {
        return nicknameCache.getTypedObjects(monitor, this, DB2Nickname.class);
    }
        return xmlSchemaCache.getObject(monitor, this, name);
    public DB2Alias getAlias(DBRProgressMonitor monitor, String name) throws DBException
        return methodCache.getObject(monitor, this, name);

    private final DB2MaterializedQueryTableCache mqtCache = new DB2MaterializedQueryTableCache();

        "SYSPROC",
        return child;
        return allChildren;

    public Collection<DB2Module> getModules(DBRProgressMonitor monitor) throws DBException
    public Timestamp getCreateTime()
    private Boolean dataCapture;
        }
        procedureCache.clearCache();
    private static final String C_DTT = "SELECT * FROM SYSCAT.DATATYPES WHERE TYPESCHEMA = ? AND METATYPE <> 'S' ORDER BY TYPENAME WITH UR";
/**
    // -----------------
        }
        return sequenceCache.getObject(monitor, this, name);
    @Override
    // ------------
    private static final String C_DTT_97 = "SELECT * FROM SYSCAT.DATATYPES WHERE TYPESCHEMA = ? AND METATYPE <> 'S' AND TYPEMODULENAME IS NULL ORDER BY TYPENAME WITH UR";
        }
    {
        return mqtCache.getObject(monitor, this, name, DB2MaterializedQueryTable.class);
    public Collection<DB2Routine> getMethods(DBRProgressMonitor monitor) throws DBException
    public DBSObjectCache<DB2Schema, DB2Package> getPackageCache()
        return xmlSchemaCache.getAllObjects(monitor, this);
    }

    public DB2MaterializedQueryTableCache getMaterializedQueryTableCache()
    // -----------------
    @Override
    {
        if (child == null) {
    public String getDescription()
    {
    @Override
    @NotNull
    {
            child = viewCache.getObject(monitor, this, childName);

        return checkCache;
            }
        return nicknameCache.getObject(monitor, this, name, DB2Nickname.class);

        } else {


        aliasCache.clearCache();


    // Constructors
}
    {
    public DBSObjectCache<DB2Schema, DB2Routine> getMethodCache()
    }
    {
        return udfCache.getAllObjects(monitor, this);
 * limitations under the License.
        return referenceCache;
        return triggerCache.getAllObjects(monitor, this);
        return udtCache;
        if (xmlSchemaCache != null) {
    private final DB2TableCache tableCache = new DB2TableCache();
                }
    public DB2TableReferenceCache getReferenceCache()
    }
        getTables(monitor);
    {

            if (moduleCache != null) {
            child = mqtCache.getObject(monitor, this, childName);
    private final DB2TableReferenceCache referenceCache = new DB2TableReferenceCache(tableCache);
                        DB2TableBase table = getTable(monitor, tableName);
        } catch (SQLException e) {
    }
        triggerCache.clearCache();
        hasTableStatistics = false;
            monitor.subTask("Cache table foreign keys");
    {
    {
        return moduleCache.getObject(monitor, this, name);
    }

    private final DBSObjectCache<DB2Schema, DB2Sequence> sequenceCache;

    public DB2View getView(DBRProgressMonitor monitor, String name) throws DBException
        return moduleCache.getAllObjects(monitor, this);
    }
            indexCache.getAllObjects(monitor, this);
    public DB2Routine getMethod(DBRProgressMonitor monitor, String name) throws DBException
    @Association
    @Association
    {
                        String tableName = JDBCUtils.safeGetStringTrimmed(dbResult, 1);

    // -------------------------
    }

    public Collection<DBSObject> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException
        }

    }
 */
        udfCache.clearCache();
        return methodCache.getAllObjects(monitor, this);
        return indexCache.getAllObjects(monitor, this);
        this.xmlSchemaCache = new JDBCObjectSimpleCache<>(DB2XMLSchema.class, C_XSR, name);
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);
        "SYSPUBLIC",
    private static final String C_SEQ = "SELECT * FROM SYSCAT.SEQUENCES WHERE SEQSCHEMA = ? AND SEQTYPE <> 'A' ORDER BY SEQNAME WITH UR";
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

    {
        return procedureCache.getObject(monitor, this, name);
        return tableCache;
    private final DB2RoutineCache udfCache = new DB2RoutineCache(DB2RoutineType.F);
    public void setName(String name)
    // --------------------------
    public DB2MaterializedQueryTable getMaterializedQueryTable(DBRProgressMonitor monitor, String name) throws DBException
        tableCache.clearCache();
        if (!indexCache.isFullyCached()) {
import org.jkiss.dbeaver.ext.db2.model.dict.DB2OwnerType;
        return moduleCache;
    private DBSObjectCache<DB2Schema, DB2Module> moduleCache;
        this.owner = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER);

import org.jkiss.dbeaver.model.exec.DBCException;

            monitor.subTask("Cache Sequences");
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
    @Association
    public DB2OwnerType getOwnerType()
        return viewCache.getTypedObjects(monitor, this, DB2View.class);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureContainer;
    }
    {
            this.auditPolicyName = JDBCUtils.safeGetString(dbResult, "AUDITPOLICYNAME");
        "SQLJ",
        if (child == null) {


        return viewCache.getObject(monitor, this, name, DB2View.class);
        }
        sequenceCache.clearCache();

    }
import org.jkiss.utils.CommonUtils;
        viewCache.clearCache();
    }
    {
            tableCache.getAllObjects(monitor, this);
        indexCache.clearCache();
    {
    public boolean hasStatistics() {
        }
    // DB2Table's children
    }
    @Override

        }
    private Integer auditPolicyID;
        return aliasCache.getAllObjects(monitor, this);
import org.jkiss.dbeaver.model.struct.DBSObject;

    private Timestamp createTime;
    // -----------------
        return this;
    public DB2RoutineCache getUdfCache()
public class DB2Schema extends DB2GlobalObject implements DBSSchema, DBPRefreshableObject, DBPSystemObject, DBSProcedureContainer, DBPObjectStatisticsCollector, DBPObjectStatistics {
    }
 */
    public String getAuditPolicyName()
        packageCache.clearCache();
        return methodCache;
        allChildren.addAll(aliasCache.getAllObjects(monitor, this));
        return "Schema " + name;
    }
    {
    // -----------------
    }
    {

    {
        return xmlSchemaCache;
    }
    public DB2Sequence getSequence(DBRProgressMonitor monitor, String name) throws DBException
    {
    @Association
    {
                moduleCache.getAllObjects(monitor, this);
    }
    {
        referenceCache.clearCache();
            sequenceCache.getAllObjects(monitor, this);
    @Override
 * DB2Schema
    public Collection<DB2Trigger> getTriggers(DBRProgressMonitor monitor) throws DBException
    }

            this.dataCapture = JDBCUtils.safeGetBoolean(dbResult, "DATACAPTURE", DB2YesNo.Y.name());
    // Standards Getters
    private static final String C_MOD = "SELECT * FROM SYSCAT.MODULES WHERE MODULESCHEMA = ? AND MODULETYPE <> 'A'  ORDER BY MODULENAME WITH UR";

    }
    {
    // -------------------------
    public Collection<DB2DataType> getUDTs(DBRProgressMonitor monitor) throws DBException

    @Override
import org.jkiss.code.NotNull;
            throw new DBCException("Error reading table statistics", e);
    public DBSObjectCache<DB2Schema, DB2Sequence> getSequenceCache()
    }

    public DBSObjectCache<DB2Schema, DB2Module> getModuleCache()
            }
    }
    {
    public synchronized void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException
            viewCache.getAllObjects(monitor, this);
        this(db2DataSource, JDBCUtils.safeGetStringTrimmed(dbResult, "SCHEMANAME"));

    {
    }
    }
    public DB2IndexCache getIndexCache()
import java.util.Arrays;
    {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load schema statistics")) {
        if (db2DataSource.isAtLeastV9_5()) {

    private volatile Long schemaTotalSize;
        return hasTableStatistics;
            monitor.subTask("Cache indexes");
    }
    }
    {
                dbStat.setString(1, getName());
    {

    @Property(viewable = false, editable = false, order = 8, category = DB2Constants.CAT_AUDIT)
            monitor.subTask("Cache Views");
    @Property(viewable = false, editable = false, length = PropertyLength.MULTILINE)
    private final DBSObjectCache<DB2Schema, DB2DataType> udtCache;

            checkCache.getAllObjects(monitor, this);

    }
    public Collection<DB2XMLSchema> getXMLSchemas(DBRProgressMonitor monitor) throws DBException

                xmlSchemaCache.getAllObjects(monitor, this);
 *
    public Collection<DB2Routine> getUDFs(DBRProgressMonitor monitor) throws DBException
    @Association
    @Override
            return;
    public boolean isStatisticsCollected() {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    }
            monitor.subTask("Cache MQTs");
    {
        mqtCache.clearCache();

    public Integer getAuditPolicyID()
                    while (dbResult.next()) {
    {
        if ((scope & STRUCT_ASSOCIATIONS) != 0) {

    {
        return schemaTotalSize != null;
    }
        return associationCache;
        return tableCache.getObject(monitor, this, name, DB2Table.class);
    {
        "SYSIBM",
    }
    }
        return owner;
        "SYSCAT",
        "NULLID");
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
    public DB2Module getModule(DBRProgressMonitor monitor, String name) throws DBException
        return aliasCache.getObject(monitor, this, name, DB2Alias.class);
    public DB2Routine getUDF(DBRProgressMonitor monitor, String name) throws DBException
    public Boolean getDataCapture()
    {
    // Business Contract
    {
        }
    {
            mqtCache.getAllObjects(monitor, this);
    private String owner;

 * See the License for the specific language governing permissions and
    @Override
import org.jkiss.dbeaver.model.meta.Property;
    private final DB2TableForeignKeyCache associationCache = new DB2TableForeignKeyCache(tableCache);
    public DBSObjectCache<DB2Schema, DB2DataType> getUdtCache()
import java.sql.SQLException;
    }
    }
    }
    {
import org.jkiss.dbeaver.ext.db2.model.cache.*;
            monitor.subTask("Cache Check Constraints");
import org.jkiss.dbeaver.ext.db2.model.dict.DB2RoutineType;
        return procedureCache.getAllObjects(monitor, this);
            this.auditPolicyID = JDBCUtils.safeGetInteger(dbResult, "AUDITPOLICYID");
        this.name = name;
        return indexCache;
import org.jkiss.dbeaver.DBException;
    @Association
    @Association
    @Association
    {
    private static final String C_XSR = "SELECT * FROM SYSCAT.XSROBJECTS WHERE OBJECTSCHEMA = ? ORDER BY OBJECTNAME WITH UR";
        return triggerCache.getObject(monitor, this, name, DB2Trigger.class);
import java.sql.ResultSet;
    @Property(viewable = true, editable = false, order = 1)

    }
        return xmlSchemaCache;
        return sequenceCache.getAllObjects(monitor, this);
        nicknameCache.clearCache();
    private final DB2RoutineCache methodCache = new DB2RoutineCache(DB2RoutineType.M);
        return indexCache.getObject(monitor, this, name, DB2Index.class);
        return aliasCache;
    // Properties
        if (db2DataSource.isAtLeastV10_1()) {
    }
    public Class<DB2Table> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException
    public String toString()
    {
    {
            monitor.subTask("Cache Nicknames");
                "GROUP BY TABNAME")) {
        this.name = name;

            if (xmlSchemaCache != null) {
                    }
        return packageCache.getAllObjects(monitor, this);
    public Collection<DB2Alias> getAliases(DBRProgressMonitor monitor) throws DBException
        return packageCache.getObject(monitor, this, name);
    }
                        long bytes = dbResult.getLong(2) * 1024;
    {

        return udfCache;
        super(db2DataSource, true);

    public DB2Index getIndex(DBRProgressMonitor monitor, String name) throws DBException

    {

 * DBeaver - Universal Database Manager
        "SYSIBMTS",
        allChildren.addAll(viewCache.getAllObjects(monitor, this));
    public Collection<DB2MaterializedQueryTable> getMaterializedQueryTables(DBRProgressMonitor monitor) throws DBException
 * you may not use this file except in compliance with the License.
    {
    private final DB2AliasCache aliasCache = new DB2AliasCache();
                "    SUM(DATA_OBJECT_P_SIZE + INDEX_OBJECT_P_SIZE + LONG_OBJECT_P_SIZE + LOB_OBJECT_P_SIZE + XML_OBJECT_P_SIZE) AS TOTAL_SIZE_IN_KB\n" +
    private final DB2IndexCache indexCache = new DB2IndexCache();
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
/*
        return procedureCache;
            xmlSchemaCache.clearCache();

    }
    }
    @Override
    // -------------------------
                            table.setTableTotalSize(bytes);
    public DB2RoutineCache getProcedureCache()
    public DB2TriggerCache getTriggerCache()
    }
    public boolean isSystem()
                monitor.subTask("Cache Modules");
        List<DBSObject> allChildren = new ArrayList<>();
 * distributed under the License is distributed on an "AS IS" BASIS,
    public Collection<DB2Index> getIndexes(DBRProgressMonitor monitor) throws DBException
    {
    {
        associationCache.clearCache();

    public DB2Nickname getNickname(DBRProgressMonitor monitor, String name) throws DBException
            monitor.subTask("Cache tables");

        // For those 2, need to refresh dependent cache (cache for tables..?)
    }
        if (hasTableStatistics && !forceRefresh) {
        }
    public DB2AliasCache getAliasCache()
    // ------------

        }
    @Association
        }
        }
        this.schemaTotalSize = schemaTotalSize;
    private String name;
    private static final List<String> SYSTEM_SCHEMA = Arrays.asList(

    // --------------------------
    public DB2ViewCache getViewCache()
    public DBSObjectCache<DB2Schema, DB2XMLSchema> getXMLSchemaCache()
        return sequenceCache;
        String datatypeSQL;
    public Collection<DB2Routine> getProcedures(DBRProgressMonitor monitor) throws DBException
    {
        if (db2DataSource.isAtLeastV9_7()) {

    {
            }
    public DB2DataType getUDT(DBRProgressMonitor monitor, String name) throws DBException
import org.jkiss.dbeaver.ext.db2.DB2Constants;
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
 *     http://www.apache.org/licenses/LICENSE-2.0
                "FROM TABLE(ADMIN_GET_TAB_INFO(?,''))\n" +
    }
            monitor.subTask("Cache table unique keys");
    }
    public List<DB2Table> getTables(DBRProgressMonitor monitor) throws DBException
    }

 * You may obtain a copy of the License at
                monitor.subTask("Cache XML Schemas");

        return remarks;
    }
            datatypeSQL = C_DTT;
    private final DB2TableUniqueKeyCache constraintCache = new DB2TableUniqueKeyCache(tableCache);
    }
        return ownerType;
    public Collection<DB2Package> getPackages(DBRProgressMonitor monitor) throws DBException
    @Override
    }
        this.udtCache = new JDBCObjectSimpleCache<>(DB2DataType.class, datatypeSQL, name);

        return triggerCache;
        if (db2DataSource.isAtLeastV9_7()) {
    @Nullable
    }
        return schemaTotalSize == null ? 0 : schemaTotalSize;
        return udtCache.getObject(monitor, this, name);

            constraintCache.getObjects(monitor, this, null);


import org.jkiss.dbeaver.model.*;

    private final DB2TriggerCache triggerCache = new DB2TriggerCache();

    @Property(viewable = false, editable = false)

        DBSObject child = tableCache.getObject(monitor, this, childName);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return name;
    {
            referenceCache.getObjects(monitor, this, null);

        return dataCapture;
            tableCache.loadChildren(monitor, this, null);

    }

    // -------------------------
    }
            nicknameCache.getAllObjects(monitor, this);
    @Override
        return tableCache.getTypedObjects(monitor, this, DB2Table.class);
        return udfCache.getObject(monitor, this, name);
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT\n" +
            this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER_TYPE));
    }
import org.jkiss.dbeaver.ext.db2.model.module.DB2Module;
    }
    private DB2OwnerType ownerType;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    {
    {
    public DB2NicknameCache getNicknameCache()
    }
        if (child == null) {
    {
                "    TABNAME,\n" +


    public DB2Table getTable(DBRProgressMonitor monitor, String name) throws DBException
    }

    @Property(viewable = false, editable = false, category = DB2Constants.CAT_OWNER)

    public DB2Package getPackage(DBRProgressMonitor monitor, String name) throws DBException
        "SYSSTAT",
        return packageCache;
        }
            indexCache.loadChildren(monitor, this, null);
    @Association
 * 

    private final DB2TableCheckConstraintCache checkCache = new DB2TableCheckConstraintCache(tableCache);
        if (child == null) {
    @Override
        schemaTotalSize = null;
                        }
import java.util.List;
    {
        constraintCache.clearCache();
    @Association

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

    }
    {
import java.util.Collection;

        allChildren.addAll(nicknameCache.getAllObjects(monitor, this));
import org.jkiss.dbeaver.ext.db2.model.fed.DB2Nickname;
    @Association
    {
        this.packageCache = new JDBCObjectSimpleCache<>(DB2Package.class, C_PKG, name);

    // Associations
    // -----------------
    }
    @Association
            child = nicknameCache.getObject(monitor, this, childName);

import org.jkiss.dbeaver.model.meta.PropertyLength;
    // Schema "Children" = Tables
    @Nullable
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException

            moduleCache.clearCache();
    public DB2TableForeignKeyCache getAssociationCache()
 *
import java.sql.Timestamp;
    {
    }
        return auditPolicyName;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectSimpleCache;
    public DB2TableUniqueKeyCache getConstraintCache()

    public long getStatObjectSize() {
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;
package org.jkiss.dbeaver.ext.db2.model;
        return DB2Table.class;
    {
    private final DB2NicknameCache nicknameCache = new DB2NicknameCache();
        checkCache.clearCache();
    private volatile boolean hasTableStatistics;
    @NotNull
    public DB2Trigger getTrigger(DBRProgressMonitor monitor, String name) throws DBException

    @Override

    private final DB2RoutineCache procedureCache = new DB2RoutineCache(DB2RoutineType.P);
import java.util.ArrayList;
        if ((scope & STRUCT_ENTITIES) != 0) {
    }


    public Collection<DB2View> getViews(DBRProgressMonitor monitor) throws DBException

    }
    @Override
        "DB2QP",

        this.sequenceCache = new JDBCObjectSimpleCache<>(DB2Sequence.class, C_SEQ, name);
        "SYS",
    {
            child = aliasCache.getObject(monitor, this, childName);
    private String remarks;
        }
        return createTime;

        return mqtCache;
    {
    {
    public DB2TableCache getTableCache()
    {


            associationCache.getObjects(monitor, this, null);
    }

    // Stats

    public DB2Schema(DB2DataSource db2DataSource, String name)
        return auditPolicyID;
    private static final String C_PKG = "SELECT * FROM SYSCAT.PACKAGES WHERE PKGSCHEMA = ? ORDER BY PKGNAME WITH UR";
        if (moduleCache != null) {

                        if (table != null) {

    }
        udtCache.clearCache();
        if ((scope & STRUCT_ATTRIBUTES) != 0) {
            datatypeSQL = C_DTT_97;
    {
    // DB2Schema's children
    }
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_OWNER)
        allChildren.addAll(tableCache.getAllObjects(monitor, this));
    {
    public DB2Schema(DB2DataSource db2DataSource, ResultSet dbResult) throws DBException
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        } finally {
        return viewCache;
    }
        return nicknameCache;
        "SYSIBMADM",
        return mqtCache.getTypedObjects(monitor, this, DB2MaterializedQueryTable.class);
        "SYSTOOLS",
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException
            tableCache.loadChildren(monitor, this, null);
        return constraintCache;
        return udtCache.getAllObjects(monitor, this);

    {
            hasTableStatistics = true;
    {
    void setSchemaTotalSize(long schemaTotalSize) {
    }
    public Collection<DB2Nickname> getNicknames(DBRProgressMonitor monitor) throws DBException
    {
    private String auditPolicyName;

            this.moduleCache = new JDBCObjectSimpleCache<>(DB2Module.class, C_MOD, name);
        "SYSFUN",
    @Override
            monitor.subTask("Cache table columns");
 *

            monitor.subTask("Cache table references");
        }
    // -----------------
    public Collection<DB2Sequence> getSequences(DBRProgressMonitor monitor) throws DBException
    private DBSObjectCache<DB2Schema, DB2XMLSchema> xmlSchemaCache;
    }
    {
 * @author Denis Forveille
