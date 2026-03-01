
    @Override


import java.util.concurrent.CompletableFuture;
    @NotNull
            clientAwareTextDocumentService.connect(client);
         * TODO:
        //https://microsoft.github.io/language-server-protocol/specifications/specification-current/#textDocument_formatting
        return serverCapabilities;
    }
        List<String> supportedTokens = DBLTextDocumentService.SUPPORTED_TOKEN_TYPES.values().stream().map(Pair::getSecond).toList();
        serverCapabilities.setCompletionProvider(new CompletionOptions());
package org.jkiss.dbeaver.model.lsp;
    @Override
        ServerCapabilities serverCapabilities = new ServerCapabilities();
    @Override
        SemanticTokensWithRegistrationOptions tokenProvider = new SemanticTokensWithRegistrationOptions(legend);

         */
    }
        textDocumentSyncOptions.setWillSave(false);
import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return workspaceService;
        textDocumentSyncOptions.setChange(TextDocumentSyncKind.Full);
    public void exit() {
        String serverVersion = GeneralUtils.getPlainVersion(); //NON-NLS
    public TextDocumentService getTextDocumentService() {
    }
    public DBLServer(@Nullable DBLServerSessionProvider sessionProvider) {
        return textDocumentService;

 * Unless required by applicable law or agreed to in writing, software
    public WorkspaceService getWorkspaceService() {
    @NotNull
        List<String> supportedModifiers = DBLTextDocumentService.SUPPORTED_TOKEN_MODIFIERS;

import org.jkiss.code.NotNull;

    @NotNull
    }
        log.debug(params);
 *
         * The server should exit with success code 0 if the shutdown request has been received before; otherwise with error code 1."

        serverCapabilities.setDocumentFormattingProvider(new DocumentFormattingOptions());

    private ClientInfo clientInfo;
    private static final Log log = Log.getLog(DBLServer.class);
    public void connect(@NotNull LanguageClient client) {
import org.jkiss.dbeaver.utils.GeneralUtils;
    @Override
        return CompletableFuture.completedFuture(new InitializeResult(serverCapabilities, serverInfo));
import org.jkiss.utils.Pair;


    @Override

    @Nullable
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0
}
    }
    private static final String SERVER_NAME = "DBeaver language server"; //NON-NLS
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (textDocumentService instanceof LanguageClientAware clientAwareTextDocumentService) {

        ServerInfo serverInfo = new ServerInfo(SERVER_NAME, serverVersion);
        //https://microsoft.github.io/language-server-protocol/specifications/lsp/3.17/specification/#textDocument_completion
        TextDocumentSyncOptions textDocumentSyncOptions = new TextDocumentSyncOptions();
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
        this.textDocumentService = new DBLTextDocumentService(sessionProvider);
    @NotNull
import org.eclipse.lsp4j.*;
        log.info("shutdown request received by the language server. " + clientInfo); //NON-NLS
        textDocumentSyncOptions.setOpenClose(true);
        ServerCapabilities serverCapabilities = buildServerCapabilities(textDocumentSyncOptions);
 * See the License for the specific language governing permissions and
    private final WorkspaceService workspaceService;
        SemanticTokensLegend legend = new SemanticTokensLegend(supportedTokens, supportedModifiers);
/*
import org.jkiss.dbeaver.Log;
        this.workspaceService = new DBLWorkspaceService();
    public CompletableFuture<InitializeResult> initialize(@NotNull InitializeParams params) {
        //https://microsoft.github.io/language-server-protocol/specifications/lsp/3.17/specification/#textDocument_semanticTokens
    private static ServerCapabilities buildServerCapabilities(@NotNull TextDocumentSyncOptions options) {
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
    }
 *
import org.eclipse.lsp4j.services.*;
 * limitations under the License.
 *
    @Override
        serverCapabilities.setTextDocumentSync(options);
    private final DBLTextDocumentService textDocumentService;
         * The spec says: "A notification to ask the server to exit its process.
        log.info("exit notification received by the language server. " + clientInfo); // NON-NLS
 * Licensed under the Apache License, Version 2.0 (the "License");
    public CompletableFuture<Object> shutdown() {
    @NotNull
        serverCapabilities.setSemanticTokensProvider(tokenProvider);
         * Let's ignore it for now as it's not clear at this point what to do.
public final class DBLServer implements LanguageServer, LanguageClientAware {

        textDocumentSyncOptions.setWillSaveWaitUntil(false);
        }

        //https://microsoft.github.io/language-server-protocol/specifications/specification-current/#textDocument_synchronization
        log.info("LSP client connected: " + client); // NON-NLS
        clientInfo = params.getClientInfo();
    @NotNull
        /*
        return CompletableFuture.completedFuture(this);
        textDocumentSyncOptions.setSave(false);

import java.util.List;
    @NotNull
        log.info("LSP client sent an initialize request. " + clientInfo); //NON-NLS


