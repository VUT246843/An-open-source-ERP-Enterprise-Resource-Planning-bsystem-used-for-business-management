                    JSONUtils.field(json, RegistryConstants.ATTR_WAIT_PROCESS, command.isWaitProcessFinish());
                String color = JSONUtils.getObjectProperty(ctConfig, RegistryConstants.ATTR_COLOR);
                    DBWNetworkProfile networkProfile = CommonUtils.isEmpty(configProfileName) ? null :
                        new SecureCredentials(dataSource)
    private void saveSecuredCredentials(
                            JSONUtils.field(jsonWriter, "confirm-data-change", ct.isConfirmDataChange());
                }
        List<DBPDataSourcePermission> permissions = permissionOwner.getModifyPermission();
                        dataSource.resetAllSecrets();
        Map<String, Map<String, Map<String, String>>> secureCredentialsMap = null;
    private final Map<String, Map<String, Map<String, String>>> secureProperties = new LinkedHashMap<>();
                Boolean smartCommitRecover = JSONUtils.getObjectProperty(ctConfig, "smart-commit-recover");
                    JSONUtils.serializeStringList(json, RegistryConstants.TAG_QUERY, bootstrap.getInitQueries());
                // External configurations not used in distributed mode
                    readPlainCredentials(profileMap) :
        JSONUtils.fieldNE(json, RegistryConstants.TAG_DESCRIPTION, dataSource.getDescription());


        @NotNull JsonWriter json,


                    }
        dataSource.forceSetSharedCredentials(JSONUtils.getBoolean(

    private static DriverDescriptor parseDriver(
                    deserializeModifyPermissions(conObject, dataSource);

        // process project credential
                                if (migrator.migrationRequired(config)) {
            for (Map.Entry<String, Map<String, Object>> folderMap : JSONUtils.getNestedObjects(configurationMap, CONFIGURATION_FOLDERS)) {
            return;
                        );
                DBPConnectionBootstrap bootstrap = connectionInfo.getBootstrap();

                    }
                    if (configuration != null) {
                            JSONUtils.field(jsonWriter, "auto-close-transactions", ct.isAutoCloseTransactions());
                    int keepAlive = JSONUtils.getInteger(cfgObject, RegistryConstants.ATTR_KEEP_ALIVE);
            // Connection types
                return null;
                for (Map<String, Object> filterCfg : JSONUtils.getObjectList(conObject, RegistryConstants.TAG_FILTERS)) {
                // Preferences
        dataSource.setName(CommonUtils.notNull(JSONUtils.getString(conObject, RegistryConstants.ATTR_NAME), "?"));
                    if (!command.isEnabled()) {
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
                    registry.getProject().getName()));
            // There are custom navigator settings
                }
        JSONUtils.fieldNE(json, RegistryConstants.ATTR_DESCRIPTION, folder.getDescription());
            json.endObject();
                if (folder == null) {
                        }
                        // For secured projects save only shared credentials
        } else {
                            );
                    List<DBAAuthProfile> authProfiles = registry.getAllAuthProfiles();
                        JSONUtils.field(json, RegistryConstants.ATTR_WAIT_PROCESS_TIMEOUT, command.getWaitProcessTimeoutMs());
                }
        return connectionConfigurationChanged;
    ) throws DBException {
        if (!CommonUtils.isEmpty(userSettings) && userSettings.keySet().stream().anyMatch(
            } else {
                        jsonWriter.endObject();
    ) {
                curNetworkHandler.setUserName(creds.getUserName());

                for (FilterMapping filter : filterMappings) {
 *
                Boolean autoCommit = JSONUtils.getObjectProperty(ctConfig, "auto-commit");
                }
                // Serialize and encrypt
            // intercept exceptions for crypted configuration
    private static void saveObjectFiler(
                        if (bootstrapCfg.containsKey(RegistryConstants.ATTR_TXN_ISOLATION)) {
                        }
        final String folderPath = JSONUtils.getString(conObject, RegistryConstants.ATTR_FOLDER);
        Map<String, Object> configurationMap = null;
            }
                    jsonWriter.name(CONFIGURATION_FOLDERS);
                if (!CommonUtils.isEmpty(userName)) curNetworkHandler.setUserName(userName);
                        jsonWriter.name("virtual-models");
                    try {
                if (newDataSource) {
            for (DBWHandlerConfiguration configuration : np.getConfigurations()) {
                }

            if (is == null) {
        boolean createIfAbsent
import org.jkiss.dbeaver.runtime.DBWorkbench;

                DBWNetworkProfile profile = new DBWNetworkProfile(registry.getProject());
                    JSONUtils.fieldNE(json, RegistryConstants.ATTR_COMMAND, command.getCommand());
            }
                    // Extensions
    ) throws IOException {
                            saveDataSource(configurationManager, jsonWriter, dataSource, externalConfigurations);
        json.endObject();
                        jsonWriter.beginObject();
                    boolean closeIdleEnabled = JSONUtils.getBoolean(cfgObject, RegistryConstants.ATTR_CLOSE_IDLE_ENABLED);
                profile.setUserName(authCreds.getUserName());

                        !configurationManager.isTrusted()
                        log.debug(e);

                // Connection settings
                            }
                        CommonUtils.toInt(closeConnectionsPeriod));
        if (secureCredentialsMap != null) {
                jsonWriter.endObject();
                    dataSource = (T) registry.createDataSource(
            }
import org.jkiss.utils.ArrayUtils;
 * you may not use this file except in compliance with the License.
                    // Network profiles
            // Drivers
        return creds;
        jsonWriter.beginObject();
                                        migrator.migrateConfiguration(config, migrated);
        } catch (DBInterruptedException e) {
                if (externalConfiguration != null) {
    }
    }
        } catch (DBException e) {
            JSONUtils.field(json, RegistryConstants.ATTR_CLOSE_IDLE_ENABLED, connectionInfo.isCloseIdleConnection());
                if (getReplacementDriver(substitutedDriver) == originalDriver) {
        return creds;
                credentials.setProperties(configuration.getSecureProperties());
    private void saveConfigFile(
                            DBPConnectionType connectionType = dataSource.getConnectionConfiguration().getConnectionType();
        serializeDataSource(configurationManager, json, dataSource, externalConfigurations);
                Map<String, DBVModel> virtualModels = new LinkedHashMap<>();
                    List<DBSObjectFilter> savedFilters = registry.getSavedFilters();
                    JSONUtils.field(json, RegistryConstants.ATTR_PAUSE_AFTER_EXECUTE, command.getPauseAfterExecute());
        } catch (IOException e) {
                        String originID = CommonUtils.toString(originProperties.remove(ATTR_ORIGIN_TYPE));
        if (!CommonUtils.isEmpty(credentials.getUserPassword())) {
                            if (dataSource.getVirtualModel().hasValuableData()) {

                        DBRShellCommand command = new DBRShellCommand("");
                            }
                                profileConfig != null && !configurationManager.isTrusted()
    private static DriverDescriptor getReplacementDriver(@NotNull DriverDescriptor driver) {
        }
        if (!CommonUtils.isEmpty(credentials.getProperties())) {
    ) {
        String name,
                        command.setCommand(JSONUtils.getString(eventCfg, RegistryConstants.ATTR_COMMAND));
            }
                    ct = new DBPConnectionType(
                String id = ctMap.getKey();
                    //in the current version the configuration should not contain auth-properties, they should be in secrets
                }
                    json.endObject();
                        CommonUtils.toBoolean(confirmExecute),
                final SecureCredentials credentials = new SecureCredentials(configuration);
                throw new DBInterruptedException("Project secure credentials read canceled by user.");
                        if (!CommonUtils.isEmpty(defObjectName) && CommonUtils.isEmpty(bootstrap.getDefaultSchemaName())) {


                                configurationManager,
        }
            ) {
                Map<String, Object> ctConfig = ctMap.getValue();
            JSONUtils.serializeProperties(json, RegistryConstants.TAG_PROVIDER_PROPERTIES, connectionInfo.getProviderProperties(), true);
                                configuration,
                            config.setUserPassword(null);
                    dataSource.getProject() : (profile != null ? profile.getProject() : null);
            return credBuffer.toString(StandardCharsets.UTF_8);
                            profile,
                    for (T dataSource : localDataSources) {
                    parseResults.updatedFolders.add(folder);
                registry.getProject().setRuntimeProperty(RuntimeProjectPropertiesConstant.IS_USER_DECLINE_PROJECT_DECRYPTION, Boolean.FALSE.toString());
                // Still try to read credentials directly from configuration (#6564)
    }
                            JSONUtils.field(jsonWriter, "smart-commit-recover", ct.isSmartCommitRecover());
    }
                if (configurationManager.isTrusted()) {
            List<DBAAuthProfile> profiles = new ArrayList<>();
    }
                    {

        JSONUtils.field(json, RegistryConstants.ATTR_ENABLED, configuration.isEnabled());
            // for community provide a dialog
                    if (conObject.containsKey(RegistryConstants.TAG_PROPERTIES)) {
            return null;
            JSONUtils.fieldNE(json, "config-profile", connectionInfo.getConfigProfileName());
                            jsonWriter.name(ecfg.getKey());
                        JSONUtils.field(json, RegistryConstants.ATTR_IGNORE_ERRORS, true);
                                        log.debug("Connection configuration for data source '" + id + "' was migrated successfully");

                curNetworkHandler.setProperties(properties);
                    jsonWriter.beginObject();
                        origin = DataSourceOriginLocal.INSTANCE;
                String userName = JSONUtils.getString(handlerCfg, RegistryConstants.ATTR_USER);
        // Extensions
    {
                        command.setShowProcessPanel(JSONUtils.getBoolean(eventCfg, RegistryConstants.ATTR_SHOW_PANEL));
                        CommonUtils.toInt(closeTransactionsPeriod),

                            saveObjectFiler(json, filter.typeName, cf.getKey(), cf.getValue());
        @NotNull String driverId,
                    }
 * See the License for the specific language governing permissions and
            }
        @NotNull List<T> localDataSources
                profile.setSavePassword(JSONUtils.getBoolean(profileMap, RegistryConstants.ATTR_SAVE_PASSWORD));
                }
                        jsonWriter.endObject();
            }
                        extensions = new LinkedHashMap<>();
                                new DriverDescriptorSerializerModern().serializeDriver(
                        }
            JSONUtils.fieldNE(jsonWriter, RegistryConstants.ATTR_NAME, authProfile.getProfileName());

                    final DriverDescriptor original = originalDriver;
            if (configurationManager.isTrusted()) {
                    + provider.getId() + " for datasource '" + id + "'. Create new driver");

                            serializeModifyPermissions(jsonWriter, ct);
                    // Filters
                if (!CommonUtils.isEmpty(userPassword)) curNetworkHandler.setPassword(userPassword);


                        if (dataSource.isSavePassword() || !CommonUtils.isEmpty(creds.getUserPassword())) {
                    config.setProviderProperties(JSONUtils.deserializeStringMap(cfgObject, RegistryConstants.TAG_PROVIDER_PROPERTIES));
        } catch (Exception e) {
                provider = (DataSourceProviderDescriptor) DataSourceProviderRegistry.getInstance().makeFakeProvider(providerId);
    private void saveNetworkHandlerConfiguration(
        boolean referenceOnly

                    if (!CommonUtils.isEmpty(drivers)) {
            // Save bootstrap info

        }
                        jsonWriter.beginArray();
        // Read in this particular order to handle configuration reading errors first, but process in reverse order later

import org.jkiss.dbeaver.runtime.DBInterruptedException;
        @NotNull DataSourceConfigurationManager configurationManager,
                    DBPDataSourceOrigin origin;

                Map<String, Object> conObject = conMap.getValue();
                    if (bootstrap.getDefaultAutoCommit() != null) {
                    if (command.isWaitProcessFinish()) {
                    }
                                    final DBPConnectionConfiguration migrated = new DBPConnectionConfiguration(config);
    protected void deserializeAdditionalProperties(@NotNull T dataSource, @NotNull Map<String, Object> conObject) {
    }
        @NotNull JsonWriter json,
            return null;
                case RegistryConstants.ATTR_USER:
                    originProps.put(ATTR_ORIGIN_CONFIGURATION, externalConfiguration.getId());
            log.error("Error saving secure credentials", e);
                }
    }
        }
        @NotNull String providerId,
        SecureCredentials creds = new SecureCredentials();
                }

                driver.setDescription("Missing driver " + driverId);
                deserializeDataSource(parseResults, dataSource, conObject);
                    json.name(RegistryConstants.TAG_HANDLERS);
            return null;
                String profileId = vmMap.getKey();
                        extensions = JSONUtils.deserializeProperties(conObject, RegistryConstants.TAG_EXTENSIONS);
            JSONUtils.field(json, "virtual-model-id", dataSource.getVirtualModel().getId());
                SecureCredentials authCreds = configurationManager.isSecure() ?
                        null,
        if (propMap.isEmpty()) {
            registry.setAuthProfiles(profiles);
                            model.serialize(monitor, jsonWriter);


                        }
                        null,
            if (DBWorkbench.getPlatformUI().confirmAction(
        @NotNull DataSourceConfigurationManager configurationManager,
                // Virtual model

    private static final String ATTR_ORIGIN_TYPE = "$type"; //$NON-NLS-1$
                for (Map.Entry<String, Map<String, Object>> ctMap : JSONUtils.getNestedObjects(configurationMap, "external-configurations")) {
                    config.setUrl(JSONUtils.getString(cfgObject, RegistryConstants.ATTR_URL));
import org.jkiss.dbeaver.registry.network.NetworkHandlerRegistry;
                }
        JSONUtils.serializeProperties(json, RegistryConstants.TAG_TAGS, dataSource.getTags(), true);
import org.jkiss.utils.CommonUtils;
                NLS.bind(RegistryMessages.project_open_cannot_read_configuration_message,
                            CommonUtils.valueOf(DBPDriverConfigurationType.class, configurationType, DBPDriverConfigurationType.MANUAL));
        filter.setName(JSONUtils.getString(map, RegistryConstants.ATTR_NAME));
 */
                        command.setWorkingDirectory(JSONUtils.getString(eventCfg, RegistryConstants.ATTR_WORKING_DIRECTORY));
                            dataSource.setSavePassword(true);
        @Nullable String subNode)
    private SecureCredentials readPlainCredentials(@NotNull Map<String, Object> propMap) {
                        config.setConnectionColor(colorValue);
        }
                profile.setProfileName(profileId);
            throw new DBException(e.getMessage(), e);
                            JSONUtils.serializeMap(jsonWriter, ecfg.getValue().getProperties());
            log.debug("Empty datasource provider for datasource '" + id + "'");
                                driverMap.put(driver.getId(), driver);
        }
            // Filters
                json.beginArray();
                    curNetworkHandler.setSecureProperties(creds.getProperties());
        }
        try (is) {
                }
 * Copyright (C) 2010-2026 DBeaver Corp and others
        }
        }

                        DBPConnectionEventType eventType = CommonUtils.valueOf(DBPConnectionEventType.class, eventObject.getKey(), DBPConnectionEventType.BEFORE_CONNECT);
                log.warn("Can't find network handler '" + handlerId + "'");

                    config.setServerName(JSONUtils.getString(cfgObject, RegistryConstants.ATTR_SERVER));
            }
        JSONUtils.fieldNE(json, RegistryConstants.ATTR_DESCRIPTION, filter.getDescription());
                }
        @Nullable Collection<String> dataSourceIds

        for (DBWNetworkProfile np : profiles) {
                if (propValue != null && !CommonUtils.equalObjects(propValue, defValue)) {
                final String originalProviderId = CommonUtils.toString(conObject.get(ATTR_ORIGINAL_PROVIDER));

                final String substitutedProviderId = CommonUtils.toString(conObject.get(RegistryConstants.ATTR_PROVIDER));
        // Preferences
                    jsonWriter.endObject();
    protected void saveDataSource(

                    creds.setUserPassword(value);
                    if (!bootstrapCfg.isEmpty()) {
                    }
        } catch (IOException e) {
                String name = JSONUtils.getObjectProperty(ctConfig, RegistryConstants.ATTR_NAME);
                    json.endObject();
        assert dataSource != null|| profile != null;

            throw new DBInterruptedException("Project secure credentials read canceled by user.");
                    connectionConfigurationChanged = true;
        {
                    DBWHandlerConfiguration configuration = parseNetworkHandlerConfig(configurationManager, null, profile, handlerMap);
                    Map<String, Object> extensions = null;
        Map<String, Object> securityCfg = JSONUtils.getObject(conObject, "security");
import org.jkiss.dbeaver.model.connection.*;
                                }
        JSONUtils.serializeStringList(json, RegistryConstants.TAG_INCLUDE, filter.getInclude());
        dataSource.setDescription(JSONUtils.getString(conObject, RegistryConstants.TAG_DESCRIPTION));

import org.jkiss.code.NotNull;
                throw new IOException("Error decrypting encrypted file", e);
        @Nullable String subNode,
        if (dataSource.getDriverSubstitution() != null) {
                        command.setPauseAfterExecute(JSONUtils.getInteger(eventCfg, RegistryConstants.ATTR_PAUSE_AFTER_EXECUTE));
                }
                    jsonWriter.endObject();
                if (!permissions.isEmpty()) {
                    break;
        }
            replacement = replacement.getReplacedBy();
                        String defObjectName = JSONUtils.getString(bootstrapCfg, RegistryConstants.ATTR_DEFAULT_OBJECT);
                    switch (prop.getKey()) {
            JSONUtils.field(json, RegistryConstants.ATTR_LOCK_PASSWORD, lockPasswordHash);
 * limitations under the License.
            if (encrypt) {
                // Save folders
                DriverDescriptor originalDriver;
    private static final String ATTR_ORIGINAL_PROVIDER = "original-provider"; //$NON-NLS-1$
                        if (configuration.isEnabled()) {
        @NotNull T dataSource,
                    if (!DBWorkbench.isDistributed() && !DBWorkbench.getPlatform().getApplication().isMultiuser() && !CommonUtils.isEmpty(externalConfigurations)) {
                    saveSecuredCredentials(

    ) throws IOException {
     * @param dataSource - deserializable datasource
        }
        }
            JSONUtils.field(json, RegistryConstants.ATTR_SAVE_PASSWORD, configuration.isSavePassword());
            {
    @Nullable
            // Saved filters
        .create();
        if (CommonUtils.isEmpty(providerId)) {
                    dataSource.setVirtualModel(dbvModel);
        DBPObjectSettingsProvider settingsProvider = DBUtils.getAdapter(DBPObjectSettingsProvider.class, dataSource.getProject());
                    if (cfgObject.containsKey(RegistryConstants.TAG_AUTH_PROPERTIES)) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                String name = folderMap.getKey();
                                connectionTypes.put(connectionType.getId(), connectionType);
        configurationManager.writeConfiguration(name, binaryContents);
        return filter;
        }
    private void savePlainCredentials(@NotNull JsonWriter jsonWriter, @NotNull SecureCredentials credentials) throws IOException {
            throw e;
                String vmID = CommonUtils.toString(conObject.get("virtual-model-id"), id);

        if (!CommonUtils.isEmpty(lockPasswordHash)) {
                    jsonWriter.name("connections");
                DBPProject project = dataSource != null ?
            log.error(e);
                        connectionConfigurationChanged = true;
                        dataSource.getConnectionConfiguration().setAuthProperties(creds.getProperties());
                    }
    }
                        }
    }
                // Save network handlers' configurations
                            jsonWriter.beginObject();
                SecureCredentials credentials = new SecureCredentials(authProfile);
        @Nullable DataSourceDescriptor dataSource,
                        DataSourceProviderRegistry.getInstance().getConnectionType(
                    config.setHostPort(JSONUtils.getString(cfgObject, RegistryConstants.ATTR_PORT));
                    config.setConnectionType(
        DataSourceNavigatorSettings.saveSettingsToMap(json, dataSource.getOriginalNavigatorSettings());
                    Map<String, Object> cfgObject = JSONUtils.getObject(conObject, "configuration");

            }
            } else {
                        for (DBSObjectFilter cf : savedFilters) {
                        final SecureCredentials creds = configurationManager.isSecure() ?
                    DBWorkbench.getPlatform().getDataSourceProviderRegistry().addConnectionType(ct);
                            /*if (!connectionType.isPredefined()) */{
                    // Auth profiles
                    config.setProperties(JSONUtils.deserializeStringMap(cfgObject, RegistryConstants.TAG_PROPERTIES));
            }
                String id = conMap.getKey();
                    }
import com.google.gson.Strictness;
            } catch (Exception e) {
        @NotNull String id,
        if (!CommonUtils.isEmpty(credentials.getUserName())) {
                for (Map.Entry<String, String> prop : propMap.entrySet()) {
                        config.setAuthProperties(JSONUtils.deserializeStringMapOrNull(cfgObject, RegistryConstants.TAG_AUTH_PROPERTIES));
        @Nullable DataSourceDescriptor dataSource,
                        jsonWriter.endObject();
                                dataSource,
                    // Bootstrap
            jsonWriter.endObject();
                    if (configurationManager.isSecure() ||
                String parentFolder = JSONUtils.getObjectProperty(folderMap.getValue(), RegistryConstants.ATTR_PARENT);
                } else {
                {

        }
        final String name = DBPDataSourceRegistry.CREDENTIALS_CONFIG_FILE_PREFIX
                Boolean confirmDataChange = JSONUtils.getObjectProperty(ctConfig, "confirm-data-change");
        json.name(folder.getName());
            }
            }
                        DBPExternalConfiguration extConfig = null;
        // process projectConfiguration
    public void saveDataSources(
                    if (originalDriver != substitutedDriver) {
            }

        } catch (DBException e) {
                    props.put(propName, propValue);

                        for (Map.Entry<String, DBPExternalConfiguration> ecfg : externalConfigurations.entrySet()) {
            }
            }
    @Nullable
                    // Connection types
        @NotNull DBPDataSourceConfigurationStorage configurationStorage,
    }
        if (subNode == null) subNode = NODE_CONNECTION;
            if (properties != null) {
            }
                Boolean autoCloseTransactions = JSONUtils.getObjectProperty(ctConfig, "auto-close-transactions");
                        jsonWriter.endArray();
                    substitutedDriver = parseDriver(id, substitutedProviderId, substitutedDriverId, false);
                    permissionOwner.setModifyPermissions(permissions);
        if (dataSource.isSavePassword()) JSONUtils.field(json, RegistryConstants.ATTR_SAVE_PASSWORD, true);
            propMap.put(RegistryConstants.ATTR_USER, credentials.getUserName());
                    originalDriver = parseDriver(id, originalProviderId, originalDriverId, !isDetachedProcess);
            if (connectionInfo.getKeepAliveInterval() > 0) {
                    dataSource.setExtensions(extensions);
            // Virtual models
                }

                        DBPConnectionBootstrap bootstrap = config.getBootstrap();
            DataSourceNavigatorSettings.NAVIGATOR_SETTINGS::contains)
                    substitutedDriver = originalDriver;

        if (nodeMap.isEmpty()) {

                JSONUtils.field(jsonWriter, RegistryConstants.ATTR_SAVE_PASSWORD, authProfile.isSavePassword());
                String description = JSONUtils.getObjectProperty(folderMap.getValue(), RegistryConstants.ATTR_DESCRIPTION);
 *
                }
                    config.setConfigProfileSource(JSONUtils.getString(cfgObject, "config-profile-source"));
    private void saveSecureCredentialsFile(DataSourceConfigurationManager configurationManager, DBPDataSourceConfigurationStorage storage) {
                        savePlainCredentials(json, credentials);
                profile.setProperties(JSONUtils.deserializeStringMap(profileMap, "properties"));
                registry.addSavedFilter(filter);
                        JSONUtils.field(json, RegistryConstants.ATTR_AUTOCOMMIT, bootstrap.getDefaultAutoCommit());
            secureProperties.putAll(secureCredentialsMap);
                        command.setTerminateAtDisconnect(JSONUtils.getBoolean(eventCfg, RegistryConstants.ATTR_TERMINATE_AT_DISCONNECT));
import org.jkiss.dbeaver.model.app.DBPProject;
                        CommonUtils.toBoolean(autoCommit),
        @Nullable Collection<String> dataSourceIds
        if (configurationMap != null) {
        Map<String, Object> credentialsMap = JSONUtils.getObject(propMap, "credentials");
                }
                );
                    JSONUtils.field(json, RegistryConstants.ATTR_SHOW_PANEL, command.isShowProcessPanel());
        @Nullable Map<String, Object> conObject,
                RegistryMessages.project_open_cannot_read_credentials_title,
            JSONUtils.fieldNE(json, RegistryConstants.ATTR_DATABASE, connectionInfo.getDatabaseName());

            JSONUtils.fieldNE(jsonWriter, RegistryConstants.ATTR_AUTH_MODEL, authProfile.getAuthModelId());
import com.google.gson.reflect.TypeToken;

                saveConfigFile(configurationManager, credFile, jsonString, true);
                    folder.setDescription(description);

        DataSourceConfigurationManager configurationManager,
            {
                T dataSource = registry.getDataSource(id);
                    registry.getProject().getName()),
                } else {
    }
            json.endObject();
                        if (!CommonUtils.isEmpty(userPassword)) config.setUserPassword(userPassword);
import org.jkiss.dbeaver.model.security.SMObjectType;
                        jsonWriter.setIndent(JSONUtils.DEFAULT_INDENT);

                case RegistryConstants.ATTR_PASSWORD:
                    }
                    continue;
                            jsonWriter.beginObject();
                    }
                    folder = new DataSourceFolder(registry, parent, name, description);
        // Save result to file
            // External configurations
                    json.endObject();
                    {
   protected DataSourceSerializerModern(@NotNull DataSourceRegistry<T> registry) {
            for (Map.Entry<String, Map<String, Object>> vmMap : JSONUtils.getNestedObjects(configurationMap, "network-profiles")) {
                profiles.add(profile);
                String defValue = prefStore.getDefaultString(propName);
                final String originalDriverId = CommonUtils.toString(conObject.get(ATTR_ORIGINAL_DRIVER));
            JSONUtils.serializeProperties(json, RegistryConstants.TAG_PROPERTIES, connectionInfo.getProperties(), true);
            if (!CommonUtils.isEmpty(filterMappings)) {
    //  0 level: datasource ID
                DBPExternalConfiguration externalConfiguration = ((DBPDataSourceOriginExternal) origin).getExternalConfiguration();
    private static final String ATTR_ORIGIN_CONFIGURATION = "$configuration";

                }
            originProps.put(ATTR_ORIGIN_TYPE, origin.getType());
                deserializeModifyPermissions(ctConfig, ct);

            if (!CommonUtils.isEmpty(permissionRestrictions)) {

                        config.setEvent(eventType, command);
        @NotNull DataSourceConfigurationManager configurationManager,
                    originalDriver = parseDriver(id, substitutedProviderId, substitutedDriverId, !isDetachedProcess);
                                    try {
            // reading
                        substitutedDriver,
                    break;

                    if (!CommonUtils.isEmpty(typeName)) {
                    }
            if (createIfAbsent) {
                            jsonWriter.endObject();
        json.beginObject();
                    // Save connections
                        }
            JSONUtils.fieldNE(json, RegistryConstants.ATTR_HOME, connectionInfo.getClientHomeId());
        JSONUtils.field(json, RegistryConstants.ATTR_NAME, dataSource.getName());
                        configurationStorage.isVirtual() ? registry.getDefaultStorage() : configurationStorage,
                                json,
        dataSource.setDriverSubstitution(DataSourceProviderRegistry.getInstance()
            && DBWorkbench.getPlatform().getApplication().isCommunity() &&
                DBVModel dbvModel = modelMap.get(vmID);
                Map<String, Map<String, DBPDriver>> drivers = new LinkedHashMap<>();
                    if (!CommonUtils.isEmpty(profiles)) {
        @NotNull DataSourceParseResults parseResults,
            if (origin instanceof DBPDataSourceOriginExternal) {
                log.info("The user agreed lost project credentials.");
                {
    protected static final Gson CONFIG_GSON = new GsonBuilder()
                                virtualModels.put(dataSource.getVirtualModel().getId(), dataSource.getVirtualModel());
public class DataSourceSerializerModern<T extends DataSourceDescriptor> implements DataSourceSerializer<T> {
                        saveAuthProfiles(configurationManager, jsonWriter, authProfiles);
                    oldDataSource = (T) registry.createDataSource(dataSource);
            DBWHandlerConfiguration curNetworkHandler = new DBWHandlerConfiguration(handlerDescriptor, dataSource);
        } else {
        } else {
                        default:
                        for (Map.Entry<String, Map<String, DBPDriver>> dmap : drivers.entrySet()) {
                    String id = ctMap.getKey();
                        }
        JSONUtils.serializeProperties(jsonWriter, "credentials", propMap, true);
        if (!configurationManager.isSecure()) {
                        if (!CommonUtils.isEmpty(userName)) config.setUserName(userName);
        JSONUtils.fieldNE(json, RegistryConstants.ATTR_ID, objectID);
            // TODO: load drivers config

                    Set<DBPDataSourceFolder> globalFolders = registry.getTemporaryFolders();
            && CommonUtils.toBoolean(registry.getProject().getProjectProperty(ENCRYPTED_CONFIGURATION))
    private static DBSObjectFilter readObjectFiler(@NotNull Map<String, Object> map) {
                JSONUtils.field(json, RegistryConstants.ATTR_TYPE, connectionInfo.getConnectionType().getId());
        if (origin != DataSourceOriginLocal.INSTANCE) {
                                Map<String, DBPDriver> driverMap = drivers.computeIfAbsent(driver.getProviderId(), s -> new LinkedHashMap<>());
                        originalDriver,
                    if (bootstrap.getDefaultTransactionIsolation() != null) {
            // Auth profiles
                        continue;
import org.jkiss.dbeaver.model.net.DBWNetworkProfile;
                        if (substitutedDriver.getProviderDescriptor().supportsDriverMigration()) {
            } else if (configurationManager.isTrusted()) {
                            if (dataSourceProvider instanceof DBPConnectionConfigurationMigrator migrator) {
        }
                    JSONUtils.field(json, RegistryConstants.ATTR_TERMINATE_AT_DISCONNECT, command.isTerminateAtDisconnect());
                    JSONUtils.fieldNE(json, RegistryConstants.ATTR_WORKING_DIRECTORY, command.getWorkingDirectory());
                log.warn("Error reading user datasource settings", e);
                }
        jsonWriter.endObject();
                if (configuration.hasValuableInfo()) {
            IOUtils.copyStream(stream, credBuffer);
            JSONUtils.fieldNE(jsonWriter, RegistryConstants.ATTR_NAME, np.getProfileName());
        } catch (IOException e) {
                        case RegistryConstants.ATTR_PASSWORD:
                Boolean smartCommit = JSONUtils.getObjectProperty(ctConfig, "smart-commit");
            log.error(e);
                }
            for (Map.Entry<String, Map<String, Object>> vmMap : JSONUtils.getNestedObjects(configurationMap, "auth-profiles")) {
        }
                    externalConfigurations.put(id, new DBPExternalConfiguration(id, () -> configMap));
                    json.name(eventType.name());
            RegistryConstants.ATTR_SHARED_CREDENTIALS));
        }

        @NotNull DataSourceConfigurationManager configurationManager,
        }
        for (Map.Entry<String, Object> entry : credentialsMap.entrySet()) {
                        DBWHandlerConfiguration configuration = parseNetworkHandlerConfig(configurationManager, dataSource, null, handlerObject);
                    Map<String, Object> originProperties = JSONUtils.deserializeProperties(conObject, TAG_ORIGIN);
                return new String(encryptor.decryptValue(credBuffer.toByteArray()), StandardCharsets.UTF_8);
                        jsonWriter.name("saved-filters");
                    );
import org.jkiss.dbeaver.model.impl.preferences.SimplePreferenceStore;
                jsonWriter.flush();
                } else {
                    saveSecuredCredentials(null, authProfile, null, credentials);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
    private final DataSourceRegistry<T> registry;
        }
            JSONUtils.fieldNE(jsonWriter, RegistryConstants.ATTR_DESCRIPTION, authProfile.getProfileDescription());
                                null,
            }
                        if (!cf.getValue().isEmpty()) {
                    }

    protected void serializeDataSource(
                        jsonWriter.name("external-configurations");
    }
import com.google.gson.stream.JsonWriter;
                            jsonWriter.name(ct.getId());
        @NotNull DBPDataSourceConfigurationStorage configurationStorage,
            configurationMap = readConfiguration(configurationStorage, configurationManager, dataSourceIds);
import org.jkiss.dbeaver.model.runtime.DBRShellCommand;
                    }
                        if (!dataSource.isDetached()) {
        @NotNull Map<String, Object> conObject
        if (dataSource.getDriver() != dataSource.getOriginalDriver()) {
import com.google.gson.GsonBuilder;
                    config.setAuthModelId(JSONUtils.getString(cfgObject, RegistryConstants.ATTR_AUTH_MODEL));
            json.beginObject();
        @Nullable DataSourceDescriptor dataSource,
                String profileId = vmMap.getKey();

    }

        @NotNull SecureCredentials credentials
                        if (!CommonUtils.isEmpty(extConfigID)) {
                if (originalDriver == null) {
                substitutedDriver = getReplacementDriver(substitutedDriver);
import java.util.*;
        Map<String, Map<String, String>> nodeMap = secureProperties.computeIfAbsent(topNodeId, s -> new LinkedHashMap<>());
        @NotNull DBPDataSourcePermissionOwner permissionOwner

    ) throws IOException {
        }
                            }
                    if (extensions == null) {
                    );
                    if (!CommonUtils.isEmpty(configurationType)) {
        }
        try (OutputStreamWriter osw = new OutputStreamWriter(dsConfigBuffer, StandardCharsets.UTF_8)) {
                    dataSource.clearFilters();
    private void saveNetworkProfiles(DataSourceConfigurationManager configurationManager, JsonWriter jsonWriter, List<DBWNetworkProfile> profiles) throws IOException {
                    savePlainCredentials(json, new SecureCredentials(dataSource));
                provider.addDriver(driver);

    // Secure props.
            jsonWriter.endObject();
                        boolean savePasswordApplicable = (!dataSource.getProject()
        @NotNull Map.Entry<String, Map<String, Object>> handlerObject)
        jsonWriter.endObject();
        JSONUtils.field(json, RegistryConstants.ATTR_ENABLED, filter.isEnabled());
                final String substitutedDriverId = CommonUtils.toString(conObject.get(RegistryConstants.ATTR_DRIVER));
        @Nullable DataSourceDescriptor dataSource,
            }
                    // Save all auth properties in secure storage
        saveCredentialsToMap(propMap, credentials);
                        // Others are stored in secret storage
 * DBeaver - Universal Database Manager
        ByteArrayOutputStream dsConfigBuffer = new ByteArrayOutputStream(10000);
        if (conObject == null) {
                        CommonUtils.toBoolean(autoCloseTransactions),
                }

                    for (Map.Entry<String, Map<String, Object>> handlerObject : JSONUtils.getNestedObjects(cfgObject, RegistryConstants.TAG_HANDLERS)) {
        DBPDataSourceOrigin origin = dataSource.getOriginSource();
                Map<String, String> preferenceProperties = dataSource.getPreferenceStore().getProperties();
        dataSource.setFolder(folderPath == null ? null : registry.findFolderByPath(folderPath, true, parseResults));
            JSONUtils.fieldNE(json, RegistryConstants.ATTR_AUTH_MODEL, connectionInfo.getAuthModelId());
            configurationStorage.getStorageName(),
import org.jkiss.dbeaver.model.access.DBAAuthProfile;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    externalConfigurations.put(externalConfiguration.getId(), externalConfiguration);

                binaryContents = contents.getBytes(StandardCharsets.UTF_8);
                        profile.updateConfiguration(configuration);
        @NotNull Map<String, DBPExternalConfiguration> externalConfigurations
                    if (CommonUtils.isEmpty(originProperties) || !originProperties.containsKey(ATTR_ORIGIN_TYPE)) {
        }
                Object closeTransactionsPeriod = JSONUtils.getObjectProperty(ctConfig, "close-transactions-period");
                DataSourceFolder folder = parent == null ? registry.findFolderByPath(name, true, parseResults) : parent.getChild(name);

        if (!DBWorkbench.getPlatform().getApplication().isHeadlessMode()
                        null,
import org.eclipse.osgi.util.NLS;
                // Serialize and encrypt
        }
    protected void deserializeDataSource(
                Map<String, Object> profileMap = vmMap.getValue();
            JSONUtils.fieldNE(json, RegistryConstants.ATTR_URL, connectionInfo.getUrl());
        try {
            json.beginObject();
            }
                                    jsonWriter, (DriverDescriptor) driver, true);
                if (curNetworkHandler.isSavePassword()) {
                    parseResults.addedFolders.add(folder);
            if (connectionInfo.getCloseIdleInterval() > 0) {
            for (Map<String, Object> ctMap : JSONUtils.getObjectList(configurationMap, "saved-filters")) {
                        CommonUtils.toBoolean(smartCommit),
                        }
    @NotNull
                        for (DBPConnectionType ct : connectionTypes.values()) {
        final String lockPasswordHash = dataSource.getLockPasswordHash();
        SecureCredentials creds = new SecureCredentials();
                            JSONUtils.fieldNE(jsonWriter, RegistryConstants.ATTR_DESCRIPTION, ct.getDescription());
                    json.beginObject();
            // Save only properties who are differs from default values
                json.name(RegistryConstants.TAG_FILTERS);
                    readSecuredCredentials(null, profile, null);
                Map<String, Object> profileMap = vmMap.getValue();
        assert dataSource != null || profile != null;
        return driver;
            final String data = loadConfigFile(is, true);
    @Nullable
        }
                saveConfigFile(configurationManager, credFile, null, true);
                    int closeIdle = JSONUtils.getInteger(cfgObject, RegistryConstants.ATTR_CLOSE_IDLE);

 *
        final InputStream is;
            jsonWriter.beginObject();
                    JSONUtils.deserializeStringMap(conObject, RegistryConstants.TAG_TAGS));
            }
        }
        String topNodeId = profile != null ? "profile:" + profile.getProfileId() : dataSource.getId();
            && DBWorkbench.getPlatform().getApplication().isCommunity()
                            "network/" + configuration.getId() + (profile == null ? "" : "/profile/" + profile.getProfileName()),
                // should be stored in secrets
                Boolean confirmExecute = JSONUtils.getObjectProperty(ctConfig, "confirm-execute");
        String handlerId = handlerObject.getKey();
        JSONUtils.fieldNE(json, RegistryConstants.ATTR_NAME, filter.getName());
        try (InputStream is = configurationManager.readConfiguration(name, dataSourceIds)) {
    ) throws DBException, IOException {
                        String userPassword = JSONUtils.getString(cfgObject, RegistryConstants.ATTR_PASSWORD);
        @NotNull DataSourceParseResults parseResults,
    }
                    }
                    JSONUtils.fieldNE(json, RegistryConstants.ATTR_DEFAULT_CATALOG, bootstrap.getDefaultCatalogName());
                    } else if (conObject.containsKey(RegistryConstants.TAG_EXTENSIONS)) {
                JSONUtils.field(json, RegistryConstants.ATTR_KEEP_ALIVE, connectionInfo.getKeepAliveInterval());
                final SecureCredentials creds = configurationManager.isSecure() ?
        if (is == null) {
            propMap.putAll(credentials.getProperties());
            return null;

                json.name(RegistryConstants.TAG_EVENTS);
                        saveSecuredCredentials(
            }
    ) throws DBException, IOException {
            JSONUtils.fieldNE(json, RegistryConstants.ATTR_SERVER, connectionInfo.getServerName());
                        }
                DriverDescriptor substitutedDriver;
                DBSValueEncryptor valueEncryptor = registry.getProject().getValueEncryptor();
        }
    private Map<String, Map<String, Map<String, String>>> readSecureCredentials(
        ) {
            throw new DBException("Project secure credentials can not be read", e);
            saveSecureCredentialsFile(configurationManager, configurationStorage);
            }
            }
                    }
    @Override
                            DBWHandlerConfiguration profileConfig = networkProfile == null ? null :
                return null;
                        for (DBVModel model : virtualModels.values()) {
                        command.setEnabled(JSONUtils.getBoolean(eventCfg, RegistryConstants.ATTR_ENABLED));
                        permissions.add(DBPDataSourcePermission.getById(perm));
                    if (keepAlive > 0) {
                        bootstrap.setDefaultSchemaName(JSONUtils.getString(bootstrapCfg, RegistryConstants.ATTR_DEFAULT_SCHEMA));


                            break;
                            JSONUtils.field(jsonWriter, "smart-commit", ct.isSmartCommit());
                {
            if (Boolean.parseBoolean(registry.getProject().getRuntimeProperty(RuntimeProjectPropertiesConstant.IS_USER_DECLINE_PROJECT_DECRYPTION))) {
            if (!isDetachedProcess) {
                    config.setHostName(JSONUtils.getString(cfgObject, RegistryConstants.ATTR_HOST));
            }
                        color,
            return CONFIG_GSON.fromJson(data, new TypeToken<Map<String, Map<String, Map<String, String>>>>() {
                    readSecuredCredentials(dataSource, profile,
            } else {
            DBSValueEncryptor encryptor = registry.getProject().getValueEncryptor();
                throw new DBInterruptedException("Project secure credentials read canceled by user.");
        dataSource.setConnectionReadOnly(JSONUtils.getBoolean(conObject, RegistryConstants.ATTR_READ_ONLY));
            JSONUtils.fieldNE(json, RegistryConstants.ATTR_HOST, connectionInfo.getHostName());
            return;
                } else {
import org.jkiss.dbeaver.model.data.json.JSONUtils;
                if (configurationStorage.isDefault()) {
            }
        @NotNull Map<String, DBPExternalConfiguration> externalConfigurations
                            JSONUtils.field(jsonWriter, "close-connections-period", ct.getCloseIdleConnectionPeriod());
    //  2 level: map of secured properties
        this.registry = registry;
        @Nullable DBPConfigurationProfile profile,
            if (createIfAbsent) {
import org.jkiss.dbeaver.registry.internal.RegistryMessages;
            CommonUtils.toBoolean(registry.getProject().getProjectProperty(USE_PROJECT_PASSWORD))
                    JSONUtils.fieldNE(json, RegistryConstants.ATTR_DEFAULT_SCHEMA, bootstrap.getDefaultSchemaName());
        NetworkHandlerDescriptor handlerDescriptor = NetworkHandlerRegistry.getInstance().getDescriptor(handlerId);
                }
            if (!ArrayUtils.isEmpty(connectionInfo.getDeclaredEvents())) {
                jsonWriter.beginObject();

                        }
                } else {
                        description,
                        if (bootstrapCfg.containsKey(RegistryConstants.ATTR_IGNORE_ERRORS)) {
        if (!referenceOnly) {
    ) throws DBException, IOException {
        JSONUtils.fieldNE(json, RegistryConstants.ATTR_TYPE, typeName);
        }
                    }
        if (!DBWorkbench.getPlatform().getApplication().isHeadlessMode()
        json.endObject();
                    parseResults.addedDataSources.add(dataSource);
                            ));
                JSONUtils.serializeProperties(json, RegistryConstants.TAG_CUSTOM_PROPERTIES, props, true);
                    json.name(RegistryConstants.TAG_BOOTSTRAP);
            if (!CommonUtils.isEmpty(configuration.getUserName()) ||
        JSONUtils.field(json, RegistryConstants.ATTR_TYPE, configuration.getType().name());
                            bootstrap.setIgnoreErrors(JSONUtils.getBoolean(bootstrapCfg, RegistryConstants.ATTR_IGNORE_ERRORS));
        .serializeNulls()
import java.io.*;
                            .isUseSecretStorage() || dataSource.isSharedCredentials());
                    if (!CommonUtils.isEmpty(savedFilters)) {
    @NotNull
                }
                    if (!CommonUtils.isEmpty(connectionTypes)) {
                        if (command.isWaitProcessFinish()) {
                    if (filter.defaultFilter != null && !filter.defaultFilter.isEmpty()) {
                    jsonWriter.beginObject();
                    }
                    }
                if (creds.getProperties() != null) {
                        id,
        if (provider == null) {
            JSONUtils.serializeStringList(json, "permission-restrictions", permIds);
                    List<DBWNetworkProfile> profiles = registry.getNetworkProfiles();

        saveCredentialsToMap(propMap, credentials);
                        CommonUtils.toBoolean(autoCloseConnections),
        @NotNull DataSourceConfigurationManager configurationManager,

        // Tags
        }
                    config.setDatabaseName(JSONUtils.getString(cfgObject, RegistryConstants.ATTR_DATABASE));
        @NotNull DBPDataSourceConfigurationStorage configurationStorage,
                // Permissions
                    creds.setSecureProp(entry.getKey(), value);

                    savePlainCredentials(jsonWriter, credentials);
        JSONUtils.field(json, RegistryConstants.ATTR_PROVIDER, dataSource.getDriver().getProviderDescriptor().getId());
                        config.setConfigurationType(
            }
                    oldDataSource.setId(id);
            DataSourceNavigatorSettingsUtils.loadSettingsFromMap(dataSource.getNavigatorSettings(), conObject);
                    } else {

                        origin = new DataSourceOriginLazy(originID, originProperties, extConfig);
                                networkProfile.getConfiguration(configuration.getHandlerDescriptor());
            JSONUtils.fieldNE(jsonWriter, RegistryConstants.ATTR_DESCRIPTION, np.getProfileDescription());

                    // Secure manager == save to buffer
                        dataSource,
            }
                driver = provider.createDriver(driverId);
            }
    }
                    }
                    }
        if (dataSource.isSharedCredentials()) JSONUtils.field(json, RegistryConstants.ATTR_SHARED_CREDENTIALS, true);
                                saveObjectFiler(jsonWriter, null, null, cf);
            // happens only if user cancelled entering password
                profile.setProfileName(JSONUtils.getString(profileMap, RegistryConstants.ATTR_NAME));
        if (handlerDescriptor == null) {
    }
                        CommonUtils.toBoolean(confirmDataChange),
                        new DBPConnectionConfiguration());
                        // Backward compatibility
        }
    ) {
    }
                !CommonUtils.isEmpty(configuration.getSecureProperties())
                Boolean autoCloseConnections = JSONUtils.getObjectProperty(ctConfig, "auto-close-connections");
                    readPlainCredentials(handlerCfg) :
            // here we catch any exceptions that happens for secure credential
                    // Clean settings - they have to be loaded later by parser
            JSONUtils.fieldNE(json, RegistryConstants.ATTR_PORT, connectionInfo.getHostPort());
        }
     * @param conObject - full datasource config
                        jsonWriter.name("drivers");
                        case RegistryConstants.ATTR_USER:
        }
                        }
        if (dataSource.hasSharedVirtualModel()) {
                        }

                    String colorValue = JSONUtils.getString(cfgObject, RegistryConstants.ATTR_COLOR);
        boolean encrypt
                if (bootstrap.hasData()) {

        }
            json.name("configuration");
                    JSONUtils.deserializeStringMap(conObject, RegistryConstants.TAG_CUSTOM_PROPERTIES)
                jsonWriter.setIndent(JSONUtils.DEFAULT_INDENT);
    private static final String ATTR_DRIVER_SUBSTITUTION = "driver-substitution"; //$NON-NLS-1$
                driver.setTemporary(true);
        }
    private static final String USE_PROJECT_PASSWORD = "useProjectPassword"; //$NON-NLS-1$
                        origin,
                }
                    }
        if (subMap != null) {
                        bootstrap.setInitQueries(JSONUtils.deserializeStringList(bootstrapCfg, RegistryConstants.TAG_QUERY));
        if (contents != null) {
        }
        try {
        dataSource.setLockPasswordHash(CommonUtils.toString(conObject.get(RegistryConstants.ATTR_LOCK_PASSWORD)));
            log.error("IO error while saving datasources configuration", e);
                }
                List<DBPDataSourcePermission> permissions = new ArrayList<>();
                            dataSource,
    ) throws DBException, IOException {
                            saveNetworkHandlerConfiguration(
        filter.setExclude(JSONUtils.deserializeStringList(map, RegistryConstants.TAG_EXCLUDE));
    private static final String NODE_CONNECTION = "#connection"; //$NON-NLS-1$
        if (CommonUtils.isEmpty(driverId)) {
            if (dataSource.getProject().isUseSecretStorage()) {
            }
                            JSONUtils.fieldNE(jsonWriter, RegistryConstants.ATTR_COLOR, ct.getColor());
                    if (!dataSource.equalSettings(oldDataSource)) {
                if (substitutedDriver == null || substitutedDriver.isTemporary()) {
            throw e;
    //  1 level: object type (connection or handler id)
                        // Skip temporary
            }
                    }
    @NotNull
                    } else {
                                bootstrapCfg,

        json.endObject();
        String jsonString = dsConfigBuffer.toString(StandardCharsets.UTF_8);
        try {
                            config.setUserPassword(creds.getUserPassword());
                    json.beginObject();
                        if (configuration != null) {

                        Map<String, Object> eventCfg = eventObject.getValue();
                    break;
        @NotNull T dataSource,
            }
                    parseResults.updatedDataSources.add(dataSource);

import org.jkiss.code.Nullable;
                        jsonWriter.beginObject();

                    config.setConfigProfileName(JSONUtils.getString(cfgObject, "config-profile"));
        @NotNull DBWHandlerConfiguration configuration,
import org.jkiss.dbeaver.registry.network.NetworkHandlerDescriptor;
                    for (DataSourceFolder folder : registry.getAllFolders()) {
        .setStrictness(Strictness.LENIENT)
            }
            // Save other
            JSONUtils.fieldNE(json, "config-profile-source", connectionInfo.getConfigProfileSource());
                    config.setCloseIdleConnection(closeIdleEnabled);
    private void saveCredentialsToMap(@NotNull Map<String, String> propMap, @NotNull SecureCredentials credentials) {
                    }
    private static final String CONFIGURATION_FOLDERS = "folders"; //$NON-NLS-1$
                modelMap.put(id, model);
                    }
                    }
            jsonWriter.beginObject();
                            break;

            if (connectionInfo.getConnectionType() != null) {
            } catch (Exception e) {
            } else {
            DBWorkbench.getPlatformUI().showWarningMessageBox(
                        name,
import org.jkiss.dbeaver.DBException;
            propMap.put(RegistryConstants.ATTR_PASSWORD, credentials.getUserPassword());
        }
                            saveFolder(jsonWriter, folder);
                    // Folders (only for default storage)

                preferenceProperties.putAll(
                            creds.setSecureProp(prop.getKey(), prop.getValue());

            DataSourceNavigatorSettingsUtils.loadSettingsFromMap(dataSource.getNavigatorSettings(), userSettings);
                    for (Map.Entry<String, Map<String, Object>> eventObject : JSONUtils.getNestedObjects(cfgObject, RegistryConstants.TAG_EVENTS)) {
        jsonWriter.name("network-profiles");
                        config.setCloseIdleInterval(closeIdle);
                            bootstrap.setDefaultSchemaName(JSONUtils.getString(bootstrapCfg, defObjectName));
            if (secureProperties.isEmpty()) {
    }
import com.google.gson.Gson;
        ByteArrayOutputStream credBuffer = new ByteArrayOutputStream();
                RegistryMessages.project_open_cannot_read_configuration_title,
        String topNodeId = profile != null ? "profile:" + profile.getProfileId() : dataSource.getId();
                        jsonWriter.beginObject();
        {
    public boolean parseDataSources(
                            extConfig = externalConfigurations.get(extConfigID);
                            JSONUtils.field(jsonWriter, "close-transactions-period", ct.getCloseIdleTransactionPeriod());
import java.nio.charset.StandardCharsets;
    ) throws IOException {

        if (registry.getProject().isUseSecretStorage()) {
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;

                return null;
                            if (!cf.isEmpty()) {

            JSONUtils.field(json, ATTR_ORIGINAL_PROVIDER, dataSource.getOriginalDriver().getProviderDescriptor().getId());
                String id = vmMap.getKey();
        }
                boolean newDataSource = (dataSource == null);
                }
                            final DBPDataSourceProvider dataSourceProvider = substitutedDriver.getDataSourceProvider();
            }
    }
                json.endObject();
                        JSONUtils.field(json, RegistryConstants.ATTR_TXN_ISOLATION, bootstrap.getDefaultTransactionIsolation());
                            break;
                // Add to the list
            jsonString,
            } else {
import org.jkiss.dbeaver.Log;
            switch (entry.getKey()) {
                    //backward compatibility
        json.name(CommonUtils.notEmpty(configuration.getId()));

                        }

                    for (DBWHandlerConfiguration configuration : connectionInfo.getHandlers()) {
                            JSONUtils.field(jsonWriter, "confirm-execute", ct.isConfirmExecute());
        saveConfigFile(
                        if (!globalFolders.contains(folder)) {

                profile.setUserPassword(authCreds.getUserPassword());
                        jsonWriter.endObject();
        {
    }
                String jsonString = CONFIG_GSON.toJson(secureProperties, Map.class);
                            bootstrap.setDefaultTransactionIsolation(JSONUtils.getInteger(
        @NotNull DataSourceConfigurationManager configurationManager,

            }
                if (configurationStorage.isDefault()) {
    ) throws IOException {
        }
            for (Map.Entry<String, Map<String, Object>> ctMap : JSONUtils.getNestedObjects(configurationMap, "connection-types")) {
                binaryContents = valueEncryptor.encryptValue(contents.getBytes(StandardCharsets.UTF_8));
                            }
                Map<String, DBPExternalConfiguration> externalConfigurations = new LinkedHashMap<>();
                RegistryMessages.project_open_cannot_read_credentials_button_text, true)) {
    @Nullable
                }
        @Nullable String objectID,
    private String loadConfigFile(InputStream stream, boolean decrypt) throws DBException, IOException {
            // Folders
            DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
                profile.setProfileName(profileId);
                    for (Map.Entry<String, DBSObjectFilter> cf : filter.customFilters.entrySet()) {
                registry.getProject().setRuntimeProperty(RuntimeProjectPropertiesConstant.IS_USER_DECLINE_PROJECT_DECRYPTION, Boolean.TRUE.toString());
                        registry.getNetworkProfile(connectionInfo.getConfigProfileSource(), configProfileName);
        @NotNull DBPDataSourcePermissionOwner permissionOwner
            JSONUtils.field(json, ATTR_ORIGINAL_DRIVER, dataSource.getOriginalDriver().getId());
                    if (!CommonUtils.isEmpty(authProfiles)) {
        Map<String, Map<String, String>> subMap = secureProperties.get(topNodeId);
    private static void saveFolder(@NotNull JsonWriter json, @NotNull DataSourceFolder folder) throws IOException {
        @NotNull JsonWriter json,
                        config.setUserName(creds.getUserName());

        if (subNode == null) subNode = NODE_CONNECTION;
                            }
import org.jkiss.dbeaver.registry.driver.DriverDescriptorSerializerModern;
                registry.updateNetworkProfile(profile);
                                        log.error("Unable to migrate connection configuration for data source '" + id + "'", e);
        Map<String, String> propMap = new LinkedHashMap<>();
                    config.setClientHomeId(JSONUtils.getString(cfgObject, RegistryConstants.ATTR_HOME));
                } else {
                // in case of user agreed lost project credentials - proceed opening
            JSONUtils.fieldNE(json, RegistryConstants.ATTR_CONFIGURATION_TYPE, connectionInfo.getConfigurationType().toString());
        if (dataSource.isConnectionReadOnly()) JSONUtils.field(json, RegistryConstants.ATTR_READ_ONLY, true);
                        command.setWaitProcessFinish(JSONUtils.getBoolean(eventCfg, RegistryConstants.ATTR_WAIT_PROCESS));
    private final boolean isDetachedProcess = DBWorkbench.getPlatform().getApplication().isDetachedProcess();
            for (Map.Entry<String, Map<String, Object>> conMap : JSONUtils.getNestedObjects(configurationMap, "connections")) {
                        // Save virtual models
            // not a community level
                DataSourceFolder parent = parentFolder == null ? null : registry.findFolderByPath(parentFolder, true, parseResults);
        byte[] binaryContents = null;

                    // External configurations
        Map<String, String> userSettings = null;
        } catch (DBInterruptedException e) {
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
                                RegistryConstants.ATTR_TXN_ISOLATION
            json.name("security");
            .getDriverSubstitution(CommonUtils.notEmpty(JSONUtils.getString(conObject, ATTR_DRIVER_SUBSTITUTION))));
            Map<String, String> propMap = subMap.get(subNode);

 * distributed under the License is distributed on an "AS IS" BASIS,

        JSONUtils.serializeProperties(json, RegistryConstants.TAG_EXTENSIONS, dataSource.getExtensions(), true);
        }
                for (String perm : permissionRestrictions) {
                        }
        dataSource.getNavigatorSettings().reset();
                        (project != null && project.isUseSecretStorage() && profile == null && dataSource.isSharedCredentials())) {
                        }
    }

                    if (!CommonUtils.isEmpty(colorValue)) {
            }
                    }
                            for (DBPDriver driver : dmap.getValue().values()) {
            is = ((DataSourceMemoryStorage) configurationStorage).getInputStream();
        }
            jsonWriter.name("handlers");
                        jsonWriter.setIndent(JSONUtils.EMPTY_INDENT);
            SimplePreferenceStore prefStore = dataSource.getPreferenceStore();
                        saveNetworkProfiles(configurationManager, jsonWriter, profiles);
        json.beginObject();
                profile.setProperties(authCreds.getProperties());
                userSettings = settingsProvider.getObjectSettings(SMObjectType.datasource, dataSource.getId());
        ) {

            Map<String, Object> originProps = new LinkedHashMap<>();

                    }
                            jsonWriter.endObject();
                    } catch (IllegalArgumentException e) {
    /**
            JSONUtils.field(json, RegistryConstants.ATTR_FOLDER, dataSource.getFolder().getFolderPath());
    }
                            creds.setUserPassword(prop.getValue());
                T oldDataSource = null;
                JSONUtils.field(json, RegistryConstants.ATTR_CLOSE_IDLE, connectionInfo.getCloseIdleInterval());
                if (configurationManager.isSecure()) {
                            DBPDriver driver = dataSource.getDriver();
                    }
        @Nullable String typeName,
        @NotNull DBRProgressMonitor monitor,
            conObject,
                {
            }
        return replacement;
        String contents,
                profile.setProfileId(profileId);
            Map<String, DBPExternalConfiguration> externalConfigurations = new LinkedHashMap<>();
                    // Handlers
import org.jkiss.dbeaver.model.virtual.DBVModel;


                Object closeConnectionsPeriod = JSONUtils.getObjectProperty(ctConfig, "close-connections-period");
                    }
            dataSource.getNavigatorSettings().setOriginalSettings(originalSettings);

    private void deserializeModifyPermissions(
                            JSONUtils.field(jsonWriter, "auto-commit", ct.isAutocommit());
            JSONUtils.serializeProperties(json, RegistryConstants.TAG_PROPERTIES, configuration.getProperties(), true);

                    String objectID = JSONUtils.getString(filterCfg, RegistryConstants.ATTR_ID);
                }
            String value = CommonUtils.toString(entry.getValue(), null);
    private static final Log log = Log.getLog(DataSourceSerializerModern.class);
                json.endArray();
            // Save events
                    if (bootstrap.isIgnoreErrors()) {
            JSONUtils.fieldNE(json, RegistryConstants.ATTR_COLOR, connectionInfo.getConnectionColor());
                            dataSource.getConnectionConfiguration().updateHandler(configuration);
    }
        @Nullable DBPConfigurationProfile profile,

            DataSourceNavigatorSettings originalSettings = new DataSourceNavigatorSettings();
                        configurationManager, jsonWriter,

        while (replacement.getReplacedBy() != null) {
                        config.setKeepAliveInterval(keepAlive);
                        np,
        if (folder.getParent() != null) {
            JSONUtils.serializeProperties(json, TAG_ORIGIN, originProps);
            jsonWriter.beginObject();
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
        Map<String, String> propMap = nodeMap.computeIfAbsent(subNode, s -> new LinkedHashMap<>());
                        }
                NLS.bind(RegistryMessages.project_open_cannot_read_credentials_message,
        if (!CommonUtils.isEmpty(permissions)) {
                        if (bootstrapCfg.containsKey(RegistryConstants.ATTR_AUTOCOMMIT)) {
            }
            Map<String, DBVModel> modelMap = new LinkedHashMap<>();
                for (DBPConnectionEventType eventType : connectionInfo.getDeclaredEvents()) {
                            if (driver.isCustom() && !driver.getProviderDescriptor().isTemporary()) {
            curNetworkHandler.setSavePassword(JSONUtils.getBoolean(handlerCfg, RegistryConstants.ATTR_SAVE_PASSWORD));
                    String configurationType = JSONUtils.getString(cfgObject, RegistryConstants.ATTR_CONFIGURATION_TYPE);
 * You may obtain a copy of the License at
        serializeModifyPermissions(json, dataSource);
    }
                }
        DataSourceConfigurationManager configurationManager,
    private static final String ATTR_ORIGINAL_DRIVER = "original-driver"; //$NON-NLS-1$
            }
                log.debug("Can't find datasource provider " + providerId + " for datasource '" + id + "'");

                        String extConfigID = CommonUtils.toString(originProperties.remove(ATTR_ORIGIN_CONFIGURATION));

            if (propMap != null) {
                profile.setAuthModelId(JSONUtils.getString(profileMap, RegistryConstants.ATTR_AUTH_MODEL));
    ) {

                if (dbvModel != null) {
    @NotNull
                    }
    }
        if (!decrypt) {

                            JSONUtils.field(jsonWriter, "auto-close-connections", ct.isAutoCloseConnections());
        }
                            JSONUtils.fieldNE(jsonWriter, RegistryConstants.ATTR_NAME, ct.getName());
                log.debug("Can't find driver " + driverId + " in datasource provider "
    private void serializeModifyPermissions(
    private static final String ENCRYPTED_CONFIGURATION = "secureProject"; //$NON-NLS-1$
            nodeMap.remove(subNode);

                    // Drivers
                    originalDriver = substitutedDriver;
    public static final String TAG_ORIGIN = "origin"; //$NON-NLS-1$
            // Network profiles
        ) {
                        DBSObjectFilter filter = readObjectFiler(filterCfg);
                    JSONUtils.field(json, RegistryConstants.ATTR_ENABLED, command.isEnabled());
        @NotNull JsonWriter json,
        if (configurationManager.isSecure()) {

        dataSource.setSavePassword(JSONUtils.getBoolean(conObject, RegistryConstants.ATTR_SAVE_PASSWORD));
        // Permissions
                    "network/" + handlerId + (profile == null ? "" : "/profile/" + profile.getProfileName()));
            if (authProfile.isSavePassword()) {
    }
        Map<String, Object> handlerCfg = handlerObject.getValue();
                }
                driver.setName(driverId);
        }
                // in case of canceling erase credentials intercept original exception
            {

        @Nullable Collection<String> dataSourceIds
                    saveNetworkHandlerConfiguration(
                    substitutedDriver = original;
            log.debug("Empty driver for datasource '" + id + "'");
                    String typeName = JSONUtils.getString(filterCfg, RegistryConstants.ATTR_TYPE);
                deserializeAdditionalProperties(dataSource, conObject);
    private DBWHandlerConfiguration parseNetworkHandlerConfig(
        }
            }
                !CommonUtils.isEmpty(configuration.getPassword()) ||
                    DBRShellCommand command = connectionInfo.getEvent(eventType);
            }
    }
            registry.getProject().isEncryptedProject());
    @Override
                        dataSource.updateObjectFilter(typeName, objectID, filter);
                    }
            try (JsonWriter jsonWriter = CONFIG_GSON.newJsonWriter(osw)) {
                DBPConnectionType ct = DBWorkbench.getPlatform().getDataSourceProviderRegistry().getConnectionType(id, null);
                String description = JSONUtils.getObjectProperty(ctConfig, RegistryConstants.ATTR_DESCRIPTION);
                    }
            return null;
                        id,
        if (dataSource.getFolder() != null) {
        var connectionConfigurationChanged = false;
            secureProperties.remove(topNodeId);
                        }
            {
            return JSONUtils.parseMap(CONFIG_GSON, new StringReader(data));
        filter.setDescription(JSONUtils.getString(map, RegistryConstants.ATTR_DESCRIPTION));
                        String userName = JSONUtils.getString(cfgObject, RegistryConstants.ATTR_USER);
                        jsonWriter.beginObject();
        DriverDescriptor driver = provider.getOriginalDriver(driverId);
import org.jkiss.dbeaver.model.*;
                Map<String, DBPConnectionType> connectionTypes = new LinkedHashMap<>();
        }
                        bootstrap.setDefaultCatalogName(JSONUtils.getString(bootstrapCfg, RegistryConstants.ATTR_DEFAULT_CATALOG));
        json.name(dataSource.getId());

                            bootstrap.setDefaultAutoCommit(JSONUtils.getBoolean(bootstrapCfg, RegistryConstants.ATTR_AUTOCOMMIT));
        for (DBAAuthProfile authProfile : authProfiles) {
                    }
    private Map<String, Object> readConfiguration(
        if (settingsProvider != null) {
            if (!props.isEmpty()) {
                    json.beginObject();
                if (newDataSource) {
        @NotNull T dataSource,
        } catch (DBInterruptedException e) {
import org.jkiss.dbeaver.model.secret.DBSValueEncryptor;
package org.jkiss.dbeaver.registry;
        }
            List<String> permIds = new ArrayList<>(permissions.size());
            JSONUtils.field(json, RegistryConstants.ATTR_PARENT, folder.getParent().getFolderPath());
        }

        filter.setInclude(JSONUtils.deserializeStringList(map, RegistryConstants.TAG_INCLUDE));

        } catch (Exception e) {
import org.jkiss.utils.IOUtils;
        DataSourceProviderDescriptor provider = DataSourceProviderRegistry.getInstance().getDataSourceProvider(providerId);

                DBVModel model = new DBVModel(id, vmMap.getValue());
    public static final String ATTR_DPI_ENABLED = "dpi-enabled";
                        jsonWriter.name("connection-types");
            jsonWriter.name(np.getProfileId());
                dataSource.setTags(
 * Unless required by applicable law or agreed to in writing, software
                    }
        json.endObject();

        DriverDescriptor replacement = driver;

            for (String propName : prefStore.preferenceNames()) {
            Collection<FilterMapping> filterMappings = dataSource.getObjectFilters();
            // Connection info
    private SecureCredentials readSecuredCredentials(
        DBSObjectFilter filter = new DBSObjectFilter();
                    DBPConnectionConfiguration config = dataSource.getConnectionConfiguration();
                    substitutedDriver = originalDriver;
            jsonWriter.endObject();
                if (CommonUtils.isEmpty(originalProviderId) || CommonUtils.isEmpty(originalDriverId)) {
        filter.setEnabled(JSONUtils.getBoolean(map, RegistryConstants.ATTR_ENABLED));
                    Map<String, Object> configMap = ctMap.getValue();
        }
            log.error("Error reading secure credentials file", e);
                        } else {
            // Connections
        @NotNull JsonWriter json,
                    }
            jsonWriter.name(authProfile.getProfileId());

                json.beginObject();
                    dataSource.getConnectionConfiguration().setProperties(Collections.emptyMap());
                            creds.setUserName(prop.getValue());
/*
                    dataSource.getConnectionConfiguration().setHandlers(Collections.emptyList());
        @Nullable DBWNetworkProfile profile,
    private void saveAuthProfiles(DataSourceConfigurationManager configurationManager, JsonWriter jsonWriter, List<DBAAuthProfile> authProfiles) throws IOException {
                        CommonUtils.toBoolean(smartCommitRecover),
}
        if (!CommonUtils.isEmpty(securityCfg)) {
                if (ct == null) {
                            JSONUtils.getString(cfgObject, RegistryConstants.ATTR_TYPE), DBPConnectionType.DEFAULT_TYPE));
        jsonWriter.name("auth-profiles");
                        }
        jsonWriter.beginObject();
                default:
                    creds.setUserName(value);
                }
                    // Events
            return curNetworkHandler;
                if (configurationManager.isSecure()) {
            is = configurationManager.readConfiguration(configurationStorage.getStorageName(), dataSourceIds);
        }
                if (!CommonUtils.isEmpty(connectionInfo.getHandlers())) {
                    curNetworkHandler.setPassword(creds.getUserPassword());
            final String data = loadConfigFile(is, CommonUtils.toBoolean(registry.getProject().isEncryptedProject()));
                        saveObjectFiler(json, filter.typeName, null, filter.defaultFilter);
            throw e;
    }
                    if (closeIdle > 0) {
        } else {
        json.beginObject();
                String userPassword = JSONUtils.getString(handlerCfg, RegistryConstants.ATTR_PASSWORD);
                            readSecuredCredentials(dataSource, null, null);
        try {

                preferenceProperties.clear();
            secureCredentialsMap = readSecureCredentials(configurationStorage, configurationManager, dataSourceIds);
                    Map<String, Object> bootstrapCfg = JSONUtils.getObject(cfgObject, RegistryConstants.TAG_BOOTSTRAP);
                    }
            for (DBPDataSourcePermission perm : permissions) permIds.add(perm.getId());
        @Nullable DBWNetworkProfile profile,

                String propValue = prefStore.getString(propName);
                        if (savePasswordApplicable && !CommonUtils.isEmpty(creds.getUserPassword())) {
                for (Map.Entry<String, Map<String, Object>> handlerMap : JSONUtils.getNestedObjects(profileMap, "handlers")) {
                                    }
                            jsonWriter.name(dmap.getKey());
                DBSObjectFilter filter = readObjectFiler(ctMap);
            DataSourceNavigatorSettingsUtils.loadSettingsFromMap(originalSettings, conObject);
                                    } catch (DBException e) {
                            readPlainCredentials(cfgObject) :
                            }
     */

                // Filters
        JSONUtils.field(json, RegistryConstants.ATTR_DRIVER, dataSource.getDriver().getId());
                        extensions = JSONUtils.deserializeProperties(conObject, RegistryConstants.TAG_PROPERTIES);

                    }
            if (!DBWorkbench.isDistributed()) {
                        // Still try to read credentials directly from configuration (#6564)
                            credentials
     * Deserialize additional datasource properties
                }
            configurationManager,
                DBAAuthProfile profile = new DBAAuthProfile(registry.getProject());

                }
            Map<String, Object> properties = JSONUtils.deserializeProperties(handlerCfg, RegistryConstants.TAG_PROPERTIES);
        @NotNull DataSourceConfigurationManager configurationManager,
            Map<String, String> props = new TreeMap<>();
    @NotNull
                            command.setWaitProcessTimeoutMs(JSONUtils.getInteger(eventCfg, RegistryConstants.ATTR_WAIT_PROCESS_TIMEOUT));
            try {
                        configuration,
        if (configurationStorage instanceof DataSourceMemoryStorage) {
        JSONUtils.serializeStringList(json, RegistryConstants.TAG_EXCLUDE, filter.getExclude());
    {
            curNetworkHandler.setEnabled(JSONUtils.getBoolean(handlerCfg, RegistryConstants.ATTR_ENABLED));
            for (Map.Entry<String, Map<String, Object>> vmMap : JSONUtils.getNestedObjects(configurationMap, "virtual-models")) {
        }
        @NotNull DBSObjectFilter filter
                    if (!virtualModels.isEmpty()) {
            }.getType());
                                        dataSource.setConnectionInfo(migrated);
            try {
                    String configProfileName = connectionInfo.getConfigProfileName();
        }
            originProps.putAll(origin.getDataSourceConfiguration());
                + configurationStorage.getStorageSubId() + DBPDataSourceRegistry.CREDENTIALS_CONFIG_FILE_EXT;
                    }
            JSONUtils.field(json, ATTR_DRIVER_SUBSTITUTION, dataSource.getDriverSubstitution().getId());
        if (driver == null) {
                }
        json.beginObject();
            List<String> permissionRestrictions = JSONUtils.deserializeStringList(securityCfg, "permission-restrictions");
                        }
        String credFile = DBPDataSourceRegistry.CREDENTIALS_CONFIG_FILE_PREFIX + storage.getStorageSubId() + DBPDataSourceRegistry.CREDENTIALS_CONFIG_FILE_EXT;


        @NotNull DBPDataSourceConfigurationStorage configurationStorage,
