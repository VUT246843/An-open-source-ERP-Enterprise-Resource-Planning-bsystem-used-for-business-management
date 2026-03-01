    );
import java.util.Set;

    DBAAuthProfile getAuthProfile(@NotNull String id);
     * @param profiles - profile collection
    @NotNull
        @NotNull String id,
    String MODERN_CONFIG_FILE_EXT = ".json"; //$NON-NLS-1$
    void refreshConfig();
    List<DBWNetworkProfile> getNetworkProfiles();
    @Nullable

 *
}
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    void removeFolder(@NotNull DBPDataSourceFolder folder, boolean dropContents);
    void addDataSource(@NotNull DBPDataSourceContainer dataSource) throws DBException;
        @NotNull DBPConnectionConfiguration configuration

import org.jkiss.dbeaver.model.secret.DBPSecretHolder;

     * Refreshes configuration of specified data sources


     * Returns and nullifies last registry save/load error.
    /**

    Set<DBPDataSourceFolder> getTemporaryFolders();
 * See the License for the specific language governing permissions and
     */

    void moveFolder(@NotNull String oldPath, @NotNull String newPath) throws DBException;

     */
 * Keeps all database connection information in a project
 * Copyright (C) 2010-2025 DBeaver Corp and others
     */
    void flushConfig();
    DBPDataSourceFolder addFolder(@Nullable DBPDataSourceFolder parent, @NotNull String name);
    DBWNetworkProfile getNetworkProfile(@Nullable String source, @NotNull String name);
    void checkForErrors() throws DBException;
import org.jkiss.dbeaver.model.*;
    @NotNull
    void updateAuthProfile(@NotNull DBAAuthProfile profile);
    @NotNull

    /**
    DBSObjectFilter getSavedFilter(String name);
    void removeDataSource(@NotNull DBPDataSourceContainer dataSource);
    <T extends DBPDataSourceContainer> T createDataSource(

import java.util.Collection;
    );
     */
    String MODERN_CONFIG_FILE_NAME = MODERN_CONFIG_FILE_PREFIX + MODERN_CONFIG_FILE_EXT;

import org.jkiss.dbeaver.model.net.DBWNetworkProfile;
     */
     * Owner project.
    String CREDENTIALS_CONFIG_FILE_EXT = ".json"; //$NON-NLS-1$
    DBPPreferenceStore getPreferenceStore();
 * Datasource registry.
    String LEGACY_CONFIG_FILE_NAME = LEGACY_CONFIG_FILE_PREFIX + LEGACY_CONFIG_FILE_EXT;
 * Unless required by applicable law or agreed to in writing, software
    @Nullable
 * limitations under the License.
        @NotNull DBPConnectionConfiguration connConfig

 */
import org.jkiss.dbeaver.DBException;
    void addDataSourceListener(@NotNull DBPEventListener listener);


        @NotNull DBPDataSourceConfigurationStorage dataSourceStorage,
import org.jkiss.dbeaver.model.connection.DBPDriver;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    Throwable getLastError();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    DBPProject getProject();


 * distributed under the License is distributed on an "AS IS" BASIS,
    void removeNetworkProfile(@NotNull DBWNetworkProfile profile);
import org.jkiss.code.Nullable;
    @Nullable
    DBACredentialsProvider getAuthCredentialsProvider();
    @NotNull

    DBPDataSourceFolder getFolder(@NotNull String path);

    void dispose();

        @NotNull DBPDriver driver,
    List<? extends DBPDataSourceFolder> getRootFolders();
    @Nullable
import org.jkiss.dbeaver.model.access.DBACredentialsProvider;

    @Nullable
    @NotNull
    @Nullable

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    String CREDENTIALS_CONFIG_FILE_NAME = CREDENTIALS_CONFIG_FILE_PREFIX + CREDENTIALS_CONFIG_FILE_EXT;
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
    @NotNull
    String LEGACY_CONFIG_FILE_PREFIX = ".dbeaver-data-sources"; //$NON-NLS-1$
     */

    @NotNull

/*
        @NotNull DBPDataSourceOrigin origin,
 * You may obtain a copy of the License at
    <T extends DBPDataSourceContainer> T createDataSource(@NotNull DBPDataSourceContainer source);
    List<? extends DBPDataSourceContainer> getDataSources();

 *     http://www.apache.org/licenses/LICENSE-2.0
    /**

    void setAuthCredentialsProvider(@Nullable DBACredentialsProvider authCredentialsProvider);
 *
    /**
    @NotNull
    void removeAuthProfile(@NotNull DBAAuthProfile profile);
    boolean removeDataSourceListener(@NotNull DBPEventListener listener);
    boolean hasError();

    @NotNull
import org.jkiss.dbeaver.model.access.DBAAuthProfile;
        @NotNull DBPConnectionConfiguration connConfig
    void updateDataSource(@NotNull DBPDataSourceContainer dataSource) throws DBException;
    /**
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
    @NotNull
    void updateSavedFilter(@NotNull DBSObjectFilter filter);
    void setAuthProfiles(@NotNull Collection<DBAAuthProfile> profiles);
        @NotNull DBPDriver driver,
    List<DBAAuthProfile> getAllAuthProfiles();
    <T extends DBPDataSourceContainer> T createDataSource(
     */

    List<? extends DBPDataSourceContainer> getDataSourcesByProfile(@NotNull DBWNetworkProfile profile);
    void removeSavedFilter(@NotNull String filterName);
    void updateNetworkProfile(@NotNull DBWNetworkProfile profile);
    // Network profiles
    <T extends DBPDataSourceContainer> T createDataSource(
 */
    @Nullable
    DBPDataSourceContainer findDataSourceByName(String name);
    );
    String LEGACY2_CONFIG_FILE_NAME = "data-sources.xml"; //$NON-NLS-1$
     * Returns all folders having temporary connections.
     * Sets auth credentials provider to the registry.

    DBPDataSourceContainer getDataSource(@NotNull DBPDataSource dataSource);
    String LEGACY_CONFIG_FILE_EXT = ".xml"; //$NON-NLS-1$



    String CREDENTIALS_CONFIG_FILE_PREFIX = "credentials-config"; //$NON-NLS-1$




     * Moves connection folder
    DBPDataSourceContainer getDataSource(@NotNull String id);
    List<DBSObjectFilter> getSavedFilters();
    void refreshConfig(@Nullable Collection<String> dataSourceIds);
    List<? extends DBPDataSourceFolder> getAllFolders();
public interface DBPDataSourceRegistry extends DBPObject, DBPSecretHolder {
    void notifyDataSourceListeners(@NotNull DBPEvent event);
/**
    /**
    /**

    @NotNull
        @NotNull DBPDriver driver,
    // Auth profiles
    /**
    @NotNull

     * Set collection of profiles.

    List<DBAAuthProfile> getApplicableAuthProfiles(@Nullable DBPDriver driver);
     */
     * Throws last occurred load/save error
package org.jkiss.dbeaver.model.app;

import java.util.List;

     *
        @NotNull String id,
    @NotNull
    @NotNull
    @Nullable


    @NotNull
    String MODERN_CONFIG_FILE_PREFIX = "data-sources"; //$NON-NLS-1$

    // Registry auth provider. Null by default.
