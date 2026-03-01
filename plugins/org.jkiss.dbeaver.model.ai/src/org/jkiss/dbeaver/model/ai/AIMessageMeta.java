 * you may not use this file except in compliance with the License.
) {
 * You may obtain a copy of the License at
 * limitations under the License.
    @NotNull String type,
 *
    @NotNull String engineId,
package org.jkiss.dbeaver.model.ai;
    @Nullable String modelId,

 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Nullable AIUsage usage,
}
    int systemPromptLength
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");


 *     http://www.apache.org/licenses/LICENSE-2.0
import java.time.Duration;
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 *
 *
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
    @NotNull Duration timeSpent,
 * Unless required by applicable law or agreed to in writing, software
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public record AIMessageMeta(
 * See the License for the specific language governing permissions and
