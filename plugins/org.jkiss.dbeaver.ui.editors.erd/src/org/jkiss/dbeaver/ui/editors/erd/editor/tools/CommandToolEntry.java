    }
 * limitations under the License.
import org.eclipse.gef.palette.ToolEntry;
        protected String getCommandName() {
    public class ActionTool extends SelectionTool {
 * See the License for the specific language governing permissions and
    public CommandToolEntry(String commandId, String label, DBPImage image) {
        this.commandId = commandId;
    }
import org.jkiss.dbeaver.model.DBPImage;

        @Override
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
            ActionUtils.findCommandDescription(commandId, UIUtils.getActiveWorkbenchWindow(), false),


import org.eclipse.gef.tools.SelectionTool;

        this.setUserModificationPermission(PaletteEntry.PERMISSION_NO_MODIFICATION);
import org.eclipse.gef.palette.PaletteEntry;
 *

 * Unless required by applicable law or agreed to in writing, software
}
public class CommandToolEntry extends ToolEntry {
    }
            label,

 */
import org.jkiss.dbeaver.ui.ActionUtils;
        @Override
import org.jkiss.dbeaver.ui.UIUtils;
 *
package org.jkiss.dbeaver.ui.editors.erd.editor.tools;
 * you may not use this file except in compliance with the License.

 * Copyright (C) 2010-2025 DBeaver Corp and others
            return commandId;
 * DBeaver - Universal Database Manager
    public Tool createTool() {
        return new ActionTool();
            super.activate();
/*
    private final String commandId;
 *     http://www.apache.org/licenses/LICENSE-2.0

            DBeaverIcons.getImageDescriptor(image),
        }
            null);
        public void activate() {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            ActionUtils.runCommand(commandId, UIUtils.getActiveWorkbenchWindow());
import org.eclipse.gef.Tool;
        super(


 *
 * Licensed under the Apache License, Version 2.0 (the "License");
