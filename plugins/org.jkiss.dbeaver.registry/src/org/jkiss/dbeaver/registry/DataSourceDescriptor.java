    }
        // Add them first (just to make secret easy-to-read during debugging)
    }
        this.secretsContainsDatabaseCreds = false;
                    if (authProvidedFromOrigin) {
                }
    //ignore changed store type
            this.connectTime = null;
                    monitor.subTask("Initialize tunnel");
        public String getName() {
        }
            this.folder = source.folder;
            loadFromSecret(secretValue);
        return storage;
    private transient boolean originalShareCredentials;
    public DBPDataSourceContainer createCopy(DBPDataSourceRegistry forRegistry) {
    public void setModifyPermissions(@Nullable Collection<DBPDataSourcePermission> permissions) {
                        try {
        return dataSource;
    @Override
                                    return false;
                    }
    }
    //TODO move secret management logic to separate service
                        throw new DBCException("Error initializing tunnel", e);
            if (filterMapping != null) {
        connectionInfo.setUserName(dbUserName);
    private void resolveSecretsIfNeeded() throws DBException {
        if (connecting) {
                setSelectedSharedCredentials(found);
    public boolean disconnect(@NotNull final DBRProgressMonitor monitor) {
        resetAllSecrets();
    }
                }

        if (!CommonUtils.isEmpty(resolvedConnectionInfo.getConfigProfileName())) {
                }
        if (isSavePassword()) {
    private boolean sharedCredentials;
        this.sharedCredentials = sharedCredentials;
    @Override
import java.util.*;
        } catch (Exception e) {
import org.eclipse.core.runtime.IStatus;

            if (!detachedProcess) {
    public List<DBPDataSourcePermission> getModifyPermission() {

        if (!CommonUtils.isEmpty(connectionInfo.getHostName())) {
    private List<DBPDataSourcePermission> connectionModifyRestrictions;
            DBSInstance defaultInstance = dataSource.getDefaultInstance();
    }
    @NotNull
    public boolean isPersisted() {
        return connectionInfo.getDatabaseName();
            if (e instanceof DBException) {
        if (shouldRemoveExistsSecrets()) {
    public DataSourcePreferenceStore getPreferenceStore() {
                    dataSource = null;
    public boolean isConnected() {
        if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
    }
        @NotNull DBPConnectionConfiguration connectionInfo) {


        return driver.getPlainIcon();
            this.virtualModel.setDataSourceContainer(this);
        DBSObjectFilter filter;
        this.driver = driver;
        if (dataSource != null) {
            // Close datasource
                    monitor.done();
                        // Ask for password

                monitor.beginTask("Synchronize local data source", 1);
        }
            DBWHandlerConfiguration tunnelConfiguration = null, proxyConfiguration = null;
        this(registry, storage, origin, id, driver, driver, connectionInfo);
        //do not store handlers in secret for shared connections
    public String getClientApplicationName() {
        }

                } finally {
    @NotNull

        this.selectedSharedCredentials = secretValue;
    implements
            }
import org.jkiss.dbeaver.Log;
        }
                }
                        coll.addProperty(CATEGORY_CONNECTIONS, "context-" + context.getContextId(), String.valueOf(conIndex), context.getContextName());
    @NotNull
                    proxyHandler.initializeHandler(monitor, proxyConfiguration, resolvedConnectionInfo);
        if (!isSharedCredentials()) {
            }
            // try to load private user credentials
            if (dataSource != null) {
        }
    public boolean isAccessCheckRequired() {
                        tunnelConfiguration = handler;
    public String getPropertyConnectTime() {
    public void setDriver(@NotNull DriverDescriptor driver) {

        return getPreferenceStore().getBoolean(ModelPreferences.RESULT_SCIENTIFIC_NUMERIC_FORMAT);
        if (!isSharedCredentials()) {
    protected void handleConnectError(@NotNull Throwable e) {
                // Do not replace source origin config.
        Map<String, Object> props = new LinkedHashMap<>();
            try (DBCSession session = DBUtils.openMetaSession(monitor, this, "Read server information")) {
    }
    public static final String DATASOURCE_KEY_PREFIX = "/datasources/";
            return;
    }

            this.connectionModifyRestrictions = new ArrayList<>(permissions);
        for (DBPDataSourceTask user : usersStamp) {
            if (driverName != null) {
                }
    public static final String CATEGORY_DRIVER_FILES = "Driver Files";
import org.jkiss.dbeaver.model.exec.*;
        this.tags = new LinkedHashMap<>(source.tags);
    @Override
            return false;
    @Override
        }
        this.tags.putAll(tags);
        } catch (DBException e) {
            this.folder = (DataSourceFolder) registry.getFolder(source.folder.getFolderPath());
                }
            for (Map.Entry<String, String> ap : dbAuthProperties.entrySet()) {
                        monitor.beginTask("Synchronize remote data source", 1);

    @Nullable
        return registry.getProject();

                    try {
        loadFromSecret(this.selectedSharedCredentials.getValue());
import org.jkiss.dbeaver.model.secret.*;
        this.preferenceStore.setProperties(source.preferenceStore.getProperties());
                            DBWTunnel.AuthCredentials rc = tunnelHandler.getRequiredCredentials(tunnelConfiguration);
    public DataSourceNavigatorSettings getOriginalNavigatorSettings() {
            // Update filter
    }
        return getId();
            this.extensions.remove(name);
            if (secretValue == null && !DBWorkbench.isDistributed()) {
                resolvedConnectionInfo.getConfigProfileName());
        return description;
            // Close tunnelHandler
            return false;
                    } catch (DBCException e) {
            if (CommonUtils.isEmpty(target)) {
        } catch (Exception e) {
    private volatile Date connectTime = null;
    public String getSecretValueId() {

            var sharedCreds = listSharedCredentialFromCache();
        secretsResolved = true;
                    // Set driver explicitly.

            for (DBWHandlerConfiguration handler : resolvedConnectionInfo.getHandlers()) {
                    monitor.subTask("Initialize proxy");

    private boolean hidden;
    @Nullable
    }
        }
            log.debug("Secret save is disabled in secret controller. Auth settings won't be saved.");
    }

        this.originalDriver = originalDriver;
    }
                try {
    public String getPropertyDatabase() {
    private final DBPDataSourceRegistry registry;
            return dataSource.getInfo().getDatabaseProductDetails();

    }


    }

            if (users.contains(user)) {

        if (isSharedCredentials() && !isSharedCredentialsSelected()) {
    }

    public void release(@NotNull DBPDataSourceTask user) {
                switch (secret.getName()) {
            this.originalShareCredentials = isSharedCredentials();
    }
    @Override
                        providerSynchronizable.syncRemoteDataSource(monitor, this);

                }
            }

    private FilterMapping getTypeFilterMapping(@Nullable DBSObject parentObject, boolean firstMatch, Class<?> testType) {

    public void setTagValue(@NotNull String tagName, @Nullable String tagValue) {
    public DataSourceDescriptor(
                return driverName + (driverVersion == null ? "" : " [" + driverVersion + "]");
    }
    }
                    resetAllSecrets();
                    } catch (Throwable e) {


        FilterMapping filterMapping = getFilterMapping(type, parentObject, firstMatch);
            || props.containsKey(RegistryConstants.TAG_PROPERTIES)
        this.driverSubstitution = driverSubstitution;
                monitor.subTask("Close tunnel");
    }
                for (int urlIndex = 0; urlIndex < urls.length; urlIndex++) {
            } else {
                iter.remove();
        } else {
    @Nullable
        // Info fields (we don't use them anyhow)
        @NotNull DBPConnectionConfiguration connectionInfo
    }
                case AFTER_DISCONNECT -> handlerDesc.getInstance().beforeDisconnect(monitor, this);
                            if (rc != DBWTunnel.AuthCredentials.NONE) {
            for (Class<?> it : testType.getInterfaces()) {

    @Override
                providerSynchronizable.syncLocalDataSource(monitor, this);
        }
    }
        return hidden;
    DBPDataSourceConfigurationStorage getStorage() {
        this.virtualModel.copyFrom(descriptor.getVirtualModel());
    @Property(viewable = true, order = 3)

        } else {

        return getProject().getId();
            return getName();
        }
            false,
                CommonUtils.equalObjects(this.driver, source.driver) &&
    @Override
                        } catch (Exception e) {
    @NotNull
        Map<String, Object> props;
    }
            DBAAuthCredentials authCreds = getConnectionConfiguration().getAuthModel().loadCredentials(this, getConnectionConfiguration());
    public DataSourceDescriptor(
            return ((DBDFormatSettings) dataSource).getDefaultValueHandler();

            // Handle tunnelHandler
    @Override
        DBPConnectionConfiguration actualConfig = dataSourceContainer.getActualConnectionConfiguration();
    @Override
    }
            usersStamp = new ArrayList<>(users);
 *     http://www.apache.org/licenses/LICENSE-2.0

                }
    public boolean equalInternalConfiguration(DataSourceDescriptor source) {
    }
    ) {
        return storage;
        // Update auth properties if possible
        if (command != null && command.isEnabled()) {
            if (serverName != null) {
    }

        // Add them only if we have real props
        this.id = source.id;
            networkHandler.setPassword(authInfo.getUserPassword());
        }
    private DBPConnectionConfiguration resolvedConnectionInfo;
            }


        for (Class<?> testType : type.getInterfaces()) {
                        log.debug("Auth parameters were provided by origin " + originID);
                monitor.done();
    @Property(order = 8)
    }
        return dataSource != null && !connecting;
    }
    public DataSourceDescriptor(@NotNull DataSourceDescriptor source, @NotNull DBPDataSourceRegistry registry, boolean setDefaultStorage) {
                CommonUtils.equalObjects(this.filterMap, source.filterMap) &&
    @NotNull
            // In distributed mode we detect saved password dynamically
    public void setTags(Map<String, String> tags) {

                            secretController.getPrivateSecretValue(secretId));
    public void setVirtualModel(@NotNull DBVModel virtualModel) {

    }
    }


    @Override

    private FilterMapping getFilterMapping(@NotNull Class<?> type, @Nullable DBSObject parentObject, boolean firstMatch) {
        final DBPDataSourceProvider provider = driver.getDataSourceProvider();
    }
    public void setForceUseSingleConnection(boolean value) {
    boolean persistSecretIfNeeded(boolean force, boolean isNewDataSource) throws DBException {
            if (selectedSharedCredentials != null) {
        resolveSecrets(secretController);
                    @NotNull
import org.jkiss.dbeaver.model.access.DBACredentialsProvider;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.forceUseSingleConnection = value;
    public DBPNativeClientLocation getClientHome() {
    private volatile boolean connectFailed = false;
        if (!(obj instanceof DataSourceDescriptor source)) {

    public boolean isDefaultAutoCommit() {
        int jobCount = 0;
            this.secretsContainsDatabaseCreds = false;
    private void terminateChildProcesses() {
            // Reset resolved secrets
                }
        return true;
            switch (eventType) {
                if (process.isRunning() && process.getCommand().isTerminateAtDisconnect()) {
            return getConnectionConfiguration().getConnectionType().isAutocommit();
            boolean authProvidedFromOrigin = false;
        if (rnd < 0) rnd = -rnd;

    }
        }
        try {

        }

        return lastConnectionError;
            }
        return connectionInfo.getBootstrap().getDefaultTransactionIsolation();

        this.virtualModel = new DBVModel(this, source.virtualModel);
            if (providerSynchronizable != null && providerSynchronizable.isSynchronizationEnabled(this)) {
                    filter = filterMapping.getFilter(parentObject, firstMatch);
            // 1. Get credentials from origin
        }
    private DBPDataSource dataSource;
    private transient DBWTunnel tunnelHandler;
        } catch (Throwable e) {
            NLS.bind(RegistryMessages.dialog_connection_auth_title_for_handler, networkHandler.getTitle()) :
    public String saveToSecret() {

        return RMProjectType.getPlainProjectId(getProject()) + DATASOURCE_KEY_PREFIX + getId();
        return !CommonUtils.equalObjects(virtualModel.getId(), getId());
        this.extensions.putAll(extensions);
            DBPEvent.Action.OBJECT_UPDATE,
        }
        } else {
        // Save all unsaved data

            users.clear();

        this.connectionInfo = connectionInfo;
                handlersFromSecret.add(handlerId);

            }

    @Override
                    dataSource.getSQLDialect().afterDataSourceInitialization(dataSource);
        if (availableSharedCredentials != null) {
                    tunnelHandler = null;
                boolean authProvidedFromCredProvider = true;
    @Override
                        case RegistryConstants.ATTR_PASSWORD -> hc.setPassword(
        } else {
    private final boolean manageable;


                    case RegistryConstants.ATTR_PASSWORD -> connectionInfo.setUserPassword(secretValue);
        }
    }
    }
 * Unless required by applicable law or agreed to in writing, software
                    throw new DBException("Shared credentials with subject ID '" + forceSecretId + "' not found");


    private transient final DBPExclusiveResource exclusiveLock = new SimpleExclusiveLock();
            }
        this.connectionReadOnly = source.connectionReadOnly;
                }
        return name;
        this.savePassword = descriptor.savePassword;
            .filter(ObjectPropertyDescriptor::isPassword)
    }
        propsFull.putAll(props);
    }

    }
            log.debug("Disconnected (" + getId() + ")");
                }
            action,
                    switch (secret.getName()) {
                    }
        // Primary props
                }
                        case RegistryConstants.ATTR_USER -> hc.setUserName(
    }

                        monitor.done();

            RegistryMessages.dialog_connection_auth_username,
                            e
            childProcesses.add(process);
        return null;
        );
import org.jkiss.dbeaver.model.meta.Property;

            succeeded = this.dataSource != null;
            this.availableSharedCredentials = List.of();
            connecting = false;
            if (driver.getDefaultDriverLoader().getClassLoader() instanceof URLClassLoader urlClassLoader) {
    public boolean isCredentialsSaved() throws DBException {
    @Override
                        revertMetaToManualCommit = true;
            user,
    }
            log.error("Datasource is not connected");
    public synchronized List<DBSSecretValue> listSharedCredentials() throws DBException {
        return true;
            DBSSecretController.getProjectSecretController(getProject()) : null;
            // For shared credentials reset cache also
            }

                    }
            }
        registry.notifyDataSourceListeners(event);
            dataSourceContainer.setSavePassword(authInfo.isSavePassword());
    DBPAdaptable,
        connecting = true;
    }
        }
        @NotNull DBPDataSourceRegistry registry,
                connectionInfo.getHandlers().forEach(handler ->
                        authProvidedFromCredProvider = askForPassword(this, null, DBWTunnel.AuthCredentials.CREDENTIALS);
/*
            for (DBPDataSourceTask user : usersStamp) {
    @Override
        if (connectTime != null) {
            {
                CommonUtils.equalObjects(this.lockPasswordHash, source.lockPasswordHash) &&
            }

    public Collection<FilterMapping> getObjectFilters() {
            || emptyDatabaseCredsSaved;
    @Override
            this.virtualModel = new DBVModel(this, virtualModel);
    @Override
        return (T) extensions.get(name);
    }
    public boolean isUseScientificNumericFormat() {

    public String getId() {
            monitor.worked(1);

    @Nullable

                this, this.resolvedConnectionInfo);

 * See the License for the specific language governing permissions and
    @NotNull
import org.jkiss.dbeaver.model.data.json.JSONUtils;
        return isLooselyEqualTo(source) && equalConfiguration(source) && equalInternalConfiguration(source);
    }
        }
                        throw e;
    public String getProjectId() {
                        return null;
                        handler.setSavePassword(false);
        @NotNull DBPDataSourceConfigurationStorage storage,
        this(source, registry, true);

        return null;
            handleConnectError(e);
        try {

        @NotNull DBPDataSourceRegistry registry,
    public boolean reconnect(@NotNull final DBRProgressMonitor monitor)
        boolean emptyDatabaseCredsSaved = CommonUtils.toBoolean(props.getOrDefault(RegistryConstants.ATTR_EMPTY_DATABASE_CREDENTIALS, false));
    private final Map<String, Object> extensions;
                }
                        try {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            actualConfig.setUserPassword(authInfo.getUserPassword());
    }
        // Process variables
        if (connecting) {
        return isSharedCredentials() != originalShareCredentials;
            monitor.worked(1);
                return filterMapping;
        return authInfo;
import org.jkiss.dbeaver.model.data.DBDValueHandler;
        }
    public static class ContextInfo implements DBPObject {

            }
        connectionInfo.setUserPassword(null);
        return CommonUtils.isEmpty(reqAuthProvider) ? null : reqAuthProvider;
        }
            networkHandler.setUserName(authInfo.getUserName());
    public void setTemporary(boolean temporary) {
                    authProvidedFromOrigin = cp.provideAuthParameters(monitor, this, resolvedConnectionInfo);
        if (authInfo == null) {
    @Nullable
        this.name = source.name;
import org.jkiss.dbeaver.model.runtime.DBRProcessDescriptor;
    }
            }
        this.clientApplicationName = applicationName;
        if (!(secretController instanceof DBSSecretBrowser sBrowser)) {

    private DBDDataFormatterProfile formatterProfile;
        this.temporary = temporary;
import org.jkiss.dbeaver.model.navigator.DBNBrowseSettings;
                        } finally {
    @NotNull
        return lockPasswordHash;
        return driverSubstitution;
    }
        updateObjectFilter(type.getName(), parentObject == null ? null : FilterMapping.getFilterContainerUniqueID(parentObject), filter);
        }


                            NLS.bind(RegistryMessages.dialog_data_source_synchronization_fail_remote_message, dataSource.getName()),
            }
        return clientHome;
        setNavigatorSettings(descriptor.navigatorSettings);
        }
    }
    @Override
        this.name = name;
            CommonUtils.equalObjects(this.savePassword, source.savePassword) &&
    @Nullable
                }
        }
        try {
                hc.setSecureProperties(hcProperties);
                if (authProvider != null) {
    DBPImageProvider,
        return DBInfoUtils.SECRET_GSON.toJson(propsFull);
            registry.updateDataSource(this);
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

    }
        }
    @NotNull
                    }
    @Override
        if ((permission == DBPDataSourcePermission.PERMISSION_EDIT_DATA ||
        @NotNull DataSourceDescriptor dataSourceContainer,
    private DBPDriver driver;
    public void openDataSource(DBRProgressMonitor monitor, boolean initialize) throws DBException {
    @Nullable
                    // to resave current secret without additional click in UI
                hc.setPassword(hcPassword);
    }
                    //the list of available secrets has changed, force update
            connectFailed = true;
                exclusiveLock.releaseExclusiveLock(dsLock);
    }
                : this.getRegistry().getNetworkProfile(connectionInfo.getConfigProfileSource(), connectionInfo.getConfigProfileName());

        }

    }
            log.debug("Can't connect - connect/disconnect is in progress");
                for (DBWHandlerConfiguration handlerCfg : profile.getConfigurations()) {
                    }
                if (!detachedProcess) {
        if (!isSharedCredentials()) {
            monitor.done();
            }
        return this.resolvedConnectionInfo != null ? this.resolvedConnectionInfo : this.connectionInfo;
                var hcPassword = JSONUtils.getString(handlerMap, RegistryConstants.ATTR_PASSWORD);
                users.add(user);

            filter = filterMapping.getFilter(parentObject, firstMatch);
            // Check actual credentials
                String secretValue = secretController.getPrivateSecretValue(secretId);
                DBWorkbench.getPlatformUI().showError("Error saving datasource", null, e);
            return authCreds.isComplete();

        }
                try {

        this.preferenceStore = new DataSourcePreferenceStore(this);
}
import org.jkiss.dbeaver.model.security.SMObjectType;
    private final DataSourcePreferenceStore preferenceStore;

                    tunnelHandler.closeTunnel(monitor);
                        handlerProps.put(RegistryConstants.ATTR_ID, hc.getId());
            null,

    @Property(name = "ID", viewable = false, order = 0)
    @NotNull

            }
    public static final String CATEGORY_DRIVER = "Driver";
        }

    protected boolean closeConnectionDetached() {
    public DBPConnectionConfiguration getConnectionConfiguration() {
            this.dataSource = openConnectionDetached(monitor, detachedProcess);
        this.driver = source.driver;
    @Override
        @NotNull DBPDriver driver,
    public void resolveSecrets(DBSSecretController secretController) throws DBException {
    public boolean equalConfiguration(DataSourceDescriptor source) {
                new AbstractJob(processDescriptor.getName() + ": output reader") {
 *
            }
                    RegistryMessages.dialog_data_source_synchronization_fail_title,
import org.jkiss.dbeaver.runtime.properties.ObjectPropertyDescriptor;
        return proxyHandler == null ?
        this.manageable = setDefaultStorage && ((DataSourceRegistry<?>) registry).getDefaultStorage().isDefault();
        }
        if (proxyHandler == null && tunnelHandler == null) {
                        txnManager.setAutoCommit(monitor, true);
        }
    public DBPImage getObjectImage() {
                    protected IStatus run(@NotNull DBRProgressMonitor monitor) {

    }
    @Override

        final String user = networkHandler != null ? networkHandler.getUserName() : actualConfig.getUserName();
            if (dsOrigin instanceof DBACredentialsProvider cp) {
        this.forceUseSingleConnection = descriptor.forceUseSingleConnection;

        authInfo = DBWorkbench.getPlatformUI().promptUserCredentials(
        return connectionInfo;
            monitor.subTask("Close connection");
package org.jkiss.dbeaver.registry;
                                if (!askForPassword(this, tunnelConfiguration, rc)) {
            password,

            // Do not persist empty secrets for new datasources
            }
            if (filter != null && (firstMatch || filter.isEnabled())) {
                    if (networkHandler != null) {
                }.schedule();
            }
    @Override
            new DBWNetworkHandler[]{tunnelHandler} :
    @NotNull
    }
    @NotNull
                    if (filter != null && (firstMatch || filter.isEnabled())) return filterMapping;
                if (revertMetaToManualCommit) {
        throws DBException {
        return !preferenceStore.getBoolean(ModelPreferences.META_DISABLE_EXTRA_READ);
        }
        if (CommonUtils.isEmpty(permissions)) {
        FilterMapping filterMapping = filterMap.get(typeName);
        return sharedCredentials;
                }

                        resolvedConnectionInfo.updateHandler(new DBWHandlerConfiguration(handlerCfg));
        private final DBCExecutionContext context;

            }
                    log.debug("Connected (" + getId() + ", driver unknown)");
                case BEFORE_CONNECT -> handlerDesc.getInstance().beforeConnect(monitor, this);
    //TODO move out?
    // It will be saved in local configuration even if project uses secured storage
        if (secretsResolved || !getProject().isUseSecretStorage()) {
            this.virtualModel = virtualModel;

        if (isConnected() && !disconnect(monitor, reflect)) {
    @NotNull
    }

        return null;
    @NotNull

                } catch (Throwable e) {
import org.jkiss.dbeaver.model.sql.SQLDialectMetadata;
                return DataSourceOriginLocal.INSTANCE;
        return filterMap.values();
        if (dataSource != null) {
        synchronized (users) {
    public static final String CATEGORY_SERVER = "Server";
                target = getName();
    }
    protected DBPDataSource openConnectionDetached(@NotNull DBRProgressMonitor monitor, boolean detachedProcess) {
    void persistSecrets(DBSSecretController secretController, boolean isNewDataSource) throws DBException {
        return driver;
    }
        Boolean bootstrapAutoCommit = connectionInfo.getBootstrap().getDefaultAutoCommit();
    @Property(order = 34, category = CATEGORY_SERVER)
                return filterMapping;
                // Save changes in real connection info
        this.accessCheckRequired = manageable;
    @NotNull
            log.debug(e);
    }
                CommonUtils.equalObjects(this.folder, source.folder) &&
                for (DBSSecretValue secret : sharedCreds) {
public class DataSourceDescriptor
                    handler.setDataSource(this);
        this.driverSubstitution = source.driverSubstitution;
                dataSource.shutdown(monitor);

        @NotNull DBRProgressMonitor monitor,
        this.tags = new LinkedHashMap<>();
                        }
        } finally {
    }

                        updateDataSourceObject(succeeded, DBPEvent.Action.AFTER_CONNECT);

    public void forceSetSharedCredentials(boolean sharedCredentials) {
        this.driver = substitutedDriver;
            return false;
    @Override
        return preferenceStore;
import java.net.URL;
    }
    @Override
    }
            if (DBWorkbench.isDistributed()) {
            }
                    log.warn("Handler '" + handlerId + "' not found in datasource '" + getId() + "'. Secret configuration will be lost.");
        FilterMapping filterMapping = filterMap.get(testType.getName());
                hc.setUserName(hcUsername);

                    log.debug("Connected (" + getId() + ", " + getPropertyDriver() + ")");
    }
                log.debug("Shared credentials not selected - use first one: " + sharedCreds.getFirst().getDisplayName());
    }
    public DBSObject getParentObject() {
        return new LinkedHashMap<>(tags);
                        proxyConfiguration = handler;
            filterMapping.defaultFilter = filter;

        } else {
        @NotNull DBPDriver substitutedDriver,
    }

    }

        this.extensions = new LinkedHashMap<>(source.extensions);
                (o, p) -> true,
    }
    public boolean reconnect(final DBRProgressMonitor monitor, boolean reflect)
            String driverName = dataSource.getInfo().getDriverName();
                if (profileConfig == null || !profileConfig.isEnabled()) {
            DBWorkbench.getPlatformUI().executeProcess(processDescriptor);
    @NotNull
    @Property(order = 33, category = CATEGORY_SERVER)
    public DBPDataSourceOrigin getOrigin() {
                if (found == null) {
 * DataSourceDescriptor
    public void setExtension(@NotNull String name, @Nullable Object value) {
    @Override
                                ((DBWHandlerConfigurator) dataSourceProvider).activateHandler(tunnelHandler, resolvedConnectionInfo, tunnelConfiguration);
            if (authInfo.isSavePassword() && connConfig != actualConfig) {
                }
    DBPRefreshableObject,
            final DBRProcessDescriptor processDescriptor = new DBRProcessDescriptor(command, getVariablesResolver(true));
    @Override
            this,
    public boolean isSavePassword() {
        }
        for (Map.Entry<String, FilterMapping> fe : source.filterMap.entrySet()) {
    public void setNavigatorSettings(@NotNull DBNBrowseSettings copyFrom) {

            if (command.isWaitProcessFinish()) {
        @NotNull DBWTunnel.AuthCredentials authType
                throw (DBException) e;
        if (!isSharedCredentials()) {
                int resultCode;
    public boolean isLocked() {
    public boolean isManageable() {
        } else if (source.folder != null) {
    public DBPDataSourceRegistry getRegistry() {
            return externalOrigin.getSubType();
                handler -> {
    public String getSecretObjectType() {
    }
            connectionInfo.setUserName(null);
    }
            if (!CommonUtils.isEmpty(connectionInfo.getUserPassword())) {
        this.secretsResolved = false;
    }
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor)
        boolean canSavePassword)
                        );
        for (FilterMapping mapping : descriptor.getObjectFilters()) {
            coll.collectProperties();
            if (user instanceof DBPDataSourceAcquirer) {

    private boolean accessCheckRequired = true;
    @Nullable
        }
    }
    public boolean isTemporary() {
                    throw new DBException("Cannot set team '" + subjectId + "' credentials: " + e.getMessage(), e);
    @Override
        }
                    if (!isSavePassword() && !getDriver().isAnonymousAccess()) {
                }
    }
    private volatile boolean secretsResolved = false;

    @NotNull
            // Update config from profile
import java.io.StringReader;
                            if (dataSourceProvider instanceof DBWHandlerConfigurator) {
                    }
        return
    }
            tunnelHandler == null ?
        return savePassword;
    }

            connecting = false;

    }
        return SMObjectType.datasource.name();
        }
        this.connectionReadOnly = connectionReadOnly;
    public void resetPassword() {
            }
        String forceSecretId = getPreferenceStore().getString(DBPConnectionConfiguration.PROP_SECRET_SUBJECT_ID);
        DBPConnectionConfiguration connConfig = dataSourceContainer.getConnectionConfiguration();
        }
    }

    }
    }
import org.jkiss.dbeaver.ModelPreferences;
    }

    }


        monitor.worked(1);
    @Override
            filterMapping.customFilters.put(objectID, filter);
        }
        this.extensions = new LinkedHashMap<>();
            final var provider = driver.getDataSourceProvider();
                DBWorkbench.getPlatformUI().showError(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return true;
            // DS-specific model
    @NotNull
        ) {
        // Handlers
                // Setup proxy handler
            return null;
    private transient String clientApplicationName;
                } else {
            return Collections.emptyList();
        String password,
                    case RegistryConstants.ATTR_USER -> connectionInfo.setUserName(secretValue);
        var dbUserName = JSONUtils.getString(props, RegistryConstants.ATTR_USER);
    public String getPropertyConnectType() {
            this.virtualModel.setId(virtualModel.getId());
    public String toString() {
            addChildProcess(processDescriptor);
                    }
                }
    public boolean hasModifyPermission(@NotNull DBPDataSourcePermission permission) {
        }
                if (!authProvidedFromCredProvider) {
        return tags.get(tagName);


                // Reflect UI
    }
    private final Map<String, String> tags;
        }
        }
            return true;
    @NotNull
    @Override
    @Override
        DBPAuthInfo authInfo;
            // 2. Get credentials from global provider

        return true;
                actualConfig.setUserName(authInfo.getUserName());
        if (!CommonUtils.isEmpty(dbAuthProperties)) {
        return CommonUtils.equalObjects(this.extensions, source.extensions);
            }
        DBRShellCommand command = info.getEvent(eventType);
        return reconnect(monitor, true);
                        return Status.OK_STATUS;
            log.error("Error parsing secret value", e);
                itemPath = Path.of(keyPrefix + "/network/" + hc.getId());
            // Open tunnelHandler and replace connection info with new one
            terminateChildProcesses();
            if (CommonUtils.isNotEmpty(forceSecretId)) {
        }
            }
        if (isDetached()) {
        }
                log.debug("Datasource user '" + user + "' already registered in datasource '" + getName() + "'");


        }
            monitor.beginTask("Disconnect from '" + getName() + "'", 5 + dataSource.getAvailableInstances().size());
            return authModelExternal.getRequiredExternalAuth(getConnectionConfiguration());

            // Use ds exclusive lock to initialize network handlers
            return false;
    private boolean shouldRemoveExistsSecrets() {
        resolveSecretsIfNeeded();
    private String description;

                }
import org.jkiss.dbeaver.runtime.IVariableResolver;
        if (filterMapping != null) {
            processEvents(monitor, DBPConnectionEventType.BEFORE_CONNECT);
    @Override

 * you may not use this file except in compliance with the License.

        this.description = descriptor.description;
                    proxyHandler = proxyConfiguration.createHandler(DBWNetworkHandler.class);
        List<DBPDataSourceTask> usersStamp;
    private boolean connect0(DBRProgressMonitor monitor, boolean initialize, boolean reflect) throws DBException {
        if (secretsResolved && secretsContainsDatabaseCreds) {
    @Nullable
            // Additional auth props
            proxyHandler = null;
        try {
        synchronized (childProcesses) {
        return connectTime;
        filterMap.clear();
                                if (job.getState() != Job.RUNNING) {
                return serverName + (serverVersion == null ? "" : " [" + serverVersion + "]");
            }
    }
        }
            // Disable manual commit for init stage (because it may produce errors and modify transaction scope)
        } else {
        lastConnectionError = null;
            patchConnectionProperties(monitor, resolvedConnectionInfo);

    @Nullable
        return selectedSharedCredentials != null;
        final String password = networkHandler != null ? networkHandler.getPassword() : actualConfig.getUserPassword();
                }
        this.tags.putAll(descriptor.tags);
    private void resolvePropertiesFromProfile() throws DBException {
                monitor.subTask("Connect to data source");
        resolvedConnectionInfo = new DBPConnectionConfiguration(connectionInfo);
            String serverName = dataSource.getInfo().getDatabaseProductName();
    @Nullable
                String handlerId = JSONUtils.getString(handlerMap, RegistryConstants.ATTR_ID);
    @Override

    public boolean isConnectionReadOnly() {
        DBPConnectionConfiguration configuration = actualConfig ? getActualConnectionConfiguration() : getConnectionConfiguration();
        this.filterMap.clear();
        tags.put(tagName, tagValue);
                    setSelectedSharedCredentials(selectedSharedCredentialsCopy);
    // Password is saved in configuration
                        log.debug("Shared credentials forced by preference - use: " + secret.getDisplayName());
    private transient final List<DBPDataSourceTask> users = new ArrayList<>();
    }
    }
        return disposed;
            authInfo = askCredentials(dataSourceContainer, authType, prompt, user, password, !dataSourceContainer.isTemporary());
            return DBSObjectState.NORMAL;
            return DBSObjectState.INVALID;
    @Override
    @Override
    public Map<String, String> getTags() {
    public DBPConnectionConfiguration getActualConnectionConfiguration() {
import org.jkiss.dbeaver.model.struct.DBSObject;
                } else {
                null,
        this.sharedCredentials = source.sharedCredentials;
    private static final Log log = Log.getLog(DataSourceDescriptor.class);
                        if (!tunnelConfiguration.isSavePassword()) {
        @NotNull DBPDataSourceConfigurationStorage storage,
    public DataSourceFolder getFolder() {
            monitor.worked(1);
        resolveSecretsIfNeeded();
    public DBPProject getProject() {
        if (providerSynchronizable != null && providerSynchronizable.isSynchronizationEnabled(this)) {
    @NotNull
        if (source.formatterProfile == null || source.formatterProfile.getProfileName().equals(source.getId())) {
     * to get secrets using cache use {@link #listSharedCredentialFromCache}
        }
        }
            DBSSecretController secretController = DBSSecretController.getProjectSecretController(getProject());
            this.formatterProfile = new DataFormatterProfile(getId(), preferenceStore);
    }

            }

            if (this.availableSharedCredentials.size() == 1) {
            log.error("Error reading datasource '" + getId() + "' legacy secrets", e);
    private volatile boolean connecting = false;
            return;
        this.virtualModel = new DBVModel(this);
    @Override
            if (!CommonUtils.isEmpty(connectionInfo.getAuthProperties())) {
        if (dsOrigin instanceof DBPDataSourceOriginExternal externalOrigin) {

                        conIndex++;
    }
        this.origin = descriptor.origin;
            if (authInfo.isSavePassword() && connConfig != actualConfig) {
    @NotNull
    private final Map<String, FilterMapping> filterMap = new HashMap<>();
            if (!users.remove(user)) {

    }
    public void setId(@NotNull String id) {
            try {
    }
        try {
 */
    private final DBPDataSourceConfigurationStorage storage;
    }
        if (sharedCredentials) {
                }
        this.id = id;
    public void setFolder(@Nullable DBPDataSourceFolder folder) {
        @NotNull String id,
            monitor.worked(1);
                }
    public void copyFrom(DataSourceDescriptor descriptor) {

    @Nullable
            if (profile != null) {

            // Terminate child processes
    }
        // Delete secrets (on connection delete)
                connConfig.updateHandler(networkHandler);
    }
                        job.cancel();
        this.savePassword = savePassword;
            connectionInfo.getHandlers().forEach(
            }
    public boolean isForceUseSingleConnection() {
                CommonUtils.equalObjects(this.clientHome, source.clientHome) &&

    @NotNull
        return connecting;
            this.secretsContainsDatabaseCreds = true;

        }
            if (!succeeded) {

    public String getPropertyURL() {
                    if (!handlerProps.isEmpty()) {
        if (availableSharedCredentials == null) {

            persistSecrets(secretController, isNewDataSource);
    public DBPDriver getDriver() {
        }
 * limitations under the License.
    void removeSecretIfNeeded() throws DBException {
    public boolean hasSharedVirtualModel() {
                ? RegistryMessages.dialog_connection_auth_passphrase
        if (dataSource instanceof DBPRefreshableObject) {
    private DBPDriverSubstitutionDescriptor driverSubstitution;
            log.debug("Can't reconnect - connect/disconnect is in progress");
    }
                CommonUtils.equalObjects(this.connectionInfo, source.connectionInfo) &&

                CommonUtils.equalsContents(this.connectionModifyRestrictions, source.connectionModifyRestrictions);

            }
    @Nullable
        connecting = true;

    public void setAccessCheckRequired(boolean accessCheckRequired) {
            this.tunnelHandler = null;

    public synchronized void setSelectedSharedCredentials(@NotNull DBSSecretValue secretValue) {
                }
            return new ArrayList<>(users);
    @NotNull
            } else {
     */
        // Datasource props
        }
        if (initialize) {
            resetAllSecrets();
            if (user instanceof Job) {
    /**
    @Override
        boolean detachedProcess = DBWorkbench.getPlatform().getApplication().isDetachedProcess();

        if (dataSource != null) {
        }
        public String toString() {
        this.id = id;
import java.text.DateFormat;
            PropertyCollector coll = new PropertyCollector(this, true);
    public DBPDataSourceConfigurationStorage getConfigurationStorage() {
    // Secret key prefix
                    (dsOrigin.getSubType() == null ? "" : ("/" + dsOrigin.getSubType()));
        this.lockPasswordHash = lockPasswordHash;
            actualConfig.updateHandler(networkHandler);
        return false;
            } else {

                    resultCode = processDescriptor.waitFor();

    public DBVModel getVirtualModel() {
    public DBPDriver getOriginalDriver() {
                    // Handler config may have null driver if it was copied from profile config.
    private transient List<DBSSecretValue> availableSharedCredentials;

                    succeeded = connect0(monitor, initialize, reflect);

            // Cross-registry copy
                        DBExecUtils.startContextInitiation(this);
    }
        if (value == null) {
    private DBPConnectionConfiguration connectionInfo;
    public void persistSecrets(DBSSecretController secretController) throws DBException {
    DBPDataSourceOrigin getOriginSource() {
    }
    }
    @Nullable
        return !CommonUtils.isEmpty(lockPasswordHash);
        return null;
                final URL[] urls = urlClassLoader.getURLs();
        return (DataSourceNavigatorSettings) navigatorSettings.getOriginalSettings();
            if (!handlersConfigs.isEmpty()) {
    public boolean isHidden() {
        getRegistry().notifyDataSourceListeners(new DBPEvent(
    public String getSecretObjectId() {
    @Nullable
        } else if (adapter == DBPPropertySource.class) {
                    String secretId = secret.getId();
        return null;
            // Stop all jobs
    public DBSObjectFilter getObjectFilter(Class<?> type, @Nullable DBSObject parentObject, boolean firstMatch) {
    public static final String CATEGORY_CONNECTIONS = "Connections";

            if (props.isEmpty()) {

    }
                    // Open local connection
            return null;
        Path itemPath = Path.of(keyPrefix);
        }
            for (DBSSecret secret : sBrowser.listSecrets(itemPath.toString())) {
            for (Iterator<DBRProcessDescriptor> iter = childProcesses.iterator(); iter.hasNext(); ) {
    @NotNull
    }
            } finally {
                throw e;
        resolveSecretsIfNeeded();
            addr.append(connectionInfo.getHostName());


    }
            authInfo = new DBPAuthInfo(user, password, false);
        List<Map<String, Object>> handlerList = JSONUtils.getObjectList(props, RegistryConstants.TAG_HANDLERS);
                filterMapping = filterMap.get(it.getName());
            DBWorkbench.getPlatformUI().showError("Save error", "Error saving datasource configuration", lastError);
                    }
        return listSharedCredentials();
    public String getPropertyAddress() {
    public DBWNetworkHandler[] getActiveNetworkHandlers() {
                try {

        if (secretValue == null) {
                if (txnManager != null && !txnManager.isAutoCommit()) {
            isSharedCredentials() ? DBSSecretController.FEATURE_SHARED_SECRETS_EDIT : DBSSecretController.FEATURE_PRIVATE_SECRETS_EDIT)
    void clearFilters() {
                            log.debug("Process error output:\n" + output);
            if (authType == DBWTunnel.AuthCredentials.CREDENTIALS) {
        getRegistry().notifyDataSourceListeners(new DBPEvent(
            Object dsLock = exclusiveLock.acquireExclusiveLock();

        return this.forceUseSingleConnection;
        return getOrigin().isDynamic();
    @NotNull
        } else {
            if (reflect) {

            }
            // Handlers. If config profile is set then props are saved there
            if (!isNewDataSource || secret != null) {


        @NotNull DBPDriver driver,
    }
    @Override
        this.folder = (DataSourceFolder) folder;
                    }
            this.resolvedConnectionInfo.resolveDynamicVariables(variableResolver);
    }
        }
    public DataSourceDescriptor(
            this.clientHome = DBUtils.findObject(driver.getNativeClientLocations(), connectionInfo.getClientHomeId());
        }
            }
    @Override
        @NotNull DBPDriver originalDriver,
    // store original flag state to detect changes
            return false;
                    @Override
        return null;
    @Property(order = 30, category = CATEGORY_SERVER)
            }


        }
        }

        return getPreferenceStore().getBoolean(ModelPreferences.RESULT_NATIVE_DATETIME_FORMAT);
                    if (job.getState() == Job.RUNNING) {
                }
                    }
    }
                for (DBSSecret secret : sBrowser.listSecrets(itemPath.toString())) {
                            secretId,
    @NotNull
            log.error("Connect/disconnect is in progress");
        }
            }
import org.jkiss.dbeaver.model.struct.DBSInstance;
        // Save only if secrets were already resolved or it is a new connection
    public boolean isLooselyEqualTo(DataSourceDescriptor source) {
            }
    // Copy of connection info with resolved params (cache)
                        handlersConfigs.add(handlerProps);
                } catch (Exception e1) {
                String originID = dsOrigin.getType() +
                    return false;
    @Override
                    continue;
        DBPAuthInfo authInfo;
     * Copies datasource configuration
    @NotNull
        if (authInfo.isSavePassword()) {

    @Override

            this.reconnect(monitor, false);
            DBSSecretController secretController = DBSSecretController.getProjectSecretController(getProject());
        Throwable lastError = registry.getLastError();
        }
        }
    @Override

    @Property(order = 9)
                var selectedSharedCredentialsCopy = selectedSharedCredentials;

    @Override
            }

import java.nio.file.Path;
        if (CommonUtils.isEmpty(this.connectionModifyRestrictions)) {
            DBPDataSourceOrigin dsOrigin = getOrigin();
    public boolean connect(@NotNull DBRProgressMonitor monitor, boolean initialize, boolean reflect) throws DBException {
                                    tunnelHandler = null;
            IVariableResolver variableResolver = new DataSourceVariableResolver(
                if (!isDisposed()) {

        return null;
    private volatile boolean secretsContainsDatabaseCreds = false;
        return temporary;
                    authProvidedFromCredProvider = authProvider.provideAuthParameters(monitor, this, resolvedConnectionInfo);
    }
        } else {
    public boolean isSharedCredentials() {
        if (lastError != null) {
    }


import org.jkiss.dbeaver.utils.DataSourceUtils;
        @NotNull DBWTunnel.AuthCredentials authType,
    }
                props.put(RegistryConstants.ATTR_USER, connectionInfo.getUserName());
            // If secret controller is external then it may take quite a time + may cause errors because of missing secret
        this.originalShareCredentials = this.sharedCredentials;
import org.jkiss.dbeaver.model.rm.RMProjectType;
        @NotNull String id,
                    } finally {
                String secretId = secret.getId();
                jobCount++;
            proxyHandler = null;
                if (proxyConfiguration != null) {
        @NotNull String id,
            return false;
                if (user instanceof Job job) {
import org.jkiss.utils.CommonUtils;
        } catch (DBException e) {
        DBSSecretController secretController = getProject().isUseSecretStorage() ?
    @Override
        String user,
    }
    public void setHidden(boolean hidden) {

    }
    @Nullable
    @Override
                if (filterMapping != null) {
        return false;
            }
                props.put(RegistryConstants.TAG_PROPERTIES, connectionInfo.getAuthProperties());
        }
            }
    public <T> T getExtension(@NotNull String name) {
        }
        this.originalDriver = source.originalDriver;
    @Override

        }
    }
    private String lockPasswordHash;
        }
                        return txnManager.getTransactionIsolation();
                try {
        }

        if (networkHandler != null) {
        } else if (connectFailed) {
                savePassword = false;
    @Override
        if (savePassword) {
            return reqAuthProvider;
                    } catch (DBException e) {
        if (props.isEmpty()) {
    @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
                            }
            ).stream()
            return context.getContextName();

                if (tunnelConfiguration != null) {

    }
                    CommonUtils.isNotEmpty(hcUsername) || CommonUtils.isNotEmpty(hcPassword) || !CommonUtils.isEmpty(hcProperties)
            secretsResolved = true;
                CommonUtils.equalObjects(this.connectionReadOnly, source.connectionReadOnly) &&
            } catch (DBException e) {
    /**
    }
                }
                );
    public void setDriverSubstitution(@Nullable DBPDriverSubstitutionDescriptor driverSubstitution) {
    }
import org.jkiss.code.Nullable;
                    e
            }

        synchronized (users) {
            networkHandler.setSavePassword(authInfo.isSavePassword());
        this.secretsContainsDatabaseCreds = props.containsKey(RegistryConstants.ATTR_USER)
                    log.warn("Network handler ID is missing in the configuration");

            }
                        }
        if (disposed) {
            }
        this.preferenceStore = new DataSourcePreferenceStore(registry.getPreferenceStore(), this);
    @Override
    }
import org.jkiss.dbeaver.model.*;


            prompt,
        boolean succeeded = false;
            // They may be ready if we are in test connection mode


            } else {
                if (txnManager != null) {
            closeConnectionDetached();
    }
        if (source.getRegistry() == registry) {
    }
    }
            this.savePassword = secretsContainsDatabaseCreds;

                    log.error("Error initializing datasource", e);
            return adapter.cast(coll);
                updateDataSourceObject(succeeded, DBPEvent.Action.OBJECT_UPDATE);
                    // Auth parameters were canceled

            //log.debug("Connection failed (" + getId() + ")", e);
            this.dataSource = null;
                }
        }

                            // its ok, do nothing
            }

    @Override
            }
    @Override

    @Nullable
    public DBPDataSource getDataSource() {

                    default -> connectionInfo.setAuthProperty(secretId, secretValue);
                        }
            String driverVersion = dataSource.getInfo().getDriverVersion();
            boolean revertMetaToManualCommit = false;
        } else {

                        // We need to resolve jump server differently due to it being a part of ssh configuration
    }
        var reqAuthProvider = getConnectionConfiguration().getAuthModelDescriptor().getRequiredAuthProviderId();
    }
        @Override
    private void loadFromLegacySecret(DBSSecretController secretController) {
    @Override

        }
                            log.debug(e);
            // Secret edit disabled
            secretController.deleteObjectSecrets(this);
        public ContextInfo(DBCExecutionContext context) {
                        monitor.worked(1);
        FilterMapping filterMapping = getFilterMapping(type, parentObject, true);
        if (dataSource instanceof DBDFormatSettings) {
        @NotNull DataSourceDescriptor dataSourceContainer,

    @NotNull

        }
        @NotNull DBPConnectionConfiguration resolvedConnectionInfo
        if (!getProject().isUseSecretStorage()) {
    public void setName(@NotNull String name) {
        }
    @Override
import org.jkiss.dbeaver.model.data.DBDDataFormatterProfile;
    @NotNull
        }

        this.forceUseSingleConnection = driver.isSingleConnection();
                    }
        return connectionReadOnly;
        }
        return selectedSharedCredentials;


     */
    }
        }
        } else {

                            DBPDataSourceProvider dataSourceProvider = driver.getDataSourceProvider();
    @NotNull
                } catch (DBException e) {
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
                filterMapping.defaultFilter = filter;
            DBSSecretController secretController = DBSSecretController.getProjectSecretController(getProject());
            terminateChildProcesses();
        var dsOrigin = getOrigin();
            return false;
    @Override
                realOrigin = dsoLazy.resolveRealOrigin();
        }
        var dbAuthProperties = JSONUtils.deserializeStringMapOrNull(props, RegistryConstants.TAG_PROPERTIES);
    public boolean isExternallyProvided() {
        Map<String, Object> propsFull = new LinkedHashMap<>();
    public DataSourceDescriptor(@NotNull DataSourceDescriptor source, @NotNull DBPDataSourceRegistry registry) {
        throws DBException {

 */
                monitor.subTask("Use first available shared credentials");
    public Integer getDefaultTransactionsIsolation() {
        var dbPassword = JSONUtils.getString(props, RegistryConstants.ATTR_PASSWORD);
    @Override
    private String id;
    }
    {
    @Override
    @Property(order = 21, category = CATEGORY_DRIVER)
            .forEach(passwordProperty -> connectionInfo.setAuthProperty(passwordProperty.getKeyName(), null));
    private void addChildProcess(DBRProcessDescriptor process) {
    @Override
        this.registry = registry;

                                }
    public static String generateNewId(DBPDriver driver) {
        // Test all super classes
            return adapter.cast(this);
        this.virtualModel.dispose();

                                    break;
    }
            lastConnectionError = e.getMessage();
                    try {
        }
import org.jkiss.dbeaver.utils.GeneralUtils;
    }
            if (!CommonUtils.isEmpty(connectionInfo.getUserName())) {

            return !connectionModifyRestrictions.contains(permission);

                log.debug("Shared credentials not found - attempt to connect as is");

                var hcProperties = JSONUtils.deserializeStringMap(handlerMap, RegistryConstants.TAG_PROPERTIES);
                ((DBPDataSourceAcquirer) user).beforeDisconnect();
            final var providerSynchronizable = GeneralUtils.adapt(provider, DBPDataSourceProviderSynchronizable.class);
        if (objectID == null) {
    @Override

            String serverVersion = dataSource.getInfo().getDatabaseProductVersion();
            || props.containsKey(RegistryConstants.ATTR_PASSWORD)
        if (dataSource != null) {
    }
        @NotNull DBPDataSourceOrigin origin,
    public void resetAllSecrets() {
    }

                    secretController.setSubjectSecretValue(subjectId, this,
    private transient final List<DBRProcessDescriptor> childProcesses = new ArrayList<>();
    }
    }
    }
        log.debug("Connect with '" + getName() + "' (" + getId() + ")");
        this(registry, ((DataSourceRegistry<?>) registry).getDefaultStorage(), DataSourceOriginLocal.INSTANCE, id, driver, connectionInfo);
                            RegistryMessages.dialog_data_source_synchronization_fail_title,
    // secrets resolved from secret controller
    public boolean persistConfiguration() {
            }
    }
            return;
            processEvents(monitor, DBPConnectionEventType.AFTER_DISCONNECT);

            String secretValue = secretController.getPrivateSecretValue(getSecretValueId());
                    handler.setSavePassword(false)
    }
    @Override
        if (dataSource == null) {
    }
                props.put(RegistryConstants.ATTR_EMPTY_DATABASE_CREDENTIALS, true);
            if (tunnelHandler != null) {
                        break;

        this.hidden = hidden;
    public String getRequiredExternalAuth() {
                    coll.addProperty(CATEGORY_DRIVER_FILES, "driver-file-" + urlIndex, String.valueOf(urlIndex), path);
                    }
    /**

    ) throws DBException {
                hc.setSavePassword(
            return savePassword;
            dataSource = (DBPDataSource) ((DBPRefreshableObject) dataSource).refreshObject(monitor);
            monitor.done();
    @Override
        finally {
                }
            monitor.subTask("Execute process " + processDescriptor.getName());

            getDriver().validateFilesPresence(monitor, this);
                );
                } finally {
    public void setClientApplicationName(@NotNull String applicationName) {
        }

                        connConfig.setUserName(authInfo.getUserName());
    @Nullable

                    process.terminate();
import org.jkiss.dbeaver.DBException;
        return DefaultValueHandler.INSTANCE;
    @Nullable
                    networkHandler.setPassword(authInfo.getUserPassword());
                DBSSecretValue found = null;
        copy.setId(DataSourceDescriptor.generateNewId(copy.getDriver()));
                        default -> hc.setProperty(
    }
            DBWorkbench.getPlatformUI().showError("Datasource update error", "Error updating datasource", e);
        }
            monitor.done();
            }
                if (!providerSynchronizable.isLocalDataSourceSynchronized(monitor, this)) {
        var secretController = DBSSecretController.getProjectSecretController(getProject());
                String subjectId = DataSourceUtils.getSubjectFromSecret(selectedSharedCredentials);
    public void acquire(@NotNull DBPDataSourceTask user) {
        if (DBWorkbench.isDistributed()) {
                CommonUtils.equalObjects(this.sharedCredentials, source.sharedCredentials) &&
            monitor.beginTask("Waiting for all active tasks to finish", jobCount);
    }
                if (networkHandler != null) {

        return this;
        return CommonUtils.equalOrEmptyStrings(this.name, source.name) &&
        this.accessCheckRequired = accessCheckRequired;
        }

            if (dataSource != null) {
                ObjectPropertyDescriptor.getObjectClass(connectionInfo.getAuthModel().createCredentials()),
            return getConnectionConfiguration().getConnectionType().hasModifyPermission(permission);
    @NotNull
        }
            }

            this.proxyHandler = null;

    ) {
    ) {
 * DBeaver - Universal Database Manager
    void updateObjectFilter(String typeName, @Nullable String objectID, DBSObjectFilter filter) {

            } finally {
    public Date getConnectTime() {
            return false;
            }
                }
    public void setSharedCredentials(boolean sharedCredentials) {

    }
        }

        getOriginalNavigatorSettings().copyFrom(copyFrom);
        ObjectPropertyDescriptor.extractAnnotations(
    private final DataSourceNavigatorSettings navigatorSettings;
        this.description = source.description;
            DBWNetworkProfile activeProfile = CommonUtils.isEmpty(connectionInfo.getConfigProfileName())
import org.jkiss.dbeaver.registry.internal.RegistryMessages;
        connectionInfo.setUserPassword(dbPassword);
            connectionInfo.setUserPassword(null);
    }
        // Update config from profile
        } else {
    public void setConnectionInfo(@NotNull DBPConnectionConfiguration connectionInfo) {
                DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());
                this.connectFailed = false;
    public String getPropertyServerName() {
    }
/**
        return extensions;
        throws DBException {
                            secretController.getPrivateSecretValue(secretId));
        this.extensions.clear();
    private void releaseDataSourceUsers(DBRProgressMonitor monitor) {


        this.virtualModel.dispose();
    }
            this.extensions.put(name, value);
    @Override
                try {
        return navigatorSettings;
                throw new DBException("Internal error connecting to " + getName(), e);
        }
    private transient DBSSecretValue selectedSharedCredentials;
                    try {
        this.connectionInfo = connectionInfo;
    @NotNull

    }
import org.jkiss.dbeaver.model.net.*;
    private boolean disconnect(final DBRProgressMonitor monitor, boolean reflect) {
        if (this.isConnected()) {
            this.availableSharedCredentials = secretController.discoverCurrentUserSecrets(this);
    private final DBPDriver originalDriver;
                int conIndex = 0;
                    resultCode = processDescriptor.waitFor(command.getWaitProcessTimeoutMs());
    // Password is shared.
                    txnManager.setAutoCommit(monitor, false);
    public String getTagValue(@NotNull String tagName) {
    public boolean isDisposed() {
        persistSecrets(secretController, false);
        }

        this.storage = storage;
        disposed = true;
    @Property(order = 31, category = CATEGORY_SERVER)
            DataSourceDescriptor.this));
        return name + " [" + driver + "]";
    }
                DBACredentialsProvider authProvider = registry.getAuthCredentialsProvider();
            CommonUtils.equalOrEmptyStrings(this.description, source.description);
    @Override
        return !storage.isDefault();
        }
    public void fireEvent(@NotNull DBPEvent event) {

     */
            return false;

                    updateDataSourceObject(succeeded, DBPEvent.Action.BEFORE_CONNECT);
                props.put(RegistryConstants.TAG_HANDLERS, handlersConfigs);
    private boolean connectionReadOnly;

        }
    protected void patchConnectionProperties(
        @Nullable DBWHandlerConfiguration networkHandler,
                    connConfig.setUserPassword(authInfo.getUserPassword());
        String prompt,
    }
    @Override
            }
            addr.append(':').append(connectionInfo.getHostPort());
    }
        propsFull.put("datasource-name", getName());
    /**
            this.connectionModifyRestrictions = null;
            authType == DBWTunnel.AuthCredentials.PASSWORD
    @Property(viewable = true, order = 1)
    @NotNull
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) {
        if (CommonUtils.isEmpty(connectionModifyRestrictions)) {
                        DBWorkbench.getPlatformUI().showError(
            this.filterMap.put(mapping.typeName, new FilterMapping(mapping));
                    try {
            }
            if (defaultInstance != null) {
                updateDataSourceObject(false, DBPEvent.Action.OBJECT_UPDATE);
                    }


    public DBPDriverSubstitutionDescriptor getDriverSubstitution() {
        return virtualModel;
    }
                DBWHandlerConfiguration hc = connectionInfo.getHandler(handlerId);
import org.jkiss.dbeaver.model.virtual.DBVModel;
            return new ArrayList<>(this.connectionModifyRestrictions);

                    tunnelHandler = tunnelConfiguration.createHandler(DBWTunnel.class);
    }
        }
        return availableSharedCredentials;

        this.originalShareCredentials = sharedCredentials;
    @Override
    @Nullable
    public DBSSecretValue getSelectedSharedCredentials() {
    public void setExtensions(Map<String, Object> extensions) {
                    continue;
                if (hc == null) {
        if (registry.getDataSource(getId()) == null) {
    public synchronized boolean isSharedCredentialsSelected() {
        return addr.toString();

            try {
    private void updateDataSourceObject(boolean succeeded, DBPEvent.Action action) {
                log.debug("Error reading datasource origin", e);
            } catch (DBException e) {
                }
            }
        if (jobCount > 0) {
    }
            this.formatterProfile = new DataFormatterProfile(source.formatterProfile.getProfileName(), preferenceStore);
import java.nio.file.Paths;
        this.extensions.putAll(descriptor.extensions);
                } finally {
                }
                    log.error("Error closing tunnel", e);
        this.navigatorSettings = new DataSourceNavigatorSettings(source.navigatorSettings);
    @Override
            DBWNetworkProfile profile = registry.getNetworkProfile(
            return bootstrapAutoCommit;
        return null;
                            secretController.getPrivateSecretValue(secretId));

import java.net.URLClassLoader;
    @Override
        Set<String> handlersFromSecret = new HashSet<>(); // secrets do not store all handler configs
                    if (!detachedProcess) {
        this.description = description;
                try {
    }
            return DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(connectTime);
    public DBSObjectState getObjectState() {
            processEvents(monitor, DBPConnectionEventType.AFTER_CONNECT);
import org.jkiss.dbeaver.runtime.properties.PropertyCollector;
    }

                : RegistryMessages.dialog_connection_auth_password,

            return List.of();
                    }
    }
        releaseDataSourceUsers(monitor);
                this.resetAllSecrets();
                CommonUtils.equalObjects(this.driverSubstitution, source.driverSubstitution) &&
        this.availableSharedCredentials = null;
                setSelectedSharedCredentials(sharedCreds.getFirst());
        if (DBPDataSourceContainer.class.isAssignableFrom(adapter)) {
    }
                } catch (Throwable e) {
                    NLS.bind(RegistryMessages.dialog_data_source_synchronization_fail_local_message, getName()),
            for (Map<String, Object> handlerMap : handlerList) {
                            for (int i = 0; i < 30; i++) {
                    } catch (Exception e) {
    public boolean isExtraMetadataReadEnabled() {

            try {
        return new DataSourceVariableResolver(this, configuration);
    @NotNull

    // Copy constructor
                filterMapping.customFilters.put(FilterMapping.getFilterContainerUniqueID(parentObject), filter);
        }
            // Handlers
        return this.clientApplicationName;

 * You may obtain a copy of the License at

            }

    public void setDescription(@Nullable String description) {
            if (realOrigin != null) {
            String target = getActualConnectionConfiguration().getUrl();
            props = JSONUtils.parseMap(DBInfoUtils.SECRET_GSON, new StringReader(secretValue));
                DBWHandlerConfiguration profileConfig = activeProfile == null ? null : activeProfile.getConfiguration(hc.getHandlerDescriptor());
                        }
                for (DBSInstance instance : dataSource.getAvailableInstances()) {
                }
    @NotNull
            // Do not save secrets for hidden or temporary datasources
    @Override
    private synchronized List<DBSSecretValue> listSharedCredentialFromCache() throws DBException {
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
        @NotNull DBPDataSourceOrigin origin,

                    profile.resolveSecrets(secretController);
        if (!CommonUtils.isBitSet(
                dataSourceContainer.getRegistry().updateDataSource(dataSourceContainer);
        try {
                selectedSharedCredentialsCopy.setValue(secret);
        final DBPDataSourceProviderSynchronizable providerSynchronizable = GeneralUtils.adapt(provider, DBPDataSourceProviderSynchronizable.class);
        } catch (Exception e) {
    public DataSourceNavigatorSettings getNavigatorSettings() {
        }
import org.jkiss.dbeaver.model.impl.data.DefaultValueHandler;
                resolvedConnectionInfo.getConfigProfileSource(),
        this.origin = source.origin;
    }
    public Map<String, Object> getPropertyServerDetails() {
    DBPDataSourceContainer,
        this.clientHome = source.clientHome;
    @Override
    @Override
    }

            if (tunnelHandler != null) {
    @NotNull
    @NotNull
        long rnd = new Random().nextLong();
    @Override
        synchronized (users) {
        return null;
        return registry;





            // Primary props
    }
                        found = secret;
        }
    @Nullable

    @NotNull
                openDataSource(monitor, initialize);
        return getPreferenceStore().getBoolean(ModelPreferences.RESULT_NATIVE_NUMERIC_FORMAT);
    public String getPropertyDriver() {
                    throw e;

        return this.formatterProfile;
import org.jkiss.dbeaver.model.app.DBPProject;
    public void setObjectFilter(@NotNull Class<?> type, @Nullable DBSObject parentObject, @Nullable DBSObjectFilter filter) {

    @Override
            resolvePropertiesFromProfile();
     * returns secrets from the cache or reads them if they do not exist, may contain outdated secrets
    private DBPNativeClientLocation clientHome;
        this.sharedCredentials = sharedCredentials;

        if (connecting) {
    @Override
    }
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
    private DBPDataSourceOrigin origin;
    public SQLDialectMetadata getScriptDialect() {
        }
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
                }
                return filterMapping;

        if (clientHome == null && !CommonUtils.isEmpty(connectionInfo.getClientHomeId())) {
            return;
        } finally {
    @Override
    public boolean isProvided() {
            }
    public String getName() {
            succeeded));

        if (getConnectionConfiguration().getAuthModel() instanceof DBAAuthModelExternal<?> authModelExternal) {
        return origin;
                    if (handler.getType() == DBWHandlerType.TUNNEL) {
    }
                            }
        this.dataSource = provider.openDataSource(monitor, this);
import org.jkiss.dbeaver.model.connection.*;
            } catch (DBException e) {
        DataSourceDescriptor copy = new DataSourceDescriptor(this, forRegistry, true);
                    if (!handlersFromSecret.contains(handler.getId())) {
                }
        }
        this.tags.clear();
            for (DBWHandlerConfiguration hc : connectionInfo.getHandlers()) {
    private boolean forceUseSingleConnection;
    }
            FilterMapping filterMapping = getTypeFilterMapping(parentObject, firstMatch, testType);
        // Additional auth props
                    for (DBCExecutionContext context : instance.getAllContexts()) {

                // Possibly different product/config and origin is not available for now.
        }
            monitor.subTask("Initialize data source");


                }
                try {
        }
        if (bootstrapAutoCommit != null) {
    }
    private String name;

            log.error("Error during datasource disconnect", e);
        return originalDriver;

        this.connectionModifyRestrictions = source.connectionModifyRestrictions == null ? null : new ArrayList<>(source.connectionModifyRestrictions);
        if (!isSharedCredentials()) {
            }
            FilterMapping filterMapping = getTypeFilterMapping(parentObject, firstMatch, testType);
                            }
                    }
        }
    @Override
    public IVariableResolver getVariablesResolver(boolean actualConfig) {

    }
            canSavePassword
            } else if (!CommonUtils.isEmpty(sharedCreds)) {
import org.jkiss.dbeaver.model.struct.DBSObjectState;

 *
    }
            );
    public static boolean askForPassword(
    @Override

            log.warn("Dispose of already disposed data source");
import org.jkiss.dbeaver.model.runtime.AbstractJob;
            return false;
                connectionInfo.setAuthProperty(ap.getKey(), ap.getValue());
    }
            return true;
            return;

        return true;
    @Override
                ? null
        propsFull.put("datasource-driver", getDriver().getFullId());
    private DataSourceFolder folder;
        if (virtualModel.getId().equals(getId())) {

    @Property(order = 32, category = CATEGORY_SERVER)
                    monitor.subTask("Stop '" + job.getName() + "'");
        return connectionInfo.getConnectionType().getName();
    @Nullable
                if (handler.isEnabled()) {
                        networkHandler.setUserName(authInfo.getUserName());
    @Override
                    log.debug("Datasource user '" + user + "' is not registered in datasource '" + getName() + "'");
    @NotNull
        synchronized (users) {
        return connectionInfo.getUrl();

        this.connectTime = new Date();
    @NotNull
    public boolean equalSettings(Object obj) {
                CommonUtils.equalObjects(this.navigatorSettings, source.navigatorSettings) &&
    private boolean temporary;
        if (!CommonUtils.isEmpty(reqAuthProvider)) {
        return isManageable() && accessCheckRequired;
        this.preferenceStore.setDefaultProperties(source.preferenceStore.getDefaultProperties());
        }
                } else {
            }
        this.forceUseSingleConnection = source.forceUseSingleConnection;

        DBPConnectionConfiguration info = getActualConnectionConfiguration();
                    dataSource.shutdown(monitor);
            }

            return availableSharedCredentials;
    public String getLockPasswordHash() {
        String keyPrefix = "datasources/" + getId();
        var secret = saveToSecret();
            return filterMapping.getFilter(parentObject, firstMatch);
    @Override
            // Shared model
        return id;
                if (command.getWaitProcessTimeoutMs() >= 0) {
        }

                }
            List<Map<String, Object>> handlersConfigs = new ArrayList<>();
                                }
        return folder;

    }
     *
            try {
        }
            return false;
    private static DBPAuthInfo askCredentials(
        @NotNull DBPConnectionConfiguration connectionInfo

                new DBWNetworkHandler[]{proxyHandler} :
        // just do nothing
    }
    @Override
                    Map<String, Object> handlerProps = hc.saveToSecret();

        }
                    }
                                Thread.sleep(100);
    @NotNull
        if (isConnected()) {
            if (dataSource != null) {
        return driver.getName();
            }
            filterMapping = new FilterMapping(typeName);
    public DBPExclusiveResource getExclusiveLock() {
    @Override
        synchronized (childProcesses) {

            this.formatterProfile = null;
    public String getPropertyDriverType() {

                        new DBSSecretValue(subjectId, getSecretValueId(), "", secret));
        this.storage = setDefaultStorage ? ((DataSourceRegistry<?>) registry).getDefaultStorage() : source.storage;


        if (filterMapping == null) {
    public DBDDataFormatterProfile getDataFormatterProfile() {
                try {
                monitor.beginTask("Read auth parameters from " + originID, 1);
        return null;
        this.selectedSharedCredentials = null;
import org.jkiss.code.NotNull;


                        path = Paths.get(((URL) path).toURI());
        }
     * @param setDefaultStorage sets storage to default (in order to allow connection copy-paste with following save in default configuration)
    @Nullable
                CommonUtils.equalObjects(this.originalDriver, source.originalDriver) &&
            return;
            }
                CommonUtils.equalObjects(this.preferenceStore, source.preferenceStore) &&
    @Override
            return succeeded;
     * Saves datasource secret credentials to secret value (json)
    @Override
        return driver.getScriptDialect();
                props.put(RegistryConstants.ATTR_PASSWORD, connectionInfo.getUserPassword());
        return exclusiveLock;
            return false;
                    dataSource.initialize(monitor);
    private DBVModel virtualModel;
            }
                var hcUsername = JSONUtils.getString(handlerMap, RegistryConstants.ATTR_USER);
                }
    public DBPTransactionIsolation getActiveTransactionsIsolation() {
                // In distributed mode we reset saved password in case of null secret
    private boolean savePassword;
            if (filterMapping != null) {
            if (!authProvidedFromOrigin) {
    }
    }
    @Override
                // Run output grab job
    DBSSecretObject {
        @NotNull DBPDataSourceRegistry registry,
        this.connectionInfo = new DBPConnectionConfiguration(source.connectionInfo);
                // Update connection properties
        if (origin instanceof DataSourceOriginLazy dsoLazy) {

    public String getDescription() {
    }
    }
                    } else if (handler.getType() == DBWHandlerType.PROXY) {
    public void setSavePassword(boolean savePassword) {
    @Override
    @Nullable
    public <T> T getAdapter(@NotNull Class<T> adapter) {
        StringBuilder addr = new StringBuilder();

    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 2)
                    } else {
                    // 3. Use legacy password provider

            "'" + dataSourceContainer.getName() + RegistryMessages.dialog_connection_auth_title; //$NON-NLS-1$
    @NotNull
        if (filterMapping != null) {
                if (handlerId == null) {
    public Collection<DBPDataSourceTask> getTasks() {
            secretController.deleteObjectSecrets(this);
    @Nullable
                monitor.worked(1);


                if (authType == DBWTunnel.AuthCredentials.CREDENTIALS) {
            permission == DBPDataSourcePermission.PERMISSION_EDIT_METADATA) && connectionReadOnly) {
                        try {
                CommonUtils.equalObjects(this.formatterProfile, source.formatterProfile) &&
        this.connectionReadOnly = descriptor.connectionReadOnly;
                loadFromLegacySecret(secretController);
        return hidden || temporary;

                null
                    tunnelHandler.closeTunnel(monitor);
            }
            return DBSObjectState.ACTIVE;
        final String prompt = networkHandler != null ?
    public void loadFromSecret(@Nullable String secretValue) {
        // Test all interfaces
    }
        if (getProject().isUseSecretStorage()) {
            this.filterMap.put(fe.getKey(), new FilterMapping(fe.getValue()));
        } else {
        if (preferenceStore.getBoolean(ModelPreferences.CONNECT_USE_ENV_VARS)) {
        this.savePassword = source.savePassword;
        } else {
        @Property(viewable = true, order = 1)
    public DBDValueHandler getDefaultValueHandler() {
            this.resolvedConnectionInfo = null;
    @NotNull

    @Nullable
        }
        for (DataSourceHandlerDescriptor handlerDesc : DataSourceProviderRegistry.getInstance().getDataSourceHandlers()) {
        }
            } else {
            if (parentObject == null) {

                if (secretController != null) {
    public boolean isDetached() {
        return connect(monitor, true, reflect);
     */
    }
        return origin;

                DBRProcessDescriptor process = iter.next();
        if (secretsResolved || (force && getProject().isUseSecretStorage())) {
    public void dispose() {
        this.registry = registry;
                        } catch (InterruptedException e) {



        if (isSharedCredentials() && (!isSharedCredentialsSelected() || CommonUtils.isNotEmpty(forceSecretId))) {

    }
                    log.error("Error closing tunnel", e1);
    public Map<String, Object> getExtensions() {
            // Failed
        if (filterMapping != null) {


import org.eclipse.core.runtime.jobs.Job;
    @Override
            return false;
                    monitor.worked(1);
                secretController.setPrivateSecretValue(this, new DBSSecretValue(getSecretValueId(), "", secret));
            // Datasource not saved yet - secrets are unavailable
    @Nullable
                );
        if (!CommonUtils.isEmpty(handlerList)) {
        this.forceUseSingleConnection = driver.isSingleConnection();

    @Override
    DBPStatefulObject,
        return driver.getId() + "-" + Long.toHexString(System.currentTimeMillis()) + "-" + Long.toHexString(rnd);
            return;

    // secrets resolved from secret controller and contains db creds (we may not have db creds in the case when we store only ssh)
        synchronized (users) {
                log.debug(processDescriptor.getName() + " result code: " + resultCode);
    }
import org.eclipse.core.runtime.Status;
                        log.debug("Can't determine isolation level", e);
    @NotNull
        }
            if (isSharedCredentials()) {
                        log.debug("Cannot set auto-commit flag: " + e.getMessage());
    private String lastConnectionError;
import org.jkiss.dbeaver.model.impl.SimpleExclusiveLock;
                } finally {
                this.origin = realOrigin;
                    if (handlerCfg.isEnabled()) {
            return true;
        this.origin = origin;
                    }
    }
        try {


            monitor.beginTask("Connect to " + target, tunnelConfiguration != null ? 3 : 2);
    }
        return manageable;
        if (this.formatterProfile == null) {
                new DBWNetworkHandler[]{proxyHandler, tunnelHandler};
        } else {
            // Try to find using interfaces and superclasses
            secretController.getSupportedFeatures(),
            return new DBWNetworkHandler[0];
    private volatile boolean disposed = false;
        }
    @Nullable
                    }
            processEvents(monitor, DBPConnectionEventType.BEFORE_DISCONNECT);

            DBPDataSourceOrigin realOrigin;
        this.manageable = storage.isDefault();
import org.jkiss.dbeaver.model.access.DBAAuthModelExternal;
    public boolean isUseNativeNumericFormat() {
            for (DBWHandlerConfiguration hc : connectionInfo.getHandlers()) {
import org.jkiss.dbeaver.model.access.DBAAuthCredentials;
                            // Wait for 3 seconds

                    log.debug("Error closing failed connection", e1);
     * this method always forcibly updates available secrets and should always return actual secrets,
        this.navigatorSettings = new DataSourceNavigatorSettings(DataSourceNavigatorSettings.getDefaultSettings());
                            resolvedConnectionInfo = tunnelHandler.initializeHandler(monitor, tunnelConfiguration, resolvedConnectionInfo);
        return null;
            }
    @Nullable
                realOrigin = null;
import org.jkiss.dbeaver.registry.formatter.DataFormatterProfile;
            this.context = context;
    public void setConnectionReadOnly(boolean connectionReadOnly) {
                setSelectedSharedCredentials(availableSharedCredentials.getFirst());
                } catch (Throwable e) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    @Property(viewable = true, order = 20, category = CATEGORY_DRIVER)
                    } catch (Exception ignored) {
        }
        }
                    monitor.worked(1);
                // Backward compatibility
    private transient DBWNetworkHandler proxyHandler;
    @Nullable
    }
            filterMap.put(typeName, filterMapping);

import org.eclipse.osgi.util.NLS;
            }
        return copy;
    void setLockPasswordHash(@Nullable String lockPasswordHash) {
        return disconnect(monitor, true);
 *
                DBCTransactionManager txnManager = DBUtils.getTransactionManager(DBUtils.getDefaultContext(defaultInstance, false));
    public String getConnectionError() {
        if (filterMapping == null) {
    }
import org.jkiss.dbeaver.model.meta.PropertyLength;
        }
            log.debug("Can't connect - already connected");
                    Object path = urls[urlIndex];
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
import org.jkiss.dbeaver.model.runtime.DBRShellCommand;
    @NotNull
                            String output = processDescriptor.dumpErrors();
    private void processEvents(DBRProgressMonitor monitor, DBPConnectionEventType eventType) throws DBException {
        for (Class<?> testType = type; testType != null; testType = testType.getSuperclass()) {
        this.lockPasswordHash = source.lockPasswordHash;
                    if (forceSecretId.equals(secret.getSubjectId())) {
    }
    public boolean isConnecting() {
    @Override
        if (filterMap.isEmpty()) {
        }
                } catch (Exception e1) {
        //private secret contains handlers config, shared - not
                CommonUtils.equalObjects(this.forceUseSingleConnection, source.forceUseSingleConnection) &&
    }
    @Override
                    try {
    public boolean isUseNativeDateTimeFormat() {
    @Nullable
        }
                }
    }
            }
                            DBExecUtils.finishContextInitiation(this);
    }
