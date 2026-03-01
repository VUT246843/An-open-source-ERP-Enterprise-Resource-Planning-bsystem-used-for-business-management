    public Object annotations;
public class OAIMessageContent {
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
    public Object logprobs;

 *

package org.jkiss.dbeaver.model.ai.engine.openai.dto;
 * limitations under the License.
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
    public OAIMessageContent() {
 * Unless required by applicable law or agreed to in writing, software

    public String type;
    }
}
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
    }

        this.text = text;
    public String text;
/*
 * You may obtain a copy of the License at
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    public OAIMessageContent(boolean isInput, String text) {
 * you may not use this file except in compliance with the License.

 *

    public static final String TYPE_OUTPUT_TEXT = "output_text";
    public static final String TYPE_INPUT_TEXT = "input_text";
        this.type = isInput ? TYPE_INPUT_TEXT : TYPE_OUTPUT_TEXT;
