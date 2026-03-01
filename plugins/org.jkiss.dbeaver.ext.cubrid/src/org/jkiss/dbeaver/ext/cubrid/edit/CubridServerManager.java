    @Override
        @NotNull DBECommandContext context,

        additionalCreateActions(server, query);
        CubridServer server = command.getObject();
        @NotNull DBCExecutionContext executionContext,
        @NotNull Map<String, Object> options
import org.jkiss.dbeaver.model.DBPDataSource;
        }
    public static final String BASE_SERVER_NAME = "new_server";
    }
        @NotNull ObjectChangeCommand command,
        @NotNull CubridServer server,
import org.jkiss.utils.CommonUtils;
    public boolean canDeleteObject(CubridServer object) {
            query.append(" CHANGE PORT=").append(server.getPort()).append(suffix);
        @NotNull DBRProgressMonitor monitor,
    ) {
    @Override
                .append(suffix);
        @NotNull ObjectChangeCommand command,
        additionalModifyActions(server, query, command, suffix);
    @Override
        if (command.getProperty("host") != null && server.getHost() != null) {
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    }
 * Unless required by applicable law or agreed to in writing, software
            query.append(" CHANGE PROPERTIES=").append(SQLUtils.quoteString(server, CommonUtils.notEmpty(server.getProperties())))
    }
    }
 * See the License for the specific language governing permissions and
    @Override
        CubridServer server = command.getObject();
        @Nullable Object container,
            query.append(", DBNAME=").append(server.getDbName());
    }
    }
 * DBeaver - Universal Database Manager
 *
public class CubridServerManager extends SQLObjectEditor<CubridServer, GenericStructContainer> implements DBEObjectRenamer<CubridServer> {
    @Override
    @Override
    @Override
        return !object.getDataSource().isShard();
    }
        if (server.getDescription() != null) {
    }

        }
import org.jkiss.dbeaver.model.edit.DBECommandContext;

    ) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * limitations under the License.
        DBSObject parentObject = object.getParentObject();
            "RENAME SERVER " + DBUtils.getQuotedIdentifier(server.getOwner()) + "."
        query.append(" (HOST=").append(SQLUtils.quoteString(server, server.getHost()));
            + DBUtils.getQuotedIdentifier(server.getDataSource(), command.getOldName()) + " TO "
    ) throws DBException {
        @NotNull List<DBEPersistAction> actions,


        @NotNull Map<String, Object> options
    }
        @NotNull List<DBEPersistAction> actions,
        if (command.getProperty("password") != null && server.getPassword() != null) {
        if (parentObject instanceof CubridDataSource container) {
            processObjectRename(commandContext, object, options, newName);
}
 * you may not use this file except in compliance with the License.
        @NotNull Map<String, Object> options,

            query.append(", PORT=").append(server.getPort());
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        }
    ) {
    }
        actions.add(new SQLDatabasePersistAction("Alter Server", query.toString()));
import org.jkiss.dbeaver.model.DBUtils;
        @NotNull DBRProgressMonitor monitor,
            query.append(", PASSWORD=").append(SQLUtils.quoteString(server, server.getPassword()));
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            query.append(" CHANGE COMMENT=").append(SQLUtils.quoteString(server, CommonUtils.notEmpty(server.getDescription())))
            + DBUtils.getQuotedIdentifier(server.getDataSource(), command.getNewName())

        return null;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        query.append(")");
    public boolean canEditObject(CubridServer object) {
        @NotNull Map<String, Object> options
import org.jkiss.dbeaver.DBException;
        if (server.getProperties() != null) {
        }
/*
        query.append("CREATE SERVER ");
    public void additionalCreateActions(@NotNull CubridServer server, @NotNull StringBuilder query) {
        }
        @NotNull CubridServer object,
        StringBuilder query = new StringBuilder();
import org.jkiss.dbeaver.model.struct.DBSObject;
        if (server.getDbName() != null) {
    public long getMakerOptions(DBPDataSource dataSource) {
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        @NotNull List<DBEPersistAction> actions,
    public boolean canCreateObject(@NotNull Object container) {
    @Override
        return FEATURE_EDITOR_ON_CREATE;

    }
        }

        query.append(DBUtils.getQuotedIdentifier(server.getOwner()) + "." + DBUtils.getFullQualifiedName(server.getDataSource(), server));
            query.append(" CHANGE DBNAME=").append(server.getDbName()).append(suffix);
        query.append("ALTER SERVER ");
        if (!object.getDataSource().isShard()) {
    protected void addObjectCreateActions(
        @NotNull DBCExecutionContext executionContext,
    }
        }
        if (command.getProperty("dbName") != null && server.getDbName() != null) {
            query.append(", COMMENT=").append(SQLUtils.quoteString(server, server.getDescription()));
        @NotNull String suffix
        if (server.getPort() != null) {
        @NotNull DBECommandContext commandContext,

 * You may obtain a copy of the License at
    }
    }
    protected void addObjectModifyActions(
 *
            query.append(", PROPERTIES=").append(SQLUtils.quoteString(server, server.getProperties()));
            query.append(" CHANGE PASSWORD=").append(SQLUtils.quoteString(server, server.getPassword())).append(suffix);
import org.jkiss.code.Nullable;
        return !object.getDataSource().isShard();
        CubridServer server = command.getObject();
import java.util.Map;
import org.jkiss.dbeaver.model.sql.SQLUtils;
        @NotNull ObjectDeleteCommand command,
        @NotNull DBCExecutionContext executionContext,

        }
        @NotNull String newName
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.cubrid.edit;
    protected void addObjectRenameActions(
        if (server.getPassword() != null) {
        @NotNull ObjectCreateCommand command,
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
        if (command.hasProperty("properties") || server.getProperties() != null) {
        }
    @Override
        query.deleteCharAt(query.length() - 1);
    protected void addObjectDeleteActions(
        StringBuilder query = new StringBuilder();

        @NotNull DBCExecutionContext executionContext,
        @NotNull DBRProgressMonitor monitor,
        return !((CubridDataSource) container).isShard();


        actions.add(new SQLDatabasePersistAction("Drop Server",
        if (command.hasProperty("description") || server.getDescription() != null) {
        }
    public DBSObjectCache<? extends DBSObject, CubridServer> getObjectsCache(CubridServer object) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        String suffix = ",";
        if (command.getProperty("port") != null && server.getPort() != null) {
    public boolean canRenameObject(CubridServer object) {

import org.jkiss.dbeaver.ext.cubrid.model.CubridDataSource;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            return container.getServerCache();
        "DROP SERVER " + DBUtils.getQuotedIdentifier(server.getOwner()) + "." + DBUtils.getFullQualifiedName(server.getDataSource(), server)));
        @NotNull StringBuilder query,
 *
        return !object.getDataSource().isShard();
                .append(suffix);
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull Map<String, Object> options
    @Override

import java.util.List;
        if (server.getUserName() != null) {
        }
        }
        @NotNull Map<String, Object> options
    @Override
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            query.append(", USER=").append(server.getUserName());
        @NotNull DBRProgressMonitor monitor,
        @NotNull List<DBEPersistAction> actions,
    public void additionalModifyActions(
import org.jkiss.code.NotNull;

        @NotNull ObjectRenameCommand command,
        if (command.getProperty("userName") != null && server.getUserName() != null) {
        actions.add(new SQLDatabasePersistAction("Create Server", query.toString()));
    protected CubridServer createDatabaseObject(
        ));
            query.append(" CHANGE HOST=").append(SQLUtils.quoteString(server, server.getHost())).append(suffix);
        actions.add(new SQLDatabasePersistAction("Rename Server",

        query.append(DBUtils.getQuotedIdentifier(server.getOwner()) + "." + DBUtils.getFullQualifiedName(server.getDataSource(), server));
    public void renameObject(
    ) throws DBException {
        return new CubridServer((CubridDataSource) container, BASE_SERVER_NAME);
        @Nullable Object copyFrom,
import org.jkiss.dbeaver.ext.cubrid.model.CubridServer;
        CubridServer server = command.getObject();
 */
            query.append(" CHANGE USER=").append(server.getUserName()).append(suffix);
        }
        @NotNull DBRProgressMonitor monitor,
    ) {
    ) {
