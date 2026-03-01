            log.warn(e);
    {
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand objectChangeCommand, @NotNull Map<String, Object> options)
            if (!CommonUtils.isEmpty(header)) {

        OracleUtils.addSchemaChangeActions(executionContext, actionList, pack);
            }
    @Override
        final OraclePackage object = objectDeleteCommand.getObject();

 *     http://www.apache.org/licenses/LICENSE-2.0
                        "Drop package header",
        );
    {
            }
    }
import java.util.List;
                actionList.add(
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        actions.add(
                actionList.add(
    }
 *
                    body += ";";
            }
                        body));
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                        pack, OracleObjectType.PACKAGE_BODY,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
    }
import org.jkiss.utils.CommonUtils;
        }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
package org.jkiss.dbeaver.ext.oracle.edit;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand objectDeleteCommand, @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return object.getSchema().packageCache;
import org.jkiss.dbeaver.ext.oracle.model.*;
/**
            (OracleSchema) container,

 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
public class OraclePackageManager extends SQLObjectEditor<OraclePackage, OracleSchema> {
 */
    protected OraclePackage createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object copyFrom, @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

    }
                        DBEPersistAction.ActionType.OPTIONAL) //$NON-NLS-1$
            if (!header.endsWith(";")) {

        createOrReplaceProcedureQuery(executionContext, actionList, objectChangeCommand.getObject());
    public DBSObjectCache<? extends DBSObject, OraclePackage> getObjectsCache(OraclePackage object)
import org.jkiss.dbeaver.model.edit.DBECommandContext;

            "NEW_PACKAGE");
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand objectCreateCommand, @NotNull Map<String, Object> options)
                    new SQLDatabasePersistAction(
            } else {
    {
                        pack, OracleObjectType.PACKAGE,
                body = body.trim();
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        createOrReplaceProcedureQuery(executionContext, actions, objectCreateCommand.getObject());
                }
        try {
                        header)); //$NON-NLS-1$
            new SQLDatabasePersistAction("Drop package",
    @Override
    @Override
 */
import org.jkiss.dbeaver.model.DBPDataSource;
    {
 * DBeaver - Universal Database Manager

 * distributed under the License is distributed on an "AS IS" BASIS,
                if (!body.endsWith(";")) {

 * limitations under the License.


        return new OraclePackage(
                        "Create package body",
import org.jkiss.code.NotNull;
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
    @Override
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
                actionList.add(
                    );
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Override
 *
    @Override
    }

                "DROP PACKAGE " + object.getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-1$

                        "Create package header",
                        "DROP PACKAGE BODY " + pack.getFullyQualifiedName(DBPEvaluationContext.DDL),
    {
}
import org.jkiss.dbeaver.DBException;
    }
    private void createOrReplaceProcedureQuery(DBCExecutionContext executionContext, List<DBEPersistAction> actionList, OraclePackage pack)
            String body = pack.getExtendedDefinitionText(new VoidProgressMonitor());
    {
import org.jkiss.code.Nullable;
        return FEATURE_EDITOR_ON_CREATE;
    @Nullable
 * OraclePackageManager
                header += ";";
    {
            String header = pack.getObjectDefinitionText(new VoidProgressMonitor(), DBPScriptObject.EMPTY_OPTIONS).trim();
        } catch (DBException e) {
import org.jkiss.dbeaver.model.DBPScriptObject;
                    new OracleObjectValidateAction(
/*
            if (!CommonUtils.isEmpty(body)) {
                    new OracleObjectValidateAction(
import java.util.Map;
    }
