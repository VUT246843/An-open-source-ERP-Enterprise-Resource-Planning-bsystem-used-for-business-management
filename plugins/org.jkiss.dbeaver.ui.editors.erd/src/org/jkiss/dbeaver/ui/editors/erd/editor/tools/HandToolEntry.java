        }
 *
        }
                performMove();
import org.eclipse.draw2d.FigureCanvas;
        setUserModificationPermission(PERMISSION_NO_MODIFICATION);
                setState(STATE_INVALID);
        public void deactivate() {
            stateTransition(STATE_DRAG_IN_PROGRESS, STATE_TERMINAL);
            }
                canvas.scrollTo(point.x, point.y);
        private int viewStartY;
    }

import org.jkiss.code.Nullable;

        @Override
import org.eclipse.gef.tools.AbstractTool;
        @NotNull
        }
package org.jkiss.dbeaver.ui.editors.erd.editor.tools;
            if (button != 1) {
            } else {
            final Point delta = getStartLocation().getTranslated(getLocation().getNegated());
            return true;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
        super("Pan Diagram", "Pan diagram view", DBeaverIcons.getImageDescriptor(ERDIcon.MOVE), DBeaverIcons.getImageDescriptor(ERDIcon.MOVE), ToolHand.class);
    public static class ToolHand extends AbstractTool {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *

            if (isInState(STATE_DRAG_IN_PROGRESS)) {
        }
        protected boolean handleButtonDown(int button) {

            if (viewer instanceof ScrollingGraphicalViewer) {

        }
            setUnloadWhenFinished(false);

 * See the License for the specific language governing permissions and
            return new Point(viewStartX, viewStartY);
            return true;

            setDefaultCursor(Cursors.SIZEALL);
        }
 * DBeaver - Universal Database Manager
            if (stateTransition(STATE_INITIAL, STATE_DRAG_IN_PROGRESS)) {
 *
        }
                performAbort();
    }
        }
            if (canvas != null) {
        @NotNull
                return new Point(0, 0);
        private void performAbort() {
            scrollViewTo(location);
    public static final String ID = "hand-tool";
import org.eclipse.draw2d.Cursors;
            return "move";
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
                final Point viewLocation = getViewLocation();

            final FigureCanvas canvas = getCanvas();
        protected boolean handleDragInProgress() {
        }
                viewStartY = viewLocation.y;
        public ToolHand() {
            scrollViewTo(getStartViewLocation());
import org.eclipse.swt.widgets.Control;
}
                    return (FigureCanvas) control;

        private void scrollViewTo(@NotNull Point point) {

        @Override
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.palette.ToolEntry;
                return canvas.getViewport().getViewLocation().getCopy();
        private Point getViewLocation() {

            if (isInState(STATE_DRAG | STATE_DRAG_IN_PROGRESS)) {
        private FigureCanvas getCanvas() {
            }
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.draw2d.geometry.Point;
 * you may not use this file except in compliance with the License.
        private int viewStartX;
            }
import org.jkiss.dbeaver.ui.DBeaverIcons;
            if (canvas != null) {
            final FigureCanvas canvas = getCanvas();
 * limitations under the License.

            handleFinished();
            }
            }
        private void performMove() {
        @Override
            final Point location = getStartViewLocation().getTranslated(delta);
import org.jkiss.dbeaver.ui.editors.erd.ERDIcon;
                final Control control = viewer.getControl();
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            final EditPartViewer viewer = getCurrentViewer();
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

            return true;
 */
/*
        }
        protected String getCommandName() {

public class HandToolEntry extends ToolEntry {
        private Point getStartViewLocation() {
                viewStartX = viewLocation.x;
            return null;
                if (control instanceof FigureCanvas) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Nullable
        protected boolean handleButtonUp(int button) {
        }

            super.deactivate();
    public HandToolEntry() {
        @Override
                }
        @Override
        setId(ID);
