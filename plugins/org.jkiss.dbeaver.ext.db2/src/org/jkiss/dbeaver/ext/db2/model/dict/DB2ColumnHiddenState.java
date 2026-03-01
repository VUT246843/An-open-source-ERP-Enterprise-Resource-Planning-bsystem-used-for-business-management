/**
    {
    private DB2ColumnHiddenState(String name, Boolean hidden)
package org.jkiss.dbeaver.ext.db2.model.dict;
    }
            return false;
        this.name = name;
    }
    public static Boolean isHidden(String hiddenChar)
        return name;
    // -----------------------
public enum DB2ColumnHiddenState implements DBPNamedObject {
 * See the License for the specific language governing permissions and
    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return false;
    @Override
import org.jkiss.code.NotNull;
    // Standard Getters
    // ----------------
    public String getName()
 * @author Denis Forveille
    {
 * DB2 Column Hidden Status
    public Boolean isHidden()
        return DB2ColumnHiddenState.valueOf(hiddenChar).isHidden();

 * DBeaver - Universal Database Manager
    {
 *
        return name;
}
    // ----------------
 */
    private String name;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public String toString()


    private Boolean hidden;
    // Static Helpers
 * Copyright (C) 2013-2016 Denis Forveille (titou10.titou10@gmail.com)
        }

 * Unless required by applicable law or agreed to in writing, software
        if (hiddenChar == null) {

    S("System managed hidden", true);
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override

import org.jkiss.dbeaver.model.DBPNamedObject;
 * 
    // Display @Property Value

 *
    }
 *
 */
 * You may obtain a copy of the License at
    {

        this.hidden = hidden;
    // -----------
    // -----------------------
 * limitations under the License.
 * you may not use this file except in compliance with the License.
        return hidden;
    // -----------
    {

 *     http://www.apache.org/licenses/LICENSE-2.0
    I("Implicitly hidden", false),
    // ----------------
        if (hiddenChar.trim().length() == 0) {
/*
        }
    }
    // ----------------
 * Licensed under the Apache License, Version 2.0 (the "License");
    // Constructor
