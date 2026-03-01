
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
/*
import org.jkiss.dbeaver.DBException;
/**
    boolean supportsSchemaChange();

public interface DBCExecutionContextDefaults<CATALOG extends DBSCatalog, SCHEMA extends DBSSchema> {
 * limitations under the License.
    void setDefaultCatalog(DBRProgressMonitor monitor, CATALOG catalog, @Nullable SCHEMA schema) throws DBCException;

 */
    void setDefaultSchema(DBRProgressMonitor monitor, SCHEMA schema) throws DBCException;
}

import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
 * Provides access to default context catalog/schema.

    }
 * Note: metadata context defaults are datasource defaults.
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
        return new DBCCachedContextDefaults(null, null);
    default DBCCachedContextDefaults getCachedDefault() {
package org.jkiss.dbeaver.model.exec;

 * See the License for the specific language governing permissions and
    @Nullable
    boolean refreshDefaults(DBRProgressMonitor monitor, boolean useBootstrapSettings) throws DBException;

import org.jkiss.code.NotNull;
    CATALOG getDefaultCatalog();

    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Execution context defaults.
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    SCHEMA getDefaultSchema();
 *
 * You may obtain a copy of the License at

 * DBeaver - Universal Database Manager
 */
    @NotNull

    boolean supportsCatalogChange();
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
