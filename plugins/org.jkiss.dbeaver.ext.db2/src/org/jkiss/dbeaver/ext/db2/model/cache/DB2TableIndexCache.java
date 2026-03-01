 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * You may obtain a copy of the License at
        return dbStat;

    @Override
        throws SQLException
 * Unless required by applicable law or agreed to in writing, software
        dbStat.setString(1, db2Table.getSchema().getName());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

 *
        // Lookup for indexes in right cache..
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
    }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2TableBase db2Table)
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.db2.model.DB2Index;
 * limitations under the License.

        return DB2Utils.findIndexBySchemaNameAndName(session.getProgressMonitor(), db2Table.getDataSource(), indexSchemaName,

 * distributed under the License is distributed on an "AS IS" BASIS,

 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
    @Override
        String indexSchemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "INDSCHEMA");
 * DBeaver - Universal Database Manager
    @NotNull
 
package org.jkiss.dbeaver.ext.db2.model.cache;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
 *
    }
import org.jkiss.dbeaver.ext.db2.DB2Utils;

 * 
 *
/*
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
import java.sql.SQLException;
}
 */
 * @author Denis Forveille
        dbStat.setString(2, db2Table.getName());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            indexName);
    protected DB2Index fetchObject(@NotNull JDBCSession session, @NotNull DB2TableBase db2Table, @NotNull JDBCResultSet dbResult)

        throws SQLException, DBException
 * Cache for DB2 Indexes for a given Table
    {
/**
    private static final String SQL_INDS_TAB = "SELECT * FROM SYSCAT.INDEXES WHERE TABSCHEMA = ? AND TABNAME = ? ORDER BY INDNAME WITH UR";
public class DB2TableIndexCache extends JDBCObjectCache<DB2TableBase, DB2Index> {
        String indexName = JDBCUtils.safeGetStringTrimmed(dbResult, "INDNAME");
        final JDBCPreparedStatement dbStat = session.prepareStatement(SQL_INDS_TAB);
