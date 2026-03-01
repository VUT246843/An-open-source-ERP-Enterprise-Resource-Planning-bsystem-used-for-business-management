        if (source == null) {
    protected OracleTableTrigger createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object copyFrom, @NotNull Map<String, Object> options) {
        return new OracleTableTrigger(table, "NEW_TRIGGER");
        actions.add(new SQLDatabasePersistAction("Create trigger", script, true)); //$NON-NLS-2$
        actions.add(
        if (!script.toUpperCase(Locale.ENGLISH).trim().contains("CREATE ")) {
import org.jkiss.dbeaver.ext.oracle.model.OracleTableBase;
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.ext.oracle.model.OracleTableTrigger;
}
        return object.getTable().getSchema().tableTriggerCache;
import org.jkiss.code.NotNull;
import java.util.List;

        );
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.ext.oracle.edit;

import java.util.Locale;
        return container instanceof OracleTableBase;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
import org.jkiss.dbeaver.ext.oracle.model.OracleUtils;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        OracleUtils.addSchemaChangeActions(executionContext, actions, trigger);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * OracleTableTriggerManager
 * You may obtain a copy of the License at
        OracleTableBase table = (OracleTableBase) container;
    @Override

/*
 *
    public boolean canCreateObject(@NotNull Object container) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public class OracleTableTriggerManager extends SQLTriggerManager<OracleTableTrigger, OracleTableBase> {

        @NotNull DBCExecutionContext executionContext,
    @Override
 *
 * Unless required by applicable law or agreed to in writing, software
            new SQLDatabasePersistAction("Drop trigger", "DROP TRIGGER " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-2$
    }
    }
        }
        boolean create
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
import java.util.Map;
        @NotNull List<DBEPersistAction> actions,
        String script = source;
    public DBSObjectCache<? extends DBSObject, OracleTableTrigger> getObjectsCache(OracleTableTrigger object) {
        @NotNull OracleTableTrigger trigger,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.struct.DBSObject;

            return;
    }

    protected void createOrReplaceTriggerQuery(
 */
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
            script = "CREATE OR REPLACE " + script;

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * you may not use this file except in compliance with the License.
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTriggerManager;

    ) {
        String source = OracleUtils.normalizeSourceName(monitor, trigger, false);
    @Override
    @Override
    @Nullable
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.model.edit.DBECommandContext;

