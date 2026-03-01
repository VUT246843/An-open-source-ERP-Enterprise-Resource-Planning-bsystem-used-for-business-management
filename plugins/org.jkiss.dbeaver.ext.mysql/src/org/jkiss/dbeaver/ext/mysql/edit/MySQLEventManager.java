
 */

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
        options.put(DBPScriptObject.OPTION_OBJECT_ALTER, true);
    @Override

        final StringBuilder script = new StringBuilder();
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            ddlText = "ALTER " + ddlText.substring(7);
import org.jkiss.dbeaver.ext.mysql.model.MySQLExecutionContext;
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        } catch (DBException e) {

 *
        actionList.add(new SQLDatabasePersistAction(alter ? "Alter event" : "Create event", ddlText)); // $NON-NLS-2$
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        if (curCatalog != event.getCatalog()) {
        if (ddlText.startsWith("CREATE ") || ddlText.startsWith("create ")) {
    public DBSObjectCache<MySQLCatalog, MySQLEvent> getObjectsCache(MySQLEvent object) {

        actions.add(new SQLDatabasePersistAction("Drop event", "DROP EVENT " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)));
            actionList.add(new SQLDatabasePersistAction("Set current schema ", "USE " + DBUtils.getQuotedIdentifier(event.getCatalog()), false)); //$NON-NLS-2$
import org.jkiss.dbeaver.model.DBPScriptObject;
    @Override
    }
}
    }
    }
    @Override
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    protected MySQLEvent createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) {
            log.error(e);
 * limitations under the License.
        }

import java.util.LinkedHashMap;
            script.append(event.getObjectDefinitionText(monitor, options));
        } catch (DBException e) {
package org.jkiss.dbeaver.ext.mysql.edit;
        return new MySQLEvent((MySQLCatalog) container, "NewEvent");
        try {

 *
            log.error(e);
        if (curCatalog != null && curCatalog != event.getCatalog()) {
import org.jkiss.dbeaver.ext.mysql.model.MySQLEvent;
            script.append(event.getObjectDefinitionText(monitor, options));
        final MySQLEvent event = command.getObject();

/*
public class MySQLEventManager extends SQLObjectEditor<MySQLEvent, MySQLCatalog> {
        }
        MySQLCatalog curCatalog = ((MySQLExecutionContext)executionContext).getDefaultCatalog();
        }
import org.jkiss.dbeaver.model.DBPDataSource;
        makeEventActions(actionList, executionContext, event, true, ddlText);
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
import java.util.List;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        final StringBuilder script = new StringBuilder();
        return object.getCatalog().getEventCache();
        final MySQLEvent event = command.getObject();
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
        try {
import org.jkiss.dbeaver.DBException;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
        }
    @Nullable
    @Override
        return FEATURE_EDITOR_ON_CREATE;

    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
        }

    }
        options = new LinkedHashMap<>(options);
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    private void makeEventActions(List<DBEPersistAction> actionList, DBCExecutionContext executionContext, MySQLEvent event, boolean alter, String ddlText) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBUtils;

            actionList.add(new SQLDatabasePersistAction("Set current schema ", "USE " + DBUtils.getQuotedIdentifier(curCatalog), false)); //$NON-NLS-2$
 *
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import java.util.Map;
        String ddlText = script.toString();

    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
    }

        makeEventActions(actions, executionContext, event, false, script.toString());
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
