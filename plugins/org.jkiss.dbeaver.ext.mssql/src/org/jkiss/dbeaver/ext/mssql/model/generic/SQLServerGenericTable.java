    public String getOverloadedName() {

    }

import org.jkiss.dbeaver.model.meta.PropertyLength;

    public long getTableSize(DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        return (SQLServerGenericTableColumn)super.getAttribute(monitor, attributeName);
            DBSObject defaultDatabase = DBUtils.getDefaultContext(getDataSource(), true).getContextDefaults().getDefaultCatalog();
                        description = dbResult.getString(1);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                    (switchSchema ? "USE "+ DBUtils.getQuotedIdentifier(defaultDatabase) + ";\n" : "")))
 * limitations under the License.
        return tableSize != -1;
        String description = getDescription();
            }
 * You may obtain a copy of the License at
    }
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
                        description = "";
    public SQLServerGenericTableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                getDataSource(),
*/

/*
                ((SQLServerGenericSchema) getSchema()).getSchemaId(),

            return;
/**
    @Override
 * DBeaver - Universal Database Manager
        readTableStats(monitor);
    protected boolean isTruncateSupported() {
import org.jkiss.dbeaver.DBException;
    @Property(category = DBConstants.CAT_STATISTICS, order = 3, formatter = ByteNumberFormat.class)
import java.util.List;
                    if (dbResult.next()) {
        return getName();
 * Unless required by applicable law or agreed to in writing, software
        return super.getDescription();
            log.debug("Error reading table statistics", e);
        rowCount = JDBCUtils.safeGetLong(dbResult,"rows");
    void fetchTableStats(JDBCResultSet dbResult) {
        } else {
                        fetchTableStats(dbResult);

    public String getDescription(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Nullable

    @Override
                dbStat.setString(2, getName());
    }
        // Query row count
import org.jkiss.dbeaver.model.DBPObjectStatistics;
                isSqlServer())) {
    }
                    } else {
                }
 *
            {
    @NotNull
        return description;
        }
        }
    }
    private long pages;
*/
            pages = JDBCUtils.safeGetLong(dbResult,"pages");
        if (description != null || !isSqlServer()) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.DBConstants;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return description;
    @Override
    public boolean hasStatistics() {
    private long tableSize = -1;
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
    public SQLServerGenericDataSource getDataSource() {

            } catch (SQLException e) {
 * See the License for the specific language governing permissions and
public class SQLServerGenericTable extends GenericTable implements DBPObjectWithLazyDescription, DBPObjectStatistics {
import org.jkiss.dbeaver.model.struct.DBSObject;

        tableSize = JDBCUtils.safeGetLong(dbResult,"totalSize");
import java.sql.SQLException;
        //return getSchema().getName() + "." + getName();
    private long rowCount;
                throw new DBDatabaseException(e, getDataSource());
        if (!isSqlServer() && !getDataSource().isServerVersionAtLeast(15, 0)) {
    }
    }


    @Override
        }

    public synchronized List<SQLServerGenericTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
                    "FROM fn_listextendedproperty ('MS_DESCRIPTION', 'schema', ?, 'table', ?, default, default);\n" +
 */
    @Property(category = DBConstants.CAT_STATISTICS, order = 4)
 *
    @Property(category = DBConstants.CAT_STATISTICS, order = 5)
    }
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table statistics")) {
            try (JDBCPreparedStatement dbStat = SQLServerUtils.prepareTableStatisticLoadStatement(
    @Override
        return pages;

    private boolean isSqlServer() {
                (switchSchema ? "USE " + DBUtils.getQuotedIdentifier(getCatalog()) + ";\n" : "") +
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
        return (List<SQLServerGenericTableColumn>) super.getAttributes(monitor);
                }
                    }
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
}
        return tableSize;
        }
    public long getPages() {
    public SQLServerGenericTable(GenericStructContainer container, String tableName, String tableType, JDBCResultSet dbResult) {

/*


import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
                "SELECT cast(value as varchar(8000)) as value " +

            }
import org.jkiss.dbeaver.model.DBUtils;
        }
        readTableStats(monitor);
                session,
            return;
    }
    public Long getRowCount(DBRProgressMonitor monitor) {
    @Override

                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        if (isSqlServer()) {
    }
            tableSize = 0;

    @Override
                    }
    public long getStatObjectSize() {
        try (JDBCSession session = DBUtils.openUtilSession(monitor, this, "Read table description")) {
    @Override
import org.jkiss.code.NotNull;
        return true;
    }
    }
 * you may not use this file except in compliance with the License.
            tableSize = tableSize * 1024;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                    if (dbResult.next()) {
                this,
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.DBPObjectWithLazyDescription;
        return ((SQLServerMetaModel)getDataSource().getMetaModel()).isSqlServer();
    private static final Log log = Log.getLog(SQLServerGenericTable.class);
 * Licensed under the Apache License, Version 2.0 (the "License");
    private void readTableStats(DBRProgressMonitor monitor) {
        return rowCount;
import org.jkiss.dbeaver.Log;
        }
import org.jkiss.dbeaver.DBDatabaseException;

            boolean switchSchema = getCatalog() != null && defaultDatabase != null && defaultDatabase != getCatalog();
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
        return tableSize;
        } catch (SQLException | DBCException e) {

* SQL Server table
import org.jkiss.code.Nullable;
        setDescription(description);
    @Override
                dbStat.setString(1, getSchema().getName());
        return (SQLServerGenericDataSource)super.getDataSource();
                getCatalog(),
        super(container, tableName, tableType, dbResult);
package org.jkiss.dbeaver.ext.mssql.model.generic;
    }
        if (hasStatistics()) {
import org.jkiss.utils.ByteNumberFormat;
 * distributed under the License is distributed on an "AS IS" BASIS,

    public String getDescription() {
