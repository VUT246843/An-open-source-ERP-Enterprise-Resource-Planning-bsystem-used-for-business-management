import org.jkiss.dbeaver.DBException;
    @Override
            // NOTE: If acquireSession fails, all previously acquired sessions will not be released. Not sure if it's a problem.
 * you may not use this file except in compliance with the License.
        @NotNull DBRProgressMonitor monitor,
            case SSHAuthConfiguration.KeyData key ->
        @NotNull DBPConnectionConfiguration connectionInfo
        connectionInfo = new DBPConnectionConfiguration(connectionInfo);
    public SSHSession getImplementation() {
            }
    }
        @NotNull DBWHandlerConfiguration configuration,
    public DBPConnectionConfiguration initializeHandler(
                : 0;
            implId = DEF_IMPLEMENTATION;
                dataSource.getContainer().getPreferenceStore().getInt(ModelPreferences.CONNECTION_VALIDATION_TIMEOUT)
    }
        return session;
            monitor.done();
    public SSHSessionController getController() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            descriptor = SSHSessionControllerRegistry.getInstance().getDescriptor(DEF_IMPLEMENTATION);
                SSHUtils.isKeyFileEncrypted(key.path()) ? AuthCredentials.PASSWORD : AuthCredentials.NONE;
            } catch (Exception e1) {
                log.debug("Error releasing SSH session controller", e);

}

            case SSHAuthConfiguration.WithPassword password when password.savePassword() -> AuthCredentials.NONE;
    @Override
 * See the License for the specific language governing permissions and
    public void closeTunnel(@NotNull DBRProgressMonitor monitor) throws DBException {
    @NotNull
import org.jkiss.dbeaver.model.exec.DBCInvalidatePhase;
        this.listeners.clear();
        if (CommonUtils.isEmpty(implId)) {
public class SSHTunnelImpl implements DBWTunnel {

    private static final String DEF_IMPLEMENTATION = "sshj";
    }
        }
    public boolean matchesParameters(@NotNull String host, int port) {
        return initTunnel(monitor, configuration, connectionInfo, controller);
            listener.run();
                hosts[index],

        @NotNull DBPConnectionConfiguration connectionInfo,
        String sshRemoteHost = CommonUtils.toString(configuration.getProperty(SSHConstants.PROP_REMOTE_HOST));
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void addCloseListener(@NotNull Runnable listener) {
 */

        // TODO: Check jump hosts as well
            throw new DBException("Error invalidating SSH tunnel", e);
                closeTunnel(monitor);

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.utils.Base64;
    @Override
        session = sessions[sessions.length - 1];
    ) throws DBException {
        final SSHHostConfiguration[] hosts = SSHUtils.loadHostConfigurations(configuration, false);
 * Copyright (C) 2010-2025 DBeaver Corp and others
            log.debug("Error invalidating SSH tunnel. Closing.", e);
            );

package org.jkiss.dbeaver.model.net.ssh;
    @Override
import org.jkiss.code.NotNull;
                monitor,
 *
                SSHUtils.isKeyEncrypted(Base64.decode(key.data())) ? AuthCredentials.PASSWORD : AuthCredentials.NONE;
    }
        final SSHHostConfiguration host = hosts[hosts.length - 1];
        return controller.getDependentDataSources(session);
        try {
                configuration,
            throw new DBException("Can't find SSH tunnel implementation '" + implId + "'");
    @Nullable
        final SSHHostConfiguration[] hosts = SSHUtils.loadHostConfigurations(configuration, true);
            controller = descriptor.getInstance();
            try {
        SSHSessionControllerDescriptor descriptor = SSHSessionControllerRegistry.getInstance().getDescriptor(implId);
    @NotNull

    @Nullable
    ) {
import org.jkiss.dbeaver.model.net.ssh.config.SSHHostConfiguration;
import org.jkiss.dbeaver.ModelPreferences;
        }
        int sshLocalPort = configuration.getIntProperty(SSHConstants.PROP_LOCAL_PORT);
        }
        return switch (host.auth()) {
                monitor,
import org.jkiss.code.Nullable;
        return new SSHPortForwardConfiguration(sshLocalHost, sshLocalPort, sshRemoteHost, sshRemotePort);
        return false;
    public DBPDataSourceContainer[] getDependentDataSources() {
        if (sshRemotePort == 0 && configuration.getDriver() != null) {
    @NotNull
        for (int index = 0; index < hosts.length; index++) {
                configuration,

        if (descriptor == null) {
import java.util.ArrayList;
    public void invalidateHandler(
        if (sshLocalPort == 0) {
        @NotNull DBRProgressMonitor monitor,
    private SSHSessionController controller;
            int timeout = container != null
            );
import org.jkiss.dbeaver.model.net.DBWUtils;
        int sshRemotePort = configuration.getIntProperty(SSHConstants.PROP_REMOTE_PORT);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.Log;
        String implId = configuration.getStringProperty(SSHConstants.PROP_IMPLEMENTATION);

        if (session == null) {
 *
    private DBWHandlerConfiguration configuration;

        final SSHPortForwardConfiguration portForward = loadPortForwardConfiguration(configuration, connectionInfo);
 * You may obtain a copy of the License at
    }
import org.jkiss.dbeaver.model.net.ssh.config.SSHAuthConfiguration;
        }
                controller.release(monitor, session, configuration, timeout);

        @NotNull SSHSessionController controller

        if (descriptor == null) {
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
import org.jkiss.dbeaver.model.net.ssh.config.SSHPortForwardConfiguration;
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
            return sshPort == port;
 * DBeaver - Universal Database Manager

        @NotNull DBPDataSource dataSource,
    public AuthCredentials getRequiredCredentials(@NotNull DBWHandlerConfiguration configuration) throws DBException {
            case SSHAuthConfiguration.KeyFile key ->
    }

            DBPDataSourceContainer container = configuration.getDataSource();
    }
        @NotNull DBCInvalidatePhase phase
            default -> AuthCredentials.CREDENTIALS;
import org.jkiss.dbeaver.model.net.DBWTunnel;
    private static SSHPortForwardConfiguration loadPortForwardConfiguration(
import java.util.List;
        String sshLocalHost = CommonUtils.toString(configuration.getProperty(SSHConstants.PROP_LOCAL_HOST));
        @NotNull DBPConnectionConfiguration connectionInfo

            sshLocalPort = SSHUtils.findFreePort();
        if (!configuration.isEnabled() || !configuration.isSecured()) {
/**
    @Override
            return;
            }
 * limitations under the License.
import org.jkiss.utils.CommonUtils;
            monitor.subTask("Invalidate SSH tunnel");
    @NotNull

                index == hosts.length - 1 ? portForward : null
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        @NotNull DBWHandlerConfiguration configuration,
            int sshPort = configuration.getIntProperty(DBWHandlerConfiguration.PROP_PORT);

        final SSHSession[] sessions = new SSHSession[hosts.length];
    private static final Log log = Log.getLog(SSHTunnelImpl.class);
        }
        }

import org.jkiss.dbeaver.model.net.ssh.registry.SSHSessionControllerDescriptor;
        @NotNull DBWHandlerConfiguration configuration,
    ) throws DBException {
            sessions[index] = controller.acquireSession(
 * Unless required by applicable law or agreed to in writing, software

            case SSHAuthConfiguration.Agent ignored -> AuthCredentials.NONE;
        @NotNull DBRProgressMonitor monitor,

    @Override

    }
        this.configuration = configuration;
    @Override
        }

            sshRemotePort = CommonUtils.toInt(connectionInfo.getHostPort());
 *
    @NotNull
        } catch (DBException e) {
                session,
                index != 0 ? sessions[index - 1] : null,
        }
        if (session != null) {


import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        } finally {
    @Override
    ) throws DBException {
            controller.invalidate(
            try {

        } catch (DBException e) {
        }

            throw new DBException("Can't create SSH tunnel implementation '" + implId + "'", e);
                ? container.getPreferenceStore().getInt(ModelPreferences.CONNECTION_VALIDATION_TIMEOUT)
        }
        }
        this.listeners.add(listener);
        }
            return AuthCredentials.NONE;
        };
                phase,
import org.jkiss.dbeaver.model.DBPDataSource;
        try {
        DBWUtils.updateConfigWithTunnelInfo(configuration, connectionInfo, portForward.localHost(), portForward.localPort());
 * SSH tunnel
        }
        return connectionInfo;
    private DBPConnectionConfiguration initTunnel(
            } catch (DBException e) {
    private final List<Runnable> listeners = new ArrayList<>();
/*
        for (Runnable listener : this.listeners) {
        if (CommonUtils.isEmpty(sshRemoteHost)) {


            sshRemoteHost = CommonUtils.notEmpty(connectionInfo.getHostName());
        return controller;
    private SSHSession session;
    }
                log.error("Error closing broken tunnel", e1);
import org.jkiss.dbeaver.model.net.ssh.registry.SSHSessionControllerRegistry;
        if (host.equals(configuration.getStringProperty(DBWHandlerConfiguration.PROP_HOST))) {
            // Backward compatibility
