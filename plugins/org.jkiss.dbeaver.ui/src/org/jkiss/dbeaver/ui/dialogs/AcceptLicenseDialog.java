    protected void createButtonsForButtonBar(Composite parent) {
        Text textControl = new Text(composite, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
    private final String title;
 *
 */
        getShell().setText(title);
 *
        gd.minimumWidth = 100;

    protected boolean isResizable() {
    }
    protected Control createDialogArea(Composite parent) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
}
        this.title = title;
        gd.minimumHeight = 100;
public class AcceptLicenseDialog extends Dialog {
 * distributed under the License is distributed on an "AS IS" BASIS,
    public AcceptLicenseDialog(Shell parentShell, String title, String license) {
        this.license = license;
    }
            return true;

 * Copyright (C) 2010-2024 DBeaver Corp and others
            createButton(parent, IDialogConstants.OK_ID, IDialogConstants.YES_LABEL, true);
    }
        if (dialog.open() == IDialogConstants.OK_ID) {
        gd.heightHint = 300;
import org.eclipse.swt.SWT;
/*

    }
        Composite composite = (Composite) super.createDialogArea(parent);
        AcceptLicenseDialog dialog = new AcceptLicenseDialog(parentShell, title, license);
            return false;
            createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.NO_LABEL, false);

        }
        return parent;



        textControl.setLayoutData(gd);

        super(parentShell);
    }

        } else {
    @Override
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Control;

import org.jkiss.dbeaver.ui.UIUtils;
        if (viewMode) {
import org.eclipse.swt.widgets.Text;
    @Override
        this.viewMode = viewMode;
    private boolean viewMode;
            createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        textControl.setEditable(false);
        } else {
import org.eclipse.swt.widgets.Shell;
    @Override
        return true;


        textControl.setText(license);
    public void setViewMode(boolean viewMode) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridData;
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.dialogs.IDialogConstants;
 * You may obtain a copy of the License at
 * limitations under the License.
    private final String license;
package org.jkiss.dbeaver.ui.dialogs;
 * Unless required by applicable law or agreed to in writing, software
 *
 * DBeaver - Universal Database Manager

import org.eclipse.jface.dialogs.Dialog;
        gd.widthHint = 400;
        UIUtils.createControlLabel(composite, title);
 * Licensed under the Apache License, Version 2.0 (the "License");
        GridData gd = new GridData(GridData.FILL_BOTH);
    public static boolean acceptLicense(Shell parentShell, String title, String license) {
