
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            DBUtils.getQuotedIdentifier(group.getDataSource(), command.getNewName())
    @Override
            actions.add(getCommentCommand(group));
        if (com.containsKey("description")) {
    @Override
        }

    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                                          @NotNull Map<String, Object> options) {
            actionList.add(
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
        ExasolPriorityGroup group = command.getObject();

    private SQLDatabasePersistAction getCommentCommand(ExasolPriorityGroup group) {
import org.jkiss.code.NotNull;
import java.util.List;
                DBUtils.getQuotedIdentifier(group),
 * See the License for the specific language governing permissions and
        actions.add(new SQLDatabasePersistAction(ExasolMessages.manager_priority_rename, script));
public class ExasolPriorityGroupManager extends SQLObjectEditor<ExasolPriorityGroup, ExasolDataSource> implements DBEObjectRenamer<ExasolPriorityGroup> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,

        final ExasolPriorityGroup group = command.getObject();
/*
        actions.add(new SQLDatabasePersistAction(ExasolMessages.manager_priority_drop, script));
 */
            DBUtils.getQuotedIdentifier(group.getDataSource(), command.getOldName()),
        if (com.containsKey("weight")) {
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;

        return object.getDataSource().getPriorityGroupCache();
 *
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
        if (!group.getDescription().isEmpty()) {
    }
                getCommentCommand(group)
 *


            )
    @Override

        // TODO Auto-generated method stub
            String script = String.format("ALTER PRIORITY GROUP %s SET WEIGHT = %d", DBUtils.getQuotedIdentifier(group), group.getWeight());
    public DBSObjectCache<ExasolDataSource, ExasolPriorityGroup> getObjectsCache(ExasolPriorityGroup object) {
    }
import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.exasol.model.ExasolPriorityGroup;
                                          @NotNull Map<String, Object> options) {
}

 * DBeaver - Universal Database Manager
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList,
        throws DBException {

        String script = String.format(

package org.jkiss.dbeaver.ext.exasol.manager;
        );
                ExasolUtils.quoteString(group.getDescription())

    }

            String.format("COMMENT ON PRIORITY GROUP %s is '%s'",

 *
                                                       Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {

        processObjectRename(commandContext, object, options, newName);
import org.jkiss.dbeaver.model.DBPDataSource;
 * Copyright (C) 2010-2024 DBeaver Corp and others


import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
            "RENAME PRIORITY GROUP %s to %s",
                                          @NotNull Map<String, Object> options) {

                                          @NotNull ObjectChangeCommand command,
                                          @NotNull ObjectRenameCommand command,
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
                                          @NotNull ObjectDeleteCommand command,
        ExasolPriorityGroup group = command.getObject();
    }
import java.util.Map;
            );
        actions.add(new SQLDatabasePersistAction(ExasolMessages.manager_priority_create, script));
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull ExasolPriorityGroup object, @NotNull Map<String, Object> options, @NotNull String newName)

        ExasolPriorityGroup group = command.getObject();
        );
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * Copyright (C) 2019 Karl Griesser (fullref@gmail.com)
        }
        String script = String.format("CREATE PRIORITY GROUP %s WITH WEIGHT = %d", DBUtils.getQuotedIdentifier(group), group.getWeight());
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
 * Licensed under the Apache License, Version 2.0 (the "License");
            ExasolMessages.manager_priority_group_comment,
    @Override
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.ext.exasol.ExasolMessages;
 * limitations under the License.
    @Override





    }
    protected ExasolPriorityGroup createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,
        }
                                          @NotNull Map<String, Object> options) throws DBException {
    }
    }
        return new ExasolPriorityGroup((ExasolDataSource) container, "PG", null, 0);
        Map<Object, Object> com = command.getProperties();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.

        return new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 * Unless required by applicable law or agreed to in writing, software
        String script = String.format("DROP PRIORITY GROUP %s", DBUtils.getQuotedIdentifier(group));
                                          @NotNull ObjectCreateCommand command,
            actionList.add(new SQLDatabasePersistAction(ExasolMessages.manager_priority_alter, script));
    @Override
        return FEATURE_SAVE_IMMEDIATELY;
