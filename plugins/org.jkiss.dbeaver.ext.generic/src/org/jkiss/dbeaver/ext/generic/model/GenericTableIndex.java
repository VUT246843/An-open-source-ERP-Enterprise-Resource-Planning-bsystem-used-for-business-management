     */
            this
     * @param source source index
        return DBUtils.getFullQualifiedName(
    @Override
 *
        this.cardinality = cardinality;
        return cardinality;
/**
        boolean nonUnique,
 * See the License for the specific language governing permissions and
        this.qualifier = source.qualifier;
        columns.add(column);
    @Nullable
    public void setUnique(boolean unique) {
    @Override
    ) {
    private final long cardinality;
import org.jkiss.dbeaver.model.DBUtils;
package org.jkiss.dbeaver.ext.generic.model;
        String qualifier,
 * limitations under the License.
    private final String qualifier;
        return DBUtils.findObject(columns, columnName);
        this.columns = columns;
    public String getDescription() {
    @Property(viewable = true, order = 5)
 * Unless required by applicable law or agreed to in writing, software
    }
    public long getCardinality() {

 *

        super(source);
            getTable().getCatalog(),



    }
        );
     * Copy constructor
    @NotNull
            getTable().getSchema(),
    private List<GenericTableIndexColumn> columns;
    public List<GenericTableIndexColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) {
            this.columns = new ArrayList<>(source.columns.size());
import org.jkiss.code.NotNull;

 */
            getDataSource(),

import org.jkiss.dbeaver.model.DBPEvaluationContext;
        return columns;
import org.jkiss.dbeaver.model.meta.PropertyLength;
    }
                this.columns.add(new GenericTableIndexColumn(this, sourceColumn));
    }
    }
    }
    @NotNull
 *
        this.cardinality = source.cardinality;
/*
    @Nullable
}
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableIndex;
        if (source.columns != null) {
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;

     *
 * GenericTable
        this.nonUnique = source.nonUnique;

    }
import java.util.ArrayList;
 * you may not use this file except in compliance with the License.
        String indexName,
            for (GenericTableIndexColumn sourceColumn : source.columns) {
        DBSIndexType indexType,
    public GenericTableIndexColumn getColumn(@NotNull String columnName) {

        boolean persisted
    }

        long cardinality,
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
import org.jkiss.code.Nullable;
        return null;
        this.qualifier = qualifier;
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
    private boolean nonUnique;
    @Property(viewable = true, order = 4)

        this.nonUnique = nonUnique;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class GenericTableIndex extends JDBCTableIndex<GenericStructContainer, GenericTableBase> {
        this.nonUnique = !unique;
    public void addColumn(@NotNull GenericTableIndexColumn column) {
    @Property(viewable = true, order = 5)
        if (columns == null) {
 * DBeaver - Universal Database Manager
    public GenericTableIndex(

 *     http://www.apache.org/licenses/LICENSE-2.0
        return qualifier;

    /**
    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean isUnique() {
import java.util.List;
 * You may obtain a copy of the License at
    GenericTableIndex(@NotNull GenericTableIndex source) {
        }
 */
    public String getQualifier() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setColumns(List<GenericTableIndexColumn> columns) {
    }
    public GenericDataSource getDataSource() {

import org.jkiss.dbeaver.model.meta.Property;
    }
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        return !nonUnique;

    @Override

            columns = new ArrayList<>();
            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
        super(table.getContainer(), table, indexName, indexType, persisted);
        @NotNull GenericTableBase table,
        return getTable().getDataSource();
