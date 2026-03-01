                } finally {
        return encoding;
                            tablespaceCombo.add(PostgreMessages.dialog_create_db_tablespace_default);
                    if (tablespaceCombo.getSelectionIndex() == 0) {
    private List<PostgreTablespace> allTablespaces;
                }
                @Override
    public PostgreTablespace getTablespace() {
        Composite groupDefinition = UIUtils.createTitledComposite(
    public PostgreCreateDatabaseDialog(Shell parentShell, PostgreDataSource dataSource) {
                                }
 */
                    final String defUserName = dba == null ? "" : dba.getName();
    private Combo templateCombo;

    private Set<String> allTemplates;

                        if (templateCombo != null) {
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.ext.postgresql.ui;
        if (supportsTemplates) {
        );
import java.util.TreeSet;

            encodingCombo.addSelectionListener(new SelectionAdapter() {
import java.util.List;
            });
                    dbTemplate = templateCombo.getText();
import org.eclipse.swt.widgets.Composite;

            GridData.FILL_HORIZONTAL
                    final PostgreTablespace defTablespace = supportsTablespaces ? database.getDefaultTablespace(monitor) : null;
    private String dbTemplate;
                } catch (DBException e) {
    protected void createButtonsForButtonBar(Composite parent)
 *

        }
import java.util.ArrayList;
                            }
                @Override
        boolean supportsRoles = dataSource.isServerVersionAtLeast(8, 1);
        new AbstractJob("Load users") {
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                                    owner = authId;
            tablespaceCombo = UIUtils.createLabelCombo(groupDefinition, PostgreMessages.dialog_create_db_label_tablesapce, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
 *
    public PostgreRole getOwner() {
                @Override

        this.dataSource = dataSource;
                            }
                    allTemplates.addAll(dataSource.getDatabases().stream().map(PostgreDatabase::getName).collect(Collectors.toList()));

                    owner = allUsers.get(userCombo.getSelectionIndex());
    public String getTemplateName() {
                        }
                                templateCombo.add(tpl);

                                    tablespace = ts;
                    allEncodings = supportsEncodings ? new ArrayList<>(database.getEncodings(monitor)) : null;
                                if (charset == defCharset) {
    @Override
    public PostgreCharset getEncoding() {
                                }
/*
    private PostgreTablespace tablespace;
                                }
        super.createButtonsForButtonBar(parent);
    protected Composite createDialogArea(Composite parent) {
                    }
            encodingCombo = UIUtils.createLabelCombo(groupDefinition, PostgreMessages.dialog_create_db_label_encoding, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
 * You may obtain a copy of the License at

import org.eclipse.swt.widgets.Text;
 * PostgreCreateDatabaseDialog
                        }

        if (supportsTablespaces) {
    private Combo userCombo;
                    return GeneralUtils.makeExceptionStatus(e);
    @Override


                }
        }.schedule();
        return composite;
                    final PostgreRole dba = supportsRoles ? database.getDBA(monitor) : null;
                            if (defCharset != null) {
{
            2,
                    UIUtils.syncExec(() -> {

        if (supportsRoles) {
        final Text nameText = UIUtils.createLabelText(groupGeneral, PostgreMessages.dialog_create_db_label_db_name, ""); //$NON-NLS-2$
                                userCombo.add(name);
            });
                    allUsers = supportsRoles ? new ArrayList<>(database.getUsers(monitor)) : null;
                                    encoding = defCharset;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        boolean supportsEncodings = dataSource.getServerType().supportsEncodings();
import org.jkiss.dbeaver.ui.UIUtils;
            @NotNull
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        }
                            for (PostgreTablespace ts : allTablespaces) {
                                encodingCombo.setText(defCharset.getName());
 * limitations under the License.
 */
            templateCombo.addSelectionListener(new SelectionAdapter() {

                @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
                    PostgreDatabase database = dataSource.getDefaultInstance();
    {
 * Copyright (C) 2010-2026 DBeaver Corp and others

            }
            });
import org.eclipse.swt.events.SelectionEvent;
                        if (encodingCombo != null) {
import org.jkiss.dbeaver.ext.postgresql.model.*;
        super(parentShell, PostgreMessages.dialog_create_db_title, null);
    private List<PostgreCharset> allEncodings;
                            userCombo.setText(defUserName);
                                String name = authId.getName();
                                tablespaceCombo.add(ts.getName());
import java.util.Set;
import org.jkiss.code.NotNull;
        }
                            for (String tpl : allTemplates) {
import org.eclipse.swt.events.SelectionAdapter;
                        if (tablespaceCombo != null) {
            composite,
        return dbTemplate;
import org.jkiss.dbeaver.DBException;

                            }

                return Status.OK_STATUS;
            });
    private String name;
                }
                    allTablespaces = supportsTablespaces ? new ArrayList<>(database.getTablespaces(monitor)) : null;
            getButton(IDialogConstants.OK_ID).setEnabled(!name.isEmpty());
                    monitor.done();
}
 *     http://www.apache.org/licenses/LICENSE-2.0
                try {
            @Override
 * Unless required by applicable law or agreed to in writing, software

                                if (ts == defTablespace) {


                                encodingCombo.add(charset.getName());
            PostgreMessages.dialog_create_db_group_definition,
    }
        boolean supportsTablespaces = dataSource.getServerType().supportsTablespaces();
import org.eclipse.swt.widgets.Shell;
        return owner;
    }
                            for (PostgreCharset charset : allEncodings) {
import org.eclipse.swt.widgets.Combo;
                            tablespaceCombo.setText(defTablespace.getName());
    }
        });
                monitor.beginTask("Create database", 1);
                }
                            }
import org.eclipse.core.runtime.Status;

    private List<PostgreRole> allUsers;
                    encoding = allEncodings.get(encodingCombo.getSelectionIndex());
                }
import org.eclipse.jface.dialogs.IDialogConstants;
    }
        boolean supportsTemplates = dataSource.getServerType().supportsTemplates();
                public void widgetSelected(SelectionEvent e) {
                    });
                    allTemplates = new TreeSet<>(dataSource.getTemplateDatabases(monitor));
                    } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            templateCombo.add("");
                public void widgetSelected(SelectionEvent e) {
        Composite composite = super.createDialogArea(parent);
            userCombo = UIUtils.createLabelCombo(groupGeneral, PostgreMessages.dialog_create_db_label_owner, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
    }
 *
    }
        return name;
    }
                            for (PostgreRole authId : allUsers) {
            name = nameText.getText().trim();
                        }
    private Combo tablespaceCombo;
                            }
        }
                public void widgetSelected(SelectionEvent e) {
        return tablespace;

        if (supportsEncodings) {
import org.eclipse.swt.layout.GridData;

            templateCombo = UIUtils.createLabelCombo(groupDefinition, PostgreMessages.dialog_create_db_label_template_db, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
        Composite groupGeneral = UIUtils.createTitledComposite(composite, PostgreMessages.dialog_create_db_group_general, 2, GridData.FILL_HORIZONTAL);
                                if (name.equals(defUserName)) {

 * DBeaver - Universal Database Manager
    public String getName() {
/**
import org.eclipse.swt.SWT;
                    final PostgreCharset defCharset = supportsEncodings ? database.getDefaultEncoding(monitor) : null;
    }
        nameText.addModifyListener(e -> {
            tablespaceCombo.addSelectionListener(new SelectionAdapter() {
                        tablespace = allTablespaces.get(tablespaceCombo.getSelectionIndex() - 1);
                        if (userCombo != null) {
import org.eclipse.core.runtime.IStatus;
    private PostgreCharset encoding;

    private List<PostgreCollation> allCollations;
import org.jkiss.dbeaver.utils.GeneralUtils;

                public void widgetSelected(SelectionEvent e) {
                        }
                        tablespace = null;
        getButton(IDialogConstants.OK_ID).setEnabled(false);
 * See the License for the specific language governing permissions and

    private Combo encodingCombo;
            userCombo.addSelectionListener(new SelectionAdapter() {
 * you may not use this file except in compliance with the License.
import java.util.stream.Collectors;
    private PostgreRole owner;
public class PostgreCreateDatabaseDialog extends BaseDialog
    private final PostgreDataSource dataSource;
