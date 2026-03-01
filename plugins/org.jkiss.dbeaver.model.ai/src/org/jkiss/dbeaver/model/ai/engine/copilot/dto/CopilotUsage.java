    public record PromptTokensDetails(
 */
import org.jkiss.code.Nullable;
public record CopilotUsage(

 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.ai.engine.copilot.dto;
 * You may obtain a copy of the License at
) {
    int totalTokens
}
    @Nullable
/*
 * DBeaver - Universal Database Manager


    int promptTokens,
    ) {
 * Unless required by applicable law or agreed to in writing, software
    int completionTokens,
    @SerializedName("total_tokens")
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

    @SerializedName("completion_tokens")
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2026 DBeaver Corp and others
 *

    PromptTokensDetails promptTokensDetails,
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * See the License for the specific language governing permissions and
import com.google.gson.annotations.SerializedName;
    @SerializedName("prompt_tokens")
    @SerializedName("prompt_tokens_details")
        @SerializedName("cached_tokens") int cachedTokens
    }
 *

