    private DBSProcedureType procedureType;
    private DB2RoutineType(String name, DBSProcedureType procedureType)
 * @author Denis Forveille
import org.jkiss.code.NotNull;

 * Unless required by applicable law or agreed to in writing, software
    F("Function", DBSProcedureType.FUNCTION),

    // -----------------------
    // -----------
    {
    // -----------
    public String toString()
        return name;
    @Override
    }
    // Constructor
 *
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DB2 Routine Type
    }
        this.procedureType = procedureType;
    M("Method", DBSProcedureType.PROCEDURE),
 */
    // Standard Getters



        return name;
    @Override
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
    // Display @Property Value
/*
    {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
}package org.jkiss.dbeaver.ext.db2.model.dict;
 * you may not use this file except in compliance with the License.



 * 
 *
    public String getName()
    @NotNull

 */
 * You may obtain a copy of the License at
    private String name;
    // ----------------
 * DBeaver - Universal Database Manager
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


        this.name = name;
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public DBSProcedureType getProcedureType()
 * limitations under the License.
    }
/**
 * See the License for the specific language governing permissions and
    // -----------------------
public enum DB2RoutineType implements DBPNamedObject {
        return procedureType;
    // ----------------
    P("Procedure", DBSProcedureType.PROCEDURE);
import org.jkiss.dbeaver.model.DBPNamedObject;
