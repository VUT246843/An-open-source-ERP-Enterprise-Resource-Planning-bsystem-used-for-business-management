        }
        return error;

package org.jkiss.dbeaver.model.sql;
 *
import org.jkiss.dbeaver.model.exec.DBCExecutionResult;
    {
 * See the License for the specific language governing permissions and

        return statement;
    }


{

        public String getResultSetName()
    }
 * limitations under the License.
                continue;
    private List<Throwable> warnings;

    public void setHasResultSet(boolean hasResultSet)
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Nullable
}
    public List<ExecuteResult> getExecuteResults() {
    private Throwable error;
 * You may obtain a copy of the License at
        this.queryTime = queryTime;



        {
        {
            return updateCount;
    public SQLQueryResult(@NotNull SQLQuery statement)
            this.resultSetName = resultSetName;
    {
        return error != null;
    public void setQueryTime(long queryTime)
    public long getQueryTime()

    public void setRowOffset(Long rowOffset) {

        public boolean isResultSet() {
public class SQLQueryResult implements DBCExecutionResult
    }
        private boolean resultSet;
        this.statement = statement;
        executeResults.add(executeResult);
        }
        this.hasResultSet = hasResultSet;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public ExecuteResult addExecuteResult(boolean resultSet) {



        }
            this.updateCount = updateCount;
    private SQLQuery statement;
    @Nullable
    {
 *
    {
        int rsIndex = -1;

    {
    }
            }
    }
import org.jkiss.code.Nullable;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
    }
        public void setResultSetName(String resultSetName)
            this.rowCount = rowCount;
            return resultSetName;
    {
        return executeResults;

/*
        private Long rowCount;
    public void addWarnings(Throwable[] warnings) {
        this.error = error;

import org.jkiss.code.NotNull;

        {
        }
        return executeResult;
    }
    private Long rowOffset;
 * you may not use this file except in compliance with the License.
    public SQLQuery getStatement() {
    {
 * DBeaver - Universal Database Manager
 * SQLQueryResult

        }
import java.util.List;
    }
            this.resultSet = resultSet;
        this.rowOffset = rowOffset;
                return executeResults.get(i);


import java.util.Collections;
    }
import java.util.ArrayList;
            }
 */
        public Long getRowCount()
    public Throwable getError()
        return null;
        public void setUpdateCount(Long updateCount)
            this.warnings = new ArrayList<>();
    }
 *

        public ExecuteResult(boolean resultSet) {


        ExecuteResult executeResult = new ExecuteResult(resultSet);
    }
    public ExecuteResult getExecuteResults(int order, boolean resultSets) {
            rsIndex++;
    public Long getRowOffset() {
    public void setError(Throwable error)
    @NotNull
    public List<Throwable> getWarnings() {
    {
        if (warnings == null) {
    private List<ExecuteResult> executeResults = new ArrayList<>();
        Collections.addAll(this.warnings, warnings);
    private boolean hasResultSet;

        {
        if (this.warnings == null) {

 */
    private long queryTime;

            return resultSet;
        private String resultSetName;
        return warnings;
/**
        @Nullable
 * Unless required by applicable law or agreed to in writing, software
        @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        private Long updateCount;
    public boolean hasResultSet()
            if (resultSets && !executeResults.get(i).isResultSet()) {
    }
    }
    public static class ExecuteResult {
            return rowCount;
        }

        {
        public void setRowCount(Long rowCount)
        return hasResultSet;
        }
            if (rsIndex == order) {
        return rowOffset;

        {
        for (int i = 0; i < executeResults.size(); i++) {
    }

        }
            return;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    }
        return queryTime;
        public Long getUpdateCount()
    public boolean hasError()
