 * Copyright (C) 2010-2025 DBeaver Corp and others
        super(parent, name, false);
    }
/*
import java.util.Map;
    private ActionType actionType;
        return refNames;
    private String triggerType;
    public String getRefNames()
        this.whenClause = JDBCUtils.safeGetString(dbResult, "WHEN_CLAUSE");
    public void setObjectDefinitionText(String source)
    public enum BaseObjectType {
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public abstract class OracleTrigger<PARENT extends DBSObject> extends OracleObject<PARENT> implements DBSTrigger, DBPQualifiedObject, OracleSourceObject
import org.jkiss.dbeaver.model.meta.Property;
    private String triggeringEvent;
    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    }
        this.status = CommonUtils.valueOf(
        this.sourceDeclaration = source;
 *
                "ALTER TRIGGER " + getFullyQualifiedName(DBPEvaluationContext.DDL) + " COMPILE"
        DATABASE
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(order = 8)
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
            return title;
    {
        ResultSet dbResult)
        return DBUtils.getFullQualifiedName(getDataSource(),
        @NotNull
    public DBSObjectState getObjectState()
    private BaseObjectType objectType;
        this.refNames = JDBCUtils.safeGetString(dbResult, "REFERENCING_NAMES");
    {
            JDBCUtils.safeGetStringTrimmed(dbResult, OracleConstants.COLUMN_STATUS));
        return triggeringEvent;
    @Property(viewable = true, order = 12)
        return sourceDeclaration;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        this.triggeringEvent = JDBCUtils.safeGetString(dbResult, "TRIGGERING_EVENT");
            sourceDeclaration = OracleUtils.getSource(monitor, this, false, true);
        return whenClause;

 *
        {
    {
    @Nullable
import org.jkiss.dbeaver.DBException;
    @Override
            )};
    @Property(viewable = true, order = 7)
        private final String title;
        PARENT parent,
        this.status = (OracleUtils.getObjectStatus(monitor, this, OracleObjectType.TRIGGER) ? OracleObjectStatus.ENABLED : OracleObjectStatus.ERROR);
{
        CALL("CALL");


import org.jkiss.dbeaver.model.meta.PropertyLength;
    private String columnName;
    {
    @Property(viewable = true, order = 5)
        @Override
    @NotNull
    private String whenClause;
    public ActionType getActionType()
/**
    }
        return triggerType;
            this.title = title;
    {
    @Override
 * limitations under the License.
    @Property(viewable = true, order = 6)
        return description;

        return new DBEPersistAction[] {
    public String getTriggeringEvent()
    @Property(viewable = true, order = 10)
import org.jkiss.code.Nullable;
                "Compile trigger",
    @Property(order = 9)

    }
    }
 * you may not use this file except in compliance with the License.
    {
    {

import org.jkiss.dbeaver.model.struct.DBSObjectState;
        return super.getName();

        ActionType(String title)
    @Override
    public OracleTrigger(PARENT parent, String name)
    }
    @NotNull
    {

 * Unless required by applicable law or agreed to in writing, software
            OracleObjectStatus.class,
        SCHEMA,
        this.triggerType = JDBCUtils.safeGetString(dbResult, "TRIGGER_TYPE");
    {
package org.jkiss.dbeaver.ext.oracle.model;

    }
        this.actionType = "CALL".equals(JDBCUtils.safeGetString(dbResult, "ACTION_TYPE")) ? ActionType.CALL : ActionType.PLSQL;
 * You may obtain a copy of the License at
    public String getColumnName()
        TABLE,
import org.jkiss.dbeaver.model.DBPQualifiedObject;
import org.jkiss.utils.CommonUtils;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            new OracleObjectPersistAction(
            this);
    @NotNull
    public enum ActionType implements DBPNamedObject {
    {

 * DBeaver - Universal Database Manager
        return objectType;
    public BaseObjectType getObjectType()
    }
    @NotNull
    @Property(viewable = true, editable = true, order = 1)
        super(parent, JDBCUtils.safeGetString(dbResult, "TRIGGER_NAME"), true);
    @Override

        VIEW,
        return getFullyQualifiedName(DBPEvaluationContext.DDL);
        this.objectType = CommonUtils.valueOf(BaseObjectType.class, JDBCUtils.safeGetStringTrimmed(dbResult, "BASE_OBJECT_TYPE"));
    @Override
        this.columnName = JDBCUtils.safeGetString(dbResult, "COLUMN_NAME");
    }
    }
                OracleObjectType.TRIGGER,
    }
        PLSQL("PL/SQL"),
            getSchema(),
    public OracleSourceType getSourceType()

        return status;
    }


        return columnName;
import org.jkiss.code.NotNull;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException
 *
import org.jkiss.dbeaver.model.struct.rdb.DBSTrigger;

    public String toString() {
    private OracleObjectStatus status;
 */
    private String sourceDeclaration;
    }

    }
    public String getWhenClause()
    @Override
    }

    }
    public DBEPersistAction[] getCompileActions(DBRProgressMonitor monitor)
    @Property(hidden = true, editable = true, updatable = true, order = -1)
    @Property(viewable = true, order = 5)
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public OracleTrigger(

    }
    private String refNames;
 * OracleTrigger
    @Property(length = PropertyLength.MULTILINE, order = 11)
    public String getTriggerType()
        this.description = JDBCUtils.safeGetString(dbResult, "DESCRIPTION");
    public String getDescription()
    {
        }

    }
 */
        return status == OracleObjectStatus.ENABLED ? DBSObjectState.NORMAL : DBSObjectState.INVALID;
    @Override
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.DBPNamedObject;
        if (sourceDeclaration == null && monitor != null) {
    public String getName()
    public OracleObjectStatus getStatus()
        return OracleSourceType.TRIGGER;
    {
    }
}
    {

 * See the License for the specific language governing permissions and
    {

    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException
 * Licensed under the Apache License, Version 2.0 (the "License");


        }
        public String getName()

    private String description;
    {
import java.sql.ResultSet;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    }
    {
    {
        }
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
        return actionType;
import org.jkiss.dbeaver.model.struct.DBSObject;
        {

    {

import org.jkiss.dbeaver.model.exec.DBCException;
