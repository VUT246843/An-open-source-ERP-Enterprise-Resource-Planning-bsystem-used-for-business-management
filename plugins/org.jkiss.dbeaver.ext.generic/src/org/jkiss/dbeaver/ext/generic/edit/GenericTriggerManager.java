    protected void createOrReplaceTriggerQuery(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull DBRProgressMonitor monitor,
 */
        boolean create
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTriggerManager;
import org.jkiss.code.NotNull;

 * DBeaver - Universal Database Manager
            return (DBSObjectCache) tableBase.getContainer().getTableTriggerCache();
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    ) throws DBException {
import java.util.List;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
            return (DBSObjectCache) structContainer.getTableTriggerCache();
 * Copyright (C) 2010-2024 DBeaver Corp and others
        Object container,
    }
        Object copyFrom,
 * limitations under the License.
    ) {
        return null;
    public DBSObjectCache<? extends DBSObject, TRIGGER> getObjectsCache(TRIGGER object) {
import org.jkiss.dbeaver.ext.generic.model.GenericTrigger;
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
/*
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    public boolean canDeleteObject(@NotNull TRIGGER object) {
    @Override
        @NotNull List<DBEPersistAction> actions,
 * See the License for the specific language governing permissions and
    @Nullable
        @NotNull DBCExecutionContext executionContext,
        }
        return false;
package org.jkiss.dbeaver.ext.generic.edit;
 * Unless required by applicable law or agreed to in writing, software
    public boolean canCreateObject(@NotNull Object container) {
        if (container instanceof GenericStructContainer structContainer) {
    TRIGGER extends GenericTrigger<?>>
import org.jkiss.dbeaver.DBException;
    @Override
        @NotNull Map<String, Object> options
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * You may obtain a copy of the License at

    protected TRIGGER createDatabaseObject(
 *
        throw new DBException("Not Implemented");
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
        DBSObject container = object.getContainer();

    extends SQLTriggerManager<TRIGGER, GenericTableBase> {
import org.jkiss.dbeaver.model.struct.DBSObject;
        @NotNull DBECommandContext context,

    @Override
        @NotNull DBRProgressMonitor monitor,
        throw new IllegalStateException("Not implemented");

        @NotNull TRIGGER trigger,
}
        return true;

import java.util.Map;
public class GenericTriggerManager<

        } else if (container instanceof GenericTableBase tableBase) {
 *
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    }
    }
