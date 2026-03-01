        } else {
package org.jkiss.dbeaver.ext.mssql.edit;
 *
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        DBSObject defaultDatabase = ((SQLServerExecutionContext)executionContext).getDefaultCatalog();
        newTrigger.setBody(
                DBUtils.getQuotedIdentifier(table.getDatabase()), false));
                SQLServerUtils.changeCreateToAlterDDL(trigger.getDataSource(), trigger.getBody()), true)); //$NON-NLS-2$
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    protected SQLServerTableTrigger createDatabaseObject(
 * distributed under the License is distributed on an "AS IS" BASIS,
        String newTriggerName = "NewTrigger";
    }
import java.util.Map;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
        if (create) {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

        @Nullable DBSObject defaultDatabase,
                DBUtils.getQuotedIdentifier(table.getDatabase()), false));
        SQLServerTableTrigger trigger = command.getObject();
        if (defaultDatabase != table.getDatabase()) {
            defaultCatalogName = DBUtils.getQuotedIdentifier(defaultDatabase);

        return object.getSchema().getTriggerCache();
    @NotNull
        SQLServerTableBase table = trigger.getTable();

import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTriggerManager;
        @NotNull DBRProgressMonitor monitor,
    }
        @NotNull Map<String, Object> options
            String defaultCatalogName = getDefaultCatalogName((SQLServerExecutionContext) executionContext, defaultDatabase, table);
import org.jkiss.code.Nullable;
    }
        super.addObjectDeleteActions(monitor, executionContext, actions, command, options);
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    ) {
        Object container,
                table.getDataSource(),
    {
    @Override

    public DBSObjectCache<? extends DBSObject, SQLServerTableTrigger> getObjectsCache(SQLServerTableTrigger object)
 * SQLServerTableTriggerManager
            "AFTER INSERT\n" +
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableTrigger;
        @NotNull SQLServerTableBase table
            actions.add(new SQLDatabasePersistAction("Set current database ", //$NON-NLS-1$
 * You may obtain a copy of the License at
            actions.add(new SQLDatabasePersistAction("Alter trigger",

        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull SQLServerExecutionContext executionContext,
        }
        return newTrigger;
            "CREATE OR ALTER TRIGGER " + newTriggerName + " ON " + table.getFullyQualifiedName(DBPEvaluationContext.DDL) + "\n" +
        SQLServerTableBase table = (SQLServerTableBase) container;
/*
    @Override
        }

                "USE " + defaultCatalogName, false)); //$NON-NLS-1$
            actions.add(new SQLDatabasePersistAction("Set current database", "USE " + //$NON-NLS-2$
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        @NotNull DBECommandContext context,
        SQLServerTableTrigger newTrigger = new SQLServerTableTrigger(table, newTriggerName);
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 *
            actions.add(new SQLDatabasePersistAction("Set current database ",
        }
            "AS\n" +
 *
            actions.add(new SQLDatabasePersistAction("Create trigger", trigger.getBody(), true)); //$NON-NLS-2$
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (defaultDatabase != table.getDatabase()) {
 * you may not use this file except in compliance with the License.
            defaultCatalogName = DBUtils.getQuotedIdentifier(
    private static String getDefaultCatalogName(
            ";\n"
            String defaultCatalogName = getDefaultCatalogName((SQLServerExecutionContext) executionContext, defaultDatabase, table);
import org.jkiss.dbeaver.model.struct.DBSObject;
        String defaultCatalogName;
    @Nullable
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            actions.add(new SQLDatabasePersistAction("Set current database", "USE " + //$NON-NLS-2$
        if (defaultDatabase != null) {
        SQLServerTableBase table = trigger.getTable();
import org.jkiss.dbeaver.ext.mssql.model.SQLServerExecutionContext;
/**
        if (defaultDatabase != table.getDatabase()) {
import java.util.List;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableBase;
        Object copyFrom,
    }


        if (defaultDatabase != table.getDatabase()) {
        }
        DBSObject defaultDatabase = ((SQLServerExecutionContext)executionContext).getDefaultCatalog();
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;

    }
    protected void createOrReplaceTriggerQuery(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull SQLServerTableTrigger trigger, boolean create) {
 * limitations under the License.
        }
 */
 * See the License for the specific language governing permissions and
    @Override
 */
                "USE " + defaultCatalogName, false)); //$NON-NLS-1$


public class SQLServerTableTriggerManager extends SQLTriggerManager<SQLServerTableTrigger, SQLServerTableBase> {
 * Unless required by applicable law or agreed to in writing, software

        } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return defaultCatalogName;
        );
    ) {
                executionContext.getActiveDatabaseName());
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DBeaver - Universal Database Manager
