    }
        boolean withData = mview.isWithData();
        super.createOrReplaceViewQuery(monitor, actions, view, options);
 */

 *

        PostgreMaterializedView mview = (PostgreMaterializedView) view;
    public void appendViewDeclarationPostfix(DBRProgressMonitor monitor, StringBuilder sqlBuf, PostgreViewBase view) {
 * limitations under the License.
        setNewObjectName(monitor, schema, newMV);
            super.addObjectModifyActions(monitor, executionContext, actionList, command, options);
 * Unless required by applicable law or agreed to in writing, software
            sqlBuf.append("\nWITH(").append(String.join("," , relOptions)).append(")");
    @Override
        if (tablespace  != null) {
import org.jkiss.code.NotNull;
public class PostgreMViewManager extends PostgreViewManager {
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.DBPEvaluationContext;
import java.util.Map;
        if (command.hasProperty("tablespace")) {
        PostgreMaterializedView mview = (PostgreMaterializedView)view;
    @Override

    }
 *
    }
    protected String getBaseObjectName() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        newMV.setName("new_mview"); //$NON-NLS-1$

import org.jkiss.dbeaver.ext.postgresql.model.PostgreMaterializedView;
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
        }
            final String alterPrefix = "ALTER " + mView.getTableTypeName() + " " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL) + " ";

import org.jkiss.dbeaver.model.edit.DBEPersistAction;

 */
            super.addObjectDeleteActions(monitor, executionContext, actionList, new ObjectDeleteCommand(mView, "Drop view"), options);
            sqlBuf.append("\nTABLESPACE ").append(DBUtils.getQuotedIdentifier(tablespace));
    protected void createOrReplaceViewQuery(DBRProgressMonitor monitor, List<DBEPersistAction> actions, PostgreViewBase view, Map<String, Object> options) throws DBException {
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBConstants;
        if (!command.hasProperty(DBConstants.PROP_ID_DESCRIPTION) || command.getProperties().size() > 1) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * you may not use this file except in compliance with the License.
 * PostgreViewManager
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;


import org.jkiss.dbeaver.ext.postgresql.model.PostgreTablespace;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreViewBase;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        sqlBuf.append("\n").append(withData ? "WITH DATA" : "WITH NO DATA");
        PostgreMaterializedView newMV = new PostgreMaterializedView(schema);
import java.util.List;
        final PostgreMaterializedView mView = (PostgreMaterializedView) command.getObject();
        PostgreTablespace tablespace = mview.getTablespace(monitor);
    @Override
    public void appendViewDeclarationPrefix(DBRProgressMonitor monitor, StringBuilder sqlBuf, PostgreViewBase view) throws DBException {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        // Indexes DDL
        }
 * See the License for the specific language governing permissions and

    protected PostgreMaterializedView createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
 * You may obtain a copy of the License at
            actionList.add(new SQLDatabasePersistAction(alterPrefix + "SET TABLESPACE " + mView.getTablespace(monitor).getName()));
        }
/**
import org.jkiss.dbeaver.DBException;
    }
        }
    @Override
 *
import org.jkiss.utils.ArrayUtils;
        return newMV;
        if (!ArrayUtils.isEmpty(relOptions)) {
    @Override
package org.jkiss.dbeaver.ext.postgresql.edit;
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * Licensed under the Apache License, Version 2.0 (the "License");
        String[] relOptions = mview.getRelOptions();
        return SQLTableManager.BASE_MATERIALIZED_VIEW_NAME;
/*
    @Override
import org.jkiss.dbeaver.model.edit.DBECommandContext;

}
        PostgreSchema schema = (PostgreSchema)container;
