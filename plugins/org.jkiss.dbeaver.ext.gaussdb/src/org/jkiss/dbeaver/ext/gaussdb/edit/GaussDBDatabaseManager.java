    @Override
import java.util.Map;
            } catch (DBException e) {
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (database.getInitialOwner() != null) {
        }
                new SQLDatabasePersistAction(alterPrefix + "OWNER TO " + DBUtils.getQuotedIdentifier(database.getDBA(monitor))));
    }
        throws DBException {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
            throw new DBException("Cannot drop the currently open database."
    }
        return null;
                + SQLUtils.quoteString(database, CommonUtils.notEmpty(database.getDescription()))));
        throws DBException {
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
 * GaussDBDatabaseManager
            actionList.add(
import org.jkiss.utils.CommonUtils;
                .append(DBUtils.getQuotedIdentifier(database.getDataSource(), database.getInitialTablespace().getName()));
                }


                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {

                generateAlterActions(monitor, actionList, command);
                + "\nSwitch to another database and try again\n(Note: enable 'Show all databases' option to see them).");

            sql.append("\nOWNER = ").append(DBUtils.getQuotedIdentifier(database.getInitialOwner()));
        @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
        if (database.getInitialTablespace() != null) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
        }
 * You may obtain a copy of the License at
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
package org.jkiss.dbeaver.ext.gaussdb.edit;
        if (database.getDatabaseCompatibleMode() != null && !"".equals(database.getDatabaseCompatibleMode())) {

        public CreateDatabaseAction(PostgreDatabase database, StringBuilder sql) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
                alterPrefix + "SET ENCODING " + DBUtils.getQuotedIdentifier(database.getDefaultEncoding(monitor))));
    private static class CreateDatabaseAction extends SQLDatabasePersistActionAtomic {


    @Override
 *
import java.util.List;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");

            actionList.add(new SQLDatabasePersistAction(
                                          @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
        public void beforeExecute(DBCSession session) throws DBCException {
        if (command.hasProperty("defaultTablespace")) {
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
    public void deleteObject(@NotNull DBECommandContext commandContext, @NotNull GaussDBDatabase object, @NotNull Map<String, Object> options)

public class GaussDBDatabaseManager extends SQLObjectEditor<GaussDBDatabase, GaussDBDataSource>
        }
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
    private void generateAlterActions(DBRProgressMonitor monitor, List<DBEPersistAction> actionList, ObjectChangeCommand command)
        public DeleteDatabaseAction(ObjectDeleteCommand command) {
        processObjectRename(commandContext, database, options, newName);
 * DBeaver - Universal Database Manager
    @Override
                                                   Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
        }
    private static class DeleteDatabaseAction extends SQLDatabasePersistActionAtomic {
import org.jkiss.dbeaver.model.exec.DBCSession;
            sql.append("\nENCODING = '").append(database.getInitialEncoding().getName()).append("'");
 * you may not use this file except in compliance with the License.
                    database.checkInstanceConnection(monitor);
import org.jkiss.dbeaver.model.DBPDataSource;

    @Override
        if (command.hasProperty("dBA")) {

 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull GaussDBDatabase database,
 */
        super.validateObjectProperties(monitor, command, options);
        }
        if (object == object.getDataSource().getDefaultInstance()) {
            this.database = (GaussDBDatabase) database;
import org.jkiss.dbeaver.model.DBUtils;
        }
    }
    public DBSObjectCache<? extends DBSObject, GaussDBDatabase> getObjectsCache(GaussDBDatabase object) {
                try {
        if (database.getInitialEncoding() != null) {
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
 * See the License for the specific language governing permissions and
                                         @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<GaussDBDatabase, PropertyHandler> command, @NotNull Map<String, Object> options)
    }
            try {
        private final GaussDBDatabase database;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
import org.jkiss.dbeaver.model.exec.DBCException;
    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.DBException;
            + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getNewName())));
        actions.add(new CreateDatabaseAction(database, sql));
            actions.add(new SQLDatabasePersistAction("COMMENT ON DATABASE " + DBUtils.getQuotedIdentifier(database) + " IS "
    @Override
/*
        if (command.hasProperty("defaultEncoding")) {
import org.jkiss.dbeaver.ext.gaussdb.model.DBCompatibilityEnum;

    }
    }
    @Override
    @Override
 */
 *

    @Override
 *
        return FEATURE_SAVE_IMMEDIATELY;
        final String alterPrefix = "ALTER DATABASE " + DBUtils.getQuotedIdentifier(command.getObject()) + " ";
            }

import org.jkiss.dbeaver.model.struct.DBSObject;
}
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    }
    }
        final PostgreDatabase database = command.getObject();
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        @Override
                log.error(e);
        private final PostgreDatabase database;
        }
        if (command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {
            sql.append("\nDBCOMPATIBILITY = '").append(DBCompatibilityEnum.of(database.getDatabaseCompatibleMode()).getdValue())
        super.deleteObject(commandContext, object, options);
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
                } catch (DBException e) {

        }
                    database.readDatabaseInfo(monitor);
                    database.checkPackageSupport(monitor);
    protected GaussDBDatabase createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container,
        throws DBException {
            if (error == null) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        sql.append("CREATE DATABASE ").append(DBUtils.getQuotedIdentifier(database));
            database.shutdown(session.getProgressMonitor());

/**

        options.put(DBECommandContext.OPTION_AVOID_TRANSACTIONS, true);
        if (command.getProperties().size() > 1 || command.getProperty(DBConstants.PROP_ID_DESCRIPTION) == null) {
            actionList.add(new SQLDatabasePersistAction(
        // TODO Auto-generated method stub

        StringBuilder sql = new StringBuilder();
        }
        @Override

                .append("'");
        }
        }
    }
            super.afterExecute(session, error);
            + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getOldName()) + " RENAME TO "
    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionAtomic;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        final GaussDBDatabase database = command.getObject();
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBDatabase;
    @Override
            super("Drop database", "DROP DATABASE " + DBUtils.getQuotedIdentifier(command.getObject()));
    implements DBEObjectRenamer<GaussDBDatabase> {
        return ((GaussDBDataSource) container).createDatabaseImpl(monitor, "NewDatabase", null, null, null, null);

            super("Create database", sql.toString());
import org.jkiss.dbeaver.model.DBConstants;
 * limitations under the License.
        throws DBException {
    }
                alterPrefix + "SET TABLESPACE " + DBUtils.getQuotedIdentifier(database.getDefaultTablespace(monitor))));
    @Override
            sql.append("\nTABLESPACE = ")

    @Override
        actions.add(new DeleteDatabaseAction(command));

    }
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBDataSource;
    }
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
        actions.add(new SQLDatabasePersistAction("Rename database", "ALTER DATABASE " //$NON-NLS-2$

            PostgreDatabase database = command.getObject();

            database = command.getObject();
        }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        public void afterExecute(DBCSession session, Throwable error) throws DBCException {
                    log.error("Can't connect to the new database");
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
                    DBRProgressMonitor monitor = session.getProgressMonitor();

            super.beforeExecute(session);
