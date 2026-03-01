 *
 */
        CONNECTION_LOST,
        public int position = -1;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**

public interface DBPErrorAssistant
    }
    class ErrorPosition
            return line + ":" + position + (info == null ? "" : " (" + info + ")");
        DRIVER_CLASS_MISSING,
 * distributed under the License is distributed on an "AS IS" BASIS,
        RESULT_SET_MISSING,      // No resultset, Oracle-specific (#8026)
        PERMISSION_DENIED,
        AUTHENTICATION_FAILED,
/*
}        TRANSACTION_ABORTED,    // Txn aborted, PG-specific
        public int line = -1;

package org.jkiss.dbeaver.model;
        FEATURE_UNSUPPORTED,
import org.jkiss.code.Nullable;
 * Error assistant
        // Position information
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *

    ErrorPosition[] getErrorPosition(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext context, @NotNull String query, @NotNull Throwable error);
    @Nullable
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

 * you may not use this file except in compliance with the License.
    {
 */
        // Line number (starts from zero)
        public String toString() {
        public String info = null;
    @NotNull
 * DBeaver - Universal Database Manager

    ErrorType discoverErrorType(@NotNull Throwable error);
        // Position in line. If line < 0 then position from start of query (starts from zero)
        UNIQUE_KEY_VIOLATION     // During insert operation
import org.jkiss.code.NotNull;
        NORMAL,

 *     http://www.apache.org/licenses/LICENSE-2.0
{
    }
 * You may obtain a copy of the License at
    enum ErrorType {
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
