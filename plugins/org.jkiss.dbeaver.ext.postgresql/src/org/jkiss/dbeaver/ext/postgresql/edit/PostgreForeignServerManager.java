    protected void addObjectCreateActions(
import java.util.Map;
    }
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 */
    }

import org.jkiss.dbeaver.ext.postgresql.model.PostgreForeignServer;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
        @NotNull ObjectDeleteCommand command,
                "Create extension",
        return false;
        return object.getDatabase().foreignServerCache;
    public boolean canDeleteObject(@NotNull PostgreForeignServer object) {

    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
    }

 * See the License for the specific language governing permissions and
    }
    public DBSObjectCache<PostgreDatabase, PostgreForeignServer> getObjectsCache(PostgreForeignServer object) {
        @NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,

        return true;
    @Override
 *

import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
    protected void addObjectDeleteActions(
        return true;
    }
import org.jkiss.dbeaver.model.DBPDataSource;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
                "CREATE FOREIGN SERVER " + foreignServer.getName()));
    }

 *

    @Override
import java.util.List;

 * DBeaver - Universal Database Manager
        return new PostgreForeignServer((PostgreDatabase) container);
}
        Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 * You may obtain a copy of the License at
        actions.add(
        actions.add(new SQLDatabasePersistAction("Drop extension", "DROP FOREIGN SERVER " + DBUtils.getQuotedIdentifier(command.getObject())));

public class PostgreForeignServerManager extends SQLObjectEditor<PostgreForeignServer, PostgreDatabase> {
import org.jkiss.code.NotNull;
    {
/*
    @Override
package org.jkiss.dbeaver.ext.postgresql.edit;
    }
        @NotNull ObjectCreateCommand command,
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    @Override
    @Override
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

            new SQLDatabasePersistAction(

        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        return FEATURE_SAVE_IMMEDIATELY;
        @NotNull Map<String, Object> options) {
    @Override

    public boolean canEditObject(@NotNull PostgreForeignServer object) {
    @Override
        final PostgreForeignServer foreignServer = command.getObject();
        @NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
    public boolean canCreateObject(@NotNull Object container) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * distributed under the License is distributed on an "AS IS" BASIS,

        @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.model.DBUtils;
    protected PostgreForeignServer createDatabaseObject(
        @NotNull Map<String, Object> options) {

 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
