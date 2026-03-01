            {
            comment = commentText.getText();
import org.jkiss.dbeaver.ext.exasol.ui.internal.ExasolMessages;
        return user;
        return comment;
    
import org.eclipse.swt.events.SelectionAdapter;
            //enable/disable OK button
                getButton(IDialogConstants.OK_ID).setEnabled(false);
        group.setLayout(new GridLayout(2, false));
    @Override
    }
        passwordText.addModifyListener(mod);
import org.eclipse.swt.events.ModifyListener;


                        )
    private String name = "";
        gd.heightHint = 200;
            
        group.setLayout(new GridLayout(2, true));  
        final Composite composite = super.createDialogArea(parent);

                    (
 * You may obtain a copy of the License at
    public ExasolConnectionDialog(Shell parentShell, ExasolDataSource datasource)
                            CommonUtils.isEmpty(password)

            if (
    {
        final Composite group = new Composite(composite, SWT.NONE);
        };
    

            user = userText.getText().trim();
            {
    public String getPassword()
        Text userText = UIUtils.createLabelText(group, ExasolMessages.dialog_create_connection_user, "");
import org.eclipse.swt.widgets.Text;
    {

    {
                    | name.isEmpty()
        return url;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
/*
            }
        
            }
                        (
    protected void createButtonsForButtonBar(Composite parent)
    }
            name = nameText.getText().trim();
        

    private String url = "";
    {
        super.createButtonsForButtonBar(parent);
 * DBeaver - Universal Database Manager

        return name;
import org.jkiss.dbeaver.ui.UIUtils;
                    )
                    | url.isEmpty()
        userText.addModifyListener(mod);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.widgets.Shell;
                getButton(IDialogConstants.OK_ID).setEnabled(true);
    {
 * See the License for the specific language governing permissions and
                passwordText.setEnabled(saveCred.getSelection());
        GridData gd = new GridData(GridData.FILL_BOTH);
    }
        group.setLayoutData(gd);
        });
    
    protected Composite createDialogArea(Composite parent)
    @Override
    public String getName()
    {
        gd.widthHint = 250;
    }
import org.eclipse.swt.layout.GridLayout;

        gd.verticalIndent = 0;
 * Copyright (C) 2017 Karl Griesser (fullref@gmail.com)

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
                            CommonUtils.isEmpty(user) |
    public String getUser()
        Text passwordText = UIUtils.createLabelText(group, ExasolMessages.dialog_create_connection_password, "", SWT.BORDER | SWT.PASSWORD);
                userText.setEnabled(saveCred.getSelection());
    private String user = "";
                )
        final Text commentText = UIUtils.createLabelText(group,ExasolMessages.dialog_create_connection_description, "");
    
 *
        saveCred.addSelectionListener(new SelectionAdapter() {
 *     http://www.apache.org/licenses/LICENSE-2.0
            password = passwordText.getText();
package org.jkiss.dbeaver.ext.exasol.ui.config;
    private String password = "";
            url  = urlText.getText().trim();
    
        urlText.addModifyListener(mod);
import org.eclipse.swt.events.SelectionEvent;

    }
    public String getUrl()
        
import org.jkiss.utils.CommonUtils;
public class ExasolConnectionDialog extends BaseDialog {
        return composite;
        final Text urlText = UIUtils.createLabelText(group,ExasolMessages.dialog_create_connection_connection_url, "");
    }

                        saveCred.getSelection() &
            } else {
        Button saveCred = UIUtils.createCheckbox(group, ExasolMessages.dialog_create_connection_provide_credentials,ExasolMessages.dialog_create_connection_provide_credentials_tip, false, 2);
}
        nameText.addModifyListener(mod);
 * Unless required by applicable law or agreed to in writing, software
        ModifyListener mod = e -> {
import org.eclipse.swt.widgets.Button;
    }
import org.eclipse.swt.widgets.Composite;

    {
        final Text nameText = UIUtils.createLabelText(group, ExasolMessages.dialog_create_connection_connection_name, "");

        
import org.eclipse.swt.layout.GridData;
    }

            @Override
        userText.setEnabled(false);
    private String comment = "";
        super(parentShell, ExasolMessages.dialog_create_connection_title,null);
    public String getComment()
 */
import org.eclipse.jface.dialogs.IDialogConstants;
        commentText.addModifyListener(mod);
 * you may not use this file except in compliance with the License.

        return password;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        gd.horizontalIndent = 0;
    {
        passwordText.setEnabled(false);
            public void widgetSelected(SelectionEvent e)
 *
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
            
        getButton(IDialogConstants.OK_ID).setEnabled(false);
import org.eclipse.swt.SWT;
 * limitations under the License.
    

