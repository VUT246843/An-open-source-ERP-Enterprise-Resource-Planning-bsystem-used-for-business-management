 *
        return dbStat;
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
    }
    {

import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.db2.model.DB2TablespaceContainer;
 * @author Denis Forveille
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)

        dbStat.setInt(1, ts.getTbspaceId());
 * Cache for DB2 Tablespaces Containers
 * you may not use this file except in compliance with the License.
    @NotNull
    @Override
    {
import org.jkiss.dbeaver.ext.db2.model.DB2Tablespace;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2Tablespace ts) throws SQLException
import java.sql.SQLException;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private static final String SQL = "SELECT T.* FROM TABLE(SNAP_GET_CONTAINER('',-1)) AS T WHERE T.TBSP_ID= ? order by T.CONTAINER_ID WITH UR";
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
 * Unless required by applicable law or agreed to in writing, software

        throws SQLException, DBException
 */
        return new DB2TablespaceContainer(ts, resultSet);
    protected DB2TablespaceContainer fetchObject(@NotNull JDBCSession session, @NotNull DB2Tablespace ts, @NotNull JDBCResultSet resultSet)
 *
    @Override
        final JDBCPreparedStatement dbStat = session.prepareStatement(SQL);
 * 
    }
/**
package org.jkiss.dbeaver.ext.db2.model.cache;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
public class DB2TablespaceContainerCache extends JDBCObjectCache<DB2Tablespace, DB2TablespaceContainer> {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 *
import org.jkiss.dbeaver.DBException;
 * limitations under the License.

 */
 * DBeaver - Universal Database Manager
