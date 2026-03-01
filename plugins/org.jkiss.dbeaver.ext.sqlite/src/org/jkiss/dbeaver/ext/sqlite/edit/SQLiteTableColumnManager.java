    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
    @Override
        }
        GenericTableColumn column, Map<String, Object> options
    @Override

import org.jkiss.dbeaver.ext.generic.edit.GenericTableColumnManager;
 * See the License for the specific language governing permissions and
import java.util.Map;

                "ALTER TABLE " + column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " RENAME "
        processObjectRename(commandContext, object, options, newName);
    }
            new DeleteObjectReflector<>(this),
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.ext.sqlite.edit;
    @Override
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
    ) {

 *     http://www.apache.org/licenses/LICENSE-2.0

            DataTypeModifier, sqliteDefaultModifier, NotNullModifier
            deleteCommand,
        final GenericTableColumn column = command.getObject();

 */
        actions.add(
import org.jkiss.dbeaver.model.messages.ModelMessages;
 * you may not use this file except in compliance with the License.
    @Override
        return true;
                    + "COLUMN " +
        ObjectDeleteCommand deleteCommand = new ObjectDeleteCommand(object, ModelMessages.model_jdbc_delete_object);
 *

    }
        return true;
        };
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        return new ColumnModifier[]{
        throw new DBException("Column deletion needs table recreation");

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
    public boolean canDeleteObject(@NotNull GenericTableColumn object) {

        if (object.getTable() instanceof SQLiteTable table && table.isPersisted()) {
        protected void appendDefaultValue(@NotNull StringBuilder sql, @NotNull String defaultValue, boolean useQuotes) {
                    " TO " + DBUtils.getQuotedIdentifier(column.getDataSource(), command.getNewName())));
            new SQLDatabasePersistAction(

    }
    protected SQLiteDefaultModifier sqliteDefaultModifier = new SQLiteDefaultModifier();
    }
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.ext.sqlite.model.SQLiteTable;

            SQLiteUtils.makeRecreateTableCommand(commandContext, table, deleteCommand);
            super.appendDefaultValue(sql, defaultValue, useQuotes);
public class SQLiteTableColumnManager extends GenericTableColumnManager implements DBEObjectRenamer<GenericTableColumn> {
    }
}

 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBUtils;
 * limitations under the License.
 *
            sql.append("(");
    @Override
            true);
        @Override
    }

import org.jkiss.dbeaver.ext.sqlite.SQLiteUtils;
            sql.append(")");
                    DBUtils.getQuotedIdentifier(column.getDataSource(), command.getOldName()) +
    }
 */
/**
 * SQLiteTableColumnManager
        }
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull GenericTableColumn object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
        commandContext.addCommand(
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean canCreateObject(@NotNull Object container) {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    }
    private class SQLiteDefaultModifier extends BaseDefaultModifier {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    protected ColumnModifier[] getSupportedModifiers(
    public void deleteObject(@NotNull DBECommandContext commandContext, @NotNull GenericTableColumn object, @NotNull Map<String, Object> options) throws DBException {
                "Rename column",
    @Override

import java.util.List;
/*
