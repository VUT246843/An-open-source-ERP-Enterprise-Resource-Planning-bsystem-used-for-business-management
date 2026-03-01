        this.setToolTipText(front ? ERDUIMessages.erd_tool_set_text_tip_text_bring_to_front : ERDUIMessages.erd_tool_set_text_tip_text_send_to_back);
/*
    protected boolean calculateEnabled() {


    }



 * Licensed under the Apache License, Version 2.0 (the "License");
        super.init();
            public void execute() {
public class ChangeZOrderAction extends SelectionAction {


 *     http://www.apache.org/licenses/LICENSE-2.0
            @Override
                            if (front) {
                                children.add(0, child);
        this.front = front;
        return false;
    }
        }
                        //((NodePart) item).getDiagram().
    private boolean front;
 *
                            children.remove(child);
                        if (children != null) {
    }
 */
        this.execute(this.createReorderCommand(selection.toArray()));
                        }
                        final IFigure parent = child.getParent();
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.setText(front ? ERDUIMessages.erd_tool_set_text_text_bring_to_front : ERDUIMessages.erd_tool_set_text_text_send_to_back);
import java.util.List;
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;

    }
 * Unless required by applicable law or agreed to in writing, software
        super(part);
    public void run() {
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
                        IFigure child = ((NodePart) item).getFigure();
            }
                            child.repaint();
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ui.editors.erd.editor.tools;
                                children.add(child);
import org.eclipse.draw2d.IFigure;
        this.setId(front ? "bringToFront" : "sendToBack");
        };
import org.eclipse.gef.commands.Command;
                            }
                            } else {
    }
                    if (item instanceof NodePart) {

            @Override
            public boolean canUndo() {
                        final List children = parent.getChildren();
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;

import org.jkiss.dbeaver.ui.editors.erd.part.NodePart;
                return true;
import org.eclipse.gef.ui.actions.SelectionAction;
    public ChangeZOrderAction(ERDEditorPart part, IStructuredSelection selection, boolean front) {
import org.eclipse.jface.viewers.IStructuredSelection;
 * See the License for the specific language governing permissions and
        return new Command() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
 *

            }
    protected void init() {
                return false;
                    }
                for (Object item : objects) {
    private Command createReorderCommand(final Object[] objects) {
        this.selection = selection;
 *
            if (item instanceof NodePart) {
    private IStructuredSelection selection;
}
                }
        for (Object item : selection.toArray()) {
