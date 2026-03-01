        } else {
            this.functionId = function.getObjectId();
    }


        return table.getDataSource();
            this.functionSchemaId = 0;
    public DBSManipulationType[] getManipulationTypes() {
    public String toString() {
        StringBuilder ddl = new StringBuilder();
    }

            ddl.append(";\n\nCOMMENT ON TRIGGER ").append(DBUtils.getQuotedIdentifier(this))

    @Property(viewable = true, order = 1)
    private DBSManipulationType[] manipulationTypes;
                body = "CREATE TRIGGER " + DBUtils.getQuotedIdentifier(this)
                    if (body != null) {
        super(table.getDatabase(), triggerName, true);

        } else{
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (!CommonUtils.isEmpty(getDescription()) && CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_COMMENTS)) {
        }
    @NotNull
    }
    @Nullable
                    columnRefs[i] = attr;
            type = PostgreTriggerType.STATEMENT;
                StringBuilder sb = new StringBuilder();
    }
    private static final int TRIGGER_TYPE_BEFORE     = (1 << 1);
            if (isPersisted()) {

 */
import org.jkiss.code.NotNull;
    }
    }
    @Override
    private long functionSchemaId;
        }
    @Property(viewable = true, order = 11)
    private static final int TRIGGER_TYPE_UPDATE     = (1 << 4);
    @Override
            actionTiming = DBSActionTiming.INSTEAD;
        if (CommonUtils.isBitSet(tgType, TRIGGER_TYPE_DELETE)) {
import org.jkiss.utils.CommonUtils;
 * DBeaver - Universal Database Manager
        }
 */

        return enabledState;
            return null;
    @Override
    private PostgreTriggerType type;
            this.functionId = 0;
                    if (sb.length() > 0) sb.append(", ");

        if (function == null){
    public String getEnabledState() {
    }
            type = PostgreTriggerType.ROW;
 * limitations under the License.
        this.manipulationTypes = mt.toArray(new DBSManipulationType[0]);
            int[] attrNumbers = PostgreUtils.getIntVector(attrNumbersObject, getDataSource());
        @Nullable
    @Property(hidden = true, editable = true, updatable = true, order = -1)
import org.jkiss.dbeaver.model.struct.DBSObject;
        PostgreTableReal.TriggerCache triggerCache = getParentObject().getTriggerCache();
                .append(" ON ").append(getTable().getFullyQualifiedName(DBPEvaluationContext.DDL))
        // Parse trigger type bits
    }
}
        }
import org.jkiss.dbeaver.model.meta.IPropertyValueTransformer;
        this.whenExpression = JDBCUtils.safeGetString(dbResult, "tgqual");
    public String getWhenExpression()
                this);

import org.jkiss.dbeaver.model.struct.DBSObjectState;
            if (value instanceof PostgreTableColumn[]) {
    private static final Log log = Log.getLog(PostgreTrigger.class);

    private long objectId;
        // Get procedure
        return DBSObjectState.NORMAL;
            return triggerCache.refreshObject(monitor, getParentObject(), this);
import org.jkiss.dbeaver.model.meta.Property;

    }
                return sb.toString();
    }
    @Property(viewable = true, order = 10)
        return table;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private DBSActionTiming actionTiming;
    @Override
        }
    }
    public void setDescription(String description) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Refresh triggers state")) {
                    if (attr == null) {
        return ddl.toString();
        return null;
 * Unless required by applicable law or agreed to in writing, software
    @Override
            actionTiming = DBSActionTiming.AFTER;
    }
    @NotNull
import org.jkiss.dbeaver.Log;
    @Override
                        log.warn("Bad trigger attribute ref index: " + colNumber);
                throw new DBCException(e, session.getExecutionContext());
    protected String description;
        return type;


                    + "\n    EXECUTE PROCEDURE " + getFunction(monitor).getFullyQualifiedName(DBPEvaluationContext.DDL) + "();\n";
import org.jkiss.dbeaver.model.struct.DBSEntityElement;
        } else if (CommonUtils.isBitSet(tgType, TRIGGER_TYPE_INSTEAD)) {
        this.functionSchemaId = JDBCUtils.safeGetLong(dbResult, "func_schema_id");
    public static class ColumnNameTransformer implements IPropertyValueTransformer {


        }
        return name;
        super(parent.getDatabase(), name, false);
import org.jkiss.dbeaver.DBDatabaseException;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
import java.util.ArrayList;
                enabledState = JDBCUtils.queryString(session, "SELECT tgenabled FROM pg_catalog.pg_trigger WHERE oid=?", getObjectId());
                .append(SQLUtils.quoteString(this, getDescription())).append(";");
    }
        @NotNull String triggerName,
            mt.add(DBSManipulationType.DELETE);
            this.functionSchemaId = function.getSchema().getObjectId();
                int attrCount = attrNumbers.length;
                for (int i = 0; i < attrCount; i++) {
    @Override

import org.jkiss.dbeaver.model.DBUtils;

            return DBSObjectState.INVALID;
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)

    {


    public void setObjectDefinitionText(String sourceText) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.name = name;

 *
        }
        return manipulationTypes;
    @Override
        }
/*
    @Property(viewable = true, order = 3)

    @Override
            try {
import org.jkiss.dbeaver.model.meta.PropertyLength;

        @NotNull ResultSet dbResult) throws DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            if (attrNumbers != null) {

    @Override
        }
    private long functionId;
            mt.add(DBSManipulationType.INSERT);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull DBRProgressMonitor monitor,
        return table;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        List<DBSManipulationType> mt = new ArrayList<>(1);
    public DBSActionTiming getActionTiming() {
        return getDatabase().getProcedure(monitor, functionSchemaId, functionId);
    @Property(viewable = true, order = 6)

    @Property(viewable = true, order = 12)
import org.jkiss.dbeaver.model.struct.rdb.DBSManipulationType;
import java.sql.SQLException;
        if ("D".equals(enabledState)) {
        return whenExpression;
    @Override
    private String enabledState;
import org.jkiss.dbeaver.model.exec.DBCException;
                }
    @NotNull
    }
    /* Bits within tgtype */

        this.description = description;
    }
            }
            mt.add(DBSManipulationType.TRUNCATE);
 * Copyright (C) 2010-2025 DBeaver Corp and others
            actionTiming = DBSActionTiming.BEFORE;
    @Property(viewable = true, order = 5, valueRenderer = ColumnNameTransformer.class)
        if (functionId == 0) {
    @Property(viewable = true, order = 4)
    }
import org.jkiss.dbeaver.model.sql.SQLUtils;
        return table.getDatabase();
    }
                    throw new DBDatabaseException(e, getDataSource());
                try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read trigger definition")) {
    @NotNull
        return description;
    }


        return actionTiming;

import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        this.functionId = JDBCUtils.safeGetLong(dbResult, "tgfoid");
        }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    {

/**
                    }
    public String getDescription() {
    }
    }
    private static final int TRIGGER_TYPE_INSERT     = (1 << 2);
        }
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.DBPScriptObject;

    private PostgreTableReal table;

 * PostgreTrigger
package org.jkiss.dbeaver.ext.postgresql.model;
        return getFullyQualifiedName(DBPEvaluationContext.UI);
        this.name = name;
    public PostgreTableReal getParentObject()
 *

    private static final int TRIGGER_TYPE_INSTEAD    = (1 << 6);
                for (PostgreTableColumn col : (PostgreTableColumn[])value) {
 * You may obtain a copy of the License at
        if (CommonUtils.isBitSet(tgType, TRIGGER_TYPE_TRUNCATE)) {
                    int colNumber = attrNumbers[i];
        this.enabledState = JDBCUtils.safeGetString(dbResult, "tgenabled");
        return body;
    @NotNull
        if (CommonUtils.isBitSet(tgType, TRIGGER_TYPE_BEFORE)) {
    private static final int TRIGGER_TYPE_TRUNCATE   = (1 << 5);
        } else {

    @Property(viewable = true, order = 2)
        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public PostgreDataSource getDataSource()
            }
                    final PostgreTableColumn attr = PostgreUtils.getAttributeByNum(getTable().getAttributes(monitor), colNumber);
{
    @Override
                }
import org.jkiss.dbeaver.model.sql.format.SQLFormatUtils;
                    sb.append(col.getName());
    }
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;
    public void setName(@NotNull String name) {
                columnRefs = new PostgreTableColumn[attrCount];

    public PostgreDatabase getDatabase() {

import java.util.Map;
        if (triggerCache != null) {
        this.table = table;
 *
    private static final int TRIGGER_TYPE_DELETE     = (1 << 3);
                    + "\n    ON " + table.getFullyQualifiedName(DBPEvaluationContext.DDL)
            } catch (SQLException e) {
        public Object transform(@NotNull Object object, @Nullable Object value) throws IllegalArgumentException {
        }
    private String whenExpression;
        this.objectId = JDBCUtils.safeGetLong(dbResult, "oid");
import java.util.List;
        Object attrNumbersObject = JDBCUtils.safeGetObject(dbResult, "tgattr");
import org.jkiss.dbeaver.DBException;
                    + "\n    FOR EACH ROW"

        return DBUtils.getFullQualifiedName(getDataSource(),
    public DBSObjectState getObjectState() {
                    body = JDBCUtils.queryString(session, "SELECT pg_catalog.pg_get_triggerdef(?)", objectId);
    @NotNull

    @Nullable
        return columnRefs;
                        continue;
        if (CommonUtils.isBitSet(tgType, TRIGGER_TYPE_ROW)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        int tgType = JDBCUtils.safeGetInt(dbResult, "tgtype");
            return value;

    public PostgreTriggerType getType() {
    @Override
import java.sql.ResultSet;
    @NotNull
    }
        this.description = JDBCUtils.safeGetString(dbResult, "description");
        @NotNull PostgreTableReal table,
        return objectId;
    private String body;
        this.body = sourceText;
        }
            mt.add(DBSManipulationType.UPDATE);
        if (attrNumbersObject != null) {
    public long getObjectId() {
        if (CommonUtils.isBitSet(tgType, TRIGGER_TYPE_INSERT)) {

    @Override
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException {
    public PostgreTableBase getTable()
    public PostgreProcedure getFunction(DBRProgressMonitor monitor) throws DBException {
            } else {
    public String getName() {

        ddl.append(body);
    public PostgreTrigger(
    }
                .append(" IS ")
    private static final int TRIGGER_TYPE_ROW        = (1 << 0);
    }
import org.jkiss.dbeaver.model.struct.DBSActionTiming;
public class PostgreTrigger extends PostgreTriggerBase implements DBSEntityElement
                    + "\n    AFTER INSERT"
    }
    }
    public void setFunction(PostgreProcedure function) {
    private PostgreTableColumn[] columnRefs;
                } catch (SQLException e) {
    public PostgreTrigger(@NotNull PostgreTableReal parent, @NotNull String name) {
    {
    }
        @Override
        if (CommonUtils.isBitSet(tgType, TRIGGER_TYPE_UPDATE)) {
                getParentObject(),
        if (CommonUtils.isEmpty(body)) {
    public String getBody() {
                        body = SQLFormatUtils.formatSQL(getDataSource(), body);
            }
                    }
        this.table = parent;
                }
    public PostgreTableColumn[] getColumnRefs() {
        }
    }
    {

 * See the License for the specific language governing permissions and
