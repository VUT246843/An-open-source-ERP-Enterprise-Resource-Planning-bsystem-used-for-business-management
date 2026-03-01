    }

            }
import org.eclipse.swt.layout.GridLayout;
        } else {
    @Nullable
    private void updateConnectionModeControlsVisibility(@NotNull Collection<String> nonUrlPropGroups, boolean enable) {
import org.jkiss.dbeaver.model.connection.DBPDriverSubstitutionDescriptor;
import org.eclipse.swt.widgets.*;
    protected void createConnectionModeSwitcher(Composite parent, SelectionListener typeSwitcher) {
                for (Control control : controls) {
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
            databaseDocumentationInfoLabel.setVisible(
    private Combo driverSubstitutionCombo;

            final DBPDriverSubstitutionDescriptor driverSubstitution = dataSource.getDriverSubstitution();
                    }));
            });

    protected boolean isCustomURL() {
        for (String groupName : nonUrlPropGroups) {

        if (!isCustomURL()) {

        }
                        UIUtils.setControlVisible(control, enable);
    }
        Label cnnTypeLabel = UIUtils.createControlLabel(parent, UIConnectionMessages.dialog_connection_mode_label);
                SelectionListener.widgetSelectedAdapter(e -> site.openSettingsPage("ConnectionPageGeneral")));
                DBPConnectionConfiguration.INTERNAL_CONNECT_VARIABLES,
        Set<Control> controls = propGroupMap
    protected static final List<String> GROUP_CONNECTION_ARR = List.of(GROUP_CONNECTION);
                shc.layout(true, true);
 */
                    control.setEnabled(enable);
            UIUtils.createControlLabel(parent, label);
            } else {
        if (site.isNew()) {
            advSettingsButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
                site.getProject(),
            if (DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_DRIVER_MANAGER)) {
 */
            if (driverSubstitution != null) {
        }
        if (licenseButton != null) {
            UIUtils.createFormPlaceholder(panel, 2, 1);
                site.getDriver().getConnectionURL(connectionInfo));
            }
            driverSubstitutionCombo.add("JDBC");
            }
    }
    }
                    = DataSourceProviderRegistry.getInstance().getAllDriverSubstitutions();

            driverSubstitutionCombo = UIUtils.createLabelCombo(
    }
            }
            driverSubstitutionCombo.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
            if (shellControl instanceof Composite shc) {
 * limitations under the License.

        updateConnectionModeControlsVisibility(nonUrlPropGroups, !useUrl);
import org.jkiss.dbeaver.utils.HelpUtils;

        super.dispose();
        if (supportsDriverSubstitution()) {
                final int index = driverSubstitutionCombo.getSelectionIndex();
                        String driverLicense = site.getDriver().getLicense();
    protected Text driverText;
        panel.setLayoutData(gd);
 * distributed under the License is distributed on an "AS IS" BASIS,

        UIUtils.createLabelSeparator(panel, SWT.HORIZONTAL, 5);
            driverLabel.setText(UIConnectionMessages.dialog_connection_driver);
            }
            }
import org.jkiss.code.Nullable;

            UIUtils.createEmptyLabel(panel, 1, 1);
    public IDataSourceConnectionEditorSite getSite() {
        UIServiceSecurity serviceSecurity = DBWorkbench.getService(UIServiceSecurity.class);
        formDatabaseDocumentationInfoLabel(panel);
        if (passHidden) {
    }
    }
                licenseButton = UIUtils.createDialogButton(driverInfoComp, UIConnectionMessages.dialog_edit_driver_text_driver_license,
import org.jkiss.dbeaver.ModelPreferences;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                final DBPDriverSubstitutionDescriptor driverSubstitution = index > 0 ? driverSubstitutions[index - 1] : null;

            connectionInfo.setUrl(
import org.eclipse.jface.layout.GridDataFactory;
                    }
    public void dispose() {

        if (driver != null && driverText != null) {
        setupConnectionModeSelection(useUrl, Collections.singleton(GROUP_URL), nonUrlPropGroups);

    }
            createDriverSubstitutionControls(modeGroup);
 *

            }));
                variablesHintLabel.setResolver(null);
        }
        return site;
        Collections.addAll(controls, list);
                true))
                SWT.DROP_DOWN | SWT.READ_ONLY
import java.util.*;

                savePasswordCheck.setSelection(dataSource.isSavePassword());

    }
                UIConnectionMessages.dialog_connection_edit_wizard_conn_conf_general_link,
                UIConnectionMessages.dialog_connection_edit_connection_settings_variables_hint_label,
        DataSourceDescriptor dataSource = (DataSourceDescriptor) getSite().getActiveDataSource();
                driverButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
        }
                "Driver type",
                return;

                "Enter project password",
            //gd.widthHint = 200;

import org.jkiss.dbeaver.ui.dialogs.IConnectionWizard;
    protected static final List<String> GROUP_URL_ARR = List.of(GROUP_URL);
 * you may not use this file except in compliance with the License.
        DataSourceDescriptor dataSource = (DataSourceDescriptor)getSite().getActiveDataSource();
        Composite ph = UIUtils.createPlaceholder(parent, 1);
    protected final Map<String, Set<Control>> propGroupMap = new HashMap<>();
        return passwordText;
 * See the License for the specific language governing permissions and
        }
        }
    private Button licenseButton;
                substitutionGroup,
        if (driverSubstitutionCombo != null) {
            if (substitutionIndex > 0) {
import org.jkiss.dbeaver.model.connection.DataSourceVariableResolver;
    // Driver name
    @Override
    protected Text createPasswordText(Composite parent, String label) {
        createPasswordControls(parent, 1);
            gd.horizontalSpan = 2;
    }
        }
                final IConnectionWizard wizard = (IConnectionWizard) site.getWizard();
    }

        if (label != null) {
                            updateDriverInfo(site.getDriver());
    }

import org.eclipse.swt.events.SelectionListener;
                dataSource.setDriverSubstitution(substitutions[substitutionIndex - 1]);
            }

import org.eclipse.jface.resource.ImageDescriptor;
        }
                licenseButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
        passwordText = new Text(ph, SWT.BORDER | SWT.PASSWORD);
        @NotNull Collection<String> nonUrlPropGroups
        if (supportsPasswordView) {
            driverLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

        gd.grabExcessVerticalSpace = true;
                driverSubstitutionCombo.select(0);
        if (databaseDocumentationInfoLabel != null) {
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
        }
        if (variablesHintLabel != null) {
                        if (CommonUtils.isEmpty(driverLicense)) {
                false);
    public void saveSettings(DBPDataSourceContainer dataSource)

            showPasswordLabel.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> showPasswordText(serviceSecurity)));
    @Override
                ),

 *
                }
    private VariablesHintLabel variablesHintLabel;

                ShellUtils.launchProgram(HelpUtils.getHelpExternalReference(databaseDocumentationSuffixURL));

        return typeURLRadio != null && typeURLRadio.getSelection();
        DBPDataSourceContainer dataSourceContainer = site.getActiveDataSource();
                }));
    }
            .computeIfAbsent(group, k -> new HashSet<>());
            }
 * Unless required by applicable law or agreed to in writing, software

                UIUtils.createEmptyLabel(driverInfoComp, 1, 1);
                    SelectionListener.widgetSelectedAdapter(e -> {
                    = DataSourceProviderRegistry.getInstance().getAllDriverSubstitutions();
            curImageDescriptor = desc;
import org.eclipse.jface.dialogs.DialogPage;


            () -> {

 * DBeaver - Universal Database Manager

            variablesHintLabel = new VariablesHintLabel(panel,
                    dataSource.getConnectionConfiguration()));
            passwordText,
                variablesHintLabel.setResolver(new DataSourceVariableResolver(dataSource,
            Control shellControl = getControl();
                NLS.bind(
            for (DBPDriverSubstitutionDescriptor descriptor : driverSubstitutions) {
    }
import org.jkiss.dbeaver.runtime.ui.UIServiceSecurity;
        databaseDocumentationInfoLabel.setVisible(CommonUtils.isNotEmpty(
import org.jkiss.utils.ArrayUtils;
                            driverLicense = "N/A";
        if (hSpan > 1) {
    }
    }

        gd.horizontalSpan = ((GridLayout) parent.getLayout()).numColumns;
                final DBPDriverSubstitutionDescriptor[] substitutions
                UIConnectionMessages.dialog_connection_edit_connection_settings_variables_hint_label,
    }
            userManagementToolbar = new ToolBar(panel, SWT.HORIZONTAL);
                    "Replaces the current driver ({0}) with the selected one.\nProvides all functionality of the original driver but driven by the substituting driver.",
    protected Button typeManualRadio;
    protected Image createImage(String imageFilePath) {


    ) {
        this.site = site;
            if (dataSource != null) {
        }

            {
    }
    {
                    if (control instanceof Text text) {
        boolean useUrl,
                dataSource.setDriverSubstitution(null);
        addControlToGroup(GROUP_CONNECTION_MODE, cnnTypeLabel);
    private void showPasswordText(UIServiceSecurity serviceSecurity) {
        updateConnectionModeControlsVisibility(urlPropGroups, useUrl);
        if (DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.CONNECT_USE_ENV_VARS)) {
        if (driver != null && databaseDocumentationInfoLabel != null) {
            site.getDriver().getDatabaseDocumentationSuffixURL()));
    protected static final String GROUP_CONNECTION = "connection"; //$NON-NLS-1$
        }
        if (savePasswordCheck != null) {

import org.eclipse.osgi.util.NLS;
    }
import org.jkiss.code.NotNull;
            Set<Control> controls = propGroupMap.get(groupName);
        return false;
        return imageDescriptor == null ? null : imageDescriptor.createImage();
        panel.setLayoutData(gd);
        Composite panel = UIUtils.createComposite(parent, supportsPasswordView ? 2 : 1);
        modeGroup.setLayoutData(GridDataFactory.fillDefaults().span(3, 1).create());
        urlText.setText(dataSourceContainer.getDriver().getConnectionURL(site.getActiveDataSource().getConnectionConfiguration()));
    }
            }
            driverText.setLayoutData(gd);

        GridData gd = new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_END);

            descriptor.setSavePassword(savePasswordCheck.getSelection());
                if (wizard != null) {
        }
package org.jkiss.dbeaver.ui.dialogs.connection;
        @NotNull Text urlText,
    public void loadSettings() {
                        licenseDialog.setViewMode(true);
    @Nullable
public abstract class ConnectionPageAbstract extends DialogPage implements IDataSourceConnectionEditor {
        cnnTypeLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
/**
                    SelectionListener.widgetSelectedAdapter(e -> {
            } else {
            ToolItem showPasswordLabel = new ToolItem(userManagementToolbar, SWT.NONE);
    @Nullable
    @Override
    @Override
    protected static final String GROUP_URL = "url"; //$NON-NLS-1$

            }
    protected Text passwordText;

            driverText.setText(CommonUtils.toString(driver.getFullName()));
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
            UIConnectionMessages.dialog_connection_wizard_final_checkbox_save_password,
    protected void setupConnectionModeSelection(
import org.eclipse.jface.resource.ResourceLocator;
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
import org.jkiss.dbeaver.model.connection.DBPDriver;
            //gd.grabExcessHorizontalSpace = true;
    protected boolean isHideNonApplicableControls() {
    protected void createDriverPanel(Composite parent) {
            {

    protected void setupConnectionModeSelection(
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
            if (dataSource != null) {
import org.eclipse.swt.SWT;
                        AcceptLicenseDialog licenseDialog = new AcceptLicenseDialog(getShell(), site.getDriver().getFullName(), driverLicense);
        addControlToGroup(GROUP_URL, urlText);
                    if (isHideNonApplicableControls()) {
            UIUtils.setInfoLinkText(databaseDocumentationInfoLabel, site.getDriver().getFullName() + " ");
        ImageDescriptor imageDescriptor = ResourceLocator.imageDescriptorFromBundle(getClass(), imageFilePath).orElse(null);
import org.jkiss.dbeaver.ui.controls.VariablesHintLabel;
        @NotNull Collection<String> urlPropGroups,
                    wizard.firePropertyChangeEvent(PROP_DRIVER_SUBSTITUTION, wizard.getDriverSubstitution(), driverSubstitution);
        }
                        licenseDialog.open();
        savePasswordCheck.setToolTipText(UIConnectionMessages.dialog_connection_wizard_final_checkbox_save_password);
        if (curImageDescriptor != desc) {
            }
        boolean passHidden = (passwordText.getStyle() & SWT.PASSWORD) == SWT.PASSWORD;
    protected IDataSourceConnectionEditorSite site;
    protected Button savePasswordCheck;
        @NotNull Collection<String> nonUrlPropGroups
    protected void createDriverSubstitutionControls(@NotNull Composite parent) {
            showPasswordLabel.setToolTipText("Show password on screen");
                        }
        //savePasswordCheck.setLayoutData(gd);
            showPasswordLabel.setImage(DBeaverIcons.getImage(UIIcon.SHOW_ALL_DETAILS));
            UIUtils.setControlVisible(licenseButton, driver != null && !CommonUtils.isEmpty(driver.getLicense()));
            gd.horizontalSpan = 5;

import org.jkiss.dbeaver.model.rm.RMConstants;
                CommonUtils.isNotEmpty(driver.getDatabaseDocumentationSuffixURL()));
    private ImageDescriptor curImageDescriptor;
        passwordText = UIUtils.recreateTextControl(
    }
import org.jkiss.dbeaver.ui.dialogs.AcceptLicenseDialog;
            gd.horizontalSpan = hSpan;
        ph.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.utils.CommonUtils;
    protected void createPasswordControls(Composite parent) {
            site.getDriver().getFullName() + " ",
    {
            );

            if (!descriptor.isSavePassword()) {
        }
    protected void createPasswordControls(Composite parent, int hSpan) {
            gd = new GridData(GridData.FILL_HORIZONTAL);
            ((GridData) variablesHintLabel.getInfoLabel().getLayoutData()).horizontalSpan = 2;
    protected boolean supportsDriverSubstitution() {

            if (!serviceSecurity.validatePassword(
        if (typeManualRadio != null) typeManualRadio.setSelection(!useUrl);

    }
        Composite modeGroup = UIUtils.createComposite(parent, 3);

    protected void updateDriverInfo(DBPDriver driver) {
            UIConnectionMessages.dialog_connection_database_documentation);

        if (driverSubstitutions.length > 0) {
        if (driverSubstitutionCombo != null) {
        }
                "Enter project password to unlock connection password view",
 * ConnectionPageAbstract

    protected Button typeURLRadio;
            passHidden ? SWT.BORDER : SWT.BORDER | SWT.PASSWORD
import java.util.List;

                        if (site.openDriverEditor()) {
    }

            final int substitutionIndex = driverSubstitutionCombo.getSelectionIndex();
            Composite driverInfoComp = UIUtils.createComposite(panel, 5);
    @NotNull
import org.jkiss.dbeaver.ui.*;

                descriptor.resetPassword();

        databaseDocumentationInfoLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
    public void setSite(@NotNull IDataSourceConnectionEditorSite site)
                Button driverButton = UIUtils.createDialogButton(driverInfoComp, UIConnectionMessages.dialog_connection_edit_driver_button,
        return true;
        if (savePasswordCheck != null) {
import org.eclipse.swt.graphics.Image;
        databaseDocumentationInfoLabel.setToolTipText(
/*
        addControlToGroup(GROUP_CONNECTION_MODE, modeGroup);
            panel,
                        text.setEditable(enable);
 * You may obtain a copy of the License at
    ) {
import org.eclipse.swt.layout.GridData;
                driverSubstitutionCombo.add(descriptor.getName());
    @Override
            } else {
        typeURLRadio = UIUtils.createRadioButton(modeGroup, UIConnectionMessages.dialog_connection_url_label, true, typeSwitcher);
                final DBPDriverSubstitutionDescriptor[] substitutions
                    site.getActiveDataSource().getDriver().getFullName()
        }
        }
        boolean useUrl,
            driverText = new Text(driverInfoComp, SWT.READ_ONLY);
            dataSource == null || dataSource.isSavePassword());
            final Composite substitutionGroup = UIUtils.createComposite(parent, 2);

    protected void addControlToGroup(@NotNull String group, @NotNull Control ... list) {
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                }
        passwordText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    public void setImageDescriptor(ImageDescriptor desc) {
    protected ToolBar userManagementToolbar;
        if (isHideNonApplicableControls()) {
        );
        Composite panel = UIUtils.createComposite(parent, 5);
        saveConnectionURL(dataSource.getConnectionConfiguration());
            substitutionGroup.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).align(SWT.END, SWT.BEGINNING).create());
            Button advSettingsButton = UIUtils.createDialogButton(panel,


        boolean supportsPasswordView = serviceSecurity != null;
        {

        gd.grabExcessHorizontalSpace = true;
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
            if (controls != null) {
        if (typeURLRadio != null) typeURLRadio.setSelection(useUrl);
        // We don't support password preview in standard project secure storage (as we need password encryption)

            } else {
            super.setImageDescriptor(desc);
 *
                    }
    {
        typeManualRadio = UIUtils.createRadioButton(modeGroup, UIConnectionMessages.dialog_connection_host_label, false, typeSwitcher);
 *     http://www.apache.org/licenses/LICENSE-2.0
}
    private void formDatabaseDocumentationInfoLabel(Composite panel) {
            gd = new GridData(GridData.FILL_HORIZONTAL);
            Label driverLabel = new Label(driverInfoComp, SWT.NONE);
    protected static final String GROUP_CONNECTION_MODE = "connectionMode"; //$NON-NLS-1$
            } else {

    private Control databaseDocumentationInfoLabel;
        DBPDriver driver = site.getDriver();
                savePasswordCheck.setSelection(true);
    }
            driverInfoComp.setLayoutData(gd);
        }
    public static final String PROP_DRIVER_SUBSTITUTION = "driver-substitution";
                        }
            DataSourceDescriptor descriptor = (DataSourceDescriptor) dataSource;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

    protected void saveConnectionURL(DBPConnectionConfiguration connectionInfo)
        databaseDocumentationInfoLabel = UIUtils.createInfoLabel(
                String databaseDocumentationSuffixURL = site.getDriver().getDatabaseDocumentationSuffixURL();
        }
        savePasswordCheck = UIUtils.createCheckbox(panel,
        final DBPDriverSubstitutionDescriptor[] driverSubstitutions = DataSourceProviderRegistry.getInstance().getAllDriverSubstitutions();

                driverSubstitutionCombo.select(ArrayUtils.indexOf(substitutions, driverSubstitution) + 1);
    protected void updateUrlFromSettings(Text urlText) {
        }
        } else {
