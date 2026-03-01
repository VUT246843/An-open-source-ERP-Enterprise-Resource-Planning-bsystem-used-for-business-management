public class PostgreCreateSchemaDialog extends BaseDialog {
import org.eclipse.core.runtime.IStatus;
    }
import java.util.List;
                    String currentUserName = schema.getDatabase().getDataSource()
        final Composite group = new Composite(composite, SWT.NONE);
                        userCombo.setText(defUserName);
            @Override
        nameText.addModifyListener(new ModifyListener() {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
 * You may obtain a copy of the License at
import org.eclipse.swt.layout.GridLayout;
                    // get the current connection username instead of DBA

            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        });
 */
                            String name = authId.getName();
            public void widgetSelected(SelectionEvent e) {
                name = nameText.getText().trim();
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
package org.jkiss.dbeaver.ext.postgresql.ui;
    @Override
import org.eclipse.core.runtime.Status;
                return Status.OK_STATUS;
import org.eclipse.swt.events.ModifyEvent;
            public void modifyText(ModifyEvent e) {
                    return GeneralUtils.makeExceptionStatus(e);
            }
                    allUsers = new ArrayList<>(schema.getDatabase().getUsers(monitor));
        final Text nameText = UIUtils.createLabelText(group, PostgreMessages.dialog_create_schema_name, ""); //$NON-NLS-2$

 * Licensed under the Apache License, Version 2.0 (the "License");

        group.setLayout(new GridLayout(2, false));
    public PostgreCreateSchemaDialog(Shell parentShell, PostgreSchema schema) {
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
                getButton(IDialogConstants.OK_ID).setEnabled(!name.isEmpty());
    private PostgreRole owner;
        this.schema = schema;
                        .getUserName();
    public PostgreRole getOwner() {
        super(parentShell, PostgreMessages.dialog_create_schema_title, null);

import org.eclipse.swt.SWT;
}
import org.jkiss.utils.CommonUtils;
            @Override
 *

                    UIUtils.syncExec(() -> {

 * you may not use this file except in compliance with the License.
                            userCombo.add(name);

        final Text databaseText = UIUtils.createLabelText(group, "Database", schema.getDatabase().getName(), SWT.BORDER | SWT.READ_ONLY); //$NON-NLS-2$
    protected void createButtonsForButtonBar(Composite parent) {
import org.eclipse.swt.widgets.Shell;

import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.eclipse.swt.events.SelectionEvent;
    public String getName() {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final PostgreSchema schema;
        group.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.eclipse.swt.events.ModifyListener;
    @Override
import java.util.ArrayList;
        return owner;
    }

        new AbstractJob("Load users") {
        final Combo userCombo = UIUtils.createLabelCombo(group, PostgreMessages.dialog_create_schema_owner, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        final Composite composite = super.createDialogArea(parent);


                            }
import org.jkiss.dbeaver.utils.GeneralUtils;
 *
 */
 *
                }
    private String name;
                        for (PostgreRole authId : allUsers) {
                owner = allUsers.get(userCombo.getSelectionIndex());
                } catch (DBException e) {
                try {
 * distributed under the License is distributed on an "AS IS" BASIS,

                        .getContainer()
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.dialogs.IDialogConstants;
            }
        return name;
    }
                        }
import org.jkiss.code.NotNull;
            @Override
 * DBeaver - Universal Database Manager
        userCombo.addSelectionListener(new SelectionAdapter() {
import org.eclipse.swt.widgets.Composite;
    protected Composite createDialogArea(Composite parent) {
        });
    private List<PostgreRole> allUsers;
        getButton(IDialogConstants.OK_ID).setEnabled(false);
                    final String defUserName = CommonUtils.isEmpty(currentUserName) ? "" : currentUserName;
                    });
import org.jkiss.dbeaver.model.runtime.AbstractJob;
/**
                    final List<String> userNames = new ArrayList<>();
    }
        return composite;
/*
import org.eclipse.swt.widgets.Text;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ui.UIUtils;
        super.createButtonsForButtonBar(parent);
 * PostgreCreateSchemaDialog
import org.eclipse.swt.events.SelectionAdapter;
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
            @NotNull
        }.schedule();
                            if (name.equals(defUserName)) {
                        .getConnectionConfiguration()
 * limitations under the License.
                                owner = authId;



