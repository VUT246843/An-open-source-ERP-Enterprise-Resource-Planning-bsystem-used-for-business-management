
        throw new DBCFeatureNotSupportedException();
        return project;
    }

    @Nullable

 * DBeaver - Universal Database Manager
    }
    }
}
    public DBPProject getProject() {
        return false;
    }
    @Override
    public boolean isSharedCredentials() {
                log.debug(e);
    @Nullable
    @Override
    @NotNull
    public void resetPassword() {

    }
        return null;
    @Override
    public boolean isAccessCheckRequired() {
    @NotNull

    }
    }
    public DBPDriverSubstitutionDescriptor getDriverSubstitution() {
    @Override

    public DBPDataSource getDataSource() {
    @Override
    }
        return false;

    }
    }
    @Override
        this.virtualModel = new DBVModel(this);
    }
    }
    @Nullable
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
    public DBSObjectFilter getObjectFilter(Class<?> type, @Nullable DBSObject parentObject, boolean firstMatch) {
    @Nullable
        return null;
    @Override

    @NotNull
 * See the License for the specific language governing permissions and
    public String getId() {
    public String getRequiredExternalAuth() {
    @Override
    private static final Log log = Log.getLog(StreamDataSourceContainer.class);
    }

    }


import org.jkiss.dbeaver.model.*;
    @Override

    public boolean isUseScientificNumericFormat() {

    @Override
    @Override
    @NotNull
import org.jkiss.dbeaver.model.connection.DBPDriver;
    @NotNull
    @NotNull
    @Override
    }

 * you may not use this file except in compliance with the License.
        throw new DBCFeatureNotSupportedException();
    @NotNull
    public boolean isPersisted() {
    @Override
        return exclusiveLock;
import org.jkiss.dbeaver.DBException;
    @NotNull
    public String getConnectionError() {

    public DBPDataSourceConfigurationStorage getConfigurationStorage() {
        return List.of();
    @NotNull
    }
 */

    public DBNBrowseSettings getNavigatorSettings() {
import java.util.Map;

    @Override
    public Date getConnectTime() {
    public DBPDataSourceContainer createCopy(DBPDataSourceRegistry forRegistry) {
    }
        return true;
    public String getTagValue(@NotNull String tagName) {
/**

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    }
    private final DBPExclusiveResource exclusiveLock = new SimpleExclusiveLock();

    }
        throw new DBCFeatureNotSupportedException();
    }
    @Override
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @NotNull
    @Override
        return false;
import java.nio.file.Path;
    }

    }

    }
    public String getDescription() {
    @NotNull

    }

    @Override

        
    public Integer getDefaultTransactionsIsolation() {
    @Override
    public DBWNetworkHandler[] getActiveNetworkHandlers() {
 *
        return new DBPConnectionConfiguration();
        return DBWorkbench.getPlatform().getPreferenceStore();
    public <T> T getExtension(@NotNull String name) {
        return null;
import org.jkiss.dbeaver.model.secret.DBSSecretController;
    public boolean persistConfiguration() {

import java.util.Collection;

    public String getClientApplicationName() {
    public DBPConnectionConfiguration getActualConnectionConfiguration() {
        return StreamDataSourceDriver.INSTANCE;
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        return null;
    @Override
        return null;
    @Override
        return true;
    @Override


    }
import org.jkiss.dbeaver.Log;
    public void setSelectedSharedCredentials(@NotNull DBSSecretValue secretValue) {

    @Override
        throw new IllegalStateException("Not supported");

    @NotNull
    @Override
    @Override
    public DBPDataSourceOrigin getOrigin() {

    }
    @Override
import org.jkiss.dbeaver.model.impl.data.DefaultValueHandler;
    public boolean isConnectionReadOnly() {
    }

    @NotNull


    public boolean isForceUseSingleConnection() {
    }
    }
import java.io.IOException;


import org.jkiss.dbeaver.model.data.DBDDataFormatterProfile;
    }
public class StreamDataSourceContainer implements DBPDataSourceContainer {
    @Nullable
    public void setForceUseSingleConnection(boolean value) {

    @Override
    @Override
    }
package org.jkiss.dbeaver.tools.transfer.stream.model;
    @Override
    }
        return null;
import org.jkiss.dbeaver.registry.DataSourceOriginLocal;
    public boolean isDefaultAutoCommit() {
        return null;
    public SQLDialectMetadata getScriptDialect() {
import org.jkiss.dbeaver.runtime.IVariableResolver;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return isManageable();
    }


        return null;
    }
    }
    @Override



    }
    @Override
    public boolean isExternallyProvided() {
    public boolean isProvided() {
    }
    private final String name;
    }
    @Nullable
                return new Date(Files.getLastModifiedTime(inputFile).toMillis());
    StreamDataSourceContainer(@NotNull String name, @NotNull DBPProject project) {
    public void setSharedCredentials(boolean sharedCredentials) {
    @Nullable
    @Override
    }
    @Override
    @Nullable
        return inputFile == null ? name : inputFile.getFileName().toString();
    @Override
    @NotNull
    public IVariableResolver getVariablesResolver(boolean actualConfig) {
import org.jkiss.dbeaver.model.secret.DBSSecretValue;

        virtualModel.dispose();
import org.jkiss.dbeaver.model.navigator.DBNBrowseSettings;
        return DBWorkbench.getPlatform().getSQLDialectRegistry().getDialect(BasicSQLDialect.ID);
    private final DBPProject project;
    @Override
    public DBDDataFormatterProfile getDataFormatterProfile() {
    @Override
    }
    }
    public Collection<DBPDataSourceTask> getTasks() {

    public DBPDataSourceFolder getFolder() {
    @Override
    public void setDriverSubstitution(@Nullable DBPDriverSubstitutionDescriptor driverSubstitution) {
        // do nothing
    public boolean isExtraMetadataReadEnabled() {
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
    public String getName() {


    }
    public boolean isManageable() {
        return DefaultValueHandler.INSTANCE;
    @Override
    }
import java.nio.file.Files;

        return false;
    }
    public void resolveSecrets(DBSSecretController secretController) throws DBException {
    }
    }
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;

    public List<DBSSecretValue> listSharedCredentials() throws DBException {
    }
        this.name = name;
    public void dispose() {
            try {
    public void setTemporary(boolean temporary) {

    @Override
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable

    }
import java.util.List;
    }
    public void setExtension(@NotNull String name, @Nullable Object value) {
    public DBPPreferenceStore getPreferenceStore() {
        return null;
    }


    @Override

    public DBDValueHandler getDefaultValueHandler() {
        return null;

    @NotNull
    @Override
        return null;
            } catch (IOException e) {
        return true;
        return DataSourceOriginLocal.INSTANCE;
import org.jkiss.code.Nullable;
    public boolean hasModifyPermission(@NotNull DBPDataSourcePermission permission) {
    public boolean isSavePassword() {

import org.jkiss.dbeaver.runtime.DBWorkbench;
    @Override

    public boolean isUseNativeNumericFormat() {
    }
        return null;
    @Override
    @Override
    @Override
    public boolean connect(@NotNull DBRProgressMonitor monitor, boolean initialize, boolean reflect) throws DBException {
 *
    public boolean reconnect(@NotNull DBRProgressMonitor monitor) throws DBException {
    public DBVModel getVirtualModel() {

    public DBPDataSourceRegistry getRegistry() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DBPTransactionIsolation getActiveTransactionsIsolation() {
    public void setName(@NotNull String newName) {
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
/*
    @Override
    @Override
    @NotNull
    }

    @NotNull

import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
    }

        throw new IllegalStateException("Stream datasource doesn't have config storage");
        return null;
    public boolean isUseNativeDateTimeFormat() {
    @Override
        return DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.RESULT_NATIVE_NUMERIC_FORMAT);
    }
    @Nullable
import org.jkiss.dbeaver.ModelPreferences;

    public boolean isHidden() {
    @Override

    @Override
    @Override
    }
    public void setFolder(@Nullable DBPDataSourceFolder folder) {



        return true;
    @Override
import org.jkiss.dbeaver.model.data.DBDValueHandler;

import org.jkiss.dbeaver.model.struct.DBSObject;
        // noop
    @Override
import org.jkiss.dbeaver.model.net.DBWNetworkHandler;
    @Override
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;
    }
    @Override
import org.jkiss.dbeaver.model.virtual.DBVModel;


        return false;
    @Override
    public Map<String, String> getTags() {


    @Override
    public DBSObject getParentObject() {
    public boolean isTemporary() {
    }

    @NotNull
        return null;
    @Override

    public void setDescription(String description) {
    @Override
    @Override

    @Override
    @Override

        return new Date();

    @Override
import org.jkiss.code.NotNull;

    }
            }
    @Override
        return true;

    private final DBVModel virtualModel;

    @Override




    @Override


    public void setConnectionReadOnly(boolean connectionReadOnly) {
    }
        return null;
        return null;
    @Override
    }

    }
    @Nullable
    }
    @Override

        return null;
import org.jkiss.dbeaver.model.app.DBPProject;
    public DBPExclusiveResource getExclusiveLock() {
import org.jkiss.dbeaver.model.impl.SimpleExclusiveLock;
    }
import org.jkiss.dbeaver.model.connection.DBPDriverSubstitutionDescriptor;
    @Override
    @Override
        return true;

    }
    }
    }

    public void fireEvent(@NotNull DBPEvent event) {
 *
    @NotNull

    }
    }
    @Override
        throw new IllegalStateException("Not supported");
    }
    }

        return null;

    @Override
        return false;
 * limitations under the License.
        return inputFile == null ? name : inputFile.getFileName().toString();
        return false;
    @Override
        return project.getDataSourceRegistry();
    public boolean isConnecting() {
    @Override

    @Nullable
    @Nullable

    private Path inputFile;
    public void persistSecrets(DBSSecretController secretController) throws DBException {

    public void setObjectFilter(@NotNull Class<?> type, @Nullable DBSObject parentObject, @Nullable DBSObjectFilter filter) {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    @Override
    public void resetAllSecrets() {
    public boolean isConnected() {

    public DBPDriver getDriver() {


    public void setClientApplicationName(@NotNull String applicationName) {
    }
    }
    }
    @Override
        return false;

        return DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.RESULT_NATIVE_DATETIME_FORMAT);
    }
    @Nullable
    }
    @Override

    public void release(@NotNull DBPDataSourceTask user) {
        return true;
        this.project = project;
    }
        }
 * Unless required by applicable law or agreed to in writing, software
 * Data container transfer producer
    public boolean isCredentialsSaved() {
 */
        return false;

    public void acquire(@NotNull DBPDataSourceTask user) {
        return DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.RESULT_SCIENTIFIC_NUMERIC_FORMAT);
    @NotNull
    }
    @Override
        return virtualModel;
 * You may obtain a copy of the License at
    public boolean isSharedCredentialsSelected() {
        return new DBWNetworkHandler[0];
    @Nullable


    public List<DBPDataSourcePermission> getModifyPermission() {
    @Override
    }
    }
import org.jkiss.dbeaver.model.sql.SQLDialectMetadata;

        return DBWorkbench.getPlatform().getDataFormatterRegistry().getGlobalProfile();
    }
    public void setModifyPermissions(@Nullable Collection<DBPDataSourcePermission> permissions) {
    }
    @Override
        if (inputFile != null) {
    }
    public DBPNativeClientLocation getClientHome() {
    public boolean disconnect(@NotNull DBRProgressMonitor monitor) throws DBException {
    public void setTagValue(@NotNull String tagName, @Nullable String tagValue) {
    @Override
    }
    @Override
    public DBPConnectionConfiguration getConnectionConfiguration() {


        return false;
    @Override

import java.util.Date;

    public void setSavePassword(boolean savePassword) {
    @Override
        return false;
        return new DBPConnectionConfiguration();
        return null;
    @Override
    }
    @Override


