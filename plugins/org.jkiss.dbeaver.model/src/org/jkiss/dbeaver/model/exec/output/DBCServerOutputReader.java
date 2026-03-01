     * Reads server output messages.
 *
        @NotNull DBCOutputWriter output)
     */
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
     */
 * See the License for the specific language governing permissions and
        @Nullable DBCExecutionResult executionResult,
    /**
import org.jkiss.dbeaver.model.exec.DBCExecutionResult;
     * Output for statement can be requested only if @isAsyncOutputReadSupported returns true.
/*
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.exec.DBCStatement;
 * DBeaver - Universal Database Manager
 *
/**
}
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;

 */
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.DBPObject;
    /**
 * Unless required by applicable law or agreed to in writing, software

        @Nullable DBCStatement statement,
    void readServerOutput(
 *
     * If async output reading is supported then SQL job will read output during statement execution.
public interface DBCServerOutputReader extends DBPObject
 * limitations under the License.
     * Only @queryResult or @statement can be specified. Non-null statement means async output reading.
        @NotNull DBCExecutionContext context,
        throws DBCException;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
    boolean isAsyncOutputReadSupported();
    boolean isServerOutputEnabled();
 * Provides ability to read server logs for certain session
package org.jkiss.dbeaver.model.exec.output;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


{
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.DBCException;
