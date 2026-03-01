
    @Override
        this.virtual = virtual;
    // ----------------
    }
import org.jkiss.dbeaver.model.DBPNamedObject;
    S("Virtual Index Column", true),
 * Unless required by applicable law or agreed to in writing, software
}    {
    Y("Virtual Index Column not in this Table", true);

    private DB2IndexColVirtual(String name, Boolean virtual)
    public String getName()
    // -----------------

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * 

    // -----------------------
 *

 * limitations under the License.

    // -----------------------
    public Boolean isNotVirtual()
 * you may not use this file except in compliance with the License.
    // Helpers
        return name;
 */
        return !virtual;

/*

import org.jkiss.code.NotNull;
    private String name;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    // Display @Property Value
 * @author Denis Forveille
        return virtual;
        return name;
 * DBeaver - Universal Database Manager
    // -----------------
        this.name = name;
 *     http://www.apache.org/licenses/LICENSE-2.0
    {

    // -----------------------
package org.jkiss.dbeaver.ext.db2.model.dict;
    // -----------------------
 */
public enum DB2IndexColVirtual implements DBPNamedObject {
 * Licensed under the Apache License, Version 2.0 (the "License");
    // Constructor
/**
    private Boolean virtual;
    public Boolean isVirtual()
 * See the License for the specific language governing permissions and
 *
    N("", false),

    @NotNull
    {
 *
 * You may obtain a copy of the License at
    }
    // Standard Getters
    }
 * Copyright (C) 2013-2015 Denis Forveille titou10.titou10@gmail.com
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * DB2 Index Virtual status

    {
    // ----------------
    public String toString()
    {
