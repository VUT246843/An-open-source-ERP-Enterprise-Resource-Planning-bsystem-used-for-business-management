        this.dataSource = dataSource;
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return context;


        }
/*
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
 * See the License for the specific language governing permissions and
    @Override
 */
    @Override
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public DBSObject resolveObject(Map<String, Object> context, Object identifier, DBRProgressMonitor monitor)
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedure;

}
 * you may not use this file except in compliance with the License.
import java.util.HashMap;
import org.jkiss.dbeaver.DBException;

 * You may obtain a copy of the License at
 * limitations under the License.
    }
        HashMap<String, Object> context = new HashMap<>();
    public PostgreResolver(DBPDataSourceContainer dataSource) {

package org.jkiss.dbeaver.ext.postgresql.debug.internal;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Map;
            throws DBException {
public class PostgreResolver implements DBGResolver {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
    public Map<String, Object> resolveContext(DBSObject databaseObject) {
    private final DBPDataSourceContainer dataSource;
import org.jkiss.dbeaver.debug.DBGResolver;
        return PostgreSqlDebugCore.resolveFunction(monitor, dataSource, context);
 *
 *
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (databaseObject instanceof PostgreProcedure) {
 * DBeaver - Universal Database Manager

            PostgreSqlDebugCore.saveFunction((PostgreProcedure)databaseObject, context);
 *

import org.jkiss.dbeaver.ext.postgresql.debug.core.PostgreSqlDebugCore;
