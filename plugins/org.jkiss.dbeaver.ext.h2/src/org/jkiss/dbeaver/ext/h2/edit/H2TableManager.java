        }
        GenericTableBase tableBase = command.getObject();
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
                    "Rename table",
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                    "ALTER TABLE " + DBUtils.getFullyQualifiedName(dataSource, container.getName(), command.getOldName()) + //$NON-NLS-1$
 */
    @Override

 *
 * You may obtain a copy of the License at


 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
import java.util.Collection;

    }
        processObjectRename(commandContext, object, options, newName);
    }
        GenericTableForeignKey.class,
 *
import org.jkiss.dbeaver.ext.h2.model.H2Constraint;
public class H2TableManager extends GenericTableManager implements DBEObjectRenamer<GenericTableBase> {
import org.jkiss.dbeaver.DBException;
    public Class<? extends DBSObject>[] getChildTypes() {
}
 * you may not use this file except in compliance with the License.
        return CHILD_TYPES;
            actions.add(
        GenericTableIndex.class
            );

import org.jkiss.dbeaver.model.struct.DBSObject;
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
        }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.generic.edit.GenericTableManager;
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
import org.jkiss.dbeaver.model.DBUtils;
    }
package org.jkiss.dbeaver.ext.h2.edit;
        if (childType == H2Constraint.class) {
    @Override
import org.jkiss.dbeaver.ext.generic.model.*;
        GenericDataSource dataSource = tableBase.getDataSource();
import java.util.List;
    public Collection<? extends DBSObject> getChildObjects(DBRProgressMonitor monitor, GenericTableBase object, Class<? extends DBSObject> childType) throws DBException {
 * limitations under the License.
                        " RENAME TO " + DBUtils.getQuotedIdentifier(dataSource, command.getNewName())) //$NON-NLS-1$

    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull GenericTableBase object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            return object.getConstraints(monitor);
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
 * Unless required by applicable law or agreed to in writing, software

    @NotNull
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        return super.getChildObjects(monitor, object, childType);
import org.jkiss.utils.CommonUtils;
import java.util.Map;
    @Override
        GenericStructContainer container = tableBase.getParentObject();
 * distributed under the License is distributed on an "AS IS" BASIS,
    );
 *
    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        if (container != null) {
    @Override
        GenericTableColumn.class,
        H2Constraint.class,

