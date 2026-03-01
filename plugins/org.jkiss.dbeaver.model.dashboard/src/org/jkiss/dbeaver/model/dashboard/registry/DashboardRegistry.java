        // Load dashboards from config
                .sorted(Comparator.comparing(DashboardProviderDescriptor::getName))
import java.util.stream.Collectors;
                    for (DashboardItemConfiguration dashboard : dashboardItems.values()) {
        String providerId = DashboardConstants.DEF_DASHBOARD_PROVIDER;

                return folder;
                    .getPluginConfigurationController(DashboardConstants.DASHBOARDS_LEGACY_PLUGIN_ID)

        if (dpd != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (!DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER)) {
                throw new IllegalArgumentException("Only custom dashboards can be removed");
        for (DBDashboardFolder folder : folders) {
    public List<DashboardItemConfiguration> getDashboardItems(
                        }
 * limitations under the License.
        }
            log.error("Error loading dashboard configuration", e);
            }
package org.jkiss.dbeaver.model.dashboard.registry;

            .sorted(Comparator.comparing(DashboardProviderDescriptor::getName))
import org.eclipse.core.runtime.IExtensionRegistry;
                    configContent = DBWorkbench.getPlatform()
        }
        }
        divPos = id.lastIndexOf('/');
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
        @NotNull DBDashboardContext context,
        String providerId = null, driverId = null, driverClass = null;
    private final Map<String, DashboardItemConfiguration> dashboardItems = new LinkedHashMap<>();

    private static final Log log = Log.getLog(DashboardRegistry.class);
                .loadConfigurationFile(CONFIG_FILE_NAME);
    }
        }
                return null;
            saveConfigFile();
    private final List<DashboardRegistryListener> listeners = new ArrayList<>();
    public DashboardProviderDescriptor getDashboardProvider(String id) {
            if (dashboardItems.containsKey(itemConfiguration.getId())) {
import org.jkiss.dbeaver.model.rm.RMConstants;
            }
import org.jkiss.dbeaver.model.dashboard.DashboardConstants;
                throw new IllegalArgumentException("Only custom dashboards can be added");
    private static DashboardRegistry instance = null;
import java.util.*;
    public synchronized void addListener(@NotNull DashboardRegistryListener listener) {
     */
                    if (!defaultOnly || dd.isShowByDefault()) {
        synchronized (syncRoot) {
                throw new IllegalArgumentException("Dashboard " + dashboard.getId() + "' doesn't exist");
            source = dsc.getDriver();
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private final Map<String, DashboardProviderDescriptor> dashboardProviders = new LinkedHashMap<>();
            if (!DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER)) {
        }
    public void saveSettings() {
        }
    public List<DashboardItemConfiguration> getAllDashboards() {
    }
                synchronized (syncRoot) {
        return null;

        @NotNull DBRProgressMonitor monitor,
        if (divPos != -1) {
import org.jkiss.utils.xml.XMLBuilder;
        for (DashboardRegistryListener listener : listeners) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            if ("provider".equals(ext.getName())) {
    private DashboardRegistry(IExtensionRegistry registry) {
            DBDashboardFolder curFolder = null;
            .filter(DashboardProviderDescriptor::isSupportsCustomDashboards)
                if (providerId == null || dd.matches(providerId, driverId, driverClass)) {
                if (CommonUtils.isNotEmpty(configContent)) {
                dashboardItems.values().removeIf(DashboardItemConfiguration::isCustom);

                    curFolder = findFolder(provider.getInstance().loadRootFolders(monitor, provider, context), pathItem);
        synchronized (syncRoot) {

                if (curFolder == null) {
    public DashboardItemConfiguration getDashboardItem(String id) {
    }
            .filter(d -> !d.isDatabaseRequired())
            }
                }
    /**
import org.eclipse.core.runtime.Platform;
            id = id.substring(divPos + 1);
            }
        }
}
                dashboardProviders.put(provider.getId(), provider);
            if (curFolder == null) {
        @Nullable DashboardProviderDescriptor provider,
        return instance;
            String configContent = DBWorkbench.getPlatform()
                }
                    result.addAll(dd.getSupportedSources());
        try {
            if (!dashboardItems.containsKey(dashboard.getId())) {
                log.debug("Dashboard polder path '" + path + "' cannot be resolved");
                    }
        } else if (source instanceof DBPDriver driver) {
                .toList();
        }
                    .loadConfigurationFile(CONFIG_FILE_NAME);
            providerId = id.substring(0, divPos);
        }

        this.listeners.add(listener);
                    continue;

        @NotNull String id

            }

            DashboardProviderDescriptor provider = getDashboardProvider(providerId);
                        dashboardItems.put(dashboard.getId(), dashboard);
                }
                            }

            if (CommonUtils.isEmpty(configContent) && !DBWorkbench.isDistributed()) {
            return;
            instance = new DashboardRegistry(Platform.getExtensionRegistry());
                    }
            }
    public List<DashboardProviderDescriptor> getDashboardProvidersWithSupportCustomDashboards() {
        boolean defaultOnly
import org.jkiss.dbeaver.model.dashboard.DBDashboardFolder;
        return this.getDashboardProviders().stream()
import org.eclipse.core.runtime.IConfigurationElement;

    }
        }
            DBWorkbench.getPlatform()
        }
            }
            if (folder.getId().equals(id)) {
        if (divPos != -1) {
        if (source instanceof DBPDataSourceContainer dsc) {
                    curFolder = findFolder(curFolder.loadSubFolders(monitor, context), pathItem);
            }
            log.warn("The user has no permission to save dashboards configuration");
    public static final String CONFIG_FILE_NAME = "dashboards.xml";
    }
    }
                .getConfigurationController()
                    }
                log.debug("Dashboard provider '" + providerId + "' not found");

    public List<DashboardProviderDescriptor> getDashboardProviders() {
 * you may not use this file except in compliance with the License.
import org.jkiss.utils.CommonUtils;
                if (dd.getDashboardProvider() == dpd) {
            xml.setBeautify(true);
        if (dataSource != null) {
import org.jkiss.dbeaver.model.dashboard.DBDashboardContext;
            }
        }
        return sortedDrivers;


            try (var e = xml.startElement("dashboards")) {
            return dashboardItems.get(id);
    ) {
 * DBeaver - Universal Database Manager
            }
        }
import org.jkiss.dbeaver.DBException;
        ArrayList<DBPNamedObject> sortedDrivers = new ArrayList<>(result);
    }
        DashboardProviderDescriptor dpd = dashboardProviders.get(id);
        }
    public synchronized void removeListener(@NotNull DashboardRegistryListener listener) {
            for (DashboardItemConfiguration dd : dashboardItems.values()) {
                        result.add(dd);
        return new ArrayList<>(dashboardProviders.values());
            return new ArrayList<>(dashboardItems.values());
        @Nullable DBPNamedObject source,
import org.jkiss.dbeaver.model.WorkspaceConfigEventManager;
        saveConfigFile();
import org.jkiss.code.Nullable;
        synchronized (syncRoot) {
            saveConfigFile();
    public DashboardItemConfiguration findDashboardItem(
    public void createDashboardItem(DashboardItemConfiguration itemConfiguration) throws IllegalArgumentException {
            }
        // Load all static dashboards
            }
     * Source can be {@link DBPDataSourceContainer}, {@link DBPDataSourceProviderDescriptor} or {@link DBPDriver}
 * Unless required by applicable law or agreed to in writing, software
        if (instance == null) {
            if (!itemConfiguration.isCustom()) {
                .saveConfigurationFile(CONFIG_FILE_NAME, out.getBuffer().toString());
import org.jkiss.dbeaver.Log;
            .filter(DashboardProviderDescriptor::isEnabled)
import org.jkiss.dbeaver.model.connection.DBPDriver;
            path = id.substring(0, divPos);
            }
        this.listeners.remove(listener);
    public synchronized static DashboardRegistry getInstance() {
                throw new IllegalArgumentException("The user has no permission to create dashboard configuration");
            while (path.startsWith("/")) path = path.substring(1);

                                dashboard.serialize(xml);
            providerId = dspd.getId();
            synchronized (syncRoot) {
            log.debug("Dashboard '" + id + "' not found in path '" + path + "'");
import org.w3c.dom.Document;
public class DashboardRegistry {
    public List<DBPNamedObject> getAllSupportedSources(@NotNull DashboardProviderDescriptor dpd) {
            if (provider == null) {

    }
import java.io.StringReader;
import org.jkiss.dbeaver.model.dashboard.DBDashboardProvider;
 *
        loadConfigFromFile();



            dashboardItems.put(itemConfiguration.getId(), itemConfiguration);
    }
    }
                }
 *
    }
        } catch (Exception e) {
                        .loadConfigurationFile(CONFIG_FILE_NAME);
                            try (var e1 = xml.startElement("dashboard")) {
    }
                }
    private final Object syncRoot = new Object();
            }
            return dashboardItems.get(id);
        if (source instanceof DBPDataSourceProviderDescriptor dspd) {
        for (DashboardRegistryListener listener : listeners) {
            id = id.substring(divPos + 1);
            .collect(Collectors.toList());
            return null;
            if (!dashboard.isCustom()) {
                    Document dbDocument = XMLUtils.parseDocument(new StringReader(configContent));
        return result;
import org.jkiss.dbeaver.utils.GeneralUtils;
            }
                // Clear all custom dashboards
            xml.flush();
                } else {


    public void removeDashboardItem(DashboardItemConfiguration dashboard) throws IllegalArgumentException {
            XMLBuilder xml = new XMLBuilder(out, GeneralUtils.UTF8_ENCODING);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.xml.XMLUtils;
            driverId = driver.getId();
    private void loadConfigFromFile() {
                return null;
        }
                DashboardProviderDescriptor provider = new DashboardProviderDescriptor(ext);
 * You may obtain a copy of the License at
                throw new IllegalArgumentException("Dashboard " + itemConfiguration.getId() + "' already exists");
            }
    private void saveConfigFile() {
                if (curFolder == null) {
    }
            for (DashboardItemConfiguration dd : dashboardItems.values()) {
                if (dashboard.getId().equals(id)) {

        }
        }

import org.jkiss.dbeaver.runtime.DBWorkbench;
        String path = null;
 */
        if (!DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER)) {
            while (path.endsWith("/")) path = path.substring(0, path.length() - 1);
    ) throws DBException {
                throw new IllegalArgumentException("The user has no permission to remove dashboard configuration");
            for (String pathItem : path.split("/")) {
                if (CommonUtils.isEmpty(configContent)) {
                }
import org.jkiss.code.NotNull;
            log.error("Error saving dashboard configuration", e);

 * distributed under the License is distributed on an "AS IS" BASIS,
        } catch (Exception e) {
                // Backward compatibility
    }
                }
            out.flush();
    }

        }
                configContent = DBWorkbench.getPlatform()
            StringWriter out = new StringWriter();
            dashboardItems.remove(dashboard.getId());
                }
        return null;
                        if (dashboard.isCustom()) {
import org.jkiss.dbeaver.model.DBPNamedObject;
        }
 *
        try {
        // Load dashboards providers

import org.w3c.dom.Element;
 * See the License for the specific language governing permissions and
    private DBDashboardFolder findFolder(List<DBDashboardFolder> folders, String id) {
        return dashboardProviders.values().stream()
                if (provider != null && provider != dd.getDashboardProvider()) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    return dashboard;
            listener.handleItemCreate(itemConfiguration);
                    for (Element dbElement : XMLUtils.getChildElementList(dbDocument.getDocumentElement(), "dashboard")) {

    public DBDashboardProvider getDashboardProviderInstance(String id) {

            return dashboardProviders.values().stream().filter(dp -> dp.appliesTo(dataSource))
                        .getPluginConfigurationController(DashboardConstants.DASHBOARDS_LEGACY_PLUGIN_ID2)
        synchronized (syncRoot) {
        List<DashboardItemConfiguration> result = new ArrayList<>();
        }
                        DashboardItemConfiguration dashboard = new DashboardItemConfiguration(this, dbElement);
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;

            return dpd.getInstance();
        WorkspaceConfigEventManager.addConfigChangedListener(CONFIG_FILE_NAME, o -> loadConfigFromFile());
            listener.handleItemDelete(dashboard);
        DBDashboardContext staticContext = new DBDashboardContext();

        for (IConfigurationElement ext : extElements) {
            }
        for (DashboardProviderDescriptor dp : dashboardProviders.values()) {
                    break;
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(DashboardItemConfiguration.EXTENSION_ID);

    }
        synchronized (syncRoot) {
            }
                .getConfigurationController()
        if (!CommonUtils.isEmpty(path)) {
        }
import java.io.StringWriter;
                dashboardItems.put(dashboard.getId(), dashboard);
        }

        synchronized (syncRoot) {
            driverClass = driver.getDriverClassName();

    }
            for (DashboardItemConfiguration dashboard : dp.getInstance().loadStaticDashboards(dp)) {
/*
        synchronized (syncRoot) {
            for (DashboardItemConfiguration dashboard : curFolder.loadDashboards(monitor, context)) {
    }
    public List<DashboardProviderDescriptor> getDashboardProviders(DBPDataSourceContainer dataSource) {
    }
        }
        return dashboardProviders.get(id);
            .toList();

        int divPos = id.indexOf(':');
     * Find dashboard matching source.
        sortedDrivers.sort(Comparator.comparing(DBPNamedObject::getName));
        // Load data dashboardList from external plugins
    }
            providerId = driver.getProviderId();
        Set<DBPNamedObject> result = new LinkedHashSet<>();
