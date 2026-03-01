 * DBeaver - Universal Database Manager
        ExasolSchema schema = command.getObject();

                );
    extends SQLObjectEditor<ExasolSchema, ExasolDataSource> implements DBEObjectRenamer<ExasolSchema> {
        actions.add(
            }
        );
    }
        }
        }
        if (command.getProperties().size() >= 1) {
        actions.add(
        String script = "CREATE SCHEMA " + DBUtils.getQuotedIdentifier(schema);
        String script = "ALTER SCHEMA " + DBUtils.getQuotedIdentifier(schema) + " CHANGE OWNER  " + owner;
                             @NotNull ExasolSchema object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    }
            new SQLDatabasePersistAction(ExasolMessages.manager_schema_raw_limit, script)
        boolean virtSchema = navContainer instanceof DBNDatabaseFolder && ((DBNDatabaseFolder) navContainer).getChildrenClass() == ExasolVirtualSchema.class;
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;

                );
                String script = "COMMENT ON SCHEMA " + DBUtils.getQuotedIdentifier(schema) + " IS '" + ExasolUtils.quoteString(CommonUtils.notNull(schema.getDescription(), "")) + "'";
                                          @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
        final ExasolSchema schema = command.getObject();

        Object navContainer = options.get(DBEObjectManager.OPTION_CONTAINER);
    }
            actions.add(

    private void changeLimit(List<DBEPersistAction> actions, ExasolSchema schema, BigDecimal limit) {
        String script = String.format("ALTER SCHEMA %s SET RAW_SIZE_LIMIT = %d", DBUtils.getQuotedIdentifier(schema), limit.longValue());

                changeLimit(actionList, schema, schema.getRawObjectSizeLimit());

import org.jkiss.dbeaver.model.struct.DBSObject;
    }
    	} else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

    @Override
            throw new DBCFeatureNotSupportedException();
            }
package org.jkiss.dbeaver.ext.exasol.manager;
        if (virtSchema) {
import org.jkiss.dbeaver.model.DBConstants;
        return FEATURE_SAVE_IMMEDIATELY;
    public void renameObject(@NotNull DBECommandContext commandContext,
                    new SQLDatabasePersistAction("Drop schema", "DROP SCHEMA " + DBUtils.getQuotedIdentifier(command.getObject()) + " CASCADE") //$NON-NLS-2$
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
        ExasolSchema object) {
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
                changeOwner(actionList, schema, schema.getOwner());
    public void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
public class ExasolSchemaManager
    		
import org.jkiss.code.NotNull;
    private void changeOwner(List<DBEPersistAction> actions, ExasolSchema schema, String owner) {
                "RENAME SCHEMA " + DBUtils.getQuotedIdentifier(obj.getDataSource(), command.getOldName()) + " to " +
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

            changeLimit(actions, schema, schema.getRawObjectSizeLimit());
/*
import org.jkiss.dbeaver.ext.exasol.model.ExasolVirtualSchema;
    @Override
    protected ExasolSchema createDatabaseObject(
import java.util.Map;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        return super.canCreateObject(container);
        @NotNull DBRProgressMonitor monitor,
 * Unless required by applicable law or agreed to in writing, software
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
    	}
                "Rename Schema",
        ExasolDataSource source = object.getDataSource();

import org.jkiss.dbeaver.model.exec.DBCException;
    }

        actions.add(
                actionList.add(
            new SQLDatabasePersistAction(ExasolMessages.manager_schema_owner, script)
            if (command.getProperties().containsKey("rawObjectSizeLimit")) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.model.edit.DBEObjectManager;
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
                    DBUtils.getQuotedIdentifier(obj.getDataSource(), command.getNewName()))
 */
        if (schema.getRawObjectSizeLimit() != null) {
    public boolean canCreateObject(@NotNull Object container) {


    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
        if (owner != null) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
    @Override
        actions.add(

        return new ExasolSchema((ExasolDataSource) container, "NEW_SCHEMA", "");
 * See the License for the specific language governing permissions and
    @Override
        String owner = schema.getOwner();
import java.math.BigDecimal;
    }



    	if (command.getObject() instanceof ExasolVirtualSchema)
import org.jkiss.dbeaver.ext.exasol.ExasolMessages;
                );
import org.jkiss.dbeaver.ext.exasol.model.ExasolSchema;
                    new SQLDatabasePersistAction("Change comment on Schema", script)



        @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBCException {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            if (command.getProperties().containsKey("owner")) {
    public DBSObjectCache<? extends DBSObject, ExasolSchema> getObjectsCache(
 *

    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPDataSource;
        ExasolSchema obj = command.getObject();

        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2017 Karl Griesser (fullref@gmail.com)
            new SQLDatabasePersistAction(
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
    }
            actions.add(
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
                    new SQLDatabasePersistAction("Drop schema", "DROP VIRTUAL SCHEMA " + DBUtils.getQuotedIdentifier(command.getObject()) + " CASCADE") //$NON-NLS-2$

        processObjectRename(commandContext, object, options, newName);
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    	{

    }
    @Override
            new SQLDatabasePersistAction(ExasolMessages.manager_schema_create, script)
    @Override
 *
        );
        }
            if (command.getProperties().containsKey(DBConstants.PROP_ID_DESCRIPTION)) {
    }

            }
}
        return source.getSchemaCache();
    }
            changeOwner(actions, schema, owner);
import java.util.List;
 * you may not use this file except in compliance with the License.
    @Override

import org.jkiss.dbeaver.DBException;

        );
import org.jkiss.dbeaver.model.DBUtils;
 * limitations under the License.
        );
 * You may obtain a copy of the License at
    }
