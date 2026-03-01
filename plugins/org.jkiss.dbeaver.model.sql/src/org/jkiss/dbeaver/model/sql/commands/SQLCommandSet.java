     * Unquotes variable name if it was quoted, otherwise converts case to upper
        }
 * you may not use this file except in compliance with the License.
            );
     */
            throw new DBCException("Bad set syntax. Expected syntax:\n@set varName = value or expression");
                "Unexpected characters " + shouldBeEmpty + " after the variable name " + varName + ". " +
        return SQLControlResult.success();
import org.jkiss.code.NotNull;
 *
        }
 */
import org.jkiss.dbeaver.model.exec.DBCException;

        if (varNameEnd == -1) {
    }
package org.jkiss.dbeaver.model.sql.commands;

 * You may obtain a copy of the License at
/*
        int varNameEnd = ScriptParameterRule.tryConsumeParameterName(sqlDialect, parameter, 0);
}
    /*
        }
        String shouldBeEmpty = parameter.substring(varNameEnd, divPos).trim();
    @NotNull
        if (divPos == -1) {
        String parameter = command.getParameter().stripLeading();


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        SQLDialect sqlDialect = scriptContext.getExecutionContext().getDataSource().getSQLDialect();
 * See the License for the specific language governing permissions and
        varValue = GeneralUtils.replaceVariables(varValue, name -> CommonUtils.toString(scriptContext.getVariable(name)), true);
            throw new DBCException(
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
import org.jkiss.dbeaver.DBException;

public class SQLCommandSet implements SQLControlCommandHandler {
        if (sqlDialect.isQuotedIdentifier(rawName)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.utils.CommonUtils;
 *
                "Expected syntax:\n@set varName = value or expression"
import org.jkiss.dbeaver.utils.GeneralUtils;
    @Override
        }
    }
            return rawName;
 * DBeaver - Universal Database Manager
        int divPos = parameter.indexOf('=', varNameEnd);
        String varValue = parameter.substring(divPos + 1).trim();
import org.jkiss.dbeaver.model.sql.*;
 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
import org.jkiss.dbeaver.model.sql.parser.rules.ScriptParameterRule;
        scriptContext.setVariable(varName, varValue);
            throw new DBCException("Missing variable name. Expected syntax:\n@set varName = value or expression");
        } else {
        String varName = parameter.substring(0, varNameEnd);
    public static String prepareVarName(@NotNull SQLDialect sqlDialect, @NotNull String rawName) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Control command handler
    public SQLControlResult handleCommand(@NotNull DBRProgressMonitor monitor, @NotNull SQLControlCommand command, @NotNull SQLScriptContext scriptContext) throws DBException {
            return sqlDialect.getUnquotedIdentifier(rawName, true);
 * Unless required by applicable law or agreed to in writing, software
 */
 *
        if (!shouldBeEmpty.isEmpty()) {
