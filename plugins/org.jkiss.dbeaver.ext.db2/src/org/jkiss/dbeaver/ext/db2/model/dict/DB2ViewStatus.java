    @Override
    }
import org.jkiss.dbeaver.model.struct.DBSObjectState;
 * You may obtain a copy of the License at
 * @author Denis Forveille
    // ----------------
 *
    private String name;
        return name;
    Y("Valid", DBSObjectState.NORMAL),
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
 * DBeaver - Universal Database Manager
    public String getName()

 *
 */
    }
    X("Inoperative", new DBSObjectState("Inoperative", DBIcon.OVER_ERROR));
 * Copyright (C) 2010-2024 DBeaver Corp and others

    {
 * you may not use this file except in compliance with the License.

        return state;
    public String toString()
    {
 * DB2 View Status
    {
    // -----------------
import org.jkiss.dbeaver.model.DBPNamedObject;
} *

 * limitations under the License.
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBIcon;
    // ----------------
        return name;
    }
/**
    // -----------------------
    // -----------------
    // Standard Getters
    // Constructor



 * 
        this.state = state;
public enum DB2ViewStatus implements DBPNamedObject {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * See the License for the specific language governing permissions and

 * Licensed under the Apache License, Version 2.0 (the "License");

/*
    private DBSObjectState state;
    // ----------------
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package org.jkiss.dbeaver.ext.db2.model.dict;
        this.name = name;
    // Standard Getters
    // -----------------------
 * Unless required by applicable law or agreed to in writing, software
    // ----------------
    @Override
    public DBSObjectState getState()
    }
    private DB2ViewStatus(String name, DBSObjectState state)
    // Display @Property Value

    N("Invalid", DBSObjectState.INVALID),
