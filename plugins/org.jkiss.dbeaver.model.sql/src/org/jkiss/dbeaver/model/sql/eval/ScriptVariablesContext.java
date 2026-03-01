import org.apache.commons.jexl3.JexlContext;
    }
    @Override
 * limitations under the License.
 *
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.sql.eval;
/*
    private final SQLScriptContext scriptContext;
    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 */
 *

 * Licensed under the Apache License, Version 2.0 (the "License");

 * Copyright (C) 2010-2024 DBeaver Corp and others

 * Unless required by applicable law or agreed to in writing, software
    public Object get(String name) {
    @Override
        scriptContext.setVariable(name, value);
        this.scriptContext = scriptContext;
 *
 */

 *     http://www.apache.org/licenses/LICENSE-2.0
}
        return scriptContext.getVariable(name);
    public boolean has(String name) {


import org.jkiss.dbeaver.model.sql.SQLScriptContext;
    public void set(String name, Object value) {
 * You may obtain a copy of the License at
/**
 * See the License for the specific language governing permissions and

    }
public class ScriptVariablesContext implements JexlContext {
        return scriptContext.hasVariable(name);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public ScriptVariablesContext(SQLScriptContext scriptContext) {
    @Override
 * ScriptVariablesContext
