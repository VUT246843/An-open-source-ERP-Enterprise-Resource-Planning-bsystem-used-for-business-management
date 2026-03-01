        List<DBEPersistAction> actions,
 *
        actions.add(new SQLDatabasePersistAction("Create Procedure", procedure.getSource()));
 *
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    protected void addObjectCreateActions(
    public boolean canDeleteObject(GenericProcedure object) {
        @NotNull Map<String, Object> options
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,

package org.jkiss.dbeaver.ext.cubrid.edit;
        @NotNull DBRProgressMonitor monitor,
        actionList.add(new SQLDatabasePersistAction("Modify Procedure", procedure.getSource()));
        return isCurrentUser || !dataSource.isShard();
 */

import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        final Object container,
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
    @Override
 * limitations under the License.
        @NotNull ObjectChangeCommand objectChangeCommand,
import java.util.Map;
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.ext.cubrid.model.CubridProcedure;
    protected GenericProcedure createDatabaseObject(
        Map<String, Object> options
            ? DBSProcedureType.FUNCTION : DBSProcedureType.PROCEDURE;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.generic.model.GenericProcedure;
import org.jkiss.dbeaver.ext.cubrid.model.CubridUser;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    @Override
        return !((CubridDataSource) object.getDataSource()).isShard();
 * you may not use this file except in compliance with the License.
import java.util.List;
    ) {
        @NotNull Map<String, Object> options
    }

import org.jkiss.code.NotNull;

    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.generic.edit.GenericProcedureManager;
    public boolean canEditObject(GenericProcedure object) {
        boolean isCurrentUser = user.getName().equalsIgnoreCase(dataSource.getCurrentUser());
}
 * See the License for the specific language governing permissions and
        CubridUser user = (CubridUser) container;

import org.jkiss.dbeaver.ext.cubrid.model.CubridDataSource;


    protected void addObjectModifyActions(
public class CubridProcedureManager extends GenericProcedureManager {
        String type = options.get("container").toString();
    ) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 *
        @NotNull List<DBEPersistAction> actionList,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        DBSProcedureType procedureType = type.equals("Functions")

    }
        Object from,
        CubridDataSource dataSource = (CubridDataSource) user.getDataSource();
        CubridProcedure procedure = (CubridProcedure) objectChangeCommand.getObject();
        @NotNull DBRProgressMonitor monitor,
        return new CubridProcedure((GenericStructContainer) container, procedureType);
    }
        @NotNull DBCExecutionContext executionContext,
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        ObjectCreateCommand command,
        CubridProcedure procedure = (CubridProcedure) command.getObject();
        @NotNull DBCExecutionContext executionContext,
        @NotNull DBECommandContext context,
/*
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
        return !((CubridDataSource) object.getDataSource()).isShard();
    public boolean canCreateObject(@NotNull Object container) {
    ) throws DBCException {
    @Override
    @Override
