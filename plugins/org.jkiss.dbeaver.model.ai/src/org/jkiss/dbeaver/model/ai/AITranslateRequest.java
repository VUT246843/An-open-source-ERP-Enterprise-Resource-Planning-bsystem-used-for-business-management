package org.jkiss.dbeaver.model.ai;
/*
 *
 */
 * limitations under the License.
public record AITranslateRequest(
 * You may obtain a copy of the License at

 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
    public AITranslateRequest(@NotNull String text, @NotNull AIDatabaseContext context) {
) {
    @NotNull AIDatabaseContext context,
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this(text, context, null);
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
    }
}
    @NotNull String text,
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.ai.engine.AIEngine;
 *
    @Nullable AIEngine engine
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.ai.engine.AIDatabaseContext;

 * DBeaver - Universal Database Manager
