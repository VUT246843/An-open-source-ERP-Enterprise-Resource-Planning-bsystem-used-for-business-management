 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
    }
/*
}
 * Unless required by applicable law or agreed to in writing, software
    

        return true;
    @Override
    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
                "Alter Trigger", trigger.getSource()));
        actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull DBRProgressMonitor monitor,
    public boolean canEditObject(@NotNull AltibaseTableTrigger object) {
package org.jkiss.dbeaver.ext.altibase.edit;
        @NotNull DBCExecutionContext executionContext,
import org.jkiss.dbeaver.ext.altibase.model.AltibaseTableTrigger;
 */
 *
 * limitations under the License.
import org.jkiss.dbeaver.ext.generic.edit.GenericTriggerManager;
    
 *     http://www.apache.org/licenses/LICENSE-2.0
public class AltibaseTriggerManager extends GenericTriggerManager<AltibaseTableTrigger> {
        boolean create) {

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.List;
        @NotNull AltibaseTableTrigger trigger,
 * You may obtain a copy of the License at
 *
    @Override
        @NotNull List<DBEPersistAction> actions,
    protected void createOrReplaceTriggerQuery(
