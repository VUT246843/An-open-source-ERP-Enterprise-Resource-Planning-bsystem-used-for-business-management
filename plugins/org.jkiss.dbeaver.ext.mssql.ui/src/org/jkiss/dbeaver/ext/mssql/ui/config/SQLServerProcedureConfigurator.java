            }
 *
/*
    }
import org.jkiss.dbeaver.ui.editors.object.struct.CreateProcedurePage;
        return UITask.run(() -> {
import org.jkiss.code.Nullable;
import java.util.Map;
 * SQLServerProcedureConfigurator
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
            newProcedure.setProcedureType(editPage.getProcedureType());
            newProcedure.setName(editPage.getProcedureName());
            CreateProcedurePage editPage = new CreateProcedurePage(newProcedure);
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (!editPage.edit()) {
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.edit.DBECommandContext;
public class SQLServerProcedureConfigurator implements DBEObjectConfigurator<SQLServerProcedure> {
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 */
import org.jkiss.code.NotNull;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
            return newProcedure;
package org.jkiss.dbeaver.ext.mssql.ui.config;
    public SQLServerProcedure configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull SQLServerProcedure newProcedure, @NotNull Map<String, Object> options) {

 * You may obtain a copy of the License at


 *
 */

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.mssql.model.SQLServerProcedure;
                return null;
        });
/**
}
import org.jkiss.dbeaver.ui.UITask;
