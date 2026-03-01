
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 * You may obtain a copy of the License at
    public SQLQueryCompletionProposalContext(@NotNull SQLCompletionRequest completionRequest, int requestOffset) {

import org.jkiss.dbeaver.model.sql.completion.SQLCompletionActivityTracker;
 *
    private final int requestOffset;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final SQLCompletionRequest completionRequest;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
    public boolean isInsertSpaceAfterProposal() {
 * DBeaver - Universal Database Manager
        return false;
    public SQLCompletionActivityTracker getActivityTracker() {
    public int getRequestOffset() {
    @NotNull
package org.jkiss.dbeaver.model.sql.semantics.completion;
}
 * you may not use this file except in compliance with the License.
    }
        this.completionRequest = completionRequest;

 *
        return this.requestOffset;
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionContext;

        return this.completionRequest.getActivityTracker();

/*
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.


public class SQLQueryCompletionProposalContext {
 */
import org.jkiss.code.NotNull;
        return this.completionRequest.getContext();
 * Unless required by applicable law or agreed to in writing, software
    }
    public SQLCompletionContext getCompletionContext() {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

        this.requestOffset = requestOffset;
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionRequest;
