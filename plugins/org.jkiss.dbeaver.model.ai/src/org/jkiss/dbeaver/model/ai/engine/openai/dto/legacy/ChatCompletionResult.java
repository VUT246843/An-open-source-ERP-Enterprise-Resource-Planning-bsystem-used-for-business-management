    }
    private OAICompletionUsage usage;
    public AIUsage getAIUsage() {
package org.jkiss.dbeaver.model.ai.engine.openai.dto.legacy;
    }
        return object;
import org.jkiss.code.Nullable;
    public void setModel(String model) {

            reasoningTokens
        return new AIUsage(
     * Unique id assigned to this chat completion.
    }
    private String id;
    }
/**
    private String object;


 * Licensed under the Apache License, Version 2.0 (the "License");
 * Object containing a response from the chat completions api.
     */
 * limitations under the License.
     * The GPT model used.
     */
    public List<ChatCompletionChoice> getChoices() {


 */

     * The type of object returned, should be "chat.completion"

        if (usage == null) {
 * You may obtain a copy of the License at

    public void setCreated(long created) {
     */
    private String model;
    public long getCreated() {
 * Unless required by applicable law or agreed to in writing, software
        int cachedTokens = usage.promptTokensDetails() != null ? usage.promptTokensDetails().cachedTokens() : 0;
            usage.completionTokens(),
    }
        );
 * you may not use this file except in compliance with the License.

        this.choices = choices;

        this.id = id;
    @Nullable

     * The creation time in epoch seconds.
    @Nullable

import java.util.List;

    public void setId(String id) {
        int reasoningTokens = usage.completionTokensDetails() != null ? usage.completionTokensDetails().reasoningTokens() : 0;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }

    }
    }
public class ChatCompletionResult {
/*
    /**
 *
    public String getId() {
    public String getObject() {
     * A list of all generated completions.
        return created;
    /**
    public void setObject(String object) {
    }

    
    /**
        this.created = created;
        return choices;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        return usage;
    public OAICompletionUsage getUsage() {
        this.object = object;
    public String getModel() {
        return model;
    }
        return id;
 * Copyright (C) 2010-2026 DBeaver Corp and others

 *
    public void setChoices(List<ChatCompletionChoice> choices) {
    /**
            cachedTokens,
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.ai.AIUsage;
            return null;
    private long created;
    @Nullable
}
            usage.promptTokens(),

    }


        this.model = model;

    private List<ChatCompletionChoice> choices;

 */
     */
 * DBeaver - Universal Database Manager
    }
     */

    }
    /**
 * See the License for the specific language governing permissions and
