    @Nullable
        return enabledState;
    }
        return description;
        }
        }
        return getDatabase();
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException {
            try {
    @Override
    }
                enabledState = JDBCUtils.queryString(session, "SELECT evtenabled FROM pg_catalog.pg_event_trigger WHERE oid=?", getObjectId());
    public PostgreEventTrigger(@NotNull PostgreDatabase database, String name) {
    @NotNull
        if ("D".equals(enabledState)) {

        this.objectId = JDBCUtils.safeGetLong(dbResult, "oid");

            }
package org.jkiss.dbeaver.ext.postgresql.model;
import org.jkiss.dbeaver.model.struct.DBSObject;
    public void setFunction(PostgreProcedure function) {
            ddl.append(";\n\nCOMMENT ON EVENT TRIGGER ").append(DBUtils.getQuotedIdentifier(this))

 * You may obtain a copy of the License at
        return DBSObjectState.NORMAL;
    }
        ddl_command_end,
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.body = sourceText;
 */
            } catch (SQLException e) {
    @Override
    @Override
    }
        ddl_command_start,

    @Override
        ddl.append(body); // Body is the main part of the trigger DDL. It doesn't include comments
    @Override
import org.jkiss.dbeaver.model.struct.DBSObjectState;
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
        return ddl.toString();
 *

    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;

        return getDatabase().getEventTriggersCache().refreshObject(monitor, getDatabase(), this);

    }

    @Property(viewable = true, order = 5)

import org.jkiss.dbeaver.DBException;
    }
import java.sql.SQLException;
    }
/*
    }
    @Nullable
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @Override
    private String body;
    public TriggerEventTypes getEventType() {
        this.routineId = function != null ? function.getObjectId() : 0;
    @Override
import org.jkiss.code.NotNull;
}
        return body;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override
            body = "CREATE EVENT TRIGGER " + getFullyQualifiedName(DBPEvaluationContext.DDL) + " ON " +
        return objectId;
        super(database, name, true);
        return DBUtils.getQuotedIdentifier(this);
import java.util.Map;
    public PostgreProcedure getFunction(DBRProgressMonitor monitor) throws DBException {
            return "-- Event trigger definition is not available - can't read trigger function";
    }
    }
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBPScriptObject;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    @Override
import org.jkiss.code.Nullable;
    @Override
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    @NotNull
        this.eventType = CommonUtils.valueOf(TriggerEventTypes.class, eventTypeName);
        // Event triggers belong to databases
    public void setDescription(String description) {
        String eventTypeName = JDBCUtils.safeGetString(dbResult, "evtevent");

import org.jkiss.dbeaver.model.meta.PropertyLength;
    public DBSTable getTable() {

        this.enabledState = JDBCUtils.safeGetString(dbResult, "evtenabled");
    }
            return null;
    @Property(viewable = true, order = 3)
    public void setEventType(TriggerEventTypes eventType) {
    public DBSObjectState getObjectState() {

 *
    }
        StringBuilder ddl = new StringBuilder();
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.utils.CommonUtils;
        return eventType;
 * See the License for the specific language governing permissions and
        if (!CommonUtils.isEmpty(getDescription()) && CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_COMMENTS)) {
    }
    }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Refresh triggers state")) {
        if (CommonUtils.isEmpty(body)) {
        }
    @Property(viewable = true, order = 4)

    public void setObjectDefinitionText(String sourceText) {
                .append(SQLUtils.quoteString(this, getDescription())).append(";");
    }

        this.description = JDBCUtils.safeGetString(dbResult, "description");
import org.jkiss.dbeaver.model.DBUtils;

                .append(" IS ")
        table_rewrite,
 * DBeaver - Universal Database Manager
    @Property(hidden = true, editable = true, updatable = true, order = -1)
    private String enabledState;
    @Property(viewable = true, order = 2)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;



    }
                throw new DBCException(e, session.getExecutionContext());

        return null;

    }
        return getDatabase().getProcedure(monitor, routineId);
        if (routineId == 0) {
        if (function == null) {
    public String getDescription() {
        PostgreProcedure function = getFunction(monitor);
 * you may not use this file except in compliance with the License.

 *
        }
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
    @Override
    public String getBody() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private String description;
    PostgreEventTrigger(@NotNull PostgreDatabase database, @NotNull String name, @NotNull JDBCResultSet dbResult) {
    public long getObjectId() {
import org.jkiss.dbeaver.model.sql.SQLUtils;
    @NotNull
 * limitations under the License.
        super(database, name, false);
    public enum TriggerEventTypes {
    public DBSObject getParentObject() {

    }

    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)
 * Copyright (C) 2010-2025 DBeaver Corp and others
        sql_drop
    public String getEnabledState() {
    private long routineId;
    private long objectId;
 * Unless required by applicable law or agreed to in writing, software

    @Override
        login, // It is available starting with PostgreSQL version 18

        this.eventType = eventType;
        }
                eventType + "\n\tEXECUTE " + function.getProcedureTypeName() + " " + function.getFullQualifiedSignature();
    private TriggerEventTypes eventType;
 * Licensed under the Apache License, Version 2.0 (the "License");
            return DBSObjectState.INVALID;
        this.description = description;

    @NotNull
        this.routineId = JDBCUtils.safeGetLong(dbResult, "evtfoid");
public class PostgreEventTrigger extends PostgreTriggerBase {
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.exec.DBCException;
