    @Override
 * you may not use this file except in compliance with the License.
    D("Descending", false),
    // Standard Getters
    R("Random", true);
    }
    // Display @Property Value
    private String name;
    public String toString()
 * Unless required by applicable law or agreed to in writing, software
        return name;
    // ----------------


        this.ascending = ascending;
 */
 *
    {
    I("Include", true),
    }
    private DB2IndexColOrder(String name, Boolean ascending)
}
/**
    // -----------------
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    {
    }
 * DBeaver - Universal Database Manager
 */
        this.name = name;

    // -----------------------


 * Copyright (C) 2013-2015 Denis Forveille titou10.titou10@gmail.com
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
    public String getName()
    @Override
        return ascending;
 *
 * @author Denis Forveille
    private Boolean ascending;
/*
        return name;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

    // -----------------
package org.jkiss.dbeaver.ext.db2.model.dict;
    public Boolean isAscending()
    A("Ascending", true),
 * DB2 Index Column Order


    {
    // Constructor
 *
 * You may obtain a copy of the License at
    // -----------------------
    {
import org.jkiss.dbeaver.model.DBPNamedObject;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
public enum DB2IndexColOrder implements DBPNamedObject {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
    // ----------------
 * 
