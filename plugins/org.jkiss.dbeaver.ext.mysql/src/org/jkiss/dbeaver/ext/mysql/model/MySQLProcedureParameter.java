    {
    public DBSProcedureParameterKind getParameterKind()

            false);
            columnSize,
            int valueType,
            Integer scale,
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;

        this.procedure = procedure;
        return procedure;
            long columnSize,
        this.parameterKind = parameterKind;
/**
            int ordinalPosition,
    public MySQLDataSource getDataSource()
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Property(viewable = true, order = 10)
 *
            DBSProcedureParameterKind parameterKind)
    @Override
public class MySQLProcedureParameter extends JDBCAttribute implements DBSProcedureParameter, DBSTypedObject

 * See the License for the specific language governing permissions and
            String typeName,
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    @NotNull
            notNull,
 */
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCAttribute;
    private DBSProcedureParameterKind parameterKind;
    {
            scale,
            ordinalPosition,

    }
}
    @Override
 * DBeaver - Universal Database Manager
            valueType,
    }
            Integer precision,
    @NotNull
    }
 * you may not use this file except in compliance with the License.
        return this;
 */
            String columnName,
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
{
            MySQLProcedure procedure,
import org.jkiss.code.NotNull;
    public MySQLProcedureParameter(
    }
/*
    private MySQLProcedure procedure;

        super(columnName,

package org.jkiss.dbeaver.ext.mysql.model;
import org.jkiss.dbeaver.model.meta.Property;
 *     http://www.apache.org/licenses/LICENSE-2.0
        return parameterKind;
 * Unless required by applicable law or agreed to in writing, software
            typeName,
    {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;

        return procedure.getDataSource();
    public DBSTypedObject getParameterType() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    }
 * MySQLProcedureParameter
    public MySQLProcedure getParentObject()
            precision,
    @NotNull
            boolean notNull,
