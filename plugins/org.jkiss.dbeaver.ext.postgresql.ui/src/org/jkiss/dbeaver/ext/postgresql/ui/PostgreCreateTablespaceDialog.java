 * DBeaver - Universal Database Manager
    }
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.core.runtime.Status;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        return composite;
    protected void createButtonsForButtonBar(Composite parent)
        final Text nameText = UIUtils.createLabelText(group, PostgreMessages.dialog_create_tablespace_name, ""); //$NON-NLS-2$
import org.eclipse.jface.dialogs.IDialogConstants;
                        for (PostgreRole authId : allUsers) {
package org.jkiss.dbeaver.ext.postgresql.ui;
                } catch (DBException e) {
                loc = locText.getText();
    
import org.eclipse.jface.dialogs.IDialogSettings;

import org.eclipse.swt.events.ModifyListener;
                checkEnabled();
    }
        this.newTablespace = tablespace;
            public void modifyText(ModifyEvent e) {
            });
import org.eclipse.swt.events.ModifyEvent;
    public String getOptions() {
                            }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        

import java.util.List;
        gd.widthHint = 600;
                    });
        GridData gd1 = new GridData(GridData.FILL_BOTH);
 */
import org.eclipse.swt.layout.GridLayout;
        return loc;
                try {
            SWT.BORDER | SWT.READ_ONLY);
        gd1.heightHint = optionsText.getLineHeight() * 6;
 *
    private String options = null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.eclipse.swt.SWT;


    {
    }


        gd1.widthHint = optionsText.getLineHeight() * 30;
        new AbstractJob("Load users") {


        group.setLayoutData(gd);
    {
    private String name = null;

    protected Composite createDialogArea(Composite parent) {
        optionsText.addModifyListener(e -> options = optionsText.getText());
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
import org.jkiss.dbeaver.ui.UIUtils;
    }
public class PostgreCreateTablespaceDialog extends BaseDialog
    private final PostgreTablespace newTablespace;
            okButton.setEnabled(CommonUtils.isNotEmpty(name) &&
            public void widgetSelected(SelectionEvent e) {
        final Combo userCombo = UIUtils.createLabelCombo(group, PostgreMessages.dialog_create_tablespace_owner, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);

}
    public String getLoc() {
    
        gd.heightHint = 200;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
import org.eclipse.swt.widgets.*;

        nameText.addModifyListener(new ModifyListener() {
                            String name = authId.getName();
            }
    }
            }
import org.eclipse.swt.layout.GridData;
        userCombo.addSelectionListener(new SelectionAdapter() {
            @Override
    private String loc = null;
        group.setLayout(new GridLayout(2, false));
                name = nameText.getText().trim();
/**
 *
    private void checkEnabled() {

        return UIUtils.getDialogSettings(DIALOG_ID);
    @Override
                checkEnabled();

        Button okButton = getButton(IDialogConstants.OK_ID);

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return options;
    private static final String DIALOG_ID = "DBeaver.PostgreCreateTablespaceDialog";//$NON-NLS-1$
                    allUsers = new ArrayList<>(newTablespace.getDatabase().getUsers(monitor));
                owner = allUsers.get(userCombo.getSelectionIndex());
                checkEnabled();

    }
        }.schedule();
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
 * Unless required by applicable law or agreed to in writing, software
    private List<PostgreRole> allUsers;
            PostgreMessages.dialog_create_tablespace_database,
            @Override
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTablespace;
import org.eclipse.core.runtime.IStatus;
            @NotNull
    public PostgreRole getOwner() {
    public String getName() {
 */
        super.createButtonsForButtonBar(parent);
                }
    protected IDialogSettings getDialogBoundsSettings()
                return Status.OK_STATUS;
 * You may obtain a copy of the License at
    public PostgreCreateTablespaceDialog(Shell parentShell, PostgreTablespace tablespace) {
        if (okButton != null) {
            @Override
        
        GridData gd = new GridData(GridData.FILL_BOTH);
 *     http://www.apache.org/licenses/LICENSE-2.0
            final Text locText = UIUtils.createLabelText(group, PostgreMessages.dialog_create_tablespace_loc, "");
    @Override
        gd.verticalIndent = 0;
        getButton(IDialogConstants.OK_ID).setEnabled(false);
    
import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;
    }
        gd.horizontalIndent = 0;
                    return GeneralUtils.makeExceptionStatus(e);
import org.jkiss.utils.CommonUtils;
        return name;
        final Composite composite = super.createDialogArea(parent);
 * PostgreCreateExtensionDialog
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
            locText.addModifyListener(e -> {
        optionsText.setLayoutData(gd1);

import java.util.ArrayList;
                        }
            newTablespace.getDatabase().getName(),
        UIUtils.createLabelText(group,
                            userCombo.add(name);

import org.jkiss.dbeaver.DBException;
        });
        });
        return owner;
import org.eclipse.swt.events.SelectionEvent;
            }
                    final PostgreRole dba = newTablespace.getDatabase().getDBA(monitor);

 * limitations under the License.
    private PostgreRole owner;
          
        super(parentShell, PostgreMessages.dialog_create_tablespace_title, null);
                            if (name.equals(defUserName)) {
 * See the License for the specific language governing permissions and
                                owner = authId;
import org.jkiss.dbeaver.utils.GeneralUtils;

                    UIUtils.syncExec(() -> {
 * you may not use this file except in compliance with the License.
 *

{
        final Composite group = new Composite(composite, SWT.NONE);
        UIUtils.createControlLabel(group, PostgreMessages.dialog_create_tablespace_options);
import org.jkiss.code.NotNull;
        final Text optionsText = new Text(group, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.WRAP);
    }
                    final String defUserName = dba == null ? "" : dba.getName(); //$NON-NLS-1$
                        userCombo.setText(defUserName);
/*
                (!newTablespace.getDataSource().getServerType().supportsTablespaceLocation() || (loc != null && !loc.isEmpty())));

        if (newTablespace.getDataSource().getServerType().supportsTablespaceLocation()) {
