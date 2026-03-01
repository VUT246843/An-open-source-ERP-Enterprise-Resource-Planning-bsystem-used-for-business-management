
public class DB2TablespaceManager extends DB2AbstractDropOnlyManager<DB2Tablespace, DB2DataSource> {
 * See the License for the specific language governing permissions and
        return db2Tablespace.getDataSource().getTablespaceCache();
        return String.format(SQL_DROP, name);
 * you may not use this file except in compliance with the License.
/**
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
    }
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.ext.db2.model.DB2Tablespace;
    @Override
}
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    }
package org.jkiss.dbeaver.ext.db2.manager;
/*
    @Override

    private static final String SQL_DROP = "DROP TABLESPACE %s";
 */
import org.jkiss.code.Nullable;

 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String buildDropStatement(DB2Tablespace db2Tablespace)
    {
    @Nullable
 *
 * @author Denis Forveille
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
 * DB2 Tablespace Manager
    public DBSObjectCache<DB2DataSource, DB2Tablespace> getObjectsCache(DB2Tablespace db2Tablespace)
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 * 
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
        String name = db2Tablespace.getName();
