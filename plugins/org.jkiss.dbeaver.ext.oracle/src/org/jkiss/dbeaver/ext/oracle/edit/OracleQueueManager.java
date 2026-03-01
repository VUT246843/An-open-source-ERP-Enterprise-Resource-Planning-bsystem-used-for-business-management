        @NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,

        Object copyFrom, @NotNull Map<String, Object> options) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return false;
package org.jkiss.dbeaver.ext.oracle.edit;

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
import org.jkiss.dbeaver.DBException;

        }
 *
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        return FEATURE_EDITOR_ON_CREATE;
    @Override
    }
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options) throws DBException {
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 */
        return object.getSchema().queueCache;

    @Override
}

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override

        OracleSchema schema = (OracleSchema) container;

 * distributed under the License is distributed on an "AS IS" BASIS,
        if (CommonUtils.isEmpty(command.getObject().getName())) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
    @Override
    @Nullable
    }
    @Override
    }
        final Object container,
/*
 * You may obtain a copy of the License at
import java.util.Map;
    public DBSObjectCache<? extends DBSObject, OracleQueue> getObjectsCache(OracleQueue object) {
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
    @Override
public class OracleQueueManager extends SQLObjectEditor<OracleQueue, OracleSchema> {
 *
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 * Unless required by applicable law or agreed to in writing, software
    protected OracleQueue createDatabaseObject(
    public boolean canCreateObject(@NotNull Object container) {
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.ext.oracle.model.OracleSchema;
    @Override
    }

    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.code.NotNull;
    }

    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.code.Nullable;
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    }
import java.util.List;



import org.jkiss.dbeaver.ext.oracle.model.OracleQueue;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            throw new DBException("Queue name cannot be empty");


        return new OracleQueue(schema, "NEW_QUEUE");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
 * DBeaver - Universal Database Manager
 * limitations under the License.
