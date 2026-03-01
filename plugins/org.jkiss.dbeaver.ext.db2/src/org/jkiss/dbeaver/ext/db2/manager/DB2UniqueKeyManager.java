        } else {

    // -----------------
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
    {
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    @Override
}
    @Nullable
        return false;

import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    // -----------------
    // ------
            return String.format(SQL_DROP_UK, tablename, constraint.getName());
    }
    }
 * DB2 Unique Keys Manager
 * you may not use this file except in compliance with the License.
        }
    // ------
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    // ------
    @Override
    public DB2TableUniqueKey createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object table,
    // Create

    public String getDropConstraintPattern(DB2TableUniqueKey constraint)
        String tablename = constraint.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL);
    public boolean canEditObject(@NotNull DB2TableUniqueKey object)
 *
 * @author Denis Forveille

    // ------

import org.jkiss.dbeaver.ext.db2.model.DB2TableUniqueKey;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override

 * limitations under the License.

    private static final String                    SQL_DROP_UK = "ALTER TABLE %s DROP UNIQUE %s";
    {
    {
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLConstraintManager;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    private static final String                    SQL_DROP_PK = "ALTER TABLE %s DROP PRIMARY KEY ";
package org.jkiss.dbeaver.ext.db2.manager;
    // Business Contract
 */

 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
 *

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
    // DROP
    {
        return object.getParentObject().getSchema().getConstraintCache();
import org.jkiss.dbeaver.ext.db2.model.DB2Table;
            return String.format(SQL_DROP_PK, tablename);
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPEvaluationContext;

    }
                                                  Object from, @NotNull Map<String, Object> options)
import java.util.Map;
 */
        return new DB2TableUniqueKey((DB2Table) table, DBSEntityConstraintType.UNIQUE_KEY);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.code.NotNull;

/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (constraint.getConstraintType().equals(DBSEntityConstraintType.PRIMARY_KEY)) {
public class DB2UniqueKeyManager extends SQLConstraintManager<DB2TableUniqueKey, DB2Table> {
 *
    public DBSObjectCache<? extends DBSObject, DB2TableUniqueKey> getObjectsCache(DB2TableUniqueKey object)
 * 
