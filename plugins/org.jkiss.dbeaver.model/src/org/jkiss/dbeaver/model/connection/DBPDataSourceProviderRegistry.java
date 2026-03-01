 *     http://www.apache.org/licenses/LICENSE-2.0
    List<? extends DBPAuthModelDescriptor> getAllAuthModels();

 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;

 *
    DBPDataSourceProviderDescriptor getDataSourceProvider(String id);
 */
    List<? extends DBPAuthModelDescriptor> getApplicableAuthModels(DBPDriver driver);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
    List<? extends DBPDataSourceProviderDescriptor> getDataSourceProviders();


package org.jkiss.dbeaver.model.connection;
    List<? extends DBPDataSourceProviderDescriptor> getEnabledDataSourceProviders();
 *
import org.jkiss.code.Nullable;
 * Data source provider
 * Unless required by applicable law or agreed to in writing, software
    DBPAuthModelDescriptor getAuthModel(String id);
 * Licensed under the Apache License, Version 2.0 (the "License");


    DBPDriverSubstitutionDescriptor getDriverSubstitution(@NotNull String id);
 */

}

/*
import java.util.List;
 * Copyright (C) 2010-2025 DBeaver Corp and others

 *
    @Nullable
    DBPConnectionType getConnectionType(String id, DBPConnectionType defaultType);
 * You may obtain a copy of the License at
    DBPDataSourceOriginProvider getDataSourceOriginProvider(String id);
    @Nullable

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
/**
import org.jkiss.dbeaver.model.DBPDataSourceOriginProvider;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;



    DBPPreferenceStore getGlobalDataSourcePreferenceStore();
    DBPDriverSubstitutionDescriptor[] getAllDriverSubstitutions();
    DBPEditorContribution[] getContributedEditors(String category, DBPDataSourceContainer dataSource);
import org.jkiss.api.CompositeObjectId;
 * DBeaver - Universal Database Manager
    DBPDataSourceProviderDescriptor makeFakeProvider(String providerID);
    DBPDriver findDriver(@NotNull CompositeObjectId ref);
 * distributed under the License is distributed on an "AS IS" BASIS,

 * limitations under the License.


    DBPDriver findDriver(@NotNull String driverIdOrName);
 * See the License for the specific language governing permissions and
    void addConnectionType(DBPConnectionType connectionType);
    void removeConnectionType(DBPConnectionType connectionType);
public interface DBPDataSourceProviderRegistry {
    void saveConnectionTypes();
    @Nullable
    // This pref store can be used to listen preference changes in ANY datasource.
