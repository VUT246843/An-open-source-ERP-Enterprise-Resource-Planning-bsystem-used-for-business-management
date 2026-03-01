    @Override

import java.sql.ResultSet;
        return name;
public class OracleSchedulerJobArgument implements DBSParameter

package org.jkiss.dbeaver.ext.oracle.model;
    private String outArgument;
        return getDataSource().getLocalDataType(type);
        this.position = JDBCUtils.safeGetInt(dbResult, "ARGUMENT_POSITION");
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        return job;

    {
    @Property(viewable = true, order = 16)
    }
/**
    @Property(viewable = true, order = 11)
 * DBeaver - Universal Database Manager
 */
        return value;
        this.value = JDBCUtils.safeGetString(dbResult, "VALUE");

        ResultSet dbResult)


 * limitations under the License.
    }
    @Nullable
    {
    }
    public String getType() {
    public String getName() {
        this.job = job;
import org.jkiss.code.NotNull;
        this.type = JDBCUtils.safeGetString(dbResult, "ARGUMENT_TYPE");
    @Property(viewable = true, order = 12)

}
    @Override
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.jkiss.dbeaver.model.meta.Property;
    private String value;
        return position;
 * OracleSchedulerJobArgument
    {

    }
    public String getOutArgument() {
    }
        this.outArgument = JDBCUtils.safeGetString(dbResult, "OUT_ARGUMENT");

    @Override
import org.jkiss.dbeaver.model.struct.DBSParameter;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return true;
        return job.getDataSource();
    public OracleSchedulerJobArgument(

        OracleSchedulerJob job,
    }
    private int position;
        this.anyDataValue = JDBCUtils.safeGetString(dbResult, "ANYDATA_VALUE");
    private String anyDataValue;
/*
    private String name;
    public String getDescription()
    }
    {

    private final String type;
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
    @Override
    public OracleSchedulerJob getParentObject()
        this.name = JDBCUtils.safeGetString(dbResult, "ARGUMENT_NAME");
        return type;
{
 * Unless required by applicable law or agreed to in writing, software
    @Property(viewable = true, order = 10)

    public boolean isPersisted()
    public DBSTypedObject getParameterType() {
        return anyDataValue;
 *
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
 * You may obtain a copy of the License at
    @NotNull
    @Override
    }
    @Property(viewable = true, order = 14)
    @NotNull
        return null;
    public OracleDataSource getDataSource()

    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getValue() {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public String getAnyDataValue() {

 */
 * See the License for the specific language governing permissions and
    @NotNull
    {
    }
    @Property(viewable = true, order = 15)
    }
    public int getPosition()

        return outArgument;
    private final OracleSchedulerJob job;
 *
 *
