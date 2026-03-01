        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.DBException;
        ) {

    private static class FilterLoggerFactory implements LoggerFactory {
 * Unless required by applicable law or agreed to in writing, software
        @Override

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }

import com.jcraft.jsch.Identity;

import net.schmizz.sshj.SSHClient;
            if (CommonUtils.isEmpty(key.password())) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    throw new DBException("SSH public key (encrypted) authentication failed", e);
    @Override
}
            final PasswordFinder finder = CommonUtils.isEmpty(key.password())
            try {
import org.jkiss.dbeaver.model.net.ssh.config.SSHAuthConfiguration;
            throw new DBException("Error establishing SSHJ tunnel", e);
    ) throws IOException {
import net.schmizz.sshj.userauth.method.AuthMethod;
        public Logger getLogger(String s) {
        final SSHAuthConfiguration auth = host.auth();
            SSHConstants.PROP_CONNECT_TIMEOUT,
 * you may not use this file except in compliance with the License.
            }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.Log;
            } catch (Throwable e) {
import net.schmizz.sshj.userauth.password.PasswordFinder;
        monitor.subTask(String.format("Instantiate tunnel to %s:%d", host.hostname(), host.port()));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                try {
        if (DBWorkbench.getPlatform().getApplication().isHeadlessMode() ||
            log.debug("Error loading known hosts: " + e.getMessage());
    }
import org.jkiss.code.NotNull;
        try {
 *
        }
                } catch (Throwable e) {
        } else if (auth instanceof SSHAuthConfiguration.KeyData key) {
                }

 * limitations under the License.
import org.slf4j.Logger;
        @NotNull DBWHandlerConfiguration configuration,
                return org.slf4j.LoggerFactory.getLogger(s);

                    throw new DBException("SSH public key authentication failed", e);
        } else {
            client.addHostKeyVerifier(new KnownHostsVerifier(SSHUtils.getKnownSshHostsFileOrDefault(), actualHostConfiguration));
    private static final Log log = Log.getLog(SSHJSessionController.class);
        }
import java.util.List;
            final List<AuthMethod> methods = new ArrayList<>();

            } catch (Throwable e) {
        final SSHClient client = new SSHClient();
        } else if (auth instanceof SSHAuthConfiguration.KeyFile key) {
        } catch (IOException e) {
 * See the License for the specific language governing permissions and
import org.slf4j.helpers.NOPLogger;
                return NOPLogger.NOP_LOGGER;
        return client;


        @NotNull SSHHostConfiguration host
                }
            try {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                client.authPassword(host.username(), password.password());
            } else {
        } catch (Exception e) {
    @NotNull
            client.getTransport().getConfig().setVerifyHostKeyCertificates(false);
            }
        final int keepAliveInterval = configuration.getIntProperty(SSHConstants.PROP_ALIVE_INTERVAL) / 1000; // sshj uses seconds for keep-alive interval
            try {
        } else if (auth instanceof SSHAuthConfiguration.Agent) {
            if (FILTERED_OUT_CLASSES.contains(s)) {
                try {
    @NotNull
        @Override
            }
        client.setConnectTimeout(connectTimeout);

    }
        final int connectTimeout = configuration.getIntProperty(
                    client.authPublickey(host.username(), client.loadKeys(key.path(), key.password().toCharArray()));
        client.getTransport().getConfig().setLoggerFactory(new FilterLoggerFactory());
                throw new DBException("SSH public key authentication failed", e);
import org.jkiss.dbeaver.runtime.DBWorkbench;
public class SSHJSessionController extends AbstractSessionController<SSHJSession> {

import java.util.Set;

import net.schmizz.sshj.userauth.password.PasswordUtils;
    private static void setupHostKeyVerification(
 *
        client.loadKnownHosts();
                throw new DBException("SSH password authentication failed", e);
                ? null
 *
            configuration.getBooleanProperty(SSHConstants.PROP_BYPASS_HOST_VERIFICATION)
        @NotNull SSHClient client,
                for (Object identity : createAgentIdentityRepository().getIdentities()) {
import net.schmizz.sshj.common.LoggerFactory;
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
import java.util.ArrayList;
            setupHostKeyVerification(client, configuration, host);
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
 */

            } else {
            }
import net.schmizz.sshj.transport.verification.PromiscuousVerifier;
        }

            return getLogger(cls.getName());
import java.io.IOException;
/*
            SSHConstants.DEFAULT_CONNECT_TIMEOUT);
        public Logger getLogger(Class<?> cls) {
        @NotNull SSHHostConfiguration actualHostConfiguration
                client.auth(host.username(), methods);
                throw new DBException("SSH agent authentication failed", e);
            }
import org.jkiss.dbeaver.model.net.ssh.config.SSHHostConfiguration;

            client.addHostKeyVerifier(new PromiscuousVerifier());
        return new SSHJSession(this);
package org.jkiss.dbeaver.model.net.ssh;
                    methods.add(new DBeaverAuthAgent((Identity) identity));
import org.jkiss.utils.CommonUtils;
        @NotNull DBWHandlerConfiguration configuration,
        private static final Set<String> FILTERED_OUT_CLASSES = Set.of("net.schmizz.sshj.common.StreamCopier");
                : PasswordUtils.createOneOff(key.password().toCharArray());

                    client.authPublickey(host.username(), key.path());
        try {
        client.getConnection().getKeepAlive().setKeepAliveInterval(keepAliveInterval);
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    protected SSHClient createNewSession(
    }
    ) throws DBException {
        if (auth instanceof SSHAuthConfiguration.Password password && password.password() != null) {

                } catch (Throwable e) {
    protected SSHJSession createSession() {
            client.connect(host.hostname(), host.port());
                }
                client.authPublickey(host.username(), client.loadKeys(key.data(), null, finder));
 * You may obtain a copy of the License at
            } catch (Throwable e) {
        }
