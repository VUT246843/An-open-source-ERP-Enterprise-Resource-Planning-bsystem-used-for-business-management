    }
import org.jkiss.dbeaver.ext.sqlite.model.SQLiteTable;

 * DBeaver - Universal Database Manager
    }
    public void deleteObject(@NotNull DBECommandContext commandContext, @NotNull GenericTableForeignKey object, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.messages.ModelMessages;
import org.jkiss.dbeaver.ext.generic.edit.GenericForeignKeyManager;
    @Override
        ObjectDeleteCommand deleteCommand = new ObjectDeleteCommand(object, ModelMessages.model_jdbc_delete_object);
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) throws DBException {
    public boolean canDeleteObject(@NotNull GenericTableForeignKey object) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            SQLiteUtils.makeRecreateTableCommand(commandContext, table, deleteCommand);
        throw new DBException("Forein key modification needs table recreation");
    }
    @Override
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.sqlite.SQLiteUtils;
    protected void createObjectReferences(DBRProgressMonitor monitor, DBECommandContext commandContext, ObjectCreateCommand createCommand) throws DBException {
 * you may not use this file except in compliance with the License.
        throw new DBException("Forein key deletion needs table recreation");
        return true;
    @Override
    }

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        throw new DBException("Forein key creation needs table recreation");
import org.jkiss.dbeaver.DBException;

    @Override
 *

 * limitations under the License.
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBException {
 * See the License for the specific language governing permissions and
/*
    }
package org.jkiss.dbeaver.ext.sqlite.edit;
            true);
    public boolean canCreateObject(@NotNull Object container) {
        if (object.getTable() instanceof SQLiteTable table && table.isPersisted()) {
 *
    }
    @Override
    }

 
import org.jkiss.dbeaver.ext.generic.model.GenericTableForeignKey;
    }
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        return true;
        commandContext.addCommand(



    public boolean canEditObject(@NotNull GenericTableForeignKey object) {
        return true;
import java.util.List;
    @Override
 */
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
}
        if (createCommand.getObject().getTable() instanceof SQLiteTable table && table.isPersisted()) {
public class SQLiteTableForeignKeyManager extends GenericForeignKeyManager {
    @Override
            deleteCommand,
import java.util.Map;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.jkiss.code.NotNull;
            new DeleteObjectReflector<>(this),
import org.jkiss.dbeaver.model.DBUtils;
    @Override

        }
            SQLiteUtils.makeRecreateTableCommand(commandContext, table, createCommand);
