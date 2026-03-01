    public boolean canCreateObject(@NotNull Object container) {
import org.jkiss.dbeaver.ext.mssql.model.SQLServerDataType;
    public boolean canEditObject(@NotNull SQLServerDataType object) {

    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.model.struct.DBSObject;
 *
        actions.add(
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        return false;

import org.jkiss.code.NotNull;
    }

 *
    }
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        return object.isUserType();
    @Override
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        );

import java.util.Map;

    @Override
    @Override
    protected SQLServerDataType createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
package org.jkiss.dbeaver.ext.mssql.edit;

    }
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
import org.jkiss.code.Nullable;
    @Override
public class SQLServerDataTypeManager extends SQLObjectEditor<SQLServerDataType, SQLServerSchema> {
    }
        return false;
        throw new IllegalStateException("Not implemented");
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        return FEATURE_EDITOR_ON_CREATE;
    }
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Override
    @Override
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
        return object.getContainer().getDataTypesCache();
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                new SQLDatabasePersistAction("Drop type", "DROP TYPE " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-2$
import org.jkiss.dbeaver.ext.mssql.model.SQLServerSchema;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public DBSObjectCache<? extends DBSObject, SQLServerDataType> getObjectsCache(SQLServerDataType object) {
 *
/*
    public boolean canDeleteObject(@NotNull SQLServerDataType object) {
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
 * limitations under the License.
    }
 * See the License for the specific language governing permissions and
    }
}
        throw new IllegalStateException("Not implemented");
import java.util.List;
 */
