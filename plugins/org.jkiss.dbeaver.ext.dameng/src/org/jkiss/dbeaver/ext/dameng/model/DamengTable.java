import java.util.ArrayList;
    @Override
    @NotNull

 * you may not use this file except in compliance with the License.
                    "SYSOBJECTS TABTRIG_OBJ_INNER, " +
                dbStat.setString(1, this.getSchema().getName());
    public DamengTable(GenericStructContainer container, String tableName, String tableType, JDBCResultSet dbResult) {
 *
    }
                    "FROM " +
        super(container, tableName, tableCatalogName, tableSchemaName);
                    "TABTRIG_OBJ_INNER.SUBTYPE$ = 'TRIG' " +
    }
    }
import org.jkiss.dbeaver.DBException;
                List<GenericTrigger> result = new ArrayList<>();
                    "AND SCH_OBJ_INNER.NAME = ? " +
 * Licensed under the Apache License, Version 2.0 (the "License");

        super(container, tableName, tableType, dbResult);
 * You may obtain a copy of the License at
        );
                    "AND SCH_OBJ_INNER.ID = TABTRIG_OBJ_INNER.SCHID " +
import java.util.List;
                    "SYSOBJECTS TAB_OBJ_INNER, " +
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    public DamengTable(GenericStructContainer container, String tableName, String tableCatalogName, String tableSchemaName) {
        return tableSize != -1;
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPObjectStatistics;

            DBSEntityConstraintInfo.of(DBSEntityConstraintType.CHECK, GenericTableConstraint.class)

    private long tableSize = -1;
                    "AND TABTRIG_OBJ_INNER.PID = TAB_OBJ_INNER.ID " +
            DBSEntityConstraintInfo.of(DBSEntityConstraintType.PRIMARY_KEY, GenericTableConstraint.class),
    }
import org.jkiss.code.NotNull;
                return result;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    @Override
                        result.add(new GenericTableTrigger(this, name, null));
 * @author Shengkai Bai
 * Unless required by applicable law or agreed to in writing, software
}
    }

 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
                    while (dbResult.next()) {
package org.jkiss.dbeaver.ext.dameng.model;

    public List<? extends GenericTrigger> getTriggers(@NotNull DBRProgressMonitor monitor) throws DBException {
 *
import org.jkiss.dbeaver.model.DBUtils;
                    }

    @Override
    }
/**
 * Copyright (C) 2010-2026 DBeaver Corp and others
        tableSize = dbResult.getLong("DISK_SIZE");
            throw new DBException("Read table triggers failed", e);

        } catch (SQLException e) {
                    "WHERE " +
            DBSEntityConstraintInfo.of(DBSEntityConstraintType.UNIQUE_KEY, GenericTableConstraint.class),
import org.jkiss.dbeaver.ext.generic.model.*;
        }
public class DamengTable extends GenericTable implements DBPObjectStatistics {
    void fetchStatistics(JDBCResultSet dbResult) throws SQLException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                dbStat.setString(2, this.getName());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
/*

        return List.of(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * See the License for the specific language governing permissions and
                        String name = JDBCUtils.safeGetString(dbResult, 1);
 * limitations under the License.

        try (JDBCSession session = DBUtils.openMetaSession(monitor, this.getSchema(), "Read table triggers")) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    public boolean hasStatistics() {
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT TABTRIG_OBJ_INNER.NAME " +
                    "AND TAB_OBJ_INNER.NAME = ?")) {
                }
    public List<DBSEntityConstraintInfo> getSupportedConstraints() {
    public long getStatObjectSize() {
 *
 */
    @Override
        return tableSize;

 * distributed under the License is distributed on an "AS IS" BASIS,

import java.sql.SQLException;
                    "SYSOBJECTS SCH_OBJ_INNER " +

            }
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintInfo;
