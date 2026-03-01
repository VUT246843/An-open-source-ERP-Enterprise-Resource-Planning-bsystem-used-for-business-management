    {
    private DB2NicknameRemoteType remoteType;
        return remoteTableName;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    public Timestamp getStatsTime()
    }

    @Property(viewable = false, editable = false, category = DBConstants.CAT_STATISTICS)
    private String                remoteTableName;
    // -----------------
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException
        this.fPages = JDBCUtils.safeGetLongNullable(dbResult, "FPAGES");
        super(monitor, db2Schema, dbResult);



    @Property(viewable = true, editable = false, order = 4)
    }
        return remoteType;
    private DB2TableStatus        status;
    {

    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructLookupCache;
        return getContainer().getNicknameCache().refreshObject(monitor, getContainer(), this);
import java.util.Map;
 *     http://www.apache.org/licenses/LICENSE-2.0
        return card;
 * DBeaver - Universal Database Manager
    {
 * DB2 Federated Nickname
    {
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
 * distributed under the License is distributed on an "AS IS" BASIS,
        return fPages;
    }
        getContainer().getNicknameCache().clearChildrenCache(this);
    {
    public String getRemoteSchemaName()
import org.jkiss.dbeaver.DBException;
    @Property(viewable = true, editable = false, order = 12, category = DB2Constants.CAT_REMOTE)
    {

    private Long                  card;
        this.remoteSchemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "REMOTE_SCHEMA");
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TableAccessMode;

    {
    public String getDataCapture()
        return db2RemoteServer;


    @Property(viewable = true, editable = false, order = 11, category = DB2Constants.CAT_REMOTE)
        return DB2Messages.no_ddl_for_nicknames;
    public String getName()
    }
    @Property(viewable = true, editable = false, order = 13, category = DB2Constants.CAT_REMOTE)
    // Hide TableId for nicknames
    }
    private DB2TablePartitionMode partitionMode;
import org.jkiss.dbeaver.ext.db2.editors.DB2SourceObject;
    public DB2TableStatus getStatus()
        return constChecked;
 *
    @Override


        this.card = JDBCUtils.safeGetLongNullable(dbResult, "CARD");

    // Constructors
    {

    // -----------------
 *
        return remoteSchemaName;


 */
    public Long getfPages()
    public JDBCStructLookupCache<DB2Schema, DB2Nickname, DB2TableColumn> getCache()
        return status;
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;

        this.remoteTableName = JDBCUtils.safeGetString(dbResult, "REMOTE_TABLE");
    public Integer getTableId()
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
    {

 * 
        this.status = CommonUtils.valueOf(DB2TableStatus.class, JDBCUtils.safeGetString(dbResult, "STATUS"));

        this.partitionMode = CommonUtils.valueOf(DB2TablePartitionMode.class, JDBCUtils.safeGetString(dbResult, "PARTITION_MODE"));
    private DB2RemoteServer       db2RemoteServer;
    {

    @Property(viewable = false, editable = false, category = DBConstants.CAT_STATISTICS)
    {
    }
    {
    private String                dataCapture;

    @Property(viewable = false, editable = false, category = DBConstants.CAT_STATISTICS)

    private Timestamp             statsTime;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException
        return nPages;
    private Boolean               cachingAllowed;
    @Property(viewable = false, editable = false, order = 100)
import org.jkiss.dbeaver.model.struct.DBSObject;
package org.jkiss.dbeaver.ext.db2.model.fed;
    }
    public DB2Nickname(DBRProgressMonitor monitor, DB2Schema db2Schema, ResultSet dbResult) throws DBException


 *
        this.dataCapture = JDBCUtils.safeGetString(dbResult, "DATACAPTURE");
    // -----------------
    private String                remoteSchemaName;
    public DB2NicknameRemoteType getRemoteType()
    // Business Contract
    {

    }
    public String getRemoteTableName()

    public Long getOverFLow()
    @Property(viewable = false, editable = false, category = DBConstants.CAT_STATISTICS)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.db2.DB2Constants;
import org.jkiss.code.NotNull;
    // Properties
    @NotNull
        this.statsTime = JDBCUtils.safeGetTimestamp(dbResult, "STATS_TIME");
 */
    @Property(viewable = false, editable = false, category = DBConstants.CAT_STATISTICS)
    @Override
    {
 * You may obtain a copy of the License at

        this.remoteType = CommonUtils.valueOf(DB2NicknameRemoteType.class, JDBCUtils.safeGetString(dbResult, "REMOTE_TYPE"));
import java.sql.Timestamp;
    }

    @NotNull
/**
 * See the License for the specific language governing permissions and
        return getContainer().getNicknameCache().getChildren(monitor, getContainer(), this);
        this.overFLow = JDBCUtils.safeGetLongNullable(dbResult, "OVERFLOW");


import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.ext.db2.model.DB2TableColumn;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        String serverName = JDBCUtils.safeGetString(dbResult, "SERVERNAME");
    @Override
    {
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
    public String getConstChecked()
            this.db2RemoteServer = getDataSource().getRemoteServer(monitor, serverName);
    @Override
        }
    public DB2TableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {

 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.cachingAllowed = JDBCUtils.safeGetBoolean(dbResult, "CACHINGALLOWED", DB2YesNo.Y.name());
}
    public Long getnPages()
    }

    private String                constChecked;
    }
    // -----------------
    @NotNull
    }
    }
    @Property(viewable = false, editable = false, order = 111)
import org.jkiss.dbeaver.model.exec.DBCException;

        return getContainer().getNicknameCache().getChild(monitor, getContainer(), this, attributeName);
    @Property(viewable = true, editable = false, order = 10, category = DB2Constants.CAT_REMOTE)
        return super.getName();
        this.accessMode = CommonUtils.valueOf(DB2TableAccessMode.class, JDBCUtils.safeGetString(dbResult, "ACCESS_MODE"));
    public DB2RemoteServer getDb2RemoteServer()
import org.jkiss.dbeaver.ext.db2.DB2Messages;
    }
        this.nPages = JDBCUtils.safeGetLongNullable(dbResult, "NPAGES");
    {
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    public DB2TableAccessMode getAccessMode()
        super.refreshObject(monitor);
    {
        return dataCapture;
    private Long                  nPages;
    }
 * limitations under the License.
    }

    {

import org.jkiss.dbeaver.model.DBConstants;
        return false;
import java.sql.ResultSet;
    {
    // -----------------
    {
        return status.getState();
    @Property(viewable = false, editable = false, order = 109)

    {

    }
        if (serverName != null) {
        return super.getTableId();
        return accessMode;
import org.jkiss.dbeaver.model.struct.DBSObjectState;
    }
    {

    public Boolean getCachingAllowed()
    public DB2TablePartitionMode getPartitionMode()
import java.util.List;
 * @author Denis Forveille

import org.jkiss.dbeaver.ext.db2.model.dict.DB2TableStatus;
    }
    public boolean isView()
    @Override
    @Override
    {
        return partitionMode;
    private Long                  overFLow;
    }
    private DB2TableAccessMode    accessMode;
        this.constChecked = JDBCUtils.safeGetString(dbResult, "CONST_CHECKED");
    @Property(viewable = false, hidden = true)
        return statsTime;
    public Long getCard()
    }
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TablePartitionMode;
    public DBSObjectState getObjectState()
    // -----------------
    public List<DB2TableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
        return cachingAllowed;

    }

    @Override
    @Property(viewable = true, editable = false, order = 101)

    private Long                  fPages;
    }
    @Override


public class DB2Nickname extends DB2TableBase implements DBPNamedObject2, DBPRefreshableObject, DB2SourceObject {
        return getContainer().getNicknameCache();
    }
import org.jkiss.dbeaver.model.DBPNamedObject2;

/*
        return overFLow;
    @Property(viewable = false, editable = false, order = 111)
