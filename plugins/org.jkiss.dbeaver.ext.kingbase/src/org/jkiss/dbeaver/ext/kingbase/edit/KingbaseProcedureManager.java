        return schema.getKingbaseProceduresCache();
 *     http://www.apache.org/licenses/LICENSE-2.0

 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 * KingbaseProcedureManager
        if (command.getProperty(DBConstants.PROP_ID_DESCRIPTION) != null) {
                                         @NotNull Map<String, Object> options) {
                                         @NotNull NestedObjectCommand<KingbaseProcedure, PropertyHandler> command, 
import org.jkiss.dbeaver.model.sql.SQLUtils;
/*

                    + " IS " + SQLUtils.quoteString(command.getObject(), command.getObject().getDescription())));
 */
    @Override
 *
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Override
        if (command.getProperties().size() > 1 || command.getProperty(DBConstants.PROP_ID_DESCRIPTION) == null) {
    @Override

    }
        if (isDDL) {
import org.jkiss.dbeaver.model.DBConstants;
        createOrReplaceProcedureQuery(actions, command.getObject());
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPDataSource;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        actions.add(new SQLDatabasePersistAction("Rename function",
    }
    @Override
    }
                                          @NotNull Map<String, Object> options) {
package org.jkiss.dbeaver.ext.kingbase.edit;
            new SQLDatabasePersistAction("Drop function", "DROP " + objectType 
    }
        if (CommonUtils.isEmpty(command.getObject().getName())) {
        }


            createOrReplaceProcedureQuery(actionList, command.getObject());
        KingbaseSchema schema = (KingbaseSchema) object.getContainer();
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ext.kingbase.model.KingbaseProcedure;
 */
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command,
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
    private void createOrReplaceProcedureQuery(List<DBEPersistAction> actions, KingbaseProcedure procedure) {
import org.jkiss.dbeaver.model.DBPScriptObject;
    @Override
                "COMMENT ON " + command.getObject().getProcedureTypeName() + " " + command.getObject().getFullQualifiedSignature()

                + " RENAME TO " + DBUtils.getQuotedIdentifier(procedure.getDataSource(), command.getNewName())));
    @Override
        return new KingbaseProcedure((PostgreSchema) container);
    }
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, 
                                          @NotNull Map<String, Object> options) {
                                          @NotNull Map<String, Object> options) {
import org.jkiss.utils.CommonUtils;
    @Override
    }
    public DBSObjectCache<KingbaseSchema, KingbaseProcedure> getObjectsCache(KingbaseProcedure object) {

        return container instanceof PostgreSchema
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull KingbaseProcedure object,
 * Unless required by applicable law or agreed to in writing, software
    public boolean canDeleteObject(@NotNull KingbaseProcedure object) {
            final Object container, Object copyFrom, @NotNull Map<String, Object> options) {
        );
                                          @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, 
import java.util.Map;
        processObjectRename(commandContext, object, options, newName);
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
    implements DBEObjectRenamer<KingbaseProcedure> {
import java.util.List;
            } catch (DBException e) {
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
    @Override
    }
        }
    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        actions.add(new SQLDatabasePersistAction("Create function", procedure.getBody(), true));
 * Licensed under the Apache License, Version 2.0 (the "License");

    public boolean canCreateObject(@NotNull Object container) {

        @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
    @Override

    @Override
/**
    @Override
import org.jkiss.dbeaver.DBException;
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
                    + " " + command.getObject().getFullQualifiedSignature()) //$NON-NLS-2$
    }
    }
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
        }
 * DBeaver - Universal Database Manager
        return FEATURE_EDITOR_ON_CREATE;


            throw new DBException("Function name cannot be empty");

        KingbaseProcedure procedure = command.getObject();
            && ((PostgreSchema) container).getDataSource().getServerType().supportsFunctionCreate();
                + KingbaseProcedure.makeOverloadedName(procedure.getSchema(), command.getOldName(), procedure.getParameters(monitor),
 *

                                         @NotNull List<DBEPersistAction> actions, 
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                PostgreUtils.getObjectGrantPermissionActions(monitor, command.getObject(), actions, options);
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
 * You may obtain a copy of the License at
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, 
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
            "ALTER " + command.getObject().getProcedureTypeName() + " " + DBUtils.getQuotedIdentifier(procedure.getSchema()) + "."
        Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.ext.kingbase.model.KingbaseSchema;
        boolean isDDL = CommonUtils.getOption(options, DBPScriptObject.OPTION_DDL_SOURCE);
import org.jkiss.code.NotNull;

                    true, false, false)
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    }
                                          @NotNull Map<String, Object> options) {
        }
public class KingbaseProcedureManager extends SQLObjectEditor<KingbaseProcedure, KingbaseSchema>
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, 
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    }
    }
 * limitations under the License.
        actions.add(
        String objectType = command.getObject().getProcedureTypeName();
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
}
    protected KingbaseProcedure createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, 
            actions.add(new SQLDatabasePersistAction("Comment function",

                log.error(e);
            try {
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
            }
import org.jkiss.dbeaver.model.DBUtils;
        return object.getDataSource().getServerType().supportsFunctionCreate();
