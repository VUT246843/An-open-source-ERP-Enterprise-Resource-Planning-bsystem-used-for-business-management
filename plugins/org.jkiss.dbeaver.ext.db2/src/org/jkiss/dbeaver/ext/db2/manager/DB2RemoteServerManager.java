 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * limitations under the License.
 * @author Denis Forveille
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * 
        return db2RemoteServer.getDataSource().getRemoteServerCache();
 * DB2 Federated Server Manager
 * See the License for the specific language governing permissions and
        return String.format(SQL_DROP, name);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.

 *
    public String buildDropStatement(DB2RemoteServer db2RemoteServer)
    @Override
package org.jkiss.dbeaver.ext.db2.manager;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
 */
    {

    {
 *
    public DBSObjectCache<DB2DataSource, DB2RemoteServer> getObjectsCache(DB2RemoteServer db2RemoteServer)
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    @Override
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ext.db2.model.fed.DB2RemoteServer;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static final String SQL_DROP = "DROP SERVER %s";
/**
    }

}
public class DB2RemoteServerManager extends DB2AbstractDropOnlyManager<DB2RemoteServer, DB2DataSource> {
 */
        String name = db2RemoteServer.getName();
 * You may obtain a copy of the License at

/*
    }
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
