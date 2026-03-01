    }
    ANY(DBPDataKind.ANY, Types.NULL, Integer.MAX_VALUE, 0);

    private final int scale;
        this.valueType = valueType;
    NUMERIC(DBPDataKind.NUMERIC, Types.NUMERIC, 17, 17),
 * limitations under the License.
public enum SQLiteAffinity {
 *
    TEXT(DBPDataKind.STRING, Types.VARCHAR, Integer.MAX_VALUE, 0),
    }
        this.precision = precision;
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final DBPDataKind dataKind;
        return valueType;

import org.jkiss.dbeaver.model.DBPDataKind;
 * See the License for the specific language governing permissions and

    INTEGER(DBPDataKind.NUMERIC, Types.BIGINT, 19, 0),
        this.dataKind = dataKind;


 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.sqlite.model;
        return scale;
    }
}
    private final int valueType;
    SQLiteAffinity(DBPDataKind dataKind, int valueType, int precision, int scale) {

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    private final int precision;
    public int getScale() {

import java.sql.Types;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

 *

    REAL(DBPDataKind.NUMERIC, Types.DOUBLE, 17, 17),
        return precision;
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public int getPrecision() {
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    public int getValueType() {
        this.scale = scale;
        return dataKind;
 * DBeaver - Universal Database Manager

 * Unless required by applicable law or agreed to in writing, software
    public DBPDataKind getDataKind() {
 * You may obtain a copy of the License at
    BLOB(DBPDataKind.BINARY, Types.BINARY, Integer.MAX_VALUE, 0),
