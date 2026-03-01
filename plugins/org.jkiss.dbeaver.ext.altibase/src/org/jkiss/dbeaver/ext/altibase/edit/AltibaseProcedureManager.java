    }
    
import java.util.Map;
        @NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container,
    @Override
import org.jkiss.utils.CommonUtils;

 *
/*
    public boolean canEditObject(@NotNull GenericProcedure object) {

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    
                "NEW_PROCEDURE",
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * DBeaver - Universal Database Manager
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command,


    protected GenericProcedure createDatabaseObject(

 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
        
import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.ext.altibase.edit;
        return true;
    }
        createOrReplaceProcedureQuery(actionList, command.getObject());
                                          @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
        }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
    public boolean canCreateObject(@NotNull Object container) {
}
                DBSProcedureType.PROCEDURE);

        return true;
 * Licensed under the Apache License, Version 2.0 (the "License");
            throw new DBException("Procedure body cannot be empty");
        if (CommonUtils.isEmpty(command.getObject().getName())) {
    }
import org.jkiss.dbeaver.ext.altibase.model.AltibaseProcedureStandAlone;
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericProcedure;
    private void createOrReplaceProcedureQuery(List<DBEPersistAction> actions, GenericProcedure procedure) {
        actions.add(new SQLDatabasePersistAction("Create procedure", procedure.getSource()));
 * Unless required by applicable law or agreed to in writing, software
        createOrReplaceProcedureQuery(actions, command.getObject());
        Object from, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.ext.generic.edit.GenericProcedureManager;
 * See the License for the specific language governing permissions and
        return new AltibaseProcedureStandAlone(
    @Override
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
        actions.add(new SQLDatabasePersistAction(
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
    }

            Map<String, Object> options) throws DBException {
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
                (GenericStructContainer) container,

 * limitations under the License.
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        }
    @Override
        final AltibaseProcedureStandAlone object = (AltibaseProcedureStandAlone) command.getObject();
    
    }
            throw new DBException("Procedure name cannot be empty");
    }
public class AltibaseProcedureManager extends GenericProcedureManager  {
import java.util.List;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Override
                "Drop procedure", "DROP " + object.getProcedureTypeName() + " " + object.getFullyQualifiedName(DBPEvaluationContext.DDL)));
        if (CommonUtils.isEmpty(command.getObject().getSource())) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    @Override
    }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
