    // -----------------------
        return name;
    {

 * you may not use this file except in compliance with the License.

    {
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
    public static DBSEntityConstraintType getConstraintType(String code)

    }
 * DB2 Type of Constraints
    // -----------------------
    }
        this.type = type;
} * See the License for the specific language governing permissions and

 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 */
 * @author Denis Forveille
    I("Functional dependency", DBSEntityConstraintType.ASSOCIATION),
        this.name = name;
        return type;
    // ----------------
public enum DB2ConstraintType implements DBPNamedObject {
    {
    @Override
    }
    }
    // Helpers
    F("Foreign key", DBSEntityConstraintType.FOREIGN_KEY),
    private DB2ConstraintType(String name, DBSEntityConstraintType type)
    K("Check", DBSEntityConstraintType.CHECK),
    @Override
        return name;
    private DBSEntityConstraintType type;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
 */

 * Copyright (C) 2010-2024 DBeaver Corp and others

    // -----------
    // -----------
    {
 * limitations under the License.
    // -----------

        return DB2ConstraintType.valueOf(code).getType();
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ext.db2.model.dict;
    {

 * DBeaver - Universal Database Manager
    private String name;
    public String getName()

    public String toString()
    // ----------------
 *     http://www.apache.org/licenses/LICENSE-2.0
    // -----------


 * Unless required by applicable law or agreed to in writing, software
    @NotNull
    // Standard Getters
    P("Primary key", DBSEntityConstraintType.PRIMARY_KEY),

    // Constructor
 * 
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    U("Unique", DBSEntityConstraintType.UNIQUE_KEY);
import org.jkiss.dbeaver.model.DBPNamedObject;
 *
import org.jkiss.code.NotNull;
    public DBSEntityConstraintType getType()
    // Display @Property Value
 *
