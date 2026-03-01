                    if (row != null && attr != null) {
/*
                } finally {
 */
                        int length = ((TextSelection) selection).getLength();
                        //DBDValueHandler valueHandler = valueController.getValueHandler();
import org.eclipse.swt.dnd.TextTransfer;
import org.jkiss.dbeaver.ui.data.IValueController;
                        ResultSetValueController valueController = new ResultSetValueController(
 *
                ISelection selection = textViewer.getSelectionProvider().getSelection();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (selection instanceof TextSelection) {
                    DBDAttributeBinding attr = selection.getElementAttribute(cell);
 * You may obtain a copy of the License at
            IResultSetSelection selection = rsc.getSelection();
            } else {
 * Unless required by applicable law or agreed to in writing, software
                        DBWorkbench.getPlatformUI().showError("Insert UUID", "Error inserting UUID in text editor", e);

import org.eclipse.jface.text.ITextViewer;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
                            length, uuid);
import org.eclipse.jface.text.TextSelection;
    private static String generateUUID() {
        if (rsc != null && UIUtils.hasFocus(rsc.getControl())) {
import org.eclipse.swt.dnd.Clipboard;
        IResultSetController rsc = activePart.getAdapter(IResultSetController.class);
            }
import org.eclipse.ui.handlers.HandlerUtil;
                        int offset = ((TextSelection) selection).getOffset();
                        new Transfer[]{textTransfer});
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.dnd.Transfer;

 *
            ITextViewer textViewer = activePart.getAdapter(ITextViewer.class);
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    TextTransfer textTransfer = TextTransfer.getInstance();
        return null;
import org.jkiss.dbeaver.ui.UIUtils;
                    clipboard.dispose();
        IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
public class GenerateUUIDHandler extends NavigatorHandlerObjectBase {
        
            }
                        valueController.updateValue(generateUUID(), false);
                        textViewer.getSelectionProvider().setSelection(new TextSelection(offset + uuid.length(), 0));
                    } catch (BadLocationException e) {
                }
 * you may not use this file except in compliance with the License.
        if (activePart == null) {
                for (Object cell : selection.toArray()) {
                }
                            new ResultSetCellLocation(attr, row),
                rsc.updateEditControls();
    @Override
                    clipboard.setContents(
                try {
                    	String uuid = generateUUID();
        return UUID.randomUUID().toString();
import org.eclipse.core.commands.ExecutionEvent;

import org.eclipse.core.commands.ExecutionException;
    }
 * limitations under the License.
                    }
                            offset,
                }
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectBase;
 * Licensed under the Apache License, Version 2.0 (the "License");
                Clipboard clipboard = new Clipboard(Display.getCurrent());
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.controls.resultset.handler;
        } else {
                        new Object[]{generateUUID()},
                            rsc,
import org.eclipse.jface.text.BadLocationException;

 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
 * See the License for the specific language governing permissions and
                    ResultSetRow row = selection.getElementRow(cell);
            if (selection != null && !selection.isEmpty()) {
 * DBeaver - Universal Database Manager
            if (textViewer != null) {
                            IValueController.EditType.NONE,
                rsc.redrawData(false, false);
                            null);
import org.jkiss.dbeaver.ui.controls.resultset.*;
import java.util.UUID;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

                    }
import org.eclipse.swt.widgets.Display;

                    try {
    }
                        textViewer.getDocument().replace(

}
 *
    public Object execute(ExecutionEvent event) throws ExecutionException {
            return null;
import org.eclipse.ui.IWorkbenchPart;
