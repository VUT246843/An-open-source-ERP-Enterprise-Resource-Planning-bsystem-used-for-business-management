
import org.eclipse.gef.palette.PaletteEntry;
    }
    private final IAction action;
 *     http://www.apache.org/licenses/LICENSE-2.0

        super(action.getText().replace("&", ""), action.getDescription(), action.getImageDescriptor(), action.getImageDescriptor());
import org.eclipse.gef.Tool;
    }
        }
    public class ActionTool extends SelectionTool {
        this.setUserModificationPermission(PaletteEntry.PERMISSION_NO_MODIFICATION);

/*
 * distributed under the License is distributed on an "AS IS" BASIS,
    public ActionToolEntry(IAction action) {
 * you may not use this file except in compliance with the License.
            super.activate();
 * Copyright (C) 2010-2025 DBeaver Corp and others
        protected String getCommandName() {
        }
 * You may obtain a copy of the License at

public class ActionToolEntry extends ToolEntry {
        this.action = action;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

 * See the License for the specific language governing permissions and
    }
 */


package org.jkiss.dbeaver.ui.editors.erd.editor.tools;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.gef.tools.SelectionTool;

    public Tool createTool() {
            action.run();
        public void activate() {
 *
        @Override
import org.eclipse.jface.action.IAction;
 *


import org.eclipse.gef.palette.ToolEntry;
 * DBeaver - Universal Database Manager
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
        return new ActionTool();
}
            return action.getId();
        @Override
