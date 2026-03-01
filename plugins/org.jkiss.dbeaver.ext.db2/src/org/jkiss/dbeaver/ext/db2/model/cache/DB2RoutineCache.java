            sql = SQL_ALL;
    private final String SQL_ALL;

import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
/**
    {
        SQL_ALL = String.format(SQL_BASE_ALL, routineType.name());
        String sql;
import org.jkiss.dbeaver.ext.db2.model.DB2Routine;
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.db2.model.cache;
 */
    }
        }
    private final String SQL_V95;
    protected DB2Routine fetchObject(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @NotNull JDBCResultSet dbResult) throws SQLException, DBException
        dbStat.setString(1, db2Schema.getName());
    public DB2RoutineCache(DB2RoutineType routineType)
}    @Override
        return new DB2Routine(db2Schema, dbResult);
 * Unless required by applicable law or agreed to in writing, software
/*
            sql = SQL_V95;


import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
        } else {
import org.jkiss.dbeaver.ext.db2.model.dict.DB2RoutineType;

import org.jkiss.code.NotNull;
    private static final String SQL_BASE_V95 = "SELECT * FROM SYSCAT.ROUTINES WHERE ROUTINESCHEMA = ? AND ROUTINETYPE= '%s' ORDER BY ROUTINENAME WITH UR";
 * @author Denis Forveille
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
 * you may not use this file except in compliance with the License.
    @Override
public class DB2RoutineCache extends JDBCObjectCache<DB2Schema, DB2Routine> {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    private static final String SQL_BASE_ALL = "SELECT * FROM SYSCAT.ROUTINES WHERE ROUTINESCHEMA = ? AND ROUTINETYPE= '%s' AND ROUTINEMODULENAME IS NULL ORDER BY ROUTINENAME WITH UR";
        JDBCPreparedStatement dbStat = session.prepareStatement(sql);
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema) throws SQLException
        if (db2Schema.getDataSource().isAtLeastV9_7()) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.DBException;
        return dbStat;

 */


 * 
        SQL_V95 = String.format(SQL_BASE_V95, routineType.name());
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        super();
 * You may obtain a copy of the License at
 * Cache for DB2 Routines (UDF + Methods + Procedures)
 * Licensed under the Apache License, Version 2.0 (the "License");
 *


 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
import java.sql.SQLException;
    @NotNull
    {
