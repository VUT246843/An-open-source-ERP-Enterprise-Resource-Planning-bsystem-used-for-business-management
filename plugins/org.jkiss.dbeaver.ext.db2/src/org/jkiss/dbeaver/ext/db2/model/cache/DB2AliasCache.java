        sb2.append("   FROM SYSCAT.SEQUENCES");
        return dbStat;
        sb2.append("  WHERE SEQSCHEMA = ?"); // 2
        StringBuilder sb3 = new StringBuilder(64);
public final class DB2AliasCache extends JDBCObjectCache<DB2Schema, DB2Alias> {

        sb3.append("        , TYPE");
        sb2.append(" UNION ALL");
        sb2.append("       , SEQNAME AS NAME");
    protected DB2Alias fetchObject(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @NotNull JDBCResultSet resultSet) throws SQLException, DBException
    }
        sb2.append("       , MODULENAME AS NAME");
 */

 * Copyright (C) 2010-2024 DBeaver Corp and others

        sb2.append(" SELECT 'MODULE' as TYPE ");
package org.jkiss.dbeaver.ext.db2.model.cache;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        return new DB2Alias(session.getProgressMonitor(), db2Schema, resultSet);
        sb3.append(" WITH UR");
        String sql;
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
        JDBCPreparedStatement dbStat = session.prepareStatement(sql);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        sb2.append("   FROM SYSCAT.MODULES");
    {
            sql = SQL_FULL;
        sb1.append(" SELECT 'TABLE' as TYPE ");
        sb1.append("      , BASE_TABNAME AS BASE_NAME");
        } else {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

            dbStat.setString(2, db2Schema.getName());
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
 * You may obtain a copy of the License at
/**
        if (db2DataSource.isAtLeastV9_7()) {

 * Unless required by applicable law or agreed to in writing, software
        sb2.append(" SELECT 'SEQUENCE' as TYPE ");
 * distributed under the License is distributed on an "AS IS" BASIS,
        DB2DataSource db2DataSource = db2Schema.getDataSource();
        sb2.append(" UNION ALL");
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema) throws SQLException

        SQL_WITHOUT_MODULE_AND_SEQUALIAS = sb1.toString() + sb3.toString();
        sb2.append("    AND SEQTYPE = '").append(DB2TableType.A.name()).append("'");
        sb1.append("      , BASE_TABSCHEMA AS BASE_SCHEMA");

        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * limitations under the License.
        StringBuilder sb1 = new StringBuilder(1024);

        if (db2DataSource.isAtLeastV9_7()) {
 * 
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        sb2.append("  WHERE MODULESCHEMA = ?"); // 3
    @NotNull
 *
        sb2.append("    AND MODULETYPE = '").append(DB2TableType.A.name()).append("'");
 */
        sb1.append("    AND TYPE = '").append(DB2TableType.A.name()).append("'");
        sb1.append("      , TABNAME AS NAME");

        sb1.append("   FROM SYSCAT.TABLES");
            sql = SQL_WITHOUT_MODULE_AND_SEQUALIAS;
        sb3.append(" ORDER BY NAME");
        dbStat.setString(1, db2Schema.getName());
import org.jkiss.dbeaver.ext.db2.model.DB2Alias;
    private static final String SQL_FULL;
        sb2.append("       , BASE_SEQSCHEMA AS BASE_SCHEMA");
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
    private static final String SQL_WITHOUT_MODULE_AND_SEQUALIAS;
        sb2.append("       , BASE_MODULESCHEMA AS BASE_SCHEMA");
import java.sql.SQLException;
} *
 * @author Denis Forveille
        SQL_FULL = sb1.toString() + sb2.toString() + sb3.toString();
import org.jkiss.dbeaver.DBException;
        }
    {
            dbStat.setString(3, db2Schema.getName());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        sb2.append("       , BASE_MODULENAME AS BASE_NAME");
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TableType;
        sb2.append("       , BASE_SEQNAME AS BASE_NAME");
        StringBuilder sb2 = new StringBuilder(256);
    }

import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
 * you may not use this file except in compliance with the License.
 * Cache for DB2 Aliases
 * DBeaver - Universal Database Manager
    }
/*
    static {
import org.jkiss.code.NotNull;
        sb1.append("  WHERE TABSCHEMA = ?"); // 1
