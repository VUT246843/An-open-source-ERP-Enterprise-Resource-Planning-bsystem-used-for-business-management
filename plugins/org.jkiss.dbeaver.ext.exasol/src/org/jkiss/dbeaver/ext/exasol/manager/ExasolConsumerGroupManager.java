    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
import java.util.List;
                                          @NotNull ObjectRenameCommand command,
                                          @NotNull ObjectDeleteCommand command,
    @Override
                DBUtils.getQuotedIdentifier(group),
 *
import java.util.ArrayList;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                                          @NotNull Map<String, Object> options) {
        ExasolConsumerGroup group = command.getObject();
import java.util.Map;
        processObjectRename(commandContext, object, options, newName);
        );
            script += String.format(",USER_TEMP_DB_RAM_LIMIT=%d", group.getUserRamLimit().longValue());


    }
            ExasolMessages.manager_priority_group_comment,
        actions.add(new SQLDatabasePersistAction(ExasolMessages.manager_consumer_create, script));
 * Copyright (C) 2020 Karl Griesser (fullref@gmail.com)
                                                       Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
        throws DBException {
 *

                                          @NotNull ObjectCreateCommand command,

        return new ExasolConsumerGroup(
 * limitations under the License.
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
        actions.add(new SQLDatabasePersistAction(ExasolMessages.manager_consumer_rename, script));

            DBUtils.getQuotedIdentifier(group.getDataSource(), command.getOldName()),
                                          @NotNull Map<String, Object> options) throws DBException {
    }
        return object.getDataSource().getConsumerGroupCache();
import org.jkiss.dbeaver.model.DBPDataSource;


        return FEATURE_SAVE_IMMEDIATELY;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 * Unless required by applicable law or agreed to in writing, software
            null,

    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList,
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (group.getGroupRamLimit() != null)
                    String.format("ALTER CONSUMER GROUP %s SET %s", DBUtils.getQuotedIdentifier(group), modifyPart)
        if (com.containsKey("groupRamLimit"))
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
public class ExasolConsumerGroupManager extends SQLObjectEditor<ExasolConsumerGroup, ExasolDataSource> implements DBEObjectRenamer<ExasolConsumerGroup> {
            alters.add(String.format("CPU_WEIGHT=%d", group.getCpuWeight()));
            );
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBUtils;



        final ExasolConsumerGroup group = command.getObject();
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull ExasolConsumerGroup object, @NotNull Map<String, Object> options, @NotNull String newName)
                                          @NotNull ObjectChangeCommand command,
    private SQLDatabasePersistAction getCommentCommand(ExasolConsumerGroup group) {
    @Override
        return new SQLDatabasePersistAction(
 * You may obtain a copy of the License at
    @Override
        if (com.containsKey("userRamLimit"))

import org.jkiss.dbeaver.ext.exasol.ExasolMessages;
        if (com.containsKey("description")) {

        ExasolConsumerGroup group = command.getObject();
        String script = String.format(

            "RENAME CONSUMER GROUP %s to %s",
    @Override

            )
            null,
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
            null);
                                          @NotNull Map<String, Object> options) {

 */
}
            script += String.format(",SESSION_TEMP_DB_RAM_LIMIT=%d", group.getSessionRamLimit().longValue());

import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
        ExasolConsumerGroup group = command.getObject();
    }
            null,
        String script = String.format("CREATE CONSUMER GROUP %s WITH CPU_WEIGHT = %d", DBUtils.getQuotedIdentifier(group), group.getCpuWeight());
    @Override


            script += String.format(",PRECEDENCE=%d", group.getPrecedence());
import org.jkiss.dbeaver.DBException;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        String script = String.format("DROP CONSUMER GROUP %s", DBUtils.getQuotedIdentifier(group));
        }
        if (com.containsKey("precedence"))
            actions.add(getCommentCommand(group));
        if (group.getPrecedence() != null)
import org.jkiss.code.NotNull;
        if (com.containsKey("sessionRamLimit"))
            1,
            script += String.format(",GROUP_TEMP_DB_RAM_LIMIT=%d", group.getGroupRamLimit().longValue());
                ExasolUtils.quoteString(group.getDescription())
        if (CommonUtils.isNotEmpty(group.getDescription())) {


            alters.add(String.format("PRECEDENCE=%d", group.getPrecedence()));
        if (com.containsKey("cpuWeight"))
            "PG",
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    @Override
        );
    }
    }
            String.format("COMMENT ON CONSUMER GROUP %s is '%s'",
        if (group.getUserRamLimit() != null)
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
package org.jkiss.dbeaver.ext.exasol.manager;
            );
 *
            null,
        Map<Object, Object> com = command.getProperties();
        }
    @Override
                                          @NotNull Map<String, Object> options) {
        if (alters.size() > 0) {
            alters.add(String.format("GROUP_TEMP_DB_RAM_LIMIT=%d", group.getGroupRamLimit().longValue()));
import org.jkiss.dbeaver.ext.exasol.model.ExasolConsumerGroup;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            String modifyPart = String.join(", ", alters);
            DBUtils.getQuotedIdentifier(group.getDataSource(), command.getNewName())

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.utils.CommonUtils;
        if (group.getSessionRamLimit() != null)
            actionList.add(
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
 * you may not use this file except in compliance with the License.
            alters.add(String.format("SESSION_TEMP_DB_RAM_LIMIT=%d", group.getSessionRamLimit().longValue()));
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            actionList.add(
    protected ExasolConsumerGroup createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,


import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
            alters.add(String.format("USER_TEMP_DB_RAM_LIMIT=%d", group.getUserRamLimit().longValue()));
                )

/*

        List<String> alters = new ArrayList<String>();
    }
            (ExasolDataSource) container,

    public DBSObjectCache<ExasolDataSource, ExasolConsumerGroup> getObjectsCache(ExasolConsumerGroup object) {
                new SQLDatabasePersistAction(ExasolMessages.manager_consumer_alter,
        actions.add(new SQLDatabasePersistAction(ExasolMessages.manager_consumer_drop, script));
                getCommentCommand(group)
    }
    @Override

