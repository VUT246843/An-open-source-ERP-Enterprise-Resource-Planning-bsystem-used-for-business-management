    public String getPartnName() {
        return partnName;
package org.jkiss.dbeaver.ext.altibase.model;
 *
 * limitations under the License.
 *
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
                JDBCUtils.safeGetString(resultSet, "USER_NAME"), 
    }
    @NotNull
    protected GenericTable getTargetTable(DBRProgressMonitor monitor, String tableSchema, String tableName) throws DBException {
    protected GenericTable targetTable;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return targetTable;
    public String getName() {


 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.DBUtils;

 * Copyright (C) 2010-2025 DBeaver Corp and others


        return name;

    AltibaseTablespaceObjAbs(AltibaseTablespace parent, JDBCResultSet resultSet) {
                parent.getDataSource(),
    @Property(viewable = true, order = 2)
 */
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * you may not use this file except in compliance with the License.
/*
        partnName = JDBCUtils.safeGetString(resultSet, "PARTITION_NAME");
            AltibaseSchema schema = (AltibaseSchema) getDataSource().getSchema(tableSchema);
                JDBCUtils.safeGetString(resultSet, "OBJ_NAME"), 
 * Unless required by applicable law or agreed to in writing, software


public abstract class AltibaseTablespaceObjAbs extends AltibaseObject<AltibaseTablespace> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = false, order = 1, hidden = true)
            if (schema != null) {
 *
        schemaName = JDBCUtils.safeGetString(resultSet, "USER_NAME");
 * distributed under the License is distributed on an "AS IS" BASIS,

 * See the License for the specific language governing permissions and
    protected String partnName;
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.NotNull;
    }

        if (targetTable == null) {
            }
    public AltibaseSchema getSchema() {
                JDBCUtils.safeGetString(resultSet, "PARTITION_NAME")),
    protected String schemaName;
}    }
    @Property(viewable = true, order = 10)
 * You may obtain a copy of the License at
        super(parent, DBUtils.getFullyQualifiedName(
        return (AltibaseSchema) getDataSource().getSchema(schemaName);
        objName = JDBCUtils.safeGetString(resultSet, "OBJ_NAME");
                true);
        }
                targetTable = (GenericTable) schema.getTable(monitor, tableName);
    protected String objName;
    }
