            parserContext.getPreferenceStore(),
            completionContext.getSyntaxManager(),
    ) {
                request,
            request.getContext().getRuleManager(),
        @NotNull String query,
import org.jkiss.dbeaver.model.sql.completion.CompletionProposalBase;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static List<CompletionItem> createCompletionsList(
        SQLScriptElement activeQuery = SQLScriptParser.extractActiveQuery(parserContext, offset, 0);
        boolean useDefaultCompletionEngine = DEFAULT_ENGINE_COMPLETION.equalsIgnoreCase(DBWorkbench.getPlatform().getPreferenceStore()
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.sql.parser.SQLParserContext;
                ),
            false
import java.util.ArrayList;
        Document doc = new Document(document.getText());
            analyzer.run(new VoidProgressMonitor());
        } else {
 * See the License for the specific language governing permissions and
        );
 * Unless required by applicable law or agreed to in writing, software
            offset,
        }
    @NotNull
 * limitations under the License.
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionAnalyzer;
        );
        }
            syntaxContext.registerScriptItemContext(
                request.getContext().getExecutionContext(),

import org.jkiss.dbeaver.model.sql.semantics.SQLDocumentSyntaxContext;
}
import org.jkiss.dbeaver.model.sql.semantics.SQLScriptItemAtOffset;
        );
            );
            document
            SQLQueryCompletionAnalyzer analyzer = new SQLQueryCompletionAnalyzer(
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionAnalyzer;
        SQLParserContext parserContext = new SQLParserContext(
    ) throws InterruptedException, InvocationTargetException, DBException {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            .getString(SQLModelPreferences.AUTOCOMPLETION_MODE));


        var scriptItems = SQLScriptParser.parseScript(
            );
                m -> LspSQLCompletionContextParser.obtainCompletionContext(

        if (!useDefaultCompletionEngine) {
                item.getLength(),
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionRequest;

        return proposals.stream()
            request.getContext().getDataSource(),
            parserContext.getDataSource(),
            return SQLQueryCompletionContext.prepareCompletionContext(
import org.jkiss.dbeaver.model.sql.SQLScriptElement;
import java.util.List;
import org.jkiss.code.NotNull;
        SQLParserContext parserContext = new SQLParserContext(
            completionContext,
            return SQLQueryCompletionContext.prepareOffquery(0, position);
            parserContext.getDialect(),
        for (var item : scriptItems) {
        @NotNull DBRProgressMonitor monitor,
                    request
        int position,
 */
            analyzer.setCheckNavigatorNodes(false);
    @NotNull
            );
            document.get()
            activeQuery,
                item.getOriginalText(),
            analyzer.runAnalyzer(new VoidProgressMonitor());
import org.eclipse.jface.text.Document;
            scriptItem.item.setHasContextBoundaryAtLength(false);
                    DBWorkbench.getPlatform().getPreferenceStore().getBoolean(SQLModelPreferences.VALIDATE_FUNCTIONS),
            .toList();
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionContext;
import org.jkiss.dbeaver.model.sql.SQLModelPreferences;
 * distributed under the License is distributed on an "AS IS" BASIS,
        int maxResults = 200;
            SQLCompletionAnalyzer analyzer = new SQLCompletionAnalyzer(request);
                position,
                item.getOriginalText()
            request.getContext().getSyntaxManager(),

import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionContext;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                scriptItem,
        SQLScriptItemAtOffset scriptItem = syntaxContext.findScriptItem(position);
                    true,
        @NotNull SQLCompletionContext completionContext
        if (proposals.size() > maxResults) {
    // FIXME: Mostly copy-pasted from WebSQLCompletionContextScriptParser.obtainCompletionContext
import org.jkiss.dbeaver.DBException;
            var model = SQLQueryModelRecognizer.recognizeQuery(
/*
                model,
                    document.getText(),
import org.eclipse.lsp4j.CompletionItem;
            .map(p -> new CompletionItem(p.getReplacementString()))
        );
    private static final String DEFAULT_ENGINE_COMPLETION = "DEFAULT";
            );
            doc
            proposals = proposals.subList(0, maxResults);
                    request.getContext().getDataSource().getSQLDialect()
        } else {
 *
public class LspSQLCompletionContextParser {
        SQLCompletionRequest request = new SQLCompletionRequest(
        SQLDocumentSyntaxContext syntaxContext = new SQLDocumentSyntaxContext();
        SQLCompletionRequest request
        @NotNull ContextAwareDocument document,
                    new VoidProgressMonitor(),
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.lsp.context;
                item.getOffset(),

            completionContext.getRuleManager(),
        Document document = new Document(query);
                    request.getContext().getSyntaxManager(),
                ),
                request::getDocumentOffset
                true
import org.jkiss.dbeaver.model.sql.parser.SQLScriptParser;
        }
    public static SQLQueryCompletionContext obtainCompletionContext(
 *
                    request.getContext().getExecutionContext(),
 * You may obtain a copy of the License at

                    monitor,
        int offset,
                request.getContext().getDataSource().getSQLDialect()
 * you may not use this file except in compliance with the License.
    }
                    offset,
        }
            doc,

 * DBeaver - Universal Database Manager
        if (scriptItem != null) {
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
            proposals.addAll(analyzer.getProposals());
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 *
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryModelRecognizer;
    // FIXME: Mostly copy-pasted from WebServiceSQL.getCompletionProposals
                new SQLQueryRecognitionContext(
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
import java.lang.reflect.InvocationTargetException;
        List<CompletionProposalBase> proposals = new ArrayList<>();
            proposals.addAll(analyzer.getResult());
            document.getDataSource(),
