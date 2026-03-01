    public String getApplicationId() {

        private long operationStartTime;
    public String getOperationName() {
        @NotNull String operationName,
        return operationId.isEmpty();
    private final String operationName;
 * You may obtain a copy of the License at
        public Builder setApplicationId(String applicationId) {
 * See the License for the specific language governing permissions and
            this.operationStartTime = operationStartTime;
    private final String applicationId;
    }
            "",
        private String applicationId;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.operationName = operationName;
        private final String operationId;
public class FileLockInfo {
 * distributed under the License is distributed on an "AS IS" BASIS,
        return operationStartTime;
        public Builder setOperationStartTime(long operationStartTime) {
        @NotNull String operationId,
        return operationName;
        this.operationId = operationId;
            this.operationId = operationId;
 * Unless required by applicable law or agreed to in writing, software
    }


        public Builder setOperationName(String operationName) {
            "",



 *
    }
import org.jkiss.code.Nullable;
    }
    private FileLockInfo(
    }
 * you may not use this file except in compliance with the License.
        this.applicationId = applicationId;
        public FileLockInfo build() {
        }
    private final String operationId;
    public String getOperationId() {
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        return applicationId;
import org.jkiss.code.NotNull;
            return new FileLockInfo(applicationId, operationId, operationName, operationStartTime);
 * limitations under the License.
    public boolean isBlank() {

            this.operationName = operationName;
}
        );
        public Builder(String operationId) {
 */
        }
    @NotNull
    public static class Builder {
            System.currentTimeMillis()
        return operationId;

        private String operationName;
    @NotNull
    }

        }
 * DBeaver - Universal Database Manager

/*
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            return this;
    public long getOperationStartTime() {
            this.applicationId = applicationId;
 *

    static FileLockInfo emptyLock() {
    private final long operationStartTime;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.fs.lock;


            "",
        long operationStartTime




    ) {
 *
            return this;
        this.operationStartTime = operationStartTime;
        }
            return this;
        return new FileLockInfo(
        @NotNull String applicationId,
