}
/*
    public CubridTableIndex(
        super(table, nonUnique, qualifier, cardinality, indexName, indexType, persisted);
public class CubridTableIndex extends GenericTableIndex {
 * You may obtain a copy of the License at

 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 *
           DBSIndexType indexType,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 */
    @Override
 * See the License for the specific language governing permissions and
    public String getName() {
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
           boolean nonUnique,
import org.jkiss.code.NotNull;
           String indexName,
 *
import org.jkiss.dbeaver.ext.generic.model.GenericTableIndex;

           boolean persisted) {
    }

    @Override
        return super.getName();
 * limitations under the License.

           long cardinality,
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.meta.Property;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        super.setName(name != null ? name.toLowerCase() : null);

    @NotNull
    @Property(viewable = true, editable = true, order = 1)
           GenericTableBase table,
           String qualifier,
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.cubrid.model;

 *
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
    public void setName(@NotNull String name) {
