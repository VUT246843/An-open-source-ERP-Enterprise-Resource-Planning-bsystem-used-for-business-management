        DBSObject parentObject = object.getParentObject();
    }
    @Override
    ) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        @NotNull Map<String, Object> options

    @Override
            List<String> quotedGroups = groups.stream()
    }

import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    private String getUserName(CubridPrivilage user, Map<Object, Object> properties) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
            this.database = privilage;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.DBSObject;
        for (int i = 0; i < MAX_NAME_GEN_ATTEMPTS; i++) {
            builder.append(SQLUtils.quoteString(user, password.toString()));
    }
import org.jkiss.code.NotNull;
    }
    protected void addObjectCreateActions(
        public void afterExecute(DBCSession session, Throwable error) throws DBCException {
    }
        if (name != null) {
        actions.add(new SQLDatabasePersistAction("Create User", builder.toString()));

                .map(quoteGroup -> DBUtils.getQuotedIdentifier(user.getDataSource(), quoteGroup))
        @NotNull DBRProgressMonitor monitor,
    }
    protected CubridPrivilage createDatabaseObject(
import org.jkiss.dbeaver.ext.cubrid.model.CubridPrivilage;
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            List<String> groups = (List<String>) properties.get("GROUPS");
        String newName = this.getNewName((CubridDataSource) container, "NEW_USER");
            return container.getDataSource().getCubridPrivilageCache();
    private static class DeletePersistAction extends SQLDatabasePersistActionAtomic {
import org.jkiss.dbeaver.model.DBPDataSource;
        @NotNull Map<String, Object> options
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull
    private String getNewName(@NotNull CubridDataSource container, @NotNull String baseName) {
        if (description != null && CommonUtils.isNotEmpty(description.toString())) {

    protected void addObjectDeleteActions(
        }


import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
                i == 0 ? baseName : (baseName + "_" + i)
    }
        return null;
import org.jkiss.dbeaver.model.DBUtils;
        return baseName;
    }
            super.afterExecute(session, error);
                .toList();
        @NotNull Map<String, Object> options
package org.jkiss.dbeaver.ext.cubrid.edit;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    private void buildBody(CubridPrivilage user, StringBuilder builder, Map<Object, Object> properties) {
        }
        @NotNull DBCExecutionContext executionContext,
        }
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
        @NotNull DBRProgressMonitor monitor,
 * you may not use this file except in compliance with the License.
            builder.append(" GROUPS ");
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;

public class CubridUserManager
        Object group = properties.get("GROUPS");
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

            builder.append(" PASSWORD ");
        }
        @NotNull DBECommandContext context,
 * You may obtain a copy of the License at
                DBUtils.fireObjectRemove(user);
    public DBSObjectCache<? extends DBSObject, CubridPrivilage> getObjectsCache(CubridPrivilage object) {
 *
    @Override
/*
        return !object.getDataSource().isShard();
    @NotNull
    @Override
        StringBuilder builder = new StringBuilder();
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            DBSObject child = container.getCubridPrivilageCache().getCachedObject(transform);
    @Nullable
        return !object.getDataSource().isShard();
    }
        @Override
        if (group != null && !CommonUtils.isEmpty((List<String>) properties.get("GROUPS"))) {
import java.util.Map;
        @NotNull ObjectDeleteCommand command,
    extends SQLObjectEditor<CubridPrivilage, GenericStructContainer> /*implements DBEObjectRenamer<OracleSchema>*/ {
            }



    ) {

        }
import org.jkiss.dbeaver.model.exec.DBCSession;
    }

import org.jkiss.utils.CommonUtils;
 *
 * Unless required by applicable law or agreed to in writing, software
    ) {
        Object password = properties.get("PASSWORD");
        CubridPrivilage database;
    public boolean canDeleteObject(CubridPrivilage object) {
}
    private static final int MAX_NAME_GEN_ATTEMPTS = 100;

            if (child == null) {
            builder.append(SQLUtils.quoteString(user, description.toString()));
            builder.append(" COMMENT ");
import org.jkiss.dbeaver.ext.cubrid.model.CubridDataSource;
            builder.append(String.join(", ", quotedGroups));
    @Override
        @NotNull List<DBEPersistAction> actions,
            );

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionAtomic;
    public boolean canEditObject(CubridPrivilage object) {
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
            if (error == null) {

import org.jkiss.dbeaver.model.exec.DBCException;

        String builder = "DROP USER " + DBUtils.getQuotedIdentifier(command.getObject());
        @NotNull final Object container,
        CubridPrivilage user = command.getObject();

        builder.append(DBUtils.getQuotedIdentifier(user.getDataSource(), this.getUserName(user, command.getProperties())));
        return user.getName();
                container.getDataSource(),
        @Nullable Object copyFrom,
        buildBody(user, builder, command.getProperties());
    @Override
                GenericSchema user = this.database.getParentObject().getSchema(database.getName());
        @NotNull ObjectCreateCommand command,
        @NotNull List<DBEPersistAction> actions,
            super("drop user", script);
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
        @NotNull DBCExecutionContext executionContext,
        return new CubridPrivilage((CubridDataSource) container, newName, null);
            user.setName(name.toString().toUpperCase());
        @NotNull DBRProgressMonitor monitor,
 * limitations under the License.
        return !((CubridDataSource) container).isShard();
        }
        Object description = properties.get("DESCRIPTION");
        Object name = properties.get("NAME");
        if (parentObject instanceof CubridDataSource container) {
 * See the License for the specific language governing permissions and
        return FEATURE_EDITOR_ON_CREATE;

        if (password != null && CommonUtils.isNotEmpty(password.toString())) {
        actions.add(new DeletePersistAction(command.getObject(), builder));
        }
    }
    public boolean canCreateObject(@NotNull Object container) {
    }
 *
        log.error("Error generating child object name: max attempts reached");
        builder.append("CREATE USER ");
import org.jkiss.code.Nullable;
        public DeletePersistAction(CubridPrivilage privilage, String script) {
    @Override

 */
                return transform;
        }
import java.util.List;
            String transform = DBObjectNameCaseTransformer.transformName(
