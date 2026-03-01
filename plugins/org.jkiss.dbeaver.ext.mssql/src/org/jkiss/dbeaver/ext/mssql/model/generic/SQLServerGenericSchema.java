 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBUtils;
        super(dataSource, catalog, schemaName);
/*
import org.jkiss.dbeaver.Log;
* SQL Server schemas
        }
 * limitations under the License.
            log.debug("Can't read tables statistics due to lack of schemas catalog");
            hasStatistics = true;
 * You may obtain a copy of the License at
        if (catalog == null) {
                session,
                        }
    }
    }
    }

import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
            hasStatistics = true;
        if (hasStatistics && !forceRefresh) {
 * Unless required by applicable law or agreed to in writing, software
                    while (dbResult.next()) {
            }
/**
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        return schemaId;
 * See the License for the specific language governing permissions and
        } finally {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } catch (SQLException e) {
    public boolean isStatisticsCollected() {
        this.schemaId = schemaId;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * DBeaver - Universal Database Manager
*/
}
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;
        }
        return hasStatistics;
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
public class SQLServerGenericSchema extends GenericSchema implements DBPObjectStatisticsCollector {
                getSchemaId(),
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            throw new DBCException("Error reading table statistics", e);
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
        boolean isSQLServer = ((SQLServerMetaModel) getDataSource().getMetaModel()).isSqlServer();
            try (JDBCPreparedStatement dbStat = SQLServerUtils.prepareTableStatisticLoadStatement(
                        if (table instanceof SQLServerGenericTable) {
        if (!isSQLServer && !getDataSource().isServerVersionAtLeast(15, 0)) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table statistics")) {
    private long schemaId;
import org.jkiss.dbeaver.model.DBPObjectStatisticsCollector;
    private boolean hasStatistics;
                catalog,
                        GenericTableBase table = getTable(monitor, tableName);
                            ((SQLServerGenericTable) table).fetchTableStats(dbResult);
        }
                isSQLServer)) {
import org.jkiss.dbeaver.DBException;
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
import java.sql.SQLException;

 *     http://www.apache.org/licenses/LICENSE-2.0

    private static final Log log = Log.getLog(SQLServerGenericSchema.class);
package org.jkiss.dbeaver.ext.mssql.model.generic;
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
            return;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.code.NotNull;
    public long getSchemaId() {
    public SQLServerGenericSchema(GenericDataSource dataSource, GenericCatalog catalog, String schemaName, long schemaId) {


    @Override
                }

                getDataSource(),
            return;
                        String tableName = dbResult.getString("name");

        GenericCatalog catalog = getCatalog();
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCException;
 *
                null,
            return;
 *
import org.jkiss.dbeaver.model.meta.Property;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        }

 */
    @Property(viewable = true, order = 3)
                    }
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
