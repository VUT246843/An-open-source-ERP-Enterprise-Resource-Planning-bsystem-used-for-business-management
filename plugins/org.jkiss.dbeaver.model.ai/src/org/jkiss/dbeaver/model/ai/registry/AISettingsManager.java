        return settings;
                AISettings loaded = loadSettingsFromConfig();

        public synchronized void setSettings(AISettings mruSettings) {
                if (savedProps instanceof JsonObject jo && !jo.isEmpty()) {


    private static Gson createPropertiesLoadGson() {
            }
                configMap = READ_PROPS_GSON.fromJson(new StringReader(content), JSONUtils.MAP_TYPE_TOKEN);
    }

    }
        return new GsonBuilder()
            return settings;
            if (settings == null) {
            }
                propertiesObject.add(property.getKey(), propValue);
        try {
                    settings.getFunctionSettings().enableFunctionCategory(category.getId());
    }
                    if (engineDescriptor == null) {
    }
            .getConfigurationController()
                    if (entry.getValue() instanceof Map map) {
     *
            .create();
import org.jkiss.dbeaver.DBException;
    @NotNull
                functionRegistry.getFunctionsByCategory();
    public static final Gson SAVE_PROPS_GSON = createPropertiesSaveGson();
                    String engineId = entry.getKey();
        }
        @Override
        return this.getSettingsHolder().getSettings();
    private static final String CUSTOM_INSTRUCTIONS_KEY = "customInstructions";


        raiseChangedEvent(this);
                if (!enabledFunctions.isEmpty()) {
            listener.onSettingsUpdate(registry);
        }
            log.error("Error loading AI settings, falling back to defaults.", e);

        consumer.accept(settings);
            if (!enabledFunctions.isEmpty()) {
        }
    }
                    settings.setCustomInstructions(customInstructions);
            json.add(PROPERTIES_KEY, propertiesObject);
        return AISettingsLocalHolder.INSTANCE;
        if (instance == null) {
        for (AISettingsEventListener listener : this.settingsChangedListeners.toArray(AISettingsEventListener[]::new)) {
                for (String function : enabledFunctions) {

    @NotNull
/*
    }
                json.add(CUSTOM_INSTRUCTIONS_KEY, object);

                JsonArray categoriesArray = new JsonArray();

        String content = loadConfig();
    public static final String ENGINE_PROPERTIES = "properties";

import org.jkiss.dbeaver.model.WorkspaceConfigEventManager;
            for (Map.Entry<String, AIEngineProperties> configuration : settings.getEngineConfigurations().entrySet()) {
                return;
import org.jkiss.dbeaver.model.data.json.JSONUtils;
        Map<String, Object> configMap = null;
        this.settingsChangedListeners.add(listener);
                    JsonObject props = new JsonObject();
            Map<String, AIEngineProperties> engineConfigurationMap = new LinkedHashMap<>();
                            JsonElement engineConfigTree = READ_PROPS_GSON.toJsonTree(properties, Map.class);
        }
        if (saveSecretsAsPlainText()) {
            }
        } catch (Exception e) {
                }
            AIFunctionRegistry functionRegistry = AIFunctionRegistry.getInstance();
    }
    private AISettingsHolder getSettingsHolder() {
                List<String> initializedCategories = JSONUtils.getStringList(configMap, INITIALIZED_DEFAULT_CATEGORIES_KEY);
}

        @Override
        this.saveSettings(settings);

        AISettings getSettings();
            if (!DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER)) {
 *
                json.add(ENABLED_FUNCTION_CATEGORIES_KEY, categoriesArray);
            this.settings = mruSettings;
                }
    }

    }
        void reset();

                JsonObject object = new JsonObject();
import org.jkiss.dbeaver.model.ai.AISettings;
            if (!enabledCategories.isEmpty()) {
            }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public static boolean isConfigExists() throws DBException {
            if (!configMap.isEmpty()) {
                settings.getFunctionSettings().setFunctionsEnabled(JSONUtils.getBoolean(configMap, FUNCTIONS_ENABLED_KEY, true));
                    functionsByCategory.entrySet()) {
    @Nullable
            Set<String> enabledCategories = settings.getFunctionSettings().getEnabledFunctionCategories();
    private AISettingsManager() {

    }

                JsonElement savedProps = SAVE_PROPS_GSON.toJsonTree(configuration.getValue());
        }
            return PropertySerializationUtils.baseNonSecurePropertiesGsonBuilder().create();
            json.add(ENGINE_CONFIGURATIONS_KEY, engineConfigurations);

    public AISettings getSettings() {
                        try {
    public static final Gson READ_PROPS_GSON = createPropertiesLoadGson();
                        log.error("AI engine '" + engineId + "' not found. Ignore config");
                if (category.isEnabledByDefault() && !settings.getFunctionSettings().isCategoryInitialized(category.getId())) {

    private static AISettings loadSettingsFromConfig() {
                for (Map.Entry<String, String> entry : customInstructions.entrySet()) {

                    }

        {
import org.jkiss.code.NotNull;
                JsonArray functionsArray = new JsonArray();
    private static AISettingsManager instance = null;
                    }
 *
                json.add(ENABLED_FUNCTIONS_KEY, functionsArray);
            for (Map.Entry<String, Object> property : settings.getAllProperties().entrySet()) {
        if (settings.activeEngine() == null || !settings.hasConfiguration(settings.activeEngine())) {
    private static final String AI_DISABLED_KEY = "aiDisabled";
                    }
                if (settings == null) {
import org.jkiss.dbeaver.Log;
            if (!saveSecretsAsPlainText()) {
            .setStrictness(Strictness.LENIENT)
            DBWorkbench.getPlatform().getConfigurationController().saveConfigurationFile(AI_CONFIGURATION_FILE_NAME, content);
        AISettings settings = this.getSettings();
        private AISettings settings = null;


                        } catch (JsonSyntaxException e) {
            .loadConfigurationFile(AI_CONFIGURATION_FILE_NAME);
                }
 */
    }
            JsonObject engineConfigurations = new JsonObject();
 * Unless required by applicable law or agreed to in writing, software
                if (!CommonUtils.isEmpty(customInstructions)) {

            configMap = new LinkedHashMap<>();
            JsonObject propertiesObject = new JsonObject();
                for (Map.Entry<String, Object> entry : ecRoot.entrySet()) {

    private static class AISettingsLocalHolder implements AISettingsHolder {

                }
                    object.addProperty(entry.getKey(), entry.getValue());
        }
    }
                    AIEngineDescriptor engineDescriptor = AIEngineRegistry.getInstance().getEngineDescriptor(engineId);


                this.getSettingsHolder().reset();
                if (!initializedCategories.isEmpty()) {
                            engineConfigurationMap.put(engineDescriptor.getId(), engineSettings);

            String content = SAVE_PROPS_GSON.toJson(json);
            for (Map.Entry<AIFunctionCategoryDescriptor, List<AIFunctionDescriptor>> entry :
                }
import org.jkiss.dbeaver.utils.PropertySerializationUtils;
public class AISettingsManager {
        try {
        @Override
        public synchronized AISettings getSettings() {
import org.jkiss.dbeaver.runtime.DBWorkbench;
import com.google.gson.*;
        WorkspaceConfigEventManager.addConfigChangedListener(
                settings.saveSecrets();
 * You may obtain a copy of the License at
        this.settingsChangedListeners.remove(listener);
        } catch (Exception e) {
                }
import org.jkiss.dbeaver.model.ai.engine.AIEngineProperties;
                    props.add(ENGINE_PROPERTIES, savedProps);
            }
                    initializedArray.add(category);
import org.jkiss.dbeaver.model.ai.engine.openai.OpenAIConstants;
                AIFunctionCategoryDescriptor category = entry.getKey();


                List<String> enabledCategories = JSONUtils.getStringList(configMap, ENABLED_FUNCTION_CATEGORIES_KEY);

                        continue;
                this.raiseChangedEvent(this); // consider detailed event info
                for (String category : initializedCategories) {

        public static final AISettingsHolder INSTANCE = new AISettingsLocalHolder();

                Map<String, Object> ecRoot = JSONUtils.getObject(configMap, ENGINE_CONFIGURATIONS_KEY);
    public void saveSettings(@NotNull AISettings settings) {
                }
                // reset current context for settings to be lazily reloaded when needed


                    settings = loaded;
    @NotNull
    private interface AISettingsHolder {
            json.add(FUNCTIONS_ENABLED_KEY, new JsonPrimitive(settings.getFunctionSettings().isFunctionsEnabled()));
        void setSettings(AISettings mruSettings);
                log.warn("The user has no permission to save AI configuration");
            });
                    for (AIFunctionDescriptor function : functions) {
                JsonElement propValue = SAVE_PROPS_GSON.toJsonTree(property.getValue());
            log.error("Error saving AI configuration", e);
            }
                if (!enabledCategories.isEmpty()) {
     */
        }
            Set<String> initializedCategories = settings.getFunctionSettings().getInitializedDefaultCategories();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            json.addProperty(AI_DISABLED_KEY, settings.isAiDisabled());
                for (String category : enabledCategories) {
        } else {
    public static final String AI_CONFIGURATION_FILE_NAME = "ai-configuration.json";
            }
 * limitations under the License.
                        settings.getFunctionSettings().enableFunction(function.getId());
    }

        return instance;
            String content = loadConfig();

                // which could lead subsequently to calls back into this method to
    private static final Log log = Log.getLog(AISettingsManager.class);
    private static String loadConfig() throws DBException {
            }

                // loads and potential inconsistencies without this safeguard.
    public static boolean saveSecretsAsPlainText() {
                // modify the settings during initialization, leading to multiple
 * DBeaver - Universal Database Manager
            settings.setActiveEngine(OpenAIConstants.OPENAI_ENGINE);


 *


    private static final String ENABLED_FUNCTIONS_KEY = "aiEnabledFunctions";




    private static final String PROPERTIES_KEY = "properties";
                Map<String, String> customInstructions = (Map<String, String>) configMap.get(CUSTOM_INSTRUCTIONS_KEY);
            return createPropertiesLoadGson();
    public void modifySettings(@NotNull Consumer<AISettings> consumer) {


            }

            JsonObject json = new JsonObject();
                JsonArray initializedArray = new JsonArray();
    public void removeChangedListener(AISettingsEventListener listener) {



                }
                    settings.getFunctionSettings().markCategoryAsInitialized(category.getId());
    public void addChangedListener(AISettingsEventListener listener) {
                            AIEngineProperties engineSettings = READ_PROPS_GSON.fromJson(

                                engineConfigTree, engineDescriptor.getPropertiesType());
     * @param consumer consumer to modify settings
                    categoriesArray.add(category);
                    settings.getFunctionSettings().setEnabledFunctions(new HashSet<>(enabledFunctions));
import java.io.StringReader;
            if (!customInstructions.isEmpty()) {
                            log.error("Error parsing '" + engineId + "' properties", e);
    private void raiseChangedEvent(AISettingsManager registry) {
                }
        return application.isMultiuser() || application.isDistributed();
    private static final String ACTIVE_ENGINE_KEY = "activeEngine";
import org.jkiss.utils.CommonUtils;

                        }
        return CommonUtils.isNotEmpty(content);


    }
            settings.setEngineConfigurations(engineConfigurationMap);
                    engineConfigurations.add(configuration.getKey(), props);
 * Licensed under the Apache License, Version 2.0 (the "License");
                    settings.getFunctionSettings().setInitializedDefaultCategories(new HashSet<>(initializedCategories));
        AISettings settings = new AISettings();
                // This check prevents redundant reloading of settings by the same thread.
                @SuppressWarnings("unchecked")
                json.add(INITIALIZED_DEFAULT_CATEGORIES_KEY, initializedArray);
import java.util.function.Consumer;
        return DBWorkbench.getPlatform()
        DBPApplication application = DBWorkbench.getPlatform().getApplication();
            AI_CONFIGURATION_FILE_NAME, o -> {
            this.settings = null;

            Map<AIFunctionCategoryDescriptor, List<AIFunctionDescriptor>> functionsByCategory =
            this.getSettingsHolder().setSettings(settings);
 * distributed under the License is distributed on an "AS IS" BASIS,
        public synchronized void reset() {
                }
    private static final String FUNCTIONS_ENABLED_KEY = "functionsEnabled";
 * you may not use this file except in compliance with the License.
        }
    }
package org.jkiss.dbeaver.model.ai.registry;
    private static final String ENGINE_CONFIGURATIONS_KEY = "engineConfigurations";
    private static final String ENABLED_FUNCTION_CATEGORIES_KEY = "aiEnabledFunctionCategories";
    /**
    private static Gson createPropertiesSaveGson() {
                // Reason: loadSettingsFromConfig() may initiate loading of other bundles,
 * See the License for the specific language governing permissions and
        }
                    functionsArray.add(function);
import org.jkiss.dbeaver.model.rm.RMConstants;
                settings.setAiDisabled(JSONUtils.getBoolean(configMap, AI_DISABLED_KEY));
            }
        }
                settings.setActiveEngine(JSONUtils.getString(configMap, ACTIVE_ENGINE_KEY));
            if (!initializedCategories.isEmpty()) {
            Set<String> enabledFunctions = settings.getFunctionSettings().getEnabledFunctions();
     * Modify settings with given consumer and save them.
                List<String> enabledFunctions = JSONUtils.getStringList(configMap, ENABLED_FUNCTIONS_KEY);
                }
            if (!CommonUtils.isEmpty(content)) {
    }
    private final Set<AISettingsEventListener> settingsChangedListeners = Collections.synchronizedSet(new HashSet<>());

            json.addProperty(ACTIVE_ENGINE_KEY, settings.activeEngine());
                    settings.getFunctionSettings().setEnabledFunctionCategories(new HashSet<>(enabledCategories));

                JSONUtils.getObject(configMap, PROPERTIES_KEY).forEach(settings::setProperty);
            instance = new AISettingsManager();
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
            }
import org.jkiss.dbeaver.model.app.DBPApplication;
import java.util.*;
    private static final String INITIALIZED_DEFAULT_CATEGORIES_KEY = "initializedDefaultCategories";
    @NotNull
import org.jkiss.code.Nullable;
                List<AIFunctionDescriptor> functions = entry.getValue();
    public static synchronized AISettingsManager getInstance() {
            Map<String, String> customInstructions = settings.getCustomInstructions();
                }
        if (configMap == null) {
                            Map<String, Object> properties = JSONUtils.getObject(map, ENGINE_PROPERTIES);
            }
        }
