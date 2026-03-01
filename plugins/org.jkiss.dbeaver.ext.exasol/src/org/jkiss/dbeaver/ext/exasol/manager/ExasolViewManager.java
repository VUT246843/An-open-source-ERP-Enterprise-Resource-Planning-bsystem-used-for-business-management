        ExasolView newView = new ExasolView(schema);
                new SQLDatabasePersistAction("Create view", view.getSource()));
                             @NotNull ExasolView object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
            );
import org.jkiss.dbeaver.ext.exasol.model.ExasolSchema;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 */
        }

import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
import java.util.List;
    }
        if (CommonUtils.isEmpty(((ExasolView) object).getSource())) {
    {
    }
    extends SQLObjectEditor<ExasolView, ExasolSchema> implements DBEObjectRenamer<ExasolView> {
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        actions.add(
            if (!CommonUtils.isEmpty(view.getDescription())) {
 * DBeaver - Universal Database Manager
            throw new DBException("View definition cannot be empty");
/*
                "Rename View",
        createOrReplaceViewQuery(actions, command.getObject(), false);
        return FEATURE_EDITOR_ON_CREATE;
        throws DBException
                                          @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
    public void renameObject(@NotNull DBECommandContext commandContext,
import org.jkiss.dbeaver.DBException;
        try {
                actions.add(
    @Override
        createOrReplaceViewQuery(actionList, command.getObject(), true);
        throws DBException {
    @Override

    }
        ExasolView object) {
    @Override
        setNewObjectName(monitor, schema, newView);
import java.util.Map;
                    DBUtils.getQuotedIdentifier(obj.getDataSource(), command.getNewName()))
    public DBSObjectCache<ExasolSchema, ExasolView> getObjectsCache(
 * you may not use this file except in compliance with the License.

    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
                    )
    @Override
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.ext.exasol.model.ExasolView;
import org.jkiss.dbeaver.model.exec.DBCException;
 *
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
public class ExasolViewManager
        return newView;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at


    @Override
                    new SQLDatabasePersistAction(
    @Override
                                          @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
        }
    @Override
    }
 *
                        )
 * Licensed under the Apache License, Version 2.0 (the "License");

                            ExasolUtils.quoteString(view.getDescription())
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        return object.getContainer().getViewCache();
        } catch (DBCException e) {
 * limitations under the License.
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        );
import org.jkiss.utils.CommonUtils;

                        String.format("COMMENT ON VIEW %s is '%s'",
    }

        ExasolView view = command.getObject();

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList,
        if (replace) {
                new SQLDatabasePersistAction("Drop view", "DROP VIEW " + view.getFullyQualifiedName(DBPEvaluationContext.DDL))

            actions.add(
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
            log.error(e);
                                          @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {

                            view.getFullyQualifiedName(DBPEvaluationContext.DDL),
import org.jkiss.code.NotNull;

                                          @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
                );
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (CommonUtils.isEmpty(object.getName())) {
        );
        processObjectRename(commandContext, object, options, newName);

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBUtils;

            throw new DBException("View name cannot be empty");
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
            actions.add(
 * See the License for the specific language governing permissions and
        newView.setObjectDefinitionText("CREATE OR REPLACE VIEW " + newView.getFullyQualifiedName(DBPEvaluationContext.DDL) + " AS\nSELECT");
        ExasolView obj = command.getObject();
            new SQLDatabasePersistAction("Drop view", "DROP VIEW " + view.getFullyQualifiedName(DBPEvaluationContext.DDL))
    }
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
package org.jkiss.dbeaver.ext.exasol.manager;
        }
    @Override
        }
        ExasolTableBase object = command.getObject();
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
            }
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
    }
    protected ExasolView createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options)
    @Override
    protected void createOrReplaceViewQuery(List<DBEPersistAction> actions, ExasolView view, Boolean replace) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        actions.add(

}
                "RENAME VIEW " + DBUtils.getQuotedIdentifier(obj.getSchema()) + "." + DBUtils.getQuotedIdentifier(obj.getDataSource(), command.getOldName()) + " to " +
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableBase;
        ExasolSchema schema = (ExasolSchema) container;
    }
        newView.setName("new_view");

            new SQLDatabasePersistAction(

