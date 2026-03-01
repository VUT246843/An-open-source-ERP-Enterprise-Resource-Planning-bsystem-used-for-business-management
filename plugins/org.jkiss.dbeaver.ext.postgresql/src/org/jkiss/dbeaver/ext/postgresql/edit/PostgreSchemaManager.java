 *
                "Comment schema",
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import org.jkiss.code.NotNull;
        @NotNull DBCExecutionContext executionContext,
        processObjectRename(commandContext, schema, options, newName);
/*
    }
                "ALTER SCHEMA " + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getOldName()) + //$NON-NLS-1$
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCException;
        @NotNull Map<String, Object> options
                schema.readSchemaInfo(session.getProgressMonitor());
        }
}
                    .append(DBUtils.getQuotedIdentifier(owner));

        actions.add(
import org.jkiss.dbeaver.model.exec.DBCSession;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            new SQLDatabasePersistAction("Drop schema", "DROP SCHEMA " + DBUtils.getQuotedIdentifier(command.getObject()) + " CASCADE") //$NON-NLS-2$
        actions.add(
        String comment = schema.getDescription();
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
                .getUserName();
            new SQLDatabasePersistAction(
/**


            }
 *
    {
            actions.add(new SQLDatabasePersistAction(
 *
        StringBuilder script = new StringBuilder("CREATE SCHEMA " + DBUtils.getQuotedIdentifier(schema));
        return FEATURE_SAVE_IMMEDIATELY;
package org.jkiss.dbeaver.ext.postgresql.edit;

        );
 */
                    " RENAME TO " + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getNewName())) //$NON-NLS-1$
        }
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options)
    private static class CreateSchemaAction extends SQLDatabasePersistActionAtomic {
            log.error(e);
                .getConnectionConfiguration()
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreSchema schema, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException
import java.util.Map;
            super("Create schema", sql.toString());
            if (owner != null && !owner.getName().equals(currentUser)) {
        } catch (DBException e) {
                "COMMENT ON SCHEMA " + DBUtils.getQuotedIdentifier(schema) +
import org.jkiss.dbeaver.model.sql.SQLUtils;
    }

    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
    @Override
            if (error == null) {


        );
    @Override
        return object.getDatabase().schemaCache;
            }
        }

import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;

 * limitations under the License.

        PostgreDatabase database = (PostgreDatabase) container;
                    " IS " + SQLUtils.quoteString(schema, comment)));
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    ) {
    {
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * PostgreSchemaManager
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<PostgreSchema, PropertyHandler> command, @NotNull Map<String, Object> options)
    @Nullable
        private final PostgreSchema schema;

 * Unless required by applicable law or agreed to in writing, software
    }
        );
    }
    }
    }
    {
    {
    @Override
    {
    @Override
        try {
            new CreateSchemaAction(schema, script) //$NON-NLS-2$

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                script.append("\nAUTHORIZATION ")
 * DBeaver - Universal Database Manager
    @Override
import org.jkiss.dbeaver.model.DBPDataSource;

            super.afterExecute(session, error);
            this.schema = schema;
        actions.add(
        @NotNull List<DBEPersistAction> actions,
import org.jkiss.code.Nullable;
        @NotNull ObjectCreateCommand command,
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    }
        }
 * See the License for the specific language governing permissions and
        if (comment != null) {
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;
        public CreateSchemaAction(PostgreSchema schema, StringBuilder sql) {
                "Rename schema",
 */
            String currentUser = executionContext
    protected void addObjectCreateActions(

                .getDataSource()
import org.jkiss.dbeaver.model.DBUtils;
public class PostgreSchemaManager extends SQLObjectEditor<PostgreSchema, PostgreDatabase> implements DBEObjectRenamer<PostgreSchema> {
            PostgreRole owner = schema.getOwner(monitor);
        PostgreSchema schema = command.getObject();
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
    @Override
    }
    {

import java.util.List;
    {
    public DBSObjectCache<PostgreDatabase, PostgreSchema> getObjectsCache(PostgreSchema object)
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected PostgreSchema createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object copyFrom, @NotNull Map<String, Object> options)
        PostgreSchema schema = command.getObject();
        public void afterExecute(DBCSession session, Throwable error) throws DBCException {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
                .getContainer()
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionAtomic;


        return database.createSchemaImpl(database, "NewSchema", (PostgreRole) null);
    @Override
import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        @Override
