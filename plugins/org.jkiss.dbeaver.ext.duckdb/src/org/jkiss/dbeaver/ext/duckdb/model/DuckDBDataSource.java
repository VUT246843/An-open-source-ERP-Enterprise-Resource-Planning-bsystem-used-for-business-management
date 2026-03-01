 * See the License for the specific language governing permissions and
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
    public DBPDataKind resolveDataKind(@NotNull String typeName, int valueType) {
        return new DuckDBExecutionContext(instance, type);
 */
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
import org.jkiss.code.NotNull;
    protected JDBCExecutionContext createExecutionContext(JDBCRemoteInstance instance, String type) {
            default -> super.resolveDataKind(typeName, valueType);
    }
/**
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.ext.duckdb.model;
import org.jkiss.dbeaver.DBException;
 *
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;

 *

 * limitations under the License.
}
 * DuckDB Data source
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return switch (typeName.toUpperCase(Locale.ROOT)) {
    }
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
/*
import org.jkiss.dbeaver.model.DBPDataKind;
    @Override
 * DBeaver - Universal Database Manager
    @NotNull
public class DuckDBDataSource extends GenericDataSource {
        };
import java.util.Locale;
        super(monitor, container, metaModel, new DuckDBSQLDialect());
            case DuckDBConstants.TYPE_GEOMETRY -> DBPDataKind.OBJECT;
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    public DuckDBDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, GenericMetaModel metaModel) throws DBException {
