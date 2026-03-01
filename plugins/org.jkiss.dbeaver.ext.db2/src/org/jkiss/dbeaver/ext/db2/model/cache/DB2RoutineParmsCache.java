    }
            " ORDER BY ORDINAL" +
        return dbStat;
import java.sql.SQLException;
 * You may obtain a copy of the License at
    @Override
    }
 */
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            " WITH UR");
            " WHERE ROUTINESCHEMA = ? AND SPECIFICNAME = ?" +
 *
import org.jkiss.dbeaver.ext.db2.model.DB2RoutineParm;

import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.ext.db2.model.cache;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Cache for Routine parameters
/**
 * @author Denis Forveille
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
 *
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 *
/*
        DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0

public class DB2RoutineParmsCache extends JDBCObjectCache<DB2Routine, DB2RoutineParm> {
        dbStat.setString(1, db2Routine.getSchema().getName());
        dbStat.setString(2, db2Routine.getSpecificName());
        return new DB2RoutineParm(session.getProgressMonitor(), db2Routine, resultSet);
import org.jkiss.code.NotNull;
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2Routine db2Routine) throws SQLException {
 */
}            "SELECT * FROM SYSCAT.ROUTINEPARMS" +
 * See the License for the specific language governing permissions and

 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
        JDBCPreparedStatement dbStat = session.prepareStatement(
    @NotNull
import org.jkiss.dbeaver.ext.db2.model.DB2Routine;

import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override
    protected DB2RoutineParm fetchObject(@NotNull JDBCSession session, @NotNull DB2Routine db2Routine, @NotNull JDBCResultSet resultSet) throws SQLException,
 *
