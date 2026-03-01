    public static boolean isKeyFileEncrypted(String privKeyPath) {
                    log.warn("Failed to resolve default SSH known hosts file location due to missing user home directory " + userHomeDirPath.toAbsolutePath());

        // primary host
        } catch (Throwable e) {
            } else {

    public static File getKnownSshHostsFileOrNull() {
            configuration.setProperty(prefix + SSHConstants.PROP_KEY_PATH, auth.path());
import org.eclipse.jsch.internal.core.IConstants;
        } else {
 *
    /**
                                .put(PLATFORM_SSH_PREFERENCES_SSH2HOME_KEY, sshHomeDirPath.toAbsolutePath().toString());
        if (prefix.isEmpty()) {
                return Paths.get(sshHomePathString, KNOWN_SSH_HOSTS_FILE_NAME).toFile();
            if (prefix.isEmpty()) {
        }
        Assert.isLegal(hosts.length > 0);
 * You may obtain a copy of the License at
                final String path = configuration.getStringProperty(prefix + SSHConstants.PROP_KEY_PATH);

            final String prefix = DataSourceUtils.getJumpServerSettingsPrefix(i);


        @NotNull DBWHandlerConfiguration configuration,
     * which means that keys that contain leading whitespaces

        int maxPort = store.getInt(ModelPreferences.NET_TUNNEL_PORT_MAX);
    public static SSHHostConfiguration[] loadHostConfigurations(
                    }
        }
                throw new DBException(kind.formatErrorMessage("port is not specified"));
        boolean validate
        saveHostConfiguration(configuration, hosts[hosts.length - 1], "", false, false);
                log.debug("Can't check private key encryption: " + e.getMessage());
        }
        );
        return  getKnownSshHostsFileImpl(false);
        configuration.setProperty(DataSourceUtils.PROP_JUMP_SERVER + ".count", hosts.length - 1);
    private static void saveHostConfiguration(
     * </ol>
    ) {
            log.warn("Failed to resolve default SSH known hosts file location.", e);
            @Override
                if (forceFileObjectOnFail) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
            return forcedUserProfilePath.resolve(DEFAULT_SSH_HOME_DIR_NAME).resolve(KNOWN_SSH_HOSTS_FILE_NAME).toFile();
                }
 * Unless required by applicable law or agreed to in writing, software
        }


            // Check whether this key is encrypted
        if (CommonUtils.isNotEmpty(sshHomePathString)) {

        String[] lines = keyValue.split("\\n");

                        }
        hosts.add(loadHostConfiguration(configuration, new ConfigurationKind.TargetHost(), validate));
     */
                }
    @NotNull
     * Loads host configurations for tunneling.
    private static File resolveDefaultKnownSshHostsFile(boolean forceFileObjectOnFail, boolean updatePreferences) {
            if (configuration.getBooleanProperty(prefix + RegistryConstants.ATTR_ENABLED)) {
 */
            configuration.setUserName(host.username());
        return false;
public class SSHUtils {
     * @param configuration network handler configuration to read host configuration from

            if (userHomePathString != null) {
            public String formatErrorMessage(@NotNull String message) {
        // jump hosts

    }

                KeyPair keyPair = KeyPair.load(testSch, privKeyValue, null);
                if (CommonUtils.isEmpty(path)) {
    @NotNull

            SSHConstants.AuthType.class,
            try {
 * limitations under the License.
}
            try {
    private static final String KNOWN_SSH_HOSTS_FILE_NAME = "known_hosts";
    }
                JSch testSch = new JSch();
     */
            final boolean savePassword = forceSavePassword || auth.savePassword();
            @NotNull
import java.nio.file.Files;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
            throw new DBException(kind.formatErrorMessage("private key file does not exist: " + string));
        final String hostname = CommonUtils.notEmpty(configuration.getStringProperty(prefix + DBWHandlerConfiguration.PROP_HOST));
    @NotNull
    }
                    if (identity.isEncrypted()) {
            }
import org.jkiss.dbeaver.registry.RegistryConstants;
import com.jcraft.jsch.*;
        };
                    return new File(sshHomePathString + File.pathSeparator + KNOWN_SSH_HOSTS_FILE_NAME);
            configuration.setSecureProperty(prefix + SSHConstants.PROP_KEY_VALUE, auth.data());
import org.jkiss.dbeaver.model.net.ssh.config.SSHHostConfiguration;
            }
            public String configurationPrefix() {
    }
                    } else {
    }
        }

        for (int i = 0; i < lines.length; i++) {
            SSHConstants.AuthType.PASSWORD
                        // don't need to create it until we'll need to write known hosts file

        final SSHConstants.AuthType authType = CommonUtils.valueOf(
            } catch (JSchException e) {
import java.nio.file.InvalidPathException;
            }
    /**
                return keyPair.isEncrypted();
            return null;
 * DBeaver - Universal Database Manager
        @NotNull String prefix,
    private static void validatePathAndEnsureExists(@NotNull ConfigurationKind kind, @NotNull String string) throws DBException {
            }
        JSchCorePlugin.getPlugin().getJSch().setHostKeyRepository(null);
        return  getKnownSshHostsFileImpl(true);
        final Path path;
            } catch (InvalidPathException e) {
                    if (validate) {
    public static final boolean DISABLE_SESSION_SHARING = Boolean.getBoolean("dbeaver.ssh.disableSessionSharing");
     * @param validate      validate configuration parameters
import org.jkiss.utils.CommonUtils;
        if (privKeyValue != null) {

        configuration.setProperty(prefix + DBWHandlerConfiguration.PROP_PORT, host.port());
                        if (updatePreferences) {
                if (Files.isDirectory(userHomeDirPath)) {
     *   <li>Jump host #1</li>
        final boolean savePassword = configuration.isSavePassword() || kind instanceof ConfigurationKind.JumpHost;

        @NotNull DBWHandlerConfiguration configuration,
     *
        @NotNull SSHHostConfiguration[] hosts
        if (markEnabled) {
        if (validate && CommonUtils.isEmpty(username)) {
import org.eclipse.core.runtime.Assert;

                JSch testSch = new JSch();
            configuration.setProperty(prefix + RegistryConstants.ATTR_ENABLED, true);
        int count = configuration.getIntProperty(DataSourceUtils.PROP_JUMP_SERVER + ".count", SSHConstants.MAX_JUMP_SERVERS);

                configuration.setSecureProperty(prefix + RegistryConstants.ATTR_PASSWORD, savePassword ? auth.password() : null);


/*
        @NotNull
            configuration.setProperty(prefix + SSHConstants.PROP_AUTH_TYPE, SSHConstants.AuthType.PASSWORD.name());
            username = CommonUtils.notEmpty(configuration.getStringProperty(prefix + RegistryConstants.ATTR_NAME));
        }
        }
        @NotNull
    }
    }
        } else {
                } else {
                hosts.add(loadHostConfiguration(configuration, new ConfigurationKind.JumpHost(prefix, i), validate));
            Path forcedUserProfilePath = Paths.get(RuntimeUtils.isWindows() ? "%USERPROFILE%" : "~"); // let's pretend it'll resolve itself
    private static final Log log = Log.getLog(SSHUtils.class);
        } else if (host.auth() instanceof SSHAuthConfiguration.Agent) {
            }
    }
        JSchCorePlugin.getPlugin().setNeedToLoadKnownHosts(true);
        return false;
                }
                configuration.setPassword(savePassword ? auth.password() : null);
                return "Can't load configuration for the target host: " + message;

package org.jkiss.dbeaver.model.net.ssh;
     * in the last line are invalid.
                        return sshHomeDirPath.resolve(KNOWN_SSH_HOSTS_FILE_NAME).toFile();
        if (validate && CommonUtils.isEmpty(hostname)) {
        @NotNull DBWHandlerConfiguration configuration,
                        validatePathAndEnsureExists(kind, path);
            }

                testSch.addIdentity(privKeyPath);
    private static final String PLATFORM_SSH_PREFERENCES_NODE = "org.eclipse.jsch.core"; //$NON-NLS-1$
 * you may not use this file except in compliance with the License.
                        log.warn("Failed to resolve default SSH known hosts file location due to invalid SSH home directory " + sshHomeDirPath.toAbsolutePath());
    }
            @NotNull
        }
            case AGENT -> new SSHAuthConfiguration.Agent();
     * @return array of SSH host configurations
                for (Identity identity : identities) {
                break;

import org.jkiss.dbeaver.model.net.ssh.config.SSHAuthConfiguration;
        String sshHomePathString = Platform.getPreferencesService().getString(PLATFORM_SSH_PREFERENCES_NODE, PLATFORM_SSH_PREFERENCES_SSH2HOME_KEY, null, null);
            @Override


        boolean markEnabled,
                configuration.setSavePassword(savePassword);
        for (int i = 0; i < count; i++) {
    private static File getKnownSshHostsFileImpl(boolean forceFileObjectOnFail) {
    private sealed interface ConfigurationKind {
import org.eclipse.jsch.internal.core.JSchCorePlugin;
            try {
                log.debug("Can't check private key encryption: " + e.getMessage());
                    }
            password = CommonUtils.nullIfEmpty(configuration.getPassword());
    // Had to extract this code into a separate method to avoid triggering a JDT compiler bug
 * SSH utils
    }
        }
        String configurationPrefix();
import java.io.File;
        return IOUtils.findFreePort(minPort, maxPort);
            saveHostConfiguration(configuration, hosts[i], DataSourceUtils.getJumpServerSettingsPrefix(i), true, true);

            throw new DBException(kind.formatErrorMessage("hostname is not specified"));
    public static void forcePlatformReloadKnownHostsPreferences() {
            @Override
    public static File getKnownSshHostsFileOrDefault() {
                    Path sshHomeDirPath = userHomeDirPath.resolve(DEFAULT_SSH_HOME_DIR_NAME);
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            configuration.setProperty(prefix + SSHConstants.PROP_AUTH_TYPE, SSHConstants.AuthType.PUBLIC_KEY.name());
            case PUBLIC_KEY -> {
        return hosts.toArray(SSHHostConfiguration[]::new);
        String formatErrorMessage(@NotNull String message);
                }
import org.jkiss.dbeaver.DBException;
     *   <li>...</li>
            } else {
                            sshHomeDirPath = sshHomeOldDirPath;
        }
            }
            public String formatErrorMessage(@NotNull String message) {

        int minPort = store.getInt(ModelPreferences.NET_TUNNEL_PORT_MIN);
                    if (Files.isDirectory(sshHomeDirPath) || Files.notExists(sshHomeDirPath)) {
     * BouncyCastle doesn't trim the last line of key data from version 1.78,
        record TargetHost() implements ConfigurationKind {

import org.jkiss.dbeaver.Log;
        }
     * @throws DBException if configuration is invalid
                port = SSHConstants.DEFAULT_PORT;
        @NotNull SSHHostConfiguration host,
        configuration.setProperty(prefix + DBWHandlerConfiguration.PROP_HOST, host.hostname());
        if (forceFileObjectOnFail) {
        int port = configuration.getIntProperty(prefix + DBWHandlerConfiguration.PROP_PORT);
            throw new DBException(kind.formatErrorMessage("invalid private key path: " + string));
import org.jkiss.code.NotNull;
            configuration.setProperty(prefix + RegistryConstants.ATTR_NAME, host.username());
                    }
                        if (Files.isDirectory(sshHomeOldDirPath)) {
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;

                    if (RuntimeUtils.isWindows() && (!Files.isDirectory(sshHomeDirPath) || Files.notExists(sshHomeDirPath))) {
            configuration.setProperty(prefix + SSHConstants.PROP_AUTH_TYPE, SSHConstants.AuthType.AGENT.name());
                    return null;
        if (port == 0) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            } catch (JSchException e) {

     *   <li>Jump host #2</li>
        }
        if (host.auth() instanceof SSHAuthConfiguration.WithPassword auth) {
                return "";
    ) {
        } else if (host.auth() instanceof SSHAuthConfiguration.KeyFile auth) {

    }
                    }
        try {
        if (Files.notExists(path)) {
                } else {
                log.warn("Failed to resolve default SSH known hosts file location due to missing user home system property.");
    static int findFreePort() {

        }
                // Something went wrong
    }
            lines[i] = lines[i].trim();
            } else {
                    yield new SSHAuthConfiguration.KeyFile(path, password, savePassword);
    }
                List<Identity> identities = ir.getIdentities();
        } else if (host.auth() instanceof SSHAuthConfiguration.KeyData auth) {
    public static boolean isKeyFileEncrypted(@NotNull Path privKeyPath) {
import java.util.List;
                        }
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
        // primary host
     * There might be multiple hosts available, e.g. primary host and several jump hosts, in the following order:
            String userHomePathString = System.getProperty(IConstants.SYSTEM_PROPERTY_USER_HOME);
                        return true;
                                .getRootNode().node(PLATFORM_SSH_PREFERENCES_NODE)
    @NotNull
            username = SSHConstants.DEFAULT_USER_NAME;
            // jump hosts, if present
        boolean forceSavePassword
            username = CommonUtils.notEmpty(configuration.getUserName());
        record JumpHost(@NotNull String configurationPrefix, int index) implements ConfigurationKind {
import org.jkiss.dbeaver.ModelPreferences;
                        throw new DBException(kind.formatErrorMessage("private key is not specified"));
     * <p>
                // Something went wrong
                            Platform.getPreferencesService()

    public static void saveHostConfigurations(

            // seems preference path not set at all, so try to resolve it and preserve
            configuration.getStringProperty(prefix + SSHConstants.PROP_AUTH_TYPE),
        } else {
    private static SSHHostConfiguration loadHostConfiguration(
        final String prefix = kind.configurationPrefix();
        } else {

        } catch (InvalidPathException e) {
            if (validate) {

                Path userHomeDirPath = Paths.get(userHomePathString);
import org.jkiss.utils.IOUtils;
            } else {
        }

            return resolveDefaultKnownSshHostsFile(forceFileObjectOnFail, true);
        for (int i = 0; i < hosts.length - 1; i++) {

        return isKeyFileEncrypted(privKeyPath.toAbsolutePath().toString());
                IdentityRepository ir = testSch.getIdentityRepository();
 * Copyright (C) 2010-2026 DBeaver Corp and others
        return String.join("\n", lines);
            }
/**
        }
     * Trims each lines in provided key data.
            password = CommonUtils.nullIfEmpty(configuration.getSecureProperty(prefix + RegistryConstants.ATTR_PASSWORD));

    ) throws DBException {
                } else {
                return "Can't load configuration for the jump host #" + (index + 1) + ": " + message;
     *   <li>Primary host</li>
        final SSHAuthConfiguration auth = switch (authType) {
                log.warn("Failed to resolve SSH known hosts file location at " + sshHomePathString, e);
    @Nullable
    // https://github.com/eclipse-jdt/eclipse.jdt.core/issues/1394

        // Check whether this key is encrypted
import org.jkiss.dbeaver.runtime.DBWorkbench;
    private static final String DEFAULT_SSH_HOME_DIR_NAME = IConstants.SSH_DEFAULT_HOME;
        boolean validate
            configuration.setProperty(prefix + SSHConstants.PROP_AUTH_TYPE, SSHConstants.AuthType.PUBLIC_KEY.name());
    ) throws DBException {
            }
 */
    public static String trimLinesInKeyData(@NotNull String keyValue) {
import java.nio.file.Path;
            // Determine whether public key is encrypted
            }
                    String privKeyValue = configuration.getSecureProperty(prefix + SSHConstants.PROP_KEY_VALUE);
import org.jkiss.code.Nullable;
    }
    }
        if (prefix.isEmpty()) {
        try {
        String username;
            }
        }

 *

            // TODO: For now, we enforce password saving for jump hosts
                    if (validate && privKeyValue == null) {
        if (host.auth() instanceof SSHAuthConfiguration.Password) {
            path = Path.of(string);
        if (privKeyPath != null) {
import org.eclipse.core.runtime.Platform;
    private static final String PLATFORM_SSH_PREFERENCES_SSH2HOME_KEY = IConstants.KEY_SSH2HOME;
                        Path sshHomeOldDirPath = userHomeDirPath.resolve(DEFAULT_SSH_HOME_DIR_NAME_WIN_OLD);

        final List<SSHHostConfiguration> hosts = new ArrayList<>();

        final String password;
 * Licensed under the Apache License, Version 2.0 (the "License");
            @NotNull
 *
     * <ol>


        return new SSHHostConfiguration(username, hostname, port, auth);
import org.jkiss.dbeaver.utils.DataSourceUtils;
        }
        @NotNull DBWHandlerConfiguration configuration,
                    }
    public static boolean isKeyEncrypted(byte[] privKeyValue) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            case PASSWORD -> new SSHAuthConfiguration.Password(password, savePassword);
        }
    private static final String DEFAULT_SSH_HOME_DIR_NAME_WIN_OLD = IConstants.SSH_OLD_DEFAULT_WIN32_HOME;
        @NotNull ConfigurationKind kind,
import java.util.ArrayList;
    }
import java.nio.file.Paths;
                    yield new SSHAuthConfiguration.KeyData(trimLinesInKeyData(CommonUtils.notEmpty(privKeyValue)), password, savePassword);
        }
