
    public DBSObjectCache<DB2DataSource, DB2StorageGroup> getObjectsCache(DB2StorageGroup db2StorageGroup)
/*
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
    private static final String SQL_DROP = "DROP STOGROUP %s RESTRICT";
 *
 */
        return db2StorageGroup.getDataSource().getStorageGroupCache();
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
 * 
        return String.format(SQL_DROP, name);
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
    @Nullable


public class DB2StorageGroupManager extends DB2AbstractDropOnlyManager<DB2StorageGroup, DB2DataSource> {
 * you may not use this file except in compliance with the License.
    }
 *
 *
    public String buildDropStatement(DB2StorageGroup db2StorageGroup)
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
 */
 * Unless required by applicable law or agreed to in writing, software
 * DB2 Storage Group Manager
import org.jkiss.dbeaver.ext.db2.model.DB2StorageGroup;

}
/**
 * limitations under the License.
    @Override
        String name = db2StorageGroup.getName();

 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.db2.manager;
 * @author Denis Forveille
