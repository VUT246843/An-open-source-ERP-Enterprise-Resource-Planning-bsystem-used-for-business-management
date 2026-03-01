import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
            // Column comments for the newly created table
            actions.add(new SQLDatabasePersistAction("Create view", viewText));
        final OracleView view = command.getObject();
//            throw new DBException("View definition cannot be empty");
                "Comment table",
            }

    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import java.util.Map;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.DBPDataSource;
        
}
        }
 * See the License for the specific language governing permissions and
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
        if (!hasComment || command.getProperties().size() > 1) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return newView;
    @NotNull
    protected String getBaseObjectName() {
 * You may obtain a copy of the License at
    @Override
 *
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        if (!(hasComment && command.getProperties().size() == 1) && CommonUtils.getOption(options, DBPScriptObject.OPTION_OBJECT_SAVE)) { // Add column comments only in save case
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        OracleTableForeignKey.class);
    }

    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
    protected OracleView createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) {

import org.jkiss.dbeaver.model.sql.SQLScriptElement;
        }
        OracleView newView = new OracleView(schema, "NEW_VIEW"); //$NON-NLS-1$
    }
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
//        }
import org.jkiss.dbeaver.model.struct.DBSObject;
                    OracleTableColumnManager.addColumnCommentAction(actions, column, view);
                    " IS '" + CommonUtils.notEmpty(view.getComment()) + "'"));
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPScriptObject;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                return;
import java.util.List;
    }
        return SQLTableManager.BASE_VIEW_NAME;
 *
        return FEATURE_EDITOR_ON_CREATE;

        }
            new SQLDatabasePersistAction("Drop view", "DROP VIEW " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-2$
        return (DBSObjectCache) object.getSchema().tableCache;
        setNewObjectName(monitor, schema, newView);
    private void createOrReplaceViewQuery(DBRProgressMonitor monitor, @NotNull List<DBEPersistAction> actions, DBECommandComposite<OracleView, PropertyHandler> command, Map<String, Object> options) throws DBException {
    @Override
    @Override
                // In this case we already have and view definition, and view/columns comments
            throw new DBException("View name cannot be empty");
import org.jkiss.dbeaver.model.sql.parser.SQLScriptParser;

    protected void addStructObjectCreateActions(DBRProgressMonitor monitor, DBCExecutionContext executionContext, List<DBEPersistAction> actions, StructCreateCommand command, Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.edit.prop.DBECommandComposite;
    public Class<? extends DBSObject>[] getChildTypes() {
 * OracleViewManager
//        if (CommonUtils.isEmpty(command.getObject().getViewText())) {

        OracleSchema schema = (OracleSchema) container;
    }

    }
/*
/**
import org.jkiss.utils.CommonUtils;
    }

 * limitations under the License.

                }
            }
                }
 * DBeaver - Universal Database Manager
            }

import org.jkiss.code.Nullable;

    }
            if (sqlScriptElements.size() > 1) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            for (OracleTableColumn column : CommonUtils.safeCollection(view.getAttributes(monitor))) {
import org.jkiss.dbeaver.DBException;
            while (viewText.endsWith(";")) {
                if (!CommonUtils.isEmpty(column.getComment(monitor))) {
        newView.setViewText("CREATE OR REPLACE VIEW " + newView.getFullyQualifiedName(DBPEvaluationContext.DDL) + " AS\nSELECT 1 AS A FROM DUAL");
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    @Override
                "COMMENT ON TABLE " + view.getFullyQualifiedName(DBPEvaluationContext.DDL) +
        }
import org.jkiss.dbeaver.ext.oracle.model.*;
        );

    @Override
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Override

        return CHILD_TYPES;

    @Override
        actions.add(
    public DBSObjectCache<? extends DBSObject, OracleView> getObjectsCache(OracleView object) {
                for (SQLScriptElement scriptElement : sqlScriptElements) {
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
        createOrReplaceViewQuery(monitor, actionList, command, options);
 *
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        boolean hasComment = command.hasProperty("comment");
                viewText = viewText.substring(0, viewText.length() - 1);
 */

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
package org.jkiss.dbeaver.ext.oracle.edit;
            String viewText = view.getViewText().trim();
        if (CommonUtils.isEmpty(command.getObject().getName())) {
        OracleTableConstraint.class,
        throws DBException {


public class OracleViewManager extends SQLTableManager<OracleView, OracleSchema> {
                    actions.add(new SQLDatabasePersistAction("Create view part", scriptElement.getText()));
        createOrReplaceViewQuery(monitor, actions, command, options);
            List<SQLScriptElement> sqlScriptElements = SQLScriptParser.parseScript(view.getDataSource(), viewText);
        if (hasComment || (CommonUtils.getOption(options, DBPScriptObject.OPTION_OBJECT_SAVE) && CommonUtils.isNotEmpty(view.getComment()))) {
    @Nullable
    @Override
