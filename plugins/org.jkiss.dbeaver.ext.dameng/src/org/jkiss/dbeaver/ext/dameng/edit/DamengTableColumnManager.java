                        "ALTER TABLE " + column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " RENAME "
            addColumnCommentAction(actions, command.getObject(), command.getObject().getParentObject());

import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;

import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.DBUtils;
    }
                                DBUtils.getQuotedIdentifier(column.getDataSource(), command.getOldName()) +
}
                        "Modify column",
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        actionList.add(
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * distributed under the License is distributed on an "AS IS" BASIS,
                        "ALTER TABLE " + column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " MODIFY " + getNestedDeclaration(monitor, column.getTable(), command, options)));
    @Override
 * DBeaver - Universal Database Manager
import java.util.List;
import org.jkiss.dbeaver.ext.generic.edit.GenericTableColumnManager;
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
                                + "COLUMN " +
    protected void addObjectCreateActions(DBRProgressMonitor monitor, DBCExecutionContext executionContext, List<DBEPersistAction> actions, SQLObjectEditor<GenericTableColumn, GenericTableBase>.ObjectCreateCommand command, Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    }


        processObjectRename(commandContext, object, options, newName);
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull SQLObjectEditor<GenericTableColumn, GenericTableBase>.ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
 */

    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull SQLObjectEditor<GenericTableColumn, GenericTableBase>.ObjectRenameCommand command, @NotNull Map<String, Object> options) {
    @Override
import java.util.Map;
                new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Override
        final DamengTableColumn column = (DamengTableColumn) command.getObject();
 *
                new SQLDatabasePersistAction(
        }
    @Override
        final GenericTableColumn column = command.getObject();
import org.jkiss.dbeaver.model.DBConstants;
package org.jkiss.dbeaver.ext.dameng.edit;
/*

 * you may not use this file except in compliance with the License.
 */
 * limitations under the License.
        super.addObjectCreateActions(monitor, executionContext, actions, command, options);
 *

public class DamengTableColumnManager extends GenericTableColumnManager implements DBEObjectRenamer<GenericTableColumn> {
                                " TO " + DBUtils.getQuotedIdentifier(column.getDataSource(), command.getNewName())));
    }
 * You may obtain a copy of the License at
                        "Rename column",
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (CommonUtils.isNotEmpty(command.getObject().getDescription())) {
 * @author Shengkai Bai
        }
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
import org.jkiss.dbeaver.ext.dameng.model.DamengTableColumn;
 * See the License for the specific language governing permissions and
 *
        if (command.getProperty(DBConstants.PROP_ID_DESCRIPTION) != null) {
        actions.add(

import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;

            addColumnCommentAction(actionList, column, column.getTable());
/**
import org.jkiss.utils.CommonUtils;
    public void renameObject(DBECommandContext commandContext, GenericTableColumn object, Map<String, Object> options, String newName) throws DBException {
