    private String tableName;
 *
    }
        tableSchema = JDBCUtils.safeGetString(resultSet, "table_schema");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            if (schema != null) {


    AltibaseTablespaceObj4Index(AltibaseTablespace parent, JDBCResultSet resultSet) {
    @Property(viewable = true, linkPossible = true, order = 20)
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
    public AltibaseSchema getTableSchema() {
}    @Property(viewable = true, linkPossible = true, order = 21)

    private String tableSchema;
 * limitations under the License.
 *

    public GenericTable getTable(DBRProgressMonitor monitor) throws DBException {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    } 
    }
    }
        return getTargetTable(monitor, tableSchema, tableName);
            AltibaseSchema schema = (AltibaseSchema) getDataSource().getSchema(schemaName);



import org.jkiss.dbeaver.DBException;
        return (AltibaseSchema) getDataSource().getSchema(tableSchema);
package org.jkiss.dbeaver.ext.altibase.model;
        return targetIndex;
import org.jkiss.dbeaver.model.meta.Property;
        tableName = JDBCUtils.safeGetString(resultSet, "table_name");
    private AltibaseTableIndex getTargetIndex(DBRProgressMonitor monitor) throws DBException {
            }
 * DBeaver - Universal Database Manager
 */
        return getTargetIndex(monitor);

        }
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
    public AltibaseTableIndex getObject(DBRProgressMonitor monitor) throws DBException {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
                targetIndex = (AltibaseTableIndex) schema.getIndex(monitor, objName);
/*
        super(parent, resultSet);
public class AltibaseTablespaceObj4Index extends AltibaseTablespaceObjAbs {

        if (targetIndex == null) {
    @Property(viewable = true, linkPossible = true, order = 3)
    private AltibaseTableIndex targetIndex;
