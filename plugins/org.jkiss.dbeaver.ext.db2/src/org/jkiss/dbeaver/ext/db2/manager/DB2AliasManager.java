 * DBeaver - Universal Database Manager
            return String.format(SQL_DROP_SEQUENCE, fullyQualifiedName);
    private static final String SQL_DROP_MODULE = "DROP ALIAS %s FOR MODULE";
    }
    }
}
 */
import org.jkiss.code.Nullable;
        }
    @Nullable
/*
 * you may not use this file except in compliance with the License.
            return String.format(SQL_DROP_TABLE, fullyQualifiedName);

        return db2Alias.getSchema().getAliasCache();
    @Override
        default:

        case SEQUENCE:
package org.jkiss.dbeaver.ext.db2.manager;
 *
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
    @Override
        String fullyQualifiedName = db2Alias.getFullyQualifiedName(DBPEvaluationContext.DDL);
 * limitations under the License.
import org.jkiss.dbeaver.ext.db2.model.DB2Alias;
 * @author Denis Forveille
    public String buildDropStatement(DB2Alias db2Alias)
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * You may obtain a copy of the License at
    public DBSObjectCache<DB2Schema, DB2Alias> getObjectsCache(DB2Alias db2Alias)
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        case MODULE:

/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        case TABLE:

    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    {
        switch (db2Alias.getType()) {
            return String.format(SQL_DROP_MODULE, fullyQualifiedName);
 * distributed under the License is distributed on an "AS IS" BASIS,
public class DB2AliasManager extends DB2AbstractDropOnlyManager<DB2Alias, DB2Schema> {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    private static final String SQL_DROP_TABLE = "DROP ALIAS %s FOR TABLE";
 * Licensed under the Apache License, Version 2.0 (the "License");
 * 

    private static final String SQL_DROP_SEQUENCE = "DROP ALIAS %s FOR SEQUENCE";
 * DB2 Alias Manager
            throw new IllegalArgumentException(db2Alias.getType() + " as DB2AliasType is not supported");
 * See the License for the specific language governing permissions and


