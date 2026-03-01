 * DBeaver - Universal Database Manager
            (DB2TableBase) table,
    }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.Map;

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.DBSObject;

    @Override
        return new DB2Index(
            DBSIndexType.UNKNOWN,
        return false;
public class DB2IndexManager extends SQLIndexManager<DB2Index, DB2TableBase> {
import org.jkiss.dbeaver.model.edit.DBECommandContext;

    @Override

 * You may obtain a copy of the License at
/*


        DB2TableBase table = (DB2TableBase) container;
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLIndexManager;

    public boolean canEditObject(@NotNull DB2Index object) {
    @Override
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.ext.db2.model.DB2Index;
 * @author Denis Forveille
}
            DB2UniqueRule.U);
 *
 * See the License for the specific language governing permissions and
        return object.getParentObject().getSchema().getIndexCache();
    protected DB2Index createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object from, @NotNull Map<String, Object> options) {
 *
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
/**
 */
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
            "INDEX",
import org.jkiss.code.NotNull;
 *
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
package org.jkiss.dbeaver.ext.db2.manager;
 *
 * DB2 Index manager
import org.jkiss.dbeaver.ext.db2.model.dict.DB2UniqueRule;
    }
    }
    public DBSObjectCache<? extends DBSObject, DB2Index> getObjectsCache(DB2Index object) {
 */
