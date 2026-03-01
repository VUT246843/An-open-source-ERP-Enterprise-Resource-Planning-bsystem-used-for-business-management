    public GenericTableIndexColumn(
        this.index = toIndex;
        return tableColumn.getName();
import org.jkiss.code.Nullable;

    }
 *
    @Override
    }
        this.ordinalPosition = source.ordinalPosition;
        return ordinalPosition;
    }
 * you may not use this file except in compliance with the License.
    }

public class GenericTableIndexColumn extends AbstractTableIndexColumn {
    private final GenericTableIndex index;
    @Property(viewable = true, order = 1)
        return index;
        this.ascending = ascending;
    }
        this.ascending = source.ascending;
    @Override
        @NotNull GenericTableIndex index,
        this.index = index;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager

    public boolean isAscending() {
    public String getName() {
 *
        int ordinalPosition,
import org.jkiss.code.NotNull;
        return ascending;
    @Property(viewable = true, order = 1)
    @Override
    }
    }
        this.ordinalPosition = ordinalPosition;
    @NotNull
        return index.getDataSource();

 * See the License for the specific language governing permissions and
    public GenericTableIndex getParentObject() {
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

 * You may obtain a copy of the License at
    private final int ordinalPosition;
    @Property(viewable = true, order = 3)
        this.tableColumn = source.tableColumn;

/*
    @Override

 */
    }
 * Unless required by applicable law or agreed to in writing, software
    @Nullable
    }

    public int getOrdinalPosition() {
        return tableColumn;
    private final GenericTableColumn tableColumn;
    @Override

    @NotNull
    @Nullable
        @NotNull GenericTableColumn tableColumn,
        this.tableColumn = tableColumn;
        return tableColumn.getDescription();
import org.jkiss.dbeaver.model.meta.Property;
 *
    GenericTableIndexColumn(GenericTableIndex toIndex, GenericTableIndexColumn source) {
        return index;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    ) {
 * GenericTableIndexColumn
    private final boolean ascending;
    public GenericTableIndex getIndex() {
package org.jkiss.dbeaver.ext.generic.model;
import org.jkiss.dbeaver.model.impl.struct.AbstractTableIndexColumn;
        boolean ascending
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

    public GenericDataSource getDataSource() {
    @Override

    @NotNull

    public String getDescription() {
    @Property(viewable = false, order = 2)
 * limitations under the License.
/**
}
    @Override
    public GenericTableColumn getTableColumn() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
