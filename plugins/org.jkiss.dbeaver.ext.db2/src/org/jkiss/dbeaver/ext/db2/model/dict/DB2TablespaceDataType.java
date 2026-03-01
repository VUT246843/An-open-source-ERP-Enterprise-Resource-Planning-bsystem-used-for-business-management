
    // Standard Getters
        return name;
package org.jkiss.dbeaver.ext.db2.model.dict;
 *
    T("System temporary tables only", false),
 * limitations under the License.

} * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    A("Regular", true),
    // -----------------
    {
    // ----------------
    // Display @Property Value
    private String name;
    }
        this.validForUserTables = validForUserTables;
    {
 * You may obtain a copy of the License at

    // Constructor
 *

    }
 */
    // -----------------------
    L("Large", true),
 * Licensed under the Apache License, Version 2.0 (the "License");
    private Boolean validForUserTables;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
 *

 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * Type of data that can be stored in a DB2 Tablespace
import org.jkiss.code.NotNull;
/*
 * DBeaver - Universal Database Manager

        return validForUserTables;
    {
import org.jkiss.dbeaver.model.DBPNamedObject;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
/**
    public Boolean isValidForUserTables()

 * Unless required by applicable law or agreed to in writing, software
 * 
    @NotNull
    // -----------------
 */

    }
    @Override

    // ----------------
 *     http://www.apache.org/licenses/LICENSE-2.0
 * @author Denis Forveille
        return name;
        this.name = name;
    U("Created temporary tables or declared temporary tables only", false);
    private DB2TablespaceDataType(String name, Boolean validForUserTables)
    public String toString()
    @Override
    // -----------------------
    public String getName()
public enum DB2TablespaceDataType implements DBPNamedObject {
 * you may not use this file except in compliance with the License.

