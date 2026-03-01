            dataSource.getConnectionConfiguration().getBootstrap().setDefaultAutoCommit(
                // Get settings from data source descriptor

            //

 *     http://www.apache.org/licenses/LICENSE-2.0
    private void loadDatabaseSettings(DBRProgressMonitor monitor, DBPDataSource dataSource)  {
    private Spinner closeIdleConnectionsPeriod;
    private static final String PAGE_DOCS_LINK = "Configure-Connection-Initialization-Settings";
    private Spinner keepAliveInterval;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.Log;


        if (newWizard instanceof ConnectionWizard connectionWizard && !connectionWizard.isNew()) {
    }
            DBWorkbench.getPlatformUI().showError("Database info reading", "Error reading information from database", e.getTargetException());
                confConfig.setCloseIdleInterval(0);

    ) {
            idleConComp.setLayoutData(GridDataFactory.create(GridData.FILL_HORIZONTAL).span(2, 1).create());
    private DataSourceDescriptor dataSourceDescriptor;
                            for (String name : objectNames) {
                    isolationLevel.select(isolationLevel.getItemCount() - 1);
import org.eclipse.swt.SWT;
 * you may not use this file except in compliance with the License.
                    ShellUtils.launchProgram(HelpUtils.getHelpExternalReference(PAGE_DOCS_LINK));
            ((GridData)defaultSchema.getLayoutData()).widthHint = UIUtils.getFontHeight(defaultSchema) * 20;
    }
    }

        super.setWizard(newWizard);
            case 1 -> true;
                            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        shellCommandPage.saveSettings(dataSource);
 * DBeaver - Universal Database Manager
            getWizard().getRunnableContext().run(true, true, monitor ->
            );
                    for (DBSObject child : children) {
        if (clientAppPage != null) {
            Composite conGroup = UIUtils.createTitledComposite(
    @Override
        if (activated) {
                // Save only if it is enabled and not equals to default
                );
                    if (levelIndex >= 0) {
 */
                        }
        );
                    }
            bootstrap.setIgnoreErrors(ignoreBootstrapErrors);

import java.util.List;

                @Override
        Integer levelCode = dataSourceContainer.getDefaultTransactionsIsolation();
                SWT.DROP_DOWN | SWT.READ_ONLY);
    @Nullable
 *
                }
        setDescription(CoreMessages.dialog_connection_wizard_connection_init_description);
import org.eclipse.swt.events.SelectionAdapter;
                CoreMessages.dialog_connection_wizard_final_label_close_idle_connections,
                pageConnectionClient,
import java.util.ArrayList;
                GridData.HORIZONTAL_ALIGN_BEGINNING
                closeIdleConnectionsPeriod.setSelection(
        }
        @Nullable DBCExecutionContextDefaults<?, ?> contextDefaults,
    private static Boolean getAutocommitValueFromIndex(int index) {
        Control infoLabel = UIUtils.createInfoLabel(group, CoreMessages.dialog_connection_wizard_connection_init_hint);

    public void setWizard(IWizard newWizard) {

            PrefPageConnectionClient pageConnectionClient = new PrefPageConnectionClient();
                String bootstrapTooltip = CoreMessages.dialog_connection_wizard_final_label_bootstrap_tooltip;
    }

        try {

            }
        if (objectContainer != null) {
                GridData.HORIZONTAL_ALIGN_BEGINNING
        return switch (index) {
                );
                        conConfig.getConnectionType().getCloseIdleConnectionPeriod());
                    }
        setTitle(CoreMessages.dialog_connection_wizard_connection_init);
    }
            DBCExecutionContext executionContext = DBUtils.getDefaultContext(dataSource, true);
                        closeIdleConnectionsCheck.setSelection(type.isAutoCloseConnections());
import org.eclipse.swt.layout.GridData;
    @Override
                queriesConfigButton.addSelectionListener(new SelectionAdapter() {
import org.jkiss.code.NotNull;
    @Override
                        conConfig.getCloseIdleInterval() :
            {
                    }

    ConnectionPageInitialization(@NotNull DataSourceDescriptor dataSourceDescriptor) {
        Boolean defaultAutoCommit = configuration.getBootstrap().getDefaultAutoCommit();
import org.jkiss.dbeaver.model.exec.DBCSession;
            final DBPConnectionConfiguration confConfig = dataSource.getConnectionConfiguration();
                                objectCombo.add(name);
        } catch (InterruptedException e) {
                txnGroup,
                if (ConnectionWizard.PROP_CONNECTION_TYPE.equals(event.getProperty())) {
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.dialogs.IDialogPage;
        this();
    }
            defaultCatalog = UIUtils.createLabelCombo(conGroup, CoreMessages.dialog_connection_wizard_final_label_default_database,
                    if (closeIdleConnectionsPeriod != null) {
    public void saveSettings(@NotNull DBPDataSourceContainer dataSource) {
                activated = true;
            );
    public void testConnection(DBCSession session) {
                            getShell(),
                            break;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                defaultSchema.setText(CommonUtils.notEmpty(conConfig.getBootstrap().getDefaultSchemaName()));
 * Copyright (C) 2010-2026 DBeaver Corp and others

                closeIdleConnectionsPeriod.setEnabled(closeIdleConnectionsCheck.getSelection());
            try {

        if (!dataSourceDescriptor.getDriver().isEmbedded()) {
 * limitations under the License.
        return pages.toArray(new IDialogPage[0]);
            DBPTransactionIsolation defaultLevel = null;

                    contextDefaults,
                DBCExecutionContextDefaults<?, ?> contextDefaults = executionContext.getContextDefaults();
 *
        @NotNull DBRProgressMonitor monitor,
        setControl(group);
 */
        }
            default -> null;
            pageConnectionClient.setElement(dataSourceDescriptor);
                if (originalDataSource != null && originalDataSource.isConnected()) {
    public boolean isPageComplete() {
        ignoreBootstrapErrors = dataSourceDescriptor.getConnectionConfiguration().getBootstrap().isIgnoreErrors();
                    loadDatabaseSettings(dataSource);
            autocommit.add("Manual commit");
    private Combo isolationLevel;
            isolationLevel.removeAll();
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
            closeIdleConnectionsCheck = UIUtils.createCheckbox(idleConComp,
                        EditBootstrapQueriesDialog dialog = new EditBootstrapQueriesDialog(

            }
    private void loadDatabaseSettings(DBPDataSource dataSource) {
            bootstrap.setInitQueries(bootstrapQueries);
                CoreMessages.dialog_connection_edit_wizard_connections_description
                {
                CoreMessages.dialog_connection_wizard_final_label_isolation_level_tooltip, SWT.DROP_DOWN | SWT.READ_ONLY);
 *

            autocommit.add("Auto commit");
import org.jkiss.dbeaver.model.connection.DBPConnectionBootstrap;
            }
                CoreMessages.dialog_connection_wizard_final_label_close_idle_connections_tooltip, true, 1);
            confConfig.setKeepAliveInterval(keepAliveInterval.getSelection());
    }
        } catch (InvocationTargetException e) {
        }
                                if (defaultObject != null) {
                    DBSCatalog.class

            supportedLevels.clear();
class ConnectionPageInitialization extends ConnectionWizardPage implements IDialogPageProvider, IDataSourceConnectionTester {
                    if (closeIdleConnectionsCheck != null) {
        UIUtils.syncExec(() -> {
        if (dataSource instanceof DBSObjectContainer) {
                CoreMessages.dialog_connection_wizard_final_label_close_idle_connections_tooltip, 0, 0, Short.MAX_VALUE);
        if (dataSourceDescriptor != null) {
        }
        infoLabel.setToolTipText(CoreMessages.dialog_connection_wizard_connection_init_hint_tip);
        if (clientAppPage != null) {
    private static final Log log = Log.getLog(ConnectionPageInitialization.class);
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        super.dispose();
            autocommit = UIUtils.createLabelCombo(
            } else {
            autocommit.select(getAutocommitSelIndex(dataSourceDescriptor.getConnectionConfiguration()));
                if (!level.isEnabled()) {
        }
                DataSourceDescriptor originalDataSource = getWizard().getOriginalDataSource();

        DBPDataSourceContainer dataSourceContainer = dataSource.getContainer();
                            if (contextDefaults != null) {
        pages.add(shellCommandPage);
                dataSource.getConnectionConfiguration().getBootstrap().setDefaultTransactionIsolation(
            keepAliveInterval = UIUtils.createLabelSpinner(conGroup, CoreMessages.dialog_connection_wizard_final_label_keepalive,
                        }
                    (DBSObjectContainer) dataSource,
            }
        this.dataSourceDescriptor = dataSourceDescriptor;
                }
            group,
import java.util.Collection;
            if (!activated) {
        loadDatabaseSettings(session.getProgressMonitor(), session.getDataSource());
                CoreMessages.dialog_connection_edit_wizard_transactions,
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
                supportedLevels.add(level);
            DBPConnectionBootstrap bootstrap = confConfig.getBootstrap();
package org.jkiss.dbeaver.ui.dialogs.connection;
            bootstrap.setDefaultCatalogName(defaultCatalog.getText());
                CoreMessages.action_menu_transactionMonitor_autocommitMode,
                        closeIdleConnectionsPeriod.setSelection(type.getCloseIdleConnectionPeriod());
        Composite group = UIUtils.createPlaceholder(parent, 1, 5);
                log.warn("Can't read schema list", e);

                if (level.equals(defaultLevel)) {
            for (DBPTransactionIsolation level : txnLevels) {
                            }
            bootstrap.setDefaultSchemaName(defaultSchema.getText());
            }

    public void createControl(Composite parent) {
            } catch (DBException e) {

            PrefPageConnectionTypes.PAGE_ID,
                2,
    }

            pages.add(clientAppPage);
                defaultCatalog.setText(CommonUtils.notEmpty(conConfig.getBootstrap().getDefaultCatalogName()));
                CoreMessages.dialog_connection_wizard_final_label_keepalive_tooltip, 0, 0, Short.MAX_VALUE);

            // Default settings
        UIUtils.setHelp(group, IHelpContextIds.CTX_CON_WIZARD_FINAL);
            Composite idleConComp = UIUtils.createComposite(conGroup, 2);
            confConfig.setCloseIdleConnection(closeIdleConnectionsCheck.getSelection());
            }
    private boolean txnOptionsLoaded = false;
import java.lang.reflect.InvocationTargetException;
            Composite txnGroup = UIUtils.createTitledComposite(
                if (levelCode != null && !CommonUtils.isEmpty(txnLevels)) {
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
                    continue;
                    for (DBPTransactionIsolation level : txnLevels) {
                isolationLevel.add(level.getTitle());
            defaultSchema.setText("");
import org.jkiss.dbeaver.DBException;


        boolean isCatalogs
        Collection<DBPTransactionIsolation> txnLevels = CommonUtils.safeCollection(dataSource.getInfo().getSupportedTransactionsIsolation());
    public void activatePage() {

            //isolationLevel.setEnabled(!autocommit.getSelection());
                    loadSelectableObject(monitor, catalogContainer, defaultCatalog, contextDefaults, true);
                            objectCombo.removeAll();
            clientAppPage.performFinish();
    private ConnectionPageInitialization() {
        bootstrapQueries = new ArrayList<>(dataSourceDescriptor.getConnectionConfiguration().getBootstrap().getInitQueries());
                if (dataSourceDescriptor != null && !CommonUtils.isEmpty(dataSourceDescriptor.getConnectionConfiguration().getBootstrap().getInitQueries())) {
            ((GridData)defaultCatalog.getLayoutData()).widthHint = UIUtils.getFontHeight(defaultCatalog) * 20;
                }
            case 2 -> false;
    private void loadSelectableObject(
import org.eclipse.swt.events.SelectionListener;
                if (!CommonUtils.isEmpty(isolationLevel.getText())) {
                        if (child instanceof DBSObjectContainer) {
                    }
            }
                        if (!objectCombo.isDisposed()) {
                        }
    @Override
 * Initialization connection page
    private final List<DBPTransactionIsolation> supportedLevels = new ArrayList<>();


            // Listen for connection type change
    private boolean activated = false;
import org.eclipse.jface.layout.GridDataFactory;
                    (DBSObjectContainer) dataSource,
            null, null
                }
                CoreMessages.dialog_connection_wizard_final_label_connection,

                    DBPConnectionType type = (DBPConnectionType) event.getNewValue();
                group,
        return true;
import org.eclipse.jface.wizard.IWizard;
                DBSObjectContainer catalogContainer = DBUtils.getChangeableObjectContainer(
import org.jkiss.dbeaver.runtime.DBWorkbench;
                            objectNames.add(child.getName());

            closeIdleConnectionsCheck.addSelectionListener(SelectionListener.widgetSelectedAdapter(selectionEvent ->

import org.jkiss.dbeaver.ui.preferences.PrefPageConnectionClient;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    @Override
                final List<String> objectNames = new ArrayList<>();
                if (!objectNames.isEmpty()) {
                    public void widgetSelected(SelectionEvent e) {

            if (confConfig.isCloseIdleConnection() && closeIdleConnectionsPeriod.getSelection() != confConfig.getConnectionType()
                CoreMessages.dialog_connection_edit_wizard_connections,

                closeIdleConnectionsPeriod.setEnabled(closeIdleConnectionsCheck.getSelection())));
    }
                }
    private Button closeIdleConnectionsCheck;
                            bootstrapQueries,
                }


import org.jkiss.dbeaver.model.connection.DBPConnectionType;
import org.jkiss.dbeaver.ui.preferences.WizardPrefPage;
                queriesConfigButton.setToolTipText(bootstrapTooltip);
            autocommit.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

        List<IDialogPage> pages = new ArrayList<>();
            supportedLevels.clear();
            });
                .getCloseIdleConnectionPeriod()) {
                    conConfig.getCloseIdleInterval() > 0 ?
        {
        @Nullable DBSObjectContainer objectContainer,

                loadDatabaseSettings(monitor, dataSource));
                        }

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

                confConfig.setCloseIdleInterval(closeIdleConnectionsPeriod.getSelection());
            CoreMessages.dialog_connection_wizard_connection_init_docs_hint,
    @Override

}
                                }
                final DBPConnectionConfiguration conConfig = dataSourceDescriptor.getConnectionConfiguration();
                Collection<? extends DBSObject> children = objectContainer.getChildren(monitor);
import org.jkiss.utils.CommonUtils;

            group,
/*
            closeIdleConnectionsPeriod = UIUtils.createSpinner(idleConComp,

                CoreMessages.dialog_connection_wizard_final_label_default_schema_tooltip, SWT.DROP_DOWN);
                keepAliveInterval.setSelection(conConfig.getKeepAliveInterval());
                }
        txnOptionsLoaded = true;
                    CoreMessages.dialog_connection_wizard_final_label_default_database_tooltip, SWT.DROP_DOWN);
                final Button queriesConfigButton = UIUtils.createPushButton(conGroup, CoreMessages.dialog_connection_wizard_configure, DBeaverIcons.getImage(DBIcon.TREE_SCRIPT));
        }
                                    objectCombo.setText(defaultObject.getName());
                    queriesConfigButton.setFont(BaseThemeSettings.instance.baseFontBold);
                "Sets auto-commit mode for this connection.\nIf set to default then connection type configuration will be used.",
                        level = supportedLevels.get(levelIndex);
import org.jkiss.dbeaver.utils.HelpUtils;
    private List<String> bootstrapQueries;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                                DBSObject defaultObject = isCatalogs ? contextDefaults.getDefaultCatalog() : contextDefaults.getDefaultSchema();
                    DBPDataSource dataSource = originalDataSource.getDataSource();
                    }
                DBPTransactionIsolation level = null;
import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
import org.eclipse.jface.dialogs.IDialogConstants;
        }
 * See the License for the specific language governing permissions and
    @Override
    @Override
                loadSelectableObject(monitor, schemaContainer, defaultSchema, contextDefaults, false);
                autocommit.select(getAutocommitSelIndex(dataSourceDescriptor.getConnectionConfiguration()));
    }
        });
                }
/**
                2,
    private Combo autocommit;
    }
                });
                public void widgetSelected(SelectionEvent e) {
            new SelectionAdapter() {
                if (children != null) {
    private boolean ignoreBootstrapErrors;
                            ignoreBootstrapErrors);
    @Override
    private Combo defaultCatalog;
                }
    private Combo defaultSchema;
                group,
                        if (dialog.open() == IDialogConstants.OK_ID) {
    static final String PAGE_NAME = ConnectionPageInitialization.class.getSimpleName();
        return defaultAutoCommit == null ? 0 : defaultAutoCommit ? 1 : 2;
        };
        shellCommandPage = new ConnectionPageShellCommands(dataSourceDescriptor);
                    DBSSchema.class
                            dataSourceDescriptor,
        @NotNull Combo objectCombo,
            }
                    }
                            if (!CommonUtils.isEmpty(oldText)) {
        {
                            }
    private ConnectionPageShellCommands shellCommandPage;
        }
                isolationLevel.add("");
    }
        }
 * You may obtain a copy of the License at
                                objectCombo.setText(oldText);
        urlHelpLabel.setLayoutData(new GridData(GridData.FILL, GridData.VERTICAL_ALIGN_BEGINNING, false, false, 2, 1));
                    level == null ? null : level.getCode());
                            bootstrapQueries = dialog.getQueries();
                            ignoreBootstrapErrors = dialog.isIgnoreErrors();
    private WizardPrefPage clientAppPage;
                    contextDefaults,
        } else {
import org.jkiss.dbeaver.ui.*;
                            defaultLevel = level;


    public void dispose() {
                getAutocommitValueFromIndex(autocommit.getSelectionIndex()));

    private static int getAutocommitSelIndex(DBPConnectionConfiguration configuration) {
import org.jkiss.dbeaver.model.*;
            clientAppPage = new WizardPrefPage(
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
        super(PAGE_NAME); //$NON-NLS-1$
        }

        Link urlHelpLabel = UIUtils.createLink(
        }
                }
            defaultSchema = UIUtils.createLabelCombo(conGroup, CoreMessages.dialog_connection_wizard_final_label_default_schema,
import org.jkiss.dbeaver.model.struct.DBSObject;
            if (executionContext != null) {
                if (catalogContainer != null) {
            defaultCatalog.setText("");
            isolationLevel = UIUtils.createLabelCombo(txnGroup, CoreMessages.dialog_connection_wizard_final_label_isolation_level,
                closeIdleConnectionsCheck.setSelection(conConfig.isCloseIdleConnection());
            }
                            String oldText = objectCombo.getText();
                    int levelIndex = isolationLevel.getSelectionIndex();
            autocommit.add("Default");
            );
                UIUtils.createControlLabel(conGroup, CoreMessages.dialog_connection_wizard_final_label_bootstrap_query).setToolTipText(bootstrapTooltip);

import org.jkiss.dbeaver.core.CoreMessages;
                }
        UIUtils.createPreferenceLink(
                DBSObjectContainer schemaContainer = DBUtils.getChangeableObjectContainer(
                    });
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;

    }
        // We load settings to fill txn isolation levels and schema names (#6794)
        );
                    UIUtils.syncExec(() -> {
            connectionWizard.addPropertyChangeListener(event -> {
            if (txnOptionsLoaded) {
            CoreMessages.action_menu_transaction_pref_page_link_extended,
            isolationLevel.setEnabled(false);
import org.jkiss.dbeaver.ui.preferences.PrefPageConnectionTypes;
                        if (level.getCode() == levelCode) {
