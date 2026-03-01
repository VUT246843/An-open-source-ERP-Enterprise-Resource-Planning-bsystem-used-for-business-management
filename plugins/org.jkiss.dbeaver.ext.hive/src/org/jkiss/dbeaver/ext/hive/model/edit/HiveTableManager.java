            HiveIndex.class
        return super.getChildObjects(monitor, object, childType);
        );
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
public class HiveTableManager extends GenericTableManager implements DBEObjectRenamer<GenericTableBase> {
        super.addObjectDeleteActions(monitor, executionContext, actions, command, options);
    public Class<? extends DBSObject>[] getChildTypes() {
 * limitations under the License.
 * See the License for the specific language governing permissions and
    }
                new SQLDatabasePersistAction(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return;
                        "Rename table",

 * you may not use this file except in compliance with the License.

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    @NotNull
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                                " RENAME TO " + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getNewName())) //$NON-NLS-1$
    }
    @Override
            GenericUniqueKey.class,
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull GenericTableBase object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
import org.jkiss.dbeaver.ext.hive.model.HiveIndex;

import org.jkiss.code.NotNull;
            return object.getAttributes(monitor);
    public Collection<? extends DBSObject> getChildObjects(DBRProgressMonitor monitor, GenericTableBase object, Class<? extends DBSObject> childType) throws DBException {
                    new SQLDatabasePersistAction("Drop index table", "DROP INDEX " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL))); //$NON-NLS-2$
 * DBeaver - Universal Database Manager

    );
 *     http://www.apache.org/licenses/LICENSE-2.0

        return CHILD_TYPES;
    @Override
            GenericTableForeignKey.class,
        } else if (childType == HiveIndex.class) {
            HiveTableColumn.class,
import org.jkiss.dbeaver.DBException;
 *

        processObjectRename(commandContext, object, options, newName);
import org.jkiss.dbeaver.ext.hive.model.HiveTable;
import org.jkiss.dbeaver.ext.generic.edit.GenericTableManager;
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericTableForeignKey;
    @Override
 */


import org.jkiss.dbeaver.model.DBPEvaluationContext;
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
    }
import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
    @Override
                        "ALTER TABLE " + DBUtils.getQuotedIdentifier(command.getObject().getSchema()) + "." + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getOldName()) + //$NON-NLS-1$
        }
            return object.getIndexes(monitor);
import org.jkiss.utils.CommonUtils;
        }
        return !((HiveTable)object).isIndexTable();
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
import java.util.Collection;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
import java.util.List;
        if (childType == HiveTableColumn.class) {
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Override
    }
import java.util.Map;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    public boolean canDeleteObject(@NotNull GenericTableBase object) {
    }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (table.getTableType().equals("INDEX_TABLE")) {
 *
import org.jkiss.dbeaver.model.DBUtils;

package org.jkiss.dbeaver.ext.hive.model.edit;
        GenericTableBase table = command.getObject();

import org.jkiss.dbeaver.model.struct.DBSObject;
        actions.add(
            actions.add(
import org.jkiss.dbeaver.ext.hive.model.HiveTableColumn;
/*
