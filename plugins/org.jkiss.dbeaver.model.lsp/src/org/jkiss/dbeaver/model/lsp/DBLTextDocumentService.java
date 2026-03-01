
        SQLTokenType.T_STRING, new Pair<>(1, SemanticTokenTypes.String)
    ) {
        }
 */

        ContextAwareDocument document = documentCache.get(documentUri);

            return new SemanticTokens();

 * distributed under the License is distributed on an "AS IS" BASIS,
        int lineOffset = 0;
    public static final List<String> SUPPORTED_TOKEN_MODIFIERS = List.of(

        } catch (IllegalArgumentException e) {
    public static final Map<SQLTokenType, Pair<Integer, String>> SUPPORTED_TOKEN_TYPES = Map.of(
            document.getSyntaxManager(),

                charOffset += region.getLength();

        documentCache.put(document.getUri(), ContextAwareDocument.from(document));
            } catch (Exception e) {

                return Either.forRight(new CompletionList());
        document.setRuleManager(ruleManager);
    @Override
            existingDocument.setVersion(document.getVersion());
    ) {
            data.add(lineOffset);
            Pair<Integer, String> tokenDefinition = SUPPORTED_TOKEN_TYPES.get(sqlTokenType);

    }
            log.error("Semantic tokens requested for an unknown document " + documentUri);
import java.util.concurrent.CompletableFuture;
        String projectId = documentUri.getProjectId();
import org.eclipse.lsp4j.*;
    @Nullable
        log.debug("\"formatting with params: \"" + params);
        if (existingDocument == null) {
        try {
            document.setExecutionContext(DBUtils.getOrOpenDefaultContext(dataSourceContainer, false));
 * URI format: lsp://{projectId}/{resourcePath}
        @NotNull SemanticTokensParams params,
            initContext(uri);
            DocumentURI uri = new DocumentURI(document.getUri());
        return CompletableFutures.computeAsync(cancelChecker -> semanticTokensFull(params, cancelChecker));
public class DBLTextDocumentService implements TextDocumentService, LanguageClientAware {
                sqlTokenType = (SQLTokenType) tpTokenDefault.getData();
        this.sessionProvider = null;
    private final DBLServerSessionProvider sessionProvider;
    public CompletableFuture<SemanticTokens> semanticTokensFull(@NotNull SemanticTokensParams params) {
        cancelChecker.checkCanceled();
    }
        SQLFormatterConfiguration sqlFormatterConfiguration = new SQLFormatterConfiguration(

        String documentUri = params.getTextDocument().getUri();
        Position startPosition = new Position(0, 0);
        }
    }
            log.warn(String.format("Change registered for an unknown document %s, Skipping", document.getUri()));
import org.jkiss.dbeaver.model.exec.DBCException;

        List<Integer> data = new ArrayList<>();
            if (dataSourceId != null) {
            log.error(String.format("Completion requested for an unknown document %s", documentUri));
import java.util.ArrayList;
            return List.of();

import org.jkiss.utils.Pair;
            // Note: default datasource id is defined as a resource property:
        @NotNull CancelChecker cancelChecker
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
        SQLDialect dialect = BasicSQLDialect.INSTANCE;
    // TODO: think about creating an incremental formatter instead of replacing the whole document
        });

        } else if (document.getExecutionContext() == null) {
import org.jkiss.dbeaver.model.DBConstants;
                return completion(params, cancelChecker);
import org.eclipse.lsp4j.services.LanguageClient;
            // This is a chunk of token data describing one token
        SQLTokenType.T_KEYWORD, new Pair<>(0, SemanticTokenTypes.Keyword),
    public void didChange(@NotNull DidChangeTextDocumentParams params) {
    @NotNull
                continue;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        LspSQLRuleManager ruleManager = new LspSQLRuleManager(syntaxManager);

import org.eclipse.lsp4j.jsonrpc.CompletableFutures;
    private static final Log log = Log.getLog(DBLTextDocumentService.class);
    @Override
/**
    );
    @Override
        this.sessionProvider = sessionProvider;
            data.add(tokenDefinition.getFirst());
            }
            new Document(document.getText()),
        @NotNull CompletionParams params,
 *
    public void didSave(@NotNull DidSaveTextDocumentParams params) {
        @NotNull CancelChecker cancelChecker
import org.jkiss.dbeaver.model.sql.SQLDialect;

        }
    private void initContext(@NotNull DocumentURI documentUri) {
import org.jkiss.dbeaver.model.sql.format.tokenized.SQLFormatterTokenized;
        ));
        VersionedTextDocumentIdentifier document = params.getTextDocument();
            // There should be exactly one change since we use TextDocumentSyncKind.Full
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionContext;
import org.jkiss.dbeaver.DBException;
    @Override
    }
        SQLSyntaxManager syntaxManager = resolveSyntaxManager(dataSourceContainer);
import org.jkiss.dbeaver.model.lsp.context.LspSQLCompletionContext;


    @Override
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
                dataSourceContainer = project.getDataSourceRegistry().getDataSource(dataSourceId);
                log.error("Error when getting completion items: ", e);
            // in Cloudbeaver - from front-end - LocalResourceController#setResourceProperty
        );
            // in Desktop - EditorUtils#setInputDataSource

            log.warn("Formatting requested for an unknown document " + documentUri);
        List<TextDocumentContentChangeEvent> contentChanges = params.getContentChanges();

            if (tokenDefinition == null || tokenDefinition.getFirst() == null) {
import java.util.concurrent.ConcurrentHashMap;
 * limitations under the License.
    private Either<List<CompletionItem>, CompletionList> completion(
    public void connect(@NotNull LanguageClient client) {
import org.jkiss.dbeaver.model.text.parser.TPTokenDefault;
 *     http://www.apache.org/licenses/LICENSE-2.0
        Range range = new Range(startPosition, LSPUtils.lastTextPosition(document.getText()));
        if (document == null) {

        SQLFormatter sqlFormatter = new SQLFormatterTokenized();
        int offset = LSPUtils.positionToOffset(document.getText(), params.getPosition());
    private final Map<String, ContextAwareDocument> documentCache = new ConcurrentHashMap<>();

        if (document == null) {
        documentCache.remove(params.getTextDocument().getUri());
        cancelChecker.checkCanceled();
 * Copyright (C) 2010-2025 DBeaver Corp and others
        LspSQLIndentifierDetector detector = new LspSQLIndentifierDetector(document.getSyntaxManager().getDialect());
import org.eclipse.lsp4j.jsonrpc.CancelChecker;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
        }
                charOffset = 0;
        }
        document.setSyntaxManager(syntaxManager);
        if (project != null) {
        log.debug("\"semanticTokensFull with params: \"" + params);

import org.jkiss.dbeaver.model.lsp.context.LspSQLCompletionContextParser;

            try {
import org.jkiss.dbeaver.model.lsp.context.LspSQLRuleManager;
            Region region = pair.getSecond();
}
import org.eclipse.jface.text.Region;
        if (contentChanges.size() != 1) {
package org.jkiss.dbeaver.model.lsp;
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
import org.jkiss.dbeaver.model.lsp.utils.LSPUtils;
import org.jkiss.dbeaver.model.DBUtils;
        syntaxManager.init(dialect, DBWorkbench.getPlatform().getPreferenceStore());
    }
    public CompletableFuture<Either<List<CompletionItem>, CompletionList>> completion(@NotNull CompletionParams params) {
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
        DBPDataSourceContainer dataSourceContainer = null;

        return syntaxManager;
        ContextAwareDocument document = documentCache.get(documentUri);
 * See the License for the specific language governing permissions and
            } else {
        ContextAwareDocument document = documentCache.get(documentUri);
    );
        @NotNull DocumentFormattingParams params,
import org.jkiss.dbeaver.model.app.DBPProject;

            LspSQLCompletionContextParser.createCompletionsList(document, offset, completionContext)
        SQLSyntaxManager syntaxManager = new SQLSyntaxManager();
            data.add(0); // Only "declaration" modifier is supported now. Update if more modifiers are added.
import org.eclipse.lsp4j.services.TextDocumentService;
        log.debug("Initialized context for text document " + document);

    private SQLSyntaxManager resolveSyntaxManager(@Nullable DBPDataSourceContainer dataSourceContainer) {
            log.warn(String.format(
import org.jkiss.code.NotNull;
    }
import org.jkiss.dbeaver.model.sql.format.SQLFormatterConfiguration;
        for (Pair<TPToken, Region> pair : tokens) {
    public CompletableFuture<List<? extends TextEdit>> formatting(@NotNull DocumentFormattingParams params) {
    @NotNull
        int charOffset = 0;
        return Either.forRight(new CompletionList(
                continue;
    @NotNull
            throw new IllegalArgumentException("Unexpected number of document changes: " + contentChanges.size());
        ContextAwareDocument existingDocument = documentCache.get(document.getUri());
            data.add(charOffset);
    public DBLTextDocumentService() {
            log.error(String.format("Completion requested for a document with no execution context %s", documentUri));
            }
    @Override
    ) throws InterruptedException, InvocationTargetException, DBException {
        } else {
            return Either.forRight(new CompletionList());

            } else if (tpToken instanceof TPTokenDefault tpTokenDefault) {

            return;
        try {

                lineOffset++;
                project.getResourceProperty(documentUri.getResourcePath(), DBConstants.PROP_RESOURCE_DEFAULT_DATASOURCE)
        }

            );
        ruleManager.loadRules(dataSourceContainer, false);
            }
import org.eclipse.lsp4j.services.LanguageClientAware;

        if (document == null) {
        return CompletableFutures.computeAsync(cancelChecker -> {
 */
    }
            document.getExecutionContext(),

            document.getSyntaxManager()
            TPToken tpToken = pair.getFirst();
            SQLTokenType sqlTokenType;
        return new SemanticTokens(data);
    @NotNull
            if (tpToken.isNewline()) {
            dialect = dataSourceContainer.getDataSource().getSQLDialect();
 *
            document.getRuleManager()
    }
    }
                "Failed to determine default execution context for document %s. Proceeding without it.", documentUri
        return List.of(new TextEdit(range, formattedText));
        );
        String documentUri = params.getTextDocument().getUri();

            String dataSourceId = String.valueOf(
            log.error("Error initiating document context. Proceeding with default. ", e);
    }
        }
 * You may obtain a copy of the License at

import java.lang.reflect.InvocationTargetException;
import org.jkiss.dbeaver.Log;
            document.getDataSource(),
        List<Pair<TPToken, Region>> tokens = detector.extractAllTokens(
        log.debug("didOpen with params: " + params);
 * The DBLTextDocumentService class proves services for managing, manipulating,
        if (dataSourceContainer != null && dataSourceContainer.getDataSource() != null) {
        log.debug("didChange with params: " + params);
            ));

    public void didClose(@NotNull DidCloseTextDocumentParams params) {
            data.add(region.getLength());
    public void didOpen(@NotNull DidOpenTextDocumentParams params) {
        }
    }

    @Override


        ContextAwareDocument document = documentCache.get(documentUri.getValue());
            charOffset += region.getLength();
import java.util.Map;
        }

            return Either.forRight(new CompletionList());
            existingDocument.setText(contentChanges.getFirst().getText());
    }
        String documentUri = params.getTextDocument().getUri();
    public DBLTextDocumentService(@Nullable DBLServerSessionProvider sessionProvider) {
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.runtime.DBWorkbench;

    // TODO: think about implementing semanticTokensFullDelta and/or semanticTokensRange
    }
        return CompletableFutures.computeAsync(cancelChecker -> formatting(params, cancelChecker));
            sessionProvider.getWorkspace().getProject(projectId) :
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        String formattedText = sqlFormatter.format(document.getText(), sqlFormatterConfiguration);
        } catch (DBCException e) {
        if (document == null) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
            document.getRuleManager()
        }

            }
        TextDocumentItem document = params.getTextDocument();
import org.jkiss.dbeaver.model.sql.format.SQLFormatter;

    }
import org.eclipse.jface.text.Document;
        DBPProject project = sessionProvider != null ?
    private List<? extends TextEdit> formatting(
        log.debug("\"completion with params: \"" + params);
    @NotNull


        "declaration"
    @Override
        cancelChecker.checkCanceled();
import org.jkiss.dbeaver.model.lsp.context.ContextAwareDocument;
            document.getDataSource(),
/*
import org.jkiss.dbeaver.model.text.parser.TPToken;
        log.debug("\"didClose with params: \"" + params);

    }
            DBWorkbench.getPlatform().getWorkspace().getProject(projectId);
        @NotNull CancelChecker cancelChecker
 * and analyzing text documents in the context of a language server.
        log.debug("\"didSave with params: \"" + params);
        SQLCompletionContext completionContext = new LspSQLCompletionContext(
            log.warn(String.format("Unknown document %s, Skipping context init", documentUri));
        );
    private SemanticTokens semanticTokensFull(
        }
                sqlTokenType = SQLTokenType.T_OTHER;
 * DBeaver - Universal Database Manager
import java.util.List;
