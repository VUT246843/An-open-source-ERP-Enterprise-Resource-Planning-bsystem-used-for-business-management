import org.jkiss.dbeaver.model.sql.SQLScriptContext;
    @Override
        );
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
public class ScriptVariablesResolver implements IVariableResolver {

 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
        this.scriptContext = scriptContext;
import org.jkiss.dbeaver.runtime.IVariableResolver;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.sql.commands.SQLCommandSet;
import org.jkiss.code.NotNull;
 * ScriptVariablesResolver
        return CommonUtils.toString(scriptContext.getVariable(varName));
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
    private final SQLScriptContext scriptContext;

/*
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
        String varName = SQLCommandSet.prepareVarName(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
    public String get(@NotNull String name) {
    }

package org.jkiss.dbeaver.model.sql.eval;
 *
            name

            scriptContext.getExecutionContext().getDataSource().getSQLDialect(),
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 * limitations under the License.
 *
 */

import org.jkiss.utils.CommonUtils;
    public ScriptVariablesResolver(SQLScriptContext scriptContext) {
 */
    @Nullable
/**
    }
