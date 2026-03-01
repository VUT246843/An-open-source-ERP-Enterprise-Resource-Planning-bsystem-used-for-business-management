import org.jkiss.code.Nullable;
public class PostgreScriptExecutor extends NativeSQLScriptExecutor<PostgreDatabase> {
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.postgresql.tools;
    ) {
 * you may not use this file except in compliance with the License.
}
    @NotNull

 *
import org.jkiss.dbeaver.tasks.ui.nativetool.NativeSQLScriptExecutor;
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,

 */
        @Nullable Path file
        @NotNull PostgreDatabase postgreDatabase,
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
import java.nio.file.Path;
 *

 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at

 *
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
    protected TaskConfigurationWizard<?> createTaskConfigurationWizard(
 * limitations under the License.
        return new PostgreScriptExecuteWizard(postgreDatabase, file);
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.NotNull;
