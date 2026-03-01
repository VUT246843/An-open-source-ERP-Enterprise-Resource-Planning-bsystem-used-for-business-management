    {
            case REFERENCE:
            case STRING:
                if (LONGVARCHAR_AS_LOB && (valueType == java.sql.Types.LONGVARCHAR || valueType == java.sql.Types.LONGNVARCHAR)) {
 * DBeaver - Universal Database Manager
 *
                return new JDBCNumberValueHandler(typedObject, preferences);
/*
            case CONTENT:
                    return JDBCContentValueHandler.INSTANCE;
    }
 * limitations under the License.
                return JDBCReferenceValueHandler.INSTANCE;
 * distributed under the License is distributed on an "AS IS" BASIS,
}
 *
                }
            default:
                } else {
        switch (dataKind) {
                return null;
                return JDBCArrayValueHandler.INSTANCE;
 * Standard JDBC data types handler provider
            case ARRAY:
                if ("UUID".equalsIgnoreCase(typedObject.getTypeName())) {
            case BOOLEAN:
 */
        }
                return new JDBCDateTimeValueHandler(preferences);

            case NUMERIC:
package org.jkiss.dbeaver.model.impl.jdbc.data.handlers;
                return JDBCContentValueHandler.INSTANCE;
import org.jkiss.dbeaver.model.data.DBDValueHandler;
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.model.struct.DBSTypedObject;

            case DATETIME:
                    return JDBCUUIDValueHandler.INSTANCE;
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.DBPDataKind;
            case ROWID:
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");

            case STRUCT:

            case BINARY:
                // Unknown type
                }
                    return JDBCStringValueHandler.INSTANCE;
        int valueType = typedObject.getTypeID();
 * See the License for the specific language governing permissions and
    private static final boolean LONGVARCHAR_AS_LOB = false;
                    // Eval long varchars as LOBs
        DBPDataKind dataKind = typedObject.getDataKind();//JDBCUtils.resolveDataKind(dataSource, typedObject.getTypeName(), valueType);
                return JDBCStructValueHandler.INSTANCE;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
/**
                return new JDBCBooleanValueHandler();
 */
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
    @Override
                return JDBCObjectValueHandler.INSTANCE;
public class JDBCStandardValueHandlerProvider implements DBDValueHandlerProvider {
 *
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject)
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
