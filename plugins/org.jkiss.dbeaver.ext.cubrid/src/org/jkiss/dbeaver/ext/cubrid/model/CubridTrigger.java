            ddl.append("\nEXECUTE ");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    @NotNull
 * limitations under the License.
    public boolean getActive() {
        for (GenericTableColumn col : container.getAttributes(monitor)) {
            @NotNull String name,
    }
import java.util.Map;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        }
        return active;
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.DBException;
    @Property(viewable = true, order = 4)
            }
    @Override
        @Override
        public Object[] getPossibleValues(CubridTrigger object) {
        this.owner = JDBCUtils.safeGetString(dbResult, "owner.name");
    @Property(viewable = true, editable = true, listProvider = EventOptionListProvider.class, order = 30)
            else {
        return condition;
    public CubridUser getOwner() {
    }
    @NotNull
import org.jkiss.dbeaver.model.sql.SQLUtils;
            ddl.append("\nPRIORITY ").append(getPriority());
    public void setActionTime(String actionTime) {
        this.actionTime = actionTimes.get(JDBCUtils.safeGetInteger(dbResult, "action_time"));
            return false;
import org.jkiss.code.Nullable;
 * See the License for the specific language governing permissions and
            } else if (getActionType().equals("PRINT")) {
    @Override
    }
    public static class ActionTypeListProvider implements IPropertyValueListProvider<CubridTrigger> {
    @Nullable


        public boolean allowCustomValue() {
            ddl.append("CREATE TRIGGER ");
                ddl.append("\nCOMMENT ").append(SQLUtils.quoteString(getDataSource(), getDescription()));
        }
            return DBUtils.getFullQualifiedName(getDataSource(), this);
        this.priority = JDBCUtils.safeGetDouble(dbResult, "priority");

        this.priority = priority;

        if (persisted) {
/*

        return targetColumn;
        @Override
    public static class ColumnNameListProvider implements IPropertyValueListProvider<CubridTrigger> {
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (getTable().getDataSource().getSupportMultiSchema()) {
            StringBuilder ddl = new StringBuilder();
    }
            return false;
        this.actionDefinition = actionDefinition;
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
        }



                ddl.append(getActionType());
    @Property(viewable = true, editable = true, order = 40)
        public boolean allowCustomValue() {
    private boolean active;
public class CubridTrigger extends GenericTableTrigger {
            if (getEvent().equals("COMMIT") || getEvent().equals("ROLLBACK")) {


import java.util.ArrayList;
    }
    public String getTargetColumn() {
        this.event = "UPDATE";
        }
                if (getCondition() != null) {
            }
    }
        public Object[] getPossibleValues(CubridTrigger object) {
    @NotNull
        this.targetColumn = targetColumn;
                ddl.append(getEvent());
    public void setActionType(String actionType) {
                    ddl.append("(" + DBUtils.getQuotedIdentifier(getDataSource(), getTargetColumn()) + ")");
    public String getDescription() {
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            @NotNull GenericTableBase container,

    @Property(viewable = true, order = 2)


    public void setActive(boolean active) {
        this.active = true;
    private String owner;
    }
            @Nullable String description,
        return "-- Trigger definition not available";
        this.actionDefinition = JDBCUtils.safeGetString(dbResult, "action_definition");
        super(container, name, description);
            @NotNull JDBCResultSet dbResult) {
    @Property(viewable = true, editable = true, listProvider = ActionTimeListProvider.class, order = 20)

    @NotNull

 * DBeaver - Universal Database Manager
            @NotNull GenericTableBase container,
    private String condition;

import org.jkiss.code.NotNull;
    public void setDescription(String description) {
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)
            return CubridConstants.EVENT_OPTION;
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
 *
 */

            ddl.append(getFullyQualifiedName(DBPEvaluationContext.DDL));
        @Nullable
    public Double getPriority() {
        }
            return object.columnList.toArray();
import java.util.List;
        this.owner = container.getSchema().getName();
    @Property(viewable = true, editable = true, updatable = true, order = 10)
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        @Override
    public String getActionType() {

            }
        this.actionType = actionTypes.get(JDBCUtils.safeGetInteger(dbResult, "action_type"));
        return actionDefinition;
    @Override
        } else {
    public String getActionTime() {

        return super.getDescription();

    }
    private Map<Integer, String> actionTypes = Map.of(1, "OTHER STATEMENT", 2, "REJECT", 3, "INVALIDATE TRANSACTION", 4, "PRINT");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

            return ddl.toString();
        }
            if (getDescription() != null && !getDescription().isEmpty()) {
        this.condition = JDBCUtils.safeGetString(dbResult, "condition");
            return false;
    }

            return DBUtils.getQuotedIdentifier(getTable().getSchema()) + "." + DBUtils.getFullQualifiedName(getDataSource(), this);
        this.event = events.get(JDBCUtils.safeGetInteger(dbResult, "event"));
    }
        return (CubridTable) super.getTable();
                ddl.append(getActionType() + " ");
        @Override
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
        return actionType;
    @Nullable
            ddl.append(" ");
        public boolean allowCustomValue() {

        this.priority = 0.0;
                ddl.append(getEvent());
    private Map<Integer, String> events = Map.of(0, "UPDATE", 1, "UPDATE STATEMENT", 2, "DELETE", 3, "DELETE STATEMENT", 4, "INSERT", 5, "INSERT STATEMENT", 8, "COMMIT", 9, "ROLLBACK");
    private String event;
                if (getEvent().contains("UPDATE") && getTargetColumn() != null) {
            return CubridConstants.ACTION_TYPE_OPTION;
        return persisted;
    }
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
    private String targetColumn;
    public void setActionDefinition(String actionDefinition) {
        this.active = JDBCUtils.safeGetInteger(dbResult, "status").equals(2);
        public Object[] getPossibleValues(CubridTrigger object) {
    public void setPriority(Double priority) {
    List<String> columnList = new ArrayList<>();
    @NotNull

        this.persisted = false;
    public boolean isPersisted() {
 *     http://www.apache.org/licenses/LICENSE-2.0
                ddl.append(" ON ").append(getTable().getFullyQualifiedName(DBPEvaluationContext.DDL));
            @NotNull String name,
        super.setDescription(description);
        @Nullable
    @Property(viewable = true, editable = true, updatable = true, order = 6)
    private Map<Integer, String> actionTimes = Map.of(1, "BEFORE", 2, "AFTER", 3, "DEFERRED");
    }
                }
    private String actionType;
    private double priority;
    }
            DBRProgressMonitor monitor) throws DBException {
        this.active = active;
    private boolean persisted;
        this.persisted = true;
    }
        @Override
    public static class EventOptionListProvider implements IPropertyValueListProvider<CubridTrigger> {
        @Override

    }
    }
        @Nullable
 *
import org.jkiss.dbeaver.model.meta.Property;


import org.jkiss.dbeaver.model.DBUtils;

package org.jkiss.dbeaver.ext.cubrid.model;

        this.targetColumn = JDBCUtils.safeGetString(dbResult, "target_attribute");
    public void setEvent(String event) {
        this.condition = condition;
    private String actionDefinition;
                ddl.append(getActionDefinition() == null ? "" : actionDefinition);

    }
            return false;
        @Override
    public CubridTable getTable() {
    }
    public CubridTrigger(
            return CubridConstants.ACTION_TIME_OPTION;
    @Override
    public void setTargetColumn(String targetColumn) {
        this.event = event;
    public static class ActionTimeListProvider implements IPropertyValueListProvider<CubridTrigger> {
    }


            ddl.append("\n" + getActionTime());
        super(container, name, null);

import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;

        }
                }
import org.jkiss.dbeaver.model.meta.PropertyLength;
        @Nullable
            columnList.add(col.getName());
        this.actionType = "OTHER STATEMENT";
        @Override

            if (getActionType().equals("REJECT") || getActionType().equals("INVALIDATE TRANSACTION")) {
        this.actionType = actionType;
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
    }
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericTableTrigger;

    @Property(viewable = true, editable = true, listProvider = ColumnNameListProvider.class, order = 5)
 *
    public String getActionDefinition() {
        this.actionTime = actionTime;

        }
        }
        }


        return priority;


            ddl.append(getActive() ? "\nSTATUS ACTIVE" : "\nSTATUS INACTIVE");
        return actionTime;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true, editable = true, listProvider = ActionTypeListProvider.class, order = 50)
}
        public boolean allowCustomValue() {
    }
        return new CubridUser(getTable().getDataSource(), owner, null);
    }
    public String getEvent() {
    @Override
    @NotNull
    public void setCondition(String condition) {
    public String getCondition() {
    @NotNull
    }
    @Property(viewable = true, editable = true, order = 60)
        this.actionTime = "BEFORE";
                ddl.append(getActionDefinition() == null ? "" : SQLUtils.quoteString(getDataSource(), actionDefinition));
    @NotNull
        public Object[] getPossibleValues(CubridTrigger object) {
    }

            }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
            } else {
                    ddl.append("\nIF ").append(getCondition());
    private String actionTime;
    @NotNull
        return event;
    public CubridTrigger(
        }
    }
