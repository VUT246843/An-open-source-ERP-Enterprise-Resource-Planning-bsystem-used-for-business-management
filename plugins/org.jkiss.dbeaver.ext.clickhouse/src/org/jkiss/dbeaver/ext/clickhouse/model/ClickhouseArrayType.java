    }
    public DBPDataKind getDataKind() {
 * limitations under the License.
    }
    }
 */
    public DBSDataType getComponentType() {
    public String getTypeName() {
    @Override

public class ClickhouseArrayType extends ClickhouseAbstractDataType {
        return DBPDataKind.ARRAY;

    }


    }
    }

import java.sql.Types;
    @Override
    public String getFullTypeName() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    @Override
    }
 *
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Nullable
 * You may obtain a copy of the License at
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.DBSDataType;
        return baseName;
    private final DBSDataType componentType;
    @Override
        return fullName;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.componentType = componentType;
    @NotNull

 * you may not use this file except in compliance with the License.
    private final String fullName;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull
import org.jkiss.dbeaver.model.DBPDataKind;

import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software

 *
    public DBSDataType getComponentType(@NotNull DBRProgressMonitor monitor) {
        super(dataSource);
    public ClickhouseArrayType(@NotNull ClickhouseDataSource dataSource, @NotNull DBSDataType componentType) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return Types.ARRAY;

    private final String baseName;
 *

        return componentType;
}
import org.jkiss.code.Nullable;
    public int getTypeID() {
package org.jkiss.dbeaver.ext.clickhouse.model;
 * DBeaver - Universal Database Manager
        this.fullName = "Array(" + componentType.getFullTypeName() + ")";
        return componentType;
        this.baseName = "Array";
/*
    @NotNull
