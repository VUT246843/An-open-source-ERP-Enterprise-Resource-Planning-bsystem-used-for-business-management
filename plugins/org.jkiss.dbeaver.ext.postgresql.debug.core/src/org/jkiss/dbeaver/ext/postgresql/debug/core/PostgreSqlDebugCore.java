                PostgreProcedure function = schema.getProcedure(monitor, functionId);
            PostgreSchema schema = database.getSchema(monitor, schemaName);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;

        if (database != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        configuration.put(PostgreDebugConstants.ATTR_SCHEMA_NAME, schemaName);
import org.jkiss.dbeaver.DBException;
        PostgreDataSource dataSource = procedure.getDataSource();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        PostgreDatabase database = ds.getDatabase(databaseName);

import org.jkiss.dbeaver.debug.DBGConstants;
        }

import org.jkiss.dbeaver.ext.postgresql.debug.PostgreDebugConstants;
        long functionId = CommonUtils.toLong(configuration.get(PostgreDebugConstants.ATTR_FUNCTION_OID));
    public static PostgreProcedure resolveFunction(DBRProgressMonitor monitor, DBPDataSourceContainer dsContainer, Map<String, Object> configuration) throws DBException {
public class PostgreSqlDebugCore {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager

            throw new DBException("Database '" + databaseName + "' not found");
 */
        DBPDataSourceContainer dataSourceContainer = dataSource.getContainer();
                throw new DBException("Function " + functionId + " not found in schema " + schemaName);
    public static final String BUNDLE_SYMBOLIC_NAME = "org.jkiss.dbeaver.ext.postgresql.debug.core"; //$NON-NLS-1$
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;

 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Map;
        String databaseName = procedure.getDatabase().getName();
 * You may obtain a copy of the License at
        configuration.put(PostgreDebugConstants.ATTR_DATABASE_NAME, databaseName);

package org.jkiss.dbeaver.ext.postgresql.debug.core;

        configuration.put(PostgreDebugConstants.ATTR_FUNCTION_OID, String.valueOf(procedure.getObjectId()));
        } else {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
        if (!dsContainer.isConnected()) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                throw new DBException("Schema '" + schemaName + "' not found in database " + databaseName);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedure;
                if (function != null) {
                }
        }

    }
        configuration.put(DBGConstants.ATTR_PROJECT_NAME, dataSourceContainer.getProject().getName());
                    return function;
    }
            if (schema != null) {
        String schemaName = procedure.getSchema().getName();
    public static void saveFunction(PostgreProcedure procedure, Map<String, Object> configuration) {
        PostgreDataSource ds = (PostgreDataSource) dsContainer.getDataSource();
        String databaseName = (String)configuration.get(PostgreDebugConstants.ATTR_DATABASE_NAME);
}
 * limitations under the License.
 *
        configuration.put(DBGConstants.ATTR_DEBUG_TYPE, PostgreDebugConstants.DEBUG_TYPE_FUNCTION);
        configuration.put(DBGConstants.ATTR_DATASOURCE_ID, dataSourceContainer.getId());
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 *
import org.jkiss.utils.CommonUtils;
            dsContainer.connect(monitor, true, true);
            } else {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
        String schemaName = (String)configuration.get(PostgreDebugConstants.ATTR_SCHEMA_NAME);
            }
 * Unless required by applicable law or agreed to in writing, software
