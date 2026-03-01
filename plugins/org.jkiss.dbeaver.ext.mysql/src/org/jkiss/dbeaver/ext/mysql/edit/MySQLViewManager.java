            if (viewDDL.endsWith(";")) {
 *
public class MySQLViewManager extends MySQLTableManager {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                viewDDL = viewDDL.substring(0, viewDDL.length() - 1); //$NON-NLS-1$
    @Override
    @Override

    {
            }
                super.beforeExecute(session);
import org.jkiss.dbeaver.model.edit.DBECommandContext;
package org.jkiss.dbeaver.ext.mysql.edit;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
/**
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                decl.append("CREATE");
 *
    }
    {
/*
    {
import org.jkiss.dbeaver.ext.mysql.model.MySQLView;

 * Copyright (C) 2010-2025 DBeaver Corp and others

        }
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
    protected void addStructObjectCreateActions(DBRProgressMonitor monitor, DBCExecutionContext executionContext, List<DBEPersistAction> actions, StructCreateCommand command, Map<String, Object> options)
    @Override
 * limitations under the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        StringBuilder decl = new StringBuilder(200);
 *
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import java.util.List;
        if (checkOption != null && checkOption != MySQLView.CheckOption.NONE) {
    }
    {
import org.jkiss.dbeaver.model.sql.parser.SQLSemanticProcessor;
                if (schemaView != view) {
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
    @Override
import org.jkiss.code.Nullable;
            throw new DBException("View definition cannot be empty");

            public void beforeExecute(DBCSession session) throws DBCException {
        if (CommonUtils.isEmpty(((MySQLView) object).getAdditionalInfo().getDefinition())) {
import org.jkiss.dbeaver.model.exec.DBCException;
    {
 * DBeaver - Universal Database Manager
        } else {

}
 * distributed under the License is distributed on an "AS IS" BASIS,
            viewDDL = "";
 * MySQLViewManager
        throws DBException

    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
    protected String getBaseObjectName() {

import org.jkiss.code.NotNull;
        
                decl.append("CREATE OR REPLACE");

        return object.getContainer().getTableCache();
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
                    throw new DBCException(e, session.getExecutionContext());
 * See the License for the specific language governing permissions and
            new SQLDatabasePersistAction("Drop view", "DROP VIEW " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-2$
import org.jkiss.dbeaver.model.DBUtils;

        if (CommonUtils.isEmpty(object.getName())) {
import org.jkiss.dbeaver.DBException;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (viewDDL == null) {
        MySQLView newView = new MySQLView(catalog);
    }
                .append("AS "); //$NON-NLS-1$

            @Override
        actions.add(
    private void createOrReplaceViewQuery(List<DBEPersistAction> actions, MySQLView view)

        final String lineSeparator = GeneralUtils.getDefaultLineSeparator();
    }
import org.jkiss.utils.CommonUtils;
            decl.append(viewDDL);
    {
        
                    throw new DBCException("View with name '" + view.getName() + "' already exists. Choose another name");
                try {
        setNewObjectName(monitor, catalog, newView);
    }
 * you may not use this file except in compliance with the License.
            }
        }

        MySQLCatalog catalog = (MySQLCatalog) container;
 * Unless required by applicable law or agreed to in writing, software
        if (!view.isPersisted() && SQLSemanticProcessor.isSelectQuery(view.getDataSource().getSQLDialect(), viewDDL)) {
import org.jkiss.dbeaver.utils.GeneralUtils;
    }
            throw new DBException("View name cannot be empty");
import java.util.Map;
            } else {

    @Nullable
        createOrReplaceViewQuery(actions, (MySQLView) command.getObject());
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
        }
                MySQLView schemaView;
        String viewDDL = view.getAdditionalInfo().getDefinition();
        createOrReplaceViewQuery(actionList, (MySQLView) command.getObject());
        });
            decl.append(viewDDL).append(lineSeparator).append("WITH ").append(checkOption.getDefinitionName()).append(" CHECK OPTION"); //$NON-NLS-1$ //$NON-NLS-2$
 */
            decl.append(" VIEW ").append(view.getFullyQualifiedName(DBPEvaluationContext.DDL)).append(lineSeparator) //$NON-NLS-1$
import org.jkiss.dbeaver.model.exec.DBCSession;
        );
    protected MySQLView createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options)
 */
    @Override

    {
            if (view.getDataSource().supportsAlterView()) {
    public DBSObjectCache<MySQLCatalog, MySQLTableBase> getObjectsCache(MySQLTableBase object)
        return newView;
    @Override
                }
                    schemaView = DBUtils.findObject(view.getParentObject().getViews(session.getProgressMonitor()), view.getName());
        }
        MySQLTableBase object = command.getObject();
            }
    @Override
    }
        }
                }
        return SQLTableManager.BASE_VIEW_NAME;
        actions.add(new SQLDatabasePersistAction("Create view", decl.toString()) {
                } catch (DBException e) {
        final MySQLView.CheckOption checkOption = view.getAdditionalInfo().getCheckOption();
