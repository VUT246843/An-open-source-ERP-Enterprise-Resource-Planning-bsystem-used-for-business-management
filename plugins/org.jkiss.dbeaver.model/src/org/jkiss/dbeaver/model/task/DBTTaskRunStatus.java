            StringJoiner joiner = new StringJoiner(", ");
 * DBeaver - Universal Database Manager

 * Licensed under the Apache License, Version 2.0 (the "License");
            statistics.getRowsUpdated() > 0 ||
                joiner.add(NLS.bind(ModelMessages.task_rows_modified_message_part, statistics.getRowsUpdated()));
 */
        resultMessage = message;
                joiner.add(NLS.bind(ModelMessages.task_statements_executed_message_part, statistics.getStatementsCount()));
    public void setResultMessage(String message) {
            if (statistics.getRowsFetched() > 0) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable

    private String resultMessage;

 *
            if (statistics.getStatementsCount() > 0) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at

}

 *
        return resultMessage;
 * limitations under the License.
package org.jkiss.dbeaver.model.task;

        }
public class DBTTaskRunStatus {
            statistics.getStatementsCount() > 0) {

import org.jkiss.code.Nullable;
        DBTTaskRunStatus taskResultStatus = new DBTTaskRunStatus();
        if (statistics.getRowsFetched() > 0 ||
import java.util.StringJoiner;

            }
            taskResultStatus.setResultMessage(joiner.toString());

 * Unless required by applicable law or agreed to in writing, software
            if (statistics.getRowsUpdated() > 0) {
import org.eclipse.osgi.util.NLS;

import org.jkiss.dbeaver.model.exec.DBCStatistics;
    public String getResultMessage() {

 *     http://www.apache.org/licenses/LICENSE-2.0
            }
 * you may not use this file except in compliance with the License.
/*
    public DBTTaskRunStatus(){
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.messages.ModelMessages;
            }
                joiner.add(NLS.bind(ModelMessages.task_rows_fetched_message_part, statistics.getRowsFetched()));
    }
    public static DBTTaskRunStatus makeStatisticsStatus(DBCStatistics statistics) {
    }
 *
    }
        return taskResultStatus;
