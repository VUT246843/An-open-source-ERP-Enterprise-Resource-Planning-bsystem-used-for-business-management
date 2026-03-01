                case SQLConstants.DATA_TYPE_VARCHAR:
                case "decimal":
                    valueType = Types.DECIMAL;
import org.jkiss.dbeaver.DBException;
        @NotNull JDBCResultSet dbResult
            }
import java.sql.SQLException;
    ) throws SQLException, DBException {

        }
                    break;
                    valueType = Types.CHAR;
import org.jkiss.dbeaver.ext.generic.model.GenericDataType;
package org.jkiss.dbeaver.ext.trino.model;

import org.jkiss.dbeaver.model.sql.SQLConstants;
                default:
    protected GenericDataType fetchObject(
import java.util.Locale;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 *
                    return super.fetchObject(session, container, dbResult);
import org.jkiss.dbeaver.ext.generic.model.GenericDataTypeCache;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

                case "time":
        super(owner);
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
            return null;
                    break;
                    break;
                    valueType = Types.TIME_WITH_TIMEZONE;
        int valueType = JDBCUtils.safeGetInt(dbResult, JDBCConstants.DATA_TYPE);
 * limitations under the License.
import java.sql.Types;
                    break;
/*

        String name = JDBCUtils.safeGetString(dbResult, JDBCConstants.TYPE_NAME);
            switch (lowerCaseName) {
            String lowerCaseName = name.toLowerCase(Locale.getDefault());
                    valueType = Types.TIMESTAMP_WITH_TIMEZONE;
            return makeDataType(dbResult, name, valueType);
        @NotNull GenericStructContainer container,
    TrinoDataTypeCache(GenericStructContainer owner) {
        @NotNull JDBCSession session,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
                    break;
                    valueType = Types.TIME;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
        if (CommonUtils.isEmpty(name)) {
                    break;
                    break;
 *
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
                case "timestamp with time zone":
        }
    }
        if (valueType == Types.JAVA_OBJECT) {
                case "char", "uuid":
import org.jkiss.utils.CommonUtils;
 *

import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        // Check for incorrect values types
 *     http://www.apache.org/licenses/LICENSE-2.0
}
        return super.fetchObject(session, container, dbResult);
public class TrinoDataTypeCache extends GenericDataTypeCache {
                case "time with time zone":
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
    @Override
 */
                case "timestamp":
                    valueType = Types.TIMESTAMP;
                    valueType = Types.VARCHAR;
