    }
 * You may obtain a copy of the License at
            new SQLDatabasePersistAction(
        return FEATURE_SAVE_IMMEDIATELY;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
public class PostgreExtensionManager extends SQLObjectEditor<PostgreExtension, PostgreDatabase>{
 *
    public boolean canEditObject(@NotNull PostgreExtension object) {

import org.jkiss.dbeaver.DBException;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.edit.DBECommandContext;
/*
        
package org.jkiss.dbeaver.ext.postgresql.edit;
}
import org.jkiss.dbeaver.ext.postgresql.model.PostgreExtension;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        
        return object.getDatabase().extensionCache;
        return new PostgreExtension((PostgreDatabase) container);
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean canCreateObject(@NotNull Object container) {

    }
    @Override
        );
                                          @NotNull Map<String, Object> options) {
        return true;
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
                "Create extension",
                new SQLDatabasePersistAction("Drop extension", "DROP EXTENSION " + DBUtils.getQuotedIdentifier(command.getObject()) + " CASCADE") //$NON-NLS-2$
         return true;
import org.jkiss.dbeaver.model.DBPDataSource;
    protected PostgreExtension createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return false;
    }
 *
                "CREATE EXTENSION " + DBUtils.getQuotedIdentifier(extension) + " SCHEMA " + extension.getSchema()) //$NON-NLS-2$

 * DBeaver - Universal Database Manager
        final PostgreExtension extension = command.getObject();
    }
    @Override
        actions.add(
                                          @NotNull ObjectCreateCommand command,

    


import java.util.List;
 */
    public DBSObjectCache<PostgreDatabase, PostgreExtension> getObjectsCache(PostgreExtension object) {
 * limitations under the License.
import java.util.Map;
    @Override
                                                    Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {

  
    

    }
            );
    @Override
 * you may not use this file except in compliance with the License.
 *
    @Override
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,

    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

        actions.add(
    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.DBUtils;
                                          @NotNull Map<String, Object> options) {
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software


 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }

    public boolean canDeleteObject(@NotNull PostgreExtension object) {
                                          @NotNull ObjectDeleteCommand command,
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    }
    @Override
    @Override

