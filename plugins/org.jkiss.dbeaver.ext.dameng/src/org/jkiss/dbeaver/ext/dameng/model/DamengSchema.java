 *
        this.persisted = persisted;
    }
    }
            this.hasStatistics = true;

    @Override

                    if (table != null) {
 * you may not use this file except in compliance with the License.
            }
    }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
        return DBUtils.getFullQualifiedName(getDataSource(), this);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * See the License for the specific language governing permissions and
        }



        this.schemaName = schemaName;

            throw new DBCException("Error reading schema relation statistics", e);
    }
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
 * limitations under the License.
 */
    private boolean hasStatistics;
    public String getName() {
        super(dataSource, null, schemaName);
                    DamengTable table = (DamengTable) getTable(monitor, tableName);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @Override
import java.sql.SQLException;

public class DamengSchema extends GenericSchema implements DBPQualifiedObject, DBPObjectStatisticsCollector {
        } catch (SQLException e) {

import org.jkiss.dbeaver.model.DBPObjectStatisticsCollector;

            return;
        } finally {

import org.jkiss.dbeaver.model.DBPQualifiedObject;
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
        if (hasStatistics || forceRefresh) {
    @Override
import org.jkiss.dbeaver.model.meta.Property;
            );
}
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {
/*
                    }
            JDBCPreparedStatement dbStat = session.prepareStatement(
import org.jkiss.code.NotNull;
        return persisted;
        return hasStatistics;
    @NotNull
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

                            "WHERE owner = ?"
package org.jkiss.dbeaver.ext.dameng.model;
    }
    public DamengSchema(GenericDataSource dataSource, String schemaName, boolean persisted) {
        this.schemaName = schemaName;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    "SELECT TABLE_NAME,TABLE_USED_PAGES(OWNER,TABLE_NAME) * PAGE AS DISK_SIZE " +
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
    @Override
 * @author Shengkai Bai
    private boolean persisted;
 * Unless required by applicable law or agreed to in writing, software
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {

                    String tableName = dbResult.getString(1);
        }

    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    public boolean isStatisticsCollected() {
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 *
    }
    public boolean isPersisted() {
 * DBeaver - Universal Database Manager
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    public void setName(@NotNull String schemaName) {
import org.jkiss.dbeaver.DBException;
                        table.fetchStatistics(dbResult);
                }
        return schemaName;
                while (dbResult.next()) {
    @NotNull
import org.jkiss.dbeaver.model.exec.DBCException;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private String schemaName;
 * You may obtain a copy of the License at
                            "FROM ALL_TABLES " +
    @NotNull
    @Property(viewable = true, order = 1)
/**
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.DBUtils;
 *
            dbStat.setString(1, getName());
