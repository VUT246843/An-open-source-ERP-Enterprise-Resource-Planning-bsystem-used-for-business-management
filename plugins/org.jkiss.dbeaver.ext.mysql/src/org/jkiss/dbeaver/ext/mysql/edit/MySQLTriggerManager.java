
 * MySQLTriggerManager
    }
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        MySQLCatalog curCatalog = ((MySQLExecutionContext)executionContext).getDefaultCatalog();
 *
            actions.add(
package org.jkiss.dbeaver.ext.mysql.edit;
        if (trigger.isPersisted()) {

import org.jkiss.dbeaver.ext.mysql.model.MySQLExecutionContext;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        actions.add(new SQLDatabasePersistAction("Create trigger", trigger.getBody(), true)); //$NON-NLS-2$
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
/**
    @Nullable
public class MySQLTriggerManager extends SQLTriggerManager<MySQLTrigger, MySQLTable> {
 */

 *

import org.jkiss.code.Nullable;
    @Override
    {
    }
        }
import org.jkiss.dbeaver.ext.mysql.model.MySQLTrigger;
import org.jkiss.code.NotNull;
        if (curCatalog != null && curCatalog != trigger.getCatalog()) {
    protected void createOrReplaceTriggerQuery(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull MySQLTrigger trigger, boolean create) {
 * limitations under the License.
import org.jkiss.dbeaver.model.DBUtils;
            actions.add(new SQLDatabasePersistAction("Set current schema ", "USE " + DBUtils.getQuotedIdentifier(trigger.getCatalog()), false)); //$NON-NLS-2$
 * DBeaver - Universal Database Manager
    public DBSObjectCache<? extends DBSObject, MySQLTrigger> getObjectsCache(MySQLTrigger object)

 * Unless required by applicable law or agreed to in writing, software
    @Override
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                    "DROP TRIGGER IF EXISTS " + trigger.getFullyQualifiedName(DBPEvaluationContext.DDL))
}
            actions.add(new SQLDatabasePersistAction("Set current schema ", "USE " + DBUtils.getQuotedIdentifier(curCatalog), false)); //$NON-NLS-2$
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.struct.DBSObject;
        return new MySQLTrigger(table.getContainer(), table, "NewTrigger");
        return object.getCatalog().getTriggerCache();
/*
    protected MySQLTrigger createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object copyFrom, @NotNull Map<String, Object> options)
import java.util.Map;

            );
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTriggerManager;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                new SQLDatabasePersistAction("Drop trigger",
        MySQLTable table = (MySQLTable) container;
import org.jkiss.dbeaver.ext.mysql.model.MySQLTable;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others

        if (curCatalog != trigger.getCatalog()) {
        }
    }
import java.util.List;

 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    {

 * See the License for the specific language governing permissions and
