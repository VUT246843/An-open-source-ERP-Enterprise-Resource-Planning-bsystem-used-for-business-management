    @SerializedName("top_logprobs")

    public Boolean store;
 * You may obtain a copy of the License at
    // Whether to allow the model to run tool calls in parallel.
 *
    @SerializedName("parallel_tool_calls")
import org.jkiss.code.Nullable;
    public String promptCacheKey;


    public Double temperature;
        if (usage == null) {
import com.google.gson.annotations.SerializedName;
    public String truncation;
 * DBeaver - Universal Database Manager
import java.util.Map;
        return new AIUsage(
        );
}
    public String previous_response_id;
    @SerializedName("max_tool_calls")

            usage.outputTokensDetails() != null ? usage.outputTokensDetails().reasoningTokens() : 0
 *

    @SerializedName("top_p")

/*
    public AIUsage getAIUsage() {
    @SerializedName("prompt_cache_key")

 * Licensed under the Apache License, Version 2.0 (the "License");
    @SerializedName("tools")
    @SerializedName("usage")

    public Map<String, String> metadata;
public abstract class OAIResponsesBase {
    @SerializedName("max_output_tokens")
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String[] include;
    public Boolean parallel_tool_calls;
    public String safetyIdentifier;

            usage.inputTokens(),
    }
    public String serviceTier;
    public List<OAITool> tools;
    public Integer maxToolCalls;

    public OAIResponsesReasoning reasoning;
    @Nullable
    public Integer topLogprobs;
    // The unique ID of the previous response to the model. Use this to create multi-turn conversations. Learn more about conversation state. Cannot be used in conjunction with conversation.

 * See the License for the specific language governing permissions and
    @SerializedName("stream")
    public OAIResponsesPrompt prompt;
    public Integer maxOutputTokens;
import java.util.List;
        }
 * Unless required by applicable law or agreed to in writing, software
    @SerializedName("truncation")
    public OAIResponsesUsage usage;

    @SerializedName("reasoning")
    public OAIResponsesStreamOptions stream_options;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @SerializedName("service_tier")
    public Boolean stream;
            usage.outputTokens(),

    @SerializedName("temperature")
    public OAIResponsesText text;
    // Model ID used to generate the response, like gpt-4o or o3
    @SerializedName("store")
    @SerializedName("stream_options")

    public Float topP;

 *
    public String model;



    @Nullable
package org.jkiss.dbeaver.model.ai.engine.openai.dto;
 * limitations under the License.
            return null;


    @SerializedName("tool_choice")
 * you may not use this file except in compliance with the License.
 */
    @SerializedName("prompt")


            usage.inputTokensDetails() != null ? usage.inputTokensDetails().cachedTokens() : 0,
    public String toolChoice;

    @SerializedName("safety_identifier")
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @SerializedName("text")
    @SerializedName("previous_response_id")
import org.jkiss.dbeaver.model.ai.AIUsage;

