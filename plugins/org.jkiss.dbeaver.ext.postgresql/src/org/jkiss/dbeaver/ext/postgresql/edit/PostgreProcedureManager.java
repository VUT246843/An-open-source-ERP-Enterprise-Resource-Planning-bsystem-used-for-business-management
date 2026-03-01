 * limitations under the License.
import java.util.List;

 * Unless required by applicable law or agreed to in writing, software
    {
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreProcedure object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)

                        true,
    @Override
    }
 * You may obtain a copy of the License at
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<PostgreProcedure, PropertyHandler> command, @NotNull Map<String, Object> options) {
    protected PostgreProcedure createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object copyFrom, @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Override

        throws DBException
                    " RENAME TO " + DBUtils.getQuotedIdentifier(procedure.getDataSource(), command.getNewName()))
    }
        actions.add(
public class PostgreProcedureManager extends SQLObjectEditor<PostgreProcedure, PostgreSchema> implements DBEObjectRenamer<PostgreProcedure> {
                        procedure.getSchema(),
                        false) +
}
                    " IS " + SQLUtils.quoteString(command.getObject(), command.getObject().getDescription())));
                        false,
    {
import org.jkiss.utils.CommonUtils;

    }
    @Override
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options)

        if (command.getProperties().size() > 1 || command.getProperty(DBConstants.PROP_ID_DESCRIPTION) == null) {
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
    {

    @Override
 */
    @Override
    @Override
import org.jkiss.code.Nullable;
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
 *
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;

    {
                    PostgreProcedure.makeOverloadedName(
import org.jkiss.dbeaver.model.DBConstants;
            } catch (DBException e) {
        return container instanceof PostgreSchema && ((PostgreSchema) container).getDataSource().getServerType().supportsFunctionCreate();
        PostgreProcedure procedure = command.getObject();
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    private void createOrReplaceProcedureQuery(List<DBEPersistAction> actions, PostgreProcedure procedure)
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPScriptObject;
        );
    {
 * See the License for the specific language governing permissions and
 * PostgreProcedureManager
                log.error(e);
                "Rename function",
            throw new DBException("Function name cannot be empty");
        processObjectRename(commandContext, object, options, newName);
        return FEATURE_EDITOR_ON_CREATE;
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
            new SQLDatabasePersistAction("Drop function", "DROP " + objectType + " " + command.getObject().getFullQualifiedSignature()) //$NON-NLS-2$
    {
 * Licensed under the Apache License, Version 2.0 (the "License");

        if (command.getProperty(DBConstants.PROP_ID_DESCRIPTION) != null) {
    }
    }
    }
        actions.add(

                "COMMENT ON " + command.getObject().getProcedureTypeName() + " " + command.getObject().getFullQualifiedSignature() +
                        procedure.getParameters(monitor),
            try {
    }
 *
            actions.add(new SQLDatabasePersistAction(
        String objectType = command.getObject().getProcedureTypeName();
import org.jkiss.dbeaver.DBException;
    }
    {
        }
                        command.getOldName(),
        }

import org.jkiss.code.NotNull;
            createOrReplaceProcedureQuery(actionList, command.getObject());
        }

import java.util.Map;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedure;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
import org.jkiss.dbeaver.model.DBUtils;
package org.jkiss.dbeaver.ext.postgresql.edit;

    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options)
                        DBUtils.getQuotedIdentifier(procedure.getSchema()) + "." +
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        return object.getContainer().getProceduresCache();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        );
import org.jkiss.dbeaver.model.DBPDataSource;
    {
 * you may not use this file except in compliance with the License.

            }
/**
    @Nullable
    }
import org.jkiss.dbeaver.model.sql.SQLUtils;
        return object.getDataSource().getServerType().supportsFunctionCreate();
    }
                "Comment function",
    @Override
    @Override
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
import org.jkiss.dbeaver.model.edit.DBECommandContext;

        createOrReplaceProcedureQuery(actions, command.getObject());
        return new PostgreProcedure((PostgreSchema) container);
/*
        actions.add(
    }

            new SQLDatabasePersistAction(
    {
    @Override
    @Override
    @Override
    }
    public boolean canCreateObject(@NotNull Object container) {
        }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
                "ALTER " + command.getObject().getProcedureTypeName() + " " +
        if (isDDL) {
        boolean isDDL = CommonUtils.getOption(options, DBPScriptObject.OPTION_DDL_SOURCE);
    public boolean canDeleteObject(@NotNull PostgreProcedure object) {

 */
    public DBSObjectCache<PostgreSchema, PostgreProcedure> getObjectsCache(PostgreProcedure object)
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (CommonUtils.isEmpty(command.getObject().getName())) {

                PostgreUtils.getObjectGrantPermissionActions(monitor, command.getObject(), actions, options);

            new SQLDatabasePersistAction("Create function", procedure.getBody(), true));
