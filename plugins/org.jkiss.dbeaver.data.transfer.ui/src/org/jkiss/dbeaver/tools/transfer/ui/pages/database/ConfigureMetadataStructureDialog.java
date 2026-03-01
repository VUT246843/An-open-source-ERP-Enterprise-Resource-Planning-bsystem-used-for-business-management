import java.util.ArrayList;
        Composite viewerComposite = new Composite(configTabs, SWT.BORDER);
                    monitor.done();
        panel.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.dbeaver.tools.transfer.database.DatabaseConsumerSettings;
    private PropertySourceEditable propertySource;
                            null,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.layout.GridData;
                        }
    }
            }
import org.jkiss.dbeaver.model.DBUtils;
                            executionContext,
    private UIServiceSQL serviceSQL;
            } catch (DBException e) {
        Composite panel = UIUtils.createPlaceholder(viewerComposite, 1);
        if (container == null) {
 *

                        // First check properties that could already be applied to this object
        Composite panel = UIUtils.createPlaceholder(compositeEmpty, 1);
            gridData.minimumHeight = 25;
                            DBPPropertyDescriptor property = propertySource.getProperty(entry.getKey());
            showDDLTab.setControl(viewerComposite);
                if (!ArrayUtils.isEmpty(propertySource.getProperties())) {
        this.mapping = mapping;
        persistActions = generateTablePersistActions(container, dataSource);

                        monitor,
                        propertySource.setChangedPropertiesMap(mapping.getChangedPropertiesMap());
        Composite editorPH = new Composite(panel, SWT.BORDER);
                DBWorkbench.getPlatformUI().showError(
        @NotNull DatabaseMappingContainer mapping,
            if (showSaveButton) {
 */

                    false,
                dialogText = DTUIMessages.database_consumer_page_mapping_error_no_schema_changes_info;
                    ddl[0] = DatabaseTransferUtils.generateTargetTableDDL(

                monitor.done();
 * Licensed under the Apache License, Version 2.0 (the "License");
                );
            DBWorkbench.getPlatformUI().showError(
import org.jkiss.dbeaver.DBException;
import org.jkiss.code.NotNull;
    private final DatabaseConsumerSettings settings;
        columnsMappingTab.setData(columnsMappingDialog);
                    }
                e);
            DBCExecutionContext executionContext = DBUtils.getDefaultContext(dataSource, true);
import org.jkiss.dbeaver.model.struct.DBSEntity;
    }
    private final DatabaseMappingContainer mapping;
            tableObject = mapping.getTarget();


                                propertySource.addChangedProperties(property, entry.getValue());
            public void widgetSelected(SelectionEvent e) {
                        }
                    public void widgetSelected(SelectionEvent e) {
 * you may not use this file except in compliance with the License.
        CTabItem columnsMappingTab = new CTabItem(configTabs, SWT.NONE);
        if (ArrayUtils.isEmpty(persistActions)) {
                    DatabaseTransferUtils.executeDDL(session, persistActions);
        panel.setLayoutData(gd);
                    propertyViewer.getControl().setLayoutData(gd);
    public ConfigureMetadataStructureDialog(
                    } catch (DBException e) {
                }
        }
            return null;

                try {
                dialogText = SQLUtils.generateScript(dataSource, persistActions, false);
        composite.setLayoutData(gd);
        }
import org.eclipse.swt.events.SelectionAdapter;
import org.jkiss.dbeaver.model.sql.SQLUtils;
            });

                    "Apply schema changes")) {
                            new ArrayList<>(),
    private boolean ddlTabNeedRefresh = true;
        if (serviceSQL != null) {
                            propertySource.getChangedPropertiesValues(),
import org.jkiss.dbeaver.runtime.DBWorkbench;


import org.eclipse.swt.custom.CTabFolder;
            } else if (ArrayUtils.isEmpty(persistActions)) {
                    } else if (!CommonUtils.isEmpty(mapping.getRawChangedPropertiesMap())) {
                dialogText = DTUIMessages.database_consumer_page_mapping_sqlviewer_nonsql_tables_message;
                } catch (Exception e) {
                public void widgetSelected(SelectionEvent e) {
                        DatabaseTransferUtils.applyPropertyChanges(
        configTabs = new CTabFolder(composite, SWT.TOP | SWT.FLAT);
import java.util.Map;
            dialogText = SQLUtils.generateScript(dataSource, persistActions, false);
    protected void okPressed() {
                            DTUIMessages.database_consumer_page_mapping_create_target_object_confirmation_question)) {
                propertySource.collectProperties();
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.events.SelectionEvent;
                            // Create target objects

    }
                    dialogText
                    DTUIMessages.database_consumer_page_mapping_sqlviewer_title,
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
                    PropertyTreeViewer propertyViewer = new PropertyTreeViewer(propertiesComposite, SWT.BORDER);
                            if (property != null) {
import org.jkiss.dbeaver.runtime.properties.PropertySourceEditable;
 * DBeaver - Universal Database Manager
            } catch (InvocationTargetException e) {
                            DTUIMessages.database_consumer_page_mapping_create_target_object_confirmation_title,
        CTabItem showDDLTab = new CTabItem(configTabs, SWT.NONE);
 *     http://www.apache.org/licenses/LICENSE-2.0
        messageText.setText(message);
                    throw new InvocationTargetException(e);
        columnsMappingTab.setText(DTUIMessages.columns_mapping_dialog_shell_text);
            DBPDataSource dataSource = container.getDataSource();
                }
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
    private CTabFolder configTabs;
                        // So we should find the correct properties and bound them
                for (DBPPropertyDescriptor prop : propertySource.getProperties()) {
    @Nullable
                    targetContainer,

                            null,
                    DTUIMessages.page_configure_table_DDL_button_execute,


        if (propertySource != null) {
        gd.minimumWidth = 100;
                }
                    e);
                } else {
                    monitor.done();
        configTabs.setSelection(0);
        String dialogText;
import org.jkiss.dbeaver.tools.transfer.ui.wizard.DataTransferWizard;

                    }
                            }
                            getShell(),
                    monitor,
        this.wizard = wizard;
        ColumnsMappingDialog columnsMappingDialog = new ColumnsMappingDialog(settings, mapping);

                            close();
    @Override
            gridData.minimumWidth = 100;
        Control pageControl = columnsMappingDialog.getControl();
                    new DataSourceContextProvider(container),

                try (DBCSession session = DBUtils.openUtilSession(
        configTabs.setLayoutData(new GridData(GridData.FILL_BOTH));
                persistButton.addSelectionListener(new SelectionAdapter() {
    protected Composite createDialogArea(Composite parent) {
                    e);
                DTUIMessages.database_consumer_page_mapping_title_target_DDL,
                        // Refresh DDL tab - it is the last
    private Object sqlPanel;
    @Override
                    DBPDataSourcePermission.PERMISSION_EDIT_METADATA);
                    editorPH,
                        for (Map.Entry<String, Object> entry : rawChangedPropertiesMap.entrySet()) {
                } finally {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
            copyButton.addSelectionListener(new SelectionAdapter() {
 * You may obtain a copy of the License at
            Composite buttonsBar = UIUtils.createComposite(viewerComposite, 2);
                        }
            DBWorkbench.getPlatformUI().showError(DTUIMessages.database_consumer_page_mapping_error_schema_save_title,
        // Save changes from the new created table if we have it
 */
            } catch (InterruptedException e) {
                    if (settings != null) {
        gd.minimumHeight = 100;
import org.jkiss.dbeaver.model.impl.DataSourceContextProvider;

        viewerComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        } catch (InvocationTargetException e) {
                    UIUtils.setClipboardContents(Display.getCurrent(), TextTransfer.getInstance(), dialogText);
    private DBEPersistAction[] persistActions;
                            null,
                });
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
            try {
    }
                        // Update table properties
                        tableObject = DatabaseTransferUtils.generateStructTableDDL(
                    propertiesComposite.setLayoutData(gd);
        Composite compositeEmpty = new Composite(configTabs, SWT.NONE);
                    null);
 * distributed under the License is distributed on an "AS IS" BASIS,
                    @Override
                        DatabaseTransferUtils.refreshDatabaseModel(monitor, settings, mapping);
            Map<DBPPropertyDescriptor, Object> changedPropertiesValues = propertySource.getChangedPropertiesValues();
        try {
        GridData gd = new GridData(GridData.FILL_BOTH);
        columnsMappingTab.setControl(pageControl);
        }
            }
        }
        @NotNull DatabaseConsumerSettings settings,
        } catch (InterruptedException e) {
            String dialogText;
                wizard.getRunnableContext().run(true, true, monitor -> {

    private boolean applySchemaChanges(@NotNull DBSObjectContainer targetContainer,
                    propertyViewer.loadProperties(propertySource);
                    DTUIMessages.database_consumer_page_mapping_title_target_table,
                    if (prop instanceof ObjectPropertyDescriptor obj) {
        serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;

                            setNewTextToDDLTab(container, dataSource);
            });
                    }
        return composite;


/*
                    "Error creating SQL panel",
        super.okPressed();
                            DBPDataSource dataSource = container.getDataSource();
 * Unless required by applicable law or agreed to in writing, software
                    DTUIMessages.database_consumer_page_mapping_message_error_generating_target_table,
                            mapping.getChangedPropertiesMap());
            final Button copyButton = UIUtils.createPushButton(buttonsBar, DTUIMessages.page_configure_table_DDL_button_copy, null);



                    UIUtils.createLabel(propertiesComposite, DTUIMessages.page_configure_table_properties_text);
import org.jkiss.dbeaver.tools.transfer.database.DatabaseMappingContainer;
 * Dialog with tabs to change target table properties and table columns mapping
                    "Can't create SQL panel",
 *
        @NotNull DatabaseConsumerPageMapping pageMapping
                serviceSQL.setSQLPanelText(sqlPanel, dialogText);
            } else {
 *
        } else {
                        if (container != null) {
import org.eclipse.swt.layout.FillLayout;
        editorPH.setLayout(new FillLayout());
public class ConfigureMetadataStructureDialog extends BaseDialog {
            if (!CommonUtils.isEmpty(changedPropertiesValues)) {
                        // (this means that this dialogue was already opened by the user, and the changes have been applied to the target)
import org.eclipse.swt.dnd.TextTransfer;
        GridData gd = new GridData(GridData.FILL_BOTH);
                            if (applySchemaChanges(container, mapping)) {
            // ignore
                        if (UIUtils.confirmAction(
                    }
import org.eclipse.swt.custom.CTabItem;
        }
        if (serviceSQL != null) {
        });
                @Override
            CTabItem tablePropertiesTab = new CTabItem(configTabs, SWT.NONE);
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferUtils;
    private void createCompositeWithMessage(GridData gd, CTabItem tablePropertiesTab, String message) {
            return;
            dialogText = DTUIMessages.database_consumer_page_mapping_error_no_schema_changes_info;
                            monitor,
                        }
        super(wizard.getShell(), DTUIMessages.page_configure_metadata_title, null);

                        // Or maybe we have task with saved properties map

            return true;
    }
                        throw new InvocationTargetException(e);
        return ddl[0];
                }
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
    @Override
        final DBSObjectContainer container = settings.getContainer();
                final Button persistButton = UIUtils.createPushButton(
                            mapping,
import org.jkiss.dbeaver.model.DBPDataSource;
                showSaveButton = false;

            tablePropertiesTab.setText(DTUIMessages.page_configure_table_properties_tab_title);
                propertySource = new PropertySourceEditable(null, tableObject, tableObject);
                            propertySource.removeProperty(prop);
        showDDL(showDDLTab);
                DTUIMessages.database_consumer_page_mapping_message_error_generating_target_DDL,
    ) {
                    if (tabList.length > 0 && selectionIndex == tabList.length - 1) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            @Override
        if (!mapping.hasNewTargetObject()) {
                    if (!CommonUtils.isEmpty(mapping.getChangedPropertiesMap())) {
                // do nothing
                    propertyViewer.changeColumnsWidth();
            if (dataSource != null && dataSource.getInfo().isDynamicMetadata()) {
                        container,
            }
                    createCompositeWithMessage(gd, tablePropertiesTab, DTUIMessages.page_configure_table_properties_no_properties);
import org.jkiss.utils.CommonUtils;
                    monitor.beginTask("Generate new table object", 1);
                    final int selectionIndex = configTabs.getSelectionIndex();
                        // But this map has only the id of ObjectPropertyDescriptor
                    }
            }
                        mapping,
    private final DatabaseConsumerPageMapping pageMapping;
        showDDLTab.setText(DTMessages.data_transfer_wizard_page_ddl_name);
import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
        }
        }
        }
                        propertySource != null ? propertySource.getChangedPropertiesValues() : mapping.getChangedPropertiesMap());
            if (tableObject != null) {
        viewerComposite.setLayout(new GridLayout(1, false));
        } catch (InvocationTargetException e) {
    protected boolean isResizable() {
                DTUIMessages.database_consumer_page_mapping_error_schema_save_info, e.getTargetException());
        final DBSObjectContainer container = settings.getContainer();
                    tablePropertiesTab.setControl(propertiesComposite);
package org.jkiss.dbeaver.tools.transfer.ui.pages.database;
import org.jkiss.code.Nullable;
            buttonsBar.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_END));
                createCompositeWithMessage(gd, tablePropertiesTab, DTUIMessages.page_configure_table_properties_info_text);
                        final DBSObjectContainer container = settings.getContainer();
            }
import org.jkiss.dbeaver.runtime.properties.ObjectPropertyDescriptor;
                    try {

    private void setNewTextToDDLTab(DBSObjectContainer container, DBPDataSource dataSource) {
        @NotNull DataTransferWizard wizard,
    private void showDDL(@NotNull CTabItem showDDLTab) {
                    throw new InvocationTargetException(e);
import org.jkiss.utils.ArrayUtils;
            }
                if (ddlTabNeedRefresh) {
        boolean showSaveButton;
import org.eclipse.swt.layout.GridLayout;
        try {
            } else {
                sqlPanel = serviceSQL.createSQLPanel(
        Text messageText = new Text(panel, SWT.READ_ONLY | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
            return null;
import org.jkiss.dbeaver.model.struct.DBSObject;
            copyButton.setLayoutData(gridData);
                                pageMapping.autoAssignMappings();
        DBPDataSource dataSource = container.getDataSource();
                mapping.setChangedPropertiesMap(changedPropertiesValues);
                    DBCExecutionContext executionContext = DBUtils.getDefaultContext(dataSource, true);
                        Map<String, Object> rawChangedPropertiesMap = mapping.getRawChangedPropertiesMap();
}
    private DBEPersistAction[] generateTablePersistActions(DBSObjectContainer container, DBPDataSource dataSource) {
                    }
            serviceSQL.setSQLPanelText(sqlPanel, dialogText);
        compositeEmpty.setLayout(new GridLayout(1, false));
            }
                ddlTabNeedRefresh = false;
                }
 * See the License for the specific language governing permissions and
import java.lang.reflect.InvocationTargetException;
    private DBSObject tableObject;
                            }
        this.pageMapping = pageMapping;


        } catch (InterruptedException e) {
                    final Control[] tabList = configTabs.getTabList();
                }
                    propertiesComposite.setLayout(new GridLayout(1, false));
        if (container != null && mapping.hasNewTargetObject()) {
        persistActions = generateTablePersistActions(container, dataSource);
        tablePropertiesTab.setControl(compositeEmpty);
        }
                            container,
        final DBEPersistAction[][] ddl = new DBEPersistAction[1][];
            GridData gridData = new GridData(GridData.FILL_BOTH);
 * limitations under the License.
            wizard.getRunnableContext().run(true, true, monitor -> {
                            (DBSEntity) tableObject);
import org.eclipse.swt.SWT;
                                       @NotNull DatabaseMappingContainer mapping) {
        Composite composite = super.createDialogArea(parent);
                    final Composite propertiesComposite = new Composite(configTabs, SWT.NONE);
                showSaveButton = dataSource != null && dataSource.getContainer().hasModifyPermission(
                monitor.beginTask("Save schema changes in the database", 1);
                        executionContext,
        messageText.setLayoutData(gd);
                showSaveButton = false;
                });
                    buttonsBar,
    }
        compositeEmpty.setLayoutData(gd);
        return true;
        editorPH.setLayoutData(gd);
    private final DataTransferWizard wizard;
            wizard.getRunnableContext().run(true, true, monitor -> {

    }
                persistButton.setLayoutData(gridData);
/**
                        if (!obj.isEditPossible(tableObject) || obj.isNameProperty()) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            });
                monitor.beginTask(DTUIMessages.database_consumer_page_mapping_monitor_task, 1);
            try {
        this.settings = settings;
                DBWorkbench.getPlatformUI().showError(
        return false;
    }

                } catch (DBException e) {

        configTabs.addSelectionListener(new SelectionAdapter() {
                    UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart().getSite(),
        columnsMappingDialog.createControl(configTabs);
import org.jkiss.dbeaver.model.DBPDataSourcePermission;
