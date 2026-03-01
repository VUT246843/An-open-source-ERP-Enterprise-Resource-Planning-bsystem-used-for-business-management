            case "INOUT":
    @Override
    @Property(viewable = true, order = 5)
    }
        return comment;
    @Property(viewable = true, order = 3)
        this.comment = comment;

        return dataType;
 * limitations under the License.
import org.jkiss.code.Nullable;
/*
    @Override
    @Override
        this.procedure = procedure;
 * DBeaver - Universal Database Manager
 *
import org.jkiss.dbeaver.model.meta.Property;
    private String argName;
                return DBSProcedureParameterKind.INOUT;
    }
    @Property(viewable = true, order = 1)
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
            default:

    @NotNull
    }
    @Nullable
public class CubridProcedureParameter implements DBSProcedureParameter {
    @Override
    private CubridProcedure procedure;
        this.dataType = dataType;
    @Nullable
package org.jkiss.dbeaver.ext.cubrid.model;
        return argName;
    private String mode;
    }

            case "OUT":
    public DBSProcedureParameterKind getParameterKind() {
    public CubridProcedureParameter(
        return procedure.getDataSource();
    @Property(viewable = true, order = 4)

    @NotNull
    @Override

    public String getDescription() {
 *
        return (DBSTypedObject) this;
    @NotNull
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    }
    private String dataType;
}
    @Override
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
    }
    public String getDataType() {
            @NotNull String mode,
    public String getName() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable

    public boolean isPersisted() {

 * Copyright (C) 2010-2024 DBeaver Corp and others
    @NotNull
        return true;
    public CubridProcedure getParentObject() {
    @NotNull
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
    }
        this.mode = mode;
    public DBSTypedObject getParameterType() {
        return procedure;
        switch (mode) {
            case "IN":
        }
    }
 */

            @NotNull String dataType,
 *


    @Override
                return DBSProcedureParameterKind.IN;
            @Nullable String comment) {
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
                return DBSProcedureParameterKind.UNKNOWN;
            @NotNull String argName,
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPDataSource;
                return DBSProcedureParameterKind.OUT;
    public DBPDataSource getDataSource() {
            @NotNull CubridProcedure procedure,
    private String comment;
 * See the License for the specific language governing permissions and
        this.argName = argName;
