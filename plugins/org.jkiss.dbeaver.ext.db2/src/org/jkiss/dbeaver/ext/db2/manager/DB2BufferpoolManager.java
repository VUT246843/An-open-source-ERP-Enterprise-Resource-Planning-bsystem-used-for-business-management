    @Override
 *
 * you may not use this file except in compliance with the License.
 * limitations under the License.


 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;
    @Override

 * DB2 Bufferpool Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
    public String buildDropStatement(DB2Bufferpool db2Bufferpool)
    private static final String SQL_DROP = "DROP BUFFERPOOL %s";
    {
import org.jkiss.dbeaver.ext.db2.model.DB2Bufferpool;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    public DBSObjectCache<DB2DataSource, DB2Bufferpool> getObjectsCache(DB2Bufferpool db2Bufferpool)
/**
 * DBeaver - Universal Database Manager
 */
        return String.format(SQL_DROP, name);

    {
        String name = db2Bufferpool.getName();
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
/*
    @Nullable
public class DB2BufferpoolManager extends DB2AbstractDropOnlyManager<DB2Bufferpool, DB2DataSource> {
package org.jkiss.dbeaver.ext.db2.manager;
        return db2Bufferpool.getDataSource().getBufferpoolCache();
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software

    }
 *
 * @author Denis Forveille

 * 
 *
}import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
