    }
    }
    {
    protected MySQLCatalog createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object copyFrom, @NotNull Map<String, Object> options)
        throw new DBException(MySQLMessages.exception_direct_database_rename);
 * See the License for the specific language governing permissions and
        actionList.add(
        }
        return object.getDataSource().getCatalogCache();

        actions.add(
    @Override

    {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    private void appendDatabaseModifiers(MySQLCatalog catalog, StringBuilder script) {
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull MySQLCatalog catalog, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            new SQLDatabasePersistAction("Create schema", script.toString()) //$NON-NLS-2$
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPDataSource;
 */
    }


    @Override
}
    {
import java.util.Map;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.Nullable;
import java.util.List;
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options)
    @Override
    }
 * MySQLDatabaseManager
    }
        final MySQLCatalog catalog = command.getObject();
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
package org.jkiss.dbeaver.ext.mysql.edit;

 */
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)

        if (catalog.getAdditionalInfo().getDefaultCharset() != null) {
    }


        appendDatabaseModifiers(catalog, script);

 * you may not use this file except in compliance with the License.
    }

        appendDatabaseModifiers(catalog, script);
    @Nullable
 *
import org.jkiss.dbeaver.DBException;
        final MySQLCatalog catalog = command.getObject();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * distributed under the License is distributed on an "AS IS" BASIS,
        );
        return FEATURE_SAVE_IMMEDIATELY;
    public DBSObjectCache<MySQLDataSource, MySQLCatalog> getObjectsCache(MySQLCatalog object)
        final StringBuilder script = new StringBuilder("ALTER DATABASE `" + catalog.getName() + "`");
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    {
            script.append("\nDEFAULT CHARACTER SET ").append(catalog.getAdditionalInfo().getDefaultCharset().getName());
 *
import org.jkiss.dbeaver.ext.mysql.MySQLMessages;
/**
    }
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
/*
        );
    @Override
            script.append("\nDEFAULT COLLATE ").append(catalog.getAdditionalInfo().getDefaultCollation().getName());
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    @Override
        if (catalog.getAdditionalInfo().getDefaultCollation() != null) {
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
 * DBeaver - Universal Database Manager
    @Override
import org.jkiss.code.NotNull;
 * limitations under the License.
    {
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;
 *


        actions.add(new SQLDatabasePersistAction("Drop schema", "DROP SCHEMA `" + command.getObject().getName() + "`")); //$NON-NLS-2$
 * Licensed under the Apache License, Version 2.0 (the "License");
public class MySQLDatabaseManager extends SQLObjectEditor<MySQLCatalog, MySQLDataSource> implements DBEObjectRenamer<MySQLCatalog> {
        final StringBuilder script = new StringBuilder("CREATE SCHEMA `" + catalog.getName() + "`");
            new SQLDatabasePersistAction("Alter database", script.toString()) //$NON-NLS-2$
    
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    {
        }
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        return new MySQLCatalog((MySQLDataSource) container, null);
