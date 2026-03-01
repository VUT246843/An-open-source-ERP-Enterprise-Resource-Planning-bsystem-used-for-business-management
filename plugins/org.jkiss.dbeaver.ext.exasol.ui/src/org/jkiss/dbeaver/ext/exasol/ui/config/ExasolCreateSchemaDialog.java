    private List<ExasolGrantee> grantees;
    protected Composite createDialogArea(Composite parent)
    

                        for (ExasolGrantee grantee: grantees)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                return Status.OK_STATUS;
import org.jkiss.dbeaver.DBException;
    {
        
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
                }
    private String name;
                            String name = grantee.getName();
    }
        return name;

    }
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        return owner;
    protected void createButtonsForButtonBar(Composite parent)
    private ExasolGrantee owner;
    }
        group.setLayout(new GridLayout(2, false));
        final Composite composite = super.createDialogArea(parent);

            name = nameText.getText().trim();
}
import org.jkiss.dbeaver.utils.GeneralUtils;
 * limitations under the License.
        super.createButtonsForButtonBar(parent);
            }
        });
        userCombo.addSelectionListener(new SelectionAdapter() {
    private void updateButtons() {
 *
import org.eclipse.swt.events.SelectionAdapter;
    
                        }
 * See the License for the specific language governing permissions and
        }.schedule();
    private ExasolDataSource datasource;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.core.runtime.IStatus;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.swt.widgets.Text;
        getButton(IDialogConstants.OK_ID).setEnabled(!name.isEmpty());
import java.util.List;
        final Text nameText = UIUtils.createLabelText(group, ExasolMessages.dialog_create_schema_schema_name, "");
import org.eclipse.swt.widgets.Combo;
import org.jkiss.dbeaver.ext.exasol.model.security.ExasolGrantee;
                    });

 * Unless required by applicable law or agreed to in writing, software
                    UIUtils.syncExec(() -> {
 *

    
            @Override
import org.eclipse.jface.dialogs.IDialogConstants;
 * DBeaver - Universal Database Manager
    public String getName() {
    {
        group.setLayoutData(gd);
                        {

package org.jkiss.dbeaver.ext.exasol.ui.config;
                            userCombo.add(name);
        
        final Combo userCombo = UIUtils.createLabelCombo(group, ExasolMessages.dialog_create_schema_owner, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
        getButton(IDialogConstants.OK_ID).setEnabled(false);
    }
import org.jkiss.dbeaver.ext.exasol.ui.internal.ExasolMessages;
 * You may obtain a copy of the License at

/*
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    public ExasolGrantee getOwner() {
public class ExasolCreateSchemaDialog extends BaseDialog {
 * distributed under the License is distributed on an "AS IS" BASIS,
                try {
        new AbstractJob("Load users") {
import java.util.ArrayList;
import org.eclipse.swt.layout.GridLayout;
    @Override
 *
    
 * you may not use this file except in compliance with the License.
            @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    
            @Override
                    return GeneralUtils.makeExceptionStatus(e);
    }
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.ui.UIUtils;

        return composite;
            public void widgetSelected(SelectionEvent e) {
                    
    public ExasolCreateSchemaDialog(Shell parentShell, ExasolDataSource datasource) {
            }


 * Licensed under the Apache License, Version 2.0 (the "License");
                } catch (DBException e) {

import org.eclipse.swt.widgets.Composite;

                    grantees = new ArrayList<>(datasource.getAllGrantees(monitor));
        
import org.eclipse.core.runtime.Status;
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
            updateButtons();
        });
import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
        this.datasource = datasource;
        super(parentShell, ExasolMessages.dialog_create_schema_title,null);
        nameText.addModifyListener(e -> {
import org.eclipse.swt.SWT;
                owner = grantees.get(userCombo.getSelectionIndex());
    @Override
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {

        final Composite group = new Composite(composite, SWT.NONE);

