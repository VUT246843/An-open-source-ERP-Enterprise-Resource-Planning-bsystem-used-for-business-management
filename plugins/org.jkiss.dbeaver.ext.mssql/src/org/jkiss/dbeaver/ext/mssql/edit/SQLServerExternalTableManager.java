                .append(delimiter)
import org.jkiss.dbeaver.model.sql.SQLUtils;

import org.jkiss.dbeaver.Log;
            ddl.append(delimiter).append(")");
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
        try {
        Map<String, Object> options) {
    }
    @Override
                .append(indent).append("LOCATION = ")
public class SQLServerExternalTableManager extends SQLServerBaseTableManager<SQLServerExternalTable> {
        } catch (DBCException e) {
        final SQLServerExternalTable table = new SQLServerExternalTable(schema);
import org.jkiss.dbeaver.model.exec.DBCException;
                .append(SQLUtils.quoteString(table, info.getExternalLocation()));
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
    protected String getCreateTableType(SQLServerExternalTable table) {
        return CHILD_TYPES;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerSchema;


import org.jkiss.utils.CommonUtils;
        SQLServerExternalTable table,
                .append(DBUtils.getQuotedIdentifier(table.getDataSource(), info.getExternalDataSource()));
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(

    }
            String indent = delimiter.equals(" ") ? "" : "\t";
        return "EXTERNAL TABLE";
    @Override
        }
    private static final Log log = Log.getLog(SQLServerExternalTableManager.class);
        final SQLServerSchema schema = (SQLServerSchema) container;
        DBRProgressMonitor monitor,
            ddl.append(" WITH (")
 */
            ddl.append(",")
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableColumn;
 * See the License for the specific language governing permissions and
    @Override
        NestedObjectCommand tableProps,

import org.jkiss.dbeaver.ext.mssql.model.SQLServerExternalTable;
                    .append(SQLUtils.quoteString(table, info.getExternalFileFormat()));
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull SQLServerExternalTable object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
                    .append(indent).append("FILE_FORMAT = ")
            }
    public Class<? extends DBSObject>[] getChildTypes() {

            if (CommonUtils.isNotEmpty(info.getExternalFileFormat())) {
        processObjectRename(commandContext, object, options, newName);
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected SQLServerExternalTable createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
                .append(delimiter)
    @NotNull

 * You may obtain a copy of the License at
}
    }
        return table;
/*
            final SQLServerExternalTable.AdditionalInfo info = table.getAdditionalInfo(monitor);
    protected void appendTableModifiers(
import java.util.Map;
    }
import org.jkiss.dbeaver.DBException;
        return false;
package org.jkiss.dbeaver.ext.mssql.edit;
                .append(indent).append("DATA_SOURCE = ")
            String delimiter = getDelimiter(options);
        SQLServerTableColumn.class);
        boolean alter,
    }

 *
                ddl.append(",")
        StringBuilder ddl,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    @Override
        setNewObjectName(monitor, schema, table);
import org.jkiss.dbeaver.model.struct.DBSObject;
 * DBeaver - Universal Database Manager
    public boolean canCreateObject(@NotNull Object container) {
                    .append(delimiter)
            log.error("Error retrieving external table info");
    @Override
    @Override
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.edit.DBECommandContext;

    }
import org.jkiss.dbeaver.model.DBUtils;
