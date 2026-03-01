        }

        return this;
    }
    @Property(viewable = false, category = DB2Constants.CAT_PERFORMANCE)
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TablespaceDataType;
import org.jkiss.code.Nullable;
    }

    {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
            this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER_TYPE));
    // -----------------
    public Integer getPrefetchSize()
    private Timestamp createTime;
    }
    @Association
    }
 * limitations under the License.
    @Property(viewable = false, length = PropertyLength.MULTILINE)
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (reference instanceof String) {

import org.jkiss.dbeaver.model.meta.Association;
    private String dbpgName;
    }
    }
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);

    private Double writeTransferRate;
        return ownerType;

        return createTime;
        Integer bufferpoolId = JDBCUtils.safeGetInteger(dbResult, "BUFFERPOOLID");
    private Integer dataTag;
    @Property(viewable = false, category = DB2Constants.CAT_PERFORMANCE)
    public DB2OwnerType getOwnerType()
        }
        return tbspaceType;
        for (DB2TablespaceContainer container : containerCache.getAllObjects(monitor, this)) {
    public Double getWriteOverHead()
    public DB2Tablespace(DB2DataSource db2DataSource, String db2TablespaceName) throws DBException
        return overHead;
        }


 * distributed under the License is distributed on an "AS IS" BASIS,
        this.name = db2TablespaceName;
    private DB2TablespaceDataType dataType;
        this.extentSize = JDBCUtils.safeGetInteger(dbResult, "EXTENTSIZE");

        return name;

import org.jkiss.dbeaver.model.meta.PropertyLength;
    private Double overHead;
        }

        this.name = JDBCUtils.safeGetString(dbResult, "TBSPACE");
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DB2TablespaceContainer getContainer(DBRProgressMonitor monitor, long containerId) throws DBException
import org.jkiss.dbeaver.model.meta.Property;
    }
    {
    private Integer prefetchSize;
        return tbspaceId;
        if (db2DataSource.isAtLeastV9_5()) {
            if (container.getContainerId() == containerId) {
    @Override
 *
        this.dataType = CommonUtils.valueOf(DB2TablespaceDataType.class, JDBCUtils.safeGetString(dbResult, "DATATYPE"));
    {
 * You may obtain a copy of the License at
    public DB2Bufferpool getBufferPool()
    {
    public Double getWriteTransferRate()
        return dropRecovery;

    @Override
                this.storageGroup = db2DataSource.getStorageGroup(new VoidProgressMonitor(), storageGroupName);
    @Property(viewable = true, order = 5)
    }
        this.overHead = JDBCUtils.safeGetDouble(dbResult, "OVERHEAD");
import org.jkiss.dbeaver.ext.db2.model.cache.DB2TablespaceContainerCache;
    public Integer getExtentSize()

 */
    public DB2TablespaceType getTbspaceType()

    public String getName()
    // -----------------------
    }
    @Property(viewable = false, category = DB2Constants.CAT_PERFORMANCE)
    {
    {
    // -----------------
        return dbpgName;
    }
        return remarks;
import org.jkiss.code.NotNull;
    // Associations
    @Property(viewable = true, order = 2)
    public Collection<DB2TablespaceContainer> getContainers(DBRProgressMonitor monitor) throws DBException
    {

public class DB2Tablespace extends DB2GlobalObject implements DBPNamedObject, DBPRefreshableObject {

}

    @Property(viewable = false, category = DB2Constants.CAT_PERFORMANCE)
    @Nullable
            this.writeOverHead = JDBCUtils.safeGetDouble(dbResult, "WRITEOVERHEAD");
            }
            }
 *
 * you may not use this file except in compliance with the License.
    public Integer getTbspaceId()
    public Double getTransferRate()


import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    // -----------------
    @Property(viewable = true, order = 6)
    {
        return containerCache.getAllObjects(monitor, this);
    {
    private Integer extentSize;
    static DB2Tablespace resolveTablespaceReference(DBRProgressMonitor monitor, DB2DataSource dataSource, Object reference)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return prefetchSize;
    // Properties
        this.dropRecovery = JDBCUtils.safeGetBoolean(dbResult, "DROP_RECOVERY", DB2YesNo.Y.name());
            this.effectivePrefetchSize = JDBCUtils.safeGetInteger(dbResult, "EFFECTIVEPREFETCHSIZE");
        return bufferpool;
        this.prefetchSize = JDBCUtils.safeGetInteger(dbResult, "PREFETCHSIZE");
    @Property(viewable = false, category = DB2Constants.CAT_OWNER)
        return (DB2Tablespace) reference;
    {
    {
    private String name;
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);

    public DB2Tablespace(DB2DataSource db2DataSource, ResultSet dbResult) throws DBException
    @Property(viewable = false)
import org.jkiss.dbeaver.model.struct.DBSObject;
    }

        super(db2DataSource, false);
 * See the License for the specific language governing permissions and
    public Integer getEffectivePrefetchSize()
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;
    {
 *
        this.owner = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER);
    public Integer getDataTag()
    {

        this.dbpgName = JDBCUtils.safeGetString(dbResult, "DBPGNAME");
                return container;
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    private String remarks;
import org.jkiss.utils.CommonUtils;

    {

    @Property(viewable = false)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        this.tbspaceType = CommonUtils.valueOf(DB2TablespaceType.class, JDBCUtils.safeGetString(dbResult, "TBSPACETYPE"));
 * Unless required by applicable law or agreed to in writing, software
    }

    {
    @Property(viewable = false, category = DB2Constants.CAT_PERFORMANCE)
        bufferpool = DB2Utils.findBufferpoolById(new VoidProgressMonitor(), db2DataSource, bufferpoolId);
    public Timestamp getCreateTime()
    // -----------------
    public Double getOverHead()
    @Property(viewable = true, order = 1)

    @Override
    private Integer effectivePrefetchSize;
        return effectivePrefetchSize;
    @Property(viewable = true, order = 7)

            this.writeTransferRate = JDBCUtils.safeGetDouble(dbResult, "WRITETRANSFERRATE");
        throws DBException
    private DB2OwnerType ownerType;
        this.pageSize = JDBCUtils.safeGetInteger(dbResult, "PAGESIZE");
    public DB2StorageGroup getStorageGroup()
 * DBeaver - Universal Database Manager
    private String owner;
    public Integer getPageSize()
    public Boolean getDropRecovery()
 */
    {
    // Constructors
    }

    private final DB2TablespaceContainerCache containerCache = new DB2TablespaceContainerCache();
            this.writeTransferRate = JDBCUtils.safeGetDouble(dbResult, "WRITETRANSFERRATE");
    private Double transferRate;
    }
    }
        return dataType;
        this.tbspaceId = JDBCUtils.safeGetInteger(dbResult, "TBSPACEID");


import java.sql.ResultSet;
    }
    }
    {
            if (storageGroupName != null) {
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TablespaceType;
        return writeOverHead;
    {
    private Boolean dropRecovery;
    @Property(viewable = true, order = 3)
    }
    private DB2StorageGroup storageGroup;
        super(db2DataSource, true);
    {
    {
        return null;
import org.jkiss.dbeaver.DBException;
    }
    @Property(viewable = true, order = 4)
import org.jkiss.dbeaver.model.DBPNamedObject;
import org.jkiss.dbeaver.ext.db2.model.dict.DB2OwnerType;
        if (db2DataSource.isAtLeastV10_1()) {

    @NotNull
        return transferRate;
 * @author Denis Forveille
import java.sql.Timestamp;
            return dataSource.getTablespaceCache().getObject(monitor, dataSource, (String) reference);


    }
    @Property(viewable = false)
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    }
    public String getOwner()

    private DB2Bufferpool bufferpool;

import java.util.Collection;
    public DB2TablespaceDataType getDataType()
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.ext.db2.model;
    {

            String storageGroupName = JDBCUtils.safeGetString(dbResult, "SGNAME");
    }
    @Property(viewable = false, category = DB2Constants.CAT_DATETIME)
import org.jkiss.dbeaver.ext.db2.DB2Constants;

            this.writeOverHead = JDBCUtils.safeGetDouble(dbResult, "WRITEOVERHEAD");
    private Integer tbspaceId;
        containerCache.clearCache();
/*

    {
    }
    public String getDescription()

    private Double writeOverHead;
 *     http://www.apache.org/licenses/LICENSE-2.0
    // -----------------------
        }
    @Property(viewable = false, category = DB2Constants.CAT_PERFORMANCE)
    }
            this.dataTag = JDBCUtils.safeGetInteger(dbResult, "DATATAG");
    public String getDbpgName()
        return dataTag;
 * 

    {
    @Property(viewable = false, category = DB2Constants.CAT_OWNER)
        return pageSize;
    }
    private DB2TablespaceType tbspaceType;
        this.transferRate = JDBCUtils.safeGetDouble(dbResult, "TRANSFERRATE");
        return extentSize;
    {
/**
    // Constructor for lazy loading, acts as a placeholder.
    {
        return owner;
    }
import org.jkiss.dbeaver.ext.db2.DB2Utils;

    @Property(viewable = false, category = DB2Constants.CAT_PERFORMANCE)
    {
        return storageGroup;
        if (db2DataSource.isAtLeastV9_5()) {
 * DB2 Tablespace
    private Integer pageSize;
        return writeTransferRate;

