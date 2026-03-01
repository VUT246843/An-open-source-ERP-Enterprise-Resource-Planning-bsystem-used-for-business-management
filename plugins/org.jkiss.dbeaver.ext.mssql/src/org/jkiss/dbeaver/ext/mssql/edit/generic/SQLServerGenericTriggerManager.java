 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
/**

import org.jkiss.dbeaver.ext.generic.edit.GenericTriggerManager;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * limitations under the License.
 * DBeaver - Universal Database Manager
}
        DBSObject defaultDatabase = DBUtils.getDefaultContext(trigger.getDataSource(), true).getContextDefaults().getDefaultCatalog();
/*

        SQLServerGenericTrigger trigger = command.getObject();
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Map;
import org.jkiss.code.NotNull;
    protected void addObjectDeleteActions(
        }
    ) {
        if (defaultDatabase != trigger.getTable().getCatalog()) {
        super.addObjectDeleteActions(monitor, executionContext, actions, command, options);
package org.jkiss.dbeaver.ext.mssql.edit.generic;
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull ObjectDeleteCommand command,
        }


import java.util.List;
 * SQLServerTableTriggerManager
import org.jkiss.dbeaver.model.DBUtils;
        if (defaultDatabase != trigger.getTable().getCatalog()) {
 *
            actions.add(new SQLDatabasePersistAction("Set current schema ", "USE " + DBUtils.getQuotedIdentifier(defaultDatabase), false)); //$NON-NLS-2$
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    }
        @NotNull DBCExecutionContext executionContext,
 * You may obtain a copy of the License at
    @Override
            actions.add(new SQLDatabasePersistAction("Set current database", "USE " + DBUtils.getQuotedIdentifier(trigger.getTable().getCatalog()), false)); //$NON-NLS-2$
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull Map<String, Object> options

 *


        @NotNull List<DBEPersistAction> actions,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
import org.jkiss.dbeaver.ext.mssql.model.generic.SQLServerGenericTrigger;
        @NotNull DBRProgressMonitor monitor,
public class SQLServerGenericTriggerManager extends GenericTriggerManager<SQLServerGenericTrigger> {
