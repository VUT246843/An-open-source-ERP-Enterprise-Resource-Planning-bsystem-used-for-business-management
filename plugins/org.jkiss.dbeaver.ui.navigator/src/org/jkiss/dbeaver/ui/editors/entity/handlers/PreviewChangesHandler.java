    }
    @Override


 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
 *

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.commands.AbstractHandler;
    {
 * you may not use this file except in compliance with the License.
        if (editor != null) {
 * limitations under the License.
 */
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
        return null;

        EntityEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), EntityEditor.class);
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ui.editors.entity.handlers;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
{
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;
 * You may obtain a copy of the License at
}            editor.showChanges(false);

import org.eclipse.core.commands.ExecutionEvent;
public class PreviewChangesHandler extends AbstractHandler
        }
import org.jkiss.dbeaver.utils.RuntimeUtils;
    public Object execute(ExecutionEvent event) throws ExecutionException
/*
 * DBeaver - Universal Database Manager
 *
