
 * you may not use this file except in compliance with the License.
 *
    public OcientTable(
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and

 *
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/*
    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
package org.jkiss.dbeaver.ext.ocient.model;
}    @NotNull
import org.jkiss.code.NotNull;
    }
        super(container, tableName, tableType, dbResult);
 * Unless required by applicable law or agreed to in writing, software
        @Nullable JDBCResultSet dbResult)
        @Nullable String tableType,

 * You may obtain a copy of the License at
public class OcientTable extends GenericTable {
import java.util.Map;
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
    @Property(hidden = true, order = -1)
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
        GenericStructContainer container,
        return getDataSource().getMetaModel().getTableDDL(monitor, this, options);
 */
        @Nullable String tableName,
import org.jkiss.dbeaver.model.meta.Property;
 *
    }
