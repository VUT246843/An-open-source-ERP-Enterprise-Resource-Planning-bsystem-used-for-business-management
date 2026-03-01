    @Property(order = 8)
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager


    }
    @Property(viewable = true, order = 9)
    }
    private String dropTime;
    @Nullable
}
 * you may not use this file except in compliance with the License.

    public String getCreateTime()
    @Property(order = 7)
    }
    @Property(viewable = true, order = 3)
 */
    public Object getLazyReference(Object propertyId)
    public String getRecycledName()

    public Object getTablespace(DBRProgressMonitor monitor) throws DBException
    {
public class OracleRecycledObject extends OracleSchemaObject implements DBSObjectLazy<OracleDataSource> {
    public String getPartitionName()
    }
    }
    @LazyProperty(cacheValidator = OracleTablespace.TablespaceReferenceValidator.class)
        this.canPurge = JDBCUtils.safeGetBoolean(dbResult, "CAN_PURGE", OracleConstants.RESULT_YES_VALUE);

import org.jkiss.dbeaver.model.meta.Property;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
    @Property(viewable = true, order = 4)
    @Property(order = 6)
    private String createTime;
    {
 *
    @Override

        return partitionName;
 *     http://www.apache.org/licenses/LICENSE-2.0
        return createTime;


import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
    private String objectType;
    }
        return OracleTablespace.resolveTablespaceReference(monitor, this, null);
import org.jkiss.dbeaver.model.struct.DBSObjectLazy;
    }

    }
    public enum Operation {
    {
        DROP,

    private String partitionName;
    {
    {
import java.sql.ResultSet;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
        this.dropTime = JDBCUtils.safeGetString(dbResult, "DROPTIME");

    public String getDropTime()
    {
    @Property(viewable = true, order = 10)
        return dropTime;
 *
    }
import org.jkiss.code.Nullable;
        return canUndrop;
        return tablespace;
    }
        return recycledName;
import org.jkiss.dbeaver.model.meta.LazyProperty;

    @Property(viewable = true, order = 2)
    public boolean isCanUndrop()
    private Operation operation;
    private Object tablespace;

    }
 * You may obtain a copy of the License at
import org.jkiss.utils.CommonUtils;

        this.createTime = JDBCUtils.safeGetString(dbResult, "CREATETIME");
    {
    }
        TRUNCATE
    {
        super(schema, JDBCUtils.safeGetString(dbResult, "ORIGINAL_NAME"), true);
    private String recycledName;
 * Unless required by applicable law or agreed to in writing, software
        this.operation = CommonUtils.valueOf(Operation.class, JDBCUtils.safeGetString(dbResult, "OPERATION"));
    @Property(viewable = true, order = 5)
        this.recycledName = JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_OBJECT_NAME);
    private boolean canUndrop;
        return canPurge;
    private boolean canPurge;
 * Recycled object

        this.tablespace = JDBCUtils.safeGetString(dbResult, "TS_NAME");
 * limitations under the License.
        return operation;
        return objectType;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
        this.objectType = JDBCUtils.safeGetString(dbResult, "TYPE");
    protected OracleRecycledObject(OracleSchema schema, ResultSet dbResult)

    {
import org.jkiss.dbeaver.DBException;
/*

    {
    public boolean isCanPurge()
    public Operation getOperation()
 *
package org.jkiss.dbeaver.ext.oracle.model;
    public String getObjectType()
        this.partitionName = JDBCUtils.safeGetString(dbResult, "PARTITION_NAME");
 * See the License for the specific language governing permissions and
        this.canUndrop = JDBCUtils.safeGetBoolean(dbResult, "CAN_UNDROP", OracleConstants.RESULT_YES_VALUE);
