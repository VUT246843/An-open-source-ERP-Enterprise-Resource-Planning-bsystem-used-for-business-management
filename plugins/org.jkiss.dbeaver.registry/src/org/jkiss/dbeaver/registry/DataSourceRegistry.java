            }
    // Saved filters
                if (storage instanceof DataSourceFileStorage && ((DataSourceFileStorage) storage).isLegacy()) {
        @Nullable Collection<String> dataSourceIds,


                Files.createFile(configPath);
        for (DBAAuthProfile ap : getAllAuthProfiles()) {
    @Override
        return new DataSourceDescriptor(this, dbpDataSourceConfigurationStorage, origin, id, originalDriver,
                return;
        return parseResults;
    @NotNull
        DBPDataSourceProviderRegistry dspRegistry = DBWorkbench.getPlatform().getDataSourceProviderRegistry();
                } else {
import org.jkiss.dbeaver.model.net.DBWNetworkProfileProvider;
                    return null;
    }
        }
    ////////////////////////////////////////////////////
        synchronized (dataSources) {

            return Status.OK_STATUS;
    public DBAAuthProfile getAuthProfile(@NotNull String id) {
    }

    protected void persistDataSourceUpdate(@NotNull DBPDataSourceContainer container) {
                DBSSecretController secretController = DBSSecretController.getProjectSecretController(getProject());
        }
            }

            parent = folder;
                    // It is never canceled because we call DisconnectTask on shutdown when all tasks are canceled
import org.jkiss.dbeaver.model.secret.DBSSecretController;
        }
        synchronized (dataSourceListeners) {
    ////////////////////////////////////////////////////
import org.jkiss.dbeaver.model.access.DBAAuthProfile;
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
            DataSourceProviderRegistry.getInstance().fireRegistryChange(this, true);
    public void updateSavedFilter(@NotNull DBSObjectFilter filter) {
    public void checkForErrors() throws DBException {
import java.io.IOException;
                throw new IllegalStateException("Unable to create a default storage in registry " + this, e);
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
 * Unless required by applicable law or agreed to in writing, software
                addDataSourceFolder((DataSourceFolder) folder);
        boolean disconnected;
        for (DBPDataSourceContainer ds : getDataSources()) {
 *
                null);
    }
                        configurationManager,
        } catch (Exception ex) {
            return;
    public DataSourceRegistry(
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
        try {
        }
                @Override

    ////////////////////////////////////////////////////
    private final List<DBWNetworkProfile> networkProfiles = new ArrayList<>();
    }
                }
        try {
                    return dsd;

                }
        addDataSourceToList(descriptor);
        descriptor.persistSecretIfNeeded(true, true);
            return;
import org.jkiss.code.Nullable;
 *
        synchronized (dataSources) {
        }
        synchronized (dataSources) {
        final DataSourceDescriptor descriptor = (DataSourceDescriptor) dataSource;
            } catch (DBException e) {
            this.dataSources.put(descriptor.getId(), descriptor);
        dsCopy.sort((o1, o2) -> CommonUtils.notNull(o1.getName(), o1.getId()).compareToIgnoreCase(
            CommonUtils.notNull(o2.getName(), o2.getId())));

    }
                secretController.flushChanges();
        }
    }
            descriptor.persistSecretIfNeeded(true, false);
        }
    @Override

        DBPEvent.Action action,
     * @param profiles - profile collection

            return;

        saveDataSources();
import java.util.function.Function;
    }
        synchronized (authProfiles) {
            return Status.OK_STATUS;
            dataSourceEvents.add(event);
    ) {
                .collect(Collectors.toMap(DBAAuthProfile::getProfileId, Function.identity())));
            } finally {

        final T descriptor = (T) dataSource;
            }

                return filter;
        @NotNull List<DBPDataSourceConfigurationStorage> storages,
        var parentFolder = parent == null ? null : getFolder(parent.toString().replace("\\", "/"));
    public boolean hasError() {
        for (DBSObjectFilter filter : savedFilters) {
        return networkProfiles;
        @NotNull DataSourceConfigurationManager manager,
                        monitor,

            } else {

    }
        for (DBPDataSourceFolder folder : folders) {
    }
    }
    public void flushConfig() {
    protected void persistDataFolderDelete(@NotNull String folderPath, boolean dropContents) {
    @NotNull
    @Override
        // Remove secrets
            }
                return profileProvider.getNetworkProfile(source, name);
                                .flushChanges();
    @Override
import java.nio.file.Files;

        dataSourceFolders.remove(folderImpl);
    @Override
    }
        this.lastError = null;
                        parseResults.removedFolders.add(folder);
        ConfigSaver() {
    @Override
    }
    }
        boolean configChanged = false;
        for (DBPDataSourceConfigurationStorage cfgStorage : storages) {
        notifyDataSourceListeners(new DBPEvent(action, object));
        for (DBPDataSourceContainer ds : getDataSources()) {
        protected IStatus run(IProgressMonitor monitor) {
    @Override
        synchronized (dataSources) {
    // Data sources
import org.jkiss.dbeaver.model.connection.DBPAuthModelDescriptor;
                    folder = createFolder(parent, name);


    @Override
            for (DataSourceDescriptor dataSource : dataSources.values()) {

    private volatile ConfigSaver configSaver;

                        !ds.isProvided() && !ds.isExternallyProvided() && !ds.isDetached())
        @NotNull DBPDriver driver,
 *     http://www.apache.org/licenses/LICENSE-2.0

    public String toString() {
    @NotNull
        synchronized (networkProfiles) {
    }
            if (project.isOpen() && project.isRegistryLoaded()) {
        for (DataSourceFolder folder : dataSourceFolders) {
            return authProfiles.values().stream().filter(p -> {
    }
        }
                persistDataSourceUpdate(dataSource);
        if (!project.isOpen() || project.isInMemory()) {
        for (DataSourceFolder child : folderImpl.getChildren()) {
            if (results != null) {
    }
                if (dataSource.isConnected()) {
    public void removeNetworkProfile(@NotNull DBWNetworkProfile profile) {
            }
        @NotNull DBPDataSourceConfigurationStorage dataSourceStorage,
    protected DataSourceSerializer<T> createModernSerializer() {
    void addSavedFilter(DBSObjectFilter filter) {
import org.jkiss.dbeaver.Log;
                    return dsd;
                        && !DataSourceUtils.isFolderHasTemporaryDataSources(folder)
            return;
        }
    }
            }
import org.jkiss.dbeaver.model.connection.DBPDriver;

        }
        }
        saveDataSources();
        } catch (DBException e) {
    public DBPDataSourceContainer createDataSource(

                }
        }
                saveDataSources(monitor);
            if (dataSourceListeners.isEmpty()) {
            }
                if (dsd.getDataSource() == dataSource) {
        if (!CommonUtils.equalObjects(folder.getName(), newName)) {
        return savedFilters;
        this.preferenceStore = preferenceStore;
}

            for (T ds : dataSources.values()) {
                getDefaultStorage(),
        if (!hasConnections) {
        Throwable error = this.lastError;
        updateProjectNature();
            addDataSource(dataSource);

    public List<T> getDataSources() {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
                    ds.dispose();
import org.jkiss.dbeaver.model.runtime.*;


    }
    /**
        }
                    DataSourceSerializer<T> serializer = createModernSerializer();
            for (DBPDataSourceConfigurationStorage storage : storages) {
        }
    public void updateDataSource(@NotNull DBPDataSourceContainer dataSource) throws DBException {
                    break;
    private final List<DataSourceFolder> dataSourceFolders = new ArrayList<>();
            dsCopy = CommonUtils.copyList(dataSources.values());
    }
            }
                }
    @Nullable
    public boolean removeDataSourceListener(@NotNull DBPEventListener listener) {
                    // Legacy storage. We must save it in the modern format
        }
    @Nullable
        DataSourceConfigurationManager configurationManager,
            authProfiles.remove(profile.getProfileId());
        saveInProgress = true;
    public DBACredentialsProvider getAuthCredentialsProvider() {
                    ds.setFolder(parent);
    @Override
    ////////////////////////////////////////////////////
        } else {
    public void dispose() {
//        }
        }
    }
        public EventProcessJob() {
    @Override
                .findFirst().orElse(null);
    public List<DataSourceFolder> getAllFolders() {
        }
                lastError = null;
                for (DBPDataSourceFolder folder : parseResults.removedFolders) {
        }
    }
            setSystem(true);
        persistDataFolderDelete(folderPath, dropContents);
            for (DBPDataSourceContainer ds : parseResults.addedDataSources) {
            return networkProfiles.stream()
    public void saveConfigurationToManager(
        // Dispose and clear all descriptors

        return configChanged;
    private static final long DISCONNECT_ALL_TIMEOUT = 5000;

        }
        } else {
            }
        return new DataSourceDescriptor(this, id, driver, connConfig);
        updateProjectNature();
    @Override


            authProfiles.put(profile.getProfileId(), profile);
    public void moveFolder(@NotNull String oldPath, @NotNull String newPath) throws DBException {
    private final Map<String, DBAAuthProfile> authProfiles = new LinkedHashMap<>();
                        lastError = null;

     * Set new collection of profiles.
    private final EventProcessJob eventsJob = new EventProcessJob();
        // Clear filters before reload
            }
                DBPDataSourceConfigurationStorage defaultStorage = new DataSourceFileStorage(configPath, false, true);
                fireDataSourceEvent(DBPEvent.Action.OBJECT_ADD, ds);
        return folder;
            }
                            log.error("Can't shutdown data source '" + dataSource.getName() + "'", ex);
    @Override
        synchronized (authProfiles) {
                try {
    ) {
import org.jkiss.dbeaver.model.impl.app.BaseProjectImpl;

    private void closeConnections(long waitTime) {
        }
            }
    }
            try {
    @Override
        @NotNull String id,
        this.project = project;
        }
                    if (!parseResults.addedFolders.contains(folder) && !parseResults.updatedFolders.contains(folder)) {
        synchronized (dataSourceListeners) {
                if (!configurationManager.isSecure()) {
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

        this.configurationManager = configurationManager;

                    if (dataSource.isConnected()) {
        return dsCopy;
            }
        boolean isLoaded = loadDataSources(true) != null;

        }
    }
                monitor,

                    log.error("Error saving datasources configuration", ex);

            }
    }
import java.util.*;
        // and we don't want to lose their config just after restart

    private final List<DBSObjectFilter> savedFilters = new ArrayList<>();
        for (String name : path.split("/")) {
        // Use async config saver to avoid too frequent configuration re-save during some massive configuration update
        Throwable lastError = getLastError();
    }
    }
        networkProfiles.add(profile);
            dataSource.dispose();
        @Override
    @Override
        }
        if (!descriptor.isDetached()) {
    @Nullable
            authProfiles.clear();
            }
                .filter(profile -> CommonUtils.equalObjects(profile.getProfileName(), name))
            authProfiles.putAll(profiles.stream()
            true,
       return loadDataSources(
                if (lastError != null) {
    public void addDataSourceListener(@NotNull DBPEventListener listener) {
        }
import java.util.function.Predicate;

     * Flushes all pending data source events. This is a blocking operation.
        if (!isMultiUser()) {
    @NotNull
    @Nullable
    public static List<DBPDataSourceContainer> getAllDataSources() {

    // - doesn't register listeners
 */
    }
                }
                dataSourceDescriptor.dispose();
            return authProfiles.get(id);


            }
        }
                    log.warn("Folder '" + path + "' not found");
    @Override
            for (DataSourceDescriptor dataSourceDescriptor : this.dataSources.values()) {
                fireDataSourceEvent(DBPEvent.Action.OBJECT_UPDATE, ds);
    }
        for (int i = 0; i < savedFilters.size(); i++) {
    public void setAuthProfiles(@NotNull Collection<DBAAuthProfile> profiles) {
    @NotNull
        }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        return project.getName() + " (" + getClass().getSimpleName() + ")";
        for (DBPEvent event : events) {
            if (CommonUtils.equalObjects(savedFilters.get(i).getName(), filterName)) {

import org.jkiss.dbeaver.utils.DataSourceUtils;
    }
        synchronized (authProfiles) {
                        .flushChanges();
        DBSObject object) {
            DataSourceProviderRegistry.getInstance().fireRegistryChange(this, false);
        }

        dataSourceFolders.add(folder);
    public DBPDataSourceContainer createDataSource(
        }
    public DBPDataSourceFolder getFolder(@NotNull String path) {
    @Override
                            DBSSecretController
            if (CommonUtils.equalObjects(filter.getName(), name)) {
        }
        }
                }

                    try {


        }
        for (DBPProject project : workspace.getProjects()) {
            throw new DBException("Cannot move folder inside itself");
    }
    @Override
    public T getDataSource(@NotNull String id) {
                List<T> localDataSources = getDataSources(storage);
    private final Map<String, T> dataSources = new LinkedHashMap<>();
        }
        final DataSourceDescriptor descriptor = (DataSourceDescriptor) dataSource;
    // Multi-user registry:
                java.nio.file.Path configPath = this.getProject().getMetadataFolder(false).resolve(MODERN_CONFIG_FILE_NAME);
        if (project instanceof BaseProjectImpl bp) {
        // Parse datasources
    private class EventProcessJob extends Job {
        configSaver.schedule(100);
    @Nullable
            configSaver = new ConfigSaver();
            descriptor.removeSecretIfNeeded();
    @NotNull
    /**
import java.nio.file.Path;
                rootFolders.add(folder);
                        } catch (Exception ex) {
//        if (getProjectNode().isOpen()) {
    private DataSourceFolder findRootFolder(String name) {
                return defaultStorage;
    public DataSourceFolder addFolder(@Nullable DBPDataSourceFolder parent, @NotNull String name) {
        if (project.isInMemory()) {
                savedFilters.set(i, filterCopy);
        savedFilters.add(filterCopy);
                    result.add(ds);
        // Reflect changes
        if (project.isInMemory()) {
    ) {
    @Override
    public void persistSecrets(DBSSecretController secretController) throws DBException {
            this.fireDataSourceEvent(DBPEvent.Action.OBJECT_UPDATE, dataSource);

import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
    }
            for (DBPDataSourceContainer ds : parseResults.updatedDataSources) {
                if (storage.isDefault()) {
        DBPDataSourceConfigurationStorage dbpDataSourceConfigurationStorage,
            this.fireDataSourceEvent(DBPEvent.Action.OBJECT_REMOVE, dataSource);
    @Override
            secretController.flushChanges();
import org.jkiss.dbeaver.model.virtual.DBVModel;
        if (!RuntimeUtils.runTask(disconnectTask, "Disconnect from data sources", waitTime)) {
                } catch (Exception ex) {
        boolean purgeUntouched
        List<T> dsCopy;
        closeConnections(DISCONNECT_ALL_TIMEOUT);
        }
    public DataSourceConfigurationManager getConfigurationManager() {
            while (folder != null) {
        @Nullable Predicate<DBPDataSourceContainer> filter
            if (ds.getFolder() == folder) {
                }
            events = dataSourceEvents.toArray(new DBPEvent[0]);

        savedFilters.clear();
    }
        return null;

                        try {
            } catch (IOException e) {
        return result;
    @NotNull
        @NotNull String id,
            if (CommonUtils.equalObjects(savedFilters.get(i).getName(), filter.getName())) {
            false);
import org.jkiss.dbeaver.model.*;
            }
            super("Notify datasource events");
        List<DataSourceFolder> rootFolders = new ArrayList<>();
            DBWorkbench.getPlatformUI().showError("Secret remove error", "Error removing network profile credentials from secret storage", e);

        DriverDescriptor originalDriver,
            for (DBPDataSourceFolder folder : parseResults.addedFolders) {
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderRegistry;

                addDataSourceToList(ds);
            serializer.saveDataSources(
        saveDataSources();
    ) {
                    lastError = ex;
    public void addDataSource(@NotNull DBPDataSourceContainer dataSource) throws DBException {

        }
            ap.resolveSecrets(secretController);
            dataSourceListeners.add(listener);
            flushDataSourceEvents();
    public List<DBAAuthProfile> getApplicableAuthProfiles(@Nullable DBPDriver driver) {
        }
            this.dataSourceListeners.clear();
        }
        persistDataSourceUpdate(container);
        this.authCredentialsProvider = authCredentialsProvider;
        return authCredentialsProvider;
        DBPWorkspace workspace = DBWorkbench.getPlatform().getWorkspace();
            !CommonUtils.equalObjects(ds.getConnectionConfiguration().getConfigProfileName(), profile.getProfileName()));
            if (!storages.contains(storage) && !descriptor.isDetached()) {

            configurationManager.getConfigurationStorages(),
            // In headless mode we process events immediately
    public void removeSavedFilter(@NotNull String filterName) {
    }
                i++;
            configurationManager,
    @NotNull
        for (int i = 0; i < savedFilters.size(); ) {
            }
        }

                    monitor.worked(1);
                    {
        if (!CommonUtils.isEmpty(source)) {
        return createFolder(parent, name);
            configChanged = serializer.parseDataSources(storage, manager, parseResults, dataSourceIds);
     */
            DBPDataSourceConfigurationStorage storage = descriptor.getStorage();
            for (DBPDataSourceConfigurationStorage storage : storages) {

    }
 * See the License for the specific language governing permissions and
            .filter(DBPDataSourceContainer::isTemporary)
        }
    private volatile boolean saveInProgress = false;
        }
        return preferenceStore;
    @Override
            ds.resolveSecrets(secretController);
            log.warn("Some data source connections wasn't closed on shutdown in " + waitTime + "ms. Probably network timeout occurred.");
    public void removeDataSourceFromList(@NotNull DBPDataSourceContainer dataSource) {
            configurationManager.getConfigurationStorages(),
    }
                return root;
        }
    ) {
        // Disconnect in 5 seconds or die
            true);
    }
    ) {
    @Override
                for (DataSourceFolder folder : dataSourceFolders) {
                    this.fireDataSourceEvent(DBPEvent.Action.OBJECT_REMOVE, ds);
            }
        @NotNull DBRProgressMonitor monitor,
    public DBPProject getProject() {
import java.util.stream.Collectors;
            List<DBPDataSourceConfigurationStorage> storages = getConfigurationManager().getConfigurationStorages();
import org.jkiss.dbeaver.DBException;
    DataSourceFolder findFolderByPath(String path, boolean create, DataSourceParseResults results) {
                        }

        return newDS;
    private DBACredentialsProvider authCredentialsProvider;
            return null;
                }
import org.eclipse.core.runtime.IProgressMonitor;
            return null;

        }
            DataSourceSerializer<T> serializer = createModernSerializer();


    @Nullable
        return new DataSourceSerializerModern<>(this);
    public T getDataSource(@NotNull DBPDataSource dataSource) {
        }
        boolean refresh,
        return this.lastError != null;
        return new DataSourceDescriptor(this, dataSourceStorage, origin, id, driver, configuration);
import org.jkiss.utils.CommonUtils;
        loadDataSources(
            }

import org.jkiss.dbeaver.model.access.DBACredentialsProvider;
    }
            }
            log.error("Error deleting old secrets", e);
import org.jkiss.dbeaver.model.net.DBWNetworkProfile;
        }
                dsSnapshot = CommonUtils.copyList(dataSources.values());
            for (T dsd : dataSources.values()) {
        }
    @Nullable
            saveInProgress = false;
    }
    public DBPDataSourceContainer createDataSource(@NotNull DBPDataSourceContainer source) {
                this.storages.add(defaultStorage);
        @NotNull DBPConnectionConfiguration configuration
                        log.error("Error saving secured preferences", e);
    private final List<DBPEvent> dataSourceEvents = new ArrayList<>();

        synchronized (dataSources) {
                localDataSources);
        if (parent != null) {
        }
    private final DataSourceConfigurationManager configurationManager;
    }
        @NotNull DBPDataSourceConfigurationStorage storage,
            if (!descriptor.isDetached()) {
/*
        if (lastError != null) {
    // -
    @Override
            try {
                    null);
        try {
            persistDataSourceDelete(dataSource);
    @NotNull
        }
    @Override

            for (T dsd : dataSources.values()) {


                    }
    }
    public Set<DBPDataSourceFolder> getTemporaryFolders() {
    public void flushDataSourceEvents() {
        final DBPEvent[] events;
        @NotNull DataSourceParseResults parseResults
//            flushConfig();
                    profile.getSecretKeyId(),
        // Do not save config on shutdown.
    @NotNull
            dataSourceEvents.clear();
import org.jkiss.code.NotNull;
        var newName = result.getFileName().toString();
                    }
        List<T> result = new ArrayList<>();
            }
                if (CommonUtils.equalObjects(ds.getStorage(), storage)) {
            }
        newDS.setId(DataSourceDescriptor.generateNewId(source.getDriver()));
    @Override
     *
        }
        synchronized (dataSources) {
        DataSourceFolder parent = null;
        return error;
                        .getProjectSecretController(project)
        folder.setParent(parentFolder);

        synchronized (authProfiles) {
    }
                    this.storages.add(storage);
    @NotNull
    }
        try {
        List<T> dsCopy;
        for (DBWNetworkProfile np : getNetworkProfiles()) {
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
        final DataSourceFolder folderImpl = (DataSourceFolder) folder;
    }
            !CommonUtils.equalObjects(ds.getConnectionConfiguration().getConfigProfileSource(), profile.getProfileSource()) ||
            log.error("Error loading datasource config from " + storage.getStorageId(), ex);
            if (folder == null) {
                    hasConnections = true;
    }
            }
    public void updateNetworkProfile(@NotNull DBWNetworkProfile profile) {

        var result = Path.of(newPath);
        Set<DBPDataSourceFolder> result = new LinkedHashSet<>();
    @Override
    @Override
            lastError = ex;
    }
        return result;
            }
                    dataSourceListeners.stream()
    private static final Log log = Log.getLog(DataSourceRegistry.class);

    @Override
        synchronized (dataSources) {

            }
    public List<DataSourceFolder> getRootFolders() {


            .map(DBPDataSourceContainer::getFolder)
        if (!isMultiUser() && isLoaded) {
    ////////////////////////////////////////////////////
package org.jkiss.dbeaver.registry;
        @NotNull DBPDataSourceOrigin origin,
        synchronized (dataSourceListeners) {
    }
    @Override
                listener.handleDataSourceEvent(event);
            dataSourceIds,
    public DBPDataSourceContainer createDataSource(
    DBPDataSourceConfigurationStorage getDefaultStorage() {
                folder = folder.getParent();
    }
    private DataSourceParseResults loadDataSources(boolean refresh) {
            np.persistSecrets(secretController);

    }


    @Override
            } catch (Throwable e) {
            .collect(Collectors.toSet());
            null,
        } finally {
    public void saveDataSources() {
    @Override
                        storage,
        return dataSourceFolders;
        synchronized (dataSources) {
                for (DataSourceDescriptor ds : dataSources.values()) {
    public void resolveSecrets(DBSSecretController secretController) throws DBException {
    }
    @Override
        } catch (DBException e) {

    public void notifyDataSourceListeners(@NotNull final DBPEvent event) {
        synchronized (authProfiles) {
        DriverDescriptor substitutedDriver,
        }
 * You may obtain a copy of the License at
    public void setAuthCredentialsProvider(DBACredentialsProvider authCredentialsProvider) {
            }
                        lastError = e;
    @Override
                    break;
    public T findDataSourceByName(String name) {

        return dsCopy;
        }

            return;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
            DataSourceFolder folder = parent == null ? findRootFolder(name) : parent.getChild(name);
        }
            try {
    @Override
        if (dataSourceFolders.contains(folder)) {
    }
            if (loadDataSources(cfgStorage, manager, dataSourceIds, parseResults)) {


        }
            ds.persistSecrets(secretController);

        if (getProject().isUseSecretStorage()) {
        synchronized (dataSources) {
                }
            localDataSources.removeIf(filter.negate());
        boolean hasConnections = false;
                secretController.setPrivateSecretValue(
        return result;
    @NotNull


    @Override
    protected DataSourceFolder createFolder(DBPDataSourceFolder parent, String name) {
    @Override
        DBSObjectFilter filterCopy = new DBSObjectFilter(filter);
        final DBPDataSourceFolder parent = folder.getParent();
        if (folder == parentFolder) {
            log.warn("no default storage in registry " + this);
                                .getProjectSecretController(project)
    public void updateAuthProfile(@NotNull DBAAuthProfile profile) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
        }
                }
        return parent;
        }
            eventsJob.schedule(20);
        @Nullable Collection<String> dataSourceIds,
        }
    private final DBPProject project;
    public List<DBWNetworkProfile> getNetworkProfiles() {
                return;
                    ) {
            folder.setName(newName);
                    } catch (Throwable e) {
    }
                    return storage;
                            // Disconnect
            List<T> dsSnapshot;
            }

        synchronized (dataSources) {
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.app.DBPWorkspace;

        }

            synchronized (DataSourceRegistry.this) {
import org.jkiss.dbeaver.model.app.DBPProject;
                }
        } catch (Exception ex) {
        saveDataSources(new VoidProgressMonitor());
        for (DataSourceDescriptor ds : dataSources.values()) {
                result.add(folder);
    @NotNull
 * limitations under the License.
            };


        @NotNull DataSourceConfigurationManager manager,
                        .map(l -> l.getClass().getName() + ":" + l).collect(Collectors.joining(",")));
                for (DataSourceDescriptor dataSource : dsSnapshot) {
    void addDataSourceFolder(DataSourceFolder folder) {
    // Config profiles
            this.dataSources.remove(dataSource.getId());
    private final DBPPreferenceStore preferenceStore;
        List<DBPDataSourceContainer> result = new ArrayList<>();
import org.eclipse.core.runtime.Status;
                throw (DBException) lastError;


    private void updateProjectNature() {
    }
        }
                serializer = new DataSourceSerializerLegacy<>(this);
            synchronized (dataSources) {
            lastError = null;
            this.loadDataSources(true);
    }
    }
            removeFolder(child, dropContents);
    }
        for (DBAAuthProfile ap : getAllAuthProfiles()) {
    @Override
        public void run(DBRProgressMonitor monitor) {
        DBPDataSourceOrigin origin,
                profile.getSecretKeyId(),
        DataSourceParseResults parseResults = new DataSourceParseResults();
            super("Datasource configuration save");
            }).collect(Collectors.toList());

    }
    public void refreshConfig() {
    protected void persistDataSourceDelete(@NotNull DBPDataSourceContainer container) {
        try {
    public DataSourceRegistry(DBPProject project) {
    }
    private final List<DBPEventListener> dataSourceListeners = new ArrayList<>();
            } else {

        return dataSources.size();
    public Throwable getLastError() {
    }
                            disconnected = dataSource.disconnect(monitor);
        }
    }
        }
        }
                    ((DataSourceFileStorage) storage).convertToModern(project);
    @Override
                log.warn("Some data source listeners are still registered: " +
    }
    @NotNull
            dsCopy = CommonUtils.copyList(dataSources.values());
    public DBPDataSourceContainer createDataSource(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connConfig) {
import org.eclipse.core.runtime.jobs.Job;
                    if (!parseResults.addedFolders.contains(folder) && !parseResults.updatedFolders.contains(folder)
            return dataSourceListeners.remove(listener);
    @Override
            if (lastError instanceof DBException) {
        return project;
    public List<DBAAuthProfile> getAllAuthProfiles() {
        @NotNull DBPPreferenceStore preferenceStore
                            monitor.subTask("Disconnect from [" + dataSource.getName() + "]");
    public void removeDataSource(@NotNull DBPDataSourceContainer dataSource) {
                        localDataSources);
        return configurationManager;
        dsCopy.removeIf(ds ->
    @Override
            listeners = dataSourceListeners.toArray(new DBPEventListener[0]);
    @Override
    }
    public int getDataSourceCount() {
        @NotNull
        DataSourceDescriptor newDS = new DataSourceDescriptor((DataSourceDescriptor) source, this);
    }
                }
import org.eclipse.core.runtime.NullProgressMonitor;
    // Data sources
    }
            lastError = ex;
        @NotNull DBPProject project,
        return new DataSourceDescriptor(this, DataSourceDescriptor.generateNewId(driver), driver, connConfig);
                        }
        String id,
        var parent = result.getParent();
                DBPAuthModelDescriptor authModel = dspRegistry.getAuthModel(p.getAuthModelId());
        return null;
    public List<? extends DBPDataSourceContainer> getDataSourcesByProfile(@NotNull DBWNetworkProfile profile) {
    ) {
    }
                if (!dsd.isHidden() && dsd.getName().equals(name)) {
                    }
    }
                }
                if (!create) {
        }
        DataSourceFolder folder = new DataSourceFolder(this, (DataSourceFolder) parent, name, null);
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        synchronized (dataSourceListeners) {
            }
            return dataSources.get(id);
    private class DisconnectTask implements DBRRunnableWithProgress {
        savedFilters.add(filter);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                    }
            if (CommonUtils.equalObjects(networkProfiles.get(i).getProfileName(), profile.getProfileName())) {
        final String folderPath = folder.getFolderPath();
            try {
        notifyDataSourceListeners(new DBPEvent(DBPEvent.Action.OBJECT_ADD, descriptor, true));
        }
            removeDataSourceListener(modelChangeListener);
        final DBPEventListener[] listeners;
                    return storage;
                networkProfiles.set(i, profile);
        }
            refresh,
    public void removeAuthProfile(@NotNull DBAAuthProfile profile) {
    public void addDataSourceToList(@NotNull DBPDataSourceContainer dataSource) {
        if (!(dataSource instanceof DataSourceDescriptor descriptor)) {
        }
    public List<DBSObjectFilter> getSavedFilters() {
    private class ConfigSaver extends AbstractJob {


        final DisconnectTask disconnectTask = new DisconnectTask();
    DataSourcePersistentRegistry, DBPDataSourceRegistryCache {
        } finally {
        // Modern way - search json configs in metadata folder
            log.error("Error saving datasources configuration", ex);
            return new ArrayList<>(authProfiles.values());
        if (refresh) {

import org.jkiss.dbeaver.model.app.DBPDataSourceRegistryCache;
    @Override
    @Override
        removeDataSourceFromList(descriptor);
            } else {
            if (profileProvider != null) {
        if (!descriptor.isDetached()) {
    }
                    return false;
    @NotNull
 * DBeaver - Universal Database Manager
        DBPConnectionConfiguration dbpConnectionConfiguration
            folderImpl.setParent(null);

                if (storage.isDefault()) {
        List<T> localDataSources = getDataSources();
    protected Throwable lastError;
    @NotNull
    @NotNull
    }
    @Override
        return rootFolders;
    }
        for (int i = 0; i < networkProfiles.size(); i++) {
            if (storage instanceof DataSourceFileStorage && ((DataSourceFileStorage) storage).isLegacy()) {
    }

                    if (!parseResults.addedDataSources.contains(ds) && !parseResults.updatedDataSources.contains(ds) &&
        }
            }
                }
                        dataSourceFolders.remove(folder);

    }
            DBSSecretController secretController = DBSSecretController.getProjectSecretController(getProject());

                    DBSSecretController
        synchronized (storages) {
        }
    private void fireDataSourceEvent(
            bp.updateProjectNature();

                        if (project.isUseSecretStorage() && !configurationManager.isSecure()) {
            secretController.setPrivateSecretValue(
        }
            if (root.getName().equals(name)) {

            }
            eventsJob.run(new NullProgressMonitor());
    private final List<DBPDataSourceConfigurationStorage> storages = new ArrayList<>();
        if (!dataSources.containsKey(dataSource.getId())) {
                result.addAll(project.getDataSourceRegistry().getDataSources());

    public void removeFolder(@NotNull DBPDataSourceFolder folder, boolean dropContents) {
        }
                serializer = createModernSerializer();
            return;
    protected void saveDataSources(DBRProgressMonitor monitor) {
    public DataSourceParseResults loadDataSources(
    private List<T> getDataSources(DBPDataSourceConfigurationStorage storage) {
                DBWorkbench.getPlatformUI().showError("Secret remove error", "Error removing auth profile credentials from secret storage", e);
    @Override
            throw new DBException(lastError.getMessage(), lastError.getCause());
    public DBPPreferenceStore getPreferenceStore() {
                public boolean isCanceled() {
    @Override

        return null;
    public DBWNetworkProfile getNetworkProfile(@Nullable String source, @NotNull String name) {
    }
    protected void persistDataSourceCreate(@NotNull DBPDataSourceContainer container) {
        return DBWorkbench.getPlatform().getApplication().isMultiuser();
    }
    }
    }
            np.resolveSecrets(secretController);
    protected boolean loadDataSources(
            }
        return findFolderByPath(path, true, null);
                results.updatedFolders.add(parent);
        synchronized (dataSourceListeners) {
                    }
        if (filter != null) {
    }
        if (saveInProgress) {
    private final DBVModel.ModelChangeListener modelChangeListener = new DBVModel.ModelChangeListener();
                        parseResults.removedDataSources.add(ds);
        Set<DBPDataSourceFolder> folders = getDataSources().stream()


            monitor.beginTask("Disconnect all databases", dsSnapshot.size());
            }
        synchronized (authProfiles) {
        }
        if (configSaver == null) {
                } else {
        for (DBWNetworkProfile np : getNetworkProfiles()) {
        @Override
    }
public class DataSourceRegistry<T extends DataSourceDescriptor> implements DBPDataSourceRegistry,
        DBPDataSourceFolder folder = getFolder(oldPath);

            if (folder.getParent() == null) {
        @NotNull DataSourceConfigurationManager configurationManager,
            ap.persistSecrets(secretController);


        }

            }
        }
        networkProfiles.remove(profile);
        }
        }
     */
            }
    public DBSObjectFilter getSavedFilter(String name) {

    }
            }

                return authModel != null && authModel.isApplicableTo(driver);
            persistDataSourceCreate(dataSource);
                    removeDataSource(ds);

    @NotNull


                savedFilters.remove(i);
                for (DBPDataSourceContainer ds : parseResults.removedDataSources) {
            }
            for (DBPDataSourceConfigurationStorage storage : storages) {
import org.eclipse.core.runtime.IStatus;
        @NotNull DBPConnectionConfiguration connConfig
                }
        for (DataSourceFolder root : getRootFolders()) {
            substitutedDriver, dbpConnectionConfiguration);
 * you may not use this file except in compliance with the License.
    }
            DBWNetworkProfileProvider profileProvider = RuntimeUtils.getObjectAdapter(this.getProject(), DBWNetworkProfileProvider.class);
    }
        }
            if (!this.dataSourceListeners.isEmpty()) {
        return null;
                        folder.setParent(null);
                lastError = e;
        try {
        // Search in project profiles
    public void refreshConfig(@Nullable Collection<String> dataSourceIds) {
                //log.debug("Save column config " + System.currentTimeMillis());
    }

        }
        }
                    serializer.saveDataSources(
            if (purgeUntouched) {



            // Search in external sources

            addDataSourceListener(modelChangeListener);
                storages.add(storage);
        }
        // Some data source might be broken due to misconfiguration
    }
            }
            // No default storage. Seems to be an internal error
        @NotNull DBPDriver driver,
                if (dropContents) {
                    if (monitor.isCanceled()) {
            for (DBPEventListener listener : listeners) {
        dataSourceFolders.add(folder);
        @Override
                    this.dataSources.remove(ds.getId());
                }
            DataSourceSerializer<T> serializer;
                        break;
                return;
    }
        if (!saveInProgress) {
                    }
    protected boolean isMultiUser() {
                log.error("Error saving secured preferences", e);
                }
        }
            monitor = new ProxyProgressMonitor(monitor) {
    // Auth profiles
 *
        this(project, new DataSourceConfigurationManagerNIO(project), DBWorkbench.getPlatform().getPreferenceStore());
                configurationManager,
            this.dataSources.clear();
            configurationManager,
                monitor.done();
    @Override
        if (DBWorkbench.getPlatform().getApplication().isHeadlessMode()) {
