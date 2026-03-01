        } else {
    ) {
    protected CubridTrigger createDatabaseObject(

    protected void addObjectRenameActions(
 * limitations under the License.
        @NotNull DBECommandContext commandContext,
    ) throws DBException {
    }
            "Rename Trigger",
    ) {
import org.jkiss.dbeaver.model.DBUtils;
        CubridTable table = (CubridTable) container;
        Object copyFrom,
import org.jkiss.utils.CommonUtils;
import java.util.List;
            actionList.add(new SQLDatabasePersistAction(
        actions.add(new SQLDatabasePersistAction(
        return !((CubridDataSource) object.getDataSource()).isShard();
    @Override
        }
            sb.append(trigger.getActionType());
        boolean isShard = table.getDataSource().isShard();
        actions.add(new SQLDatabasePersistAction("Create Trigger", sb.toString()));
        sb.append(trigger.getActive() ? "\nSTATUS ACTIVE" : "\nSTATUS INACTIVE");
import org.jkiss.dbeaver.ext.cubrid.model.CubridDataSource;
    @Override
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull List<DBEPersistAction> actions,
        }
public class CubridTriggerManager extends GenericTriggerManager<CubridTrigger> implements DBEObjectRenamer<CubridTrigger> {

        @NotNull DBCExecutionContext executionContext,
 *
            ));
        }

    public boolean canDeleteObject(CubridTrigger object) {
    @Override

        sb.append("CREATE TRIGGER ").append(trigger.getFullyQualifiedName(DBPEvaluationContext.DDL));
            actionList.add(new SQLDatabasePersistAction(
import java.util.Map;
                    "Change Owner",
        return !((CubridDataSource) object.getDataSource()).isShard();
    }

import org.jkiss.dbeaver.ext.generic.edit.GenericTriggerManager;
 * Unless required by applicable law or agreed to in writing, software
                + SQLUtils.quoteString(trigger, CommonUtils.notEmpty(trigger.getDescription()))
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        String schemaName = isSupportMultiSchema ? DBUtils.getQuotedIdentifier(trigger.getOwner()) + "." : "";
        createTrigger(trigger, sb);
import org.jkiss.dbeaver.DBException;
        if (trigger.getEvent().equals("COMMIT") || trigger.getEvent().equals("ROLLBACK")) {
            "RENAME TRIGGER " + schemaName + DBUtils.getQuotedIdentifier(trigger.getDataSource(), command.getOldName())
}
            ));
        return new CubridTrigger((GenericTableBase) container, BASE_TRIGGER_NAME, monitor);
 * you may not use this file except in compliance with the License.
        if (trigger.getActionType().equals("REJECT") || trigger.getActionType().equals("INVALIDATE TRANSACTION")) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        } else if (trigger.getActionType().equals("PRINT")) {
        @NotNull ObjectChangeCommand command,
                sb.append("\nIF ").append(trigger.getCondition());
                    + DBUtils.getQuotedIdentifier(trigger.getOwner())));
            }
        return !isShard && container instanceof GenericTableBase;
 */
            }
        boolean isSupportMultiSchema = ((CubridDataSource) trigger.getDataSource()).getSupportMultiSchema();
            sb.append(trigger.getActionDefinition() == null ? "" : SQLUtils.quoteString(trigger, trigger.getActionDefinition()));
            ));
        @NotNull DBRProgressMonitor monitor,
        } else {
        if (trigger.getDescription() != null) {
        @NotNull DBCExecutionContext executionContext,
    @Override
                + (trigger.getActive() ? "ACTIVE" : "INACTIVE")

    }
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
        CubridTrigger trigger = command.getObject();
        @NotNull DBECommandContext context,
    }
/*

        @NotNull DBCExecutionContext executionContext,


    }
        sb.append("\nPRIORITY ").append(trigger.getPriority());
    public void renameObject(
        }
 *
 * See the License for the specific language governing permissions and
        if (command.hasProperty("active")) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.ext.cubrid.model.CubridTable;
        @NotNull String newName
        @NotNull Map<String, Object> options
 * DBeaver - Universal Database Manager
    ) {
        if (command.hasProperty("priority")) {
        }
        processObjectRename(commandContext, object, options, newName);
        CubridTrigger trigger = (CubridTrigger) command.getObject();
            sb.append(trigger.getActionType()).append(" ");
            actions.add(new SQLDatabasePersistAction(
        String triggerName = trigger.getFullyQualifiedName(DBPEvaluationContext.DDL);
        @NotNull ObjectCreateCommand command,
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                "ALTER TRIGGER " + triggerName + " PRIORITY " + trigger.getPriority()
    public boolean canCreateObject(@NotNull Object container) {
        @NotNull Map<String, Object> options

        StringBuilder sb = new StringBuilder();
        @NotNull DBRProgressMonitor monitor,
        }
        @NotNull Map<String, Object> options
            sb.append(trigger.getEvent());
    @Override
                "ALTER TRIGGER " + triggerName + " COMMENT "
        @NotNull Map<String, Object> options,
        @NotNull ObjectRenameCommand command,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    protected void addObjectModifyActions(
            actionList.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            if (trigger.getEvent().contains("UPDATE") && trigger.getTargetColumn() != null) {
            + " AS " + schemaName + DBUtils.getQuotedIdentifier(trigger.getDataSource(), command.getNewName())
            sb.append(trigger.getActionDefinition() == null ? "" : trigger.getActionDefinition());
 *

        CubridTrigger trigger = command.getObject();
        Object container,
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (!dataSource.getSupportMultiSchema() && !trigger.getOwner().getName().equalsIgnoreCase(dataSource.getCurrentUser())) {
        sb.append("\n").append(trigger.getActionTime()).append(" ");
import org.jkiss.dbeaver.ext.cubrid.model.CubridTrigger;
        @NotNull DBRProgressMonitor monitor,
    ) throws DBException {
            if (trigger.getCondition() != null) {
    protected void addObjectCreateActions(
 * Copyright (C) 2010-2025 DBeaver Corp and others

        if (command.hasProperty("description")) {
    public void createTrigger(CubridTrigger trigger, StringBuilder sb) {
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.sql.SQLUtils;
    @Override
                sb.append("(" + DBUtils.getQuotedIdentifier(trigger.getDataSource(), trigger.getTargetColumn()) + ")");
    public static final String BASE_TRIGGER_NAME = "new_trigger";
                    "ALTER TRIGGER " + DBUtils.getQuotedIdentifier(trigger.getDataSource(), trigger.getName()) + " OWNER TO "


 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
import org.jkiss.code.NotNull;
        @NotNull CubridTrigger object,
            sb.append("\nCOMMENT ").append(SQLUtils.quoteString(trigger, trigger.getDescription()));
            sb.append(" ON ").append(trigger.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL));
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
                "ALTER TRIGGER " + triggerName + " STATUS "
    }
    @Override
        @NotNull List<DBEPersistAction> actions,
    public boolean canEditObject(CubridTrigger object) {
        sb.append("\nEXECUTE ");
            sb.append(trigger.getEvent());
package org.jkiss.dbeaver.ext.cubrid.edit;
    }
        CubridDataSource dataSource = (CubridDataSource) trigger.getDataSource();
        ));
        @NotNull Map<String, Object> options

        @NotNull List<DBEPersistAction> actionList,
