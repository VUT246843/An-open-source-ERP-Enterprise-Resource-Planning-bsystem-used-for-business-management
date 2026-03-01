    private boolean transactionMode;
        this.updateCount = updateCount;
package org.jkiss.dbeaver.model.qm;
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
        return executeCount;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
    public boolean isTransactionMode() {
 *
 * limitations under the License.
    }
    }

 * Transaction state
 */

    private int executeCount;
 */

    }
    private int updateCount;

        return updateCount;
 * Unless required by applicable law or agreed to in writing, software
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return transactionStartTime;

        this.executeCount = executeCount;
        this.transactionStartTime = transactionStartTime;
 * DBeaver - Universal Database Manager

 *
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
public class QMTransactionState {

/**
    public int getUpdateCount() {
        this.transactionMode = transactionMode;
        return transactionMode;
}
 * distributed under the License is distributed on an "AS IS" BASIS,
    public long getTransactionStartTime() {
    public int getExecuteCount() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
    QMTransactionState(int executeCount, int updateCount, boolean transactionMode, long transactionStartTime) {
    }
    private long transactionStartTime;
