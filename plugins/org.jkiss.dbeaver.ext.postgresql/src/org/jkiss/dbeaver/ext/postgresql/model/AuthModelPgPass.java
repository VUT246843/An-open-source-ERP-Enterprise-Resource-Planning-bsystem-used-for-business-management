                    return true;
        return passParam.equals("*") || passParam.equalsIgnoreCase(cfgParam);
            credentials.setParseError(e);
    @Override
                    return true;
 * you may not use this file except in compliance with the License.
    private void loadPasswordFromPgPass(AuthModelPgPassCredentials credentials, DBPDataSourceContainer dataSource, DBPConnectionConfiguration configuration) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        if (!Files.exists(pgPassFile)) {
        }
            }
import org.jkiss.dbeaver.utils.GeneralUtils;
        DBWUtils.ConnectivityParameters cnnParams = DBWUtils.getConnectivityParameters(originalConfiguration, dataSource.getDriver());

    private boolean findHostCredentials(
        return new AuthModelPgPassCredentials();
        throw new DBException("No matches in pgpass");
        String sshHost = null;
            throw new DBCException("Couldn't get password from PGPASS file", credentials.getParseError());

        return null;
        return credentials;

    }
            } else if (conHostName != null && findHostCredentials(credentials, configuration, cnnParams, conHostName, conHostPort, lines)) {
                    credentials.setUserName(user);
            if (host != null) {
            params[i] = params[i].replace("@CESC@", ":").replace("@BSESC@", "\\");
        @NotNull AuthModelPgPassCredentials credentials,
        }
        String[] params = line.split(":");
    private static boolean matchParam(String cfgParam, String passParam) {
                return (String) host;
        for (String line : lines) {
        if (credentials.getParseError() != null) {
                String appData = System.getenv("AppData");
import org.jkiss.dbeaver.model.DBConstants;
                if (CommonUtils.isEmpty(connectivityParameters.userName())) {
    private String getSSHHost(@NotNull DBPDataSourceContainer dataSourceContainer) {
import org.jkiss.dbeaver.model.exec.DBCException;
        line = line.replace("\\\\", "@BSESC@").replace("\\:", "@CESC@");
    private static String[] splitPassLine(String line) {
            String passString = IOUtils.readToString(r);
}
        return super.initAuthentication(monitor, dataSource, credentials, configuration, connectProps);
        // Unescape colons
 * See the License for the specific language governing permissions and

    }

 * distributed under the License is distributed on an "AS IS" BASIS,
        String pgPassPath = System.getenv(PGPASSFILE_ENV_VARIABLE);
import org.jkiss.utils.StandardConstants;
    @Override
    @Override
import java.nio.file.Path;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            throw new DBException("PgPass file '" + pgPassFile + "' not found");
        try (Reader r = Files.newBufferedReader(pgPassFile, GeneralUtils.UTF8_CHARSET)) {
import org.jkiss.dbeaver.DBException;

    private static final Log log = Log.getLog(AuthModelPgPass.class);
                && matchParam(connectivityParameters.databaseName(), database)) {
    }
        @NotNull String[] lines
        AuthModelPgPassCredentials credentials = super.loadCredentials(dataSource, configuration);
                pgPassPath = appData + "/postgresql/pgpass.conf";
            if (RuntimeUtils.isWindows()) {
 *
package org.jkiss.dbeaver.ext.postgresql.model;
            } else {
import java.util.Properties;
        if (sshHandler != null) {
    }
                continue;
                return;


            if (sshHost != null && findHostCredentials(credentials, configuration, cnnParams, sshHost, conHostPort, lines)) {
        @NotNull DBPConnectionConfiguration configuration,

    public AuthModelPgPassCredentials createCredentials() {
    @NotNull
            }
 * limitations under the License.
                }
        }
    public static final String PGPASSFILE_ENV_VARIABLE = "PGPASSFILE";
            throw new DBException("Error reading pgpass at '" + pgPassFile + "'", e);
            String host = params[0];
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    appData = System.getProperty(StandardConstants.ENV_USER_HOME);
    @Nullable

        if (!CommonUtils.isEmpty(providerProperty)) {
public class AuthModelPgPass extends AuthModelDatabaseNative<AuthModelPgPassCredentials> {

import java.io.Reader;
import org.jkiss.dbeaver.utils.RuntimeUtils;
    public AuthModelPgPassCredentials loadCredentials(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration) {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            String[] lines = passString.split("\n");
            loadPasswordFromPgPass(credentials, dataSource, configuration);
        for (int i = 0; i < params.length; i++) {
        if (params.length < 5) {
        DBWHandlerConfiguration sshHandler =

import org.jkiss.dbeaver.model.net.DBWUtils;
            String password = params[4];
            if (matchParam(hostName, host)
import org.jkiss.code.NotNull;
import java.nio.file.Files;
                    credentials.setUserPassword(password);
        @NotNull String hostPort,
                } else if (matchParam(connectivityParameters.userName(), user)) {
            line = line.trim();
/*
            Object host = sshHandler.getProperty(DBPConnectionConfiguration.VARIABLE_HOST);
            }
        return params;
    }
                continue;
 */
        @NotNull String hostName,
                    //configuration.setUserName(user);
                    credentials.setUserPassword(password);
                pgPassPath = System.getProperty(StandardConstants.ENV_USER_HOME) + "/.pgpass";
            sshHost = getSSHHost(dataSource);
        } catch (DBException e) {
            credentials.setParseError(null);
        if (CommonUtils.isEmpty(conHostName) || conHostName.equals(DBConstants.HOST_LOCALHOST) || conHostName.equals(DBConstants.HOST_LOCALHOST_IP)) {
                return;
        }
    ) {
        // Take database name from original config. Because it may change when user switch between databases.
import org.jkiss.dbeaver.Log;
                    // No user name specified. Get the first matched params
 *
    @NotNull
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
            }
                    }
                if (appData == null) {
        }
            // Escape colons
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNative;
            String port = params[1];

import org.jkiss.utils.IOUtils;
        if (CommonUtils.isEmpty(pgPassPath)) {
import org.jkiss.code.Nullable;
            return null;
        }
    }
        }
import java.io.IOException;


        String conHostName = cnnParams.hostName();
            dataSourceContainer.getActualConnectionConfiguration().getHandler(DBWUtils.SSH_TUNNEL);
        DBPConnectionConfiguration originalConfiguration = dataSource.getConnectionConfiguration();
    public Object initAuthentication(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSource dataSource, @NotNull AuthModelPgPassCredentials credentials, @NotNull DBPConnectionConfiguration configuration, @NotNull Properties connectProps) throws DBException {
    }

import org.jkiss.dbeaver.model.DBPDataSource;
            .getProviderProperty(PostgreConstants.PG_PASS_HOSTNAME);
 * Unless required by applicable law or agreed to in writing, software
            String user = params[3];
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        String conHostPort = CommonUtils.isNotEmpty(cnnParams.hostPort()) ? cnnParams.hostPort() : dataSource.getDriver().getDefaultPort();
        }
                && matchParam(hostPort, port)
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
        @NotNull DBWUtils.ConnectivityParameters connectivityParameters,
                }
        return false;
        } catch (IOException e) {
            }
    }
        final String providerProperty = dataSource.getConnectionConfiguration()

        try {
            }
            if (params == null) {
        }

 * You may obtain a copy of the License at
import org.jkiss.utils.CommonUtils;
            sshHost = providerProperty;
            if (line.isEmpty() || line.startsWith("#")) {

            String database = params[2];
 * DBeaver - Universal Database Manager
                        configuration.setUserName(user);
        }
                    //configuration.setUserPassword(password);
            String[] params = splitPassLine(line);
                    if (!user.equals("*")) {
        Path pgPassFile = Path.of(pgPassPath);
