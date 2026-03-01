 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
    }
 * Unless required by applicable law or agreed to in writing, software
/*
    @Nullable
import org.jkiss.code.NotNull;
 *
    private final String catalogName;
    private final List<JDBCColumnMetaData> columns = new ArrayList<>();
    {
    @Override
    }
    {
 *
 * JDBC Table MetaData
        return columns;
        if (!(obj instanceof JDBCTableMetaData)) {
    void addAttribute(JDBCColumnMetaData columnMetaData)
    @Override
import org.jkiss.dbeaver.model.exec.DBCEntityMetaData;

 */
            return false;
        this.tableName = tableName;

    public String getEntityName()
import org.jkiss.utils.CommonUtils;
    }

    @Override
            (schemaName == null ? 2 : schemaName.hashCode()) *
    }
    private final String tableName;
import java.util.ArrayList;
    private final String schemaName;
    public String getCatalogName() {
        return tableName;
        return resultSetMetaData;
        JDBCTableMetaData md2 = (JDBCTableMetaData) obj;
    public List<JDBCColumnMetaData> getAttributes()
 * DBeaver - Universal Database Manager
    {
 * See the License for the specific language governing permissions and
        this.resultSetMetaData = resultSetMetaData;
        return catalogName;

        columns.add(columnMetaData);
        return CommonUtils.equalObjects(catalogName, md2.catalogName) &&
    }
    }
        }
    }
        this.catalogName = catalogName;
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 */
    public JDBCResultSetMetaDataImpl getResultSetMetaData()
package org.jkiss.dbeaver.model.impl.jdbc.exec;
    }
    {

            CommonUtils.equalObjects(tableName, md2.tableName);
public class JDBCTableMetaData implements DBCEntityMetaData {
/**

    public int hashCode() {
    JDBCTableMetaData(@NotNull JDBCResultSetMetaDataImpl resultSetMetaData, String catalogName, String schemaName, @NotNull String tableName)
import java.util.List;
    }
import org.jkiss.dbeaver.model.DBUtils;
        return DBUtils.getSimpleQualifiedName(catalogName, schemaName, tableName);

            CommonUtils.equalObjects(schemaName, md2.schemaName) &&
    {
    public boolean equals(Object obj) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;

 *

}

        return (catalogName == null ? 1 : catalogName.hashCode()) *
 * Copyright (C) 2010-2024 DBeaver Corp and others

    @Override
    @Override
            tableName.hashCode();
    public String getSchemaName() {
        return schemaName;
    public String toString() {
 * you may not use this file except in compliance with the License.
    }
    @NotNull

 * distributed under the License is distributed on an "AS IS" BASIS,
    private final JDBCResultSetMetaDataImpl resultSetMetaData;

    @Nullable
        this.schemaName = schemaName;
 * limitations under the License.
