        }
 *
            case MySQLConstants.TYPE_POINT:
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCObjectValueHandler;
            case MySQLConstants.TYPE_UUID:


import org.jkiss.dbeaver.model.DBPDataKind;
            return new MySQLNumberValueHandler(typedObject, preferences);

/*
import org.jkiss.dbeaver.model.DBPDataSource;
package org.jkiss.dbeaver.ext.mysql.data;
                return MySQLJSONValueHandler.INSTANCE;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
            case MySQLConstants.TYPE_ENUM:
        String typeName = typedObject.getTypeName().toLowerCase(Locale.ENGLISH);
            case MySQLConstants.TYPE_GEOMETRY:
            case MySQLConstants.TYPE_POLYGON:
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else if (dataKind == DBPDataKind.NUMERIC) {
    @Override
            case MySQLConstants.TYPE_SET:

            case MySQLConstants.TYPE_GEOGRAPHYPOINT:
import org.jkiss.dbeaver.model.data.DBDValueHandler;
                return JDBCObjectValueHandler.INSTANCE;
/**
                return MySQLGeometryValueHandler.INSTANCE;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
 * DBeaver - Universal Database Manager
                return MySQLUUIDValueHandlerProvider.INSTANCE;
            case MySQLConstants.TYPE_MULTILINESTRING:
            case MySQLConstants.TYPE_MULTIPOLYGON:
} *
        if (dataKind == DBPDataKind.DATETIME) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 */
            case MySQLConstants.TYPE_GEOGRAPHY:
        switch (typeName) {

            case MySQLConstants.TYPE_GEOMETRYCOLLECTION:
            return new MySQLDateTimeValueHandler(preferences);
        DBPDataKind dataKind = typedObject.getDataKind();
public class MySQLValueHandlerProvider implements DBDValueHandlerProvider {
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
 * MySQL data types provider
 * See the License for the specific language governing permissions and
import java.util.Locale;
    }
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
    {
        return null;
            case MySQLConstants.TYPE_MULTIPOINT:
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        }


            case MySQLConstants.TYPE_LINESTRING:
 */
            case MySQLConstants.TYPE_JSON:
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject)
