
/**
        this.container = container;
        this.container = container;
    private boolean isNotForReplication;
    @Property(viewable = true, order = 12)
            } catch (SQLException e) {
        this.isNotForReplication = JDBCUtils.safeGetInt(dbResult, "is_not_for_replication") != 0;
    @NotNull
    public Date getModifyDate() {



                    }

    }
    {
    public SQLServerTriggerBase(
        return modifyDate;
import org.jkiss.dbeaver.model.DBPQualifiedObject;
        }
        this.objectId = JDBCUtils.safeGetLong(dbResult, "object_id");
        this.disabled = 1;


 * You may obtain a copy of the License at
    public boolean isDisabled() {
    }
    private Date modifyDate;

        this.insteadOfTrigger = JDBCUtils.safeGetInt(dbResult, "is_instead_of_trigger") != 0;

        OWNER container,
import org.jkiss.code.NotNull;
    }
        this.createDate = JDBCUtils.safeGetDate(dbResult, "create_date");
    }
    @Override
    
    @Property(viewable = true, order = 11)
    private Date createDate;
        this.isMsShipped = JDBCUtils.safeGetInt(dbResult, "is_ms_shipped") != 0;
        this.container = container;
        this.persisted = false;
    @Override
    }
    }
 * you may not use this file except in compliance with the License.
    private OWNER container;




    private boolean isMsShipped;
                dbStat.setLong(1, getObjectId());
import java.util.Map;
 *
        return objectId;
    }

        return null;
    public Date getCreateDate() {
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException {
    @Property(viewable = true, order = 14)
    public SQLServerTriggerBase(
    public OWNER getParentObject()
                    if (dbResult.next()) {
import java.util.Date;
    public boolean isNotForReplication() {
    }
 * See the License for the specific language governing permissions and
    
    @Override
    @Override

        this.name = source.name;
        return persisted;
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
        this.type = source.type;
    private boolean insteadOfTrigger;
import java.sql.SQLException;
    public String getTriggerTypeDescription() {
    }

    public DBSObjectState getObjectState() {
            }
        this.name = JDBCUtils.safeGetString(dbResult, "name");
        this.body = source.body;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    @Override
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        return typeDescription;
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSTrigger;
        if (body == null && isPersisted()) {
    {
    }

    public void setName(String name) {
    public long getObjectId() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
{
    private volatile boolean persisted;
import org.jkiss.dbeaver.model.exec.DBCException;
package org.jkiss.dbeaver.ext.mssql.model;
            body = SQLServerUtils.extractSource(monitor, this);
    @Property(viewable = true, order = 15)
    @NotNull
    }
 *
        String name)
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT is_disabled FROM sys.triggers WHERE object_id=?")) {
        }
        return triggerTypeDescription;
        this.name = name;
    @Override
 */
    }
        OWNER container,
    @NotNull
                throw new DBCException(e, session.getExecutionContext());
        return name;
    @Property(viewable = false, order = 10)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public SQLServerDataSource getDataSource()
    @Property(viewable = false, order = 16)


        if (disabled != 0) {
import org.jkiss.dbeaver.model.meta.Property;
    {

import org.jkiss.dbeaver.model.struct.DBSObjectWithScript;
        return body;

 * SQLServerTriggerBase


    @Override
import org.jkiss.dbeaver.model.DBPStatefulObject;
    private long objectId;
        return container;
    {
    private String triggerTypeDescription;
    public boolean isInsteadOfTrigger() {
        return isMsShipped;
    }
 * Unless required by applicable law or agreed to in writing, software
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException

    }
    }
        this.persisted = true;
    public String getDescription() {
    public void setDisabled(boolean disabled) {
    }
        return createDate;
    public SQLServerTriggerBase(OWNER container, SQLServerTriggerBase source) {
                        disabled = JDBCUtils.safeGetInt(dbResult, 1);

    public String toString() {
}
    private String body;
    public boolean isMsShipped() {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public boolean isPersisted() {
        this.name = name;
            return DBSObjectState.INVALID;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Refresh triggers state")) {
    private volatile int disabled;
    @NotNull
        this.modifyDate = JDBCUtils.safeGetDate(dbResult, "modify_date");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * DBeaver - Universal Database Manager
                }
        this.body = body;
    public void setBody(String body) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = true, order = 1)
    public String getName() {
    @Property(viewable = true, order = 13)
    @Property(hidden = true, editable = true, updatable = true, order = -1)

    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

        this.typeDescription = JDBCUtils.safeGetString(dbResult, "type_desc");
    @Override
    private String type;
        this.persisted = source.persisted;
    }
        this.triggerTypeDescription = JDBCUtils.safeGetString(dbResult, "trigger_type");
        return (SQLServerDataSource) container.getDataSource();
    }
    public String getTypeDescription() {
    @Property(viewable = true, order = 17)
    }
    public void setObjectDefinitionText(String sourceText) {
        this.type = JDBCUtils.safeGetString(dbResult, "type");
        this.disabled = JDBCUtils.safeGetInt(dbResult, "is_disabled");
    {
import org.jkiss.dbeaver.DBException;
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import org.jkiss.dbeaver.model.DBUtils;
        ResultSet dbResult)
    }
    public String getBody()
        return disabled != 0;
        return body;
    }
    @Override
    @Override
    }
import org.jkiss.dbeaver.model.struct.DBSObjectState;
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Property(viewable = true, order = 18)
 */
public abstract class SQLServerTriggerBase<OWNER extends DBSObject> implements DBSTrigger, DBSObjectWithScript, DBPQualifiedObject, DBPRefreshableObject, SQLServerObject, DBPStatefulObject
        return DBSObjectState.NORMAL;
        return getName();
        this.body = "";
        return insteadOfTrigger;
    }
    private String typeDescription;
    }
    private String name;
import java.sql.ResultSet;
 * limitations under the License.
import org.jkiss.dbeaver.model.DBPRefreshableObject;

    }
    {

 *
        return isNotForReplication;
        this.body = sourceText;
