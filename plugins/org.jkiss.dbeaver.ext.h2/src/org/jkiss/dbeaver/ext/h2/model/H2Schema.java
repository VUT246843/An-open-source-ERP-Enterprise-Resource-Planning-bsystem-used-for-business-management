import org.jkiss.dbeaver.model.exec.DBCException;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;

import org.jkiss.dbeaver.model.DBPObjectStatisticsCollector;
import org.jkiss.code.NotNull;
public class H2Schema extends GenericSchema implements DBPObjectStatisticsCollector {
                throw new DBCException("Error reading catalog statistics", e);
        }
 * limitations under the License.
                        try (JDBCResultSet dbResult = dbStat.executeQuery()) {
/*
}
        try (DBCSession session = DBUtils.openMetaSession(monitor, this, "Read table statistics")) {
                }
            return;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
                            }
import java.sql.SQLException;
package org.jkiss.dbeaver.ext.h2.model;
    }
 */
    public H2Schema(@NotNull GenericDataSource dataSource, @Nullable GenericCatalog catalog, @NotNull String schemaName) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                                h2Table.setTableDiskSize(dbResult.getLong(1));
    public void collectObjectStatistics(

 * DBeaver - Universal Database Manager
            hasStatistics = true;



import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    private boolean hasStatistics = false;
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.DBPEvaluationContext;
        super(dataSource, catalog, schemaName);
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        boolean forceRefresh
        return hasStatistics;
import org.jkiss.dbeaver.DBException;
            }
 *
                for (GenericTableBase table : tables) {
    public boolean isStatisticsCollected() {
        if (hasStatistics && !forceRefresh) {
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
                            if (dbResult.next()) {
                        dbStat.setString(1, table.getFullyQualifiedName(DBPEvaluationContext.DDL));
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
        @NotNull DBRProgressMonitor monitor,
 * you may not use this file except in compliance with the License.
        boolean totalSizeOnly,
        List<? extends GenericTableBase> tables = getTables(monitor);
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    ) throws DBException {
import java.util.List;
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement("SELECT DISK_SPACE_USED(?)")) {
 *
                        }
        } finally {
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
                    if (table instanceof H2Table h2Table) {
                    }
        }
import org.jkiss.dbeaver.model.DBUtils;
 * Copyright (C) 2010-2026 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
    @Override
import org.jkiss.code.Nullable;
            } catch (SQLException e) {
