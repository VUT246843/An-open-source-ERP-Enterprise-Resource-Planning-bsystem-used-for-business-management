    }
    A("Alias", DB2ObjectType.ALIAS),

}            for (DB2TableType db2TableType : values()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DB2 Table Type
 *

 */
    // ----------------
 * See the License for the specific language governing permissions and
    // Display @Property Value
        return inClause;
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
    @NotNull
                sb.deleteCharAt(sb.length() - 1);

    // Standard Getters
    {

        String inClause = IN_CLAUSE_CACHE.get(objectType);
    U("Inoperative", DB2ObjectType.TABLE),



    }
 * Unless required by applicable law or agreed to in writing, software

    private DB2ObjectType                           db2ObjectType;
 * Licensed under the Apache License, Version 2.0 (the "License");
public enum DB2TableType implements DBPNamedObject {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2013-2016 Denis Forveille (titou10.titou10@gmail.com)
                inClause = sb.toString();
    G("Created temporary table", DB2ObjectType.TABLE),
            StringBuilder sb = new StringBuilder(128);
    // -----------------------
    public String getName()
import java.util.Map;
import java.util.HashMap;

    }

        }
    {
 * You may obtain a copy of the License at
 *
                if (db2TableType.getDb2ObjectType() == objectType) {
    L("Detached table", DB2ObjectType.TABLE),

 * you may not use this file except in compliance with the License.
    public String toString()
import org.jkiss.dbeaver.ext.db2.editors.DB2ObjectType;
 */
    // -----------------
                    sb.append("'").append(db2TableType.name()).append("'");
            inClause = "()";
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPNamedObject;
                sb.append(")");
    S("Materialized Query Table", DB2ObjectType.MQT),
 * limitations under the License.
    public static String getInClause(DB2ObjectType objectType)
 *
    }
            // Remove last "," eventually
        return db2ObjectType;
 * Copyright (C) 2010-2024 DBeaver Corp and others


            if (sb.length() > 0) {
    // ----------------
    N("Nickname", DB2ObjectType.NICKNAME),
        return description;

    {
        if (inClause == null) {
    T("Table (untyped)", DB2ObjectType.TABLE),
    V("View (untyped)", DB2ObjectType.VIEW),
    @Override

        this.description = description;
            IN_CLAUSE_CACHE.put(objectType, inClause);
    {
            }

    private DB2TableType(String description, DB2ObjectType db2ObjectType)

package org.jkiss.dbeaver.ext.db2.model.dict;
    @Override
        this.db2ObjectType = db2ObjectType;
        return description; // DF: yes strange getter..
            }
                }
                    sb.append(",");
 * @author Denis Forveille
    {
 * 
    public DB2ObjectType getDb2ObjectType()
 * DBeaver - Universal Database Manager
    private static final Map<DB2ObjectType, String> IN_CLAUSE_CACHE = new HashMap<>();
    // -----------------

    H("Hierarchy table", DB2ObjectType.TABLE),
    W("Typed view", DB2ObjectType.VIEW);
/**
            sb.append("(");
    }
    // -----------------------


    private String                                  description;
    // Constructor
