
class DBLWorkspaceService implements WorkspaceService {

import org.eclipse.lsp4j.DidChangeWatchedFilesParams;
    public void didChangeConfiguration(@NotNull DidChangeConfigurationParams params) {
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override
 * limitations under the License.
import org.jkiss.dbeaver.Log;
        log.debug(params);
    @Override
 * You may obtain a copy of the License at
 *
    }
 */
package org.jkiss.dbeaver.model.lsp;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.lsp4j.DidChangeConfigurationParams;
/*

 *
 *
 * See the License for the specific language governing permissions and
        log.debug(params);
    private static final Log log = Log.getLog(DBLWorkspaceService.class);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.lsp4j.services.WorkspaceService;
}
import org.jkiss.code.NotNull;
    public void didChangeWatchedFiles(@NotNull DidChangeWatchedFilesParams params) {
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
