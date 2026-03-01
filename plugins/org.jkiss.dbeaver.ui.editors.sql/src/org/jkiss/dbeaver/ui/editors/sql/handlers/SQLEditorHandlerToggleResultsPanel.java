    public Object execute(ExecutionEvent event) throws ExecutionException {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
        return null;
import org.eclipse.ui.handlers.HandlerUtil;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.commands.ExecutionEvent;

} */
        }
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
        SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
        if (editor != null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
import org.eclipse.core.commands.ExecutionException;


 * See the License for the specific language governing permissions and
/*
import org.eclipse.core.commands.AbstractHandler;
            editor.toggleResultPanel(true, true);

    }
 *
import org.jkiss.dbeaver.utils.RuntimeUtils;
 * limitations under the License.
 *
public class SQLEditorHandlerToggleResultsPanel extends AbstractHandler {
 *
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.editors.sql.handlers;
