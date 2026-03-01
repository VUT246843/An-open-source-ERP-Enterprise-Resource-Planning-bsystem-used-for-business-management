            Launcher<LanguageClient> launcher = LSPLauncher.createServerLauncher(server, in, out);
        @Nullable DBLServerSessionProvider sessionProvider
     * @param out an OutputStream with messages for the client
            LanguageClient client = launcher.getRemoteProxy();
 *
import org.jkiss.code.NotNull;
            log.info("the LSP client has closed the stream. " + client); //NON-NLS
package org.jkiss.dbeaver.model.lsp;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.concurrent.Future;
     */
 * A facade for accessing all LSP functionality from this package.
public final class DBLFacade {

     * This is a blocking call.
     *
        @NotNull InputStream in,
     * Runs an LSP using specified streams as a means of communication between a client and a server.
 * distributed under the License is distributed on an "AS IS" BASIS,
            log.info("Launching LSP server"); //NON-NLS
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 * See the License for the specific language governing permissions and

}
            Future<Void> launcherFuture = launcher.startListening();
 * you may not use this file except in compliance with the License.
        try {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.DBException;
 *
            server.connect(client);
    }
 */
 *
        @NotNull OutputStream out,
    }
import java.io.OutputStream;
import org.eclipse.lsp4j.services.LanguageClient;
    private DBLFacade() {
import org.jkiss.dbeaver.Log;
import org.eclipse.lsp4j.jsonrpc.Launcher;
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.lsp4j.launch.LSPLauncher;
     * @param in an InputStream with messages for the server
/**
/*
            throw new DBException("unexpected exception while running LSP server", e);

import java.util.concurrent.ExecutionException;

import org.jkiss.code.Nullable;
import java.io.InputStream;
            launcherFuture.get();
            DBLServer server = new DBLServer(sessionProvider);
    private static final Log log = Log.getLog(DBLFacade.class);

        } catch (InterruptedException | ExecutionException e) {
 */
    ) throws DBException {
    public static void runLanguageServer(
 * You may obtain a copy of the License at
