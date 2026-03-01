        return null;//UIUtils.getDialogSettings("DBeaver.EnterNameDialog"); //$NON-NLS-1$
        createControlsAfterName(propGroup);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            return result;

        Composite propGroup = new Composite(parent, SWT.NONE);
}
    public String chooseName()
 */
    {

        } else {
 * See the License for the specific language governing permissions and
    {
    }

    {

    public String getResult()
    @Override
import org.eclipse.jface.dialogs.Dialog;

        super.createButtonsForButtonBar(parent);
            return null;
    protected Text propNameText;
/*
package org.jkiss.dbeaver.ui.dialogs;
    {

        return chooseName(parentShell, propertyName, null);

public class EnterNameDialog extends Dialog {
        GridData gd = new GridData(GridData.FILL_BOTH);

        if (open() == IDialogConstants.OK_ID) {
        this.propertyName = propertyName;
        createControlsBeforeName(propGroup);
        if (propertyValue != null) {
        propNameText = UIUtils.createLabelText(propGroup, propertyName, null);
    private String propertyName;
    public EnterNameDialog(Shell parentShell, String propertyName, String propertyValue)
        propGroup.setLayout(gl);
import org.eclipse.swt.layout.GridData;

 * you may not use this file except in compliance with the License.
    private String propertyValue;
        GridLayout gl = new GridLayout(1, false);
 *
    }
        }
import org.eclipse.swt.SWT;
 * DBeaver - Universal Database Manager
        Button button = getButton(IDialogConstants.OK_ID);
 * You may obtain a copy of the License at
        gl.marginWidth = 10;
    {
        getShell().setText(propertyName);
        EnterNameDialog dialog = new EnterNameDialog(parentShell, propertyName, propertyValue);
            button.setEnabled(!CommonUtils.isEmptyTrimmed(propNameText.getText()));
    }
        propGroup.setLayoutData(gd);
    }
        gd.minimumWidth = 300;
 *
        if (button != null && propNameText != null) {
import org.eclipse.swt.widgets.Button;
            propNameText.setText(propertyValue);
    {
    public static String chooseName(Shell parentShell, String propertyName)
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Licensed under the Apache License, Version 2.0 (the "License");
        this.propertyValue = propertyValue;
        gl.marginHeight = 10;


import org.eclipse.swt.widgets.Shell;
    }
 *
import org.jkiss.utils.CommonUtils;


            propNameText.selectAll();
import org.eclipse.jface.dialogs.IDialogSettings;
        result = propNameText.getText();
    protected void createButtonsForButtonBar(Composite parent) {

    }
    protected Composite createDialogArea(Composite parent)
 * Unless required by applicable law or agreed to in writing, software

    }
    @Override
    @Override
        propNameText.addModifyListener(e -> updateButtonsState());
        super(parentShell);
        return result;
        return propGroup;
import org.eclipse.jface.dialogs.IDialogConstants;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others


    @Override
        return dialog.chooseName();

    public static String chooseName(Shell parentShell, String propertyName, String propertyValue)
import org.eclipse.swt.widgets.Text;
    protected IDialogSettings getDialogBoundsSettings() {
        }
    @Override
    }
        return true;
    protected void createControlsBeforeName(Composite composite) {
        updateButtonsState();
    protected void okPressed()
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.layout.GridLayout;
    {
import org.eclipse.swt.widgets.Composite;
        super.okPressed();
    protected boolean isResizable() {

        }
    protected void createControlsAfterName(Composite composite) {
    }
    }
import org.jkiss.dbeaver.ui.UIUtils;
    private String result;

    }
 * limitations under the License.
    protected void updateButtonsState() {
