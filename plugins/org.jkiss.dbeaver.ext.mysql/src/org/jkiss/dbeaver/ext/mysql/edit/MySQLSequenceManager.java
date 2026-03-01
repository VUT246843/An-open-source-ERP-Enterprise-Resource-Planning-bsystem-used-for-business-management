import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        }
        DBEPersistAction action = new SQLDatabasePersistAction("Drop Sequence", sql);
        String sql = "DROP SEQUENCE " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL);
import org.jkiss.dbeaver.model.DBPDataSource;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        actionList.add(new SQLDatabasePersistAction("Create Sequence", sequence.getObjectDefinitionText(monitor, options), true)); //$NON-NLS-2$
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) throws DBException {
    @Override
    }
import java.util.List;
    public DBSObjectCache<? extends DBSObject, MySQLSequence> getObjectsCache(MySQLSequence object) {
    @Override

    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
        if (curCatalog != sequence.getCatalog()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    @Nullable
package org.jkiss.dbeaver.ext.mysql.edit;
        actions.add(action);
 *
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.DBUtils;
 */
        }
import org.jkiss.code.NotNull;
    }
 * limitations under the License.
public class MySQLSequenceManager extends SQLObjectEditor<MySQLSequence, MySQLCatalog> {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * you may not use this file except in compliance with the License.
    @Override
        MySQLSequence sequence = command.getObject();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        return new MySQLSequence((MySQLCatalog) container, "new_sequence", false);
 * DBeaver - Universal Database Manager
 *
        actions.add(new SQLDatabasePersistAction("Create Sequence", "CREATE SEQUENCE " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)));
import org.jkiss.dbeaver.ext.mysql.model.MySQLSequence;
}

    @Override

    @Override
        return object.getCatalog().getSequenceCache();
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.DBException;
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
/*
        MySQLCatalog curCatalog = ((MySQLExecutionContext)executionContext).getDefaultCatalog();
 * You may obtain a copy of the License at
        return FEATURE_EDITOR_ON_CREATE;
            actionList.add(new SQLDatabasePersistAction("Set current schema ", "USE " + DBUtils.getQuotedIdentifier(curCatalog), false)); //$NON-NLS-2$
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;

import java.util.Map;
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBException {
            actionList.add(new SQLDatabasePersistAction("Set current schema ", "USE " + DBUtils.getQuotedIdentifier(sequence.getCatalog()), false)); //$NON-NLS-2$
    }


import org.jkiss.dbeaver.ext.mysql.model.MySQLExecutionContext;
    protected MySQLSequence createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
    @Override

        if (curCatalog != null && curCatalog != sequence.getCatalog()) {
