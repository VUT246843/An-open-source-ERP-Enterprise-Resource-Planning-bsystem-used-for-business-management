            log.debug("SSH: " + levelStr + ": " + message);

import org.jkiss.code.NotNull;

    private void setupHostKeyVerification(

        }
                if (!process.waitFor(5000, TimeUnit.MILLISECONDS)) {
            String name,
                addIdentityKey0(jsch, tmp, password);
        }
            return ((SSHAuthConfiguration.WithPassword) configuration).password();
            if (userInfoPromptProvider != null) {
         */
            } catch (InterruptedException e) {
        @Override
        @Override
                SSHConstants.DEFAULT_CONNECT_TIMEOUT));
            Path dir = DBWorkbench.getPlatform().getTempFolder(monitor, "openssh-pkey");
        @Nullable DBPDataSourceContainer dataSource,
    protected JSCHSession createSession() {
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
            session.setServerAliveInterval(configuration.getIntProperty(SSHConstants.PROP_ALIVE_INTERVAL));
        byte[] keyBinary = keyValue.getBytes(StandardCharsets.UTF_8);
                SSHConstants.PROP_CONNECT_TIMEOUT,
            throw new DBException("Failed to open JSch tunnel", e);
 * Copyright (C) 2010-2026 DBeaver Corp and others
            header = reader.readLine();
    }
                session.setConfig("StrictHostKeyChecking", "ask");
        @NotNull DBWHandlerConfiguration configuration
        @Override
                case INFO -> "INFO";
                    "-P", password,

                session.setConfig("PreferredAuthentications", "password,keyboard-interactive");
        @NotNull Session session,
    public JSCHSessionController() {
        if (!CommonUtils.isEmpty(password)) {
        }
            log.info(message);
            log.debug("SSHSessionController: Using agent authentication");
import org.jkiss.utils.SecurityUtils;
                    return;
import java.io.BufferedReader;
                    "-m", "PEM",
        }
                    process.destroyForcibly();
        }
import java.util.concurrent.TimeUnit;
import java.nio.file.StandardCopyOption;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            return session;
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
        } else if (auth instanceof SSHAuthConfiguration.KeyFile key) {
            Pattern.compile("^Host '(.*?)'"),
        @Override
    }
                try {
                        )) {



            log.debug("Attempting to convert an unsupported key into suitable format");
            return getPassphrase();
            String destination,
        /*
        } else {
    ) throws JSchException {

                try {
            log.debug("SSHSessionController: Using public key authentication");
            session.connect();
                message = CommonUtils.replaceFirstGroup(message, pattern, 1, SecurityUtils::mask);
            boolean[] echo
    protected Session createNewSession(

        };
                .start();
            setupHostKeyVerification(jsch, session, configuration);
 *
            password = CommonUtils.notEmpty(password);
            session.setConfig("StrictHostKeyChecking", "no");
                    "-q"
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else {
        @NotNull JSch jsch,
        public boolean promptYesNo(String message) {
    @NotNull
        public boolean promptPassword(String message) {
            }
import java.io.InputStreamReader;
        @NotNull JSch jsch,

            Process process = new ProcessBuilder()
import org.jkiss.dbeaver.model.net.ssh.config.SSHHostConfiguration;
            if (RuntimeUtils.isWindows()) {
            }
                session.setConfig("PreferredAuthentications", "publickey,keyboard-interactive,password");

            jsch.setIdentityRepository(createAgentIdentityRepository());


import java.io.File;
            }
            );
            try {

            return true;
import org.jkiss.dbeaver.utils.RuntimeUtils;
        public boolean isEnabled(int level) {
            for (Pattern pattern : SENSITIVE_DATA_PATTERNS) {
                    String message;
 * limitations under the License.
        }
        String header;

            String levelStr = switch (level) {
 *
                } catch (IOException e) {
            }
            session.setHostKeyAlias(destination.hostname());
                addIdentityKeyFile(jsch, monitor, configuration.getDataSource(), Path.of(key.path()), key.password());
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import java.nio.charset.StandardCharsets;
        private static final Pattern[] SENSITIVE_DATA_PATTERNS = {
        } catch (JSchException e) {
    @Override

            configuration.getBooleanProperty(SSHConstants.PROP_BYPASS_HOST_VERIFICATION)
 * You may obtain a copy of the License at
                }
            try {
        ) {
    }
import org.jkiss.dbeaver.model.net.ssh.config.SSHAuthConfiguration;
                }
        } else if (auth instanceof SSHAuthConfiguration.KeyData key) {
            session.setTimeout(configuration.getIntProperty(
                } catch (JSchException e) {
        }
        @Override
import org.jkiss.utils.CommonUtils;

    private static final Log log = Log.getLog(JSCHSessionController.class);
import org.jkiss.dbeaver.utils.GeneralUtils;
 *
                password = '"' + password + '"';
                    log.error("Specified private key cannot be converted: " + message);
                    session.setConfig("StrictHostKeyChecking", "ask");
 * See the License for the specific language governing permissions and
            Pattern.compile("^Connecting to (.*?) port"),
            return true;
                case WARN -> "WARN";
            return false;
        @NotNull DBRProgressMonitor monitor,
        }
        }
            String[] prompt,
        final JSch jsch = new JSch();
                            JSCHUIMessages.ssh_file_corrupted_dialog_title,
                        if (DBWorkbench.getPlatformUI().confirmAction(

                    Files.delete(tmp);
            Path tmp = dir.resolve(id + ".pem");
                    addIdentityKey0(jsch, key, password);
        }
        }
                default -> "DEBUG";
                }

                            throw e;
        } else if (auth instanceof SSHAuthConfiguration.Agent) {
        @NotNull DBRProgressMonitor monitor,
            Pattern.compile("^Disconnecting from (.*?) port"),
                int status = process.exitValue();
        if (DBWorkbench.getPlatform().getApplication().isHeadlessMode() ||


                        message = reader.lines().collect(Collectors.joining("\n"));
            return true;
        @Override
                )


        } else {
                userInfo = userInfoPromptProvider.createUserInfoPrompt(destination, session);
import java.nio.file.Path;

        }
    }
    ) throws DBException {
                    log.debug("Failed to delete private key file", e);

        public boolean promptPassphrase(String message) {
            log.debug("JSCH keyboard interactive auth");
    @NotNull
import com.jcraft.jsch.*;
            } catch (Exception e) {
import java.nio.file.Files;
        public String getPassphrase() {
            Pattern.compile("^Permanently added '(.*?)'")

    private void addIdentityKey0(@NotNull JSch jsch, Path key, String password) throws JSchException {
        if (header.equals("-----BEGIN OPENSSH PRIVATE KEY-----")) {
            session.setUserInfo(userInfo);
                            session.setConfig("StrictHostKeyChecking", "no");
    }
    private void addIdentityKeyFile(
        @Override
                }
            jsch.addIdentity(key.toAbsolutePath().toString());

            if (knownHosts != null) {
                case ERROR -> "ERROR";
    }
        try (BufferedReader reader = Files.newBufferedReader(key)) {
        @Override
                        }
    private static class JschLogger implements Logger {
            final File knownHosts = SSHUtils.getKnownSshHostsFileOrNull();
 * you may not use this file except in compliance with the License.
            if (userInfo == null) {

        } else {
import org.jkiss.code.Nullable;
            jsch.addIdentity("key", keyBinary, null, password.getBytes());
        ) {

                    jsch.setKnownHosts(knownHosts.getAbsolutePath());
            jsch.addIdentity(key.toAbsolutePath().toString(), password);
    private record JschUserInfo(@NotNull SSHAuthConfiguration configuration) implements UserInfo, UIKeyboardInteractive {
            final Session session = jsch.getSession(
                userInfo = new JschUserInfo(auth);
            log.debug("SSHSessionController: Using password authentication");
    }


        public String[] promptKeyboardInteractive(
public class JSCHSessionController extends AbstractSessionController<JSCHSession> {
                throw new DBException("Error adding identity key", e);
                    "ssh-keygen",
        try {
import java.util.UUID;
         * This code is a workaround for JSCH because it cannot load
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private void addIdentityKeyValue(@NotNull JSch jsch, String keyValue, String password) throws JSchException {
}
            String id = dataSource != null ? dataSource.getId() : "profile-" + UUID.randomUUID();
import java.util.regex.Pattern;
    }



    ) throws IOException, JSchException {
            }
            }
        @Override
                    // Add original key as is
        return new JSCHSession(this);

            log.debug("SSHSessionController: Using public key authentication");
                    if (e.getCause() instanceof ArrayIndexOutOfBoundsException) {
        public void showMessage(String message) {

            } catch (Exception e) {
                        } else {
         * algorithm will fail if the 'ssh-keygen' cannot be found (#5845)
            return new String[]{getPassphrase()};
        }
            } finally {
            jsch.addIdentity("key", keyBinary, null, null);
        @NotNull DBWHandlerConfiguration configuration,

                destination.hostname(),

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import java.util.stream.Collectors;
                addIdentityKeyValue(jsch, key.data(), key.password());
                throw new DBException("Error adding identity key", e);
            } else {
 * Unless required by applicable law or agreed to in writing, software
                    "-p",
            } else {
        }
import java.io.IOException;
        public String getPassword() {
        public void log(int level, String message) {
        }
        @Nullable String password
            }
            UserInfo userInfo = null;
import org.jkiss.dbeaver.runtime.DBWorkbench;
            if (auth instanceof SSHAuthConfiguration.Password) {
                            true
import org.jkiss.dbeaver.Log;
                    "-N", password,
import org.jkiss.dbeaver.DBException;
            JSCHUserInfoPromptProvider userInfoPromptProvider = GeneralUtils.adapt(this, JSCHUserInfoPromptProvider.class);
package org.jkiss.dbeaver.model.net.ssh;
                    }
        @NotNull SSHHostConfiguration destination
            }
 * DBeaver - Universal Database Manager
            };
                destination.port()
                throw new IOException(e);
                    }
            }
                            JSCHUIMessages.ssh_file_corrupted_dialog_message,
        if (auth instanceof SSHAuthConfiguration.Password) {
                .command(
         * newer private keys produced by ssh-keygen, so we need
                case FATAL -> "FATAL";
                    "-f", tmp.toAbsolutePath().toString(),

        JSch.setLogger(new JschLogger());

        if (!CommonUtils.isEmpty(password)) {
        @NotNull Path key,
         * to convert it to the older format manually. This

                destination.username(),
            addIdentityKey0(jsch, key, password);
            String instruction,
        final SSHAuthConfiguration auth = destination.auth();
                if (status != 0) {
            Files.copy(key, tmp, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
 */
            try {
