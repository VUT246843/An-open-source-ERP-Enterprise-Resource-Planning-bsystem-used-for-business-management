        }
    private static Map<String, String> connectionsProps;
        DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();

    @Override
        return url.toString();
import org.jkiss.dbeaver.model.connection.*;
        return new PostgreDataSource(monitor, container);
            ).values();
            url.append(":").append(configToUse.getHostPort());
 *     http://www.apache.org/licenses/LICENSE-2.0
    private static Collection<DBPNativeClientLocation> localClients;


                p.destroy();
                List.of("bin/psql"),

                path -> {
                        for (String homeKey : homeKeys) {
            localClients = NativeClientLocationUtils.findLocalClientsOnUnix(
        if (preferenceStore != null) {
            }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public PostgreDataSourceProvider() {
import org.jkiss.dbeaver.model.access.DBAAuthModel;
        File binSubfolder = new File(binPath, "bin");
public class PostgreDataSourceProvider extends JDBCDataSourceProvider implements DBPNativeClientLocationManager {
 * Licensed under the Apache License, Version 2.0 (the "License");
                    if (homeKeys != null) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
        try {
                        return line;

                    }
            try {


                    }
                    String[] homeKeys = registry.registryGetKeys("HKEY_LOCAL_MACHINE", PostgreConstants.PG_INSTALL_REG_KEY);
            PrefUtils.setDefaultPreferenceValue(preferenceStore, PostgreConstants.PROP_DD_TAG_STRING, false);
                }
    public List<DBPNativeClientLocation> findLocalClientLocations() {
        if (location instanceof PostgreServerHome) {
 *
            url.append(configToUse.getDatabaseName());
            try {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
        return connectionsProps;
        return new ArrayList<>(findLocalClients());
        if (authModel instanceof DBPDataSourceURLProvider sourceURLProvider) {
    }

            RuntimeUtils.getNativeBinaryName("psql")).getAbsolutePath();

        connectionsProps = new HashMap<>();
                                    break;
                LocalSystemRegistry.Registry registry = LocalSystemRegistry.getInstance();

                            }
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    @Override
                                    String baseDir = CommonUtils.removeTrailingSlash(CommonUtils.toString(valuesMap.get(PostgreConstants.PG_INSTALL_PROP_BASE_DIRECTORY)));
    @Override
            return DatabaseURL.generateUrlByTemplate(driver, configToUse);
import org.jkiss.dbeaver.model.DBPDataSource;
                if (registry.registryKeyExists("HKEY_LOCAL_MACHINE", PostgreConstants.PG_INSTALL_REG_KEY)) {
                    String line;

        return true;
        DBPConnectionConfiguration configToUse = connectionInfo;
    }
        }
            binPath = binSubfolder;
        return FEATURE_CATALOGS | FEATURE_SCHEMAS;
        if (binSubfolder.exists()) {

        }
import java.util.*;
            configToUse = new DBPConnectionConfiguration(connectionInfo);
import org.jkiss.dbeaver.registry.LocalSystemRegistry;
            }
    public long getFeatures() {
        }
        @NotNull DBRProgressMonitor monitor,
 * limitations under the License.
import java.io.InputStreamReader;
package org.jkiss.dbeaver.ext.postgresql;

            binPath,
 * See the License for the specific language governing permissions and
    }
    @Override
import org.jkiss.code.NotNull;
        throws DBException {
                } finally {
            Process p = Runtime.getRuntime().exec(new String[] {cmd, "--version"});
            String connectionURL = sourceURLProvider.getConnectionURL(driver, configToUse);
    }
            if (CommonUtils.isNotEmpty(connectionURL)) {
    }

            }
 * you may not use this file except in compliance with the License.
    // Local client
        // find homes in Windows registry
    }
        if (databaseName != null && databaseName.contains("/")) {


        if (serverType.supportsCustomConnectionURL()) {
    }
    @Nullable
        return "PostgreSQL";
        String databaseName = connectionInfo.getDatabaseName();
        url.append("/");
                            for (String key : valuesMap.keySet()) {
 * DBeaver - Universal Database Manager
    }
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
            configToUse.setDatabaseName(databaseName.replace("/", "%2F"));
            log.warn("Error reading PostgreSQL local client version from " + cmd, ex);
    }
            localClients = new HashSet<>();

                            Map<String, Object> valuesMap = registry.registryGetValues("HKEY_LOCAL_MACHINE", PostgreConstants.PG_INSTALL_REG_KEY + "\\" + homeKey);
        PostgreServerType serverType = PostgreUtils.getServerType(driver);
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerType;
                    if ((line = input.readLine()) != null) {
    static {

import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceProvider;

        if (!CommonUtils.isEmpty(configToUse.getHostPort())) {
    @NotNull


                return connectionURL;
            } finally {
    /**
                                    String branding = CommonUtils.toString(valuesMap.get(PostgreConstants.PG_INSTALL_PROP_BRANDING));
    ////////////////////////////////////////////////////////////////
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return localClients;
        }

     * We disable provider bundle as classes source because is contains JNA dependency

        }
        }
        } else {
 */
import org.jkiss.dbeaver.model.DBPDataSourceURLProvider;
import org.jkiss.utils.IOUtils;
    @Override
                }
        if (localClients != null) {
                    IOUtils.close(input);
}
    @NotNull
 *
    public DBPDataSource openDataSource(
import org.jkiss.dbeaver.utils.PrefUtils;
import org.jkiss.dbeaver.utils.RuntimeUtils;
        @NotNull DBPDataSourceContainer container)
        if (configToUse.getConfigurationType() == DBPDriverConfigurationType.URL) {
    public String getProductVersion(DBPNativeClientLocation location) {
    @Override
import org.jkiss.utils.CommonUtils;
import java.io.File;
        DBAAuthModel<?> authModel = configToUse.getAuthModel();
        }
     */
 *
        }

                                if (PostgreConstants.PG_INSTALL_PROP_BASE_DIRECTORY.equalsIgnoreCase(key)) {

    public String getProductName(DBPNativeClientLocation location) {

            } catch (Throwable e) {
        }
                    String absolutePath = path.toAbsolutePath().toString();
    }
    }
        }
    public boolean providesDriverClasses() {
            return localClients;
        url.append(configToUse.getHostName());
        catch (Exception ex) {
                        }
        String cmd = new File(


    public static Map<String, String> getConnectionsProps() {
        }
    @Nullable
                }
        }
                                }

            return location.getDisplayName();
    public DBPNativeClientLocation getDefaultLocalClientLocation() {
                try {
    private static synchronized Collection<DBPNativeClientLocation> findLocalClients() {
                                    localClients.add(new PostgreServerHome(homeKey, baseDir, branding));
                    return new PostgreServerHome(absolutePath, absolutePath, absolutePath);
                BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
     * which conflicts with Waffle (which contains JNA 4.5).
/*
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return getFullServerVersion(location.getPath());
     * Solution: move all JNA-dependent functions to a separate bundle.
            PrefUtils.setDefaultPreferenceValue(preferenceStore, PostgreConstants.PROP_DD_PLAIN_STRING, false);
import org.jkiss.dbeaver.model.DatabaseURL;
        return CommonUtils.getFirstOrNull(findLocalClientLocations());
                log.warn("Error reading Windows registry", e);
import java.io.BufferedReader;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static String getFullServerVersion(File path) {
        File binPath = path;
        StringBuilder url = new StringBuilder("jdbc:postgresql://");

    }
        if (!CommonUtils.isEmpty(configToUse.getDatabaseName())) {
                List.of("/Library/PostgreSQL", "/Applications/Postgres.app/Contents/versions"),

        return null;
import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
        if (RuntimeUtils.isWindows()) {
            return configToUse.getUrl();

     * Technically it is a hack.
