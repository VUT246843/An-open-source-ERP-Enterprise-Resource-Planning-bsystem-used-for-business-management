 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.code.Nullable;
        SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
 * distributed under the License is distributed on an "AS IS" BASIS,
}
 *
import org.jkiss.dbeaver.utils.RuntimeUtils;
    @Override
                addIn.toggleTerminalView();
    public Object execute(@NotNull ExecutionEvent event) {
import org.eclipse.core.commands.AbstractHandler;
    }
public class SQLTerminalViewSwitchHandler extends AbstractHandler {

 * you may not use this file except in compliance with the License.

import org.eclipse.ui.handlers.HandlerUtil;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
import org.jkiss.code.NotNull;
            SQLTerminalEditorAddIn addIn = editor.findAddIn(SQLTerminalEditorAddIn.class);
        }
 * See the License for the specific language governing permissions and

 *
        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0

            }
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
            if (addIn != null) {
 * DBeaver - Universal Database Manager
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others

    @Nullable
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.editors.sql.terminal;
 * limitations under the License.
        if (editor != null) {
 * You may obtain a copy of the License at
