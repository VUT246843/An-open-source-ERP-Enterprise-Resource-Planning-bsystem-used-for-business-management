        }
 *
    }

import org.eclipse.core.commands.AbstractHandler;
        String commandId = event.getCommand().getId();
            return null;
 * limitations under the License.
        ProjectionAnnotationModel model = sqlEditor.getProjectionAnnotationModel();
        }
 *     http://www.apache.org/licenses/LICENSE-2.0

    private static final String SUFFIX = "AllFoldings";
    public Object execute(ExecutionEvent event) {
import org.eclipse.jface.text.IDocument;
        if (document == null) {
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.ui.IEditorPart;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
        } else if (COLLAPSE_COMMAND_ID.equals(commandId)) {
/*
            return null;
        if (EXPAND_COMMAND_ID.equals(commandId)) {
 * See the License for the specific language governing permissions and
    private static final String PREFIX = "org.jkiss.dbeaver.ui.editors.sql.";
        }
import org.eclipse.core.commands.ExecutionEvent;
 * Licensed under the Apache License, Version 2.0 (the "License");
            model.collapseAll(0, length);
 *
 */
        if (model == null) {
 *
    private static final String COLLAPSE_COMMAND_ID = PREFIX + "Collapse" + SUFFIX;
    private static final String EXPAND_COMMAND_ID = PREFIX + "Expand" + SUFFIX;
            return null;
        IDocument document = sqlEditor.getDocument();

        SQLEditorBase sqlEditor = activeEditor.getAdapter(SQLEditorBase.class);
        int length = sqlEditor.getDocument().getLength();
    @Override
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
public class SQLEditorHandlerExpandCollapseAllFoldings extends AbstractHandler {
}
        }
            return null;
package org.jkiss.dbeaver.ui.editors.sql.handlers;
import org.eclipse.ui.handlers.HandlerUtil;
        if (activeEditor == null) {
        if (sqlEditor == null || !sqlEditor.isFoldingEnabled()) {
            model.expandAll(0, length);
        }
        return null;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
 * Unless required by applicable law or agreed to in writing, software
        IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
