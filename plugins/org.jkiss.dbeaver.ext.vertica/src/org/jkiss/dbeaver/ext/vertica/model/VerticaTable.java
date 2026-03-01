    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {

        }
import java.sql.SQLException;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private String description;
    }
        @Override
import java.util.Date;
    private boolean isSystemTable;
        }


        return description;

 * VerticaTable
    public boolean isSystem() {
        return isTempTable;
    @Override
import org.jkiss.dbeaver.model.DBPSystemObject;

import org.jkiss.dbeaver.model.meta.IPropertyCacheValidator;
    @Property(viewable = true, order = 8)
    @Override
            }
    @Property(viewable = true, order = 6)

/**

            this.partitionExpression = JDBCUtils.safeGetString(dbResult, "partition_expression");
import org.jkiss.dbeaver.model.struct.DBSObject;
            }
    private Date createTime;
 *
        if (description == null) {
        tableSize = dbResult.getLong("used_bytes");
    private String partitionExpression;

    public VerticaTable(VerticaSchema container, String tableName, String tableType, JDBCResultSet dbResult) {

 */
        super(container, tableName, tableType, dbResult);
    }
            if (!((VerticaDataSource) getDataSource()).avoidCommentsReading()) {
            this.isTempTable = JDBCUtils.safeGetBoolean(dbResult, "is_temp_table");
import org.jkiss.dbeaver.model.DBPObjectWithLazyDescription;
        if (dbResult != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.meta.Property;
    public boolean isTempTable() {
import org.jkiss.dbeaver.DBException;
    }
    @Property(viewable = true, order = 7)
        return tableSize != -1;
import org.jkiss.dbeaver.model.DBPObjectStatistics;
                VerticaUtils.readTableAndColumnsDescriptions(monitor, getDataSource(), this, false);
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.vertica.VerticaUtils;
    public String getDescription(@NotNull DBRProgressMonitor monitor) throws DBException {
    public String getPartitionExpression() {

    @Nullable

            this.hasAggregateProjection = JDBCUtils.safeGetBoolean(dbResult, "has_aggregate_projection");
import org.jkiss.code.NotNull;

        if (tableSize != -1) {

    @Override
    @Nullable
    public boolean hasStatistics() {
        }
public class VerticaTable extends GenericTable implements DBPObjectStatistics, DBPSystemObject, DBPObjectWithLazyDescription {
        return super.refreshObject(monitor);
    @LazyProperty(cacheValidator = CommentsValidator.class)
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(viewable = true, order = 5)
    @Override
        return isSystemTable;
        this.description = description;
                description = "";
    public boolean isPhysicalTable() {
    }
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
 * Unless required by applicable law or agreed to in writing, software
            if (description == null) {
package org.jkiss.dbeaver.ext.vertica.model;
 *
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
    void fetchStatistics(JDBCResultSet dbResult) throws SQLException {
    public static class CommentsValidator implements IPropertyCacheValidator<VerticaTable> {
        return hasAggregateProjection;
}
    private boolean isTempTable;
    public String getDescription() {
        {
    }
            this.createTime = JDBCUtils.safeGetDate(dbResult, "create_time");
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
    public void setDescription(String description) {

 * Licensed under the Apache License, Version 2.0 (the "License");
    private boolean hasAggregateProjection;
        return createTime;
 * You may obtain a copy of the License at


        return tableSize;
    }
            this.isSystemTable = JDBCUtils.safeGetBoolean(dbResult, "is_system_table");
    private long tableSize = -1;
        return partitionExpression;
    public long getStatObjectSize() {
        return !isView();
    @Override
/*

    }

import org.jkiss.dbeaver.model.meta.LazyProperty;
        public boolean isPropertyCached(@NotNull VerticaTable object, @NotNull Object propertyId)
            ((VerticaSchema) getSchema()).resetStatistics();
    }
    @Override
    public boolean isHasAggregateProjection() {
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
            tableSize = -1;


    public Date getCreateTime() {
            return object.description != null;
    }
        }
 * limitations under the License.

 */
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        return description;
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.model.meta.PropertyLength;
    }
