        this.showSystemObjects = copyFrom.isShowSystemObjects();
        this.showSystemObjects = source.isShowSystemObjects();
        return this.showSystemObjects == source.showSystemObjects &&
    private boolean showSystemObjects;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public boolean isHideSchemas() {
    static {

        map.put(ATTR_NAVIGATOR_MERGE_ENTITIES, String.valueOf(navSettings.mergeEntities));
        this.showOnlyEntities = source.isShowOnlyEntities();
        ATTR_NAVIGATOR_MERGE_ENTITIES
        RegistryMessages.navigator_settings_preset_advanced_view_description
        public String getName() {
        settings.setShowUtilityObjects(preferences.getBoolean(DEFAULT_SHOW_UTILITY_OBJECTS));
 * DBeaver - Universal Database Manager
    public void setHideFolders(boolean hideFolders) {
    private static final String DEFAULT_SHOW_UTILITY_OBJECTS = "navigator.settings.default.showUtilityObjects";

    private static final String DEFAULT_HIDE_FOLDERS = "navigator.settings.default.hideFolders";
    // Navigator settings
        if (value) {
        this.hideFolders = source.isHideFolders();
}
    }
        }
    @Override

        return hideSchemas;
        RegistryMessages.navigator_settings_preset_simple_view_name,
    static final String ATTR_NAVIGATOR_SHOW_UTIL_OBJECTS = "show-util-objects"; //$NON-NLS-1$

        this.showSystemObjects = showSystemObjects;
                break;
        // Save custom settings
            this.hideFolders == source.hideFolders &&
    public boolean equals(Object obj) {

 * Unless required by applicable law or agreed to in writing, software
    public void setHideSchemas(boolean hideSchemas) {
        RegistryMessages.navigator_settings_preset_custom_view_description
 */
import org.jkiss.dbeaver.model.navigator.DBNBrowseSettings;
        preferences.setValue(DEFAULT_SHOW_SYSTEM_OBJECTS, settings.isShowSystemObjects());
        this.showOnlyEntities = showOnlyEntities;

    private static final String DEFAULT_SHOW_SYSTEM_OBJECTS = "navigator.settings.default.showSystemObjects";
        "simple",

            this.hideVirtualModel == source.hideVirtualModel;
                    return p.getSettings();
 *
        preferences.setValue(DEFAULT_SHOW_UTILITY_OBJECTS, settings.isShowUtilityObjects());
            this.name = name;

    private transient DBNBrowseSettings originalSettings;
    }
    }
        "advanced",

    }
import org.jkiss.code.Nullable;
    }
            if (p.getSettings().equals(settings)) {



    @Override
            this.mergeEntities == source.mergeEntities &&
        String presetId = null;
    public static void setDefaultSettings(DBNBrowseSettings settings) {
public class DataSourceNavigatorSettings implements DBNBrowseSettings {
    }
    }
    public void setUserSettings(boolean userSettings) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    public boolean isShowOnlyEntities() {
        this.mergeEntities = copyFrom.isMergeEntities();
import com.google.gson.stream.JsonWriter;
        DBPPreferenceStore preferences = DBWorkbench.getPlatform().getPreferenceStore();
import org.jkiss.utils.CommonUtils;
        ATTR_NAVIGATOR_HIDE_FOLDERS,
    private static final String DEFAULT_MERGE_ENTITIES = "navigator.settings.default.mergeEntities";
            }
    );
        map.put(ATTR_NAVIGATOR_HIDE_FOLDERS, String.valueOf(navSettings.hideFolders));

        private final String name;
        RegistryMessages.navigator_settings_preset_simple_view_description
    public static final Preset PRESET_SIMPLE = new Preset(
    @Override


        PRESET_SIMPLE.settings.setShowOnlyEntities(true);
    }
            this.showOnlyEntities == source.showOnlyEntities &&
 *
        Map<String, String> map = new LinkedHashMap<>();
    public static class Preset {

            return name;
 * Browse settings

    ) throws IOException {
    }
        RegistryMessages.navigator_settings_preset_advanced_view_name,
        PRESET_SIMPLE.settings.setHideFolders(true);
        @NotNull JsonWriter json,
    @Override
        }
                if (p.getId().equals(defPreset)) {
            this.hideSchemas == source.hideSchemas &&
        }

    private static final String DEFAULT_MERGE_SCHEMAS = "navigator.settings.default.hideSchemas";

        this.userSettings = false;
        map.put(ATTR_NAVIGATOR_SHOW_ONLY_ENTITIES, String.valueOf(navSettings.showOnlyEntities));
    public boolean isShowUtilityObjects() {
    static final String ATTR_NAVIGATOR_MERGE_ENTITIES = "navigator-merge-entities"; //$NON-NLS-1$

        addTrueSetting(json, ATTR_NAVIGATOR_SHOW_UTIL_OBJECTS, navSettings.showUtilityObjects);
        PRESETS.put(PRESET_FULL.name, PRESET_FULL);
        return showSystemObjects;
 */
        public Preset(String id, String name, String description) {
        this.showUtilityObjects = copyFrom.isShowUtilityObjects();
        addTrueSetting(json, ATTR_NAVIGATOR_HIDE_SCHEMAS, navSettings.hideSchemas);
    private boolean hideVirtualModel;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            preferences.setValue(DEFAULT_NAVIGATOR_SETTINGS_PRESET, presetId);
        return showUtilityObjects;
        this.userSettings = true;

        return hideFolders;
        this.hideVirtualModel = copyFrom.isHideVirtualModel();
    static final String ATTR_NAVIGATOR_HIDE_FOLDERS = "navigator-hide-folders"; //$NON-NLS-1$
    private boolean userSettings;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        this.hideSchemas = hideSchemas;


    @Override

        public String getDescription() {
        return map;

    public static Map<String, String> saveSettingsToMap(@NotNull DataSourceNavigatorSettings navSettings) {
            JSONUtils.field(json, name, true);
        settings.setShowSystemObjects(preferences.getBoolean(DEFAULT_SHOW_SYSTEM_OBJECTS));
    public boolean isHideVirtualModel() {
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others

            this.description = description;


    @NotNull
    }
        settings.setHideVirtualModel(preferences.getBoolean(DEFAULT_HIDE_VIRTUAL_MODEL));
        if (!(obj instanceof DataSourceNavigatorSettings source)) {
    public void setShowSystemObjects(boolean showSystemObjects) {
        map.put(ATTR_NAVIGATOR_HIDE_SCHEMAS, String.valueOf(navSettings.hideSchemas));
        this.showUtilityObjects = source.isShowUtilityObjects();


        private final String description;
        ATTR_NAVIGATOR_SHOW_UTIL_OBJECTS,
    }
    static final String ATTR_NAVIGATOR_HIDE_VIRTUAL = "navigator-hide-virtual"; //$NON-NLS-1$

    public void setHideVirtualModel(boolean hideVirtualModel) {
import org.jkiss.dbeaver.registry.internal.RegistryMessages;
    static final String ATTR_NAVIGATOR_HIDE_SCHEMAS = "navigator-hide-schemas"; //$NON-NLS-1$

    }
    }
            for (DataSourceNavigatorSettings.Preset p : DataSourceNavigatorSettings.PRESETS.values()) {
    }
            }
    public static final Preset PRESET_FULL = new Preset(
    @Override
        this.originalSettings = originalSettings;
        }
        private final String id;

/*


        PRESET_SIMPLE.settings.setHideVirtualModel(true);
        ATTR_NAVIGATOR_HIDE_SCHEMAS,
        settings.setMergeEntities(preferences.getBoolean(DEFAULT_MERGE_ENTITIES));
        settings.setHideSchemas(preferences.getBoolean(DEFAULT_MERGE_SCHEMAS));


    }

        return settings;
    private boolean showOnlyEntities;
    }
        PRESETS.put(PRESET_SIMPLE.name, PRESET_SIMPLE);
        map.put(ATTR_NAVIGATOR_HIDE_VIRTUAL, String.valueOf(navSettings.hideVirtualModel));
 * See the License for the specific language governing permissions and
            preferences.setValue(DEFAULT_NAVIGATOR_SETTINGS_PRESET, "");


        } else {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.data.json.JSONUtils;
    }
        this.hideFolders = copyFrom.isHideFolders();
        return userSettings;
        this.showOnlyEntities = copyFrom.isShowOnlyEntities();
        preferences.setValue(DEFAULT_HIDE_FOLDERS, settings.isHideFolders());
        addTrueSetting(json, ATTR_NAVIGATOR_SHOW_ONLY_ENTITIES, navSettings.showOnlyEntities);
            return id;
        ATTR_NAVIGATOR_SHOW_SYSTEM_OBJECTS,
        DBPPreferenceStore preferences = DBWorkbench.getPlatform().getPreferenceStore();
    }
        map.put(ATTR_NAVIGATOR_SHOW_SYSTEM_OBJECTS, String.valueOf(navSettings.showSystemObjects));
    public boolean isHideFolders() {
    );
        if (CommonUtils.isEmptyTrimmed(presetId)) {
        this.hideSchemas = source.isHideSchemas();
    public DataSourceNavigatorSettings(@NotNull DBNBrowseSettings copyFrom) {
        ATTR_NAVIGATOR_SHOW_ONLY_ENTITIES,
        PRESETS.put(PRESET_CUSTOM.name, PRESET_CUSTOM);
    private boolean hideSchemas;
    }
    public boolean isUserSettings() {
    }
        this.mergeEntities = mergeEntities;
        for (DataSourceNavigatorSettings.Preset p : DataSourceNavigatorSettings.PRESETS.values()) {
    }
    );
        addTrueSetting(json, ATTR_NAVIGATOR_HIDE_FOLDERS, navSettings.hideFolders);
    }
    }
    );
    static final String ATTR_NAVIGATOR_SHOW_ONLY_ENTITIES = "navigator-show-only-entities"; //$NON-NLS-1$
    public DBNBrowseSettings getOriginalSettings() {
        public DataSourceNavigatorSettings getSettings() {
    public static final String DEFAULT_NAVIGATOR_SETTINGS_PRESET = "navigator.settings.default.preset";
        public String getId() {
        map.put(ATTR_NAVIGATOR_SHOW_UTIL_OBJECTS, String.valueOf(navSettings.showUtilityObjects));
    public boolean isMergeEntities() {
            return false;
        preferences.setValue(DEFAULT_SHOW_ONLY_ENTITIES, settings.isShowOnlyEntities());
    public static final Map<String, Preset> PRESETS = new LinkedHashMap<>();
    public static DBNBrowseSettings getDefaultSettings() {
    public DataSourceNavigatorSettings() {
            this.id = id;
    public void copyFrom(@NotNull DBNBrowseSettings source) {
        // Custom settings
        }
        if (!CommonUtils.isEmpty(defPreset)) {


        this.hideFolders = hideFolders;
import org.jkiss.code.NotNull;
    }
        this.hideVirtualModel = hideVirtualModel;
        this.userSettings = userSettings;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.hideSchemas = copyFrom.isHideSchemas();
    private static final String DEFAULT_HIDE_VIRTUAL_MODEL = "navigator.settings.default.hideVirtualModel";
import java.io.IOException;
import java.util.LinkedHashMap;
                }
import org.jkiss.dbeaver.runtime.DBWorkbench;

        private final DataSourceNavigatorSettings settings = new DataSourceNavigatorSettings();
import java.util.Map;
        RegistryMessages.navigator_settings_preset_custom_view_name,
        return mergeEntities;
 * limitations under the License.
        @NotNull DataSourceNavigatorSettings navSettings
    public void reset() {

    private boolean showUtilityObjects;
    private boolean hideFolders;
        this.mergeEntities = source.isMergeEntities();
import java.util.Set;
    private boolean mergeEntities;
    public static final Set<String> NAVIGATOR_SETTINGS = Set.of(
package org.jkiss.dbeaver.registry;
            this.showUtilityObjects == source.showUtilityObjects &&
    }
            return description;
        addTrueSetting(json, ATTR_NAVIGATOR_HIDE_VIRTUAL, navSettings.hideVirtualModel);
    public void setShowOnlyEntities(boolean showOnlyEntities) {
        settings.setShowOnlyEntities(preferences.getBoolean(DEFAULT_SHOW_ONLY_ENTITIES));

        settings.setHideFolders(preferences.getBoolean(DEFAULT_HIDE_FOLDERS));

        String defPreset = preferences.getString(DEFAULT_NAVIGATOR_SETTINGS_PRESET);
    private static void addTrueSetting(@NotNull JsonWriter json, @NotNull String name, boolean value) throws IOException {
    public void setOriginalSettings(@Nullable DataSourceNavigatorSettings originalSettings) {
        return showOnlyEntities;
        ATTR_NAVIGATOR_HIDE_VIRTUAL,
    @Override
        return originalSettings == null ? this : originalSettings;
        DataSourceNavigatorSettings settings = new DataSourceNavigatorSettings();

        return hideVirtualModel;
    private static final String DEFAULT_SHOW_ONLY_ENTITIES = "navigator.settings.default.showOnlyEntities";
    static final String ATTR_NAVIGATOR_SHOW_SYSTEM_OBJECTS = "show-system-objects"; //$NON-NLS-1$
    public boolean isShowSystemObjects() {
        addTrueSetting(json, ATTR_NAVIGATOR_MERGE_ENTITIES, navSettings.mergeEntities);
 * You may obtain a copy of the License at
        }
    }
        this.originalSettings = null;
        }
        // Save preset
            return settings;

        }
    @Override
    }
    }
        preferences.setValue(DEFAULT_MERGE_ENTITIES, settings.isMergeEntities());
    public void setShowUtilityObjects(boolean showUtilityObjects) {
        "custom",
        preferences.setValue(DEFAULT_MERGE_SCHEMAS, settings.isHideSchemas());
 *
        this.hideVirtualModel = source.isHideVirtualModel();
        }
    public void setMergeEntities(boolean mergeEntities) {
        PRESET_FULL.settings.setShowSystemObjects(true);
                presetId = p.getId();
        this.showUtilityObjects = showUtilityObjects;




        preferences.setValue(DEFAULT_HIDE_VIRTUAL_MODEL, settings.isHideVirtualModel());
        addTrueSetting(json, ATTR_NAVIGATOR_SHOW_SYSTEM_OBJECTS, navSettings.showSystemObjects);
    public static void saveSettingsToMap(
/**
    public static final Preset PRESET_CUSTOM = new Preset(
