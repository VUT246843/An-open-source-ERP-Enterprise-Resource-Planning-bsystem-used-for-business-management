    ) {
 */
        @NotNull HANASchema object,
    @Override
        }
        return "NEW_SCHEMA";
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    public boolean canDeleteObject(@NotNull HANASchema object) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
    }
 * limitations under the License.

        @NotNull List<DBEPersistAction> actions,
    public boolean canCreateObject(@NotNull Object container) {
    ) {
            return schema;
            new SQLDatabasePersistAction(

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        GenericDataSource dataSource = schema.getDataSource();
        );
        @NotNull DBECommandContext commandContext,
    }
    @Override
import org.jkiss.code.Nullable;
        actions.add(
 * distributed under the License is distributed on an "AS IS" BASIS,
                "DROP SCHEMA " + DBUtils.getObjectFullName(command.getObject(), DBPEvaluationContext.DDL) + " RESTRICT") //$NON-NLS-1$
        Object copyFrom,
        return true;
            HANASchema schema = new HANASchema(dataSource, null, "NEW_SCHEMA");

    public DBSObjectCache<? extends DBSObject, HANASchema> getObjectsCache(HANASchema object) {
        @NotNull List<DBEPersistAction> actions,
import org.jkiss.dbeaver.DBException;
                "CREATE SCHEMA " + DBUtils.getObjectFullName(command.getObject(), DBPEvaluationContext.DDL)) //$NON-NLS-1$
        @NotNull Map<String, Object> options
 * Copyright (C) 2010-2024 DBeaver Corp and others
            new SQLDatabasePersistAction(
    @Override

import org.jkiss.dbeaver.model.DBUtils;
                "Rename schema",

        actions.add(
        @NotNull DBCExecutionContext executionContext,
        if (container instanceof HANADataSource) {
        @NotNull ObjectCreateCommand command,
    }
import org.jkiss.dbeaver.ext.hana.model.HANADataSource;
        @NotNull DBECommandContext context,

public class HANASchemaManager extends SQLObjectEditor<HANASchema, HANADataSource> implements DBEObjectRenamer<HANASchema> {
        @NotNull ObjectRenameCommand command,
    protected String getBaseObjectName() {
        @NotNull DBRProgressMonitor monitor,
    @Override
        // But we will not use CASCADE here - too dangerous.
                    " TO " + DBUtils.getQuotedIdentifier(dataSource, command.getNewName())) //$NON-NLS-1$
import org.jkiss.dbeaver.model.struct.DBSObject;
        @NotNull Map<String, Object> options
        @NotNull DBRProgressMonitor monitor,
        return object.getDataSource().getSchemaCache();
    protected HANASchema createDatabaseObject(
        @NotNull ObjectDeleteCommand command,
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import java.util.List;
    @Override
    @Override
import org.jkiss.dbeaver.ext.hana.model.HANASchema;
 *
    ) throws DBException {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * You may obtain a copy of the License at
 *
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    @Override
    }
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
import java.util.Map;
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
        @NotNull Map<String, Object> options
            HANADataSource dataSource = (HANADataSource) container;
        @NotNull Map<String, Object> options
        HANASchema schema = command.getObject();

            new SQLDatabasePersistAction(
        return null;
        return true;
    @Override
            setNewObjectName(monitor, dataSource, schema);

    }
 * See the License for the specific language governing permissions and
    }
    }
    public void renameObject(
                "Create schema", //$NON-NLS-1$
        Object container,
        // RESTRICT drops the schema, but only when there are no objects in it.
 * Unless required by applicable law or agreed to in writing, software
                    DBUtils.getQuotedIdentifier(dataSource, command.getOldName()) +
        );

        @NotNull DBCExecutionContext executionContext,
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                "RENAME SCHEMA " + //$NON-NLS-1$
 *
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    ) {
/*

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
        // If RESTRICT is specified while there are still objects in the schema, then an error is returned.
        actions.add(
    }
}
    @Override
        return FEATURE_SAVE_IMMEDIATELY;
        @NotNull String newName
    protected void addObjectCreateActions(
 * DBeaver - Universal Database Manager
    protected void addObjectDeleteActions(
package org.jkiss.dbeaver.ext.hana.edit;
import org.jkiss.code.NotNull;
        @NotNull List<DBEPersistAction> actions,
        );
    ) {
    @Nullable

import org.jkiss.dbeaver.model.DBPDataSource;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
        @NotNull DBRProgressMonitor monitor,
                "Drop schema", //$NON-NLS-1$
        @NotNull DBCExecutionContext executionContext,

    @Override

    protected void addObjectRenameActions(
        @NotNull Map<String, Object> options,
        processObjectRename(commandContext, object, options, newName);
