        this.token = token;
    @SerializedName(GPT_LOG_QUERY)
    @SerializedName(GPT_BASE_URL)
        }
import org.jkiss.dbeaver.model.meta.Property;
    @Override
            return OpenAIModels.getEffectiveModelName(model);
    public static class OpenAIModelListProvider implements IPropertyValueListProvider<OpenAIProperties> {
}

 *
    private String model;

    private boolean useLegacyApi;
    private String baseUrl;
import org.jkiss.code.NotNull;
    @SerializedName(GPT_MODEL_TEMPERATURE)
 * Unless required by applicable law or agreed to in writing, software
    public Integer getContextWindowSize() {
    @Nullable
package org.jkiss.dbeaver.model.ai.engine.openai;
    private Boolean loggingEnabled;



import org.jkiss.dbeaver.model.ai.engine.AIModelFeature;
public class OpenAIProperties implements OpenAIBaseProperties {


    }
    @Property(order = 2, required = true)
        public boolean allowCustomValue() {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
        if (loggingEnabled != null) {
import org.jkiss.dbeaver.DBException;
            return loggingEnabled;
            .getPreferenceStore()
    @Override

    @SecureProperty
            .getPreferenceStore()
    @Override

        }
    public double getTemperature() {
    public void setModel(@Nullable String model) {
                .toArray();

    @Property(order = 6)
            .getPreferenceStore()
    }
    }
    @SerializedName(GPT_CONTEXT_WINDOW_SIZE)
    @Nullable

    }
    public void setContextWindowSize(@Nullable Integer contextWindowSize) {

    public void saveSecrets() throws DBException {
    private Double temperature;
    @Nullable
            .getString(OpenAIConstants.GPT_MODEL);

        this.contextWindowSize = contextWindowSize;
import org.jkiss.dbeaver.model.secret.DBSSecretController;
        return DBWorkbench.getPlatform()
        return token;

    }
    @Property(order = 3, listProvider = OpenAIModelListProvider.class)
    public String getBaseUrl() {

 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
    }
    public void resolveSecrets() throws DBException {
    private static final String GPT_CONTEXT_WINDOW_SIZE = "gpt.contextWindowSize";

 * See the License for the specific language governing permissions and
    @Override
    public String getToken() {
    }
            return contextWindowSize;
    public void setTemperature(double temperature) {
import org.jkiss.dbeaver.model.ai.engine.AIModel;

        }
        return DBWorkbench.getPlatform()
            .orElse(null);
        if (contextWindowSize != null) {

        return useLegacyApi;
            return temperature;

        if (baseUrl == null || baseUrl.isEmpty()) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
                .map(Map.Entry::getKey)
    }
    @Override
            return OpenAIClient.OPENAI_ENDPOINT;
    }


    public void setBaseUrl(@Nullable String baseUrl) {
    public OpenAIProperties() {
    @SerializedName(GPT_LEGACY_API)
import java.util.Map;
    @SerializedName(GPT_MODEL)
 * you may not use this file except in compliance with the License.
    private static final String GPT_MODEL = "gpt.model";
    @SerializedName(GPT_TOKEN)
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Nullable
    }
    }
 */
    @Property(order = 1, password = true, required = true)
        }
        this.baseUrl = baseUrl;

            return OpenAIModels.KNOWN_MODELS.entrySet().stream()
 *
        return OpenAIModels.getModelByName(getModel())

import org.jkiss.dbeaver.model.meta.SecureProperty;
    }
            .map(AIModel::contextWindowSize)
    private static final String GPT_TOKEN = "gpt.token";
        this.model = model;
    @Override
    }
            return false;
        return baseUrl;

    }
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
    @Property(order = 4)
        @Nullable
import org.jkiss.dbeaver.model.ai.AIConstants;
    private static final String GPT_LEGACY_API = "gpt.api.legacy";
import com.google.gson.annotations.SerializedName;
 * limitations under the License.
    public boolean isLegacyApi() {
    @Nullable
        if (token != null) {
        String modelName = DBWorkbench.getPlatform()
import org.jkiss.code.Nullable;
    @Override
        if (temperature != null) {
        token = AIUtils.getSecretValueOrDefault(OpenAIConstants.GPT_API_TOKEN, token);

                .filter(entry -> !entry.getValue().features().contains(AIModelFeature.SPEECH_TO_TEXT))
    private Integer contextWindowSize;
    public boolean isLoggingEnabled() {
        if (model != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.ai.utils.AIUtils;
    }
    @Override
    private static final String GPT_LOG_QUERY = "gpt.log.query";
    private static final String GPT_MODEL_TEMPERATURE = "gpt.model.temperature";
    public void setLegacyApi(boolean useLegacyApi) {

/*
 * You may obtain a copy of the License at

        }
    public void setToken(@Nullable String token) {
        }
    @Property(order = 7)
        return OpenAIModels.getEffectiveModelName(modelName);


    @Nullable
    private String token;
        this.loggingEnabled = loggingEnabled;
    @NotNull
        this.temperature = temperature;
    public String getModel() {
            .getDouble(OpenAIConstants.AI_TEMPERATURE);
            .getBoolean(AIConstants.AI_LOG_QUERY);
        public Object[] getPossibleValues(OpenAIProperties object) {
    @Override
    @Nullable
    private static final String GPT_BASE_URL = "gpt.base_url";
            DBSSecretController.getGlobalSecretController().setPrivateSecretValue(OpenAIConstants.GPT_API_TOKEN, token);
        @Override
    }
    public void setLoggingEnabled(boolean loggingEnabled) {
    }

        @Override
        }

 *
    @Property(order = 5)
        this.useLegacyApi = useLegacyApi;


