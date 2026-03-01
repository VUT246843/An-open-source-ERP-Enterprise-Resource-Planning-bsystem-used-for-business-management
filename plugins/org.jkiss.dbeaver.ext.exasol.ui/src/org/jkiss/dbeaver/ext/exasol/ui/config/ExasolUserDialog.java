    }
        		ExasolMessages.dialog_create_user_ldap,
	        				principalText.setEnabled(false);
	        		}
	        				urlText.setEnabled(false);
    
        return name;

 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getPassword()
 * Unless required by applicable law or agreed to in writing, software
    public String getComment()
import org.eclipse.jface.dialogs.IDialogConstants;
    private String comment = "";
        return comment;
                	)
        final Text urlText = UIUtils.createLabelText(groupText,ExasolMessages.dialog_create_user_ldap_dn, "");
	        				passwordText.setEnabled(false);
        	
 * You may obtain a copy of the License at
        for (ExasolUserType type: ExasolUserType.values())
    }
        final Text commentText = UIUtils.createLabelText(group,ExasolMessages.dialog_create_user_comment, "", SWT.BORDER | SWT.MULTI);
 * you may not use this file except in compliance with the License.
        
	        				urlText.setEnabled(false);
    public String getLDAPDN()

							break;
    {
    {
/*
        final Composite groupText = new Composite(composite, SWT.NONE);
 * DBeaver - Universal Database Manager
                name = nameText.getText().trim();
                //enable/disable OK button
		urlText.setEnabled(false);
	        UIUtils.createRadioButton(
        final Text principalText = UIUtils.createLabelText(groupText,ExasolMessages.dialog_create_user_kerberos_principal, "");


    
		principalText.setEnabled(false);
        {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private ExasolUserType selectedType;
							break;
import org.eclipse.swt.layout.GridLayout;
                		(selectedType == ExasolUserType.LDAP & ldapDN.isEmpty()) |
        
	            } else {
                ldapDN  = urlText.getText().trim();
    {
                password = passwordText.getText();
        		ExasolMessages.dialog_create_user_kerberos,
        urlText.addModifyListener(mod);
 *
    }
		passwordText.setEnabled(false);
						case LDAP:
                		(selectedType == ExasolUserType.KERBEROS & kerberosPrincipal.isEmpty()) |
}
	        				urlText.setEnabled(false);

    private String kerberosPrincipal;
	        			switch (selectedType) {
import org.eclipse.swt.widgets.Shell;

    {
	        cnt++;
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
import org.jkiss.dbeaver.ext.exasol.ExasolUserType;
import org.eclipse.swt.widgets.Text;

        principalText.addModifyListener(mod);
        super.createButtonsForButtonBar(parent);
        group.setLayoutData(new GridData(GridData.FILL_BOTH));
    public String getName()
import org.jkiss.dbeaver.ext.exasol.ui.internal.ExasolMessages;

	        				principalText.setEnabled(false);
	        				passwordText.setEnabled(false);
 *
        groupText.setLayoutData(new GridData(GridData.FILL_BOTH));
    {
import org.eclipse.swt.events.ModifyListener;
	                getButton(IDialogConstants.OK_ID).setEnabled(true);
	        		type,
	        				principalText.setEnabled(true);
                
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.layout.GridData;
	        				passwordText.setEnabled(false);
						}
    {
	        		userTypes[cnt], 
        return ldapDN;
                    getButton(IDialogConstants.OK_ID).setEnabled(false);
        final Text passwordText = UIUtils.createLabelText(groupText, ExasolMessages.dialog_create_user_local_password, "", SWT.BORDER | SWT.PASSWORD);
    protected Composite createDialogArea(Composite parent)
        		};
        getButton(IDialogConstants.OK_ID).setEnabled(false);
 * See the License for the specific language governing permissions and
						break;
						case KERBEROS:
    
            @Override
        nameText.addModifyListener(mod);
    private String name = "";
        groupText.setLayout(new GridLayout(2, true));
	        				passwordText.setEnabled(true);
    @Override
    public ExasolUserDialog(Shell parentShell, ExasolDataSource datasource)
        return composite;
        final Text nameText = UIUtils.createLabelText(group, ExasolMessages.dialog_create_user_userid, "");
						case LOCAL:
    public ExasolUserType getUserType() {
 *
    }

        final Composite composite = super.createDialogArea(parent);
                getButton(IDialogConstants.OK_ID).setEnabled(!name.isEmpty());
public class ExasolUserDialog extends BaseDialog {
        urlText.setEnabled(false);
	        			selectedType = (ExasolUserType)selectionEvent.widget.getData();
    	return selectedType;

        return password;
        }

import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.events.SelectionListener;
        passwordText.addModifyListener(mod);
	        				principalText.setEnabled(false);
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
	        		));
        ModifyListener mod = new ModifyListener() {
                kerberosPrincipal = principalText.getText().trim();
    
    }


 */
        final Composite group = new Composite(composite, SWT.NONE);
    }


    public String getKerberosPrincipal()
        };
	        				urlText.setEnabled(true);
                if (
    protected void createButtonsForButtonBar(Composite parent)
package org.jkiss.dbeaver.ext.exasol.ui.config;
    private String ldapDN = "";
    	return kerberosPrincipal;
    
        super(parentShell,"Create User",null);
        int cnt = 0;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
	        		SelectionListener.widgetSelectedAdapter(selectionEvent -> {
    
    private String password = "";
	        		group,  
    }
                {

    {
    
            }
                		(selectedType == ExasolUserType.LOCAL & password.isEmpty()) 

                		name.isEmpty() |
    
							break;
 * Copyright (C) 2017 Karl Griesser (fullref@gmail.com)
						default:
        		ExasolMessages.dialog_create_user_local
    @Override
            public void modifyText(ModifyEvent e) {
        
import org.eclipse.swt.events.ModifyEvent;
    }
                comment = commentText.getText();
import org.eclipse.swt.SWT;
        String[] userTypes = new String[] {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	            }
        group.setLayout(new GridLayout(2, true));
 * limitations under the License.
    {
