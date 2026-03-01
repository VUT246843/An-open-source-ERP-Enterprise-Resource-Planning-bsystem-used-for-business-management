        {
    @Override
        return false;//isMviewTable();
        diskSpace = dbResult.getLong("size") * 1024 * 1024;
 */
import java.sql.ResultSet;
        return super.refreshObject(monitor);

 *
 * Unless required by applicable law or agreed to in writing, software
            diskSpace = null;
            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
 *
    @Override

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    // Not supported
}

import org.jkiss.code.NotNull;


 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCSession;
 * RedshiftTable base

        return super.getTablespace(monitor);
        super(catalog, dbResult);
        rowCountEstimate = rowCount = dbResult.getLong("tbl_rows");
    public String getPartitionKey() {
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
        return new RedshiftTableColumn(monitor, this, dbResult);
    }

            try (DBCSession session = DBUtils.openMetaSession(monitor, this, "Calculate relation size on disk")) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.DBException;
 */
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public RedshiftTable(@NotNull PostgreSchema catalog, @NotNull ResultSet dbResult) {
    // Not supported
        return isMviewTable() ? DBIcon.TREE_TABLE_SYSTEM : null;
    // Not supported
    @Override
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.code.Nullable;
 * you may not use this file except in compliance with the License.

    protected void fetchStatistics(JDBCResultSet dbResult) throws SQLException {
    }
    private static final Log log = Log.getLog(RedshiftTable.class);
    @Nullable
    @Override
 *
 * limitations under the License.
import org.jkiss.dbeaver.model.*;
    }
                readTableStatistics((JDBCSession) session);
    // Tables created by Redshift for materialized views

public class RedshiftTable extends PostgreTableRegular implements DBPSystemObject, DBPImageProvider {
                if (dbResult.next()) {
    }
    protected void readTableStatistics(@NotNull JDBCSession session) throws SQLException {
    public boolean isHasOids() {
        return super.getPartitionKey();
            "SELECT size, tbl_rows FROM SVV_TABLE_INFO WHERE \"schema\"=? AND table_id=?"))
    }

    }
    public boolean hasPartitions() {
    }

        }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
        }
    // Not supported


    private static final String MVIEW_TBL_PREFIX = "mv_tbl__";
                log.debug("Can't fetch disk space", e);
        return super.hasPartitions();
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableColumn;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
/*
    }
        return getName().startsWith(MVIEW_TBL_PREFIX);
        return false;
    }
    }
    @Override
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableRegular;
    @Override
import java.sql.SQLException;
        super(catalog);
    public PostgreTableColumn createTableColumn(DBRProgressMonitor monitor, PostgreSchema schema, JDBCResultSet dbResult) throws DBException {
    }
            dbStat.setLong(2, getObjectId());
                    fetchStatistics(dbResult);
            } catch (Exception e) {
        try (JDBCPreparedStatement dbStat = session.prepareStatement(

import org.jkiss.dbeaver.model.struct.DBSObject;

    public boolean isMviewTable() {

 *     http://www.apache.org/licenses/LICENSE-2.0
        if (hasStatistics()) {
 * You may obtain a copy of the License at
    public boolean isSystem() {
            dbStat.setString(1, getSchema().getName());

    public DBPImage getObjectImage() {
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
import org.jkiss.dbeaver.Log;
                }
    public RedshiftTable(@NotNull PostgreSchema catalog) {
    @Override
    }

    public PostgreTablespace getTablespace(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTablespace;
package org.jkiss.dbeaver.ext.postgresql.model.impls.redshift;
        return super.isHasOids();
 * See the License for the specific language governing permissions and
    @Override
    public boolean isRefreshSchemaStatisticsOnTableRefresh() {
