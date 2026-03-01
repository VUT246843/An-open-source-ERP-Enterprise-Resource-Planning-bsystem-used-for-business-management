        AltibaseSchema refSchema = (AltibaseSchema) getDataSource().getSchema(localSchemaName);
 * Replication is possible not only at the table level but also at the table partition level.
    private String localSchemaName;
    private String localTableName;
    }
        }

    private String localPartnName;
        localSchemaName = JDBCUtils.safeGetString(resultSet, "LOCAL_USER_NAME");
        DBSObject localTable = null;

            localTable = refSchema.getTable(monitor, localTableName);


                JDBCUtils.safeGetString(resultSet, "LOCAL_PARTITION_NAME")),
/*
        invalidMaxSn = JDBCUtils.safeGetLong(resultSet, "INVALID_MAX_SN");
    }
import org.jkiss.dbeaver.DBException;
 */
    @Property(viewable = true, linkPossible = true, order = 5)
import org.jkiss.code.Nullable;
        return (AltibaseTable) localTable;
 */
    public long getInvalidMaxSn() {
public class AltibaseReplicationItem extends AltibaseObject<AltibaseReplication> implements DBSAlias {

    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

 * ReplicationItem is a pair of replication tables consisting of local and remote. 

    }
    @NotNull
 * See the License for the specific language governing permissions and
        if (refSchema != null) {
    public DBSObject getTargetObject(@Nullable DBRProgressMonitor monitor) throws DBException {
        remoteTableName = JDBCUtils.safeGetString(resultSet, "REMOTE_TABLE_NAME");

    public boolean getIsPartitionedRepl() {
 *
        localPartnName  = JDBCUtils.safeGetString(resultSet, "LOCAL_PARTITION_NAME");

    @Override
    }
    @Property(viewable = true, order = 10)
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
    protected AltibaseReplicationItem(AltibaseReplication parent, JDBCResultSet resultSet) {
    public String getTableOid() {
 * Unless required by applicable law or agreed to in writing, software

    

        isPartitionedRepl = JDBCUtils.safeGetBoolean(resultSet, "REPLICATION_UNIT", "P");

    }
    private String remoteSchemaName;

            localTable = getTargetObject(monitor);
        remoteSchemaName= JDBCUtils.safeGetString(resultSet, "REMOTE_USER_NAME");
    @Property(viewable = true, order = 6)

import org.jkiss.dbeaver.model.struct.DBSObject;
    public String getReplObjTo() {
    @NotNull
        return isPartitionedRepl;
        tableOid = JDBCUtils.safeGetString(resultSet, "TABLE_OID");
    private long invalidMaxSn;

        localTableName  = JDBCUtils.safeGetString(resultSet, "LOCAL_TABLE_NAME");

    @Property(viewable = true, order = 11)
    private boolean isPartitionedRepl;
 * distributed under the License is distributed on an "AS IS" BASIS,

                parent.getDataSource(),
        super(parent, DBUtils.getFullyQualifiedName(
        return tableOid;
                JDBCUtils.safeGetString(resultSet, "LOCAL_TABLE_NAME"), 
        return localTable;
import org.jkiss.dbeaver.model.DBUtils;
    }
    private String remoteTableName;
import org.jkiss.dbeaver.model.struct.DBSAlias;
 * A replication can have multiple replicationItems.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        if (localTable == null) {
                true);
    }
 * limitations under the License.
    private String remotePartnName;
                JDBCUtils.safeGetString(resultSet, "LOCAL_USER_NAME"), 
 * You may obtain a copy of the License at
        return name;
        return DBUtils.getFullyQualifiedName(parent.getDataSource(), remoteSchemaName, remoteTableName, remotePartnName);
    public AltibaseTable getReplObjFrom(DBRProgressMonitor monitor) throws DBException {
package org.jkiss.dbeaver.ext.altibase.model;
    @NotNull
    private String tableOid;
    @Property(viewable = true, order = 2)
        remotePartnName = JDBCUtils.safeGetString(resultSet, "REMOTE_PARTITION_NAME");
 * 
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
}
    @Property(viewable = false, order = 1, hidden = true)
 *
        return invalidMaxSn;
    
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
    public String getName() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
    private DBSObject localTable = null;
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.meta.Property;
