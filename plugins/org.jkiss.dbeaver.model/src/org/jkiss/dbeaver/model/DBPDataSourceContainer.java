     * @param actualConfig if true then actual connection config will be used (e.g. with preprocessed host/port values).
     * Associated driver
    void setClientApplicationName(@NotNull String applicationName);
    // Also hidden connections are excluded from persistence

    DBPDataSourceConfigurationStorage getConfigurationStorage();
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
     */
     * Search filter which match any super class or interface implemented by specified type.
    @NotNull
package org.jkiss.dbeaver.model;
    DBPConnectionConfiguration getConnectionConfiguration();
    /**

     * Returns true if datasource can be managed (edited or deleted).
    /**

import org.jkiss.dbeaver.model.net.DBWNetworkHandler;
    /**
    boolean isConnectionReadOnly();
     */

     */

import org.jkiss.dbeaver.model.secret.DBPSecretHolder;
    boolean disconnect(@NotNull DBRProgressMonitor monitor) throws DBException;
    DBNBrowseSettings getNavigatorSettings();
    DBPPreferenceStore getPreferenceStore();

    /*
     * Null - if additional authorization is not required
    @Nullable
    boolean connect(@NotNull DBRProgressMonitor monitor, boolean initialize, boolean reflect) throws DBException;
     * Make variable resolver for datasource properties.
     */
     * @return driver descriptor reference
    /**
    @Nullable

    DBPDataSourceRegistry getRegistry();
     * Checks this data source is connected.
 */

    void setExtension(@NotNull String name, @Nullable Object value);
    /**
    @Nullable
     * Determines that credentials for this datasource are saved

    @Nullable
    @NotNull
    /**
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;
import java.util.Date;
    DBSObject, DBDFormatSettings, DBPNamedObject2, DBPDataSourcePermissionOwner, DBPSecretHolder

     * @param monitor progress monitor
     */
     * Disconnects from datasource.
    DBPConnectionConfiguration getActualConnectionConfiguration();

    void resetPassword();
    void release(@NotNull DBPDataSourceTask user);

     * @param reflect notify UI about connection state change
     */


    @Nullable
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.model.connection.DBPDriver;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    @NotNull
    boolean isExternallyProvided();
 *
    @Nullable
    boolean isSavePassword();

    void setSavePassword(boolean savePassword);


 *
    String getRequiredExternalAuth();
    @NotNull
    void resetAllSecrets();
    boolean isDefaultAutoCommit();

    /**

    boolean persistConfiguration();

    /**
    /**
     * @return id
    DBSObjectFilter getObjectFilter(Class<?> type, @Nullable DBSObject parentObject, boolean firstMatch);

    /**
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
import java.util.Map;
import org.jkiss.dbeaver.model.sql.SQLDialectMetadata;
    boolean isSharedCredentialsSelected();
}

    void setSharedCredentials(boolean sharedCredentials);
    boolean isHidden();

     * This is async method and returns immediately.
     * @return actual connection configuration.
     */
     */
    /**
     * @return true on reconnect, false if reconnect action was canceled


     * @param parentObject parent object (in DBS objects hierarchy)


    DBPTransactionIsolation getActiveTransactionsIsolation();
     */
     * Flag saying that password value was saved in configuration.

     * Actual connection configuration. Contains actual parameters used to connect to this datasource.


public interface DBPDataSourceContainer extends

     * Differs from getConnectionConfiguration() in case if tunnel or proxy was used.
    DBPDriverSubstitutionDescriptor getDriverSubstitution();


    boolean isCredentialsSaved() throws DBException;
     * Returns last connection instantiation error if any
     */
 * See the License for the specific language governing permissions and

    List<DBSSecretValue> listSharedCredentials() throws DBException;
     * reset all secured properties
    DBPDataSourceFolder getFolder();
    <T> T getExtension(@NotNull String name);
     */

     * Checks that this data source is in the connecting process
    @NotNull

     * @throws org.jkiss.dbeaver.DBException on any DB error
     */
    void dispose();

    // This flag means that datasource shouldn't be included in the primary connection list.
import org.jkiss.dbeaver.model.virtual.DBVModel;
     * Preference store associated with this datasource
 *
     * Updates read-only param in data source.

     * Connects to datasource.
    void setForceUseSingleConnection(boolean value);
     */
    @NotNull

    boolean isConnected();
    boolean isExtraMetadataReadEnabled();
    DBPExclusiveResource getExclusiveLock();
    Collection<DBPDataSourceTask> getTasks();
     * Search for object filter which corresponds specified object type and parent object.
    void setTemporary(boolean temporary);
{
    
    DBPDataSourceOrigin getOrigin();
import org.jkiss.dbeaver.model.navigator.DBNBrowseSettings;

/*
    @NotNull
     * Returns the type of required external authorization.
    DBPDriver getDriver();
    /**
    void setDescription(String description);
    @Nullable
    void setSelectedSharedCredentials(@NotNull DBSSecretValue secretValue);
    /**
    @NotNull

     */
     * @param initialize initialize datasource after connect (call DBPDataSource.initialize)
     * Datasource tags. Tags can be used in various 3rd party integrations.
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2026 DBeaver Corp and others
    Integer getDefaultTransactionsIsolation();
    /**
     * This is sync method and returns after actual connection establishment.

    // We do not implement DBPHiddenObject because it is not really hidden.



     * It is a legacy flag, to determine that credentials are really saved use isCredentialsSaved.
     * Datasource is manageable if it belongs to its owner registry.
    @NotNull
import org.jkiss.dbeaver.model.secret.DBSSecretValue;
    @NotNull
    void setObjectFilter(@NotNull Class<?> type, @Nullable DBSObject parentObject, @Nullable DBSObjectFilter filter);
import org.jkiss.dbeaver.DBException;
 */
    @NotNull
     */
    @NotNull
import org.jkiss.dbeaver.runtime.IVariableResolver;
     * @return connection details
     */
     * Reconnects datasource.
    /**

     * @return true on disconnect, false if disconnect action was canceled
/**
    /**
     */
    
import org.jkiss.dbeaver.model.struct.DBSObject;

     * @param monitor progress monitor
    /**
    String getConnectionError();
    void acquire(@NotNull DBPDataSourceTask user);
    /**
    void fireEvent(@NotNull DBPEvent event);

 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
     * find all available shared credentials for the current user


    boolean isProvided();
    void setConnectionReadOnly(boolean connectionReadOnly);
    boolean isConnecting();
     * @return false on any error. Actual error can be read in registry.
    boolean isForceUseSingleConnection();
    @Nullable
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
    DBPDataSource getDataSource();


    String getTagValue(@NotNull String tagName);
    void setTagValue(@NotNull String tagName, @Nullable String tagValue);
    @NotNull
    boolean isAccessCheckRequired();
     */
    /**
import java.util.Collection;
    boolean reconnect(@NotNull DBRProgressMonitor monitor) throws DBException;
import org.jkiss.dbeaver.model.connection.DBPDriverSubstitutionDescriptor;
    @Nullable
    @NotNull
     * Temporary datasources are not saved in project. They exist until project refresh or application shutdown

    @NotNull
 * limitations under the License.
     */
     */
    DBPProject getProject();
     * Marks all secrets (credentials) as unresolved

    /**

    /**
 * You may obtain a copy of the License at
     * Container unique ID
    /**
     * @return preference store
 * DBeaver - Universal Database Manager

import org.jkiss.code.Nullable;
    Map<String, String> getTags();
    /**
     * Connection configuration.
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
     * @return true if datasource is provided by some dynamic DS provider. E.g. cloud configuration.
    /**
     * @param monitor progress monitor

    boolean isSharedCredentials();
     */
 * DBPDataSourceContainer
     */
    DBPNativeClientLocation getClientHome();

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    String getId();
import org.jkiss.code.NotNull;

    boolean isTemporary();
     * @return object filter or null if not filter was set for specified type
     */
     * @throws DBException on error
    Date getConnectTime();
    SQLDialectMetadata getScriptDialect();
    @Nullable

     * Do not check whether underlying connection is alive or not.



     *
     */


import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;

import java.util.List;
    @Nullable
     * Connection will be closed in separate job, so no progress monitor is required.
    @NotNull
     */
     * @param type object type
     * Extension settings. Any custom attributes assigned by product plugins for internal configuration purposes
    @Nullable
    void setDriverSubstitution(@Nullable DBPDriverSubstitutionDescriptor driverSubstitution);

    DBWNetworkHandler[] getActiveNetworkHandlers();
    String getClientApplicationName();
    DBVModel getVirtualModel();

    IVariableResolver getVariablesResolver(boolean actualConfig);
     */
    void setFolder(@Nullable DBPDataSourceFolder folder);
    DBPDataSourceContainer createCopy(DBPDataSourceRegistry forRegistry);
    @NotNull
    boolean isManageable();
     * @throws DBException on error
