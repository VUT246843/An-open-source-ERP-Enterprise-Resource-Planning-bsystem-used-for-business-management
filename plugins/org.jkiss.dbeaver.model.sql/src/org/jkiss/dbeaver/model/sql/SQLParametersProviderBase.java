        param.setValue(strValue);
import org.jkiss.code.Nullable;
        @NotNull List<SQLQueryParameter> parameters,
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
 *
        @NotNull List<SQLQueryParameter> parameters,
    protected void assignVariable(@NotNull SQLScriptContext scriptContext, SQLQueryParameter param, String paramName, Object defValue) {
        }
}
 *
                    assignVariable(scriptContext, param, paramName, defValue);
 *
    @Nullable


    }
 * you may not use this file except in compliance with the License.
        boolean allSet = true;
 * You may obtain a copy of the License at
        @NotNull SQLQuery sqlStatement,
    public Boolean prepareStatementParameters(
        if (allSet) {
            }

        boolean useDefaults
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull Supplier<DBDDataReceiver> dataReceiverSupplier,
    @Override

                assignVariable(scriptContext, param, paramName, defValue);

import org.jkiss.code.NotNull;
        @NotNull SQLScriptContext scriptContext,

 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.List;
                allSet = false;
    );
 * distributed under the License is distributed on an "AS IS" BASIS,
public abstract class SQLParametersProviderBase implements SQLParametersProvider {
                defValue = useDefaults ? scriptContext.getParameterDefaultValue(paramName) : null;
            } else {
        Object varValue = defValue != null ? defValue : scriptContext.getVariable(paramName);
                    }
        @NotNull SQLQuery sqlStatement,
            }
    protected abstract Boolean collectAndAssignVariables(
                paramName = param.getVarName();
        String strValue = varValue == null ? null : varValue.toString();
        @NotNull Supplier<DBDDataReceiver> dataReceiverSupplier
        @NotNull SQLScriptContext scriptContext,
        for (SQLQueryParameter param : parameters) {
            Object defValue = useDefaults ? scriptContext.getParameterDefaultValue(paramName) : null;
    @Nullable
        for (SQLQueryParameter param : parameters) {
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
            return true;
        }
                        param.setVariableSet(false);
        return collectAndAssignVariables(scriptContext, sqlStatement, parameters, dataReceiverSupplier);
                if (defValue != null || scriptContext.hasVariable(paramName)) {
                }
        param.setVariableSet(true);
                } else {
            String paramName = param.getName();
 */
        }
            if (defValue != null || scriptContext.hasVariable(paramName)) {
package org.jkiss.dbeaver.model.sql;
 * limitations under the License.
/*

                    if (!useDefaults) {
import java.util.function.Supplier;
 * See the License for the specific language governing permissions and
    ) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            if (!param.isVariableSet()) {
    }
