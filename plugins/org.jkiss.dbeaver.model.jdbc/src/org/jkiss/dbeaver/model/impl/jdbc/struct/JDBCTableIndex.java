
import org.jkiss.dbeaver.model.DBPNamedObject;
     * <p>
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.table = table;
     * This method provides display name for all columns of an index without the need to expand it in the UI.
        this.persisted = persisted;
    // Copy constructor
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
    @Override
    }
            .collect(Collectors.joining(", "));
    protected String name;
        this.indexType = indexType;
    public String getName() {
    }
    public CONTAINER getContainer() {
    public DBSIndexType getIndexType() {
        this.table = table;
    public String getTableColumn(@NotNull DBRProgressMonitor monitor) throws DBException {

    public void setIndexType(DBSIndexType indexType) {
    public void setName(@NotNull String indexName) {
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        return table;
 *
        return table;
    @Property(viewable = true, order = 1)
    }
import org.jkiss.dbeaver.model.DBPNamedObject2;
        this.container = source.container;
import org.jkiss.dbeaver.model.impl.struct.AbstractTableIndex;
import org.jkiss.dbeaver.model.DBPSaveableObject;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndexColumn;

    @Override
        this.persisted = source.persisted;
        this.indexType = source.getIndexType();
    }
     */
}


        return this.indexType;
    @Override
        this.name = indexName;
     * @deprecated This method is not a part of the public API
    }
    @Property(viewable = true, order = 3)
        return CommonUtils.safeList(getAttributeReferences(monitor)).stream()
    @NotNull
import java.util.stream.Collectors;
import org.jkiss.code.Nullable;
    protected JDBCTableIndex(CONTAINER container, TABLE table, DBSTableIndex source, boolean persisted) {
    }
        return name;
        this.container = container;
import org.jkiss.dbeaver.model.meta.Property;
{
    public TABLE getTable() {
        return persisted;

        this.persisted = persisted;
    @NotNull

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


        this.name = source.name;
 * See the License for the specific language governing permissions and
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
    }
import org.jkiss.utils.CommonUtils;

 * Unless required by applicable law or agreed to in writing, software
 *
/**
        this.indexType = source.indexType;
package org.jkiss.dbeaver.model.impl.jdbc.struct;
 * you may not use this file except in compliance with the License.
    @Override
    extends AbstractTableIndex implements DBPNamedObject2, DBPSaveableObject
 * DBeaver - Universal Database Manager
    public void setPersisted(boolean persisted) {
        return container;
        this.indexType = indexType;
    }
/*
    }
public abstract class JDBCTableIndex<CONTAINER extends DBSObjectContainer, TABLE extends JDBCTable>

 * JDBC abstract index

    }
        this.container = container;
    public boolean isPersisted() {

            .map(DBPNamedObject::getName)

 */
    private boolean persisted;
    /**
import org.jkiss.dbeaver.DBException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
    protected JDBCTableIndex(JDBCTableIndex<CONTAINER, TABLE> source) {
 */
    private final CONTAINER container;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
        this.name = source.getName();
        this.persisted = persisted;
     *
     * Its name must match the {@link DBSTableIndexColumn#getTableColumn()}.

import org.jkiss.code.NotNull;
        this.name = name;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
    @Override
    @Override
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    protected JDBCTableIndex(CONTAINER container, TABLE table, String name, @Nullable DBSIndexType indexType, boolean persisted) {
    @Property(viewable = true, order = 2)
 *
    public TABLE getParentObject() {
        this.table = source.table;
    }
 * You may obtain a copy of the License at
    protected DBSIndexType indexType;
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;

    private final TABLE table;
