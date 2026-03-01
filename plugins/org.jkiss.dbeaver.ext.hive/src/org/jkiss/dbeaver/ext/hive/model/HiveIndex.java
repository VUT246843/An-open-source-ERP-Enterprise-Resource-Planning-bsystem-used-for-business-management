    @Override


    public HiveIndex(HiveTable table, String name, boolean persisted, String description, String indexType, HiveTable indexTable) {
    public long getCardinality() {
    }
    }
    }
    @Override
 */
        return DBUtils.getFullQualifiedName(getDataSource(),
 *
    }
    public boolean isUnique() {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(viewable = false)
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
 *
        return super.getCardinality();
import org.jkiss.code.Nullable;
    @Property(viewable = true, order = 7)
package org.jkiss.dbeaver.ext.hive.model;


        return indexTable;
 * Unless required by applicable law or agreed to in writing, software
    @Property(viewable = false)
import org.jkiss.dbeaver.ext.generic.model.GenericTableIndex;
    public String getQualifier() {
    @Override
                getTable().getCatalog(),
                this);

 * DBeaver - Universal Database Manager
    private String description;
    }
}
        return super.getQualifier();
 * you may not use this file except in compliance with the License.
    @NotNull
    @Property(viewable = true, order = 5)
    @Property(viewable = false)
    public String getHiveIndexType() {
    public String getDescription() {
        this.indexType = indexType;
                getTable().getSchema(),
    private String indexType;
    @Nullable
    public DBSIndexType getIndexType() {
 * limitations under the License.


        return description;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public HiveTable getIndexTable() {

import org.jkiss.dbeaver.model.DBUtils;
        super(table, true, "", 0, name, DBSIndexType.OTHER, true);
    }
        this.description = description;
public class HiveIndex extends GenericTableIndex {
    @Property(viewable = true, order = 6)
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
    }

 * You may obtain a copy of the License at
        this.indexTable = indexTable;
import org.jkiss.dbeaver.model.meta.Property;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    private HiveTable indexTable;
        return false;

/*
        return indexType;

        return super.getIndexType();
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
    @Override
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Override

 * See the License for the specific language governing permissions and
