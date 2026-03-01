        }
        }

        }
            return ((HomeInfo) selection[0].getData()).location.getName();
        HomeInfo info = (HomeInfo) homesTable.getItem(selIndex).getData();
                homes.add(homeInfo.location);
            public void widgetSelected(SelectionEvent e) {
                clientManager,
                defaultLocalClientLocation = driverLocations.get(0);
        }
public class ClientHomesPanel extends Composite {



                        return;
        removeButton.addSelectionListener(new SelectionAdapter() {
                UIConnectionMessages.controls_client_homes_panel_link_message,
                    @Override
                TableItem[] selection = homesTable.getSelection();
        if (clientManager == null) {

                homesTable.setSelection(homesTable.indexOf(item));
    }
                    removeClientHome();
        }
        String homeId = directoryDialog.open();
        selectHome(null);
            panel.loadHomes(driver);
        Set<DBPNativeClientLocation> providedHomes = new LinkedHashSet<>();
            }
                homeItem.setFont(BaseThemeSettings.instance.treeAndTableFontBold);
        }
            }

            return null;
            this,
        }
        nameText = UIUtils.createLabelText(infoGroup, UIConnectionMessages.controls_client_homes_panel_label_name, null, SWT.BORDER | SWT.READ_ONLY);
import org.eclipse.osgi.util.NLS;
        listGroup.setLayoutData(new GridData(GridData.FILL_VERTICAL));
                });
                if (homesTable.getItemCount() > 0) {
                    descriptor.setNativeClientLocations(panel.getLocalLocations());
    }
        this.driver = driver;
        TableItem homeItem = new TableItem(homesTable, SWT.NONE);
                new LocalNativeClientLocation(homeId, homeId),
                if (!ArrayUtils.isEmpty(selection)) {
    private final Text idText;
        homeItem.setText(clientLocation.getDisplayName());
        if (clientManager != null) {
                UIUtils.runInProgressDialog(monitor -> {
            @Override

                        DBWorkbench.getPlatformUI().showError("Save error", "Error saving drivers", e);
        @Override
        addButton.setText(UIConnectionMessages.controls_client_homes_panel_button_add_home);
        protected boolean isResizable() {
        removeButton = new Button(buttonsGroup, SWT.PUSH);
        if (lastHomeDirectory != null) {
import org.jkiss.utils.CommonUtils;
                false);
        boolean isDefault;
import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.dbeaver.registry.driver.RemoteNativeClientLocation;

        GridLayout layout = new GridLayout(2, false);
                        home.location.validateFilesPresence(monitor);
        }
        Composite buttonsGroup = UIUtils.createPlaceholder(listGroup, 2, 5);
    }
        Composite infoGroup = UIUtils.createTitledComposite(
    private void addClientHome() {
            }
            if (UIUtils.confirmAction(
        if (!info.isProvided) {
        idText.setText(home == null ? "" : CommonUtils.notEmpty(home.location.getName())); //$NON-NLS-1$
        productNameText = UIUtils.createLabelText(infoGroup, UIConnectionMessages.controls_client_homes_panel_label_product_name, null, SWT.BORDER | SWT.READ_ONLY);
        }


import org.jkiss.dbeaver.model.connection.DBPDriver;
            return null;
                    selectHome((HomeInfo) homesTable.getItem(selIndex - 1).getData());
    private final Text productNameText;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
            getShell().setText(UIConnectionMessages.controls_client_homes_panel_dialog_title);
    }
                    try {
        }
        ChooserDialog dialog = new ChooserDialog(parent, driver);

import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
        if (!homeInfo.isProvided) {
            panel.setLayoutData(gd);
        ((GridData) (listGroup.getLayoutData())).minimumWidth = 200;
            HomeInfo homeInfo = (HomeInfo) item.getData();
import org.eclipse.swt.layout.GridLayout;
            2,
            providedHomes.addAll(clientManager.findLocalClientLocations());
import org.jkiss.dbeaver.runtime.DBWorkbench;
                infoPanel,
 */
        if (defaultLocalClientLocation == null) {
        } else {
                    } catch (DBException e) {
            } catch (InvocationTargetException e) {
import org.eclipse.swt.events.SelectionAdapter;
            @Override
import org.jkiss.dbeaver.model.connection.LocalNativeClientLocation;
                addClientHome();
                    public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
 * you may not use this file except in compliance with the License.

                        home.isValidated = true;
            panel = new ClientHomesPanel(parent, SWT.NONE);
                    }
            super(parentShell);
                    homesTable.setSelection(selIndex - 1);
        Set<DBPNativeClientLocation> allHomes = new LinkedHashSet<>();
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;
    private static class ChooserDialog extends org.eclipse.jface.dialogs.Dialog {
        boolean isProvided;
                selectedHome = panel.getSelectedHome();
            }
        DBPNativeClientLocation location;
                }
import org.eclipse.swt.widgets.*;

            0
        DBPNativeClientLocationManager nativeClientLocationManager = driver.getNativeClientManager();

        Composite listGroup = UIUtils.createPlaceholder(this, 1, 5);
import org.jkiss.dbeaver.ui.*;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        } else {
        HomeInfo homeInfo = new HomeInfo(clientLocation);

                    } catch (DBException e) {
/**
import org.jkiss.dbeaver.Log;
        homesTable.setLayoutData(new GridData(GridData.FILL_BOTH));
        }
            @Override
        if (clientManager != null) {
            }
 */
        DBPNativeClientLocation defaultLocalClientLocation = clientManager.getDefaultLocalClientLocation();
                new SelectionAdapter() {
                    try {
            gridData.horizontalSpan = 2;

            GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL,
                if (ArrayUtils.isEmpty(selection)) {
 * ClientHomesPanel
        if (homeId == null) {
        public boolean isValidated;
        int selIndex = homesTable.getSelectionIndex();
                UIConnectionMessages.controls_client_homes_panel_confirm_remove_home_title,
        return homes;
        TableItem[] selection = homesTable.getSelection();
}                getShell(),
        }
        ((GridData) (infoGroup.getLayoutData())).minimumWidth = 300;
            createHomeItem(
    private final Text nameText;
            public void widgetSelected(SelectionEvent e) {

        for (TableItem item : homesTable.getItems()) {
        super(parent, style);
        } else {

                DBWorkbench.getPlatformUI().showError("Client download", "Failed to download client files", e.getTargetException());
    public Collection<DBPNativeClientLocation> getLocalLocations() {
            directoryDialog.setFilterPath(lastHomeDirectory);
        DirectoryDialog directoryDialog = new DirectoryDialog(getShell());
    private void selectHome(HomeInfo home) {
 * See the License for the specific language governing permissions and

                NLS.bind(UIConnectionMessages.controls_client_homes_panel_confirm_remove_home_text, info.location.getName()))) {
        }
                        descriptor.getProviderDescriptor().getRegistry().saveDrivers();
            HomeInfo homeInfo = (HomeInfo) item.getData();
        });
 * Unless required by applicable law or agreed to in writing, software
        idText = UIUtils.createLabelText(infoGroup, UIConnectionMessages.controls_client_homes_panel_label_id, null, SWT.BORDER | SWT.READ_ONLY);
    }
        allHomes.addAll(providedHomes);
        {
            if (homeInfo.isDefault) {
        }
            }
                    }
        List<DBPNativeClientLocation> homes = new ArrayList<>();
            if (IDialogConstants.OK_ID == buttonId) {
                }
            if (!homeInfo.isProvided) {
import java.lang.reflect.InvocationTargetException;
    static String chooseClientHome(Shell parent, DBPDriver driver) {
        Button addButton = new Button(buttonsGroup, SWT.PUSH);
                selectHome(homeInfo);
            if (!CommonUtils.isEmpty(driverLocations)) {
        @Override
        }
                if (driver instanceof DriverDescriptor descriptor) {
            List<DBPNativeClientLocation> driverLocations = driver.getNativeClientLocations();
import java.util.*;

import org.jkiss.dbeaver.DBException;
    private String getSelectedHome() {
            TableItem item = createHomeItem(clientManager, home, home instanceof RemoteNativeClientLocation || providedHomes.contains(home));
        if (ArrayUtils.isEmpty(selection)) {
            return;
 * Licensed under the Apache License, Version 2.0 (the "License");
        });
            return true;
import org.eclipse.swt.SWT;
import org.eclipse.jface.dialogs.IDialogConstants;

import org.jkiss.dbeaver.model.connection.DBPNativeClientLocationManager;
            productNameText.setText(home == null ? "" : CommonUtils.notEmpty(nativeClientLocationManager.getProductName(home.location))); //$NON-NLS-1$
    private static String lastHomeDirectory;
                } else {
    }
    public static final String WIKI_CONFIGURE_CLIENT = "Local-Client-Configuration";
import java.util.List;
            GridData gd = new GridData(GridData.FILL_BOTH);
        lastHomeDirectory = homeId;
        }

                homesTable.remove(selIndex);
    }
                });
            infoPanel.setLayout(new GridLayout(1, false));
            log.debug("Client manager is not supported by driver '" + driver.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
        private final DBPDriver driver;
                    }
        if (nativeClientLocationManager != null) {
                }
        ChooserDialog(Shell parentShell, DBPDriver driver) {
        homesTable.removeAll();
        productVersionText = UIUtils.createLabelText(infoGroup, UIConnectionMessages.controls_client_homes_panel_label_product_version, null, SWT.BORDER | SWT.READ_ONLY);
                    selectHome(null);
    private final Button removeButton;
                TableItem[] selection = homesTable.getSelection();
    private final Text pathText;
 * You may obtain a copy of the License at
                } else {

        @Override
            return parent;
        allHomes.addAll(driver.getNativeClientLocations());
        buttonsGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.HORIZONTAL_ALIGN_END));
        removeButton.setEnabled(false);
                        throw new InvocationTargetException(e);
        if (dialog.open() == IDialogConstants.OK_ID) {
        private String selectedHome;

            UIConnectionMessages.controls_client_homes_panel_group_information,
    private DBPDriver driver;
        removeButton.setEnabled(home != null && !home.isProvided);
            GridData gridData = new GridData(GridData.FILL, SWT.END, true, true);
    private final Text productVersionText;
            if (homeInfo.isDefault) {

        homesTable.addSelectionListener(new SelectionAdapter() {
        }
                }
        removeButton.setText(UIConnectionMessages.controls_client_homes_panel_button_remove_home);
        DBPNativeClientLocationManager clientManager = driver.getNativeClientManager();

        protected Control createDialogArea(Composite parent) {

                        ShellUtils.launchProgram(HelpUtils.getHelpExternalReference(WIKI_CONFIGURE_CLIENT));
    private static final Log log = Log.getLog(ClientHomesPanel.class);
                    selectHome((HomeInfo) selection[0].getData());
            this.driver = driver;
        homeInfo.isDefault = defaultLocalClientLocation != null && clientLocation.getName().equals(defaultLocalClientLocation.getName());
/*
            UIUtils.createLink(

        }
        addButton.addSelectionListener(new SelectionAdapter() {
            }
            Composite infoPanel = new Composite(parent, SWT.NONE);
    }
 *
    public void loadHomes(DBPDriver driver) {
            }
                    selectHome(null);
            try {
        );
    static class HomeInfo {
            }
    public ClientHomesPanel(
        homesTable = new Table(listGroup, SWT.SINGLE | SWT.BORDER | SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL);



            return dialog.selectedHome;
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.code.NotNull;
            productVersionText.setText(home == null ? "" : CommonUtils.notEmpty(nativeClientLocationManager.getProductVersion(home.location))); //$NON-NLS-1$
package org.jkiss.dbeaver.ui.dialogs.connection;
        homeItem.setData(homeInfo);
            homeItem.setFont(BaseThemeSettings.instance.treeAndTableFontItalic);
 * DBeaver - Universal Database Manager
    }
        if (home != null && !home.isValidated) {
        int style) {
        homeItem.setImage(DBeaverIcons.getImage(UIIcon.HOME));

    }
        DBPNativeClientLocationManager clientManager = this.driver.getNativeClientManager();
        protected void buttonPressed(int buttonId) {
 *
        for (DBPNativeClientLocation home : allHomes) {
            public void widgetSelected(SelectionEvent e) {
            }
        setLayout(layout);

        }
 *
        HomeInfo(DBPNativeClientLocation location) {
        nameText.setText(home == null ? "" : CommonUtils.notEmpty(home.location.getDisplayName())); //$NON-NLS-1$
            this.location = location;
import org.jkiss.dbeaver.utils.HelpUtils;
        pathText.setText(home == null ? "" : home.location.getPath().getAbsolutePath()); //$NON-NLS-1$
        return homeItem;
        homeInfo.isProvided = provided;
        private ClientHomesPanel panel;
        Composite parent,
    private TableItem createHomeItem(@NotNull DBPNativeClientLocationManager clientManager, @NotNull DBPNativeClientLocation clientLocation, boolean provided) {
        pathText = UIUtils.createLabelText(infoGroup, UIConnectionMessages.controls_client_homes_panel_label_path, null, SWT.BORDER | SWT.READ_ONLY);
    private final Table homesTable;
import org.jkiss.utils.ArrayUtils;
    private void removeClientHome() {
            infoPanel.setLayoutData(gridData);
            //gd.widthHint = 500;
import org.eclipse.swt.layout.GridData;
        });
            super.buttonPressed(buttonId);
        }
