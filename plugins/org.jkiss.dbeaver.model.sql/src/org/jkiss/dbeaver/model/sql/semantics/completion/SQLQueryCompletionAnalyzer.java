
            ));

                        text,
        if (offset >= 0 && offset + length <= this.request.getDocument().getLength()) {

            replacementLength,
 * See the License for the specific language governing permissions and
    @NotNull
                String text = item.apply(textProvider);
 * Licensed under the Apache License, Version 2.0 (the "License");
            case RESERVED -> DBIcon.SQL_TEXT;
 * you may not use this file except in compliance with the License.
        int proposalScore
        @NotNull String replacementString,
        @Nullable DBPImage image,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected final SQLCompletionRequest request;
            displayString,

        @NotNull String description,
        LSMInspections.SyntaxInspectionResult inspectionResult = completionContext.getInspectionResult();
import org.jkiss.dbeaver.Log;
                yield object == null ? DBIcon.TREE_TABLE : DBValueFormatting.getObjectImage(object);
import java.util.function.Function;
/*
 */
//            completionContext = this.editor.obtainCompletionContext(this.completionRequestPostion);
            case NEW_TABLE_NAME, USED_TABLE_NAME, RELATED_TABLE_NAME -> {
 *     http://www.apache.org/licenses/LICENSE-2.0
            } catch (BadLocationException e) {
            image,
            decorationString,
    }
        } else {
                DBSObject object = SQLQueryConnectionDummyContext.isDummyObject(item.getObject()) ? null : item.getObject();
                    String description = item.apply(SQLQueryCompletionDescriptionProvider.INSTANCE);
            replacementString,
    @NotNull
        this.result.set(result);
            this.proposalContext = this.createProposalContext(completionContext);

    }
                (inspectionResult.expectingTableReference() && item.getKind().isTableName) ||
                    ));
            proposalScore
            case PROCEDURE -> item.getObject() == null ? DBIcon.TREE_FUNCTION : DBValueFormatting.getObjectImage(item.getObject());
        }
    private final AtomicReference<Pair<Integer, List<SQLQueryCompletionProposal>>> result = new AtomicReference<>(Pair.of(null, Collections.emptyList()));

import org.jkiss.dbeaver.model.DBPImage;
        if (completionContext != null && requestContext.getDataSource() != null && requestContext.getExecutionContext() != null) {

                    String replacementString = this.prepareReplacementString(item, text, completionContext);

            }
            for (SQLQueryCompletionItem item : completionSet.getItems()) {
                        decoration,
            (!text.endsWith(" ") && this.proposalContext.isInsertSpaceAfterProposal() && (
import org.jkiss.dbeaver.model.struct.DBSObject;
    private final Supplier<Integer> currentCompletionOffsetSupplier;
                        replacementString,
            case COMPOSITE_FIELD_NAME -> DBIcon.TREE_DATA_TYPE;
            case SUBQUERY_ALIAS, RELATED_SUBQUERY_ALIAS -> DBIcon.TREE_TABLE_ALIAS;
        @Nullable SQLQueryWordEntry filterString,
//        }
        } else {
        return proposals;

        @Nullable String displayString,
    private String getTextFragmentAt(int offset, int length) {
import org.eclipse.jface.text.BadLocationException;

        //  correct fix requires better completion scenarios distinguishing to not prepare unnecessary items at all
    private List<SQLQueryCompletionProposal> prepareContextfulCompletion(DBRProgressMonitor monitor, SQLQueryCompletionContext completionContext) {
    public List<? extends SQLQueryCompletionProposal> getResult() {
            itemKind,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
            return null;
        };
        this.completionContextSupplier = completionContextSupplier;
                        this.prepareProposalImage(item),
public class SQLQueryCompletionAnalyzer implements DBRRunnableParametrized<DBRProgressMonitor> {
                        item.getFilterInfo(),
    @NotNull
            default -> throw new IllegalStateException("Unexpected completion item kind " + item.getKind());
            result = Pair.of(completionContext.getRequestOffset(), proposals);

    private static final Log log = Log.getLog(SQLCompletionAnalyzer.class);
    @NotNull
 * You may obtain a copy of the License at
        Pair<Integer, List<SQLQueryCompletionProposal>> result;
                ? completionContext.getRequestOffset()
 *
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionContext;
                    String decoration = item.apply(SQLQueryCompletionExtraTextProvider.INSTANCE);
        @NotNull Function<DBRProgressMonitor, SQLQueryCompletionContext> completionContextSupplier,
 * DBeaver - Universal Database Manager
        Set<String> texts = new HashSet<>();

    private String prepareReplacementString(@NotNull SQLQueryCompletionItem item, @NotNull String text, @NotNull SQLQueryCompletionContext completionContext) {
    @Override
            filterString,
    @NotNull
//            // but then he started typing again, before the context preparation was finished.
                return null;
import java.util.function.Supplier;
    private SQLQueryCompletionProposalContext proposalContext;
import java.util.concurrent.atomic.AtomicReference;


import org.jkiss.dbeaver.model.DBIcon;
        // FIXME forcibly exclude duplicated completions for now;
            int completionRequestPosition = completionContext != null
//        while (completionContext.getRequestOffset() != this.completionRequestPostion.getOffset()) {
        for (SQLQueryCompletionSet completionSet : completionSets) {
        int replacementLength,
                        object,

                        completionSet.getReplacementLength(),
        SQLQueryCompletionTextProvider textProvider = new SQLQueryCompletionTextProvider(this.request, completionContext, monitor);
    @NotNull
 * limitations under the License.
//            // No need to proceed with actual proposals preparation, we can just repeat the completion context preparation.
                        item.getScore()
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryConnectionDummyContext;
                        description,
            case TABLE_COLUMN_NAME -> DBIcon.TREE_COLUMN;
 *
    @NotNull

}        @Nullable DBSObject object,
    }
            case DERIVED_COLUMN_NAME -> DBIcon.TREE_DERIVED_COLUMN;

        return new SQLQueryCompletionProposal(

        this.request = request;
    }
    }
        @NotNull Supplier<Integer> currentCompletionOffsetSupplier
    public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                        completionSet.getReplacementPosition(),
        }

        @NotNull SQLCompletionRequest request,
            description,
        Collection<SQLQueryCompletionSet> completionSets = completionContext.prepareProposal(monitor, this.request);
    }
        return switch (item.getKind()) {
import org.jkiss.dbeaver.model.DBPObject;
import org.jkiss.dbeaver.model.stm.LSMInspections;
            result = Pair.of(completionRequestPosition, Collections.emptyList());
import org.jkiss.dbeaver.model.DBValueFormatting;
        this.currentCompletionOffsetSupplier = currentCompletionOffsetSupplier;
    @NotNull
    }
 *
    }
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionRequest;
import java.util.*;
import org.jkiss.code.Nullable;
            case SCHEMA, CATALOG, UNKNOWN ->  DBValueFormatting.getObjectImage(item.getObject());
                if (texts.add(text)) {
    public SQLQueryCompletionAnalyzer(
        return new SQLQueryCompletionProposalContext(this.request, completionContext.getRequestOffset());
        }
        List<SQLQueryCompletionProposal> proposals = new LinkedList<>();
            object,
    protected SQLQueryCompletionProposal createProposal(
import org.jkiss.utils.Pair;
        return whitespaceNeeded ? text + " " : text;
import org.jkiss.code.NotNull;
                return this.request.getDocument().get(offset, length);
import java.lang.reflect.InvocationTargetException;
    }
    protected SQLQueryCompletionProposalContext createProposalContext(@NotNull SQLQueryCompletionContext completionContext) {

            }
                ((inspectionResult.expectingColumnReference() || inspectionResult.expectingColumnName()) && item.getKind().isColumnName)
        );
package org.jkiss.dbeaver.model.sql.semantics.completion;

                    proposals.add(this.createProposal(
            replacementOffset,
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    protected DBPImage prepareProposalImage(@NotNull SQLQueryCompletionItem item) {
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionAnalyzer;
        return this.result.get().getFirst();
import org.jkiss.dbeaver.model.runtime.DBRRunnableParametrized;
    ) {
        return this.result.get().getSecond();
        boolean whitespaceNeeded = item.getKind() == SQLQueryCompletionItemKind.RESERVED ||
            try {
        SQLCompletionContext requestContext = this.request.getContext();
    public Integer getActualContextOffset() {
        @Nullable String decorationString,
                DBPObject object = item.getObject();
//            // Context preparation was initiated after the parsing when the user stopped typing,
        SQLQueryCompletionContext completionContext = this.completionContextSupplier.apply(monitor);
                }
            this.proposalContext,
                : this.currentCompletionOffsetSupplier.get();
    ) {
            List<SQLQueryCompletionProposal> proposals = this.prepareContextfulCompletion(monitor, completionContext);
        @NotNull SQLQueryCompletionItemKind itemKind,
        int replacementOffset,
                        item.getKind(),
    private final Function<DBRProgressMonitor, SQLQueryCompletionContext> completionContextSupplier;
            // TODO don't we want to be able to accomplish subqueries and such even without the connection?
            case JOIN_CONDITION -> DBIcon.TREE_CONSTRAINT;
