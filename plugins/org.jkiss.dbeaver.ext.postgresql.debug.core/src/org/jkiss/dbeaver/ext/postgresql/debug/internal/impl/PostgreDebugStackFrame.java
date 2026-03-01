        return level;

        return getOid();
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
 * You may obtain a copy of the License at
        return oid;
/*
import org.jkiss.dbeaver.debug.DBGStackFrame;
    public String getArgs() {
                + ", args=" + args + "]";

    public int getLineNumber() {
    }
 * Copyright (C) 2017-2018 Andrew Khitrin (ahitrin@gmail.com)
    }
    public int getOid() {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        return name;
        return args;
package org.jkiss.dbeaver.ext.postgresql.debug.internal.impl;
        super();
 * Unless required by applicable law or agreed to in writing, software
public class PostgreDebugStackFrame implements DBGStackFrame {

 * limitations under the License.

    }
 *
    @Override
    private final int lineNo;

}

        this.lineNo = lineNo;
 */
 * DBeaver - Universal Database Manager
    }
    public String toString() {
    public Object getSourceIdentifier() {
        this.name = name;
    private final int level;
    }


    @Override
 *
    }
    public int getLevel() {
    private final int oid;
 * you may not use this file except in compliance with the License.
    private final String args;
    private final String name;
 * distributed under the License is distributed on an "AS IS" BASIS,

    public String getName() {
        this.level = level;
    public PostgreDebugStackFrame(int level, String name, int oid, int lineNo, String args) {


        return "PostgreDebugStackFrame [level=" + level + ", name=" + name + ", oid=" + oid + ", lineNo=" + lineNo

        this.oid = oid;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * See the License for the specific language governing permissions and
 *
    @Override
        this.args = args;
        return lineNo;
