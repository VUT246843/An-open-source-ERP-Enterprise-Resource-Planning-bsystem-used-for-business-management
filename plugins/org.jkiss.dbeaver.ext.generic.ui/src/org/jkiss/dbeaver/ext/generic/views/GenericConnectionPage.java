        DBConstants.PROP_FOLDER, GROUP_PATH,
    }
        DBPConnectionConfiguration cfg = testDataSource.getConnectionConfiguration();
            if (CommonUtils.isNotEmpty(dbTerm)) {
                if (isConnectionPropertyOptional(prop)) {
            site.getActiveDataSource().getConnectionConfiguration().setUrl(null);
                }
                } else {
        Composite addrGroup = new Composite(composite, SWT.NONE);
                }
            } else if (connectionInfo.getUrl() != null) {
            }
        site.updateButtons();
                    null,
            // Set first control
            if (pathText != null) {
                showControlGroup(GROUP_SERVER, properties.contains(DBConstants.PROP_SERVER));
                pathText.setText(CommonUtils.notEmpty(connectionInfo.getDatabaseName()));
}
        }

        }
            String text = pathText.getText();
        } else {
        return UIUtils.createEmptyLabel(parent, 2, 1);
                if (site.isNew() && CommonUtils.isEmpty(connectionInfo.getServerName())) {
        }
                Image image = DBeaverIcons.getImage(icon);
                } catch (Exception e) {

        // Load values from new connection info
            serverText.setText(""); //$NON-NLS-1$

            }
                urlText.setText(CommonUtils.notEmpty(dataSource.getDriver().getSampleURL()));
import org.jkiss.dbeaver.DBException;
            }
                } else {
*/
            buttonsPanel.setLayoutData(gd);
                {
            connectionInfo.setDatabaseName(pathText.getText().trim());
import org.jkiss.code.NotNull;
            DBPDriver driver = site.getActiveDataSource().getDriver();
        }
            Composite buttonsPanel = new Composite(settingsGroup, SWT.NONE);
                }
                }
            addControlToGroup(GROUP_SERVER, emptyLabel);
            gd = new GridData(GridData.CENTER);
    private Text dbText;
        super.saveSettings(dataSource);
            gd = new GridData(GridData.FILL_HORIZONTAL);
        if (dbText != null && properties.contains(DBConstants.PROP_DATABASE)) {
            }
            gl.marginWidth = 0;
    protected boolean isConnectionPropertyOptional(String property) {
            } else  if (serverText != null && serverText.isVisible()) {

                }
                    dbText.setText(CommonUtils.notEmpty(site.getDriver().getDefaultDatabase()));
    @Override
                            }
        }
        });
        } else {
                controlGroupsByUrl = properties.stream().map(controlGroupByUrlProp::get).collect(Collectors.toSet());
            hostLabel.setText(GenericMessages.dialog_connection_host_label);

            // Connect and disconnect immediately
                try {
            Label portLabel = new Label(settingsGroup, SWT.NONE);
import org.jkiss.utils.CommonUtils;
                dbLabel.setText(GenericMessages.dialog_connection_database_schema_label);
            if (dbText != null) {
                Object gd = control.getLayoutData();
import org.jkiss.dbeaver.ext.generic.GenericConstants;
                    }
            gd = new GridData(GridData.FILL_HORIZONTAL);
        if (portText != null && properties.contains(DBConstants.PROP_PORT)) {
            gd.widthHint = 200;
            }
        return new IDialogPage[] {
                showControlGroup(GROUP_HOST, properties.contains(DBConstants.PROP_HOST));
        this.parseSampleURL(site.getDriver());
            dataSource.getDriver(),
            //gd.widthHint = 150;
    );
        // Path
            File curFolder = new File(curPath);
    private static final Log log = Log.getLog(GenericConnectionPage.class);

    }
            if (CommonUtils.isNotEmpty(dbTerm)) {

            if (isSampleUrlUsable) {


            } else  if (dbText != null && dbText.isVisible()) {
        return isCustom || (typeURLRadio != null && typeURLRadio.getSelection());
            dbText.setLayoutData(gd);
 * you may not use this file except in compliance with the License.
                                pathText.setText(path);
            addControlToGroup(GROUP_HOST, portText);
                gl.numColumns += 1;
 *
                if (!CommonUtils.isEmpty(connectionInfo.getHostName())) {

                    gd = new GridData(GridData.BEGINNING);
        }
        }
    private static final String GROUP_DB = "db"; //$NON-NLS-1$
 * distributed under the License is distributed on an "AS IS" BASIS,

 *     http://www.apache.org/licenses/LICENSE-2.0
        addrGroup.setLayoutData(gd);
        DBConstants.PROP_DATABASE, GROUP_DB,
            hostText = new Text(settingsGroup, SWT.BORDER);
                    saveAndUpdate();
                serverText.setFocus();
        {
        }

                }
    }
    }
        if (!isCustom) {
    private String showDatabaseFileSelectorDialog(int style) {
import org.eclipse.jface.dialogs.IDialogPage;
                        public void widgetSelected(SelectionEvent e) {
    private Collection<String> controlGroupsByUrl;
                showControlGroup(GROUP_DB, properties.contains(DBConstants.PROP_DATABASE));
                }
        DBConstants.PROP_SERVER, GROUP_SERVER,
        connectionInfo.setConfigurationType(
//            gd.widthHint = 270;
        if (icon != null) {
        UIUtils.asyncExec(() -> {
                urlText.setEditable(false);
    private void showControlGroup(String group, boolean show) {
    private Text hostText;
import org.jkiss.dbeaver.model.DBPImage;

import java.util.Set;
    @Override
        if (isCustomURL()) {
                            if (path != null) {
import org.eclipse.swt.events.ModifyListener;
            }
        }
        }

        DBConstants.PROP_HOST, GROUP_HOST,
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;
        }
            FileDialog dialog = new FileDialog(getShell(), SWT.SINGLE | style);
        return !CommonUtils.isEmpty(param) && !CommonUtils.isEmptyTrimmed(pathText.getText());

        return super.getImage();
            addControlToGroup(GROUP_PATH, pathText);

            return dialog.open();
        DBConstants.PROP_FILE, GROUP_PATH
    private static final String GROUP_PATH = "path"; //$NON-NLS-1$
        }
            if (activated) {
            }
                if (site.isNew() && CommonUtils.isEmpty(connectionInfo.getHostPort())) {
                showControlGroup(GROUP_PATH, properties.contains(DBConstants.PROP_FOLDER) || properties.contains(DBConstants.PROP_FILE));
            } catch (Exception e) {
import org.jkiss.code.Nullable;
 */
package org.jkiss.dbeaver.ext.generic.views;
                    });
    private Text pathText;
    // Host/port
            hostText.setText(""); //$NON-NLS-1$
            }



                }
            gd.widthHint = 200;
            addControlToGroup(GROUP_SERVER, serverLabel);
        }

    }


        }
    @Override
import org.jkiss.utils.IOUtils;
            buttonsPanel.setLayout(gl);
        final boolean useURL = connectionInfo.getConfigurationType() == DBPDriverConfigurationType.URL;

                urlText.setText(connectionInfo.getUrl());
            serverLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
        };
    private static final Map<String, String> controlGroupByUrlProp = Map.of(
import org.jkiss.dbeaver.ui.DBeaverIcons;
        return false;
                @Override
            }
                    log.debug("Can't find directory path", ex);
            if (CommonUtils.isNotEmpty(text)) {
                urlText.setText(CommonUtils.notEmpty(connectionInfo.getUrl()));
        settingsGroup.getParent().layout();
                    hostText.setText(CommonUtils.toString(site.getDriver().getDefaultHost(), DBConstants.HOST_LOCALHOST)); //$NON-NLS-1$
            urlText = new Text(settingsGroup, SWT.BORDER);
        Set<Control> controlList = propGroupMap.get(group);
                    dialog.setFilterPath(curFolder.getAbsolutePath());
                    String directoryPath = IOUtils.getDirectoryPath(text);
                metaURL = DatabaseURL.parseSampleURL(driver.getSampleURL());
import org.jkiss.dbeaver.model.DBConstants;
            }
        parseSampleURL(driver);
    private void saveAndUpdate() {


                    new SelectionAdapter() {
            MessageDialog.openInformation(getShell(), "Database Create", "Database '" + databaseName + "' created!");
        String databaseName = cfg.getDatabaseName();
            urlText.addModifyListener(e -> site.updateButtons());
            hostText.setLayoutData(gd);
            dialog.setText(GenericMessages.dialog_connection_db_folder_chooser_text);
import org.jkiss.dbeaver.ext.generic.internal.GenericMessages;
        }
 * Unless required by applicable law or agreed to in writing, software
            showControlGroup(GROUP_HOST, false);
                if (image.getImageData().width >= 64) {
            return true;
            pathText = new Text(settingsGroup, SWT.BORDER);
            connectionInfo.setHostPort(portText.getText().trim());
        if (!useCustomUrl) {
                        setupConnectionModeSelection(urlText, typeURLRadio.getSelection(), controlGroupsByUrl);
            addControlToGroup(GROUP_HOST, hostText);
    }
        {
            }
                    saveSettings(dataSource);
                dbLabel = new Label(settingsGroup, SWT.NONE);
                        @Override
                    GenericMessages.dialog_connection_create_button,
        addrGroup.setLayout(new GridLayout(1, false));
                    if (CommonUtils.isNotEmpty(directoryPath)) {
 * See the License for the specific language governing permissions and
            if (CommonUtils.isEmpty(site.getDriver().getSampleURL())) {
            } else  if (hostText != null && hostText.isVisible()) {
                            final String path = showDatabaseFileSelectorDialog(SWT.SAVE);
    private static final String GROUP_URL = "url"; //$NON-NLS-1$
        }
            addControlToGroup(GROUP_HOST, hostLabel);
/*
            DBWorkbench.getPlatformUI().showError("Create database", "Error creating database", e1.getTargetException());
        GridData gd = new GridData(GridData.FILL_BOTH);
        } catch (InvocationTargetException e1) {
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {

import org.jkiss.dbeaver.registry.DataSourceDescriptor;
import org.jkiss.dbeaver.Log;
        setControl(addrGroup);

            gd.horizontalSpan = 3;
        }
            setupConnectionModeSelection(urlText, useURL, controlGroupsByUrl);

    private boolean activated;
            site.getRunnableContext().run(true, true, monitor -> {

            } else {
        }


            pathText.setLayoutData(gd);
    private Text serverText;
        } catch (InterruptedException e1) {
                public void widgetSelected(SelectionEvent e) {
        if (metaURL.getAvailableProperties().contains(DBConstants.PROP_FILE)) {
            createAuthPanel(addrGroup, 4);
                        dialog.setFilterPath(directoryPath);
            }
            isCustom = true;
                    buttonsPanel,
    private Text urlText;
                        pathText.setText(path);
        super.loadSettings();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.UIUtils;
import java.nio.file.InvalidPathException;
    }
                                if (canCreateEmbeddedDatabase()) {
    private void parseSampleURL(DBPDriver driver) {
                serverLabel.setText(GenericMessages.dialog_connection_server_label);
            addControlToGroup(GROUP_LOGIN, getAuthPanelComposite());
                    dialog.setFilterPath(curFolder.getParentFile().getAbsolutePath());

    public void loadSettings() {
            if (urlText != null && connectionInfo.getUrl() != null) {
                    (prop.equals(DBConstants.PROP_HOST) && CommonUtils.isEmptyTrimmed(hostText.getText())) ||
 *
import org.eclipse.swt.graphics.Image;
            //portText.addVerifyListener(UIUtils.INTEGER_VERIFY_LISTENER);

            hostText.addModifyListener(textListener);
    }
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();

            dbLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
            connectionInfo.setHostName(hostText.getText().trim());
                    GenericMessages.dialog_connection_create_button_tip,
    }
            createConnectionModeSwitcher(settingsGroup, typeSwitcher);
            final String curPath = pathText.getText();
            gd = new GridData(GridData.FILL_HORIZONTAL);
            
    protected boolean isCustomURL() {
                serverLabel = new Label(settingsGroup, SWT.NONE);
        saveSettings(site.getActiveDataSource());
 */
                    throw new InvocationTargetException(e1);
        );
            serverText.addModifyListener(textListener);
            UIUtils.setDefaultTextControlWidthHint(hostText);
                control.setVisible(show);
            }

        if (!UIUtils.confirmAction(getShell(), "Create Database", "Are you sure you want to create database '" + databaseName + "'?")) {
        if (controlList != null) {
                    createEmbeddedDatabase(monitor, testDataSource);
import java.io.File;
            // Just ignore
public class GenericConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider {
                        }

            Label urlLabel = UIUtils.createControlLabel(settingsGroup, GenericMessages.dialog_connection_jdbc_url_);
        setupConnectionModeSelection(urlText, this.isCustomURL(), controlGroupsByUrl);


            gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
            dialog.setMessage(GenericMessages.dialog_connection_db_folder_chooser_message);
    @Override
                urlText.setText(""); //$NON-NLS-1$
            serverText.setLayoutData(gd);
        if (useCustomUrl) {
        }
            }
    private void createEmbeddedDatabase(DBRProgressMonitor monitor, DataSourceDescriptor testDataSource) throws DBException {

                saveAndUpdate();
            new DBPConnectionConfiguration(dataSource.getConnectionConfiguration())
        }
                    }
    }

        try {

    public void createAdvancedSettingsGroup(Composite composite) {
        DataSourceDescriptor testDataSource = site.getDataSourceRegistry().createDataSource(


                }

                if (
            }
            dbText = new Text(settingsGroup, SWT.BORDER);
            addControlToGroup(GROUP_DB, dbLabel);
            pathLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
    // server/DB/path
                useCustomUrl = true;
    @NotNull
    }
            if (isCustomURL() && typeURLRadio != null && !typeURLRadio.isVisible() && CommonUtils.isEmpty(connectionInfo.getUrl())) {
            } else {
    }
            if (curFolder.exists()) {
            icon = driver.getIconBig();
import org.eclipse.swt.layout.GridLayout;
    }

    // URL
            }
        if (pathText != null && (properties.contains(DBConstants.PROP_FOLDER) || properties.contains(DBConstants.PROP_FILE))) {
        }
            showControlGroup(GROUP_PATH, false);

            gl.marginHeight = 0;
    public Image getImage() {
    }
            boolean isSampleUrlUsable = properties.contains(DBConstants.PROP_HOST) ||
            pathText.addModifyListener(textListener);
        }
        if (isCustomURL()) {
            for (Control control : controlList) {
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;
            urlLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

            urlText.setLayoutData(gd);
    public void setPortText(String text) {
                if (curFolder.isDirectory()) {
        } finally {
                    portText.setText(connectionInfo.getHostPort());

                } catch (InvalidPathException ex) {
    private boolean isCustom;
import java.util.Map;
            return;
                try {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        final DBPDataSourceContainer dataSource = site.getActiveDataSource();
                return false;

        {
                urlText.setFocus();
 * DBeaver - Universal Database Manager

            gd = new GridData(GridData.FILL_HORIZONTAL);
            gd.widthHint = UIUtils.getFontHeight(portText) * 7;
import java.util.stream.Collectors;
            try {
        if (icon == null) {
            UIUtils.createDialogButton(buttonsPanel, GenericMessages.dialog_connection_browse_button, null, GenericMessages.dialog_connection_browse_button_tip, new SelectionAdapter() {
            Label dbLabel;
            gd.grabExcessHorizontalSpace = true;
        if (urlText != null) {
            portLabel.setText(GenericMessages.dialog_connection_port_label);
import org.eclipse.swt.widgets.*;
            dialog.setFileName(text);
            gd.horizontalSpan = 2;
            return !CommonUtils.isEmpty(urlText.getText());
            UIUtils.setDefaultTextControlWidthHint(dbText);
            addControlToGroup(GROUP_DB, emptyLabel);
        DBPDriver driver = getSite().getDriver();

        settingsGroup = UIUtils.createTitledComposite(addrGroup, GenericMessages.dialog_connection_general_tab, 4, GridData.FILL_HORIZONTAL);
                try {
            String dbTerm = (String) driver.getDriverParameter(GenericConstants.PARAM_TERM_SERVER);
                    return false;
            testDataSource.dispose();
    private static final String GROUP_LOGIN = "login"; //$NON-NLS-1$

            testDataSource.connect(monitor, true, true);
        showControlGroup(GROUP_LOGIN, !driver.isAnonymousAccess());
                }
    public void createControl(Composite composite) {
    private Composite settingsGroup;
            Control emptyLabel = UIUtils.createEmptyLabel(settingsGroup, 2, 1);
        {
                if (site.isNew() && CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {
            addControlToGroup(GROUP_HOST, portLabel);
    @Nullable
            }
            addControlToGroup(GROUP_DB, dbText);
            addControlToGroup(GROUP_PATH, buttonsPanel);
    }
                } else if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
                properties.contains(DBConstants.PROP_FOLDER) ||
            dbText.setText(""); //$NON-NLS-1$


            }
            } else {
                pathText.setFocus();
    }
            dialog.setText(GenericMessages.dialog_connection_db_file_chooser_text);
            serverText = new Text(settingsGroup, SWT.BORDER);
    }
 * GenericConnectionPage
        createDriverPanel(addrGroup);
            SelectionAdapter typeSwitcher = new SelectionAdapter() {
            connectionInfo.setServerName(serverText.getText().trim());
        if (serverText != null && properties.contains(DBConstants.PROP_SERVER)) {
                    hostText.setText(CommonUtils.notEmpty(connectionInfo.getHostName()));
            } catch (DBException e) {
                properties.contains(DBConstants.PROP_FILE);
    @Override
                    control.setLayoutData(gd);

        final Set<String> properties = metaURL == null ? Collections.emptySet() : metaURL.getAvailableProperties();
            gd.grabExcessHorizontalSpace = true;

                setErrorMessage(e.getMessage());
        }
                }
            gl = new GridLayout(1, true);
        try {


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * limitations under the License.
            portText = new Text(settingsGroup, SWT.BORDER);
            showControlGroup(GROUP_DB, false);
            } else {
                    serverText.setText(CommonUtils.notEmpty(site.getDriver().getDefaultServer()));
        cfg.setDatabaseName(cfg.getDatabaseName() + paramCreate);
            testDataSource.dispose();
            DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.NONE);
            gd.grabExcessHorizontalSpace = true;
            };
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
            });
            Label serverLabel;
        }
                }
import org.eclipse.swt.events.SelectionAdapter;
            Label pathLabel = new Label(settingsGroup, SWT.NONE);
        ModifyListener textListener = e -> {
    @Override
        if (!isCustom) {
            if (metaURL == null) {
            showControlGroup(GROUP_CONNECTION_MODE, false);
            controlGroupsByUrl = Collections.emptyList();
            gd = new GridData(GridData.FILL_HORIZONTAL);
            pathLabel.setText(GenericMessages.dialog_connection_path_label);
            dataSource.getId(),
                properties.contains(DBConstants.PROP_SERVER) ||
            if (urlText != null) {
                                    createEmbeddedDatabase();
    public boolean isComplete() {
        } else {
/**
    // DS provider may pre-populate default values for them
                    return image;
import org.eclipse.swt.SWT;
                                }
                isCustom = false;
        boolean useCustomUrl = CommonUtils.isEmpty(driver.getSampleURL());
import org.eclipse.jface.dialogs.MessageDialog;

        DBPImage icon = driver.getLogoImage();
            UIUtils.setDefaultTextControlWidthHint(serverText);
        site.updateButtons();
        settingsGroup.setLayout(gl);
                } else {
        if (!controlGroupsByUrl.isEmpty()) {
            //gd.horizontalSpan = 3;
        saveAndUpdate();
    }
import java.util.Collections;
            portText.setText(""); //$NON-NLS-1$
    private boolean canCreateEmbeddedDatabase() {
    private static final String GROUP_SERVER = "server"; //$NON-NLS-1$
    // Needed to make some properties optional although they are specified as required in URL pattern
                connectionInfo.setUrl(urlText.getText().trim());
            showControlGroup(GROUP_SERVER, false);
 * You may obtain a copy of the License at
            portLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

                }
                public void widgetSelected(SelectionEvent e) {
    protected void updateDriverInfo(DBPDriver driver) {
        UIUtils.fixReadonlyTextBackground(urlText);
            final Set<String> properties = metaURL.getAvailableProperties();
            }
        saveSettings(testDataSource);

                }
            for (String prop : metaURL.getRequiredProperties()) {
        {
            if (CommonUtils.isEmpty(connectionInfo.getUrl())) {
import org.jkiss.dbeaver.model.DatabaseURL;
            });
    private Text portText;
        } else {
            Label hostLabel = new Label(settingsGroup, SWT.NONE);
                    // Can't find directory path. Ignore it then.
    
                    ((prop.equals(DBConstants.PROP_FILE) || prop.equals(DBConstants.PROP_FOLDER)) && CommonUtils.isEmptyTrimmed(pathText.getText())))

        saveAndUpdate();
                }
                dbText.setFocus();
                    if (path != null) {
            portText.setLayoutData(gd);
                    (prop.equals(DBConstants.PROP_DATABASE) && CommonUtils.isEmptyTrimmed(dbText.getText())) ||
import org.jkiss.dbeaver.runtime.DBWorkbench;
            String dbTerm = (String) driver.getDriverParameter(GenericConstants.PARAM_TERM_DATABASE);
                    final String path = showDatabaseFileSelectorDialog(SWT.OPEN);

import java.util.Collection;
    @Override
            typeURLRadio != null && typeURLRadio.getSelection() ? DBPDriverConfigurationType.URL : DBPDriverConfigurationType.MANUAL);
    public void saveSettings(DBPDataSourceContainer dataSource) {
                showControlGroup(GROUP_CONNECTION_MODE, true);
                hostText.setFocus();
                    if (!controlGroupsByUrl.isEmpty()) {
        // Update buttons
                properties.contains(DBConstants.PROP_DATABASE) ||
        {

            hostLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
            gd.grabExcessHorizontalSpace = true;

        metaURL = null;
                } else {
                    }
        GridLayout gl = new GridLayout(4, false);
            testDataSource.disconnect(monitor);
            }
        }
        };
            addControlToGroup(GROUP_SERVER, serverText);
                    ((GridData)gd).exclude = !show;
                    setMessage(e.getMessage());
                    portText.setText(CommonUtils.notEmpty(site.getDriver().getDefaultPort()));
    private static final String GROUP_HOST = "host"; //$NON-NLS-1$

            gd.grabExcessHorizontalSpace = true;
    private DatabaseURL.MetaURL metaURL;
        }
            if (CommonUtils.toBoolean(site.getDriver().getDriverParameter(GenericConstants.PARAM_SUPPORTS_EMBEDDED_DATABASE_CREATION))) {
            if (hostText != null) {
import org.eclipse.swt.layout.GridData;

            Control emptyLabel = createDatabasePropsPanel(settingsGroup);
            addControlToGroup(GROUP_PATH, pathLabel);
            try {
                    continue;
 *
            //gd.widthHint = 270;
    }
            return dialog.open();
            if (portText != null) {

import java.lang.reflect.InvocationTargetException;
        if (hostText != null && properties.contains(DBConstants.PROP_HOST)) {
import org.jkiss.dbeaver.ui.IDialogPageProvider;
 * Copyright (C) 2010-2026 DBeaver Corp and others
                UIUtils.createDialogButton(
        createAdvancedSettingsGroup(addrGroup);
                } catch (DBException e1) {
            portText.addModifyListener(textListener);
            } else  if (pathText != null && pathText.isVisible()) {
            addControlToGroup(GROUP_URL, urlLabel);
        DataSourceDescriptor dataSource = (DataSourceDescriptor) site.getActiveDataSource();
        activated = true;
        portText.setText(text);
            new DriverPropertiesDialogPage(this)
        String paramCreate = CommonUtils.toString(site.getDriver().getDriverParameter(GenericConstants.PARAM_CREATE_URL_PARAM));
                @Override
                    (prop.equals(DBConstants.PROP_PORT) && CommonUtils.isEmptyTrimmed(portText.getText())) ||
            pathText.setText(""); //$NON-NLS-1$
            }
                if (gd instanceof GridData) {
        final String param = CommonUtils.toString(site.getDriver().getDriverParameter(GenericConstants.PARAM_CREATE_URL_PARAM));

    private void createEmbeddedDatabase() {
            DBPDriver driver = site.getActiveDataSource().getDriver();
/*


                dbLabel = UIUtils.createControlLabel(settingsGroup, dbTerm);

import org.jkiss.dbeaver.model.connection.DBPDriver;
            dbText.addModifyListener(textListener);
            addControlToGroup(GROUP_URL, urlText);
                serverLabel = UIUtils.createControlLabel(settingsGroup, dbTerm);
                    dbText.setText(CommonUtils.notEmpty(connectionInfo.getDatabaseName()));
            connectionInfo.setDatabaseName(dbText.getText().trim());
                log.error(e);
    @Override
        testDataSource.setName(databaseName);
            urlText.setEditable(true);
import org.eclipse.swt.events.SelectionEvent;
            if (serverText != null) {
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected Control createDatabasePropsPanel(Composite parent) {
                if (gd == null) {
                    serverText.setText(CommonUtils.notEmpty(connectionInfo.getServerName()));

        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
        // Save settings to update URL

