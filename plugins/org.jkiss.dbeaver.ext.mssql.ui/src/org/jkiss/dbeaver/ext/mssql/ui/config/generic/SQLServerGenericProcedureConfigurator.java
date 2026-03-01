        @NotNull SQLServerGenericProcedure object,
                    UIUtils.getActiveWorkbenchShell(),
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
                    "");
        @NotNull Map<String, Object> options
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
    public SQLServerGenericProcedure configureObject(
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
package org.jkiss.dbeaver.ext.mssql.ui.config.generic;
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.ui.UITask;
import org.jkiss.utils.CommonUtils;
 *
import java.util.Map;
    }
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
                return object;
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
                String procedureName = EnterNameDialog.chooseName(
            }

                }
 *
 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
        return new UITask<SQLServerGenericProcedure>() {
                    SQLServerUIMessages.dialog_create_procedure_title,


                    return null;
import org.jkiss.dbeaver.ext.mssql.ui.SQLServerUIMessages;
            @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
public class SQLServerGenericProcedureConfigurator implements DBEObjectConfigurator<SQLServerGenericProcedure> {
                if (CommonUtils.isEmpty(procedureName)) {
import org.jkiss.code.Nullable;
/*
 * limitations under the License.
    ) {
import org.jkiss.dbeaver.ui.UIUtils;
 */
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
        }.execute();
 * Unless required by applicable law or agreed to in writing, software
        @Nullable DBECommandContext commandContext,
}
import org.jkiss.dbeaver.ext.mssql.model.generic.SQLServerGenericProcedure;
                object.setName(procedureName);
            protected SQLServerGenericProcedure runTask() {
        @Nullable Object container,
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * you may not use this file except in compliance with the License.
