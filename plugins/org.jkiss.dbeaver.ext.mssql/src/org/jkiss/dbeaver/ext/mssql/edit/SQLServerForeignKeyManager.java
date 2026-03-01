        return object.getParentObject().getContainer().getForeignKeyCache();
import org.jkiss.code.Nullable;
    {
 * limitations under the License.

/*

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.Map;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableForeignKey;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return foreignKey;
    public DBSObjectCache<? extends DBSObject, SQLServerTableForeignKey> getObjectsCache(SQLServerTableForeignKey object)
 *
            DBSForeignKeyModifyRule.NO_ACTION,
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
    @Override

/**
import org.jkiss.code.NotNull;
    {
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
            null,
 *
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
    protected SQLServerTableForeignKey createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object table, Object from, @NotNull Map<String, Object> options)
 */
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
            false);
    }
package org.jkiss.dbeaver.ext.mssql.edit;
 * SQL Server foreign key manager
        SQLServerTableForeignKey foreignKey = new SQLServerTableForeignKey(

            DBSForeignKeyModifyRule.NO_ACTION,
            (SQLServerTable) table,
 *
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
            null,
        foreignKey.setName(getNewConstraintName(monitor, foreignKey));
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableBase;
            null,
 * distributed under the License is distributed on an "AS IS" BASIS,

public class SQLServerForeignKeyManager extends SQLForeignKeyManager<SQLServerTableForeignKey, SQLServerTableBase> {
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTable;
    @Nullable
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 */
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others

