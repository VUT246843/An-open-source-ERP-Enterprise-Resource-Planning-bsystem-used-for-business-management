    @Override
    }
 *
        return super.getName();
        return partitionName;
    @Override
    @Property(hidden = true, editable = true, updatable = true, order = -1)
            @NotNull CubridTable table,
        this.parentTable = table;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 * distributed under the License is distributed on an "AS IS" BASIS,


    @Property(hidden = true)
import java.util.Map;
    }
 *
            this.expressionValues = partitions[1] == null ? "MAXVALUE" : partitions[1].toString();
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    }
    private String expression;
 * limitations under the License.

        return getDataSource().getMetaModel().getTableDDL(monitor, getParentTable(), options);
 * DBeaver - Universal Database Manager
    public String getExpression() {
        return comment;
    @Property(hidden = true)
import org.jkiss.dbeaver.model.struct.rdb.DBSTablePartition;
    @Property(hidden = true)

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override 
            @NotNull JDBCResultSet dbResult) {

    public CubridCollation getCollation() {
    private String partitionName;
        return super.getCollation();
            this.expressionValues = Arrays.toString((Object[]) JDBCUtils.safeGetObject(dbResult, "partition_values")).replace("[", "").replace("]", "");
        return expressionValues;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        return expression;
    public boolean isPartitioned() {

import java.util.Arrays;
    public DBSTablePartition getPartitionParent(){

    }
import org.jkiss.dbeaver.DBException;
    @Property(hidden = true) 
    public boolean isSubPartition(){
import org.jkiss.code.NotNull;

    }
    }
    public String getName() {
    @Override 
import org.jkiss.code.Nullable;
 * See the License for the specific language governing permissions and
}
        this.comment = JDBCUtils.safeGetString(dbResult, "comment");

        return super.isPartitioned();
    @Override
            @NotNull String type,
    public String getExpressionValues() {
    @Property(viewable = true, order = 6)
    }
        return super.getTableType();
    @Property(hidden = true)
        return super.getCharset();
/*
        }
        return null;
        return parentTable;
    @Property(viewable = true, order = 1)
        super(table.getContainer(), className, type, dbResult);
    @Override
    private String comment;
        this.partitionName = JDBCUtils.safeGetString(dbResult, "partition_name");
        return super.isReuseOID();
        } else {
    @NotNull
    }
    @Property(viewable = true, order = 3)
        return false;
    @NotNull
        if ("RANGE".equals(type)) {
 * You may obtain a copy of the License at
    public CubridTable getParentTable() {
        return super.getAutoIncrement();
 * you may not use this file except in compliance with the License.
    @Override
public class CubridPartition extends CubridTable implements DBSTablePartition {
    @Override


 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
    }
    @Override
    private CubridTable parentTable;
    public CubridCharset getCharset() {
    @Override

    public String getPartitionName() {
    public boolean isReuseOID() {
    }

            @NotNull String className,
import org.jkiss.dbeaver.model.meta.PropertyLength;
import org.jkiss.dbeaver.model.meta.Property;
    @Override
    }
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
    public Integer getAutoIncrement() {
    @Property(viewable = true, order = 2)
 *
        return super.getSchema();
    @Property(viewable = true, order = 5)
            Object[] partitions = (Object[]) JDBCUtils.safeGetObject(dbResult, "partition_values");

    //Hidden Properties
    }

    @Override 
    public String getDescription() {
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
    @Nullable

    private String expressionValues;
    }
package org.jkiss.dbeaver.ext.cubrid.model;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;


    @NotNull
 */
    public CubridPartition(
 *     http://www.apache.org/licenses/LICENSE-2.0
    public GenericSchema getSchema() {
    @NotNull
    @Override

    public String getTableType() {
        this.expression = JDBCUtils.safeGetString(dbResult, "partition_expr").replace("[", "").replace("]", "");
    }
    }
    }

