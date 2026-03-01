import org.jkiss.code.NotNull;

    public void readServerOutput(
            for (Throwable warning : warnings) {
 *
    public boolean isServerOutputEnabled() {
/*
package org.jkiss.dbeaver.model.impl;
        @Nullable DBCExecutionResult executionResult,
import org.jkiss.dbeaver.model.exec.output.DBCServerOutputReader;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import java.util.List;
    }
    @Override
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    protected void dumpWarning(@NotNull DBCOutputWriter output, @NotNull Throwable warning) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.DBCExecutionResult;
 */
        return false;


    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.jkiss.dbeaver.model.exec.DBCException;
}
    protected void dumpWarnings(@NotNull DBCOutputWriter output, List<Throwable> warnings) {
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            dumpWarnings(output, executionResult.getWarnings());
 * Default output reader.
import org.jkiss.dbeaver.model.exec.output.DBCOutputWriter;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

    ) throws DBCException {
        @NotNull DBRProgressMonitor monitor,
        }
        return true;
    }
        if (warnings != null && warnings.size() > 0) {
        @NotNull DBCOutputWriter output
        if (executionResult != null) {

    public boolean isAsyncOutputReadSupported() {

            }
/**
 * DBeaver - Universal Database Manager
        output.println(null, warning.getMessage());
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.exec.DBCStatement;
public class DefaultServerOutputReader implements DBCServerOutputReader {
                dumpWarning(output, warning);
        @NotNull DBCExecutionContext context,
    @Override
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
 * Dumps SQL warnings
    }
    @Override
        @Nullable DBCStatement statement,
 *
