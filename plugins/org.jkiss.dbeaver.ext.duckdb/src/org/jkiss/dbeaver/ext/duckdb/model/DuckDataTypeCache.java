                return Types.OTHER;
import java.sql.SQLException;

 * You may obtain a copy of the License at
            case "composite":
        );
import org.jkiss.code.Nullable;
            case "binary":
    protected JDBCStatement prepareObjectsStatement(
 *
    public DuckDataTypeCache(@NotNull GenericStructContainer container) {
            case "point_3d":
/*
    @Override
import java.sql.Types;
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
            case "wkb_blob":
            case "datetime":
        @NotNull JDBCSession session,
 * See the License for the specific language governing permissions and
            case "timetz":

            case "string":
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
package org.jkiss.dbeaver.ext.duckdb.model;

 * you may not use this file except in compliance with the License.
 */
            case "time":
        @NotNull JDBCResultSet dbResult
    }
            case "boolean":
            return Types.OTHER;
                return Types.BINARY;
                return Types.TIME;
                return Types.BOOLEAN;
        return session.prepareStatement(

import java.util.Locale;
            case "point_2d":
            case "text":
        return new GenericDataType(container, kind, name, null, false, false, -1, -1, -1);
public class DuckDataTypeCache extends JDBCBasicDataTypeCache<GenericStructContainer, GenericDataType> {
                return Types.STRUCT;
            case "bytea":

            "where schema_name = 'main'"
 * limitations under the License.
            case "varbinary":
            "from duckdb_types() " +
            case "linestring_2d":

            case "numeric":
                return Types.NUMERIC;
}
            default:
        final String name = JDBCUtils.safeGetString(dbResult, "type_name");
            case "box_2d":
        if (category == null) {
                return Types.VARCHAR;
            case "logical":
    }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCBasicDataTypeCache;
    ) {
 *
        @NotNull JDBCSession session,
 * Licensed under the Apache License, Version 2.0 (the "License");

            case "varchar":
    private static int getTypeKind(@Nullable String category) {
        switch (category.toLowerCase(Locale.ROOT)) {
import org.jkiss.dbeaver.ext.generic.model.GenericDataType;
    ) throws SQLException {
            case "polygon_2d":
        }
                return Types.TIMESTAMP;
                return Types.TIMESTAMP_WITH_TIMEZONE;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        final int kind = getTypeKind(JDBCUtils.safeGetString(dbResult, "type_category"));
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            "select distinct(type_name), type_name, type_category " +
            case "nvarchar":
                return Types.TIME_WITH_TIMEZONE;
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull GenericStructContainer container,
                return Types.DATE;
        super(container);
        @NotNull GenericStructContainer container
            case "timestamptz":
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
            case "date":
            case "bpchar":
    @NotNull
            case "blob":
            case "bool":
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
            case "point_4d":
        }
    protected GenericDataType fetchObject(
 *
            case "timestamp_us":
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
