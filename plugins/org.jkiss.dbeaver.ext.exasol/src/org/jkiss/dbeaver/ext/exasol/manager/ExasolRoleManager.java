import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        processObjectRename(commandContext, object, options, newName);
        if (command.getProperties().containsKey("description")) {
        	String script = "";
        	else if (ExasolConstants.PRIORITY_GROUP_CLASS.equals(priority.getClass().getName())) {
import org.jkiss.utils.CommonUtils;
import java.util.List;
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
                                              @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    }

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                                          @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
    @Override
    @Override
                                          @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
    }
        }
                    DBUtils.getQuotedIdentifier(obj.getDataSource(), command.getNewName()))
    }
    private SQLDatabasePersistAction Comment(ExasolRole obj) {

 */
import org.jkiss.code.NotNull;
    public void renameObject(@NotNull DBECommandContext commandContext,
                actionList.add(new SQLDatabasePersistAction(ExasolMessages.manager_assign_priority_group, script));
        if (!CommonUtils.isEmpty(obj.getDescription())) {
			} 
                                          @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
package org.jkiss.dbeaver.ext.exasol.manager;
 *


        ExasolDataSource ds = (ExasolDataSource) object.getDataSource();

    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 *
import org.jkiss.dbeaver.ext.exasol.ExasolConstants;
            actionList.add(Comment(obj));
                "Rename ROLE",
}    @Override
 * See the License for the specific language governing permissions and

    @Override

        		script = String.format("ALTER ROLE %s SET CONSUMER_GROUP = %s", DBUtils.getQuotedIdentifier(obj), DBUtils.getQuotedIdentifier(priority));
        actions.add(new SQLDatabasePersistAction("Drop Role", "DROP ROLE " + DBUtils.getQuotedIdentifier(obj)));
    }
        actions.add(new SQLDatabasePersistAction("Create Role", script));
        }
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
            actions.add(Comment(obj));
 *
    @Override

        return new SQLDatabasePersistAction("Comment on Role", "COMMENT ON ROLE " + DBUtils.getQuotedIdentifier(obj) + " IS '" + ExasolUtils.quoteString(obj.getDescription()) + "'");
        }
        ExasolRole obj = command.getObject();
import org.jkiss.dbeaver.model.DBPDataSource;
        ExasolPriority priority = obj.getPriority();
 * distributed under the License is distributed on an "AS IS" BASIS,
        return FEATURE_SAVE_IMMEDIATELY;

        	if (ExasolConstants.CONSUMER_GROUP_CLASS.equals(priority.getClass().getName())) { 

    }
    protected ExasolRole createDatabaseObject(@NotNull DBRProgressMonitor monitor,
        commandContext.addCommand(command, new RenameObjectReflector(), true);
import org.jkiss.dbeaver.DBException;
 * limitations under the License.

import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
                             @NotNull ExasolRole object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
        );
public class ExasolRoleManager extends SQLObjectEditor<ExasolRole, ExasolDataSource> implements DBEObjectRenamer<ExasolRole> {
                                       ExasolRole object, Map<String, Object> options, String newName) throws DBException {
        	}
        ExasolRole object) {
 *     http://www.apache.org/licenses/LICENSE-2.0

        ExasolRole obj = command.getObject();

    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList,
        return ds.getRoleCache();
            new SQLDatabasePersistAction(

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        return new ExasolRole((ExasolDataSource) container, "ROLE", "");
                                          @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

        String script = "CREATE ROLE " + DBUtils.getQuotedIdentifier(obj);
import org.jkiss.dbeaver.ext.exasol.model.security.ExasolRole;
import org.jkiss.dbeaver.ext.exasol.model.ExasolPriority;


    @Override
 * DBeaver - Universal Database Manager
import java.util.Map;
    }
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;



import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
    @Override
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
import org.jkiss.dbeaver.model.messages.ModelMessages;

                "RENAME ROLE " + DBUtils.getQuotedIdentifier(obj.getDataSource(), command.getOldName()) + " to " +
/*
        actions.add(
    @Override
    }
    }
        if (command.getProperties().containsKey("priority")) {
import org.jkiss.dbeaver.ext.exasol.ExasolMessages;
    {
        ObjectRenameCommand command = new ObjectRenameCommand(object, ModelMessages.model_jdbc_rename_object, options, newName);
    }
    protected void processObjectRename(DBECommandContext commandContext,
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {

        ExasolRole obj = command.getObject();
    @Override
        ExasolRole obj = command.getObject();
                actionList.add(new SQLDatabasePersistAction(ExasolMessages.manager_assign_priority_group, script));
 * you may not use this file except in compliance with the License.
        		script = String.format("GRANT PRIORITY GROUP %s to %s", DBUtils.getQuotedIdentifier(priority), DBUtils.getQuotedIdentifier(obj));

    public DBSObjectCache<ExasolDataSource, ExasolRole> getObjectsCache(
    }
