    ) {

        ));
    DBRFeature SQL_AI_COMMAND = DBRFeature.createFeature(CATEGORY_SQL_AI, "Generate AI SQL by @ai command");
import java.util.LinkedHashMap;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull

/*
    String FUNCTION_NAME = "functionName";
 * distributed under the License is distributed on an "AS IS" BASIS,
        @Nullable DBPDataSourceContainer container,
import org.jkiss.code.Nullable;
    static Map<String, Object> buildFeatureParameters(
 */

}
            PARAM_ENGINE, activeEngineDescriptor == null ? "" : activeEngineDescriptor.getId()
 * You may obtain a copy of the License at
    String PROMPT_TYPE = "promptType";
 *
        if (container != null) {
import org.jkiss.dbeaver.model.ai.registry.AIEngineDescriptor;
/**

    DBRFeature CATEGORY_SQL_AI = DBRFeature.createCategory("SQL AI", "SQL AI features");
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
 *



        Map<String, Object> featureInfoMap = new LinkedHashMap<>(Map.of(
import org.jkiss.dbeaver.model.ai.utils.AIUtils;
 * Unless required by applicable law or agreed to in writing, software
    DBRFeature AI_CHAT_FUNCTION_CALL = DBRFeature.createFeature(CATEGORY_AI_CALLS, "AI Chat function call");
        featureInfoMap.putAll(additionalInfo);
 */
 * you may not use this file except in compliance with the License.
        @NotNull Map<String, Object> additionalInfo
 * limitations under the License.
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.ai;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
import org.jkiss.dbeaver.model.runtime.features.DBRFeature;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import java.util.Map;
            featureInfoMap.put(PARAM_DRIVER, container.getDriver().getPreconfiguredId());
    String PARAM_DRIVER = "driver";
        AIEngineDescriptor activeEngineDescriptor = AIUtils.getActiveEngineDescriptor();
 *     http://www.apache.org/licenses/LICENSE-2.0
        return featureInfoMap;

    String PARAM_ENGINE = "engine";
        }
public interface AIBaseFeatures {
 * Data editor features
    DBRFeature CATEGORY_AI_CALLS = DBRFeature.createCategory("AI Calls", "AI Chat features");
import org.jkiss.code.NotNull;
