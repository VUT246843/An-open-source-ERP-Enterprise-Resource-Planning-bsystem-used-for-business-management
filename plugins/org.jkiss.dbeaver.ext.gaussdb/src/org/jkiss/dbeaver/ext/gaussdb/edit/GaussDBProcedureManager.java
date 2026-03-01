    @Override
}
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
            }
    }
package org.jkiss.dbeaver.ext.gaussdb.edit;
    }
    @Override
import org.jkiss.dbeaver.model.DBPScriptObject;
import java.util.Map;
        createOrReplaceProcedureQuery(actions, command.getObject());
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.model.DBPDataSource;
                log.error(e);
        if (isDDL) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

 * See the License for the specific language governing permissions and
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull GaussDBProcedure object,
import org.jkiss.code.Nullable;
    @Override
 * DBeaver - Universal Database Manager
        }
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
            } catch (DBException e) {
 * limitations under the License.
                                          @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
 * You may obtain a copy of the License at
            "ALTER " + command.getObject().getProcedureTypeName() + " " + DBUtils.getQuotedIdentifier(procedure.getSchema()) + "."
import org.jkiss.utils.CommonUtils;
                    true, false, false)
import java.util.List;
    @Override
                + " RENAME TO " + DBUtils.getQuotedIdentifier(procedure.getDataSource(), command.getNewName())));
    protected GaussDBProcedure createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container,
    @Override
                + GaussDBProcedure.makeOverloadedName(procedure.getSchema(), command.getOldName(), procedure.getParameters(monitor),

    public boolean canDeleteObject(@NotNull GaussDBProcedure object) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * GaussDBProcedureManager

                "COMMENT ON " + command.getObject().getProcedureTypeName() + " " + command.getObject().getFullQualifiedSignature()
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Override
        boolean isDDL = CommonUtils.getOption(options, DBPScriptObject.OPTION_DDL_SOURCE);
    @Override
        @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
    @Nullable
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBProcedure;
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
        if (CommonUtils.isEmpty(command.getObject().getName())) {
    }
        GaussDBProcedure procedure = command.getObject();
        processObjectRename(commandContext, object, options, newName);
    public boolean canCreateObject(@NotNull Object container) {
    }

import org.jkiss.code.NotNull;
    }
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {

            actions.add(new SQLDatabasePersistAction("Comment function",

    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    @Override
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        return new GaussDBProcedure((PostgreSchema) container);
 * Unless required by applicable law or agreed to in writing, software

        return object.getDataSource().getServerType().supportsFunctionCreate();
 */

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
/*
        Map<String, Object> options) throws DBException {
        }
            try {
        actions.add(new SQLDatabasePersistAction("Rename function",
import org.jkiss.dbeaver.model.DBConstants;

        }
                    + " IS " + SQLUtils.quoteString(command.getObject(), command.getObject().getDescription())));
    implements DBEObjectRenamer<GaussDBProcedure> {
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
    }
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
    public DBSObjectCache<GaussDBSchema, GaussDBProcedure> getObjectsCache(GaussDBProcedure object) {
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.DBException;
        if (command.getProperties().size() > 1 || command.getProperty(DBConstants.PROP_ID_DESCRIPTION) == null) {
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
                                                    Object copyFrom, @NotNull Map<String, Object> options) {
    }
 *

        return FEATURE_EDITOR_ON_CREATE;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
            createOrReplaceProcedureQuery(actionList, command.getObject());
        return schema.getGaussDBProceduresCache();
            && ((PostgreSchema) container).getDataSource().getServerType().supportsFunctionCreate();
        GaussDBSchema schema = (GaussDBSchema) object.getContainer();
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
        );
public class GaussDBProcedureManager extends SQLObjectEditor<GaussDBProcedure, GaussDBSchema>
    @Override
import org.jkiss.dbeaver.model.sql.SQLUtils;
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
        }
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBSchema;
    private void createOrReplaceProcedureQuery(List<DBEPersistAction> actions, GaussDBProcedure procedure) {
        actions.add(new SQLDatabasePersistAction("Create function", procedure.getBody(), true));



import org.jkiss.dbeaver.model.edit.DBECommandContext;
    }
        String objectType = command.getObject().getProcedureTypeName();
 * you may not use this file except in compliance with the License.
    @Override
/**

                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
 */

                                         @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<GaussDBProcedure, PropertyHandler> command, @NotNull Map<String, Object> options) {

        return container instanceof PostgreSchema

import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    }
            throw new DBException("Function name cannot be empty");
    @Override
        actions.add(
import org.jkiss.dbeaver.model.DBUtils;
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command,
        if (command.getProperty(DBConstants.PROP_ID_DESCRIPTION) != null) {
                PostgreUtils.getObjectGrantPermissionActions(monitor, command.getObject(), actions, options);
            new SQLDatabasePersistAction("Drop function", "DROP " + objectType + " " + command.getObject().getFullQualifiedSignature()) //$NON-NLS-2$
    }
