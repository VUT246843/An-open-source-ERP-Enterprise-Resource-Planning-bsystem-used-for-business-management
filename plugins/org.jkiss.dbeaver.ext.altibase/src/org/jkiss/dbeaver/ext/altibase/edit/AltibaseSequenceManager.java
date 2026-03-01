    @Override
 * DBeaver - Universal Database Manager
    protected AltibaseSequence createDatabaseObject(
import org.jkiss.dbeaver.DBException;
        ObjectChangeCommand command,
    @Override
        final Object container,
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        @NotNull List<DBEPersistAction> actions,
        @NotNull Map<String, Object> options

import org.jkiss.utils.CommonUtils;
        @NotNull DBECommandContext context,
        @NotNull List<DBEPersistAction> actionList,
        Map<String, Object> options
        DBRProgressMonitor monitor,
    @Override
    @Override
        actions.add(new SQLDatabasePersistAction("Create sequence", 
    
import org.jkiss.dbeaver.ext.generic.model.GenericSequence;
        if (CommonUtils.isEmpty(command.getObject().getName())) {
import java.util.List;
    }
import org.jkiss.dbeaver.model.DBPDataSource;
        @NotNull DBRProgressMonitor monitor,
        @NotNull DBRProgressMonitor monitor,
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.altibase.model.AltibaseSequence;
 * you may not use this file except in compliance with the License.

public class AltibaseSequenceManager extends GenericSequenceManager {
 * Licensed under the Apache License, Version 2.0 (the "License");

    ) {
                        ((AltibaseSequence) (command.getObject())).buildStatement(false)));
 */
                        ((AltibaseSequence) (command.getObject())).buildStatement(true)));
/*
    public boolean canEditObject(@NotNull GenericSequence object) {
            throw new DBException("Sequence name cannot be empty");
    ) throws DBException {
 * You may obtain a copy of the License at
    protected void addObjectModifyActions(
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.generic.edit.GenericSequenceManager;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        return FEATURE_EDITOR_ON_CREATE;
        @NotNull ObjectCreateCommand command,
        actionList.add(new SQLDatabasePersistAction("Alter sequence", 
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    ) {
    protected void addObjectCreateActions(

 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 * See the License for the specific language governing permissions and
        @NotNull DBCExecutionContext executionContext,
    
    @Override
 * limitations under the License.
        Object from,

    ) {
    
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
}
package org.jkiss.dbeaver.ext.altibase.edit;
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
import org.jkiss.code.NotNull;
 *
    protected void validateObjectProperties(
    }
        return new AltibaseSequence((GenericStructContainer) container, getBaseObjectName());
 *
    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.edit.DBECommandContext;

        @NotNull Map<String, Object> options
        @NotNull DBCExecutionContext executionContext,
        }
        @NotNull Map<String, Object> options
        @NotNull ObjectChangeCommand command,
        return true;
import java.util.Map;
