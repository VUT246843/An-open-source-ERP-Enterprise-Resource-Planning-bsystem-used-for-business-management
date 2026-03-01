 *     http://www.apache.org/licenses/LICENSE-2.0

package org.jkiss.dbeaver.ext.oracle.edit;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
public class OracleForeignKeyManager extends SQLForeignKeyManager<OracleTableForeignKey, OracleTableBase> {
        OracleTableBase table = (OracleTableBase) container;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
import java.util.Map;

import org.jkiss.dbeaver.ext.oracle.model.OracleTableBase;

    @Override
    {
            table,
import org.jkiss.dbeaver.ext.oracle.model.OracleTableForeignKey;
            OracleObjectStatus.ENABLED,
    protected OracleTableForeignKey createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object from, @NotNull Map<String, Object> options)

    {
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.oracle.model.OracleObjectStatus;
    @Override
 * limitations under the License.
            "",
 *
            null,
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
/**
import org.jkiss.code.Nullable;
}
 */
    }

 * See the License for the specific language governing permissions and

        return new OracleTableForeignKey(
        return object.getParentObject().getSchema().foreignKeyCache;
    public DBSObjectCache<? extends DBSObject, OracleTableForeignKey> getObjectsCache(OracleTableForeignKey object)
 * Oracle foreign key manager
/*
 */

            DBSForeignKeyModifyRule.NO_ACTION);
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
 *

    @Nullable
