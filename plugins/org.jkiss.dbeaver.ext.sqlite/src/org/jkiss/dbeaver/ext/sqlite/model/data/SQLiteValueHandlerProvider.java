import org.jkiss.dbeaver.model.DBPDataKind;
        final DBPDataKind dataKind = typedObject.getDataKind();
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.data.DBDValueHandler;
/*
    @Nullable
        return new SQLiteValueHandler(typedObject, preferences);
 */

            return SQLiteGeometryValueHandler.INSTANCE;
    }
 *
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCContentValueHandler;
}        }
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject)
    @Override
 *
        if (ArrayUtils.contains(SQLiteGeometryValueHandler.GEOMETRY_TYPES, typedObject.getTypeName())) {
 * limitations under the License.


public class SQLiteValueHandlerProvider implements DBDValueHandlerProvider {
import org.jkiss.utils.ArrayUtils;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
 * See the License for the specific language governing permissions and
/**
        if (dataKind == DBPDataKind.BINARY) {

 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.sqlite.model.data;
    {
            return JDBCContentValueHandler.INSTANCE;
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * SQLiteValueHandlerProvider
        }
 */
import org.jkiss.dbeaver.model.DBPDataSource;
 * You may obtain a copy of the License at
        // All types must be handled by unified SQLite handler
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
