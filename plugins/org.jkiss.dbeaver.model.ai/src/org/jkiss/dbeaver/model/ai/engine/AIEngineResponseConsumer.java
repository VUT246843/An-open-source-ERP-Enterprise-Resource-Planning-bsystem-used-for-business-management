
 *
 * Subscriber which listens for response stream
import org.jkiss.code.NotNull;
 *
    void warning(@NotNull String message);
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

 * See the License for the specific language governing permissions and
    void error(@NotNull Throwable throwable);
 *
 * You may obtain a copy of the License at

 * limitations under the License.
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
/**

}
import org.jkiss.dbeaver.model.ai.AIUsage;
import org.jkiss.code.Nullable;
    void usage(@Nullable AIUsage usage);

/*
public interface AIEngineResponseConsumer {
 * you may not use this file except in compliance with the License.
    void nextChunk(@NotNull AIEngineResponseChunk chunk);
 * DBeaver - Universal Database Manager
    void systemPromptLength(int length);

 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.model.ai.engine;

 * Copyright (C) 2010-2026 DBeaver Corp and others
    void completeBlock();
 * Unless required by applicable law or agreed to in writing, software

