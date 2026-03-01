import org.jkiss.dbeaver.ext.generic.model.GenericProcedure;

 * You may obtain a copy of the License at
    @Override
            throw new DBException("Typeset body cannot be empty");
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, 
import org.jkiss.code.NotNull;
    }
    protected GenericProcedure createDatabaseObject(
        }

                "NEW_TYPESET",
 */
                (GenericStructContainer) container,
 *
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,

 *     http://www.apache.org/licenses/LICENSE-2.0
    private void createOrReplaceProcedureQuery(List<DBEPersistAction> actions, GenericProcedure procedure) {
import java.util.List;
                "Create typeset", procedure.getSource()));
 * See the License for the specific language governing permissions and
 *
    @Override
import java.util.Map;
 * distributed under the License is distributed on an "AS IS" BASIS,
    
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        if (CommonUtils.isEmpty(command.getObject().getName())) {
        return true;

    }
}
import org.jkiss.dbeaver.model.edit.DBECommandContext;
package org.jkiss.dbeaver.ext.altibase.edit;
    @Override
        actions.add(

    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
        if (CommonUtils.isEmpty(command.getObject().getSource())) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    }
import org.jkiss.dbeaver.ext.generic.edit.GenericProcedureManager;
 * limitations under the License.
                "Drop typeset",

        @NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container,
 * DBeaver - Universal Database Manager
    @Override
    }
    }
    
 * Unless required by applicable law or agreed to in writing, software
        createOrReplaceProcedureQuery(actionList, command.getObject());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    
    }
            throw new DBException("Typeset name cannot be empty");
        );
    public boolean canCreateObject(@NotNull Object container) {
import org.jkiss.utils.CommonUtils;
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
                "DROP TYPESET " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL))
                true);
        return true;
public class AltibaseTypesetManager extends GenericProcedureManager {
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
/*
        createOrReplaceProcedureQuery(actions, command.getObject());
            Map<String, Object> options) throws DBException {
            new SQLDatabasePersistAction(
    @Override
import org.jkiss.dbeaver.ext.altibase.model.AltibaseTypeset;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        Object from, @NotNull Map<String, Object> options) {
        actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.DBException;

    public boolean canEditObject(@NotNull GenericProcedure object) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Override
 * you may not use this file except in compliance with the License.
    @Override

        return new AltibaseTypeset(
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                                          @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {

                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
