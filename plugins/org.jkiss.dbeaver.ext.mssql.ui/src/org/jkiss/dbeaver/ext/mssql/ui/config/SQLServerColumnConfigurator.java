 * distributed under the License is distributed on an "AS IS" BASIS,
public class SQLServerColumnConfigurator implements DBEObjectConfigurator<SQLServerTableColumn> {
/*
        }.execute();
                    return null;

            }
 * DBeaver - Universal Database Manager
                if (!page.edit()) {

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
                final EditAttributePage page = new EditAttributePage(commandContext, column, options);
    public SQLServerTableColumn configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull SQLServerTableColumn column, @NotNull Map<String, Object> options) {
                return column;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableColumn;
import java.util.Map;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.editors.object.struct.EditAttributePage;
 *
import org.jkiss.code.Nullable;
}
    }
import org.jkiss.dbeaver.ui.UITask;
 * limitations under the License.
                }

            @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 */
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            protected SQLServerTableColumn runTask() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return new UITask<SQLServerTableColumn>() {
    @Override
package org.jkiss.dbeaver.ext.mssql.ui.config;
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
