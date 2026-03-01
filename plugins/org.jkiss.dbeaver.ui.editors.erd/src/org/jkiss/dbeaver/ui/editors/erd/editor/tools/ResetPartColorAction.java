        super.init();

    }

        super(part);
package org.jkiss.dbeaver.ui.editors.erd.editor.tools;

            }
                        colorizedPart.setCustomBackgroundColor(oldColors.get(colorizedPart));
            private final Map<ICustomizablePart, Color> oldColors = new HashMap<>();

        this.execute(this.createColorCommand(selection.toArray()));
 * Licensed under the Apache License, Version 2.0 (the "License");
                    }
/*
                }
        return new Command() {
                    if (item instanceof ICustomizablePart) {
                        ICustomizablePart colorizedPart = (ICustomizablePart) item;
                    if (item instanceof ICustomizablePart) {
            @Override

import org.eclipse.gef.ui.actions.SelectionAction;
                for (Object item : objects) {
import java.util.Map;
    }
 *
    public ResetPartColorAction(ERDEditorPart part, IStructuredSelection selection) {
    protected boolean calculateEnabled() {
                        colorizedPart.setCustomBackgroundColor(null);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    if (item instanceof ICustomizablePart) {
    private Command createColorCommand(final Object[] objects) {
public class ResetPartColorAction extends SelectionAction {
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.graphics.Color;
    }

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
            public void execute() {
 *
import org.eclipse.gef.commands.Command;
        this.setId("removeFigureColor");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
    }
import java.util.HashMap;

                    }
                        ICustomizablePart colorizedPart = (ICustomizablePart) item;
            public void redo() {

                        oldColors.put(colorizedPart, colorizedPart.getCustomBackgroundColor());
                return true;
 */
 *
 * you may not use this file except in compliance with the License.
            @Override

            if (item instanceof ICustomizablePart && ((ICustomizablePart) item).getCustomBackgroundColor() != null) {
                for (Object item : objects) {
                        colorizedPart.setCustomBackgroundColor(null);
}

            public void undo() {
        this.setToolTipText(ERDUIMessages.erd_tool_color_action_tip_text_reset_figure_color);
            @Override
                for (Object item : objects) {
        this.setText(ERDUIMessages.erd_tool_color_action_text_reset_color);
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
    }

                }
import org.eclipse.jface.viewers.IStructuredSelection;
                        ICustomizablePart colorizedPart = (ICustomizablePart) item;
    protected void init() {
        return false;

        this.selection = selection;
import org.jkiss.dbeaver.ui.editors.erd.part.ICustomizablePart;
 * See the License for the specific language governing permissions and
    private IStructuredSelection selection;
        }
                }
 * limitations under the License.
            }
        for (Object item : selection.toArray()) {
        };
    public void run() {

            }
                    }
