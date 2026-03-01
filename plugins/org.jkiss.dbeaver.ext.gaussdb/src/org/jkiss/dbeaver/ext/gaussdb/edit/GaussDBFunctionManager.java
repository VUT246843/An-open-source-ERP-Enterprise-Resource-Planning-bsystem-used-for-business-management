
        createOrReplaceProcedureQuery(actions, command.getObject());
        throws DBException
    protected GaussDBFunction createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container,
        actions.add(new SQLDatabasePersistAction("Rename function",
            actions.add(new SQLDatabasePersistAction("Comment function",
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
    {
                                                   Object copyFrom, @NotNull Map<String, Object> options)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        if (command.getProperty(DBConstants.PROP_ID_DESCRIPTION) != null) {

    {
    {
    @Override

    }
    private void createOrReplaceProcedureQuery(List<DBEPersistAction> actions, GaussDBProcedure procedure)
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
                    true, false, false)
 * GaussDBFunctionManager
        String objectType = command.getObject().getProcedureTypeName();
    @Override
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 * See the License for the specific language governing permissions and
    @Override

    }
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
            throw new DBException("Function name cannot be empty");
        }
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBProcedure;
        actions.add(new SQLDatabasePersistAction("Drop function",
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
    {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                    + " IS " + SQLUtils.quoteString(command.getObject(), command.getObject().getDescription())));
        actions.add(new SQLDatabasePersistAction("Create function", procedure.getBody(), true));
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
import java.util.List;
    {
 * limitations under the License.
 * you may not use this file except in compliance with the License.
    @Override
    }
    }
    {
}
    @Override
import org.jkiss.dbeaver.model.DBUtils;
 *
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options)
    {
import org.jkiss.dbeaver.model.sql.SQLUtils;
    {
                                          @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
        GaussDBSchema schema = (GaussDBSchema) object.getContainer();
 */
import org.jkiss.dbeaver.model.DBPScriptObject;
                log.error(e);
    public DBSObjectCache<GaussDBSchema, GaussDBFunction> getObjectsCache(GaussDBFunction object)
 * distributed under the License is distributed on an "AS IS" BASIS,
    implements DBEObjectRenamer<GaussDBFunction> {
import org.jkiss.code.Nullable;

            && ((PostgreSchema) container).getDataSource().getServerType().supportsFunctionCreate();
            createOrReplaceProcedureQuery(actionList, command.getObject());
        boolean isDDL = CommonUtils.getOption(options, DBPScriptObject.OPTION_DDL_SOURCE);


import org.jkiss.dbeaver.DBException;
        return schema.getGaussDBFunctionsCache();
        return FEATURE_EDITOR_ON_CREATE;
import org.jkiss.utils.CommonUtils;

        processObjectRename(commandContext, object, options, newName);
    @Override
    @Override
    @Override
        return new GaussDBFunction((PostgreSchema) container);
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull GaussDBFunction object,
public class GaussDBFunctionManager extends SQLObjectEditor<GaussDBFunction, GaussDBSchema>
    {
            "ALTER " + command.getObject().getProcedureTypeName() + " " + DBUtils.getQuotedIdentifier(procedure.getSchema()) + "."
        GaussDBProcedure procedure = command.getObject();

    public boolean canDeleteObject(@NotNull GaussDBFunction object)
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 */
    }
        return container instanceof PostgreSchema
import org.jkiss.code.NotNull;

    public boolean canCreateObject(@NotNull Object container)
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBConstants;
        }
 *
    {
 *
        }
        if (isDDL) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        if (CommonUtils.isEmpty(command.getObject().getName())) {
            } catch (DBException e) {
            try {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
                PostgreUtils.getObjectGrantPermissionActions(monitor, command.getObject(), actions, options);


    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.gaussdb.edit;
                                         @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<GaussDBFunction, PropertyHandler> command, @NotNull Map<String, Object> options)
        );
    @Nullable
                "COMMENT ON " + command.getObject().getProcedureTypeName() + " " + command.getObject().getFullQualifiedSignature()
    }

import java.util.Map;
    }
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBFunction;
                + " RENAME TO " + DBUtils.getQuotedIdentifier(procedure.getDataSource(), command.getNewName())));
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBSchema;
    {

    @Override
    }

import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
    }
 * You may obtain a copy of the License at
    }
/*
        return object.getDataSource().getServerType().supportsFunctionCreate();
            "DROP " + objectType + " " + command.getObject().getFullQualifiedSignature()) //$NON-NLS-1$
    }

    }
    @Override
/**

    public long getMakerOptions(@NotNull DBPDataSource dataSource)
                + GaussDBProcedure.makeOverloadedName(procedure.getSchema(), command.getOldName(), procedure.getParameters(monitor),
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options)
    {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;

        if (command.getProperties().size() > 1 || command.getProperty(DBConstants.PROP_ID_DESCRIPTION) == null) {
        @NotNull Map<String, Object> options, @NotNull String newName) throws DBException
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
    {
