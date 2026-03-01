import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
import java.util.Collection;
                        " TO " + DBUtils.getQuotedIdentifier(dataSource, command.getNewName())) //$NON-NLS-1$
            actions.add(
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                    "Rename table",
        GenericTableForeignKey.class,
        return super.getChildObjects(monitor, object, childType);
        GenericTableColumn.class,
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
    }
 * DBeaver - Universal Database Manager


import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * Licensed under the Apache License, Version 2.0 (the "License");


import org.jkiss.dbeaver.ext.generic.edit.GenericTableManager;
    @NotNull
    );
        processObjectRename(commandContext, object, options, newName);
        return CHILD_TYPES;
            );
        if (container != null) {
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
    @Override
import java.util.Map;
                    "RENAME TABLE " + DBUtils.getFullyQualifiedName(dataSource, container.getName(), command.getOldName()) + //$NON-NLS-1$
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        GenericTableBase tableBase = command.getObject();
        DB2IConstraint.class,
import java.util.List;
import org.jkiss.dbeaver.ext.db2.i.model.DB2IConstraint;
 *
    }

        if (childType == DB2IConstraint.class) {
    public Class<? extends DBSObject>[] getChildTypes() {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
                new SQLDatabasePersistAction(
package org.jkiss.dbeaver.ext.db2.i.edit;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.utils.CommonUtils;
        }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * See the License for the specific language governing permissions and
public class DB2ITableManager extends GenericTableManager implements DBEObjectRenamer<GenericTableBase> {
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull GenericTableBase object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(

 * Copyright (C) 2010-2024 DBeaver Corp and others
        GenericDataSource dataSource = tableBase.getDataSource();
    public Collection<? extends DBSObject> getChildObjects(DBRProgressMonitor monitor, GenericTableBase object, Class<? extends DBSObject> childType) throws DBException {
    @Override
import org.jkiss.dbeaver.model.DBUtils;
        GenericTableIndex.class
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    @Override
import org.jkiss.dbeaver.ext.generic.model.*;
import org.jkiss.dbeaver.DBException;
/*

 *
        GenericStructContainer container = tableBase.getParentObject();
    @Override
            return object.getConstraints(monitor);
}
        }
