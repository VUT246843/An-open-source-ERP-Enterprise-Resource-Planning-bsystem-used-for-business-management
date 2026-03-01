import java.io.ByteArrayInputStream;
 * BaseTextDocumentProvider
 * distributed under the License is distributed on an "AS IS" BASIS,
                ((IPersistentStorage) storage).setContents(monitor, new ByteArrayInputStream(bytes));

 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
}

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.runtime.IPersistentStorage;
import org.eclipse.jface.text.IDocument;
public class PersistentStorageDocumentProvider extends StorageDocumentProvider {
 * you may not use this file except in compliance with the License.
        }
            }
    }
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.resources.IStorage;
        if (element instanceof IStorageEditorInput) {
import org.eclipse.ui.editors.text.StorageDocumentProvider;

import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.core.runtime.IProgressMonitor;
            IStorage storage = ((IStorageEditorInput) element).getStorage();
import org.eclipse.core.runtime.CoreException;
import java.nio.charset.StandardCharsets;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public PersistentStorageDocumentProvider() {
    }
    protected void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite) throws CoreException {
 *
 *
 * DBeaver - Universal Database Manager
/**
 */
/*

 * limitations under the License.
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                byte[] bytes = document.get().getBytes(StandardCharsets.UTF_8);

            if (storage instanceof IPersistentStorage) {
    @Override
        super.doSaveDocument(monitor, element, document, overwrite);
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ui.editors.text;

