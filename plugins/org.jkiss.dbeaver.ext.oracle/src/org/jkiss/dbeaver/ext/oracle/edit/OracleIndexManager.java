
    protected OracleTableIndex createDatabaseObject(


    @Override
        Object from,

    protected String getDropIndexPattern(OracleTableIndex index) {
            "INDEX",
        @NotNull DBRProgressMonitor monitor,
 * you may not use this file except in compliance with the License.
        return new OracleTableIndex(

 * See the License for the specific language governing permissions and
 * Oracle index manager
    @Override
/**
import org.jkiss.code.NotNull;
 */
        final Object container,

        OracleTableBase table = (OracleTableBase) container;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
        return object.getParentObject().getSchema().indexCache;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 *
    }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * DBeaver - Universal Database Manager
import java.util.Map;
        return "DROP INDEX " + PATTERN_ITEM_INDEX; //$NON-NLS-1$ //$NON-NLS-2$
package org.jkiss.dbeaver.ext.oracle.edit;
            table.getSchema(),
import org.jkiss.code.Nullable;
}
public class OracleIndexManager extends SQLIndexManager<OracleTableIndex, OracleTableBase> {
            true,
import org.jkiss.dbeaver.model.struct.DBSObject;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull DBECommandContext context,
 * You may obtain a copy of the License at
    public DBSObjectCache<? extends DBSObject, OracleTableIndex> getObjectsCache(OracleTableIndex object) {
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
            DBSIndexType.UNKNOWN);
    }
        @NotNull Map<String, Object> options
 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLIndexManager;
import org.jkiss.dbeaver.ext.oracle.model.OracleTableIndex;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * limitations under the License.
import org.jkiss.dbeaver.ext.oracle.model.OracleTableBase;
 * Unless required by applicable law or agreed to in writing, software
    }
    ) {
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
            table,
 *
    @Nullable
