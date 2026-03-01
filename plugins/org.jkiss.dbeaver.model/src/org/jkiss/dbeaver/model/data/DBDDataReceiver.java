
            } catch (DBCException e) {
    ) throws DBException {
 * Unless required by applicable law or agreed to in writing, software
            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * This may cause statement lock issues.
                dataReceiver.fetchEnd(session, resultSet);
        @NotNull DBDDataReceiver dataReceiver,
}
        @NotNull DBCResultSet resultSet,
        throws DBException;
            try (dataReceiver) {
     */
                throw new DBRuntimeException("Error while finishing result set fetching into " + dataReceiver, e);
        }
import org.jkiss.dbeaver.model.DBFetchProgress;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

 * limitations under the License.

     * @param session execution context

     * This method is called even if fetchStart wasn't called in this data receiver (may occur if statement throws an error)
 *
        dataReceiver.fetchStart(session, resultSet, offset, maxRows);
        resultSet.getSourceStatement().autoCloseDependant(() -> {
     * WARN: It SHOULD be called after owner statement close. Because in fetchEnd additional queries/server reads may be performed.
     * @param resultSet    result set
        DBRProgressMonitor progressMonitor = session.getProgressMonitor();

            fetchProgress.monitorRowFetch();
import org.jkiss.code.NotNull;
        long maxRows
 * Data receiver.
 * DBeaver - Universal Database Manager
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    void fetchRow(@NotNull DBCSession session, @NotNull DBCResultSet resultSet)

    void fetchEnd(@NotNull DBCSession session, @NotNull DBCResultSet resultSet)
        throws DBException;
/*
        long offset,
    static void fetchRowsWithStatistics(
    // FIXME: we should keep in variable or do not keep it at all (use separate interface)
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
        });
    }

 * Result set can be a result of some query execution, cursor returned from stored procedure, generated keys result set, etc.
 */

import org.jkiss.dbeaver.DBException;
        DBFetchProgress fetchProgress = new DBFetchProgress(progressMonitor);

 * you may not use this file except in compliance with the License.
        while (!progressMonitor.isCanceled() && resultSet.nextRow()) {
        @NotNull DBCStatistics statistics
    static void startFetchWorkflow(
import org.jkiss.dbeaver.model.exec.DBCSession;
    /**
    }
/**
        @NotNull DBCSession session,
        return new DBCStatistics();
import org.jkiss.dbeaver.model.exec.DBCStatistics;
 * See the License for the specific language governing permissions and
    void fetchStart(@NotNull DBCSession session, @NotNull DBCResultSet resultSet, long offset, long maxRows)
import org.jkiss.dbeaver.model.exec.DBCResultSet;
public interface DBDDataReceiver extends AutoCloseable {
import org.jkiss.dbeaver.DBRuntimeException;
    /**

        @NotNull DBCResultSet resultSet,
 */
 * Used to receive some result set data.
 *
     * Called after entire result set if fetched.
import org.jkiss.dbeaver.model.exec.DBCException;
     * Called after entire result set is fetched and closed.

        throws DBException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.model.data;
    ) throws DBException {
    void close();
        fetchProgress.dumpStatistics(statistics);
     */
    default DBCStatistics getStatistics() {
 * You may obtain a copy of the License at
        @NotNull DBDDataReceiver dataReceiver,
            dataReceiver.fetchRow(session, resultSet);


     * @throws DBCException on error
        @NotNull DBCSession session,
