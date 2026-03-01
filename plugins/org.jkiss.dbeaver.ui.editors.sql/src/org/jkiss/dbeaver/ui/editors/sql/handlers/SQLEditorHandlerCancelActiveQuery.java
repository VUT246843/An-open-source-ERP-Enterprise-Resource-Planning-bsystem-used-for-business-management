        if (editor != null) {
/*
 *
import org.eclipse.core.commands.AbstractHandler;
        final SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
    }
 */
 * DBeaver - Universal Database Manager
    @Override
import org.eclipse.core.commands.ExecutionException;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.core.commands.ExecutionEvent;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.utils.RuntimeUtils;


package org.jkiss.dbeaver.ui.editors.sql.handlers;
public class SQLEditorHandlerCancelActiveQuery extends AbstractHandler {
 * You may obtain a copy of the License at
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * limitations under the License.
}
import org.eclipse.ui.handlers.HandlerUtil;
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and

            editor.cancelActiveQuery();
 *
        }

import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;
