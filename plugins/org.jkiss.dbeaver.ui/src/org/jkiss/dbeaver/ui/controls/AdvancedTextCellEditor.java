            textEditor.selectAll();
            super.doSetFocus();
package org.jkiss.dbeaver.ui.controls;
import org.eclipse.swt.widgets.Control;

    protected void doSetValue(Object value) {
        if (textEditor == null) {

        );
    protected int getDoubleClickTimeout() {
    private Text textEditor;
 */
            }
        }
    }
            @Override
 *
        super(parent);
    protected Object openDialogBox(Control cellEditorWindow) {
        result.setImage(DBeaverIcons.getImage(UIIcon.DOTS_BUTTON)); //$NON-NLS-1$
                });
 */
        super.doSetValue(CommonUtils.toString(value));
public class AdvancedTextCellEditor extends DialogCellEditor {
    }
            UIMessages.edit_text_dialog_title_edit_value,
        String value = EditTextDialog.editText(
    }
        textEditor.setBackground(cell.getBackground());
        }
 *
        return textEditor;
            return value;
import org.jkiss.dbeaver.ui.UIUtils;
        if (textEditor == null || textEditor.isDisposed()) {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.SWT;
        textEditor.removeFocusListener(textFocusListener);

        return textEditor;

    }
        } else {
import org.jkiss.dbeaver.ui.internal.UIMessages;
        Button result = new Button(parent, SWT.DOWN | SWT.NO_FOCUS);
    protected Button createButton(Composite parent) {
    @Override
                e.doit = false;
                        AdvancedTextCellEditor.this.fireApplyEditorValue();
        final Object value;
        textEditor.addTraverseListener(e -> {
        textFocusListener = new FocusAdapter() {
 * DBeaver - Universal Database Manager

        }
    @Override
        //result.setText("..."); //$NON-NLS-1$
    @Override
}

            value = textEditor.getText();
            textEditor.setFocus();
            (String) getValue()
        textEditor = new Text(cell, SWT.LEFT);
import org.jkiss.dbeaver.ui.DBeaverIcons;

        if (value != null) {
        }
import org.eclipse.jface.viewers.DialogCellEditor;
            cellEditorWindow.getShell(),
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * See the License for the specific language governing permissions and
    }
        } else {

    @Override
import org.jkiss.dbeaver.ui.UIIcon;
    }
        }
        return 0;
        return result;
        };
        if (wasNull && "".equals(value)) { //$NON-NLS-1$
 * You may obtain a copy of the License at
    protected void updateContents(Object value) {
        textEditor.addFocusListener(textFocusListener);
    private boolean wasNull;
        });
                focusLost();
import org.eclipse.swt.events.FocusEvent;
            }
            wasNull = true;
/**
        textEditor.setFont(cell.getFont());
            textEditor.setText((String) value);

            value = super.doGetValue();

    public AdvancedTextCellEditor(Composite parent) {
    public Text getTextEditor() {
            public void focusLost(FocusEvent e) {
    }
                doSetValue(textEditor.getText());
import org.eclipse.swt.events.FocusAdapter;


    }
        } else {
        }
    @Override
 * you may not use this file except in compliance with the License.
    }
 * limitations under the License.
    private FocusAdapter textFocusListener;
import org.eclipse.swt.widgets.Button;
                e.detail = SWT.TRAVERSE_NONE;
        if (value == null) {
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.dialogs.EditTextDialog;
 *     http://www.apache.org/licenses/LICENSE-2.0
        return value;

        if (textEditor != null) {
    protected Control createContents(Composite cell) {
import org.eclipse.swt.widgets.Composite;
    protected Object doGetValue() {
import org.eclipse.swt.widgets.Text;
    @Override
    protected void doSetFocus() {
                UIUtils.asyncExec(() -> {
                    }

        textEditor.addFocusListener(textFocusListener);
            return;
/*
            return null;

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.utils.CommonUtils;
                    if (!UIUtils.hasFocus(cell)) {
 * Text editor with dialog

            if (e.detail == SWT.TRAVERSE_RETURN) {

