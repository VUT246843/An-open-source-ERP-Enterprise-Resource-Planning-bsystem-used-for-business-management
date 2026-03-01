    public ClickhouseMapType(
 *
    private final DBSDataType valueType;
 * See the License for the specific language governing permissions and
        @NotNull DBSDataType keyType,
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;

 * distributed under the License is distributed on an "AS IS" BASIS,
        this.keyType = keyType;
import org.jkiss.utils.Pair;
 * limitations under the License.
    }
import org.jkiss.dbeaver.model.struct.DBSDataType;
 * you may not use this file except in compliance with the License.
/*
 */

    }

 * Copyright (C) 2010-2024 DBeaver Corp and others
        super(dataSource, "Map", List.of(new Pair<>("Key", keyType), new Pair<>("Value", valueType)));

    ) {
import java.util.List;
 *
    @NotNull
    public DBSDataType getValueType() {
    }
        return valueType;

    @NotNull
        this.valueType = valueType;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
}
    private final DBSDataType keyType;
    public DBSDataType getKeyType() {
 * DBeaver - Universal Database Manager
 *
public class ClickhouseMapType extends ClickhouseTupleType {
        return keyType;
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull ClickhouseDataSource dataSource,

 * Unless required by applicable law or agreed to in writing, software
        @NotNull DBSDataType valueType
package org.jkiss.dbeaver.ext.clickhouse.model;
