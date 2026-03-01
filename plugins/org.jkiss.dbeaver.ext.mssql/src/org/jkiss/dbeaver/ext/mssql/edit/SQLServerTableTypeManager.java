 * See the License for the specific language governing permissions and
        if (!options.isEmpty() && options.containsKey(DBPScriptObject.OPTION_USE_SPECIAL_NAME)) {
    }
 *

        return "CREATE TYPE " + tableName + " AS TABLE\n (";
    }
    public Class<? extends DBSObject>[] getChildTypes() {
    @Override

    }
        throw new IllegalStateException("Not implemented");
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");

            SQLServerTableIndex.class,
    @Override
    }
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
 * you may not use this file except in compliance with the License.

import org.jkiss.utils.CommonUtils;
            SQLServerTableUniqueKey.class,
        return false;

    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 */
    @Override
        throw new DBException("SQL Server data table types rename not supported");

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            SQLServerTableForeignKey.class,
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.ext.mssql.edit;

 * Copyright (C) 2010-2024 DBeaver Corp and others

public class SQLServerTableTypeManager extends SQLServerBaseTableManager<SQLServerTableType> {
        @NotNull DBRProgressMonitor monitor,
            SQLServerTableCheckConstraint.class
        return CHILD_TYPES;
        @NotNull String tableName,

        }
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
            SQLServerTableColumn.class,
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull SQLServerTableType object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
    protected boolean isIncludeDropInDDL(@NotNull SQLServerTableType tableType) {
            return "CREATE TYPE " + options.get(DBPScriptObject.OPTION_USE_SPECIAL_NAME) + " AS TABLE (\n";
        );
import java.util.Map;
        @NotNull SQLServerTableType table,
import org.jkiss.dbeaver.model.DBPScriptObject;
import org.jkiss.dbeaver.ext.mssql.model.*;
/*
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    protected SQLServerTableType createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.struct.DBSObject;
    protected String beginCreateTableStatement(
        @NotNull Map<String, Object> options) throws DBException {
    }
    @Override
    @Override
}
