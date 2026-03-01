public record AIModel(


/*
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.ai.engine;
    double defaultTemperature
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    @Nullable Integer contextWindowSize,
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
 *

 * You may obtain a copy of the License at
import java.util.Set;
import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 */
 * limitations under the License.
    public AIModel(@NotNull String name, @Nullable Integer contextWindowSize, @NotNull Set<AIModelFeature> features) {
import org.jkiss.code.NotNull;
) {
}
    @NotNull Set<AIModelFeature> features,
 *
 * Unless required by applicable law or agreed to in writing, software
    @NotNull String name,
        this(name, contextWindowSize, features, 0.0);
