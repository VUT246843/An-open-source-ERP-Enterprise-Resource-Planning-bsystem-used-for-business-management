    @Nullable
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    private static final String SQL_DROP = "DROP WRAPPER %s";
    @Override
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
public class DB2WrapperManager extends DB2AbstractDropOnlyManager<DB2Wrapper, DB2Schema> {
        return db2Wrapper.getDataSource().getWrapperCache();

import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
 * See the License for the specific language governing permissions and
 * DB2 Federated Wrapper Manager
    public DBSObjectCache<DB2DataSource, DB2Wrapper> getObjectsCache(DB2Wrapper db2Wrapper)
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
/*
 * 
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;

/**
    @Override
 * limitations under the License.
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
        return String.format(SQL_DROP, name);
    {
 * You may obtain a copy of the License at

 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.db2.manager;

 */
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 * Unless required by applicable law or agreed to in writing, software

}
 * @author Denis Forveille
 *
 */
    }
    public String buildDropStatement(DB2Wrapper db2Wrapper)
    {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        String name = db2Wrapper.getName();
import org.jkiss.dbeaver.ext.db2.model.fed.DB2Wrapper;
 * Copyright (C) 2010-2024 DBeaver Corp and others
