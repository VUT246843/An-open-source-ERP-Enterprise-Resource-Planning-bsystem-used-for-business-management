    @Nullable
 *
        final Object container,
    @Override
 */
            "PK",
 * See the License for the specific language governing permissions and
 *
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTable;
 * You may obtain a copy of the License at


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            false);
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    @Override
import java.util.Map;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableType;
    }
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableBase;
import org.jkiss.code.NotNull;
/**
        Object from,
    @Override
    }
            DBSEntityConstraintType.PRIMARY_KEY,
 *
            null,
    protected boolean isShortNotation(SQLServerTableBase owner) {
        @NotNull DBRProgressMonitor monitor,
    protected boolean isPrimaryKeyOrdered() {
    public DBSObjectCache<? extends DBSObject, SQLServerTableUniqueKey> getObjectsCache(SQLServerTableUniqueKey object)
 * you may not use this file except in compliance with the License.

            table,
package org.jkiss.dbeaver.ext.mssql.edit;
 * Unless required by applicable law or agreed to in writing, software
    public boolean canCreateObject(@NotNull Object container) {
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override

        return owner instanceof SQLServerTableType;
/*
    }
        return true;
import org.jkiss.code.Nullable;
    }
    @Override
        return object.getParentObject().getContainer().getUniqueConstraintCache();
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull DBECommandContext context,
public class SQLServerUniqueKeyManager extends SQLConstraintManager<SQLServerTableUniqueKey, SQLServerTableBase> {
        return new SQLServerTableUniqueKey(
 */
    {

import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableUniqueKey;
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
 * SQL server unique constraint manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }

    protected SQLServerTableUniqueKey createDatabaseObject(
        SQLServerTable table = (SQLServerTable) container;
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLConstraintManager;
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        return container instanceof SQLServerTable;
            null,

    {


