
        }
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
    @Override
/*
    @Override
}

import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
import org.jkiss.code.NotNull;
    }
            ));
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
    }
                "Drop event trigger",
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {

            "Rename event trigger",
            createOrReplaceTriggerQuery(monitor, executionContext, actions, command.getObject(), false);
import org.jkiss.dbeaver.model.DBPDataSource;
 * PostgreEventTriggerManager
        PostgreDataSource dataSource = command.getObject().getDataSource();
 * You may obtain a copy of the License at
    public boolean canCreateObject(@NotNull Object container) {
            "DROP EVENT TRIGGER " + DBUtils.getQuotedIdentifier(command.getObject())
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.sql.SQLUtils;
        return true;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSObject;

 *     http://www.apache.org/licenses/LICENSE-2.0

    @Override
/**
        ));
    @Override

            "ALTER EVENT TRIGGER " + DBUtils.getQuotedIdentifier(dataSource, command.getOldName()) + " RENAME TO " + DBUtils.getQuotedIdentifier(dataSource, command.getNewName())
 * See the License for the specific language governing permissions and
        actions.add(new SQLDatabasePersistAction(

    public DBSObjectCache<? extends DBSObject, PostgreEventTrigger> getObjectsCache(PostgreEventTrigger object) {
    @Override
            actions.add(new SQLDatabasePersistAction(
                    " IS " + SQLUtils.quoteString(trigger, CommonUtils.notEmpty(trigger.getDescription()))));
import org.jkiss.dbeaver.model.DBUtils;

import org.jkiss.dbeaver.ext.postgresql.model.PostgreEventTrigger;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software
        return FEATURE_EDITOR_ON_CREATE;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

 */
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.postgresql.edit;
import java.util.Map;
    }
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTriggerManager;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<PostgreEventTrigger, PropertyHandler> command, @NotNull Map<String, Object> options) {
public class PostgreEventTriggerManager extends SQLTriggerManager<PostgreEventTrigger, PostgreDatabase> implements DBEObjectRenamer<PostgreEventTrigger> {

 */
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreEventTrigger object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
                "COMMENT ON EVENT TRIGGER " + DBUtils.getQuotedIdentifier(trigger) +
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
            PostgreEventTrigger trigger = command.getObject();
        ));
    }


        actions.add(new SQLDatabasePersistAction(
    }
 *
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            actions.add(new SQLDatabasePersistAction(
        }
        return new PostgreEventTrigger((PostgreDatabase) container, "new_event_trigger");
                "Comment event trigger",
 * you may not use this file except in compliance with the License.
                "DROP EVENT TRIGGER IF EXISTS " + DBUtils.getQuotedIdentifier(trigger)
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
    }
    protected PostgreEventTrigger createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) {
    @Override
        return object.getDatabase().getEventTriggersCache();
            "Drop event trigger",

 *
        actions.add(new SQLDatabasePersistAction("Create trigger", trigger.getBody()));
    @Override
        }
        processObjectRename(commandContext, object, options, newName);
import java.util.List;
    }
        if (trigger.isPersisted()) {
        if (command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {

import org.jkiss.dbeaver.DBException;
    protected void createOrReplaceTriggerQuery(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull PostgreEventTrigger trigger, boolean create) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    }
import org.jkiss.utils.CommonUtils;
        if (command.getProperties().size() > 1 || command.getProperty(DBConstants.PROP_ID_DESCRIPTION) == null) {
    @Override
