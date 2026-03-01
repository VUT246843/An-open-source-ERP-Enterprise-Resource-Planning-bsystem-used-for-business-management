}
        if (create && !CommonUtils.isEmpty(role.getPassword())) {
            new SQLDatabasePersistAction("Drop role", "DROP ROLE " + DBUtils.getQuotedIdentifier(command.getObject())) //$NON-NLS-2$
import org.jkiss.dbeaver.model.DBConstants;
            final StringBuilder script = new StringBuilder("ALTER ROLE " + DBUtils.getQuotedIdentifier(role));

            PostgreRole role = command.getObject();
    }
 * Unless required by applicable law or agreed to in writing, software
        @NotNull DBCExecutionContext executionContext,
    protected void addObjectExtraActions(
 * See the License for the specific language governing permissions and

    private void addRoleOptions(StringBuilder script, PostgreRole role, NestedObjectCommand command, boolean create) {
        if (extension.supportsRolesWithCreateDBAbility()) {
        }
            options.append(" VALID UNTIL ").append(SQLUtils.quoteString(role, TIMESTAMP_FORMATTER.format(role.getValidUntil())));
 *
    @Nullable

import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at
    }
import org.jkiss.dbeaver.DBException;
            new SQLDatabasePersistAction("Create role", script.toString()) //$NON-NLS-2$
            );
        actions.add(new SQLDatabasePersistAction(
            command.setDisableSessionLogging(true); // Hide password from Query Manager
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
            }

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
/**
        if (role.getValidUntil() != null) {
        return FEATURE_EDITOR_ON_CREATE;

        }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
public class PostgreRoleManager extends SQLObjectEditor<PostgreRole, PostgreDataSource> implements DBEObjectRenamer<PostgreRole> {
        script.append(options);
        if (role.isCreateRole()) options.append(" CREATEROLE"); else options.append(" NOCREATEROLE");
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
 * PostgreRoleManager
        addRoleOptions(script, role, command, true);
    @Override

    }
    {

    @Override
        @NotNull DBRProgressMonitor monitor,
    @Override
            if (role.isReplication()) {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;

                "COMMENT ON ROLE " + DBUtils.getQuotedIdentifier(role.getDataSource(), role.getName()) +
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
import java.util.List;
    private static final DateTimeFormatter TIMESTAMP_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            } else {
    }
            // A password is only of use for roles having the LOGIN attribute, but you can nonetheless define one for roles without it
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
        }
            }
        if (!command.hasProperty(DBConstants.PROP_ID_DESCRIPTION) || command.getProperties().size() > 1) {
    protected PostgreRole createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
        return new PostgreRole((PostgreDatabase) container, "NewRole", "", true);
                options.append(" NOBYPASSRLS");

        );

 */
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
            if (role.isSuperUser()) options.append(" SUPERUSER"); else options.append(" NOSUPERUSER");
        return null;
        if (extension.supportsInheritance()) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                "Comment role",
        @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.DBUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (extension.supportsSuperusers()) {
            if (role.isInherit()) options.append(" INHERIT"); else options.append(" NOINHERIT");
 */
        }
            "ALTER ROLE " + DBUtils.getQuotedIdentifier(dataSource, command.getOldName()) + " RENAME TO " + DBUtils.getQuotedIdentifier(dataSource, command.getNewName())
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
/*
import org.jkiss.utils.CommonUtils;
    }
        if (command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {

    @Override
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreRole object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
            } else {
import org.jkiss.dbeaver.model.edit.DBECommandContext;

    {
    }
        }
import org.jkiss.dbeaver.model.DBPDataSource;

        }

    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
        final StringBuilder options = new StringBuilder();
import org.jkiss.dbeaver.ext.postgresql.model.impls.cockroach.PostgreServerCockroachDB;
        if (role.isCanLogin()) options.append(" LOGIN"); else options.append(" NOLOGIN");
        @NotNull List<DBEPersistAction> actions,
                new SQLDatabasePersistAction("Alter role", script.toString()) //$NON-NLS-2$

import java.util.Map;
    @Override
    }
                options.append(" NOREPLICATION");
        final StringBuilder script = new StringBuilder("CREATE ROLE " + DBUtils.getQuotedIdentifier(role));
            options.append(" PASSWORD ").append("'").append(role.getDataSource().getSQLDialect().escapeString(role.getPassword())).append("'");
    public DBSObjectCache<? extends DBSObject, PostgreRole> getObjectsCache(PostgreRole object)
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.postgresql.edit;
                    " IS " + SQLUtils.quoteString(role, CommonUtils.notEmpty(role.getDescription()))));
        actions.add(
 *
        actions.add(
    {
                options.append(" REPLICATION");
        final PostgreRole role = command.getObject();
    @Override
    }
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;

            final PostgreRole role = command.getObject();
            actionList.add(
        if (options.length() != 0 && extension instanceof PostgreServerCockroachDB) {
            addRoleOptions(script, role, command, false);
    @Override
        }
    @Override
        @NotNull NestedObjectCommand<PostgreRole, PropertyHandler> command,
        final PostgreRole role = command.getObject();
        );
    }

        }
        final PostgreServerExtension extension = role.getDataSource().getServerType();
            script.append(" WITH");
import org.jkiss.dbeaver.ext.postgresql.model.PostgreServerExtension;
            actions.add(new SQLDatabasePersistAction(
            "Rename role",

        final DBPDataSource dataSource = role.getDataSource();
            if (role.isCreateDatabase()) options.append(" CREATEDB"); else options.append(" NOCREATEDB");
        processObjectRename(commandContext, object, options, newName);
 * DBeaver - Universal Database Manager

import java.time.format.DateTimeFormatter;
        }
            if (role.isBypassRls()) {
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
        }
        if (extension.supportsRoleBypassRLS()) {
        if (extension.supportsRoleReplication()) {
                options.append(" BYPASSRLS");
            // FIXME: use some generic approach
 * limitations under the License.
        ));

