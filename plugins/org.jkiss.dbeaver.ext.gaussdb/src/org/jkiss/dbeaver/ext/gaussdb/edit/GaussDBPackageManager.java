import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
            if (!body.endsWith(";")) {
import java.util.Map;
    public void renameObject(DBECommandContext commandContext, GaussDBPackage object, Map<String, Object> options,
        } else {
    private void createOrReplaceProcedureQuery(List<DBEPersistAction> actionList, GaussDBPackage pack) throws DBException {
        String newName) throws DBException {
    @Override

                body += ";";
        if (!CommonUtils.isEmpty(header)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBPackage;

        if (command.getProperties().size() > 1 || command.getProperty(DBConstants.PROP_ID_DESCRIPTION) == null) {
            }
    public boolean canDeleteObject(@NotNull GaussDBPackage object) {
 * you may not use this file except in compliance with the License.
                                          @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {

        return true;
package org.jkiss.dbeaver.ext.gaussdb.edit;
import org.jkiss.code.NotNull;
        return object.getSchema().packageCache;
        GaussDBSchema schema = (GaussDBSchema) container;
        if (!CommonUtils.isEmpty(body)) {
    }
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBSchema;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    }
                                          @NotNull List<DBEPersistAction> actions, @NotNull SQLObjectEditor<GaussDBPackage, GaussDBDatabase>.ObjectCreateCommand command,
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {

 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        if (!header.endsWith(";")) {
                DBEPersistAction.ActionType.OPTIONAL) // $NON-NLS-1$
/*
                                                  Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
    }
            actionList.add(new SQLDatabasePersistAction("Drop package header", "DROP PACKAGE BODY " + pack.getName(),
import java.util.List;
 */
        }
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
        ObjectRenameCommand command = new ObjectRenameCommand(object, ModelMessages.model_jdbc_rename_object, options, newName);
    protected GaussDBPackage createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container,
    @Override
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
import org.jkiss.dbeaver.model.messages.ModelMessages;
        return new GaussDBPackage(schema, monitor, "NewPackage");
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

        createOrReplaceProcedureQuery(actions, pack);
 * You may obtain a copy of the License at
    }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
            actionList.add(new SQLDatabasePersistAction("Create package header", header)); // $NON-NLS-1$
        actions.add(new SQLDatabasePersistAction("Drop package", "DROP PACKAGE " + pack.getName()) //$NON-NLS-2$
        return true;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBDatabase;
    public DBSObjectCache<? extends DBSObject, GaussDBPackage> getObjectsCache(GaussDBPackage object) {


    @Override
        commandContext.addCommand(command, new RenameObjectReflector(), true);
    @Override
            body = body.trim();
    @Override

    }
    }
            actionList.add(new SQLDatabasePersistAction("Create package body", body));
 *
                                          @NotNull Map<String, Object> options) throws DBException {

    }

    public boolean canCreateObject(@NotNull Object container) {

                                          @NotNull List<DBEPersistAction> actions, @NotNull SQLObjectEditor<GaussDBPackage, GaussDBDatabase>.ObjectDeleteCommand command,

import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        }
        String header = pack.getObjectDefinitionText().trim();
 * DBeaver - Universal Database Manager
    }
 * limitations under the License.
            header += ";";
import org.jkiss.utils.CommonUtils;
        String body = pack.getExtendedDefinitionText();
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,

        );
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
}
    }
public class GaussDBPackageManager extends SQLObjectEditor<GaussDBPackage, GaussDBDatabase>
import org.jkiss.dbeaver.DBException;
 *
 * Unless required by applicable law or agreed to in writing, software
        GaussDBPackage pack = command.getObject();
    @Override
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                          @NotNull Map<String, Object> options) throws DBException {
    @Override
            );
    @Override
    implements DBEObjectRenamer<GaussDBPackage> {
        return 1 << 2;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    }


        }
        GaussDBPackage pack = command.getObject();
import org.jkiss.dbeaver.model.DBPDataSource;

            createOrReplaceProcedureQuery(actionList, command.getObject());
