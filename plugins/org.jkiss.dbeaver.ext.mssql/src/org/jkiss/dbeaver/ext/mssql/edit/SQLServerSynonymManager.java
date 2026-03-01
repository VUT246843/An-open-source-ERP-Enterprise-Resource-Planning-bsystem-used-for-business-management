 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        throw new DBCFeatureNotSupportedException();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.DBException;
    @Override
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software
import java.util.Map;
 *
import org.jkiss.dbeaver.ext.mssql.model.SQLServerSchema;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 */

    @Override
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    }
 * SQLServerSynonymManager
public class SQLServerSynonymManager extends SQLServerObjectManager<SQLServerSynonym, SQLServerSchema> {
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            new SQLDatabasePersistAction(
                "DROP SYNONYM " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-2$
package org.jkiss.dbeaver.ext.mssql.edit;
    protected SQLServerSynonym createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBCFeatureNotSupportedException {

import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    public boolean canCreateObject(@NotNull Object container) {
import java.util.List;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
import org.jkiss.dbeaver.ext.mssql.model.SQLServerSynonym;
 * You may obtain a copy of the License at
    @Nullable
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
        addDatabaseSwitchAction1(executionContext, actions, command.getObject().getParentObject().getDatabase());

/**
    }
/*
    }


 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                "Drop synonym",
import org.jkiss.dbeaver.model.DBPDataSource;
        actions.add(
 *
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBException {
 * you may not use this file except in compliance with the License.

 */
        );
    @Override
        return object.getParentObject().getSynonymCache();
import org.jkiss.code.Nullable;
    @Override
    }
import org.jkiss.code.NotNull;
    }
    public DBSObjectCache<SQLServerSchema, SQLServerSynonym> getObjectsCache(SQLServerSynonym object) {
    }
        addDatabaseSwitchAction2(executionContext, actions, command.getObject().getParentObject().getDatabase());


 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
        return false;
    @Override

        return 0;
    @Override
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {

 *
