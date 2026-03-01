 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.ai.engine.AIDatabaseContext;
/**
/*
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
 * Copyright (C) 2010-2026 DBeaver Corp and others
 */
 * Generates AI prompts.
 */
    String build(@Nullable AIDatabaseContext context);

 * you may not use this file except in compliance with the License.
 *
 * DBeaver - Universal Database Manager

 *
 *
}
 * limitations under the License.
package org.jkiss.dbeaver.model.ai;
public interface AIPromptGenerator {


    String generatorId();
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
