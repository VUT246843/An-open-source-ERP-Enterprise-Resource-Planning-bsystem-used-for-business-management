        @NotNull
}
            return links;
            return text;
    @Nullable
        public String toRawString() {
        @Override
 *
        @Override
        }
package org.jkiss.dbeaver.model.ai.impl;
        }
        public DBRRunnableWithReturn<?> getCallback() {
import org.jkiss.code.Nullable;

 * limitations under the License.
        }
    default DBRRunnableWithReturn<?> getCallback() {

 * Licensed under the Apache License, Version 2.0 (the "License");

            return text;
        }
    record Link(@NotNull String text, @Nullable DBRRunnableWithReturn<?> callback) implements MessageChunk {
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithReturn;
        return null;
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0

public sealed interface MessageChunk {
        @Nullable
 */
            return "```" + language + "\n" + text + "\n```";
        @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        @NotNull
import org.jkiss.code.NotNull;
        public String toRawString() {
import java.util.List;
/*
    record Text(@NotNull String text, @NotNull List<LinkPosition> links) implements MessageChunk {
        public String toRawString() {

 * DBeaver - Universal Database Manager
            return callback;
 * you may not use this file except in compliance with the License.
 *
        @NotNull
        @Override
        public List<LinkPosition> getLinks() {
 * You may obtain a copy of the License at

    }
    }

    record Code(@NotNull String text, @NotNull String language) implements MessageChunk {
        }

 * Copyright (C) 2010-2025 DBeaver Corp and others
 *

        @Override
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    String toRawString();
