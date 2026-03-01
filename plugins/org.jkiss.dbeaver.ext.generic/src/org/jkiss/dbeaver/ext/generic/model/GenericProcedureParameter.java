        super(
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.remarks = remarks;
            valueType,
    }
        return parameterKind;
        return procedure.getDataSource();
    private final GenericProcedure procedure;
            notNull,
}
 * You may obtain a copy of the License at
    @Override
/**
    @Nullable
    }
    public GenericProcedure getParentObject() {
    @Override
 *
            ordinalPosition,
        return remarks;
package org.jkiss.dbeaver.ext.generic.model;
/*
        int ordinalPosition,
        boolean notNull,
            columnSize,

    @NotNull
        String columnName,
 *     http://www.apache.org/licenses/LICENSE-2.0
            false
 * you may not use this file except in compliance with the License.
 *
    }
 * Unless required by applicable law or agreed to in writing, software
            scale,
 * DBeaver - Universal Database Manager
    @Override
    }
        return procedure;
        int valueType,
    public DBSTypedObject getParameterType() {
 * GenericTable
 *
        this.procedure = procedure;
        @NotNull GenericProcedure procedure,
        String remarks,
        Integer precision,
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.parameterKind = parameterKind;
    public GenericDataSource getDataSource() {

import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
    }
            columnName,
    public DBSProcedureParameterKind getParameterKind() {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
 * See the License for the specific language governing permissions and
    private final DBSProcedureParameterKind parameterKind;
public class GenericProcedureParameter extends JDBCAttribute implements DBSProcedureParameter {
        String typeName,
        );
    public GenericProcedureParameter(

 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
            typeName,
    @Override
    @NotNull
 * limitations under the License.
import org.jkiss.dbeaver.model.meta.Property;
    ) {
        int columnSize,

 */
    @NotNull
    @Property(viewable = true, order = 30)
    public String getDescription() {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        @NotNull DBSProcedureParameterKind parameterKind

        return this;
            precision,
    private final String remarks;

    }
    @Override

        Integer scale,
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCAttribute;

