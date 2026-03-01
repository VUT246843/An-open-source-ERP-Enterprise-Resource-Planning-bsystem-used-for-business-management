import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.db2.model.DB2GlobalObject;
/**
    @Override
    private String authId;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        String remoteServerName = JDBCUtils.safeGetStringTrimmed(dbResult, "SERVERNAME");

 * distributed under the License is distributed on an "AS IS" BASIS,
        remoteServer = db2DataSource.getRemoteServer(new VoidProgressMonitor(), remoteServerName);
    }
    @Property(viewable = true, order = 2)
public class DB2UserMapping extends DB2GlobalObject {
 * Unless required by applicable law or agreed to in writing, software
    public String getName()
import org.jkiss.code.NotNull;
        this.authId = JDBCUtils.safeGetStringTrimmed(dbResult, "AUTHID");
    // -----------------
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;

    {
    // Properties
    // -----------------
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        return authId;
 * 
 * DBeaver - Universal Database Manager

 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others

    // Constructors
    // -----------------

 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
import java.sql.ResultSet;
        return remoteServer;
    @NotNull
    private DB2RemoteServer remoteServer;
        super(db2DataSource, true);

 *
    public DB2UserMapping(DB2DataSource db2DataSource, ResultSet dbResult) throws DBException

    @Property(viewable = true, order = 1)
    // -----------------
 * DB2 Federated User Mapping
 * @author Denis Forveille

 */
    public DB2RemoteServer getRemoteServer()
 *
    {

    }
import org.jkiss.dbeaver.model.meta.Property;
 * limitations under the License.

 *
 */
    {

}
    }
package org.jkiss.dbeaver.ext.db2.model.fed;
