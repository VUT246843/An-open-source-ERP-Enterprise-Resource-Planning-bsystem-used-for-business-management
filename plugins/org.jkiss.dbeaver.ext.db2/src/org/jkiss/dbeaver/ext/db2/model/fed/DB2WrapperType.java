 * @author Denis Forveille

 * Unless required by applicable law or agreed to in writing, software
        this.name = name;
 * See the License for the specific language governing permissions and

    {
    @Override
 * limitations under the License.
 *
 */
    {
    }
    // -----------
 * DB2 Federated Wrapper Type
    }
import org.jkiss.dbeaver.model.DBPNamedObject;
public enum DB2WrapperType implements DBPNamedObject {

 *

    }
    // ----------------
    R("Relational");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
 * 
    private DB2WrapperType(String name)


    // Display @Property Value
 * Licensed under the Apache License, Version 2.0 (the "License");

 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * you may not use this file except in compliance with the License.
    N("Non Relational"),
        return name;

import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
    public String getName()
    @NotNull
    private String name;

 *
    // Constructor
    // Standard Getters
    public String toString()
    // -----------------------
 */
}
/**
package org.jkiss.dbeaver.ext.db2.model.fed;
    // ----------------
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
    // -----------

 * Copyright (C) 2010-2024 DBeaver Corp and others

        return name;
    @Override
    // -----------------------
