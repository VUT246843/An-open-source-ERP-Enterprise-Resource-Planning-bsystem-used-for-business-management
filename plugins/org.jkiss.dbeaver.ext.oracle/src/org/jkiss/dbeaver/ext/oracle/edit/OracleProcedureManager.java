}
    protected OracleProcedureStandalone createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object copyFrom, @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

        createOrReplaceProcedureQuery(monitor, executionContext, actions, objectCreateCommand.getObject());
package org.jkiss.dbeaver.ext.oracle.edit;
        }
 * OracleProcedureManager
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        return new OracleProcedureStandalone(
            new SQLDatabasePersistAction("Drop procedure",
public class OracleProcedureManager extends SQLObjectEditor<OracleProcedureStandalone, OracleSchema> {

    @Nullable

    @Override
        );
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
/*
        return FEATURE_EDITOR_ON_CREATE;
    {
 * You may obtain a copy of the License at
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
    @Override
    public DBSObjectCache<? extends DBSObject, OracleProcedureStandalone> getObjectsCache(OracleProcedureStandalone object)
            return;
        final OracleProcedureStandalone object = objectDeleteCommand.getObject();
import java.util.Map;
/**
    {
 * See the License for the specific language governing permissions and
            "NEW_PROCEDURE",
    @Override
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        OracleUtils.addSchemaChangeActions(executionContext, actionList, procedure);
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand objectCreateCommand, @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    {
import org.jkiss.dbeaver.model.struct.DBSObject;
            (OracleSchema) container,
        createOrReplaceProcedureQuery(monitor, executionContext, actionList, objectChangeCommand.getObject());
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        return object.getSchema().proceduresCache;
 *
    @Override
        String source = OracleUtils.normalizeSourceName(monitor, procedure, false);
                "DROP " + object.getProcedureType().name() + " " + object.getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-1$ //$NON-NLS-2$
        actionList.add(new OracleObjectValidateAction(procedure, OracleObjectType.PROCEDURE, "Create procedure", source)); //$NON-NLS-2$
        @NotNull List<DBEPersistAction> actionList,

 * limitations under the License.
    {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.oracle.model.*;
 *
    }
    }


    }
        @NotNull DBCExecutionContext executionContext,
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand objectChangeCommand, @NotNull Map<String, Object> options)


    @Override
    }
            DBSProcedureType.PROCEDURE);
        actions.add(
 * Unless required by applicable law or agreed to in writing, software
        @NotNull OracleProcedureStandalone procedure
 *

import org.jkiss.dbeaver.model.DBPDataSource;
    }
 */
    {
    ) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    private void createOrReplaceProcedureQuery(
import java.util.List;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 */

import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
    @Override
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand objectDeleteCommand, @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (source == null) {
