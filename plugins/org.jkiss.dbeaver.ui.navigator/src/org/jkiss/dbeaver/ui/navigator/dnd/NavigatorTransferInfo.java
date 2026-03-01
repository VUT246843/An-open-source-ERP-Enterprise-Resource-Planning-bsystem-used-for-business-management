                return EditorInputTransfer.createEditorInputData(editor.getId(), input);
        this.name = name;
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.IWorkbenchWindow;

 * you may not use this file except in compliance with the License.
                final IWorkbenchWindow window = UIUtils.getActiveWorkbenchWindow();
    private final DBNNode node;
        if (node instanceof DBNDatabaseNode) {

                log.warn("Error creating editor input for file '" + file + "'", e);
 *
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.ui.editors.DatabaseNodeEditorInput;
        if (file.exists()) {
    public NavigatorTransferInfo(@NotNull String name, @NotNull DBNNode node, @Nullable Object object) {

import org.jkiss.dbeaver.ui.UIUtils;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;
import org.eclipse.ui.part.EditorInputTransfer;

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
            }
    private final Object object;
 * See the License for the specific language governing permissions and
        final File file = new File(name);
    private final String name;

            try {
 * You may obtain a copy of the License at
/*
    }
    }
        return object;
    public Object getObject() {
    @NotNull
import java.io.File;
    public String getName() {
 *

 * Unless required by applicable law or agreed to in writing, software
            } catch (Exception e) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    }
import org.eclipse.core.filesystem.EFS;
                final IEditorDescriptor editor = EditorUtils.getFileEditorDescriptor(file, window);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class NavigatorTransferInfo {
                final IEditorInput input = new FileStoreEditorInput(EFS.getStore(file.toURI()));

    private static final Log log = Log.getLog(NavigatorTransferInfo.class);
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
 * limitations under the License.
import org.jkiss.code.NotNull;
            final DatabaseNodeEditorInput input = new DatabaseNodeEditorInput((DBNDatabaseNode) node);
        return name;
        }
import org.eclipse.ui.IEditorInput;
        }
}

 */

    public EditorInputTransfer.EditorInputData createEditorInputData() {

    @Nullable
package org.jkiss.dbeaver.ui.navigator.dnd;
 *
        this.object = object;
import org.jkiss.dbeaver.model.navigator.DBNNode;
import org.eclipse.ui.IEditorDescriptor;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return null;
        this.node = node;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.jkiss.dbeaver.ui.editors.EditorUtils;
            return EditorInputTransfer.createEditorInputData(EntityEditor.ID, input);
