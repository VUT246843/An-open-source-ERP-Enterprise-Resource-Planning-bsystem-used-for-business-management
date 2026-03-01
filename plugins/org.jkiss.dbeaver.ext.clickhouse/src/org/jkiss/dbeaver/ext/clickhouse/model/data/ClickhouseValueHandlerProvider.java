 *
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.data.DBDValueHandler;
        } else if (dataKind == DBPDataKind.STRUCT) {
            return new ClickHouseDateTimeValueHandler(preferences);
public class ClickhouseValueHandlerProvider implements DBDValueHandlerProvider {
            } else {
            return ClickhouseGeometryValueHandler.INSTANCE;
        } else if ("uuid".equals(lowerTypeName)) {
            return JDBCUUIDValueHandler.INSTANCE;
        }
import org.jkiss.dbeaver.model.DBPDataSource;
    }

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
/*
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
import org.jkiss.dbeaver.ext.clickhouse.ClickhouseConstants;
            }
                || lowerTypeName.contains("uint64") || lowerTypeName.contains("uint128") || lowerTypeName.contains("uint256")) {
package org.jkiss.dbeaver.ext.clickhouse.model.data;
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (lowerTypeName.contains("int128") || lowerTypeName.contains("int256")
 *
        return null;
        } else if ("bool".equals(lowerTypeName)) {
        } else if (ClickhouseGeometryValueHandler.isGeometryType(lowerTypeName)) {
            return ClickhouseEnumValueHandler.INSTANCE;
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject type) {
    @Override
                return new ClickhouseBigNumberValueHandler(type, preferences);
import java.util.Locale;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        } else if (dataKind == DBPDataKind.DATETIME) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            return ClickhouseArrayValueHandler.INSTANCE;
        } else if (dataKind == DBPDataKind.NUMERIC) {
        String lowerTypeName = type.getTypeName().toLowerCase(Locale.ENGLISH);

        if ("enum8".equals(lowerTypeName) || "enum16".equals(lowerTypeName)) {
 * DBeaver - Universal Database Manager
        } else if (dataKind == DBPDataKind.ARRAY) {
}
        DBPDataKind dataKind = type.getDataKind();
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
                return new JDBCNumberValueHandler(type, preferences);
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPDataKind;
 */
 * limitations under the License.
            return ClikhouseInetTypeValueHandler.INSTANCE;
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCNumberValueHandler;
            return ClickhouseStructValueHandler.INSTANCE;
 *
            return ClickhouseBoolValueHandler.INSTANCE;
        } else if (ClickhouseConstants.DATA_TYPE_IPV4.equals(lowerTypeName) || ClickhouseConstants.DATA_TYPE_IPV6.equals(lowerTypeName)) {
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCUUIDValueHandler;
