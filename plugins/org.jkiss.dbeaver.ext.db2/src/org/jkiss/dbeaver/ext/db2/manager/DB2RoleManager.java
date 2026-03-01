
    @Override
import org.jkiss.dbeaver.ext.db2.model.security.DB2Role;

 * You may obtain a copy of the License at
        return String.format(SQL_DROP, name);

        return db2Role.getDataSource().getRoleCache();
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;

 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * @author Denis Forveille
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
}
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
        String name = db2Role.getName();
/**
 * DBeaver - Universal Database Manager

 *
    public DBSObjectCache<DB2DataSource, DB2Role> getObjectsCache(DB2Role db2Role)
package org.jkiss.dbeaver.ext.db2.manager;
import org.jkiss.code.Nullable;
    private static final String SQL_DROP = "DROP ROLE %s";
    @Nullable
    {
    }
public class DB2RoleManager extends DB2AbstractDropOnlyManager<DB2Role, DB2DataSource> {
 * you may not use this file except in compliance with the License.
 * limitations under the License.
    public String buildDropStatement(DB2Role db2Role)
/*
 * See the License for the specific language governing permissions and
 * DB2 Role Manager
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
