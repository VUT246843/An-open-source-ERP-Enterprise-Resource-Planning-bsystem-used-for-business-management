    @Override
        return allTables;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (!CommonUtils.isEmpty(tables)) {
 * limitations under the License.
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
* SQL Server database
            Collection<GenericTable> tables = schema.getTables(monitor);
        }
            }
 */
 * You may obtain a copy of the License at
/*
    public Collection<GenericSchema> getSchemas(DBRProgressMonitor monitor) throws DBException {
    }

 * DBeaver - Universal Database Manager
                allTables.addAll(tables);
    @Override
        return null;

 * See the License for the specific language governing permissions and
/*
*/
}
 *
/**
package org.jkiss.dbeaver.ext.mssql.model.generic;
 *
 *
        for (GenericSchema schema : super.getSchemas(monitor)) {
        // Do not read schemas
public class SQLServerGenericDatabase extends GenericCatalog {
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    SQLServerGenericDatabase(GenericDataSource dataSource, String catalogName) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        // Read all tables from all schemas
        super(dataSource, catalogName);
 * Unless required by applicable law or agreed to in writing, software
    public Collection<GenericTable> getTables(DBRProgressMonitor monitor) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;
*/


        List<GenericTable> allTables = new ArrayList<>();
    }
