 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
public class DamengTableManager extends GenericTableManager implements DBEObjectRenamer<GenericTableBase> {
    }
        if (object.isView()) {

import java.util.Map;
                        "Rename table",
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;

import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * limitations under the License.
    public boolean canEditObject(@NotNull GenericTableBase object) {

        actions.add(
    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 *
        }
        );
import org.jkiss.dbeaver.model.DBUtils;
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull SQLObjectEditor<GenericTableBase, GenericStructContainer>.ObjectRenameCommand command, @NotNull Map<String, Object> options) {

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                                " RENAME TO " + DBUtils.getQuotedIdentifier(dataSource, command.getNewName()))
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
            throw new DBException("View rename is not supported");
 *
 */

 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.dameng.edit;
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                        "ALTER TABLE " + (command.getObject().getSchema() != null ?

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    protected boolean isIncludeDropInDDL(GenericTableBase table) {
import java.util.List;
import org.jkiss.dbeaver.DBException;
 * See the License for the specific language governing permissions and
/*
/**
        return false;
    @Override

import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
        return true;
 * You may obtain a copy of the License at
 *
}
    }
 * DBeaver - Universal Database Manager
                                        + "." : "") + DBUtils.getQuotedIdentifier(dataSource, command.getOldName()) +
        final GenericDataSource dataSource = command.getObject().getDataSource();
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 */
    public void renameObject(DBECommandContext commandContext, GenericTableBase object, Map<String, Object> options, String newName) throws DBException {
                                DBUtils.getQuotedIdentifier(dataSource, command.getObject().getSchema().getName())
import org.jkiss.dbeaver.ext.generic.edit.GenericTableManager;
 * @author Shengkai Bai
    @Override
        processObjectRename(commandContext, object, options, newName);
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
                new SQLDatabasePersistAction(
    @Override
