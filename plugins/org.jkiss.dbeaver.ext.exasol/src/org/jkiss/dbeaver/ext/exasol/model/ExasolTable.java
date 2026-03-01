        // table can only be in state normal
    public static class AdditionalInfoValidator implements IPropertyCacheValidator<ExasolTable> {
    }
            {
        if (!isPersisted()) {
    public List<ExasolTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
            "    WHERE " + 

            "        schema_name AS table_schema," + 
/*
    private long sizeRaw;
        return getContainer().getTableCache();
    }
    public synchronized DBSTableForeignKey getAssociation(DBRProgressMonitor monitor, String fkName) throws DBException {
            "    (" + 
            template = ENABLE_REFERENTIAL_INTEGRITY_STATEMENT;
        }
            "        delete_percentage," + 
import org.jkiss.dbeaver.DBException;
                    statement.executeUpdate(sql);
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    		throws DBCException
            "    WHERE" + 
            "        %s_OBJECT_SIZES  " + 
            "        o.created," + 
            } catch (SQLException e) {
            stmt.setBigDecimal(1, this.getObjectId());
    @Association
        {
    @NotNull
 * limitations under the License.
            "        mem_object_size " + 
    	
    }
        }
                for (DBPNamedObject fk: foreignKeys) {
            additionalInfo.loaded = true;
            "        object_type" + 
            }
    // -----------------
            }
        } else {
        return List.of(
            "        raw_object_size, " + 
    public ExasolTableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {
    private ExasolTable getObject()
    	
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                this.sizeRaw = JDBCUtils.safeGetLong(dbResult, "RAW_OBJECT_SIZE");
    private final ExasolTablePartitionColumnCache tablePartitionColumnCache = new ExasolTablePartitionColumnCache();
 * You may obtain a copy of the License at
        }
        }
    public TableAdditionalInfo getAdditionalInfo()
        String sqlTableInfo = String.format(readAdditionalTableInfo,
    private static String readTableSize =         "/*snapshot execution*/ SELECT " + 
        public Timestamp getCreateTime(DBRProgressMonitor monitor) throws DBCException {
            "    * " + 
        private Boolean hasPartitionKey;
            "    FROM" + 
        }

            return;
        try (JDBCPreparedStatement stmt = session.prepareStatement(sqlTableSize))

        getContainer().getConstraintCache().clearObjectCache(this);
import org.jkiss.code.Nullable;
    // -----------------
        return getContainer().getAssociationCache().getObject(monitor, getContainer(), this, fkName);
    }
            "        %s_OBJECTS o" + 
    	    
    		if (c.isDistKey())
    	this.tablePartitionColumnCache.clearCache();
            try (JDBCStatement statement = session.createStatement()) {
    	return getConstraints(monitor).iterator().next();
            "    table_schema," + 
    
 * See the License for the specific language governing permissions and
    // Properties

            "        object_comment AS table_comment," + 
        this.additionalInfo.hasPartitionKey = hasPartitionKey;
    
            return ENABLE_REFERENTIAL_INTEGRITY_STATEMENT;
        private float deletePercentage;
    	return tablePartitionColumnCache.getCachedObject(name);

        Collection<ExasolTableForeignKey> refForeignKeys = new ArrayList<ExasolTableForeignKey>();
            "        object_type = 'TABLE' " + 
    public void enableReferentialIntegrity(@NotNull DBRProgressMonitor monitor, boolean enable) throws DBException {
                tablePrefix,
                this.additionalInfo.deletePercentage = JDBCUtils.safeGetFloat(dbResult, "DELETE_PERCENTAGE");
    @Nullable
            return additionalInfo;
        synchronized (additionalInfo) {

                tablePrefix
            "        o.object_id = ?" + 
        additionalInfo.loaded = true;
            return null;
 * DBeaver - Universal Database Manager

        @Property(viewable = true, expensive = false, editable = false, order = 250, category = DBConstants.CAT_STATISTICS)
    }    
            "    o.table_name" + 
    
    @Override
    }
    

        public long getRawsize(DBRProgressMonitor monitor) throws DBCException {
    	}
        if (this.additionalInfo.hasPartitionKey == false && hasPartitionKey == true)
            "        AND schema_name = ?" + 
    public ExasolTable(DBRProgressMonitor monitor, ExasolSchema schema, ResultSet dbResult) throws DBException {
    }

            "        FALSE AS table_has_distribution_key," + 
    }
import org.jkiss.dbeaver.model.meta.*;
        @Property(viewable = true, expensive = false,  updatable = false, order = 95)
    @Association
        } catch (SQLException e) {

        private Timestamp createTime;
    
        public Timestamp getLastCommit(DBRProgressMonitor monitor) throws DBCException {
    {
                this.additionalInfo.createTime = JDBCUtils.safeGetTimestamp(dbResult, "CREATED"); 
    public DBSObjectState getObjectState() {
        private Boolean hasDistKey;
            "    SELECT" + 
            "        o.last_commit," + 
    public ExasolTable(ExasolSchema schema, String name) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Changing referential integrity")) {
                getDataSource().ishasPriorityGroups() ? "table_has_partition_key,"  : "false as table_has_partition_key,",
 *
    @Override
            "        'SYS' AS table_owner," + 
    public void setHasPartitionKey(Boolean hasPartitionKey) {
    public List<ExasolTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException {
 * Unless required by applicable law or agreed to in writing, software
            }
    		}
        if (!supportsChangingReferentialIntegrity(monitor)) {
import java.util.ArrayList;
                refForeignKeys.add(exasolTableForeignKey);
        public Boolean getHasPartitionKey(DBRProgressMonitor monitor) throws DBCException {
            "    FROM " + 
    	this.getSchema().getIndexCache().clearObjectCache(this);

        }
            "    root_name, " + 
        }    
            "        CAST( NULL AS TIMESTAMP) AS last_commit," + 
    }
    @Override
    public ExasolTablePartitionColumn getPartition(String name) throws DBException {
        }
            "    WHERE " + 
    // -----------------
            return;
    public List<DBSEntityConstraintInfo> getSupportedConstraints() {
                this.additionalInfo.hasDistKey = JDBCUtils.safeGetBoolean(dbResult, "TABLE_HAS_DISTRIBUTION_KEY");
            "        object_name, " + 
            "UNION ALL" + 
            "        o.object_type" + 

            }
        super(schema, name, false);
        }
                throw new DBException("Unable to change referential integrity", e);


    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    private static final CharSequence TABLE_NAME_PLACEHOLDER = "%table_name%";
            try(JDBCResultSet dbResult = stmt.executeQuery())
            "        -1 AS raw_object_size, " + 
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
        } catch (SQLException e) {
    
        String sqlTableSize = String.format(readTableSize,
    	ArrayList<ExasolTableColumn> distKeyCols = new ArrayList<ExasolTableColumn>();
            "        table_name," + 
        public Boolean getHasDistKey(DBRProgressMonitor monitor) throws DBCException {
            if (exasolTableForeignKey.getReferencedTable() == this) {
        Collection<ExasolTableForeignKey> foreignKeys = getAssociations(monitor);
    
    public JDBCStructCache<ExasolSchema, ExasolTable, ExasolTableColumn> getCache() {
            "    FROM" + 
            "    object_name";
        @Property(viewable = true, expensive = false, editable = false, order = 150, category = DBConstants.CAT_STATISTICS, formatter = ByteNumberFormat.class)
    public ExasolTablePartitionColumnCache getPartitionCache()
        template = template.replace(TABLE_NAME_PLACEHOLDER, getFullyQualifiedName(DBPEvaluationContext.DDL));
        getContainer().getAssociationCache().clearObjectCache(this);
    public ExasolTableUniqueKey getConstraint(DBRProgressMonitor monitor, String ukName) throws DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        @Property(viewable = true, expensive = false, editable = false, order = 200, category = DBConstants.CAT_STATISTICS, formatter = ByteNumberFormat.class)
                this.additionalInfo.tablecount = JDBCUtils.safeGetLong(dbResult, "TABLE_ROW_COUNT");
            "ORDER BY " + 
        tablePrefix = schema.getDataSource().getTablePrefix(ExasolSysTablePrefix.ALL);
        return getContainer().getTableCache().getChildren(monitor, getContainer(), this);
            "        SYS.EXA_SYSCAT" + 
        @Property(viewable = true, expensive = false, editable = false, order = 300, category = DBConstants.CAT_STATISTICS)
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        + FOREIGN_KEY_NAME_PLACEHOLDER + " DISABLE";
        return getContainer().getTableCache().getChild(monitor, getContainer(), this, attributeName);
            "        object_id = ? " + 
        try (JDBCPreparedStatement stmt = session.prepareStatement(sqlTableInfo))
    // -----------------
        // two statements necessary as the exasol optimizer is very stupid from time to time
            return createTime;
 *
            "        o.object_id = t.table_object_id" + 
        boolean isLoaded() { return loaded; }


    // Business Contract
        public long getTableCount(DBRProgressMonitor monitor) throws DBCException {
        private long tablecount;
 */
            "        AND t.table_object_id = ? " + 

import java.sql.Timestamp;
        }
        public boolean isPropertyCached(@NotNull ExasolTable object, @NotNull Object propertyId)
            stmt.setString(2, this.getSchema().getName());
    @Override
    @NotNull
            "FROM " + 

import java.util.Map;
            "    FROM " + 
    	return tablePartitionColumnCache.getAllObjects(monitor, this);
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructCache;
            "        object_name, " + 
    private final AdditionalInfo additionalInfo = new AdditionalInfo();
    }
import org.jkiss.dbeaver.ext.exasol.ExasolSysTablePrefix;
        );
        for (ExasolTableForeignKey exasolTableForeignKey : associationCache.getObjects(monitor, getSchema(), null)) {
            stmt.setString(3, this.getName());
        if (force)
            return;

        volatile boolean loaded = false;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
    
import java.sql.ResultSet;
                this.additionalInfo.hasPartitionKey = JDBCUtils.safeGetBoolean(dbResult, "TABLE_HAS_PARTITION_KEY");
 *     http://www.apache.org/licenses/LICENSE-2.0
            "        table_schema," + 
    {
            "    INNER JOIN %s_TABLES T ON" + 
        @Property(viewable = true, expensive = false,  editable = false, order = 90)
    }
                this.additionalInfo.lastCommit = JDBCUtils.safeGetTimestamp(dbResult, "LAST_COMMIT");
    @Override
import org.jkiss.dbeaver.ext.exasol.model.cache.ExasolTableIndexCache;
    

            "        table_owner," + 
    
            }


        }
    }
            return object.getAdditionalInfo().isLoaded();
    public AdditionalInfo getAdditionalInfo(DBRProgressMonitor monitor) throws DBException
        
    private static String readAdditionalTableInfo = "/*snapshot execution*/ SELECT" + 
    public Collection<ExasolTableColumn> getAvailableColumns(DBRProgressMonitor monitor) throws DBException
import org.jkiss.dbeaver.model.struct.*;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    	{
	}
    public ExasolTableUniqueKey getPrimaryKey(@NotNull DBRProgressMonitor monitor) throws DBException {
            "        object_name AS table_name," + 
            "        root_name, " + 
    }
    private ExasolTableIndexCache getIndexCache()
        if (enable) {
            "    * " + 
    // -----------------

    public boolean supportsChangingReferentialIntegrity(@NotNull DBRProgressMonitor monitor) throws DBException {
    	{
    
            DBSEntityConstraintInfo.of(DBSEntityConstraintType.PRIMARY_KEY, ExasolTableUniqueKey.class)
            return hasDistKey;

public class ExasolTable extends ExasolTableBase implements DBPScriptObject, DBPReferentialIntegrityController, DBSEntityConstrainable {
        super.refreshObject(monitor);
            {
            "        table_has_distribution_key," + 
        return getIndexCache().getObjects(monitor, getSchema(), getObject());
    @Override
            stmt.setBigDecimal(1, this.getObjectId());
        return !CommonUtils.isEmpty(getAssociations(monitor));
    @Override
    }
    }
    @Override
    
            "        AND object_name = ? ) AS o " + 
                );
 *
        tablePrefix = schema.getDataSource().getTablePrefix(ExasolSysTablePrefix.ALL);
    public Collection<ExasolTablePartitionColumn> getPartitions(DBRProgressMonitor monitor) throws DBException {
    
        
                if (this.additionalInfo.hasPartitionKey == null)

    private final String tablePrefix;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    

    public boolean isView() {
    
    
    


import org.jkiss.dbeaver.ext.exasol.model.cache.ExasolTableForeignKeyCache;
            throw new DBCException(e, session.getExecutionContext());

    private long sizeCompressed;

        return getContainer().getConstraintCache().getObject(monitor, getContainer(), this, ukName);
    @NotNull
    			distKeyCols.add(c);
    // Associations
    {
    }
    private void read(DBRProgressMonitor monitor) throws DBCException
            "        -1 AS delete_percentage," + 
            return sizeCompressed;
            stmt.setString(4, this.getName());
    }
    }
    
        String template;
        return getContainer().getConstraintCache().getObjects(monitor, getContainer(), this);
        }
        super(monitor, schema, dbResult);
    public Collection<ExasolTableUniqueKey> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {
            stmt.setBigDecimal(2, this.getObjectId());
        return additionalInfo;
        }
    }
import java.sql.SQLException;
            "        SYS.EXA_SYSCAT " + 
    }
    }
            "    ( " + 
    }
            template = DISABLE_REFERENTIAL_INTEGRITY_STATEMENT;
            "        table_comment," + 
        ExasolTableForeignKeyCache associationCache = getSchema().getAssociationCache();
    @PropertyGroup()
    public static class TableAdditionalInfo {
        private Timestamp lastCommit;
    {
    	if (getConstraints(monitor).isEmpty())
    public String getChangeReferentialIntegrityStatement(@NotNull DBRProgressMonitor monitor, boolean enable) throws DBException {
        return refForeignKeys;
        return DBSObjectState.NORMAL;
                dbResult.next();
    }
import org.jkiss.code.NotNull;
        }
    }    

                this.sizeCompressed = JDBCUtils.safeGetLong(dbResult, "MEM_OBJECT_SIZE");
    public void setHasPartitionKey(Boolean hasPartitionKey, Boolean force) {
        @Property(viewable = true, expensive = false, editable = false, order = 100)
            "";
    	super.refreshObjectState(monitor);
    }
    }
import java.util.Collection;
    
    
import org.jkiss.dbeaver.ext.exasol.ExasolMessages;
                tablePrefix
                dbResult.next();
import java.util.List;
        return getSchema().getIndexCache();
            "    SELECT " + 
        tablePartitionColumnCache.setCache(new ArrayList<ExasolTablePartitionColumn>());


            "        %s" + 
    private static final CharSequence FOREIGN_KEY_NAME_PLACEHOLDER = "%foreign_key_name%";
            "    SELECT " + 


        }
    {
            stmt.setString(3, this.getSchema().getName());
    	return distKeyCols;
                }
        @Property(viewable = true, expensive = false, editable = false, order = 100)
            "        CAST( NULL AS TIMESTAMP) AS CREATED," + 
                read(monitor);
        return ExasolUtils.generateDDLforTable(monitor, this.getDataSource(), this);
            "        schema_name AS root_name, " + 
    }
    }
    {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKey;
    		return null;
    @Override
            return lastCommit;
    	}
        	return this.tablecount;
    {
    
        return DISABLE_REFERENTIAL_INTEGRITY_STATEMENT;
                );
    	return tablePartitionColumnCache;
        }
    		return hasPartitionKey;
    
    	JDBCSession session = DBUtils.openMetaSession(monitor, this, ExasolMessages.read_table_details );
import org.jkiss.utils.ByteNumberFormat;
            "        AND schema_name = ? " + 
            "UNION ALL " + 
            "ORDER BY " + 
            "        FALSE AS table_has_partition_key," + 
    }
        setHasPartitionKey(hasPartitionKey);
        return this;
            "    WHERE" + 
import org.jkiss.dbeaver.model.exec.DBCException;
    	return getSchema().getAssociationCache().getObjects(monitor, getSchema(), this);
            "        -1 AS mem_object_size " + 
    private static final String ENABLE_REFERENTIAL_INTEGRITY_STATEMENT = "ALTER TABLE " + TABLE_NAME_PLACEHOLDER + " MODIFY CONSTRAINT "
                    this.additionalInfo.hasPartitionKey = false;
 * you may not use this file except in compliance with the License.
    }
    		{
        public float getDeletePercentage(DBRProgressMonitor monitor) throws DBCException {
    
import org.jkiss.dbeaver.model.*;
        
        public long getCompressedsize(DBRProgressMonitor monitor) throws DBCException {
package org.jkiss.dbeaver.ext.exasol.model;
        if (enable) {
    }
            "        AND object_name = ? ) AS o " + 
        return false;
        + FOREIGN_KEY_NAME_PLACEHOLDER + " ENABLE";

        {
    private static final String DISABLE_REFERENTIAL_INTEGRITY_STATEMENT = "ALTER TABLE " + TABLE_NAME_PLACEHOLDER + " MODIFY CONSTRAINT "
    }
            "        table_row_count," + 
            "        -1 AS table_row_count," + 
    	return this;

        @Override
    @LazyProperty(cacheValidator = AdditionalInfoValidator.class)
    public Collection<ExasolTableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException {
    	return tablePartitionColumnCache.getAvailableTableColumns(this, monitor);
    public class AdditionalInfo extends TableAdditionalInfo {
    @Override
            if (!additionalInfo.loaded && monitor != null) {
            try(JDBCResultSet dbResult = stmt.executeQuery())
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
    }
import org.jkiss.utils.CommonUtils;
            "        object_type = 'TABLE'" + 
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return this.deletePercentage;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    public Collection<ExasolTableColumn> getDistributionKey(DBRProgressMonitor monitor) throws DBException
    @Override
        if (CommonUtils.isEmpty(foreignKeys)) {
        getContainer().getTableCache().clearChildrenCache(this);
import org.jkiss.dbeaver.ext.exasol.model.cache.ExasolTablePartitionColumnCache;
    @Override
    
    {

            "FROM" + 
        
    {
            this.additionalInfo.hasPartitionKey = hasPartitionKey;
}
            "    SELECT" + 
    }
    // -----------------
    	for(ExasolTableColumn c : getAttributes(monitor))
    @Override
            //DBSEntityConstraintInfo.of(DBSEntityConstraintType.UNIQUE_KEY, ExasolTableUniqueKey.class)
            return sizeRaw;
            throw new DBCException(e, session.getExecutionContext());
    	this.read(monitor);
    public Collection<ExasolTableForeignKey> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException {
                    String sql = template.replace(FOREIGN_KEY_NAME_PLACEHOLDER,  fk.getName());
