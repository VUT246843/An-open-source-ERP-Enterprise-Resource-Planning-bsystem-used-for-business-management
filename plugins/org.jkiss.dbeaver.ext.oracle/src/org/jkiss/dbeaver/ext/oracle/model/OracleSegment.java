            parent,
            return null;
            String ownerName = JDBCUtils.safeGetStringTrimmed(dbResult, "OWNER");
    public OracleDataFile getFile()
        this.segmentType = JDBCUtils.safeGetStringTrimmed(dbResult, "SEGMENT_TYPE");
    {
/*
    {
        final Object tablespace = getTablespace(monitor);
        } else {
        }
        return blocks;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private long blocks;
    }

public class OracleSegment<PARENT extends DBSObject> extends OracleObject<PARENT> {
        this.blocks = JDBCUtils.safeGetLong(dbResult, "BLOCKS");
    protected OracleSegment(DBRProgressMonitor monitor, PARENT parent, ResultSet dbResult) throws DBException
import java.sql.ResultSet;

        }
            JDBCUtils.safeGetStringTrimmed(dbResult, "SEGMENT_NAME"),
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

import org.jkiss.dbeaver.DBException;
    {
 *
    }
        if (getDataSource().isAdmin()) {
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager

        if (tablespace instanceof OracleTablespace) {


    public String getPartitionName()
        return file;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
import org.jkiss.utils.CommonUtils;
    }
    }
    }
            this.file = ((OracleTablespace)tablespace).getFile(monitor, fileNo);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                schema = getDataSource().getSchema(monitor, ownerName);
        this.bytes = JDBCUtils.safeGetLong(dbResult, "BYTES");
 * You may obtain a copy of the License at
    {
    {

        super(
    private long bytes;
import org.jkiss.dbeaver.model.meta.Property;
package org.jkiss.dbeaver.ext.oracle.model;
    {
        return bytes;
    public long getBlocks()
 * Licensed under the Apache License, Version 2.0 (the "License");
    public Object getTablespace(DBRProgressMonitor monitor) throws DBException
    public String getSegmentType()


    @Property(viewable = true, editable = true, order = 6)
    private OracleSchema schema;
 */
}
            true);
    }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    private OracleDataFile file;
    @Property(viewable = true, editable = true, order = 5)
        return partitionName;
    public OracleSchema getSchema()
 *
    }

        this.partitionName = JDBCUtils.safeGetStringTrimmed(dbResult, "PARTITION_NAME");
        final long fileNo = JDBCUtils.safeGetInt(dbResult, "RELATIVE_FNO");
        return segmentType;
 * limitations under the License.

    {
            return ((OracleTablePartition) parent).getTablespace(monitor);
            return parent;

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(viewable = true, editable = true, order = 3)
    }
    @Property(viewable = true, editable = true, order = 4)
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
 * Oracle segments (objects)
        if (parent instanceof OracleTablespace) {
    @Property(order = 7)
import org.jkiss.dbeaver.model.struct.DBSObject;
/**
    private String segmentType;
 */
        }
        } else if (parent instanceof OracleTablePartition) {
    @Property(viewable = true, editable = true, order = 2)
            if (!CommonUtils.isEmpty(ownerName)) {

        return schema;
    private String partitionName;
    public long getBytes()
    {
