        return name;
 * DB2 "Precision" of the Sequence
 * you may not use this file except in compliance with the License.
    // Display @Property Value
    // Standard Getters
    public String getName()
        return dataType;
 *
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        this.dataType = dataType;
        return sqlKeyword;
 *     http://www.apache.org/licenses/LICENSE-2.0
    // Helpers

 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
    {
 * Licensed under the Apache License, Version 2.0 (the "License");

    P5("Smallint", 5, "SMALLINT"),
        }
    // ------------------------
    }
        return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public Integer getDataType()
 * 
    }
/*

    }


 * You may obtain a copy of the License at
}    private Integer dataType;

    @Override
        return name;
 */
 *
    P10("Integer", 10, "INTEGER"),

import org.jkiss.dbeaver.model.DBPNamedObject;
            if (dataType.equals(item.getDataType())) {
    // ----------------
    public static DB2SequencePrecision getFromDataType(Integer dataType)

    {
    // -----------------------

 * <p/>
    }

    {
    private DB2SequencePrecision(String name, Integer dataType, String sqlKeyword)
 * @author Denis Forveille
    public String toString()
    // -----------------------
    // Constructor
    }
    // ------------------------

                return item;
        this.name = name;
 * limitations under the License.

    private String sqlKeyword;
    // ----------------

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
    public String getSqlKeyword()
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
public enum DB2SequencePrecision implements DBPNamedObject {
import org.jkiss.code.NotNull;
        for (DB2SequencePrecision item : DB2SequencePrecision.values()) {
    @NotNull
        this.sqlKeyword = sqlKeyword;
package org.jkiss.dbeaver.ext.db2.model.dict;
 *
    }
 * DF: Added a "P" in front of "value" because Enum does not accept "number only" as value
 * See the License for the specific language governing permissions and
    {
    @Override
    {
            }
    // -----------

    // -----------
 */
    P19("Bigint", 19, "BIGINT");
    private String name;
