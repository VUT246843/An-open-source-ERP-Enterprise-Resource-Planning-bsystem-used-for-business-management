


    public String getName()
    // Display @Property Value
    }
    U("Typed table", DB2ObjectType.TABLE),
    Z("XSR object", DB2ObjectType.XML_SCHEMA),
 *

    ZZ_4("Application-period temporal table"),
    private DB2ObjectType db2ObjectType;

    G("Global temporary table", DB2ObjectType.TABLE),
    F("Routine", DB2ObjectType.ROUTINE),
        return name;
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * DBeaver - Universal Database Manager
    }
    ZZ_5("Application-period temporal table");

    // Standard Getters
import org.jkiss.dbeaver.model.DBPNamedObject;
 * limitations under the License.


    }
    T("Table", DB2ObjectType.TABLE),
    @Override

    P("Page Size"),

        return db2ObjectType;
    // ----------------
    N("Nickname", DB2ObjectType.NICKNAME),
    n("Database Partiton Group"),
    M("Function Mapping", DB2ObjectType.UDF),
    public static final String FAKE_PREFIX = "ZZ_";
    I("Index", DB2ObjectType.INDEX),




    D("Server"),
        this(name, null);
        this.db2ObjectType = db2ObjectType;


 */
    S("MQT", DB2ObjectType.MQT),

    R("UDT", DB2ObjectType.UDT),
 * Unless required by applicable law or agreed to in writing, software
    V("View", DB2ObjectType.VIEW),
    @NotNull
 * @author Denis Forveille
 * Copyright (C) 2010-2024 DBeaver Corp and others
    u("Module alias", DB2ObjectType.ALIAS),

    {
    }
 * 

    A("Table alias", DB2ObjectType.ALIAS),
    B("Trigger", DB2ObjectType.TRIGGER),
}
    {
 * You may obtain a copy of the License at
    private String name;
/**
    // Constructor
    O("Privilege dependency on all subtables or subviews in a table or view hierarchy"),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
 * See the License for the specific language governing permissions and
    Q("Sequence", DB2ObjectType.SEQUENCE),
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.db2.editors.DB2ObjectType;
 */


import org.jkiss.code.NotNull;
    {

        return name;
    // -----------------------
/*
package org.jkiss.dbeaver.ext.db2.model.dict;

    {

        this.name = name;

public enum DB2PackageDepType implements DBPNamedObject {

    X("Index extension"),


    W("Typed view", DB2ObjectType.VIEW),
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    }
    @Override
    // ----------------

    private DB2PackageDepType(String name, DB2ObjectType db2ObjectType)
 * distributed under the License is distributed on an "AS IS" BASIS,


 * DB2 Type of Package Dependency
    public String toString()
 *
    private DB2PackageDepType(String name)

    // -----------------------
    // -----------

    // -----------
    m("Module", DB2ObjectType.MODULE),


 * you may not use this file except in compliance with the License.
    q("Sequence alias", DB2ObjectType.ALIAS),
    v("Global variable", DB2ObjectType.VARIABLE),

    public DB2ObjectType getDb2ObjectType()
