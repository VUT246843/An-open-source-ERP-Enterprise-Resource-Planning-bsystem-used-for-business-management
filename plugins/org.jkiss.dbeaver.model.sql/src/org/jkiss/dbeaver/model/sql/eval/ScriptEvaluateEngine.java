
            engine = new ScriptEvaluateEngine(scriptContext);
/**

 * ScriptVariablesContext
    public Object evaluateExpression(String exprString) throws DBException {
        }
public class ScriptEvaluateEngine {
 *
        variablesContext = new ScriptVariablesContext(scriptContext);
    }
        try {
import org.apache.commons.jexl3.JexlEngine;
import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.sql.eval;
/*
import org.apache.commons.jexl3.JexlExpression;
 * DBeaver - Universal Database Manager
        } catch (Exception e) {
            scriptContext.setData("evalEngine", engine);

    }
            JexlExpression expression = jexlEngine.createExpression(exprString);
 *     http://www.apache.org/licenses/LICENSE-2.0
}
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        return engine;

        if (engine == null) {
        ScriptEvaluateEngine engine = (ScriptEvaluateEngine) scriptContext.getData("evalEngine");
        }
    private final ScriptVariablesContext variablesContext;
 * See the License for the specific language governing permissions and
        this.scriptContext = scriptContext;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
            return expression.evaluate(variablesContext);
 *
    public static ScriptEvaluateEngine getEngine(SQLScriptContext scriptContext) {
 * limitations under the License.
import org.jkiss.dbeaver.model.sql.SQLScriptContext;
            throw new DBException("Error evaluating expression [" + exprString + "]", e);
    private final SQLScriptContext scriptContext;
    }
    private final JexlEngine jexlEngine;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

import org.apache.commons.jexl3.JexlBuilder;
    private ScriptEvaluateEngine(SQLScriptContext scriptContext) {
        jexlEngine = new JexlBuilder().cache(100).create();

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,

 */
