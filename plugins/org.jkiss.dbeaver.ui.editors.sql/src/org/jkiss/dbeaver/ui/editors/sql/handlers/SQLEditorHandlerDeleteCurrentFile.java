                } catch (CoreException e1) {
            if (UIUtils.confirmAction(null, SQLEditorMessages.editor_file_delete_confirm_delete_title, NLS.bind(SQLEditorMessages.editor_file_delete_confirm_delete_text, file.getName()), DBIcon.STATUS_ERROR)) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.utils.RuntimeUtils;
        if (editor == null) {
 *
 * DBeaver - Universal Database Manager
import org.eclipse.osgi.util.NLS;
            log.error("No active SQL editor");
 * limitations under the License.
        }

import org.eclipse.core.runtime.CoreException;
        IFile file = EditorUtils.getFileFromInput(editor.getEditorInput());
                    file.delete(true, true, new NullProgressMonitor());
                }
        } else {
        IEditorPart editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActivePart(event), IEditorPart.class);
 *
import org.eclipse.core.resources.IFile;
                    }
            if (localFile != null) {
        if (file == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            }

            } else {
} * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.UIUtils;
 */
            File localFile = EditorUtils.getLocalFileFromInput(editor.getEditorInput());
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.EditorUtils;
                DBWorkbench.getPlatformUI().showError("Rename", "Can't rename - no source file");
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.eclipse.core.runtime.NullProgressMonitor;
public class SQLEditorHandlerDeleteCurrentFile extends AbstractDataSourceHandler {
            return null;
 * you may not use this file except in compliance with the License.
                    DBWorkbench.getPlatformUI().showError(SQLEditorMessages.editor_file_delete_error_title, NLS.bind(SQLEditorMessages.editor_file_delete_error_text, file.getName(), e1));

import org.eclipse.ui.IEditorPart;

/*
    public Object execute(ExecutionEvent event) throws ExecutionException {
                try {
                }
 * You may obtain a copy of the License at
            }
import org.eclipse.core.commands.ExecutionException;
        return null;
import java.io.File;
                    if (!localFile.delete()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                if (UIUtils.confirmAction(null, SQLEditorMessages.editor_file_delete_confirm_delete_title, NLS.bind(SQLEditorMessages.editor_file_delete_confirm_delete_text, localFile.getName()), DBIcon.STATUS_ERROR)) {
import org.eclipse.ui.handlers.HandlerUtil;

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *


 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.editors.sql.handlers;
    }
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
        }
import org.eclipse.core.commands.ExecutionEvent;
                        DBWorkbench.getPlatformUI().showError(SQLEditorMessages.editor_file_delete_error_title, NLS.bind(SQLEditorMessages.editor_file_delete_error_text, localFile.getName()));
import org.jkiss.dbeaver.model.DBIcon;
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
