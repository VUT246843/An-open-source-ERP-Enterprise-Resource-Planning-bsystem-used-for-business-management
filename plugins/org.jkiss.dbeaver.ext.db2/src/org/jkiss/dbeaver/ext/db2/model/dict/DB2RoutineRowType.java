        return name;
        return parameterKind;
package org.jkiss.dbeaver.ext.db2.model.dict;
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
    // Display @Property Value
 * 
    // ----------------
    private String                    name;

    // Constructor
    {
    @NotNull
 * See the License for the specific language governing permissions and
        return name;
    R("Result before casting", DBSProcedureParameterKind.RETURN),
public enum DB2RoutineRowType implements DBPNamedObject {
}
 * @author Denis Forveille
    @Override
        this.parameterKind = parameterKind;
    // -----------
 *
    DB2RoutineRowType(String name, DBSProcedureParameterKind parameterKind)
    // -----------------------
    // Standard Getters
    O("Output parameter", DBSProcedureParameterKind.OUT),
    C("Result after casting", DBSProcedureParameterKind.RETURN),
 *
    public String toString()

 * Copyright (C) 2013-2016 Denis Forveille (titou10.titou10@gmail.com)

    {
    }
    B("Both input and output parameter", DBSProcedureParameterKind.INOUT),
    }
    private DBSProcedureParameterKind parameterKind;
    {
    public String getName()

 */
import org.jkiss.dbeaver.model.DBPNamedObject;
    // -----------
 *
 * distributed under the License is distributed on an "AS IS" BASIS,


/*
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
    }
 * limitations under the License.
/**
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * Licensed under the Apache License, Version 2.0 (the "License");
    P("Input parameter", DBSProcedureParameterKind.IN),
 * You may obtain a copy of the License at
    // ----------------

    @Override

 * DB2 Routine Row Type
 * DBeaver - Universal Database Manager
        this.name = name;
    public DBSProcedureParameterKind getParameterKind()
    }
 * you may not use this file except in compliance with the License.

    // -----------------------
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.code.NotNull;
 */

    S("Aggregation state variable", DBSProcedureParameterKind.UNKNOWN);

