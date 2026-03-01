    public boolean isPersisted()
            monitor,
        this.name = JDBCUtils.safeGetString(dbResult, "PARAM_NAME");

    public DBSObject getParentObject()
    @NotNull
    }
    public OracleParameterMode getMode()
    {
    }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
package org.jkiss.dbeaver.ext.oracle.model;
 *
 * you may not use this file except in compliance with the License.

            JDBCUtils.safeGetString(dbResult, "PARAM_TYPE_OWNER"),


        return type;
 */
    private OracleDataTypeModifier typeMod;

        return type;
    }
        return name;
            JDBCUtils.safeGetString(dbResult, "PARAM_TYPE_MOD"));
    @NotNull
    {
public class OracleDataTypeMethodParameter implements DBSParameter {
import org.jkiss.code.Nullable;
    public OracleDataTypeModifier getTypeMod()
        return number;
 * Licensed under the Apache License, Version 2.0 (the "License");

    {

        return true;
    private OracleDataType type;
    {
/*
    {
    }
 * Oracle data type attribute
    }
        this.mode = OracleParameterMode.getMode(JDBCUtils.safeGetString(dbResult, "PARAM_MODE"));
 * limitations under the License.
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
    public DBPDataSource getDataSource()
import org.jkiss.code.NotNull;
import java.sql.ResultSet;
    {

    {
        this.method = method;
        return null;

    }
    public DBSTypedObject getParameterType() {

        return method.getDataSource();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public OracleDataType getType()
    private String name;
    public String getName()
    @Property(viewable = true, order = 2)
            method.getDataSource(),
 * Unless required by applicable law or agreed to in writing, software
    @Override
    @Override
    {
import org.jkiss.dbeaver.model.struct.DBSParameter;
    @Override

    public String getDescription()
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            JDBCUtils.safeGetString(dbResult, "PARAM_TYPE_NAME"));
    @Override
    @Property(viewable = true, order = 3)
        this.typeMod = OracleDataTypeModifier.resolveTypeModifier(
    @Override
    @NotNull
/**
    @Nullable
import org.jkiss.dbeaver.model.meta.Property;
    }

    private int number;
import org.jkiss.dbeaver.model.DBPDataSource;
    public OracleDataTypeMethodParameter(DBRProgressMonitor monitor, OracleDataTypeMethod method, ResultSet dbResult)

    }
        return method;

 */
        return mode;
    @Property(id = "dataType", viewable = true, order = 4)
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 *
 * See the License for the specific language governing permissions and
    public int getNumber()
 *
    @Property(viewable = true, order = 1)
    private final OracleDataTypeMethod method;
}

 * You may obtain a copy of the License at
    @Override
        this.number = JDBCUtils.safeGetInt(dbResult, "PARAM_NO");
import org.jkiss.dbeaver.model.struct.DBSObject;
        return typeMod;
    @Property(id = "dataTypeMod", viewable = true, order = 5)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private OracleParameterMode mode;
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        this.type = OracleDataType.resolveDataType(
 * DBeaver - Universal Database Manager
