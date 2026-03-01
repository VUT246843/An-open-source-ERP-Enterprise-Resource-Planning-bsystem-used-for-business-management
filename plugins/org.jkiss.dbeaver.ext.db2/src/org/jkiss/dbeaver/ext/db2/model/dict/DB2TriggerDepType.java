    public String toString()
    S("MQT", DB2ObjectType.MQT),
 * 
 *
    {
    X("Index extension"),


 *
    V("View", DB2ObjectType.VIEW),
    u("Module alias", DB2ObjectType.ALIAS),
    // -----------------------

    F("Routine", DB2ObjectType.ROUTINE),
import org.jkiss.dbeaver.model.DBPNamedObject;
    }
    q("Sequence alias", DB2ObjectType.ALIAS),

    }
import org.jkiss.dbeaver.ext.db2.editors.DB2ObjectType;
    Q("Sequence", DB2ObjectType.SEQUENCE),
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return name;
 */
    private String        name;
    // Display @Property Value



 * distributed under the License is distributed on an "AS IS" BASIS,


 * DBeaver - Universal Database Manager

    T("Table", DB2ObjectType.TABLE),
 * Copyright (C) 2013-2016 Denis Forveille (titou10.titou10@gmail.com)

 */
public enum DB2TriggerDepType implements DBPNamedObject {

    K("Package", DB2ObjectType.PACKAGE),
    private DB2TriggerDepType(String description)
    }

    R("UDT", DB2ObjectType.UDT),
    public DB2ObjectType getDb2ObjectType()
    {
    // -----------------------


    // Standard Getters
 * @author Denis Forveille
    {
import org.jkiss.code.NotNull;
        this(description, null);
    A("Table alias", DB2ObjectType.ALIAS),
    // -----------

    @Override

    G("Global temporary table", DB2ObjectType.TABLE),


/**

 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
    private DB2TriggerDepType(String name, DB2ObjectType db2ObjectType)
        return name;



    m("Module", DB2ObjectType.MODULE),
    B("Trigger", DB2ObjectType.TRIGGER),
    I("Index", DB2ObjectType.INDEX),
    v("Global variable", DB2ObjectType.VARIABLE);

    H("Hierachy table", DB2ObjectType.TABLE),

 *
    public String getName()
 * You may obtain a copy of the License at
    {
    // ----------------

 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.db2.model.dict;
    N("Nickname", DB2ObjectType.NICKNAME),
    C("Column", DB2ObjectType.COLUMN),
        return db2ObjectType;
    }

    // -----------
}
    // Constructor
 * you may not use this file except in compliance with the License.

    W("Typed view", DB2ObjectType.VIEW),
    {
    L("Detached table", DB2ObjectType.TABLE),
    // ----------------
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    Z("XSR object", DB2ObjectType.XML_SCHEMA),
        this.name = name;
    private DB2ObjectType db2ObjectType;

 * DB2 Type of Trigger Dependency
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
 * limitations under the License.
    @Override
    }
        this.db2ObjectType = db2ObjectType;
    U("Typed table", DB2ObjectType.TABLE),



/*

    O("Privilege dependency on all subtables or subviews in a table or view hierarchy"),
