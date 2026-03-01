        int rejectedPredictionTokens
        @SerializedName("accepted_prediction_tokens")
    @Nullable
        int acceptedPredictionTokens,
    }
        int audioTokens
package org.jkiss.dbeaver.model.ai.engine.openai.dto.legacy;
    public record CompletionTokensDetails(

import com.google.gson.annotations.SerializedName;
    }
    public record PromptTokensDetails(

        int reasoningTokens,
 *

 * you may not use this file except in compliance with the License.
    @SerializedName("completion_tokens")
}
/*
        int cachedTokens,
import org.jkiss.code.Nullable;

 * DBeaver - Universal Database Manager
        int audioTokens,
    @SerializedName("prompt_tokens")
    @SerializedName("total_tokens")
        @SerializedName("reasoning_tokens")
    @SerializedName("completion_tokens_details")
 * Unless required by applicable law or agreed to in writing, software
    @SerializedName("prompt_tokens_details")
 */
    @Nullable
 *
    int totalTokens,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,

public record OAICompletionUsage(
    CompletionTokensDetails completionTokensDetails
 * Licensed under the Apache License, Version 2.0 (the "License");


    int promptTokens,
) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
        @SerializedName("audio_tokens")
 *
    int completionTokens,
    PromptTokensDetails promptTokensDetails,
        @SerializedName("cached_tokens")
 * See the License for the specific language governing permissions and
        @SerializedName("rejected_prediction_tokens")

        @SerializedName("audio_tokens")
    ) {
    ) {

 * You may obtain a copy of the License at
 * limitations under the License.
