
    public void accumulate(@Nullable DBCStatistics stat) {
            return Collections.emptyMap();
    public void setRowsFetched(long rowsFetched) {
    }
/*
    public long getEndTime() {
        }
        }

    public void reset() {
    }
 * you may not use this file except in compliance with the License.

    private List<Throwable> warnings;

    private Map<String, Object> infoMap;
            infoMap = new LinkedHashMap<>();
        if (!CommonUtils.isEmpty(stat.infoMap)) {
            if (rowsUpdated < 0) rowsUpdated = 0;
        }
            }
package org.jkiss.dbeaver.model.exec;
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
        this.executeTime += (System.currentTimeMillis() - startTime);
            for (String message : stat.messages) {


    }
    public void addFetchTime(long fetchTime) {
        }
        warnings.add(warning);
 * DBeaver - Universal Database Manager
        this.statementsCount = statementsCount;

        infoMap = null;

        this.rowsFetched = rowsFetched;
    }
    }
        return statementsCount;
    public void addExecuteTime() {
            }
        return rowsUpdated;
    }
    public long getRowsFetched() {
        this.executeTime = executeTime;
    public List<Throwable> getWarnings() {
    public void addMessage(String message) {
    }
        if (this.rowsUpdated == -1) {
    }
    public Map<String, Object> getInfo() {
    public void addWarning(Throwable warning) {
import org.jkiss.utils.CommonUtils;
 *
        this.startTime = System.currentTimeMillis();
    }
        }
    public void setStatementsCount(int statementsCount) {

        statementsCount += stat.statementsCount;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.code.Nullable;
    public void setError(Throwable error) {
    }
    public long getRowsUpdated() {
    }
        }
    public long getTotalTime() {
    public Throwable getError() {
        rowsUpdated = -1;
    public long getFetchTime() {
    }

    private String queryText;

        }

            for (Map.Entry<String, Object> info : stat.infoMap.entrySet()) {
        messages = null;
        messages.add(message);


        }
        if (!CommonUtils.isEmpty(stat.messages)) {
            return;
    public long getExecuteTime() {
        return error;
    public int getStatementsCount() {
        this.statementsCount++;
        if (warnings == null) {


    private long rowsUpdated = -1;
    }
        return this.startTime;

        statementsCount = 0;
        executeTime += stat.executeTime;

    @Nullable

    }
 * You may obtain a copy of the License at
        rowsFetched = -1;
    private List<String> messages;



    public void setExecuteTime(long executeTime) {

        return warnings;
        return fetchTime;
    }

    }
        this.fetchTime += fetchTime;
    public void setRowsUpdated(long rowsUpdated) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (infoMap == null) {
        return queryText;

 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.*;
    }
    public DBCStatistics() {
    public void addRowsUpdated(long rowsUpdated) {
        return rowsFetched;



        }
        this.queryText = queryText;
            rowsUpdated += stat.rowsUpdated;
    public void addInfo(String name, Object value) {
        if (rowsUpdated < 0) {
public class DBCStatistics implements DBCExecutionResult {
    }
    @Override

    }
        fetchTime = 0;
 *
    }
        executeTime = 0;
    @Override
}    }
    public long getStartTime() {
            warnings = new ArrayList<>();
            this.rowsUpdated = 0;
        return executeTime + fetchTime;
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
    }
    }
        return messages;
        if (infoMap == null) {
    }
    @Nullable

        return executeTime;
        infoMap.put(name, value);
    public boolean isEmpty() {
/**
    }
        fetchTime += stat.fetchTime;
        this.rowsUpdated += rowsUpdated;
        this.error = error;
    private long executeTime;
        return startTime + getTotalTime();
        this.fetchTime = fetchTime;
 * See the License for the specific language governing permissions and

        if (stat.rowsFetched > 0) {
            messages = new ArrayList<>();
                addInfo(info.getKey(), info.getValue());
    public void addStatementsCount() {
    public String getQueryText() {
        this.rowsUpdated = rowsUpdated;
 */
                addMessage(message);
 * limitations under the License.
        }
    }

        }
    public List<String> getMessages() {
    }
    }
        this.executeTime += executeTime;
    public void setFetchTime(long fetchTime) {
 * Unless required by applicable law or agreed to in writing, software
 *
        return infoMap;
    private Throwable error;
    public void addExecuteTime(long executeTime) {

        if (stat == null) {
            return;
    }

    public void setQueryText(String queryText) {

        if (stat.rowsUpdated >= 0) {
    private long rowsFetched = -1;

    }
 * Execution statistics
        return executeTime <= 0 && fetchTime <= 0 && statementsCount == 0;
        if (messages == null) {
            if (rowsFetched < 0) rowsFetched = 0;
    private int statementsCount;
    private final long startTime;
    }
    private long fetchTime;
            rowsFetched += stat.rowsFetched;
