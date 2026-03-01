

import org.jkiss.code.Nullable;
/*
    ) {
package org.jkiss.dbeaver.model.ai.engine.openai.dto;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public record InputTokenDetails(
    @SerializedName("output_tokens")
}
    int outputTokens,
    @Nullable
    }
 *
 */
 *
        int cachedTokens
import com.google.gson.annotations.SerializedName;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
        int reasoningTokens

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    ) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
) {
        @SerializedName("reasoning_tokens")
public record OAIResponsesUsage(
    public record OutputTokenDetails(
 * Unless required by applicable law or agreed to in writing, software

 * DBeaver - Universal Database Manager

 *
    @SerializedName("output_tokens_details")

    @SerializedName("input_tokens_details")
    }

 * limitations under the License.
    int inputTokens,
 * Copyright (C) 2010-2026 DBeaver Corp and others
    InputTokenDetails inputTokensDetails,
        @SerializedName("cached_tokens")
 * you may not use this file except in compliance with the License.
    @SerializedName("input_tokens")
    OutputTokenDetails outputTokensDetails
 * See the License for the specific language governing permissions and
