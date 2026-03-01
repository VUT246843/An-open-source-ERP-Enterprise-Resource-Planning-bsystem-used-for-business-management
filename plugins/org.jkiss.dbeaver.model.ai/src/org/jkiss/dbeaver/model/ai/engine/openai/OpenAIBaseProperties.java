 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
 *
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.ai.engine.AIEngineProperties;
public interface OpenAIBaseProperties extends AIEngineProperties {
 */


    }

    @Nullable
 * Unless required by applicable law or agreed to in writing, software

 * You may obtain a copy of the License at
    String getToken();

    boolean isLegacyApi();
    }

    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.CommonUtils;
import org.jkiss.code.Nullable;
    String getBaseUrl();

/*
 *
 * DBeaver - Universal Database Manager
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 * you may not use this file except in compliance with the License.
        return true;
package org.jkiss.dbeaver.model.ai.engine.openai;
    default boolean isStreamingEnabled() {
 *
    default boolean isValidConfiguration() {
        return !CommonUtils.isEmpty(getToken());
