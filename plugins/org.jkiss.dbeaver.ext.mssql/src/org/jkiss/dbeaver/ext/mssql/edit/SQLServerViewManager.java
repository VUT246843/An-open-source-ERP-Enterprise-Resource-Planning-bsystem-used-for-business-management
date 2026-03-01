public class SQLServerViewManager extends SQLServerBaseTableManager<SQLServerView> {
import org.jkiss.dbeaver.model.DBUtils;
        processObjectRename(commandContext, object, options, newName);
        return SQLTableManager.BASE_VIEW_NAME;
        }

    }
        if (CommonUtils.isEmpty(object.getName())) {
import org.jkiss.dbeaver.DBException;
        createOrReplaceViewQuery(monitor, executionContext, actions, command.getObject(), ViewAction.CREATE);

        switch (action) {

    }
            createOrReplaceViewQuery(monitor, executionContext, actionList, command.getObject(), ViewAction.ALTER);
        createOrReplaceViewQuery(monitor, executionContext, actions, command.getObject(), ViewAction.DROP);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
    private void createOrReplaceViewQuery(DBRProgressMonitor monitor, DBCExecutionContext executionContext, List<DBEPersistAction> actions, SQLServerView view, ViewAction action)
 */
    protected void addStructObjectCreateActions(DBRProgressMonitor monitor, DBCExecutionContext executionContext, List<DBEPersistAction> actions, StructCreateCommand command, Map<String, Object> options) throws DBException {
    {
    }
        return newView;
        if (addUse) {
                actions.add(new SQLDatabasePersistAction("Create view", view.getName()));
    {
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
    }
    }
        if (command.getProperties().size() > 1 || command.getProperty(DBConstants.PROP_ID_DESCRIPTION) == null) {
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
    enum ViewAction {
 * DBeaver - Universal Database Manager

 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.List;
            actions.add(new SQLDatabasePersistAction("Set current database ", "USE " + DBUtils.getQuotedIdentifier(defaultDatabase), false)); //$NON-NLS-2$
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull SQLServerView object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
}
/*
import org.jkiss.dbeaver.model.DBConstants;

        }
        }
 *
import org.jkiss.dbeaver.ext.mssql.model.SQLServerSchema;
                break;
    @Override
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.ext.mssql.model.SQLServerView;
    }

import org.jkiss.utils.CommonUtils;
            case DROP:

    public Class<? extends DBSObject>[] getChildTypes() {
        setNewObjectName(monitor, (SQLServerSchema) container, newView);
        SQLServerView newView = new SQLServerView((SQLServerSchema) container);
            throw new DBException("View name cannot be empty");
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * you may not use this file except in compliance with the License.
    @Override
    @Override
        }
    @Override

    protected String getBaseObjectName() {
    }
                actions.add(new SQLDatabasePersistAction("Alter view", SQLServerUtils.changeCreateToAlterDDL(view.getDataSource(), view.getDDL())));
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return new Class[0];
    protected SQLServerView createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options)

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

import org.jkiss.dbeaver.ext.mssql.model.SQLServerExecutionContext;
                break;
package org.jkiss.dbeaver.ext.mssql.edit;

    protected void validateObjectProperty(SQLServerView object, DBPPropertyDescriptor property, Object value) throws DBException {
import org.jkiss.dbeaver.ext.mssql.model.SQLServerDatabase;
 * SQLServerViewManager
 * limitations under the License.
 */
import java.util.Map;
        }

    @NotNull
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
            actions.add(new SQLDatabasePersistAction("Set current database", "USE " + DBUtils.getQuotedIdentifier(procDatabase), false)); //$NON-NLS-2$
    @Override
    }
            case CREATE:
/**
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
        ALTER,
        CREATE,
import org.jkiss.code.NotNull;

        boolean addUse = defaultDatabase != null && procDatabase != null && defaultDatabase != procDatabase;
            case ALTER:

    @Override
        SQLServerDatabase procDatabase = view.getContainer().getDatabase();
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        SQLServerDatabase defaultDatabase = ((SQLServerExecutionContext)executionContext).getDefaultCatalog();

    @Override
                break;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
                actions.add(new SQLDatabasePersistAction("Drop view", "DROP VIEW " + view.getFullyQualifiedName(DBPEvaluationContext.DDL))); //$NON-NLS-2$
        if (addUse) {
        DROP
 *
