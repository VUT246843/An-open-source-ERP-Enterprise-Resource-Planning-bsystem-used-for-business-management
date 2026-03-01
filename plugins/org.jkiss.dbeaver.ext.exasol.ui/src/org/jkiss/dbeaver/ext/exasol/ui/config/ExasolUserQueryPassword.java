
    }
    public String getPassword() {

 * See the License for the specific language governing permissions and
        final Composite group = new Composite(composite, SWT.NONE);
import org.eclipse.swt.events.ModifyListener;
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
}
        super.createButtonsForButtonBar(parent);
            @Override
        });
import org.eclipse.swt.widgets.Text;
 *
            }
    
        return password;
    protected Composite createDialogArea(Composite parent)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    
 */
    protected void createButtonsForButtonBar(Composite parent)
    }
        final Composite composite = super.createDialogArea(parent);
        group.setLayout(new GridLayout(2, true));
    
import org.eclipse.swt.widgets.Shell;
    
public class ExasolUserQueryPassword extends BaseDialog {
 *
import org.eclipse.swt.widgets.Composite;
        super(parentShell,"Query old Password",null);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override

    }
 *
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    private String password;
        return composite;
/*
    {

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.layout.GridLayout;
                getButton(IDialogConstants.OK_ID).setEnabled(!password.isEmpty());
            public void modifyText(ModifyEvent e) {

    {
        
import org.jkiss.dbeaver.ui.UIUtils;
        passwordText.addModifyListener(new ModifyListener() {
    @Override
        final Text passwordText = UIUtils.createLabelText(group, "Old Password", "", SWT.PASSWORD);
import org.eclipse.swt.events.ModifyEvent;

 * you may not use this file except in compliance with the License.
    public ExasolUserQueryPassword(Shell parentShell) {
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.exasol.ui.config;
                password = passwordText.getText();
        getButton(IDialogConstants.OK_ID).setEnabled(false);
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.jface.dialogs.IDialogConstants;


import org.eclipse.swt.SWT;
    }
    
 * Copyright (C) 2016-2017 Karl Griesser (fullref@gmail.com)
    

