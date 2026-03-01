        setActionDefinitionId(CMD_TOGGLE_HAND);
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.jkiss.dbeaver.ui.editors.erd.ERDIcon;
 *
import org.eclipse.gef.palette.ToolEntry;
 *
 * @see org.jkiss.dbeaver.ui.editors.erd.editor.tools.HandToolEntry
import org.jkiss.code.NotNull;

 *
        if (toolEntry != handTool) {
import org.eclipse.gef.palette.PaletteListener;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
    }
 */

        viewer.removePaletteListener(this);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public void activeToolChanged(PaletteViewer viewer, ToolEntry toolEntry) {
    }


import org.eclipse.gef.Disposable;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
public class DiagramToggleHandAction extends Action implements PaletteListener, Disposable {
import org.jkiss.dbeaver.ui.DBeaverIcons;
/**
        if (viewer.getActiveTool() == handTool) {
/*
        setImageDescriptor(DBeaverIcons.getImageDescriptor(ERDIcon.MOVE));
        setId(CMD_TOGGLE_HAND);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.eclipse.jface.action.Action;
        this.viewer.addPaletteListener(this);
        setChecked(toolEntry == handTool);
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.editors.erd.action;
    private final PaletteViewer viewer;
    @Override
 * limitations under the License.
    private ToolEntry previousTool;

            viewer.setActiveTool(previousTool);
    @Override
    public void run() {
            viewer.setActiveTool(handTool);

    public static final String CMD_TOGGLE_HAND = "org.jkiss.dbeaver.erd.toggleHand";
    @Override
 * You may obtain a copy of the License at
    public DiagramToggleHandAction(@NotNull PaletteViewer viewer) {
 * you may not use this file except in compliance with the License.
        }

    public void dispose() {
 * DBeaver - Universal Database Manager
        } else {
}
        this.viewer = viewer;
import org.jkiss.dbeaver.ui.editors.erd.ERDUIUtils;
        super(ERDUIMessages.erd_action_diagram_toggle_hand_checkbox_text, AS_CHECK_BOX);
import org.jkiss.dbeaver.ui.editors.erd.editor.tools.HandToolEntry;
 *
 * Action to cycle between hand tool and previously selected tool
        this.handTool = (ToolEntry) ERDUIUtils.findPaletteEntry(viewer.getPaletteRoot(), HandToolEntry.ID);
            previousTool = toolEntry;
    private final ToolEntry handTool;
