        if (additionalOutOfContainer(event)) {
 * Unless required by applicable law or agreed to in writing, software
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * DBeaver - Universal Database Manager
 * limitations under the License.
 *
import org.eclipse.gef.GraphicalViewer;
        super(viewer);


        return super.keyPressed(event);
    public DBeaverNavigationKeyHandler(GraphicalViewer viewer) {
        }
    boolean additionalOutOfContainer(KeyEvent event) {
            event.stateMask = SWT.ALT;
    }
 * you may not use this file except in compliance with the License.
                ((NotePart) getFocusEditPart()).performDirectEdit();
        }
    public boolean keyPressed(KeyEvent event) {
    }
/*
            event.keyCode = SWT.ARROW_DOWN;
                return true;

 * You may obtain a copy of the License at
public class DBeaverNavigationKeyHandler extends GraphicalViewerKeyHandler {
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (additionalAcceptIntoContainer(event)) {
        return event.keyCode == 8;
            if (getFocusEditPart() instanceof NotePart) {
        // Backspace
package org.jkiss.dbeaver.ui.editors.erd.part;
import org.eclipse.swt.events.KeyEvent;
    }

        return event.keyCode == SWT.CR;
 *

import org.eclipse.swt.SWT;
}
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
            event.keyCode = SWT.ARROW_UP;
    protected boolean additionalAcceptIntoContainer(KeyEvent event) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            event.stateMask = SWT.ALT;
 */
