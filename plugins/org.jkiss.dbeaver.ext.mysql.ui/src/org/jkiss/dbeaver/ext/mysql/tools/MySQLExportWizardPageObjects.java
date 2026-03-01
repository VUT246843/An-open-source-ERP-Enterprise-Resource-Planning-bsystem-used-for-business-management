import org.jkiss.dbeaver.model.runtime.AbstractJob;
import org.jkiss.dbeaver.ui.UIUtils;
            exportViewsCheck.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL));
        checkedObjects.clear();
                    DBWorkbench.getPlatformUI().showError("Table list", "Can't read table list", e);
                        tablesTable.removeAll();
            return;
                    tables.add(table);
                    }
            }
            setConnectionInfo(container, null);
import org.jkiss.dbeaver.model.DBUtils;
    }
                Set<MySQLTableBase> tables = checkedObjects.computeIfAbsent(
                setUser(true);
    }
                        loadTables(catalog);
    public void deactivatePage() {

        }
    @Override
        connInfo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
            }
        if (selectionIndex > -1) {
        }
import org.jkiss.code.NotNull;
                            item.setChecked(isCatalogChecked && (checkedObjects == null || checkedObjects.contains(table)));

                            TableItem item = new TableItem(tablesTable, SWT.NONE);
import org.eclipse.swt.widgets.*;
    public void saveState() {
            }
        {
            if (item.getChecked()) {

        setControl(composite);
            for (MySQLCatalog catalog : dataSource.getCatalogs()) {

                    if (table.isView()) {

            for (TableItem tableItem : tablesTable.getItems()) {
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                    objects.sort(DBUtils.nameComparator());

                MySQLCatalog catalog = (MySQLCatalog) item.getData();
    }
                objects.add(info);
        boolean complete = false;
            GridData gd = new GridData(GridData.FILL_BOTH);
import org.eclipse.swt.events.SelectionAdapter;
    private boolean isChecked(MySQLCatalog catalog) {
        updateCheckedTables();
                    }
            activeCatalogs.add(info.getDatabase());
        }
    }
                    }

                    updateState();
        // Handle event from buttons "All" and "None"
import org.jkiss.dbeaver.model.DBIcon;
            exportViewsCheck = UIUtils.createCheckbox(buttonsPanel, MySQLUIMessages.tools_db_export_wizard_page_settings_group_show_views, false);
                    objects.addAll(curCatalog.getTables(monitor));
        for (TableItem item : catalogTable.getItems()) {
                @Override
            });
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
            tablesTable = new Table(tablesPanel, SWT.BORDER | SWT.CHECK);
            curCatalog = catalog;
 *     http://www.apache.org/licenses/LICENSE-2.0
        Composite objectsGroup = UIUtils.createTitledComposite(composite, MySQLUIMessages.tools_db_export_wizard_page_settings_group_objects, 1, GridData.FILL_HORIZONTAL);
                }
    @Override
import java.util.*;
    }
        MySQLDataSource dataSource = null;
    private Table tablesTable;
    protected MySQLExportWizardPageObjects(MySQLExportWizard wizard)
            complete = true;
                tableItem.setChecked(check);
        }
        setTitle(MySQLUIMessages.tools_db_export_wizard_page_objects_dialog_title_choose_objects);
            Composite tablesPanel = UIUtils.createComposite(sash, 1);

        sash.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.utils.CommonUtils;
        setPageComplete(complete);
 * Unless required by applicable law or agreed to in writing, software
            Composite buttonsPanel = UIUtils.createComposite(tablesPanel, 3);
                checkedTables.add((MySQLTableBase) item.getData());
            createCheckButtons(buttonsPanel, catalogTable);
            gd.heightHint = 50;
        }.schedule();
                        catalogTable.select(catalogTable.indexOf(item));
        new AbstractJob("Load '" + curCatalog.getName() + "' tables") {

        }
import org.eclipse.swt.custom.SashForm;

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;
            catalogTable = new Table(catPanel, SWT.BORDER | SWT.CHECK);
                public void widgetSelected(SelectionEvent e) {
 * limitations under the License.

            });
        if (!checkedObjects.isEmpty()) {
                    wizard.getSettings().setShowViews(exportViewsCheck.getSelection());
                }
            checkedObjects.put(curCatalog, checkedTables);
        super(wizard, MySQLUIMessages.tools_db_export_wizard_page_objects_dialog_wizard_title);
                complete = true;
                try {
 * You may obtain a copy of the License at
            }
        }
            if (item.getData() == catalog) {
import org.jkiss.dbeaver.ext.mysql.tasks.MySQLDatabaseExportInfo;
            @Override
            exportViewsCheck.setSelection(true);


 * Copyright (C) 2010-2026 DBeaver Corp and others
    protected void updateState()
        } else {
    {
                for (MySQLTableBase table : info.getTables()) {
            if (item.getChecked()) {
                }

        catalogTable.removeAll();
import org.eclipse.swt.layout.GridData;
        connInfo.setImage(DBeaverIcons.getImage(DBIcon.DATABASE_DEFAULT));
    @Override
            {
        final boolean isCatalogChecked = isChecked(curCatalog);
        for (TableItem item : catalogTable.getItems()) {
        loadSettings();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    }
            if (item.getChecked()) {

        saveState();
}
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
    private Table catalogTable;
            exportViewsCheck.addSelectionListener(new SelectionAdapter() {
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
 *
        objectsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
        {
                        checkedObjects.remove(catalog);
        SashForm sash = new CustomSashForm(objectsGroup, SWT.VERTICAL);
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (table == catalogTable) {
    private void loadSettings() {
                }
            buttonsPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.eclipse.swt.custom.CLabel;
import org.jkiss.dbeaver.ui.DBeaverIcons;

        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            item.setText(0, table.getName());
                }
        }
                    item.setChecked(true);

class MySQLExportWizardPageObjects extends MySQLWizardPageSettings<MySQLExportWizard>
        objects.clear();
                    loadTables(null);
        if (checkedTables.isEmpty() || checkedTables.size() == tableItems.length) {
                    updateCheckedTables();
                        tablesLoaded = true;
    @Override
                        hasViews = true;
        }
                    loadTables(catalog);
        List<MySQLDatabaseExportInfo> objects = wizard.getSettings().getExportObjects();
                if (catalog.getName().equalsIgnoreCase(MySQLConstants.INFO_SCHEMA_NAME)) {
            if (!CommonUtils.isEmpty(info.getTables())) {

    }
        int selectionIndex = catalogTable.getSelectionIndex();
import org.eclipse.core.runtime.Status;
        final Set<MySQLTableBase> checkedObjects = this.checkedObjects.get(curCatalog);
    public void activatePage() {

                    updateState();

 *
                item.setImage(DBeaverIcons.getImage(DBIcon.TREE_DATABASE));
    private final Map<MySQLCatalog, Set<MySQLTableBase>> checkedObjects = new HashMap<>();
import org.eclipse.swt.SWT;
                    final List<MySQLTableBase> objects = new ArrayList<>();
                    // Dumping "information_schema" DB content is not supported
        if (hasViews) {
import java.util.List;
            }
    }
            GridData gd = new GridData(GridData.FILL_BOTH);
                    UIUtils.syncExec(() -> {

            TableItem catalogItem = catalogTable.getItem(selectionIndex);

        for (TableItem item : catalogTable.getItems()) {
                    if (wizard.getSettings().isShowViews()) {
                    continue;
            }
            }
        }
package org.jkiss.dbeaver.ext.mysql.tools;
            Composite catPanel = UIUtils.createComposite(sash, 1);

            }
                    }
                break;
        boolean hasViews = false;
                        for (MySQLTableBase table : objects) {
            gd.heightHint = 50;
                }
            catPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
        loadSettings();
 *
    private MySQLCatalog curCatalog;
                } catch (DBException e) {
                }
    }
                return Status.OK_STATUS;
                            item.setData(table);
        TableItem[] tableItems = tablesTable.getItems();
            catalogTable.setLayoutData(gd);
                        objects.addAll(curCatalog.getViews(monitor));
        Composite composite = UIUtils.createPlaceholder(parent, 1);
        if (dataSource != null) {
                MySQLDatabaseExportInfo info = new MySQLDatabaseExportInfo(catalog, checkedObjects.get(catalog));
        Set<MySQLCatalog> activeCatalogs = new LinkedHashSet<>();

                            item.setImage(DBeaverIcons.getImage(table.isView() ? DBIcon.TREE_VIEW : DBIcon.TREE_TABLE));
        return false;
{
            buttonsPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.eclipse.core.runtime.IStatus;
        Set<MySQLTableBase> checkedTables = new HashSet<>();
                item.setText(0, catalog.getName());
 */

            tablesTable.addListener(SWT.Selection, event -> {
                if (item != null) {
                        }
            tablesTable.setLayoutData(gd);
    private void loadTables(final MySQLCatalog catalog) {
    {
    protected void updateTableCheckedStatus(@NotNull Table table, boolean check) {
                    catalogTable.select(catalogTable.indexOf(item));
            @NotNull
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
            DBPDataSourceContainer container = dataSource.getContainer();
            dataSource = info.getDatabase().getDataSource();
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            createCheckButtons(buttonsPanel, tablesTable);
    private void updateCheckedTables() {
/*
                    if (event.detail == SWT.CHECK) {
import org.eclipse.swt.events.SelectionEvent;
            new Label(buttonsPanel, SWT.NONE).setLayoutData(new GridData(GridData.GRAB_HORIZONTAL));
        connInfo = new CLabel(objectsGroup, SWT.WRAP);
        setDescription(MySQLUIMessages.tools_db_export_wizard_page_objects_dialog_description);
        }
            Composite buttonsPanel = UIUtils.createComposite(catPanel, 3);
    private Button exportViewsCheck;

            tablesPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
 * See the License for the specific language governing permissions and
            wizard.getSettings().setShowViews(true);
    @Override
                if (activeCatalogs.contains(catalog)) {
        updateState();
                    if (!tablesLoaded) {
                item.setData(catalog);
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
                    info.getDatabase(), k -> new HashSet<>());
    public void createControl(Composite parent)
        }
                return item.getChecked();
            catalogTable.addListener(SWT.Selection, event -> {
                if (event.detail == SWT.CHECK) {
            catalogItem.setChecked(!checkedTables.isEmpty());
            checkedObjects.remove(curCatalog);
        if (catalog != null) {
                TableItem item = new TableItem(catalogTable, SWT.NONE);
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ui.controls.CustomSashForm;
 * you may not use this file except in compliance with the License.

            }
        for (MySQLDatabaseExportInfo info : wizard.getSettings().getExportObjects()) {
        }
    }


                    MySQLCatalog catalog = (MySQLCatalog) item.getData();
    {
        }
        }
                    });
            });
        for (TableItem item : tableItems) {
                TableItem item = (TableItem) event.item;
        if (curCatalog == null) {
            boolean tablesLoaded = false;
