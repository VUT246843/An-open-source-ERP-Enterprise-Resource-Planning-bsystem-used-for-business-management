    }
    @Override

            actions.add(new SQLDatabasePersistAction(

            createOrReplaceTriggerQuery(monitor, executionContext, actions, command.getObject(), false);
    }
import org.jkiss.utils.CommonUtils;
 * See the License for the specific language governing permissions and
public class PostgreTriggerManager extends SQLTriggerManager<PostgreTrigger, PostgreTableReal> implements DBEObjectRenamer<PostgreTrigger> {
 * Unless required by applicable law or agreed to in writing, software
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
        ));
            "Rename trigger",
                "COMMENT ON TRIGGER " + DBUtils.getQuotedIdentifier(command.getObject()) + " ON " + command.getObject().getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) +
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
        return FEATURE_EDITOR_ON_CREATE;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return new PostgreTrigger((PostgreTableReal) container, "new_trigger");

        actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.DBConstants;
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreTrigger object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
    public boolean canCreateObject(@NotNull Object container) {

    @Override
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTrigger;
    @Override
import org.jkiss.dbeaver.model.sql.SQLUtils;

    @Override
}
            ));
    @Override
    }
        }
 */

import org.jkiss.code.NotNull;
        }
    @Override
    @Override
 */
                "DROP TRIGGER IF EXISTS " + DBUtils.getQuotedIdentifier(trigger) + " ON " + trigger.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL)
    {
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<PostgreTrigger, PropertyHandler> command, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 *     http://www.apache.org/licenses/LICENSE-2.0
            "ALTER TRIGGER " + DBUtils.getQuotedIdentifier(dataSource, command.getOldName()) + " ON " + trigger.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " RENAME TO " + DBUtils.getQuotedIdentifier(dataSource, command.getNewName())
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
 * You may obtain a copy of the License at
    }

 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
                "Comment trigger",
        if (command.getProperties().size() > 1 || command.getProperty(DBConstants.PROP_ID_DESCRIPTION) == null) {
                "Drop trigger",
    }
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.DBException;
    }
/**
package org.jkiss.dbeaver.ext.postgresql.edit;
            actions.add(new SQLDatabasePersistAction(

    @Override
        }
                "DROP TRIGGER " + DBUtils.getQuotedIdentifier(command.getObject()) + " ON " + command.getObject().getTable().getFullyQualifiedName(DBPEvaluationContext.DDL)
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTriggerManager;
 * DBeaver - Universal Database Manager
        PostgreDataSource dataSource = trigger.getDataSource();
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }


/*
 * PostgreTriggerManager
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * you may not use this file except in compliance with the License.
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {


import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    }

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.DBUtils;
                "Drop trigger",
    protected void createOrReplaceTriggerQuery(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull PostgreTrigger trigger, boolean create) {
import java.util.Map;
 *
        if (trigger.isPersisted()) {
    public DBSObjectCache<? extends DBSObject, PostgreTrigger> getObjectsCache(PostgreTrigger object) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        actions.add(new SQLDatabasePersistAction(
        actions.add(new SQLDatabasePersistAction("Create trigger", trigger.getBody()));
                    " IS " + SQLUtils.quoteString(command.getObject(), CommonUtils.notEmpty(command.getObject().getDescription()))));
        return object.getParentObject().getTriggerCache();
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected PostgreTrigger createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException
        return true;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableReal;
        if (command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {
    @Override


    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
        PostgreTrigger trigger = command.getObject();
        ));
import java.util.List;
        processObjectRename(commandContext, object, options, newName);
