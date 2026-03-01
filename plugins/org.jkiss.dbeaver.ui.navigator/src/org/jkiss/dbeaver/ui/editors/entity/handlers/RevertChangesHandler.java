 *
 * Unless required by applicable law or agreed to in writing, software
/*
 *
}import org.eclipse.core.commands.ExecutionEvent;
            editor.revertChanges();
{
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
package org.jkiss.dbeaver.ui.editors.entity.handlers;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.core.commands.AbstractHandler;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.utils.RuntimeUtils;
import org.eclipse.core.commands.ExecutionException;
public class RevertChangesHandler extends AbstractHandler
 * limitations under the License.
        return null;
 * You may obtain a copy of the License at
 *
        }
        if (editor != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Override
 * DBeaver - Universal Database Manager
    public Object execute(ExecutionEvent event) throws ExecutionException

    }
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    {



        final EntityEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), EntityEditor.class);
