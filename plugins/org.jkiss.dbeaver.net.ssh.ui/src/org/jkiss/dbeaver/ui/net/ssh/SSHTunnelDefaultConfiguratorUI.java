        if (conTimeout != 0 && conTimeout != SSHConstants.DEFAULT_CONNECT_TIMEOUT) {
        } else {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        // Save current configuration just in case
    }
            );
                privateKeyText.setText(key.data());
                return wrapper.configuration.username();
        hostsViewer.setSelection(new StructuredSelection(configurations.get(configurations.size() - 1)));
                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING
            );
                    tunnel.initializeHandler(monitor, configuration, connectionConfig);
                    "Confirm host deletion",
                    return;
        private ConfigurationFileSelector getConfigurationFileSelector(@NotNull ModifyListener listener) {
                }
            configuration.setProperty(SSHConstants.PROP_BYPASS_HOST_VERIFICATION, true);
                    return "Public Key";

        remoteHostText.setText(CommonUtils.notEmpty(configuration.getStringProperty(SSHConstants.PROP_REMOTE_HOST)));
            return "Hostname is not specified";
                "",
                    switchingConfiguration = false;

                    "SSH error",
import org.jkiss.dbeaver.model.messages.ModelMessages;

                DBPConnectionConfiguration connectionConfig = new DBPConnectionConfiguration();

            hostsViewer = new TableViewer(client, SWT.FULL_SELECTION | SWT.SINGLE);
                wrapper.configuration = credentialsPanel.saveSettings();
                String.valueOf(0)
                CommonUtils.notEmpty(password),
        credentialsPanel.loadSettings(wrapper, !isDestinationHost(wrapper));
            ) {
        {
/*
                tunnelImplCombo.setText(desc.getLabel());
            if (wrapper != null && wrapper == credentialsPanel.lastConfiguration) {
            } else if (configuration.auth() instanceof SSHAuthConfiguration.KeyData key) {
                    @Override

        private final boolean canEditCredentialsPerPolicy = !ApplicationPolicyProvider.getInstance()
                            configuration.setUserName(dbpAuthInfo.getUserName());
                return String.valueOf(isDestinationHost(wrapper) ? "Target" : "Jump #%d".formatted(configurations.indexOf(wrapper) + 1));
            enableTunnelSharingCheck = UIUtils.createCheckbox(
            SSHSessionControllerDescriptor desc = SSHSessionControllerRegistry.getInstance().getDescriptor(implType);
                    showPasswordField(true, SSHUIMessages.model_ssh_configurator_label_password);
                        DBPAuthInfo dbpAuthInfo = promptCredentialsDialog(authType, configuration.getUserName(), configuration.getPassword());
            }
            client.setLayoutData(new GridData(GridData.FILL_BOTH));
                break;
                    configurations.remove(index);
        configuration.setProperty(SSHConstants.PROP_LOCAL_HOST, localHostText.getText().trim());

        final SSHHostConfiguration[] hosts = configurations.stream()
                timeoutsGroup,
        localPortSpinner.setText(String.valueOf(configuration.getIntProperty(SSHConstants.PROP_LOCAL_PORT)));
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;


    static class CredentialsPanel extends Composite {

                authMethodCombo.select(SSHConstants.AuthType.PASSWORD.ordinal());
import org.jkiss.dbeaver.model.net.ssh.config.SSHHostConfiguration;
        int kaInterval = CommonUtils.toInt(keepAliveText.getText());

                2,
        remotePortSpinner.setText(String.valueOf(configuration.getIntProperty(SSHConstants.PROP_REMOTE_PORT)));

                passwordText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                String.valueOf(0)
            }
                "Connected!\n\nClient version: " + tunnelVersions[0] + "\nServer version: " + tunnelVersions[1]
                    // updateJumpServerSettingsVisibility();
                    updateAuthMethodVisibility();
                final ConfigurationWrapper host = (ConfigurationWrapper) hostsViewer.getStructuredSelection().getFirstElement();
            selector.getTextControl().addModifyListener(listener);
            setNumberEditStyles(tunnelTimeout);
                case PASSWORD -> {
            }

                    }
        } else {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    @Override
        }
import org.eclipse.jface.viewers.StructuredSelection;
                SSHUIMessages.model_ssh_configurator_group_port_forwarding_text,
    private void updateConfigurationSelection(@NotNull ConfigurationWrapper wrapper) {
                SSHTunnelImpl tunnel = new SSHTunnelImpl();
                privateKeyText.setText(key.path());
import java.util.List;
        return null;
                return wrapper.configuration.hostname() + ':' + wrapper.configuration.port();
            }));
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        } catch (InvocationTargetException ex) {
        // TODO: For now, we enforce password saving for jump hosts
            configurations.clear();

        private final Label privateKeyLabel;
            hostsComposite.setText(SSHUIMessages.model_ssh_configurator_group_jump_server_settings_text);
            credentialsPanel = new CredentialsPanel(
            final ToolItem deleteItem = UIUtils.createToolItem(toolBar, "Delete jump host", UIIcon.ROW_DELETE, SelectionListener.widgetSelectedAdapter(e -> {

            setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
                final int index = configurations.indexOf(host);
    static String validateConfiguration(@NotNull SSHHostConfiguration configuration) {
    private Text localPortSpinner;
        text.setLayoutData(gdt);
                2,
                    showPrivateKeyField(false);
            authMethodCombo.add(SSHUIMessages.model_ssh_configurator_combo_password);
        hostsViewer.refresh();
    @Override
                new GridData(GridData.FILL_HORIZONTAL)
            AbstractTrackingJob.executeInProgressMonitor(job);
                    loadingConfiguration = true;
                hostPortComp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                tunnelImplCombo.select(0);
            configuration.resolveDynamicVariables(new DataSourceVariableResolver(dataSource,

        }
import org.jkiss.dbeaver.ui.UIUtils;
            UIUtils.setControlVisible(privateKeyText.getPanel(), show);
import org.eclipse.ui.forms.widgets.ExpandableComposite;
            controller.addColumn("Authentication", "Authentication method", SWT.LEFT, true, true, wrapper -> {
                    propertyChangeListener.run();
            if (ex.getTargetException() != null) {
    @Override
    }
            }
                connectionConfig.setHostName("localhost");
                connectionConfig.setHostPort(configuration.getStringProperty(DBWHandlerConfiguration.PROP_PORT));
        configuration.setProperty(SSHConstants.PROP_REMOTE_HOST, remoteHostText.getText().trim());
            );
import org.jkiss.dbeaver.model.net.ssh.SSHConstants;
import org.eclipse.swt.SWT;
                    moveUpItem.setEnabled(index > 0);
        hostsComposite.setExpanded(configurations.size() > 1);
    public void resetSettings(@NotNull DBWHandlerConfiguration configuration) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            UIUtils.setControlVisible(passwordLabel, show);
                } finally {
            });


                savePasswordCheckbox.setEnabled(canEditCredentialsPerPolicy);
                GridData.FILL_HORIZONTAL
            // Hide tunnel sharing option if it's disabled
            configuration.setProperty(SSHConstants.PROP_LOCAL_PORT, localPort);
                    final String privateKey = privateKeyText.getText().trim();
                SSHUIMessages.model_ssh_configurator_label_keep_alive,

import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
 */
                protected String getNewTextFromUser(boolean secured) {
            controller.addColumn("Order", "Order of the jump server", SWT.LEFT, true, true, wrapper -> {
                authMethodCombo.select(SSHConstants.AuthType.AGENT.ordinal());
        ConfigurationWrapper(@NotNull SSHHostConfiguration configuration) {
            remotePortSpinner.setToolTipText(SSHUIMessages.model_ssh_configurator_label_remote_port_description);

                tunnelImplCombo.select(0);
            final String password = CommonUtils.nullIfEmpty(passwordText.getText().trim());
            final ToolItem moveDownItem = UIUtils.createToolItem(toolBar, "Move down", UIIcon.ARROW_DOWN, SelectionListener.widgetSelectedAdapter(e -> {
    @Override
    @Override
            return "Private key is not specified";
                    credentialsPanel.lastConfiguration = null;
            ConfigurationFileSelector selector = new ConfigurationFileSelector(
 * you may not use this file except in compliance with the License.
            setNumberEditStyles(remotePortSpinner);
            );
                generalGroup,
            controller.addColumn("User", "User name", SWT.LEFT, true, true, wrapper -> {
                    if (loadingConfiguration || switchingConfiguration) {
 * limitations under the License.
        @NotNull
                client,
                savePasswordCheckbox.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                SSHUIMessages.model_ssh_configurator_label_bypass_verification_description,
                        panel.getShell(),
            hostsComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
                generalGroup,
            UIUtils.createDialogButton(controlGroup, SSHUIMessages.model_ssh_configurator_button_test_tunnel, new SelectionAdapter() {

import org.jkiss.dbeaver.model.connection.DataSourceVariableResolver;

    private Text tunnelTimeout;
        public CredentialsPanel(
        for (SSHSessionControllerDescriptor it : SSHSessionControllerRegistry.getInstance().getDescriptors()) {
            }
            group.setText(SSHUIMessages.model_ssh_configurator_group_advanced);
                configurations.set(index - 1, host);
            }));
 *
    public void loadSettings(@NotNull DBWHandlerConfiguration configuration) {
            return;
            }
            );
                    showPrivateKeyField(false);
                SSHUIMessages.model_ssh_configurator_label_local_host,
        }
            setLayoutData(new GridData(GridData.FILL_BOTH));
            this.configuration = configuration;
                } else if (auth instanceof SSHAuthConfiguration.KeyData || auth instanceof SSHAuthConfiguration.KeyFile) {
                2
            if (credentialsPanel.lastConfiguration != null && wrapper == credentialsPanel.lastConfiguration) {
                e.getMessage(),
            privateKeyText = getConfigurationFileSelector(listener);
                    showPasswordField(false, null);
    private Combo tunnelImplCombo;
    private ExpandableComposite hostsComposite;
        hostsViewer.refresh();
                1,
                    }
                if (auth instanceof SSHAuthConfiguration.Password) {
    }
                "SSH error",
            );
        }
            hostsViewer.setContentProvider(ArrayContentProvider.getInstance());
                updateConfigurationSelection(host);
            UIUtils.setControlVisible(privateKeyLabel, show);
        credentialsPanel.lastConfiguration.configuration = credentialsPanel.saveSettings();
            Composite pfWrapper = UIUtils.createComposite(client, 1);
        int conTimeout = CommonUtils.toInt(tunnelTimeout.getText());

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        final GridData gridData = new GridData(GridData.FILL_BOTH);
                }
                SSHUIMessages.model_ssh_configurator_label_share_tunnels,

                @Override
                SSHConstants.DEFAULT_PORT,

        } else {
            controlGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.dbeaver.model.net.ssh.SSHTunnelImpl;
 * SSH tunnel configuration
                configurations.add(new ConfigurationWrapper(host));
                null,
            });
import org.jkiss.dbeaver.ui.UIIcon;
        configuration.setProperty(SSHConstants.PROP_SHARE_TUNNELS, enableTunnelSharingCheck.getSelection());
                    updateConfigurationSelection(configurations.get(CommonUtils.clamp(index, 0, configurations.size() - 1)));
        if (auth instanceof SSHAuthConfiguration.KeyFile keyFile && keyFile.path().isBlank() ||
                UIUtils.createControlLabel(this, SSHUIMessages.model_ssh_configurator_label_host_ip);

            }, null);
            );
            final SSHHostConfiguration configuration = wrapper.configuration;
            final ViewerColumnController<Object, ConfigurationWrapper> controller = new ViewerColumnController<>("ssh_hosts", hostsViewer);
                    GeneralUtils.makeExceptionStatus(ex.getTargetException())
    public String getErrorMessage() {

            .toArray(SSHHostConfiguration[]::new);
    }
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
        keepAliveText.setText(String.valueOf(configuration.getIntProperty(SSHConstants.PROP_ALIVE_INTERVAL)));
        }
                updateConfigurationSelection(created);
                    dataSource,
                setNumberEditStyles(hostPortText);
        private ConfigurationWrapper() {
            configuration.setProperty(SSHConstants.PROP_ALIVE_INTERVAL, null);
        }
            hostsViewer.addSelectionChangedListener(e -> {
            } else if (configuration.auth() instanceof SSHAuthConfiguration.Agent) {
                null,
                case PUBLIC_KEY -> {
        }
            }
            fingerprintVerificationCheck = UIUtils.createCheckbox(
        }
        } else {
                SSHUIMessages.model_ssh_configurator_label_bypass_verification,
        if (credentialsPanel.lastConfiguration != null) {
            });
    }
        // Validate the current configuration first so that we get real-time feedback
        int remotePort = CommonUtils.toInt(remotePortSpinner.getText());
                this,
                    String authTypeName = configuration.getStringProperty("authType");
        ) {
            @NotNull Composite parent,
                    ? SSHUIMessages.model_ssh_dialog_credentials_passphrase
                    public void widgetSelected(SelectionEvent e) {
            protected void execute(@NotNull DBRProgressMonitor monitor) throws Throwable {
            );
        if (configuration.hostname().isBlank()) {
            hostsComposite = new ExpandableComposite(composite, SWT.NONE);
        } catch (Exception e) {
    private CredentialsPanel credentialsPanel;
                        passwordText.setEnabled(savePasswordCheckbox.getSelection());
                    propertyChangeListener.run();
    }
        if (credentialsPanel.lastConfiguration != null) {
                savePasswordCheckbox.addSelectionListener(new SelectionAdapter() {
    private boolean isDestinationHost(@NotNull ConfigurationWrapper wrapper) {
import org.eclipse.ui.forms.events.ExpansionAdapter;
            });
 * You may obtain a copy of the License at
        enableTunnelSharingCheck.setSelection(configuration.getBooleanProperty(SSHConstants.PROP_SHARE_TUNNELS, true));
        private final Text passwordText;

            final ToolBar toolBar = new ToolBar(client, SWT.FLAT | SWT.HORIZONTAL);
        String implLabel = tunnelImplCombo.getText();
    }
                    );
                }

                    showPasswordField(true, SSHUIMessages.model_ssh_configurator_label_passphrase);
                final SSHAuthConfiguration auth = wrapper.configuration.auth();
            {


        final String[] tunnelVersions = new String[2];
                SSHUIMessages.model_ssh_configurator_label_tunnel_timeout,
                hostPortText = UIUtils.createLabelText(hostPortComp, SSHUIMessages.model_ssh_configurator_label_port, String.valueOf(SSHConstants.DEFAULT_PORT));

            return selector;
        hostsViewer.setSelection(new StructuredSelection(wrapper), true);

                        return;
                    }
            final String message = validateConfiguration(wrapper.configuration);
/**
            final ToolItem createItem = UIUtils.createToolItem(toolBar, "Create new jump host", UIIcon.ROW_ADD, SelectionListener.widgetSelectedAdapter(e -> {
            this.configuration = new SSHHostConfiguration(
    private Text localHostText;
                    "Are you sure you want to delete host '" + host.configuration.toDisplayString() + "'?"
                final int index = configurations.indexOf(host);

            );
        private void updateAuthMethodVisibility() {
            }
        };
        GridData gdt = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING
                SWT.DROP_DOWN | SWT.READ_ONLY

            if (passwordLabelText != null) {
            authMethodCombo.add(SSHUIMessages.model_ssh_configurator_combo_agent);
                portForwardingGroup,
                hostNameText.setEditable(false);
    }
                    try {
 * Copyright (C) 2010-2026 DBeaver Corp and others
            final Composite client = new Composite(group, SWT.NONE);
                () -> {

            for (SSHHostConfiguration host : SSHUtils.loadHostConfigurations(configuration, false)) {
                false
                        final SSHHostConfiguration updated = credentialsPanel.saveSettings();
                Composite passComp = UIUtils.createComposite(this, 2);
            tunnelImplCombo = UIUtils.createLabelCombo(
        }

                } finally {
                SSHUIMessages.model_ssh_dialog_credentials_username,
                hostNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            configuration.setProperty(SSHConstants.PROP_BYPASS_HOST_VERIFICATION, null);
            configuration.setProperty(SSHConstants.PROP_ALIVE_INTERVAL, kaInterval);
                    UIUtils.resizeShell(parent.getShell());
                    if (!configuration.isSavePassword() && tunnel.getRequiredCredentials(configuration) != DBWTunnel.AuthCredentials.NONE) {

                SWT.BORDER,
    public void createControl(@NotNull Composite parent, Object object, @NotNull Runnable propertyChangeListener) {
            UIUtils.setControlVisible(passwordText.getParent(), show);
            });
        }
 *
                SSHUIMessages.model_ssh_configurator_label_share_tunnels_description,
 * See the License for the specific language governing permissions and
        localHostText.setText(CommonUtils.notEmpty(configuration.getStringProperty(SSHConstants.PROP_LOCAL_HOST)));
import org.jkiss.dbeaver.utils.GeneralUtils;

                timeoutsGroup,
        private void showPasswordField(boolean show, String passwordLabelText) {

import org.eclipse.swt.widgets.*;
                SSHUIMessages.model_ssh_configurator_group_timeouts_text,
                savePasswordCheckbox = UIUtils.createCheckbox(passComp, SSHUIMessages.model_ssh_configurator_checkbox_save_pass, false);

            authMethodCombo = UIUtils.createLabelCombo(this, SSHUIMessages.model_ssh_configurator_combo_auth_method, SWT.DROP_DOWN | SWT.READ_ONLY);
                e
                    } else {
            localPortSpinner.setToolTipText(SSHUIMessages.model_ssh_configurator_label_local_port_description);
            localHostText.setToolTipText(SSHUIMessages.model_ssh_configurator_label_local_host_description);
                @Override
                public void expansionStateChanged(ExpansionEvent e) {
                        secured ? "" : getText()
                @Override
import java.util.ArrayList;
                    return "Agent";
            privateKeyLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
import org.jkiss.dbeaver.utils.HelpUtils;
                hostNameText.addModifyListener(listener);
                DBWorkbench.getPlatformUI().showError(
        private SSHConstants.AuthType getAuthMethod() {
            userNameText = UIUtils.createLabelText(this, SSHUIMessages.model_ssh_configurator_label_user_name, null, SWT.BORDER, new GridData(GridData.FILL_HORIZONTAL));

        }
                pfWrapper,

            String hint = SSHUIMessages.model_ssh_configurator_variables_hint_label;
        private void showPrivateKeyField(boolean show) {
            remoteHostText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    private VariablesHintLabel variablesHintLabel;


            };
            return DBWorkbench.getPlatformUI().promptUserCredentials(

        UIUtils.asyncExec(() -> UIUtils.resizeShell(parent.getShell()));

    private Text keepAliveText;
            };
                        if (!last.configuration.equals(updated)) {
            }
                generalGroup,
                    return EditTextDialog.editText(
            });
            controller.addColumn("Host", "Host name", SWT.LEFT, true, true, wrapper -> {
                });
            MessageDialog.openInformation(credentialsPanel.getShell(), ModelMessages.dialog_connection_wizard_start_connection_monitor_success,
                }
            final String hostname = hostNameText.getText().trim();
        if (remotePort <= 0) {
            userNameText.addModifyListener(listener);
                @Override
            }
                SSHUIMessages.model_ssh_dialog_credentials,

        public void loadSettings(@NotNull ConfigurationWrapper wrapper, boolean forceSavePassword) {

                            last.configuration = updated;
                false,

            remoteHostText.setToolTipText(SSHUIMessages.model_ssh_configurator_label_remote_host_description);
                    monitor.worked(1);
    }
            if (editIntention == DBPConnectionEditIntention.CREDENTIALS_ONLY) {
                portForwardingGroup,
            }));
import org.eclipse.jface.viewers.ArrayContentProvider;

            }
                authMethodCombo.select(SSHConstants.AuthType.PUBLIC_KEY.ordinal());
    private void refreshActiveConfiguration() {
import org.jkiss.dbeaver.ui.controls.ConfigurationFileSelector;
                        loadingConfiguration = false;
        if (kaInterval <= 0) {
                    moveDownItem.setEnabled(index < count - 1);
        if (CommonUtils.isEmpty(implType)) {

        final Composite composite = new Composite(parent, SWT.NONE);
                passwordLabel.setText(passwordLabelText);
            return SSHConstants.AuthType.values()[authMethodCombo.getSelectionIndex()];
                2
        }
                    } finally {
            {
                configurations.set(index + 1, host);
            DBWorkbench.getPlatformUI().showError(
    @Nullable
                try {
            group.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
            controller.createColumns(true);
            if (isDistributed) {
import org.jkiss.dbeaver.registry.configurator.DBPConnectionEditIntention;
            ));
            return null;

import org.jkiss.dbeaver.model.net.DBWTunnel;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.net.ssh.registry.SSHSessionControllerRegistry;
            localPortSpinner = UIUtils.createLabelText(
                    refreshActiveConfiguration();
            configuration.setProperty(SSHConstants.PROP_REMOTE_PORT, remotePort);
                new SSHAuthConfiguration.Password("", true)
            var wrapper = (ConfigurationWrapper) hostsViewer.getStructuredSelection().getFirstElement();
        composite.setLayoutData(gridData);
import org.eclipse.jface.viewers.TableViewer;

            tunnelTimeout = UIUtils.createLabelText(
            }
            privateKeyLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
            );
                    final int index = configurations.indexOf(host);
                    propertyChangeListener.run();


        @NotNull
        {
            privateKeyLabel = UIUtils.createControlLabel(this, SSHUIMessages.model_ssh_configurator_label_private_key);
    ) {
import org.eclipse.jface.layout.GridLayoutFactory;
                passwordText = new Text(passComp, SWT.BORDER | SWT.PASSWORD);
            hostsComposite.setClient(client);
                    final int count = configurations.size();
                },
            Composite controlGroup = UIUtils.createComposite(parent, 3);
            @NotNull Runnable propertyChangeListener,
            auth instanceof SSHAuthConfiguration.KeyData keyData && keyData.data().isBlank()
                SSHUIMessages.model_ssh_configurator_dialog_choose_private_key, new String[]{"*", "*.ssh", "*.pem", "*.*"},
                case AGENT -> {
            }
                        loadConfiguration(current);

                if (switchingConfiguration) {


            final ModifyListener listener = e -> propertyChangeListener.run();
                }
import org.eclipse.swt.events.ModifyListener;
            return new SSHHostConfiguration(username, hostname, port, auth);
            remotePortSpinner = UIUtils.createLabelText(
                        secured ? SSHUIMessages.model_ssh_dialog_set_private_key : SSHUIMessages.model_ssh_dialog_edit_private_key,
            variablesHintLabel.setResolver(
    private void testTunnelConnection() {
                        tunnelVersions[1] = tunnel.getImplementation().getServerVersion();
            switch (getAuthMethod()) {
                        return;
                    if (last != null && last != current) {
    private final List<ConfigurationWrapper> configurations = new ArrayList<>();
                savePasswordCheckbox.setSelection(savePassword);
        for (ConfigurationWrapper wrapper : configurations) {
                @Override
            }, null);

                    : SSHUIMessages.model_ssh_dialog_credentials_password,
            );

            }
                    }
                String.valueOf(SSHConstants.DEFAULT_CONNECT_TIMEOUT)
                        tunnelVersions[0] = tunnel.getImplementation().getClientVersion();
        DBWHandlerConfiguration configuration = new DBWHandlerConfiguration(savedConfiguration);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private Button enableTunnelSharingCheck;
                }
                passwordText.setText(CommonUtils.notEmpty(password.password()));
                settingsGroup,
        return null;

            configuration.resolveDynamicVariables(SystemVariablesResolver.INSTANCE);
                hostPortText.setEditable(false);

                if (DBWorkbench.getPlatformUI().confirmAction(

                    if (current == null) {
    }



            configuration.setProperty(SSHConstants.PROP_CONNECT_TIMEOUT, conTimeout);
                final boolean savePassword = canEditCredentialsPerPolicy && (forceSavePassword || password.savePassword());
            userNameText.setText(configuration.username());
        }
import org.jkiss.utils.CommonUtils;
            variablesHintLabel = new VariablesHintLabel(controlGroup, hint, hint, DBPConnectionConfiguration.INTERNAL_CONNECT_VARIABLES,
            remoteHostText = UIUtils.createLabelText(

import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;

                passComp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        @NotNull
        try {
                    monitor.subTask("Initialize tunnel");
                    createItem.setEnabled(count < SSHConstants.MAX_JUMP_SERVERS);
import java.util.Collections;
                new DataSourceVariableResolver(
                        monitor.subTask("Close tunnel");
package org.jkiss.dbeaver.ui.net.ssh;
    private DBWHandlerConfiguration savedConfiguration;
        }
        DBPDataSourceContainer dataSource = configuration.getDataSource();

                }
import org.jkiss.dbeaver.runtime.AbstractTrackingJob;
            }

            }
                }
            group.addExpansionListener(new ExpansionAdapter() {
        }
                    ShellUtils.launchProgram(HelpUtils.getHelpExternalReference("SSH-Configuration"));
                final ConfigurationWrapper host = (ConfigurationWrapper) hostsViewer.getStructuredSelection().getFirstElement();
                        }
                false,
                SSHUIMessages.model_ssh_configurator_group_general_text,
            if (it.getLabel().equals(implLabel)) {
                portForwardingGroup,

                false
                }
        if (dataSource != null) {
        final SSHAuthConfiguration auth = configuration.auth();
import org.jkiss.code.NotNull;
                case PASSWORD -> new SSHAuthConfiguration.Password(password, savePassword);
import org.jkiss.dbeaver.ui.dialogs.EditTextDialog;
            }, null);
                dataSource.getConnectionConfiguration()
        }
        private final Text hostPortText;
        ) {
                }
        composite.setLayout(new GridLayout(1, false));
                hostPortText.addModifyListener(listener);
import java.lang.reflect.InvocationTargetException;
                composite,
                    if (DBWorkbench.isDistributed()) {
        @Nullable String username,
        DBPDataSourceContainer dataSource = savedConfiguration.getDataSource();
        }
            hostNameText.setText(configuration.hostname());
import org.jkiss.dbeaver.model.net.ssh.SSHUtils;
        return getErrorMessage() == null;
                SSHConstants.DEFAULT_USER_NAME,
                public void widgetSelected(SelectionEvent e) {
            });
                @Nullable
        public SSHHostConfiguration saveSettings() {
            client.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            authMethodCombo.addSelectionListener(new SelectionAdapter() {
            }
public class SSHTunnelDefaultConfiguratorUI implements IObjectPropertyConfigurator<Object, DBWHandlerConfiguration> {
                public void widgetSelected(SelectionEvent e) {
                return message;
                        // Close it
            if (message != null) {
                4,
import org.jkiss.dbeaver.runtime.DBWorkbench;
            final ToolItem moveUpItem = UIUtils.createToolItem(toolBar, "Move up", UIIcon.ARROW_UP, SelectionListener.widgetSelectedAdapter(e -> {
            setNumberEditStyles(keepAliveText);
                        tunnel.closeTunnel(monitor);
                hostNameText = new Text(hostPortComp, SWT.BORDER);
        try {
        return configurations.get(configurations.size() - 1).equals(wrapper);
        String implType = configuration.getStringProperty(SSHConstants.PROP_IMPLEMENTATION);
    @Nullable
                case PUBLIC_KEY -> {

            hostsViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
                );
            );
                    final ConfigurationWrapper current = (ConfigurationWrapper) e.getStructuredSelection().getFirstElement();
            configuration.setProperty(SSHConstants.PROP_REMOTE_PORT, null);
                        }
            );
            group.setClient(client);
        }
        if (localPort <= 0) {

        try {
            tunnelImplCombo.setText("SSHJ");
                }
            hostsViewer.getTable().setHeaderVisible(true);
            authMethodCombo.add(SSHUIMessages.model_ssh_configurator_combo_pub_key);
import org.eclipse.jface.layout.GridDataFactory;
                @Override
                    monitor.done();
            updateAuthMethodVisibility();
                configuration.setProperty(SSHConstants.PROP_IMPLEMENTATION, it.getId());
                String.valueOf(0)
            Composite timeoutsGroup = UIUtils.createTitledComposite(
        int localPort = CommonUtils.toInt(localPortSpinner.getText());
                isDistributed

import org.eclipse.swt.layout.GridLayout;
        }
                null,

                final ConfigurationWrapper host = (ConfigurationWrapper) hostsViewer.getStructuredSelection().getFirstElement();
                    final ConfigurationWrapper last = credentialsPanel.lastConfiguration;
                    return "Password";
            @Override
                    }
                DBPConnectionEditIntention.DEFAULT
            final ExpandableComposite group = new ExpandableComposite(composite, SWT.NONE);
        }
        text.addVerifyListener(UIUtils.getNumberVerifyListener(Locale.ENGLISH));
        {
                SSHUIMessages.model_ssh_configurator_label_remote_port,

            lastConfiguration = wrapper;
                SSHUIMessages.model_ssh_configurator_label_remote_host,
        @NotNull SSHConstants.AuthType type,
                updateConfigurationSelection(host);

                    } finally {
            if (tunnelImplCombo.getSelectionIndex() == -1) {


            }));

    }
            tunnelImplCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
        // Then validate all remaining configurations
            final SSHAuthConfiguration auth = switch (getAuthMethod()) {
            .isPolicyEnabled(ApplicationPolicyProvider.POLICY_CREDENTIALS_EDIT);
            tunnelImplCombo.addSelectionListener(new SelectionAdapter() {
                hostsViewer.refresh(wrapper);

                        yield new SSHAuthConfiguration.KeyData(privateKey, password, savePassword);
import org.eclipse.swt.events.SelectionListener;
            final int port = CommonUtils.toInt(hostPortText.getText().trim());
            if (message != null) {
                return message;
        } catch (DBException e) {
                    UIUtils.resizeShell(parent.getShell());
                    deleteItem.setEnabled(count > 1);
            client.setLayout(GridLayoutFactory.fillDefaults().spacing(0, 0).create());

        private final Combo authMethodCombo;
import org.jkiss.dbeaver.DBException;
            UIUtils.setControlVisible(enableTunnelSharingCheck, !SSHUtils.DISABLE_SESSION_SHARING);
                tunnelImplCombo.add(it.getLabel());

            }
                new GridData(GridData.FILL_HORIZONTAL)
import org.jkiss.code.Nullable;

        }
            }
        {
            final String message = validateConfiguration(credentialsPanel.saveSettings());
                type.equals(SSHConstants.AuthType.PUBLIC_KEY)
                }
        private ConfigurationWrapper lastConfiguration;
import org.jkiss.dbeaver.model.net.ssh.registry.SSHSessionControllerDescriptor;
        }
                try {
                authMethodCombo.select(SSHConstants.AuthType.PUBLIC_KEY.ordinal());
                GridData.VERTICAL_ALIGN_FILL
        private SSHHostConfiguration configuration;
        } else {
                    }
            );
                }
        private final ConfigurationFileSelector privateKeyText;
        }
    private Text remoteHostText;
        saveSettings(configuration);
        }
                SWT.BORDER,
 * Licensed under the Apache License, Version 2.0 (the "License");
                final ConfigurationWrapper host = (ConfigurationWrapper) hostsViewer.getStructuredSelection().getFirstElement();
            );

import org.eclipse.jface.dialogs.MessageDialog;
import org.jkiss.dbeaver.utils.SystemVariablesResolver;
        } else {
                continue;
        SSHUtils.saveHostConfigurations(configuration, hosts);
            if (configuration.auth() instanceof SSHAuthConfiguration.WithPassword password) {
    private boolean switchingConfiguration;
            hostsViewer.setInput(configurations);
                monitor.beginTask("Instantiate SSH tunnel", 2);
                authMethodCombo.setEnabled(false);
    @Nullable
            configuration.setProperty(SSHConstants.PROP_LOCAL_PORT, null);
        }
                CommonUtils.notEmpty(username),

    }
    private Text remotePortSpinner;
                }
        if (fingerprintVerificationCheck.getSelection()) {
        UIUtils.executeOnResize(parent, () -> parent.getParent().layout(true, true));

            setNumberEditStyles(localPortSpinner);


            super(parent, SWT.NONE);
import org.jkiss.dbeaver.ui.ShellUtils;

            authMethodCombo.getShell().layout(true, true);
            Composite settingsGroup = UIUtils.createTitledComposite(
import org.jkiss.dbeaver.ui.controls.VariablesHintLabel;
    public boolean isComplete() {
                }

                SSHUIMessages.model_ssh_configurator_label_local_port,
            client.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
                        // Get info


            DBWorkbench.getPlatformUI().showError("SSH configuration", "Unable to load SSH configuration due to an error", e);

                Composite hostPortComp = UIUtils.createComposite(this, 3);
                final ConfigurationWrapper created = new ConfigurationWrapper();
        gdt.widthHint = UIUtils.getFontHeight(text) * 7;
                        yield new SSHAuthConfiguration.KeyFile(privateKey, password, savePassword);
                selector.getTextControl().setEditable(false);
            }, null);
                ));

                configurations.add(configurations.indexOf(host), created);
                            hostsViewer.refresh(last);
            localHostText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                true,
                    showPrivateKeyField(true);
                            configuration.setPassword(dbpAuthInfo.getUserPassword());
                SSHUIMessages.model_ssh_configurator_group_settings,
            passwordLabel = UIUtils.createControlLabel(this, SSHUIMessages.model_ssh_configurator_label_password);
            for (SSHSessionControllerDescriptor it : SSHSessionControllerRegistry.getInstance().getDescriptors()) {
                    SSHConstants.AuthType authType = CommonUtils.valueOf(SSHConstants.AuthType.class, authTypeName, SSHConstants.AuthType.PASSWORD);
                )) {

            keepAliveText = UIUtils.createLabelText(
}
            } else if (configuration.auth() instanceof SSHAuthConfiguration.KeyFile key) {
        private final Text hostNameText;

                public void widgetSelected(SelectionEvent e) {
    private static DBPAuthInfo promptCredentialsDialog(
        private final Label passwordLabel;
            hostsComposite.addExpansionListener(new ExpansionAdapter() {
    public void saveSettings(@NotNull DBWHandlerConfiguration configuration) {
            final Composite client = new Composite(hostsComposite, SWT.BORDER);
                portForwardingGroup,
        }
        private final Text userNameText;
            // Try SSHJ by default
                    dataSource.getConnectionConfiguration()
            );
    private TableViewer hostsViewer;
        savedConfiguration = new DBWHandlerConfiguration(configuration);
import org.jkiss.dbeaver.model.connection.DBPAuthInfo;
    }
        private final Button savePasswordCheckbox;
            @NotNull DBPConnectionEditIntention editIntention
            );
                    try {
 */

        var job = new AbstractTrackingJob("Test tunnel connection") {

                    }

import org.jkiss.dbeaver.model.net.ssh.config.SSHAuthConfiguration;
    static class ConfigurationWrapper {

                public void expansionStateChanged(ExpansionEvent e) {
    @Override
                configurations.set(index, configurations.get(index + 1));

                public void widgetSelected(SelectionEvent e) {
            Composite portForwardingGroup = UIUtils.createTitledComposite(
                    null,
                switchingConfiguration = true;


                        if (dbpAuthInfo != null) {
        }
        fingerprintVerificationCheck.setSelection(configuration.getBooleanProperty(SSHConstants.PROP_BYPASS_HOST_VERIFICATION));
        }

    private Button fingerprintVerificationCheck;
            UIUtils.createLink(controlGroup, SSHUIMessages.model_ssh_configurator_ssh_documentation_link, new SelectionAdapter() {
                false,
            );
                        monitor.worked(1);
            if (configuration.auth() instanceof SSHAuthConfiguration.Password) {

        @Nullable String password
import org.eclipse.swt.events.SelectionEvent;

        configuration.setProperties(Collections.emptyMap());
            authMethodCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
        }
            Composite generalGroup = UIUtils.createTitledComposite(
    private void loadConfiguration(@NotNull ConfigurationWrapper wrapper) {
import org.eclipse.swt.events.SelectionAdapter;
            } else {
    private static void setNumberEditStyles(Text text) {
                configurations.set(index, configurations.get(index - 1));
            selector.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            localHostText = UIUtils.createLabelText(
            boolean isDistributed = DBWorkbench.isDistributed();
            final String username = userNameText.getText().trim();


    private boolean loadingConfiguration;

            hostPortText.setText(String.valueOf(configuration.port()));
                client,
                    }
        tunnelTimeout.setText(String.valueOf(configuration.getIntProperty(SSHConstants.PROP_CONNECT_TIMEOUT)));
        }
    }
 *
import org.eclipse.ui.forms.events.ExpansionEvent;
                }
import java.util.Locale;
                    testTunnelConnection();
                    final int index = configurations.indexOf(current);
                SSHUIMessages.model_ssh_configurator_label_implementation,
            .map(wrapper -> wrapper.configuration)
            UIUtils.createLabelSeparator(client, SWT.HORIZONTAL);
            );
                } else {

    }
                case AGENT -> new SSHAuthConfiguration.Agent();
import org.eclipse.swt.layout.GridData;

    }
        if (dataSource != null) {
            final boolean savePassword = savePasswordCheckbox.getSelection();
                savePasswordCheckbox.setEnabled(canEditCredentialsPerPolicy && !forceSavePassword);
            pfWrapper.setLayoutData(GridDataFactory.create(GridData.FILL_HORIZONTAL).span(2, 1).create());
 * Unless required by applicable law or agreed to in writing, software
            if (desc != null) {
