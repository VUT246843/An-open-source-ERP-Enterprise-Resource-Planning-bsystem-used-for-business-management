        UIUtils.packColumns(getConnectionTable());
import java.util.List;
    }
                public void widgetSelected(SelectionEvent e) {
            item.setText(2, ImportConfigMessages.config_import_wizard_page_driver_unknown); 
            item.setText(2, url);
 * You may obtain a copy of the License at
                @Override
    }
        return connectionInfo;
    @Override
import org.eclipse.swt.widgets.TableItem;
            for (DriverDescriptor driver : dataSourceProvider.getEnabledDrivers()) {
import org.eclipse.swt.events.SelectionAdapter;

            UIUtils.createDialogButton(buttonsPanel, ImportConfigMessages.config_import_wizard_btn_select_all, new SelectionAdapter() {
    public ImportData getImportData() {
import java.util.Comparator;
 * Licensed under the Apache License, Version 2.0 (the "License");

                                setConnectionInfoForItem(setDriverForConnection(connectionInfo), item);

import org.eclipse.swt.widgets.Table;
                }
                        item.setChecked(false);
        }

            Composite buttonsPanel = UIUtils.createComposite(placeholder, 5);
            item.setText(1, ImportConfigMessages.config_import_wizard_page_driver_unknown);
                driver.getName(),
            item.setData(connectionInfo);
 * See the License for the specific language governing permissions and
                    TableItem[] selection = getConnectionTable().getSelection();
package org.jkiss.dbeaver.ui.config.migration.wizards;
        super.deactivatePage();
import org.eclipse.swt.layout.GridData;
            item.setData(connectionInfo);
        getConnectionTable().setHeaderVisible(true);
        return false;
        return importData;
    public void deactivatePage() {
    }

        super(pageName);
            }
        connectionTable = new Table(placeholder, SWT.BORDER | SWT.CHECK | SWT.MULTI);
                }
import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
                    for (TableItem item : getConnectionTable().getItems()) {
                public void widgetSelected(SelectionEvent e) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        {

 * limitations under the License.
    @Override
            item.setText(0, connectionInfo.getAlias());

                        ((ImportConnectionInfo) item.getData()).setChecked(true);
                        for (TableItem item : selection) {
        final DataSourceProviderRegistry registry = DataSourceProviderRegistry.getInstance();

import org.eclipse.osgi.util.NLS;
import org.jkiss.dbeaver.ui.controls.ConnectionFolderSelector;

    }
                if (item.getData() instanceof ImportConnectionInfo connectionInfo) {
import org.eclipse.swt.widgets.Composite;

import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
import org.eclipse.swt.layout.GridLayout;
 * distributed under the License is distributed on an "AS IS" BASIS,
                            if (item.getData() instanceof ImportConnectionInfo connectionInfo) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
        }
    private void setConnectionInfoForItem(ImportConnectionInfo connectionInfo,
    }
        getImportData().setDataSourceFolder(folderSelector.getFolder());
            loadConnections(importData);
                        }
 *
                    if (selection != null && selection.length > 0) {
                    }
    protected ConfigImportWizardPage(String pageName) {
        }
            item.setImage(0, DBeaverIcons.getImage(DBIcon.TREE_DATABASE));
        placeholder.setLayout(new GridLayout(1, true));
            item.setImage(0, DBeaverIcons.getImage(DBIcon.DATABASE_DEFAULT));

            });
                    TableItem item = new TableItem(getConnectionTable(), SWT.NONE);
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
            }
import java.util.stream.Collectors;
                if (item == null) {
        for (TableItem item : getConnectionTable().getItems()) {
        if (loaded) {
        } else {
 * you may not use this file except in compliance with the License.
    protected ImportConnectionInfo setDriverForConnection(ImportConnectionInfo connectionInfo) {

import org.jkiss.dbeaver.ui.navigator.dialogs.ObjectListDialog;
    }
    public void createControl(Composite parent) {
        return connectionTable;
            }
            setMessage(e.getMessage(), IMessageProvider.ERROR);
import org.jkiss.dbeaver.DBException;
        try {
                connectionInfo.getAlias(),
            String url = connectionInfo.getUrl();
            if (CommonUtils.isEmpty(importData.getConnections())) {
        getConnectionTable().addSelectionListener(new SelectionAdapter() {
            folderSelector = new ConnectionFolderSelector(buttonsPanel);
            connectionInfo.setDriver(driver);
    public Table getConnectionTable() {

        matchedDrivers = matchedDrivers.stream().sorted(Comparator.comparing(DriverDescriptor::getName)).collect(Collectors.toList());
        UIUtils.createTableColumn(getConnectionTable(), SWT.LEFT, ImportConfigMessages.config_import_wizard_page_th_name);
                    getContainer().updateButtons();
            if (CommonUtils.isEmpty(url)) {
                        item.setChecked(true);
                    getContainer().updateButtons();
}
    private Table connectionTable;
    @Override
        getContainer().updateButtons();
    }
                @Override
            }
                getContainer().updateButtons();
                    }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
 * DBeaver - Universal Database Manager
import org.jkiss.utils.CommonUtils;
        getConnectionTable().setLayoutData(new GridData(GridData.FILL_BOTH));
            @Override
                public void widgetSelected(SelectionEvent e) {
        if (connectionInfo.getDriverInfo() != null) {

        getConnectionTable().removeAll();
import org.eclipse.swt.SWT;
                driver.getDriverClassName()));


                        ((ImportConnectionInfo) item.getData()).setChecked(false);
            }
            item.setText(0, connectionInfo.getAlias());
                    connectionInfo.setChecked(item.getChecked());
import org.jkiss.dbeaver.model.DBIcon;
        UIUtils.createControlLabel(placeholder, ImportConfigMessages.config_import_wizard_page_caption_connections);
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    for (TableItem item : getConnectionTable().getItems()) {
            item.setText(1, connectionInfo.getDriverInfo().getName());
                url = connectionInfo.getHost();
                setMessage(null);
        } catch (DBException e) {
 */
import org.eclipse.swt.events.SelectionEvent;
                    }

    }
        if (getConnectionTable() == null) {
                return true;
                driver.getSampleURL(),
    protected abstract void loadConnections(ImportData importData) throws DBException;
                }
                for (ImportConnectionInfo connectionInfo : importData.getConnections()) {
    public boolean isPageComplete() {
        setControl(placeholder);
        }
        getConnectionTable().setLinesVisible(true);
 * Unless required by applicable law or agreed to in writing, software


 
    public void activatePage() {
                }
                TableItem item = (TableItem) e.item;


import java.util.ArrayList;
        UIUtils.packColumns(getConnectionTable());
        }
            getShell(), NLS.bind(ImportConfigMessages.config_import_wizard_choose_driver_for_connections, connectionInfo.getAlias()), "ImportDriverSelector", matchedDrivers);
        if (driver != null) {
    private ConnectionFolderSelector folderSelector;
                            }
            return false;
    private ImportData importData;
            }
                        isPageComplete();
import org.jkiss.dbeaver.ui.UIUtils;
            } else {
        boolean loaded = false;
        UIUtils.createTableColumn(getConnectionTable(), SWT.LEFT, ImportConfigMessages.config_import_wizard_page_th_url);
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
        }
public abstract class ConfigImportWizardPage extends ActiveWizardPage<ConfigImportWizard> {
        });
        }
        DriverDescriptor driver = ObjectListDialog.selectObject(
/*
            UIUtils.createDialogButton(buttonsPanel,  ImportConfigMessages.config_import_wizard_btn_deselect_all, new SelectionAdapter() {
            folderSelector.loadConnectionFolders(NavigatorUtils.getSelectedProject());
            loaded = true;
        importData = new ImportData();
            if (item.getChecked()) {
        Composite placeholder = new Composite(parent, SWT.NONE);
            UIUtils.createDialogButton(buttonsPanel,  ImportConfigMessages.config_import_wizard_btn_set_driver, new SelectionAdapter() {

        for (DataSourceProviderDescriptor dataSourceProvider : registry.getDataSourceProviders()) {
        TableItem item) {
                    return;
            });
                url = "jdbc:???";

            if (CommonUtils.isEmpty(url)) {
            public void widgetSelected(SelectionEvent e) {
        List<DriverDescriptor> matchedDrivers = new ArrayList<>();
                matchedDrivers.add(driver);
            });
                }
                setMessage(ImportConfigMessages.config_import_wizard_page_label_connection_list, IMessageProvider.WARNING);
        UIUtils.createTableColumn(getConnectionTable(), SWT.LEFT, ImportConfigMessages.config_import_wizard_page_th_driver);
import org.eclipse.jface.dialogs.IMessageProvider;
        }
                    setConnectionInfoForItem(connectionInfo, item);
                }
                @Override
    }
 *
    @Override
            connectionInfo.setDriverInfo(new ImportDriverInfo(
