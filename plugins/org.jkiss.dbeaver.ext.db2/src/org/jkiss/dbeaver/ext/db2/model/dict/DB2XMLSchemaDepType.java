 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.ext.db2.editors.DB2ObjectType;

 * limitations under the License.

package org.jkiss.dbeaver.ext.db2.model.dict;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    // -----------
    W("Typed view", DB2ObjectType.VIEW),

    F("Routine", DB2ObjectType.ROUTINE),
    A("Table alias", DB2ObjectType.ALIAS),

    q("Sequence alias", DB2ObjectType.ALIAS),
    private String        name;
    // Constructor
    public String getName()

    // -----------


    I("Index", DB2ObjectType.INDEX),
    // -----------------------
    v("Global variable", DB2ObjectType.VARIABLE);
    L("Detached table", DB2ObjectType.TABLE),
import org.jkiss.dbeaver.model.DBPNamedObject;
    public String toString()
 * 
    @Override
 * Unless required by applicable law or agreed to in writing, software
        return name;

 * DB2 Type of XML Schema Dependency
    private DB2XMLSchemaDepType(String name, DB2ObjectType db2ObjectType)
    {
    public DB2ObjectType getDb2ObjectType()
        this(name, null);
    // Standard Getters
    X("Index extension"),
/**
    U("Typed table", DB2ObjectType.TABLE),
        this.name = name;

    K("Package", DB2ObjectType.PACKAGE),

    // -----------------------

    {

    S("MQT", DB2ObjectType.MQT),

        this.db2ObjectType = db2ObjectType;

 * distributed under the License is distributed on an "AS IS" BASIS,

 *
 * Copyright (C) 2013-2016 Denis Forveille (titou10.titou10@gmail.com)

    m("Module", DB2ObjectType.MODULE),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // ----------------
 * See the License for the specific language governing permissions and
    V("View", DB2ObjectType.VIEW),
    private DB2XMLSchemaDepType(String name)
    {
 */




 *

 *     http://www.apache.org/licenses/LICENSE-2.0
    }


    {
    }
    // Display @Property Value




    }
    B("Trigger", DB2ObjectType.TRIGGER),
    C("Column", DB2ObjectType.COLUMN),


    Q("Sequence", DB2ObjectType.SEQUENCE),
    // ----------------
    N("Nickname", DB2ObjectType.NICKNAME),
    }
    R("UDT", DB2ObjectType.UDT),
    @NotNull

public enum DB2XMLSchemaDepType implements DBPNamedObject {
 * you may not use this file except in compliance with the License.
    {
    u("Module alias", DB2ObjectType.ALIAS),
}
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
        return db2ObjectType;
    private DB2ObjectType db2ObjectType;
    Z("XSR object", DB2ObjectType.XML_SCHEMA),
    H("Hierachy table", DB2ObjectType.TABLE),
        return name;
    O("Privilege dependency on all subtables or subviews in a table or view hierarchy"),
/*
 */


 *
    }
    @Override
    T("Table", DB2ObjectType.TABLE),
    G("Global temporary table", DB2ObjectType.TABLE),
 * @author Denis Forveille
