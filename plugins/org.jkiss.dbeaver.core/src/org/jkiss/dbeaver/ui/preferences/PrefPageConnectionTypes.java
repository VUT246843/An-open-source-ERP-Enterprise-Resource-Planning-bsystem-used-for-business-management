                placeholder,
    }
                            for (int i = 0; i < count; i++) {
                CoreMessages.pref_page_connection_types_label_auto_commit_by_default,
            autoCloseTransactionsTtlText.setToolTipText(CoreMessages.pref_page_connection_types_label_auto_close_ttl_tip);
    public void setElement(IAdaptable element) {
    private void addTypeToTable(DBPConnectionType source, DBPConnectionType connectionType) {
    protected Control createPreferenceContent(@NotNull Composite parent) {
                    getSelectedType().setAutoCloseTransactions(autoCloseTransactionsCheck.getSelection());

            });
                2);
    }
                @Override

                                getSelectedType().setModifyPermissions(dialog.getAccessRestrictions());
        }
 * you may not use this file except in compliance with the License.
            });
    @Override
                        newType.setColor("255,255,255");
        autoCloseConnectionsTtlText.setText(String.valueOf(connectionType.getCloseIdleConnectionPeriod()));
import org.jkiss.dbeaver.model.app.DBPProject;

 *
                            cnnCfg.setConnectionType(DBPConnectionType.DEFAULT_TYPE);
            }

                registry.addConnectionType(changed);
                    getSelectedType().setConfirmDataChange(confirmDataChangeCheck.getSelection());
                        public void widgetSelected(SelectionEvent e) {
    private ToolItem deleteButton;
                pickerButton.addSelectionListener(new SelectionAdapter() {
                CoreMessages.dialog_connection_wizard_final_label_close_idle_connections_tooltip,
                    getSelectedType().setSmartCommitRecover(smartCommitRecoverCheck.getSelection());
                                if (type.getName().equals(name)) {
                changedSet.add(source);
                        if (index > 0)
        } else if (!smartCommitRecoverCheck.isEnabled()) {
                CoreMessages.pref_page_connection_types_label_confirm_data_change_tip,
                updateTableInfo();
package org.jkiss.dbeaver.ui.preferences;
public class PrefPageConnectionTypes extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
                source.setCloseIdleTransactionPeriod(changed.getCloseIdleTransactionPeriod());
                    @Override
            dsReg.notifyDataSourceListeners(new DBPEvent(DBPEvent.Action.OBJECT_UPDATE, null, dsReg));

                @Override
import org.jkiss.dbeaver.model.rm.RMConstants;
            //item.setBackground(0, connectionColor);
                break;
import org.jkiss.dbeaver.ui.internal.UIMessages;
            if (!changedInfo.values().contains(type)) {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
                item.setText(0, connectionType.getName());
                for (DBPConnectionType type : changedInfo.keySet()) {
            }
                true,
        for (DBPConnectionType ct : DBPConnectionType.SYSTEM_TYPES) {
            autoCloseTransactionsCheck.addSelectionListener(new SelectionAdapter() {
        confirmDataChangeCheck.setSelection(connectionType.isConfirmDataChange());
                }
                hasChanges = true;
import java.util.*;
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.connectionTypes"; //$NON-NLS-1$

        typeDescription.setText(connectionType.getDescription());
                toRemove.add(type);
        DBPConnectionType connectionType = getSelectedType();
            if (canEdit) {
                public void widgetSelected(SelectionEvent e) {
                CoreMessages.pref_page_connection_types_label_confirm_sql_execution_tip,
    }
                deleteButton.setImage(DBeaverIcons.getImage(UIIcon.ROW_DELETE));
        super.performDefaults();
            typeTable.addSelectionListener(new SelectionAdapter() {
                hasChanges = true;
            }
                }
                Button editPermissionsButton = UIUtils.createDialogButton(
                        typeTable.showSelection();
            });
                            updateTableInfo();

                1);
                source.setAutocommit(changed.isAutocommit());
            typeId.addModifyListener(e -> {
            if (ct.getId().equals(type.getId())) {
            UIUtils.createTableColumn(typeTable, SWT.LEFT, CoreMessages.pref_page_connection_types_label_table_column_description);
            typeName.addModifyListener(e -> {
                    break;
            autoCloseTransactionsCheck.setEnabled(false);
        confirmCheck.setSelection(connectionType.isConfirmExecute());
        typeId.setText(connectionType.getId());
                    }
                    getSelectedType().setAutoCloseConnections(autoCloseConnectionsCheck.getSelection());
            colorPicker.setColorValue(connectionTypeColor.getRGB());
            autoCloseConnectionsTtlText.addModifyListener(e ->
        }
                            }
        }
    }
                    new SelectionAdapter() {
        }
                    DBPConnectionConfiguration cnnCfg = ds.getConnectionConfiguration();
            boolean hasChanges = false;
                if (typeTable.getItem(i).getData().equals(selectedType)) {
                        DBPConnectionType newType = new DBPConnectionType(DBPConnectionType.DEFAULT_TYPE);
        if (deleteButton != null) {
    private void updateTableInfo() {
                });
                source.setAutoCloseConnections(changed.isAutoCloseConnections());
                                    hasName = true;
                @Override
    public boolean performOk() {
                        break;
    }
 * You may obtain a copy of the License at
}
        {
                colorPicker.addListener(event -> {
                public void widgetSelected(SelectionEvent e) {
                //colorPicker.setColorValue(connectionColor.getRGB());
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.swt.events.ControlEvent;
        typeId.setEnabled(false);
            autoCloseConnectionsTtlText.setToolTipText(CoreMessages.pref_page_connection_types_label_auto_close_ttl_tip);
            autoCloseConnectionsCheck.addSelectionListener(new SelectionAdapter() {
                            }
                                getShell(), getSelectedType().getModifyPermission()
                        if (toRemove.contains(cnnType)) {
                typeTable.removeControlListener(this);
        Set<DBPConnectionType> changedSet = new HashSet<>();
            autoCloseTransactionsTtlText.setEnabled(false);
                        break;

                2,
        }
            typeName.setEnabled(false);
                    public void widgetSelected(SelectionEvent e)
import org.eclipse.jface.preference.ColorSelector;
                        projectRegistry.flushConfig();
                            getShell(),
                        typeTable.select(index);
        }
            });
import org.jkiss.dbeaver.utils.HelpUtils;
            autoCloseConnectionsCheck.setEnabled(false);

                return ct;
                // Changed type
                // Remove
        }
    private Table typeTable;

            Color connectionColor = UIUtils.getConnectionTypeColor(connectionType);
                }
    @Override
                connectionType = systemType;

                @Override
                gd.horizontalSpan = 2;
                            }
                            if (color == null) {
            }
        typeTable.addControlListener(new ControlAdapter() {

                public void widgetSelected(SelectionEvent e) {
import org.eclipse.core.runtime.IAdaptable;
            item.setBackground(1, connectionColor);
            smartCommitRecoverCheck.addSelectionListener(new SelectionAdapter() {
 * PrefPageConnectionTypes
                getSelectedType().setName(typeName.getText());

        item.setText(0, connectionType.getName());
import org.eclipse.ui.IWorkbench;

        }
                GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
                    changed.setId(SecurityUtils.generateUniqueId());
            autoCloseTransactionsTtlText = new Text(placeholder, SWT.BORDER);
                }
            // connections
            typeDescription.addModifyListener(e -> {
        }
                pickerButton.setText("...");
                false,
import org.jkiss.dbeaver.ui.UIIcon;
                2,
                300);
            if (hasChanges) {
            Composite groupSettings = UIUtils.createTitledComposite(
        return composite;
            DBPConnectionType source = entry.getValue();
                placeholder,
        typeName.setText(connectionType.getName());
                        addTypeToTable(newType, newType);
                            colorPicker.select(color);
                            boolean hasName = false;
                        DBPConnectionType connectionType = getSelectedType();
        changedInfo.put(connectionType, source);

                placeholder,
    }

import org.eclipse.swt.widgets.*;
                                    break;
            autocommitCheck.addSelectionListener(new SelectionAdapter() {
                }
                    DBPConnectionType cnnType = cnnCfg.getConnectionType();
    protected void performDefaults() {
                    CommonUtils.toInt(autoCloseConnectionsTtlText.getText(), DBPConnectionType.DEFAULT_TYPE.getCloseIdleConnectionPeriod())));
        if (!canEdit) {
        }
 *

        TableItem item = new TableItem(typeTable, SWT.LEFT);
                ToolBar toolbar = new ToolBar(composite, SWT.FLAT | SWT.HORIZONTAL);
    private Button autoCloseTransactionsCheck;
                @Override
        smartCommitRecoverCheck.setSelection(connectionType.isSmartCommitRecover());
    private Text typeId;
                getSelectedType().setDescription(typeDescription.getText());
                Color connectionColor = UIUtils.getConnectionTypeColor(connectionType);

//                colorGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            smartCommitRecoverCheck.setEnabled(false);
            }
        if (connectionType.getColor() != null) {
            GridData grd = new GridData();
            if (connectionColor != null) {
        for (DBPDataSourceRegistry dsReg : affectedDataSourceRegs) {

                Button pickerButton = new Button(colorGroup, SWT.PUSH);
            smartCommitCheck.setEnabled(false);
            confirmDataChangeCheck.addSelectionListener(new SelectionAdapter() {
                false,
        for (DBPConnectionType connectionType : toRemove) {
    private DBPConnectionType selectedType;
        }
        typeId.setEnabled(changedInfo.get(connectionType) == connectionType);
                        }
                final ToolItem newButton = new ToolItem(toolbar, SWT.NONE);
        typeTable.removeAll();
        if (!canEdit) {
 */
                public void widgetSelected(SelectionEvent e) {
    @Override
                source.setName(changed.getName());
    private final boolean canEdit = DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER);

            DBPConnectionType systemType = resetSystemSettings ? findSystemType(source) : null;
            smartCommitCheck.addSelectionListener(new SelectionAdapter() {
            }
                if (CommonUtils.isEmpty(changed.getId())) {
                            name = "Type" + i;
                CoreMessages.action_menu_transaction_smart_auto_commit_recover,
            DBPConnectionType connectionType;
import org.eclipse.swt.layout.GridData;
import org.eclipse.ui.IWorkbenchPreferencePage;
            typeId.setEnabled(false);
            }
                                connectionType.getName(), DBPConnectionType.DEFAULT_TYPE.getName()
                            )
                    }
                            CoreMessages.pref_page_connection_types_label_delete_connection_type, NLS.bind(
        }
import org.jkiss.dbeaver.core.CoreMessages;

        selectedType = element.getAdapter(DBPConnectionType.class);
        return null;
        UIUtils.createLink(
            smartCommitRecoverCheck.setEnabled(true);
                    }
                            EditConnectionPermissionsDialog dialog = new EditConnectionPermissionsDialog(
                                CoreMessages.pref_page_connection_types_label_delete_connection_type_description,
                }
        Set<DBPDataSourceRegistry> affectedDataSourceRegs = new HashSet<>();
                // New type
import org.eclipse.swt.events.SelectionAdapter;
                        }
            typeTable.setLayoutData(new GridData(GridData.FILL_BOTH));
                    }
                    typeTable.select(i);
            {

                }
    private Button smartCommitCheck;

            new SelectionAdapter() {
                @Override
                }
            for (int i = 0; i < typeTable.getItemCount(); i++) {
            confirmCheck.addSelectionListener(new SelectionAdapter() {
                                    break;
        for (Map.Entry<DBPConnectionType, DBPConnectionType> entry : changedInfo.entrySet()) {

import org.jkiss.dbeaver.ui.ShellUtils;
            return false;
    private static final String HELP_CONNECTION_TYPES_LINK = "Connection-Types";
                                if (item != null && item.getRGB().equals(rgb)) {
                    @Override
import org.eclipse.swt.events.SelectionEvent;
            });
                    updateTableInfo();
                }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        if (!changedSet.isEmpty()) {
    }
import org.eclipse.swt.graphics.Color;
 */
                false,
    private void updateCommitRecoverCheckBox() {
            if (item.getData() == connectionType) {

/**
        }
    private Button confirmCheck;
                true,
                placeholder,
                                colorPicker.addColor(color);
                    getSelectedType().setColor(StringConverter.asString(colorPicker.getColorValue()));
            registry.removeConnectionType(connectionType);
                    placeholder,
        updateCommitRecoverCheckBox();
            typeId = UIUtils.createLabelText(groupSettings, CoreMessages.pref_page_connection_types_label_id, null);
import org.jkiss.dbeaver.model.connection.DBPConnectionType;
    private Text autoCloseConnectionsTtlText;
                        @Override
                    if (type != changed && type.getId().equals(changed.getId())) {
                source.setSmartCommit(changed.isSmartCommit());
                }
    public IAdaptable getElement() {
            DBPConnectionType changed = entry.getKey();
            }
            composite,
                for (DBPDataSourceContainer ds : projectRegistry.getDataSources()) {
                        changed.setId(SecurityUtils.generateUniqueId());
        performDefaults(true);
/*
            confirmDataChangeCheck.setEnabled(false);
            autoCloseConnectionsTtlText.setLayoutData(grdConnections);
                                    color = item;
                source.setConfirmDataChange(changed.isConfirmDataChange());
            GridData grdConnections = new GridData();
            autoCloseConnectionsCheck = UIUtils.createCheckbox(
                    getSelectedType().setSmartCommit(smartCommitCheck.getSelection());
        return super.performOk();
            autoCloseConnectionsTtlText = new Text(placeholder, SWT.BORDER);
import org.jkiss.dbeaver.ui.dialogs.connection.EditConnectionPermissionsDialog;
                    }
    private DBPConnectionType getSelectedType() {
            autoCloseTransactionsTtlText.addModifyListener(e ->
    }
                });
    @Override
            }
                    public void widgetSelected(SelectionEvent e) {
                GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL,
                public void widgetSelected(SelectionEvent e) {
                public void widgetSelected(SelectionEvent e) {
                }
                            Color color = null;
import org.jkiss.dbeaver.model.DBPEvent;
                source.setSmartCommitRecover(changed.isSmartCommitRecover());

    private ColorSelector colorPicker;
        typeTable.select(0);
                source.setColor(changed.getColor());
            }
    private final Map<DBPConnectionType, DBPConnectionType> changedInfo = new HashMap<>();
                    if (changedSet.contains(cnnType)) {
        return (DBPConnectionType) typeTable.getItem(typeTable.getSelectionIndex()).getData();
 * limitations under the License.
import org.eclipse.jface.dialogs.IDialogConstants;
    @Override
        }
                @Override
            UIUtils.createTableColumn(typeTable, SWT.LEFT, CoreMessages.pref_page_connection_types_label_table_column_name);
                CoreMessages.pref_page_connection_types_group_settings,
                CoreMessages.action_menu_transaction_smart_auto_commit_tip,
            public void controlResized(ControlEvent e) {
                false,
            } else if (!source.equals(changed)) {
                CoreMessages.pref_page_connection_types_label_confirm_sql_execution,
                // connections

                        typeTable.remove(index);
                public void widgetSelected(SelectionEvent e) {
            typeDescription.setEnabled(false);
                                Color item = colorPicker.getColorItem(i);

import org.jkiss.utils.SecurityUtils;
    private Button confirmDataChangeCheck;
                                color = new Color(colorPicker.getDisplay(), rgb);
                getSelectedType().setCloseIdleConnectionPeriod(
            confirmCheck.setEnabled(false);
    }
    @NotNull
        if (!smartCommitCheck.getSelection()) {
    private Text typeName;
        });

                getSelectedType().setId(typeId.getText());
    private Text typeDescription;
                        ColorDialog colorDialog = new ColorDialog(parent.getShell());
                            );
            Composite placeholder = UIUtils.createTitledComposite(
                        affectedDataSourceRegs.add(projectRegistry);
                    ShellUtils.launchProgram(HelpUtils.getHelpExternalReference(HELP_CONNECTION_TYPES_LINK));
                //item.setBackground(0, connectionColor);
                updateTableInfo();

                item.setBackground(1, connectionColor);
                editPermissionsButton.setLayoutData(gd);
            autocommitCheck = UIUtils.createCheckbox(
            smartCommitCheck = UIUtils.createCheckbox(placeholder,
                    showSelectedType(getSelectedType());
                CoreMessages.pref_page_connection_types_label_auto_commit_by_default_tip,
                        colorDialog.setRGB(StringConverter.asRGB(connectionType.getColor()));
                        newType.setId(name.toLowerCase());
    private void showSelectedType(DBPConnectionType connectionType) {
        showSelectedType(getSelectedType());
        for (DBPConnectionType type : registry.getConnectionTypes()) {
                        showSelectedType(getSelectedType());
                this.deleteButton.addSelectionListener(new SelectionAdapter() {
        autocommitCheck.setSelection(connectionType.isAutocommit());
            typeTable = new Table(composite, SWT.SINGLE | SWT.BORDER);
    }
                            if (!hasName) {
                        )) {
            "<a>" + CoreMessages.pref_page_connection_types_wiki_link + "</a>",

                        }
                        String name;

        item.setData(connectionType);

                newButton.setImage(DBeaverIcons.getImage(UIIcon.ROW_ADD));
            autoCloseConnectionsTtlText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.ENGLISH));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                DBPDataSourceRegistry projectRegistry = project.getDataSourceRegistry();
                // transaction
                            if (dialog.open() == IDialogConstants.OK_ID) {
        for (DBPConnectionType source : DataSourceProviderRegistry.getInstance().getConnectionTypes()) {
                        for (int i = 1; ; i++) {
                composite,
                            }
                        newType.setName("New type");
                            index--;
                    CommonUtils.toInt(autoCloseTransactionsTtlText.getText(), DBPConnectionType.DEFAULT_TYPE.getCloseIdleTransactionPeriod())));
                CoreMessages.action_menu_transaction_smart_auto_commit,
            });
        return null;
            deleteButton.setEnabled(!connectionType.isPredefined());
//                colorPicker.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                        if (!UIUtils.confirmAction(
                source.setDescription(changed.getDescription());
 * Licensed under the Apache License, Version 2.0 (the "License");
            registry.saveConnectionTypes();
                        int index = typeTable.getSelectionIndex();
            autoCloseTransactionsTtlText.setLayoutData(grd);
            });


                        RGB rgb = colorDialog.open();
                CoreMessages.action_menu_transaction_smart_auto_commit_recover_tip,
                    getSelectedType().setConfirmExecute(confirmCheck.getSelection());
            smartCommitRecoverCheck = UIUtils.createCheckbox(placeholder,
            grd.widthHint = UIUtils.getFontHeight(autoCloseTransactionsTtlText) * 6;
import org.eclipse.swt.SWT;
import org.jkiss.utils.CommonUtils;
                            getSelectedType().setColor(StringConverter.asString(color.getRGB()));
            addTypeToTable(source, connectionType);
            grdConnections.widthHint = UIUtils.getFontHeight(autoCloseTransactionsTtlText) * 6;
                            for (DBPConnectionType type : changedInfo.keySet()) {
                placeholder,
            // Flush projects configs (as they cache connection type information)
                1);
                                break;
                source.setAutoCloseTransactions(changed.isAutoCloseTransactions());
    private Button autoCloseConnectionsCheck;
                public void widgetSelected(SelectionEvent e) {
                        DBPConnectionType connectionType = getSelectedType();
                        changedInfo.remove(connectionType);
import org.jkiss.dbeaver.ui.DBeaverIcons;
                    {
        if (!canEdit) {
            if (canEdit) {
            });
            return;
                                }
import org.eclipse.jface.resource.StringConverter;
        for (TableItem item : typeTable.getItems()) {
import org.jkiss.code.NotNull;
        }
        }
import org.jkiss.dbeaver.ui.UIUtils;
    }
            }
 * Copyright (C) 2010-2026 DBeaver Corp and others
                                }
            changedSet.add(connectionType);
                false,
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;

                composite,
    public void init(IWorkbench workbench) {
                );
                }
                colorPicker = new ColorSelector(groupSettings);
                public void widgetSelected(SelectionEvent e) {
                CoreMessages.dialog_connection_wizard_final_label_close_idle_connections,
        final Color connectionTypeColor = UIUtils.getConnectionTypeColor(connectionType);
                    @Override
import org.eclipse.osgi.util.NLS;
        }
            typeTable.setLayoutData(new GridData(GridData.FILL_BOTH));
    @Override

        item.setText(1, CommonUtils.toString(connectionType.getDescription()));
                source.setId(changed.getId());
        autoCloseConnectionsCheck.setSelection(connectionType.isAutoCloseConnections());
                UIUtils.createControlLabel(groupSettings, CoreMessages.pref_page_connection_types_label_color);
                deleteButton = new ToolItem(toolbar, SWT.NONE);

    }
            // transactions
                2);
 * distributed under the License is distributed on an "AS IS" BASIS,
                getSelectedType().setCloseIdleTransactionPeriod(
 * See the License for the specific language governing permissions and
        }
        {
                newButton.addSelectionListener(new SelectionAdapter() {
        if (selectedType != null) {

                GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL,
        {
    private Button smartCommitRecoverCheck;
                    getSelectedType().setAutocommit(autocommitCheck.getSelection());

            @Override
                    }
                CoreMessages.pref_page_connection_types_group_parameters,
            confirmDataChangeCheck = UIUtils.createCheckbox(
                item.setText(1, connectionType.getDescription());

        if (connectionTypeColor != null) {
        autoCloseTransactionsTtlText.setText(String.valueOf(connectionType.getCloseIdleTransactionPeriod()));
                });
                source.setModifyPermissions(changed.getModifyPermission());
                300);
            colorPicker.setEnabled(false);
                UIUtils.packColumns(typeTable, true);
            });
                            return;
        }
                }
            if (source == changed) {
            confirmCheck = UIUtils.createCheckbox(
    private Text autoCloseTransactionsTtlText;
 * Unless required by applicable law or agreed to in writing, software
 *
                    updateCommitRecoverCheckBox();
            smartCommitRecoverCheck.setEnabled(false);
            }
        performDefaults(false);
                    public void widgetSelected(SelectionEvent e) {
                            int count = colorPicker.getItemCount();
                connectionType = new DBPConnectionType(source);
                        showSelectedType(newType);
            for (DBPProject project : DBWorkbench.getPlatform().getWorkspace().getProjects()) {

import org.eclipse.ui.IWorkbenchPropertyPage;
        DataSourceProviderRegistry registry = DataSourceProviderRegistry.getInstance();
                updateTableInfo();
            });
        if (!canEdit) {
            autoCloseConnectionsTtlText.setEnabled(false);
                        typeTable.select(typeTable.getItemCount() - 1);
            }
                        if (rgb != null) {


                    CoreMessages.pref_page_label_edit_permissions,
            typeDescription = UIUtils.createLabelText(groupSettings, CoreMessages.pref_page_connection_types_label_description, null);
                source.setCloseIdleConnectionPeriod(changed.getCloseIdleConnectionPeriod());
                @Override
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
                        }
                2);
            autoCloseTransactionsCheck = UIUtils.createCheckbox(
                2);

            });
    private Button autocommitCheck;
                @Override

        Composite composite = UIUtils.createComposite(parent, 1);
/*

 *     http://www.apache.org/licenses/LICENSE-2.0
*/
            autoCloseTransactionsTtlText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.ENGLISH));

            UIUtils.createWarningLabel(composite, UIMessages.preference_page_no_edit_access, SWT.NONE, 1);
        Set<DBPConnectionType> toRemove = new HashSet<>();
                CoreMessages.pref_page_connection_types_label_confirm_data_change,
                source.setConfirmExecute(changed.isConfirmExecute());
            colorPicker.setColorValue(colorPicker.getButton().getBackground().getRGB());
                });
            typeName = UIUtils.createLabelText(groupSettings, CoreMessages.pref_page_connection_types_label_name, null);
            if (systemType != null) {
            autocommitCheck.setEnabled(false);
            });
                2);
        }

import org.eclipse.swt.events.ControlAdapter;
        } else {
    }
    protected void performDefaults(boolean resetSystemSettings) {
                CoreMessages.action_menu_transaction_auto_close_enabled,
                            }
//                Composite colorGroup = UIUtils.createPlaceholder(groupSettings, 2, 5);
            } else {
        smartCommitCheck.setSelection(connectionType.isSmartCommit());
                CoreMessages.pref_page_connection_types_label_auto_close_enabled_tip,
            typeTable.setHeaderVisible(true);
                        }
 * DBeaver - Universal Database Manager

                entry.setValue(new DBPConnectionType(source));
    private static DBPConnectionType findSystemType(DBPConnectionType type) {
        autoCloseTransactionsCheck.setSelection(connectionType.isAutoCloseTransactions());
