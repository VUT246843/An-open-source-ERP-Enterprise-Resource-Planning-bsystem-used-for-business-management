    public void renameObject(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected void addObjectCreateActions(
 *
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    @Override
        actions.add(
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        @NotNull ObjectCreateCommand command,
            " ADD COLUMN (" + getNestedDeclaration(monitor, table, command, options) + ")";
        @NotNull Map<String, Object> options
    @Override
    public boolean canRenameObject(GenericTableColumn object) {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
                    DBUtils.getQuotedIdentifier(column.getDataSource(), command.getOldName()) +
        actions.add(
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            new SQLDatabasePersistAction(
        @NotNull GenericTableColumn object,
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            new SQLDatabasePersistAction(
import java.util.Map;
    }
                    " TO " + DBUtils.getQuotedIdentifier(column.getDataSource(), command.getNewName())));
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.model.DBUtils;
 *
        @NotNull DBRProgressMonitor monitor,
        final GenericTableBase table = command.getObject().getParentObject();
        @NotNull ObjectRenameCommand command,

                "ALTER TABLE " + column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " RENAME COLUMN " +
        return true;

 */
                ModelMessages.model_jdbc_create_new_table_column,
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
    @Override
        @NotNull DBCExecutionContext executionContext,
/*
}
import org.jkiss.dbeaver.ext.generic.edit.GenericTableColumnManager;
                "Rename column",
    }

    }
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
    ) throws DBException {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        processObjectRename(commandContext, object, options, newName);
import java.util.List;
 * You may obtain a copy of the License at
public class AltibaseTableColumnManager extends GenericTableColumnManager 
 * you may not use this file except in compliance with the License.

    protected void addObjectRenameActions(
        @NotNull DBECommandContext commandContext,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull List<DBEPersistAction> actions,
    ) {
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
        @NotNull List<DBEPersistAction> actions,
 * limitations under the License.
    implements DBEObjectRenamer<GenericTableColumn> {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

        @NotNull String newName
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.altibase.edit;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
                sql));
import org.jkiss.dbeaver.model.messages.ModelMessages;
        @NotNull Map<String, Object> options,
        @NotNull DBCExecutionContext executionContext,
 * Licensed under the Apache License, Version 2.0 (the "License");
    ) {
        @NotNull Map<String, Object> options
        @NotNull DBRProgressMonitor monitor,


        final GenericTableColumn column = command.getObject();
        String sql = "ALTER TABLE " + DBUtils.getObjectFullName(table, DBPEvaluationContext.DDL) +
    

 *
