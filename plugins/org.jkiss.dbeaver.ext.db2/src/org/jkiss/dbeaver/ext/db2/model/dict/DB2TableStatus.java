 * you may not use this file except in compliance with the License.

    X("Inoperative", new DBSObjectState("Inoperative", DBIcon.OVER_ERROR));
    }
        return name;
    @NotNull
    private String name;
        this.state = state;
    // Constructor
    // -----------------
import org.jkiss.code.NotNull;
    @Override
 * See the License for the specific language governing permissions and

 * You may obtain a copy of the License at
    public String toString()
    {
package org.jkiss.dbeaver.ext.db2.model.dict;
    // -----------------
 *
 *
    {

    }
import org.jkiss.dbeaver.model.DBPNamedObject;
    }
    private DBSObjectState state;
    @Override
    // Standard Getters
    {
}
    private DB2TableStatus(String name, DBSObjectState state)
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getName()
 * DB2 Table Status
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    public DBSObjectState getState()
    // Display @Property Value
public enum DB2TableStatus implements DBPNamedObject {
        return state;
 *     http://www.apache.org/licenses/LICENSE-2.0
    // -----------------------
 * @author Denis Forveille
        return name;


 * Unless required by applicable law or agreed to in writing, software

    C("Set integrity pending", new DBSObjectState("Set Integrity Pending", DBIcon.OVER_ERROR)),
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
    // -----------------------
    }
    // ----------------
/*

    N("Normal", DBSObjectState.NORMAL),
 * 
    {
        this.name = name;
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBIcon;

 *
import org.jkiss.dbeaver.model.struct.DBSObjectState;
 * limitations under the License.
    // ----------------
