 *
package org.jkiss.dbeaver.model.ai.engine.openai.dto.legacy;
        return content;
    public ChatMessage(@NotNull String role, String content) {
        this.role = role;


    // name is optional, The name of the author of this message.
 */
    private String content;
        this.content = content;
        return role;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

 *

    }

 *
    public String getName() {
import org.jkiss.code.NotNull;


    public ChatMessage(@NotNull String role, String content, String name) {
 * Unless required by applicable law or agreed to in writing, software
        this.content = content;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull

/*
    @NotNull
    public void setName(String name) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
    }
    public String getContent() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
    private String name;


    }
    public String getRole() {
    }
public class ChatMessage {
        this.name = name;
    private String role;
 * See the License for the specific language governing permissions and
        this.content = content;
    }
 * You may obtain a copy of the License at
        this.role = role;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    // May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
 * limitations under the License.
    public void setContent(String content) {

 * DBeaver - Universal Database Manager
    }
    public void setRole(@NotNull String role) {
        this.name = name;
        return name;
        this.role = role;

