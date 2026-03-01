 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0

    {
        this.defaultAnyDataValue = JDBCUtils.safeGetString(dbResult, "DEFAULT_ANYDATA_VALUE");

        return true;
    {
        return defaultValue;
        return metadataAttribute;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
 * OracleSchedulerProgramArgument

        return name;
    }
import org.jkiss.code.NotNull;
        return defaultAnyDataValue;
    @Property(viewable = true, order = 13)
        return outArgument;
        this.program = program;

package org.jkiss.dbeaver.ext.oracle.model;
        ResultSet dbResult)

    {
    }
    @NotNull
    private String defaultValue;
public class OracleSchedulerProgramArgument implements DBSParameter
    }
    public String getDefaultAnyDataValue() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getDefaultValue() {
    }
    private String outArgument;

    }
 */
    @Override
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    public DBSTypedObject getParameterType() {
    }
    private final OracleSchedulerProgram program;
        OracleSchedulerProgram program,
        this.metadataAttribute = JDBCUtils.safeGetString(dbResult, "METADATA_ATTRIBUTE");

        return program;
 * You may obtain a copy of the License at

    private String name;
    public boolean isPersisted()
import java.sql.ResultSet;
import org.jkiss.dbeaver.model.struct.DBSParameter;
    }
    @Property(viewable = true, order = 11)
    @Override
    public String getDescription()
        return type;
    @Override
    @Override
    public String getOutArgument() {
    @Property(viewable = true, order = 16)



        return getDataSource().getLocalDataType(type);
    }
import org.jkiss.code.Nullable;
        return null;
    }
    @Property(viewable = true, order = 14)

 */
 * Unless required by applicable law or agreed to in writing, software

 * limitations under the License.
    {
    public String getType() {
        this.outArgument = JDBCUtils.safeGetString(dbResult, "OUT_ARGUMENT");
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        this.type = JDBCUtils.safeGetString(dbResult, "ARGUMENT_TYPE");
        this.name = JDBCUtils.safeGetString(dbResult, "ARGUMENT_NAME");
/*
    private String defaultAnyDataValue;

    private String metadataAttribute;
 *
{
    @NotNull
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
        return program.getDataSource();
    }
import org.jkiss.dbeaver.model.meta.Property;
 * you may not use this file except in compliance with the License.
    public String getName() {
    @Nullable
    public String getMetadataAttribute() {
    @Property(viewable = true, order = 10)
/**
    @Property(viewable = true, order = 15)
    @Property(viewable = true, order = 12)
        this.position = JDBCUtils.safeGetInt(dbResult, "ARGUMENT_POSITION");

    }
}
    @Override

        return position;
    private int position;
    @NotNull
        this.defaultValue = JDBCUtils.safeGetString(dbResult, "DEFAULT_VALUE");
    private final String type;
    {
    public OracleSchedulerProgram getParentObject()
 * DBeaver - Universal Database Manager
    @Override
    public int getPosition()
    public OracleSchedulerProgramArgument(
    public OracleDataSource getDataSource()
    {
