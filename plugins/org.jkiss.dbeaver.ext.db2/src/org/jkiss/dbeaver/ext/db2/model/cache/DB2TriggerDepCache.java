        dbStat.setString(1, db2Trigger.getParentObject().getName());
 * Cache for dependencies on DB2 Triggers
import org.jkiss.dbeaver.ext.db2.model.DB2Trigger;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 */
    protected DB2TriggerDep fetchObject(@NotNull JDBCSession session, @NotNull DB2Trigger db2Trigger, @NotNull JDBCResultSet resultSet)
 *
    }

 * 
    {

        final JDBCPreparedStatement dbStat = session.prepareStatement(SQL);
 * @author Denis Forveille
import java.sql.SQLException;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
 * DBeaver - Universal Database Manager
    @Override
 *
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
 * limitations under the License.
        dbStat.setString(2, db2Trigger.getName());
 *
import org.jkiss.dbeaver.ext.db2.model.DB2TriggerDep;
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
public class DB2TriggerDepCache extends JDBCObjectCache<DB2Trigger, DB2TriggerDep> {
 */
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
}    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2Trigger db2Trigger) throws SQLException
 * you may not use this file except in compliance with the License.

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return new DB2TriggerDep(session.getProgressMonitor(), db2Trigger, resultSet);
/**
    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;


    @Override

        return dbStat;
    private static final String SQL = "SELECT * FROM SYSCAT.TRIGDEP WHERE TRIGSCHEMA = ? AND TRIGNAME = ? ORDER BY BSCHEMA,BNAME WITH UR";
import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.ext.db2.model.cache;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
        throws SQLException, DBException
