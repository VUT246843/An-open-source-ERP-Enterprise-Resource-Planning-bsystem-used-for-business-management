    public DatabaseEditorContext getDatabaseEditorContext() {

import org.jkiss.code.NotNull;
    }
    private DatabaseEditorContext databaseEditorContext;
    public String toString() {
import org.eclipse.core.filesystem.IFileStore;
}
    private final Path includedScriptFile;
 * You may obtain a copy of the License at
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.


    public void setDatabaseEditorContext(@Nullable DatabaseEditorContext databaseEditorContext) {
        return includedScriptFile.toUri();
    @Override
 *
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.databaseEditorContext = databaseEditorContext;

/*
    @Nullable
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
    public Path getIncludedScriptFile() {
    }
    }
public class IncludedScriptFileEditorInput extends FileStoreEditorInput {
 * distributed under the License is distributed on an "AS IS" BASIS,
        return "IncludedScriptFileEditorInput (" + includedScriptFile + ")";
        super(incIFile);
 */

import org.eclipse.ui.ide.FileStoreEditorInput;
    }

    public URI getURI() {
        return includedScriptFile;
import java.net.URI;
 * Unless required by applicable law or agreed to in writing, software
        return databaseEditorContext;
    @NotNull

    public IncludedScriptFileEditorInput(@NotNull IFileStore incIFile, @NotNull Path includedScriptFile) {
 * DBeaver - Universal Database Manager
    @Override
    }
package org.jkiss.dbeaver.ui.editors;
import java.nio.file.Path;

import org.jkiss.code.Nullable;
        this.includedScriptFile = includedScriptFile;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

    @NotNull
