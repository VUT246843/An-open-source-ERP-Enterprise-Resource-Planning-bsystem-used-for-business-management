            if (sqlScriptElements.size() > 1) {
        }
        OracleMaterializedView view = command.getObject();
    @Override
                }
                    .append("AS ").append(mViewDefinition); //$NON-NLS-1$
        return FEATURE_EDITOR_ON_CREATE;
            List<SQLScriptElement> sqlScriptElements = SQLScriptParser.parseScript(view.getDataSource(), mViewDefinition);


 */
        newView.setCurrentDDLFormat(OracleDDLFormat.COMPACT);
    @Override
    public DBSObjectCache<? extends DBSObject, OracleMaterializedView> getObjectsCache(OracleMaterializedView object)
import java.util.List;
    }

                "COMMENT ON MATERIALIZED VIEW " + view.getFullyQualifiedName(DBPEvaluationContext.DDL) +
                // In this case we already have and view definition, and view/columns comments
    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        return SQLTableManager.BASE_MATERIALIZED_VIEW_NAME;
import org.jkiss.dbeaver.utils.GeneralUtils;
        if (CommonUtils.isEmpty(command.getObject().getName())) {
 * you may not use this file except in compliance with the License.
            new SQLDatabasePersistAction("Drop view", "DROP MATERIALIZED VIEW " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-2$
        createOrReplaceViewQuery(monitor, actions, command, options);
    private void createOrReplaceViewQuery(DBRProgressMonitor monitor, List<DBEPersistAction> actions, DBECommandComposite<OracleMaterializedView, PropertyHandler> command, Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
            }
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.struct.DBSObject;
        newView.setObjectDefinitionText("SELECT 1 FROM DUAL");
    }
package org.jkiss.dbeaver.ext.oracle.edit;
            }
 *
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            }
            if (mViewDefinition.contains("CREATE MATERIALIZED VIEW")) {

                if (!CommonUtils.isEmpty(column.getComment(monitor))) {
    protected OracleMaterializedView createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options)
        return (DBSObjectCache) object.getSchema().tableCache;
        return newView;
                    " IS " + SQLUtils.quoteString(view.getDataSource(), CommonUtils.notEmpty(view.getComment()))));
        actions.add(
 * Copyright (C) 2010-2025 DBeaver Corp and others
    {
        throws DBException
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.oracle.model.OracleMaterializedView;
    @Nullable
import org.jkiss.dbeaver.model.sql.parser.SQLScriptParser;
    @Override
 * See the License for the specific language governing permissions and
            } else {
                return;
 * limitations under the License.
/*
import org.jkiss.dbeaver.DBException;

    protected String getBaseObjectName() {
                if (mViewDefinition.endsWith(";")) mViewDefinition = mViewDefinition.substring(0, mViewDefinition.length() - 1);
 * DBeaver - Universal Database Manager
        );
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

        if (hasComment || (CommonUtils.getOption(options, DBPScriptObject.OPTION_OBJECT_SAVE) && CommonUtils.isNotEmpty(view.getComment()))) {
            for (OracleTableColumn column : CommonUtils.safeCollection(view.getAttributes(monitor))) {
                new SQLDatabasePersistAction("Create view", decl.toString()));
                    new SQLDatabasePersistAction("Drop view", "DROP MATERIALIZED VIEW " + view.getFullyQualifiedName(DBPEvaluationContext.DDL))); //$NON-NLS-2$

    }
                    actions.add(new SQLDatabasePersistAction("Create view part", scriptElement.getText()));
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        boolean hasComment = command.hasProperty("comment");
import org.jkiss.code.Nullable;

    @Override
            // Column comments for the newly created table
                }
import org.jkiss.dbeaver.model.sql.SQLUtils;
            String mViewDefinition = view.getMViewText().trim();

    @Override
            if (view.isPersisted()) {

import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        }
    {
    @Override
    }
import org.jkiss.dbeaver.ext.oracle.model.OracleDDLFormat;
        }
import org.jkiss.code.NotNull;
 *

    {

        OracleSchema schema = (OracleSchema) container;
    {
                    OracleTableColumnManager.addColumnCommentAction(actions, column, view);
    }

import org.jkiss.dbeaver.ext.oracle.model.OracleTableColumn;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            throw new DBException("View name cannot be empty"); //$NON-NLS-1$
        OracleMaterializedView newView = new OracleMaterializedView(schema, "NEW_MVIEW"); //$NON-NLS-1$

import org.jkiss.dbeaver.model.DBPScriptObject;
                "Comment view",
    }
        if (!hasComment || command.getProperties().size() > 1) {
import org.jkiss.dbeaver.model.DBPDataSource;
public class OracleMaterializedViewManager extends SQLObjectEditor<OracleMaterializedView, OracleSchema> {
        final String lineSeparator = GeneralUtils.getDefaultLineSeparator();
import org.jkiss.dbeaver.model.sql.SQLScriptElement;
import org.jkiss.dbeaver.ext.oracle.model.OracleSchema;
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)

        StringBuilder decl = new StringBuilder(200);
    {
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
    @Override
    }
}
            actions.add(new SQLDatabasePersistAction(
    @Override
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
                actions.add(
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBException {
import java.util.Map;
            actions.add(
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
        setNewObjectName(monitor, schema, newView);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                decl.append("CREATE MATERIALIZED VIEW ").append(view.getFullyQualifiedName(DBPEvaluationContext.DDL)).append(lineSeparator) //$NON-NLS-1$
                for (SQLScriptElement scriptElement : sqlScriptElements) {
 * Unless required by applicable law or agreed to in writing, software
        if (!(hasComment && command.getProperties().size() == 1) && CommonUtils.getOption(options, DBPScriptObject.OPTION_OBJECT_SAVE)) { // Add column comments only in save case
    }
import org.jkiss.dbeaver.model.edit.prop.DBECommandComposite;
 */
                decl.append(mViewDefinition);
 * OracleMaterializedViewManager
 * You may obtain a copy of the License at

        createOrReplaceViewQuery(monitor, actionList, command, options);
/**
            }
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
