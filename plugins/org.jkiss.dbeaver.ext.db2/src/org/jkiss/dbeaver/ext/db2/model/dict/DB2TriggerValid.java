    // Display @Property Value
    @NotNull
        return state;

 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    // ----------------
 *
    N("Invalid", DBSObjectState.INVALID),
 * DB2 Trigger Valid attribute

 * limitations under the License.
 */
    {
    private DBSObjectState state;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    }

    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 

    {

    // -----------------------
    // -----------------------
import org.jkiss.dbeaver.model.DBPNamedObject;
    }
    public String toString()
    public DBSObjectState getState()

    X("Inoperative", DBSObjectState.INVALID), // DF: No exact correspondance
 * you may not use this file except in compliance with the License.
    // -----------------
package org.jkiss.dbeaver.ext.db2.model.dict;
        this.state = state;
    {
    public String getName()
 *
 * Unless required by applicable law or agreed to in writing, software
    private String name;

public enum DB2TriggerValid implements DBPNamedObject {

 *

    private DB2TriggerValid(String name, DBSObjectState state)
        return name;
    // ----------------
 */
    // Constructor
import org.jkiss.code.NotNull;
    }
    // -----------------
} * Licensed under the Apache License, Version 2.0 (the "License");
    // Standard Getters
import org.jkiss.dbeaver.model.struct.DBSObjectState;
        this.name = name;
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
 * @author Denis Forveille
    {
    @Override
/*
    Y("Valid", DBSObjectState.ACTIVE); // DF: No exact correspondance
/**
 * You may obtain a copy of the License at
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        return name;
