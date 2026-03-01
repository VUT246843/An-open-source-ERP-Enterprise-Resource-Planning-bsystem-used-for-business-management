                    log.warn("Can't extract query", e);
 * DBeaver - Universal Database Manager

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            }
 *
 * limitations under the License.
                        TextTransfer.getInstance(),

            if (query != null) {
        if (editor != null && editor.getDocument() != null) {
                }
        return null;
 * See the License for the specific language governing permissions and

                        editor.getDocument().get(query.getOffset(), query.getLength())
import org.jkiss.dbeaver.ui.UIUtils;
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
}
                try {
    private static final Log log = Log.getLog(CopyActiveQueryHandler.class);
 *
import org.eclipse.core.commands.ExecutionEvent;
    @Override
import org.jkiss.dbeaver.Log;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;

    public Object execute(ExecutionEvent event) throws ExecutionException {
                } catch (BadLocationException e) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
/*
                        Display.getCurrent(),
                    );
import org.eclipse.jface.text.BadLocationException;

import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.core.commands.AbstractHandler;
                    UIUtils.setClipboardContents(
import org.jkiss.dbeaver.model.sql.SQLScriptElement;

            final SQLScriptElement query = editor.extractActiveQuery();
package org.jkiss.dbeaver.ui.editors.sql.commands;
import org.eclipse.core.commands.ExecutionException;
public class CopyActiveQueryHandler extends AbstractHandler {
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        final SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
