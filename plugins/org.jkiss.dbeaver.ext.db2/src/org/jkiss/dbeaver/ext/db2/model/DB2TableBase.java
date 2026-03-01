    public String getName()
import org.jkiss.dbeaver.ext.db2.editors.DB2StatefulObject;
import java.util.Collection;
        }

    }
import org.jkiss.dbeaver.ext.db2.model.cache.DB2TableIndexCache;

        }
 */
    // Associations (Imposed from DBSTable). In DB2, Most of objects "derived"
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_OWNER)
    {
    private String owner;
    // Stats
            }

    {
    }

import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
    // -----------------
    private DB2TableIndexCache tableIndexCache = new DB2TableIndexCache();
    @Override
    // -------------------------
        setName(JDBCUtils.safeGetString(dbResult, "TABNAME"));
    @Override
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at

        return "TRUNCATE TABLE " + getFullyQualifiedName(DBPEvaluationContext.DML) + " IMMEDIATE";
    {
        return super.getContainer();

        return remarks;
    @Override
        return Collections.emptyList();
    // -----------------
        return tableTotalSize != null;

import java.util.ArrayList;


    public Collection<DB2TableUniqueKey> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException

    // -----------------
    @Override
    }
    @Override
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    public DB2TableBase(DBRProgressMonitor monitor, DB2Schema schema, ResultSet dbResult)
        // FIXME: use composite cache or something smart

 * See the License for the specific language governing permissions and
import org.jkiss.utils.CommonUtils;
public abstract class DB2TableBase extends JDBCTable<DB2DataSource, DB2Schema>
import org.jkiss.dbeaver.DBException;
    {
 *
    public boolean hasStatistics() {
import org.jkiss.dbeaver.model.struct.DBSObject;

    // -----------------
    // -----------------
import java.sql.ResultSet;
        return super.getName();
    {

    @Nullable
}
    public Collection<DB2TableForeignKey> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException
            if (index.getTable() == this) {
 * Super class for DB2 Tables, Views, Nicknames
            }
    // Properties
    {
        this.tableId = JDBCUtils.safeGetInteger(dbResult, "TABLEID");
        return ownerType;
 * Licensed under the Apache License, Version 2.0 (the "License");

    // Business Contract
    }

    }
    }

        // DF: Clear base index/trigger cache manually.

    }
    }

    @Override
    }

    @Override
        tableIndexCache.clearCache();
        return owner;
    {
    }
 *
    @Property(viewable = true, order = 98)
    public String getDescription()
    }
    public String getOwner()
        return DBUtils.getFullQualifiedName(getDataSource(), getSchema(), this);
    // -----------------
    @Override

package org.jkiss.dbeaver.ext.db2.model;
    }
        return tableId;
import org.jkiss.code.Nullable;
    protected String getTruncateTableQuery() {
import java.util.Collections;
    @Association

    @NotNull
    public DB2TableBase(DB2Schema container, String name, Boolean persisted)

        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);
 * DBeaver - Universal Database Manager

        tableTotalSize = null;


        for (DB2Index index : new ArrayList<>(getContainer().getIndexCache().getCachedObjects())) {
    private Timestamp createTime;
    @Nullable
    private String remarks;
    {
        }
    public void setDescription(String description)
    public Integer getTableId()
 * Copyright (C) 2010-2026 DBeaver Corp and others


    {
    @Nullable
    }
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
    }
 */
    }
        DB2DataSource db2DataSource = schema.getDataSource();
    {
import java.sql.Timestamp;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {

    @Property(viewable = true, editable = false, order = 2)

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    // -----------------
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    private Integer tableId;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTable;
    }
    public abstract DB2TableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException;

    @NotNull
    void setTableTotalSize(long tableTotalSize) {
 * you may not use this file except in compliance with the License.
    {
    @Override
        this.remarks = description;
        super(container, name, persisted);
import org.jkiss.dbeaver.model.DBPObjectStatistics;
        this.tableTotalSize = tableTotalSize;
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
    @Property(viewable = false, order = 99, editable = true, updatable = true, length = PropertyLength.MULTILINE)
 * limitations under the License.
import org.jkiss.dbeaver.model.meta.PropertyLength;
 * 


 * Unless required by applicable law or agreed to in writing, software

 * distributed under the License is distributed on an "AS IS" BASIS,

    public Collection<DB2Index> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException
    {
                getContainer().getIndexCache().removeObject(index, true);
    implements DBPRefreshableObject, DB2StatefulObject, DBPObjectStatistics {
                getContainer().getTriggerCache().removeObject(trigger, true);

/*
import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
    public Collection<DB2TableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException
        return createTime;
    // -----------------

    private DB2OwnerType ownerType;
    // -----------------
    {
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
    // from Tables don't have those..
        return Collections.emptyList();
    // Associations
    }
import org.jkiss.dbeaver.model.meta.Association;

    @Override
    {

import org.jkiss.dbeaver.model.DBUtils;
    public DB2OwnerType getOwnerType()
        return tableTotalSize == null ? 0 : tableTotalSize;
        this.owner = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER);

    @Property(viewable = false, editable = false, category = DB2Constants.CAT_OWNER)
    public Timestamp getCreateTime()

    }
    @Override
    @Override
    }
    // -------------------------
        return Collections.emptyList();
import org.jkiss.dbeaver.ext.db2.model.dict.DB2OwnerType;
import org.jkiss.dbeaver.model.meta.Property;
 * @author Denis Forveille
        for (DB2Trigger trigger : new ArrayList<>(getContainer().getTriggerCache().getCachedObjects())) {
    // Constructors
    public DB2Schema getSchema()

 *
    public long getStatObjectSize() {
        super(schema, true);
            this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER_TYPE));
    {
    private volatile Long tableTotalSize;
    }
        if (db2DataSource.isAtLeastV9_5()) {
    // -----------------
    @Property(viewable = false, editable = false, order = 100, category = DB2Constants.CAT_DATETIME)
    }
    {
/**
        return this;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Property(viewable = true, editable = false, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
            if (trigger.getTable() == this) {
        return monitor == null ? tableIndexCache.getCachedObjects() : tableIndexCache.getAllObjects(monitor, this);
