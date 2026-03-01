 * MySQL procedure configurator

            }
/*
 *
public class MySQLProcedureConfigurator implements DBEObjectConfigurator<MySQLProcedure> {
import org.jkiss.code.NotNull;
 */
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.mysql.model.MySQLProcedure;

import org.jkiss.code.Nullable;
            newProcedure.setName(editPage.getProcedureName());
            newProcedure.setProcedureType(editPage.getProcedureType());
            CreateProcedurePage editPage = new CreateProcedurePage(newProcedure);
        return UITask.run(() -> {
                return null;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.UITask;
 * You may obtain a copy of the License at
            if (!editPage.edit()) {
import java.util.Map;
/**
import org.jkiss.dbeaver.ui.editors.object.struct.CreateProcedurePage;
        });
 * limitations under the License.

    @Override

}
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 */
            return newProcedure;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0

    public MySQLProcedure configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull MySQLProcedure newProcedure, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
package org.jkiss.dbeaver.ext.mysql.ui.config;
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
    }
