    @Override
    public PostgreTablePartition(PostgreTable container) {
package org.jkiss.dbeaver.ext.postgresql.model;
    }
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * limitations under the License.
import org.jkiss.dbeaver.model.struct.rdb.DBSTablePartition;
    }

        this.setPartition(true);
    private String partitionExpression;
    public PostgreTablePartition(PostgreTableContainer container, ResultSet dbResult) {
 */
        return partitionOf instanceof PostgreTablePartition;


    }
        this.partitionOf = container;
        options.put(OPTION_INCLUDE_NESTED_OBJECTS, false);

        return DBStructUtils.generateTableDDL(monitor, this, options, false);
 * you may not use this file except in compliance with the License.
 *
        this.partitionExpression = expr;
import org.jkiss.code.Nullable;
    }
    }
    public void setPartitionExpression(String expr) {
    public boolean needFullPath() {

    public PostgreTable getPartitionOf() {

import java.sql.ResultSet;
    }
}
    }
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
            return (PostgreTablePartition) partitionOf;
    @Override
        super(container);

        // Postgres tables can be queried directly without a parent table.
import org.jkiss.dbeaver.DBException;
import java.util.HashMap;

 * Unless required by applicable law or agreed to in writing, software

 *
    @Property(viewable = true, editable = true, updatable = true, order = 60)
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBStructUtils;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
        if (partitionOf instanceof PostgreTablePartition) {
    public String getPartitionExpression() {
    @NotNull
    @Override
        return null;
 *
        return false;
        options.put(OPTION_INCLUDE_PERMISSIONS, false);

        }

        return partitionExpression;
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.setName("newpartition");
import java.util.Map;
import org.jkiss.dbeaver.model.DBPScriptObject;

    public static final String CAT_PARTITIONING = "Partitioning";
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;

    }
import org.jkiss.dbeaver.model.meta.Property;
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
/*
        return partitionOf;
    public DBSTablePartition getPartitionParent() {
        this.partitionExpression = JDBCUtils.safeGetString(dbResult, "partition_expr");
    @Override
        return partitionOf;
    public boolean isSubPartition() {

        super(container, dbResult);
        this.setPartition(true);
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    @Nullable
        options.put(DBPScriptObject.OPTION_DDL_SKIP_FOREIGN_KEYS, true);
        options.put(OPTION_DDL_SEPARATE_FOREIGN_KEYS_STATEMENTS, false);
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2025 DBeaver Corp and others
public class PostgreTablePartition extends PostgreTable implements DBSTablePartition {

    }
        this.partitionExpression = "FOR VALUES ";
    private PostgreTable partitionOf;
        options = new HashMap<>(options);
    public DBSTable getParentTable() {
