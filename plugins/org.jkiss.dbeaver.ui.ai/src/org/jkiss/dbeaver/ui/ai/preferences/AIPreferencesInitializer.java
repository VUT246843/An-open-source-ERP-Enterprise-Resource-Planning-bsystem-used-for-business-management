 */
 * DBeaver - Universal Database Manager
public class AIPreferencesInitializer extends AbstractPreferenceInitializer {
    @Override
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        PrefUtils.setDefaultPreferenceValue(store, AIConstants.AI_LOG_QUERY, false);
import org.jkiss.dbeaver.utils.PrefUtils;
        PrefUtils.setDefaultPreferenceValue(store, AIConstants.AI_INCLUDE_SOURCE_TEXT_IN_QUERY_COMMENT, false);
 *
 * you may not use this file except in compliance with the License.
        PrefUtils.setDefaultPreferenceValue(store, AIConstants.AI_COMPLETION_MAX_CHOICES, 1);
        PrefUtils.setDefaultPreferenceValue(store, AIConstants.AI_SEND_DESCRIPTION, false);

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,

        PrefUtils.setDefaultPreferenceValue(store, AIConstants.AI_CONFIRM_DDL, AIQueryConfirmationRule.CONFIRM.name());

        PrefUtils.setDefaultPreferenceValue(store, AIConstants.AI_COMPLETION_EXECUTE_IMMEDIATELY, false);
 * You may obtain a copy of the License at

        PrefUtils.setDefaultPreferenceValue(store, OpenAIConstants.AI_TEMPERATURE, 0.0f);
        PrefUtils.setDefaultPreferenceValue(store, AIConstants.AI_CONFIRM_OTHER, AIQueryConfirmationRule.CONFIRM.name());
        PrefUtils.setDefaultPreferenceValue(store, AIConstants.AI_CONFIRM_SQL, AIQueryConfirmationRule.EXECUTE.name());

import org.jkiss.dbeaver.model.ai.AIQueryConfirmationRule;
 * Licensed under the Apache License, Version 2.0 (the "License");
        // OpenAI default
package org.jkiss.dbeaver.ui.ai.preferences;
        PrefUtils.setDefaultPreferenceValue(store, OpenAIConstants.GPT_MODEL, OpenAIModels.DEFAULT_MODEL);
 *
/*
 *
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
    }
}
        PrefUtils.setDefaultPreferenceValue(store, AIConstants.AI_CONFIRM_DML, AIQueryConfirmationRule.CONFIRM.name());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    public void initializeDefaultPreferences() {
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 *     http://www.apache.org/licenses/LICENSE-2.0
        PrefUtils.setDefaultPreferenceValue(store, AIConstants.AI_SEND_TYPE_INFO, true);
import org.jkiss.dbeaver.model.ai.engine.openai.OpenAIModels;
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.ai.AIConstants;
import org.jkiss.dbeaver.model.ai.engine.openai.OpenAIConstants;
