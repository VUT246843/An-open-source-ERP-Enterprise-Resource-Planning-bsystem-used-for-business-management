        if (serviceConnections != null) {
            // 2. Check for connections' proxies
        {
            }
            DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
import org.jkiss.dbeaver.model.impl.net.SocksConstants;
import org.jkiss.dbeaver.Log;
            if (SocksConstants.PROTOCOL_SOCKS5.equals(requestingProtocol) || SocksConstants.PROTOCOL_SOCKS4.equals(requestingProtocol)) {
            return new DBPAuthInfo(userName, CommonUtils.notEmpty(password), true);

}
                return pc;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private DBPAuthInfo readCredentialsInUI(String prompt, String userName, String userPassword) {
                if (activeContext != null) {
                DBPAuthInfo credentials = null;
            if (CommonUtils.isNotEmpty(password)) {

        String password = secrets.getPrivateSecretValue(ModelPreferences.UI_PROXY_PASSWORD);
            return new DBPAuthInfo(userName, CommonUtils.notEmpty(password), true);
                            saveCredentials(credentials.getUserName(), credentials.getUserPassword());
                        } catch (DBException e) {
                                    userPassword = authInfo.getUserPassword();
            if (!CommonUtils.isEmpty(proxyHost) && proxyHost.equalsIgnoreCase(getRequestingHost()) &&
import org.jkiss.dbeaver.model.net.DBWHandlerType;
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.utils.CommonUtils;
                try {
        // Modern storage
                                if (authInfo != null) {
                }
        if (CommonUtils.isNotEmpty(userName)) {
        }
                }
import org.jkiss.code.NotNull;
                                    if (authInfo.isSavePassword()) {
                            }
                            log.error("Error saving proxy credentials", e);
        return null;
    public static DBPAuthInfo readCredentials() throws DBException {
                    credentials = readCredentialsInUI("Auth proxy '" + proxyHost + "'", null, null);
 *
                getRequestingHost(),
                    }
                                        networkHandler.setUserName(userName);
                    credentials = readCredentials();
        }
            }
import org.jkiss.dbeaver.ModelPreferences;
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                getRequestingProtocol(),
            PasswordAuthentication pc = serviceConnections.getGlobalProxyConfiguration(
            // 1. Check for drivers download proxy
/**
import java.net.Authenticator;
                            }
                store.getInt(ModelPreferences.UI_PROXY_PORT) == getRequestingPort()) {
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

import org.jkiss.dbeaver.runtime.encode.EncryptionException;
        }

 */
                            String userName = networkHandler.getUserName();

                } catch (EncryptionException e) {
        if (CommonUtils.isNotEmpty(username)) {
                getRequestingPort());
                if (credentials != null) {
    }
                        if (networkHandler.isEnabled() && networkHandler.getType() == DBWHandlerType.PROXY) {
            if (pc != null) {
import org.jkiss.dbeaver.model.secret.DBSSecretController;
import org.jkiss.code.Nullable;
                        }
    private static final Log log = Log.getLog(GlobalProxyAuthenticator.class);
            secrets.setPrivateSecretValue(ModelPreferences.UI_PROXY_USER, username);
            if (CommonUtils.isNotEmpty(password)) {
                } catch (DBException e) {
    }
                        try {
                                    userName = authInfo.getUserName();
                try {
package org.jkiss.dbeaver.runtime.net;
        return DBWorkbench.getPlatformUI().promptUserCredentials(prompt, null, userName, userPassword, false, true);
    }

                secrets.setPrivateSecretValue(ModelPreferences.UI_PROXY_PASSWORD, password);

            final String proxyHost = store.getString(ModelPreferences.UI_PROXY_HOST);
        DBServiceConnections serviceConnections = DBWorkbench.getService(DBServiceConnections.class);
 * You may obtain a copy of the License at
                    password = new SecuredPasswordEncrypter().decrypt(password);
import org.jkiss.dbeaver.model.connection.DBPAuthInfo;
            DBSSecretController secrets = DBSSecretController.getGlobalSecretController();
 * Unless required by applicable law or agreed to in writing, software
                                    }
            String requestingProtocol = getRequestingProtocol();
 *
                    log.error("Error reading proxy credentials", e);
        // Backward compatibility
                    throw new DBException("Can't decrypt legacy password", e);
 * distributed under the License is distributed on an "AS IS" BASIS,

                                return new PasswordAuthentication(userName, userPassword.toCharArray());
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    }
        }

                                        networkHandler.setSavePassword(true);
                    if (credentials.isSavePassword()) {
                    return new PasswordAuthentication(credentials.getUserName(), credentials.getUserPassword().toCharArray());
 * Global authenticator
    public GlobalProxyAuthenticator() {
                }
 */
                                        activeContext.getRegistry().flushConfig();

        if (CommonUtils.isNotEmpty(userName)) {

/*
                }
import org.jkiss.dbeaver.runtime.DBServiceConnections;
import org.jkiss.dbeaver.runtime.encode.SecuredPasswordEncrypter;
                            String userPassword = networkHandler.getPassword();
import java.net.PasswordAuthentication;

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                                        networkHandler.setPassword(userPassword);
 * you may not use this file except in compliance with the License.
 * limitations under the License.
                            if (!CommonUtils.isEmpty(userName) && !CommonUtils.isEmpty(userPassword)) {
            secrets.flushChanges();
                                        // Save DS config
        userName = store.getString(ModelPreferences.UI_PROXY_USER);
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
                        }
    @Nullable

        String userName = secrets.getPrivateSecretValue(ModelPreferences.UI_PROXY_USER);
        }
                                }
 *
        {
                    for (DBWHandlerConfiguration networkHandler : activeContext.getActualConnectionConfiguration().getHandlers()) {
    }
        password = store.getString(ModelPreferences.UI_PROXY_PASSWORD);
    @Override
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                }
        DBSSecretController secrets = DBSSecretController.getGlobalSecretController();
    protected PasswordAuthentication getPasswordAuthentication() {

import org.jkiss.dbeaver.DBException;

        }
            }
                if (credentials == null) {
                            if (CommonUtils.isEmpty(userName) || CommonUtils.isEmpty(userPassword)) {

                DBPDataSourceContainer activeContext = DBExecUtils.findConnectionContext(getRequestingHost(), getRequestingPort(), getRequestingScheme());
    @Nullable

        return null;
            }
    public static void saveCredentials(@NotNull String username, @NotNull String password) throws DBException {
public class GlobalProxyAuthenticator extends Authenticator {
                                DBPAuthInfo authInfo = readCredentialsInUI(getRequestingPrompt(), userName, userPassword);
import org.jkiss.dbeaver.model.exec.DBExecUtils;
