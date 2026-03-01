        try {
        int shardValue;
    @Override

        if (SHARD_TYPE_ID.equals(shard.getName()) && (shardValue < 0 || shardValue > 1)) {
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    }
}
    protected void addObjectCreateActions(
        @NotNull DBCExecutionContext executionContext,
    private static final String PROP_SHARD_TYPE = "shardType";
    ) {
        return null;
    }
        /* This body intentionally empty. */
        }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

 * Licensed under the Apache License, Version 2.0 (the "License");

        connectionInfo.setProperty(PROP_SHARD_VALUE, shard.getValue());
public class CubridShardManager extends SQLObjectEditor<CubridShard, GenericStructContainer> {
        }
    public DBSObjectCache<? extends DBSObject, CubridShard> getObjectsCache(CubridShard object) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;
 * DBeaver - Universal Database Manager
        @NotNull Map<String, Object> options
        CubridShard shard = command.getObject();
            throw new IllegalArgumentException("Shard value must be a numeric value.");
    public boolean canCreateObject(@NotNull Object container) {
        return false;
    ) throws DBException {
    }
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.cubrid.model.CubridShard;
import org.jkiss.dbeaver.ext.cubrid.model.CubridDataSource;
        @NotNull List<DBEPersistAction> actions,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
package org.jkiss.dbeaver.ext.cubrid.edit;
        @NotNull DBRProgressMonitor monitor,
        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull DBCExecutionContext executionContext,
    }
        @NotNull DBECommandContext context,
    @Override
        connectionInfo.setProperty(PROP_SHARD_TYPE, shard.getName());
    ) {
 *
        @NotNull DBRProgressMonitor monitor,
    @Override
        @NotNull SQLObjectEditor<CubridShard, GenericStructContainer>.ObjectDeleteCommand command,
        CubridDataSource dataSource = shard.getDataSource();
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static final String PROP_SHARD_VALUE = "shardValue";
 * limitations under the License.
        Object container,
import org.jkiss.dbeaver.model.DBPDataSource;
 * you may not use this file except in compliance with the License.
            throw new IllegalArgumentException("The maximum allowed Shard ID is 1. Please enter a valid value.");
            shardValue = Integer.parseInt(shard.getValue());


        @NotNull List<DBEPersistAction> actions,
 *
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * See the License for the specific language governing permissions and
    protected CubridShard createDatabaseObject(
    protected void addObjectDeleteActions(
        } catch (NumberFormatException e) {
/*
 * You may obtain a copy of the License at
        @NotNull DBRProgressMonitor monitor,
    @Override


        @NotNull DBCExecutionContext executionContext,
    }
import java.util.Map;
 *

 * Unless required by applicable law or agreed to in writing, software
    @Override
import org.jkiss.code.NotNull;
    @Override

 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        @NotNull Map<String, Object> options
    ) {
        @NotNull DBRProgressMonitor monitor,
    protected void addObjectModifyActions(
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
        @NotNull Map<String, Object> options
import org.jkiss.dbeaver.model.edit.DBECommandContext;

    }
        return 0;
    public boolean canDeleteObject(@NotNull CubridShard object) {
        @NotNull SQLObjectEditor<CubridShard, GenericStructContainer>.ObjectCreateCommand command,
        return false;
        @NotNull Map<String, Object> options

        @NotNull List<DBEPersistAction> actions,
        /* This body intentionally empty. */
import java.util.List;
        Object copyFrom,
    }

    private static final String SHARD_TYPE_ID = "SHARD ID";
        @NotNull ObjectChangeCommand command,
    }



        DBPConnectionConfiguration connectionInfo = dataSource.getContainer().getConnectionConfiguration();
