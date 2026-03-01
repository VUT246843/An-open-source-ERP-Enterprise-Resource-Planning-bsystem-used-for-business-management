 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            //ERDGraphicalViewer.this.reveal(part);
 * Licensed under the Apache License, Version 2.0 (the "License");
        {
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.ui.editors.erd.editor.tools;
                }


        @Override
        this.setUserModificationPermission(1);
/*
 * limitations under the License.
 * You may obtain a copy of the License at

    }
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
import org.eclipse.gef.GraphicalViewer;
 * DBeaver - Universal Database Manager
        }

        private void bringToFront(NodePart part) {
                    bringToFront((NodePart)child);
            DefaultEditDomain editDomain = (DefaultEditDomain) getDomain();

import org.jkiss.dbeaver.ui.editors.erd.part.NodePart;
    public static class ToolBringToFront extends SelectionTool {

            final GraphicalViewer viewer = editorPart.getViewer();

        public void activate()
 *
            for (Object child : editorPart.getDiagramPart().getChildren()) {

            super.activate();
    }
    public BringToFrontToolEntry() {

import org.eclipse.gef.tools.SelectionTool;
 *
 * you may not use this file except in compliance with the License.
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
}
import org.eclipse.gef.palette.ToolEntry;
public class BringToFrontToolEntry extends ToolEntry {
import org.eclipse.gef.SharedImages;
                if (child instanceof NodePart) {
        }
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
            final ERDEditorPart editorPart = (ERDEditorPart)editDomain.getEditorPart();
import org.eclipse.gef.DefaultEditDomain;
            }
        super("Bring to front", "Bring figure to front", SharedImages.DESC_SELECTION_TOOL_16, SharedImages.DESC_SELECTION_TOOL_24, ToolBringToFront.class);
