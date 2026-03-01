        }
 * Unless required by applicable law or agreed to in writing, software
 */
            ((GenericView) viewImpl).setObjectDefinitionText("\n");

            + DBUtils.getQuotedIdentifier(view.getDataSource(), view.getName()) + " OWNER TO "
    @Override
        if (command.getProperties().size() > 1 || command.getProperty("schema") == null) {
}
        @NotNull ObjectCreateCommand command,
        String schemaName = isSupportMultiSchema ? DBUtils.getQuotedIdentifier(view.getContainer()) + "." : "";
    @Override

import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.sql.SQLUtils;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        if (viewDDL == null) {
        if (!((CubridDataSource) object.getDataSource()).isShard()) {
        boolean hasComment = command.hasProperty(DBConstants.PROP_ID_DESCRIPTION);
 *     http://www.apache.org/licenses/LICENSE-2.0
                boolean isSupportMultiSchema = view.getDataSource().getSupportMultiSchema();
        }
        boolean isDBAGroup = dataSource.isDBAGroup();
import org.jkiss.dbeaver.DBException;
    @Override
    ) {
    public boolean canRenameObject(GenericTableBase object) {
    public boolean canEditObject(GenericTableBase object) {
    @Override
        @NotNull List<DBEPersistAction> actions,
import org.jkiss.dbeaver.ext.cubrid.model.CubridUser;

        String currentUser = view.getDataSource().getCurrentUser();
import org.jkiss.dbeaver.model.DBUtils;
        ));
            if (command.hasProperty(DBConstants.PARAM_OBJECT_DEFINITION_TEXT)) {
    ) {
            if (hasComment && view.getDescription() != null) {
            query.append(viewDDL);
        @NotNull Map<String, Object> options
                query.append("\nCOMMENT = ").append(SQLUtils.quoteString(view, CommonUtils.notEmpty(view.getDescription())));
            if (view.getContainer() == view.getSchema()) {
            + " TO " + schemaName + DBUtils.getQuotedIdentifier(view.getDataSource(), command.getNewName())
        @NotNull DBECommandContext context,

            "Rename view",
            @NotNull ObjectChangeCommand command,
        actions.add(new SQLDatabasePersistAction(
        if (view.isPersisted()) {
        GenericStructContainer structContainer = (GenericStructContainer) container;
        @NotNull DBECommandContext commandContext,
            "ALTER VIEW " + (isSupportMultiSchema ? DBUtils.getQuotedIdentifier(view.getContainer()) + "." : "")
package org.jkiss.dbeaver.ext.cubrid.edit;
            "Change Owner",
            }
 * limitations under the License.

    protected GenericTableBase createDatabaseObject(
                String viewName = isSupportMultiSchema ? DBUtils.getQuotedIdentifier(view.getContainer()) + "."
 *
        boolean supportsMultiSchema = dataSource.getSupportMultiSchema();
        }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull DBRProgressMonitor monitor,
        @NotNull DBCExecutionContext executionContext,
        ));
        } else {
            @NotNull List<DBEPersistAction> actionList,
        StringBuilder query = new StringBuilder(200);
import org.jkiss.dbeaver.ext.generic.edit.GenericViewManager;
        @NotNull ObjectRenameCommand command,
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void renameObject(
        boolean isSupportMultiSchema = view.getDataSource().getSupportMultiSchema();
    ) throws DBException {
    @Override
            @NotNull DBCExecutionContext executionContext,
                return;
    }
            }
import org.jkiss.dbeaver.ext.generic.GenericConstants;
import org.jkiss.dbeaver.ext.generic.model.GenericView;
        CubridView view = (CubridView) command.getObject();
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.Map;
            "RENAME VIEW " + schemaName + DBUtils.getQuotedIdentifier(view.getDataSource(), command.getOldName())
        return !((CubridDataSource) object.getDataSource()).isShard();
import org.jkiss.dbeaver.model.DBConstants;
        @Nullable Object container,
    }
import org.jkiss.dbeaver.ext.cubrid.model.CubridDataSource;
    public boolean canCreateObject(@NotNull Object container) {
        return isDBAGroup || supportsMultiSchema || isCurrentUser || !dataSource.isShard();
    }
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;


            }
        @NotNull NestedObjectCommand<GenericTableBase, PropertyHandler> command,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
        @NotNull List<DBEPersistAction> actions,
        @NotNull DBECommandComposite<GenericTableBase, PropertyHandler> command
        actions.add(new SQLDatabasePersistAction("Create view", query.toString()));
            if (hasComment || view.getDescription() != null) {

            viewDDL = "";
    }
            @NotNull Map<String, Object> options) {
                query.append("ALTER VIEW " + viewName + " COMMENT = " + SQLUtils.quoteString(view, CommonUtils.notEmpty(view.getDescription())));
        boolean isSupportMultiSchema = view.getDataSource().getSupportMultiSchema();
            }
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
        }
    protected void addObjectModifyActions(

        createOrReplaceViewQuery(actions, command);
    @Override
        String tableName = getNewChildName(monitor, structContainer, SQLTableManager.BASE_VIEW_NAME);
            processObjectRename(commandContext, object, options, newName);
/*
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        String viewDDL = view.getDDL();
            @NotNull DBRProgressMonitor monitor,
    private void createOrReplaceViewQuery(
import org.jkiss.utils.CommonUtils;
        @NotNull DBRProgressMonitor monitor,
    ) {
        @NotNull List<DBEPersistAction> actions,
import org.jkiss.dbeaver.model.edit.prop.DBECommandComposite;

        @NotNull String newName
            if (!isDBAGroup || isSupportMultiSchema || currentUser.equalsIgnoreCase(schemaName)) {
                    : DBUtils.getQuotedIdentifier(view.getDataSource(), view.getName());
    }
        @NotNull DBCExecutionContext executionContext,

    public boolean canDeleteObject(GenericTableBase object) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    }

        @NotNull DBRProgressMonitor monitor,
    protected void addObjectCreateActions(
            }
        @NotNull GenericTableBase object,
        String schemaName = view.getSchema().getName();
    @Override
                return;
        @NotNull Map<String, Object> options,
        @NotNull DBCExecutionContext executionContext,
        @Nullable Object copyFrom,
    ) {
        @NotNull Map<String, Object> options
                query.append(viewDDL).append("\n");
        boolean isDBAGroup = view.getDataSource().isDBAGroup();
        CubridView view = (CubridView) command.getObject();
import org.jkiss.code.NotNull;
        return !((CubridDataSource) object.getDataSource()).isShard();

import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        } else {
        @NotNull List<DBEPersistAction> actions,
        return !((CubridDataSource) object.getDataSource()).isShard();
        boolean isCurrentUser = user.getName().equalsIgnoreCase(dataSource.getCurrentUser());
    ) {
    }
    }
    }
 * you may not use this file except in compliance with the License.
        if (viewImpl instanceof GenericView) {
        CubridDataSource dataSource = (CubridDataSource) user.getDataSource();
import org.jkiss.dbeaver.ext.cubrid.model.CubridView;
            + DBUtils.getQuotedIdentifier(view.getSchema())
    @NotNull
 * You may obtain a copy of the License at
    protected void addObjectExtraActions(
        CubridUser user = (CubridUser) container;
        @NotNull DBRProgressMonitor monitor,
        @NotNull Map<String, Object> options
                    + DBUtils.getQuotedIdentifier(view.getDataSource(), view.getName())
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
public class CubridViewManager extends GenericViewManager implements DBEObjectRenamer<GenericTableBase> {
    @Override
    }
    @Override
        CubridView view = (CubridView) command.getObject();
            query.append("CREATE VIEW " + view.getFullyQualifiedName(DBPEvaluationContext.DDL) + "\nAS ");
import org.jkiss.code.Nullable;
        @NotNull Map<String, Object> options
            structContainer, tableName, GenericConstants.TABLE_TYPE_VIEW, null);
            createOrReplaceViewQuery(actionList, command);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return viewImpl;
        if (!view.isPersisted()) {
        }
import java.util.List;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

    protected void addObjectRenameActions(
        GenericTableBase viewImpl = structContainer.getDataSource().getMetaModel().createTableOrViewImpl(
        }
        actions.add(new SQLDatabasePersistAction(
    @Override
 *
