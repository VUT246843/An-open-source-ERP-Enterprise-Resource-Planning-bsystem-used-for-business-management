public class MySQLDataSourceProvider extends JDBCDataSourceProvider implements DBPNativeClientLocationManager {
        String installDirKey
        }
            }
        connectionsProps.put("interactiveClient", "true");
    }

    private static synchronized Map<String, DBPNativeClientLocation> findLocalClients() {
            List.of("bin/mysql", "bin/mariadb"),
            try {
/*
            if (!registry.registryKeyExists("HKEY_LOCAL_MACHINE", registryRoot)) {
                if (!executableName.exists()) {
                        );
                    String line;
            for (String homeKey : ArrayUtils.safeArray(registry.registryGetKeys("HKEY_LOCAL_MACHINE", registryRoot))) {
 * You may obtain a copy of the License at

 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
        // Widely appears in MyISAM tables (joomla, etc)
            url.append("jdbc:mysql://");
                        if (new File(serverPath, "bin").exists()) {
        if (path != null) {
    private static Map<String,String> connectionsProps;
                Object driverInstance = driver.getDefaultDriverLoader().getDriverInstance(new VoidProgressMonitor());
    @Override
        if (!CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {
            localClients = findUnixLocalClients();

import org.jkiss.dbeaver.model.DatabaseURL;
            p -> {
    public DBPNativeClientLocation getDefaultLocalClientLocation() {
        // This longer timeout is for connections directly in use by a human, who'd prefer MySQL not 

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                } finally {

    @Override
    @Nullable
                    needMariDBString = true;
    protected String getConnectionPropertyDefaultValue(String name, String value) {
 * DBeaver - Universal Database Manager
                }
                            pos += 4;

        return findLocalClients().getOrDefault(homeId, new LocalNativeClientLocation(homeId, homeId, homeId));
import org.jkiss.code.NotNull;
                File file = p.toFile();
        if (connectionInfo.getConfigurationType() == DBPDriverConfigurationType.URL) {
        if (localClients != null) {
import java.io.File;
                if (executableName.exists()) {
    public String getProductName(DBPNativeClientLocation location) {
                    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            localClients = findWindowsLocalClients();
    private static String getFullServerVersion(File path) {
        // Prevent stupid errors "Cannot convert value '0000-00-00 00:00:00' from column X to TIMESTAMP"

        return "MySQL/MariaDB";
    //////////////////////////////////////
import org.jkiss.dbeaver.model.connection.*;

                            .formatted(token, executableName, binFolder, homeId)
        String path = System.getenv("PATH");
    //private static final String SERER_VERSION_KEY = "Version";
    {
        } else {
            } finally {
        Map<? super String, ? super DBPNativeClientLocation> locationMap,
            }

    }
 * limitations under the License.
                            "Found a MySQL location in PATH. token=%s executableName=%s binFolder=%s homeId=%s"
        return CommonUtils.getFirstOrNull(findLocalClients().values());
        return FEATURE_CATALOGS;
                return new LocalNativeClientLocation(absolutePath, file, absolutePath);
            url.append(connectionInfo.getDatabaseName());
import java.util.HashMap;
    }
import org.jkiss.code.Nullable;
            return DatabaseURL.generateUrlByTemplate(driver, connectionInfo);
    }
    }
        }
            LocalSystemRegistry.Registry registry = LocalSystemRegistry.getInstance();
        if (binSubfolder.exists()) {
                            return line.substring(pos, pos2);
                            log.trace(
                        pos = line.indexOf("Ver ");
        @NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container)
    @Override

        } catch (Throwable e) {
    {
                    IOUtils.close(input);
            return connectionInfo.getUrl();
                File executableName = new File(binPath, MySQLUtils.getMariaDBConsoleBinaryName());
                for (var entry : registry.registryGetValues("HKEY_LOCAL_MACHINE", registryRoot + "\\" + homeKey).entrySet()) {
        return result;
                                ("Found a MySQL location in registry. " +
            log.warn("Error reading Windows registry", e);
            executableName = new File(binPath, MySQLUtils.getMySQLConsoleBinaryName());


            return localClients;
import org.jkiss.utils.CommonUtils;
                        String serverPath = CommonUtils.removeTrailingSlash(CommonUtils.toString(entry.getValue()));
    public long getFeatures()
    }
    {
            List.of(),
    private static Map<String, DBPNativeClientLocation> localClients;
            }
        );
    }
                            int pos2 = line.indexOf(",", pos);
                    executableName = new File(binPath, MySQLUtils.getMySQLConsoleBinaryName());
    }
 * See the License for the specific language governing permissions and


        if (RuntimeUtils.isWindows()) {
        try {
                    }
                        }
        catch (Exception ex) {
        String trustStorePath = System.getProperty(StandardConstants.ENV_USER_HOME) + "/.keystore";
        // instead of wait_timeout.
    @Nullable
    }
            }
import org.jkiss.dbeaver.utils.GeneralUtils;
    @Override

            try {
 *
        if (MySQLUtils.isMariaDB(driver)) {
        String ovrValue = connectionsProps.get(name);
//            "com.mysql.jdbc.authentication.MysqlClearPasswordPlugin," +
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            int pos2 = line.indexOf(" for ", pos);
            Process p = Runtime.getRuntime().exec(new String[]{cmd, MySQLConstants.FLAG_VERSION});
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        connectionsProps = new HashMap<>();
    static {

        System.setProperty("javax.net.ssl.keyStore", trustStorePath);
    private static final String INSTALLDIR_KEY = "INSTALLDIR";
                }
 *
    }
    @Override
 * you may not use this file except in compliance with the License.
        StringBuilder url = new StringBuilder();
import java.io.BufferedReader;
                        log.trace(
        }

        // Auth plugins

        connectionsProps.put("characterEncoding", GeneralUtils.UTF8_ENCODING);
    }
                    if (installDirKey.equalsIgnoreCase(entry.getKey())) {
    public DBPDataSource openDataSource(
        }
    private static final String REGISTRY_ROOT_MYSQL_64 = "SOFTWARE\\Wow6432Node\\MYSQL AB";
*/

    private static Map<String, DBPNativeClientLocation> findUnixLocalClients() {
    @NotNull
                BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
    public List<DBPNativeClientLocation> findLocalClientLocations() {
    // Client manager
        searchInWindowsRegistry(result, REGISTRY_ROOT_MYSQL_64, SERER_LOCATION_KEY);
                                .formatted(homeKey, entry.getKey(), entry.getValue(), serverPath, registryRoot, installDirKey)
import org.jkiss.utils.ArrayUtils;
import java.io.InputStreamReader;
                        }
}
    }
import org.jkiss.dbeaver.utils.RuntimeUtils;

        }
                log.error("Can't recognize MariaDB driver version", e);
        }
                        if (pos != -1) {
        String cmd = executableName.getAbsolutePath();
    private static final Log log = Log.getLog(MySQLDataSourceProvider.class);
        searchInWindowsRegistry(result, REGISTRY_ROOT_MARIADB, INSTALLDIR_KEY);
                }
        }
import java.util.ArrayList;
                }
            }
                        if (pos != -1) {
        } else {
                return;
                            locationMap.put(serverPath, new LocalNativeClientLocation(homeKey, serverPath));
import java.util.List;
    }
    @Override
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
import org.jkiss.dbeaver.registry.LocalSystemRegistry;
    ) {
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;
        url.append(connectionInfo.getHostName());
                        }
        if (needMariDBString) {
package org.jkiss.dbeaver.ext.mysql;
    public static Map<String,String> getConnectionsProps() {
                    while ((line = input.readLine()) != null) {
                            );
                                "homeKey=%s entry.key=%s entry.value=%s serverPath=%s registryRoot=%s installDirKey=%s")
        return NativeClientLocationUtils.findLocalClientsOnUnix(
 */
                try {
        return ovrValue != null ? ovrValue : super.getConnectionPropertyDefaultValue(name, value);
    @NotNull
        }
    @NotNull
        try {
    public static DBPNativeClientLocation getServerHome(String homeId) {


 * Unless required by applicable law or agreed to in writing, software

                    File binFolder = executableName.getAbsoluteFile().getParentFile();
                }
            url.append("jdbc:mariadb://");

                if (driverInstance instanceof Driver && ((Driver) driverInstance).getMajorVersion() >= 3) {
/*
    private static Map<String, DBPNativeClientLocation> findWindowsLocalClients() {
                    // Since 3.0 version Maria DB driver only accept `jdbc:mariadb:` classpath by default.
                String absolutePath = file.getAbsolutePath();
                p.destroy();
        File binSubfolder = new File(binPath, "bin");

import org.jkiss.dbeaver.DBException;
        return connectionsProps;
            } catch (DBException e) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
                File binPath = new File(CommonUtils.removeTrailingSlash(token));
        }

        // Tell MySQL to use the (typically longer) interactive_timeout variable as the connection timeout
import org.jkiss.dbeaver.Log;
    }
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        File executableName = new File(binPath, MySQLUtils.getMariaDBConsoleBinaryName());

    }
//            "org.jkiss.jdbc.mysql.auth.DialogAuthenticationPlugin");
        File binPath = path;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceProvider;

        if (driver.isSampleURLApplicable()) {
                            pos += 8;
 * Licensed under the Apache License, Version 2.0 (the "License");
        throws DBException
                        result.put(homeId, new LocalNativeClientLocation(homeId, homeId));
        connectionsProps.put("tinyInt1isBit", "false");
    public MySQLDataSourceProvider()
import org.jkiss.utils.IOUtils;
        return new MySQLDataSource(monitor, container);
    private static final String REGISTRY_ROOT_MARIADB = "SOFTWARE\\Monty Program AB";
        return url.toString();
        return getFullServerVersion(location.getPath());
            url.append(":").append(connectionInfo.getHostPort());
        String registryRoot,
        }
        //connectionsProps.put("zeroDateTimeBehavior", "CONVERT_TO_NULL");
    @NotNull
    private static final String SERER_LOCATION_KEY = "Location";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            log.warn("Error reading MySQL server version from " + cmd, ex);
        // kill their connection while they were on a coffee break.
        return new ArrayList<>(findLocalClients().values());
                        int pos = line.indexOf("Distrib ");
        }

                    }

    }
        // read from path
//            "com.mysql.jdbc.authentication.MysqlOldPasswordPlugin," +
        boolean needMariDBString = false;
                    if (binFolder.getName().equalsIgnoreCase("bin")) {
        if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
        }

    private static void searchInWindowsRegistry(
        System.setProperty("javax.net.ssl.keyStorePassword", "changeit");
        return null;
 *
                        String homeId = CommonUtils.removeTrailingSlash(binFolder.getParentFile().getAbsolutePath());

            binPath = binSubfolder;

import java.sql.Driver;
    }
            }
    public String getProductVersion(DBPNativeClientLocation location) {
        if (!executableName.exists()) {
            for (String token : path.split(File.pathSeparator)) {
                            return line.substring(pos, pos2);
//        connectionsProps.put("authenticationPlugins",
        url.append("/");
        }
import java.util.Map;
        }
        return localClients;
        Map<String, DBPNativeClientLocation> result = new HashMap<>();
        // Set utf-8 as default charset
