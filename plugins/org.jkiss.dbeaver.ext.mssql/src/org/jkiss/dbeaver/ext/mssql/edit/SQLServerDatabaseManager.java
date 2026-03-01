                "Drop database connections",

    @Override
        if (CommonUtils.getOption(options, DBEObjectManager.OPTION_CLOSE_EXISTING_CONNECTIONS)) {
        return object.getDataSource().getDatabaseCache();
        return true;
 * Unless required by applicable law or agreed to in writing, software
                "Create database",
 * See the License for the specific language governing permissions and
 *
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    @Override
import org.jkiss.dbeaver.model.DBUtils;
                "DROP DATABASE " + DBUtils.getQuotedIdentifier(command.getObject()) + ";"
public class SQLServerDatabaseManager extends SQLObjectEditor<SQLServerDatabase, SQLServerDataSource> implements DBEObjectRenamer<SQLServerDatabase> {

import org.jkiss.dbeaver.DBException;
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull SQLServerDatabase object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
    @Override

    }
        ));
package org.jkiss.dbeaver.ext.mssql.edit;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.utils.CommonUtils;
 *
        return new SQLServerDatabase((SQLServerDataSource) container);


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 */

import org.jkiss.dbeaver.ext.mssql.model.SQLServerDatabase;
    public DBSObjectCache<? extends DBSObject, SQLServerDatabase> getObjectsCache(SQLServerDatabase object) {
    }
import java.util.Map;
 *
    }
    }
import org.jkiss.dbeaver.model.edit.*;
    }
        final String oldName = DBUtils.getQuotedIdentifier(source, command.getOldName());

        actions.add(new SQLDatabasePersistAction(
        }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;


 * distributed under the License is distributed on an "AS IS" BASIS,
        ));
    public boolean canCreateObject(@NotNull Object container) {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * you may not use this file except in compliance with the License.
    @Override
    @Override
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.code.NotNull;
    @Override
        return DBEObjectMaker.FEATURE_SAVE_IMMEDIATELY | DBEObjectMaker.FEATURE_CLOSE_EXISTING_CONNECTIONS;
                "CREATE DATABASE " + DBUtils.getQuotedIdentifier(command.getObject()) + ";"
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        final String newName = DBUtils.getQuotedIdentifier(source, command.getNewName());
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBException {

}
            ));
/*
                "Rename database",
import org.jkiss.dbeaver.model.struct.DBSObject;

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.List;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
 * limitations under the License.
    @Override
                "Drop database",
    protected SQLServerDatabase createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
        actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.ext.mssql.model.SQLServerDataSource;
        actions.add(new SQLDatabasePersistAction(
                "ALTER DATABASE " + oldName + " MODIFY NAME = " + newName + ";"
        processObjectRename(commandContext, object, options, newName);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
                "ALTER DATABASE " + DBUtils.getQuotedIdentifier(command.getObject()) + " SET SINGLE_USER WITH ROLLBACK IMMEDIATE;"
        final SQLServerDataSource source = command.getObject().getDataSource();
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
        ));
    @Override
            actions.add(new SQLDatabasePersistAction(

