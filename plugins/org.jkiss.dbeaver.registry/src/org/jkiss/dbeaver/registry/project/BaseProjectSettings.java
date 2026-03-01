                    for (String settingId : settingIds) {
 */
        }
    ) throws DBException {
    public void deleteObjectSettingsCache(
                    .computeIfAbsent(objectType, ot -> new LinkedHashMap<>())
                settings.putAll(settingsToSet);

                Map<String, String> settings = projectSettings
                } catch (DBException e) {
        @NotNull SMObjectType objectType,
        synchronized (this) {
    }
    ) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
            return;
                    projectSettings = new LinkedHashMap<>();

 * See the License for the specific language governing permissions and
import java.util.Map;
                    .computeIfAbsent(objectId, k -> new LinkedHashMap<>());
    @Override


    }
    @Override
import org.jkiss.dbeaver.model.security.SMObjectType;
import java.util.Collection;
    public void updateObjectSettingsCache(

                        if (settings != null) {
                    }
                if (settingIds == null) {
        // update local cache
        this.project = project;
                                settings.remove(settingId));
import org.jkiss.dbeaver.DBException;
public abstract class BaseProjectSettings implements DBPObjectSettingsProvider {

        Map<String, Map<String, String>> cache = projectSettings.get(objectType);
import java.util.Set;
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
                    settingRemoved = new LinkedHashMap<>();
        Map<String, String> settingMap = new LinkedHashMap<>(settings.size());
        @NotNull SMObjectType objectType,
    public Map<String, String> getObjectSettings(@NotNull SMObjectType objectType, @NotNull String objectId) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                } else {
        }

        @NotNull SMObjectType objectType,

            }

        @NotNull String objectId,
    ) throws DBException {
    private Map<SMObjectType, Map<String, Map<String, String>>> projectSettings;

            }
        Map<String, String> settingsToSet
    }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void setObjectSettings(
 * You may obtain a copy of the License at
        }
    private static final Log log = Log.getLog(BaseProjectSettings.class);

        }
        }

    ) throws DBException;
    @Nullable
package org.jkiss.dbeaver.registry.project;
                }
        @NotNull Map<String, String> settings
                }

}
    protected abstract Map<SMObjectType, Map<String, Map<String, String>>> loadAllProjectSettings() throws DBException;
                Map<String, String> settingRemoved;
 * DBeaver - Universal Database Manager
        updateObjectSettingsCache(objectType, objectId, settings);
            settingMap.put(id, null);
 *
    }
/*
        @NotNull SMObjectType objectType,
        DataSourceNavigatorSettingsUtils.objectSettingUpdated(project, objectId, settingsToSet.keySet());
    }
 * you may not use this file except in compliance with the License.
        @Nullable Collection<String> settingIds

                DataSourceNavigatorSettingsUtils.objectSettingUpdated(project, objectId, settingRemoved.keySet());
        return cache == null ? null : cache.get(objectId);
                    settingRemoved = cache.remove(objectId);
    protected abstract void saveProjectSettings(
        if (projectSettings == null) {
        @NotNull Set<String> settings
    public void clearObjectSettings(
    private final DBPProject project;
        deleteObjectSettingsCache(objectType, objectId, settings);
        @NotNull String objectId,
        saveProjectSettings(objectType, objectId, settingMap);
    @Override

                    projectSettings = loadAllProjectSettings();
    @NotNull

            Map<String, Map<String, String>> cache = projectSettings.get(objectType);
import org.jkiss.dbeaver.registry.DataSourceNavigatorSettingsUtils;
                    log.error("Error loading project settings. Setting to empty.", e);
        @NotNull String objectId,
 *
            if (projectSettings == null) {
                        }
import org.jkiss.dbeaver.model.app.DBPProject;
        @NotNull String objectId,
            synchronized (this) {
        saveProjectSettings(objectType, objectId, settings);
        for (String id : settings) {
 * Keeps information cache about project settings overrides.

    ) {
import java.util.LinkedHashMap;
        @NotNull String objectId,
import org.jkiss.dbeaver.Log;
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
        @NotNull Map<String, String> settings
    protected BaseProjectSettings(@NotNull DBPProject project) {
        synchronized (this) {
                                settingId,

 */
    }
/**
                try {
import org.jkiss.dbeaver.model.DBPObjectSettingsProvider;
        if (projectSettings != null) {
        @NotNull SMObjectType objectType,
                            settingRemoved.put(
            if (cache != null) {
import org.jkiss.code.Nullable;
                        Map<String, String> settings = cache.get(objectId);
