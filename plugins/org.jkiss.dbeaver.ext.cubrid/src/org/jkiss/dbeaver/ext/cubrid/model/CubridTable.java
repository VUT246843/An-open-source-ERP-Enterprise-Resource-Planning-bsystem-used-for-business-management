        @Override
    @SuppressWarnings("unchecked")
import org.jkiss.code.Nullable;
            return DBUtils.getFullQualifiedName(getDataSource(), this);
            @Nullable JDBCResultSet dbResult) {
    public CubridCollation getCollation() {
        return owner;
        }
        @Override
            if(table.getDataSource().getSupportMultiSchema()) {
    private CubridCollation collation;
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import java.util.List;
    }
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
    public String getUniqueName() {
        return collation;
        if (this.isSystem() || !getDataSource().getSupportMultiSchema()) {
    }

            collationName = CubridConstants.DEFAULT_COLLATION;
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
public class CubridTable extends GenericTable
            String type = JDBCUtils.safeGetString(dbResult, CubridConstants.IS_SYSTEM_CLASS);
        @Override
    }
 * limitations under the License.

        this.collation = getDataSource().getCollation(collationName);
            collationName = JDBCUtils.safeGetString(dbResult, CubridConstants.COLLATION);
            dbStat.setString(1, table.getName());
    public CubridCharset getCharset() {
            if(table.getDataSource().getSupportMultiSchema()) {
 *

    }
        public Object[] getPossibleValues(@NotNull CubridTable object) {
                this.setSystem(type.equals("YES"));

            return this.getName();
        if (getDataSource().getSupportMultiSchema()) {
        this.reuseOID = reuseOID;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

                sql.append(" and owner_name = ?");

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
            @NotNull JDBCSession session,
    @Override
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
}
    public List<CubridTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor)
    public static class CollationListProvider implements IPropertyValueListProvider<CubridTable>
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
        }

 * You may obtain a copy of the License at
 *
        super.setName(name != null ? name.toLowerCase() : null);
    }
        }
        protected CubridPartition fetchObject(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        String collationName;
            autoIncrement = JDBCUtils.safeGetInteger(dbResult, CubridConstants.AUTO_INCREMENT_VAL);
            return this.getSchema().getName() + "." + this.getName();
    @NotNull
import org.jkiss.dbeaver.model.DBUtils;
    @Override

            return dbStat;
            StringBuilder sql = new StringBuilder("select * from db_partition where class_name = ?");

    @SuppressWarnings("unchecked")
    }
    }
import org.jkiss.dbeaver.DBException;

            @Nullable String tableName,
        return super.refreshObject(monitor);

import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;


            return object.charset.getCollations().toArray();
        return autoIncrement == null ? 0 : autoIncrement;
        if (tableType.equals("TABLE") && dbResult != null) {
 * DBeaver - Universal Database Manager
            @NotNull JDBCResultSet dbResult
    @NotNull
    }
        } else {
        @Override
    @NotNull
        this.charset = getDataSource().getCharset(charsetName);
    }


    public Integer getAutoIncrement() {

    }
    {
            return false;
        return (CubridDataSource) super.getDataSource();
package org.jkiss.dbeaver.ext.cubrid.model;
        this.charset = charset;
    public void setSchema(@NotNull CubridUser owner) {
    public List<CubridTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor)
           
    @Nullable
 */
    @NotNull
    public boolean isEnableSchema() {
    }
        this.collation = charset == null ? null : charset.getDefaultCollation();
    public CubridUser getParent() {
    public void setCharset(@NotNull CubridCharset charset) {
            this.reuseOID = (JDBCUtils.safeGetString(dbResult, CubridConstants.REUSE_OID)).equals("YES");
import org.jkiss.dbeaver.model.struct.DBSObject;
        this.collation = collation;
        } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
 * See the License for the specific language governing permissions and

            throws DBException {
    public CubridDataSource getDataSource() {
    @Property(viewable = false, editable = true, updatable = true, listProvider = CharsetListProvider.class, order = 8) 
    private Integer autoIncrement;
    private boolean partitioned = false;
            @NotNull GenericStructContainer container,
            }
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }
            String type = JDBCUtils.safeGetString(dbResult, "partition_type");
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull CubridTable table) throws SQLException {
            return object.getDataSource().getSchemas().toArray();
    public static class CharsetListProvider implements IPropertyValueListProvider<CubridTable>
        public boolean allowCustomValue() {
            sql = table.getDataSource().wrapShardQuery(sql);
    }
            String partition_class_name = JDBCUtils.safeGetString(dbResult, "partition_class_name");
            return false;
    private CubridCharset charset;

        public boolean allowCustomValue() {
 * Copyright (C) 2010-2025 DBeaver Corp and others

        }

import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
            final JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
/*
    @Override
        return charset;
        @Nullable
            
    public static class OwnerListProvider implements IPropertyValueListProvider<CubridTable>
                dbStat.setString(2, table.getSchema().getName());



 *
    @Property(viewable = true, editable = true, updatable = true, order = 10)
            throws DBException {
        @Override
    {
            return new CubridPartition(table, partition_class_name, type, dbResult);

    @Override
        return partitioned;
    public void setAutoIncrement(@NotNull Integer autoIncrement) {
    }
    public List<CubridPartition> getPartitions(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Property(viewable = true, editable = true, updatable = true, listProvider = CollationListProvider.class, order = 9)

        } else {
            
    {

            @Nullable String tableType,
    }
{
    
    

    }
        getParent().getCubridIndexCache().clearObjectCache(this);
        @Override
        this.autoIncrement = autoIncrement;
        @Nullable
    @Property(viewable = true, order = 53)
        this.owner = (CubridUser) container;
    @Property(viewable = true, editable = true, order = 52)

    
    @Override
    @Nullable
        public Object[] getPossibleValues(@NotNull CubridTable object) {
            return DBUtils.getQuotedIdentifier(this.getSchema()) + "." + DBUtils.getFullQualifiedName(getDataSource(), this);
    public void setName(@NotNull String name) {
        }
    }
    public boolean isReuseOID() {
            return object.getDataSource().getCharsets().toArray();
    public boolean isPartitioned() {
        @Override
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
    }
        @NotNull
        return partitionCache.getAllObjects(monitor, this);
    private CubridUser owner;
    static class PartitionCache extends JDBCObjectCache<CubridTable, CubridPartition> {
            }
    public void setReuseOID(boolean reuseOID) {
    }
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
            partitioned = (JDBCUtils.safeGetString(dbResult, "partitioned")).equals("YES");
    public void setCollation(@NotNull CubridCollation collation) {
            return false;


        this.owner = owner;

        return reuseOID;
    }
    public GenericSchema getSchema() {
    @Property(viewable = true, editableExpr = "object.enableSchema", updatableExpr = "object.enableSchema", listProvider = OwnerListProvider.class, labelProvider = GenericSchema.SchemaNameTermProvider.class, order = 2)
        return getDataSource().getSupportMultiSchema() || getDataSource().isDBAGroup();
        String charsetName = collationName.split("_")[0];
        super(container, tableName != null ? tableName.toLowerCase() : null, tableType, dbResult);

            if (type != null) {
            
    @Nullable
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.code.NotNull;
        return getParent().getCubridIndexCache().getObjects(monitor, getContainer(), this);

    }
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
        }
    @NotNull
        public Object[] getPossibleValues(@NotNull CubridTable object) {
        @Nullable
            @NotNull CubridTable table,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }

import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
        return (List<CubridTableColumn>) super.getAttributes(monitor);
        }
 * you may not use this file except in compliance with the License.

    @Override
import java.sql.SQLException;
        public boolean allowCustomValue() {
    public List<CubridTrigger> getTriggers(@NotNull DBRProgressMonitor monitor) throws DBException {
    private final PartitionCache partitionCache = new PartitionCache();
    private boolean reuseOID = true;
        @Override
        return (CubridUser) super.getContainer();
    @NotNull
            }
    @Override
        ) throws SQLException, DBException {
    }
        return (List<CubridTrigger>) super.getTriggers(monitor);
 * Unless required by applicable law or agreed to in writing, software

    }
        return getParent().supportsTrigger();

import org.jkiss.dbeaver.model.meta.Property;
    @NotNull
    public CubridTable(
    @Nullable
    }
    public boolean supportsTrigger() {
