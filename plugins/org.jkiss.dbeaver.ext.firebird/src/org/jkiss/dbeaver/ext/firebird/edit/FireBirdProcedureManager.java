    @Override
    }
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options) throws DBException {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Map;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    @Override
                new SQLDatabasePersistAction("Create procedure", procedure.getSource()));
        return true;
    private void createOrReplaceProcedureQuery(List<DBEPersistAction> actions, GenericProcedure procedure)
        GenericProcedure object = command.getObject();

package org.jkiss.dbeaver.ext.firebird.edit;


import org.jkiss.dbeaver.ext.generic.edit.GenericProcedureManager;
    }
            throw new DBException("Procedure name cannot be empty");
    @Override
 * you may not use this file except in compliance with the License.
/*
        actions.add(
    }

import org.jkiss.code.NotNull;
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options){

    }
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
    }
    @Override
 *



        if (CommonUtils.isEmpty(command.getObject().getSource())) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.utils.CommonUtils;
 *
 */
 *
    public boolean canEditObject(@NotNull GenericProcedure object) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    {
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
public class FireBirdProcedureManager extends GenericProcedureManager {

import org.jkiss.dbeaver.DBException;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    }
import java.util.List;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        );
 * limitations under the License.
 * DBeaver - Universal Database Manager
            throw new DBException("Procedure body cannot be empty");
                new SQLDatabasePersistAction("Drop procedure", "DROP " + object.getProcedureType().name() + " " + object.getName()) //$NON-NLS-2$
        if (CommonUtils.isEmpty(command.getObject().getName())) {
 * You may obtain a copy of the License at
        }
        actions.add(
        createOrReplaceProcedureQuery(actions, command.getObject());
}import org.jkiss.dbeaver.ext.generic.model.GenericProcedure;
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
        createOrReplaceProcedureQuery(actionList, command.getObject());
