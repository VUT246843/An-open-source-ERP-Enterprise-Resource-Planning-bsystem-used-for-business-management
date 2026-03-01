import org.jkiss.code.NotNull;
            DBECommandContext commandContext,
    @Override
            @NotNull List<DBEPersistAction> actions,

            addColumnCommentAction(actions, command.getObject(), command.getObject().getParentObject());
            addColumnCommentAction(actions, column, column.getTable());

 *
                        + "COLUMN " + DBUtils.getQuotedIdentifier(column.getDataSource(), command.getOldName()) + " TO "
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            @NotNull DBRProgressMonitor monitor,
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.generic.edit.GenericTableColumnManager;
 * Licensed under the Apache License, Version 2.0 (the "License");
            @NotNull DBCExecutionContext executionContext,
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        }
    @Override
public class GBase8sTableColumnManager extends GenericTableColumnManager
            @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.DBException;
        }
    }
            @NotNull NestedObjectCommand<GenericTableColumn, PropertyHandler> command,
/**
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            Map<String, Object> options,
    @Override
    @Override
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            @NotNull Map<String, Object> options) {
    protected void addObjectModifyActions(
                        + DBUtils.getQuotedIdentifier(column.getDataSource(), command.getNewName())));
    public void renameObject(
            @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
        actionList.add(new SQLDatabasePersistAction("Modify column",
        processObjectRename(commandContext, object, options, newName);
            @NotNull DBCExecutionContext executionContext,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.gbase8s.edit;
import java.util.Map;
            @NotNull DBCExecutionContext executionContext,

    }
import org.jkiss.dbeaver.model.DBConstants;
                "ALTER TABLE " + column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " RENAME "
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
        final GenericTableColumn column = command.getObject();
import org.jkiss.utils.CommonUtils;
            @NotNull Map<String, Object> options) throws DBException {
 */
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
            @NotNull DBCExecutionContext executionContext,
            String newName) throws DBException {
 *
        GenericTableColumn column = command.getObject();
        super.addObjectCreateActions(monitor, executionContext, actions, command, options);
        if (CommonUtils.isNotEmpty(command.getObject().getDescription())) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

    }
 * DBeaver - Universal Database Manager
            GenericTableColumn object,
    protected void addObjectRenameActions(
        implements DBEObjectRenamer<GenericTableColumn> {
 * @author Chao Tian
            GenericTableColumn column = command.getObject();
    protected void addObjectCreateActions(
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
                "ALTER TABLE " + column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " MODIFY "


import org.jkiss.dbeaver.model.DBUtils;
 *
 * you may not use this file except in compliance with the License.
            @NotNull List<DBEPersistAction> actionList,
        // Add column comment action if column description is specified
            @NotNull SQLObjectEditor<GenericTableColumn, GenericTableBase>.ObjectChangeCommand command,
    protected void addObjectExtraActions(
            @NotNull List<DBEPersistAction> actions,
                        + getNestedDeclaration(monitor, column.getTable(), command, options)));
        if (command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {
            @NotNull DBRProgressMonitor monitor,
            @NotNull Map<String, Object> options) throws DBException {
 * Unless required by applicable law or agreed to in writing, software
    }
        actions.add(new SQLDatabasePersistAction("Rename column",
 */

 * You may obtain a copy of the License at
import java.util.List;

            @NotNull SQLObjectEditor<GenericTableColumn, GenericTableBase>.ObjectCreateCommand command,
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
            @NotNull SQLObjectEditor<GenericTableColumn, GenericTableBase>.ObjectRenameCommand command,
            @NotNull List<DBEPersistAction> actions,
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.edit.DBECommandContext;
}
    }
/*
            @NotNull DBRProgressMonitor monitor,
