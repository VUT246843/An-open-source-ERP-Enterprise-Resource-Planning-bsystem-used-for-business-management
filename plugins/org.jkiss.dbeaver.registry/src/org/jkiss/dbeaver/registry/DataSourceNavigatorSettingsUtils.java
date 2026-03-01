import org.jkiss.dbeaver.model.security.SMObjectType;


    public static void objectSettingUpdated(
            SMObjectType.datasource,
    private static final Log log = Log.getLog(DataSourceNavigatorSettingsUtils.class);
            // No relevant settings changed
        @NotNull DBPDataSourceContainer dataSource
    }
package org.jkiss.dbeaver.registry;
            return;
        if (settingIds.stream().noneMatch(DataSourceNavigatorSettings.NAVIGATOR_SETTINGS::contains)) {
 *
        navSettings.setHideSchemas(JSONUtils.getBoolean(objectMap, DataSourceNavigatorSettings.ATTR_NAVIGATOR_HIDE_SCHEMAS));
        if (settingsProvider == null) {
            dataSource.getId(),
        if (dataSourceContainer == null) {
        navSettings.setShowOnlyEntities(JSONUtils.getBoolean(objectMap, DataSourceNavigatorSettings.ATTR_NAVIGATOR_SHOW_ONLY_ENTITIES));
    ) {
import org.jkiss.dbeaver.model.DBPObjectSettingsProvider;
        navSettings.setHideFolders(JSONUtils.getBoolean(objectMap, DataSourceNavigatorSettings.ATTR_NAVIGATOR_HIDE_FOLDERS));
        navSettings.setMergeEntities(JSONUtils.getBoolean(objectMap, DataSourceNavigatorSettings.ATTR_NAVIGATOR_MERGE_ENTITIES));
        @NotNull String objectId,
        DBPObjectSettingsProvider settingsProvider = DBUtils.getAdapter(DBPObjectSettingsProvider.class, dataSource.getProject());

import java.util.List;
 * Unless required by applicable law or agreed to in writing, software
    }
        Map<String, String> settingsMap = DataSourceNavigatorSettings.saveSettingsToMap(settings);
        DBPDataSourceContainer dataSourceContainer = project.getDataSourceRegistry().getDataSource(objectId);
import java.util.Map;
    public static void loadSettingsFromMap(@NotNull DataSourceNavigatorSettings navSettings, @NotNull Map<String, ?> objectMap) {
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager

            return;
        );
/*
    public static void clearCustomNavigatorSettings(
 *

    }
        );
        @NotNull DBPDataSourceContainer dataSource,
import org.jkiss.dbeaver.Log;

        settingsProvider.setObjectSettings(
            return;

            settingsMap
            return;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import java.util.Collection;
import org.jkiss.code.NotNull;
            DataSourceNavigatorSettings.NAVIGATOR_SETTINGS
        navSettings.setShowSystemObjects(JSONUtils.getBoolean(objectMap, DataSourceNavigatorSettings.ATTR_NAVIGATOR_SHOW_SYSTEM_OBJECTS));
        }
    }

            SMObjectType.datasource,
        @NotNull Collection<String> settingIds
        }
        @NotNull DBPProject project,
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.model.data.json.JSONUtils;
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
}
 *     http://www.apache.org/licenses/LICENSE-2.0
    ) throws DBException {
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.DBException;

    ) throws DBException {
        navSettings.setHideVirtualModel(JSONUtils.getBoolean(objectMap, DataSourceNavigatorSettings.ATTR_NAVIGATOR_HIDE_VIRTUAL));
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull DataSourceNavigatorSettings settings
 * You may obtain a copy of the License at
        settingsProvider.clearObjectSettings(
public class DataSourceNavigatorSettingsUtils {
        }
            dataSource.getId(),
            log.warn("Data source container '" + objectId + "' not found in registry");
        dataSourceContainer.getRegistry().refreshConfig(List.of(dataSourceContainer.getId()));
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
    public static void updateCustomNavigatorSettings(
 */
        navSettings.setShowUtilityObjects(JSONUtils.getBoolean(objectMap, DataSourceNavigatorSettings.ATTR_NAVIGATOR_SHOW_UTIL_OBJECTS));
 *
        DBPObjectSettingsProvider settingsProvider = DBUtils.getAdapter(DBPObjectSettingsProvider.class, dataSource.getProject());
        if (settingsProvider == null) {
