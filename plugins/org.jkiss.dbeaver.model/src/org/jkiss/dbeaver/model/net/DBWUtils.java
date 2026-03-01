        @Nullable String hostPort,
            case MANUAL -> explicitConfiguration;
                    }
                    }
                if (CommonUtils.isNotEmpty(activeUrl)) {
                        }
                    ConnectivityParameters urlConnectivityParams = null;
                String activeUrl = driver.getConnectionURL(configuration);
                            metaURL = DatabaseURL.parseSampleURL(DatabaseURL.GENERIC_URL_TEMPLATE);
        return CommonUtils.notEmpty(hostText);
            hostText.equals(LOOPBACK_IPV6_FULL_HOST_NAME);
            : dataSourceContainer.getRegistry().getNetworkProfile(cfg.getConfigProfileSource(), cfg.getConfigProfileName());
        connectionInfo.setHostPort(Integer.toString(localPort));
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            case URL -> {
        DBWNetworkProfile profile = getNetworkProfile(container);

    /**
import org.jkiss.utils.CommonUtils;
 *
        if (configuration.getDriver() != null) {
        List<DBWHandlerConfiguration> configurations;
                            : explicitConfiguration.databaseName();
        }
            configurations = profile.getConfigurations();
package org.jkiss.dbeaver.model.net;
            ? null
        @Nullable String userName,
        }
        if (profile != null) {
     * @param container data source container to retrieve network handlers for
    public static void updateConfigWithTunnelInfo(
            return null;
 * DBeaver - Universal Database Manager
            connectionInfo.setUrl(newURL);
        String defaultCatalogName = configuration.getBootstrap().getDefaultCatalogName();

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Returns information about connection by its configuration.
                        explicitConfiguration.userName(),
            for (DBWHandlerConfiguration hc : cfg.getHandlers()) {
                        hostText = tunnelHost;
                if (hc.isEnabled() && hc.getType() == DBWHandlerType.TUNNEL) {
                    }
                } else {
        };
    @NotNull
    public static DBWNetworkProfile getNetworkProfile(@NotNull DBPDataSourceContainer dataSourceContainer) {
                    if (!CommonUtils.isEmpty(tunnelHost)) {
                    }
                    yield new ConnectivityParameters(
            hostText.equals(LOCAL_NAME) ||
                        break;
import java.util.Set;
                    );
 * distributed under the License is distributed on an "AS IS" BASIS,
                    DatabaseURL.MetaURL metaURL = null;
    }
                            url.getPort() != -1 ? Integer.toString(url.getPort()) : null,
     */
            configuration.getUserName(),
                        urlConfiguration = DatabaseURL.extractConfigurationFromUrl(driver.getSampleURL(), activeUrl);
    public record ConnectivityParameters(
                        urlConnectivityParams = getExplicitConnectivityParameters(urlConfiguration);
     * or generic URL template, if sample URL template is empty.
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
        } else if (!LOCALHOST_NAME.equals(connectionInfo.getHostName()) && !LOCAL_NAME.equals(connectionInfo.getHostName())) {

            String newURL = configuration.getDriver().getConnectionURL(connectionInfo);
        }
                        urlConfiguration = DatabaseURL.extractConfigurationFromUrl(DatabaseURL.GENERIC_URL_TEMPLATE, activeUrl);
    public static ConnectivityParameters getConnectivityParameters(
        return host;
    ) {
        ConnectivityParameters explicitConfiguration = getExplicitConnectivityParameters(configuration);
        return configurations.stream()
                            null
    ) throws DBException {

            configuration.getHostPort(),
    public static List<DBWHandlerConfiguration> getActualNetworkHandlers(@NotNull DBPDataSourceContainer container) {
     * If the configuration type is URL, it extracts information
            connectionInfo.setHostName(localHost);

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                        urlConnectivityParams.server()
                            ? urlConnectivityParams.databaseName()
                            metaURL = DatabaseURL.parseSampleURL(driver.getSampleURL());


        @NotNull DBPConnectionConfiguration configuration,
    public static boolean isLocalAddress(String hostText) {
                }
import org.jkiss.dbeaver.model.DBConstants;
                    }
                            url.getUserInfo(),
                    yield new ConnectivityParameters(
        @Nullable String server
            .toList();
}
                }
        return CommonUtils.isEmpty(hostText) ||
                        DBWHandlerConfiguration hCfg = networkProfile.getConfiguration(hc.getHandlerDescriptor());
                    if (networkProfile != null) {
                        urlConnectivityParams.hostName(),

                        tunnelHost = getTunnelHostFromConfig(hc);
    ) {

                    Set<String> requiredUrlParts = metaURL != null ? metaURL.getRequiredProperties() : Collections.emptySet();
    public static @Nullable String getTunnelHostFromConfig(DBWHandlerConfiguration hc) {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

                    String userName = requiredUrlParts.contains(DBConstants.PROP_USER)
            DBWNetworkProfile networkProfile = dataSourceContainer == null ? null : getNetworkProfile(dataSourceContainer);
                        userName,
                    if (urlConfiguration != null) {
                        ? urlConnectivityParams.databaseName()
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
        DBPConnectionConfiguration connectionInfo,

        int localPort
import java.util.List;
            CommonUtils.isNotEmpty(defaultCatalogName) ? defaultCatalogName : configuration.getDatabaseName(),
 *
                        : CommonUtils.isNotEmpty(urlConnectivityParams.userName())
            }
                    }
                        );
            configuration.getHostName(),
        );
                        ? urlConnectivityParams.userName()
        String hostText = cfg.getHostName();
        String localHost,
     */
        } else {
            configuration.getServerName()
 * limitations under the License.
        }
    }
                        databaseName,
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
    public static String getTargetTunnelHostName(@Nullable DBPDataSourceContainer dataSourceContainer, @NotNull DBPConnectionConfiguration cfg) {
                        URI url = URI.create(activeUrl.startsWith(jdbcPrefix) ? activeUrl.substring(jdbcPrefix.length()) : activeUrl);
        DBPConnectionConfiguration cfg = dataSourceContainer.getConnectionConfiguration();

        }
                        driver.getDefaultHost(),
                        null
    public static final String SSH_TUNNEL = "ssh_tunnel";
import org.jkiss.dbeaver.model.DatabaseURL;
public class DBWUtils {
            hostText.equals(LOOPBACK_HOST_NAME) ||
    public static final String LOOPBACK_IPV6_HOST_NAME = ":1";
 * Licensed under the Apache License, Version 2.0 (the "License");
                        explicitConfiguration.databaseName(),
                        }
        @Nullable String databaseName,
        if (CommonUtils.isEmpty(host)) {
        if (CommonUtils.isNotEmpty(localHost)) {
 * You may obtain a copy of the License at
        String host = hc.getStringProperty(DBWHandlerConfiguration.PROP_HOST);
import org.jkiss.dbeaver.DBException;
                    if (urlConfiguration == null) {


        return switch (configuration.getConfigurationType()) {

import org.jkiss.dbeaver.model.connection.DBPDriver;
     *
        return CommonUtils.isEmpty(cfg.getConfigProfileName())
                    }
                        if (hCfg != null) {
            hostText.equals(LOCALHOST_NAME) ||
                            ? urlConnectivityParams.userName()
        // Replace database host/port and URL
    }
    public static final String LOOPBACK_HOST_NAME = "127.0.0.1";
     * @return a list of enabled network handlers
import java.util.Collections;
            .filter(DBWHandlerConfiguration::isEnabled)
                        : CommonUtils.isNotEmpty(urlConnectivityParams.databaseName())
        @NotNull DBPDriver driver
    public static final String LOCALHOST_NAME = "localhost";
    /**
        @Nullable String hostName,
    }
                        final String jdbcPrefix = "jdbc:";

                        if (urlConfiguration != null) {
        return new ConnectivityParameters(
                        driver.getDefaultPort(),
     * according to the sample URL template in the driver properties
                    String tunnelHost = null;
 */
    @NotNull
            connectionInfo.setHostName(LOOPBACK_HOST_NAME);

    private static ConnectivityParameters getExplicitConnectivityParameters(@NotNull DBPConnectionConfiguration configuration) {
                        urlConnectivityParams.hostPort(),
                            : explicitConfiguration.userName();
                    if (CommonUtils.isNotEmpty(driver.getSampleURL())) {
                            url.getHost(),
    @Nullable
 *
                    String databaseName = requiredUrlParts.contains(DBConstants.PROP_DATABASE)
                        }
import java.net.URI;
                        if (urlConfiguration != null) {
                    if (tunnelHost == null) {
    }
        if (isLocalAddress(hostText)) {

    public static final String LOOPBACK_IPV6_FULL_HOST_NAME = "0:0:0:0:0:0:0:1";
import org.jkiss.code.NotNull;
            hostText.equals(LOOPBACK_IPV6_HOST_NAME) ||
            configurations = container.getConnectionConfiguration().getHandlers();

     * for a connection, possible from an active network profile.
                        urlConnectivityParams = new ConnectivityParameters(
        // For localhost ry to get real host name from tunnel configuration
    @NotNull
                    if (urlConnectivityParams == null) {
            // Driver can be null in case of orphan tunnel config (e.g. in network profile)
    }
                            tunnelHost = getTunnelHostFromConfig(hCfg);
                            url.getPath() != null && url.getPath().startsWith("/") ? url.getPath().substring(1) : url.getPath(),
                    );
    }
                    DBPConnectionConfiguration urlConfiguration = null;
/*
    public static final String LOCAL_NAME = "local";
     * Retrieves a list of effectively enabled network handlers
        DBWHandlerConfiguration configuration,
