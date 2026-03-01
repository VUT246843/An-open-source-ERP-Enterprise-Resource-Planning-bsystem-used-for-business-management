
            log.error("Unknown AI settings format: " + dsConfig);
    }
    public static final String AI_META_TRANSFER_CONFIRMED = "ai.meta.transferConfirmed";

    public static final String AI_META_CUSTOM = "ai.meta.customObjects";

        loadSettings();
        settings.scope = CommonUtils.valueOf(

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    // Deprecated methods - kept for backward compatibility
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * Datasource-specific settings. Used in prompt generators to generate context info message.
        settings.confirmed = preferenceStore.getBoolean(getParameterName(AI_META_TRANSFER_CONFIRMED));
 *
        String csString = preferenceStore.getString(getParameterName(AI_META_CUSTOM));
    }
    public DBPDataSourceContainer getDataSourceContainer() {
 * See the License for the specific language governing permissions and
    @NotNull
    }
        return new BundlePreferenceStore(AIConstants.AI_MODEL_PLUGIN_ID);
    protected void loadSettings() {


 */
        Object dsConfig = dataSourceContainer.getExtension(AI_DS_EXTENSION);
    protected final DBPPreferenceStore preferenceStore;
package org.jkiss.dbeaver.model.ai;
            AIDatabaseScope.class,
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
 * limitations under the License.
public class AICompletionSettings extends AIContextSettings {

    }

            preferenceStore.getString(getParameterName(AI_META_SCOPE)),
        }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final DBPDataSourceContainer dataSourceContainer;
import org.jkiss.dbeaver.Log;
        this.dataSourceContainer = dataSourceContainer;
/**
}


    }
    }
 * You may obtain a copy of the License at
    public static final String AI_DS_EXTENSION = "ai.assistant";
    @Override
        // Legacy configuration from preferences
 * distributed under the License is distributed on an "AS IS" BASIS,
 * AI completion settings.
    private static final Log log = Log.getLog(AICompletionSettings.class);
import org.jkiss.code.NotNull;
    // Meta parameters
 * you may not use this file except in compliance with the License.
        settings.objects = CommonUtils.isEmpty(csString) ? new String[0] : csString.split(",");


        return dataSourceContainer;
    private AICompletionSettings(@NotNull DBPPreferenceStore preferenceStore, @NotNull DBPDataSourceContainer dataSourceContainer) {

        } else {
import org.jkiss.utils.CommonUtils;
        this.preferenceStore = preferenceStore;
    @NotNull
        dataSourceContainer.persistConfiguration();
            // Load settings from map
            loadLegacySettings();
    @NotNull
    private void loadLegacySettings() {
    public static final String AI_META_SCOPE = "ai.meta.scope";
    }
    public AICompletionSettings(@NotNull DBPDataSourceContainer dataSourceContainer) {
            null);
    protected String getParameterName(@NotNull String postfix) {
        } else if (dsConfig instanceof Map map){
        this(getPreferenceStore(), dataSourceContainer);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    private static BundlePreferenceStore getPreferenceStore() {
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
 */

        // Save settings as map
        dataSourceContainer.setExtension(AI_DS_EXTENSION, saveSettingsToMap());
 * Copyright (C) 2010-2026 DBeaver Corp and others

/*
    public void saveSettings() {

        if (dsConfig == null) {
 *
import java.util.Map;
            loadSettingsFromMap(map);

        return "ai-" + dataSourceContainer.getId() + "." + postfix;
