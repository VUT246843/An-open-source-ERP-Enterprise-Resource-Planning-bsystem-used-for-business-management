        if (!CommonUtils.isEmptyTrimmed(historyTabSchemaName)) {

    private DB2Table historyTable;
    public DB2TableColumn getEndColumn() {
/**
        if (beginColumnName != null) {
        return super.getName();
    public DB2Table getHistoryTable() {
        if (endColumnName != null) {
    public DB2TableColumn getBeginColumn() {
import org.jkiss.code.NotNull;



        return parent;
    }
 * you may not use this file except in compliance with the License.
 */
    // -----------------
import org.jkiss.dbeaver.model.meta.Property;
 */

    // -----------------
    // -----------------------
 *
        return historyTable;
    private DB2Schema historyTableSchema;
    @Property(viewable = true, order = 10)

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

        return historyTableSchema;
        }

import org.jkiss.utils.CommonUtils;
        }
    @NotNull
    @Property(viewable = true, order = 30)
 * Copyright (C) 2010-2026 DBeaver Corp and others
/*
import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at
            endColumn = db2Table.getAttribute(vpm, endColumnName);
 * @author Denis Forveille



    }

 * distributed under the License is distributed on an "AS IS" BASIS,
    // -----------------------
    public DB2Schema getHistoryTableSchema() {
public class DB2TablePeriod extends DB2Object<DB2Table> {
 * DB2 Table Period
 *
            historyTable = historyTableSchema.getTable(vpm, historyTabName);
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
        super(db2Table, JDBCUtils.safeGetString(dbResult, "PERIODNAME"), true);
    private DB2TableColumn beginColumn;
    }
    @Property(viewable = true, order = 11)
        DB2DataSource db2DataSource = db2Table.getDataSource();
    public DB2TablePeriod(@NotNull DB2Table db2Table, @NotNull ResultSet dbResult) throws DBException {
    public DB2PeriodType getType() {
    private DB2PeriodType type;
        String historyTabName = JDBCUtils.safeGetString(dbResult, "HISTORYTABNAME");


 * DBeaver - Universal Database Manager
    @Property(viewable = true, order = 3)
        String historyTabSchemaName = JDBCUtils.safeGetString(dbResult, "HISTORYTABSCHEMA");
        return type;
    @Property(viewable = true, editable = false, order = 1)
            beginColumn = db2Table.getAttribute(vpm, beginColumnName);
    @Property(viewable = true, order = 2)
    public DB2Table getTable() {
 * limitations under the License.
    }
        VoidProgressMonitor vpm = new VoidProgressMonitor();
}
import java.sql.ResultSet;
        String beginColumnName = JDBCUtils.safeGetString(dbResult, "BEGINCOLNAME");
    }

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");

            historyTableSchema = db2DataSource.getSchema(vpm, historyTabSchemaName.trim());
    }
        String endColumnName = JDBCUtils.safeGetString(dbResult, "ENDCOLNAME");
    @Override
 *
    @Property(viewable = true, order = 31)
    // Constructors
    public String getName() {
import org.jkiss.dbeaver.ext.db2.model.dict.DB2PeriodType;
        }
        this.type = CommonUtils.valueOf(DB2PeriodType.class, JDBCUtils.safeGetString(dbResult, "PERIODTYPE"));
    }

 * See the License for the specific language governing permissions and
        // Lookup related objects
package org.jkiss.dbeaver.ext.db2.model;
        return endColumn;
    // Properties
    }
    private DB2TableColumn endColumn;
        return beginColumn;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
