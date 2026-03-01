 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
            return null;
        }
            textWidth = 0;
    public void setAutoSize(boolean autoSize) {
            textHeight = 0;
    @Override
    private boolean readonly = false;
    }
    protected void createControlsBeforeText(Composite composite) {
    public EditTextDialog(Shell parentShell, String title, String text, boolean readOnly) {
    }
    private String text;
            textControl.setText(text);
        Composite composite = super.createDialogArea(parent);


        if (!readonly) {
    }
 * See the License for the specific language governing permissions and
import org.eclipse.jface.dialogs.IDialogConstants;

    protected int textHeight = 200;
        textControl.setEditable(!readonly);
            gd.heightHint = textHeight;
        super(parentShell, title, null);
        if (text != null) {
 * DBeaver - Universal Database Manager


    }
        } else {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);

        if (autoSize) {
import org.eclipse.swt.widgets.Composite;
        text = textControl.getText();
            textHeight = 200;
    protected int textWidth = 300;
        }
 * limitations under the License.

/*
 * Unless required by applicable law or agreed to in writing, software
        if (textHeight > 0) {
 */
        super.okPressed();
    }
        this.readonly = readonly;
    public EditTextDialog(Shell parentShell, String title, String text) {

        this.readonly = readOnly;
    protected Composite createDialogArea(Composite parent) {
    public static String editText(Shell parentShell, String title, String text) {
    private Text textControl;
    private boolean monospaceFont;
    }
    public void setReadonly(boolean readonly) {
        textControl = new Text(composite, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
 *
    protected void okPressed() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        this.text = text;
import org.eclipse.swt.layout.GridData;
        textControl.setLayoutData(gd);
 * Licensed under the Apache License, Version 2.0 (the "License");
        this(parentShell, title, text, false);
    @Override
        EditTextDialog dialog = new EditTextDialog(parentShell, title, text);
            gd.widthHint = textWidth;
        }
package org.jkiss.dbeaver.ui.dialogs;
        if (monospaceFont) {


    }

    }
            textWidth = 300;
        gd.minimumWidth = 100;

        return composite;
 * you may not use this file except in compliance with the License.
            return dialog.text;
        createControlsBeforeText(composite);
import org.eclipse.swt.widgets.Text;
    protected void createButtonsForButtonBar(Composite parent) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        EditTextDialog dialog = new EditTextDialog(parentShell, title, text);
        }
    public void setMonospaceFont(boolean monospaceFont) {
            createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
        } else {
        gd.minimumHeight = 100;
}
 * You may obtain a copy of the License at
    public static void showText(Shell parentShell, String title, String text) {
    }
import org.jkiss.dbeaver.ui.UIUtils;
        if (dialog.open() == IDialogConstants.OK_ID) {
        }
    }
            textControl.setFont(UIUtils.getMonospaceFont());


import org.eclipse.swt.SWT;
 *
 *
public class EditTextDialog extends BaseDialog {
        }
        if (textWidth > 0) {
    @Override
        this.monospaceFont = monospaceFont;

        dialog.open();
import org.eclipse.swt.widgets.Shell;
        dialog.setReadonly(true);

        GridData gd = new GridData(GridData.FILL_BOTH);
    }
