class DataSourceOriginLazy implements DBPDataSourceOriginExternal
    }
    public String getSubType() {

        }
    @Nullable

        DBPDataSourceOriginProvider originProvider = DataSourceProviderRegistry.getInstance().getDataSourceOriginProvider(originId);
 *
 * You may obtain a copy of the License at
    @Override
import org.jkiss.dbeaver.model.auth.SMSessionContext;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.externalConfiguration = externalConfiguration;
        return originId;

    @Override
    @Nullable
 */
    }
package org.jkiss.dbeaver.registry;

            return originProvider.getOrigin(originProperties, externalConfiguration);

    @Nullable

        Map<String, Object> originProperties,
    @Override
        // Instantiate in lazy mode
    public DBPImage getIcon() {
    private final DBPExternalConfiguration externalConfiguration;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.Nullable;

    public String getType() {
import org.jkiss.dbeaver.model.net.DBWNetworkProfile;
    }
    @Override
        return getType();
 * Unless required by applicable law or agreed to in writing, software
        this.originProperties = originProperties;
    private final String originId;
    DBPDataSourceOrigin resolveRealOrigin() throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override

        this.originId = originId;
 * DataSourceOriginLazy

}

    @Nullable
        return false;
    }
    @Override
        if (originProvider != null) {
    public boolean isDynamic() {
    }
    @Override
    }
    }
        return originProperties;
        return DBIcon.TYPE_UNKNOWN;
import org.jkiss.code.NotNull;
    public DBPExternalConfiguration getExternalConfiguration() {
    @NotNull
import org.jkiss.dbeaver.model.*;
    @NotNull
 * you may not use this file except in compliance with the License.
 *
        return null;
        return null;
        return null;
        // Loaded from configuration
 * Licensed under the Apache License, Version 2.0 (the "License");


    @NotNull
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        String originId,
import org.jkiss.dbeaver.DBException;
    }
    private final Map<String, Object> originProperties;
import java.util.List;
    public List<DBWNetworkProfile> getAvailableNetworkProfiles() {
    }
/**
    public Map<String, Object> getDataSourceConfiguration() {

        DBPExternalConfiguration externalConfiguration)
    public String getDisplayName() {
 */
    @Nullable
/*
 * DBeaver - Universal Database Manager
        return externalConfiguration;
    public String toString() {
import java.util.Map;
    @Override
    {
        return realOrigin == null ? null : realOrigin.getObjectDetails(monitor, sessionContext, dataSource);
    @NotNull

{
    }

    }
        return originId;
    public DataSourceOriginLazy(
        DBPDataSourceOrigin realOrigin = resolveRealOrigin();
    }
    public DBPObject getObjectDetails(@NotNull DBRProgressMonitor monitor, @NotNull SMSessionContext sessionContext, @NotNull DBPDataSourceContainer dataSource) throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * limitations under the License.
    @Override
