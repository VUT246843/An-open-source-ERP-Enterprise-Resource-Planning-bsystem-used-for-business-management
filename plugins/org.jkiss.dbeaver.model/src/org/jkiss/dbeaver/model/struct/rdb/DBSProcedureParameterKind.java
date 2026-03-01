    RESULTSET("ResultSet", false, true),
        this.title = title;
    }
/**
    }

 * Licensed under the Apache License, Version 2.0 (the "License");

 *
 * limitations under the License.
    public boolean isInput() {
 * Unless required by applicable law or agreed to in writing, software
    DBSProcedureParameterKind(String title, boolean isInput, boolean isOutput) {
    public String getTitle() {
    IN("IN", true, false),
 */
{
 *
 * See the License for the specific language governing permissions and
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.isInput = isInput;
package org.jkiss.dbeaver.model.struct.rdb;
 * You may obtain a copy of the License at
 * DBSProcedureParameterKind
        this.isOutput = isOutput;
 *
}
    RETURN("Return", false, true),
 * DBeaver - Universal Database Manager
    private final boolean isOutput;

    }


 * Copyright (C) 2010-2024 DBeaver Corp and others
        return isOutput;
    }
    TABLE("Table", false, true),
    OUT("OUT", false, true),
    UNKNOWN("Unknown", false, false),

 * you may not use this file except in compliance with the License.
public enum DBSProcedureParameterKind
    private final boolean isInput;
        return title;
        return isInput;
    INOUT("IN/OUT", true, true),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

    private final String title;
    ;
    public boolean isOutput() {
 *     http://www.apache.org/licenses/LICENSE-2.0
