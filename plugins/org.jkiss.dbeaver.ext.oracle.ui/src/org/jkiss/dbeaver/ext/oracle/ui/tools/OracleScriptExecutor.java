    }
 * You may obtain a copy of the License at
 * limitations under the License.
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        return new OracleScriptExecuteWizard(oracleDataSource, file);
 */

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class OracleScriptExecutor extends NativeSQLScriptExecutor<OracleDataSource> {
import org.jkiss.code.Nullable;
    protected TaskConfigurationWizard<?> createTaskConfigurationWizard(
    ) {
/*
import org.jkiss.dbeaver.ext.oracle.model.OracleDataSource;
        @Nullable Path file
 *

}

 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.tasks.ui.nativetool.NativeSQLScriptExecutor;
 * Unless required by applicable law or agreed to in writing, software
        @NotNull OracleDataSource oracleDataSource,
import java.nio.file.Path;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
package org.jkiss.dbeaver.ext.oracle.ui.tools;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
    @NotNull
