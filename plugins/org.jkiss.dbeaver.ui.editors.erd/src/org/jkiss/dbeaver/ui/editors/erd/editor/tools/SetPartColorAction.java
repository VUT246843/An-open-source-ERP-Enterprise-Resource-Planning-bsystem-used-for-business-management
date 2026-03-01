
import org.eclipse.gef.ui.actions.SelectionAction;

 * limitations under the License.
                        colorizedPart.setCustomBackgroundColor(newColor);

            }
import java.util.Map;
import org.jkiss.dbeaver.ui.editors.erd.part.ICustomizablePart;
                    }
            private Color newColor;
            public void execute() {

}
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private Command createColorCommand(final Object[] objects) {
    protected boolean calculateEnabled() {
                }
                newColor = new Color(Display.getCurrent(), color);
    }
                return true;
import org.eclipse.jface.viewers.IStructuredSelection;
import java.util.HashMap;
    }
        this.execute(this.createColorCommand(selection.toArray()));
                    if (item instanceof ICustomizablePart) {
        this.setText(ERDUIMessages.erd_tool_color_action_text_set_color);
            @Override
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.RGB;
        super.init();
        this.selection = selection;
                        oldColors.put(colorizedPart, colorizedPart.getCustomBackgroundColor());
                final Shell shell = UIUtils.createCenteredShell(getWorkbenchPart().getSite().getShell());
import org.eclipse.swt.widgets.Display;
 *
            }

        for (Object item : selection.toArray()) {

                for (Object item : objects) {
    private IStructuredSelection selection;
                        colorizedPart.setCustomBackgroundColor(newColor);
public class SetPartColorAction extends SelectionAction {
            public void redo() {

            }
                }
        return new Command() {
                    }
 * DBeaver - Universal Database Manager
                        colorizedPart.setCustomBackgroundColor(oldColors.get(colorizedPart));

            private final Map<ICustomizablePart, Color> oldColors = new HashMap<>();
/*
import org.eclipse.swt.widgets.ColorDialog;
                    if (item instanceof ICustomizablePart) {
            if (item instanceof ICustomizablePart) {
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;

    }
 *
                }
    protected void init() {
                if (color == null) {

import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
 * Licensed under the Apache License, Version 2.0 (the "License");
            public void undo() {
 * See the License for the specific language governing permissions and
        };
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * You may obtain a copy of the License at
                ColorDialog colorDialog = new ColorDialog(shell);


            }
                RGB color = colorDialog.open();
package org.jkiss.dbeaver.ui.editors.erd.editor.tools;
 * Unless required by applicable law or agreed to in writing, software
            @Override
                for (Object item : objects) {
    public SetPartColorAction(ERDEditorPart part, IStructuredSelection selection) {
        this.setToolTipText(ERDUIMessages.erd_tool_color_action_tip_text_set_figure_color);
                        ICustomizablePart colorizedPart = (ICustomizablePart) item;
        this.setId("setFigureColor"); //$NON-NLS-1$
 */
 * you may not use this file except in compliance with the License.
                for (Object item : objects) {

                        ICustomizablePart colorizedPart = (ICustomizablePart) item;
    public void run() {
            @Override
import org.eclipse.gef.commands.Command;
                    return;
        return false;
    }
                        ICustomizablePart colorizedPart = (ICustomizablePart) item;
import org.eclipse.swt.graphics.Color;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.UIUtils;
                    if (item instanceof ICustomizablePart) {
                    }
 *
        }
        super(part);
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

