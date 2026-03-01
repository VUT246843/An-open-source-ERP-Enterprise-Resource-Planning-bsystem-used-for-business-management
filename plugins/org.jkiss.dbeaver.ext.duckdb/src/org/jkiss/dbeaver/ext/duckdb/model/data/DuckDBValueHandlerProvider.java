 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.code.Nullable;

            case DuckDBConstants.TYPE_GEOMETRY -> DuckDBGeometryValueHandler.INSTANCE;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

            case DuckDBConstants.TYPE_BLOB -> JDBCContentValueHandler.INSTANCE;
 * You may obtain a copy of the License at

public class DuckDBValueHandlerProvider implements DBDValueHandlerProvider {
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
} * limitations under the License.
import org.jkiss.dbeaver.ext.duckdb.model.DuckDBConstants;
import java.util.Locale;
 *
import org.jkiss.dbeaver.model.DBPDataKind;
        if (typedObject.getDataKind() == DBPDataKind.STRUCT) {
package org.jkiss.dbeaver.ext.duckdb.model.data;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
 */
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject) {
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
        }
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
        return switch (typedObject.getTypeName().toUpperCase(Locale.ROOT)) {
            default -> null;
    @Override

            return DuckDBStructValueHandler.INSTANCE;
 *
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCContentValueHandler;
        };
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *

    @Nullable
import org.jkiss.dbeaver.model.data.DBDValueHandler;
