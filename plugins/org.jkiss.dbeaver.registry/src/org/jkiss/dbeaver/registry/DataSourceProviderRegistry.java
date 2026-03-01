    @Override
        }
            );
                ecCopy.add(editor);
                xml.addAttribute(RegistryConstants.ATTR_CLOSE_TRANSACTIONS_PERIOD, connectionType.getCloseIdleTransactionPeriod());
                    connectionType.setModifyPermissions(permList);
        boolean progress = true;
                }
    public List<DataSourceAuthModelDescriptor> getAllAuthModels() {
            log.warn("Error parsing connection types", ex);

            }
        );
    //////////////////////////////////////////////
                    return -1;
            if (driverPath.length == 2) {
    }
                if (driver != null) {
                    attributes.getValue(RegistryConstants.ATTR_COLOR),
                        driver = d;
        @Override
                authModels.put(descriptor.getId(), descriptor);
                baos.toString(StandardCharsets.UTF_8)



                }

                    }
                log.warn("Some datasource registry listeners are still registered: " + registryListeners);
            log.warn("Duplicate connection type id: " + connectionType.getId());
                connectionTypes.put(ct.getId(), ct);
                    for (String alias : resource.getAlias().split(",")) {
                        driverSubstitutions.put(descriptor.getId(), descriptor);
    }
                    }
                        attributes.getValue(RegistryConstants.ATTR_AUTO_CLOSE_CONNECTIONS),
        WorkspaceConfigEventManager.addConfigChangedListener(DriverDescriptorSerializerLegacy.DRIVERS_FILE_NAME,
                    .collect(Collectors.joining(", ")));
        int driverCount = 0;
        enabled.removeIf(p ->
                        break;
    public DBPPreferenceStore getGlobalDataSourcePreferenceStore() {
        }
    public void addConnectionType(DBPConnectionType connectionType) {

                }
                    }
        if (!CommonUtils.isEmpty(providedDriversConfig)) {
    private static DataSourceProviderRegistry instance = null;
        try {
                return;
        {
    private final List<DataSourceConfigurationStorageDescriptor> dataSourceConfigurationStorageDescriptors = new ArrayList<>();
                super.removePropertyChangeListener(listener);

            saveDrivers();
            // Sort - parse providers with parent in the end
                        DataSourceProviderDescriptor provider = getDataSourceProvider(ext.getAttribute(RegistryConstants.ATTR_ID));
            }
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(ExternalResourceDescriptor.EXTENSION_ID);

    }
    //////////////////////////////////////////////

                }
    /**
                            provider.linkParentProvider(ext);
        };
    public void readDriversConfig() {
                l.handleRegistryUnload(registry);
            log.error(e);
    }
    public DBPDriver findDriver(@NotNull String driverIdOrName) {
            }
                    }
        synchronized (registryListeners) {
                if (o2.isDriversManageable() && !o1.isDriversManageable()) {
            }
        }
                    case RegistryConstants.TAG_DATASOURCE: {

            instance.loadExtensions(Platform.getExtensionRegistry());
        ExternalResourceDescriptor descriptor = resourceContributions.get(resourcePath);
    private final Map<String, List<EditorContributionDescriptor>> contributionCategoryMap = new HashMap<>();
import java.net.URL;

    }
                remainingElements.stream()
 * Unless required by applicable law or agreed to in writing, software
            for (IConfigurationElement ext : configurationElements) {
    private final List<DataSourceHandlerDescriptor> dataSourceHandlers = new ArrayList<>();
    public DBPDriverSubstitutionDescriptor getDriverSubstitution(@NotNull String id) {
                driver = pd.getDriver(driverIdOrName);
            if (!registryListeners.isEmpty()) {
    }
                    processedIds.add(id);
        }
                        if (provider != null) {
                new SAXReader(is).parse(
                continue;

            @Override
        }
                            descriptor.getCategory(), k -> new ArrayList<>());
    public DataSourceProviderDescriptor getDataSourceProvider(String id) {
        boolean didResolve = false;
            for (DBPConnectionType connectionType : connectionTypes.values()) {
                    }
        }
                xml.addAttribute(RegistryConstants.ATTR_NAME, CommonUtils.toString(connectionType.getName()));
        if (!remainingElements.isEmpty()) {
    private List<IConfigurationElement> sortConfigurationElements(@NotNull IConfigurationElement[] extElements) {
                dataSourceHandlers.add(descriptor);
                                log.error("Cannot replace provider '" + providerId + "' - bad provider ID");
            } else {


    @Override
                    new DriverDescriptorSerializerLegacy.DriversParser(provided));
                        origType != null && origType.isAutoCloseTransactions()),
 * You may obtain a copy of the License at

        // Resolve all driver replacements

                    List<DBPDataSourcePermission> permList = new ArrayList<>();
                    }

import org.jkiss.dbeaver.model.connection.*;
                    sortedElements.add(element);

        if (driver == null) {
    private final Map<String, ExternalResourceDescriptor> resourceContributions = new LinkedHashMap<>();

            for (IConfigurationElement ext : configurationElements) {

                driversConfig = Files.readString(Path.of(configFileName), StandardCharsets.UTF_8);
            if (CommonUtils.isEmpty(driversConfig)) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;

        return driverSubstitutions.get(id);
                    break;
    @Nullable
                xml.endElement();
    public DBPDataSourceOriginProvider getDataSourceOriginProvider(@NotNull String id) {
                xml.addAttribute(RegistryConstants.ATTR_CONFIRM_DATA_CHANGE, connectionType.isConfirmDataChange());
    //////////////////////////////////////////////
        for (DataSourceProviderDescriptor dspd : this.dataSourceProviders) {
                        String providerId = ext.getAttribute("provider");
    //////////////////////////////////////////////
                            DataSourceProviderDescriptor provider = getDataSourceProvider(providerId);
    }
                        EditorContributionDescriptor descriptor = new EditorContributionDescriptor(ext);
        // Load datasource handlers
        return descriptor == null ? null : descriptor.getURL();
        synchronized (registryListeners) {
                xml.addAttribute(RegistryConstants.ATTR_COLOR, connectionType.getColor());
                xml.addAttribute(RegistryConstants.ATTR_SMART_COMMIT, connectionType.isSmartCommit());
                DataSourceProviderDescriptor dsProvider = getDataSourceProvider(driverPath[0]);

                    CommonUtils.getBoolean(
                        attributes.getValue(RegistryConstants.ATTR_SMART_COMMIT),
        for (DBPRegistryListener listener : lCopy) {
            }
import org.eclipse.core.runtime.Platform;
            }
            String driversConfig;
                        DataSourceOriginProviderDescriptor provider = new DataSourceOriginProviderDescriptor(ext);
            while (driver.getReplacedBy() != null) {
            consumer.accept(listener);
                xml.startElement(RegistryConstants.TAG_TYPE);
    @Nullable
    @Override
                List<DBPDataSourcePermission> modifyPermission = connectionType.getModifyPermission();


            for (IConfigurationElement ext : extElements) {
        } catch (Exception ex) {
import org.jkiss.api.CompositeObjectId;
                }
        for (DataSourceProviderDescriptor providerDescriptor : this.dataSourceProviders) {
        this.resourceContributions.clear();
    }
import java.io.StringReader;
    private final Map<String, DataSourceOriginProviderDescriptor> dataSourceOrigins = new LinkedHashMap<>();
                dataSourceAuthModelDescriptor -> replaced.contains(dataSourceAuthModelDescriptor.getId()));
                switch (ext.getName()) {
        {
        // Progress flag: if a full pass over `remaining` doesn't process any element,
        return sortedElements;

        DataSourceOriginProviderDescriptor descriptor = dataSourceOrigins.get(id);
            throws XMLException {
    }
    @Nullable
    //////////////////////////////////////////////
        return dataSourceProvidersMap.get(id);
    public List<DataSourceHandlerDescriptor> getDataSourceHandlers() {
        if (driver != null) {

    @NotNull
        }
            for (IConfigurationElement ext : extElements) {

    public DBPEditorContribution[] getContributedEditors(String category, DBPDataSourceContainer dataSource) {
            }
                IConfigurationElement element = it.next();
                driver = driver.getReplacedBy();
    public static void dispose() {
                        dataSourceProviders.add(provider);
            models.removeIf(
            }
    public void addDataSourceRegistryListener(@NotNull DBPRegistryListener listener) {
                        attributes.getValue(RegistryConstants.ATTR_AUTO_CLOSE_TRANSACTIONS),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                // If element has no parent (root) or its parent was already processed,
                        if (dataSourceProvider != null) {
        List<DBPDataSourceProviderDescriptor> enabled = new ArrayList<>(dataSourceProviders);


        }
            registryListeners.clear();

    private void dispose0() {
    public DataSourceAuthModelDescriptor getAuthModel(String id) {

                    }
        } catch (Exception e) {
/*
            }
                        provider.loadExtraConfig(ext);
                        break;
    @Nullable
        }
            }
    private final Map<String, DataSourceAuthModelDescriptor> authModels = new LinkedHashMap<>();
                connectionTypes.put(connectionType.getId(), connectionType);
                        dataSourceOrigins.put(provider.getId(), provider);
        return new ArrayList<>(authModels.values());
        forEachRegistryListener(DBPRegistryListener::handleRegistryReload);
import java.io.ByteArrayOutputStream;
*/
    // Persistence
                        origType != null && origType.isAutoCloseConnections()),
    @Override
            providerDescriptor.dispose();
        }
                        attributes.getValue(RegistryConstants.ATTR_CLOSE_CONNECTIONS_PERIOD),
            xml.setBeautify(true);
        @Override
        try {
                dataSourceConfigurationStorageDescriptors.add(descriptor);
                xml.addAttribute(RegistryConstants.ATTR_AUTOCOMMIT, connectionType.isAutocommit());
                        origType = ct;
        List<IConfigurationElement> sortedElements = new ArrayList<>();
        // Load user drivers
        if (!replaced.isEmpty()) {
                    CommonUtils.toInt(
                    typeId,
                            log.warn("Datasource '" + dsId + "' not found for patch");

                    case "datasourceReplace": {
    }
                        attributes.getValue(RegistryConstants.ATTR_SMART_COMMIT_RECOVER),
    }
        if (descriptor == null) {

                models.add(amd);
                        }
        {

    @NotNull
    @Override
                registry.getConfigurationElementsFor(DataSourceProviderDescriptor.EXTENSION_ID));
            }
            registryListeners.add(listener);
import org.jkiss.dbeaver.model.*;
        List<DataSourceAuthModelDescriptor> models = new ArrayList<>();
            for (DataSourceProviderDescriptor provider : dataSourceProviders) {

    }
import org.jkiss.utils.xml.XMLBuilder;
                xml.addAttribute(RegistryConstants.ATTR_CONFIRM_EXECUTE, connectionType.isConfirmExecute());
                        break;
                        attributes.getValue(RegistryConstants.ATTR_CLOSE_TRANSACTIONS_PERIOD),
                DBPConnectionType origType = null;
                        break;
                xml.addAttribute(RegistryConstants.ATTR_SMART_COMMIT_RECOVER, connectionType.isSmartCommitRecover());
                    }
            }
                    );
                DriverDescriptorSerializerLegacy.DRIVERS_FILE_NAME,

        // then further passes are pointless (cycle or missing parents detected).
        if (!this.connectionTypes.containsKey(connectionType.getId())) {
import org.jkiss.dbeaver.utils.GeneralUtils;
        }
 * limitations under the License.
    public DBPDriver findDriver(@NotNull CompositeObjectId ref) {
                    progress = true;
                            } else {
            instance.dispose0();
        readDriversConfig();
                        }
import java.util.stream.Collectors;
    // Connection types
                    CommonUtils.getBoolean(
    }
        return connectionType == null ? defaultType : connectionType;
    }
                    driverCount++;
        saveDriversConfigFile(configurationController);
        }
                    log.warn("Can't load connection types config from " + RegistryConstants.CONNECTION_TYPES_FILE_NAME, ex);


        {
                for (DBPDriver d : pd.getDrivers()) {

    }
    public DBPConnectionType getConnectionType(String id, DBPConnectionType defaultType) {
        // Load DS configuration configuration storages
import org.jkiss.code.Nullable;
                    it.remove();
            log.warn("Error saving drivers", ex);
        }
    // Configuration storages
            for (DriverDescriptor driver1 : allDrivers) {
    }
    public List<DBPDataSourceProviderDescriptor> getEnabledDataSourceProviders() {
                log.warn("Drivers config parse error", ex);
        return authModels.get(id);
                    for (String permItem : modifyPermissionList.split(",")) {
        Set<String> processedIds = new HashSet<>();
            log.error("Sorted elements size doesn't match the original one");
        }
            }
        int customDriverCount = 0;
                if (!CommonUtils.isEmpty(resource.getAlias())) {
        }
        }
     * Searches for resource within external resources provided by plugins
        return driver;
                for (DriverDescriptor driver2 : allDrivers) {
            lCopy = new ArrayList<>(registryListeners);
        for (EditorContributionDescriptor editor : ec) {
        });

                xml.addAttribute(RegistryConstants.ATTR_DESCRIPTION, CommonUtils.toString(connectionType.getDescription()));
                if (o1.isDriversManageable() && !o2.isDriversManageable()) {
                        break;
    // Handlers

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_CONFIRM_DATA_CHANGE), origType != null && origType.isConfirmDataChange()),
    class ConnectionTypeParser implements SAXListener {
        String providedDriversConfig = System.getProperty("dbeaver.drivers.configuration-file");
     */
import org.xml.sax.Attributes;
                } catch (XMLException ex) {
        readDriversConfig();
            Iterator<IConfigurationElement> it = remainingElements.iterator();
        return instance;
 * DBeaver - Universal Database Manager
                                provider.replaceImplClass(ext.getContributor(), providerClass);
    }
        for (DataSourceProviderDescriptor dsp : dataSourceProviders) {
                String modifyPermissionList = attributes.getValue("modifyPermission");
        }

                    if (driver1 != driver2 && driver1.replaces(driver2)) {
                    case RegistryConstants.TAG_DATASOURCE_ORIGIN: {
    @Override
        }

            dsp.removeCustomAndDisabledDrivers();

        return findDriver(ref.shortId());
        dataSourceProviders.forEach(DataSourceProviderDescriptor::setDriverProviderProperties);
                    CommonUtils.toInt(
                    if (ct.getId().equals(typeId)) {
            } catch (XMLException ex) {
                }
                        DataSourceProviderDescriptor dataSourceProvider = getDataSourceProvider(dsId);
import java.io.Reader;

    }
        DBPConnectionType connectionType = connectionTypes.get(id);
import org.jkiss.dbeaver.runtime.DBWorkbench;
        // Load datasource providers from external plugins
                            if (provider == null) {

                        break;

 *
     */
    }
                        resourceContributions.put(alias, resource);
                        permList.add(CommonUtils.valueOf(DBPDataSourcePermission.class, permItem, DBPDataSourcePermission.PERMISSION_EDIT_DATA));
        globalDataSourcePreferenceStore = new SimplePreferenceStore() {
    @Nullable
        boolean desktopMode = !DBWorkbench.getPlatform().getApplication().isHeadlessMode();

                        final DBPDriverSubstitutionDescriptor descriptor = new DriverSubstitutionDescriptor(ext);
            public void save() throws IOException {
                String typeId = attributes.getValue(RegistryConstants.ATTR_ID);
    private void onDriversConfigChanged() {
                        DataSourceProviderDescriptor provider = new DataSourceProviderDescriptor(this, ext);
                    }
    }
                }
            return;
            Path configFile = Path.of(providedDriversConfig);

            if (!CommonUtils.isEmpty(ctConfig)) {
    }
    @Nullable
                    attributes.getValue(RegistryConstants.ATTR_DESCRIPTION),
        }
import org.jkiss.utils.xml.SAXReader;

}
    public Collection<DBPConnectionType> getConnectionTypes() {
        // Load external resources information
            if (load) {
    }
                RegistryConstants.CONNECTION_TYPES_FILE_NAME,
        }
        if (sortedElements.size() != extElements.length) {
import org.jkiss.dbeaver.model.app.DBPRegistryListener;
        return provider;
        } catch (Exception ex) {

 * Licensed under the Apache License, Version 2.0 (the "License");
/*
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
     * Sorts extension elements so parents appear before their children.
                    attributes.getValue(RegistryConstants.ATTR_NAME),
 */
    public DBPDataSourceProviderDescriptor makeFakeProvider(String providerID) {
                driversConfig = DBWorkbench.getPlatform().getConfigurationController().loadConfigurationFile(configFileName);
                allDrivers.addAll(provider.getDrivers());
        while (!remainingElements.isEmpty() && progress) {
                        if (providerId != null && providerClass != null) {
 * Copyright (C) 2010-2025 DBeaver Corp and others

        List<String> replaced = new ArrayList<>();
                replaced.addAll(amd.getReplaces(driver));
import org.eclipse.core.runtime.IExtensionRegistry;


                // it is safe to append it to the result now.
            try (StringReader is = new StringReader(driversConfig)) {
                log.debug("Provided drivers configuration file '" + configFile.toAbsolutePath() + "' doesn't exist");
    }
 *
            o -> onDriversConfigChanged()
            log.warn("Error loading drivers from " + configFileName, ex);
        }
            }
        }
        synchronized (registryListeners) {
    @NotNull
    private void loadConnectionTypes() {
        return dataSourceProviders;
            } else {
                String id = element.getAttribute(RegistryConstants.ATTR_ID);
                String parentId = element.getAttribute(RegistryConstants.ATTR_PARENT);
import org.jkiss.utils.CommonUtils;
                    CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_AUTOCOMMIT), origType != null && origType.isAutocommit()),
    // Auth models
            @Override
import org.jkiss.dbeaver.model.impl.preferences.SimplePreferenceStore;
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(DataSourceConfigurationStorageDescriptor.EXTENSION_ID);
public class DataSourceProviderRegistry implements DBPDataSourceProviderRegistry {
                }
        dataSourceProviders.add(provider);
    public List<? extends DBPAuthModelDescriptor> getApplicableAuthModels(DBPDriver driver) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    }
                    if (d.getName().equalsIgnoreCase(driverIdOrName)) {
                DBPConnectionType connectionType = new DBPConnectionType(
                    .map(e -> e.getAttribute(RegistryConstants.ATTR_ID))
    public void saveDrivers(DBConfigurationController configurationController) throws DBException {
        if (this.connectionTypes.containsKey(connectionType.getId())) {
                xml.addAttribute(RegistryConstants.ATTR_AUTO_CLOSE_TRANSACTIONS, connectionType.isAutoCloseTransactions());
    @NotNull
    //////////////////////////////////////////////
            @Override
        return ecCopy.toArray(new DBPEditorContribution[0]);
            xml.startElement(RegistryConstants.TAG_TYPES);
            for (DBPConnectionType ct : DBPConnectionType.SYSTEM_TYPES) {
            }
    }
                    }


    }
    //////////////////////////////////////////////
        return driverSubstitutions.values().toArray(DBPDriverSubstitutionDescriptor[]::new);

    @Override
                }
     * @param resourcePath path

                        break;
        DataSourceProviderDescriptor provider = new DataSourceProviderDescriptor(this, providerID);
                    case RegistryConstants.TAG_DRIVER_SUBSTITUTION: {
        }
                        list.add(descriptor);
            loadConnectionTypes();
    // Driver resources
            for (DataSourceProviderDescriptor pd : dataSourceProviders) {
        if (driverIdOrName.contains(":")) {

import java.nio.file.Path;
            XMLBuilder xml = new XMLBuilder(baos, GeneralUtils.UTF8_ENCODING);
    }
            public void addPropertyChangeListener(@NotNull DBPPreferenceListener listener) {

            }
        log.debug("Total database drivers: " + driverCount + " (" + (driverCount - customDriverCount) + ")");
        // Find replacement
                    DataSourceProviderDescriptor provider = getDataSourceProvider(ext.getAttribute(RegistryConstants.ATTR_ID));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
                xml.addAttribute(RegistryConstants.ATTR_CLOSE_CONNECTIONS_PERIOD, connectionType.getCloseIdleConnectionPeriod());
                    driver = dsProvider.getDriver(driverPath[1]);
        List<DBPRegistryListener> lCopy;
            }
                }
            instance = null;
                    case RegistryConstants.TAG_EDITOR_CONTRIBUTION: {
                return o1.getName().compareToIgnoreCase(o2.getName());
import org.jkiss.code.NotNull;
            return null;
                loadDrivers(providedDriversConfig, true);
        // Load initial drivers config


                    }
                resourceContributions.put(resource.getName(), resource);
                    if (driverLoader.resolveDriverFiles(targetFileLocation)) {


            log.warn("Connection type doesn't exist: " + connectionType.getId());
    }
        return globalDataSourcePreferenceStore;
     * Resolve all jar files in all enabled drivers.
            DBWorkbench.getPlatform().getConfigurationController().saveConfigurationFile(
                DataSourceHandlerDescriptor descriptor = new DataSourceHandlerDescriptor(ext);
            registryListeners.remove(listener);
                        editorContributors.add(descriptor);
        synchronized (registryListeners) {
    private final Map<String, DBPDriverSubstitutionDescriptor> driverSubstitutions = new HashMap<>();
    @NotNull

    }
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(DataSourceHandlerDescriptor.EXTENSION_ID);
        fireRegistryReload();
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Scans remaining elements, appends those with no parent or whose parent was processed,
        {
import java.nio.charset.StandardCharsets;
        }
    @Override
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
                        customDriverCount++;
                        String providerClass = ext.getAttribute("class");
    // Editor contributions
            }
                            dataSourceProvider.patchConfigurationFrom(ext);
        }
        } catch (Exception ex) {
                }
                }
                    new SAXReader(is).parse(new ConnectionTypeParser());
        @Override

            for (DataSourceProviderDescriptor pd : dataSourceProviders) {
                        break;
        }
                    CommonUtils.getBoolean(
        this.connectionTypes.remove(connectionType.getId());
    private final DBPPreferenceStore globalDataSourcePreferenceStore;
    public void saveDrivers() throws DBException {
        }
            // Load datasource providers in three steps to link them with parent providers and load the rest of config
                    case RegistryConstants.TAG_DATASOURCE: {
        public void saxEndElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName) {
        }
                        List<EditorContributionDescriptor> list = contributionCategoryMap.computeIfAbsent(
    public void removeDataSourceRegistryListener(@NotNull DBPRegistryListener listener) {
        if (driver == null) {
     * @return URL or null if specified resource not found
        try {
    public void linkDriverFiles(Path targetFileLocation) throws DBException {
                        didResolve = true;
    /**
        public void saxStartElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName, @NotNull Attributes attributes)
        if (didResolve) {
    }
    private final List<DataSourceProviderDescriptor> dataSourceProviders = new ArrayList<>();
    public void saveConnectionTypes() {
        try {
    public void saveDriversConfigFile(DBConfigurationController configurationController) throws DBException {
import java.nio.file.Files;

 * See the License for the specific language governing permissions and
        }
        return dataSourceConfigurationStorageDescriptors;
import java.util.*;
                    }
                l.handleRegistryLoad(registry);
        //IActivityManager activityManager = PlatformUI.getWorkbench().getActivitySupport().getActivityManager();
            }
            return new DBPEditorContribution[0];


            dataSourceProviders.sort((o1, o2) -> {
                    }
    private DataSourceProviderRegistry() {
                    CommonUtils.getBoolean(
        if (instance == null) {
        try {
        return enabled;

        }

        } catch (IOException e) {
    public DBPDriverSubstitutionDescriptor[] getAllDriverSubstitutions() {
            }
        {
    }
        loadDrivers(DriverDescriptorSerializerLegacy.DRIVERS_FILE_NAME, false);
    }
    }

    }
        }
                DataSourceAuthModelDescriptor descriptor = new DataSourceAuthModelDescriptor(ext);
            configurationController.saveConfigurationFile(
            if (localName.equals(RegistryConstants.TAG_TYPE)) {
            if (desktopMode && amd.isCloudModel()) {
 * you may not use this file except in compliance with the License.
                }

            } else {
                        }
                    xml.addAttribute("modifyPermission",
        }
                        modifyPermission.stream().map(DBPDataSourcePermission::name).collect(Collectors.joining(",")));
        // Load auth models
            List<DriverDescriptor> allDrivers = new ArrayList<>();
            while (it.hasNext()) {
    }
import org.jkiss.dbeaver.registry.driver.DriverDescriptorSerializerLegacy;
        }
import org.jkiss.utils.xml.SAXListener;
            String ctConfig = DBWorkbench.getPlatform().getConfigurationController().loadConfigurationFile(RegistryConstants.CONNECTION_TYPES_FILE_NAME);
        DBPDriver driver = null;
        );
    public URL findResourceURL(@NotNull String resourcePath) {
                        dataSourceProvidersMap.put(provider.getId(), provider);
        }
        // Delete custom drivers because they are removed from drivers.xml
            }
            instance = new DataSourceProviderRegistry();
    private final Map<String, DBPConnectionType> connectionTypes = new LinkedHashMap<>();
            if (provided) {
        return dataSourceHandlers;
 *
    private final List<EditorContributionDescriptor> editorContributors = new ArrayList<>();
            return null;
                if (!dd.isDisabled() && dd.getReplacedBy() == null) {
            });
            public void removePropertyChangeListener(@NotNull DBPPreferenceListener listener) {
            if (amd.appliesTo(driver)) {
import org.jkiss.dbeaver.DBException;
                if (dsProvider != null) {
        if (ec == null) {
            List<IConfigurationElement> configurationElements = sortConfigurationElements(
    }
            if (editor.supportsDataSource(dataSource)) {
        }
                        origType != null && origType.isSmartCommit()),
                for (DBPConnectionType ct : DBPConnectionType.SYSTEM_TYPES) {
            }

                        origType != null ? origType.getCloseIdleConnectionPeriod() : DBPConnectionType.DEFAULT_TYPE.getCloseIdleConnectionPeriod())
import org.jkiss.dbeaver.Log;
        }

            progress = false;

            }
                    continue;
            }
        // Load connection types
        {
        this.dataSourceConfigurationStorageDescriptors.clear();
import java.util.function.Consumer;
                }
                if (RegistryConstants.TAG_DATASOURCE.equals(ext.getName())) {
import java.io.IOException;
    /**

        }

                xml.addAttribute(RegistryConstants.ATTR_AUTO_CLOSE_CONNECTIONS, connectionType.isAutoCloseConnections());
            }
    @Override

                ExternalResourceDescriptor resource = new ExternalResourceDescriptor(ext);
            }
import org.jkiss.utils.xml.XMLException;
            for (IConfigurationElement ext : extElements) {
            for (IConfigurationElement ext : extElements) {
                if (CommonUtils.isEmpty(parentId) || processedIds.contains(parentId)) {
                }
                }
        }
                        // Load tree contributions
        saveDrivers(DBWorkbench.getPlatform().getConfigurationController());
            !activityManager.getIdentifier(p.getFullIdentifier()).isEnabled()
                try (Reader is = new StringReader(ctConfig)) {
    @Nullable
        this.dataSourceProviders.clear();
            for (DriverDescriptor driver : dspd.getDrivers()) {
import org.eclipse.core.runtime.IConfigurationElement;
        }
            // Try to find by ID
            }
            // Try to find by name
        List<EditorContributionDescriptor> ecCopy = new ArrayList<>();
                xml.addAttribute(RegistryConstants.ATTR_ID, connectionType.getId());
        if (instance != null) {
    }
        // Set provider properties to drivers
            String[] driverPath = driverIdOrName.split(":");

        }
        List<IConfigurationElement> remainingElements = new ArrayList<>(Arrays.asList(extElements));
        return models;
            }
                DataSourceConfigurationStorageDescriptor descriptor = new DataSourceConfigurationStorageDescriptor(ext);
            throw new DBException("Error serializing drivers configuration file", e);
    }

            new DriverDescriptorSerializerLegacy().serializeDrivers(baos, this.dataSourceProviders);
    }
    @Override
                if (driver.isDisabled() || driver.getReplacedBy() != null) {
    private static final Log log = Log.getLog(DataSourceProviderRegistry.class);
            log.error("Cyclic or broken dependencies detected among datasource providers: " +
                if (!CommonUtils.isEmpty(modifyPermissionList)) {

    public List<DataSourceConfigurationStorageDescriptor> getDataSourceConfigurationStorages() {
     *
                    CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_CONFIRM_EXECUTE), origType != null && origType.isConfirmExecute()),
        List<EditorContributionDescriptor> ec = contributionCategoryMap.get(category);

                    if (dd.isCustom()) {

                switch (ext.getName()) {

     * removes appended items and repeats until all are processed.
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(DataSourceAuthModelDescriptor.EXTENSION_ID);
        // If there are still remaining elements, then we have a cycle or broken dependencies
        this.connectionTypes.put(connectionType.getId(), connectionType);
    public static synchronized DataSourceProviderRegistry getInstance() {
            xml.flush();
    void fireRegistryChange(@NotNull DataSourceRegistry<?> registry, boolean load) {
     */
        for (DataSourceAuthModelDescriptor amd : authModels.values()) {
                    }
    }
    }
                        origType != null && origType.isSmartCommitRecover()),
            }
                    return 1;
            for (IConfigurationElement ext : configurationElements) {
                            }
                    case RegistryConstants.TAG_DATASOURCE_PATCH: {
    private final List<DBPRegistryListener> registryListeners = new ArrayList<>();
                    if (provider != null) {
                        driver2.setReplacedBy(driver1);
        }
    private void loadDrivers(String configFileName, boolean provided) {
    private final Map<String, DataSourceProviderDescriptor> dataSourceProvidersMap = new HashMap<>();
    void fireRegistryReload() {
            if (Files.exists(configFile)) {
            }
        public void saxText(@NotNull SAXReader reader, @NotNull String data) {
    public void removeConnectionType(DBPConnectionType connectionType) {

                log.debug("Loading provided drivers configuration from '" + configFile.toAbsolutePath() + "'");
package org.jkiss.dbeaver.registry;
    }
                        } else {
                // do nothing
        for (DataSourceProviderDescriptor pd : dataSourceProviders) {
    private void forEachRegistryListener(@NotNull Consumer<DBPRegistryListener> consumer) {
            xml.endElement();
        dataSourceProvidersMap.put(providerID, provider);
                for (DBPDriverLoader driverLoader : driver.getAllDriverLoaders()) {
                }
    private void loadExtensions(IExtensionRegistry registry) {
                super.addPropertyChangeListener(listener);
                baos.toString(StandardCharsets.UTF_8));
                if (modifyPermission != null) {
        return connectionTypes.values();
                        origType != null ? origType.getCloseIdleTransactionPeriod() : DBPConnectionType.DEFAULT_TYPE.getCloseIdleTransactionPeriod()),
                        String dsId = ext.getAttribute(RegistryConstants.ATTR_ID);

                }
                    }
            }
        forEachRegistryListener(l -> {
        }
            return descriptor.getProvider();
    public List<DataSourceProviderDescriptor> getDataSourceProviders() {
            for (DBPDriver dd : pd.getDrivers()) {
            return;
