
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
public class PostgreBackupAllWizardPageObjects extends AbstractNativeToolWizardPage<PostgreBackupAllWizard> {
            databasesTable.setLayoutData(gd);
            if (item.getChecked()) {
            PostgreMessages.wizard_backup_page_object_group_object,
        Composite objectsGroup = UIUtils.createTitledComposite(
        connInfo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
            });
    protected boolean determinePageCompletion() {
        connInfo = new CLabel(objectsGroup, SWT.WRAP);
            1,
    private void loadSettings() {
import org.eclipse.swt.layout.GridData;
        for (TableItem item : databasesTable.getItems()) {

                if (!databases.contains(database)) {
            catPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
            databasesTable = new Table(catPanel, SWT.BORDER | SWT.CHECK);
    public void saveState() {
                    databases.add(database);
        boolean complete = false;
        }
                item.setImage(DBeaverIcons.getImage(DBIcon.TREE_DATABASE));
        for (TableItem item : databasesTable.getItems()) {
                activeDatabases.addAll(databases);

import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreDatabaseBackupAllInfo;
                            checkedObjects.add((PostgreDatabase) data);
                PostgreDatabase database = (PostgreDatabase) item.getData();
 *
        }
        }

    @Override
import org.eclipse.swt.widgets.Table;
    private Table databasesTable;
                    databasesTable.select(databasesTable.indexOf(item));

            complete = true;
    }
    @Override
    public void activatePage() {
        loadSettings();
        List<PostgreDatabaseBackupAllInfo> objects = wizard.getSettings().getExportObjects();
        setDescription(PostgreMessages.wizard_backup_all_page_global_backup_tip);
        updatePageCompletion();
import org.jkiss.code.NotNull;
        }
                        } else {
                }
import org.jkiss.dbeaver.ext.postgresql.PostgreUIUtils;
            GridData gd = new GridData(GridData.FILL_BOTH);
    }
                break;
                    Object data = tableItem.getData();
            GridData.FILL_HORIZONTAL);
                complete = true;

        Composite composite = UIUtils.createPlaceholder(parent, 1);
        if (!checkedObjects.isEmpty()) {
        saveState();
    protected void updateTableCheckedStatus(@NotNull Table table, boolean check) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
    private Set<PostgreDatabase> checkedObjects = new HashSet<>();
    }
            databasesTable.addListener(SWT.Selection, event -> {
 * you may not use this file except in compliance with the License.

        setControl(composite);

    @Override
import org.jkiss.dbeaver.model.DBIcon;
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * Unless required by applicable law or agreed to in writing, software
import java.util.HashSet;

import org.eclipse.swt.custom.CLabel;
        }
    protected PostgreBackupAllWizardPageObjects(PostgreBackupAllWizard wizard) {

            dataSource = info.getDataSource();
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;

import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
                    tableItem.setChecked(check);
            createCheckButtons(buttonsPanel, databasesTable);
    @Override
        setTitle(PostgreMessages.wizard_backup_page_object_title);

            Composite buttonsPanel = UIUtils.createComposite(catPanel, 3);
        objectsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
    }
                        if (check) {

            new Label(buttonsPanel, SWT.NONE).setLayoutData(new GridData(GridData.GRAB_HORIZONTAL));
        connInfo.setImage(DBeaverIcons.getImage(DBIcon.DATABASE_DEFAULT));
import org.eclipse.swt.widgets.Composite;
 *
import java.util.ArrayList;
                        }
        PostgreDatabaseBackupAllInfo info = new PostgreDatabaseBackupAllInfo(dataSource, databases);
import java.util.List;

        super.saveState();
    }

import org.jkiss.dbeaver.ui.DBeaverIcons;
        // Handle event from buttons "All" and "None"
        objects.add(info);
                }
import org.jkiss.utils.CommonUtils;
            buttonsPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    public void deactivatePage() {
        if (table == databasesTable) {
import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeToolWizardPage;
    }

        {
    @Override
    @Override

        Set<PostgreDatabase> activeDatabases = new HashSet<>();
                if (event.detail == SWT.CHECK) {
                item.setData(database);
    @Override
        objects.clear();
        super.activatePage();
    }
            if (!CommonUtils.isEmpty(databases)) {
            }
                for (TableItem tableItem : items) {
import org.eclipse.swt.widgets.Label;
        List<PostgreDatabase> databases = new ArrayList<>();
                }

    }
                            checkedObjects.remove((PostgreDatabase) data);
            }
        }


    public void createControl(Composite parent) {
    }
        checkedObjects.clear();
import org.eclipse.swt.SWT;
            List<PostgreDatabase> databases = info.getDatabases();
                TableItem item = (TableItem) event.item;
                    if (data instanceof PostgreDatabase) {

import java.util.Set;
        super(wizard, PostgreMessages.wizard_backup_all_page_global_backup_name);
                if (activeDatabases.contains(database)) {
 * You may obtain a copy of the License at

        for (PostgreDatabaseBackupAllInfo info : wizard.getSettings().getExportObjects()) {
package org.jkiss.dbeaver.ext.postgresql.tools;
    protected void updateState() {
import org.eclipse.swt.widgets.TableItem;
            for (PostgreDatabase database : dataSource.getDatabases()) {

import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
 * See the License for the specific language governing permissions and
                    databasesTable.select(databasesTable.indexOf(item));
                item.setText(0, database.getName());
        if (dataSource != null) {
            if (items.length != 0) {
            // Database list depends on connection setting
                    item.setChecked(true);
    private PostgreDataSource dataSource;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        PostgreUIUtils.addCompatibilityInfoLabelForForks(composite, wizard, dataSource);
                updateState();
            composite,

            TableItem[] items = databasesTable.getItems();
            }
 *
            Composite catPanel = UIUtils.createComposite(objectsGroup, 1);
            setConnectionInfo(dataSource.getContainer(), null);
}
            }
                TableItem item = new TableItem(databasesTable, SWT.NONE);
            }
        }
            if (item.getChecked()) {
        databasesTable.removeAll();
        getContainer().updateButtons();
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
                }
                    }
        updateState();
        return complete && super.determinePageCompletion();
