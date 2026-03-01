    protected Composite createDialogArea(Composite parent) {
            GridData.FILL_HORIZONTAL);
            @NotNull

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            name = nameText.getText().trim();
 * Copyright (C) 2010-2026 DBeaver Corp and others
        this.dataSource = dataSource;
                    } else {
            tablespaceCombo = UIUtils.createLabelCombo(groupDefinition, PostgreMessages.dialog_create_db_label_tablesapce,
import org.eclipse.swt.layout.GridData;
    public PostgreCharset getEncoding() {
    private String compatibleMode;
            }

                    return GeneralUtils.makeExceptionStatus(e);
    public String getName() {


    private List<PostgreRole> allUsers;
import org.eclipse.swt.SWT;
    private Combo encodingCombo;
import org.jkiss.code.NotNull;
        }
import org.eclipse.swt.widgets.Text;
        }
        dbCompatibleMode.addSelectionListener(new SelectionAdapter() {
                    final PostgreCharset defCharset = supportsEncodings ? database.getDefaultEncoding(monitor) : null;
    private String name;
    private List<PostgreTablespace> allTablespaces;
            if (defTablespace != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    private Combo tablespaceCombo;
                }
        return this.dbTemplate;
    }
        }

                    tablespace = defTablespace;
            }
 * You may obtain a copy of the License at
    }
        dbCompatibleMode = UIUtils.createLabelCombo(groupDefinition, "DataBase Compatibility Mode",
    }
import org.jkiss.dbeaver.ext.kingbase.model.KingbaseDataSource;
                encodingCombo.setText(defCharset.getName());
                } finally {
                    PostgreDatabase database = dataSource.getDefaultInstance();
import org.eclipse.jface.dialogs.IDialogConstants;
            if (defCharset != null) {
 *
            }
                    final PostgreTablespace defTablespace = supportsTablespaces ? database.getDefaultTablespace(monitor) : null;
        }
            }
 * See the License for the specific language governing permissions and
                }
        if (encodingCombo != null) {
import org.eclipse.core.runtime.Status;

            encodingCombo = UIUtils.createLabelCombo(groupDefinition, PostgreMessages.dialog_create_db_label_encoding,
        });
                        tablespace = null;
                public void widgetSelected(SelectionEvent e) {
 *
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
                }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTablespace;
                @Override

            });
            GridData.FILL_HORIZONTAL);
import org.jkiss.dbeaver.ui.UIUtils;
        super.createButtonsForButtonBar(parent);
    }
import java.util.List;
                    encoding = allEncodings.get(encodingCombo.getSelectionIndex());
                    final PostgreRole dba = supportsRoles ? database.getDBA(monitor) : null;
                }
                SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
 * you may not use this file except in compliance with the License.
                String name = authId.getName();
        final Composite groupDefinition = UIUtils.createTitledComposite(composite, PostgreMessages.dialog_create_db_group_definition, 2,
                    owner = allUsers.get(userCombo.getSelectionIndex());
 */
            tablespaceCombo.add(PostgreMessages.dialog_create_db_tablespace_default);
 * Unless required by applicable law or agreed to in writing, software
            SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
            for (PostgreTablespace ts : allTablespaces) {
                    encoding = defCharset;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.eclipse.core.runtime.IStatus;
                    }
            userCombo.setText(defUserName);

        });
    }
                    allUsers = supportsRoles ? new ArrayList<>(database.getUsers(monitor)) : null;
                SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
                monitor.beginTask("Create database", 1);
        if (supportsRoles) {
        nameText.addModifyListener(e -> {
        supportsRoles(supportsRoles, groupGeneral);
            enableButton(IDialogConstants.OK_ID, !name.isEmpty());
                    if (tablespaceCombo.getSelectionIndex() == 0) {
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
import org.eclipse.swt.events.SelectionEvent;
            tablespaceCombo.addSelectionListener(new SelectionAdapter() {

        final Text nameText = UIUtils.createLabelText(groupGeneral, PostgreMessages.dialog_create_db_label_db_name, "");
    }
    }
    }

            }
            });
    public KingbaseCreateDatabaseDialog(Shell parentShell, KingbaseDataSource dataSource) {
    private void supportsTablespaces(boolean supportsTablespaces, final Composite groupDefinition) {
        final Composite groupGeneral = UIUtils.createTitledComposite(composite, PostgreMessages.dialog_create_db_group_general, 2,
                    final String defUserName = dba == null ? "" : dba.getName();
                        tablespace = allTablespaces.get(tablespaceCombo.getSelectionIndex() - 1);
                    UIUtils.syncExec(() -> populateDialog(defUserName, defCharset, defTablespace));
    private final KingbaseDataSource dataSource;
                userCombo.add(name);
                tablespaceCombo.add(ts.getName());
import java.util.ArrayList;
            userCombo = UIUtils.createLabelCombo(groupGeneral, PostgreMessages.dialog_create_db_label_owner,
                tablespaceCombo.setText(defTablespace.getName());
                public void widgetSelected(SelectionEvent e) {

    @Override
    @Override
                    owner = authId;
    public String getCompatibleMode() {
    }

        supportsEncodings(supportsEncodings, groupDefinition);
package org.jkiss.dbeaver.ext.kingbase.ui;
import org.jkiss.dbeaver.DBException;
        new AbstractJob("Load users") {
                try {

                @Override
import org.eclipse.swt.widgets.Combo;
                    allEncodings = supportsEncodings ? new ArrayList<>(database.getEncodings(monitor)) : null;
                public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
                }
        final Composite composite = super.createDialogArea(parent);
        return composite;
        return this.owner;
            });

                return Status.OK_STATUS;
        if (supportsEncodings) {

                } catch (DBException e) {

            @Override

        super(parentShell, PostgreMessages.dialog_create_db_title, null);
        boolean supportsRoles = true;
        }

import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    private void scheduleLoadUsersJob(boolean supportsRoles, boolean supportsEncodings, boolean supportsTablespaces) {
    private Combo userCombo;
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
        if (supportsTablespaces) {
                if (ts == defTablespace) {

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    private Combo dbCompatibleMode;
        scheduleLoadUsersJob(supportsRoles, supportsEncodings, supportsTablespaces);
    public PostgreRole getOwner() {
import org.eclipse.swt.widgets.Shell;
        if (tablespaceCombo != null) {
    }
        return this.encoding;
/*
        boolean supportsTablespaces = dataSource.getServerType().supportsTablespaces();
import org.jkiss.dbeaver.utils.GeneralUtils;
            }
        boolean supportsEncodings = dataSource.getServerType().supportsEncodings();




                if (name.equals(defUserName)) {
        }.schedule();
        supportsTablespaces(supportsTablespaces, groupDefinition);
                @Override

            public void widgetSelected(SelectionEvent e) {
        if (userCombo != null) {
    public String getTemplateName() {
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.SelectionAdapter;
            userCombo.addSelectionListener(new SelectionAdapter() {
    }
 * DBeaver - Universal Database Manager
                    allTablespaces = supportsTablespaces ? new ArrayList<>(database.getTablespaces(monitor)) : null;
    private PostgreRole owner;
        return this.name;

                if (charset == defCharset) {
        return this.compatibleMode;
            encodingCombo.addSelectionListener(new SelectionAdapter() {
 * Licensed under the Apache License, Version 2.0 (the "License");
            for (PostgreCharset charset : allEncodings) {
        }
    private PostgreCharset encoding;
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
    private PostgreTablespace tablespace;
    private List<PostgreCharset> allEncodings;
                encodingCombo.add(charset.getName());
            for (PostgreRole authId : allUsers) {

    public PostgreTablespace getTablespace() {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreCharset;
                compatibleMode = dbCompatibleMode.getText();
            @Override

        return this.tablespace;
 * limitations under the License.
    private void supportsEncodings(boolean supportsEncodings, final Composite groupDefinition) {
        enableButton(IDialogConstants.OK_ID, false);
 *
                }
            }
    private String dbTemplate;
    private void populateDialog(String defUserName, PostgreCharset defCharset, PostgreTablespace defTablespace) {
}
import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;
                SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
    private void supportsRoles(boolean supportsRoles, final Composite groupGeneral) {
public class KingbaseCreateDatabaseDialog extends BaseDialog {
                    monitor.done();
    }
                }
    }
