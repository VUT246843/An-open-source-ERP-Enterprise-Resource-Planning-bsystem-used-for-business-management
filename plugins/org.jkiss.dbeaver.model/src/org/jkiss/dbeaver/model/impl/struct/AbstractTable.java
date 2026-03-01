    public String toString()
    @Override
    protected AbstractTable(CONTAINER container, DBSEntity source)
 *
}
    DATASOURCE extends DBPDataSource,
    @Override
    }
    @Override
    protected AbstractTable(CONTAINER container, String tableName)
import org.jkiss.dbeaver.model.meta.Property;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */

    }
        return true;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    {
    {
import org.jkiss.dbeaver.model.DBUtils;

package org.jkiss.dbeaver.model.impl.struct;
import org.jkiss.dbeaver.model.DBPNamedObject2;
import org.jkiss.dbeaver.model.struct.DBSEntityType;
    @Override
        return tableName;
 * DBeaver - Universal Database Manager
    public CONTAINER getParentObject()

        this.tableName = tableName;
import org.jkiss.dbeaver.model.struct.rdb.DBSTrigger;
import org.jkiss.dbeaver.model.DBPDataSource;
    public List<? extends DBSTrigger> getTriggers(@NotNull DBRProgressMonitor monitor) throws DBException {
    protected AbstractTable(CONTAINER container)
    {

        this.container = container;
/**

import org.jkiss.dbeaver.model.struct.DBSObject;
        return (DATASOURCE) container.getDataSource();
        this(container);
 * See the License for the specific language governing permissions and
        return container;
    }
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
    @Override
    @NotNull
 * You may obtain a copy of the License at
    // Copy constructor
 * limitations under the License.
import org.jkiss.code.NotNull;
    }
    CONTAINER extends DBSObject>
 * AbstractTable
    private String tableName;
{
    {
    private CONTAINER container;
    {
    public CONTAINER getContainer()
    {
        this.tableName = tableName;
    public DATASOURCE getDataSource()
        this.tableName = "";
    public String getName()
    }
    implements DBSTable, DBPNamedObject2
    @Property(viewable = true, editable = true, order = 1)
    public DBSEntityType getEntityType()
        return getFullyQualifiedName(DBPEvaluationContext.UI);
 *
    @NotNull
    {
    {
/*
 * you may not use this file except in compliance with the License.
    public void setName(@NotNull String tableName)
    @NotNull
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import java.util.List;

import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * distributed under the License is distributed on an "AS IS" BASIS,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isPersisted()

        return DBUtils.isView(this) ? DBSEntityType.VIEW : DBSEntityType.TABLE;
    {
        return null;
        this(container);
 *
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 */


    }
    {
    }
    @Override
public abstract class AbstractTable<
    }
    @SuppressWarnings("unchecked")
    }
    }
 * Unless required by applicable law or agreed to in writing, software
    }
    @Override

        return container;

import org.jkiss.dbeaver.model.struct.DBSEntity;
    @Nullable

        this.tableName = source.getName();
