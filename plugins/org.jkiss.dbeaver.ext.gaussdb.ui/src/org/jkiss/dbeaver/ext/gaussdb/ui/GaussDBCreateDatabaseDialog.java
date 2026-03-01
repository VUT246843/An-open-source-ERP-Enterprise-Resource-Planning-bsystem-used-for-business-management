import java.util.ArrayList;
                if (ts == defTablespace) {
public class GaussDBCreateDatabaseDialog extends BaseDialog {
        supportsTablespaces(supportsTablespaces, groupDefinition);
                encodingCombo.setText(defCharset.getName());

    private Combo dbCompatibleMode;
                    allUsers = supportsRoles ? new ArrayList<>(database.getUsers(monitor)) : null;
            }

        super.createButtonsForButtonBar(parent);
import org.eclipse.swt.events.SelectionEvent;
        if (encodingCombo != null) {
        }
    }
    public String getName() {
    private void supportsEncodings(boolean supportsEncodings, final Composite groupDefinition) {
                    allTablespaces = supportsTablespaces ? new ArrayList<>(database.getTablespaces(monitor)) : null;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTablespace;
            SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
            }
                }
        }
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
import org.eclipse.core.runtime.Status;

        );

            userCombo.setText(defUserName);

                SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
    private PostgreTablespace tablespace;
                    allEncodings = supportsEncodings ? new ArrayList<>(database.getEncodings(monitor)) : null;
    protected void createButtonsForButtonBar(Composite parent) {
            2,
                    monitor.done();
    private List<PostgreRole> allUsers;
            });
            PostgreMessages.dialog_create_db_group_definition,
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
    public String getCompatibleMode() {
        final Text nameText = UIUtils.createLabelText(groupGeneral, PostgreMessages.dialog_create_db_label_db_name, "");
                }
import org.eclipse.swt.widgets.Text;

    private String dbTemplate;
                } catch (DBException e) {
                SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
import org.eclipse.swt.SWT;
            }
/*
    private void populateDialog(String defUserName, PostgreCharset defCharset, PostgreTablespace defTablespace) {
    }
        supportsRoles(supportsRoles, groupGeneral);
import org.eclipse.swt.widgets.Shell;

import org.eclipse.swt.widgets.Combo;
                userCombo.add(name);
                if (charset == defCharset) {
        boolean supportsRoles = dataSource.isServerVersionAtLeast(8, 1);
            for (PostgreCharset charset : allEncodings) {
        boolean supportsEncodings = dataSource.getServerType().supportsEncodings();
    }
                        tablespace = allTablespaces.get(tablespaceCombo.getSelectionIndex() - 1);
        });
            }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;

            encodingCombo.addSelectionListener(new SelectionAdapter() {
                    PostgreDatabase database = dataSource.getDefaultInstance();
        if (tablespaceCombo != null) {
            });
    }
            tablespaceCombo.add(PostgreMessages.dialog_create_db_tablespace_default);
        new AbstractJob("Load users") {
            });
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            GridData.FILL_HORIZONTAL

        final Composite groupGeneral = UIUtils.createTitledComposite(
 *

    public PostgreRole getOwner() {

        nameText.addModifyListener(e -> {
    private void scheduleLoadUsersJob(boolean supportsRoles, boolean supportsEncodings, boolean supportsTablespaces) {
            2,
                @Override
                public void widgetSelected(SelectionEvent e) {
    private PostgreCharset encoding;
    private Combo userCombo;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    final String defUserName = dba == null ? "" : dba.getName();

                tablespaceCombo.setText(defTablespace.getName());
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBDataSource;
        return this.dbTemplate;
            composite,
            if (defCharset != null) {
        if (supportsRoles) {
    private void supportsTablespaces(boolean supportsTablespaces, final Composite groupDefinition) {

    @Override
            tablespaceCombo = UIUtils.createLabelCombo(groupDefinition, PostgreMessages.dialog_create_db_label_tablesapce,
        return this.encoding;
 * Licensed under the Apache License, Version 2.0 (the "License");
    private PostgreRole owner;
        return this.compatibleMode;


    }
            GridData.FILL_HORIZONTAL
                    encoding = defCharset;

    }
        }.schedule();


 * limitations under the License.
import org.jkiss.dbeaver.utils.GeneralUtils;

    private final GaussDBDataSource dataSource;
            }
                SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
        if (userCombo != null) {
                }

            }
        }
        });
            @Override

        boolean supportsTablespaces = dataSource.getServerType().supportsTablespaces();
                }
            name = nameText.getText().trim();
    }
                } finally {
                    final PostgreRole dba = supportsRoles ? database.getDBA(monitor) : null;
import java.util.List;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.eclipse.swt.widgets.Composite;
    }
        supportsEncodings(supportsEncodings, groupDefinition);
    }

        this.dataSource = dataSource;
    private Combo encodingCombo;
        }
 */
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    }
                public void widgetSelected(SelectionEvent e) {

    private List<PostgreCharset> allEncodings;
                    return GeneralUtils.makeExceptionStatus(e);
    private List<PostgreTablespace> allTablespaces;
        }
                    if (tablespaceCombo.getSelectionIndex() == 0) {
            userCombo = UIUtils.createLabelCombo(groupGeneral, PostgreMessages.dialog_create_db_label_owner,
    private void supportsRoles(boolean supportsRoles, final Composite groupGeneral) {
                @Override
                if (name.equals(defUserName)) {
            for (PostgreRole authId : allUsers) {
    public PostgreCharset getEncoding() {
import org.eclipse.swt.events.SelectionAdapter;

            userCombo.addSelectionListener(new SelectionAdapter() {
        if (supportsEncodings) {
            tablespaceCombo.addSelectionListener(new SelectionAdapter() {
                    final PostgreTablespace defTablespace = supportsTablespaces ? database.getDefaultTablespace(monitor) : null;
                    }
                }
    public PostgreTablespace getTablespace() {
            }
                    final PostgreCharset defCharset = supportsEncodings ? database.getDefaultEncoding(monitor) : null;
                compatibleMode = dbCompatibleMode.getText();
    protected Composite createDialogArea(Composite parent) {
    @Override
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
 * You may obtain a copy of the License at
        getButton(IDialogConstants.OK_ID).setEnabled(false);
            composite,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.DBException;

            for (PostgreTablespace ts : allTablespaces) {
                tablespaceCombo.add(ts.getName());
import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;
                public void widgetSelected(SelectionEvent e) {
    private String name;
                    owner = authId;
}
 * Copyright (C) 2010-2026 DBeaver Corp and others
            @Override
    }
                try {
        return composite;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreCharset;
                    owner = allUsers.get(userCombo.getSelectionIndex());
    private String compatibleMode;
        dbCompatibleMode = UIUtils.createLabelCombo(groupDefinition, "DataBase Compatibility Mode",
 *
 * See the License for the specific language governing permissions and
    }
            @NotNull
        scheduleLoadUsersJob(supportsRoles, supportsEncodings, supportsTablespaces);
                    UIUtils.syncExec(() -> populateDialog(defUserName, defCharset, defTablespace));
package org.jkiss.dbeaver.ext.gaussdb.ui;

                String name = authId.getName();
            if (defTablespace != null) {
import org.eclipse.core.runtime.IStatus;
                encodingCombo.add(charset.getName());
        super(parentShell, PostgreMessages.dialog_create_db_title, null);
                monitor.beginTask("Create database", 1);
        return this.owner;
        final Composite composite = super.createDialogArea(parent);
            enableButton(IDialogConstants.OK_ID, !name.isEmpty());
                @Override
                        tablespace = null;
 *
                return Status.OK_STATUS;
 * you may not use this file except in compliance with the License.
        return this.tablespace;
                    tablespace = defTablespace;
    }
        }
    public GaussDBCreateDatabaseDialog(Shell parentShell, GaussDBDataSource dataSource) {
            public void widgetSelected(SelectionEvent e) {
            PostgreMessages.dialog_create_db_group_general,
        );

                }
                }
    }
        dbCompatibleMode.addSelectionListener(new SelectionAdapter() {
        return this.name;
 * DBeaver - Universal Database Manager
                    encoding = allEncodings.get(encodingCombo.getSelectionIndex());
            encodingCombo = UIUtils.createLabelCombo(groupDefinition, PostgreMessages.dialog_create_db_label_encoding,
    private Combo tablespaceCombo;
        if (supportsTablespaces) {
import org.jkiss.code.NotNull;
    public String getTemplateName() {
import org.jkiss.dbeaver.ui.UIUtils;
                    } else {
import org.eclipse.jface.dialogs.IDialogConstants;
        final Composite groupDefinition = UIUtils.createTitledComposite(
