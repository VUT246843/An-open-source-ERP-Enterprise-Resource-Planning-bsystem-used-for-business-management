 * you may not use this file except in compliance with the License.
 *
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
import java.nio.file.Path;
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.mysql.tools;
import org.jkiss.dbeaver.tasks.ui.nativetool.NativeSQLScriptExecutor;
    ) {
    }
    @NotNull

 *     http://www.apache.org/licenses/LICENSE-2.0
        return new MySQLScriptExecuteWizard(mySQLCatalog, false, file);
import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at
public class MySQLScriptExecutor extends NativeSQLScriptExecutor<MySQLCatalog> {
import org.jkiss.code.NotNull;
}
/*
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        @NotNull MySQLCatalog mySQLCatalog,
 */
 *
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;

        @Nullable Path file
    protected TaskConfigurationWizard<?> createTaskConfigurationWizard(
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * See the License for the specific language governing permissions and
