    }

        return isSuperUserOnly;
    public boolean isMonitorable() {
    public String getPartitionExpression() {
    public boolean isTempTable() {
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
        return isMonitorable;
        return super.isTempTable();
    @Override
    @Property(viewable = true, order = 7)
            this.isSuperUserOnly = JDBCUtils.safeGetBoolean(dbResult, "is_superuser_only");


    private boolean isAccessibleDuringLockdown;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 */
        if (dbResult != null) {
    @Property(viewable = true, order = 5)
    private String description;

    }
    public boolean isSystem() {
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        }
        return super.isHasAggregateProjection();
 * See the License for the specific language governing permissions and
    @Property(viewable = true, order = 6)
    private boolean isMonitorable;
        return description;
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.DBException;
    }
        return super.getPartitionExpression();
 * Licensed under the Apache License, Version 2.0 (the "License");
    public VerticaSystemTable(VerticaSchema container, String tableName, String tableType, JDBCResultSet dbResult) {

import org.jkiss.dbeaver.model.meta.PropertyLength;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
            this.isAccessibleDuringLockdown = JDBCUtils.safeGetBoolean(dbResult, "is_accessible_during_lockdown");
    @Nullable
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override
    @Property(viewable = true, editable = false, updatable = false, length = PropertyLength.MULTILINE, order = 100)

    }
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
    }
    @Override
        return isAccessibleDuringLockdown;

    @Override
    }
    }
    // Hide properties
 * limitations under the License.
    public String getDescription(@NotNull DBRProgressMonitor monitor) throws DBException {
    public boolean isSuperUserOnly() {
    }
            this.description = JDBCUtils.safeGetString(dbResult, "remarks");
    public String getDescription() {
import java.util.Date;
/*
        return description;
public class VerticaSystemTable extends VerticaTable {
 *
    @Override
    public Date getCreateTime() {

        return true;
package org.jkiss.dbeaver.ext.vertica.model;
        return super.getCreateTime();
 *
    @Override
            this.isMonitorable = JDBCUtils.safeGetBoolean(dbResult, "is_monitorable");
 *
    // Hide properties

}
    }


import org.jkiss.code.Nullable;
    // Hide properties
    public boolean isAccessibleDuringLockdown() {
    private boolean isSuperUserOnly;

    @Nullable
        super(container, tableName, tableType, dbResult);

    // Hide properties

    public boolean isHasAggregateProjection() {
