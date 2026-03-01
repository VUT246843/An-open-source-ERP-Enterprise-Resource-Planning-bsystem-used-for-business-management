/**
    public boolean supportsSchemaChange() {

 */

    public DBSCatalog getDefaultCatalog() {
        return false;
 *
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.

import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
    }
 * you may not use this file except in compliance with the License.
    @Override
}
    @Override
    @Override
import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
        return false;
    public DBSSchema getDefaultSchema() {
    }
        throw new DBCFeatureNotSupportedException();
    }

import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
/*
    }
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }

 * Unless required by applicable law or agreed to in writing, software
 *
        return null;
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
 *
    @Override


        throw new DBCFeatureNotSupportedException();
 * VoidExecutionContextDefaults
    }

    public void setDefaultSchema(DBRProgressMonitor monitor, DBSSchema schema) throws DBCException {

    public boolean refreshDefaults(DBRProgressMonitor monitor, boolean useBootstrapSettings) throws DBException {
    }
    public boolean supportsCatalogChange() {
public class VoidExecutionContextDefaults implements DBCExecutionContextDefaults {
        throw new DBCFeatureNotSupportedException();
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
package org.jkiss.dbeaver.model.impl;
    public void setDefaultCatalog(DBRProgressMonitor monitor, DBSCatalog catalog, DBSSchema schema) throws DBCException {
        return null;
