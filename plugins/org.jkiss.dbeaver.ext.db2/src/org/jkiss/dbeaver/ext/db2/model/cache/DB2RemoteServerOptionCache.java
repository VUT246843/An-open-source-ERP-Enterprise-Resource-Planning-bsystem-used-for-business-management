 * limitations under the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
        sb.append(" WHERE SERVERNAME = ?");// 1
public class DB2RemoteServerOptionCache extends JDBCObjectCache<DB2RemoteServer, DB2RemoteServerOption> {
 * 
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        throws SQLException, DBException
 * See the License for the specific language governing permissions and
    @Override
 * you may not use this file except in compliance with the License.
        // sb.append("   AND SERVERTYPE = ?");// 3
 * You may obtain a copy of the License at
import java.sql.SQLException;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        // dbStat.setString(3, remoteServer.getDataType());
 *
        final JDBCPreparedStatement dbStat = session.prepareStatement(SQL);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    @NotNull

 * DBeaver - Universal Database Manager
        sb.append(" ORDER BY OPTION");
package org.jkiss.dbeaver.ext.db2.model.cache;
        return new DB2RemoteServerOption(remoteServer, resultSet);
        // dbStat.setString(2, remoteServer.getDb2Wrapper().getName());
 */

        // dbStat.setString(4, remoteServer.getVersion());
    private static String SQL;
        sb.append(" WITH UR");
}
        sb.append("SELECT *");
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)

    {
import org.jkiss.dbeaver.ext.db2.model.fed.DB2RemoteServer;

import org.jkiss.dbeaver.DBException;
        return dbStat;
        // DF: Strange. The following columns are supposed to be the PK
        SQL = sb.toString();
    static {

import org.jkiss.dbeaver.ext.db2.model.fed.DB2RemoteServerOption;
 * Cache for DB2 Federated Remote Server Options
 */
        // sb.append("   AND SERVERVERSION = ?");// 4
    @Override
        dbStat.setString(1, remoteServer.getName());
/**
        StringBuilder sb = new StringBuilder(256);
    }
        sb.append("  FROM SYSCAT.SERVEROPTIONS");
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * @author Denis Forveille
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    protected DB2RemoteServerOption fetchObject(@NotNull JDBCSession session, @NotNull DB2RemoteServer remoteServer, @NotNull JDBCResultSet resultSet)
    }
        // but in practoce, they are always null...
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2RemoteServer remoteServer) throws SQLException
        // sb.append("   AND WRAPNAME = ?"); // 2
