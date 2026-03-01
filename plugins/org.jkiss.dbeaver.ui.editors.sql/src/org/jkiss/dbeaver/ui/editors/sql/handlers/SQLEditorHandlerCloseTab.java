        SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * you may not use this file except in compliance with the License.
 *
    }
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.utils.RuntimeUtils;
 * Unless required by applicable law or agreed to in writing, software


 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.core.commands.AbstractHandler;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
}            editor.closeActiveTab();

import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
        }
import org.eclipse.core.commands.ExecutionEvent;

public class SQLEditorHandlerCloseTab extends AbstractHandler {
/*
 * limitations under the License.

        return null;
 */
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (editor != null) {
package org.jkiss.dbeaver.ui.editors.sql.handlers;
 * DBeaver - Universal Database Manager
import org.eclipse.ui.handlers.HandlerUtil;
 *
import org.eclipse.core.commands.ExecutionException;
 *
