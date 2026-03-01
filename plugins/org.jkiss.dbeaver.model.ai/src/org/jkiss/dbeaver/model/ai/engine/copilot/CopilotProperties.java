    private static final String GPT_MODEL_TEMPERATURE = "gpt.model.temperature";
    }


    }
    public void saveSecrets() throws DBException {
    }
            .map(AIModel::contextWindowSize)
        if (temperature != 0.0) {
    public Integer getContextWindowSize() {
    @Nullable
            return contextWindowSize;

    @Property(order = 2)
    public String getBaseAuthUrl() {
import org.jkiss.dbeaver.model.meta.SecureProperty;
     * Resolve secrets from the secret controller.
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.DBException;
 * Unless required by applicable law or agreed to in writing, software
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (token != null) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
public class CopilotProperties implements AIEngineProperties {
        return !CommonUtils.isEmpty(getToken());
    private static final String GPT_LOG_QUERY = "gpt.log.query";
 *

    @SerializedName(GPT_LOG_QUERY)
    public void setToken(@Nullable String token) {
    public void setContextWindowSize(@Nullable Integer contextWindowSize) {
        this.token = token;
    @Property(order = 3)
 * DBeaver - Universal Database Manager
    public void setLoggingEnabled(boolean loggingEnabled) {
    @SerializedName(GPT_MODEL)
     * Save secrets to the secret controller.
    private static final String COPILOT_ACCESS_TOKEN = "copilot.access.token";


    public String getModel() {
    public void resolveSecrets() throws DBException {
        this.model = model;
    }
import com.google.gson.annotations.SerializedName;

 * See the License for the specific language governing permissions and
    }
    public void setModel(@Nullable String model) {
            DBSSecretController.getGlobalSecretController().setPrivateSecretValue(
     */
    @SerializedName(COPILOT_ACCESS_TOKEN)
 *
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.ai.engine.AIEngineProperties;

    @Override
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable


    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(order = 4)
    private static final String GPT_CONTEXT_WINDOW_SIZE = "gpt.contextWindowSize";
    public double getTemperature() {
    }
    @NotNull
    private Integer contextWindowSize;
        return CopilotModels.getModelByName(model)

    }
    private String model;
    }

    /**

    private double temperature;

    }
        return model;
    @SecureProperty
 *

    @Nullable
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.ai.utils.AIUtils;

            );
            .orElse(0.0);
    @Nullable
    @Override
    private boolean loggingEnabled;
    @Property(order = 5)
    @Override

package org.jkiss.dbeaver.model.ai.engine.copilot;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.meta.Property;
        if (contextWindowSize != null) {
        return token;
        return CopilotConstants.BASE_AUTH_URL;
    @Nullable
 * You may obtain a copy of the License at
        return loggingEnabled;
        }
 */

    }
            .orElse(null);
        token = AIUtils.getSecretValueOrDefault(CopilotConstants.COPILOT_ACCESS_TOKEN, token);
        return CopilotModels.getModelByName(model)
        this.temperature = temperature;
    @SerializedName(GPT_MODEL_TEMPERATURE)
import org.jkiss.dbeaver.model.ai.engine.AIModel;
    }
        }
    }
    public boolean isLoggingEnabled() {
            .map(AIModel::defaultTemperature)
            return temperature;
    private String token;
}

    public boolean isValidConfiguration() {
        this.loggingEnabled = loggingEnabled;
    private static final String GPT_MODEL = "gpt.model";
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        this.contextWindowSize = contextWindowSize;
    @Property(order = 1, password = true, required = true)

/*
     */

    @Nullable
                CopilotConstants.COPILOT_ACCESS_TOKEN, token
    @SerializedName(GPT_CONTEXT_WINDOW_SIZE)
    public void setTemperature(double temperature) {
    public String getToken() {
import org.jkiss.dbeaver.model.secret.DBSSecretController;

