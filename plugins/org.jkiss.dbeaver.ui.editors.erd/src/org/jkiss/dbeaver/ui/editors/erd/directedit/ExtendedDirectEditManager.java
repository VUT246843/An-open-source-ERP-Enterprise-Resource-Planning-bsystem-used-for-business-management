
    }
     * Finally, {@link #bringDown()}is called to perform and necessary cleanup.
public class ExtendedDirectEditManager extends DirectEditManager {
import org.eclipse.gef.GraphicalEditPart;
        getCellEditor().setValue(originalValue);
        //add the verifyListener to apply changes to the control size
 * DBeaver - Universal Database Manager
    /**

 * Created on Jul 13, 2004
            /**
                }

import org.jkiss.dbeaver.ui.editors.erd.figures.NoteFigure;
                }
                Command command;

import org.eclipse.gef.tools.CellEditorLocator;
        super.unhookListeners();

                } else {
            return ((Label) figure).getText();
 *
import org.eclipse.swt.events.VerifyListener;
     * @param editorType type of editor
                    //just make it square
                    size = text.computeSize(size.x, SWT.DEFAULT);
        IFigure cellEditorFrame = super.getCellEditorFrame();

                //String s = leftText + event.text + rightText;

 *

    }
    private final IFigure figure;

        Text text = (Text) getCellEditor().getControl();
import org.eclipse.swt.graphics.GC;

     */
    }
                EditPolicy editPolicy = getEditPart().getEditPolicy(EditPolicy.DIRECT_EDIT_ROLE);
 * limitations under the License.
     * from the source edit part and executing it via the {@link CommandStack}.
        this.figure = figure;
                String rightText = oldText.substring(event.end);
    @Override
            //getCellEditor().getControl().setVisible(false);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

                String oldText = text.getText();
import org.eclipse.gef.tools.DirectEditManager;
        }

 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
        Text text = (Text) getCellEditor().getControl();
import org.eclipse.swt.SWT;
    }
                                     IFigure figure, ICellEditorValidator validator) {
                gc.dispose();
                    command = getEditPart().getCommand(getDirectEditRequest());
 */
            return;
                    size.x = size.y;
        } finally {
                    stack.execute(command);
        this.validator = validator;
     *
        } else {
    protected void commit() {
            public void verifyText(VerifyEvent event) {
            //cellEditorFrame.setBorder(null);
                GC gc = new GC(text);
    private boolean committing = false;
    }

     * Creates a new ActivityDirectEditManager with the given attributes.
     * @param locator    the CellEditorLocator
        //set the initial value of the
                CommandStack stack = getEditPart().getViewer().getEditDomain().getCommandStack();
import org.eclipse.gef.commands.CommandStack;
            return ((NoteFigure) figure).getText();
        if (figure instanceof Label) {
     * Need to override so as to remove the verify listener
                Point size = gc.textExtent(leftText + event.text + rightText);
    /**
            bringDown();
    protected void initCellEditor() {
    @Override
                String leftText = oldText.substring(0, event.start);
    protected void unhookListeners() {
            // possible flicker
    private VerifyListener verifyListener;

 * See the License for the specific language governing permissions and
            }
import org.eclipse.swt.events.VerifyEvent;

/*
 *
        text.removeVerifyListener(verifyListener);
/**
             * text
    }

 * Unless required by applicable law or agreed to in writing, software
            if (isDirty()) {
                if (editPolicy != null) {
        super(source, editorType, locator);

            //we set the cell editor control to invisible to remove any
import org.eclipse.jface.viewers.ICellEditorValidator;
            @Override
 * functionality by adding the ICellEditorValidator on startup
 * A generic DirectEdit manager to be used for labels which includes validation

        text.selectAll();
    private static String getFigureText(IFigure figure) {
    private String originalValue;
                else {
import org.eclipse.swt.graphics.Point;
        originalValue = getFigureText(this.figure);
}        verifyListener = new VerifyListener() {
    public ExtendedDirectEditManager(GraphicalEditPart source, Class<? extends CellEditor> editorType, CellEditorLocator locator,
        getCellEditor().setValidator(validator);
     */
                if (command != null && command.canExecute()) {
        committing = true;

import org.eclipse.draw2d.Label;
    /**
        return cellEditorFrame;

import org.eclipse.jface.viewers.CellEditor;
     * Commits the current value of the cell editor by getting a {@link Command}
 * You may obtain a copy of the License at
        if (committing)
        verifyListener = null;
             */
        }
     * @param source     the source EditPart
        this.originalValue = getFigureText(figure);
        try {
 */
                Text text = (Text) getCellEditor().getControl();
        text.addVerifyListener(verifyListener);
                getCellEditor().getControl().setSize(size.x, size.y);
    @Override
                }
/*
             * Changes the size of the editor control to reflect the changed
            }
 */
        if (cellEditorFrame.getBorder() != null) {
     */
    protected IFigure getCellEditorFrame() {
import org.eclipse.swt.widgets.Text;
                    command = editPolicy.getCommand(getDirectEditRequest());
import org.eclipse.draw2d.IFigure;

package org.jkiss.dbeaver.ui.editors.erd.directedit;
                if (size.x != 0)
            return "???";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final ICellEditorValidator validator;
import org.eclipse.gef.commands.Command;
        }
        } else if (figure instanceof NoteFigure) {
        };
            committing = false;


import org.eclipse.gef.EditPolicy;

