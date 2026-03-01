                    }

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
/*
        return true;
            // See #7885
package org.jkiss.dbeaver.model.impl;
        @NotNull DBCOutputWriter output
 */
                try {
import java.util.Arrays;
    }
    public void readServerOutput(
    @Override
        }
}
    public boolean isAsyncOutputReadSupported() {
 * you may not use this file except in compliance with the License.

                    if (connWarning != null) {
                    SQLWarning connWarning = ((JDBCSession) statement.getSession()).getWarnings();
import org.jkiss.dbeaver.model.exec.DBCExecutionResult;
            if (statementWarnings != null && statementWarnings.length > 0) {
import org.jkiss.code.Nullable;
        @NotNull DBRProgressMonitor monitor,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * distributed under the License is distributed on an "AS IS" BASIS,
        } else {
            }
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (statement == null) {
import org.jkiss.code.NotNull;
/*
*/
import org.jkiss.dbeaver.model.exec.output.DBCOutputWriter;
    ) throws DBCException {
            Throwable[] statementWarnings = statement.getStatementWarnings();


                    log.debug(e);
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    }
                }
 *
    private static final Log log = Log.getLog(AsyncServerOutputReader.class);
            super.readServerOutput(monitor, context, executionResult, null, output);
                        dumpWarnings(output, Collections.singletonList(connWarning));
            // Do not read from connection warnings as it blocks statements cancellation and other connection-level stuff.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");

 * You may obtain a copy of the License at
        @Nullable DBCExecutionResult executionResult,
import org.jkiss.dbeaver.Log;
public class AsyncServerOutputReader extends DefaultServerOutputReader {
        @Nullable DBCStatement statement,

 * limitations under the License.
                } catch (SQLException e) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.DBCException;
        @NotNull DBCExecutionContext context,
import org.jkiss.dbeaver.model.exec.DBCStatement;
 * Unless required by applicable law or agreed to in writing, software
    @Override
                dumpWarnings(output, Arrays.asList(statementWarnings));
