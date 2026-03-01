                             It includes:
                .align(SWT.BEGINNING, SWT.END)

        return navigatorSettingsCombo;
        }
            } else if (DBSSchema.class.isAssignableFrom(filterInfo.type)) {
            }
 */
        final GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);

            this.title = title;
import org.jkiss.dbeaver.ui.preferences.PrefPageConnectionTypes;
                CoreMessages.dialog_connection_wizard_final_filter_link_not_supported_tooltip,
            String baseName = newName;
        filters.add(new FilterInfo(DBSEntityAttribute.class, CoreMessages.dialog_connection_wizard_final_filter_attributes));
                if (dataSourceDescriptor.getDescription() != null) {
                        getShell(),
                filterInfo.link.setFont(getFont());
        }

import org.jkiss.dbeaver.registry.DataSourceDescriptor;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                    DataSourceDescriptor dataSource = getActiveDataSource();
        filterInfo.link.setEnabled(enable);
                    (features & DBPDataSourceProvider.FEATURE_CATALOGS) != 0 || isFeatureCatalogOnlyNeedToApply);
        }));
                // Changing connection types also changes defaults
                        if (curConType != null) {

        UIUtils.asyncExec(() -> {
        this(wizard);
import org.eclipse.swt.events.SelectionListener;
    public void createControl(Composite parent) {
        this.navigatorSettings = settings;
                if (settings.getDataSourceRegistry().findDataSourceByName(newName) != null) {
            connectionTypeCombo.addItem(ct);

        });
                    getContainer().updateButtons();

        if (connectionNameText != null) {
                ConnectionNameResolver.getConnectionVariables());
        if (description.isEmpty()) {
            });
                    if (!newName.isEmpty()) {
                    editNavigatorSettings(
        final String description = descriptionText.getText();
import org.jkiss.dbeaver.ui.BaseThemeSettings;
        if (folderSelector.isEmpty()) {
            filterInfo.link.setText("<a>" + filterInfo.title + "</a>");
        }
            showVirtualModelCheck = UIUtils.createCheckbox(
        }
            }
        @NotNull DBNBrowseSettings navigatorSettings,

                        UIUtils.showPreferencesFor(
                            \t- All table row colorings"""
            if (resultName.isBlank()) {
    private Composite filtersGroup;
                        if (dialog.open() == IDialogConstants.OK_ID) {
import java.util.ArrayList;
        }
                            dataSource.getConnectionConfiguration().getConnectionType(),
        NavigatorSettingsStorage settingsStorage,
                    descriptionText.setText(dataSourceDescriptor.getDescription());
                "Virtual model",
            UIIcon.CONFIGURATION,
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.ModelPreferences;
                        }
import org.jkiss.dbeaver.model.navigator.DBNBrowseSettings;
            filterInfo.filter = dataSourceDescriptor.getObjectFilter(filterInfo.type, null, true);
                        "Reset virtual model settings",
    ) {
    @Override
            descriptionText = UIUtils.createLabelText(miscGroup, CoreMessages.dialog_connection_wizard_description, null);
                        }
                            getShell(),
            new ConnectionTypeLabelProvider()
    }
    private DataSourceDescriptor dataSourceDescriptor;
        for (String ncPresetName : DataSourceNavigatorSettings.PRESETS.keySet()) {
                        DataSourceDescriptor originalDataSource = getWizard().getOriginalDataSource();
        } else {
import org.jkiss.dbeaver.ui.navigator.dialogs.EditObjectFilterDialog;
            ContentAssistUtils.installContentProposal(
    private final ConnectionWizard wizard;


        DataSourceDescriptor dsDescriptor = (DataSourceDescriptor) dataSource;
                    break;
                1,

            ConnectionPageSettings settings = wizard.getPageSettings();
                isPreset = true;
                Link initConfigLink = new Link(linkGroup, SWT.NONE);
                            .getString(ModelPreferences.DEFAULT_CONNECTION_NAME_PATTERN));
import org.eclipse.jface.layout.GridDataFactory;
        dsDescriptor.setModifyPermissions(this.accessRestrictions);
    public boolean isPageComplete()
//            UIUtils.createInfoLabel(vmGroup, "Virtual model is a logical database structure on the client side (not in a real database).\n" +
                            originalDataSource.persistConfiguration();
            for (final FilterInfo filterInfo : filters) {
    }
            filtersGroup = UIUtils.createTitledComposite(

                1);
            {

        this.curDataSourceFolder = dataSourceFolder;
 * General connection page (common for all connection types)
        } else {
        }
                resultName = GeneralUtils.variablePattern(DBPConnectionConfiguration.VAR_HOST_OR_DATABASE);
        for (DataSourceNavigatorSettings.Preset nsEntry : DataSourceNavigatorSettings.PRESETS.values()) {
    private Combo navigatorSettingsCombo;
    public void activatePage() {
            Composite miscGroup = UIUtils.createTitledComposite(
                }


    public static Combo createNavigatorSettingsCombo(
                            curConType = connectionTypeCombo.getItems().getFirst();
        dsDescriptor.setConnectionReadOnly(this.readOnlyConnection.getSelection());
    }

    {
            Composite linkGroup = UIUtils.createComposite(group, 1);
                null,
        }
    }

            filterInfo.link.setToolTipText(NLS.bind(
                }
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
        // Run in async to set custom background in dark theme
                settingsStorage.setNavigatorSettings(
                        new ConnectionPageShellCommands(dataSource),
                    )
    public static void updateNavigatorSettingsPreset(Combo navigatorSettingsCombo, DBNBrowseSettings navigatorSettings) {
        if (dataSourceDescriptor != null) {
        connectionTypeCombo.setLayoutData(gd);
import org.jkiss.dbeaver.utils.GeneralUtils;
        final String name;
        if (!isPreset) {
        navigatorSettingsCombo.select(0);
                    UIIcon.CONFIGURATION,
        );
                            filterInfo.filter = dialog.getFilter();
                        }
        }
        } else {

            navigatorSettings = dialog.getNavigatorSettings();
                        );
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
                    }));

                connectionNameText.setText(dataSourceDescriptor.getName());
        {
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
                        """
        connectionTypeCombo.select(DBPConnectionType.getDefaultConnectionType());
import org.jkiss.dbeaver.ui.controls.ConnectionFolderSelector;

            if (dataSourceDescriptor != null && !CommonUtils.isEmpty(dataSourceDescriptor.getName())) {
                        }
            navigatorSettingsCombo.select(navigatorSettingsCombo.getItemCount() - 1);
        setTitle(CoreMessages.dialog_connection_edit_wizard_general);
                DataSourceNavigatorSettings.Preset newSettings = DataSourceNavigatorSettings.PRESETS.get(navigatorSettingsCombo.getText());
    ConnectionPageGeneral(ConnectionWizard wizard) {
                        dataSourceDescriptor.getVirtualModel().resetData();
                enableFilter(filterInfo,
        loadConnectionTypes(connectionTypeCombo);
                shellConfigLink.setText("<a>" + CoreMessages.dialog_connection_edit_wizard_shell_cmd + "</a>");

                            originalDataSource.getVirtualModel().resetData();
            {
        String newName;
            name = generateConnectionName(getWizard().getPageSettings(), connectionNameText.getText());
        refsGroup.setLayoutData(gd);
                if (newSettings == null) {
            // Fill all the space so links are bottom-aligned
/**
 *
package org.jkiss.dbeaver.ui.dialogs.connection;
        }
                        new ConnectionPageInitialization(dataSource),
        final String title;
                DBWorkbench.getPlatform()
    private Text descriptionText;

        this.dataSourceDescriptor = dataSourceDescriptor;
        gd.widthHint = UIUtils.getFontHeight(navigatorSettingsCombo) * 20;
                    }
                    .getString(ModelPreferences.DEFAULT_CONNECTION_NAME_PATTERN));
                navigatorSettingsCombo.setText(nsEntry.getName());
                GridData.FILL_HORIZONTAL
                    ))));
        long features = getWizard().getSelectedDriver().getDataSourceProvider().getFeatures();

import org.jkiss.dbeaver.ui.controls.CSmartCombo;
            updateNavigatorSettingsPreset(navigatorSettingsCombo, navigatorSettings);
                // Custom - no changes
import org.jkiss.dbeaver.core.CoreMessages;
                if (dataSourceDescriptor == null || !connectionNameText.getText().equals(connectionName)) {
    @Override
    }
        // Find first preset that matches current connection settings
                    DataSourceDescriptor dataSource = getActiveDataSource();
            navigatorSettingsCombo.getShell(),
                            if (filterInfo.filter != null && !filterInfo.filter.isNotApplicable()) {
        for (DBPConnectionType ct : DataSourceProviderRegistry.getInstance().getConnectionTypes()) {
    private static DBNBrowseSettings editNavigatorSettings(

        return connectionTypeCombo;
            ctGroup,
                } else {
                    (features & DBPDataSourceProvider.FEATURE_SCHEMAS) != 0 && !isFeatureCatalogOnlyNeedToApply);
    static final String PAGE_NAME = ConnectionPageGeneral.class.getSimpleName();
            String connectionName = dataSourceDescriptor == null ? "" : dataSourceDescriptor.getName(); //$NON-NLS-1$
    @Override
                        dataSource
                ((GridLayout)ctGroup.getLayout()).numColumns++;

            );
            saveSettings(dataSourceDescriptor);
                refsGroup,
            readOnlyConnection.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

        final DBPConnectionConfiguration confConfig = dataSource.getConnectionConfiguration();
                GridData.VERTICAL_ALIGN_BEGINNING | GridData.HORIZONTAL_ALIGN_BEGINNING
        setDescription(CoreMessages.dialog_connection_wizard_final_description);
                securityGroup,
                            } else {
                vmGroup,
        if (enable) {
            newName = GeneralUtils.replaceVariables(resultName, resolver);
                            getWizard().getDataSourceRegistry(),
                settings.setHideVirtualModel(!showVirtualModelCheck.getSelection());
        } else {
                "Delete all colorings, transformers and virtual table constraints for all tables in this data source",
        }
        ConnectionPageSettings pageSettings = getWizard().getPageSettings();
    }
                            .getPreferenceStore()
import org.jkiss.code.NotNull;
        UIUtils.createControlLabel(composite, CoreMessages.dialog_connection_wizard_final_label_navigator_settings);

            }
        for (FilterInfo filterInfo : filters) {
    private Button readOnlyConnection;
                "Show virtual model editor",
            }

            newName = wizard.getSelectedDriver().getName();
        }
    private String generateConnectionName(ConnectionPageSettings settings, String usedName) {
            );
            CoreMessages.dialog_connection_wizard_final_label_navigator_settings_customize,
                            You are about to reset all virtual model configuration.
                        connectionNameText.setText(newName);
                        navigatorSettingsCombo,
    public void saveSettings(@NotNull DBPDataSourceContainer dataSource) {
        boolean isFeatureCatalogOnlyNeedToApply = (features & DBPDataSourceProvider.FEATURE_CATALOGS_ONLY) != 0;
 * Copyright (C) 2010-2026 DBeaver Corp and others
                new StringContentProposalProvider(
        }
import java.util.Arrays;

                if (CommonUtils.isEmpty(connectionNameText.getText()) || !connectionNameChanged) {
                dataSource.setObjectFilter(filterInfo.type, null, filterInfo.filter);
            // Default settings
                final DataSourceNavigatorSettings settings = new DataSourceNavigatorSettings(navigatorSettings);
    }
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
        dataSource.setName(name);
                filterInfo.title
            if (filterInfo.filter != null && !filterInfo.filter.isNotApplicable()) {
            );
                }));
        private FilterInfo(Class<?> type, String title) {

        }
                filterInfo.link.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        }
    private DataSourceDescriptor getActiveDataSource() {
        EditConnectionPermissionsDialog dialog = new EditConnectionPermissionsDialog(getShell(), accessRestrictions);
                    DBPConnectionType type = connectionTypeCombo.getItem(connectionTypeCombo.getSelectionIndex());
                shellConfigLink.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
            this.navigatorSettings = new DataSourceNavigatorSettings(getWizard().getSelectedNavigatorSettings());
                        getActiveDataSource().getConnectionConfiguration().getConnectionType(),
            SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY,
import org.jkiss.dbeaver.ui.contentassist.SmartTextContentAdapter;
        return navigatorSettings;
                connectionNameText,
    public void deactivatePage() {
                                filterInfo.link.setFont(getFont());

        UIUtils.setHelp(group, IHelpContextIds.CTX_CON_WIZARD_FINAL);
 *     http://www.apache.org/licenses/LICENSE-2.0
                            setConnectionType(connectionTypeCombo, curConType);
            Composite vmGroup = UIUtils.createTitledComposite(
                        if (!connectionTypeCombo.getItems().contains(curConType)) {
                securityGroup,

            //filterInfo.link.setText(NLS.bind(CoreMessages.dialog_connection_wizard_final_filter_link_not_supported_text, filterInfo.title));
        dsDescriptor.setNavigatorSettings(this.navigatorSettings);
    public static CSmartCombo<DBPConnectionType> createConnectionTypeCombo(Composite composite) {
        }
            } else {
                    filtersGroup,
            ));
    }


    private void editPermissions() {
                        DataSourceDescriptor dataSource = getActiveDataSource();
        for (FilterInfo filterInfo : filters) {
            resetVM.setEnabled(dataSourceDescriptor != null && dataSourceDescriptor.getVirtualModel().hasValuableData());
                break;
                initConfigLink.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
    private Button showVirtualModelCheck;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                }));
                !navigatorSettings.isHideVirtualModel(),
        setConnectionType(connectionTypeCombo, DBPConnectionType.getDefaultConnectionType());
        {
    @Override

                enableFilter(filterInfo,
 * You may obtain a copy of the License at
        }
        DBSObjectFilter filter;
                            true);

import org.eclipse.jface.dialogs.IDialogConstants;

        }
                    dialog.open();
                filterInfo.link = UIUtils.createLink(
import org.jkiss.dbeaver.model.DBPDataSourceProvider;
            );
                setNavigatorSettings(settings);
                readOnlyConnection.setSelection(dataSourceDescriptor.isConnectionReadOnly());
                        if (originalDataSource != null) {
                vmGroup,
        return newName;
                }
                // Get settings from data source descriptor

                                filterInfo.link.setFont(BaseThemeSettings.instance.baseFontBold);
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
                    combo.select(i);
        final GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
    @Override
    @Override
 * See the License for the specific language governing permissions and
        }
        @NotNull Combo navigatorSettingsCombo,
                        DBWorkbench.getPlatform()
    }

import org.jkiss.dbeaver.ui.UIIcon;
import org.eclipse.swt.widgets.*;
            readOnlyConnection.setSelection(false);
import org.jkiss.utils.CommonUtils;

            }

            if (filterInfo.filter != null) {
public class ConnectionPageGeneral extends ConnectionWizardPage implements NavigatorSettingsStorage {
        } else if (dataSourceDescriptor != null) {
    }
        this.wizard = wizard;
            this.navigatorSettings = new DataSourceNavigatorSettings(getWizard().getSelectedNavigatorSettings());

            }
                            PrefPageConnectionTypes.PAGE_ID);
            }));
                            filterInfo.filter != null ? filterInfo.filter : new DBSObjectFilter(),
        }
    private final List<FilterInfo> filters = new ArrayList<>();
                    if (UIUtils.confirmAction(
    }
            } else {
            } else {
            }
    private Text connectionNameText;
            UIUtils.setDefaultTextControlWidthHint(descriptionText);
import org.jkiss.dbeaver.model.DBPDataSourceFolder;
    @Override
                updateNavigatorSettingsPreset(navigatorSettingsCombo, settings);
    public static void setConnectionType(@NotNull CSmartCombo<DBPConnectionType> combo, @NotNull DBPConnectionType connectionType) {

                UIUtils.createPushButton(
                CoreMessages.pref_page_label_edit_permissions,
        UIUtils.createControlLabel(composite, CoreMessages.dialog_connection_wizard_final_label_connection_type);
 *
        if (connectionTypeCombo.getSelectionIndex() >= 0) {
                        settingsStorage.getNavigatorSettings(),
        Link link;
                        DBPConnectionType curConType = connectionTypeCombo.getSelectedItem();
                    newName = baseName + " " + i;
                final DBPConnectionConfiguration conConfig = dataSourceDescriptor.getConnectionConfiguration();
    }
        filters.add(new FilterInfo(DBSTable.class, CoreMessages.dialog_connection_wizard_final_filter_tables));
            }
//                "It also contains information about\nrow coloring and columns transformations", GridData.FILL_HORIZONTAL, 1);
            }
            name = dataSourceDescriptor.getName();
        }

        UIUtils.createPushButton(
        Composite group = UIUtils.createComposite(parent, 1);
            if (DBSCatalog.class.isAssignableFrom(filterInfo.type)) {
            Button resetVM = UIUtils.createDialogButton(

            updateNavigatorSettingsPreset(navigatorSettingsCombo, getNavigatorSettings());
        final Class<?> type;
    public void setDataSourceFolder(@Nullable DBPDataSourceFolder dataSourceFolder) {
                settingsStorage.setNavigatorSettings(newSettings.getSettings());
import java.util.Objects;
        filters.add(new FilterInfo(DBSSchema.class, CoreMessages.dialog_connection_wizard_final_filter_schemas_users));
        }
                CoreMessages.dialog_connection_wizard_final_group_filters,
import org.jkiss.dbeaver.model.connection.DBPConnectionType;
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
                    EditWizardPageDialog dialog = new EditWizardPageDialog(
    private boolean connectionNameChanged = false;
                            curConType,
    }
        }
import org.eclipse.swt.SWT;
        }
                miscGroup,
                group,

                CoreMessages.dialog_connection_wizard_final_filter_link_tooltip,
                            \t- All column transformers
                        ConnectionWizard.PROP_CONNECTION_TYPE,
                filterInfo.link.setFont(BaseThemeSettings.instance.baseFontBold);
            connectionNameText.addModifyListener(e -> {

import org.jkiss.code.Nullable;
                    ctGroup,
                CoreMessages.pref_page_ui_general_group_general,
                            }
                        dataSourceDescriptor
            navigatorSettings = new DataSourceNavigatorSettings(getWizard().getSelectedNavigatorSettings());
            dataSource.setFolder(folderSelector.getFolder());
        if (navigatorSettings == null) {
                            \t- All virtual constraints and foreign keys
                        .map(GeneralUtils::variablePattern).toArray(String[]::new))

                final DBPConnectionType item = combo.getItem(i);
}

                2,

        Composite composite,
    private DBPDataSourceFolder curDataSourceFolder;
        DBPDataSourceContainer dataSourceDescriptor

        {
    private CSmartCombo<DBPConnectionType> connectionTypeCombo;
            dsDescriptor.setDescription(description);
                    Arrays.stream(ConnectionNameResolver.getConnectionVariables())
import org.eclipse.swt.layout.GridData;
                    CoreMessages.dialog_connection_wizard_final_label_connection_types_edit,
    public void dispose() {
        if (connectionNameChanged) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
            Composite securityGroup = UIUtils.createTitledComposite(
            dataSourceDescriptor);
    public void setNavigatorSettings(DBNBrowseSettings settings) {
        {
        navigatorSettingsCombo.setLayoutData(gd);
                initConfigLink.setText("<a>" + CoreMessages.dialog_connection_wizard_connection_init_description + "</a>");
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        if (this.navigatorSettings == null) {
 */
                        EditObjectFilterDialog dialog = new EditObjectFilterDialog(

                connectionTypeCombo.addSelectionListener(SelectionListener.widgetSelectedAdapter(selectionEvent -> {
            navigatorSettingsCombo.add(ncPresetName);
            showVirtualModelCheck.setSelection(!settings.isHideVirtualModel());
                refsGroup,
            if (!Objects.equals(newConnectionType, confConfig.getConnectionType())) {
                .grab(true, true)
                    connectionNameChanged = true;

    }
import org.jkiss.dbeaver.registry.DataSourceNavigatorSettings;
                }
                .applyTo(linkGroup);
        for (FilterInfo filterInfo : filters) {
        if (this.navigatorSettings == null) {
                            ConnectionWizard.PROP_CONNECTION_TYPE,

            }
                }
        }
    private boolean activated = false;
            folderSelector.setFolder(curDataSourceFolder);
                Link shellConfigLink = new Link(linkGroup, SWT.NONE);
        if (getWizard().isNew()) {
            DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
        if (dataSourceDescriptor != null) {
                            curConType
            null,
            final ConnectionNameResolver resolver = new ConnectionNameResolver(dataSource, connectionInfo, dataSourceDescriptor);
                        type
 * distributed under the License is distributed on an "AS IS" BASIS,
                CommonUtils.toString(connectionName)
        if (settings != null) {
            for (int i = 2; ; i++) {
                1,
import org.jkiss.dbeaver.ui.contentassist.StringContentProposalProvider;
            DBPConnectionType newConnectionType = connectionTypeCombo.getSelectedItem();
    }
    @NotNull
            showVirtualModelCheck.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
                if (item.getId().equals(connectionType.getId())) {
                    throw new IllegalStateException("Invalid preset name: " + navigatorSettingsCombo.getText());
        navigatorSettingsCombo.addSelectionListener(SelectionListener.widgetSelectedAdapter(selectionEvent -> {
                }
            GridDataFactory.fillDefaults()
        Composite ctGroup = UIUtils.createComposite(composite, 2);
                SelectionListener.widgetSelectedAdapter(selectionEvent -> editPermissions()));

                    String newName = generateConnectionName(settings,
            dsDescriptor.setDescription(null);
                CoreMessages.dialog_connection_wizard_final_group_security,
        Combo navigatorSettingsCombo = new Combo(ctGroup, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
                CoreMessages.dialog_connection_wizard_final_checkbox_connection_readonly,
            // Filters
                    null,
                CoreMessages.dialog_connection_wizard_final_label_connection_name,
    private List<DBPDataSourcePermission> accessRestrictions;
        gd.widthHint = UIUtils.getFontHeight(connectionTypeCombo) * 20;
            UIUtils.setDefaultTextControlWidthHint(connectionNameText);

        if (dataSourceDescriptor != null && !activated) {
            readOnlyConnection = UIUtils.createCheckbox(

 * Unless required by applicable law or agreed to in writing, software
            return;
        return navigatorSettings;
    }
                    }));
            // Filters
            connectionNameText = UIUtils.createLabelText(
    }
                SelectionListener.widgetSelectedAdapter(e -> {
 * DBeaver - Universal Database Manager
        EditConnectionNavigatorSettingsDialog dialog = new EditConnectionNavigatorSettingsDialog(
                navigatorSettingsCombo = createNavigatorSettingsCombo(miscGroup, this, dataSourceDescriptor);
        @Nullable DBPDataSourceContainer dataSourceDescriptor) {
        if (showVirtualModelCheck != null) {
                        getWizard(),
        filtersGroup.layout();
                            ctGroup.getShell(),
                GridData.VERTICAL_ALIGN_BEGINNING | GridData.HORIZONTAL_ALIGN_BEGINNING

                        loadConnectionTypes(connectionTypeCombo);
        CSmartCombo<DBPConnectionType> connectionTypeCombo = new CSmartCombo<>(
                shellConfigLink.addSelectionListener(SelectionListener.widgetSelectedAdapter(selectionEvent -> {
        folderSelector.loadConnectionFolders(getWizard().getSelectedProject());
            accessRestrictions = dialog.getAccessRestrictions();
/*
        Composite ctGroup = UIUtils.createComposite(composite, 1);
    ConnectionPageGeneral(ConnectionWizard wizard, DataSourceDescriptor dataSourceDescriptor) {
        super.dispose();
import org.eclipse.osgi.util.NLS;

        return true;

                1, GridData.VERTICAL_ALIGN_BEGINNING | GridData.HORIZONTAL_ALIGN_BEGINNING);
    public static void loadConnectionTypes(CSmartCombo <DBPConnectionType> connectionTypeCombo) {
    private ConnectionFolderSelector folderSelector;
                    return;
        }
    private DBNBrowseSettings navigatorSettings;
                    "<a>" + filterInfo.title + "</a>",
        }
                    SelectionListener.widgetSelectedAdapter(selectionEvent -> {
            }
    @Override
            // Security

                enableFilter(filterInfo, !isFeatureCatalogOnlyNeedToApply);
        if (dialog.open() == IDialogConstants.OK_ID) {

                filterInfo.title,
            {
                    );
        String resultName = usedName;
                refsGroup,

            UIUtils.createDialogButton(
    }
    private void enableFilter(FilterInfo filterInfo, boolean enable) {
                folderSelector.setFolder(dataSourceDescriptor.getFolder());

import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;

        return pageSettings == null ? wizard.getActiveDataSource() : pageSettings.getActiveDataSource();
            // No changes anyway

            DataSourceDescriptor dataSource = settings.getActiveDataSource();

        initializeDialogUnits(parent);
    private static class FilterInfo {
            name = generateConnectionName(getWizard().getPageSettings(),
            if (navigatorSettingsCombo.getSelectionIndex() == navigatorSettingsCombo.getItemCount() - 1) {
        }
                    .getPreferenceStore()
        if (dialog.open() == IDialogConstants.OK_ID) {
            ctGroup,
    }
            }
        filters.add(new FilterInfo(DBSCatalog.class, CoreMessages.dialog_connection_wizard_final_filter_catalogs));
            {
                "Show virtual model pages in table editor",
import org.jkiss.dbeaver.model.DBPDataSourcePermission;
            }
            }
                new SmartTextContentAdapter(),
                    SelectionListener.widgetSelectedAdapter(selectionEvent -> {
                dataSourceDescriptor != null && dataSourceDescriptor.isConnectionReadOnly());
            dataSource.setFolder(curDataSourceFolder);
            } else {
                    connectionNameChanged = false;
        boolean isPreset = false;
            navigatorSettings,
                        dataSource);
 * limitations under the License.
                    ) {
                    }
 * you may not use this file except in compliance with the License.
            ));
            SelectionListener.widgetSelectedAdapter(e ->
            this.type = type;
                setConnectionType(connectionTypeCombo, conConfig.getConnectionType());
                connectionTypeCombo = createConnectionTypeCombo(miscGroup);
        connectionTypeCombo.removeAll();
                            filterInfo.title,
                    );
 *
                confConfig.setConnectionType(newConnectionType);
                getWizard().getSelectedDriver().getName()
            if (navigatorSettings.equals(nsEntry.getSettings())) {




                initConfigLink.addSelectionListener(SelectionListener.widgetSelectedAdapter(selectionEvent -> {
                    dialog.open();

import org.jkiss.dbeaver.ui.UIUtils;

import org.eclipse.swt.layout.GridLayout;
                Composite ctGroup = connectionTypeCombo.getParent();
                    getWizard().firePropertyChangeEvent(


        super(PAGE_NAME);
                "Reset configuration",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else {
                activated = true;
                    EditWizardPageDialog dialog = new EditWizardPageDialog(
            filterInfo.link.setToolTipText(NLS.bind(
                updateNavigatorSettingsPreset(navigatorSettingsCombo, dataSourceDescriptor.getNavigatorSettings());
        setControl(group);
    public DBNBrowseSettings getNavigatorSettings() {
            );
            UIUtils.setContentProposalToolTip(connectionNameText, "Connection name patterns",
        } else {
        Composite refsGroup = UIUtils.createComposite(group, 3);
import java.util.List;

                        getWizard().firePropertyChangeEvent(
    }
            folderSelector = new ConnectionFolderSelector(miscGroup);
    }
        this.accessRestrictions = dataSourceDescriptor.getModifyPermission();
                        getWizard(),
                }));
import org.jkiss.dbeaver.ui.IHelpContextIds;
        }
            for (int i = 0; i < combo.getItemCount(); i++) {
            }
            setConnectionType(connectionTypeCombo, DBPConnectionType.getDefaultConnectionType());
                }));
