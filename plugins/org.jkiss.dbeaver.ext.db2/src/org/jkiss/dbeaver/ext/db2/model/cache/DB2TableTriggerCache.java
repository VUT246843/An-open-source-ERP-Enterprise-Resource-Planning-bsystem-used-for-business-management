import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
    @Override
 * @author Denis Forveille
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
 * limitations under the License.
/*
package org.jkiss.dbeaver.ext.db2.model.cache;
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
/**
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.

        return dbStat;
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        String triggerSchemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "TRIGSCHEMA");
}
        return DB2Utils.findTriggerBySchemaNameAndName(session.getProgressMonitor(), db2Table.getDataSource(), triggerSchemaName,
 */
    @Override
    private static final String SQL_TRIG_TAB = "SELECT * FROM SYSCAT.TRIGGERS WHERE TABSCHEMA = ? AND TABNAME = ? ORDER BY TRIGNAME WITH UR";
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2Table db2Table) throws SQLException
        // Lookup for trigger in right cache..
public class DB2TableTriggerCache extends JDBCObjectCache<DB2Table, DB2Trigger> {
 * Licensed under the Apache License, Version 2.0 (the "License");

        DBException
        String triggerName = JDBCUtils.safeGetStringTrimmed(dbResult, "TRIGNAME");

import java.sql.SQLException;
    protected DB2Trigger fetchObject(@NotNull JDBCSession session, @NotNull DB2Table db2Table, @NotNull JDBCResultSet dbResult) throws SQLException,
import org.jkiss.dbeaver.ext.db2.model.DB2Table;
        dbStat.setString(1, db2Table.getSchema().getName());
    @NotNull
    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        dbStat.setString(2, db2Table.getName());
import org.jkiss.dbeaver.ext.db2.DB2Utils;
import org.jkiss.code.NotNull;
 * Cache for DB2 Triggers for a given Table
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * 
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;


import org.jkiss.dbeaver.ext.db2.model.DB2Trigger;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        final JDBCPreparedStatement dbStat = session.prepareStatement(SQL_TRIG_TAB);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.DBException;

    }
 *
 *

 */
 *
    {
            triggerName);
