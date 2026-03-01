public class PostgreValueHandlerProvider extends JDBCStandardValueHandlerProvider {
                    case PostgreConstants.TYPE_JSON:
package org.jkiss.dbeaver.ext.postgresql.model.data;
            default:
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject) {
 *
                        return PostgreRefCursorValueHandler.INSTANCE;
import java.sql.Types;
                        }
                        if (PostgreConstants.SERIAL_TYPES.containsKey(typeName)) {
                        return PostgreJSONValueHandler.INSTANCE;
 * you may not use this file except in compliance with the License.
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
                } else {
                if (((PostgreDataSource) dataSource).getServerType().supportsTemporalAccessor()) {
import org.jkiss.dbeaver.ext.postgresql.model.impls.redshift.PostgreServerRedshift;
                    case PostgreConstants.TYPE_GEOGRAPHY:
            case Types.TIMESTAMP_WITH_TIMEZONE:
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
                        }
                            return RedshiftGeometryValueHandler.INSTANCE;
                        return JDBCContentValueHandler.INSTANCE;
 */
 *
                    case PostgreConstants.TYPE_GEOMETRY:
        switch (typeID) {
                }
                    case PostgreConstants.TYPE_MONEY:
                    case PostgreConstants.TYPE_INTERVAL:
 * See the License for the specific language governing permissions and
                            return PostgreStringValueHandler.INSTANCE;
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCContentValueHandler;
 */
                    case PostgreConstants.TYPE_REFCURSOR:
import org.jkiss.dbeaver.model.DBPDataKind;
                }
                    case PostgreConstants.TYPE_HSTORE:
    @Override
            case Types.ARRAY:
                    // The special case for the OpenGauss database, which returns json types as a struct type.
            return PostgreUnknownValueHandler.INSTANCE;
                    case PostgreConstants.TYPE_BIT:
//        // FIXME: This doesn't work as data type information is not available during RS metadata reading
            case Types.STRUCT:
//        DBSDataType dataType = DBUtils.getDataType(typedObject);
 * DBeaver - Universal Database Manager
                        if (typeID == Types.OTHER || typedObject.getDataKind() == DBPDataKind.STRING) {
                    return new PostgreTemporalAccessorValueHandler(preferences);
}
            case Types.TIME:
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
/**
                    case PostgreConstants.TYPE_VARBIT:
        int typeID = typedObject.getTypeID();
                    case PostgreConstants.TYPE_VARBYTE:
/*
                return new PostgreDateTimeValueHandler(preferences);
//            return PostgreEnumValueHandler.INSTANCE;

import org.jkiss.code.Nullable;
                        }
    }
                        return PostgreHStoreValueHandler.INSTANCE;

import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStandardValueHandlerProvider;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCNumberValueHandler;
                    return new PostgreDateTimeValueHandler(preferences);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.postgresql.model.impls.redshift.RedshiftGeometryValueHandler;
            // This results in scenarios where some JDBC APIs return nulls in unexpected places. For example, here.
                    && (PostgreConstants.TYPE_JSONB.equals(typeName) || PostgreConstants.TYPE_JSON.equals(typeName))
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
//        if (dataType instanceof PostgreDataType && ((PostgreDataType) dataType).getTypeCategory() == PostgreTypeCategory.E) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        }
                        return PostgreGeometryValueHandler.INSTANCE;
 * Unless required by applicable law or agreed to in writing, software
            case Types.DATE:
                    return PostgreJSONValueHandler.INSTANCE;
                return PostgreArrayValueHandler.INSTANCE;
                    case PostgreConstants.TYPE_JSONB:
            case Types.TIME_WITH_TIMEZONE:
        String typeName = typedObject.getTypeName();

                        return PostgreMoneyValueHandler.INSTANCE;
                    default:
 * Licensed under the Apache License, Version 2.0 (the "License");
        return super.getValueHandler(dataSource, preferences, typedObject);
 * Copyright (C) 2010-2025 DBeaver Corp and others
                        return PostgreIntervalValueHandler.INSTANCE;
                        if (((PostgreDataSource) dataSource).getServerType() instanceof PostgreServerRedshift) {
                            return new JDBCNumberValueHandler(typedObject, preferences);
 * You may obtain a copy of the License at
                ) {
        if (typeName == null) {
 * PostgreValueHandlerProvider
import org.jkiss.dbeaver.model.data.DBDValueHandler;
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
                return PostgreStructValueHandler.INSTANCE;
                }
                        return PostgreBitStringValueHandler.INSTANCE;
//        }
 * limitations under the License.
import org.jkiss.dbeaver.model.DBPDataSource;
    @Nullable
                if (CommonUtils.isNotEmpty(typeName)
            case Types.TIMESTAMP:
            // Some databases that claim to be PostgreSQL-compliant, in fact, aren't compliant with its protocol.
                switch (typeName) {
