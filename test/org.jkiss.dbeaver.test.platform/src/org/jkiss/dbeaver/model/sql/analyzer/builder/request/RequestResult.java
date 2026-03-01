                    String originalString = r.getFirst().getDocument().get(p.getReplacementOffset(), p.getReplacementLength());
        }
        );
        public boolean isSearchInsideNames() {
            queryText,
        final Document document = new Document();

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        recognitionContext.reset();
    }
            ),
            return false;
        final SQLCompletionRequest request = prepareCompletionRequest(sql, simpleMode);
    private static class CompletionContext implements SQLCompletionContext {
        scriptItemContext.setHasContextBoundaryAtLength(false);
        final SQLSyntaxManager syntaxManager = new SQLSyntaxManager();
                new SQLScriptItemAtOffset(0, scriptItemContext),
        }
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Returns the list of proposals that semantic autocompletion engine returns for the provided text in simple mode
        when(executionContext.getDataSource()).thenReturn(dataSource);
    @NotNull
        @Override
        @Override
        Assert.assertNotNull(queryModel);
        return new Pair<>(sql.substring(0, cursor) + sql.substring(cursor + 1), cursor);
            request::getDocumentOffset


        ruleManager.loadRules(dataSource, false);
        this.dataSource = dataSource;
     * Returns the list of proposals that semantic autocompletion engine returns for the provided text
        final String queryText = request.getActiveQuery().getText();
    }
 * Unless required by applicable law or agreed to in writing, software
        @Override
 * You may obtain a copy of the License at
            request.getContext().getDataSource().getSQLDialect()
        String queryText,
        final SQLQueryCompletionAnalyzer analyzer = getSqlQueryCompletionAnalyzer(queryText, queryModel, request);
            dataSource,

                }
        }

        }


 *

        @Override
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
import org.eclipse.jface.text.Document;
    public List<SQLCompletionProposalBase> request(@NotNull String sql, boolean simpleMode) throws DBException {
    private static Pair<String, Integer> getCursorFromQuery(@NotNull String sql) {
            this.dataSource = dataSource;
        );
        private CompletionContext(DBPDataSource dataSource, SQLSyntaxManager syntaxManager, SQLRuleManager ruleManager, DBCExecutionContext executionContext) {
        @NotNull String sql,
        public SQLRuleManager getRuleManager() {
                    } else {
        @Override
            executionContext
        @Override
            cursor.getSecond(),
        final SQLCompletionContext context = new CompletionContext(
        SQLQueryRecognitionContext recognitionContext = new SQLQueryRecognitionContext(
}
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionProposal;
                request.getContext().getExecutionContext(),
        final SQLCompletionAnalyzer analyzer = new SQLCompletionAnalyzer(request);
import java.util.stream.Collectors;
                    }
            ruleManager,
                    if (originalString.equals(replacementFragment) && replacementFragment.endsWith(".")) {
    }
        return this.requestNewStrings(sql, true);
            request,
    /**
    }
        public boolean isShowServerHelp() {

        @Override
    @NotNull

import org.junit.Assert;
            analyzer.run(monitor);
        syntaxManager.init(dataSource.getSQLDialect(), dataSource.getContainer().getPreferenceStore());
            return false;
            request.getContext().getExecutionContext(),

        private final SQLRuleManager ruleManager;
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionAnalyzer;
        }
        SQLDocumentScriptItemSyntaxContext scriptItemContext = new SQLDocumentScriptItemSyntaxContext(
        SQLQueryModel queryModel = SQLQueryModelRecognizer.recognizeQuery(recognitionContext, queryText);
        public boolean isUseFQNames() {
    public List<SQLCompletionProposalBase> request(@NotNull String sql) throws DBException {
        }
        public DBPDataSource getDataSource() {
        );
        public SQLCompletionProposalBase createProposal(@NotNull SQLCompletionRequest request, @NotNull String displayString, @NotNull String replacementString, int cursorPosition, @Nullable DBPImage image, @NotNull DBPKeywordType proposalType, @Nullable String description, @Nullable DBPNamedObject object, @NotNull Map<String, Object> params) {
    ) throws DBException {

            true,
        @Override
            simpleMode
        analyzer.setCheckNavigatorNodes(false);
        public int getInsertCase() {
import org.jkiss.dbeaver.model.sql.semantics.SQLScriptItemAtOffset;
        }
            monitor,
            return syntaxManager;
    @NotNull
            return false;
import java.util.Set;
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionProposalBase;
    private final DBPDataSource dataSource;
        }

import org.jkiss.dbeaver.model.sql.semantics.SQLDocumentScriptItemSyntaxContext;
            context,
    @NotNull
        }
    }

    /**

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.code.Nullable;
        return request(sql, true);
        @Override
            return false;
    ) {
import java.util.Map;
        }
        boolean simpleMode

    public Set<String> requestNewStrings(@NotNull String sql, boolean simpleMode) throws DBException {

        public boolean isHideDuplicates() {
        var r = this.requestNewInternal(sql, simpleMode);
    }
        analyzer.runAnalyzer(new VoidProgressMonitor());
        @Override
            throw new DBException("Error while preparing completion proposals", e);
            return false;
                        return p.getReplacementString();
        document.set(cursor.getFirst());
            return true;
public class RequestResult {
import org.jkiss.dbeaver.model.sql.SQLQuery;
import static org.mockito.Mockito.when;
                throw new RuntimeException(e);
 *
                request.getContext().getDataSource().getSQLDialect()
            return PROPOSAL_CASE_DEFAULT;
        public boolean isSearchGlobally() {
        );

        } catch (InvocationTargetException | InterruptedException e) {
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
    private Pair<SQLCompletionRequest, List<? extends SQLQueryCompletionProposal>> requestNewInternal(
            return false;
    public Set<String> requestNewStrings(@NotNull String sql) throws DBException {
        SQLQueryModel queryModel,
            return dataSource;
            document,

import org.jkiss.dbeaver.model.sql.completion.SQLCompletionContext;
            } catch (BadLocationException e) {
        return analyzer.getProposals();
import java.util.List;
 */
        return r.getSecond().stream().map(p -> {
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionAnalyzer;

        @Override
            request.getContext().getSyntaxManager(),
        @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
        final SQLCompletionRequest request = new SQLCompletionRequest(
            queryModel,
        try {

 * distributed under the License is distributed on an "AS IS" BASIS,
    public RequestResult(@NotNull DBPDataSource dataSource) {

            return false;
            new SQLQuery(context.getDataSource(), cursor.getFirst()),
import static org.mockito.Mockito.mock;
        return request;
            true,
    }
        public boolean isSortAlphabetically() {
            return executionContext;
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryModelRecognizer;
        public boolean isUseShortNames() {
    @NotNull
            this.ruleManager = ruleManager;
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
import org.jkiss.code.NotNull;
        }
            throw new IllegalArgumentException("Can't locate cursor in query");

        @Override
import org.jkiss.dbeaver.model.DBPNamedObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionRequest;
 * DBeaver - Universal Database Manager
 * limitations under the License.

            return false;
        private final DBPDataSource dataSource;
        @Override

            return false;
import org.jkiss.utils.Pair;
        @Override
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        final Pair<String, Integer> cursor = getCursorFromQuery(sql);
        final DBRProgressMonitor monitor = new VoidProgressMonitor();
                        return p.getReplacementString().substring(replacementFragment.length());
        );

 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.model.DBPKeywordType;
                    String replacementFragment = p.getReplacementString().substring(0, originalString.length());
        public boolean isReplaceWords() {
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;
        final SQLQueryCompletionAnalyzer analyzer = new SQLQueryCompletionAnalyzer(

        @Override

        public boolean isShowValues() {
        final DBCExecutionContext executionContext = mock(DBCExecutionContext.class);
            return ruleManager;
import java.lang.reflect.InvocationTargetException;
            queryText.length()

    }
            this.executionContext = executionContext;
        }).collect(Collectors.toSet());

            0,
     */
    }
                    return p.getReplacementString();
     */
        return Pair.of(request, analyzer.getResult());
            m -> SQLQueryCompletionContext.prepareCompletionContext(
        public boolean isForceQualifiedColumnNames() { return false; }
        private final SQLSyntaxManager syntaxManager;
        public boolean isSearchProcedures() {
                request.getDocumentOffset(),
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionContext;
        }
            return new SQLCompletionProposalBase(request, displayString, replacementString, cursorPosition, image, proposalType, description, object, params);

import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;



package org.jkiss.dbeaver.model.sql.analyzer.builder.request;
            }
            try {
/*

        }
        final SQLRuleManager ruleManager = new SQLRuleManager(syntaxManager);
    @NotNull

        SQLCompletionRequest request

            this.syntaxManager = syntaxManager;
import org.jkiss.dbeaver.DBException;
        public SQLSyntaxManager getSyntaxManager() {
        }
                if (p.getReplacementLength() > 0) {
        return analyzer;
import org.eclipse.jface.text.BadLocationException;
        @Override
        public DBCExecutionContext getExecutionContext() {

            syntaxManager,
        final SQLCompletionRequest request = prepareCompletionRequest(sql, simpleMode);
    private static SQLQueryCompletionAnalyzer getSqlQueryCompletionAnalyzer(

        }
        final int cursor = sql.indexOf('|');
    private SQLCompletionRequest prepareCompletionRequest(@NotNull String sql, boolean simpleMode) {

        private final DBCExecutionContext executionContext;

import org.jkiss.dbeaver.model.DBPImage;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModel;

        if (cursor < 0) {
                } else {
        }
