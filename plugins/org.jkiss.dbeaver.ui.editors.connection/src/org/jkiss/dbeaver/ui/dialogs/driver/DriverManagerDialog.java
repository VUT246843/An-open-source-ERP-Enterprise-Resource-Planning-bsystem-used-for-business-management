            parent,
    }
            UIUtils.showMessageBox(getShell(), UIConnectionMessages.dialog_driver_manager_message_cant_delete_title, message.toString(), SWT.ICON_ERROR);
        getShell().addDisposeListener(e -> UIUtils.dispose(image));
    public boolean close() {
        gd.horizontalSpan = 2;
        if (buttonId == IDialogConstants.CLOSE_ID) {
    @Override
import org.jkiss.dbeaver.ui.UIIcon;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.swt.events.SelectionListener;
    }
        ISelection selection = event.getSelection();
                    }

import org.jkiss.dbeaver.ui.dialogs.HelpEnabledDialog;
    protected void createButtonsForButtonBar(@NotNull Composite parent) {


    private void updateButtons() {
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
            } else if (selectedObject instanceof DataSourceProviderDescriptor) {
            }
                provider = onlyManageableProvider;
        this.selectedCategory = null;
                for (DriverDescriptor driver : category.getDrivers()) {
            return true;
        this.selectedProvider = DataSourceProviderRegistry.getInstance().getDataSourceProvider(DEFAULT_DS_PROVIDER);
        descText = new Text(group, SWT.READ_ONLY);
                final Composite legend = UIUtils.createPlaceholder(buttonBar, 2, 5);
                selectedDriver.getProviderDescriptor().getRegistry().saveDrivers();
                    copyDriver();
import org.jkiss.dbeaver.DBException;
                this.selectedProvider = selectedDriver.getProviderDescriptor();
        List<DriverDescriptor> drivers = new ArrayList<>();
/*
        gd.grabExcessHorizontalSpace = true;
                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    }
            });
                            item.setData(dd);
                }
            selectedDriver.applyFrom(driver);
            if (dialog.open() == IDialogConstants.OK_ID) {
 * You may obtain a copy of the License at

                    editDriver();
            gd.heightHint = 400;

import java.util.List;
        if (driver == null) {
                            item.setImage(DBeaverIcons.getImage(dd.getIcon()));
            }
            true);
            if (SHOW_EXPORT) {
    private static final String DIALOG_ID = "DBeaver.DriverManagerDialog";//$NON-NLS-1$
    private void setDefaultSelection() {

        ImageDescriptor dialogImage = DBeaverIcons.getImageDescriptor(UIIcon.DRIVER_MANAGER);
    }
            }
        UIUtils.createPreferenceLink(
            setReturnCode(OK);
                return super.createDialogArea(parent);
    private static final boolean SHOW_EXPORT = false;
        UIUtils.createInfoLabel(placeholder, "");
import org.jkiss.code.NotNull;
            } catch (DBException e) {
        if (dialog.open() == IDialogConstants.OK_ID) {
            });
            return;
    private void deleteDriver() {
        StringBuilder buf = new StringBuilder();


                return;
                }
import org.eclipse.jface.dialogs.IDialogConstants;
                    deleteDriver();
        this.updateButtons();
    @Override
    }
import org.jkiss.dbeaver.registry.driver.DriverUtils;
        if (onlyManageableProvider != null || selectedProvider != null) {
 * Unless required by applicable law or agreed to in writing, software
        List<DBPDataSourceProviderDescriptor> enabledProviders = DataSourceProviderRegistry.getInstance().getEnabledDataSourceProviders();
        };
        if (selectedDriver != null) {
                treeControl.setSelection(new StructuredSelection(dialog.getDriver()));
        {
            } else if (dObj instanceof DriverDescriptor driver) {
        DriverEditDialog dialog = new DriverEditDialog(getShell(), driver);
        if (driver.getIcon() == DBIcon.DATABASE_DEFAULT || driver.getIcon() instanceof DBIcon && driver.getIcon().getLocation().endsWith("database.svg")) {
import org.jkiss.dbeaver.ui.IHelpContextIds;
            Button unDeleteButton = UIUtils.createPushButton(buttonBar, UIConnectionMessages.dialog_driver_manager_button_undelete, null, new SelectionAdapter() {
            buttonBar.setLayoutData(gd);
    }
        }

        buf.append(driver.getName());
                this.selectedCategory = selectedDriver.getCategory();


            buf.append("\t+");
            GridData gd = new GridData(GridData.FILL_BOTH);
        if (selectedDriver == null) {
            UIConnectionMessages.dialog_driver_manager_message_delete_driver_text + selectedDriver.getName() + "'?")) {
                        treeControl.refresh();
    }
    private DriverSelectViewer treeControl;
        {
                this.selectedProvider = (DataSourceProviderDescriptor) selectedObject;
        dialog.open();
    private void copyDriver() {
            }
            editDriver();
import org.jkiss.dbeaver.registry.DataSourceRegistry;
                @Override
        }


            }
import org.eclipse.swt.graphics.Image;
            }
            });
                UIUtils.createLabel(legend, UIConnectionMessages.dialog_driver_manager_label_user_defined);
        } else if (selectedCategory != null) {

                treeControl.refresh();
    @Override
import org.eclipse.jface.dialogs.IDialogSettings;

                        exportDriverList();
            descText.setText(CommonUtils.toString(selectedDriver.getDescription()));
import org.jkiss.dbeaver.ui.DBeaverIcons;
                }
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * distributed under the License is distributed on an "AS IS" BASIS,

    private void printDriverInfo(StringBuilder buf, DriverDescriptor driver) {
        }

 */
        //super.updateStatus(new Status(Status.INFO, DBeaverConstants.PLUGIN_ID, selectedDriver == null ? "" : selectedDriver.getDescription()));
        List<?> driverList = (List<?>) driverTreeViewer.getInput();
    }

            if (dialog.open() == IDialogConstants.OK_ID) {
import org.eclipse.swt.layout.GridLayout;
            Composite buttonBar = new Composite(group, SWT.TOP);
            deleteButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        return false;

        copyButton.setEnabled(selectedDriver != null && selectedDriver.isManageable());
import org.jkiss.dbeaver.ui.UIUtils;
            @NotNull

    protected void buttonPressed(int buttonId) {

    private DataSourceProviderDescriptor onlyManageableProvider;
                            item.setText(dd.getName());
 *
                    for (DBPDriver dd : dspd.getDrivers()) {
                @Override
        {
        if (driver.isDisabled() || driver.getReplacedBy() != null || driver.isCustom()) {
            copyButton = UIUtils.createPushButton(buttonBar, UIConnectionMessages.dialog_driver_manager_button_copy, null, new SelectionAdapter() {
        UIUtils.setClipboardContents(Display.getCurrent(), TextTransfer.getInstance(), buf.toString());
                    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

            for (DBPDataSourceContainer ds : usedDS) {
 *

            }
                        drivers.add((DriverDescriptor) e.item.getData());

        getShell().setImage(image);
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;

    public DriverManagerDialog(Shell shell) {
        if (selectedDriver != null) {
                @Override
                public void widgetSelected(SelectionEvent e) {
import org.eclipse.swt.dnd.TextTransfer;
        if (selection instanceof IStructuredSelection) {
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        Composite placeholder = UIUtils.createPlaceholder(parent, 2);
    @Override
            DataSourceProviderDescriptor provider = selectedProvider;
                buf.append(category.getName()).append("\n");
            deleteButton = UIUtils.createPushButton(buttonBar, UIConnectionMessages.dialog_driver_manager_button_delete, null, new SelectionAdapter() {
            });
                    if (manProvider != null) {
    }
                for (DriverDescriptor dd : drivers) {
            @Override
                legend.setLayoutData(gd);

 * Licensed under the Apache License, Version 2.0 (the "License");
    private Button deleteButton;
                message.append("\n - ").append(ds.getName());


                    manProvider = provider;
        }
 * See the License for the specific language governing permissions and
                        drivers.remove((DriverDescriptor) e.item.getData());
                gd.verticalIndent = 5;
    protected Composite createDialogArea(@NotNull Composite parent) {
        }
                treeControl.setSelection(new StructuredSelection(dialog.getDriver()));
                final Composite composite = super.createDialogArea(parent);
        newButton.setEnabled(onlyManageableProvider != null || (selectedProvider != null && selectedProvider.isDriversManageable()));
            treeControl.refresh();

    private DataSourceProviderDescriptor selectedProvider;
}        if (!usedDS.isEmpty()) {
 * you may not use this file except in compliance with the License.
    }
        }
            UIConnectionMessages.dialog_driver_manager_preferences_link,
        super(shell, IHelpContextIds.CTX_DRIVER_MANAGER);
            Object selectedObject = ((IStructuredSelection) selection).getFirstElement();
    public void selectionChanged(SelectionChangedEvent event) {
                        manProvider = null;
            return;
            GridData gd = new GridData(GridData.FILL_VERTICAL);
            IDialogConstants.CLOSE_LABEL,
            getShell(),

                    }
                DBWorkbench.getPlatformUI().showError("Save error", "Error saving drivers", e);
            newButton = UIUtils.createPushButton(buttonBar, UIConnectionMessages.dialog_driver_manager_button_new, null, new SelectionAdapter() {
                    public void widgetSelected(SelectionEvent e) {
        } else {

                    if (undeleteDrivers()) {
        getShell().setText(UIConnectionMessages.dialog_driver_manager_title);
        deleteButton.setEnabled(selectedDriver != null && selectedDriver.getProviderDescriptor().isDriversManageable());
                return false;
 * limitations under the License.
            descText.setText("");
 *     http://www.apache.org/licenses/LICENSE-2.0
                UIUtils.createPushButton(buttonBar, "Export", null, new SelectionAdapter() {
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
            close();
                //this.selectedProvider = null;

        if (selectedDriver != driver) {


                    if (((TableItem)e.item).getChecked()) {
                @Override
        this.selectedDriver = null;
import org.eclipse.swt.events.SelectionAdapter;
    }

                    buf.append("\t");
 * EditDriverDialog
                @Override
import java.util.ArrayList;
        );

    private String selectedCategory;
                driverTable.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
                public void widgetSelected(SelectionEvent e) {
            }
    @Override
import org.jkiss.dbeaver.Log;
    private Button copyButton;
            placeholder,
import org.eclipse.osgi.util.NLS;
    protected IDialogSettings getDialogBoundsSettings() {
    private void editDriver() {
        }
                });

            treeControl.getControl().setLayoutData(gd);
            buf.append("\tN/A");
        }
            return;
        }
        return super.close();
        }
                DBWorkbench.getPlatformUI().showError("Save error", "Error saving drivers", e);
        }

            }

    private Text descText;
            }
                UIUtils.createLabel(legend, UIConnectionMessages.dialog_driver_manager_label_unavailable);
            selectedDriver.getProviderDescriptor().removeDriver(selectedDriver.getId());
        }

        }
                Table driverTable = new Table(composite, SWT.CHECK | SWT.FULL_SELECTION | SWT.BORDER);
                UIUtils.createLabel(legend, DBIcon.OVER_ERROR);

        setDefaultSelection();
import org.jkiss.dbeaver.ui.preferences.PrefPageDrivers;
    private boolean undeleteDrivers() {
 */
            } else if (selectedObject instanceof DriverTreeViewer.DriverCategory) {
        if (!(treeControl.getSelectorViewer() instanceof DriverTreeViewer driverTreeViewer)) {

        }

            newButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                    @Override
    }
                }

        treeControl.refresh(selectedDriver);
        group.setLayoutData(new GridData(GridData.FILL_BOTH));
                if (provider.isDriversManageable()) {
            {

            IDialogConstants.CLOSE_ID,
import org.eclipse.swt.widgets.*;
                    } else {
            null
        return group;
            } catch (DBException e) {
        descText.setLayoutData(gd);
        } else {
import org.jkiss.dbeaver.model.DBIcon;

                        break;
        buf.append("\n");
        }
            DBPDataSourceProviderDescriptor manProvider = null;
    private Button editButton;
            DriverEditDialog dialog = new DriverEditDialog(getShell(), provider, selectedCategory);
/**
    private Button newButton;
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;

                }
 * DBeaver - Universal Database Manager
            protected Composite createDialogArea(@NotNull Composite parent) {
    @NotNull
                }));
            return;
            DriverEditDialog dialog = new DriverEditDialog(getShell(), selectedDriver.getProviderDescriptor(), selectedDriver);
            try {
    }
public class DriverManagerDialog extends HelpEnabledDialog implements ISelectionChangedListener, IDoubleClickListener {
                for (DBPDataSourceProviderDescriptor dspd : DataSourceProviderRegistry.getInstance().getEnabledDataSourceProviders()) {
            descText.setText(selectedProvider.getName() + " provider");
                    createDriver();
            if (manProvider != null) {
            null,
                            TableItem item = new TableItem(driverTable, SWT.NONE);
    private void createDriver() {
        ((GridLayout) parent.getLayout()).numColumns++;
            PrefPageDrivers.PAGE_ID,
    @Override
            if (provider == null || !provider.isDriversManageable()) {
            for (DBPDataSourceProviderDescriptor provider : DataSourceProviderRegistry.getInstance().getEnabledDataSourceProviders()) {
import org.jkiss.utils.CommonUtils;

import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
        this.updateButtons();
                gd.horizontalSpan = 2;
        for (Object dObj : driverList) {
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;

            StringBuilder message = new StringBuilder(NLS.bind(UIConnectionMessages.dialog_driver_manager_message_cant_delete_text, selectedDriver.getName()));
            });
            UIConnectionMessages.dialog_driver_manager_message_delete_driver_title,
 *
        DriverDescriptor driver = selectedDriver.getProviderDescriptor().getDriver(selectedDriver.getId());
import org.eclipse.jface.resource.ImageDescriptor;
        createButton(
            try {
            editButton = UIUtils.createPushButton(buttonBar, UIConnectionMessages.dialog_driver_manager_button_edit, null, new SelectionAdapter() {
        BaseDialog dialog = new BaseDialog(getShell(), "Restore deleted driver(s)", null) {
            }
import org.eclipse.swt.SWT;

                    dd.getProviderDescriptor().getRegistry().saveDrivers();
            }
        gd.verticalIndent = 5;
import org.eclipse.swt.layout.GridData;

            buttonBar.setLayout(new GridLayout(1, false));
            editButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }
        setDefaultSelection();
                UIUtils.createLabel(legend, DBIcon.OVER_LAMP);
import org.eclipse.swt.events.SelectionEvent;
            treeControl = new DriverSelectViewer(group, this, enabledProviders, false, DriverSelectViewer.SelectorViewType.tree);

        if (selectedDriver != null) {
                    }
    public void doubleClick(DoubleClickEvent event) {
    private void exportDriverList() {
            return;
        }
        editButton.setEnabled(selectedDriver != null);
                this.selectedDriver = (DriverDescriptor) selectedObject;

            if (selectedObject instanceof DriverDescriptor) {
            descText.setText(selectedCategory + " drivers");
        return UIUtils.getDialogSettings(DIALOG_ID);
    }
                public void widgetSelected(SelectionEvent e) {
    private static final Log log = Log.getLog(DriverManagerDialog.class);

                }
            log.warn("Driver not found for ID '" + selectedDriver.getId()
                }
package org.jkiss.dbeaver.ui.dialogs.driver;
                public void widgetSelected(SelectionEvent e) {
            gd.widthHint = 500;
                onlyManageableProvider = (DataSourceProviderDescriptor) manProvider;
        } else if (selectedProvider != null) {
    private DriverDescriptor selectedDriver;
    }


                public void widgetSelected(SelectionEvent e) {
        List<DBPDataSourceContainer> usedDS = DriverUtils.getUsedBy(selectedDriver, DataSourceRegistry.getAllDataSources());
        }
            if (dObj instanceof DriverTreeViewer.DriverCategory category) {
        getShell().setMinimumSize(300, 300);
                printDriverInfo(buf, driver);
        }
import org.jkiss.dbeaver.model.connection.DBPDriver;
    }
                        if (dd.isDisabled()) {
    }

        Composite group = UIUtils.createPlaceholder(super.createDialogArea(parent), 2);
            copyButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                    }
import org.eclipse.jface.viewers.*;
                gd = new GridData(GridData.FILL_HORIZONTAL);
        Image image = dialogImage.createImage();
                }
    @Override

    @Override
                    dd.setDisabled(false);
    protected void createButtonsForLeftButtonBar(@NotNull Composite parent) {
                this.selectedCategory = ((DriverTreeViewer.DriverCategory) selectedObject).getName();
            unDeleteButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                        }
                + "' in provider '" + selectedDriver.getProviderDescriptor().getId() + "'");
        if (UIUtils.confirmAction(

    private static final String DEFAULT_DS_PROVIDER = "generic";
                treeControl.refresh();
                driverTable.setLayoutData(new GridData(GridData.FILL_BOTH));
            }
                    printDriverInfo(buf, driver);
