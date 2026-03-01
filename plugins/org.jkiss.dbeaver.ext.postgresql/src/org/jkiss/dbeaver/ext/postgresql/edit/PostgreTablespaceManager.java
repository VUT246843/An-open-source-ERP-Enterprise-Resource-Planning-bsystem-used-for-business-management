    public void deleteObject(@NotNull DBECommandContext commandContext, @NotNull PostgreTablespace object, @NotNull Map<String, Object> options)
    }


    public boolean canEditObject(@NotNull PostgreTablespace object) {
        actions.add(
            actions.add(
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull DBECommandContext context,
        throws DBException {
        }
            super.deleteObject(commandContext, object, options);
        @NotNull Map<String, Object> options) {
import java.util.*;

 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
    @Override
        } catch (DBException e) {
import org.jkiss.dbeaver.Log;
 */
 * DBeaver - Universal Database Manager
    @Override

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                new SQLDatabasePersistActionAtomic("Create tablespace", tablespace.getObjectDefinitionText(monitor, options)) //$NON-NLS-2$
    private final static Set<String> systemTablespaces = new HashSet<>(Arrays.asList("pg_default", "pg_global"));
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTablespace;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        @NotNull DBRProgressMonitor monitor,
    public boolean canDeleteObject(@NotNull PostgreTablespace object) {
        @NotNull DBRProgressMonitor monitor,
 * See the License for the specific language governing permissions and

    }
    protected void addObjectDeleteActions(
    @Override
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
package org.jkiss.dbeaver.ext.postgresql.edit;
        Object copyFrom,
        @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
        @NotNull Map<String, Object> options) {
    public DBSObjectCache<PostgreDatabase, PostgreTablespace> getObjectsCache(PostgreTablespace object) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
public class PostgreTablespaceManager extends SQLObjectEditor<PostgreTablespace, PostgreDatabase> {
        final PostgreTablespace tablespace = command.getObject();
            new SQLDatabasePersistActionAtomic("Drop tablespace", "DROP TABLESPACE " //$NON-NLS-2$

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
    {
    public boolean canCreateObject(@NotNull Object container) {

        Object container,
        try {
 * You may obtain a copy of the License at
            DBWorkbench.getPlatformUI().showError("Drop tablespace", "Unable to drop system tablespace " + object.getName());

        return true;
 * limitations under the License.
        return false;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    @Override
 *
import org.jkiss.dbeaver.model.DBPDataSource;
        @NotNull Map<String, Object> options) throws DBException
/*
        return object.getDatabase().tablespaceCache;
        @NotNull ObjectCreateCommand command,
    @Override
    }
        } else {
        @NotNull ObjectDeleteCommand command,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

 *
    @Override
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionAtomic;
import org.jkiss.dbeaver.DBException;
            log.error(e);

    @Override
    @Override

        return true;
}
    private static final Log log = Log.getLog(PostgreTablespaceManager.class);
        return FEATURE_SAVE_IMMEDIATELY;

    }

    protected PostgreTablespace createDatabaseObject(
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
 *
import org.jkiss.dbeaver.model.DBUtils;
        if (systemTablespaces.contains(object.getName().toLowerCase())) {
        return new PostgreTablespace((PostgreDatabase) container);

        }
 * you may not use this file except in compliance with the License.
    protected void addObjectCreateActions(
                + DBUtils.getQuotedIdentifier(command.getObject()))

    @Override
        );
            );
