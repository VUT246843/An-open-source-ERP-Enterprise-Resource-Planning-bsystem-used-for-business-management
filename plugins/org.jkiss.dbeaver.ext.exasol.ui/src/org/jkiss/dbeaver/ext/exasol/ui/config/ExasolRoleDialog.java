import org.eclipse.swt.widgets.Composite;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        final Composite composite = super.createDialogArea(parent);
    public ExasolRoleDialog(Shell parentShell) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        getButton(IDialogConstants.OK_ID).setEnabled(false);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
    private String comment;
    {

    protected void createButtonsForButtonBar(Composite parent)
 * DBeaver - Universal Database Manager
        final Text commentText = UIUtils.createLabelText(group, ExasolMessages.dialog_create_role_description, "");
package org.jkiss.dbeaver.ext.exasol.ui.config;
    }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    @Override
import org.eclipse.swt.layout.GridData;
        final Composite group = new Composite(composite, SWT.NONE);
    @Override
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
public class ExasolRoleDialog extends BaseDialog {
    private String name;
        
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.SWT;
    }
    public String getName() {
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.jface.dialogs.IDialogConstants;
        commentText.addModifyListener(mod);
            public void modifyText(ModifyEvent e) {
        group.setLayout(new GridLayout(2, false));
    
    
 * limitations under the License.
        super(parentShell, ExasolMessages.dialog_create_role_title,null);
 *
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.events.ModifyEvent;

    
        super.createButtonsForButtonBar(parent);
        group.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
                getButton(IDialogConstants.OK_ID).setEnabled(!name.isEmpty());

                name = nameText.getText().trim();

                comment = commentText.getText();
        return comment;

        nameText.addModifyListener(mod);
        return composite;
 *
            }
        
            @Override
    
/*
 * You may obtain a copy of the License at
 *
}

 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
        };
    }
        final Text nameText = UIUtils.createLabelText(group, ExasolMessages.dialog_create_role_role_name, "");
    
import org.jkiss.dbeaver.ext.exasol.ui.internal.ExasolMessages;
        ModifyListener mod = new ModifyListener() {
    public String getDescription() {
    

 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2016-2017 Karl Griesser (fullref@gmail.com)
        return name;
 */
    {

    protected Composite createDialogArea(Composite parent)
