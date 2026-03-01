 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
 * limitations under the License.
package org.jkiss.dbeaver.model.lsp;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * This interface defines methods to retrieve session details and workspace context.
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.auth.impl.AbstractSessionPersistent;
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Represents a provider for session handling on the LSP server side.
 */
    DBPWorkspace getWorkspace();
 */
import org.jkiss.code.Nullable;


    @NotNull

public interface DBLServerSessionProvider {
 *     http://www.apache.org/licenses/LICENSE-2.0
    AbstractSessionPersistent getSession();
import org.jkiss.dbeaver.model.app.DBPWorkspace;
    @Nullable
 * DBeaver - Universal Database Manager
 *
/*
 *
/**
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
}
