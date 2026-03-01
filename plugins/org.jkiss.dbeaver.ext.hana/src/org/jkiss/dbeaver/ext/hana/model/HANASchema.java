/*
 */
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
    	return HANAConstants.SCHEMA_PUBLIC.equals(getName()); 
 * Unless required by applicable law or agreed to in writing, software
        super(dataSource, catalog, schemaName);
                    while (dbResult.next()) {
    void resetStatistics() {
	
        this.schemaName = schemaName;
    }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCSession;
                "SELECT TABLE_NAME, DISK_SIZE\n" +
                    "FROM SYS.M_TABLE_PERSISTENCE_STATISTICS\n" +
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(
 *
                        GenericTableBase table = getTable(monitor, tableName);
    
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Property(viewable = true, order = 1)
    }
            }

    }
    public boolean hasOnlySynonyms() { 
    }
                    "ORDER BY TABLE_NAME"))
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {

        return super.refreshObject(monitor);
import org.jkiss.dbeaver.model.DBUtils;
        return schemaName;
    public Class<? extends DBSEntity> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.DBPObjectStatisticsCollector;
        return HANATable.class;
            } catch (SQLException e) {
    public boolean isStatisticsCollected() {
    private boolean hasStatistics;
        }
        hasStatistics = false;
        hasStatistics = false;
        if (hasStatistics || forceRefresh) {
        return DBUtils.getFullQualifiedName(getDataSource(), this);
    public HANASchema(@NotNull GenericDataSource dataSource, @Nullable GenericCatalog catalog, @NotNull String schemaName) {
        this.schemaName = schemaName;
                        }
 * limitations under the License.
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;

                dbStat.setString(1, getName());
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

    }

            {
    @Override
public class HANASchema extends GenericSchema implements DBPQualifiedObject, DBPObjectStatisticsCollector {
import org.jkiss.dbeaver.model.struct.DBSObject;
                }
    @NotNull
    private String schemaName;
import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.model.DBPQualifiedObject;
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
    @NotNull
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                throw new DBCException("Error reading schema relation statistics", e);
    }
                        String tableName = dbResult.getString("TABLE_NAME");
    @NotNull
                    "WHERE SCHEMA_NAME = ?\n" +
import java.sql.SQLException;
    }
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
    }

    }
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
        return hasStatistics;
    public void setName(@NotNull String schemaName) {
import org.jkiss.code.Nullable;
    public String getName() {
        }
package org.jkiss.dbeaver.ext.hana.model;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

}
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
            return;
import org.jkiss.dbeaver.model.exec.DBCException;

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSEntity;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    @Override

        } finally {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                            ((HANATable) table).fetchStatistics(dbResult);
import org.jkiss.dbeaver.model.meta.Property;
                        if (table instanceof HANATable) {

                    }
    @NotNull
        try (DBCSession session = DBUtils.openMetaSession(monitor, this, "Read relation statistics")) {
            hasStatistics = true;

    @Override
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
