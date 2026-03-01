

 *
    private DB2ObjectType db2ObjectType;

 * DB2 Type of Table Dependency
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
    O("Privilege dependency on all subtables or subviews in a table or view hierarchy"),
 *

    @NotNull

        this(description, null);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    N("Nickname", DB2ObjectType.NICKNAME),
    public DB2ObjectType getDb2ObjectType()
 * limitations under the License.

    // Display @Property Value
package org.jkiss.dbeaver.ext.db2.model.dict;
 * @author Denis Forveille

 * Unless required by applicable law or agreed to in writing, software
    W("Typed view", DB2ObjectType.VIEW),
    private DB2TableDepType(String description)

    // ----------------




    Z("XSR object", DB2ObjectType.XML_SCHEMA),
        return name;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    U("Typed table", DB2ObjectType.TABLE),
    public String getName()
    @Override

    // ----------------
    S("MQT", DB2ObjectType.MQT),
        return db2ObjectType;
 *
    T("Table", DB2ObjectType.TABLE),
 */
    v("Global variable", DB2ObjectType.VARIABLE);

    // Constructor
    A("Table alias", DB2ObjectType.ALIAS),
}
    }
 * you may not use this file except in compliance with the License.
    }
    m("Module", DB2ObjectType.MODULE),

        this.name = name;
import org.jkiss.dbeaver.model.DBPNamedObject;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    // Standard Getters

    I("Index", DB2ObjectType.INDEX),
    R("UDT", DB2ObjectType.UDT),

    }
    G("Global temporary table", DB2ObjectType.TABLE),
 */
        return name;
    // -----------
    {
    // -----------------------
    u("Module alias", DB2ObjectType.ALIAS),
    private DB2TableDepType(String name, DB2ObjectType db2ObjectType)

 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
    V("View", DB2ObjectType.VIEW),
        this.db2ObjectType = db2ObjectType;
    {



    }

    // -----------
 * Copyright (C) 2013-2016 Denis Forveille (titou10.titou10@gmail.com)
    private String        name;
    @Override
    public String toString()
/*
    {
    {
 * 

    F("Routine", DB2ObjectType.ROUTINE),
public enum DB2TableDepType implements DBPNamedObject {

    }
    {

import org.jkiss.dbeaver.ext.db2.editors.DB2ObjectType;
    // -----------------------
