
 * distributed under the License is distributed on an "AS IS" BASIS,
}

 * Unless required by applicable law or agreed to in writing, software
            }
    }

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.ui.IEditorPart;

 * See the License for the specific language governing permissions and
    {
public class SQLEditorHandlerAssistTemplates extends AbstractHandler {
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
    }
/*
 */
                editor.getTextViewer().doOperation(SourceViewer.CONTENTASSIST_PROPOSALS);
import org.eclipse.core.commands.AbstractHandler;
    public SQLEditorHandlerAssistTemplates()
 *
    public Object execute(ExecutionEvent event) throws ExecutionException
 * You may obtain a copy of the License at
import org.eclipse.core.commands.ExecutionException;
        return null;
        }
import org.eclipse.ui.handlers.HandlerUtil;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
import org.eclipse.jface.text.source.SourceViewer;
        IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
            SQLCompletionProcessor.setLookupTemplates(true);
            } finally {
                SQLCompletionProcessor.setLookupTemplates(oldValue);
 * limitations under the License.
 * DBeaver - Universal Database Manager
 *
package org.jkiss.dbeaver.ui.editors.sql.handlers;
 * you may not use this file except in compliance with the License.
    @Override
            SQLEditorBase editor = (SQLEditorBase)activeEditor;
        if (activeEditor instanceof SQLEditorBase) {
 *
import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLCompletionProcessor;

            try {
import org.eclipse.core.commands.ExecutionEvent;
            boolean oldValue = SQLCompletionProcessor.isLookupTemplates();
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
