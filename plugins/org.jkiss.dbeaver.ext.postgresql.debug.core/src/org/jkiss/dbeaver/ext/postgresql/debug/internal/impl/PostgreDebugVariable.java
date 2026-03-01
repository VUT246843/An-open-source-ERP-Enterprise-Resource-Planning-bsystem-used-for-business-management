

    }

    private final String varclass;
    }
    @SuppressWarnings("nls")

    }
            boolean notnull, int oid, String val) {
        this.notnull = notnull;
    }


import org.jkiss.dbeaver.debug.DBGVariableType;
 * Copyright (C) 2017-2018 Andrew Khitrin (ahitrin@gmail.com)
        return constant;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

 * See the License for the specific language governing permissions and
    public String toString() {
    private final int oid;
        this.val = val;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
        this.varclass = varclass;

    }
    public int getLineNumber() {

    @Override

        return val;
 * Unless required by applicable law or agreed to in writing, software
 */

 *
        return unique;
    private final int lineNumber;
        return "PostgreDebugVariable [name=" + name + ", val=" + val + ", varclass=" + varclass + ", lineNumber="
        return DBGVariableType.TEXT;
 *
        this.unique = unique;
    public String getVarclass() {

    private final boolean unique;
    private final boolean constant;
    public boolean isUnique() {
        // TODO Auto-generated method stub
        return notnull;
    public boolean isNotnull() {
    public boolean isConstant() {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

        super();
    private final String name;
    }
 * You may obtain a copy of the License at
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
    @Override

    }
                + lineNumber + ", unique=" + unique + ", constant=" + constant + ", notnull=" + notnull + ", oid=" + oid
    }
    private final boolean notnull;
 * limitations under the License.
        return name;
 * you may not use this file except in compliance with the License.
    @Override
public class PostgreDebugVariable implements DBGVariable<String> {
        return oid;
import org.jkiss.dbeaver.debug.DBGVariable;
package org.jkiss.dbeaver.ext.postgresql.debug.internal.impl;
        this.constant = constant;
    public DBGVariableType getType() {


    public String getName() {
    private final String val;
    }

/*



    public String getVal() {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.



                + "]";
    public PostgreDebugVariable(String name, String varclass, int linenumber, boolean unique, boolean constant,
    public int getOid() {
        return lineNumber;
 * DBeaver - Universal Database Manager

        this.oid = oid;
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
        this.lineNumber = linenumber;
        return varclass;
        this.name = name;
