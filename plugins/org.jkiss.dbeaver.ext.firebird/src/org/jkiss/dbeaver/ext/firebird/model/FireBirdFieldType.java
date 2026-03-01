import java.sql.Types;
 * limitations under the License.
    CHAR(14, Types.CHAR, DBPDataKind.STRING, "CHAR"),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (ft.getTypeID() == id) {
                default:
    }
    DATE(12, Types.DATE, DBPDataKind.DATETIME, "DATE"),
    TIME(13, Types.TIME, DBPDataKind.DATETIME, "TIME"),
 * you may not use this file except in compliance with the License.
    }

        }
        return typeID;
            switch (subTypeId) {
    public int getValueType() {
    public DBPDataKind getDataKind() {
            }
    public String getName() {
    TIME_WITH_TIMEZONE(28, Types.TIME_WITH_TIMEZONE, DBPDataKind.DATETIME, "TIME WITH TIMEZONE"),
    FLOAT(10, Types.FLOAT, DBPDataKind.NUMERIC, "FLOAT"),
        if (id == 16 || id == 8) {
 * See the License for the specific language governing permissions and
        this.dataKind = dataKind;
    BIGINT(16, Types.BIGINT, DBPDataKind.NUMERIC, "BIGINT"),
package org.jkiss.dbeaver.ext.firebird.model;
        this.typeID = typeID;

        return name;
    }
        return dataKind;
 * Licensed under the Apache License, Version 2.0 (the "License");
    NUMERIC(16, Types.NUMERIC, DBPDataKind.NUMERIC, "NUMERIC"), // Equal id, but another subtype - 1
 *
 *


}    BOOLEAN(23, Types.BOOLEAN, DBPDataKind.BOOLEAN, "BOOLEAN"),
    DOUBLE_PRECISION(27, Types.DOUBLE, DBPDataKind.NUMERIC, "DOUBLE PRECISION"),
 * You may obtain a copy of the License at
    }
                case 1:
    BLOB(261, Types.BLOB, DBPDataKind.CONTENT, "BLOB");
    }
    TIMESTAMP(35, Types.TIMESTAMP, DBPDataKind.DATETIME, "TIMESTAMP"),
 * distributed under the License is distributed on an "AS IS" BASIS,
                    return DECIMAL;
    private final DBPDataKind dataKind;

 */
 * DBeaver - Universal Database Manager

    private final int valueType;
/*
                case 2:

                    return NUMERIC;


                return ft;
        return valueType;
    TIMESTAMP_WITH_TIMEZONE(29, Types.TIMESTAMP_WITH_TIMEZONE, DBPDataKind.DATETIME, "TIMESTAMP WITH TIMEZONE"),
        for (FireBirdFieldType ft : values()) {
        this.name = name;

    VARCHAR(37, Types.VARCHAR, DBPDataKind.STRING, "VARCHAR"),
                    return id == 16 ? BIGINT : INTEGER;
    DECIMAL(16, Types.DECIMAL, DBPDataKind.NUMERIC, "DECIMAL"), // Equal id, but another subtype - 2
    DECFLOAT(11, Types.FLOAT, DBPDataKind.NUMERIC, "DECFLOAT"),
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private final int typeID;
    SMALLINT(7, Types.SMALLINT, DBPDataKind.NUMERIC, "SMALLINT"),
    public static FireBirdFieldType getById(int id, int subTypeId) {
    public int getTypeID() {
    private final String name;
        }
import org.jkiss.dbeaver.model.DBPDataKind;
 *     http://www.apache.org/licenses/LICENSE-2.0
    INTEGER(8, Types.INTEGER, DBPDataKind.NUMERIC, "INTEGER"),
        this.valueType = valueType;
    }
 *
    INT128(26, Types.BIGINT, DBPDataKind.NUMERIC, "INT128"),
        return null;
public enum FireBirdFieldType {
    CSTRING(40, Types.VARCHAR, DBPDataKind.STRING, "CSTRING"),
            }
    FireBirdFieldType(int typeID, int valueType, DBPDataKind dataKind, String name) {
