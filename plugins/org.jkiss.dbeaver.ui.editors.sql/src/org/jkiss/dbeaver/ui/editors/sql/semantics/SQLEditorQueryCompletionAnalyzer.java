            replacementOffset,
        return new SQLEditorQueryCompletionProposal(
            itemKind,
            description,
            replacementLength,
} * limitations under the License.
        int replacementOffset,
import org.jkiss.code.NotNull;
    ) {
 * Unless required by applicable law or agreed to in writing, software
        @NotNull SQLQueryCompletionItemKind itemKind,
 *     http://www.apache.org/licenses/LICENSE-2.0
        int replacementLength,
public class SQLEditorQueryCompletionAnalyzer extends SQLQueryCompletionAnalyzer {
            displayString,
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Nullable DBPImage image,

import org.jkiss.code.Nullable;
        @Nullable DBSObject object,
    private SQLEditorQueryCompletionProposalContext proposalContext;
import java.util.function.Function;
        );
 * distributed under the License is distributed on an "AS IS" BASIS,
            image,
/*
import org.jkiss.dbeaver.model.struct.DBSObject;
            object,


    }
        return this.proposalContext = new SQLEditorQueryCompletionProposalContext(this.request, completionContext.getRequestOffset());
        @NotNull Supplier<Integer> currentCompletionOffsetSupplier

    public SQLEditorQueryCompletionAnalyzer(
 *
import org.jkiss.dbeaver.model.sql.semantics.completion.*;
    @Override
    ) {
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionRequest;
 */
 *
            replacementString,
    @Override

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager

        @Nullable SQLQueryWordEntry filterString,
        @Nullable String displayString,
 * you may not use this file except in compliance with the License.
            decorationString,
    protected SQLQueryCompletionProposalContext createProposalContext(@NotNull SQLQueryCompletionContext completionContext) {
import java.util.function.Supplier;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPImage;
    }
            filterString,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull
        @NotNull Function<DBRProgressMonitor, SQLQueryCompletionContext> completionContextSupplier,
 * You may obtain a copy of the License at

        @NotNull String description,
            proposalScore
        @NotNull String replacementString,
        @Nullable String decorationString,

package org.jkiss.dbeaver.ui.editors.sql.semantics;
    }
    @NotNull
        int proposalScore
    protected SQLQueryCompletionProposal createProposal(
        super(completionContextSupplier, request, currentCompletionOffsetSupplier);
        @NotNull SQLCompletionRequest request,
 *
            this.proposalContext,
