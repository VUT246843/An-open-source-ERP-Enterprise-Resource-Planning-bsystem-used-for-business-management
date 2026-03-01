    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand objectCreateCommand, @NotNull Map<String, Object> options)
        final OracleDataType object = objectDeleteCommand.getObject();
    @Override
            actionList.add(
        return dataType;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
        return container instanceof OracleSchema;


            ")"); //$NON-NLS-1$
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand objectDeleteCommand, @NotNull Map<String, Object> options)

import org.jkiss.dbeaver.ext.oracle.model.OracleDataType;
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

    }
 *
    protected OracleDataType createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object copyFrom, @NotNull Map<String, Object> options)
    }
                    "CREATE OR REPLACE " + header)); //$NON-NLS-1$

            "DataType",
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
package org.jkiss.dbeaver.ext.oracle.edit;
                    "CREATE OR REPLACE " + body)); //$NON-NLS-1$
        createOrReplaceProcedureQuery(monitor, executionContext, actions, objectCreateCommand.getObject());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            "(\n" + //$NON-NLS-1$
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    {
        @NotNull DBCExecutionContext executionContext,
                "DROP TYPE " + object.getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-1$
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                new SQLDatabasePersistAction(
    private void createOrReplaceProcedureQuery(

        OracleUtils.addSchemaChangeActions(executionContext, actionList, dataType);
        return FEATURE_EDITOR_ON_CREATE;
        dataType.setObjectDefinitionText("TYPE " + dataType.getName() + " AS OBJECT\n" + //$NON-NLS-1$ //$NON-NLS-2$
import org.jkiss.dbeaver.ext.oracle.model.OracleSchema;

    {
public class OracleDataTypeManager extends SQLObjectEditor<OracleDataType, OracleSchema> {
    }
        createOrReplaceProcedureQuery(monitor, executionContext, actionList, objectChangeCommand.getObject());
        OracleDataType dataType = new OracleDataType(
            false);
                    "Create type body",
    public DBSObjectCache<? extends DBSObject, OracleDataType> getObjectsCache(@NotNull OracleDataType object) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    {
        @NotNull DBRProgressMonitor monitor,
        if (!CommonUtils.isEmpty(header)) {
    }



    }
    ) {
        );
 *
            schema,
                new SQLDatabasePersistAction(
    }
        }
    {
        String header = OracleUtils.normalizeSourceName(monitor, dataType, false);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
import org.jkiss.code.Nullable;
 * limitations under the License.
            actionList.add(
    {
 * You may obtain a copy of the License at
        @NotNull List<DBEPersistAction> actionList,
 */
        String body = OracleUtils.normalizeSourceName(monitor, dataType, true);
    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
/*
import java.util.Map;

    @Override
    @Override
 * See the License for the specific language governing permissions and
                    "Create type header",
    }
            new SQLDatabasePersistAction("Drop type",
    public boolean canCreateObject(@NotNull Object container) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        actions.add(
    }
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * OracleDataTypeManager
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand objectChangeCommand, @NotNull Map<String, Object> options)
import org.jkiss.utils.CommonUtils;
        @NotNull OracleDataType dataType
import java.util.List;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

        }
        OracleSchema schema = (OracleSchema) container;
/**
        if (!CommonUtils.isEmpty(body)) {
 */
        return object.getSchema().dataTypeCache;
}
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.ext.oracle.model.OracleUtils;
