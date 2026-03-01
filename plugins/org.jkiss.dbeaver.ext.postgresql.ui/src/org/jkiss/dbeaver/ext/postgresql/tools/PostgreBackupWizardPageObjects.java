        for (TableItem item : schemasTable.getItems()) {
        }
                    if (!(tableContainer instanceof PostgreSchema)) {
            tablesTable = new Table(tablesPanel, SWT.BORDER | SWT.CHECK);
        for (TableItem item : schemasTable.getItems()) {
    private Button fullSchemaBackupCheck;
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
                            item.setData(table);
        int selectionIndex = schemasTable.getSelectionIndex();

                    objects.sort(DBUtils.nameComparator());
        fullSchemaBackupCheck.setEnabled(allSchemasSelected);
                    Set<PostgreTableBase> tables = checkedObjects.computeIfAbsent(schema, k -> new HashSet<>());

        {
        }
            GridData gd = new GridData(GridData.FILL_BOTH);
                    checkedObjects.remove(catalog);
                    }
        if (dataBase != null) {
                    wizard.getSettings().setShowViews(exportViewsCheck.getSelection());
    PostgreBackupWizardPageObjects(PostgreBackupWizard wizard)

    @Override
                }
        connInfo.setImage(DBeaverIcons.getImage(DBIcon.DATABASE_DEFAULT));
                return false;
                    }
                        
                activeSchemas.addAll(info.getSchemas());
    private List<PostgreTableBase> loadTables(final PostgreSchema catalog) {
            GridData gd = new GridData(GridData.FILL_BOTH);
                        item.setChecked(true);
        if (hasViews) {
            });
        if (curSchema == null) {
            complete = true;
            schemasTable.addListener(SWT.Selection, event -> {

                // Only a few tables checked, we need to use separate file for this case, because -n and -t arguments can be used together
import org.jkiss.dbeaver.model.runtime.AbstractJob;
            if (!item.getChecked()) {
 * limitations under the License.
                    UIUtils.syncExec(() -> {
                }
 * You may obtain a copy of the License at
                        objects.addAll(curSchema.getViews(monitor));
                if (checkedTables == null) {

    @Override
import org.eclipse.swt.custom.SashForm;
 * Licensed under the Apache License, Version 2.0 (the "License");
        {
    public void saveState() {
    private Button exportViewsCheck;
        }
                    new ArrayList<>(checkedTables));
                TableItem item = (TableItem) event.item;
                    continue;
                }
    private Map<PostgreSchema, Set<PostgreTableBase>> checkedObjects = new HashMap<>();
 *
 *
                log.error(e);
        schemasTable.removeAll();
                updateState();
            1,
            if (items.length != 0) {
                }
                } finally {
        super.activatePage();
    	boolean allSchemasSelected =isAllSchemaSelected();
    private void updatefullSchemaBackupState() {
        List<PostgreDatabaseBackupInfo> objects = wizard.getSettings().getExportObjects();
                            } else if (!schemaItem.getChecked() && !check) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        for (PostgreDatabaseBackupInfo info : wizard.getSettings().getExportObjects()) {

                        }
    }
            exportViewsCheck.addSelectionListener(new SelectionAdapter() {
        loadSettings();
import org.eclipse.swt.layout.GridData;
                PostgreSchema schema = (PostgreSchema) item.getData();
                monitor.beginTask("Collect tables", 1);
                    PostgreSchema schema = (PostgreSchema) tableContainer;
        List<PostgreSchema> entireSchemas = new ArrayList<>();
        super(wizard, PostgreMessages.wizard_backup_page_object_title_schema_table);
            gd.heightHint = 50;
    private void updateCheckedTables() {
    private boolean isAllSchemaSelected() {

            catalogItem.setChecked(!checkedTables.isEmpty());
                        }
            if (item.getChecked()) {

        tablesTable.removeAll();
    }
    	updatefullSchemaBackupState();
            tablesTable.addListener(SWT.Selection, event -> {
            exportViewsCheck.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL));
        sash.setLayoutData(new GridData(GridData.FILL_BOTH));

        );
        setControl(composite);
            checkedObjects.put(curSchema, checkedTables);
    public void activatePage() {
                                if (!CommonUtils.isEmpty(tableBaseList)) {
        for (TableItem item : tableItems) {
            }
                    item.setText(0, schema.getName());
 *
        if (selectionIndex > -1) {
    }
        }
        Set<PostgreSchema> activeSchemas = new LinkedHashSet<>();
    private boolean isChecked(PostgreSchema catalog) {
            Composite tablesPanel = UIUtils.createComposite(sash, 1);
            exportViewsCheck.setSelection(wizard.getSettings().isFullSchemaBackup());
    @Override
    }
            if (!CommonUtils.isEmpty(info.getTables())) {
                    PostgreTableContainer tableContainer = table.getContainer();
/*
        if (table == schemasTable) {
 * DBeaver - Universal Database Manager
                        if (table instanceof PostgreTableBase) {
import org.eclipse.swt.events.SelectionAdapter;
        }
            fullSchemaBackupCheck.addSelectionListener(new SelectionAdapter() {
            curSchema = catalog;
                                }
            fullSchemaBackupCheck.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL));
            TableItem catalogItem = schemasTable.getItem(selectionIndex);
        }
{
            gd.heightHint = 50;
                            TableItem item = new TableItem(tablesTable, SWT.NONE);
                            loadTables(schema);
                objects.add(info);

    private static final Log log = Log.getLog(PostgreBackupWizardPageObjects.class);
        connInfo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        TableItem[] tableItems = tablesTable.getItems();
                    if (schema.isSystem() || schema.isUtility()) {
            } catch (DBException e) {
import org.eclipse.swt.SWT;
                }
    {
                    wizard.getSettings().setFullSchemaBackup(fullSchemaBackupCheck.getSelection());
import org.jkiss.dbeaver.model.DBUtils;
        final Set<PostgreTableBase> checkedObjects = this.checkedObjects.get(curSchema);
                    monitor.subTask("Collect tables to dump");
import org.jkiss.utils.CommonUtils;

import org.jkiss.dbeaver.ui.controls.CustomSashForm;
                                checkedObjects.remove(postgreSchema);
            });
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
                            }
            return null;

import org.jkiss.dbeaver.DBException;
            });
            checkedObjects.remove(curSchema);
            }
            }
    public void createControl(Composite parent)
            if (item.getData() == catalog) {
                    TableItem item = new TableItem(schemasTable, SWT.NONE);
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                            item.setImage(DBeaverIcons.getImage(table.isView() ? DBIcon.TREE_VIEW : DBIcon.TREE_TABLE));
                    // All tables checked, we can add this schema in the full dump
                            item.setChecked(isCatalogChecked && (checkedObjects == null || checkedObjects.contains(table)));
        // Handle event from buttons "All" and "None"
    @Override
                    });
import org.eclipse.swt.widgets.Table;
            @Override
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                    }
import org.jkiss.dbeaver.ui.DBeaverIcons;
        objects.clear();
                if (event.detail == SWT.CHECK) {
        wizard.getSettings().setFullSchemaBackup(allSchemasSelected);
                        }
            catPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
        }
                            item.setText(0, table.getName());
                for (TableItem tableItem : items) {
        connInfo = new CLabel(objectsGroup, SWT.WRAP);
                    tableItem.setChecked(check);
            {
        }
    }

    }
                    }
            boolean tablesLoaded = false;
        final boolean isCatalogChecked = isChecked(curSchema);

            PostgreUIUtils.addCompatibilityInfoLabelForForks(composite, wizard, dataBase != null ? dataBase.getDataSource() : null);

            tablesPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
        SashForm sash = new CustomSashForm(objectsGroup, SWT.VERTICAL);
    }
                    entireSchemas.add(schema);
                        continue;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
        }
                        Object data = schemaItem.getData();
        new AbstractJob("Load '" + curSchema.getName() + "' tables") {
        }.schedule();
                        if (data instanceof PostgreSchema) {
                complete = true;
            Composite buttonsPanel = UIUtils.createComposite(catPanel, 3);
                                List<PostgreTableBase> tableBaseList = loadTables(postgreSchema);
    @Override

import org.jkiss.code.NotNull;
    }
                    DBWorkbench.getPlatformUI().showError("Table list", "Can't read table list", e);
                    }
        setTitle(PostgreMessages.wizard_backup_page_object_title);

                    if (wizard.getSettings().isShowViews()) {
        Set<PostgreTableBase> checkedTables = new HashSet<>();
        saveState();
                PostgreDatabaseBackupInfo info = new PostgreDatabaseBackupInfo(
                    for (JDBCTable table : curSchema.getTables(monitor)) {
        return false;

    public void deactivatePage() {
                            PostgreSchema postgreSchema = (PostgreSchema) data;
            });
            schemasTable = new Table(catPanel, SWT.BORDER | SWT.CHECK);
        }

                        for (PostgreTableBase table : objects) {
                            tablesLoaded = true;
                        hasViews = true;

                @Override
            }
import org.jkiss.dbeaver.ui.UIUtils;
        Composite objectsGroup = UIUtils.createTitledComposite(
                loadTables(catalog);
            }
    }
        if (checkedTables.isEmpty() || checkedTables.size() == tableItems.length) {
 * See the License for the specific language governing permissions and
                }
                return Status.OK_STATUS;
                            if (schemaItem.getChecked() && check && !checkedObjects.containsKey(postgreSchema)) {

            GridData.FILL_HORIZONTAL
import org.eclipse.swt.widgets.Button;
        objectsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
                        }
                    tablesTable.setVisible(!fullSchemaBackupCheck.getSelection());
        updateCheckedTables();

            exportViewsCheck.setSelection(true);
            TableItem[] items = tablesTable.getItems();
            schemasTable.setLayoutData(gd);
    private PostgreDatabase dataBase;
        if (!checkedObjects.isEmpty()) {
                    loadTables(null);
                    tables.add(table);
    }
    }
                checkedTables.add((PostgreTableBase) item.getData());
        }
                public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
            @NotNull
                        schemasTable.select(schemasTable.indexOf(item));
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
        }
        final List<PostgreTableBase> objects = new ArrayList<>();
        return objects;
                    if (activeSchemas.contains(schema)) {
import org.eclipse.swt.widgets.TableItem;
                }

        boolean complete = false;

                    }
                if (schemasItems.length != 0) {
    private Table tablesTable;
                PostgreSchema catalog = (PostgreSchema) item.getData();
            setConnectionInfo(dataBase.getDataSource().getContainer(), dataBase.getName());
import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeToolWizardPage;
                for (PostgreTableBase table : info.getTables()) {
    }
                    updateCheckedTables();
            exportViewsCheck = UIUtils.createCheckbox(buttonsPanel, PostgreMessages.wizard_backup_page_object_checkbox_show_view, false);
            Composite buttonsPanel = UIUtils.createComposite(tablesPanel, 3);
        super.saveState();
                    schemasTable.select(schemasTable.indexOf(item));

                Set<PostgreTableBase> checkedTables = checkedObjects.get(schema);
            } else {
 */
            }
import org.eclipse.core.runtime.Status;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
                    Collections.singletonList(schema),
        }
                // This is the case when the user selects a backup by pressing the database, and not the scheme. Then tablesTable is empty.
            PostgreMessages.wizard_backup_page_object_group_object,
                }
                if (event.detail == SWT.CHECK) {

    private void loadSettings() {
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (!CommonUtils.isEmpty(info.getSchemas())) {
import org.jkiss.dbeaver.Log;
    private Table schemasTable;
            composite,
class PostgreBackupWizardPageObjects extends AbstractNativeToolWizardPage<PostgreBackupWizard>

    protected void updateTableCheckedStatus(@NotNull Table table, boolean check) {
            buttonsPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.SelectionEvent;
        }
import org.eclipse.swt.custom.CLabel;
                        tablesTable.removeAll();
                        if (!tablesLoaded) {
            tablesTable.setLayoutData(gd);
    {
            }
                public void widgetSelected(SelectionEvent e) {
            if (item.getChecked()) {
import org.jkiss.dbeaver.model.DBIcon;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTable;
        } else {
            Composite catPanel = UIUtils.createComposite(sash, 1);
            createCheckButtons(buttonsPanel, schemasTable);
import org.jkiss.dbeaver.ext.postgresql.PostgreUIUtils;
        return complete && super.determinePageCompletion();

        }
        for (TableItem item : schemasTable.getItems()) {
                } catch (DBException e) {
                    item.setImage(DBeaverIcons.getImage(DBIcon.TREE_SCHEMA));
    }
                    for (TableItem schemaItem : schemasItems) {
                    updateState();
                for (PostgreSchema schema : dataBase.getSchemas(new VoidProgressMonitor())) {
            objects.add(info);
            dataBase = info.getDatabase();
            fullSchemaBackupCheck = UIUtils.createCheckbox(buttonsPanel, PostgreMessages.wizard_backup_page_object_checkbox_complete_backup, false);

                    dataBase,
        if (catalog != null) {
            if (item.getChecked()) {

        return true;

package org.jkiss.dbeaver.ext.postgresql.tools;
                            objects.add((PostgreTableBase) table);
                    monitor.done();
        if (!entireSchemas.isEmpty()) {
    @Override
                    item.setData(schema);
                }
    protected boolean determinePageCompletion() {
        updatePageCompletion();
                }
        updateState();
                break;
            buttonsPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        }
                    if (table.isView()) {
                try {
        boolean hasViews = false;
                TableItem[] schemasItems = schemasTable.getItems();
        dataBase = null;
    protected void updateState()
        Composite composite = UIUtils.createPlaceholder(parent, 1);
        }
import java.util.*;
            }
        {
                setUser(true);

    }
            wizard.getSettings().setShowViews(true);
                return item.getChecked();
                        continue;
        for (TableItem item : schemasTable.getItems()) {
            }
            createCheckButtons(buttonsPanel, tablesTable);
        getContainer().updateButtons();
    private PostgreSchema curSchema;
    {
                    activeSchemas.add(schema);
        }
                @Override
            
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableContainer;
            PostgreDatabaseBackupInfo info = new PostgreDatabaseBackupInfo(dataBase, entireSchemas, null);
 * Unless required by applicable law or agreed to in writing, software
}
    
            }
        setDescription(PostgreMessages.wizard_backup_page_object_description);
        checkedObjects.clear();

            try {
import org.eclipse.core.runtime.IStatus;
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreDatabaseBackupInfo;
                                    checkedObjects.put(postgreSchema, new HashSet<>(tableBaseList));
