     */
    @NotNull
    @NotNull
    // Custom driver: created by user
    @Nullable
    DBPDataSourceProviderDescriptor getProviderDescriptor();

    boolean isAllowsEmptyPassword();

public interface DBPDriver extends DBPNamedObject, DBPDriverLibraryProvider {
    DBPDataSourceProvider getDataSourceProvider();

    String getConnectionURL(DBPConnectionConfiguration configuration);
    String getNonAvailabilityReason();
import java.util.Map;

    @NotNull
    @NotNull
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    String getSampleURL();
import org.jkiss.code.Nullable;
    @Nullable
     * Show supported configuration types
    boolean isThreadSafeDriver();
        @NotNull DBRProgressMonitor monitor,
    /**
    @Nullable
 * You may obtain a copy of the License at


    /**
 * See the License for the specific language governing permissions and
    DBPImage getLogoImage();

    @NotNull
    String getFullName();
    int getPromotedScore();
    @NotNull


    DBPImage getIconBig();

    String getPropertiesWebURL();



    @NotNull
    @Nullable
    /**
    @Nullable
        return getProviderId() + ":" + getId();

    SQLDialectMetadata getScriptDialect();


     */


    // Anonymized driver ID for statistics
    boolean supportsVirtualKeys();

    @Nullable
package org.jkiss.dbeaver.model.connection;
/**
    @NotNull
    String getDefaultServer();
    DBPPropertyDescriptor[] getMainPropertyDescriptors();

    // Check that driver is thread safe (default mode)
/*
     */



import java.util.List;
    String getNonAvailabilityTitle();
    List<String> getCategories();
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Nullable

    boolean isInternalDriver();
    List<Pair<String,String>> getDriverReplacementsInfo();
    DBPImage getPlainIcon();

    /**
 */

    List<DBPDriverLoader> getAllDriverLoaders();

     * Compare driverId to this driver and its replacements
    String getWebURL();
    @Nullable
    boolean isSupportedByLocalSystem();
    String getId();
    @NotNull
 * DBeaver - Universal Database Manager

    boolean isClientRequired();

    String getCategory();
    DBPImage getIcon();
        @NotNull DBPDataSourceContainer dataSourceContainer
 * Unless required by applicable law or agreed to in writing, software
    String getDefaultPort();
    String getNonAvailabilityDescription();



    void validateFilesPresence(
    @NotNull
    Map<String, Object> getConnectionProperties();
    boolean isPropagateDriverProperties();
        return isCustom() ? getProviderId() + ":custom-driver" : getFullId();

    boolean isCustomDriverLoader();
    boolean isLicenseRequired();

    @NotNull
    boolean supportsDriverProperties();
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
 *
import org.jkiss.dbeaver.model.DBPDataSourceProvider;
    boolean isSingleConnection();
    boolean isTemporary();
    List<DBPNativeClientLocation> getNativeClientLocations();
    @Nullable
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;

    boolean isCustom();

    Map<String, Object> getDriverParameters();
    @NotNull
    DBPDriver getReplacedBy();
    String getProviderId();
    @NotNull

    String getDescription();
    DBXTreeNode getNavigatorRoot();
     * @return a pair of providerId and driverId for each of driver replacement
 * limitations under the License.
    String getDriverClassName();
    @Nullable

     */
 *

    DBPDriverLoader getDefaultDriverLoader();
 */
import org.jkiss.dbeaver.model.sql.SQLDialectMetadata;
 * DBPDriver
    DBPPropertyDescriptor[] getProviderPropertyDescriptors();

    @Nullable


    @Nullable
    @NotNull
    @Nullable
    boolean isNotAvailable();
    @Nullable

     * Create copy of
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Nullable


    @NotNull
    @Nullable


    @Nullable
    // Driver shipped along with JDK/DBeaver, doesn't need any additional libraries. Basically it is ODBC driver.
    @NotNull
import org.jkiss.dbeaver.DBException;
    @NotNull
 *
    @NotNull
}
    boolean isCustomEndpointInformation();
     */

    // Can be created
    @NotNull
import org.jkiss.code.NotNull;

    ) throws DBException;

    String getDefaultDatabase();

    default String getPreconfiguredId() {
    boolean matchesId(@NotNull String driverId);
    @Nullable

 *     http://www.apache.org/licenses/LICENSE-2.0
    Set<String> getSupportedPageFields();
    @Nullable
    Set<DBPDriverConfigurationType> getSupportedConfigurationTypes();

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @NotNull
    Object getDriverParameter(String name);

    @NotNull
    /**
    String getDefaultHost();

    DBPNativeClientLocationManager getNativeClientManager();
import org.jkiss.dbeaver.model.DBPImage;



 * you may not use this file except in compliance with the License.
    @NotNull

    }
    @NotNull
import org.jkiss.utils.Pair;
     */
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
    DBPDriver createOriginalCopy();
    boolean isSampleURLApplicable();
    @NotNull
    default String getFullId() {
    @NotNull
    @Nullable
import java.util.Set;
    boolean isAnonymousAccess();
    List<? extends DBPDriverFileSource> getDriverFileSources();

    DBPDriverLoader getDriverLoader(@NotNull DBPDataSourceContainer dataSourceContainer);
    // Temporary driver: used for automatically created drivers when connection  configuration is broken
    /**
    String getDatabaseDocumentationSuffixURL();
    boolean isDisabled();
    String getLicense();
     * Client manager or null
    Map<String, Object> getDefaultConnectionProperties();
    boolean isInstantiable();
import org.jkiss.dbeaver.model.DBPNamedObject;
    boolean isEmbedded();

     * Driver contributor
    @Deprecated
    void resetDriverInstance();

     */
     * @return true or false
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull


    // Check that driver needs only on connection for all operations
     * Returns true if the driver supports virtual keys.
    String getDefaultUser();
