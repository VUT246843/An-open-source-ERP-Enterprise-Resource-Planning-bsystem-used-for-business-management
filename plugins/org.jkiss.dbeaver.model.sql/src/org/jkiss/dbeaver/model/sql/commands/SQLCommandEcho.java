 * distributed under the License is distributed on an "AS IS" BASIS,

 * limitations under the License.
public class SQLCommandEcho implements SQLControlCommandHandler {
 *
import org.jkiss.code.NotNull;
        return SQLControlResult.success();
package org.jkiss.dbeaver.model.sql.commands;

 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (parameter != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.model.sql.SQLControlResult;
 *

    @NotNull
 * You may obtain a copy of the License at
/*
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.sql.SQLControlCommandHandler;
        }
import org.jkiss.dbeaver.DBException;
    public SQLControlResult handleCommand(@NotNull DBRProgressMonitor monitor, @NotNull SQLControlCommand command, @NotNull SQLScriptContext scriptContext) throws DBException {
 * you may not use this file except in compliance with the License.
            parameter = GeneralUtils.replaceVariables(parameter, new ScriptVariablesResolver(scriptContext), true);
}
 * Control command handler
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.model.sql.SQLControlCommand;
import org.jkiss.dbeaver.model.sql.eval.ScriptVariablesResolver;

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        String parameter = command.getParameter();
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 * See the License for the specific language governing permissions and
        scriptContext.getOutputWriter().println(null, parameter);
import org.jkiss.dbeaver.model.sql.SQLScriptContext;
 * DBeaver - Universal Database Manager
/**
