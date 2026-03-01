import org.jkiss.dbeaver.model.exec.DBCException;
    private void verifyCanCreateDB(@NotNull PostgreDatabase database) throws DBException {
            actionList.add(new SQLDatabasePersistAction(alterPrefix + "SET TABLESPACE " + DBUtils.getQuotedIdentifier(database.getDefaultTablespace(monitor))));
import org.jkiss.code.Nullable;
        if (command.hasProperty("dBA")) {

            database.shutdown(session.getProgressMonitor());

import org.jkiss.dbeaver.DBException;
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.exec.DBCSession;

        final PostgreDatabase database = command.getObject();
package org.jkiss.dbeaver.ext.postgresql.edit;

    }
            }
    @Override
    @Override
        }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        @NotNull Map<String, Object> options

    @Override
                    " RENAME TO " + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getNewName())) //$NON-NLS-1$
    /*
            }
        }
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
import java.util.List;
        }
            PostgreDatabase database = command.getObject();
                log.error(e);
            sql.append("\nENCODING = '").append(database.getInitialEncoding().getName()).append("'");
        if (database.getInitialEncoding() != null) {
public class PostgreDatabaseManager extends SQLObjectEditor<PostgreDatabase, PostgreDataSource> implements DBEObjectRenamer<PostgreDatabase> {
        DBPConnectionConfiguration configuration = database.getDataSource().getContainer().getActualConnectionConfiguration();
        return object.getDataSource().getDatabaseCache();
import org.jkiss.utils.CommonUtils;

}
            actionList.add(new SQLDatabasePersistAction(alterPrefix + "SET ENCODING " + DBUtils.getQuotedIdentifier(database.getDefaultEncoding(monitor))));
        @NotNull DBRProgressMonitor monitor,


            throw new DBException("Cannot drop the currently open database." +
    private static class DeleteDatabaseAction extends SQLDatabasePersistActionAtomic {
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
    ) throws DBException {
            sql.append("\nOWNER = ").append(DBUtils.getQuotedIdentifier(database.getInitialOwner()));
                "\nSwitch to another database and try again\n(Note: enable 'Show all databases' option to see them).");
        actions.add(new CreateDatabaseAction(database, sql));
        private final PostgreDatabase database;
    }
        if (!CommonUtils.isEmpty(database.getTemplateName())) {
        }
            try {

import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    @Override


                try {
        @NotNull DBCExecutionContext executionContext,
        if (command.hasProperty("defaultEncoding")) {
    }
    public DBSObjectCache<PostgreDataSource, PostgreDatabase> getObjectsCache(PostgreDatabase object) {
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            this.database = database;
                }
        if (database.getInitialOwner() != null) {
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreDatabase database, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
                generateAlterActions(monitor, actionList, command);
            sql.append("\nTEMPLATE = ").append(DBUtils.getQuotedIdentifier(database.getDataSource(), database.getTemplateName()));
            } catch (DBException e) {

        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            super("Create database", sql.toString());
            new SQLDatabasePersistAction(
import org.jkiss.code.NotNull;
                "Rename database",
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
    @Override
        }
                    database.checkInstanceConnection(session.getProgressMonitor());

                } catch (DBException e) {
            super.beforeExecute(session);
     */
        if (command.getProperties().size() > 1 || command.getProperty(DBConstants.PROP_ID_DESCRIPTION) == null) {
        if (!isReadDatabaseList(configuration)) {
                "ALTER DATABASE " + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getOldName()) + //$NON-NLS-1$
        public void afterExecute(DBCSession session, Throwable error) throws DBCException {
    }
        StringBuilder sql = new StringBuilder();
            if (error == null) {
        if (database.getInitialTablespace() != null) {
 * You may obtain a copy of the License at
        super.validateObjectProperties(monitor, command, options);

import org.jkiss.dbeaver.ext.postgresql.internal.PostgreSQLMessages;
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
        if (object == object.getDataSource().getDefaultInstance()) {
 * limitations under the License.
        }

 *
            super.afterExecute(session, error);
    protected PostgreDatabase createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
     * Throws if we cannot create DB because of connection settings
        @Override
        public DeleteDatabaseAction(ObjectDeleteCommand command) {
        actions.add(new DeleteDatabaseAction(command));
            database = command.getObject();
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;

 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        return CommonUtils.getBoolean(configuration.getProviderProperty(PostgreConstants.PROP_SHOW_NON_DEFAULT_DB), false);
    @Override

            super("Drop database", "DROP DATABASE " + DBUtils.getQuotedIdentifier(command.getObject()));
            sql.append("\nTABLESPACE = ").append(DBUtils.getQuotedIdentifier(database.getDataSource(), database.getInitialTablespace().getName()));
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
        @NotNull ObjectCreateCommand command,
    private boolean isReadDatabaseList(@NotNull DBPConnectionConfiguration configuration) {
        sql.append("CREATE DATABASE ").append(DBUtils.getQuotedIdentifier(database));
import java.util.Map;
        }
        final String alterPrefix = "ALTER DATABASE " + DBUtils.getQuotedIdentifier(command.getObject()) + " ";
/*
            actionList.add(new SQLDatabasePersistAction(alterPrefix + "OWNER TO " + DBUtils.getQuotedIdentifier(database.getDBA(monitor))));
        private final PostgreDatabase database;
                " IS " + SQLUtils.quoteString(database, CommonUtils.notEmpty(database.getDescription()))));
 */
        @NotNull List<DBEPersistAction> actions,
        verifyCanCreateDB(database);
    }
    @Override
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionAtomic;

        processObjectRename(commandContext, database, options, newName);
 * Copyright (C) 2010-2024 DBeaver Corp and others
            actions.add(new SQLDatabasePersistAction("COMMENT ON DATABASE " + DBUtils.getQuotedIdentifier(database) +

import org.jkiss.dbeaver.model.DBUtils;
        public void beforeExecute(DBCSession session) throws DBCException {
        }
        if (command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {

    @Override
        }
    }
        }
    private void generateAlterActions(DBRProgressMonitor monitor, List<DBEPersistAction> actionList, ObjectChangeCommand command) throws DBException {

        if (command.hasProperty("defaultTablespace")) {
        }
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
    @Override
 * See the License for the specific language governing permissions and
    }
        options.put(DBECommandContext.OPTION_AVOID_TRANSACTIONS, true);
                    log.error("Can't connect to the new database");

        @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        }
    public void deleteObject(@NotNull DBECommandContext commandContext, @NotNull PostgreDatabase object, @NotNull Map<String, Object> options) throws DBException {
    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options) throws DBException {
    }
        return FEATURE_SAVE_IMMEDIATELY;
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<PostgreDatabase, PropertyHandler> command, @NotNull Map<String, Object> options) throws DBException {
 * PostgreDatabaseManager
    }
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
 *
    @Nullable
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

        public CreateDatabaseAction(PostgreDatabase database, StringBuilder sql) {
    protected void addObjectCreateActions(
 *

        );

        actions.add(
    }
        super.deleteObject(commandContext, object, options);
        final PostgreDatabase database = command.getObject();
/**
import org.jkiss.dbeaver.model.DBConstants;
 * DBeaver - Universal Database Manager
    private static class CreateDatabaseAction extends SQLDatabasePersistActionAtomic {
            throw new DBException(PostgreSQLMessages.error_multi_database_mode_disabled_description);
        return ((PostgreDataSource) container).createDatabaseImpl(monitor, "NewDatabase", null, null, null, null);
        }
 * you may not use this file except in compliance with the License.

