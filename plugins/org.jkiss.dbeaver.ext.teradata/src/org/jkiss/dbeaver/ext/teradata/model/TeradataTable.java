 * DBeaver - Universal Database Manager
 *
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ext.teradata.model;
 * See the License for the specific language governing permissions and
import org.jkiss.code.NotNull;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean supportsObjectDefinitionOption(@NotNull String option) {
    protected boolean isCacheDDL() {
 *

        return DBPScriptObject.OPTION_INCLUDE_COMMENTS.equals(option);
 *
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
public class TeradataTable extends GenericTable {
 * Unless required by applicable law or agreed to in writing, software
/*
import org.jkiss.dbeaver.model.DBPScriptObject;
    public TeradataTable(GenericStructContainer container, @Nullable String tableName, @Nullable String tableType, @Nullable JDBCResultSet dbResult) {


 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

        super(container, tableName, tableType, dbResult);
    @Override
}
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.Nullable;

 * limitations under the License.
        return false;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
