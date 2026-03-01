    ) throws DBException {
        if (command.hasProperty("using")) {
        Object copyFrom,
        processObjectRename(commandContext, object, options, newName);
    @Override
        return FEATURE_EDITOR_ON_CREATE;
        Object container,
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override



    extends SQLObjectEditor<PostgreTablePolicy, PostgreTable>
 * Unless required by applicable law or agreed to in writing, software
        @NotNull Map<String, Object> options,
            sql.append("\n\tTO ");
            DBUtils.makeNewObjectName(monitor, "Policy{0}", table, PostgreTablePolicy.class, PostgreTable::getPolicy, context)
    public DBSObjectCache<? extends DBSObject, PostgreTablePolicy> getObjectsCache(PostgreTablePolicy object) {
        @NotNull DBECommandContext commandContext,
        @NotNull DBRProgressMonitor monitor,
 * you may not use this file except in compliance with the License.
        @NotNull DBRProgressMonitor monitor,
    ) throws DBException {
 *
    @Override
    public void renameObject(
        PostgreTablePolicy policy = command.getObject();

    implements DBEObjectRenamer<PostgreTablePolicy> {

        final PostgreTable table = (PostgreTable) container;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 *
            + DBUtils.getObjectFullName(policy.getParentObject(), DBPEvaluationContext.DDL);
        return DBUtils.getQuotedIdentifier(dataSource, policy.getName())

        @NotNull DBRProgressMonitor monitor,
package org.jkiss.dbeaver.ext.postgresql.edit;
        actions.add(new SQLDatabasePersistAction(
    private static String getNameClause(@NotNull PostgreTablePolicy policy) {
        @NotNull DBCExecutionContext executionContext,
        }
        StringBuilder sql = new StringBuilder();
        @NotNull List<DBEPersistAction> actions,
        final DBPDataSource dataSource = policy.getDataSource();
            + " ON "
 * distributed under the License is distributed on an "AS IS" BASIS,
        ));
    }

        return object.getParentObject().getPolicyCache();
        @NotNull List<DBEPersistAction> actions,
        String sql = command.getObject().getObjectDefinitionText(monitor, options);
 * Licensed under the Apache License, Version 2.0 (the "License");
            "Rename policy",
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            sql.append("\n\tWITH CHECK (").append(policy.getCheck()).append(")");
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
        @NotNull Map<String, Object> options
    ) throws DBException {
        if (command.hasProperty("check")) {
        final DBPDataSource dataSource = command.getObject().getDataSource();
        ));
                + " RENAME TO " + DBUtils.getQuotedIdentifier(dataSource, command.getNewName())
/*
        @NotNull PostgreTablePolicy object,
            "Alter policy",
 * See the License for the specific language governing permissions and
    }
    @NotNull
 * DBeaver - Universal Database Manager
    @Override
import org.jkiss.dbeaver.DBException;
        @NotNull DBCExecutionContext executionContext,

import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
                sql.append("PUBLIC");
        @NotNull DBRProgressMonitor monitor,
                + DBUtils.getQuotedIdentifier(dataSource, command.getObject().getParentObject().getName())
            } else {
 *     http://www.apache.org/licenses/LICENSE-2.0
                + DBUtils.getQuotedIdentifier(dataSource, command.getOldName())

        @NotNull Map<String, Object> options

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.DBUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class PostgreTablePolicyManager
    @Override
    }
        }
        @NotNull ObjectRenameCommand command,
    }
    }
        @NotNull Map<String, Object> options
    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
        @NotNull DBCExecutionContext executionContext,
        @NotNull List<DBEPersistAction> actions,
        ));
 * You may obtain a copy of the License at

            "Drop policy",
                sql.append(roles.stream().map(DBUtils::getQuotedIdentifier).collect(Collectors.joining(",")));
            "ALTER POLICY "
    @Override
        @NotNull ObjectCreateCommand command,
        @NotNull DBECommandContext context,

        }
            sql
            if (!roles.isEmpty()) {
        actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTablePolicy;
    ) throws DBException {


    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
    ) throws DBException {
        actions.add(new SQLDatabasePersistAction(
        return new PostgreTablePolicy(
import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;
import org.jkiss.code.Nullable;
    protected void addObjectDeleteActions(
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            List<PostgreRole> roles = policy.getRoles();
    protected void addObjectModifyActions(
 */
}
    @Nullable
            "DROP POLICY " + getNameClause(command.getObject())

        {
                + " ON "
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTable;
        @NotNull ObjectChangeCommand command,
            sql.append("\n\tUSING (").append(policy.getUsing()).append(")");
        @NotNull String newName
        @NotNull Map<String, Object> options
        @NotNull ObjectDeleteCommand command,
    ) {
    }
import java.util.stream.Collectors;
import org.jkiss.code.NotNull;

    @Override
import java.util.List;
import org.jkiss.dbeaver.model.DBPDataSource;
    protected PostgreTablePolicy createDatabaseObject(
        sql.append("ALTER POLICY ").append(getNameClause(policy));
        @NotNull Map<String, Object> options
    protected void addObjectRenameActions(
            }
        ));
import java.util.Map;


        @NotNull DBCExecutionContext executionContext,
 *
        );
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            table,
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * limitations under the License.
            "Create policy",
    }
    protected void addObjectCreateActions(
            sql.toString()
        @NotNull List<DBEPersistAction> actions,
