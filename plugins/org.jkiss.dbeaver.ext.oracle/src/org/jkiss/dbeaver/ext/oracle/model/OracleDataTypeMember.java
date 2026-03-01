 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
public abstract class OracleDataTypeMember implements DBSEntityElement
    {


    public OracleDataType getOwnerType()
 * Licensed under the Apache License, Version 2.0 (the "License");

    {

    protected String name;
    @Override

    }
    {
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
import org.jkiss.code.Nullable;
        this.ownerType = ownerType;
    protected OracleDataTypeMember(OracleDataType ownerType, ResultSet dbResult)
 */
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
    @Property(viewable = true, order = 20)
    private boolean inherited;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Oracle data type member
        return number;
    {
    @Override
        this.ownerType = ownerType;
/*
 * You may obtain a copy of the License at
        this.persisted = true;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.oracle.model;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        return inherited;
    @NotNull
    }

    public String getDescription()
        return ownerType;
import org.jkiss.code.NotNull;
        return null;
        return ownerType;
        return name;

    public OracleDataSource getDataSource()
{
    {
import org.jkiss.dbeaver.Log;
    public int getNumber()
    }
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
import java.sql.ResultSet;
        this.inherited = JDBCUtils.safeGetBoolean(dbResult, "INHERITED", OracleConstants.YES);
 *

    @NotNull
    @NotNull
    {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    protected OracleDataTypeMember(OracleDataType ownerType)
    @NotNull
    @Override
 * DBeaver - Universal Database Manager
    public boolean isPersisted()
    @Override
import org.jkiss.dbeaver.model.meta.Property;


    {
 *
        return persisted;
    {

    }
/**
    private OracleDataType ownerType;
 * limitations under the License.
    public boolean isInherited()
    }
}
    public String getName()
 * you may not use this file except in compliance with the License.
    private boolean persisted;
    protected int number;
import org.jkiss.dbeaver.model.struct.DBSEntityElement;
    }
 */

    }
        return ownerType.getDataSource();

    }
    {
    }
        this.persisted = false;
    }


    {
    public OracleDataType getParentObject()
    private static final Log log = Log.getLog(OracleDataTypeMember.class);
