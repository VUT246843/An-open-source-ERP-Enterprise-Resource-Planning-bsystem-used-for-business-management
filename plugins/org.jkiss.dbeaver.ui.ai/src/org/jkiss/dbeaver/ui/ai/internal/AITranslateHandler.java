 *
 * You may obtain a copy of the License at
        Command command = ActionUtils.findCommand(SQLEditorCommands.CMD_AI_CHAT_TOGGLE);
package org.jkiss.dbeaver.ui.ai.internal;
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.commands.AbstractHandler;
 * limitations under the License.
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.

            // PRO products, sorry
    public Object execute(ExecutionEvent event) {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
/*

        new AILegacyTranslator().performAiTranslation(event);
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.core.commands.Command;
        // CE legacy popup
 *
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.ai.legacy.AILegacyTranslator;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorCommands;


import org.eclipse.ui.handlers.HandlerUtil;
    @Override
}
    }
public class AITranslateHandler extends AbstractHandler {
            ActionUtils.runCommand(SQLEditorCommands.CMD_AI_CHAT_TOGGLE, HandlerUtil.getActiveWorkbenchWindow(event));
 *
        return null;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (command != null && command.isEnabled() && command.getHandler() != null) {
import org.jkiss.dbeaver.ui.ActionUtils;
import org.eclipse.core.commands.ExecutionEvent;
 *     http://www.apache.org/licenses/LICENSE-2.0
            return null;
