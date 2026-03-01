 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
import org.jkiss.code.Nullable;
 * 
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    private static final String SQL_DROP = "DROP VARIABLE %s RESTRICT";

import org.jkiss.dbeaver.ext.db2.model.DB2Variable;
 *
 * @author Denis Forveille
}
 */
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
    {
/*
    public DBSObjectCache<DB2DataSource, DB2Variable> getObjectsCache(DB2Variable db2Variable)

        String name = db2Variable.getName();
    }
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
 *
        return String.format(SQL_DROP, name);
package org.jkiss.dbeaver.ext.db2.manager;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
    {
    }
 * See the License for the specific language governing permissions and
    @Override
 * limitations under the License.
 * DB2 Variable Manager
public class DB2VariableManager extends DB2AbstractDropOnlyManager<DB2Variable, DB2DataSource> {
        return db2Variable.getDataSource().getVariableCache();
    @Nullable
    public String buildDropStatement(DB2Variable db2Variable)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 */
