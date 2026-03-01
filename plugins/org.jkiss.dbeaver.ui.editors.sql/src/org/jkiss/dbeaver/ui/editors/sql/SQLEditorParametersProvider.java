                if (dataReceiver instanceof DBDDataReceiverInteractive dri) {
                if (dataReceiver instanceof DBDDataReceiverInteractive dri) {
                        scriptContext.setVariable(param.getName(), strValue);
import org.jkiss.dbeaver.model.sql.SQLQueryParameter;
            for (SQLQueryParameter param : parameters) {
        });
 * Licensed under the Apache License, Version 2.0 (the "License");
                    dri.setDataReceivePaused(false);
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.List;
                site,
            }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.UITask;

    @Nullable
                if (param.isNamed()) {
import org.jkiss.dbeaver.model.sql.SQLScriptContext;
                        scriptContext.setParameterDefaultValue(param.getName(), strValue);
import java.util.function.Supplier;
        return false;
            SQLEditorFeatures.SQL_EDITOR_QUERY_PARAMS.use();
 * See the License for the specific language governing permissions and
                    dri.setDataReceivePaused(true);
    private final IWorkbenchPartSite site;
}
            );
        if (paramsResult == IDialogConstants.OK_ID) {
import org.jkiss.dbeaver.model.data.DBDDataReceiver;

                return dialog.open();
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.editors.sql;
    }
                    String strValue = param.getValue();
            return true;
                    } else {

 * Copyright (C) 2010-2025 DBeaver Corp and others
    protected Boolean collectAndAssignVariables(
                parameters
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    ) {
                }
            scriptContext.setIgnoreParameters(true);
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.IWorkbenchPartSite;
                sqlStatement,
    @Override
        @NotNull List<SQLQueryParameter> parameters,
 * SQL Editor params provider
        this.site = site;
        int paramsResult = UITask.run(() -> {
                }
 *
import org.jkiss.dbeaver.model.sql.SQLParametersProviderBase;
 */

        @NotNull SQLScriptContext scriptContext,

            SQLQueryParameterBindDialog dialog = new SQLQueryParameterBindDialog(
        }
            // Save values back to script context
    }
            return null;
            }
            } finally {
                    } else if (scriptContext.hasVariable(param.getVarName())) {
        } else if (paramsResult == IDialogConstants.IGNORE_ID) {
import org.jkiss.dbeaver.model.sql.SQLQuery;
public class SQLEditorParametersProvider extends SQLParametersProviderBase {
 *
 */
    public SQLEditorParametersProvider(IWorkbenchPartSite site) {
            final DBDDataReceiver dataReceiver = dataReceiverSupplier.get();
import org.jkiss.code.Nullable;

 *
import org.jkiss.dbeaver.model.data.DBDDataReceiverInteractive;

                        scriptContext.setVariable(param.getVarName(), strValue);
 * DBeaver - Universal Database Manager
/*
import org.jkiss.code.NotNull;
import org.eclipse.jface.dialogs.IDialogConstants;
            try {
        @NotNull SQLQuery sqlStatement,
import org.jkiss.dbeaver.ui.editors.sql.dialogs.SQLQueryParameterBindDialog;


                    if (scriptContext.hasVariable(param.getName())) {
                }

/**
        @NotNull Supplier<DBDDataReceiver> dataReceiverSupplier
                    }

