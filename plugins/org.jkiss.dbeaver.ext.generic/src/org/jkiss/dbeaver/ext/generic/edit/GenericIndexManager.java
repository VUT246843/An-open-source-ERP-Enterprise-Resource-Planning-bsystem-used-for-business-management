    {
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
            tableBase,
public class GenericIndexManager extends SQLIndexManager<GenericTableIndex, GenericTableBase> {
 * you may not use this file except in compliance with the License.
            DBSIndexType.OTHER,
 *
    public boolean canDeleteObject(@NotNull GenericTableIndex object) {
            false);
 */
        GenericTableBase tableBase = (GenericTableBase) container;
    @Override
        return GenericUtils.canAlterTable(object);
/*
            && ((GenericTable) container).getDataSource().getInfo().supportsIndexes()
 *     http://www.apache.org/licenses/LICENSE-2.0
        Object from, @NotNull Map<String, Object> options)
    protected GenericTableIndex createDatabaseObject(
    @Override
    public boolean canCreateObject(@NotNull Object container) {
 * limitations under the License.
        return tableBase.getDataSource().getMetaModel().createIndexImpl(
 * Generic index manager

    public boolean canEditObject(@NotNull GenericTableIndex object) {
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
 * DBeaver - Universal Database Manager


 */

        return (container instanceof GenericTable)
        @NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container,
    }
}
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return object.getDataSource().getSQLDialect().supportsIndexCreateAndDrop();
import org.jkiss.code.Nullable;
/**
        return object.getTable().getContainer().getIndexCache();
            true,
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.ext.generic.model.GenericTableIndex;
package org.jkiss.dbeaver.ext.generic.edit;
 * Licensed under the Apache License, Version 2.0 (the "License");
            null,
import org.jkiss.dbeaver.model.struct.DBSObject;
            null,
    }
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
    @Override
    }

import java.util.Map;
            && ((GenericTable) container).getDataSource().getSQLDialect().supportsIndexCreateAndDrop();
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLIndexManager;
    public DBSObjectCache<? extends DBSObject, GenericTableIndex> getObjectsCache(GenericTableIndex object)
    }
            0,
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    {
 * Copyright (C) 2010-2025 DBeaver Corp and others


 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

