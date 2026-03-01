        return "VIEW";

    @NotNull
        ResultSet dbResult)
        return RelationalObjectType.TYPE_VIEW;
    {
    {
        return true;
        super(catalog, dbResult);
    @Override
    public PostgreView(PostgreSchema catalog)
    @NotNull
import java.sql.ResultSet;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    public List<? extends DBSTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException
import org.jkiss.dbeaver.model.struct.DBSObjectType;
/**
    public DBSObjectType getObjectType() {
/*
    }
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.code.Nullable;
        return null;
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
package org.jkiss.dbeaver.ext.postgresql.model;


 *
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
    public String getName()
{
    @Override
    public PostgreView(
 * DBeaver - Universal Database Manager
    }
    }
 * limitations under the License.
 * PostgreView

public class PostgreView extends PostgreViewBase
    {
import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
    }
        super(catalog);
    @Override

    }

        PostgreSchema catalog,
    @Override
}
 * Unless required by applicable law or agreed to in writing, software
        return super.getName();
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
    {
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
import java.util.List;
    public String getTableTypeName() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
    public boolean isView()
import org.jkiss.dbeaver.model.meta.Property;
    {
