
        rowCount++;
        if (DBFetchProgress.monitorFetchProgress(rowCount)) {
/*
    }
    }
 * Unless required by applicable law or agreed to in writing, software

    }
            return fetchedRows % 100000 == 0;

        } else if (fetchedRows < 1000000) {
 *     http://www.apache.org/licenses/LICENSE-2.0
}

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    public long getStartTime() {
        } else {
 */
    private long lastMonitor = 0;
    }
/**
    public boolean isCanceled() {

    public boolean isMaxRowsFetched(long maxRows) {
        statistics.setFetchTime(System.currentTimeMillis() - startTime);
    public void monitorRowFetch() {
    }

import org.jkiss.dbeaver.model.messages.ModelMessages;
 * See the License for the specific language governing permissions and
        return startTime;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 * You may obtain a copy of the License at
    public DBFetchProgress(DBRProgressMonitor monitor) {
        return monitor.isCanceled();
    public void dumpStatistics(DBCStatistics statistics) {


 * limitations under the License.
 * you may not use this file except in compliance with the License.
        statistics.setRowsFetched(rowCount);
            return fetchedRows % 10000 == 0;
        if (fetchedRows < 1000) {
    }
            monitor.worked((int) (rowCount - lastMonitor));
        this.monitor = monitor;
    private long rowCount = 0;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            lastMonitor = rowCount;
    private long startTime = System.currentTimeMillis();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            return fetchedRows % 100 == 0;
            return fetchedRows % 1000 == 0;

 * DB value formatting utilities
        return rowCount;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    private DBRProgressMonitor monitor;
        } else if (fetchedRows < 100000) {

        }
import org.jkiss.dbeaver.model.exec.DBCStatistics;
        statistics.addStatementsCount();
            monitor.subTask(rowCount + ModelMessages.model_jdbc__rows_fetched);
        return maxRows > 0 && rowCount >= maxRows;
public final class DBFetchProgress {
package org.jkiss.dbeaver.model;
        }
    public static boolean monitorFetchProgress(long fetchedRows) {

 *
    public long getRowCount() {
