
package org.jkiss.dbeaver.ext.db2.model.cache;
        }
/*
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            dbStat.setString(1, db2Schema.getName());
            return null;
        throws SQLException


    @Override
 * limitations under the License.

        sb.setLength(0);
            dbStat.setString(1, db2Schema.getName());

    private static final String SQL_IND;
        if (db2Index != null || db2IndexName != null) {
            dbStat.setString(1, forIndex.getContainer().getName());
        if (db2Table == null) {
 * You may obtain a copy of the License at
        sb.append(" WHERE INDSCHEMA = ?");
    @Override
        return dbStat;
    static {

 * DBeaver - Universal Database Manager
    protected DB2IndexColumn fetchChild(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @NotNull DB2Index db2Index,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        sb.append(" ORDER BY INDNAME");
        // FIXME: here we cache all tables to avoid spam in table lookup
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        sb.append("  FROM SYSCAT.INDEXES");
        JDBCPreparedStatement dbStat = session.prepareStatement(
        String tableOrNicknameSchemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "TABSCHEMA");
 * Copyright (C) 2013-2016 Denis Forveille (titou10.titou10@gmail.com)
 *
 * @author Denis Forveille
        } else {
            log.error("Object '" + tableOrNicknameName + "' not found in schema '" + tableOrNicknameSchemaName + "'");
        SQL_IND = sb.toString();

    protected JDBCStatement prepareChildrenStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema,
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
        sb.append(" WITH UR");
        if (forIndex == null) {
                db2Schema.getDataSource(), tableOrNicknameSchemaName, tableOrNicknameName);
        }
 * Cache for DB2 Indexes at the Schema Level
import org.jkiss.dbeaver.ext.db2.model.DB2Index;
}
        sb.append(" WHERE INDSCHEMA = ?");
import org.jkiss.dbeaver.ext.db2.DB2Utils;
        super("INDNAME");
    {
        // Look for related table...or nickname...or MQT
 * 
    @Override
    {
                "ORDER BY COLSEQ WITH UR"
            db2Table = DB2Utils.findNicknameBySchemaNameAndName(session.getProgressMonitor(), db2Schema.getDataSource(),
        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
        }
    }
 * you may not use this file except in compliance with the License.
        throws SQLException, DBException
        sb.append("  FROM SYSCAT.INDEXES");
    {
        String tableOrNicknameName = JDBCUtils.safeGetStringTrimmed(dbResult, "TABNAME");
        sb.append("SELECT *");
        objectSchema.getTables(session.getProgressMonitor());
    public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @Nullable DB2Index db2Index, @Nullable String db2IndexName)
        sb.append("   AND INDNAME = ?");

    {
        }
            dbStat.setString(2, db2Index != null ? db2Index.getName() : db2IndexName);
        return new DB2Index(session.getProgressMonitor(), db2Schema, db2Table, dbResult);
            return dbStat;
 */
 *
        if (db2Table == null) {
            db2Table = DB2Utils.findMaterializedQueryTableBySchemaNameAndName(session.getProgressMonitor(),
            return null;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.Log;
    @NotNull
    @Override
import org.jkiss.dbeaver.ext.db2.model.DB2IndexColumn;
            "SELECT * FROM SYSCAT.INDEXCOLUSE WHERE INDSCHEMA=? " + (forIndex == null ? "" : "AND INDNAME=?") +

        StringBuilder sb = new StringBuilder(128);
    }
            final JDBCPreparedStatement dbStat = session.prepareStatement(SQL_IND_ALL);
            final JDBCPreparedStatement dbStat = session.prepareStatement(SQL_IND);
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (db2Table == null) {

    private static final String SQL_IND_ALL;
            dbStat.setString(1, db2Schema.getName());
        } else {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        DB2Schema objectSchema = db2Schema.getDataSource().getSchema(session.getProgressMonitor(), tableOrNicknameSchemaName);
import java.sql.SQLException;


    }
    }
        if (objectSchema == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull JDBCResultSet dbResult) throws SQLException, DBException
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static final Log    log          = Log.getLog(DB2IndexCache.class);
        return new DB2IndexColumn(session.getProgressMonitor(), db2Index, dbResult);
        sb.append("SELECT *");
        );
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    public DB2IndexCache()
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
        // FIXME: because we always read all indexes. Make index cache lookup cache
/**
    {

            dbStat.setString(2, forIndex.getName());
        }
public final class DB2IndexCache extends JDBCStructLookupCache<DB2Schema, DB2Index, DB2IndexColumn> {
        sb.append(" WITH UR");

 * See the License for the specific language governing permissions and
            log.error("Schema '" + tableOrNicknameSchemaName + "' not found");
            return dbStat;
        SQL_IND_ALL = sb.toString();

    protected DB2Index fetchObject(@NotNull JDBCSession session, @NotNull DB2Schema db2Schema, @NotNull JDBCResultSet dbResult)
 *
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructLookupCache;
                tableOrNicknameSchemaName, tableOrNicknameName);
        DB2TableBase db2Table = objectSchema.getTable(session.getProgressMonitor(), tableOrNicknameName);
        @Nullable DB2Index forIndex) throws SQLException
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }

 */
 * Unless required by applicable law or agreed to in writing, software
