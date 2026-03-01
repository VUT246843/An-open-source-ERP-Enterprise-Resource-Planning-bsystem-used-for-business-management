            .withSendColumnTypes(sendColumnTypes)
                sendForeignKeys
        }
 * you may not use this file except in compliance with the License.

}

            this.maxDbSnapshotTokens = maxDbSnapshotTokens;

    public static Builder builder() {
        }
        public Builder withMaxDbSnapshotTokens(int maxDbSnapshotTokens) {
            return this;
 * See the License for the specific language governing permissions and

        private boolean sendForeignKeys;
 * Unless required by applicable law or agreed to in writing, software
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        private boolean sendObjectComment;
            .withMaxDbSnapshotTokens(maxDbSnapshotTokens)
    boolean sendColumnTypes,
package org.jkiss.dbeaver.model.ai;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        public Builder withSendObjectComment(boolean sendObjectDescription) {
    }
            return new AISchemaGenerationOptions(
            return this;
        }


            return this;
 * distributed under the License is distributed on an "AS IS" BASIS,
        public Builder withSendForeignKeys(boolean sendForeignKeys) {
        public Builder withSendConstraints(boolean sendConstraints) {
 *
 * You may obtain a copy of the License at
        private boolean sendColumnTypes;
        }

 * Licensed under the Apache License, Version 2.0 (the "License");

    boolean sendConstraints,
    boolean sendObjectComment,
        return new Builder()
    boolean sendForeignKeys
            .withSendForeignKeys(sendForeignKeys);
 *
        public Builder withSendColumnTypes(boolean sendColumnTypes) {
 */
        private Builder() {
    public static final class Builder {

            return this;
) {
                sendObjectComment,
        private int maxDbSnapshotTokens;
 * limitations under the License.
            return this;
/*
            this.sendForeignKeys = sendForeignKeys;
    }
            .withSendConstraints(sendConstraints)
                maxDbSnapshotTokens,
            this.sendObjectComment = sendObjectDescription;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            this.sendConstraints = sendConstraints;
        public AISchemaGenerationOptions build() {
        }

            this.sendColumnTypes = sendColumnTypes;

                sendConstraints,
        private boolean sendConstraints;
            );
 *
    int maxDbSnapshotTokens,
        return new Builder();
            .withSendObjectComment(sendObjectComment)
    public Builder toBuilder() {
public record AISchemaGenerationOptions(
                sendColumnTypes,
    }
 * DBeaver - Universal Database Manager
        }
