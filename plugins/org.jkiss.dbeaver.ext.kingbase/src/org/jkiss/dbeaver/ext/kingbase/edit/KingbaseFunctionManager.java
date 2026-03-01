    @Override
        KingbaseSchema schema = (KingbaseSchema) object.getContainer();
            "DROP " + objectType + " " + command.getObject().getFullQualifiedSignature()) //$NON-NLS-1$
    @Override
    @Override
        }
                    true, false, false)
/**
    @Override
                + " RENAME TO " + DBUtils.getQuotedIdentifier(procedure.getDataSource(), command.getNewName())));
                                         @NotNull NestedObjectCommand<KingbaseFunction, PropertyHandler> command, 
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBUtils;
            throws DBException {
    @Nullable

    @Override
        actions.add(new SQLDatabasePersistAction("Rename function",
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        processObjectRename(commandContext, object, options, newName);
 */
        return container instanceof PostgreSchema
                                          @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, 
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
}
package org.jkiss.dbeaver.ext.kingbase.edit;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                                          @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.ext.kingbase.model.KingbaseSchema;
        }
        createOrReplaceProcedureQuery(actions, command.getObject());
    @Override
 *

    private void createOrReplaceProcedureQuery(List<DBEPersistAction> actions, KingbaseProcedure procedure) {
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
                                         @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.sql.SQLUtils;
    @Override
                    + " IS " + SQLUtils.quoteString(command.getObject(), command.getObject().getDescription())));

import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,

import org.jkiss.dbeaver.ext.kingbase.model.KingbaseProcedure;

            try {
        String objectType = command.getObject().getProcedureTypeName();

        boolean isDDL = CommonUtils.getOption(options, DBPScriptObject.OPTION_DDL_SOURCE);
    implements DBEObjectRenamer<KingbaseFunction> {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.DBException;
    }
            actions.add(new SQLDatabasePersistAction("Comment function",
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
                                          @NotNull Map<String, Object> options) {
/*
            }
public class KingbaseFunctionManager extends SQLObjectEditor<KingbaseFunction, KingbaseSchema>
        if (isDDL) {
    public DBSObjectCache<KingbaseSchema, KingbaseFunction> getObjectsCache(KingbaseFunction object) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                PostgreUtils.getObjectGrantPermissionActions(monitor, command.getObject(), actions, options);


 */
                log.error(e);
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)

import org.jkiss.dbeaver.model.DBPDataSource;

    }
        return schema.getKingbaseFunctionsCache();
    }
            createOrReplaceProcedureQuery(actionList, command.getObject());
    }
    public boolean canDeleteObject(@NotNull KingbaseFunction object) {
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull KingbaseFunction object,
        actions.add(new SQLDatabasePersistAction("Create function", procedure.getBody(), true));
 * DBeaver - Universal Database Manager

            throw new DBException("Function name cannot be empty");
import java.util.List;
 * See the License for the specific language governing permissions and


 * Copyright (C) 2010-2024 DBeaver Corp and others
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    }
            && ((PostgreSchema) container).getDataSource().getServerType().supportsFunctionCreate();
        return object.getDataSource().getServerType().supportsFunctionCreate();
import java.util.Map;
    public boolean canCreateObject(@NotNull Object container) {
                                          @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        actions.add(new SQLDatabasePersistAction("Drop function",
    }
    @Override
        @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * KingbaseFunctionManager
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, 
 *
import org.jkiss.utils.CommonUtils;
        return new KingbaseFunction((PostgreSchema) container);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
    @Override
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
                "COMMENT ON " + command.getObject().getProcedureTypeName() + " " + command.getObject().getFullQualifiedSignature()
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
    @Override
    protected KingbaseFunction createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, 
        KingbaseProcedure procedure = command.getObject();
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, 
            "ALTER " + command.getObject().getProcedureTypeName() + " " + DBUtils.getQuotedIdentifier(procedure.getSchema()) + "."
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    }
        }
import org.jkiss.dbeaver.ext.kingbase.model.KingbaseFunction;
            final Object container, Object copyFrom, @NotNull Map<String, Object> options) {
        if (CommonUtils.isEmpty(command.getObject().getName())) {
                + KingbaseProcedure.makeOverloadedName(procedure.getSchema(), command.getOldName(), procedure.getParameters(monitor),

                                          @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.DBPScriptObject;
    }
        return FEATURE_EDITOR_ON_CREATE;
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, 
                                         @NotNull List<DBEPersistAction> actions, 
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    }
    }
            } catch (DBException e) {
    }

        if (command.getProperty(DBConstants.PROP_ID_DESCRIPTION) != null) {
 * limitations under the License.

        if (command.getProperties().size() > 1 || command.getProperty(DBConstants.PROP_ID_DESCRIPTION) == null) {

import org.jkiss.code.Nullable;
    }
    @Override
 *

        );
        }
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
 * distributed under the License is distributed on an "AS IS" BASIS,
