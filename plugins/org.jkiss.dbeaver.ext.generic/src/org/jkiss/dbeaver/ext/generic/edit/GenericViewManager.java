    {
    }
 * DBeaver - Universal Database Manager
    {
        @NotNull DBRProgressMonitor monitor,
                GenericConstants.TABLE_TYPE_VIEW,
                "Drop view",
    {
                    " IS " + SQLUtils.quoteString(object, CommonUtils.notEmpty(object.getDescription()))));
package org.jkiss.dbeaver.ext.generic.edit;
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
    {
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
import org.jkiss.utils.CommonUtils;
    {
        actions.add(
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
import org.jkiss.code.NotNull;
    }
            ((GenericView) viewImpl).setObjectDefinitionText("CREATE VIEW " + viewImpl.getFullyQualifiedName(DBPEvaluationContext.DDL) + " AS SELECT 1 as A\n");
            new SQLDatabasePersistAction(
            if (dataSource instanceof GenericDataSource) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

public class GenericViewManager extends SQLObjectEditor<GenericTableBase, GenericStructContainer> {
                null);
            throw new DBException("View definition cannot be empty");
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        }
        }
        @NotNull List<DBEPersistAction> actions,
        if (container instanceof DBSObject) {
 *
            DBPDataSource dataSource = ((DBSObject) container).getDataSource();

        if (CommonUtils.isEmpty(command.getObject().getName())) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
                return ((GenericDataSource) dataSource).getMetaModel().supportsViews((GenericDataSource) dataSource);
        if (CommonUtils.isEmpty(command.getObject().getObjectDefinitionText(monitor, options))) {
 *
    {
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
import org.jkiss.dbeaver.model.DBConstants;
        final GenericView view = (GenericView)command.getObject();
    }
/**

        boolean hasComment = command.hasProperty(DBConstants.PROP_ID_DESCRIPTION);
import java.util.Map;
            throw new DBException("View name cannot be empty");
 * See the License for the specific language governing permissions and
        return "VIEW";
    {
    }
import org.jkiss.dbeaver.model.sql.SQLUtils;
    @Nullable
        GenericTableBase viewImpl = structContainer.getDataSource().getMetaModel().createTableOrViewImpl(structContainer, tableName,
        String tableName = getNewChildName(monitor, structContainer, SQLTableManager.BASE_VIEW_NAME);

        @NotNull NestedObjectCommand<GenericTableBase, PropertyHandler> command,
 */
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
                command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-2$
    @Override
    private void createOrReplaceViewQuery(List<DBEPersistAction> actions, DBECommandComposite<GenericTableBase, PropertyHandler> command)
import org.jkiss.dbeaver.ext.generic.model.GenericView;
        if (command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {

 *
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options)


        );
        }

        if (!hasComment || command.getProperties().size() > 1) {
        return viewImpl;
 */
    @Override
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
        if (viewImpl instanceof GenericView) {
        return object.getContainer().getTableCache();
        return super.canCreateObject(container);
            }
    @Override
    protected void addObjectExtraActions(
        GenericStructContainer structContainer = (GenericStructContainer) container;
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
        final GenericView view = (GenericView)command.getObject();
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
                "Comment view",
}
    ) {
import org.jkiss.dbeaver.model.DBPDataSource;
    protected GenericTableBase createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
        @NotNull Map<String, Object> options
    @Override
 * You may obtain a copy of the License at

                "COMMENT ON " + getViewType(object) + " " + object.getFullyQualifiedName(DBPEvaluationContext.DDL) +
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            throws DBException
import java.util.List;
        actions.add(new SQLDatabasePersistAction("Create view", view.getDDL()));
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    }
    protected String getViewType(GenericTableBase object) {

import org.jkiss.dbeaver.ext.generic.GenericConstants;
import org.jkiss.dbeaver.DBException;
    {
import org.jkiss.dbeaver.model.edit.prop.DBECommandComposite;

        @NotNull DBCExecutionContext executionContext,
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
    public boolean canCreateObject(@NotNull Object container) {
                "DROP " + getViewType(command.getObject()) + " " +
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            actionList.add(new SQLDatabasePersistAction("Create view", view.getDDL()));
            GenericTableBase object = command.getObject();
    @Override
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
            actions.add(new SQLDatabasePersistAction(
    @Override
    @Override
    }

    public DBSObjectCache<? extends DBSObject, GenericTableBase> getObjectsCache(GenericTableBase object)
    }
/*
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
 * you may not use this file except in compliance with the License.
        }

import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        return FEATURE_EDITOR_ON_CREATE;
 * Generic view manager
    }
        createOrReplaceViewQuery(actions, command);
import org.jkiss.code.Nullable;

