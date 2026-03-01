        return new SQLServerLogin((SQLServerDataSource) container, "new_login");
    }

 * Unless required by applicable law or agreed to in writing, software
        return FEATURE_SAVE_IMMEDIATELY;
 * distributed under the License is distributed on an "AS IS" BASIS,
        StringBuilder script = new StringBuilder(64);
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                    "Alter login",
        SQLServerLogin login = command.getObject();

    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) throws DBException {
                new SQLDatabasePersistAction("Create login", script.toString()) //$NON-NLS-2$
        actions.add(new SQLDatabasePersistAction(

import org.jkiss.dbeaver.model.sql.SQLUtils;
                new SQLDatabasePersistAction("Drop login", "DROP LOGIN " + DBUtils.getQuotedIdentifier(command.getObject())) //$NON-NLS-2$


    @Override
/*

import org.jkiss.code.Nullable;
        ));
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBException {
    }
        return object.getDataSource().getServerLoginCache();
        processObjectRename(commandContext, object, options, newName);
            actionList.add(new SQLDatabasePersistAction(
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Override
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull SQLServerLogin object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {

}

import org.jkiss.dbeaver.DBException;
 * limitations under the License.
    @Override
                "Rename login",

import org.jkiss.dbeaver.ext.mssql.model.SQLServerLogin;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

        actions.add(
    protected SQLServerLogin createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
public class SQLServerLoginManager extends SQLObjectEditor<SQLServerLogin, SQLServerDataSource> implements DBEObjectRenamer<SQLServerLogin> {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
            script.append(" WITH PASSWORD =").append(SQLUtils.quoteString(login.getDataSource(), login.getPassword()));
        );
    public DBSObjectCache<? extends DBSObject, SQLServerLogin> getObjectsCache(SQLServerLogin object) {
 * See the License for the specific language governing permissions and
 *
import java.util.List;
        actions.add(
import org.jkiss.dbeaver.ext.mssql.model.SQLServerDataSource;
            ));
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    @Override
        if (CommonUtils.isNotEmpty(login.getPassword())) {
package org.jkiss.dbeaver.ext.mssql.edit;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 *
import org.jkiss.utils.CommonUtils;
    @Nullable
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        );
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        script.append("CREATE LOGIN ").append(DBUtils.getQuotedIdentifier(login.getDataSource(), login.getName()));
    @Override
    }
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
        command.setDisableSessionLogging(true); // Hide password from Query Manager
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
 *

        SQLServerLogin login = command.getObject();
import org.jkiss.dbeaver.model.DBUtils;
                "ALTER LOGIN " + DBUtils.getQuotedIdentifier(dataSource, command.getOldName()) + " WITH NAME = " + DBUtils.getQuotedIdentifier(dataSource, command.getNewName()) //$NON-NLS-2$
import org.jkiss.dbeaver.model.DBPDataSource;
                    "ALTER LOGIN " + DBUtils.getQuotedIdentifier(login.getDataSource(), login.getName()) + (login.isDisabled() ? " DISABLE" : " ENABLE") //$NON-NLS-2$
    @Override
        SQLServerLogin login = command.getObject();
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.Map;
        if (command.hasProperty("disabled")) {
        }
    }
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
 * DBeaver - Universal Database Manager
 */
 * you may not use this file except in compliance with the License.
        SQLServerDataSource dataSource = login.getDataSource();
