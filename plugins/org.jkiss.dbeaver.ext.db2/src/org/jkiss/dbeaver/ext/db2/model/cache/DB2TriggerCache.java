
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema) throws SQLException
 * distributed under the License is distributed on an "AS IS" BASIS,
            return null;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.ext.db2.model.DB2Trigger;
 *
        return dbStat;
        dbStat.setString(1, db2Schema.getName());
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.


 * @author Denis Forveille
    private static final String SQL_TRIG_ALL = "SELECT * FROM SYSCAT.TRIGGERS WHERE TRIGSCHEMA = ? ORDER BY TRIGNAME WITH UR";
/**
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
import java.sql.SQLException;
 *
import org.jkiss.dbeaver.ext.db2.model.DB2Table;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
        DBException
        // Look for related table
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class DB2TriggerCache extends JDBCObjectCache<DB2Schema, DB2Trigger> {
import org.jkiss.dbeaver.DBException;
 * 
    {
 */
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        if (CommonUtils.isEmpty(tableName)) {
package org.jkiss.dbeaver.ext.db2.model.cache;
}
            return null;
    }
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.code.NotNull;
        }
/*
            log.debug("A table name for trigger is empty");
import org.jkiss.dbeaver.Log;
            tableSchemaName, tableName);
    private static final Log log = Log.getLog(DB2TriggerCache.class);
    {
    protected DB2Trigger fetchObject(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @NotNull JDBCResultSet dbResult) throws SQLException,
    @Override
 * You may obtain a copy of the License at

 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.CommonUtils;
 *
import org.jkiss.dbeaver.ext.db2.DB2Utils;
        String tableName = JDBCUtils.safeGetStringTrimmed(dbResult, "TABNAME");
        DB2Table db2Table = DB2Utils.findTableBySchemaNameAndName(session.getProgressMonitor(), db2Schema.getDataSource(),
 */
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
    @Override
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)

        }

        if (db2Table == null) {
        return new DB2Trigger(db2Schema, db2Table, dbResult);
 * Cache for DB2 Triggers
            log.debug("Can't find trigger's table " + tableName);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        String tableSchemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "TABSCHEMA");
 * DBeaver - Universal Database Manager

        JDBCPreparedStatement dbStat = session.prepareStatement(SQL_TRIG_ALL);
 * Licensed under the Apache License, Version 2.0 (the "License");
