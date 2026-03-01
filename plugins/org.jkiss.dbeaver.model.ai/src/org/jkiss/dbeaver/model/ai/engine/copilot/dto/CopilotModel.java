 * See the License for the specific language governing permissions and
public record CopilotModel(
/*
    @SerializedName("policy") @Nullable CopilotModelPolicy policy
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    @SerializedName("model_picker_enabled") boolean modelPickerEnabled,
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
 * limitations under the License.

        return modelPickerEnabled && (policy == null || policy.state() == null || policy.state().equals("enabled"));

 * you may not use this file except in compliance with the License.
    public boolean isEnabled() {

    @SerializedName("name") @NotNull String name,
import org.jkiss.code.NotNull;
    public record CopilotModelPolicy(@SerializedName("state") @Nullable String state) {
 */
 * Unless required by applicable law or agreed to in writing, software
 *
import com.google.gson.annotations.SerializedName;
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @SerializedName("id") @NotNull String id,
) {
package org.jkiss.dbeaver.model.ai.engine.copilot.dto;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
}

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
