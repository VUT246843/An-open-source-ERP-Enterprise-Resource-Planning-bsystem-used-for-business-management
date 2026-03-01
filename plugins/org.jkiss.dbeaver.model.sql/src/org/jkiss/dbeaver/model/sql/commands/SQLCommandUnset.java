 */
        if (varNameEnd != parameter.length()) {


/*
import org.jkiss.dbeaver.DBException;
        scriptContext.removeVariable(varName);
 *

    @Override
        int varNameEnd = ScriptParameterRule.tryConsumeParameterName(sqlDialect, parameter, 0);
 * Unless required by applicable law or agreed to in writing, software
        String varName = SQLCommandSet.prepareVarName(sqlDialect, parameter.substring(0, varNameEnd));
 * you may not use this file except in compliance with the License.
            throw new DBCException("Invalid Unset command. Expected syntax:\n@unset varName");
import org.jkiss.dbeaver.model.exec.DBCException;
 * Licensed under the Apache License, Version 2.0 (the "License");
}
package org.jkiss.dbeaver.model.sql.commands;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
        String parameter = command.getParameter().trim();
import org.jkiss.dbeaver.model.sql.*;
 *
        return SQLControlResult.success();
 * See the License for the specific language governing permissions and
        
    }
public class SQLCommandUnset implements SQLControlCommandHandler {

        
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 *
 * limitations under the License.
    @NotNull

        SQLDialect sqlDialect = scriptContext.getExecutionContext().getDataSource().getSQLDialect();
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Control command handler
    public SQLControlResult handleCommand(@NotNull DBRProgressMonitor monitor, @NotNull SQLControlCommand command, @NotNull SQLScriptContext scriptContext) throws DBException {
/**
import org.jkiss.code.NotNull;
        }
import org.jkiss.dbeaver.model.sql.parser.rules.ScriptParameterRule;
 * You may obtain a copy of the License at
