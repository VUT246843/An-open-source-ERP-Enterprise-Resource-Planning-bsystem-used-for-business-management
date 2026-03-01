    public String getFullTypeName() {
    @NotNull
    @Override
 *
import org.jkiss.dbeaver.model.DBPDataKind;
 * limitations under the License.
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
        return typeName;
    @Override
    }

    private int scale;
 * you may not use this file except in compliance with the License.
        this.maxLength = maxLength;
    public long getTypeModifiers() {
    @Override
        return typeId;
    private int maxLength;
    public Integer getScale() {
import org.jkiss.code.Nullable;
    @Override
    public String getTypeName() {
    }
 *
        this.scale = scale;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,

    @NotNull

package org.jkiss.dbeaver.ext.mssql.model;
 */
    }

import org.jkiss.code.NotNull;
/*
        return 0;
    }

 * Licensed under the Apache License, Version 2.0 (the "License");

        return dataKind;
    public long getMaxLength() {
    public DBPDataKind getDataKind() {
        return precision;
    private int precision;
        return typeName;
        this.dataKind = dataKind;
        this.typeName = typeName;
    }
        return maxLength;
        this.precision = precision;
    @NotNull
    private DBPDataKind dataKind;
    public int getTypeID() {
    public Integer getPrecision() {
}
    @Override
    @Nullable
    }
    @Override
    @Nullable
    }
    @Override
    public SQLServerTypedObject(String typeName, int typeId, DBPDataKind dataKind, int scale, int precision, int maxLength) {

    }

 * Unless required by applicable law or agreed to in writing, software
    private int typeId;
        this.typeId = typeId;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        return scale;
    private String typeName;

public class SQLServerTypedObject implements DBSTypedObject {
    }


 * DBeaver - Universal Database Manager
    @Override
 *
 * See the License for the specific language governing permissions and
