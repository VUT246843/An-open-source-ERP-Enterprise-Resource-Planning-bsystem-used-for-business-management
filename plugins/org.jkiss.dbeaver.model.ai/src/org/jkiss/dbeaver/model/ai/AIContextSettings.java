 * you may not use this file except in compliance with the License.

import java.util.Map;
    public void setCustomObjectIds(String[] customObjectIds) {
        this.settings.objects = customObjectIds;
    public Map<String, Object> saveSettingsToMap() {
        return settings.objects;


    private static final Gson GSON = new GsonBuilder()
        .create();
        if (settings.objects != null) {


 * distributed under the License is distributed on an "AS IS" BASIS,
    }

            settings.mcpEnabled == that.settings.mcpEnabled &&
    public String saveSettingsToString() {
import org.jkiss.dbeaver.model.data.json.JSONUtils;
        settings = GSON.fromJson(GSON.toJsonTree(dsConfig), PersistentSettings.class);
 * DBeaver - Universal Database Manager
    }
    public void setMetaTransferConfirmed(boolean metaTransferConfirmed) {
    @Nullable
        return settings.confirmed == that.settings.confirmed &&
        return GSON.toJson(saveSettingsToMap());
import org.jkiss.dbeaver.DBException;
import com.google.gson.ToNumberPolicy;
        public boolean mcpEnabled;
        public AIDatabaseScope scope;
        return GSON.fromJson(GSON.toJson(settings), JSONUtils.MAP_TYPE_TOKEN);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // Persistent settings. Can be saved/loaded from/to some persistent state (e.g. json)
                .filter(o -> !CommonUtils.isEmpty(o)).toArray(String[]::new);
    public boolean equalsSettings(AIContextSettings that) {
    }
 *
    }
    }
 *
package org.jkiss.dbeaver.model.ai;
 */
        public boolean confirmed;

        .setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE)

import org.jkiss.code.Nullable;
    }
        this.settings.scope = scope;
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    public String[] getCustomObjectIds() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }


    public void setScope(AIDatabaseScope scope) {
    @Nullable

    public boolean isMetaTransferConfirmed() {
import java.util.Objects;
 * limitations under the License.
    public AIDatabaseScope getScope() {
}
    @Nullable
        }
    public boolean isMcpEnabled() {
 */
        this.settings.mcpEnabled = mcpEnabled;
    public abstract void saveSettings() throws DBException;

    }


 * AI context settings
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
    public void loadSettingsFromString(String dsConfig) {
 * Unless required by applicable law or agreed to in writing, software
    }
        loadSettingsFromMap(GSON.fromJson(dsConfig, JSONUtils.MAP_TYPE_TOKEN));
            settings.objects = Arrays.stream(settings.objects)
    }
    protected static class PersistentSettings {
 * See the License for the specific language governing permissions and
        return settings.mcpEnabled;
        this.settings.confirmed = metaTransferConfirmed;
            Objects.deepEquals(settings.objects, that.settings.objects);
 * You may obtain a copy of the License at
    public void setMcpEnabled(boolean mcpEnabled) {
    protected PersistentSettings settings = new PersistentSettings();

import java.util.Arrays;
    }

public abstract class AIContextSettings {
 *
    public abstract DBPDataSourceContainer getDataSourceContainer();
        return settings.confirmed;
/**
import org.jkiss.utils.CommonUtils;


        return settings.scope;

    public void loadSettingsFromMap(Map<String, Object> dsConfig) {
        public String[] objects;
import com.google.gson.Strictness;

    }
            settings.scope == that.settings.scope &&

    }

        .setStrictness(Strictness.LENIENT)
import org.jkiss.code.NotNull;
    @NotNull
 * Copyright (C) 2010-2026 DBeaver Corp and others

